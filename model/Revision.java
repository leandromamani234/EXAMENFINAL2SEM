package com.lem45.model;

public class Revision {
    private String codigo;
    private String filtro;
    private String aceite;
    private String frenos;

    private String matricula;

    public Revision() {
    }

    public Revision(String codigo, String filtro, String aceite, String frenos, String matricula) {
        this.setCodigo(codigo);
        this.setFiltro(filtro);
        this.setAceite(aceite);
        this.setFrenos(frenos);
        this.setMatricula(matricula);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getAceite() {
        return aceite;
    }

    public void setAceite(String aceite) {
        this.aceite = aceite;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Revicion{" +
                "codigo='" + codigo + '\'' +
                ", filtro='" + filtro + '\'' +
                ", aceite='" + aceite + '\'' +
                ", frenos='" + frenos + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
