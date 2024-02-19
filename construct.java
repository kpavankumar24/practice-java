class Pizza
{
    String Brand;
    String type;
    String chesse;
    String sauce;
    int price;
    int count;
    public Pizza(String brd ,String type,String chesse, String sauce,int price ,int count )
    {
        Brand =brd;   // we can do like this also
        this.type=type;
        this.chesse=chesse;
        this.sauce=sauce;
        this.price=price;
        this.count=count;
    }

    public void show()
    {
        System.out.println("Brand : " + Brand  + ","+ "Type : " + type + "," + "chesse :" + chesse + " ," + "sauce :" +
                            sauce + "," + "price : " + price + "," + "how many : " + count);
    }
}


public class construct 
{
    public static void main(String[] args) 
    {
        Pizza order = new Pizza("Dominos" , "non-veg" , "mozzarilla" , "tomato" , 500 , 2 );
        order.show();
    }
}
