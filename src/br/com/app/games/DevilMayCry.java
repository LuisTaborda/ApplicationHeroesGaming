package br.com.app.games;

import br.com.app.entity.Gaming;
import br.com.app.entity.Hero;

public class DevilMayCry extends Gaming {

    public static DevilMayCry uniqueInstance;


    public static synchronized DevilMayCry getInstance(){
        if (uniqueInstance == null)
            uniqueInstance = new DevilMayCry();
        return uniqueInstance;
    }

    public DevilMayCry() {
        super("Devil May Cry", 5);
        addHeroes(new Hero("Dante", "Filho de Esparda"));
        addHeroes(new Hero("Vergil","Filho de Esparda"));
        addHeroes(new Hero("Sparda","Demônio poderoso que venceu Mundus"));
        addHeroes(new Hero("Eva","Humana, esposa de Sparda"));
    }
}
