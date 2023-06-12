class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String racername) {
        this.name = racername;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int racerTime) {
        this.finishTime = racerTime;
    }
}