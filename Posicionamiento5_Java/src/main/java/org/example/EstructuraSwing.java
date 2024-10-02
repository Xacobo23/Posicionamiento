package org.example;

import javax.swing.*;
import java.awt.*;

/*
Esquema JPanels
todo
|-- Bloque izquierda (ciz)
|   |-- arriba
|   |-- abaixo
|   |   |-- rojonaranja
|   |   |   |-- rojo
|   |   |   |-- naranja
|   |   |-- rosa
|-- Bloque dereita (cde)
    |-- verde
    |-- azul
    |-- marron
*/

public class EstructuraSwing extends JFrame{
    public EstructuraSwing() {
        setTitle("Estructura HTML en Swing");
        setSize(1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //Co null aparece no centro
        setLayout(new BorderLayout());

        //Creo o bloque da izquierda
        JPanel ciz = new JPanel(new GridBagLayout());
        GridBagConstraints gbciz = new GridBagConstraints();

        //Creo e añado o panel arriba ao bloque da izquierda
        JPanel arriba = new JPanel();
        arriba.setBackground(Color.decode("#7FFFD4"));

        gbciz.gridx = 0;
        gbciz.gridy = 0;
        gbciz.weightx = 1;
        gbciz.weighty = 0.45;
        gbciz.fill = GridBagConstraints.BOTH;
        ciz.add(arriba, gbciz);

        //Creo o grupo abaixo
        JPanel abaixo = new JPanel(new GridBagLayout());
        GridBagConstraints gbabixo = new GridBagConstraints();
        abaixo.setBackground(Color.gray);


        gbabixo.gridx = 0;
        gbabixo.gridy = 0;
        gbabixo.weightx = 0.33;
        gbabixo.weighty = 1;
        gbabixo.fill = GridBagConstraints.BOTH;

        //Creo o grupo rojonaranja
        JPanel rojonaranja = new JPanel(new GridBagLayout());
        GridBagConstraints gbrnj = new GridBagConstraints();
        gbrnj.gridx = 0;
        gbrnj.gridy = 0;
        gbrnj.weightx = 1;
        gbrnj.weighty = 0.33;
        gbrnj.fill = GridBagConstraints.BOTH;

        //Añado o panel rojo ao grupo rojonaranja
        JPanel rojo = new JPanel();
        rojo.setBackground(Color.decode("#FF0000"));
        rojonaranja.add(rojo, gbrnj);

        gbrnj.gridy = 1;
        gbrnj.weighty = 0.66;

        //Añado o panel naranja ao grupo rojonaranja
        JPanel naranja = new JPanel();
        naranja.setBackground(Color.decode("#FF6D00"));
        rojonaranja.add(naranja, gbrnj);

        abaixo.add(rojonaranja, gbabixo);

        //Añado o panel rosa ao grupo de abaixo

        gbabixo.gridx = 1;
        gbabixo.weightx = 0.66;
        JPanel rosa = new JPanel();
        rosa.setBackground(Color.decode("#FF00FF"));
        abaixo.add(rosa, gbabixo);

        //Añado o grupo de abaixo ao bloque da izquierda
        gbciz.gridy = 1;
        gbciz.weighty = 0.55;
        ciz.add(abaixo, gbciz);


        //Creo o bloque da dereita
        JPanel cde = new JPanel(new GridBagLayout());
        GridBagConstraints gbcde = new GridBagConstraints();


        //Añado o panel verde ao bloque da dereita
        JPanel verde = new JPanel();
        verde.setBackground(Color.decode("#008000"));

        gbcde.gridx = 0;
        gbcde.gridy = 0;
        gbcde.weightx = 1;
        gbcde.weighty = 0.2;
        gbcde.fill = GridBagConstraints.BOTH;
        cde.add(verde, gbcde);

        //Añado o panel azul ao bloque da dereita
        JPanel azul = new JPanel();
        azul.setBackground(Color.decode("#01509F"));

        gbcde.gridy = 1;
        gbcde.weighty = 0.7;
        cde.add(azul, gbcde);

        //Añado o panel marrón ao bloque da dereita
        JPanel marron = new JPanel();
        marron.setBackground(Color.decode("#CA9E61"));

        gbcde.gridy = 2;
        gbcde.weighty = 0.1;
        cde.add(marron, gbcde);

        //Creo a ventana
        JPanel todo = new JPanel(new GridBagLayout());
        GridBagConstraints gbtodo = new GridBagConstraints();

        // Añado o bloque da izquierda
        gbtodo.gridx = 0;
        gbtodo.gridy = 0;
        gbtodo.weightx = 0.66;
        gbtodo.weighty = 1;
        gbtodo.fill = GridBagConstraints.BOTH;
        todo.add(ciz, gbtodo);

        //Añado o bloque da dereita
        gbtodo.gridx = 1;
        gbtodo.gridwidth = 1;
        gbtodo.weightx = 0.33;
        todo.add(cde, gbtodo);

        add(todo);

        //Ajuste de bordes de todo

        ciz.setBorder(BorderFactory.createLineBorder(Color.white, 5));
            arriba.setBorder(BorderFactory.createLineBorder(Color.white, 5));
            abaixo.setBorder(BorderFactory.createLineBorder(Color.white, 5));
            rojonaranja.setBorder(BorderFactory.createMatteBorder(5,0,5,5,Color.white));
                rojo.setBorder(BorderFactory.createMatteBorder(0,0,5,5, Color.white));
                naranja.setBorder(BorderFactory.createMatteBorder(5,0,0,5,Color.white));
            rosa.setBorder(BorderFactory.createMatteBorder(5,0,5,0,Color.white));

        cde.setBorder(BorderFactory.createLineBorder(Color.white, 5));
            verde.setBorder(BorderFactory.createMatteBorder(5,0,10,5,Color.white));
            azul.setBorder(BorderFactory.createMatteBorder(5,0,5,5,Color.white));
            marron.setBorder(BorderFactory.createMatteBorder(10,0,10,5,Color.white));



    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EstructuraSwing frame = new EstructuraSwing();
            frame.setVisible(true);
        });
    }
}


