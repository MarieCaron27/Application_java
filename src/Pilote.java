public class Pilote
{
    private String nom;

    public Pilote()
    {
        setNom("Mario");
    }

    public Pilote(String n)
    {
        setNom(n);
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String n)
    {
        if(!n.isEmpty())
        {
            nom = n;
        }
    }
}
