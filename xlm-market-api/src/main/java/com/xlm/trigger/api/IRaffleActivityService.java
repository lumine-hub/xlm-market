package com.xlm.trigger.api;

import com.xlm.trigger.api.dto.ActivityDrawRequestDTO;
import com.xlm.trigger.api.dto.ActivityDrawResponseDTO;
import com.xlm.types.model.Response;

/**
 * @author xlm
 * 2024/8/3 下午7:51
 * 抽奖活动接口
 */
public interface IRaffleActivityService {
    /**
     * 活动装配，数据预热缓存
     * @param activityId 活动ID
     * @return 装配结果
     */
    Response<Boolean> armory(Long activityId);

    /**
     * 活动抽奖接口
     * @param request 请求对象
     * @return 返回结果
     */
    Response<ActivityDrawResponseDTO> draw(ActivityDrawRequestDTO request);
}
