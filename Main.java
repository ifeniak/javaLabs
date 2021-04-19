package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {

        Farm farmEverGreen = new Farm();
        System.out.println(farmEverGreen + "\n");

        Farm farmThermopylae = new Farm("nice", "metal", "green", 480);
        System.out.println(farmThermopylae + "\n");

        Farm farmBurzum = new Farm("Canada", 29, 228, "lawful", "plastic", "black",
                1984, "Diocletian", 12.0, 228000);
        System.out.println(farmBurzum + "\n");

        Farm.printStaticNumberOfFields();
        farmThermopylae.printNumberOfFields();

    }
}
