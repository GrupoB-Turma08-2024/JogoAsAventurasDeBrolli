
package telaInicial;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class TocarSomTchau {
        public void sound_click(){
        try{
            File sound = new File("C:\\repositorio\\JogoAsAventurasDeBrolli\\Jogo-super\\tchau.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
        }catch(Exception e){ 
        }
    }           
}
