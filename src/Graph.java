public class Graph extends Surface {

    public Graph(float x_min, float x_max, float y_min, float y_max) {
        super(x_min, x_max, y_min, y_max);
    }

    @Override
    protected boolean isInArea(float x, float y) {
        return false;
    }
}
