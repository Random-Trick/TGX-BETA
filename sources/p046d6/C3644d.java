package p046d6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;

public final class C3644d {
    public final Map<Class<?>, AbstractC4514e<?>> f12394a;
    public final Map<Class<?>, AbstractC4516g<?>> f12395b;
    public final AbstractC4514e<Object> f12396c;

    public C3644d(Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f12394a = map;
        this.f12395b = map2;
        this.f12396c = eVar;
    }

    public final byte[] m29847a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C3723k8(byteArrayOutputStream, this.f12394a, this.f12395b, this.f12396c).m29819i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
