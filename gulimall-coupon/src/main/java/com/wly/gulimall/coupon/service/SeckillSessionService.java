package com.wly.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.common.utils.PageUtils;
import com.wly.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-04 15:17:41
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

