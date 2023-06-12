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

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        double howLongToType = 60000 / wpm;
        for (String word : wordsToType) { // setiap kata dalam wordsToType ditambahkan menggunakan method addWordTyped
            try {
                Thread.sleep((long) howLongToType); // untuk menunda eksekusi selama howLongToType sebelum melanjutkan
                                                    // kata berikutnya
                this.addWordTyped(word);
            } catch (InterruptedException e) { // untuk menangani error yg dapat terjadi saat menggunakan Thread.sleep()
                e.printStackTrace();
            }
        }
        this.addWordTyped("(selesai)");
        typeRacer.addResult(this);
    }
}