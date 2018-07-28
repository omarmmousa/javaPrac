class OperatorExampleFive{
  public static void main(String args[]){
    // Comparison of >> and >>>
    //>> and >>> work out put same results for positive values
    System.out.println("Positive Values");
    System.out.println(20>>3); // 20/2*3 --> 20/8 = 10/2 = 5
    System.out.println(20>>>3); // 5

    //For negative values the >>> changes parity bit (MSB: most siginificant bit) to 0
    System.out.println("Negative values:");
    System.out.println(-20>>3);
    System.out.println(-20>>>3); // most siginificant bit changes to 0
  }
}
