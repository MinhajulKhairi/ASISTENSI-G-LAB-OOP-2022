class Typer extends Thread {
    private String botName, wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;

    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    }

    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");
        int howLongToType = 1000;
        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                addWordTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordTyped("(selesai)");

        typeRacer.addResult(this);
    }

}