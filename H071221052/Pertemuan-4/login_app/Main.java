package login_app;

import java.util.ArrayList; //megimpor kelas array
import java.util.Scanner; //mengimpor kelas array
import login_app.models.Profile; //mengimpor kelas profile
import login_app.models.User; //mengimpor kelas user
import login_app.utils.StringUtils; //mengimpor kelas Stringutils

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>(); // variabel listuser sebagai array list dari kelas user
                                                                 // dan dapat diaksaes dari seluruh kelas
    private static ArrayList<Profile> listUserProfile = new ArrayList<>(); // ini dia profile dan menyimpan data profil
                                                                           // pengguna
    private static Scanner sc = new Scanner(System.in); // membaca inputan dari pengguna

    public static void main(String[] args) { // method publik yang akan dijalanakan saat program dijalankan
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");
        // Menginput pilihan menu
        int selectMenu = sc.nextInt();// membaca masukan angka yang diinput pengguna dan menyimpan dalam variabel ini
        sc.nextLine(); // membaca baris baru
        switch (selectMenu) { // kontrol switch case untuk memproses pilihan menu yang dimasukkan. selectmenu
                              // itu variabel yang menyimpan pilihan menu
            case 1:
                // Membuka Halaman Login. memanggil show login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next(); // mengambil input dari pengguna berupa username yg sdh dimasukkan sblmnya di
                                     // halaman login
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) { // awal dari sebuah perulangan for yang akan berjalan sebanyak
                                                    // jumlah elemen yang terdapat pada listUser. Variabel i
                                                    // diinisialisasi dengan nilai 0 dan akan terus bertambah sebanyak
                                                    // satu pada setiap iterasinya hingga mencapai ukuran dari listUser.
            if (listUser.get(i).getUsername().equals(username)) { // pengecekan dilakukan pada setiap elemen di dalam
                                                                  // listUser dengan memanggil method getUsername() pada
                                                                  // objek User yang ada di indeks ke-i. Kemudian
                                                                  // dilakukan pembandingan nilai dari method tersebut
                                                                  // dengan nilai variabel username yang berisi input
                                                                  // username yang dimasukkan oleh pengguna.
                userIndex = i; // menetapkan nilai dari variabel i (yaitu indeks dari objek User yang cocok
                               // dengan input username) ke dalam variabel userIndex. Nilai ini akan digunakan
                               // pada saat proses login berhasil untuk menunjukkan indeks dari user yang
                               // login.
                break; // stelah benar, maka tidak perlu mngecek lagi pada indeks selankjutnya
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * TODO
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = false; // nilai awal false, dan ini untu mengecek apakah password cocok dgn pass
                                             // tersimpan
            if (listUser.get(userIndex).getPassword().equals(password)) { // pengecekan apakah password yang dimasukkan
                                                                          // oleh pengguna sesuai dengan password yang
                                                                          // tersimpan di dalam listUser. Nilai dari
                                                                          // password yang tersimpan diambil dari objek
                                                                          // User pada indeks yang sudah ditentukan
                                                                          // sebelumnya melalui variabel userIndex.
                                                                          // Pengecekan dilakukan dengan membandingkan
                                                                          // nilai dari method getPassword() pada objek
                                                                          // User dengan nilai dari variabel password.
                isPasswordMatch = true; // Baris ini mengubah nilai variabel isPasswordMatch menjadi true jika password
                                        // yang dimasukkan oleh pengguna sesuai dengan password yang tersimpan di dalam
                                        // listUser
            }

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) { // Baris ini melakukan pengecekan apakah nilai dari variabel isPasswordMatch
                                   // adalah true. Jika benar, maka proses login berhasil, sedangkan jika salah,
                                   // proses login gagal.
                System.out.println("Berhasil Login");
                /*
                 * TODO
                 * panggil method showDetailUser dan kirimkan data Profile User yang login
                 */
                showDetailUser(listUserProfile.get(userIndex)); // Baris ini memanggil method showDetailUser() dengan
                                                                // mengirimkan data profile dari user yang berhasil
                                                                // login. Data profile ini diambil dari objek Profile
                                                                // pada indeks yang sudah ditentukan sebelumnya melalui
                                                                // variabel userIndex.
                System.exit(0); // Baris ini menghentikan program. Kode 0 pada parameter method exit()
                                // menandakan bahwa program berhenti tanpa ada kesalahan atau error.
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        // Menginput username dan password

        String username, password;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            while (true) {
                System.out.println("Password");
                System.out.print("> ");
                password = sc.nextLine();
                if (password.length() >= 8) {
                    break;
                }
                System.out.println("Password harus lebih besar dari 8 digit!");
            }

            boolean isUsernameExist = false; // variabel dengan tipe data booelan dengan nilai false
            if (!password.isBlank() && !username.isBlank() && password.length() >= 8) { // Melakukan pengecekan apakah
                                                                                        // variabel password dan
                                                                                        // username tidak kosong (empty)
                                                                                        // dan apakah panjang password
                                                                                        // >= 8 karakter.
                if (listUser.isEmpty()) { // kondisi pada baris 2 terpenuhi, maka akan dilakukan pengecekan apakah
                                          // listUser kosong menggunakan listUser.isEmpty()
                    break; // jika terpenuhi maka loop dihentikan
                }
                for (User user : listUser) { // Pada baris pertama, digunakan perulangan for-each yang akan mengiterasi
                                             // setiap objek User yang ada di ArrayList listUser.

                    if (user.getUsername().equals(username)) { // pengecekan apakah username dari objek User saat ini
                                                               // sama dengan username yang diinputkan oleh user pada
                                                               // saat register
                        isUsernameExist = true; // jika username yang diinputkan oleh user sudah ada yang terdaftar,
                                                // maka isUsernameExist akan diubah menjadi true dan perulangan for-each
                                                // akan dihentikan dengan menggunakan break.
                        break;
                    }
                }
                if (!isUsernameExist) { // Memeriksa apakah isUsernameExist bernilai false, jika ya maka akan keluar
                                        // dari perulangan while.
                    break;
                }
                System.out.println("Username telah digunakan!");
            } else {
                System.out.printf(
                        "Username atau password tidak boleh kosong dan password tidak boleh kurang dari 8 karakter%n");
            }
        }

        User user = new User(username, password);// eklarasi variabel user dengan tipe data User dan memberikan nilai
                                                 // username dan password yang diinput sebelumnya pada saat registrasi.

        Profile profile = new Profile();// ariabel profile dengan tipe data Profile

        // Menginput Data Profile
        int age = 0;
        String fullName, hobby;
        boolean x = false;
        while (true) { // melakukan perulangan selama kondisi terpenuhi
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine(); // mengambil input dari pengguna melalui keyboard dan menyimpannya di variabel
                                      // fullName

            while (true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Umur");
                    System.out.print("> ");
                    age = sc.nextInt();

                    break;
                } catch (Exception e) {
                    System.out.println("Umur harus berupa angka!");
                }
                // sc.nextLine();

            }

            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (!hobby.isBlank() && !fullName.isBlank()) { // mengecek apakah input yang dimasukkan pengguna tidak
                                                           // kosong (dengan menggunakan method isBlank()) dan x
                                                           // bernilai true. Jika ya, maka perulangan while akan
                                                           // diakhiri.
                break;
            }
            System.out.println("Nama atau Hobby tidak boleh kosong!");
        }

        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setNama(fullName); // Mengatur nilai dari atribut nama pada objek profile dengan nilai dari
                                   // variabel fullName.
        profile.setHobi(hobby); //
        profile.setUmur(age);

        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        profile.setNickname(StringUtils.nickName(profile.getNama()));
        // profile.setNickname(: Memanggil method setNickname() pada objek profile untuk
        // mengisi nickname pengguna.
        // StringUtils.nickName(: Memanggil method nickName() dari kelas StringUtils.
        // Method ini akan menghasilkan nickname berdasarkan nama lengkap yang
        // diberikan.
        // profile.getNama() : Memanggil method getNama() pada objek profile untuk
        // mendapatkan nama lengkap pengguna yang diinputkan pada saat registrasi.

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
        System.out.printf("Nama : %s%n", profile.getNama());
        System.out.printf("Nickname : %s%n", profile.getNickname());
        System.out.printf("Hobby : %s%n", profile.getHobi());
        System.out.printf("Umur : %d%n", profile.getUmur());

    }
}