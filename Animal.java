package LabProgra2;

public class Animal {
    //Atributos
    private String nombrecientifico;
    private String nombrecomun;
    private String habitat;
    private String alimentacion;
    private String descripcionrasgos;
    private int vida;

    public Animal(String nombrecientifico, String nombrecomun, String habitat, String alimentacion, String descripcionrasgos, int vida) {
        Animal.nombrecientifico = nombrecientifico;
        Animal.nombrecomun = nombrecomun;
        Animal.habitat = habitat;
        Animal.alimentacion = alimentacion;
        Animal.descripcionrasgos = descripcionrasgos;
        Animal.vida = vida;
    }

    public String getNombrecientifico() {
        return nombrecientifico;
    }

    public static void setNombrecientifico(String nombrecientifico) {
        this.nombrecientifico = nombrecientifico;
    }

    public String getNombrecomun() {
        return nombrecomun;
    }

    public static void setNombrecomun(String nombrecomun) {
        this.nombrecomun = nombrecomun;
    }

    public static String getHabitat() {
        return habitat;
    }

    public static void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public static void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDescripcionrasgos() {
        return descripcionrasgos;
    }

    public static void setDescripcionrasgos(String descripcionrasgos) {
        this.descripcionrasgos = descripcionrasgos;
    }

    public int getVida() {
        return vida;
    }

    public static void setVida(int vida) {
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
