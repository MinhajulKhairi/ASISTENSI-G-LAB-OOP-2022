package No2;

public class Country {
    String name;
    String capital;
    String headOfState;
    int population;
    String language;

    public Country() {
    }

    public Country(String name, String capital, String headOfState, int population, String language) {
        this.name = name;
        this.capital = capital;
        this.headOfState = headOfState;
        this.population = population;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void displayInfo() {
        System.out.println("Negara : " + name);
        System.out.println("Ibukota : " + capital);
        System.out.println("Kepala Negara : " + headOfState);
        System.out.println("Populasi : " + population);
        System.out.println("Bahasa : " + language);
    }

}
