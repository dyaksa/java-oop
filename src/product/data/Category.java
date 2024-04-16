package product.data;

public class Category {
    private String name;
    private Boolean expensive;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public Boolean isExpensive(){
        return expensive;
    }

    public void setExpensive(Boolean expensive) {
        this.expensive = expensive;
    }
}
