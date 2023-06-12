package assignment_no_1;
public class Bulldog extends Dog {
        @Override
        public void move() {
            position += 1;
            System.out.println("Bulldog berpindah posisi ke kanan sejauh "+ position);
        }
        public void describe() {
            averageLength += 60;
            System.out.println("ciri cirinya itu tubuh lebar, besar, moncong pesek, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipat dan panjang rata rata tubuhnya itu " + averageLength + "cm");
        }
    }
