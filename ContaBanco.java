package com.mycompany.contabanco;

public class ContaBanco {
    public static void main(String[] args) {
    }
    
    boolean statusConta; //Diz se a conta está fechada ou aberta;
    String tipoConta; //Tipo da conta
    int saldoConta;
    int setSaldo;
    
    void setTipoConta(String tipo){
        this.tipoConta = tipo;
    }
    
    void abrirConta(){
        if(this.tipoConta == "CC"){
            this.saldoConta = this.saldoConta + 0;
        }
        else if(this.tipoConta == "CP"){
            this.saldoConta = this.saldoConta + 100;
        }
        this.statusConta = true;
    }
    
    void fecharConta(){
        if(this.saldoConta != 0){
            System.out.println("Para fechar a conta o saldo deve ser igual a 0. Seu saldo: " + this.saldoConta);
        }
        this.statusConta = false;
    }
    
    public void setSaldo(int c){
        this.saldoConta = c;
    }
    
    public void setSacar(int x){
        if(x > this.saldoConta) {
            System.out.println("A quantidade que você quer sacar é maior que o saldo disponível. Saldo disponível: " + this.saldoConta);
        }
        else{
            this.saldoConta = this.saldoConta - x;
            System.out.println("Saldo após o saque: " + this.saldoConta);
        }

    }
    
    public void setDepositar(int x){
        this.saldoConta = this.saldoConta + x;
    }
    
    public void status(){
        System.out.println("Tipo da conta: " + this.tipoConta);
        System.out.println("Saldo da conta: " + this.saldoConta);
        System.out.println(" ");
    }
}
