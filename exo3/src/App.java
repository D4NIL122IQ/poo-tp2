import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Circule c = new Circule(4, 0);
        c.getRadius();
        c.calculatArea();
    }

    static class Circule {
        double rayon;
        double centre;

        Circule(double R, double C) {
            this.rayon = R;
            this.centre = C;
        }

        public void getRadius() {
            System.out.println("le rayon :" + this.rayon);
        }

        public void getCenter() {
            System.out.println("le centre du cercle :" + this.centre);
        }

        public void calculateCircumference() {
            System.out.println("la circonference de ce cercle :" + (Math.PI * 2 * this.rayon));
        }

        public void calculatArea() {
            System.out.println("la surface de ce cercle : " + (Math.pow(this.rayon, 2) * Math.PI));
        }

        public void moveTo(double nc) {
            this.centre = nc;
            System.out.println("le center du cercle est deplacer vers :" + nc);
        }
    }
}
