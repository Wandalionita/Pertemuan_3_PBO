package Matematika;

public class Matematika2 extends Matematika{
        public int modulus(int a, int b) {
        if (b != 0) {
        return a % b;
        } else {
        System.out.println("Tidak bisa melakukan modulus dengan 0.");
        return 0;
        }
    }
}
