//methods
class calculator
{
    public int add(int a , int b )
    {
       return a +b;
    }
    public int sub(int a , int b )
    {
       return a -b;
    }
    public double mul(int a , double b)
    {
        return a * b;
    }
    
}

public class calc2 
{
    public static void main(String[] args) 
    {     
    calculator calc = new calculator();
     int result = calc.add(5,4);
     int result1 = calc.sub(9,4);
     double result2 = calc.mul(4,5.2);
     System.out.println(result);
     System.out.println(result1);
     System.out.println(result2);

    }
}
