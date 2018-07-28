class AssignmentOperatorThree{
  public static void main(String args[]){
    short a = 10;
    short b = 10;
    //a += b // a=a+b internally is fine
    //a=a+b;
    //System.out.println(a);// compile time error because the values are now ints instead of short so need to add a typecast to the operation
    a=(short)(a+b); //typecast to set the assignments as short
    System.out.println(a); // 20
  }
}
