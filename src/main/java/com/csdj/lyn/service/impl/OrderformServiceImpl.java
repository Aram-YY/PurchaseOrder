package com.csdj.lyn.service.impl;

import com.csdj.lyn.entity.Orderform;
import com.csdj.lyn.mapper.OrderformMapper;
import com.csdj.lyn.service.OrderformService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/16 8:45
 */
@Service
public class OrderformServiceImpl implements OrderformService {
    @Resource
    private OrderformMapper orderformMapper;

    @Override
    public List<Orderform> findOrderForm(String start) {
        return orderformMapper.findOrderForm(start);
    }
}
