package com.graph.response;

public class Lista2Zadanie1Response extends Response{

    private Boolean isRegular;
    private Integer deg;

    public Lista2Zadanie1Response() {
        super();
    }

    public Lista2Zadanie1Response(ResponseStatus status, ResponseCode code) {
        super(status, code);
    }

    public Lista2Zadanie1Response(ResponseStatus status, ResponseCode code, Boolean isRegular, Integer deg) {
        super(status, code);
        this.isRegular = isRegular;
        this.deg = deg;
    }

    public Boolean getRegular() {
        return isRegular;
    }

    public void setRegular(Boolean regular) {
        isRegular = regular;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        if(isRegular){
            return "Lista2Zadanie1Response{ \n" +
                    "Graf jest regularny \n" +
                    ",Stopnia :" + deg +
                    '}';
        }else {
            return "Lista2Zadanie1Response{ \n" +
                    "Graf nie jest regularny" +
                    '}';
        }
    }
}
