package cn.st.learning.logback;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by coolearth on 17-6-15.
 */
public class HelloWorld {
    public static void main(String []args){
        Logger logger= LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("hello world");
        printInternalState();
    }

    private static void printInternalState(){
        LoggerContext lc= (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
