import java.util.ArrayList;
import java.util.Collections;

public class Zone extends Surface{

    private ArrayList<Point> listePoints;
    private ArrayList<Point> listePointsDansMaSurface;
    private Surface maSurface;
    private float aire;

    public Zone(Surface maSurface,float x_min,float x_max,float y_min, float y_max) {
        super(0,x_max,0,y_max);
        this.listePoints = new ArrayList<Point>();
        this.listePointsDansMaSurface = new ArrayList<Point>();
        this.maSurface= maSurface;
        this.aire=(this.x_max-this.x_min)*(this.y_max-this.y_min);
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
                "listePoints taille=" + listePoints.size() +" aire Zone= "+ aire +
                ", listePointsDansMaSurface taille=" + listePointsDansMaSurface.size()+ " aire surface= "+ maSurface.aire ;
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

    public void monteCarlo(int nbrPoint){

        this.generenatePoints(nbrPoint);  //Genere les points dans la zone
        this.isInAreaOfmySurface();       //Indiques quels point font parti de maSurface (donc la surface dans la zone)

        this.maSurface.calculAireFromListePoint(aire,listePoints.size(),listePointsDansMaSurface.size());  //Calcul l'aire de la surface en fonction de l'aire de la zone et du resultat des points
        }


        public void simulateMonteCarlo(int nbrIterations){
            float moyenneAireMaSurface=0;
            float moyenneTailleListePointDansMaSurface=0;


            //Generer avec 1000 points


            for(int i=0;i<nbrIterations;i++){
                //Iterations
                this.monteCarlo(1000);

                //Calculs
                moyenneAireMaSurface+=maSurface.getAire();
                moyenneTailleListePointDansMaSurface+=listePointsDansMaSurface.size();

                //Remise a 0 des listes


                    listePoints = new ArrayList<Point>();
                    listePointsDansMaSurface = new ArrayList<Point>();

            }

            moyenneAireMaSurface/=nbrIterations;
            moyenneTailleListePointDansMaSurface/=nbrIterations;


            System.out.println((int)Math.floor(moyenneTailleListePointDansMaSurface)+"    "+moyenneAireMaSurface);
        }

    public String monteCarloString(int nbrPoint){

        this.monteCarlo(nbrPoint);
        return this.toString();
    }
}
