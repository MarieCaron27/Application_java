import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Vector;

public class ICreateCar extends JFrame {
    private JPanel mainPanel;
    private JTextArea textArea;
    private JList<String> listCars;
    private JList<String> listPilotes;
    private JList<String> listTires;
    private JButton buttonGo;

    public ICreateCar() {
        super("Conception de ma voiture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 750);

        // Initialisation des JList
        listCars = new JList<>();
        listPilotes = new JList<>();
        listTires = new JList<>();

        // Création d'un JPanel avec un GridLayout pour organiser les JList
        JPanel panel = new JPanel(new GridLayout(3, 1));

        // Liste des voitures
        Vector<String> vCars = new Vector<>();
        vCars.add("Voiture1");
        vCars.add("Voiture2");
        vCars.add("Voiture3");
        vCars.add("Voiture4");
        vCars.add("Voiture5");
        vCars.add("Voiture6");
        listCars.setListData(vCars);

        // Liste des Pilotes
        Vector<String> vPilotes = new Vector<>();
        vPilotes.add("Pilote1");
        vPilotes.add("Pilote2");
        vPilotes.add("Pilote3");
        vPilotes.add("Pilote4");
        vPilotes.add("Pilote5");
        vPilotes.add("Pilote6");
        listPilotes.setListData(vPilotes);

        // Liste des Pneus
        Vector<String> vTires = new Vector<>();
        vTires.add("Tire1");
        vTires.add("Tire2");
        vTires.add("Tire3");
        vTires.add("Tire4");
        vTires.add("Tire5");
        vTires.add("Tire6");
        listTires.setListData(vTires);

        // Ajout des JList au JPanel
        panel.add(new JScrollPane(listCars));
        panel.add(new JScrollPane(listPilotes));
        panel.add(new JScrollPane(listTires));

        // Ajout du JPanel à la fenêtre
        add(panel);

        pack();
    }

    public static void main(String args[]) {
        ICreateCar fenetre = new ICreateCar();
        fenetre.setVisible(true);
    }
}
