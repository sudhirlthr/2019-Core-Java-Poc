package com.sudhir.jwt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	java.util.List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
}
