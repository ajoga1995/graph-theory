package com.graph.response;

public class Lista3Zadanie1Response extends Response{

    private Boolean isCycle;
    private String eges;
    private String link;

    public Lista3Zadanie1Response() {
        super();
    }

    public Lista3Zadanie1Response(ResponseStatus status, ResponseCode code) {
        super(status, code);
    }

    public Lista3Zadanie1Response(ResponseStatus status, ResponseCode code, Boolean isCycle, String eges, String link) {
        super(status, code);
        this.isCycle = isCycle;
        this.eges = eges;
        this.link = link;
    }

    public Boolean getCycle() {
        return isCycle;
    }

    public void setCycle(Boolean cycle) {
        isCycle = cycle;
    }

    public String getEges() {
        return eges;
    }

    public void setEges(String eges) {
        this.eges = eges;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        if(isCycle){
            return "Lista2Zadanie2Response{ \n" +
                    "Graf jest grafem cyklicznym"+
                    "Lista krawedzi='" + eges + "\n" +
                    "Link: "+link+"\n"+
                    '}';
        }else{
            return "Lista2Zadanie2Response{" +
                    "Nie jest grafem cyklicznym" +
                    '}';
        }
    }
}
