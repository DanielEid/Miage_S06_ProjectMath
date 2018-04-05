public class Main {


    public static void main (String[] args) {

        //int _nbRepet = Integer.parseInt(args[0]);  T0D0 la version avce ligne de commande
        int _nbRepet = 1;

        Rectangle rect0=new Rectangle((float)2.5,5,(float)2.5,5);
        Zone zone0=new Zone(rect0,10,10);

        for(int i=0;i<10;i++)
        System.out.println(zone0.monteCarlo(50));

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
