package Rechner;

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
        if (zTankinhalt - (zVerbrauch / 100) * pStrecke >= 0) {
            super.fahre(pStrecke);
            zTankinhalt = zTankinhalt - (zVerbrauch / 100) * pStrecke;
        } else if (zVerbrauch / 100 * zTankinhalt >= 0) {
            super.fahre(zVerbrauch / 100 * zTankinhalt);
            zTankinhalt = 0;
        } else {
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
