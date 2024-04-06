import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Vector;

public class ICreateCar extends JFrame {
    private JList<String> listCars;
    private JList<String> listPilotes;
    private JList<String> listTires;
    private JButton scrollLeftButton;
    private JButton scrollRightButton;

    public ICreateCar() {
        super("Conception de ma voiture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 750);

        // Création des panneaux pour chaque ligne
        JPanel panel1 = new JPanel(new FlowLayout());
        JPanel panel2 = new JPanel(new GridLayout(1, 2));
        JPanel panel3 = new JPanel(new FlowLayout());

        // Initialisation des JList
        listCars = new JList<>();
        listPilotes = new JList<>();
        listTires = new JList<>();

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

        // Création des JScrollPane horizontaux pour les JList
        JScrollPane scrollPaneCars = new JScrollPane(listPilotes);
        scrollPaneCars.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        JScrollPane scrollPanePilotes = new JScrollPane(listCars);
        scrollPanePilotes.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JScrollPane scrollPaneTires = new JScrollPane(listTires);
        scrollPaneTires.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        // Ajout des composants aux panneaux respectifs
        panel1.add(scrollPaneCars);
        panel2.add(scrollPanePilotes);
        panel2.add(scrollPaneTires);


        // Ajout des panneaux à la JFrame
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);

        pack();
    }

    public static void main(String args[]) {
        ICreateCar fenetre = new ICreateCar();
        fenetre.setVisible(true);
    }
}
