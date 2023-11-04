package com.wly.gulimall.product1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.common.utils.PageUtils;
import com.wly.gulimall.product1.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-03 22:44:59
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

