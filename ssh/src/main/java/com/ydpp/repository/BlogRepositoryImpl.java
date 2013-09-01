package com.ydpp.repository;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ydpp.domain.Blog;

@Repository
public class BlogRepositoryImpl implements BlogRepository {

	@Autowired
	HibernateTemplate template;
	
	public void save(Blog blog) {
		template.save(blog);
	}
	
	public long count() {
		return template.execute(new HibernateCallback<Long>(){
			public Long doInHibernate(Session session) throws HibernateException,
					SQLException {
				return (Long)session.createQuery("SELECT COUNT(*) FROM Blog").uniqueResult();
			}
		});
	}

}
