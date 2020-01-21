package kkalinowski.versioning.demo;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "This project is running version "+App.class.getPackage().getImplementationVersion() );
    }
}
