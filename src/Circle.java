public class Circle extends Surface{

    private float rayon;
    // définition du rectangle dans lequel les points seront tirés


    public Circle() {
        super(0, 10, 0, 10);

    }

    public Circle(float x_centre,float y_centre, float rayon) {
        super(x_centre, x_centre+rayon, y_centre, y_centre+rayon);
        this.rayon=rayon;

    }

    // quand est-ce qu'un point tiré au hasard est dans le cercle ?
    protected boolean isInArea(float x, float y) {
        if((Math.pow(x-x_min,2)+Math.pow(y-y_min,2))<Math.pow(rayon,2)) return true;
        return false;
    }

}
