package SOLID;

public class Father {

    public  void getAge(){
        System.out.println(60);
    }
}
class  Child extends  Father{

    public  void getAge(){
        super.getAge();
        System.out.println(24);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.getAge();
    }

}
