package com.xlm.domain.repository;

import com.xlm.domain.model.StrategyAwardEntity;
import com.xlm.domain.model.StrategyEntity;
import com.xlm.domain.model.StrategyRuleEntity;

import java.util.List;
import java.util.Map;

/**
 * @author xlm
 * 2024/7/17 下午1:43
 */
public interface IStrategyRepository {

    List<StrategyAwardEntity> queryStrategyAwardList(Long strategyId);

    void storeStrategyAwardSearchRateTable(String key, Integer rateRange, Map<Integer, Integer> strategyAwardSearchRateTable);

    Integer getStrategyAwardAssemble(Long strategyId, Integer rateKey);

    Integer getStrategyAwardAssemble(String key, Integer rateKey);

    int getRateRange(Long strategyId);

    int getRateRange(String key);

    StrategyEntity queryStrategyEntityByStrategyId(Long strategyId);

    StrategyRuleEntity queryStrategyRule(Long strategyId, String ruleWeight);
}