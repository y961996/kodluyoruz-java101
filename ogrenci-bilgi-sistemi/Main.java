public class Main{

  public static void main(String[] args){
    Teacher t1 = new Teacher("Mahmut Hoca", "5551112365", "TRH");
    Teacher t2 = new Teacher("Einstein", "5658889772", "FZK");
    Teacher t3 = new Teacher("Selman", "5535548787", "BIO");

    Course tarih = new Course("Tarih", "101", "TRH");
    tarih.addTeacher(t1);

    Course fizik = new Course("Fizik", "102", "FZK");
    fizik.addTeacher(t2);

    Course biology = new Course("Biyoloji", "101", "BIO");
    biology.addTeacher(t3);

    Student s1 = new Student("Elon Musk", "72", "4", tarih, fizik, biology);
    s1.addBulkExamNote(100, 78, 50, 60, 40, 72);
    s1.isPassing();

    Student s2 = new Student("Edison", "66", "4", tarih, fizik, biology);
    s2.addBulkExamNote(50, 30, 65, 45, 78, 91);
    s2.isPassing();
  }

}