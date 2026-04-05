package ibirama.programacao01;

public class CursoGrad extends Curso {

    private String tipoGrad;
    private boolean tccObrig;

    public CursoGrad() {}

    public void validarTCC() {
        if (tccObrig) {
            System.out.println("TCC obrigatorio: " + getNome());
        } else {
            System.out.println("TCC nao obrigatorio: " + getNome());
        }
    }

    public String getTipoGrad() {
        return tipoGrad;
    }

    public void setTipoGraduacao(String _tipoGrad) {
        tipoGrad = _tipoGrad;
    }

    public boolean getTccObrig() {
        return tccObrig;
    }

    public void setTccObrig(boolean _tccObrig) {
        tccObrig = _tccObrig;
    }
}
