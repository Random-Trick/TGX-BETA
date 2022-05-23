package d6;

import h7.e;
import h7.g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

public final class j2 {
    public final Map<Class<?>, e<?>> f6587a;
    public final Map<Class<?>, g<?>> f6588b;
    public final e<Object> f6589c;

    public j2(Map<Class<?>, e<?>> map, Map<Class<?>, g<?>> map2, e<Object> eVar) {
        this.f6587a = map;
        this.f6588b = map2;
        this.f6589c = eVar;
    }

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new g2(byteArrayOutputStream, this.f6587a, this.f6588b, this.f6589c).i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
