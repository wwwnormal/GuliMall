package com.wly.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wly.common.utils.PageUtils;
import com.wly.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * 成长值变化历史记录
 *
 * @author wnormal
 * @email 2169115493@qq.com
 * @date 2023-11-04 15:37:11
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

