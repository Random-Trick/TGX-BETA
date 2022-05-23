package z5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import v7.b;

public abstract class k {
    public static final f f26991a;

    static {
        e eVar = new e();
        j.f26990a.a(eVar);
        f26991a = eVar.b();
    }

    public static byte[] a(Object obj) {
        f fVar = f26991a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            fVar.a(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract b b();
}
