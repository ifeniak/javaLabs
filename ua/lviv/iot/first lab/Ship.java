package ua.lviv.iot.ships;

public class Ship {

    private int tonnage;

    private String name;

    private String type;

    protected String anotherProtectedField;

    private static int objectCountField;

    public static final String STRING_CONSTANT_FIELD = "hello";

    public Ship(int tonnage, String name, String type, String anotherProtectedField) {
        super();
        setValues(tonnage, name, type, anotherProtectedField);
        objectCountField++;
    }

    public Ship(int tonnage, String name) {

        this(tonnage, name, null, null);
    }

    public Ship() {
        this(0, null, null, null);
    }

    public void resetValues(int tonnage, String name, String type, String anotherProtectedField) {
        setValues(tonnage, name, type, anotherProtectedField);
    }

    public static void printObjectCount() {
        System.out.println(objectCountField);
    }

    private void setValues(int tonnage, String name, String type, String anotherProtectedField) {
        this.tonnage = tonnage;
        this.name = name;
        this.type = type;
        this.anotherProtectedField = anotherProtectedField;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnotherProtectedField() {
        return anotherProtectedField;
    }

    public void setAnotherProtectedField(String anotherProtectedField) {
        this.anotherProtectedField = anotherProtectedField;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "tonnage=" + tonnage +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", anotherProtectedField='" + anotherProtectedField + '\'' +
                '}';
    }
}
