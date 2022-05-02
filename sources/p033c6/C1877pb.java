package p033c6;

public final class C1877pb {
    public static C1877pb f6811a;

    public static synchronized C1877pb m35947a() {
        C1877pb pbVar;
        synchronized (C1877pb.class) {
            if (f6811a == null) {
                f6811a = new C1877pb();
            }
            pbVar = f6811a;
        }
        return pbVar;
    }
}
