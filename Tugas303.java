import java.util.Scanner;

public class Tugas303 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);
        int totalSemuaBarang = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak= 0;

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan Toko " + toko + ": ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);
            int totalBarangToko = 0;
            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                int jumlahBarang;
                do {
                    System.out.print("  Jumlah barang pelanggan " + pelanggan + ": ");
                    jumlahBarang = sc.nextInt();
                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);
                totalBarangToko += jumlahBarang;
            }
            totalSemuaBarang += totalBarangToko;
            System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalSemuaBarang);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
