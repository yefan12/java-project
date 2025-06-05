import java.util.ArrayList;
import java.util.Scanner;


public class Java {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner scanner = new Scanner(System.in);
        
        // ArrayList untuk menyimpan barang
        ArrayList<String> items = new ArrayList<>();
        
        // Menampilkan menu utama
        System.out.println("SELAMAT DATANG DI TOKO KITA");
        System.out.println("Silahkan pilih menu yang tersedia:");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Tampilkan Barang");
        System.out.println("4. Keluar");
        
        // Looping untuk menjalankan program sampai pengguna memilih keluar
        boolean running = true;
        while (running) {
            System.out.print("Masukkan pilihan Anda (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character
            
            switch (choice) {
                case 1:
                    // Tambah Barang
                    System.out.print("Masukkan nama barang yang ingin ditambahkan: ");
                    String itemToAdd = scanner.nextLine();
                    items.add(itemToAdd);
                    System.out.println(itemToAdd + " telah ditambahkan.");
                    break;
                case 2:
                    // Hapus Barang
                    System.out.print("Masukkan nama barang yang ingin dihapus: ");
                    String itemToRemove = scanner.nextLine();
                    if (items.remove(itemToRemove)) {
                        System.out.println(itemToRemove + " telah dihapus.");
                    } else {
                        System.out.println(itemToRemove + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    // Tampilkan Barang
                    if (items.isEmpty()) {
                        System.out.println("Tidak ada barang yang tersedia.");
                    } else {
                        System.out.println("Daftar Barang:");
                        for (String item : items) {
                            System.out.println("- " + item);
                        }
                    }
                    break;
                case 4:
                    // Keluar
                    running = false;
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
        
                // Menutup Scanner
                scanner.close();
            }
        }