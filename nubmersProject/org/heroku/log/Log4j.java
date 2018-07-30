package heroku.log;

import org.apache.log4j.*;

public class Log4j {
    static final Logger logger = Logger.getLogger(Log4j.class);

    private Log4j() {

    }

    public static Logger getLogger() {
        return logger;
    }
}
