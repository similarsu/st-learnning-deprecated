package cn.st.learning.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by coolearth on 17-6-15.
 */
public class RetrivingLogger {
    public static void main(String[] args) {
        Logger loggerA= LoggerFactory.getLogger("foo");
        Logger loggerB=LoggerFactory.getLogger("foo");
        System.out.print(loggerA==loggerB);
    }
}
