
import java.util.Date;

public class Estudante {
    //Estudante
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String nivelEnsino;
    private String telefone;
    
    //Acadêmico
    private int anoIngresso;
    private int semetreIngresso;
    private String situacaoAcademica;
    private String numero;
    private String codigoMatricula;

    public Estudante() {
        setNome("Rafael");
        nome = "Nobody";
    }

    private int obterIdade(Date hoje) {
        int idade = 0;
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public Date getIdade() {
        return dataNascimento;
    }

    public void setIdade(Date _idade) {
        dataNascimento = _idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String _cpf) {
        cpf = _cpf;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char _genero) {
        genero = _genero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String _matricula) {
        matricula = _matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public String getNivel() {
        return nivelEnsino;
    }

    public void setNivel(String _nivelEnsino) {
        nivelEnsino = _nivelEnsino;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String _telefone) {
        telefone = _telefone;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int _anoIngresso) {
        anoIngresso = _anoIngresso;
    }

    public int getSemetreIngresso() {
        return semetreIngresso;
    }

    public void setSemetreIngrsso(int _semetreIngresso) {
        semetreIngresso = _semetreIngresso;
    }

    public String getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setSituacaoAcademica(String _situacaoAcademica) {
        situacaoAcademica = _situacaoAcademica;
    }

    public String getCodigoMatricula() {
        return String.valueOf(anoIngresso)+String.valueOf(semetreIngresso)+numero;
    }

    public void setNumero(String _numero) {
        numero = _numero;
    }
    
}