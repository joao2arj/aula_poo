
package com.mycompany.contabanco;

public class conta1 {
    
    public static void main(String[] args){
        ContaBanco conta1 = new ContaBanco();
        conta1.tipoConta = "CP";
        conta1.setSaldo(200);
        conta1.abrirConta();
        conta1.status();

    }
    
}
