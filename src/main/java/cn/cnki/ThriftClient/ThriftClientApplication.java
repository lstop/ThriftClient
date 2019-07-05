package cn.cnki.ThriftClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ThriftClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThriftClientApplication.class, args);
	}

}
