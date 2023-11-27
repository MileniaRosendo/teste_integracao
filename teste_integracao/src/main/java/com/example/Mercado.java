package com.example;

public class Mercado {
    private String nome;
    private int cnpj;
    private int quantColaboradores; 
    private String endereco;
    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getQuantColaboradores() {
        return quantColaboradores;
    }
    public void setQuantColaboradores(int quantColaboradores) {
        this.quantColaboradores = quantColaboradores;
    }
    private Produto produto;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    } 
    public String verificaQuantidadeColaboradores(int quantColaboradores){
        quantColaboradores = this.getQuantColaboradores();
        if (quantColaboradores > 100 ) {
            return "A empresa é grande!";
            
        }
        else{
            return "A empresa não é grande";
        }
    }
    public String verificaNomeExistente(String nome){
        nome = this.nome;
        if (nome == "Todo Dia") {
            return "Esse mercado já existe!";
        } else {
            return "Esse mercado é novo ";
        }
    }
    public String verificaEndereco(String endereco){
        endereco = this.getEndereco();
        if (endereco == null) {
            return "O endereço da loja não é válido";
        } else {
            return "O endereço da loja é válido";
        }
    }
    public String verificaProduto(Produto produto){
        produto = this.getProduto();
        if(produto == null) {
            return "O mercado não possui um produto associado.";
        } else {
            return "O mercado possui um produto associado.";
        }
    }
    
}
