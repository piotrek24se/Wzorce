package strategy;

public class USATax implements TaxStrategy {
    @Override
    public float calculate(float income) {
        return income * 0.2f;
    }
}
