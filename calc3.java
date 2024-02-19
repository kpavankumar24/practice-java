// method overloading
class calculator
{
    public int mul(int a, int b ,int c)
    {
        return a*b*c;
    }
    public int mul(int a, int b)
    {
        return a*b;
    }
    public double mul(int a, double b)
    {
        return a*b;
    }

}

public class calc3 
{
    public static void main(String[] args) 
    {
        calculator calc = new calculator();
        double result = calc.mul(5,5.5);
        int result1 = calc.mul(2,3,4);
        System.out.println(result +  " | "  + result1);
       
        
    }
    
}
