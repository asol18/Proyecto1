/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author JRS
 */
public class CAF {

    private ArrayList<Resultados> tablaPartido = new ArrayList<>();

    public void jugarPartido(ArrayList<Selecion> seleciones) {
        Random random = new Random();
        int equipo1 = random.nextInt(seleciones.size());
        int equipo2 = random.nextInt(seleciones.size());
        while (equipo1 == equipo2) {
            equipo2 = random.nextInt(seleciones.size());
        }
        this.resultadoPartido(seleciones.get(equipo1).getSelecion(), seleciones.get(equipo2).getSelecion());

    }

    public void resultadoPartido(String equipo1, String equipo2) {
        Random random = new Random();

        int golE1 = random.nextInt(10);
        int golE2 = random.nextInt(10);
        this.tablaPartido.add(new Resultados(golE1,equipo1,equipo2,golE2));
    }
    /**
     * @return the tablaPartido
     */
    public ArrayList<Resultados> getTablaPartido() {
        return tablaPartido;
    }

    /**
     * @param tablaPartido the tablaPartido to set
     */
    public void setTablaPartido(ArrayList<Resultados> tablaPartido) {
        this.tablaPartido = tablaPartido;
    }
}
