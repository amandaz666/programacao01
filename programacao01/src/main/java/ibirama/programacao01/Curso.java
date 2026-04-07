package ibirama.programacao01;

public abstract class Curso {

    private String nome;
    private String codigo;
    private String tipoDuracao;
    private int cargaHoraria;
    private int duracaoTSA;
    private String modalidadePE;
    private String statusAI;
    private List<Disciplina> disciplina = new ArrayList<Disciplina>();

    public Curso() {}
    public abstract void realizarMatricula ();

    public void obterDisciplinas() {
        System.out.println("Obter disciplinas curso: " + nome);
    }

    public void obterAlunosAtivos() {
        System.out.println("Obter alunos ativos: " + nome);
    }

    public void obterAlunosEgressos() {
        System.out.println("Obter alunos egressos: " + nome);
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


    public int getDuracaoTSA() {
        return duracao;
    }

    public void setDuracaoTSA(int _duracaoTSA) {
        duracaoTSA = _duracaoTSA;
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

    public String getModalidadePE() {
        return modalidade;
    }

    public void setModalidadePE(String _modalidadePE) {
        modalidadePE = _modalidadePE;
    }

    public String getStatusAI() {
        return statusAI;
    }

    public void setStatusAI(String _statusAI) {
        statusAI = _statusAI;
    }
}
