package p278tb;

import p095gc.AbstractC4550f;
import p290ub.C9489b;
import qa.C8294g;
import qa.C8298k;

public abstract class AbstractC9072c0 {
    public static final C9073a f29077a = new C9073a(null);

    public static final class C9073a {

        public static final class C9074a extends AbstractC9072c0 {
            public final byte[] f29078b;
            public final C9131y f29079c;
            public final int f29080d;
            public final int f29081e;

            public C9074a(byte[] bArr, C9131y yVar, int i, int i2) {
                this.f29078b = bArr;
                this.f29079c = yVar;
                this.f29080d = i;
                this.f29081e = i2;
            }

            @Override
            public long mo10546a() {
                return this.f29080d;
            }

            @Override
            public C9131y mo10545b() {
                return this.f29079c;
            }

            @Override
            public void mo10544e(AbstractC4550f fVar) {
                C8298k.m12933e(fVar, "sink");
                fVar.mo27349U(this.f29078b, this.f29081e, this.f29080d);
            }
        }

        public C9073a() {
        }

        public static AbstractC9072c0 m10547b(C9073a aVar, byte[] bArr, C9131y yVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                yVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.m10548a(bArr, yVar, i, i2);
        }

        public final AbstractC9072c0 m10548a(byte[] bArr, C9131y yVar, int i, int i2) {
            C8298k.m12933e(bArr, "$this$toRequestBody");
            C9489b.m8515i(bArr.length, i, i2);
            return new C9074a(bArr, yVar, i2, i);
        }

        public C9073a(C8294g gVar) {
            this();
        }
    }

    public abstract long mo10546a();

    public abstract C9131y mo10545b();

    public boolean m10550c() {
        return false;
    }

    public boolean m10549d() {
        return false;
    }

    public abstract void mo10544e(AbstractC4550f fVar);
}
