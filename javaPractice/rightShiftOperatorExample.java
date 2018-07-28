/*The Java right shift operator >> is used to move left
  operands value to right by the number of bits specified
  by the right operand.*/


class OperatorExampleFour{
  public static void main(String args[]){
    System.out.println(10>>2);// 2 --> 10/2^2 = 10/4
    System.out.println(20>>2);// 5 --> 20/2^2 = 20/4
    System.out.println(20>>3);// 2 --> 20/2^3 = 20/8
  }
}
