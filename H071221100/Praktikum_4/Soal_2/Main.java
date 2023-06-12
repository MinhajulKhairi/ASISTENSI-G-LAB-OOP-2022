//STEP 3
public class Main {
    
    public static void main(String[] args) {    
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Toyota Agya GR Sport");
        car1.setYear(2003);
        car1.setPrice(181_500_000);
        car1.setisSold(true);
        car1.displayInfo();

        
        System.out.println("-------------");
        
        
        Car car2 = new Car("Honda","Honda Brio RS Urbanite", 2005, 243_900_000, false);
        car2.getBrand();
        car2.getModel();
        car2.getYear();
        car2.getPrice();
        car2.getisSold();   
        car2.displayInfo();

        System.out.println("-------------");

        SelfUtils.displaySelfData("Siti Fathimah Azzahra", "H071221100");


    }
    
}
