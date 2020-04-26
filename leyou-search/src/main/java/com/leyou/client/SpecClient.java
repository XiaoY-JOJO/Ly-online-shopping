package com.leyou.client;

import com.leyou.item.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xy
 * Feature:特有属性FeignClient
 */
@FeignClient(value = "item-service")
public interface SpecClient extends SpecApi {
}
