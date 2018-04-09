import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public abstract class Surface {

    // nombres définissant le rectangle dans lequel les points seront tirés :
    // sommets : (x_min, y_min), (x_min, y_max), (x_max, y_max), (x_max, y_min)
    protected float x_min;
    protected float x_max;
    protected float y_min;
    protected float y_max;
    protected float aire;

    // constructeur par valeurs


    public Surface(float x_min, float x_max, float y_min, float y_max) {
        this.x_min = x_min;
        this.x_max = x_max;
        this.y_min = y_min;
        this.y_max = y_max;
        this.aire= -1;
    }

    // tirage d'une abscisse au hasard dans l'intervalle [x_min; x_max]
    protected float randomX() {
       return (float) (x_min+ Math.random()*(x_max-x_min));
    }

    // tirage d'une ordonnée au hasard dans l'intervalle [y_min; y_max]
    protected float randomY() {
        return (float) (y_min+ Math.random()*(y_max-y_min));
    }

    protected void calculAireFromListePoint(float aireGraph, float nombrePointsGraph, float nombrePointSurface){
           this.aire=(nombrePointSurface/nombrePointsGraph)*aireGraph;

    }
    // permet de savoir si un point est dans la surface ou non :
    // à réimplémenter pour chaque type de surface
    protected abstract boolean isInArea(float x, float y);



    // tirage de nbRepet points dans le rectangle de sommets :
    // (x_min, y_min), (x_min, y_max), (x_max, y_max), (x_max, y_min)
    // renvoie le nombre de ces points qui étaient dans la surface
    private int countMonteCarlo(int nbRepet) {
        // TODO
        return 0;
    }

    // calcule une estimation de l'aire si count points étaient dans la surface
    // lors de nbRepet tirages de points
    private float areaMonteCarlo(int count, int nbRepet) {
        // TODO
        return 0.F;
    }

    // construit la chaîne de caractères avec en premier le nombre de points
    // dans la surface, puis une espace, puis l'estimation de l'aire de la
    // surface avec 3 chiffres obligatoires derrière la virgule
    // affiche cette chaîne de caractères
    private void printMonteCarlo(int count, float area) {
        // TODO
    }

    // assemble les différentes fonctions précédentes :
    // pour un nombre nbRepet de points à tirer, on tire ces points, compte ceux
    // dans la surface, calcule l'aire, puis affiche le tout
    public void simulateMonteCarlo(int nbRepet) {
        // TODO
    }


    public float getAire() {
        return aire;
    }

    public void setAire(float aire) {
        this.aire = aire;
    }
}
