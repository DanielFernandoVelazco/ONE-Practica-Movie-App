package com.fernando.screenmatch.principal;

import com.fernando.screenmatch.modelos.Pelicula;
import com.fernando.screenmatch.modelos.Serie;
import com.fernando.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaDeBruno = new Pelicula("El señor de los anillos", 2001);
        peliculaDeBruno.evalua(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeBruno);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item);
            Pelicula pelicula = (Pelicula) item;
            System.out.println(pelicula.getClasificacion());
        }

    }
}
