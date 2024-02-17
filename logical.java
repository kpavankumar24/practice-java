public class logical 
{ public static void main(String[] args) 
{
    int a = 25;
    int b = 30;
    int c = 20;
       // and 
    if ((a>b) && (a>c))
        System.out.println(a);
    else if (b>c)
         System.out.println(b);
    else
       System.out.println(c);
       // or
       if ((a>b) || (a>c))
       System.out.println(a);
       
}
    
}
