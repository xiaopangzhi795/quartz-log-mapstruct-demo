/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.quartzmapstructlogdemo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Loggers
 * @Decription:
 * @Author: rubik
 *  rubik create Loggers.java of 2021/12/29 5:47 下午
 */
public class Loggers {

    private static final String APPLICATION = "APPLICATION";
    private static final String BIZ = "BIZ";
    private static final String SYSTEM = "SYSTEM";

    public static final Logger APPLICATION_LOGGER = LoggerFactory.getLogger(APPLICATION);
    public static final Logger BIZ_LOGGER = LoggerFactory.getLogger(BIZ);
    public static final Logger SYSTEM_LOGGER = LoggerFactory.getLogger(SYSTEM);
}
