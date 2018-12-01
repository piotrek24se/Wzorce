package Strategy;

public class PLTax implements TaxStrategy {
    @Override
    public Float calculate(Float income) {
        Float tax = income * 0.20f;
        return tax;
    }
}
