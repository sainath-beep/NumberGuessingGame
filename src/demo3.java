////////Create a Student class with name and marks.
////////Initialize using constructor and write a method to check pass/fail.
//////class student{
//////    String name;
//////    int marks;
//////
//////    student(String n,int m){
//////        this.name=n;
//////        this.marks=m;
//////    }
//////
//////    void show(){
//////
//////        if(marks<35){
//////            System.out.println(name + "-" + marks + "this guyys sucks and fail useless fellow");
//////        }
//////
//////        else{
//////            System.out.println("pass");
//////
//////        }
//////    }
//////}
//////public class demo3{
//////    public static void main(String []args){
//////        student s1=new student("sai",98);
//////        student s2=new student("sainath",28);
//////        s1.show();
//////        s2.show();
//////    }
//////}
////
////
////// Create a Product class with id, price, and quantity.
//////Use constructor and write a method to calculate total cost.
////
////
//////class Product{
//////    int id;
//////    int price;
//////    int quantity;
//////
//////    Product(int i,int p,int q){
//////        this.id=i;
//////        this.price=p;
//////        this.quantity=q;
//////    }
//////
//////    void totalCost(){
//////        int cost=price*quantity;
//////        System.out.println("total cost is " + cost);
//////    }
//////}
//////public class demo3{
//////    public static void main(String []args){
//////        Product p1=new Product(1,100,5);
//////        p1.totalCost();
//////    }
//////}
////
////// Online Java Compiler
////// Use this editor to write, compile and run your Java code online
////// Create a Product class with id, price, and quantity.
////// Use constructor and write a method to calculate total cost.
////
////
////class product{
////    int id;
////    int price;
////    int quantity;
////
////    product(int i,int p,int q){
////        this.id=i;
////        this.price=p;
////        this.quantity=q;
////    }
////
////    void CalculateCost(){
////        int cost=price* quantity;
////        System.out.println("the total cost is :--" + cost);
////    }
////
////}
////class demo3 {
////    public static void main(String[] args) {
////
////        product p1 = new product(1, 100, 5);
////
////
////
////        p1.CalculateCost();
////    }
////}
//// Online Java Compiler
//// Use this editor to write, compile and run your Java code online
//// Create a Product class with id, price, and quantity.
//// Use constructor and write a method to calculate total cost.
//
//
//// class product{
////     int id;
////     int price;
////     int quantity;
//
////     product(int i,int p,int q){
////         this.id=i;
////         this.price=p;
////         this.quantity=q;
////     }
//
////     void CalculateCost(){
////         int cost=price* quantity;
////         System.out.println("the total cost is :--" + cost);
////     }
//
//// }
//// class Main {
////     public static void main(String[] args) {
//
////       product p1 = new product(1,1000,15);
//
//
//
////       p1.CalculateCost();
////     }
//// }
//
////Create a Person class with name and age.
////Use constructor and write a method to check voting eligibility.
//
//
//class Person{
//    String name;
//    int age;
//
//    Person(String n,int a){
//        this.name=n;
//        this.age=a;
//    }
//    void voteeliggible(){
//        if (age<18){
//            System.out.println("eligible to vote");
//        }
//        else{
//            System.out.println("not eligible to vote");
//        }
//    }
//}
//public class demo3{
//    public static void  main(String []man){
//        Person p1= new Person("sai",19);
//        Person p2= new Person("saibnafeed",17);
//        Person[] arr={p1,p2};
//        for(Person p:arr){
//            if(age<=18){
//                System.out.println("eligible to vote");
//
//            }
//            else{
//                System.out.println("not eligible to vote");
//            }
//
//        }
//        p1.voteeliggible();
//        p2.voteeliggible();
//    }
//}
//
//
//
//
