
public class Test 
{
    public static void main (String ards[])
    {
        Computer c1 = new Computer(1000 , 123 , "Lenovo" , 2050 , "black");
        Car r1 = new Car("Seltos" , "Kia"  , 5697 ,  "selver");
        Flower f1 = new Flower("Rose", "Jasminum" , 1023, "white");
        
        System.out.println(c1);
        System.out.println(r1);
        System.out.println(f1);
        System.out.println("-------------------");
        
        System.out.println("Computer Name: " + c1.getName());
        System.out.println("Computer Speed: " + c1.getSpeed());
        System.out.println("Computer Tax: " + c1.getTax());
        System.out.println("Computer Cost: " + c1.findCost());
        System.out.println("--------------------");
        
         double N = (r1.getPrice()*0.03) + r1.getPrice();
        r1.setPrice(N);
        System.out.println(r1);
        System.out.println("----------------------");
        
        System.out.println("Car Name: " + r1.getName());
        System.out.println("Car Tax: " + r1.getTax());
        System.out.println("Car Total Price: " + r1.getPrice());
        System.out.println("--------------------");
        
        System.out.println("Flower Name: " + f1.getName());
        System.out.println("Flower Color: " + f1.getColor());
        System.out.println("Flower Type: " + f1.getType());
        System.out.println("Flower Price: " + f1.getPrice());
        System.out.println("Flower Cost: " + f1.findCost());
        
        
    }
}
