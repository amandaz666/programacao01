/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ibirama.programacao01;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {

    public class professor {

        private String nome;
        private String email;
        private String areaAtu;
        private String regimeTra;
        private String titulacaoAca;
        private String formacao;
        private String telefone;
        private String siape;
        private Date dataIgresso;

        public String getNome() {
            return nome;
        }

        public void setNome(String _nome) {
            nome = _nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String _Email) {
            email = _Email;
        }

        public String getAreaAtu() {
            return areaAtu;
        }

        public void setAreaAtu(String _areaAtu) {
            areaAtu = _areaAtu;
        }

        public String getRegimeTra() {
            return regimeTra;
        }

        public void setRegimeTra(String _regimeTra) {
            regimeTra = _regimeTra;
        }

        public String getTitlacaouAca() {
            return titulacaoAca;
        }

        public void setTitulacaoAca(String _titulacaoAca) {
            titulacaoAca = _titulacaoAca;
        }

        public String getFormacao() {
            return formacao;
        }

        public void setFormacao(String _formacao) {
            formacao = _formacao;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String _telefone) {
            regimeTra = _telefone;
        }

        public void setSiape(String _siape) {
            siape = _siape;
        }

        public String getSiape() {
            return siape;
        }

        public void setDataIgresso(Date _dataIgresso) {
            dataIgresso = _dataIgresso;
        }

        public Date getDataIgresso() {
            return dataIgresso;
        }

    }
}
