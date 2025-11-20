/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marinpanamenoi111925;

/**
 *
 * @author angel
 */
public class Nodo {
    public String dato;
    public Nodo hijo1; // primer hijo (izquierdo)
    public Nodo hijo2; // segundo hijo (central)
    public Nodo hijo3; // tercer hijo (derecho)

    public Nodo(String dato) {
        this.dato = dato;
        this.hijo1 = null;
        this.hijo2 = null;
        this.hijo3 = null;
    }
}


