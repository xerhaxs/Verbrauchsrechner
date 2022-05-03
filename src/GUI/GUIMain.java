package GUI;

import Rechner.Elektro;
import Rechner.Verbrenner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class GUIMain {
    public JPanel panelMain;
    private JButton verbrennerFahre1KmButton;
    private JSpinner verbrennerKilometerstandSpinner;
    private JButton verbrennerFahre25KmButton;
    private JLabel verbrennerTankinhaltLabel;
    private JSpinner verbrennerTankinhaltSpinner;
    private JLabel verbrennerKilometerstandLabel;
    private JButton verbrennerTanke1LButton;
    private JButton verbrennerTanke25LButton;
    private JLabel verbrennerSummeFahrtkostenLabel;
    private JSpinner elektroKilometerstandSpinner;
    private JSpinner elektroLadezustandSpinner;
    private JButton elektroFahre1KmButton;
    private JButton elektroFahre25KmButton1;
    private JButton elektroLade25KWhButton;
    private JButton elektroLade1KWhButton;
    private JTextField verbrennerSummeFahrtkostenTextField;
    private JLabel verbrennerLabel;
    private JLabel elektroLabel;
    private JLabel elektroKilometerstandLabel;
    private JLabel elektroLadezustandLabel;
    private JLabel elektroSummeFahrtkostenLabel;
    private JTextField elektroSummeFahrtkostenTextField;
    Verbrenner verbrenner1 = new Verbrenner(10, 2, 10, 80);

    Elektro elektro1 = new Elektro(15, 0.5, 10, 60);
    boolean verbrennerPrev = false;
    boolean elektroPrev = false;

    public GUIMain() {
        verbrennerTankinhaltSpinner.setValue(verbrenner1.getTankinhalt());
        elektroLadezustandSpinner.setValue(elektro1.getLadezustand());

        verbrennerFahre1KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbrenner1.fahre(1);
                System.out.println("Kilometerstand geändert auf " + verbrenner1.getKilometerstand());
                verbrennerKilometerstandSpinner.setValue(verbrenner1.getKilometerstand());
                verbrennerTankinhaltSpinner.setValue(verbrenner1.getTankinhalt());
                verbrennerSummeFahrtkostenTextField.setText(String.valueOf(verbrenner1.getFahrtkosten()));
            }
        });
        verbrennerFahre25KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbrenner1.fahre(25);
                System.out.println("Kilometerstand geändert auf " + verbrenner1.getKilometerstand());
                verbrennerKilometerstandSpinner.setValue(verbrenner1.getKilometerstand());
                verbrennerTankinhaltSpinner.setValue(verbrenner1.getTankinhalt());
                verbrennerSummeFahrtkostenTextField.setText(String.valueOf(verbrenner1.getFahrtkosten()));
            }
        });
        verbrennerTanke1LButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbrenner1.tanken(1);
                System.out.println("Tank aufgefüllt auf " + verbrenner1.getTankinhalt());
                verbrennerTankinhaltSpinner.setValue(verbrenner1.getTankinhalt());
            }
        });
        verbrennerTanke25LButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verbrenner1.tanken(25);
                System.out.println("Tank aufgefüllt auf " + verbrenner1.getTankinhalt());
                verbrennerTankinhaltSpinner.setValue(verbrenner1.getTankinhalt());
            }
        });

        verbrennerKilometerstandSpinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

            }
        });
     //   verbrennerTankinhaltSpinner.addChangeListener(new ChangeListener() {
     //       @Override
     //       public void stateChanged(ChangeEvent e) {
     //           System.out.println(verbrennerTankinhaltSpinner.getValue());
     //           verbrenner1.setTankinhalt((Double) verbrennerTankinhaltSpinner.getValue());
     //           System.out.println(verbrenner1.getTankinhalt());
     //
     //       }
     //   });

        // ELEKTRO
        elektroFahre1KmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elektro1.fahre(1);
                System.out.println("Kilometerstand geändert auf " + elektro1.getKilometerstand());
                elektroKilometerstandSpinner.setValue(elektro1.getKilometerstand());
                elektroLadezustandSpinner.setValue(elektro1.getLadezustand());
                elektroSummeFahrtkostenTextField.setText(String.valueOf(elektro1.getFahrtkosten()));
            }
        });
        elektroFahre25KmButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elektro1.fahre(25);
                System.out.println("Kilometerstand geändert auf " + elektro1.getKilometerstand());
                elektroKilometerstandSpinner.setValue(elektro1.getKilometerstand());
                elektroLadezustandSpinner.setValue(elektro1.getLadezustand());
                elektroSummeFahrtkostenTextField.setText(String.valueOf(elektro1.getFahrtkosten()));
            }
        });
        elektroLade1KWhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elektro1.addLadezustand(1);
                System.out.println("Tank aufgefüllt auf " + elektro1.getLadezustand());
                elektroLadezustandSpinner.setValue(elektro1.getLadezustand());
            }
        });
        elektroLade25KWhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elektro1.addLadezustand(25);
                System.out.println("Tank aufgefüllt auf " + elektro1.getLadezustand());
                elektroLadezustandSpinner.setValue(elektro1.getLadezustand());
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        verbrennerKilometerstandLabel = new JLabel();
        verbrennerKilometerstandLabel.setText("Kilometerstand");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(verbrennerKilometerstandLabel, gbc);
        verbrennerFahre1KmButton = new JButton();
        verbrennerFahre1KmButton.setText("fahre 1 km");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerFahre1KmButton, gbc);
        verbrennerFahre25KmButton = new JButton();
        verbrennerFahre25KmButton.setText("fahre 25 km");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerFahre25KmButton, gbc);
        verbrennerKilometerstandSpinner = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerKilometerstandSpinner, gbc);
        verbrennerTankinhaltSpinner = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerTankinhaltSpinner, gbc);
        verbrennerTankinhaltLabel = new JLabel();
        verbrennerTankinhaltLabel.setText("Tankinhalt");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(verbrennerTankinhaltLabel, gbc);
        verbrennerTanke1LButton = new JButton();
        verbrennerTanke1LButton.setText("tanke 1 L");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerTanke1LButton, gbc);
        verbrennerTanke25LButton = new JButton();
        verbrennerTanke25LButton.setText("tanke 25 L");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerTanke25LButton, gbc);
        verbrennerSummeFahrtkostenLabel = new JLabel();
        verbrennerSummeFahrtkostenLabel.setText("Summe Fahrtkosten");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(verbrennerSummeFahrtkostenLabel, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer1, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer3, gbc);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer4, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer5, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer6, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer7, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer8, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer9, gbc);
        verbrennerLabel = new JLabel();
        verbrennerLabel.setText("Verbrenner");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(verbrennerLabel, gbc);
        elektroLabel = new JLabel();
        elektroLabel.setText("Elektro");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(elektroLabel, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer10, gbc);
        elektroKilometerstandSpinner = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroKilometerstandSpinner, gbc);
        elektroLadezustandSpinner = new JSpinner();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroLadezustandSpinner, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer11, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(spacer12, gbc);
        elektroFahre1KmButton = new JButton();
        elektroFahre1KmButton.setText("fahre 1 km");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroFahre1KmButton, gbc);
        elektroFahre25KmButton1 = new JButton();
        elektroFahre25KmButton1.setText("fahre 25 km");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroFahre25KmButton1, gbc);
        elektroLade25KWhButton = new JButton();
        elektroLade25KWhButton.setText("lade 25 kWh");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroLade25KWhButton, gbc);
        elektroLade1KWhButton = new JButton();
        elektroLade1KWhButton.setText("lade 1 kWh");
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 12;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroLade1KWhButton, gbc);
        verbrennerSummeFahrtkostenTextField = new JTextField();
        verbrennerSummeFahrtkostenTextField.setEditable(false);
        verbrennerSummeFahrtkostenTextField.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(verbrennerSummeFahrtkostenTextField, gbc);
        elektroKilometerstandLabel = new JLabel();
        elektroKilometerstandLabel.setText("Kilometerstand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(elektroKilometerstandLabel, gbc);
        elektroLadezustandLabel = new JLabel();
        elektroLadezustandLabel.setText("Ladezustand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(elektroLadezustandLabel, gbc);
        elektroSummeFahrtkostenLabel = new JLabel();
        elektroSummeFahrtkostenLabel.setText("Summe Fahrtkosten");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.anchor = GridBagConstraints.WEST;
        panelMain.add(elektroSummeFahrtkostenLabel, gbc);
        elektroSummeFahrtkostenTextField = new JTextField();
        elektroSummeFahrtkostenTextField.setEditable(false);
        elektroSummeFahrtkostenTextField.setEnabled(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 14;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(elektroSummeFahrtkostenTextField, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }

}
