/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Motoboy motoboy = new Motoboy("145445485", "aline", "5455458232", "51441512521", new Endereco("casa", "27", "rua negra", "158445541", "Salvador", UnidadeFederativa.BAHIA)  , Setor.SAUDE, Genero.FEMININO, 23, EstadoCivil.CASADO, LocalDate.of(2003, Month.MAY, 02));
      Engenheiro engenheiro = new Engenheiro("554415415", "gabriel", "145054545", "4544145441", new Endereco("casa", "12", "atras do predio 02", "2451545", "Salvador", UnidadeFederativa.BAHIA) , Setor.ENGENHARIA, Genero.MASCULINO, 32, EstadoCivil.CASADO, LocalDate.of(1947, Month.MARCH, 02));
       Diretor diretor = new Diretor("Lucas", "445441411", "55451554", new Endereco("Apartamento", "25", "proximo a loja da flor", "44455414", "Salvador", UnidadeFederativa.BAHIA) , Setor.SAUDE, Genero.FEMININO, 32, EstadoCivil.CASADO, LocalDate.of(1945, Month.MARCH, 04));

       
            
    }
    
    
}
