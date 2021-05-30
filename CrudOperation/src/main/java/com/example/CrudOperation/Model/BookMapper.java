package com.example.CrudOperation.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
//import javax.swing.tree.RowMapper;

public class BookMapper implements RowMapper<Books>{

	public Books mapRow(ResultSet resultSet, int i) throws SQLException {

		Books person = new Books();
		person.setBookid(resultSet.getInt("id"));
		person.setBookName(resultSet.getString("first_name"));
		person.setAuthorname(resultSet.getString("last_name"));
		person.setPrice(resultSet.getInt("age"));
		return person;
	}
}

