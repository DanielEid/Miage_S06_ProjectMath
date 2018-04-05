import java.util.ArrayList;

public class Zone extends Surface{

    private ArrayList<Point> listePoints;
    private ArrayList<Point> listePointsDansMaSurface;
    private Surface maSurface;
    private float x_min;
    private float x_max;
    private float y_min;
    private float y_max;

    public Zone(Surface maSurface,float x_max, float y_max) {
        super(0,x_max,0,y_max);
        this.listePoints = new ArrayList<Point>();
        this.listePointsDansMaSurface = new ArrayList<Point>();
        this.maSurface= maSurface;

    }



    public ArrayList<Point> getListePoints() {

        return listePoints;
    }

    public ArrayList<Point> getListePointsDansMaSurface() {
        return listePointsDansMaSurface;
    }

    public Surface getMaSurface() {
        return maSurface;
    }

    public void setMaSurface(Surface maSurface) {
        this.maSurface = maSurface;
    }


    public float getX_min() {
        return x_min;
    }

    public float getX_max() {
        return x_max;
    }

    public float getY_min() {
        return y_min;
    }

    public float getY_max() {
        return y_max;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "listePoints taille=" + listePoints.size() +
                ", listePointsDansMaSurface taille=" + listePointsDansMaSurface.size() ;
    }

    //OTHERS//

    @Override
    public boolean isInArea(float x, float y) {
        if(maSurface.isInArea(x,y)) return true;
        return false;
    }


    /**
     * Grace aux Points créer dans  dans l'intervale de ma Zone stoké dans listePoint
     * Je peux verifier si ces points sont dans maSurface (object contenu dans ma zone) de la methode isInArea
     * Si c'est le cas je les ajoutes a listePointsDansMaSurface
     * sinon rien
     * et je renvoie la taille (facultatif)
     */

    public int isInAreaOfmySurface(){
        for (Point p:listePoints){
            if(this.isInArea(p.getX(),p.getY())) listePointsDansMaSurface.add(p);
        }
        return listePointsDansMaSurface.size();
    }

    public void generenatePoints(int nbrPoint){
        for(int i=0;i<nbrPoint;i++)
        listePoints.add(new Point(randomX(),this.randomY()));
    }

    public int getNbrPointDansSurface(){
        return listePointsDansMaSurface.size();
    }

    public String monteCarlo(int nbrPoint){

        this.generenatePoints(nbrPoint);
        this.isInAreaOfmySurface();

        return this.toString();
    }
}
