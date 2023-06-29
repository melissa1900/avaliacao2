/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
     private double PREMIO = 0.3;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" + "PREMIO=" + PREMIO + '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario");
    }

    @Override
    public void demitir(Funcionario funcionairo) {
        System.out.println("Demitindo funcionario");
    }

 
  
        
     
}

