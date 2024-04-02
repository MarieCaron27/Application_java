public class Brand
{
    //Variable :
    protected String brandName;

    //Constructors :

    public Brand()
    {
        setBrandName("Peugeot");
    }

    public Brand(String bN)
    {
        setBrandName(bN);
    }

    //Getter :

    public String getBrandName()
    {
        return brandName;
    }

    //Setter :

    public void setBrandName(String bN)
    {
        if(!bN.isEmpty())
        {
            brandName = bN;
        }
        else
        {
            System.out.println("The brand can't be empty");
        }
    }
}
