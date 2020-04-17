package com.lin.missyou.repository;

import com.lin.missyou.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface OrderRepository extends JpaRepository<Order,Long> {

    Page<Order> findByExpiredTimeGreaterThanAndStatusAndUserId(Date now,Integer status,Long uid, Pageable pageable);

    Page<Order> findByUserId(Long uid, Pageable pageable);

    Page<Order> findByUserIdAndStatus(Long uid,Integer status,Pageable pageable);
}
