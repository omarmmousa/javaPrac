//example to print class loader NAME

public class classLoaderExample
{
  public static void main(String args[])
  {
    Class c = classLoaderExample.class;
    System.out.println(c.getClassLoader());

    System.out.println(String.class.getClassLoader());

  }
}
