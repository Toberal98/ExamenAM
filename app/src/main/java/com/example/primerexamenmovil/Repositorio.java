package com.example.primerexamenmovil;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    public Repositorio() {
    }
    public List<AnimalModelo> getAnimales() {
        List<AnimalModelo> animales = new ArrayList<>();
        animales.add(new AnimalModelo("Aves","Las aves son animales vertebrados, de sangre caliente, que caminan, saltan o se mantienen solo sobre las extremidades posteriores","https://youtu.be/T-D7b2DJJNk",R.drawable.ave));
        animales.add(new AnimalModelo("Peces","Los peces (del latín pisces) son animales vertebrados primariamente acuáticos, generalmente ectotérmicos (regulan su temperatura a partir del medio ambiente) y con respiración por branquias. ","https://youtu.be/sfWqabJ-bcE",R.drawable.pez));
        animales.add(new AnimalModelo("Insectos","Los insectos (Insecta) son una clase de animales invertebrados del filo de los artrópodos, caracterizados por presentar un par de antenas, tres pares de patas y dos pares de alas (que, no obstante, pueden reducirse o faltar). ","https://youtu.be/3tXZZTy_ncE",R.drawable.insecto));
        animales.add(new AnimalModelo("Mamiferos","Los mamíferos (Mammalia) son una clase de animales vertebrados amniotas homeotermos (de «sangre caliente») que poseen glándulas mamarias productoras de leche con las que alimentan a las crías.","https://youtu.be/T-D7b2DJJNk",R.drawable.leon));

        return animales;
    }
}
