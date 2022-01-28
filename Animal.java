package LabProgra2;

public class Animal {
    //Atributos
    private  String nombrecientifico;
    private  String nombrecomun;
    private  String habitat;
    private  String alimentacion;
    private  String descripcionrasgos;
    private  int vida;

    public Animal(String nombrecientifico, String nombrecomun, String habitat, String alimentacion, String descripcionrasgos, int vida) {
        this.nombrecientifico = nombrecientifico;
        this.nombrecomun = nombrecomun;
        this.habitat = habitat;
        this.alimentacion = alimentacion;
        this.descripcionrasgos = descripcionrasgos;
        this.vida = vida;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
    }

    public  void setNombrecomun(String nombrecomun) {
        this.nombrecomun = nombrecomun;
    }

    public  void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public  void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public  void setDescripcionrasgos(String descripcionrasgos) {
        this.descripcionrasgos = descripcionrasgos;
    }

    public int getVida() {
        return vida;
    }

    public  void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "\nAnimales" +
                "\nNombre Cientifico='" + nombrecientifico +
                "\nNombre Comun='" + nombrecomun +
                "\nHabitat='" + habitat +
                "\nAlimentacion='" + alimentacion +
                "\nDescripcion de Rasgos='" + descripcionrasgos +
                "\nVida=" + vida;
    }
}
