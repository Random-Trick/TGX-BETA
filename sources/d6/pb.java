package d6;

public final class pb {
    public static pb f6883a;

    public static synchronized pb a() {
        pb pbVar;
        synchronized (pb.class) {
            if (f6883a == null) {
                f6883a = new pb();
            }
            pbVar = f6883a;
        }
        return pbVar;
    }
}
