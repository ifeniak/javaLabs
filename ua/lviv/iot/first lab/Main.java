package ua.lviv.iot.ships;
import java.util.Scanner; // импорт сканнера

public class Main {

    public static void main(String[] args) {

        String a = "ghj";
        String b = "ghj";

        Ship.printObjectCount();

        Ship everGreen = new Ship();
        System.out.println(everGreen);

        Ship tytanic = new Ship(1999, "Tytanic");
        System.out.println(tytanic);

        Ship.printObjectCount();

    }

}
