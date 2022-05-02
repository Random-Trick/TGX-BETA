package p046d6;

import java.util.HashMap;
import java.util.Map;
import p092g7.AbstractC4514e;
import p092g7.AbstractC4516g;
import p104h7.AbstractC5021b;

public final class C3634c implements AbstractC5021b<C3634c> {
    public static final AbstractC4514e<Object> f12374d = C3624b.f12353a;
    public static final int f12375e = 0;
    public final Map<Class<?>, AbstractC4514e<?>> f12376a = new HashMap();
    public final Map<Class<?>, AbstractC4516g<?>> f12377b = new HashMap();
    public final AbstractC4514e<Object> f12378c = f12374d;

    @Override
    public final C3634c mo5172a(Class cls, AbstractC4514e eVar) {
        this.f12376a.put(cls, eVar);
        this.f12377b.remove(cls);
        return this;
    }

    public final C3644d m29848b() {
        return new C3644d(new HashMap(this.f12376a), new HashMap(this.f12377b), this.f12378c);
    }
}
