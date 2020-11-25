/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.entities.util;

import br.sistemalojaroupas.model.dao.ProductDao;
import org.dizitart.no2.objects.Id;

/**
 *
 * @author silas
 */
public class ProductCode {
    
    @Id
    private final Integer id = 1;
    private Long lastCode;

    public ProductCode() {
        if (ProductDao.getProductRepository().size() == 0) {
            this.lastCode = 0L;
        }
    }
    
    public Long getLastCode() {
        return lastCode;
    }

    public void setLastCode(Long lastCode) {
        this.lastCode = lastCode;
    }
    
}
