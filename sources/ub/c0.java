package ub;

import hc.f;
import ra.g;
import ra.k;
import vb.b;

public abstract class c0 {
    public static final a f23748a = new a(null);

    public static final class a {

        public static final class C0223a extends c0 {
            public final byte[] f23749b;
            public final y f23750c;
            public final int f23751d;
            public final int f23752e;

            public C0223a(byte[] bArr, y yVar, int i10, int i11) {
                this.f23749b = bArr;
                this.f23750c = yVar;
                this.f23751d = i10;
                this.f23752e = i11;
            }

            @Override
            public long a() {
                return this.f23751d;
            }

            @Override
            public y b() {
                return this.f23750c;
            }

            @Override
            public void e(f fVar) {
                k.e(fVar, "sink");
                fVar.V(this.f23749b, this.f23752e, this.f23751d);
            }
        }

        public a() {
        }

        public a(g gVar) {
            this();
        }

        public static c0 b(a aVar, byte[] bArr, y yVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                yVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return aVar.a(bArr, yVar, i10, i11);
        }

        public final c0 a(byte[] bArr, y yVar, int i10, int i11) {
            k.e(bArr, "$this$toRequestBody");
            b.i(bArr.length, i10, i11);
            return new C0223a(bArr, yVar, i11, i10);
        }
    }

    public abstract long a();

    public abstract y b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void e(f fVar);
}
