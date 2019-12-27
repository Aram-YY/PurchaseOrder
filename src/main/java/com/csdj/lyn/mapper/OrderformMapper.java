package com.csdj.lyn.mapper;

import com.csdj.lyn.entity.Orderform;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/16 8:32
 */
@Mapper
public interface OrderformMapper {
    /**
     *
     * @param start
     * @return
     */
    public List<Orderform>findOrderForm(@Param("start")String start);
}
