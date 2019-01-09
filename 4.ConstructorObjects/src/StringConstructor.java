public class StringConstructor {
    /*
    3. Create a class with a constructor that takes a String argument. During construction, print the argument. Create an array of object references to this class, but don’t actually create objects to assign into the array. When you run the program, notice whether the initialization messages from the constructor calls are printed.
         */
    String str;
    public StringConstructor(String str)
    {
        this.str=str;
        System.out.println("The Value of string is :" + str);
    }

    public static void main(String args[])
    {
        StringConstructor objects[]=new StringConstructor[4];
        objects[0]=new StringConstructor("hello");
        objects[1]= new StringConstructor("hi");
        objects[2]= new StringConstructor("bye");
        objects[3]= new StringConstructor("bye");


    }
}