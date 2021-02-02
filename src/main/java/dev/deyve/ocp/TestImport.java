package dev.deyve.ocp;

import dev.deyve.ocp.garden.vegetable.*;
import dev.deyve.ocp.nursery.vegetable.*;

public class TestImport {

    public static void main(String[] args) {

        String str = "We are testing import statements";

        System.out.println(str);

        VineVegetable.main(args);

        dev.deyve.ocp.garden.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}
