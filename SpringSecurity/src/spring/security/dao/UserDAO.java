package spring.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import spring.security.domain.User;

@Repository
public class UserDAO {
	
	@Autowired
	MongoTemplate template;
	
	public void insertUser(User u) {
		System.out.println(template);
		template.insert(u);
	}
	public User getUserByUsername(String username) {
		Query query = new Query();
		query.addCriteria(Criteria.where("username").is(username));
		User user = template.findOne(query, User.class);
		return user;
	}
}
