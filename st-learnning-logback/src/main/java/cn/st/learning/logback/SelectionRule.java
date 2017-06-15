package cn.st.learning.logback;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by coolearth on 17-6-15.
 */
public class SelectionRule {
    public static void main(String[] args) {
        Logger logger= (Logger) LoggerFactory.getLogger("com.foo");
        logger.setLevel(Level.INFO);
        Logger barLogger= (Logger) LoggerFactory.getLogger("com.foo.bar");
        logger.warn("warn warn");
        logger.debug("debug debug");

        barLogger.warn("bar warn warn");
        barLogger.debug("bar debug debug");
    }
}
