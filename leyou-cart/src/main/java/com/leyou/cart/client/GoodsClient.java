package com.leyou.cart.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "item-service",url = "api.leyou.com/api/item")
public interface GoodsClient extends GoodsApi {
}