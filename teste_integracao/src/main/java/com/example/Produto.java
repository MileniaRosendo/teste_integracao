package com.example;

public class Produto {
    private String nome;
    private String marca;
    private int id;
    private double preco;
    public Produto() {
    }
    public Produto(String nome, String marca, int id, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.id = id;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String verificaMarca(String marca){
            marca = this.getMarca();
        if (marca != null) {
         return   "A marca não é nula";
        }
        else {
            return "A marca é nula";
        }

    }
    public String verificaPreco(double preco){
        preco = this.getPreco();
        if (preco > 0) {
            return "O preço não é negativo";
        }
        else {
            return "O preço é negativo";
        }
    }

    public String verificaNome(String nome,String marca){
        nome = this.getNome();
        marca = this.getMarca();
        if (nome == marca) {
            return "A marca é igual ao nome do produto";
        }
        else{
            return "O produto não tem o mesmo nome da marca";
        }
    }
    public String verificaPrecoPopular(double preco){
        preco = this.getPreco();
        if (preco > 100) {
            return "O preço não é popular"; 
        }
        else{
            return "O preço é popular";
        }

    }
    public String verificaId(int id){

        id = this.getId();

        if(id != 0){
            return "O id não é nulo";

        }
        else{
            return "O id é nulo";
        }



    }

    
}

