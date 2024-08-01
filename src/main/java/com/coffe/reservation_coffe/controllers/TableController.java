package com.coffe.reservation_coffe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coffe.reservation_coffe.entities.RestaurantTable;
import com.coffe.reservation_coffe.services.TableServices;

@RestController
@RequestMapping("/api/tables")
public class TableController {

    @Autowired
    private TableServices tableService;

    @GetMapping
    public List<RestaurantTable> getAllRestaurantTables() {
        return tableService.getallRestaurantTables();
    }

    @PostMapping
    public RestaurantTable createTable(@RequestBody RestaurantTable table) {
        return tableService.saveTable(table);
    }
   

}
