import java.util.Scanner;


public class Java {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Login Username: ");
        String username = myObj.nextLine();
        System.out.println("Login Password: ");
        String password = myObj.nextLine();
        if (username.equals("admin") && password.equals("admin")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Please try again.");
        }

        // Additional functionality can be added here
        System.out.println("SELAMAT DATANG DI TOKO KITA");
        System.out.println("Silahkan pilih menu yang tersedia:");
        System.out.println("1. Tambah Barang");
        System.out.println("2. Hapus Barang");
        System.out.println("3. Tampilkan Barang");
        System.out.println("4. Keluar");
        
        System.out.println("Masukkan pilihan Anda (1-4): ");
        int choice = myObj.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Anda memilih untuk menambah barang.");
            case 2 -> System.out.println("Anda memilih untuk menghapus barang.");
            case 3 -> System.out.println("Anda memilih untuk menampilkan barang.");
            case 4 -> System.out.println("Terima kasih telah menggunakan aplikasi kami. Sampai jumpa!");
            
        }
            if (choice < 1 || choice > 4) {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        myObj.close();
    }
}