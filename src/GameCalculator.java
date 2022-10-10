public abstract class GameCalculator {
    private int puan;

    public GameCalculator() {
        this.puan = 0;
    }

    public abstract void hesapla();

    public void gameOver() {
        System.out.println("Oyun bitti!");
    }

}
