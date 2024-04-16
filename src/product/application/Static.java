package product.application;

import product.data.Apps;
import product.data.Country;
import product.utils.MathUtil;

import static product.data.Constant.APPLICATION;
import static product.data.Constant.VERSION;

public class Static {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Country.City city = new Country.City();
        city.setName("New York");
        System.out.println(city.getName());

        System.out.println(Apps.PROCESSORS);
    }
}
