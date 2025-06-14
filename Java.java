import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        try (Scanner scanner = new Scanner(System.in)) {
            // Menampilkan menu utama
            System.out.println("SELAMAT DATANG DI TOKO KITA");
            System.out.println("Silahkan pilih menu yang tersedia:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hapus Barang");
            System.out.println("3. Tampilkan Barang");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline character
            if (choice == 4); {
                System.out.println("Terima kasih telah berkunjung!");
                scanner.close();
        }
        }
    }
}
