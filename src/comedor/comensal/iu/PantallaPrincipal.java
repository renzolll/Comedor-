package comedor.comensal.iu;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JFrame {

    public PantallaPrincipal() {
        setTitle("Sistema de Gestión - Comedor Universitario");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JButton btnComensales = new JButton("Gestión de Comensales");
        JButton btnComidas = new JButton("Gestión de Comidas");
        JButton btnConsumo = new JButton("Registro de Consumo");
        JButton btnReportes = new JButton("Reportes");
        JButton btnConfig = new JButton("Configuración");
        JButton btnSalir = new JButton("Salir");

        panel.add(btnComensales);
        panel.add(btnComidas);
        panel.add(btnConsumo);
        panel.add(btnReportes);
        panel.add(btnConfig);
        panel.add(btnSalir);

        add(panel);
    }
}