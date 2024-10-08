package com.xlm.domain.award.service;

import com.xlm.domain.award.model.entity.DistributeAwardEntity;
import com.xlm.domain.award.model.entity.UserAwardRecordEntity;

/**
 * @author xlm
 * 2024/8/1 下午2:30
 */
public interface IAwardService {

    void saveUserAwardRecord(UserAwardRecordEntity userAwardRecordEntity);

    /**
     * 配送发货奖品
     */
    void distributeAward(DistributeAwardEntity distributeAwardEntity);

}
