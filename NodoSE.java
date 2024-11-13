public class NodoSE <T> {

    private T dato;
    private NodoSE<T>  sig;

    public NodoSE(){
        dato = null;
        sig = null;
    }

    public T getDato(){
        return dato;
    }
    public NodoSE<T> getSig(){
        return sig;
    }
    public void setDato(T d){
        dato = d;
    }
    public void setSig(NodoSE<T> n){
        sig = n;
    }
}