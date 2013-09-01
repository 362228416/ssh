package com.ydpp.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ydpp.domain.Blog;

@ContextConfiguration(locations = "classpath:META-INF/spring/app-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class BlogRepositoryImplTest {

	@Autowired
	BlogRepository repository;
	
	@Test
	public void testSave() {
		repository.save(createBlog());
		repository.save(createBlog());
		repository.save(createBlog());
	}
	
	Blog createBlog() {
		Blog blog = new Blog();
		blog.setTitle("anything_" + repository.count());
		return blog;
	}

}
