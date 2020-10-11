/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;
import br.sistemalojaroupas.model.dao.ProdutoDao;
import javax.swing.JOptionPane;


public class App {
    
    public static void main(String[] args) {
        DB.iniciar();
        
        
        ProdutoDao pd = new ProdutoDao();
        String modelo, tamanho, cor;
        Double preco;
        int quantidade;
        
        modelo = JOptionPane.showInputDialog(null, "Insira o modelo: ");
        tamanho = JOptionPane.showInputDialog(null, "Insira o tamanho: ");
        cor = JOptionPane.showInputDialog(null, "Insira a cor: ");
        preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o preço: "));
        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quantidade: "));
        
        pd.cadastrarProduto(modelo, tamanho, cor, preco, quantidade);
        DB.fechar();
//        System.out.println(pd.procurarProduto());
    }
}
