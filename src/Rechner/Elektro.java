package Rechner;

public class Elektro extends Auto {
    double zLadezustand;
    double zVerbrauch;
    double zStromkosten;
    double zAkkugroesse;

    public Elektro(double pVerbrauch, double pStromkosten, double pLadezustand, double pAkkugroesse) {
        zLadezustand = pLadezustand;
        zVerbrauch = pVerbrauch;
        zStromkosten = pStromkosten;
        zAkkugroesse = pAkkugroesse;
    }
    public void addLadezustand(double pMenge) {
        if (zLadezustand + pMenge <= zAkkugroesse) {
            zLadezustand = zLadezustand + pMenge;
        } else if (zAkkugroesse - zLadezustand <= pMenge) {
            zLadezustand = zAkkugroesse;
        }
    }
    public void setLadezustand(double pLadezustand) {
        zLadezustand = pLadezustand;
    }
    public double getLadezustand() {
        return zLadezustand;
    }
    public void fahre(double pStrecke) {
        if (zLadezustand - (zVerbrauch / 100) * pStrecke >= 0) {
            super.fahre(pStrecke);
            zLadezustand = zLadezustand - (zVerbrauch / 100) * pStrecke;
        } else if (zVerbrauch / 100 * zLadezustand >= 0) {
            super.fahre(zVerbrauch / 100 * zLadezustand);
            zLadezustand = 0;
        } else {
            System.out.println("Der Tank ist leer.");
        }
    }
    public double getVerbrauch() {
        return zVerbrauch;
    }
    public double getStromkosten() {
        return zStromkosten;
    }
    public double getFahrtkosten() {
        return zStromkosten * ((zVerbrauch / 100) * zKilometerstand);
    }
    public void setStromkosten(double pStromkosten) {
        zStromkosten = pStromkosten;
    }
    public void setVerbrauch(double pVerbrauch) {
        zVerbrauch = pVerbrauch;
    }
    public double getReichweite() {
        return zLadezustand - zKilometerstand;
    }
}
