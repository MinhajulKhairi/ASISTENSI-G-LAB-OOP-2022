package Nomor2;

public class Main {
    public static void main(String[] args) { //Tiga baris ini mendeklarasikan tiga objek Product yang berbeda dengan menggunakan generic class. 
        Product<Integer> p1 = new Product<>("Kinder Joy", 10000, "2023-05-01");
        Product<String> p2 = new Product<>("Sari Roti", "Rp 15.000", "2023-05-20");
        Product<Double> p3 = new Product<>("Susu Kurma", 7.5 , "2023-06-01");
        //Generic class adalah kelas dalam bahasa pemrograman Java yang dirancang untuk bekerja dengan beberapa jenis tipe data secara umum dan fleksibel. 
        //Generic class menggunakan parameter tipe data (type parameter) untuk mendefinisikan tipe data yang akan digunakan pada kelas tersebut. 
        //Parameter tipe data ini dapat digunakan dalam deklarasi atribut, metode, atau konstruktor kelas. 
        //Dengan menggunakan generic class, kita dapat menulis kode yang lebih efisien dan reusable, karena satu kelas dapat menangani berbagai jenis tipe data tanpa perlu membuat kelas baru untuk setiap tipe data yang berbeda.

        System.out.printf("Product 1: %s - %s - %s",p1.getProduk(),p1.getHarga(),p1.getTanggalKadaluarsa());
        System.out.printf("\nProduct 2: %s - %s - %s",p2.getProduk(),p2.getHarga(),p2.getTanggalKadaluarsa());
        System.out.printf("\nProduct 3: %s - %s - %s",p3.getProduk(),p3.getHarga(),p3.getTanggalKadaluarsa());
        //Tiga baris ini mencetak nilai dari masing-masing objek Product dengan menggunakan metode printf. 
        //Output akan menampilkan tiga baris yang berisi nilai produk, harga, dan tanggal kadaluarsa dari objek p1, p2, dan p3. 
        //tipe data masing-masing objek adalah berbeda, sehingga nilai harga dan tanggal kadaluarsa akan ditampilkan dengan format yang berbeda.
    }

}
