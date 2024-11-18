package SOLID;

public class Archit extends  Father  {
    public  Archit(int age ){
        System.out.println("Hi Archit your age is "+age);
    }

    public static void main(String[] args) {
        int age =12;
        Archit obj = new Archit(age);
    }
}
