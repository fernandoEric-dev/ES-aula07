import java.util.ArrayList;
import java.util.List;

public class No<T>{
    private T valor;
    private List<No<T>> filhos;

    public No(T valor){
        this.valor = valor;
        this.filhos = new ArrayList<>();
    }
    // ... o restante dos métodos está OK
    public T getValor(){
        return valor;
    }

    public List<No<T>> getFilhos(){
        return filhos;
    }
    
    public void addFilho(No<T> f){
        filhos.add(f);
    }
}