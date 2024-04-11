import java.time.LocalDate;

public class Kart
{
    //Fields :
    private String name;
    private String color;

    //Constructors :
    public Kart()
    {
        setName("Peugeot 206");
        setColor("red");
    }

    public Kart(String n,String c)
    {
        setName(n);
        setColor(c);
    }

    //Getters :
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }

    //Setters :
    public void setName(String n)
    {
        name = n;
    }
    public void setColor(String c)
    {
        color = c;
    }
}