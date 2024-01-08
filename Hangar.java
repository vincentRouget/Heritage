public class Hangar {
    public static void main(String[] args) {

        Car kadjar = new Car("Kadjar");
        Car captur = new Car("Captur");
        Boat voilier = new Boat("Voilier");
        Boat bateau = new Boat("Bateau");
        System.out.println(kadjar.doStuff());
        System.out.println(captur.doStuff());
        System.out.println(voilier.doStuff());
        System.out.println(bateau.doStuff());
    }
}
