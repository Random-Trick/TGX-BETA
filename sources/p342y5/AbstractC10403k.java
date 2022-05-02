package p342y5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import p287u7.C9457b;

public abstract class AbstractC10403k {
    public static final C10397f f33473a;

    static {
        C10395e eVar = new C10395e();
        C10402j.f33472a.mo5164a(eVar);
        f33473a = eVar.m5171b();
    }

    public static byte[] m5163a(Object obj) {
        C10397f fVar = f33473a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fVar.m5170a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract C9457b m5162b();
}
