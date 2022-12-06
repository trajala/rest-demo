package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class CustomerDAO extends JdbcDaoSupport {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
	
	public List<Customer> getAll() {
		String sql = "SELECT * FROM customer";
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Customer> result = new ArrayList<Customer>();
		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();
			customer.setId((String) row.get("id"));
			customer.setName((String) row.get("name"));
			customer.setEmail((String) row.get("email"));
			result.add(customer);
		}
		
		return result;
	}
	
}
