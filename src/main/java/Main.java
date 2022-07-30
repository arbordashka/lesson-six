public class Main {
    //   public int ANIMALCOUNT = 0;

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        cat1.run(10);
        dog1.run(20);
        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        cat1.swim(10);
        dog1.swim(1000);
        dog1.swim(-1);
    }
}