package br.com.app.entity;

import java.util.ArrayList;
import java.util.List;

public class Gaming {


    private String name;
    private List<Hero> heroes;

    public Gaming(String name){
        setName(name);
        if(heroes == null){
            heroes = new ArrayList<>();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHeroes() {

        List<String>heroesName = new ArrayList<>();
        for (Hero h: heroes) {
            heroesName.add(String.format("[Nome : %s, Descrição: %s]",h.getName(), h.getDescription()));
        }
        return heroesName;
    }

    public void addHeroes(Hero hero) {
        heroes.add(hero);
    }

    public void show(){
        System.out.println(getName());
        System.out.println(getHeroes());
    }
}
