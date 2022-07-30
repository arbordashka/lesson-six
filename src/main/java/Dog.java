public class Dog extends Animal {

    public Dog (){
    }

    @Override
    public void run (int length){
        if (length<=0){
            System.out.println("Некорректные данные длины");
        } else if (length>500){
            System.out.println("Слишком большая длина");
        } else
            super.run(length);
    }

    @Override
    public void swim (int length){
        if (length<=0){
            System.out.println("Некорректные данные длины");
        } else if (length>10){
            System.out.println("Слишком большая длина");
        } else
            super.swim(length);
    }


}