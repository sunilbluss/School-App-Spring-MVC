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

import com.my_school.model.Course;

@Repository
public class CourseDAOImpl implements CourseDAO {

	JdbcTemplate jdbcTemplate;    
    
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {    
	    this.jdbcTemplate = jdbcTemplate;    
	}
	
	public int addCourse(Course c) {
		String sql="insert into course(course_name) values(?);";    
	    return jdbcTemplate.update(sql, new Object[] {
	    		c.getCourseName()
	    }); 
	}

	public List<Course> getAllCourses() {
		String sql = "select * from course";

        List<Course> courseList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Course>>()
        {
            public List<Course> extractData(ResultSet rs) throws SQLException, DataAccessException
            {
                List<Course> list = new ArrayList<Course>();
                while (rs.next())
                {
                	Course course = new Course();
                	course.setCourseId(rs.getInt("course_id"));
                	course.setCourseName(rs.getString("course_name"));
                    list.add(course);
                }
                return list;
            }

        });
        return courseList;
	}

	public int deleteCourse(int id) {
		String sql="delete from course where course_id=?";    
		return jdbcTemplate.update(sql, new Object[] {
	    		id
	    });  
	}

	public Course getCourseById(int id) {
		String sql="select * from course where course_id=?";    
		 return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Course>(Course.class));    
	}

	public int editCourse(Course c) {
		String sql="update course set course_name = ? where course_id = ?;";    
	    return jdbcTemplate.update(sql, new Object[] {
	    		c.getCourseName(), c.getCourseId()
	    });  
	}

}
