package comedor.comensal.iu;

import javax.swing.*;

public class prueba extends JFrame {
    public prueba() {
        setTitle("Sistema Comedor");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JButton("Registrar comensal"));
        setVisible(true);
    }
}