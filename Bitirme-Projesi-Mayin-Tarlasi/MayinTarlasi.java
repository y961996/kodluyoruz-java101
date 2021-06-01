import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MayinTarlasi{
  private String[][] tarla;
  private int mayinSayisi;
  private int row;
  private int column;
  private boolean gameOver;
  private Scanner scanner;
  private Random random;

  public MayinTarlasi(int row, int column){
    this.scanner = new Scanner(System.in);
    this.random = new Random();

    this.row = row;
    this.column = column;
    this.gameOver = false;

    initializeTarla();

    // Mayinlarin konumunu ekrana yazdir.
    System.out.println("Mayinlarin Konumu : ");
    mayinTarlasiniEkranaYazdir(true);
    System.out.println("==================================");
  }

  public void run(){
    System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");
    while(!gameOver){
      int[] satirSutun = getInput();
      
      if(satirSutun[0] < 0 || satirSutun[0] >= this.row || satirSutun[1] < 0 || satirSutun[1] >= this.column){
        System.out.println("Yanlis koordinat !");
        continue;
      }
      
      if(!chechkCoordinate(satirSutun[0], satirSutun[1])) handleOpenCell(satirSutun[0], satirSutun[1]);
      else gameOver = true;

      mayinTarlasiniEkranaYazdir(false);
    }

    if(oyunuKazandimi()){
      System.out.println("Tebrikler, oyunu kazandiniz.");
      mayinTarlasiniEkranaYazdir(true);
    }else{
      System.out.println("Game OVER :(");
      mayinTarlasiniEkranaYazdir(true);
    }
  }

  private int[] getInput(){
    int[] satirSutun = new int[2];
    
    System.out.print("Satir Giriniz : ");
    satirSutun[0] = scanner.nextInt();
    System.out.print("Sutun giriniz : ");
    satirSutun[1] = scanner.nextInt();
    System.out.println("==================================");

    return satirSutun;
  }

  private void handleOpenCell(int satir, int sutun){
    if(this.tarla[satir][sutun].equals("*")){
      System.out.println("Bir hata olustu lutfen oyun yapimcisina basvurun!");
      return;
    }

    if(!this.tarla[satir][sutun].equals("-")) return;

    int mayinCount = 0;
    
    int realSatirStart = satir - 1 < 0 ? 0 : satir - 1;
    int realSutunStart = sutun - 1 < 0 ? 0 : sutun - 1;
    int realSatirEnd = satir + 1 >= this.row ? satir : satir + 1;
    int realSutunEnd = sutun + 1 >= this.column ? sutun : sutun + 1;

    for(int i = realSatirStart; i <= realSatirEnd; i++){
      for(int j = realSutunStart; j <= realSutunEnd; j++){
        if(this.tarla[i][j].equals("*")) mayinCount++;
      }
    }

    //System.out.println(mayinCount);
    this.tarla[satir][sutun] = mayinCount + "";
  }

  private void initializeTarla(){
    this.tarla = new String[this.row][this.column];
    for(String[] r : this.tarla){
      Arrays.fill(r, "-");
    }
    this.mayinSayisi = this.row * this.column / 4;
    int[][] mayinSpots = pickRandomMayinSpot();

    for(int[] t: mayinSpots){
      this.tarla[t[0]][t[1]] = "*";
    }
  }

  private int[][] pickRandomMayinSpot(){
    String[] mayinKoordinatlari = new String[this.mayinSayisi];

    int count = 0;
    while(count < mayinKoordinatlari.length){
      String randomString = "";
      String random1 = String.valueOf(this.random.nextInt(this.row));
      String random2 = String.valueOf(this.random.nextInt(this.column));
      randomString += random1 + " " + random2;
      
      boolean containsRandom = Arrays.stream(mayinKoordinatlari).anyMatch(randomString::equals);
      if(containsRandom){
        continue;
      }else{
        mayinKoordinatlari[count++] = randomString;
      }
    }

    //System.out.println(Arrays.toString(mayinKoordinatlari));

    // Koordinatlari stringden int e çevir;
    int[][] randomKoordinatlar = new int[this.mayinSayisi][2];
    for(int i = 0; i < this.mayinSayisi; i++){
      String[] currentKoord = mayinKoordinatlari[i].split(" ");
      for(int j = 0; j < 2; j++){
        randomKoordinatlar[i][j] = Integer.parseInt(currentKoord[j]);
      }
    }

    //System.out.println(Arrays.deepToString(randomKoordinatlar));

    return randomKoordinatlar;
  }

  private boolean chechkCoordinate(int satir, int sutun){
    if(!this.tarla[satir][sutun].equals("*")) return false;
    return true;
  }

  private void mayinTarlasiniEkranaYazdir(boolean mayinlariGoster){
    for(int i = 0; i < this.tarla.length; i++){
      for(int j = 0; j < this.tarla[i].length; j++){
        if(!mayinlariGoster){
          if(tarla[i][j].equals("*")){
            System.out.print("-" + "  ");
          }else{
            System.out.print(tarla[i][j] + "  ");
          }
        }else{
          System.out.print(tarla[i][j] + "  ");
        }
      }
      System.out.println();
    }
  }

  private boolean oyunuKazandimi(){
    for(int i = 0; i < this.tarla.length; i++){
      for(int j = 0; j < this.tarla[i].length; j++){
        if(this.tarla[i][j].equals("-")) return false;
      }
    }
    return true;
  }
}