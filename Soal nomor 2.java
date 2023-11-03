public class ContohProgram {
    public static void main(String[] args) {
        int angka = 1; // Inisialisasi variabel angka dengan nilai 1

        while (angka <= 5) { // Perulangan while akan berjalan selama angka kurang dari atau sama dengan 5
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah angka genap"); // Jika angka adalah genap, cetak pesan ini
            } else {
                System.out.println(angka + " adalah angka ganjil"); // Jika angka adalah ganjil, cetak pesan ini
            }
            angka++; // Tambahkan 1 ke variabel angka setiap kali perulangan berjalan
        }
    }
}