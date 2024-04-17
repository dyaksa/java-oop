package product.data;

import product.annotation.Fancy;

@Fancy(name = "Animal", values = {"name", "run"})
public abstract class Animal {
    public String name;

    public abstract void run();
}
