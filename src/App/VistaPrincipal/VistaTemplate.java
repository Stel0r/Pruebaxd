package App.VistaPrincipal;

import javax.swing.*;
import java.awt.*;

public class VistaTemplate extends JFrame {
    public VistaTemplate() {
        this.setTitle("hello");
        this.setSize(1200, 720);
        this.setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 48, 101, 86));
        this.setLayout(null);
        this.setVisible(true);
    }

    public void saludar(){
        String mensaje = "hola mundo";
        System.out.println(mensaje);
    }
}
