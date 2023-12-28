package com.spring.jdbc.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DBConfig {
	@Bean
	public NamedParameterJdbcTemplate getDataSource(DataSource datasource) {
		return new NamedParameterJdbcTemplate(datasource);
	}
}
