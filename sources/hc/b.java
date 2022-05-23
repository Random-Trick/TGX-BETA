package hc;

import ab.c;
import ra.k;

public final class b {
    public static final byte[] a(String str) {
        k.e(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(c.f695b);
        k.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String b(byte[] bArr) {
        k.e(bArr, "$this$toUtf8String");
        return new String(bArr, c.f695b);
    }
}
