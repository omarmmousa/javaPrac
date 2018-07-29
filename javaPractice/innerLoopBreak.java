class innerLoopBreak{
  public static void main(String args[]){
    for(int i = 1; i<= 3; i++){
      for(int j=1; j<= 3; j++){
        //if(i == 2 && j == 2){
          //break;
          switch(j){
            case 1: break;
            case 2: break;
            case 3: break;
          }
          System.out.println(i+" "+j);
        }
      }
    }
  }
