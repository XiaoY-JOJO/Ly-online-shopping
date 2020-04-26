package com.leyou.client;

import com.leyou.item.api.SpuApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xy
 * Feature:
 */
@FeignClient(value = "item-service")
public interface SpuClient extends SpuApi {
}
