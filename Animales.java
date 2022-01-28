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
    public static void editAnimalCientifico(String nombrecientifico){
        for (int i=0; i<listaAnimales.size();i++){
            if (listaAnimales.get(i).getNombrecientifico().equals(nombrecientifico)){
                System.out.print("Desea editar los datos?" +
                        "\n (1). Editar todos los datos" +
                        "\n(2). Editar solo un dato");
                System.out.print("SELECCIONE UNA OPCION: ");
                int opcion = leer.nextInt();
            }
        }

    }

}