import java.time.LocalDate;

public class Car
{
    //Variables :
    private String name;
    //private int yearOfManufacture;
    private String color;
    //private float price;
    //private float numberKms;
    //private String fuelType;
    //private String transmission;

    //Constructors
    public Car()
    {
        setName("Peugeot 206");
        //setYearOfManufacture(2001);
        setColor("red");
        /*setPrice(2500);
        setNumberKms(1096);
        setFuelType("Super 95-E10");
        setTransmission("Manuelle");*/
    }

    public Car(String n,String c)
    {
        setName(n);
        //setYearOfManufacture(year);
        setColor(c);
        /*setPrice(p);
        setNumberKms(nbKms);
        setFuelType(fT);
        setTransmission(t);*/
    }

    //Getters :
    public String getName()
    {
        return name;
    }
    /*public int getYearOfManufacture()
    {
        return yearOfManufacture;
    }*/
    public String getColor()
    {
        return color;
    }
    /*public float getPrice()
    {
        return price;
    }
    public float getNumberKms()
    {
        return numberKms;
    }
    public String getFuelType()
    {
        return fuelType;
    }
    public String getTransmission()
    {
        return transmission;
    }*/

    //Setters :

    public void setName(String n)
    {
        name = n;
    }
    public void setColor(String c)
    {
        color = c;
    }
    /*public void setPrice(float p)
    {
        price = p;
    }
    public void setNumberKms(float nbKms)
    {
        numberKms = nbKms;
    }
    public void setFuelType(String fT)
    {
        fuelType = fT;
    }
    public void setTransmission(String t)
    {
        transmission = t;
    }*/
}