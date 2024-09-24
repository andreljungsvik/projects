public class Player {
    private String name;
    private int runs;

    private int minGuessCount;

    private int mostGuessCount;

    public Player(String name) {
        this.name = name;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setMinGuessCount(int minGuessCount) {
        this.minGuessCount = minGuessCount;
    }

    public void setMostGuessCount(int mostGuessCount) {
        this.mostGuessCount = mostGuessCount;
    }

    public int getRuns() {
        return runs;
    }

    public int getMinGuessCount() {
        return minGuessCount;
    }

    public int getMostGuessCount() {
        return mostGuessCount;
    }
}
