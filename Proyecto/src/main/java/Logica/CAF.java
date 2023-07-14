/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Random;

/**
 *
 * @author JRS
 */
public class CAF {
    private Object [][] tablaPartido;
   
   public void jugarPartido (Object[][] tblCAF){
     Random random = new Random();
     int equipo1 = random.nextInt(tblCAF.length);
     int equipo2 = random.nextInt(tblCAF.length);
     while (equipo1 != equipo2){
         equipo2=random.nextInt(tblCAF.length);
     }
     
   }
   public void resultadoPartido (String equipo1, String equipo2){
      Random random = new Random();
     int golE1 = random.nextInt(10);
     int golE2 = random.nextInt(10);
     this.tablaPartido [tablaPartido.length][0] = equipo1;  
     this.tablaPartido [tablaPartido.length][1] = golE1;
     this.tablaPartido [tablaPartido.length][2] = equipo2;  
     this.tablaPartido [tablaPartido.length][3] = golE2;
   }

    /**
     * @return the tablaPartido
     */
    public Object[][] getTablaPartido() {
        return tablaPartido;
    }

    /**
     * @param tablaPartido the tablaPartido to set
     */
    public void setTablaPartido(Object[][] tablaPartido) {
        this.tablaPartido = tablaPartido;
    }
}

    