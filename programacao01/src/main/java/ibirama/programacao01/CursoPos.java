package ibirama.programacao01;

public class CursoPos extends Curso {

    private String tipoPos;
    private String areaPes;

    public CursoPos() {}

    public void validarDissOUTese() {
        if (tipoPos.equals("Tipos de pos-graduacao")) {
            System.out.println("Validar tese: " + getNome());
        } else {
            System.out.println("Validar dissertacao: " + getNome());
        }
    }

   public String getAreaPes() {
        return areaPes;
    }

    public void setAreaPes(String _areaPes) {
        areaPes = _areaPes;
    }
  
    public String getTipoPos() {
        return tipoPos;
    }

    public void setTipoPos(String _tipoPos) {
        tipoPos = _tipoPos;
    }
}
