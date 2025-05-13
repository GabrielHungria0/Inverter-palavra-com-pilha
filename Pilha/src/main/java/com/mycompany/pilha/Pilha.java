/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;


public class Pilha<T> extends Estatico{
    
    public Pilha(int tamanho) {
        super(tamanho);
    }
    
    public void push(T elemento){
        if(this.tamanho<=this.array.length){
            this.array[this.tamanho]=elemento;
        }
        this.tamanho++;
    }
    public void pop(){
        if(!(this.vazia())){
            this.array[this.tamanho-1]=null;
        }
        this.tamanho--;
    }
    public boolean vazia(){
        return this.tamanho==0;
    }
    public T elementoDoTopo(){
        if(!(this.vazia())){
          return  (T) this.array[this.tamanho-1];
        }
        return null; 
    }
}
