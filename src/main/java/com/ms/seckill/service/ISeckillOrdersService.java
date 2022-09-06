package com.ms.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ms.seckill.pojo.SeckillOrders;
import com.ms.seckill.pojo.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ms
 * @since 2022-09-01
 */
public interface ISeckillOrdersService extends IService<SeckillOrders> {

    Long getResult(User user, Long goodsId);
}
