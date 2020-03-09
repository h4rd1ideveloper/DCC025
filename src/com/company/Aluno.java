package com.company;

public class Aluno {
    private String Nome;
    private String Matricula;
    private String CPF;
    Aluno(String nome, String Matricula, String CPF){
        setNome(nome);
        setMatricula(Matricula);
        setCPF(CPF);
    }
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public String Info(){
        return "Nome: "+getNome()+"\n"+"Matricula: "+getMatricula()+"\n"+"CPF: "+getCPF()+"\n";
    }
}
