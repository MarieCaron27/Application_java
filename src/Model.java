public class Model
{
    //Variable :
    protected String modelName;

    //Constructors :

    public Model()
    {
        setModelName("Corolla");
    }

    public Model(String mN)
    {
        setModelName(mN);
    }

    //Getter :

    public String getModelName()
    {
        return modelName;
    }

    //Setter :

    public void setModelName(String mN)
    {
        if(!mN.isEmpty())
        {
            modelName = mN;
        }
        else
        {
            System.out.println("The model's name can't be empty !");
        }
    }
}
