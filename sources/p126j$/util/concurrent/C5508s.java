package p126j$.util.concurrent;

public final class C5508s extends C5502m {
    C5508s f18041e;
    C5508s f18042f;
    C5508s f18043g;
    C5508s f18044h;
    boolean f18045i;

    public C5508s(int i, Object obj, Object obj2, C5502m mVar, C5508s sVar) {
        super(i, obj, obj2, mVar);
        this.f18041e = sVar;
    }

    @Override
    public C5502m mo22512a(int i, Object obj) {
        return m22511b(i, obj, null);
    }

    public final C5508s m22511b(int i, Object obj, Class cls) {
        int d;
        if (obj == null) {
            return null;
        }
        C5508s sVar = this;
        do {
            C5508s sVar2 = sVar.f18042f;
            C5508s sVar3 = sVar.f18043g;
            int i2 = sVar.f18020a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = sVar.f18021b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return sVar;
                    }
                    if (sVar2 != null) {
                        if (sVar3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.m22551c(obj)) == null) || (d = ConcurrentHashMap.m22550d(cls, obj, obj2)) == 0) {
                                C5508s b = sVar3.m22511b(i, obj, cls);
                                if (b != null) {
                                    return b;
                                }
                            } else if (d >= 0) {
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
