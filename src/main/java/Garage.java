import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> garageArray;
    private String mineBiler;

    public Garage() {
        garageArray = new ArrayList<>();
    }

    public void add(Bil bil) {
        garageArray.add(bil);
    }

    public double beregnGrønAfgiftForGarage() {
        double grønAfgigt=0;
        for (Bil bil : garageArray) {
            grønAfgigt += bil.beregnGrønEjerafgift();
        }
        return grønAfgigt;
    }

    @Override
    public String toString() {
        String result = "";
        result += "Biler i garagen: \n";
        for (Bil biler : garageArray) {
            result += biler.toString();
        }
        return result;
    }



}
