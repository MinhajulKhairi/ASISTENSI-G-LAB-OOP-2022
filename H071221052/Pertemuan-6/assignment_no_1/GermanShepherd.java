package assignment_no_1;

class GermanShepherd extends Dog {
    @Override
    public void move() {
        position += 3;
        System.out.println("GermanShepherd berpindah posisi ke kanan sejauh "+ position);
    }
    public void describe() {
        averageLength = 60;
        System.out.println("ciri cirinya itu Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.Bobot antara 34-43 kg.Tinggi kisaran" + averageLength + "cm.");
    }
}

