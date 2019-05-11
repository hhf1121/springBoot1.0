package Util;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * springboot整合定时任务
 * 定时任务调度
 * @author hhf
 *
 */
//@Configuration
//@EnableScheduling//启动定时任务
public class dispatchConfig {

	int count=0;
	
	@Scheduled(cron="0/1 * * * * ?")  //每1秒执行一次
	public void show(){
		count++;
		System.out.println("定时器触发，第"+count+"次");
	}
	
	
}
