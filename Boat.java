public class Boat extends Vehicle {
    public Boat(String brand) {
        super(brand);
    }

    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}
