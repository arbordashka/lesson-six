public class Cat extends Animal {


    public Cat (){
    }

    @Override
    public void run (int length){
        if (length<=0){
            System.out.println("Некорректные данные длины");
        } else if (length>200){
            System.out.println("Слишком большая длина");
        } else
            super.run(length);
    }

    @Override
    public void swim (int length){
        System.out.println("Коты не умеют плавать!");
    }

}

