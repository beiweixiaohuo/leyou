package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value = "item-service")
@Component
public interface GoodsClient extends GoodsApi {
}