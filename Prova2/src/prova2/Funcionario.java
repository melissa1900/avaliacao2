/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Endereco endereco;
    protected Setor setor;
    protected Genero genero;
    protected double salario;
    protected EstadoCivil estadocivil;
    protected LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.setor = setor;
        this.genero = genero;
        this.salario = salario;
        this.estadocivil = estadocivil;
        this.dataNascimento = dataNascimento;
    }
     public int getIdade() {
       return Period.between(dataNascimento, LocalDate.now()).getYears();
     
               }            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        return "Funcionario{"
                + "\n +nome: =" + nome +
                " \n cpf: =" + cpf + 
                " \n rg: =" + rg + 
                " \n endereco: =" + endereco + 
                "\n setor: =" + setor + 
                " \n genero: =" + genero + 
                " \n salario: =" + Util.formatarDinheiro(salario) + 
                " \n estadocivil: =" + estadocivil + 
            " \n dataNascimento: =" + Util.formatarData(dataNascimento) + '}';
        
       
    }
    
    
}
