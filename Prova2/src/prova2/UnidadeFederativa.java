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
public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    SAO_PAULO("Sao_Paulo", "SP"),
    RIO_DE_JANEIRO("Rio_De_Janeiro", "RJ");
    
    private final String sigla;
    private final String nome;

    private UnidadeFederativa(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    
}
