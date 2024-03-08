public class App {
    public static void main(String[] args) throws Exception {
        point a = new point(6, -1);
        a.getY();
        a.getX();
        a.moveTo(3, 0);
        a.getX();
        a.getY();
    }

    static class point {
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void getX() {
            System.out.println("l'abscisse x : " + this.x);
        }

        public void getY() {
            System.out.println("l'ordonne y : " + this.y);
        }

        public void moveTo(int nx, int ny) {
            this.x = nx;
            this.y = ny;
        }
    }

}
