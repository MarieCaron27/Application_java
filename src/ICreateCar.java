import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Vector;

public class ICreateCar extends JFrame
{
    private JPanel mainPanel;
    private JTextArea textArea;
    private JList list;
    private JButton buttonGo;
    public ICreateCar()
    {
        //Barre du haut de la fenêtre :

        super("Conception de ma voiture");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750,240);

        //Concepteur de la voiture :
        Vector vDefauts = new Vector();
        vDefauts.add("Bière");
        vDefauts.add("Vin");
        vDefauts.add("Whisky");
        vDefauts.add("Chocolat");
        vDefauts.add("Gateaux");
        vDefauts.add("Cigarettes");
        vDefauts.add("Pipe");
        vDefauts.add("Femmes");
        vDefauts.add("Television");
        list.setListData(vDefauts);

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    System.out.println("Sélection : " + list.getSelectedValue());
                }
            }
        });
        pack();
    }

    public static void main(String args[])
    {
        ICreateCar fenetre = new ICreateCar();
        fenetre.setVisible(true);
    }
}