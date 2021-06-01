import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MayinTarlasi{
  private String[][] tarla;
  private int mayinSayisi;
  private Scanner scanner;
  private Random random;

  public MayinTarlasi(int row, int column){
    this.scanner = new Scanner(System.in);
    this.random = new Random();

    initializeTarla(row, column);

    // Mayinlarin konumunu ekrana yazdir.
    System.out.println("Mayinlarin Konumu : ");
    mayinTarlasiniEkranaYazdir(true);
    System.out.println("==================================");
  }

  public void run(){
    System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz !");
    while(!oyunBittimi()){
      int[] satirSutun = getInput();
      chechkCoordinate(satirSutun[0], satirSutun[1]);
      mayinTarlasiniEkranaYazdir(false);
    }

    if(oyunuKazandimi()){
      System.out.println("Tebrikler, oyunu kazandiniz.");
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

  private void initializeTarla(int row, int column){
    this.tarla = new String[row][column];
    for(String[] r : this.tarla){
      Arrays.fill(r, "-");
    }
    this.mayinSayisi = row * column / 4;
    int[][] mayinSpots = pickRandomMayinSpot();

    for(int[] t: mayinSpots){
      this.tarla[t[0]][t[1]] = "*";
    }
  }

  private int[][] pickRandomMayinSpot(){
    String[] mayinKoordinatlari = new String[mayinSayisi];

    int count = 0;
    while(count < mayinKoordinatlari.length){
      String randomString = "";
      String random1 = String.valueOf(this.random.nextInt(this.mayinSayisi+1));
      String random2 = String.valueOf(this.random.nextInt(this.mayinSayisi+1));
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
    return false;
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

  private boolean oyunBittimi(){
    return false;
  }

  private boolean oyunuKazandimi(){
    return false;
  }
}