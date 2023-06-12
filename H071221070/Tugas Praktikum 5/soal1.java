import java.util.Scanner;


class bangunRuang {
    public double luasPermukaan;
    public double volume;

    public bangunRuang(double luasPermukaan, double volume) {
        this.luasPermukaan = luasPermukaan;
        this.volume = volume;
    }
    
    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

}

class Kubus extends bangunRuang{
    private double sisi;

    public Kubus(double luasPermukaan, double volume, double sisi) {
        super(luasPermukaan, volume);
        this.sisi = sisi;
    }
    
    public void hasilKubus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi Kubus: ");
        this.sisi = input.nextDouble();
        input.nextLine();

        this.luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas Permukaan Kubus = " + getLuasPermukaan());
        this.volume = sisi * sisi * sisi;
        System.out.println("Volume Kubus = " + getVolume());
    }
}

class Balok extends bangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double luasPermukaan, double volume, double panjang, double lebar, double tinggi) {
        super(luasPermukaan, volume);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void hasilBalok() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Balok: ");
        this.panjang = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Lebar Balok: ");
        this.lebar = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Tinggi Balok: ");
        this.tinggi = input.nextDouble();
        input.nextLine();

        this.luasPermukaan = 2 * (this.panjang * this.lebar + this.panjang * this.tinggi + this.lebar * this.tinggi);
        System.out.println("Luas Permukaan Balok = " + getLuasPermukaan());
        this.volume = this.panjang * this.lebar * this.tinggi;
        System.out.println("Volume Balok = " + getVolume());
    }
}

class Bola extends bangunRuang{
    private double jariJari;

    public Bola(double luasPermukaan, double volume, double jariJari) {
        super(luasPermukaan, volume);
        this.jariJari = jariJari;
    }

    public void hasilBola() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Bola: ");
        this.jariJari = input.nextDouble();
        input.nextLine();

        this.luasPermukaan = 4 * Math.PI * (this.jariJari * this.jariJari);
        System.out.println("Luas Permukaan Bola = " + getLuasPermukaan());
        this.volume = (4/3) * Math.PI * (this.jariJari * this.jariJari * this.jariJari);
        System.out.println("Volume Bola = " + getVolume());
    }
}

class Tabung extends bangunRuang {
    private double jariJari;
    private double tinggi;

    public Tabung(double luasPermukaan, double volume, double jariJari, double tinggi) {
        super(luasPermukaan, volume);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void hasilTabung() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Tabung: ");
        this.jariJari = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Tinggi Tabung: ");
        this.tinggi = input.nextDouble();
        input.nextLine();

        this.luasPermukaan = 2 * Math.PI * this.jariJari * (this.jariJari + this.tinggi);
        System.out.println("Luas Permukaan Tabung = " + getLuasPermukaan());
        this.volume = Math.PI * (this.jariJari * this.jariJari) * this.tinggi;
        System.out.println("Volume Tabung = " + getVolume());
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class bangunDatar {
    double luas;
    double keliling;

    public bangunDatar(double luas, double keliling) {
        this.luas = luas;
        this.keliling = keliling;
    }

    public double getLuas() {
        return luas;
    }
    public double getKeliling() {
        return keliling;
    }
}

class Persegi extends bangunDatar{
    private double sisi;

    public Persegi(double luas, double keliling, double sisi) {
        super(luas, keliling);
        this.sisi = sisi;
    }

    public void hasilPersegi() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Sisi Kubus: ");
        this.sisi = input.nextDouble();
        input.nextLine();

        this.luas = sisi * sisi;
        System.out.println("Luas Persegi = " + getLuas());
        this.keliling = 4 * sisi;
        System.out.println("Keliling Persegi Panjang = " + getKeliling());
    }
}

class PersegiPanjang extends bangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double luas, double keliling, double panjang, double lebar) {
        super(luas, keliling);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hasilPersegiPanjang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang Persegi Panjang: ");
        this.panjang = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Lebar Persegi Panjang: ");
        this.lebar = input.nextDouble();
        input.nextLine();

        this.luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + getLuas());
        this.keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Kubus = " + getKeliling());
    }
}

class Lingkaran extends bangunDatar{
    private double jariJari;

    public Lingkaran(double luas, double keliling, double jariJari) {
        super(luas, keliling);
        this.jariJari = jariJari;
    }

    public void hasilLingkaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        this.jariJari = input.nextDouble();
        input.nextLine();

        this.luas = Math.PI * (jariJari * jariJari);
        System.out.println("Luas Lingkaran = " + getLuas());
        this.keliling = 2 * Math.PI * jariJari;
        System.out.println("Keliling Lingkaran = " + getKeliling());
    }
}

class Segitiga extends bangunDatar{
    private double alas;
    private double tinggi;

    public Segitiga(double luas, double keliling, double alas, double tinggi) {
        super(luas, keliling);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void hasilSegitiga() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Alas Segitiga: ");
        this.alas = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan Tinggi Segitiga");
        this.tinggi = input.nextDouble();
        input.nextLine();

        this.luas = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga = " + getLuas());
        this.keliling = alas * alas * alas;
        System.out.println("Keliling Segitiga = " + getKeliling());
    }
}

class Trapesium extends bangunDatar{
    private double sisiAB;
    private double sisiBC;
    private double sisiCD;
    private double sisiDA;
    private double tinggi;

    public Trapesium(double luas, double keliling, double sisiAB, double sisiBC, double sisiCD, double sisiDA,
            double tinggi) {
        super(luas, keliling);
        this.sisiAB = sisiAB;
        this.sisiBC = sisiBC;
        this.sisiCD = sisiCD;
        this.sisiDA = sisiDA;
        this.tinggi = tinggi;
    }

    public void hasilTrapesium() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sisi AB Trapesium: ");
        this.sisiAB = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan Sisi BC Trapesium: ");
        this.sisiBC = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Sisi CD Trapesium: ");
        this.sisiCD = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan Sisi DA Trapesium: ");
        this.sisiDA = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Tinggi Trapesium: ");
        this.tinggi = input.nextDouble();
        input.nextLine();

        this.luas = 1/2 * (sisiAB + sisiCD) * tinggi;
        System.out.println("Luas Trapesium = " + getLuas());
        this.keliling = sisiAB + sisiBC + sisiCD + sisiDA;
        System.out.println("Keliling Trapesium = " + getKeliling());
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class soal1 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(0, 0, 0);
        Balok balok = new Balok(0, 0, 0, 0, 0);
        Bola bola = new Bola(0, 0, 0);
        Tabung tabung = new Tabung(0, 0, 0, 0);

        Persegi persegi = new Persegi(0, 0, 0);
        PersegiPanjang persegiPanjang = new PersegiPanjang(0, 0, 0, 0);
        Lingkaran lingkaran = new Lingkaran(0, 0, 0);
        Segitiga segitiga = new Segitiga(0, 0, 0, 0);
        Trapesium trapesium = new Trapesium(0, 0, 0, 0, 0, 0, 0);

        System.out.println("==== BANGUN RUANG ====\n1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG\n");
        System.out.println("==== BANGUN DATAR ====\n1. PERSEGI\n2. PERSEGI PANJANG\n3. LINGKARAN\n4. SEGITIGA\n5. TRAPESIUM");
        System.out.print("> ");
        Scanner input = new Scanner(System.in);
        String pilihan = input.nextLine();

        if (pilihan.toLowerCase().equals("bangun ruang")) {
            System.out.println("Pilih Bangun Ruang");
            System.out.print("> ");
            int pilihanSoal = input.nextInt();
            // input.nextLine();
            switch (pilihanSoal) {
                case 1:
                    kubus.hasilKubus();
                    break;
    
                case 2:
                    balok.hasilBalok();
                    break;
    
                case 3:
                    bola.hasilBola();
                    break;
    
                case 4:
                    tabung.hasilTabung();
                    break;
            }

        }else if (pilihan.toLowerCase().equals("bangun datar")) {
            System.out.println("Pilih Bangun Datar");
            System.out.print(">");
            int pilihanSoal = input.nextInt(); 
            // input.nextLine();

            switch (pilihanSoal) {
                case 1:
                    persegi.hasilPersegi();
                    break;
    
                case 2:
                    persegiPanjang.hasilPersegiPanjang();
                    break;
    
                case 3:
                    lingkaran.hasilLingkaran();
                    break;
    
                case 4:
                    segitiga.hasilSegitiga();
                    break;
    
                case 5:
                    trapesium.hasilTrapesium();
                    break;
            }
        }   
    }
}