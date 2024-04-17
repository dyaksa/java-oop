package product.data;

public enum Level {
    BRONZE("Bronze Level"),
    SILVER("Silver Level"),
    GOLD("Gold Level"),
    PLATINUM("Platinum Level");

    private final String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
