package p316w9;

import java.nio.ByteBuffer;

public class C10000b {
    public static byte m6296a(ByteBuffer byteBuffer) {
        return byteBuffer.get(0);
    }

    public static String m6295b(byte b) {
        if (b == 66) {
            return "Baseline Profile";
        }
        if (b == 77) {
            return "Main Profile";
        }
        if (b == 88) {
            return "Extended Profile";
        }
        if (b == 100) {
            return "High Profile";
        }
        return "Unknown Profile (" + ((int) b) + ")";
    }
}
