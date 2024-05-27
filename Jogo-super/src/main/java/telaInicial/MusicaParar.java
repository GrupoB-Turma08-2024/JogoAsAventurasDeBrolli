
package telaInicial;

import javax.sound.sampled.Clip;

public class MusicaParar extends TelaMusica{
    void stop(Clip clip) {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}

