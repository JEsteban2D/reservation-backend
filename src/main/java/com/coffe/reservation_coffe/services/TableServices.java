package com.coffe.reservation_coffe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffe.reservation_coffe.entities.RestaurantTable;
import com.coffe.reservation_coffe.repository.TableRepository;

@Service
public class TableServices {
    @Autowired
    private TableRepository tableRepository;

    public List<RestaurantTable> getallRestaurantTables() {
        return tableRepository.findAll();
    }

    public RestaurantTable saveTable(RestaurantTable table) {
        return tableRepository.save(table);
    }

}
