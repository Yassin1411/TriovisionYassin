package com.example.triovisionyassin.Jeu;

public class Pion {
  private PionCouleurs couleur;
  private int X;
  private int Y;

  public Pion(PionCouleurs PC, int x, int y) {
    couleur = PC;
    X = x;
    Y = y;
  }

  public PionCouleurs getCouleur() {
    return couleur;
  }

  public void setCouleur(PionCouleurs couleur) {
    this.couleur = couleur;
  }

  public int getX() {
    return X;
  }

  public void setX(int x) {
    X = x;
  }

  public int getY() {
    return Y;
  }

  public void setY(int y) {
    Y = y;
  }
}
