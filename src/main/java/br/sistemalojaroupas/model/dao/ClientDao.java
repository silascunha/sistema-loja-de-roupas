/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.model.dao;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.entities.Client;
import br.sistemalojaroupas.model.entities.TableContract;
import java.util.Collection;
import java.util.List;
import org.dizitart.no2.FindOptions;
import org.dizitart.no2.SortOrder;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;

/**
 *
 * @author vfdes
 */
public class ClientDao {

    private static ObjectRepository<Client> repClient;

    static {
        repClient = DB.getDB().getRepository(Client.class);
    }

    public static void insert(Client obj) {
        repClient.insert(obj);

    }

    public static void update(Client obj) {
        repClient.update(obj);
    }

    public static List<Client> findAll() {
        FindOptions ab = FindOptions.sort("nome", SortOrder.Ascending);
        List<Client> listClient = repClient.find().toList();
        return listClient;

    }

    public static Client findByCpf(String cpf) {
        Client emp = repClient.find(ObjectFilters.eq("cpf", cpf)).firstOrDefault();
        return emp;

    }

    public static void remove(Client emp) {
        repClient.remove(emp);
    }

    public static List<Client> search(String searchClient) {
        String str = searchClient.toUpperCase();

        List<Client> list = repClient.find(ObjectFilters.or(
                ObjectFilters.regex("nome", str),
                ObjectFilters.eq("cpf", str)),
                FindOptions.sort("nome", SortOrder.Ascending))
                .toList();
        return list;
    }

}
