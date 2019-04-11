package com.graph.response;

public class Lista1Zadanie2Response {

    private String graphOrder;
    private String graphSize;
    private String graphVertexDeg;
    private String seriesDegGraph;


    public String getGraphOrder() {
        return graphOrder;
    }

    public void setGraphOrder(String graphOrder) {
        this.graphOrder = graphOrder;
    }

    public String getGraphSize() {
        return graphSize;
    }

    public void setGraphSize(String graphSize) {
        this.graphSize = graphSize;
    }

    public String getGraphVertexDeg() {
        return graphVertexDeg;
    }

    public void setGraphVertexDeg(String graphVertexDeg) {
        this.graphVertexDeg = graphVertexDeg;
    }

    public String getSeriesDegGraph() {
        return seriesDegGraph;
    }

    public void setSeriesDegGraph(String seriesDegGraph) {
        this.seriesDegGraph = seriesDegGraph;
    }

    @Override
    public String toString() {
        return "Lista1Zadanie2Response{"+"\n"+
                "Rząd grafu G wynosi " + graphOrder + '\n' +
                "Rozmiar grafu G wynosi " + graphSize + '\n' +
                "Stopnie wierzcholkow \n" + graphVertexDeg + '\n' +
                "Ciag stopni grafu G: " + seriesDegGraph + '\n' +
                "}";
    }
}