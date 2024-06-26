/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Víctor
 */
public class Saludo extends JPanel implements ActionListener {

    // Componentes gráficos: un botón y un área de texto
    private JButton boton;
    private JButton botonApellido;
    private JTextArea texto;

    public Saludo() {
        initComponents();
    }

    private void initComponents() {
        // Tamaño del panel
        this.setPreferredSize(new Dimension(600, 200));

        // Borde del panel
        this.setBorder(new TitledBorder("Datos"));

        // Creamos el botón, con un texto a mostrar
        boton = new JButton("Nombre");
        botonApellido = new JButton("Apellido");

        // Creamos el textArea de una fila por 25 columnas
        texto = new JTextArea(1, 25);

        // Establecemos el color de fondo del textArea
        texto.setBackground(Color.GRAY);

        // Posicionamiento de componentes con FlowLayout
        this.setLayout(new FlowLayout());

        // Añadimos los componentes al panel
        this.add(boton);
        this.add(botonApellido);
        this.add(texto);

        // Se le indica al objeto boton que escuche eventos tipo click
        // y se pasa como argumento una referencia de tipo ActionListener
        // En este caso se pasa this que es el panel sobre el 
        // que está el botón y que implementa la interfaz ActionListener
        boton.addActionListener(this);
        botonApellido.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        // Si el botón pulsado es botonSaludar
        if (ae.getSource() == boton) {
            texto.setText("VICTOR");
            texto.setBackground(Color.white);
        } else {
            texto.setText("MENA FLORES");
            texto.setBackground(Color.green);
        }
    }

}
