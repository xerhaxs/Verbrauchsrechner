package Rechner;

public class Verbrenner extends Auto {
    double zTankinhalt;
    double zVerbrauch;
    double zKraftstoffkosten;

    public Verbrenner(double pVerbrauch, double pKraftstoffkosten) {
        zVerbrauch = pVerbrauch;
        zKraftstoffkosten = pKraftstoffkosten;
    }
    public void tanken(double pMenge) {
        zTankinhalt = zTankinhalt + pMenge;
    }
    public double getTankinhalt() {
        return zTankinhalt;
    }
    public void fahre(double pStrecke) {
        zKilometerstand = zKilometerstand + pStrecke;
        zTankinhalt = zTankinhalt - zVerbrauch;
    }
    public double getVerbrauch() {
        return zVerbrauch;
    }
    public double getKraftstoffkosten() {
        return zKraftstoffkosten;
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
