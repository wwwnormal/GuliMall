package com.wly.gulimall.product1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.common.utils.PageUtils;
import com.wly.gulimall.product1.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-03 22:44:59
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

