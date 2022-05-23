package e6;

import h7.e;
import h7.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class d {
    public final Map<Class<?>, e<?>> f10682a;
    public final Map<Class<?>, g<?>> f10683b;
    public final e<Object> f10684c;

    public d(Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f10682a = map;
        this.f10683b = map2;
        this.f10684c = eVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new k8(byteArrayOutputStream, this.f10682a, this.f10683b, this.f10684c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
