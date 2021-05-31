import java.util.Scanner;

public class MayinTarlasi{
  private String[][] tarla;
  private int mayinSayisi;
  private Scanner scanner;

  // Burada ki metotları private yap

  public MayinTarlasi(int row, int column){
    this.scanner = new Scanner(System.in);

    this.tarla = new String[row][column];
    this.mayinSayisi = row * column / 4;

    initializeTarla();
    mayinTarlasiniEkranaYazdir(true);
  }

  public void run(){
    System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");
    while(!oyunBittimi()){
      mayinTarlasiniEkranaYazdir(false);
      int[] satirSutun = getInput();
      chechkCoordinate(satirSutun[0], satirSutun[1]);
    }

    if(oyunuKazandımı()){
      System.out.println("Tebrikler, oyunu kazandiniz.");
      mayinTarlasiniEkranaYazdir(true);
    }
  }

  public int[] getInput(){
    int[] satirSutun = new int[2];
    
    System.out.print("Satir Giriniz : ");
    satirSutun[0] = scanner.nextInt();
    System.out.print("Sutun giriniz : ");
    satirSutun[1] = scanner.nextInt();
    System.out.println("==================================");

    return satirSutun;
  }

  public void initializeTarla(){

  }

  public boolean chechkCoordinate(int satir, int sutun){
    return false;
  }

  public void mayinTarlasiniEkranaYazdir(boolean mayinlariGoster){

  }

  public boolean oyunBittimi(){
    return false;
  }

  public boolean oyunuKazandımı(){
    return false;
  }
}