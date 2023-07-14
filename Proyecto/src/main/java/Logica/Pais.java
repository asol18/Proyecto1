/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JRS
 */
public class Pais {

    public Object[] cargarPais(int Pos, String Seleccion, int Pts, int PJ, int PG, int PE, int PP, int GF, int GC, int Dif) {
        Object[] Pais = {Pos, Seleccion, Pts, PJ, PG, PE, PP, GF, GC, Dif};
        return Pais;
    }

    public void cargarPaisConcacaf() {
        this.cargarPais(0, "Estados Unidos", 0, 0, 0, 0, 0, 0, 0, 0);
        this.cargarPais(0, "Canada", 0, 0, 0, 0, 0, 0, 0, 0);
        this.cargarPais(0, "Mexico", 0, 0, 0, 0, 0, 0, 0, 0);
        this.cargarPais(0, "Estados Unidos", 0, 0, 0, 0, 0, 0, 0, 0);
        this.cargarPais(0, "Estados Unidos", 0, 0, 0, 0, 0, 0, 0, 0);
        this.cargarPais(0, "Estados Unidos", 0, 0, 0, 0, 0, 0, 0, 0);
        this.cargarPais(0, "Estados Unidos", 0, 0, 0, 0, 0, 0, 0, 0);
        
    }

}
