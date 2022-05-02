package p095gc;

import qa.C8298k;
import za.C11436c;

public final class C4538b {
    public static final byte[] m27481a(String str) {
        C8298k.m12933e(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C11436c.f36399b);
        C8298k.m12934d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final String m27480b(byte[] bArr) {
        C8298k.m12933e(bArr, "$this$toUtf8String");
        return new String(bArr, C11436c.f36399b);
    }
}
