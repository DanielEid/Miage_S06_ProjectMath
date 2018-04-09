public class Graph extends Surface {

    public Graph() {
        super(0,0,0,0);
    }

    @Override
    protected boolean isInArea(float x, float y) {
        if(expX(x)>=y && formule2(x)<=y) return true;
        return false;
    }

    private double expX (float x){
        return Math.exp(x);
    }

    private double formule2(float x){   //x-x^3-1
        return (x-Math.pow(x,3)-1);
    }

}
