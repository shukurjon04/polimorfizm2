package B_sxema;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bow bow");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
