public class ListaSE<T> implements Lista<T> {
    private NodoSE<T> inicio;

    public ListaSE() {
        inicio = null;
    }

    public boolean vacia() {
        return inicio == null;
    }
    public int longitud(){
        int res=0;
        if (vacia()){
            res=0;
        }else{
            NodoSE<T> aux=inicio;
            while (aux.getSig()!=null) {
                res++;
                aux=aux.getSig();
            }
        }
        return res;
    }
    public void insertar(T d){
        NodoSE<T> nuevo = new NodoSE<>();
        nuevo.setDato(d);
        if(vacia()){
            inicio=nuevo;
        }else{
            NodoSE<T> aux=inicio;
            while(aux.getSig()!=null){
                aux= aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }
    public void insertar(T d, int pos){
        NodoSE<T> nuevo = new NodoSE<>();
        if (vacia()) {
            
        }else if
    }

}
