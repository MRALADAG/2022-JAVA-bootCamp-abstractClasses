public class ChildrenGameCalculator extends GameCalculator {
    private int puan;

    public ChildrenGameCalculator() {
        this.puan = 100;
    }

    @Override
    public void hesapla() {
        System.out.println("Puanınız : " + puan);
    }
}
