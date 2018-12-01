package Strategy;

public class USATax implements TaxStrategy {
    @Override
    public Float calculate(Float income) {
        Float tax = income * 0.30f;
        return tax;
    }
}
