package com.github.caroline.homework08.mappers;

import com.github.caroline.homework08.models.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author
 */
@Repository
public interface OrderMapper {

    void insertOne(Order order);
    void delete(Long id);
    void update(Order order);
    List<Map<String, Object>> query(Map<String, Object> condition);
}
