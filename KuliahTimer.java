import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KuliahTimer {
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String waktuSekarang = now.format(formatter);

        System.out.println("================Program Jam Kuliah================");
        System.out.println("Waktu sekarang adalah: " + waktuSekarang);

        // Mendapatkan input user untuk waktu kuliah
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam kuliah: ");
        int jamKuliah = input.nextInt();

        System.out.print("Masukkan menit kuliah: ");
        int menitKuliah = input.nextInt();

        System.out.print("Masukkan detik kuliah: ");
        int detikKuliah = input.nextInt();

        // Membuat objek LocalDateTime untuk waktu mulai kuliah (asumsi hari ini)
        LocalDateTime waktuMulaiKuliah = LocalDateTime.of(now.getYear(), now.getMonthValue(), now.getDayOfMonth(), jamKuliah, menitKuliah, detikKuliah);

        // Memeriksa apakah waktu kuliah sudah berlalu
        if (waktuMulaiKuliah.isBefore(now)) {
            System.out.println("Kuliah Anda sudah dimulai sebelumnya.");
        } else {
            // Hitung sisa waktu sebelum kuliah dimulai
            long sisaWaktu = waktuMulaiKuliah between(now, waktuMulaiKuliah).toMillis();
            long jamSisa = sisaWaktu / 3600000;
            long menitSisa = (sisaWaktu % 3600000) / 60000;
            long detikSisa = (sisaWaktu % 60000) / 1000;

            System.out.println("Kuliah Anda dimulai pukul: " + waktuMulaiKuliah.format(formatter));
            System.out.println("Jadi sisa waktu menuju perkuliahan Anda adalah: " + jamSisa + " jam " + menitSisa + " menit " + detikSisa + " detik");
        }
    }
}