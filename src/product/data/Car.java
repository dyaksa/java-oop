package product.data;

public interface Car extends Brand, Maintenance {
    void setDrive(String name);
    String getDrive();

    void setTire(int tire);
    int getTire();

    default boolean isBig() {
        return false;
    }
}
