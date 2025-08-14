
abstract class Item 
{
    private String name;
    private double price;
    private String color;

    public Item() 
    {
        
    }

    public Item(String name, double price, String color) 
    {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    @Override
    public String toString() 
    {
        return "Item{" + "name=" + name + ", price=" + price + ", color=" + color + '}';
    }

   public abstract double findCost();
    
    
}
