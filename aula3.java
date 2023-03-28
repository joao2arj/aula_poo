package com.mycompany.contabanco;

public class ContaBanco {
    public static void main(String[] args) {
    }
    
    boolean statusConta; //Diz se a conta está fechada ou aberta;
    String tipoConta; //Tipo da conta
    int saldoConta;
    int setSaldo;
    
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
        this.statusConta = false;
    }
    
    public void setSaldo(int c){
        this.saldoConta = c;
    }
    
    public void status(){
        System.out.println("Tipo da conta: " + this.tipoConta);
        System.out.println("Saldo da conta: " + this.saldoConta);
        System.out.println(" ");
    }
}
