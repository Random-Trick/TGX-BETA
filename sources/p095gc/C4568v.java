package p095gc;

import org.thunderdog.challegram.Log;
import p123ia.C5294h;
import qa.C8294g;
import qa.C8298k;

public final class C4568v {
    public static final C4569a f15003h = new C4569a(null);
    public final byte[] f15004a;
    public int f15005b;
    public int f15006c;
    public boolean f15007d;
    public boolean f15008e;
    public C4568v f15009f;
    public C4568v f15010g;

    public static final class C4569a {
        public C4569a() {
        }

        public C4569a(C8294g gVar) {
            this();
        }
    }

    public C4568v() {
        this.f15004a = new byte[Log.TAG_LUX];
        this.f15008e = true;
        this.f15007d = false;
    }

    public final void m27326a() {
        C4568v vVar = this.f15010g;
        int i = 0;
        if (vVar != this) {
            C8298k.m12935c(vVar);
            if (vVar.f15008e) {
                int i2 = this.f15006c - this.f15005b;
                C4568v vVar2 = this.f15010g;
                C8298k.m12935c(vVar2);
                int i3 = 8192 - vVar2.f15006c;
                C4568v vVar3 = this.f15010g;
                C8298k.m12935c(vVar3);
                if (!vVar3.f15007d) {
                    C4568v vVar4 = this.f15010g;
                    C8298k.m12935c(vVar4);
                    i = vVar4.f15005b;
                }
                if (i2 <= i3 + i) {
                    C4568v vVar5 = this.f15010g;
                    C8298k.m12935c(vVar5);
                    m27321f(vVar5, i2);
                    m27325b();
                    C4570w.m27319b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final C4568v m27325b() {
        C4568v vVar = this.f15009f;
        if (vVar == this) {
            vVar = null;
        }
        C4568v vVar2 = this.f15010g;
        C8298k.m12935c(vVar2);
        vVar2.f15009f = this.f15009f;
        C4568v vVar3 = this.f15009f;
        C8298k.m12935c(vVar3);
        vVar3.f15010g = this.f15010g;
        this.f15009f = null;
        this.f15010g = null;
        return vVar;
    }

    public final C4568v m27324c(C4568v vVar) {
        C8298k.m12933e(vVar, "segment");
        vVar.f15010g = this;
        vVar.f15009f = this.f15009f;
        C4568v vVar2 = this.f15009f;
        C8298k.m12935c(vVar2);
        vVar2.f15010g = vVar;
        this.f15009f = vVar;
        return vVar;
    }

    public final C4568v m27323d() {
        this.f15007d = true;
        return new C4568v(this.f15004a, this.f15005b, this.f15006c, true, false);
    }

    public final C4568v m27322e(int i) {
        C4568v vVar;
        if (i > 0 && i <= this.f15006c - this.f15005b) {
            if (i >= 1024) {
                vVar = m27323d();
            } else {
                vVar = C4570w.m27318c();
                byte[] bArr = this.f15004a;
                byte[] bArr2 = vVar.f15004a;
                int i2 = this.f15005b;
                C5294h.m23431f(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            vVar.f15006c = vVar.f15005b + i;
            this.f15005b += i;
            C4568v vVar2 = this.f15010g;
            C8298k.m12935c(vVar2);
            vVar2.m27324c(vVar);
            return vVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void m27321f(C4568v vVar, int i) {
        C8298k.m12933e(vVar, "sink");
        if (vVar.f15008e) {
            int i2 = vVar.f15006c;
            if (i2 + i > 8192) {
                if (!vVar.f15007d) {
                    int i3 = vVar.f15005b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = vVar.f15004a;
                        C5294h.m23431f(bArr, bArr, 0, i3, i2, 2, null);
                        vVar.f15006c -= vVar.f15005b;
                        vVar.f15005b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f15004a;
            byte[] bArr3 = vVar.f15004a;
            int i4 = vVar.f15006c;
            int i5 = this.f15005b;
            C5294h.m23433d(bArr2, bArr3, i4, i5, i5 + i);
            vVar.f15006c += i;
            this.f15005b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C4568v(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C8298k.m12933e(bArr, "data");
        this.f15004a = bArr;
        this.f15005b = i;
        this.f15006c = i2;
        this.f15007d = z;
        this.f15008e = z2;
    }
}
