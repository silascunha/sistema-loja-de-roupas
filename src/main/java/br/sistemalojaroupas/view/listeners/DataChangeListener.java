/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.view.listeners;

import br.sistemalojaroupas.model.entities.TableContract;
import java.util.List;

/**
 *
 * @author silas
 */
public interface DataChangeListener {
    
    void onDataChanged(List<? extends TableContract> tableList);
    
}
