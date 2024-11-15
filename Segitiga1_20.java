import java.util.Scanner;

public class Segitiga1_20{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int alas, tinggi;
        float luas;
        System.out.println("Masukkan alas segitiga : ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi segitga: ");
        tinggi = sc.nextInt();
        luas = alas*tinggi / 2;
        
        System.out.println("Luas area garasi pak dani adalah :" +luas);
    }

    
}
