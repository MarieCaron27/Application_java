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

        // Obtenir la taille de l'écran
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = (int) screenSize.getWidth();
        int screenHeight = (int) screenSize.getHeight();
        setSize(screenWidth, screenHeight); // Ajuster la taille de la fenêtre principale à la taille de l'écran

        // Création des panneaux pour chaque ligne
        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new GridLayout(1, 3)); // Utilisation d'un GridLayout pour 3 colonnes
        JPanel panel3 = new JPanel(new FlowLayout());

        // Ajout des panneaux à la fenêtre principale
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        // Création des conteneurs
        createPilotesContainer(panel1);
        createTiresContainer(panel2);
        createKartsContainer(panel2);
        createCarInfoContainer(panel3);
    }

    void createPilotesContainer(JPanel containerPanel) {
        JPanel panel = new JPanel(new GridLayout(0, 3, 1, 1)); // 3 colonnes, lignes ajustées automatiquement, avec un espace de 10 pixels entre chaque composant

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
        scrollPane.setPreferredSize(new Dimension(1000, 150)); // Largeur de la fenêtre principale, hauteur arbitraire
        containerPanel.add(scrollPane);
    }

    void createTiresContainer(JPanel containerPanel) {
        JPanel panel = new JPanel(new GridLayout(5, 2, 1, 1)); // 5 lignes, 2 colonnes, avec un espace de 1 pixel entre chaque composant

        String[] myImages = {
                "src/images/Tires/Tire1.png",
                "src/images/Tires/Tire2.png",
                "src/images/Tires/Tire3.png",
                "src/images/Tires/Tire4.png",
                "src/images/Tires/Tire5.png",
                "src/images/Tires/Tire6.png",
                "src/images/Tires/Tire7.png",
                "src/images/Tires/Tire8.png",
                "src/images/Tires/Tire9.png"
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
        containerPanel.add(scrollPane);
    }

    void createKartsContainer(JPanel containerPanel) {
        JPanel panel = new JPanel(new GridLayout(5, 2, 1, 1)); // 5 lignes, 2 colonnes, avec un espace de 1 pixel entre chaque composant

        String[] myImages = {
                "src/images/Karts/Kart1.png",
                "src/images/Karts/Kart2.png",
                "src/images/Karts/Kart3.png",
                "src/images/Karts/Kart4.png",
                "src/images/Karts/Kart5.png",
                "src/images/Karts/Kart6.png"
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
        containerPanel.add(scrollPane);
    }

    void createCarInfoContainer(JPanel containerPanel) {
        // Ajoutez ici votre code pour le conteneur des informations de la voiture
        JLabel carInfoLabel = new JLabel("Propriétés de la voiture");
        containerPanel.add(carInfoLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ICreateCars marioKartGUI = new ICreateCars();
            marioKartGUI.setVisible(true);
        });
    }
}
