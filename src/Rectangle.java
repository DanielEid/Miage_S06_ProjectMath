public class Rectangle extends Surface{

    public Rectangle() {
        super(0, 10, 0, 10);


    }

    public Rectangle(float x_min, float x_max, float y_min, float y_max) {
        super(x_min, x_max, y_min, y_max);
    }

    // quand est-ce qu'un point tiré au hasard est dans le rectangle à mesurer ?
    protected boolean isInArea(float x, float y) {
        if(x>=x_min && x<=x_max && y>=y_min && y<=y_max) return true;
        return false;
    }

}
