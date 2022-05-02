package p278tb;

import java.io.Closeable;
import p095gc.AbstractC4551g;
import p095gc.C4549e;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC9081e0 implements Closeable {
    public static final C9082a f29133a = new C9082a(null);

    public static final class C9082a {

        public static final class C9083a extends AbstractC9081e0 {
            public final long f29134M;
            public final AbstractC4551g f29135b;
            public final C9131y f29136c;

            public C9083a(AbstractC4551g gVar, C9131y yVar, long j) {
                this.f29135b = gVar;
                this.f29136c = yVar;
                this.f29134M = j;
            }

            @Override
            public long mo528m() {
                return this.f29134M;
            }

            @Override
            public AbstractC4551g mo527t() {
                return this.f29135b;
            }
        }

        public C9082a() {
        }

        public static AbstractC9081e0 m10487c(C9082a aVar, byte[] bArr, C9131y yVar, int i, Object obj) {
            if ((i & 1) != 0) {
                yVar = null;
            }
            return aVar.m10488b(bArr, yVar);
        }

        public final AbstractC9081e0 m10489a(AbstractC4551g gVar, C9131y yVar, long j) {
            C8298k.m12933e(gVar, "$this$asResponseBody");
            return new C9083a(gVar, yVar, j);
        }

        public final AbstractC9081e0 m10488b(byte[] bArr, C9131y yVar) {
            C8298k.m12933e(bArr, "$this$toResponseBody");
            return m10489a(new C4549e().mo27346l0(bArr), yVar, bArr.length);
        }

        public C9082a(C8294g gVar) {
            this();
        }
    }

    @Override
    public void close() {
        C9489b.m8514j(mo527t());
    }

    public abstract long mo528m();

    public abstract AbstractC4551g mo527t();
}
