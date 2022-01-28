package LabProgra2;

import java.util.ArrayList;
import java.util.Scanner;

public class Animales {
    public static Scanner leer=new Scanner(System.in);
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
            System.out.println("El animal existente!");
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
                switch(opcion){
                    case 1:
                        System.out.print("Ingrese el nuevo nombre cientifico: ");
                    Animal.setNombrecientifico(leer.next());
                    System.out.print("Ingrese el nuevo nombre comun: ");
                    Animal.setNombrecomun(leer.next());
                    System.out.print("Ingrese el nuevo Habitat: ");
                    Animal.setHabitat(leer.next());
                    System.out.print("Ingrese la nueva Alimentacion: ");
                    Animal.setAlimentacion(leer.next());
                    System.out.print("Ingrese la descripcion de rasgos: ");
                    Animal.setDescripcionrasgos(leer.next());
                    System.out.print("Ingrese la nueva cantidad de vida: ");
                    Animal.setVida(leer.nextInt());
                    System.out.print("Se han editado los datos del animal");
                    break;
                    case 2:
                        System.out.print("\nSeleccione lo que desea editar:" +
                                "\n (1). Nombre Cientifico"+"\n (2). Nombre Comun" +
                                "\n(3). Habitat" + "\n(4).Alimentacion" +
                                "\n(5).Rasgos"+"\n(6).Vida");
                        int opcion2 = leer.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.print("Ingrese el nuevo nombre cientifico: ");
                                Animal.setNombrecientifico(leer.next());
                                break;
                            case 2:
                                System.out.print("Ingrese el nuevo nombre comun: ");
                                Animal.setNombrecomun(leer.next());
                                break;
                            case 3:
                                System.out.print("Ingrese el nuevo Habitat: ");
                                Animal.setHabitat(leer.next());
                                break;
                            case 4:
                                System.out.print("Ingrese la nueva Alimentacion: ");
                                Animal.setAlimentacion(leer.next());
                                break;
                            case 5:
                                System.out.print("Ingrese la descripcion de rasgos: ");
                                Animal.setDescripcionrasgos(leer.next());
                                break;
                            case 6:
                                System.out.print("Ingrese la nueva cantidad de vida: ");
                                Animal.setVida(leer.nextInt());
                                break;
                            default:
                                System.out.println("Opcion invalida!");
                                break;
                        }
                        break;
                        default:
                            System.out.println("El animal no existe!");
                        break;
                }
            }
        }

    }
    public static void imprimirAnimales(){
        System.out.print("\nListar Animales" +
                "\n (1). Imprimir por posicion de la lista" +
                "\n(2). Imprimir Lista Completa" +
                "\n(3). Imprimir por Nombre Cientifico");
        System.out.print("SELECCIONE UNA OPCION: ");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                System.out.print("Ingrese la posicion del animal que desea imprimir: ");
                System.out.print("Ingrese un numero del 0 al "+listaAnimales.size()+ ":");
                int posicion =leer.nextInt();
                for (int i=0;i<listaAnimales.size();i++){
                    if(i==posicion){
                        System.out.println(listaAnimales.get(i));
                    }else{
                        System.out.println("El animal no existe!");
                    }
                }
                break;
            case 2:
                for (Animal listaAnimale:listaAnimales)
                    System.out.println(listaAnimale);
                break;
            case 3:
                System.out.print("Ingrese el Nombre Cientifico del animal que desea imprimir: ");
                String nombrecientifico=leer.next();
                for (int i=0;i<listaAnimales.size();i++){
                    if(listaAnimales.get(i).getNombrecientifico().equals(nombrecientifico)){
                        System.out.println(listaAnimales.get(i));
                    }
                }
                break;

            default:
                System.out.println("Nombre Invalido!");
                break;
        }

    }
    public static void cadenaAlimenticia(){
        System.out.println("Selecciones el animal que desea alimentar:");
        for(int i=0;i<listaAnimales.size();i++){
            System.out.println(i + ". " + listaAnimales.get(i).getNombrecientifico());
        }
        System.out.println();
    }

}