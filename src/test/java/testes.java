
import model.Par;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Par par = new Par("Valor",1.78, null);
        
        
        System.out.println( par.toJason() );
        
        String j = "{" + util.Util.EntreAspas("id") + " : 1.78}";
        
        par = par.toPar(j);
        
        System.out.println(par);
        
        System.out.println( par.toJason() );
        
    }
    
    
    
    
    
}
