package x9;

import java.nio.ByteBuffer;

public class b {
    public static byte a(ByteBuffer byteBuffer) {
        return byteBuffer.get(0);
    }

    public static String b(byte b10) {
        if (b10 == 66) {
            return "Baseline Profile";
        }
        if (b10 == 77) {
            return "Main Profile";
        }
        if (b10 == 88) {
            return "Extended Profile";
        }
        if (b10 == 100) {
            return "High Profile";
        }
        return "Unknown Profile (" + ((int) b10) + ")";
    }
}
