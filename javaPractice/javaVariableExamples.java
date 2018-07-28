/*class A{
  int data=50;//instance variable
  static int m=100;//static variable
  void method(){
    int n=90;//local variable
  }
}*/

class Simple{
  public static void main(String[] args){
    //int a=10;//instance  variable
    //in//t b=10;//instance variable
    //float f=10.5f;//instance variable as a float (shows with decimal point)
    //int a=(int)f; //int a = f compile time error
    //int c=a+b; //sum of a and break;
    //System.out.println(c); // prints out the sum of the two instance variables
    //int a = 130;
    //byte b=(byte)a;
    //System.out.println(f);
    byte a = 10;
    byte b = 10;
    //byte c=a+b; // Compile time error: because a+b=20 will be int
    byte c=(byte)(a+b);
    //System.out.println(a);
    //System.out.println(b);
    System.out.println(c);
  }
}
