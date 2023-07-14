
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

    public Object[][] cargarPaisConcacaf() {
        Object[][] concacaf = {
            this.cargarPais(0, "Estados Unidos", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Canada", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Mexico", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Costa Rica", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "El Salvador", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Honduras", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Republica Dominicana", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Haiti", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Republica Dominicana", 0, 0, 0, 0, 0, 0, 0, 0),};
        return concacaf;
    }

    public Object[][] cargarPaisCAF() {
        Object[][] caf = {
            this.cargarPais(0, "Camerun", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Nigeria", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Maruecos", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Tunez", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Argelia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Ghana", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Sudafria", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Costa de Marfil", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Egipto", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Senegal", 0, 0, 0, 0, 0, 0, 0, 0),};
        return caf;
    }

    public Object[][] cargarPaisCONMEBOL() {
        Object[][] conmebol = {
            this.cargarPais(0, "Argentina", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Brasil", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Colombia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Chile", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Paraguay", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Bolivia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Peru", 0, 0, 0, 0, 0, 0, 0, 0),};
        return conmebol;
    }

    public Object[][] cargarPaisOFC() {
        Object[][] ofc = {
            this.cargarPais(0, "Nueva Zelanda", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Papua Nueva Guinea", 0, 0, 0, 0, 0, 0, 0, 0),};
        return ofc;
    }

    public Object[][] cargarPaisUEFA() {
        Object[][] uefa = {
            this.cargarPais(0, "España", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Alemania", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Italia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Francia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Belgica", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Suiza", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Croacia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Dinamarca", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Reino Unido", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Grecia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Paises Bajos", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Ucrania", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Polonia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Austria", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Suecia", 0, 0, 0, 0, 0, 0, 0, 0),
            this.cargarPais(0, "Inglaterra", 0, 0, 0, 0, 0, 0, 0, 0),};
        return uefa;
    }

}
