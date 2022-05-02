package p033c6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;

public final class C1782j2 {
    public final Map<Class<?>, AbstractC4514e<?>> f6384a;
    public final Map<Class<?>, AbstractC4516g<?>> f6385b;
    public final AbstractC4514e<Object> f6386c;

    public C1782j2(Map<Class<?>, AbstractC4514e<?>> map, Map<Class<?>, AbstractC4516g<?>> map2, AbstractC4514e<Object> eVar) {
        this.f6384a = map;
        this.f6385b = map2;
        this.f6386c = eVar;
    }

    public final byte[] m35992a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C1737g2(byteArrayOutputStream, this.f6384a, this.f6385b, this.f6386c).m36031i(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
