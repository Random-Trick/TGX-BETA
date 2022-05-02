package p278tb;

import java.io.Closeable;
import p095gc.AbstractC4551g;
import p095gc.C4549e;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC9081e0 implements Closeable {
    public static final C9082a f29130a = new C9082a(null);

    public static final class C9082a {

        public static final class C9083a extends AbstractC9081e0 {
            public final long f29131M;
            public final AbstractC4551g f29132b;
            public final C9131y f29133c;

            public C9083a(AbstractC4551g gVar, C9131y yVar, long j) {
                this.f29132b = gVar;
                this.f29133c = yVar;
                this.f29131M = j;
            }

            @Override
            public long mo528m() {
                return this.f29131M;
            }

            @Override
            public AbstractC4551g mo527t() {
                return this.f29132b;
            }
        }

        public C9082a() {
        }

        public static AbstractC9081e0 m10488c(C9082a aVar, byte[] bArr, C9131y yVar, int i, Object obj) {
            if ((i & 1) != 0) {
                yVar = null;
            }
            return aVar.m10489b(bArr, yVar);
        }

        public final AbstractC9081e0 m10490a(AbstractC4551g gVar, C9131y yVar, long j) {
            C8298k.m12934e(gVar, "$this$asResponseBody");
            return new C9083a(gVar, yVar, j);
        }

        public final AbstractC9081e0 m10489b(byte[] bArr, C9131y yVar) {
            C8298k.m12934e(bArr, "$this$toResponseBody");
            return m10490a(new C4549e().mo27344l0(bArr), yVar, bArr.length);
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
