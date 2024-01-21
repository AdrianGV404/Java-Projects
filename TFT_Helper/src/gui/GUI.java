package gui;

import javax.swing.*;

import inicializador.jugadores;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JFrame frame;
    private JPanel mainPanel;

    private JPanel panel_tu;
    private JPanel panel_jugador1;
    private JPanel panel_jugador2;
    private JPanel panel_jugador3;
    private JPanel panel_jugador4;
    private JPanel panel_jugador5;
    private JPanel panel_jugador6;
    private JPanel panel_jugador7;

    public GUI() {
        frame = new JFrame();
        mainPanel = new JPanel();
        panel_tu = new JPanel();
        panel_jugador1 = new JPanel();
        panel_jugador2 = new JPanel();
        panel_jugador3 = new JPanel();
        panel_jugador4 = new JPanel();
        panel_jugador5 = new JPanel();
        panel_jugador6 = new JPanel();
        panel_jugador7 = new JPanel();

        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 20, 50));
        mainPanel.setLayout(new GridBagLayout());

        createMainPanel();
        create_tu_Panel();
        crear_paneles_jugador();

        frame.setResizable(false);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TFT Helper");
        frame.pack();
        frame.setVisible(true);
    }

    private void crear_paneles_jugador() {
        create_jugadorPanel(1, panel_jugador1);
        create_jugadorPanel(2, panel_jugador2);
        create_jugadorPanel(3, panel_jugador3);
        create_jugadorPanel(4, panel_jugador4);
        create_jugadorPanel(5, panel_jugador5);
        create_jugadorPanel(6, panel_jugador6);
        create_jugadorPanel(7, panel_jugador7);
    }

    private void createMainPanel() {
        JLabel label = new JLabel("Añadir campeones (composiciones)");
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.gridx = 0;
        labelConstraints.gridy = 0;
        labelConstraints.gridwidth = 2;
        labelConstraints.anchor = GridBagConstraints.CENTER;
        labelConstraints.insets = new Insets(0, 0, 10, 0);
        mainPanel.add(label, labelConstraints);

        JButton button_tu = new JButton("Tu");
        GridBagConstraints button_tu_constraints = new GridBagConstraints();
        button_tu_constraints.gridx = 1;
        button_tu_constraints.gridy = 1;
        button_tu_constraints.gridwidth = 1;
        button_tu_constraints.gridheight = 7;
        button_tu_constraints.fill = GridBagConstraints.BOTH;
        button_tu_constraints.weightx = 1.0; // Aumenta el tamaño horizontal
        button_tu_constraints.weighty = 1.0; // Aumenta el tamaño vertical

        JButton[] playerButtons = new JButton[7];
        for (int i = 0; i < playerButtons.length; i++) {
            playerButtons[i] = new JButton("Jugador " + (i + 1));
        }

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.anchor = GridBagConstraints.EAST;
        mainPanel.add(button_tu, button_tu_constraints);

        constraints.gridx = 0;
        constraints.anchor = GridBagConstraints.WEST;
        for (int i = 0; i < playerButtons.length; i++) {
            mainPanel.add(playerButtons[i], constraints);
        }

        button_tu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(panel_tu);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });

        for (int i = 0; i < playerButtons.length; i++) {
            int jugador = i + 1;
            playerButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    CambiarPanelJugador(jugador);
                }
            });
        }
    }

    private void create_tu_Panel() {
        panel_tu.setBorder(BorderFactory.createEmptyBorder(10, 50, 20, 50));
        panel_tu.setLayout(new GridBagLayout());

        JLabel newLabel = new JLabel("Añade tus campeones");
        GridBagConstraints newLabelConstraints = new GridBagConstraints();
        newLabelConstraints.gridx = 0;
        newLabelConstraints.gridy = 0;
        newLabelConstraints.anchor = GridBagConstraints.CENTER;
        panel_tu.add(newLabel, newLabelConstraints);

        JButton backButton = new JButton("Atrás");
        GridBagConstraints backButtonConstraints = new GridBagConstraints();
        backButtonConstraints.gridx = 0;
        backButtonConstraints.gridy = 1;
        backButtonConstraints.anchor = GridBagConstraints.CENTER;
        panel_tu.add(backButton, backButtonConstraints);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(mainPanel);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });
    }

    private void create_jugadorPanel(int jugador, JPanel panel) {
        panel.setBorder(BorderFactory.createEmptyBorder(10, 50, 20, 50));
        panel.setLayout(new GridBagLayout());

        JLabel jugadorLabel = new JLabel("Jugador " + jugador);
        jugadorLabel.setFont(new Font("Arial", Font.BOLD, 24));
        GridBagConstraints jugadorLabelConstraints = new GridBagConstraints();
        jugadorLabelConstraints.gridx = 0;
        jugadorLabelConstraints.gridy = 0;
        jugadorLabelConstraints.gridwidth = 1;
        jugadorLabelConstraints.anchor = GridBagConstraints.CENTER;
        jugadorLabelConstraints.insets = new Insets(0, 0, 10, 0);
        panel.add(jugadorLabel, jugadorLabelConstraints);

        JTextField textField = new JTextField(10); // 10 es el ancho inicial de la casilla de texto
        GridBagConstraints textFieldConstraints = new GridBagConstraints();
        textFieldConstraints.gridx = 0;
        textFieldConstraints.gridy = 1;
        textFieldConstraints.gridwidth = 2;
        textFieldConstraints.anchor = GridBagConstraints.CENTER;
        textFieldConstraints.insets = new Insets(10, 0, 0, 0);
        panel.add(textField, textFieldConstraints);

        JLabel composicion = null;
        switch (jugador) {
            case 1:
                composicion = new JLabel(jugadores.getPlayer_1().compo_actual_toString());
                break;
            case 2:
                composicion = new JLabel(jugadores.getPlayer_2().compo_actual_toString());
                break;
            case 3:
                composicion = new JLabel(jugadores.getPlayer_3().compo_actual_toString());
                break;
            case 4:
                composicion = new JLabel(jugadores.getPlayer_4().compo_actual_toString());
                break;
            case 5:
                composicion = new JLabel(jugadores.getPlayer_5().compo_actual_toString());
                break;
            case 6:
                composicion = new JLabel(jugadores.getPlayer_6().compo_actual_toString());
                break;
            case 7:
                composicion = new JLabel(jugadores.getPlayer_7().compo_actual_toString());
                break;
        }
        
        GridBagConstraints composicionConstraint = new GridBagConstraints();
        composicionConstraint.gridx = 3;
        composicionConstraint.gridy = 1;
        composicionConstraint.gridwidth = 1;
        composicionConstraint.anchor = GridBagConstraints.CENTER;
        composicionConstraint.insets = new Insets(0, 0, 10, 0);
        panel.add(composicion, composicionConstraint);

        JButton backButton = new JButton("Atrás");
        GridBagConstraints backButtonConstraints = new GridBagConstraints();
        backButtonConstraints.gridx = 0;
        backButtonConstraints.gridy = 2;
        backButtonConstraints.gridwidth = 1;
        backButtonConstraints.anchor = GridBagConstraints.CENTER;
        backButtonConstraints.insets = new Insets(10, 0, 0, 0);
        panel.add(backButton, backButtonConstraints);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.getContentPane().add(mainPanel);
                frame.getContentPane().revalidate();
                frame.getContentPane().repaint();
            }
        });
    }

    private void CambiarPanelJugador(int jugador) {
        frame.getContentPane().removeAll();
        switch (jugador) {
            case 1:
                frame.getContentPane().add(panel_jugador1);
                break;
            case 2:
                frame.getContentPane().add(panel_jugador2);
                break;
            case 3:
                frame.getContentPane().add(panel_jugador3);
                break;
            case 4:
                frame.getContentPane().add(panel_jugador4);
                break;
            case 5:
                frame.getContentPane().add(panel_jugador5);
                break;
            case 6:
                frame.getContentPane().add(panel_jugador6);
                break;
            case 7:
                frame.getContentPane().add(panel_jugador7);
                break;
        }
        frame.getContentPane().revalidate();
        frame.getContentPane().repaint();
    }
}