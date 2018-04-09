public class Main {


    public static void main (String[] args) {

        //int nbrIterations = Integer.parseInt(args[0]);  T0D0 la version avce ligne de commande




        //Creation surfaces
        Rectangle rect0=new Rectangle((float)0,5,(float)0,5); //ici 1/2 du conteneur soit 1/4 d'aire
        Circle circle0=new Circle(5,5,4);

        //Creation des zones etant le repere d'ordonnées et d'abcisses
        Zone zone0=new Zone(rect0,0,10,0,10);
        Zone zone1=new Zone(circle0,0,10,0,10);


        /**
         * Une zone genere 1000 points, le resultat afficher est la moyenne du calcul de l'aire * nbrIterations
         */


        zone0.simulateMonteCarlo(100);  //Ici l'aire de notre zone 0 est de 10*10 donc 100  Pour le rectangle

        zone1.simulateMonteCarlo(100);  //Pour le cercle


        /* // 1e experience : rectangle
        Surface exp1 = new Rectangle();
        exp1.simulateMonteCarlo(_nbRepet);

        // 2e experience : cercle
        Surface exp2 = new Circle();
        exp2.simulateMonteCarlo(_nbRepet);

        // 3e experience : surface du graphique
        Surface exp3 = new Graph();
        exp3.simulateMonteCarlo(_nbRepet);*/

    }


}
