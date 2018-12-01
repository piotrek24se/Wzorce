package Strategy;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

    //niedokonczony caly pakiet

    static TaxStrategy getStrategy(CountryCode countryCode) {
        if (countryCode == CountryCode.PL) {
            return new PLTax();
        } else if (countryCode == CountryCode.USA) {
            return new USATax();
        } else return null;
    }

    Map<CountryCode, TaxStrategy> map = new HashMap<>();

    static float calculateTax(CountryCode code, Float income) {
        return 1;
    }
}
