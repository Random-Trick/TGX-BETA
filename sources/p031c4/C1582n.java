package p031c4;

import java.util.Arrays;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1237x;
import p031c4.AbstractC1571i0;
import p270t3.AbstractC8960h;
import p270t3.AbstractC8974t;

public final class C1582n implements AbstractC1581m {
    public static final double[] f5681q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String f5682a;
    public AbstractC8974t f5683b;
    public final C1579k0 f5684c;
    public final C1189b0 f5685d;
    public final C1596u f5686e;
    public final boolean[] f5687f;
    public final C1583a f5688g;
    public long f5689h;
    public boolean f5690i;
    public boolean f5691j;
    public long f5692k;
    public long f5693l;
    public long f5694m;
    public long f5695n;
    public boolean f5696o;
    public boolean f5697p;

    public static final class C1583a {
        public static final byte[] f5698e = {0, 0, 1};
        public boolean f5699a;
        public int f5700b;
        public int f5701c;
        public byte[] f5702d;

        public C1583a(int i) {
            this.f5702d = new byte[i];
        }

        public void m36385a(byte[] bArr, int i, int i2) {
            if (this.f5699a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f5702d;
                int length = bArr2.length;
                int i4 = this.f5700b;
                if (length < i4 + i3) {
                    this.f5702d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f5702d, this.f5700b, i3);
                this.f5700b += i3;
            }
        }

        public boolean m36384b(int i, int i2) {
            if (this.f5699a) {
                int i3 = this.f5700b - i2;
                this.f5700b = i3;
                if (this.f5701c == 0 && i == 181) {
                    this.f5701c = i3;
                } else {
                    this.f5699a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f5699a = true;
            }
            byte[] bArr = f5698e;
            m36385a(bArr, 0, bArr.length);
            return false;
        }

        public void m36383c() {
            this.f5699a = false;
            this.f5700b = 0;
            this.f5701c = 0;
        }
    }

    public C1582n() {
        this(null);
    }

    public static android.util.Pair<p174m3.C6600g1, java.lang.Long> m36386a(p031c4.C1582n.C1583a r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: p031c4.C1582n.m36386a(c4.n$a, java.lang.String):android.util.Pair");
    }

    @Override
    public void mo36333b(p020b5.C1189b0 r21) {
        throw new UnsupportedOperationException("Method not decompiled: p031c4.C1582n.mo36333b(b5.b0):void");
    }

    @Override
    public void mo36332c() {
        C1237x.m37855a(this.f5687f);
        this.f5688g.m36383c();
        C1596u uVar = this.f5686e;
        if (uVar != null) {
            uVar.m36323d();
        }
        this.f5689h = 0L;
        this.f5690i = false;
        this.f5693l = -9223372036854775807L;
        this.f5695n = -9223372036854775807L;
    }

    @Override
    public void mo36331d() {
    }

    @Override
    public void mo36330e(AbstractC8960h hVar, AbstractC1571i0.C1575d dVar) {
        dVar.m36406a();
        this.f5682a = dVar.m36405b();
        this.f5683b = hVar.mo6039r(dVar.m36404c(), 2);
        C1579k0 k0Var = this.f5684c;
        if (k0Var != null) {
            k0Var.m36388b(hVar, dVar);
        }
    }

    @Override
    public void mo36329f(long j, int i) {
        this.f5693l = j;
    }

    public C1582n(C1579k0 k0Var) {
        this.f5684c = k0Var;
        this.f5687f = new boolean[4];
        this.f5688g = new C1583a(Log.TAG_YOUTUBE);
        if (k0Var != null) {
            this.f5686e = new C1596u(178, Log.TAG_YOUTUBE);
            this.f5685d = new C1189b0();
        } else {
            this.f5686e = null;
            this.f5685d = null;
        }
        this.f5693l = -9223372036854775807L;
        this.f5695n = -9223372036854775807L;
    }
}
