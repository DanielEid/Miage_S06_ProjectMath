public class Main {


    public static void main (String[] args) {

        //int _nbRepet = Integer.parseInt(args[0]);
        int _nbRepet = 1;

        // 1e experience : rectangle
        Surface exp1 = new Rectangle();
        exp1.simulateMonteCarlo(_nbRepet);

        // 2e experience : cercle
        Surface exp2 = new Circle();
        exp2.simulateMonteCarlo(_nbRepet);

        // 3e experience : surface du graphique
        Surface exp3 = new Graph();
        exp3.simulateMonteCarlo(_nbRepet);

    }


}
