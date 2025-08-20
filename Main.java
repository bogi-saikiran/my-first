import java.util.*;
abstract class Shape{
int length,breadth,radius;
Scanner input=new Scanner(System.in);
abstract void printArea();
}
class rectangle extends Shape{
void printArea(){
System.out.println("Give length and breadth of rectangle");
length=input.nextInt();
breadth=input.nextInt();
 
System.out.println(length*breadth);
}
}
class triangle extends Shape{
void printArea(){
System.out.println("give dimenssions of Triangle");
length=input.nextInt();
breadth=input.nextInt();
System.out.println("Area of triangle=="+((length*breadth)/2));





}
class circle extends Shape{
    void printArea(){
        System.out.println("AREA OF circle");
        radius=input.nextInt();
        System.out.println("AREA OF CIRCLE=  "+(3.14f*radius*radius));
    }
}
}
class Main{
public static void main(String[] args){

rectangle r1=new rectangle();
r1.printArea();
triangle t1=new triangle();
t1.printArea();
circle c1=new circle();
c1.printArea();
}
}
 