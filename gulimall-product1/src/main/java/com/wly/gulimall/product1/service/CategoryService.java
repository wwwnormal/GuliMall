package com.wly.gulimall.product1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.common.utils.PageUtils;
import com.wly.gulimall.product1.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-03 22:44:59
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

