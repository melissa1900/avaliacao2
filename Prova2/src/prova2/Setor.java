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
public enum Setor   {
    ENGENHARIA("Enhenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos_Humanos"),
    MARKENTING("Markenting"),
   OPERACOES("Operacoes");
   
   private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
   
   
}
