package assignment_no_1;

public class SiberianHusky extends Dog {
  
    
    public void move() {
        System.out.println("SiberianHusky");
        position += 2;
        System.out.println("SiberianHusky berpindah posisi ke kanan sejauh "+ position);
    }
    
    public void describe() {
        averageLength = 75;
        String kalimat = "Memiliki karakteristik sifat yang lembut dan siaga,bersahabat,jinak, pandai dan ramah. Jenis Siberian Husky ini memiliki tinggi rata rata " +averageLength +"cm" ;
        String[] kalimat_pisah = kalimat.split(" ");
        for (int i = 0; i < kalimat_pisah.length; i++) {
            System.out.print(kalimat_pisah[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }

    
    }

