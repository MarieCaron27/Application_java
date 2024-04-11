public class Pilote
{
    //Fields :
    private String name;
    private float weight;

    //Constructors :
    public Pilote()
    {
        setName("Mario");
    }

    public Pilote(String n)
    {
        setName(n);
    }

    //Getter :

    public String getName()
    {
        return name;
    }

    //Setter :
    public void setName(String n)
    {
        if(!n.isEmpty())
        {
            name = n;
        }
    }
}
