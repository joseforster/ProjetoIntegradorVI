/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author forster
 */
public class ProdutoModel {
    private int id;
    private String descricao;
    private double valorVenda;
    private double estoqueMinimo;

    public ProdutoModel(int id, String descricao, double valorVenda, double estoqueMinimo) {
        this.id = id;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.estoqueMinimo = estoqueMinimo;
    }

    public ProdutoModel(String descricao, double valorVenda, double estoqueMinimo) {
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.estoqueMinimo = estoqueMinimo;
    }

    public ProdutoModel(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(double estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }
    
    
}
