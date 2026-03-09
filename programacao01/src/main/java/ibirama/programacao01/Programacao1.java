/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ibirama.programacao01;
import java.util.Date;

public class Programacao1 {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
   
    public Programacao1 (){
        setNome ("Rafael");
        nome = "Nobody";
       
    }
    private int obterIdade (Date hoje){
        int idade =0;
        //logica de calculo de idade
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String _nome){
        nome = _nome;
    }
    public Date getdataNascimento(){
        return dataNascimento;
    }
    public void setdataNascimento(Date _dataNascimento){
        dataNascimento = _dataNascimento;
    }
    public String getcpf(){
        return cpf;
    }
    public void setcpf(String _cpf){
        cpf = _cpf;
    }
   public char getGenero (){
       return genero;
   }
   public void setGenero (char _genero) {
       genero = _genero;
   }
   public String getMatricula (){
       return matricula;
   }
   public void setMatricula (String _matricula){
       matricula = _matricula;
   }
    public String getEmail (){
       return email;
   }
   public void setEmail (String _email){
       email = _email;
   }
}

