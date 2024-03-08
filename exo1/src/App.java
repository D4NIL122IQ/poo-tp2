public class App {
    public static void main(String[] args) throws Exception {

        Etudiant Anno = new Etudiant("dan", 24, 17);
        Anno.getName();
        Anno.getAge();
        Anno.getNoteMoyenne();
        Anno.setNoteMoyenne(-3);
        Anno.getNoteMoyenne();
    }

    /**
     * Etudiant
     */
    static class Etudiant {
        String nom;
        int age;
        double moyenne;

        public Etudiant(String n, int a, double m) {
            this.nom = n;
            if (a > 2) {
                this.age = a;
            } else {
                System.out.println("age inacceptable");
            }
            if (m >= 0 && m <= 20) {
                this.moyenne = m;
            } else {
                System.out.println("moyenne" + m + " inacceptable");
            }

        }

        public void getName() {
            System.out.println("Nom : " + this.nom);
        }

        public void getAge() {
            System.out.println("Age : " + this.age);
        }

        public void getNoteMoyenne() {
            System.out.println("Moyenne : " + this.moyenne);
        }

        public void setNoteMoyenne(float nm) {
            if (nm >= 0 && nm <= 20) {
                this.moyenne = nm;
            } else {
                System.out.println("moyenne " + nm + " inacceptable");
            }

        }

    }

}
