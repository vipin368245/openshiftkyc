package com.boa.kycprocess.configurations;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DbConfiguration {
//	@Value("${db_url}")
//	private String url;
//	@Value("${db_username}")
//	private String userName;
//	@Value("${db_password}")
//	private String password;
//	@Value("${db_driver}")
//	private String driver;	
//
//	
//	
//	@Bean
//	@ConditionalOnClass(DataSource.class)
//	
//	public DataSource getInstance()
//	{
//		DataSourceBuilder dataSourceBuilder=DataSourceBuilder.create();
//		dataSourceBuilder.url(url);
//		dataSourceBuilder.driverClassName(driver);
//		dataSourceBuilder.password(password);
//		dataSourceBuilder.username(userName);
//		return dataSourceBuilder.build();
//		
//	}
	
}
