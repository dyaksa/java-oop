package product.application;

import product.data.Company;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT. Sejahtera");
        company.setCompany("Sejahtera");
        System.out.println(company.getName());

        Company.Employee employee = company.new Employee();
        employee.setName("Budi");
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
