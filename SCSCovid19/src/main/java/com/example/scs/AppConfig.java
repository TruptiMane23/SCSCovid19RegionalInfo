package com.example.scs;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = { "classpath:application.properties" })
public class AppConfig {

	public javax.sql.DataSource covidDatasource() {
		return DataSourceBuilder.create().build();
	}

}
