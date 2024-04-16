package product.data;

public class Avanza implements Car {

    private String name;
    private int tire;

    public void setDrive(String name) {
        this.name = name;
    }

    public String getDrive() {
        return name;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    public int getTire() {
        return tire;
    }
}
