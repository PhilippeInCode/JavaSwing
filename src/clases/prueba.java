package clases;

import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class prueba extends JFrame {
    private static final String GIF_PATH = "C:\\Users\\DAW MAÑANA\\eclipse-workspace\\JavaSwing\\dataPruebaGifAudio\\1.gif";
    private static final String AUDIO_PATH = "C:\\Users\\DAW MAÑANA\\eclipse-workspace\\JavaSwing\\dataPruebaGifAudio\\2.wav";

    public prueba() {
        // Configurar la ventana
        setTitle("GIF y audio");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Cargar el GIF en un JLabel
        ImageIcon icon = new ImageIcon(GIF_PATH);
        JLabel label = new JLabel(icon);

        // Agregar el JLabel a la ventana
        add(label, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        // Reproducir el audio
        try {
            File audioFile = new File(AUDIO_PATH);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(prueba::new);
    }
}
