package com.wly.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.common.utils.PageUtils;
import com.wly.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-04 15:17:40
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

