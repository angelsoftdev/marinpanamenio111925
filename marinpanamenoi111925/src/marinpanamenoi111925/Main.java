/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marinpanamenoi111925;

/**
 *
 * @author angel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo();
        arbol.crearArbolEjemplo();

        System.out.println("Recorrido Preorden:");
        System.out.println(arbol.preOrden());
        System.out.println();

        System.out.println("Recorrido Inorden:");
        System.out.println(arbol.inOrden());
        System.out.println();

        System.out.println("Recorrido Postorden:");
        System.out.println(arbol.postOrden());
    }
    
}
