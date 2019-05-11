package App;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * springBoot的入口类：springBoot不依赖Tomcat容器
 * main:run-->项目启动入口
 * 
 * @author hhf
 *
 */
@EnableAutoConfiguration // 标识为入口
@ComponentScan(basePackages = { "controller", "serviceImpl", "Util" }) // 扫描包[...]下的注解
@MapperScan(basePackages = { "Dao" })
@EnableJpaRepositories(basePackages={"repository"})//支持jpa：1.jpa扫描接口
@EntityScan("Bean")//支持jpa：2.jpa扫描实体类
//@EnableCaching//开启缓存
public class Application/* extends SpringBootServletInitializer*/ {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
