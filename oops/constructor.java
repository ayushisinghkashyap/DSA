package oops;

public class construstor {
    public static void main(String[] args) {
        pen1 p1 = new pen1();
        p1.color="Blue";
        p1.tip=98;
        p1.brand="Cello";

        pen1 p2 = new pen1("yellow");
        pen1 p3 = new pen1(7,p1.brand);
        System.out.println(p2.color);
        System.out.println(p3.tip);
        System.out.println(p3.brand);
    }
}
class pen1{
    String color;
    int tip;
    String brand;
    pen1(){   //non-parameterized
        System.out.println("hello world");
    }
    pen1(String color){   //parameterized
        this.color = color;
    }
    pen1(int tip,String BrandName){      //parameterized
        this.tip = tip;
        this.brand = BrandName;
    }
}
