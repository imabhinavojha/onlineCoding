package SOLID;

class Overloading1 {

    int sum(int a, int b){
        return a*b;
    }
    int sum(int a, int b, int c){
        return a*b*c;
    }

}
public class Overloading extends  Overloading1{

    int sum(int a, int b){
        super.sum(a, b);
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        int sunf = obj.sum(1,2);
        System.out.println(sunf);

    }
}
