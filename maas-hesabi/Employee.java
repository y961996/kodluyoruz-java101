public class Employee{
  String name;
  double salary;
  int workHours;
  int hireYear;

  public Employee(String name, double salary, int workHours, int hireYear){
    this.name = name;
    this.salary = salary;
    this.workHours = workHours;
    this.hireYear = hireYear;
  }

  public double tax(){
    if(this.salary < 1000.0){
      return 0;
    }
    return this.salary * 3 / 100.0;
  }

  public double bonus(){
    int normalWorkHours = 40;
    if(normalWorkHours > this.workHours) return 0.0;
    return (this.workHours - normalWorkHours) * 30.0;
  }

  public double raiseSalary(){
    int currentYear = 2021;
    if(currentYear - hireYear < 10){
      return this.salary * 5 / 100.0;
    }else if(currentYear - hireYear > 9 && currentYear - hireYear < 20){
      return this.salary * 10 / 100.0;
    }else if(currentYear - hireYear > 19){
      return this.salary * 15 / 100.0;
    }else{
      System.out.println("Invalid information!");
      return 0.0;
    }
  }

  public String toString(){
    double taxPayed = tax();
    double bonusEarned = bonus();
    double raiseAmount = raiseSalary();

    String ret = "";

    ret += "Adi : " + this.name + "\n";
    ret += "Maasi : " + this.salary  + "\n";
    ret += "Calisma Saati : " + this.workHours + "\n";
    ret += "Baslangic Yili : " + this.hireYear + "\n";
    ret += "Vergi : " + taxPayed + "\n";
    ret += "Bonus : " + bonusEarned + "\n";
    ret += "Maas Artisi : " + raiseAmount + "\n";
    ret += "Vergi ve bonuslar ile birlikte maas : " + (this.salary - taxPayed + bonusEarned) + "\n";
    ret += "Toplam Maas : " + (this.salary + raiseAmount) + "\n";

    return ret;
  }
}