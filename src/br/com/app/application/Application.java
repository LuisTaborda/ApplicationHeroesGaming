package br.com.app.application;

import br.com.app.entity.Gaming;
import br.com.app.entity.Hero;

public class Application {
    public static void main (String[] args){
        System.out.println("Aplicação iniciada com sucesso.");

        Gaming devilMayCry = new Gaming("Devil May Cry");
        devilMayCry.addHeroes(new Hero("Dante", "Filho de Esparda"));
        devilMayCry.addHeroes(new Hero("Vergil","Filho de Esparda"));
        devilMayCry.addHeroes(new Hero("Sparda","Demônio poderoso que venceu Mundus"));
        devilMayCry.addHeroes(new Hero("Eva","Humana, esposa de Sparda"));

        devilMayCry.show();

        System.out.println("Aplicação finalizada com sucesso.");
    }
}
