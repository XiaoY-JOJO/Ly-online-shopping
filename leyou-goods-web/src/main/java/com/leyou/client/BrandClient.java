package com.leyou.client;

/**
 * @Author: xy
 * Feature:品牌FeignClient
 */

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "item-service")
public interface BrandClient extends BrandApi {
}
