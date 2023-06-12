import java.util.ArrayList;
import java.util.Random;

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // Word by yusuf syam
    private String[] wordsToTypeList = {
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Menuju tak terbatas dan melampauinya",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",  
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain", 
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai"
        };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    void addResult(Typer typer) {
        int finish_time = (int) (6000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length;
        Result result = new Result(typer.getName(), finish_time);
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");
        for (int i = 0; i < raceStanding.size(); i++){
            double finishTime = (double) (raceStanding.get(i).getFinishTime());
            double outputDetik = Double.valueOf(finishTime)/1000;
            System.out.println(String.format("%d. %s = %.2f detik", (i + 1), raceStanding.get(i).getName(), outputDetik));
        }
       
    }

    public void startRace() {
        this.setNewWordsToType();
        for (Typer i: raceContestant){
            i.start();
        }
         boolean successAll = false;
        while (true){
            if (successAll){
                break;
            } else {
                if(raceStanding.size()!=raceContestant.size()){
                    try {
                        Thread.sleep(2000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("\nTyping Progress ...");
                    System.out.println("=".repeat(15)+"\n");
                    for (Typer j:raceContestant){
                        System.out.println(" " + j.getBotName() + " => " + j.getWordsTyped());
                    }
                } else {
                    successAll = true;
                }
            }
        }
        this.printRaceStanding();
    }
        
    }

