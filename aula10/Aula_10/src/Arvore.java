public class Arvore<T> {
    private No<T> raiz;
 
    public Arvore(T raiz){
        this.raiz = new No<> (raiz);
 
    }
 
    public No<T> getRaiz(){
        return raiz;
    }
 
    public void preOrdem(){
        pre(raiz);
    }
 
    public void pre(No<T> no){
        if (no == null)
            return;
        System.out.println(no.getValor());
        for(No<T> f : no.getFilhos()) pre(f);
    }
 
    public void pos(No<T> no){
        if (no == null)
            return;
        for(No<T> f: no.getFilhos())
            pos(f);
        System.out.println(no.getValor()+ " ");
    }
    public void posOrdem() {
        pos(raiz);
    }
}