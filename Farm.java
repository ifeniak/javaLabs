package ua.lviv.iot;

public class Farm {

    private String location;
    private int animals;
    private int power;

    private String ethics;
    private String material;
    private String colour;
    private int yearOfBirth;
    private String owner;

    protected double size;
    protected double price;

    private static int numberOfFields;

    public Farm(String location, int animals, int power, String ethics, String material, String colour,
                int yearOfBirth, String owner, double size, double price) {
        super();
        setValues(location, animals, power, ethics, material, colour,
                yearOfBirth, owner, size, price);
        numberOfFields++;
    }

    public Farm(String ethics, String material, String colour,
                int yearOfBirth) {
        this(null, 0, 0, ethics, material, colour, yearOfBirth, null, 0,
                0);
        numberOfFields++;
    }

    public Farm() {
        this(null, 0, 0, null, null, null, 0, null,
                0, 0);
        numberOfFields++;
    }

    public static void printStaticNumberOfFields() {
        System.out.println(numberOfFields);
    }

    public void printNumberOfFields() {
        System.out.println(numberOfFields);
    }

    public void resetValues(String location, int animals, int power, String ethics, String material, String colour,
                            int yearOfBirth, String owner, double size, double price) {
        setValues(location, animals, power, ethics, material, colour,
                yearOfBirth, owner, size, price);
    }

    private void setValues(String location, int animals, int power, String ethics, String material, String colour,
                           int yearOfBirth, String owner, double size, double price) {
        this.location = location;
        this.animals = animals;
        this.power = power;
        this.ethics = ethics;
        this.material = material;
        this.colour = colour;
        this.yearOfBirth = yearOfBirth;
        this.owner = owner;
        this.size = size;
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAnimals() {
        return animals;
    }

    public void setAnimals(int animals) {
        this.animals = animals;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEthics() {
        return ethics;
    }

    public void setEthics(String ethics) {
        this.ethics = ethics;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "location='" + location + '\'' +
                ", animals=" + animals +
                ", power=" + power +
                ", ethics='" + ethics + '\'' +
                ", material='" + material + '\'' +
                ", colour='" + colour + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", owner='" + owner + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
