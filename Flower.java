
 class Flower extends Item
{
    private String type;

    public Flower() 
    {
        
    }

    public Flower(String type, String name, double price, String color) 
    {
        super(name, price, color);
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    @Override
    public double findCost()
    {
        return super.getPrice() + 20 ;
    }
    
    @Override
    public String toString() 
    {
        return super.toString() + "\tFlower{" + "type=" + type + '}';
    }

  
    
    
}
