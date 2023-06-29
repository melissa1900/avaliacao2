/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author Aluno
 */
public enum Genero  {
    MASCULINO("Masculino", "M"),
    FEMININO("Feminino", "F");
    
    private final String texto;
    private final String caracter;

    private Genero(String texto, String caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public String getTexto() {
        return texto;
    }

    public String getCaracter() {
        return caracter;
    }

   
    
    
    
    
    
    }
    
  

    


