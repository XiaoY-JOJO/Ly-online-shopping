package com.leyou.repository;

import com.leyou.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author: xy
 * Feature:文档操作
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
}
