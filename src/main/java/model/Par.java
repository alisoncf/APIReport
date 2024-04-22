/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import util.Util;

/**
 *
 * @author Administrador
 */

public class Par {

    private String chave;
    private Object valor;
    private Par pai;
    public  Par() {
        
    }
    public Par(String chave, Object object, Par pai) {
        this.chave=chave;
        this.valor=object;
        this.pai=pai;
        
    }
    public Par(String chave, Object object) {
        this.chave=chave;
        this.valor=object;
        
    }
    public String toJason(){
        String retorno =  Util.EntreAspas(getChave());
        retorno += " : ";
        
        if(getValor().getClass() == Integer.class){
            retorno+= getValor();
        }else  if(getValor().getClass() == Long.class){
            retorno+= getValor();
        } else if(getValor().getClass() == Float.class){
            retorno+= getValor();
        } else if(getValor().getClass() == Double.class){
            retorno+= getValor();
        }else{
            retorno+= Util.EntreAspas(getValor().toString()) ;
        }
        return retorno;
    }
 
    public Par toPar(String json){
        json = json.replace("{","");
        json = json.replace("}","");
        
        
        String[] s = json.split(":");
        
        s[0]=s[0].replace("\"","");
        Par p = new Par(s[0].trim(),s[1].trim());
        return p;
    
    }
    
    public List<Par> listaPar(String json, String element){
        Gson gson = new Gson();
//        gson.to
        return new ArrayList<>();
    }

    /**
     * @return the chave
     */
    public String getChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(String chave) {
        this.chave = chave;
    }

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @return the pai
     */
    public Par getPai() {
        return pai;
    }

    /**
     * @param pai the pai to set
     */
    public void setPai(Par pai) {
        this.pai = pai;
    }
    
    
}
