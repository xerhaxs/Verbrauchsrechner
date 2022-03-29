package Rechner;

public abstract class Auto {
    double zKilometerstand;

    public Auto() {

    }

    public void fahre(double pStrecke) {
        zKilometerstand = zKilometerstand + pStrecke;
    }
    public double getKilometerstand() {
        return zKilometerstand;
    }
    abstract double getReichweite();
}
