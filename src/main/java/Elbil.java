public class Elbil extends Bil {

    private int batteriKapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batteriKapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetKWh = batteriKapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    public int getBatteriKapacitetKWh() {
        return batteriKapacitetKWh;
    }

    public void setBatteriKapacitetKWh(int batteriKapacitetKWh) {
        this.batteriKapacitetKWh = batteriKapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "\nElbil: \n" +
                "Registreringsnummer: " + regNr + "\n" +
                "Mærke: " + mærke + "\n" +
                "Model: " + model + "\n" +
                "Årgang: " + årgang + "\n" +
                "Antal døre: " + antalDøre + "\n" +
                "Batterikapacitet i kWh: " + batteriKapacitetKWh + "\n" +
                "Max km pr opladning: " + maxKm + "\n" +
                "kWh pr kilometer: " + whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {

        double kmPrL = (whPrKm/91.25)/100;

        if (kmPrL>=20 && kmPrL<50) {
            return 330;
        } else if (kmPrL<20 && kmPrL>=15) {
            return 1050;
        } else if (kmPrL<15 && kmPrL>=10) {
            return 2340;
        } else if (kmPrL<10 && kmPrL>=5) {
            return 5500;
        } else if (kmPrL<5) {
            return 10470;
        } else {
            return 330;
        }
    }
}
