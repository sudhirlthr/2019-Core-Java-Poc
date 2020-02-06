/**
 * 
 */
package com.sudhir.jwt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author sudhirk
 *
 */
@RepositoryRestResource(path = "/allblog",collectionResourceRel = "blogs",itemResourceRel = "blog")
public interface BlogRestResource extends JpaRepository<Blog, Integer>{

}
