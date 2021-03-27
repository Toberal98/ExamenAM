package com.example.primerexamenmovil;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    public Repositorio() {
    }
    public List<AnimalModelo> getAnimales() {
        List<AnimalModelo> animales = new ArrayList<>();
        animales.add(new AnimalModelo("Aves","Las aves son animales vertebrados, de sangre caliente...","Las aves son animales vertebrados, de sangre caliente, que caminan, saltan o se mantienen solo sobre las extremidades posteriores, mientras que las extremidades anteriores han evolucionado hasta convertirse en alas que, al igual que muchas otras características anatómicas únicas, les permiten, en la mayoría de los casos, volar, si bien no todas vuelan. Tienen el cuerpo cubierto de plumas y, las aves sensu stricto, un pico córneo sin dientes. Para reproducirse ponen huevos que incuban hasta su eclosión.","https://www.youtube.com/embed/bLCqRd_fLio",R.drawable.ave));
        animales.add(new AnimalModelo("Peces","Los peces (del latín pisces) son animales vertebrados primariamente acuáticos... ","Los peces (del latín pisces) son animales vertebrados primariamente acuáticos, generalmente ectotérmicos (regulan su temperatura a partir del medio ambiente) y con respiración por branquias. Suelen estar recubiertos por escamas, y están dotados de aletas, que permiten su movimiento continuo en los medios acuáticos, y branquias, con las que captan el oxígeno disuelto en el agua. El grupo Pisces no es un taxón porque sería parafilético. Los peces son abundantes tanto en agua salada como en agua dulce, pudiéndose encontrar especies desde los arroyos de montaña (por ejemplo, el gobio), así como en lo más profundo del océano (por ejemplo, anguilas tragonas).","https://www.youtube.com/embed/sfWqabJ-bcE",R.drawable.pez));
        animales.add(new AnimalModelo("Insectos","Los insectos (Insecta) son una clase de animales invertebrados del filo de los artrópodos... ","Los insectos (Insecta) son una clase de animales invertebrados del filo de los artrópodos, caracterizados por presentar un par de antenas, tres pares de patas y dos pares de alas (que, no obstante, pueden reducirse o faltar). La ciencia que estudia los insectos se denomina entomología. Su nombre proviene del latín insectum, calco del griego ἔντομα, 'cortado en medio'.","https://www.youtube.com/embed/3tXZZTy_ncE",R.drawable.insecto));
        animales.add(new AnimalModelo("Mamiferos","Los mamíferos (Mammalia) son una clase de animales vertebrados amniotas homeotermos...","Los mamíferos (Mammalia) son una clase de animales vertebrados amniotas homeotermos (de «sangre caliente») que poseen glándulas mamarias productoras de leche con las que alimentan a las crías. La mayoría son vivíparos (con la excepción de los monotremas: ornitorrinco y equidnas). Se trata de un taxón monofilético; es decir, todos descienden de un antepasado común que se remonta probablemente a finales del Triásico, hace más de 200 millones de años. Pertenecen al clado sinápsidos, que incluye también numerosos «reptiles» emparentados con los mamíferos, como los pelicosaurios y los cinodontos. Se conocen unas 5 486 especies actuales, de las cuales 5 son monotrematas, 272 son marsupiale y el resto, 5 209, son placentarios. La ciencia que estudia los mamíferos se denomina teriología, mastozoología o mamiferología.","https://www.youtube.com/embed/m4MPj5nFNW0",R.drawable.leon));

        return animales;
    }
}
