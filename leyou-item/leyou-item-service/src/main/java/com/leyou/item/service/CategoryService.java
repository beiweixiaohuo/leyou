package com.leyou.item.service;


import com.leyou.item.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CategoryService {
    List<Category> queryCategoriesByPid(Long pid);

    List<String> queryNamesByIds(List<Long> ids);

    List<Category> queryAllByCid3(Long id);
}
