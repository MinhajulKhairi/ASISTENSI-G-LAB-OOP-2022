package No2;

public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        country.setName("Indonesia");
        country.setCapital("Jakarta");
        country.setHeadOfState("Presiden");
        country.setPopulation(0);
        country.setLanguage("Indonesia");
        country.displayInfo();

        Country country1 = new Country("Malaysia", "Kuala Lumpur", "Perdana Menteri", 0, "Melayu");
        country1.getName();
        country1.getCapital();
        country1.getHeadOfState();
        country1.getPopulation();
        country1.getLanguage();
        country1.displayInfo();

        SelfUtils.displaySelfData("Farah Dwi", "H071221001");
    }
}
