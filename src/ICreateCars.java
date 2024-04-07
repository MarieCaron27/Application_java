package src;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ICreateCars extends JFrame {
    public ICreateCars() {
        super("Conception de ma voiture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 750);

        createPilotesContainer();
    }

    void createPilotesContainer() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        String[] myImages = {
                "src/images/Pilotes/Birdo.png",
                "src/images/Pilotes/Browser.png",
                "src/images/Pilotes/Daisy.png",
                "src/images/Pilotes/Donkey.png",
                "src/images/Pilotes/Link.png",
                "src/images/Pilotes/Luigi.png",
                "src/images/Pilotes/Mario.png",
                "src/images/Pilotes/Peach.png",
                "src/images/Pilotes/Rosalina.png",
                "src/images/Pilotes/Roy.png",
                "src/images/Pilotes/Toad.png",
                "src/images/Pilotes/Toadette.png",
                "src/images/Pilotes/Waligui.png",
                "src/images/Pilotes/Wario.png",
                "src/images/Pilotes/Yoshi.png",
        };

        for (String myImage : myImages) {
            try {
                BufferedImage image = ImageIO.read(new File(myImage));
                ImageIcon icon = new ImageIcon(image);
                JLabel label = new JLabel(icon);
                panel.add(label);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(700, 150));
        add(scrollPane);
    }

    public static void main(String[] args) {
        ICreateCars marioKartGUI = new ICreateCars();
        marioKartGUI.setVisible(true);
    }
}
