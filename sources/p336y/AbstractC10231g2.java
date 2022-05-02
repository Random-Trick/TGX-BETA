package p336y;

public abstract class AbstractC10231g2 {

    public enum EnumC10232a {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        
        public final int f33013a;

        EnumC10232a(int i) {
            this.f33013a = i;
        }

        public int m5675a() {
            return this.f33013a;
        }
    }

    public enum EnumC10233b {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static AbstractC10231g2 m5679a(EnumC10233b bVar, EnumC10232a aVar) {
        return new C10217e(bVar, aVar);
    }

    public abstract EnumC10232a mo5678b();

    public abstract EnumC10233b mo5677c();

    public final boolean m5676d(AbstractC10231g2 g2Var) {
        return g2Var.mo5678b().m5675a() <= mo5678b().m5675a() && g2Var.mo5677c() == mo5677c();
    }
}
