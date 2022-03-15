/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.cellF_test;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author keanu.aguilar
 */
@CrossOrigin(origins = "http://localhost:4208", maxAge = 3600)
@RestController
@RequestMapping({"/inventory"})
public class Controller {
    
    @Autowired
    InventoryService service;
    
    @GetMapping
    public List<Inventory>list(){
        return service.list();
    }
    
    @PostMapping
    public  Inventory add(@RequestBody Inventory i){
        return service.add(i);
    }
    
}
