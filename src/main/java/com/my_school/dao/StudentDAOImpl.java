package com.my_school.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.my_school.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	JdbcTemplate jdbcTemplate;    
    
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {    
	    this.jdbcTemplate = jdbcTemplate;    
	}
	
	public int addStudent(Student s){    
	    String sql="insert into student(first_name, last_name, address, contact_number) values(?, ?, ?, ?);";    
	    return jdbcTemplate.update(sql, new Object[] {
	    		s.getFirstName(), s.getLastName(), s.getAddress(), s.getContactNumber()
	    });    
	}
	
	public List<Student> getAllStudents()
    {
        String sql = "select * from student";

        List<Student> studentList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>()
        {
            public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<Student> list = new ArrayList<Student>();
                while (rs.next())
                {
                	Student student = new Student();
                	student.setStudentId(rs.getInt("student_id"));
                    student.setFirstName(rs.getString("first_name"));
                    student.setLastName(rs.getString("last_name"));
                    student.setAddress(rs.getString("address"));
                    student.setContactNumber(rs.getString("contact_number"));
                    list.add(student);
                }
                return list;
            }

        });
        return studentList;
    }

	public int deleteStudent(int id) {
		String sql="delete from student where student_id=?";    
		return jdbcTemplate.update(sql, new Object[] {
	    		id
	    });  
	}

	public Student getStudentById(int id) {
		 String sql="select * from student where student_id=?";    
		 return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Student>(Student.class));    
	}

	public int editStudent(Student s) {
		String sql="update student set first_name = ?, last_name = ?, address = ?, contact_number = ? where student_id = ?;";    
	    return jdbcTemplate.update(sql, new Object[] {
	    		s.getFirstName(), s.getLastName(), s.getAddress(), s.getContactNumber(), s.getStudentId()
	    });  
	}

}
