public class ArrayExample {
    public static void main(String[] args) {
        // Membuat sebuah array integer dengan 5 elemen
        int[] numbers = {1, 2, 3, 4, 5};

        // Menggunakan perulangan for untuk menampilkan nilai dalam array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nilai indeks ke-" + i + " adalah: " + numbers[i]);
        }
    }
}