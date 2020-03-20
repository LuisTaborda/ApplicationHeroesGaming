package br.com.app.entity;

public class Hero {
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Hero(String name, String description){
        setName(name);
        setDescription(description);
    }
}
