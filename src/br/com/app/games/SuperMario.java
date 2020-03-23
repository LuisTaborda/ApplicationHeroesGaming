package br.com.app.games;

import br.com.app.entity.Gaming;
import br.com.app.entity.Hero;

public class SuperMario extends Gaming {

    public static SuperMario uniqueInstance;


    public static synchronized SuperMario getInstance(){
        if (uniqueInstance == null)
            uniqueInstance = new SuperMario();
        return uniqueInstance;
    }

    public SuperMario() {
        super("Super Mario", 4);
        addHeroes(new Hero("Mario", "Encanador mais famoso do mundo dos games"));
        addHeroes(new Hero("Luigi","Mario verde"));
        addHeroes(new Hero("Peach","Princesa mais requisitada no universo dos cogumelos"));
        addHeroes(new Hero("Browser","A Tartaruga complexa e fissurado pela princesa"));
    }
}
