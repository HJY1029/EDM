package framework;

public class CommandUserInterface {
    private static final System.Logger logger = System.getLogger(CommandUserInterface.class.getName());

    /**
     * Clear the console screen <br>
     * Note: This method only works when running in a console <br>
     * 清除控制台屏幕 <br>
     * 注意：该方法仅在控制台运行时生效
     */
    public static void clearConsole() {
        try{
            String os = System.getProperty("os.name");
            if(os.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process start = pb.inheritIO().start();
                start.waitFor();
            }
            else{
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process start = pb.inheritIO().start();
                start.waitFor();
            }
        }
        catch (Exception e){
            logger.log(System.Logger.Level.ERROR, e.getMessage());
        }
    }
}
