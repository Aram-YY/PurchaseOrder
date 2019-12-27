package com.csdj.lyn.mapper;

import com.csdj.lyn.entity.Orderform;
import com.csdj.lyn.entity.Purchasea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/13 8:26
 */
@Mapper
public interface PurchaseMapper {

    int count(@Param("project") String project);

    public List<Purchasea> findCriName(@Param("project") String project,
                                       @Param("currPage") int currPage,
                                       @Param("pageSize") int pageSize);
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
    public Purchasea findCarById(@Param("id") int id);

    public int findupdate(Purchasea purchasea);


    int delId(@Param("id") int id);

}
