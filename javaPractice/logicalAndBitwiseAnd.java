/*The logical && operator doesn't check second condition
  if first condition is false. It checks second condition
  only if first one is true. */

The bitwise & operator always checks both conditions whether first condition is true or false.
class LogicalVsBitwiseAND{
  public static void main(String args[]){
    int a=10;
    int b=5;
    int c=20;

    System.out.println(a<b&&a<c); //a !< b, a < c false and true --> false
    System.out.println(a<b&a<c); // a !< b, a < c false and true --> false
  }
}
