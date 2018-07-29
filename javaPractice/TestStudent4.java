class Student{
  int rollnum;
  String name;
  //insertRecord is a method
  void insertRecord(int r, String n){
    rollnum = r;
    name = n;
  }
  //displayInformation is a method
  void displayInformation(){System.out.println(rollnum+" "+name);}
}

class TestStudent4{
  public static void main(String args[]){
    Student s1 = new Student(); //Object of type student
    Student s2 = new Student(); // Object of type student

    s1.insertRecord(1, "Omar");
    s2.insertRecord(2, "Eyad");

    s1.displayInformation();
    s2.displayInformation();
  }
}
