package br.edu.unisep.ex04_lista04;

public class Produto {

    private String nome_produto;

    private double preco_produto;
    private double preco_menor;

    public double CompararValor(double valor_merc1,double valor_merc2,double valor_merc3){
        if ((valor_merc1 < valor_merc2) && (valor_merc1 < valor_merc3)){
            return valor_merc1;
        } else if ((valor_merc2 < valor_merc1) && (valor_merc2 < valor_merc3)){
            return valor_merc2;
        } else{
            return valor_merc3;
        }
    }

    Produto(){

    }

    public Produto(String nome_produto, double preco_produto, double preco_menor) {
        this.nome_produto = nome_produto;
        this.preco_produto = preco_produto;
        this.preco_menor = preco_menor;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public double getPreco_menor() {
        return preco_menor;
    }

    public void setPreco_menor(double preco_menor) {
        this.preco_menor = preco_menor;
    }
}
