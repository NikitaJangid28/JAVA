// 100% data hiding
interface Shape{
    double area();
}
class Circle implements Shape{
    double r;
    public Circle( double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*Math.pow(r, 2);
    }
}
public class Interface {
    public static void main(String[] args) {
        Circle c= new Circle(2.5);
        System.out.println("Area of circle " +c.area());
    }
}
