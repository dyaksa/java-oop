package product.data;

public class Company {

    private String name;
    private String company;

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public class Employee {
        private String name;

        public String getCompany() {
            return Company.this.company;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
