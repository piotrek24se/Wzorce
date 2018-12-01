package Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        ConfigHelper.getInstance().getConfigValue("log.tag");
    }
}