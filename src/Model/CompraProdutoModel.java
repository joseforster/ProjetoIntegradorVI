/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author forster
 */
public class CompraProdutoModel {
    private CompraModel compra;
    private ProdutoModel produto;
    private Date validade;
    private double quantidade;
    private double valorUnitario;
    private double valorTotal;
    private DepositoAreaModel depositoArea;

    public CompraProdutoModel(CompraModel compra, ProdutoModel produto, double quantidade, double valorUnitario, DepositoAreaModel depositoArea, Date validade) {
        this.compra = compra;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorUnitario * quantidade;
        this.depositoArea = depositoArea;
        this.validade = validade;
    }

    public CompraModel getCompra() {
        return compra;
    }

    public void setCompra(CompraModel compra) {
        this.compra = compra;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public DepositoAreaModel getDepositoArea() {
        return depositoArea;
    }

    public void setDepositoArea(DepositoAreaModel depositoArea) {
        this.depositoArea = depositoArea;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    
    
    
}
