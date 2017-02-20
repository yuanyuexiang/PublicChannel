package com.qycam.caihongjiayuan.channel.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.qycam.caihongjiayuan.channel.domain.Blog;

/**
 * Created by tom on 16-9-29.
 */
public interface BlogRepository extends MongoRepository<Blog,String>{
    Blog findById(String blog_id);
}
