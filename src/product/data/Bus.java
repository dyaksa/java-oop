package product.data;

public class Bus implements Car{
    private String name;
    private int tire;
    private String brand;

    private boolean maintenance;

    public void setDrive(String name){
        this.name = name;
    }

    public String getDrive(){
        return name;
    }

    public void setTire(int tire){
        this.tire = tire;
    }

    public int getTire(){
        return tire;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setMaintenance(boolean maintenance){
        this.maintenance = maintenance;
    }

    public boolean isMaintenance(){
        return maintenance;
    }

    public boolean isBig(){
        return true;
    }

}
