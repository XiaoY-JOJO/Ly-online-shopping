package com.leyou.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xy
 * Feature:商品FeignClient
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
