//Initialization of primitive variables --> int a=10, b=20;
// Initialization of reference variable --> Rectangle r1=new Rectangle(), r2= new Rectangle(); {creating two objects}

class Rectangle{
  int length;
  int width;
  void insert(int l, int w){
    length = l;
    width = w;
  }

  void calculateArea(){System.out.println(length*width);}
}

class TestRectangle2{
  public static void main(String args[]){
    Rectangle r1= new Rectangle(), r2=new Rectangle();// creating two new objects
    r1.insert(11,5);
    r2.insert(3,15);
    r1.calculateArea();
    r2.calculateArea();
  }
}
