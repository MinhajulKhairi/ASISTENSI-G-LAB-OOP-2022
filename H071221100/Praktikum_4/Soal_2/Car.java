//STEP 1
public class Car {
    
    
    //STEP 2
        String brand ;
        String model ;
        int year;
        int price;
        boolean isSold;
    
       //STEP 4
        public Car(){} 
        
    
        public Car(String brand, String model, int year, int price, boolean isSold) { // connstructor yang memiliki atribut , liat soal no 8
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
            this.isSold = isSold;
        }
        //STEP 5 
        public void setBrand(String brand) {
            this.brand = brand;
        }  
        public void setModel(String model) {
            this.model = model;
        }    
        public void setYear(int year) {
            this.year = year;
        }  
        public void setPrice(int price) {
            this.price = price;
        }
        public void setisSold(boolean isSold) {
            this.isSold = isSold;
        }    
        public String getBrand() {
            return brand;  
        }
        public String getModel(){
            return model;
        }
        public int getYear() {
            return year;
        }
        public int getPrice() {
            return price;  
        }
        public boolean getisSold() {
            return isSold;  
        }
    
        //STEP 6
        //STEP 7
        public void displayInfo(){ // behaviour untuk display info , baca soal no 7 
            System.out.println("Display Info Car");
            System.out.println("Brand : " + this.getBrand());
            System.out.println("Model : " + this.getModel());
            System.out.println("Year : " + this.getYear());
            System.out.println("Price : " + this.getPrice());
            System.out.println("This is sold?  : " + this.getisSold());
        }    
    }    
    