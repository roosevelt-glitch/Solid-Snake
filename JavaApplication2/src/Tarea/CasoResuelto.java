/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tarea;

/**
 *
 * @author alexm
 */
public class CasoResuelto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorProyecto gProyectos = new GestorProyecto();
        gProyectos.agregar(new Proyecto(23, "Consola Juegos",25800,16));
        gProyectos.agregar(new Proyecto(19, "Redes y Cableado",38500,34));
        gProyectos.agregar(new Proyecto(33, "Software Contable",12600,8));
        gProyectos.insertar(new Proyecto(84, "Procesar encuestas",1900,5), 2);
        gProyectos.agregar(new Proyecto(45, "Pagina Web",5800,6));
        gProyectos.agregar(new Proyecto(8, "Configuracion",1360,11));
        gProyectos.agregar(new Proyecto(16, "Base de Datos",14900,7));
        gProyectos.insertar(new Proyecto(61, "Distribuir notificaciones",760,3), 4);
        gProyectos.agregar(new Proyecto(124, "Encriptado de claves",4600,3));
        
        Proyecto proyectoA = gProyectos.buscar(16);
        Proyecto proyectoB = gProyectos.buscar("Web");
        
        System.out.println(proyectoA !=null ? proyectoA : "Proyecto con codigo 16 No encontrado");
        System.out.println(proyectoB !=null ? proyectoB : "Proyecto de nombre 'Web' No encontrado");
    }
    
}
