package com.metaphorce.sistematareas.controlador;
import com.metaphorce.sistematareas.modelo.Tarea;

import java.util.ArrayList;

public class ManejarTarea {

    ArrayList<Tarea> listaTareas = new ArrayList<>();
    ArrayList<Tarea> listaPrioritaria = new ArrayList<>();

    public void registrarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void eliminarTarea(int id) {
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getId() == id) {
                System.out.println("Esta tarea se elimina:");
                listaTareas.get(i).toString();
                listaTareas.remove(i);
                break;
            }
        }
    }

    public void marcarCompletado(int id) {
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getId() == id) {
                System.out.println("Esta tarea se completo:");
                listaTareas.get(i).toString();
                listaTareas.get(i).setCompletado(true);
            }
        }
    }

    public void mostrarTareas() {
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getPrioridad() == 3) {
                System.out.println(listaTareas.get(i).toString());
            }

        }
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getPrioridad() == 2) {
                System.out.println(listaTareas.get(i).toString());
            }
        }
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getPrioridad() == 1) {
                System.out.println(listaTareas.get(i).toString());
            }

        }
    }
}
