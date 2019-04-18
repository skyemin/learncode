/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.wei.learncode.redislock;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 功能说明: <br>
 * 创建作者:每特教育-余胜军<br>
 * 创建时间:2018年8月30日 下午10:14:15<br>
 * 教育机构:每特教育|蚂蚁课堂<br>
 * 版权说明:上海每特教育科技有限公司版权所有<br>
 * 官方网站:www.itmayiedu.com|www.meitedu.com<br>
 * 联系方式:qq644064779<br>
 * 注意:本内容有每特教育学员共同研发,请尊重原创版权
 */
public class LockService {
	private static JedisPool pool = null;

	static {
		JedisPoolConfig config = new JedisPoolConfig();
		// 设置最大连接数
		config.setMaxTotal(200);
		// 设置最大空闲数
		config.setMaxIdle(8);
		// 设置最大等待时间
		config.setMaxWaitMillis(1000 * 100);
		// 在borrow一个jedis实例时，是否需要验证，若为true，则所有jedis实例均是可用的
		config.setTestOnBorrow(true);
		pool = new JedisPool(config, "127.0.0.1", 6379, 3000);
	}

	private LockRedis lockRedis = new LockRedis(pool);

	
	
	// 演示redis实现分布式锁
	public void seckill() {
		// 1.获取锁
		String identifierValue = lockRedis.getRedisLock(1000l, 5000l);
		if (identifierValue == null) {
			System.out.println(Thread.currentThread().getName() + ",获取锁失败，原因因为获取锁时间超时...");
			return;
		}
		System.out.println(Thread.currentThread().getName() + ",获取锁成功,锁的id:" + identifierValue + ",正常执行业务了逻辑");

		// 2.释放锁
		lockRedis.unRedisLock(identifierValue);
	}
}
