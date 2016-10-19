
package langton.s.ant;

import java.awt.Color;



public class Cellule {
    
    private Color couleur;
    private int x,y;
    private boolean estPrésent;
    
    
    
    public Cellule(int x, int y){
        this.couleur=Color.white;
        this.estPrésent=false;
        this.x=x;
        this.y=y;
        
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    public Cellule getCelluleGauche(){
        return new Cellule(this.x-1,this.y);
    }
    
    public Cellule getCelluleDroite(){
        return new Cellule(this.x+1,this.y);
    }
    public Cellule getCelluleHaut(){
        return new Cellule(this.x,this.y+1);
    }
    public Cellule getCelluleBas(){
        return new Cellule(this.x,this.y-1);
    }
    
    


    public boolean isEstPrésent() {
        return estPrésent;
    }

    public void setEstPrésent(boolean estPrésent) {
        this.estPrésent = estPrésent;
    }
            
    
    
    
    
    
    
}
