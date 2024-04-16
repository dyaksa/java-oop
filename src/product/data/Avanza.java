package product.data;

public class Avanza implements Car {

    private String name;
    private int tire;
    private String brand;

    private boolean maintenance;

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

    public void setBrand(String name) {
        this.brand = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setMaintenance(boolean status) {
        maintenance = status;
    }

    public boolean isMaintenance() {
        return maintenance;
    }
}
