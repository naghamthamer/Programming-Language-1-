
 class Car extends Item implements Taxable 
{
  private String model;
  
    public Car() 
    {
        
    }

    public Car(String model, String name, double price, String color) 
    {
        super(name, price, color);
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    @Override
    public double findCost() 
    {
      return super.getPrice() + 50;
        
    }

    @Override
    public String toString() 
    {
        return super.toString() + "\tCar{" + "model=" + model + '}';
    }
    
    @Override
    public double getTax() 
    {
      return findCost() * TAX_RATE;
    }
    
}
