package com.company;

public class usuario {

    public void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println(" E MAIOR DE IDADE");
        } else {
            System.out.println(" Nao é maior de idade");
        }
    }

    public boolean verificarNascionalidade(boolean b) {
        if(b){
            System.out.println(" é brasileiro");
            return true;
        } else {
            System.out.println(" Nao é brasileiro");
            return false;
        }
    }
}

