package LabProgra2;

public class Animal {
    //Atributos
    private static String nombrecientifico;
    private static String nombrecomun;
    private static String habitat;
    private static String alimentacion;
    private static String descripcionrasgos;
    private static int vida;

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
        Animal.nombrecientifico = nombrecientifico;
    }

    public String getNombrecomun() {
        return nombrecomun;
    }

    public static void setNombrecomun(String nombrecomun) {
        Animal.nombrecomun = nombrecomun;
    }

    public static String getHabitat() {
        return habitat;
    }

    public static void setHabitat(String habitat) {
        Animal.habitat = habitat;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public static void setAlimentacion(String alimentacion) {
        Animal.alimentacion = alimentacion;
    }

    public String getDescripcionrasgos() {
        return descripcionrasgos;
    }

    public static void setDescripcionrasgos(String descripcionrasgos) {
        Animal.descripcionrasgos = descripcionrasgos;
    }

    public int getVida() {
        return vida;
    }

    public static void setVida(int vida) {
        Animal.vida = vida;
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
