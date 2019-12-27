package com.csdj.lyn.service;

import com.csdj.lyn.entity.Orderform;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/16 8:44
 */
public interface OrderformService {
    /**
     *
     * @param start
     * @return
     */
    public List<Orderform> findOrderForm(String start);
}
