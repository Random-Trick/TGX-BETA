package y;

public abstract class g2 {

    public enum a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        
        public final int f26309a;

        a(int i10) {
            this.f26309a = i10;
        }

        public int a() {
            return this.f26309a;
        }
    }

    public enum b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static g2 a(b bVar, a aVar) {
        return new e(bVar, aVar);
    }

    public abstract a b();

    public abstract b c();

    public final boolean d(g2 g2Var) {
        return g2Var.b().a() <= b().a() && g2Var.c() == c();
    }
}
