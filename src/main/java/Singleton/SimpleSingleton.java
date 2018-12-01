package Singleton;

import java.util.Map;

public class SimpleSingleton {

    private static SimpleSingleton INSTANCE;
    private Map<String, String> config;

    private SimpleSingleton() {
        //wczytaj konfiguracje
    }

    public static SimpleSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }

    public String getConfig(){
        return "Konfiguracja";
    }


    public String getConfigValue(String key) {
        return config.get(key);
    }
}
