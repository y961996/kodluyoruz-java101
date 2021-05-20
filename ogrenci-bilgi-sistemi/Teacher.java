public class Teacher {
  String name;
  String mobilePhoneNumber;
  String branch;

  public Teacher(String name, String mobilePhoneNumber, String branch){
    this.name = name;
    this.mobilePhoneNumber = mobilePhoneNumber;
    this.branch = branch;
  }

  void print(){
    System.out.println("Adı: " + this.name);
    System.out.println("Telefonu: " +  this.mobilePhoneNumber);
    System.out.println("Bölümü: " + this.branch);
  }
}