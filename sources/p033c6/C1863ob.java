package p033c6;

public final class C1863ob {
    public static C1849nb f6783a;

    public static synchronized C1686cb m35969a(AbstractC1960va vaVar) {
        C1686cb b;
        synchronized (C1863ob.class) {
            if (f6783a == null) {
                f6783a = new C1849nb(null);
            }
            b = f6783a.m42088b(vaVar);
        }
        return b;
    }

    public static synchronized C1686cb m35968b(String str) {
        C1686cb a;
        synchronized (C1863ob.class) {
            a = m35969a(AbstractC1960va.m35846d(str).mo35865c());
        }
        return a;
    }
}
