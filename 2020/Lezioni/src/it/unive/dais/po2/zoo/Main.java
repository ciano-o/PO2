package it.unive.dais.po2.zoo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Dog fido = new Dog(15, "bruno");
        Dog baldo = new Dog(20, "bianco");

        List<Dog> dogs = new ArrayList<>();
        dogs.add(fido);
        dogs.add(baldo);

        // TODO: provare a mettere a posto in modo che compili
/*        Animal jackie = new Dog(2, "nero");
        Dog pluto = new Animal(50);
        Animal selene = new Cat(4, "grigio");

        // sumsumption NON valide
        Dog fido2 = selene;
        Cat selene2 = selene;

        Cat tigre = new Cat(20);
        Animal cane = new Dog(50, tigre);
        Animal p = fido.getPartner();

        selene.eat(fido);

        Animal a = new Persian(6, fido);
        a.meow(); // NON COMPILA
        a.eat(fido);

        a.eat(a);   // mangiare se stessi si può fare
*/

    }

}


