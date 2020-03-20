package br.com.app.application;

import br.com.app.entity.Gaming;
import br.com.app.entity.Hero;
import br.com.app.games.DevilMayCry;
import br.com.app.games.SuperMario;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Gaming> games;

    public Application(){
        if(games==null){
            games = new ArrayList<>();
        }
    }

    public void add(Gaming gaming){
        games.add(gaming);
    }

    public void show(){
        for (Gaming g: games) {
            g.show();
        }
    }

    public static void main (String[] args){
        System.out.println("Aplicação iniciada com sucesso.");

        Application application = new Application();

        application.add(DevilMayCry.getInstance());
        application.add(SuperMario.getInstance());

        application.show();
        System.out.println("Aplicação finalizada com sucesso.");
    }
}
