public class Graph extends Surface{

    // définition du rectangle dans lequel les points sont tirés


    public Graph() {
        super(0, 10, 0, 10);


    }

    public Graph(float x_min, float x_max, float y_min, float y_max) {
        super(x_min, x_max, y_min, y_max);
        // TODO
    }

    // quand est-ce qu'un point tiré au hasard est dans la zone à mesurer ?
    protected boolean isInArea(float x, float y) {
        // TODO
        return true;
    }

}
