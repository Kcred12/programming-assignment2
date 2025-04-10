package com.burger;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String bun;
    private List<String> patties;
    private List<String> cheeses;
    private List<String> garnishes;

    public Burger(String bun, List<String> patties, List<String> cheeses, List<String> garnishes) {
        this.bun = bun;

        this.patties = new ArrayList<>(4);
        this.cheeses = new ArrayList<>(4);
        this.garnishes = new ArrayList<>(4);

        this.patties.addAll(patties);
        this.cheeses.addAll(cheeses);
        //////// this.garnishes.addAll(garnishes);
        this.garnishes.addAll(garnishes.subList(0, Math.min(4, garnishes.size())));
    }

    public double getPrice() {
        return 2.0 + patties.size() * 1.5 + cheeses.size() * 0.5 + garnishes.size() * 0.75;
    }

    @Override
    public String toString() {
        return "Bun: " + bun + ", Patties: " + patties + ", Cheeses: " + cheeses + ", Garnishes: " + garnishes;
    }
}