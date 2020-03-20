package br.com.app.entity;

import java.util.ArrayList;
import java.util.List;

public class Gaming {

    private String name;
    private List<Hero> heroes;
    private int rakingScore;

    public Gaming(String name, int rakingScore){
        setName(name);
        if(heroes == null){
            heroes = new ArrayList<>();
        }
        setRakingScore(rakingScore);
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

    public void show() throws Exception {
        System.out.println(String.format("Nome: %s",getName()));
        System.out.println(String.format("Score: %s", scoreToString(getRakingScore())));
        System.out.println(getHeroes());
    }

    public int getRakingScore() {
        return rakingScore;
    }

    public void setRakingScore(int rakingScore) {
        this.rakingScore = rakingScore;
    }

    public String scoreToString(int size) throws Exception {
        String stars = "[";
        if((size > 5) && (size < 1)){
            throw new Exception("Valor de avaliação invalida, valores aceitões entre 1 e 5");
        }
        for(int i = 0; i < size; i++){
            stars = stars + "☆";
        }
        stars = stars + "]";

        return stars;
    }
}
