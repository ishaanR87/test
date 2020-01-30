package ie.tudublin;
//Purpose of package is to prevent name space conflicts//
//.gitignore are the files you dont want to placve in your repository//
//changes
public class Main{
    public static void main(String[] args)
    {
        for(int i= 0; i< args.length; i++)
        {
            System.out.println(args[i]);
        }

        for(String s:args)
        {
            System.out.println(s);
        }
    }
}

