/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.quartzmapstructlogdemo.task;

import com.geek45.commons.lang.DateUtils;
import com.geek45.quartzmapstructlogdemo.log.Loggers;
import org.slf4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName: TaskDemo
 * @Decription: 任务demo
 * @Author: rubik
 *  rubik create TaskDemo.java of 2021/12/29 5:46 下午
 */
@Component
public class TaskDemo {

    Logger logger = Loggers.APPLICATION_LOGGER;

    Logger biz = Loggers.BIZ_LOGGER;
    Logger system = Loggers.SYSTEM_LOGGER;
    @Scheduled(cron = "0 0/1 * * * ?")
    public void minuteExport(){
        logger.info("每分钟执行一次的任务：{}", DateUtils.getDateStr());
        logger.error("132132123");
    }

    @Scheduled(fixedRate = 5000)
    public void fiveSecondExport(){
        biz.info("每5秒执行一次：{}", DateUtils.getDateStr());
    }

    @Scheduled(cron = "0/2 * * * * ?")
    public void twoSecondExport(){
        system.info("每2秒执行一次：{}", DateUtils.getDateStr());
    }

    @Scheduled(cron = "0 55 14 ? * *")
    public void regularTimeExport(){
        logger.info("每天上午14点55分执行：{}", DateUtils.getDateStr());
    }


}
