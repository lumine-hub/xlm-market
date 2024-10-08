package com.xlm.domain.strategy.service.rule.tree.factory.engine;

import com.xlm.domain.strategy.service.rule.tree.factory.DefaultTreeFactory;

import java.util.Date;

/**
 * @author xlm
 * 2024/7/21 下午5:49
 * 执行决策树的方法，
 */
public interface IDecisionTreeEngine {

    DefaultTreeFactory.StrategyAwardVO process(String userId, Long strategyId, Integer awardId, Date endDateTime);

}