package assignment_no_1;

public class Pitbull extends Dog {
  @Override
    public void move() {
        position += 3;
        System.out.println("Pitbull berpindah posisi ke kanan sejauh "+ position);
    }
    
    public void describe() {
        averageLength = 48;
        System.out.println("Ciri-ciri anjing pitbull jenis ini adalah memiliki otot yang kekar, mata sedikit sipit dan hampir berdekatan, kuping berdiri dan tulang yang kuat, dan tinggi rata ratanya itu " + averageLength + "cm");
    }
}
