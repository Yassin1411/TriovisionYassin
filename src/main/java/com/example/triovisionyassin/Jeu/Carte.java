package com.example.triovisionyassin.Jeu;

import java.util.ArrayList;
import java.util.Random;

public class Carte {
private ArrayList<Pion> Pions;
private boolean left;

  public Carte() {
    Pions = new ArrayList<Pion>();
    Random R = new Random();
    for (int i = 0; i<3 ;i++){
      Pions.add(new Pion(PionCouleurs.values()[R.nextInt(PionCouleurs.values().length+1)],0,0)); //Appel de commande
    }
  }
}
