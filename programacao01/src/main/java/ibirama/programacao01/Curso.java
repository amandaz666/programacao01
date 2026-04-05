package com.mycompany.gabriel;

public class Curso {

    private String codigo;
    private String nome;
    private int cargaHoraria;
    private int duracao;
    private String tipoDuracao;
    private String modalidade;
    private String status;

    public Curso() {}

    public void obterDisciplinas() {
        System.out.println("Obtendo disciplinas do curso: " + nome);
    }

    public void obterAlunosAtivos() {
        System.out.println("Obtendo alunos ativos do curso: " + nome);
    }

    public void obterAlunosEgressos() {
        System.out.println("Obtendo alunos egressos do curso: " + nome);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String _codigo) {
        codigo = _codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }


    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int _duracao) {
        duracao = _duracao;
    }

    public String getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(String _tipoDuracao) {
        tipoDuracao = _tipoDuracao;
    }

   public int getCargaHoraria() {
        return cargaHorariaTotal;
    }

    public void setCargaHoraria(int _cargaHoraria) {
        cargaHorariaTotal = _cargaHorariaTotal;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String _modalidade) {
        modalidade = _modalidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String _status) {
        status = _status;
    }
}
