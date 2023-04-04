package com.mycompany.lanchonete;

public class Lanchonete {
    public String sabor;
    public String metodoPagamento;
    public int idPedido;
    public int valor;
    public boolean cpf;
    
    void cpfNota(){
        this.cpf = true;
        System.out.println("Sim");
    }
    
    void resumoPedido() {
        System.out.println("ID do pedido:" + this.idPedido);
        
        
    }
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
