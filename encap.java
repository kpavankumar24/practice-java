class human
{
    private int age = 23;
    private String name = "pavan";
    private int weight;
    private String habit; 

    public int getage()
    {
        return age;
    }
    public String getname()
    {
        return name;
    }
    
    public void setwgt(int wgt)
    {
         weight=wgt;
         
    }
    public void sethbt(String hbt)
    {
        habit = hbt;
    }
    public int getweight()
    {
        return weight;
    }
    public String gethabit()
    {
        return habit;
    }

}


public class encap
{
    public static void main(String[] args) 
    {
        human man = new  human();
      
        System.out.println("age: " + man.getage()  + " , " + "name :" + man.getname() );
        man.setwgt(50);
        man.sethbt("cricket");
        System.out.println("weight :" +  man.getweight()  +  "," + "habbit:" +  man.gethabit());
        
       
    }
    
}
