public class Main {
    public static void main(String[] args) {
        GameCalculator[] gameCalculators = new GameCalculator[]{
                new FemaleGameCalculator(), new MaleGameCalculator(), new ChildrenGameCalculator()
        };

        for (GameCalculator gameCalculator : gameCalculators) {
            gameCalculator.hesapla();
        }
    }
}
