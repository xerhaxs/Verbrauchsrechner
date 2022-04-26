package Rechner;

import GUI.ErrorTankinhalt;
import GUI.GUIMain;

import javax.swing.*;

public class Verbrenner extends Auto {
    double zTankinhalt;
    double zVerbrauch;
    double zKraftstoffkosten;

    public Verbrenner(double pVerbrauch, double pKraftstoffkosten, double pTankinhalt) {
        zTankinhalt = pTankinhalt;
        zVerbrauch = pVerbrauch;
        zKraftstoffkosten = pKraftstoffkosten;
    }
    public void tanken(double pMenge) {
        zTankinhalt = zTankinhalt + pMenge;
    }
    public void setTankinhalt(double pTankinhalt) {
        zTankinhalt = pTankinhalt;
    }
    public double getTankinhalt() {
        return zTankinhalt;
    }
    public void fahre(double pStrecke) {
        if (zTankinhalt / zVerbrauch * pStrecke > 0) {
            super.fahre(pStrecke);
            zTankinhalt = zTankinhalt - (zVerbrauch / 100) * pStrecke;
        } else {
            ErrorTankinhalt dialog = new ErrorTankinhalt();
            dialog.pack();
            dialog.setVisible(true);
            System.out.println("Der Tank ist leer.");
        }
    }
    public double getVerbrauch() {
        return zVerbrauch;
    }
    public double getKraftstoffkosten() {
        return zKraftstoffkosten;
    }
    public double getFahrtkosten() {
        return zKraftstoffkosten * ((zVerbrauch / 100) * zKilometerstand);
    }
    public void setKraftstoffkosten(double pKraftstoffkosten) {
        zKraftstoffkosten = pKraftstoffkosten;
    }
    public void setVerbrauch(double pVerbrauch) {
        zVerbrauch = pVerbrauch;
    }
    public double getReichweite() {
        return zTankinhalt - zKilometerstand;
    }
}
