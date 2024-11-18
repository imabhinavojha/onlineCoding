package SOLID.LSP;

class Rectangle {
     int width;
     int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }

    public static void main(String[] args) {
        Square obj = new Square();
        obj.setHeight(12);
        System.out.println(obj.calculateArea());

        Square obj1 = new Square();
        obj1.setHeight(2);
        obj1.setWidth(3);
        System.out.println(obj1.calculateArea());


        Rectangle obj3 = new Rectangle();
        obj3.setHeight(2);
        obj3.setWidth(3);
        System.out.println(obj3.calculateArea());



    }
}

class plus implements Shape{

    int a,b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return a+b;
    }

    public static void main(String[] args) {
        plus elipseObj = new plus();
        elipseObj.setA(2);
        elipseObj.setB(3);
        System.out.println(elipseObj.calculateArea());
    }


}

class mul implements Shape{

    int a,b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int calculateArea() {
        return a*b;
    }

    public static void main(String[] args) {
        mul mulObj = new mul();
        mulObj.setA(2);
        mulObj.setB(3);
        System.out.println(mulObj.calculateArea());
    }


}