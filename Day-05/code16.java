// Write a java program  that uses assignment operators and logical operators.
public class code16 {
    
    public static void main(String[]args)
    {
        int y=6;
        y++;
        int x =6;
        --x;
        y+=10;

        System.out.println(6!=8);
        System.out.println(y);
        if(y<=7 && x>=6)
        {
            System.out.println("Print X:"+x);
        }
        else if(y<=7 || x<=6)
        {
            System.out.println("Print y:"+y);

        }
    }
}
