package j$.util.concurrent;

public final class s extends m {
    s f14433e;
    s f14434f;
    s f14435g;
    s f14436h;
    boolean f14437i;

    public s(int i10, Object obj, Object obj2, m mVar, s sVar) {
        super(i10, obj, obj2, mVar);
        this.f14433e = sVar;
    }

    @Override
    public final m a(int i10, Object obj) {
        return b(i10, obj, null);
    }

    public final s b(int i10, Object obj, Class cls) {
        int d10;
        if (obj == null) {
            return null;
        }
        s sVar = this;
        do {
            s sVar2 = sVar.f14434f;
            s sVar3 = sVar.f14435g;
            int i11 = sVar.f14412a;
            if (i11 <= i10) {
                if (i11 >= i10) {
                    Object obj2 = sVar.f14413b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return sVar;
                    }
                    if (sVar2 != null) {
                        if (sVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (d10 = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                s b10 = sVar3.b(i10, obj, cls);
                                if (b10 != null) {
                                    return b10;
                                }
                            } else if (d10 >= 0) {
                                sVar2 = sVar3;
                            }
                        }
                    }
                }
                sVar = sVar3;
                continue;
            }
            sVar = sVar2;
            continue;
        } while (sVar != null);
        return null;
    }
}
