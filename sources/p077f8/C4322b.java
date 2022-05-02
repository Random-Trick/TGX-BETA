package p077f8;

public class C4322b {
    public static int m28282a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("Invalid rotation: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }
}
