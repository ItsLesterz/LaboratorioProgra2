package LabProgra2;

import java.util.ArrayList;

public class Animales {
    private static boolean verificar=false;
    private static ArrayList<Animal>listaAnimales=new ArrayList<>();

    public static void verify(String nombrecientifico){
        for (int i=0; i< listaAnimales.size();i++){
            if(listaAnimales.get(i).getNombrecientifico().equals(nombrecientifico)){
                verificar=true;
            }
        }
    }

    public static void registrarAnimal(Animal animal){
        if(!verificar){
            listaAnimales.add(animal);
        }else{
            System.out.println("El animal ya existe!");
        }
    }
}