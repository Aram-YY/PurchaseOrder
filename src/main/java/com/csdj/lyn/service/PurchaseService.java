package com.csdj.lyn.service;

import com.csdj.lyn.entity.Purchasea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/13 8:34
 */
public interface PurchaseService {
    int count(String project);

    public List<Purchasea> findCriName(String project,
                                       int currPage,
                                       int pageSize);
    /**
     * 添加
     *
     * @param
     * @return
     */
    int addCri(Purchasea purchasea);

    /**
     * 根据id查询
     *
     * @param
     * @return
     */
    public Purchasea findCarById(int id);

    public int findupdate(Purchasea purchasea);


    int delId( int id);
}
