public class IfElseExample{
  public static void main(String args[]){
    int number = 13;
    if(number%2 == 0){
      System.out.println("Number is an even number");
    }
    else{
      System.out.println("Number is an odd number");
      System.out.println(number%2);// 1
    }
  }
}
