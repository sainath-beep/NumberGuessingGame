import java.lang.Math;
//program for area of rectangle
//class student{   //class name should be in capital letter
//    int length;  //instance variable
//    int breadth;//instance variable
//
//    student(int l,int b){//constructor
//        this.length=l;//this keyword is used to refer to the current object
//        this.breadth=b;//this keyword is used to refer to the current object
//    }//method
//    int show(){//method name should be in small letter
//        return length*breadth;//return type should be same as the method name
//    }//method
//}
//public class demo2{//class name should be in capital letter
//    public static void main(String[] args) {//main method
//        student s1=new student(10,20);//object creation
//        System.out.println(s1.show());//method call
//    }//main method

//program for print only cars with price > 10 lakh
//class Car {
//    String brand;
//    int price;
//
//    Car(String b, int p) {
//        this.brand = b;
//        this.price = p;
//    }
//
//    void show() {
//        if (price > 100000) {
//            System.out.println(brand + " " + price);
//        }
//
//    }
//}
//public class demo2 {
//    public static void main(String[] args) {
//        Car c1=new Car("maruti",800000);
//        Car c2=new Car("honda",1200000?a gqn\=
//        rt8py );
//        Car c3=new Car("tata",100000);
//        c1.show();
//        c2.show();
//        c3.show();
//    }
//}


//print highest salary
//class Employee {
//    int id;
//    String name;
//    int salary;
//
//    Employee(int i,String n, int s) {
//        this.id = i;
//        this.name = n;
//        this.salary = s;
//    }
//
//    void show() {
//        System.out.println(id + " " + name + " " + salary);
//    }
//}
//public class demo2 {
//    public static void main(String[] args) {
//        Employee e1=new Employee(1,"ram",50000);
//        Employee e2=new Employee(2,"shyam",60000);
//
//        e1.show();
//        e2.show();
//
//        System.out.println("highest salary is: "+Math.max(e1.salary,(e2.salary)));
//
//    }
//}


//5th program
//class book{
//    String tile;
//    String author;
//    void show(){
//        System.out.println("book name is: "+tile);
//        System.out.println("author name is: "+author);
//    }
//}
//public class demo2 {
//    public static void main(String[] args) {
//        book b1=new book();
//        b1.tile="java";
//        b1.author="james gosling";
//        b1.show();
//    }
//}

class   Laptop{
    String brand;
    int ram;
    Laptop(String b,int r){
        this.brand=b;
        this.ram=r;
    }
    void upgrade(){
        int a=8;
        ram +=a;
        
    }

}
public class demo2{
    public static void main(String[]args){
        Laptop l1=new Laptop("dell",8);
        System.out.println(l1.brand + " " + l1.ram);
        l1.upgrade();
        System.out.println(l1.ram);
    }
}