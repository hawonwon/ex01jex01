package org.zerock.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class RootConfig {
	
	
	
	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:oralce:thin:@localhost:1521:XE");
		
		hikariConfig.setUsername("c##himedia");
		hikariConfig.setPassword("himedia");
		
		HikariDataSource dataSource =new HikariDataSource(hikariConfig);
		
		return dataSource;
	}
}
