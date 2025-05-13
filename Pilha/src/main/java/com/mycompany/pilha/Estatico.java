/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

import java.util.Arrays;

public class Estatico<T>  {
    protected T[] array;
    protected int tamanho;
    
   public Estatico(int tamanho){
       this.array=(T[]) new Object[tamanho];
       this.tamanho=0;
   }
   
   public int tamanho(){
        return this.tamanho;
    }
   
   
    public void aumentartamanho(){
        
        if(this.tamanho==array.length-1){
            T[] vetornovo =(T[]) new Object[array.length*2];
            for(int i=0;i<=this.tamanho;i++){
                vetornovo[i]=this.array[i];
            }
            this.array=vetornovo;
        }
    }
    public void remove(int posicao){
        
        if(posicao<this.tamanho){
            
            this.array[posicao]=null;
            for(int a=posicao;a<this.tamanho;a++){
                this.array[a]=this.array[a+1];
            }
            
            this.tamanho--;
            
        }else{
            System.out.println("N foi possivel remover");
        }
        
    }
    protected boolean adicionarEmPosicao(int posicao,T elemento){
        
        this.aumentartamanho();
        
        if(this.tamanho<this.array.length && posicao>=0 && posicao<this.array.length && posicao<=tamanho){
            
            for(int i=this.tamanho;i>=posicao;i--){
                this.array[i+1]=this.array[i];
            }
            
            this.array[posicao]=(T) elemento;
            tamanho++;
            System.out.println("adicionado");
            return true;
            
        }
        
        System.out.println("N adicionado");
        return false;
        
    }

    @Override
    public String toString() {
        return "Est\u00e1tico{" + "array=" + Arrays.toString(array) + ", tamanho=" + tamanho + '}';
    }
}
