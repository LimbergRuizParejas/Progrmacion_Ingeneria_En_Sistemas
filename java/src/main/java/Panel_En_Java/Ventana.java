package Panel_En_Java;

import javax.swing.*;

public class Ventana {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Panel_En_Java.Ventana");
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(new panel()); //Agregar un Panel_En_Java.panel propio
        ventana.setSize(800,600); //Tamaño
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setVisible(true);

    }
}
