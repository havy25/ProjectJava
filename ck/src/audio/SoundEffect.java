package audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public enum SoundEffect {

    MESSAGE_RECEIVE("/audio/Ring.wav", false),
    FILE_SHARING("/audio/Ring.wav", false),
    MESSAGE_SEND("/audio/Ring.wav", false);

    private Clip clip;
    private boolean loop;

    SoundEffect(String filename, boolean loop) {
        try {
            this.loop = loop;
            URL url = this.getClass().getResource(filename);
            AudioInputStream audioIS = AudioSystem.getAudioInputStream(url);

            clip = AudioSystem.getClip();
            clip.open(audioIS);
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println("[SoundEffect]" + e.getMessage());
        }
    }

    public void play() {
        if (clip.isRunning()) {
            clip.stop(); //  Stop Audio
        }
        //  Reset Audio from the beginning
        clip.setFramePosition(0);
        clip.start();
        //  Check if audio play continuously
        if (loop) {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
    }

    public void stop() {
        if (clip.isRunning()) {
            clip.stop(); //   Stop Audio
        }
    }
}
