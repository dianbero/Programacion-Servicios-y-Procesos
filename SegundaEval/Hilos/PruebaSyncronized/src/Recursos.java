import java.util.ArrayList;

public class Recursos {
    //Aquí el array donde se guardan los recursos
    private ArrayList<Integer> lista;

    public Recursos() {
        lista = new ArrayList<>();
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Integer> lista) {
        this.lista = lista;
    }
}
