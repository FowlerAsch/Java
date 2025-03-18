package com.teste.first_project.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.teste.first_project.model.Produto;

public class ProdutoRepository {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();
        
    private Integer ultimoId = 0;

    /**
     * Método para retornar uma lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtos;
    }        
    

    /**
     * Método que retorna o produto encontrado pelo seu ID
     * @param id do produto que será localizado
     * @return Retorna um produto caso seja encontrado
     */
    public Optional <Produto> obterPorId(Integer id){
        return produtos
            .stream()
            .filter(produto -> produto.getId() == id)
            .findFirst();
    }


    /**
     * Método para adicionar produto na lista
     * @param produto produto que será adicionado
     * @return retorna o produto que foi adicionado na lista
     */
    public Produto adicionar(Produto produto){
        ultimoId = ultimoId + 1;
        produto.setId(ultimoId);
        produtos.add(produto);
        return produto;
    }

}