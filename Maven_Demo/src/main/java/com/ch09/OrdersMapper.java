package com.ch09;

import java.util.List;

public interface OrdersMapper {
    List<Orders> findOrdersByuserId(int userId);
}
