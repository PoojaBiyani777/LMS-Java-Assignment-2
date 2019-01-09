public class ConstructorOverloading {

    int var;
    public ConstructorOverloading(){
        System.out.println("Contructor with no parameters");
    }

    public ConstructorOverloading(int var){
        this.var=var;
        System.out.println("Constructor with parameter value : "+var);
        new ConstructorOverloading();
    }

    public static void main(String args[])
    {
        ConstructorOverloading object1= new ConstructorOverloading();
        ConstructorOverloading object2= new ConstructorOverloading(7);
    }

}
