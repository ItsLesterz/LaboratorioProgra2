package LabProgra2;
import javax.xml.bind.SchemaOutputResolver;

import static LabProgra2.Animales.*;

public class Lab2P2_LesterHernandez_22111193 {
    public static void main(String[] args) {
        System.out.println("-------Registro de Animales (Discovery)-------");
        System.out.print("Seas bienvenido al mejor registro de animales (Discovery)" +
                "\n(1). Registrar Animal" +
                "\n(2). Editar Animal" +
                "\n(3). Imprimir Listado de Animales" +
                "\n(4). Alimentar Animales" +
                "\n(5). Salir");
        System.out.print("SELECCIONE OPCION: ");
        int opcion=leer.nextInt();
        do{
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el Nombre Cientifico: ");
                    String nombre=leer.next();
                    verify(nombre);
                    registrarAnimal(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre cientifico del animal: ");
                    String nombre2=leer.next();
                    editAnimalCientifico(nombre2);
                    break;
                case 3:
                    imprimirAnimales();
                    break;
                case 4:
                    cadenaAlimenticia();
                    break;
                case 5:
                    System.out.println("Ha salido del registro de animales(Discovery)!");
                    break;
                default:
                    System.out.println("Opcion invalida!!!!");
                    break;
            }

        }while(opcion!=5);


    }

}
