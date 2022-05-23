package ub;

import hc.e;
import hc.g;
import java.io.Closeable;
import ra.k;
import vb.b;

public abstract class e0 implements Closeable {
    public static final a f23793a = new a(null);

    public static final class a {

        public static final class C0224a extends e0 {
            public final long M;
            public final g f23794b;
            public final y f23795c;

            public C0224a(g gVar, y yVar, long j10) {
                this.f23794b = gVar;
                this.f23795c = yVar;
                this.M = j10;
            }

            @Override
            public long m() {
                return this.M;
            }

            @Override
            public g s() {
                return this.f23794b;
            }
        }

        public a() {
        }

        public a(ra.g gVar) {
            this();
        }

        public static e0 c(a aVar, byte[] bArr, y yVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                yVar = null;
            }
            return aVar.b(bArr, yVar);
        }

        public final e0 a(g gVar, y yVar, long j10) {
            k.e(gVar, "$this$asResponseBody");
            return new C0224a(gVar, yVar, j10);
        }

        public final e0 b(byte[] bArr, y yVar) {
            k.e(bArr, "$this$toResponseBody");
            return a(new e().l0(bArr), yVar, bArr.length);
        }
    }

    @Override
    public void close() {
        b.j(s());
    }

    public abstract long m();

    public abstract g s();
}
