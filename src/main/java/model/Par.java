/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.google.gson.Gson;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import util.Util;

/**
 *
 * @author Administrador
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Par {

    private String chave;
    private Object valor;
    private Par pai;
 
    public String toJason(){
        String retorno =  Util.EntreAspas(chave);
        retorno += " : ";
        
        if(valor.getClass() == Integer.class){
            retorno+= valor;
        }else  if(valor.getClass() == Long.class){
            retorno+= valor;
        } else if(valor.getClass() == Float.class){
            retorno+= valor;
        } else if(valor.getClass() == Double.class){
            retorno+= valor;
        }else{
            retorno+= Util.EntreAspas(valor.toString()) ;
        }
        return retorno;
    }
 
    public Par toPar(String json){
        json = json.replace("{","");
        json = json.replace("}","");
        
        
        String[] s = json.split(":");
        
        s[0]=s[0].replace("\"","");
        Par p = new Par(s[0].trim(),s[1].trim(),null);
        return p;
    
    }
    
    public List<Par> listaPar(String json, String element){
        Gson gson = new Gson();
        gson.to
    
    }
    
    
}
