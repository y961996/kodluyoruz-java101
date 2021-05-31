public class MayinTarlasi{
  public String[][] tarla;
  public int mayinSayisi;

  public MayinTarlasi(int row, int column){
    this.tarla = new String[row][column];
    this.mayinSayisi = row * column / 4;
  }

  public void run(){
    System.out.println("TEST");
  }

  public void initializeTarla(){}

  public void mayinTarlasiniEkranaYazdir(){}

  public boolean oyunBittimi(){return false;}
}