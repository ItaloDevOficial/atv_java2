package atvjava2;

public class AtvJava2 {
    public static void main(String[] args) {
        int media1 = 8;
        media1 += 9;
        media1 += 7;
        media1 /= 3;

        int media2 = 4;
        media2 += 5;
        media2 += 6;
        media2 /= 3;

        int mediaTotal = media1 + media2;
        mediaTotal /= 2;

        System.out.println(media1);
        System.out.println(media2);
        System.out.println(mediaTotal);

    }
}
