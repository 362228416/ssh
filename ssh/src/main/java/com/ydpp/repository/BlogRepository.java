package com.ydpp.repository;

import com.ydpp.domain.Blog;

public interface BlogRepository {
	
	public void save(Blog blog);
	
	public long count();
	
}
