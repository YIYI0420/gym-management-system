package com.milotnt.service;

import com.milotnt.pojo.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BillService {
    List<Bill> findAll();

    Boolean insertBill(Bill bill);

    List<Bill> selectBillByUserId(Integer userId);
}
