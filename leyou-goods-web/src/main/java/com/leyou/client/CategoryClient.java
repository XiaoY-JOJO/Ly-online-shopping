package com.leyou.client;

import com.leyou.item.api.CategoryApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xy
 * Feature:商品分类FeignClient
 */
@FeignClient(value = "item-service")
public interface CategoryClient extends CategoryApi {
}
