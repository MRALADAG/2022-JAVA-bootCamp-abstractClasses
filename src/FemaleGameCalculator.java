public class FemaleGameCalculator extends GameCalculator {
    private int puan;

    public FemaleGameCalculator() {
        this.puan = 95;
    }

    @Override
    public void hesapla() {
        System.out.println("Puanınız : " + puan);
    }
}
