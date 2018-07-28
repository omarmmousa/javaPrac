/* The logical || operator doesn't check second condition if first
   condition is true. It checks second condition only if first one is false.

   The bitwise | operator always checks both conditions whether first condition is true or false. */


class LogicalVsBitwiseOR{
  public static void main(String args[]){
    int a = 10;
    int b = 5;
    int c = 20;

    System.out.println(a>b||a<c);// true || true --> 10 > 5 and 10 < 20
    System.out.println(a>b|a<c);// true | true

    //||vs|
  System.out.println(a>b||a++<c); // 10 > 5 || 11 < 20 --> true
  System.out.println(a); // 10
  System.out.println(a>b|a++<c); // 10 > 5 || 11 < 20 --> true
  System.out.println(a);// 11
  }
}
