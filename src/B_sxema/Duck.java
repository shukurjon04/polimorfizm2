package B_sxema;

public class Duck extends Animal{
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void sound() {
        System.out.println("quack quack");
    }
}
