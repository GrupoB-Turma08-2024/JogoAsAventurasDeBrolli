
package telaInicial;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.Clip;

public class TelaMusica {

    public static Clip clip;
    public TelaMusica() {
    }
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
       
        String filepath = "inicio.wav";
        PlayMusic(filepath);
    }
   
    public static void PlayMusic(String location) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File musicPath = new File(location);
        if (musicPath.exists()) {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
        } else {
            System.out.println("Arquivo de áudio não encontrado");
        }
    }

    void start(Clip clip) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}

