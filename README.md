Penjelasan soal nomor 1
1. `public class Main`: Ini adalah deklarasi kelas utama dengan nama "Main". Nama kelas harus sama dengan nama file Java yang Anda buat.

2. `public static void main(String[] args)`: Ini adalah deklarasi metode utama yang akan dieksekusi saat program dimulai. Metode `main` adalah pintu masuk untuk program Java.

3. `for (int i = 1; i <= 100; i++)`: Ini adalah pernyataan perulangan `for`. Di dalam kurung, ada tiga bagian:
   - `int i = 1`: Ini adalah inisialisasi variabel `i` dengan nilai 1.
   - `i <= 100`: Ini adalah kondisi yang menentukan kapan perulangan akan berhenti. Perulangan akan terus berjalan selama nilai `i` kurang dari atau sama dengan 100.
   - `i++`: Ini adalah pernyataan peningkatan yang akan menambahkan 1 ke nilai `i` setiap kali perulangan diulang.

4. String (String name = "Pebi Heriansyah";
String NPM = "G1A023003";) ini digunakan untuk menyimpan teks, mengubah teks, atau memproses teks dalam loop. 

5. System.out.println(System.out.println("Nama : " + name);
System.out.println("NPM : " + NPM);)`: Ini adalah pernyataan untuk mencetak teks " Nama : + name dan NPM : + NPM " ke layar.

Penjelasan soal nomor 2
1. `public class ContohProgram`: Ini adalah deklarasi kelas Java dengan nama "ContohProgram".

2. `public static void main(String[] args)`: Ini adalah metode utama yang akan dieksekusi saat program dimulai. Parameter `String[] args` adalah argumen baris perintah yang bisa digunakan dalam program.

3. `int angka = 1;`: Inisialisasi variabel `angka` dengan nilai awal 1.

4. `while (angka <= 5)`: Perulangan `while` akan terus berjalan selama kondisi `angka <= 5` benar. Dalam hal ini, itu akan berjalan selama angka kurang dari atau sama dengan 5.

5. `if (angka % 2 == 0)`: Ini adalah kondisi `if`. Ini memeriksa apakah `angka` adalah bilangan genap dengan memeriksa sisa hasil bagi (`%`) dengan 2.

6. `System.out.println(...)`: Ini digunakan untuk mencetak pesan ke konsol.

7. `angka++`: Ini adalah operator peningkatan yang menambahkan 1 ke variabel `angka` setiap kali perulangan berjalan.

Penjelasan soal nomor 3
1. `import java.util.Scanner;`: Mengimpor kelas Scanner untuk mengambil input pengguna.

2. `Scanner scanner = new Scanner(System.in);`: Membuat objek Scanner untuk menerima input dari pengguna.

3. `String input = scanner.nextLine();`: Membaca input tanggal lahir dari pengguna.

4. `String[] parts = input.split("/");`: Memisahkan input menjadi tanggal dan bulan.

5. Fungsi `determineZodiac(int day, int month)`: Ini adalah fungsi yang menentukan zodiak berdasarkan tanggal dan bulan yang dimasukkan.
6. `scanner.close();`: Menutup objek Scanner untuk menghindari kebocoran sumber daya.

Penjelasan soal nomor 4
1. `int[] numbers = {1, 2, 3, 4, 5};` - Ini adalah deklarasi dan inisialisasi array `numbers` yang berisi 5 elemen bertipe integer.

2. `for (int i = 0; i < numbers.length; i++) {` - Ini adalah perulangan `for` yang digunakan untuk mengiterasi melalui semua elemen dalam array. Dimulai dari indeks 0 hingga indeks kurang dari panjang array `numbers`.

3. `System.out.println("Nilai indeks ke-" + i + " adalah: " + numbers[i]);` - Ini adalah bagian di dalam perulangan `for` yang mencetak nilai dari array pada indeks `i` bersama dengan pesan yang menjelaskan indeks tersebut.
