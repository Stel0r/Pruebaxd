package App.Login;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class LoginTemplate extends JFrame {

    private JPanel pIzquierda, pDerecha;
    private JLabel iTitulo;
    private JTextField tNombreUsuario;
    private JPasswordField tClaveUsuario;
    private JComboBox obTipodeUsuario;
    private JButton bEntrar;
    private JCheckBox checkSi,checkNo;
    private ButtonGroup Grupo;
    private Font Fuente;

    public LoginTemplate(){

        super("LoginTemplate");

        Fuente = new Font("Times New Roman",1,21);

        pIzquierda = new JPanel();
        pIzquierda.setLayout(null);
        pIzquierda.setSize(250,500);
        pIzquierda.setLocation(0,0);
        pIzquierda.setBackground(new Color(212, 150, 74));
        this.add(pIzquierda);

        pDerecha = new JPanel();
        pDerecha.setLayout(null);
        pDerecha.setSize(750,500);
        pDerecha.setLocation(250,0);
        pDerecha.setBackground(Color.WHITE);
        this.add(pDerecha);

        iTitulo = new JLabel("Titulo De la Pagina");
        iTitulo.setFont(Fuente);
        iTitulo.setBounds(100,20,200,30);
        iTitulo.setLocation(((pDerecha.getWidth()-iTitulo.getWidth()))/2,10);
        iTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        iTitulo.setForeground(Color.BLACK);
        pDerecha.add(iTitulo);

        tNombreUsuario = new JTextField();
        tNombreUsuario.setSize(300,40);
        tNombreUsuario.setLocation((pDerecha.getWidth() - tNombreUsuario.getWidth())/2,100);
        tNombreUsuario.setForeground(Color.DARK_GRAY);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(Color.BLUE);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tNombreUsuario);

        obTipodeUsuario = new JComboBox();
        obTipodeUsuario.addItem("Hello");
        obTipodeUsuario.addItem("bye");
        obTipodeUsuario.addItem("idunno");
        obTipodeUsuario.setSize(120,20);
        obTipodeUsuario.setLocation((pDerecha.getWidth()-obTipodeUsuario.getWidth())/2,50);
        ((JLabel)obTipodeUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        obTipodeUsuario.setBackground(Color.WHITE);
        obTipodeUsuario.setForeground(Color.BLACK);
        pDerecha.add(obTipodeUsuario);

        checkSi = new JCheckBox("si");
        checkSi.setSize(45,40);
        checkSi.setLocation(((pDerecha.getWidth() - checkSi.getWidth())/2)-30,250);
        checkSi.setFocusable(false);
        pDerecha.add(checkSi);

        checkNo = new JCheckBox("no");
        checkNo.setSize(45,40);
        checkNo.setLocation(((pDerecha.getWidth() - checkNo.getWidth())/2)+30,250);
        checkNo.setFocusable(false);
        pDerecha.add(checkNo);

        Grupo = new ButtonGroup();
        Grupo.add(checkSi);
        Grupo.add(checkNo);


        bEntrar = new JButton("Entrar");
        bEntrar.setSize(250,45);
        bEntrar.setLocation((pDerecha.getWidth() - bEntrar.getWidth())/2,300);
        bEntrar.setBackground(Color.BLUE);
        bEntrar.setForeground(Color.WHITE);
        bEntrar.setHorizontalAlignment(SwingConstants.CENTER);
        bEntrar.setFocusable(false);
        pDerecha.add(bEntrar);


        tClaveUsuario = new JPasswordField();
        tClaveUsuario.setText("Clave De Usuario");
        tClaveUsuario.setSize(300,40);
        tClaveUsuario.setLocation((pDerecha.getWidth() - tClaveUsuario.getWidth())/2,150);
        tClaveUsuario.setForeground(Color.DARK_GRAY);
        tClaveUsuario.setBackground(Color.WHITE);
        tClaveUsuario.setCaretColor(Color.BLUE);
        tClaveUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        pDerecha.add(tClaveUsuario);




        this.setSize(1000,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
