package LabProgra2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Animales {

    public static Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private static int vidaA;//Alimentar animal
    private static int vidaD;//Devorar animal
    public static int posicionA;
    public static int posicionD;
    private static boolean verificar=false;
    private static ArrayList<Animal>listaAnimales=new ArrayList<>(10);

    public static void animaldefecto(){
        //3 animales por defecto
        Animal animal1 = new Animal("Acinonyx jubatus","Guepardo","Sabana Africana","Carnivoro","Es un felino de gran tamaño: mide entre 110 y 150 cm de longitud, a lo cual hay que añadir una cola de entre 55 a 80 cm",125);
        listaAnimales.add(animal1);
        Animal animal2 = new Animal("Canis lupus","Lobo","Artico","Carnivoro","Son animales cuadrúpedos, mamíferos, con cuerpos de entre 60 y 90 cm de alto y un peso de entre 32 y 70 kg. Suelen medir entre 1,30 y 2 metros de largo",90);
        listaAnimales.add(animal2);
        Animal animal3 = new Animal("Felis catus","Gato","Domestico","Omnivoro","Mamífero de la familia de los félidos , digitígrado , doméstico , de unos 50 cm de largo desde la cabeza hasta el arranque de la cola , que por sí sola mide unos 20 cm, de cabeza redonda",25);
        listaAnimales.add(animal3);
    }

    public static void verify(String nombrecientifico){
        for (int i=0; i< listaAnimales.size();i++){
            if(listaAnimales.get(i).getNombrecientifico().equals(nombrecientifico)){
                verificar=false;
            }
        }
    }

    public static void registrarAnimal(String nombrecientifico){
        if(!verificar){
            System.out.println("Ingrese el nombre comun del animal: ");
            String nombrecomun=leer.next().toLowerCase();
            System.out.println("Ingrese el habitat del animal: ");
            String habitat=leer.next();
            System.out.println("Ingrese la alimentacion del animal: ");
            String alimentacion=leer.next().toLowerCase();
            System.out.println("Ingrese rasgos del animal: ");
            String rasgos=leer.next().toLowerCase();
            System.out.println("Ingrese la vida: ");
            int vida=leer.nextInt();
            Animal animal = new Animal(nombrecientifico, nombrecomun,habitat,alimentacion,rasgos,vida);
            listaAnimales.add(animal);
            System.out.println("Animal registrado!");

        }else{
            System.out.println("El animal es existente!");
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
                        listaAnimales.get(i).setNombrecientifico(leer.next().toLowerCase());
                    System.out.print("Ingrese el nuevo nombre comun: ");
                        listaAnimales.get(i).setNombrecomun(leer.next().toLowerCase());
                    System.out.print("Ingrese el nuevo Habitat: ");
                        listaAnimales.get(i).setHabitat(leer.next().toLowerCase());
                    System.out.print("Ingrese la nueva Alimentacion: ");
                        listaAnimales.get(i).setAlimentacion(leer.next().toLowerCase());
                    System.out.print("Ingrese la descripcion de rasgos: ");
                        listaAnimales.get(i).setAlimentacion(leer.next().toLowerCase());
                    System.out.print("Ingrese la nueva cantidad de vida: ");
                        listaAnimales.get(i).setVida(leer.nextInt());
                    System.out.print("Se han editado los datos del animal");
                    break;
                    case 2:
                        System.out.print("\nSeleccione lo que desea editar:" +
                                "\n(1). Nombre Cientifico"+"\n(2). Nombre Comun" +
                                "\n(3). Habitat" + "\n(4).Alimentacion" +
                                "\n(5).Rasgos"+"\n(6).Vida");
                        System.out.println("SELECCIONE OPCION: ");
                        int opcion2 = leer.nextInt();
                        switch(opcion2){
                            case 1:
                                System.out.print("Ingrese el nuevo nombre cientifico: ");
                                listaAnimales.get(i).setNombrecientifico(leer.next().toLowerCase());
                                break;
                            case 2:
                                System.out.print("Ingrese el nuevo nombre comun: ");
                                listaAnimales.get(i).setNombrecomun(leer.next().toLowerCase());
                                break;
                            case 3:
                                System.out.print("Ingrese el nuevo Habitat: ");
                                listaAnimales.get(i).setHabitat(leer.next().toLowerCase());
                                break;
                            case 4:
                                System.out.print("Ingrese la nueva Alimentacion: ");
                                listaAnimales.get(i).setAlimentacion(leer.next().toLowerCase());
                                break;
                            case 5:
                                System.out.print("Ingrese la descripcion de rasgos: ");
                                listaAnimales.get(i).setDescripcionrasgos(leer.next().toLowerCase());
                                break;
                            case 6:
                                System.out.print("Ingrese la nueva cantidad de vida: ");
                                listaAnimales.get(i).setVida(leer.nextInt());
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
                "\n(1). Imprimir por posicion de la lista" +
                "\n(2). Imprimir Lista Completa" +
                "\n(3). Imprimir por Nombre Cientifico");
        System.out.print("\nSELECCIONE UNA OPCION: ");
        int opcion=leer.nextInt();
        switch(opcion){
            case 1:
                System.out.print("Ingrese la posicion del animal que desea imprimir");
                System.out.print("Ingrese un numero del 0 al "+(listaAnimales.size()-1)+ ":");
                int posicion =leer.nextInt();
                for (int i=0;i<listaAnimales.size();i++){
                    if(i==posicion){
                        System.out.println(listaAnimales.get(i).toString());
                    }else if (i==listaAnimales.size()-1){
                        System.out.println("El animal no existe!");
                    }
                }
                break;
            case 2:
                System.out.println("Lista  completa");
                for (Animal listaAnimale:listaAnimales) {
                    System.out.println(listaAnimale.toString());
                }
                break;
            case 3:
                System.out.print("Ingrese el Nombre Cientifico del animal que desea imprimir: ");
                String nombrecientifico=leer.next().toLowerCase();
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
    public static void eliminaranimal(){
        for(int i=0;i<listaAnimales.size();i++){
            if(listaAnimales.get(i).getVida()<=0){
                listaAnimales.remove(i);
            }
        }
    }

    public static void cadenaAlimenticia(){
        System.out.println("Selecciones el animal que desea alimentar:");
        for(int i=0;i<listaAnimales.size();i++){
            System.out.println(i + ". " + listaAnimales.get(i).getNombrecientifico());
        }
        System.out.println("Ingrese un numero del 0 al " + (listaAnimales.size()-1) + ": ");
        int opcion=leer.nextInt();
        for(int i=0;i<listaAnimales.size();i++){
            if(i==opcion){
                vidaA=listaAnimales.get(i).getVida();
                posicionA=i;
            }
        }

        System.out.println("Seleccione el animal a devorar");
        for(int i=0;i < listaAnimales.size();i++){
            System.out.println(i + ". " + listaAnimales.get(i).getNombrecientifico());
        }
        System.out.println("Ingrese un numero del 0 al " + (listaAnimales.size()-1)+ ": ");
        int opcion2=leer.nextInt();
        for(int i=0;i<listaAnimales.size();i++){
            if(i==opcion2){
                vidaD=listaAnimales.get(i).getVida();
                posicionD=i;
            }
        }
        for(int i=0;i<listaAnimales.size();i++){
            if(vidaA>vidaD){
                if(i==posicionA){
                    listaAnimales.get(i).setVida(vidaA+vidaD);
                    listaAnimales.get(posicionD).setVida(0);
                    System.out.println("El animal "+ listaAnimales.get(i).getNombrecientifico() + " ha sido eliminado" +
                            "ahora tiene " + listaAnimales.get(i).getVida() + "de vida");
                    eliminaranimal();
                }else if(i==listaAnimales.size()-1){
                    System.out.println("El animal a devorar es mas fuerte que el animal a alimentar");
                }
            }
        }
    }

}
