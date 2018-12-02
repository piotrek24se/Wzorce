package strategy;

public class StrategyMain {

    public static void main(String[] args) {

        float income = 10000;
        float usTax = TaxManager.calculateTax(CountryCode.US, income);
        float plTax = TaxManager.calculateTax(CountryCode.PL, income);

        System.out.println("Income: " + income + " PL: " + plTax + " US: " + usTax);

        System.out.println("PL: " + TaxCalculator.PL.calculate(income));

    }
    // uzupelnic jedna metode z git

}
