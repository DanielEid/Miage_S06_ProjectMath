public class Main {


    public static void main (String[] args) {

        int nbrIterations = Integer.parseInt(args[0]);




        Rectangle rect0=new Rectangle(2,3,1,2);
        Circle circle0=new Circle(0,0,1);
        Graph graph0=new Graph();





        Zone zone0=new Zone(rect0,1,4,(float)0.5,(float)2.5);
        Zone zone1=new Zone(circle0,-1,1,-1,1);
        Zone zone2=new Zone(graph0,-1,1,-2,3);


        /**
         * Une zone genere 1000 points, le resultat afficher est la moyenne du calcul de l'aire * nbrIterations
         * l'affichage de l'aire est bien entendu dépendant de celle de la zone dans lequel il est contenu
         */



        zone0.simulateMonteCarlo(nbrIterations);

        zone1.simulateMonteCarlo(nbrIterations);

        zone2.simulateMonteCarlo(nbrIterations);








        /// MISCS ///

        //Creation surfaces
        /*
        Rectangle rect0=new Rectangle((float)0,5,(float)0,5); //ici 1/2 du conteneur soit 1/4 d'aire
        Circle circle0=new Circle(5,5,4);
        Graph graph0=new Graph();
        */

        //Creation des zones etant le repere d'ordonnées et d'abcisses
        /*
        Zone zone0=new Zone(rect0,0,10,0,10);
        Zone zone1=new Zone(circle0,0,10,0,10);
        Zone zone2=new Zone(graph0,-1,1,-2,3);
        */




    }


}
