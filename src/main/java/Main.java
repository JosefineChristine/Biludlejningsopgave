public class Main {
    public static void main(String[] args) {
        Garage garage1 = new Garage();

        Bil bil1 = new Benzinbil(1,"opel", "astra", 1995, 5, 80, 30);
        Bil bil2 = new Dieselbil(2, "peugot", "106", 2005, 5, false, 20);
        Bil bil3 = new Elbil(3, "tesla", "x", 2020, 3, 1000, 400, 70);

        garage1.add(bil1);
        garage1.add(bil2);
        garage1.add(bil3);

        System.out.println(garage1 + "\n");
        System.out.println("Den samlede grønne afgift for bilerne i garagen er: ");
        System.out.println(garage1.beregnGrønAfgiftForGarage() + " kr");
    }
}
