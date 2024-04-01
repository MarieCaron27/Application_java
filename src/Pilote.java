public class Pilote
{
    private String name;

    public Pilote()
    {
        setName("Mario");
    }

    public Pilote(String n)
    {
        setName(n);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        if(!n.isEmpty())
        {
            name = n;
        }
    }
}
