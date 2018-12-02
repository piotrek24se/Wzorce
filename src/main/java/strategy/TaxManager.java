package strategy;

import java.util.HashMap;
import java.util.Map;

public class TaxManager {

    //niedokonczony caly pakiet

//    static TaxStrategy getStrategy(CountryCode countryCode) {
//        if (countryCode == CountryCode.PL) {
//            return new PLTax();
//        } else if (countryCode == CountryCode.USA) {
//            return new USATax();
//        } else return null;
//    }
//
//    Map<CountryCode, TaxStrategy> map = new HashMap<>();
//
//    static float calculateTax(CountryCode code, Float income) {
//        return 1;
//    }

   private static Map<CountryCode, TaxStrategy> strategies = new HashMap<>();

    static {
        strategies.put(CountryCode.PL, new PLTax());
        strategies.put(CountryCode.US, new USATax());
    }

    public static TaxStrategy getStrategy(CountryCode countryCode) {
//        if(countryCode == CountryCode.PL) {
//            return new PLTax();
//        } else {
//            return new USATax();
//        }
        return strategies.get(countryCode);
    }

    public static float calculateTax(CountryCode countryCode, float income) {
       return getStrategy(countryCode).calculate(income);
    }


}
