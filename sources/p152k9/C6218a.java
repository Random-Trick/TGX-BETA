package p152k9;

import android.opengl.GLES20;
import p064e9.AbstractC4173e;
import p064e9.C4172d;
import p064e9.C4174f;
import p106h9.C5038f;
import p107ha.C5055m;
import p107ha.C5057n;
import p107ha.C5060q;
import pa.AbstractC8077a;
import qa.AbstractC8299l;
import qa.C8294g;

public final class C6218a implements AbstractC4173e {
    public final int f19632a;
    public final int f19633b;
    public final int f19634c;
    public final Integer f19635d;
    public final Integer f19636e;
    public final Integer f19637f;
    public final Integer f19638g;

    public static final class C6219a extends AbstractC8299l implements AbstractC8077a<C5060q> {
        public final Integer f19640c;

        public C6219a(Integer num) {
            super(0);
            this.f19640c = num;
        }

        @Override
        public C5060q mo4925b() {
            m21042f();
            return C5060q.f17066a;
        }

        public final void m21042f() {
            if (!(C6218a.this.m21044h() == null || C6218a.this.m21048d() == null || C6218a.this.m21049c() == null || this.f19640c == null || C6218a.this.m21045g() == null)) {
                GLES20.glTexImage2D(C5055m.m24188a(C6218a.this.m21046f()), 0, this.f19640c.intValue(), C6218a.this.m21044h().intValue(), C6218a.this.m21048d().intValue(), 0, C5055m.m24188a(C6218a.this.m21049c().intValue()), C5055m.m24188a(C6218a.this.m21045g().intValue()), null);
            }
            GLES20.glTexParameterf(C5055m.m24188a(C6218a.this.m21046f()), C5038f.m24212l(), C5038f.m24217g());
            GLES20.glTexParameterf(C5055m.m24188a(C6218a.this.m21046f()), C5038f.m24213k(), C5038f.m24219e());
            GLES20.glTexParameteri(C5055m.m24188a(C6218a.this.m21046f()), C5038f.m24211m(), C5038f.m24223a());
            GLES20.glTexParameteri(C5055m.m24188a(C6218a.this.m21046f()), C5038f.m24210n(), C5038f.m24223a());
            C4172d.m28624b("glTexParameter");
        }
    }

    public C6218a() {
        this(0, 0, null, 7, null);
    }

    public C6218a(int i, int i2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        int i3;
        this.f19633b = i;
        this.f19634c = i2;
        this.f19635d = num2;
        this.f19636e = num3;
        this.f19637f = num4;
        this.f19638g = num6;
        if (num != null) {
            i3 = num.intValue();
        } else {
            int[] h = C5057n.m24187h(1);
            int r = C5057n.m24184r(h);
            int[] iArr = new int[r];
            for (int i4 = 0; i4 < r; i4++) {
                iArr[i4] = C5057n.m24185m(h, i4);
            }
            GLES20.glGenTextures(1, iArr, 0);
            C5060q qVar = C5060q.f17066a;
            for (int i5 = 0; i5 < 1; i5++) {
                C5057n.m24183s(h, i5, C5055m.m24188a(iArr[i5]));
            }
            C4172d.m28624b("glGenTextures");
            i3 = C5057n.m24185m(h, 0);
        }
        this.f19632a = i3;
        if (num == null) {
            C4174f.m28622a(this, new C6219a(num5));
        }
    }

    @Override
    public void mo21051a() {
        GLES20.glBindTexture(C5055m.m24188a(this.f19634c), C5055m.m24188a(0));
        GLES20.glActiveTexture(C5038f.m24215i());
        C4172d.m28624b("unbind");
    }

    @Override
    public void mo21050b() {
        GLES20.glActiveTexture(C5055m.m24188a(this.f19633b));
        GLES20.glBindTexture(C5055m.m24188a(this.f19634c), C5055m.m24188a(this.f19632a));
        C4172d.m28624b("bind");
    }

    public final Integer m21049c() {
        return this.f19637f;
    }

    public final Integer m21048d() {
        return this.f19636e;
    }

    public final int m21047e() {
        return this.f19632a;
    }

    public final int m21046f() {
        return this.f19634c;
    }

    public final Integer m21045g() {
        return this.f19638g;
    }

    public final Integer m21044h() {
        return this.f19635d;
    }

    public final void m21043i() {
        int[] iArr = {C5055m.m24188a(this.f19632a)};
        int r = C5057n.m24184r(iArr);
        int[] iArr2 = new int[r];
        for (int i = 0; i < r; i++) {
            iArr2[i] = C5057n.m24185m(iArr, i);
        }
        GLES20.glDeleteTextures(1, iArr2, 0);
        C5060q qVar = C5060q.f17066a;
        for (int i2 = 0; i2 < 1; i2++) {
            C5057n.m24183s(iArr, i2, C5055m.m24188a(iArr2[i2]));
        }
    }

    public C6218a(int i, int i2, Integer num, int i3, C8294g gVar) {
        this((i3 & 1) != 0 ? C5038f.m24215i() : i, (i3 & 2) != 0 ? C5038f.m24214j() : i2, (i3 & 4) != 0 ? null : num);
    }

    public C6218a(int i, int i2, Integer num) {
        this(i, i2, num, null, null, null, null, null);
    }
}
