package Schieramenti;

public class Nodo {
    private Object info;
    private Nodo link;

    public Nodo (Object info, Nodo link){
        this.info = info;
        this.link = link;
    }

    public void setInfo(Object info){
        this.info = info;
    }

    public void setLink(Nodo link){
        this.link = link;
    }

    public Nodo getLink() {
        return link;
    }

    public Object getInfo() {
        return info;
    }

    public String toString(){
        return info + "";
    }
}