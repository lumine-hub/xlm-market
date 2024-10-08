package com.xlm.test.infrastructure;

import com.xlm.infrastructure.persistent.redis.IRedisService;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.redisson.api.RMap;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author xlm
 * 2024/7/17 下午1:32
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Resource
    private IRedisService redisService;
    @org.junit.Test
    public void test() {
        RMap<Object, Object> map = redisService.getMap("strategy_id_100001");
        map.put(1,101);
        map.put(2, 101);
        map.put(3, 102);
        map.put(4, 102);
        map.put(5, 103);
        map.put(6, 103);
        map.put(7, 104);
        map.put(8, 104);
        map.put(9, 105);
        map.put(10, 105);
        String res = redisService.getFromMap("strategy_id_100001", 1).toString();
        log.info(res);

    }
}
