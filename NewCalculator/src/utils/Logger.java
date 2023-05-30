package utils;
/*
 * Класс Logger реализует интерфейс Loggable для записи логов.
 */
public class Logger implements Loggable {

    private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    @Override
    public void log(String string) {
        System.out.println();
        logger.info(string);
    }
}
