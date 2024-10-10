package telaRedefinirSenha;
import java.net.InetAddress;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.security.SecureRandom;
import java.util.Properties;
import java.util.Random;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Email {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int LENGTH = 8;
    
    public static String generateCode() {
        Random random = new SecureRandom();
        StringBuilder sb = new StringBuilder(LENGTH);

        for (int i = 0; i < LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }

        return sb.toString();
    }   
    public static boolean isValidEmail(String email) {
        if (email == null) return false;
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }
    public static boolean isDomainValid(String email) {
        try {
            String domain = email.substring(email.indexOf("@") + 1);
            InetAddress.getByName(domain);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static void sendEmail(String recipientEmail, String code) throws MessagingException {
        String from = "brollijogo@gmail.com";
        String password = "dvqr plyj zyen yqei";

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        message.setSubject("Verification Code");
        message.setText("Aqui é o Brolli, seu fiel aliado no nosso jogo. Recebi uma mensagem urgente de que você precisa redefinir sua senha. Sem problemas, estou aqui para ajudar!\n" +
"\n" +
"Para garantir que sua conta esteja sempre segura e protegida, por favor, use o código abaixo para redefinir sua senha:\n" +
"\n" +
"Código de Redefinição: " + code + " \n" +
"\n" +
"Siga estes passos simples para redefinir sua senha:\n" +
"\n" +
"1. Acesse a página de redefinição de senha\n" +
"2. Insira o código de redefinição fornecido acima.\n" +
"3. Crie uma nova senha e confirme-a.\n" +
"\n" + "Se você não solicitou a redefinição de senha, por favor, ignore este email ou entre em contato com o nosso suporte imediatamente.\n" +
"\n" +
"Lembre-se, sua segurança é a nossa prioridade! Mantenha sua senha segura e não a compartilhe com ninguém.\n" +
"\n" +
"Estamos ansiosos para vê-lo de volta ao jogo em breve!\n" +
"\n" +
"Com muita força e determinação,\n" +
"\n" +
"Brolli\n" +
"\n" +
"As Aventuras do Brolli Suporte\n" +
"\n" +
"Se precisar de mais ajuda, sinta-se à vontade para nos contatar. Estamos aqui para você!");

        Transport.send(message);
    }

    public static void main(String[] args) {
        try {
            String email = "felipeduarteabc@gmail.com";  // Substitua pelo email que receberá o teste
            String code = generateCode();  // Gera um código de verificação
            sendEmail(email, code);  // Envia o e-mail
            System.out.println("Email enviado com sucesso!");
        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Falha ao enviar o email.");
        }
    }
}
