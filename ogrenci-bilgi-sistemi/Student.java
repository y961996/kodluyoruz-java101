public class Student {
  Course c1;
  Course c2;
  Course c3;
  String name;
  String studentNo;
  String classes;
  double average;
  boolean isPassing;

  public Student(String name, String studentNo, String classes, Course c1, Course c2, Course c3){
    this.name = name;
    this.studentNo = studentNo;
    this.classes = classes;
    this.c1 = c1;
    this.c2 = c2;
    this.c3 = c3;
    this.average = 0.0;
    this.isPassing = false;
  }

  void addBulkExamNote(int note1, int note2, int note3, int note1Sozlu, int note2Sozlu, int note3Sozlu){
    if(note1 >= 0 && note1 <= 100)  this.c1.note = note1;
    if(note2 >= 0 && note2 <= 100)  this.c2.note = note2;
    if(note3 >= 0 && note3 <= 100)  this.c3.note = note3;

    if(note1Sozlu >= 0 && note1Sozlu <= 100) this.c1.sozluNote = note1Sozlu;
    if(note2Sozlu >= 0 && note2Sozlu <= 100) this.c2.sozluNote = note2Sozlu;
    if(note3Sozlu >= 0 && note3Sozlu <= 100) this.c3.sozluNote = note3Sozlu;
  }

  void isPassing(){
    System.out.println("---------------------------------------------");
    this.average = ((this.c1.sozluNote * 0.20 + this.c1.note * 0.80) + 
                    (this.c2.sozluNote * 0.20 + this.c2.note * 0.80) + 
                    (this.c3.sozluNote * 0.20 + this.c3.note * 0.80)) / 3.0;

    if(this.average > 55){
      System.out.println("Sinifi gectiniz.");
      this.isPassing = true;
      printNote();
    }else{
      System.out.println("Sinifta kaldiniz.");
      this.isPassing = false;   
      printNote();
    }
  }

  void printNote(){
    System.out.println(c1.name + " Notu : " + this.c1.note);
    System.out.println(c2.name + " Notu : " + this.c2.note);
    System.out.println(c3.name + " Notu : " + this.c3.note);

    System.out.println(c1.name + " Sozlu Notu : " + this.c1.sozluNote);
    System.out.println(c2.name + " Sozlu Notu : " + this.c2.sozluNote);
    System.out.println(c3.name + " Sozlu Notu : " + this.c3.sozluNote);

    System.out.println("Ortalamaniz : " + this.average);
  }
}