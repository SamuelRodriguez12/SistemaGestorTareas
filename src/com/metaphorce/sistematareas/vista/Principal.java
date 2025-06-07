package com.metaphorce.sistematareas.vista;

import com.metaphorce.sistematareas.controlador.ManejarTarea;
import com.metaphorce.sistematareas.modelo.Tarea;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*Aqui se declaran las variables*/
        int indice = 0;
        int id=100;
        int idIngresado;
        String nombreTarea;
        String descripcionTarea;
        int prioridad;
        /*Aqui se declaran los objetos*/
        ManejarTarea registro = new ManejarTarea();
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("Bienvenido a tu gestor de tareas!!!");
            System.out.println("1-Registrar nueva tarea");
            System.out.println("2-Marcar como completado");
            System.out.println("3-Eliminar una tarea");
            System.out.println("4-Mostrar tareas por prioridad");
            System.out.println("5-Salir del sistema");
            indice = leer.nextInt();
            /*Menu para seleccionar las operaciones*/
            switch (indice){
                case 1:
                    /*Aqui se registran las actividades*/
                    System.out.println("Ingresa el nombre de la tarea: ");
                    leer.nextLine();
                    nombreTarea = leer.nextLine();
                    System.out.println("Ingresa una descripcion para la tarea: ");
                    descripcionTarea = leer.nextLine();
                    System.out.println("Ingresa la prioridad, del 1 al 3, siendo 3 la mayor prioridad: ");
                    prioridad = leer.nextInt();
                    Tarea tarea = new Tarea(id, nombreTarea, descripcionTarea, prioridad, false);
                    id++;
                    registro.registrarTarea(tarea);
                    break;
                case 2:
                    /*Aqui se marca como completado la tarea*/
                    System.out.println("Ingresa el ID de tu tarea completada: ");
                    idIngresado = leer.nextInt();
                    registro.marcarCompletado(idIngresado);
                    break;
                case 3:
                    /*Aqui se elimina la tarea indicada*/
                    System.out.println("Ingresa el ID de tu tarea a eliminar: ");
                    idIngresado = leer.nextInt();
                    registro.eliminarTarea(idIngresado);
                    break;
                case 4:
                    /*Aqui se ordena por prioridad y se muestran las actividades registradas*/
                    System.out.println("Listado de tareas ordenado por prioridad");
                    registro.mostrarTareas();
                    break;
                case 5:
                    /*Aqui se termina el programa y el usuario lo termina*/
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Valor invalido");
                    break;
            }
        }while(indice!=5);
    }
}
