package cn.st.learning.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by coolearth on 17-6-15.
 */
public class HelloWorld {
    public static void main(String []args){
        Logger logger= LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("hello world");
    }
}
