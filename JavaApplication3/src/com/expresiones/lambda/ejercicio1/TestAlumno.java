package com.expresiones.lambda.ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class TestAlumno {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno(1, "1717213183", "Lara", "Machuca", "Matematicas", 15.5, 14));
        listaAlumnos.add(new Alumno(2, "1717343183", "Gabrieldadadadadd", "Martines", "Geografia", 14.5, 15));
        listaAlumnos.add(new Alumno(3, "1714213183", "Robert", "j", "Literatura", 07.5, 14));
        listaAlumnos.add(new Alumno(4, "1789713183", "Mar Vel", "cox", "Aritmetica", 18.5, 14));
        listaAlumnos.add(new Alumno(5, "1767213183", "AJ", "Applegate", "Fisica", 19.5, 15));
        listaAlumnos.add(new Alumno(6, "1717453183", "Tru", "Kait", "Geometria", 10.3, 16));
        listaAlumnos.add(new Alumno(7, "1717213983", "Monica", "Belluci", "Arte", 18.7, 14));
        listaAlumnos.add(new Alumno(8, "1717213083", "Crystal", "Reed", "Religion", 19.9, 14));
        listaAlumnos.add(new Alumno(9, "1717213173", "Alex", "Coal", "Educacion Fisica", 17.7, 13));
        listaAlumnos.add(new Alumno(10, "1417213183", "Amber", "Jade", "Algoritmos", 12.4, 12));

        System.out.println("Alumnos cuyos nombres empiezan con L o G: ");
        listaAlumnos.stream()
                .filter(a -> a.getNombres().startsWith("L") || a.getNombres().startsWith("G"))
                .map(Alumno::getNombres)
                .forEach(System.out::println);
        //          .sorted()//funcion que ordena alfabeticamente
        //  .forEach(System.out::println);
        //funcion para imprimir
        System.out.println("Cantidad de Alumnos: ");
        System.out.println(listaAlumnos.stream()
                .count());
        System.out.println("Alumno con la menor edad: ");
        listaAlumnos.stream()
                .filter(a -> a.getEdad() < 13)//alumno de menor edad
                .map(Alumno::getNombres)
                .forEach(System.out::println);
        System.out.println("Alumno con la mayor edad: ");
        listaAlumnos.stream()
                .filter(a -> a.getEdad() > 15)
                .map(Alumno::getNombres)
                .forEach(System.out::println);
        System.out.println("Primer Alumno: ");
        System.out.println(listaAlumnos.stream()
                .findFirst().map(Alumno::getNombres));

        System.out.println("Lista de cursos cuyos nombres contiene la A: ");
        listaAlumnos.stream()
                .filter(a -> a.getNombreCurso().contains("a"))
                .map(Alumno::getNombreCurso)
                .forEach(System.out::println);

        System.out.println("Lista de nombres cuyo numero de caracteres es mayor a 10: ");
        listaAlumnos.stream()
                .filter(a -> a.getNombres().length() > 10)
                .map(Alumno::getNombres)
                .forEach(System.out::println);
        //System.out.println("Lista de Alumnos: ");
        //listaAlumnos.stream().forEach(a -> System.out.println(a));
    }
    }
    

