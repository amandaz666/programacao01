package ibirama.programacao01;

public class CursoTec extends Curso {

    private String eixoTec;
    private int cargaHoraEstagio;

    @Override
    public void realizarMatricula() {
    
    }
    
    public CursoTec() {}
    public void verificarEstagio () {
        //verificar estágio
    }

    public boolean verificarEstagioObriga() {
        return cargaHoraEstagio > 0;
    }

    public String getEixoTec() {
        return eixoTec;
    }

    public void setEixoTec(String _eixoTec) {
        eixoTec = _eixoTec;
    }

    public void setCargaHoraEstagio(int _cargaHoraEstagio) {
        cargaHoraEstagio = _cargaHoraEstagio;
    }

    public int getCargaHoraEstagio() {
        return cargaHoraEstagio;
    }

}
