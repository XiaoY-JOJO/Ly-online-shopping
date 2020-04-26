package com.leyou.comments.dao;


import com.leyou.comments.pojo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author: xy
 * @Feature:
 */
public interface SpitDao extends MongoRepository<Spit,String> {
}
