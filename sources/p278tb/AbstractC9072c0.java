package p278tb;

import p095gc.AbstractC4550f;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC9072c0 {
    public static final C9073a f29074a = new C9073a(null);

    public static final class C9073a {

        public static final class C9074a extends AbstractC9072c0 {
            public final byte[] f29075b;
            public final C9131y f29076c;
            public final int f29077d;
            public final int f29078e;

            public C9074a(byte[] bArr, C9131y yVar, int i, int i2) {
                this.f29075b = bArr;
                this.f29076c = yVar;
                this.f29077d = i;
                this.f29078e = i2;
            }

            @Override
            public long mo10547a() {
                return this.f29077d;
            }

            @Override
            public C9131y mo10546b() {
                return this.f29076c;
            }

            @Override
            public void mo10545e(AbstractC4550f fVar) {
                C8298k.m12934e(fVar, "sink");
                fVar.mo27347U(this.f29075b, this.f29078e, this.f29077d);
            }
        }

        public C9073a() {
        }

        public static AbstractC9072c0 m10548b(C9073a aVar, byte[] bArr, C9131y yVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                yVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.m10549a(bArr, yVar, i, i2);
        }

        public final AbstractC9072c0 m10549a(byte[] bArr, C9131y yVar, int i, int i2) {
            C8298k.m12934e(bArr, "$this$toRequestBody");
            C9489b.m8515i(bArr.length, i, i2);
            return new C9074a(bArr, yVar, i2, i);
        }

        public C9073a(C8294g gVar) {
            this();
        }
    }

    public abstract long mo10547a();

    public abstract C9131y mo10546b();

    public boolean m10551c() {
        return false;
    }

    public boolean m10550d() {
        return false;
    }

    public abstract void mo10545e(AbstractC4550f fVar);
}
