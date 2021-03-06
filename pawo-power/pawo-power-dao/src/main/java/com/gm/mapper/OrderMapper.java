package com.gm.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gm.order.ShoppingOrders;

import org.apache.ibatis.annotations.Param;

/**
 * dao mapper of shoppingorder
 *
 * @author gmzhao
 */
public interface OrderMapper extends BaseMapper<ShoppingOrders> {


    /**
     * 根据订单号查找订单并对订单加锁
     *
     * @param sn 订单号
     * @return 订单信息
     */
    ShoppingOrders selectForUpdateBySn(@Param("sn")String sn);

}
