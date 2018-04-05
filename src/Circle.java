public class Circle extends Surface{

    // définition du rectangle dans lequel les points seront tirés


    public Circle() {
        super(0, 10, 0, 10);

    }

    public Circle(float x_min, float x_max, float y_min, float y_max) {
        super(x_min, x_max, y_min, y_max);
        // TODO
    }

    // quand est-ce qu'un point tiré au hasard est dans le cercle ?
    protected boolean isInArea(float x, float y) {
        // TODO
        return true;
    }

}
