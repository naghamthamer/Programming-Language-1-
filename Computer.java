 class Computer extends Item implements Taxable
{
    private int speed;
    private int capacity;

    public Computer() 
    {
        
    }

    public Computer(int speed, int capacity, String name, double price, String color) 
    {
        super(name, price, color);
        this.speed = speed;
        this.capacity = capacity;
    }

    public int getSpeed() 
    {
        return speed;
    }

    public void setSpeed(int speed) 
    {
        this.speed = speed;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }
  
    @Override
    public double findCost() 
    {
        return  super.getPrice() + (0.02 *speed) + (0.03 *capacity) ;
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\tComputer{" + "speed=" + speed + ", capacity=" + capacity + '}';
    }

    @Override
    public double getTax() 
    {
        return findCost() * TAX_RATE;
    }
    
    
}
