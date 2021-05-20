public class Musabaka{
  Boksor b1;
  Boksor b2;
  int minWeight, maxWeight;

  public Musabaka(Boksor b1, Boksor b2, int minWeight, int maxWeight) {
    this.b1 = b1;
    this.b2 = b2;
    this.minWeight = minWeight;
    this.maxWeight = maxWeight;
  }

  public void run(){
    if(isChecked()){
      int round = 1;

      double randomSelect = Math.random() * 2;
      if(randomSelect < 1) System.out.println(this.b1.name + " maca basliyor.");
      else System.out.println(this.b2.name + " maca basliyor.");

      System.out.println("========================================================");

      while(this.b1.health > 0 && this.b2.health > 0){
        System.out.println(round + ". round.");
        System.out.println("-------------------------------------------------");
        
        if(randomSelect < 1){   // Boksor 1 basliyor.
          this.b2.health = this.b1.hit(this.b2);
          if(isWon()) break;
          this.b1.health = this.b2.hit(this.b1);
          if(isWon()) break;
        }else{      // Boksor 2 basliyor.
          this.b1.health = this.b2.hit(this.b1);
          if(isWon()) break;
          this.b2.health = this.b1.hit(this.b2);
          if(isWon()) break;
        }

        System.out.println(this.b1.name + " Saglik : " + this.b1.health);
        System.out.println(this.b2.name + " Saglik : " + this.b2.health + "\n");

        round++;
      }
    }else{
      System.out.println("Sporcularin sikletleri ayni degil !");
    }
  }

  public boolean isChecked(){
    return (this.b1.weight >= this.minWeight && this.b1.weight <= this.maxWeight) && 
           (this.b2.weight >= this.minWeight && this.b2.weight <= this.maxWeight);
  }

  public boolean isWon(){
    if(this.b1.health == 0){
      System.out.println(this.b2.name + " kazandi.");
      return true;
    }

    if(this.b2.health == 0){
      System.out.println(this.b1.name + " kazandi.");
      return true;
    }

    return false;
  }
}