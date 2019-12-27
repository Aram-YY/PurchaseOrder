package com.csdj.lyn.service.impl;

import com.csdj.lyn.entity.Purchasea;
import com.csdj.lyn.mapper.PurchaseMapper;
import com.csdj.lyn.service.PurchaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description: PurchaseOrder
 * <p>
 * Created by mi on 2019/12/13 8:35
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Override
    public int addCri(Purchasea purchasea) {
        return purchaseMapper.addCri(purchasea);
    }

    @Resource
    private PurchaseMapper purchaseMapper;
    @Override
    public int count(String project) {
        return purchaseMapper.count(project);
    }

    @Override
    public Purchasea findCarById(int id) {
        return purchaseMapper.findCarById(id);
    }

    @Override
    public int findupdate(Purchasea purchasea) {
        return purchaseMapper.findupdate(purchasea);
    }

    @Override
    public int delId(int id) {
        return purchaseMapper.delId(id);
    }

    @Override
    public List<Purchasea> findCriName(String project, int currPage, int pageSize) {
        return purchaseMapper.findCriName(project,currPage,pageSize);
    }
}
