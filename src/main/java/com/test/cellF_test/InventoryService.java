/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.cellF_test;

import java.util.*;

/**
 *
 * @author keanu.aguilar
 */
public interface InventoryService {
    List<Inventory>list();
    Inventory add(Inventory i);
    Inventory delete(int id);
    Inventory listId(int id);
    Inventory update(Inventory i);
}
