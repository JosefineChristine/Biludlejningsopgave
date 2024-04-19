public class Dieselbil extends Bil {

    private boolean harPartikelfilter;
    private int kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    public boolean getHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "\nDieselbil: \n" +
                "Registreringsnummer: " + regNr + "\n" +
                "Mærke: " + mærke + "\n" +
                "Model: " + model + "\n" +
                "Årgang: " + årgang + "\n" +
                "Antal døre: " + antalDøre + "\n" +
                "Har den partikelfilter: " + harPartikelfilter + "\n" +
                "Kilometer pr liter: " + kmPrL + "\n";
    }

    @Override
    public double beregnGrønEjerafgift() {
        double dieselGrønEjerafgift = 0;

        if (kmPrL>=20 && kmPrL<50) {
            dieselGrønEjerafgift = 330 + 130;
        } else if (kmPrL<20 && kmPrL>=15) {
            dieselGrønEjerafgift = 1390 + 1050;
        } else if (kmPrL<15 && kmPrL>=10) {
            dieselGrønEjerafgift = 1850 + 2340;
        } else if (kmPrL<10 && kmPrL>=5) {
            dieselGrønEjerafgift = 2770 + 5500;
        } else if (kmPrL<5) {
            dieselGrønEjerafgift = 15260 + 10470;
        } else {
            return 330 + 130;
        }

        if (getHarPartikelfilter()) {
            return dieselGrønEjerafgift;
        }
        dieselGrønEjerafgift += 1000;
        return dieselGrønEjerafgift;
    }
}

