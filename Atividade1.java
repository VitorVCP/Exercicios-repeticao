public class Atividade1 {
    public static void main(String[] args) {
        int m2 = 0, m3 = 0, m5 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                m2++;
            } if (i % 3 == 0) {
                m3++;
            } if (i % 5 == 0) {
                m5++;
               }
            }
               System.out.println("Tem: " + m2 + " multiplos de 2.\nTem: " + m3 + " multiplos de 3.\nTem: " + m5 + " multiplos de 5");
    }
}
