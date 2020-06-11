package com.liyuqi.service.impl;

import com.liyuqi.dao.PaymentDao;
import com.liyuqi.entities.Payment;
import com.liyuqi.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

@Service
public class PaymentServiceImpl implements PaymentService {


    @Resource
    @Autowired
    private PaymentDao paymentDao;


    public int create(Payment payment){

        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){

        return paymentDao.getPaymentById(id);

    }


}
