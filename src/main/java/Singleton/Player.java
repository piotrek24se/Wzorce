package Singleton;

public class Player {

    private boolean isLoad;

    public void play() {
        if(isLoad) {
            prepareAndPrintLog("wykonano PLAY");
        } else {
            prepareAndPrintLog("nie wykonano PLAY, poniewaz isLoad jest falszem");
        }
    }

    public void pause() {
        if(isLoad) {
            prepareAndPrintLog("wykonano PAUSE");
        } else {
        prepareAndPrintLog("nie wykonano PAUSE, poniewaz isLoad jest falszem");
    }
    }

    public void stop() {
        if(isLoad) {
            prepareAndPrintLog("wykonano STOP");
        } else {
        prepareAndPrintLog("nie wykonano STOP, poniewaz isLoad jest falszem");
    }
    }

    public void load() {
        isLoad = true;
        prepareAndPrintLog("Zaladowano material");
    }

    public void reset() {
        isLoad = false;
        prepareAndPrintLog("Usunieto material z odtwarzacza");

    }

    private String prepareLog(String message) {
        return ConfigHelper.getInstance().getConfigValue("log.tag") + " " + message;
    }

    private void prepareAndPrintLog(String message) {
        System.out.println(prepareLog(message));
    }
}
