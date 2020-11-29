/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Customer;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author vfdes
 */
public class CustomerDao {

    private static ObjectRepository<Customer> repClient;

    static {
        repClient = DB.getDB().getRepository(Customer.class);
    }

    public static void insert(Customer obj) {
        repClient.insert(obj);

    }

    public static void update(Customer obj) {
        repClient.update(obj);
    }

    public static List<Customer> findAll() {
        FindOptions fo = FindOptions.sort("name", SortOrder.Ascending);
        List<Customer> listClient = repClient.find(fo).toList();
        return listClient;

    }

    public static Customer findByCpf(String cpf) {
        Customer emp = repClient.find(ObjectFilters.eq("cpf", cpf)).firstOrDefault();
        return emp;

    }

    public static void remove(Customer emp) {
        repClient.remove(emp);
    }

    public static List<Customer> search(String searchClient) {
        String str = searchClient.toUpperCase();

        List<Customer> list = repClient.find(ObjectFilters.or(
                ObjectFilters.regex("name", str),
                ObjectFilters.eq("cpf", str)),
                FindOptions.sort("name", SortOrder.Ascending))
                .toList();
        return list;
    }

}
