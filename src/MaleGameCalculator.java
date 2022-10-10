public class MaleGameCalculator extends GameCalculator {
    private int puan;

    public MaleGameCalculator() {
        this.puan = 90;
    }

    @Override
    public void hesapla() {
        System.out.println("Puanınız : " + puan);
    }
}
