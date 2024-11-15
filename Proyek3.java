import java.util.Scanner;

public class Proyek3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldoAwal = 1000000;

        System.out.println("Saldo Anda Sebesar : "+ saldoAwal);
       
       System.out.println("Masukkan jumlah Penarikan : ");
       double jumlahPenarikan = sc.nextDouble();

        if (jumlahPenarikan <= saldoAwal){
            saldoAwal -= jumlahPenarikan;
            System.out.println("Transaksi anda telah berhasil, sekarang saldo anda sebesar: " + saldoAwal);
        } else {
            System.out.println(" saldo tidak mencukupi untuk melakukan penarikan, mohon coba cek kembali.");}
    }

}    

