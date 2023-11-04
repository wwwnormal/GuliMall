package com.wly.gulimall.product1.dao;

import com.wly.gulimall.product1.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-03 22:44:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
