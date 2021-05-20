public class Main {
  public static void main(String[] args){
    Boksor b1 = new Boksor("Muhammed Ali", 20, 115, 100, 50);
    Boksor b2 = new Boksor("Mike Tyson", 18, 120, 98, 40);

    Musabaka musabaka = new Musabaka(b1, b2, 90, 100);
    musabaka.run();
  }
}