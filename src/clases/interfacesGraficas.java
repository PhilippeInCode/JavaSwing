package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class interfacesGraficas {
    public static void main(String[] args) {
        crearVentanaConComponentes();
    }

    
    public static void crearVentanaConComponentes() {
    	
    	// Crear la ventana
        JFrame ventana = new JFrame();
        ventana.setBounds(0, 0, 300, 400);
        ventana.setTitle("Elige el/los animales:");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnAceptar = new JButton("Aceptar");

        JLabel etiResultado = new JLabel("Resultado");
        Border borde = BorderFactory.createLineBorder(Color.BLACK); 
        etiResultado.setBorder(borde);

        JCheckBox chkPerro = new JCheckBox("Perro");
        JCheckBox chkGato = new JCheckBox("Gato");
        JCheckBox chkRaton = new JCheckBox("Ratón");

        JPanel panelCheckBoxes = new JPanel();
        panelCheckBoxes.setLayout(new GridLayout(3, 1)); 
        panelCheckBoxes.add(chkPerro);
        panelCheckBoxes.add(chkGato);
        panelCheckBoxes.add(chkRaton);

        ventana.getContentPane().setLayout(new BorderLayout());
        ventana.getContentPane().add(btnAceptar, BorderLayout.SOUTH); 
        ventana.getContentPane().add(etiResultado, BorderLayout.NORTH); 
        ventana.getContentPane().add(panelCheckBoxes, BorderLayout.WEST); 

        ventana.setVisible(true);
        
        btnAceptar.addActionListener(new ActionListener() {

        	public void actionPerformed(ActionEvent e) {
                String mensaje="Animales elegidos: ";
                if (chkPerro.isSelected()) {
                    mensaje += "Perro ";
                } 
                
                if (chkGato.isSelected()) {
                    mensaje += "Gato ";
                }
                
                if (chkRaton.isSelected()) {
                    mensaje += "Raton ";
                }
                
                etiResultado.setText(mensaje);
            }
        });
    }
}
