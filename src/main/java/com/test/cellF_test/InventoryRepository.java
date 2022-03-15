/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.cellF_test;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author keanu.aguilar
 */
public interface InventoryRepository extends Repository<Inventory, Integer> {
    List<Inventory>findAll();
    Inventory findOne(int id);
    Inventory save(Inventory i);
    void delete(Inventory i);
}
