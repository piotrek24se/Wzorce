package singleton;

public class ConfigHelperSingletonMain {

    // plik txt musimy stworzyc na poziomie pliku POM
    //new config helper wykona sie tylko raz w trakcie dzialania programu (getConfig zawsze zwroci ten sam obiekt)

    public static void main(String[] args) {
        String logTag =
                ConfigHelper.getInstance()
                        .getConfigValue("log.tag");
        String maxLength =
                ConfigHelper.getInstance()
                        .getConfigValue("log.maxLength");


        System.out.println("logTag = " + logTag);
        System.out.println("maxLength = " + maxLength);

        Player player = new Player();

        player.load();
        player.play();
        player.pause();
        player.stop();
        player.reset();

    }

}
