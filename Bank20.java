import java.util.Scanner;
/**
 * Bank20
 */
public class Bank20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jml_tabungan_awal, lama_menabung;
        Double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;
        
        System.out.println("Masukkan jumlah tabungan awal");
        jml_tabungan_awal = sc.nextInt();
        System.out.println("Masukkan berapa lama anda menabung");
        lama_menabung= sc.nextInt();
        bunga = lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        System.out.println("Bunga adalah" +bunga);
        System.out.println("Jumlah tabungan akhir anda adalah" +jml_tabungan_akhir);
    }
}