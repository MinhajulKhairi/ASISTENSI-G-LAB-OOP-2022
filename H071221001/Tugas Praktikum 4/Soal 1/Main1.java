
import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

    static ArrayList<User> listUser = new ArrayList<User>();
    static ArrayList<Profile> listUserProfile = new ArrayList<Profile>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-".repeat(40));
        System.out.println("Selamat Datang di Aplikasi Login");
        System.out.println("-".repeat(40));
        System.out.println("1. Login");
        System.out.println("2. Buat Akun");
        System.out.println("3. Keluar");
        System.out.println("-".repeat(40));
        System.out.print("> ");
        String input = sc.nextLine();
        switch (input) {
            case "1":
                login();
                break;
            case "2":
                createNewUser();
                break;
            case "3":
                System.out.println("-".repeat(45));
                System.out.println("Terima kasih telah berkunjung!");
                System.out.println("-".repeat(45) + "\n");
                System.exit(0);
                break;
            default:
                System.out.println("Input tidak valid!");
                runApp();
                break;
        }
    }

    private static void login() {
        System.out.println("-".repeat(40));
        System.out.println("Silakan Login");
        System.out.println("-".repeat(40));
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        User user = findUserByUsername(username);
        if (user == null) {
            System.out.println("Username tidak ditemukan!");
            login();
        } else {


            boolean isPasswordMatch = user.getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("-".repeat(40));
                System.out.println("Berhasil Login");

                showDetailUser(findProfileByUsername(username));
                runApp();
            } else {
                System.out.println("-".repeat(40));
                System.out.println("Password salah!");
                System.out.println("-".repeat(40));
                login();
            }
        }
    }

    private static User findUserByUsername(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    private static Profile findProfileByUsername(String username) {
        for (Profile profile : listUserProfile) {
            if (profile.getUser().getUserName().equals(username)) {
                return profile;
            }
        }
        return null;
    }

    private static void createNewUser() {
        System.out.println("-".repeat(40));
        System.out.println("Silakan Isi Data Akun Baru :");
        System.out.println("-".repeat(40));
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        int age = validateIntegerInput();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        String username = "";
        String password = "";
        while (true) {
            try {
                System.out.println("Username");
                System.out.print("> ");
                username = sc.nextLine();
                if (isUsernameExist(username)) {
                    System.out.println("Username sudah digunakan!");
                    username = "";
                    continue;
                }
                break;

            }
            catch (Exception e) {
                System.out.println("Username tidak boleh kosong!");
                continue;
            }
        }
        while (true) {
            try {
                System.out.println("Password");
                System.out.print("> ");
                password = sc.nextLine();
                if (password.length() < 8) {
                    System.out.println("Password harus lebih dari 8 karakter!");
                    continue;
                }
                break;

            }
            catch (Exception e) {
                System.out.println("Password tidak boleh kosong!");
                continue;
            }
        }

        User user = new User();
        user.setUserName(username);
        user.setPassword(password);

        Profile profile = new Profile(fullName, age, hobby);
        profile.setUser(user);
        listUserProfile.add(profile);
        listUser.add(user);
        System.out.println("-".repeat(40));
        System.out.println("Akun Berhasil Dibuat!");
        System.out.println("-".repeat(40));


        showDetailUser(profile);
        runApp();
        
    }
  
    private static boolean isUsernameExist(String username) {
        for (User user : listUser) {
            if (user.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("-".repeat(40));
        System.out.println(" ".repeat(12) +"~ Detail User ~");
        System.out.println();
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Nama Panggilan\t: " + profile.getNickName());
        System.out.println("Usia\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("Username\t: " + profile.getUser().getUserName());
        System.out.println("-".repeat(40));
    }

    private static int validateIntegerInput() {
        int result;
        while (true) {
            try {
                System.out.println("Umur");
                System.out.print("> ");
                result = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Input harus berupa angka!");
                System.out.print("> ");
                continue;
            }
        }
        return result;
    }
}