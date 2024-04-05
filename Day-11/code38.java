// Write a java program in which class geometric_objects is created and class  circle and rectangle are child classes of geometric_objects . Write the methods to find area , perimeter, and color of the shapes.

class geometric_obj{
    //private double area,perimeter;
    private String color;
    public geometric_obj()
    {
        this.color="White";
    }
    public geometric_obj(String clr){
        this.color=clr;
    }
    public double get_area()
    {
        return 0;
    }
    public double get_perimeter()
    {
        return 0;
    }
    public String get_color()
    {
        return color;
    }
   



}

class circle extends geometric_obj
{
    private double r;
    public circle(String clr , double radius) {
        super(clr);
        this.r=radius;
        //TODO Auto-generated constructor stub
    }
   
    @Override
    public double get_area() {
        double area = Math.PI*r*r;
        return area;
    }
    @Override
    public double get_perimeter() {
        double perimeter= 2*Math.PI*r;
        return perimeter;
    }
    public void set_radius(double radius)
    {
        this.r= radius;
        
    }
    public double get_radius(double radius)
    {
        this.r= radius;
        return r;

    }
  

}
class rectangle extends geometric_obj
{
    public rectangle(String clr, double length, double width) {
        super(clr);
        this.l= length;
        this.b=width;
        

        //TODO Auto-generated constructor stub
    }
    private double l,b;
    @Override
    public double get_area() {
        double area = l*b;
        return area;
    }
    @Override
    public double get_perimeter() {
        double perimeter= 2*l+b;
        return perimeter;
    }
    public void set_var(double length , double width)
    {
        this.l= length;
        this.b=width;
    }

}
public class code38 {
    
    public static void main(String[] args) {

        circle cs= new circle("Red",10);
        cs.set_radius(10);
        System.out.println(cs.get_area());
        System.out.println(cs.get_perimeter());

        geometric_obj gs =new geometric_obj();

        System.out.println(gs.get_color());

        rectangle rs = new rectangle("Yellow", 10, 05);
        System.out.println("Rectangle\n "+rs.get_area());
        System.out.println(rs.get_perimeter());
        System.out.println(rs.get_color());
        
    }
}
