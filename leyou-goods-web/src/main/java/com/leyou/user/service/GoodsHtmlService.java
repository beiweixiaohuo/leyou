package com.leyou.user.service;

public interface GoodsHtmlService {
    void createHtml(Long spuId);
    void asyncExcute(Long spuId);

    void deleteHtml(Long id);
}
