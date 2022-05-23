package hc;

import ja.h;
import org.thunderdog.challegram.Log;
import ra.g;
import ra.k;

public final class v {
    public static final a f12671h = new a(null);
    public final byte[] f12672a;
    public int f12673b;
    public int f12674c;
    public boolean f12675d;
    public boolean f12676e;
    public v f12677f;
    public v f12678g;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }
    }

    public v() {
        this.f12672a = new byte[Log.TAG_LUX];
        this.f12676e = true;
        this.f12675d = false;
    }

    public final void a() {
        v vVar = this.f12678g;
        int i10 = 0;
        if (vVar != this) {
            k.c(vVar);
            if (vVar.f12676e) {
                int i11 = this.f12674c - this.f12673b;
                v vVar2 = this.f12678g;
                k.c(vVar2);
                int i12 = 8192 - vVar2.f12674c;
                v vVar3 = this.f12678g;
                k.c(vVar3);
                if (!vVar3.f12675d) {
                    v vVar4 = this.f12678g;
                    k.c(vVar4);
                    i10 = vVar4.f12673b;
                }
                if (i11 <= i12 + i10) {
                    v vVar5 = this.f12678g;
                    k.c(vVar5);
                    f(vVar5, i11);
                    b();
                    w.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final v b() {
        v vVar = this.f12677f;
        if (vVar == this) {
            vVar = null;
        }
        v vVar2 = this.f12678g;
        k.c(vVar2);
        vVar2.f12677f = this.f12677f;
        v vVar3 = this.f12677f;
        k.c(vVar3);
        vVar3.f12678g = this.f12678g;
        this.f12677f = null;
        this.f12678g = null;
        return vVar;
    }

    public final v c(v vVar) {
        k.e(vVar, "segment");
        vVar.f12678g = this;
        vVar.f12677f = this.f12677f;
        v vVar2 = this.f12677f;
        k.c(vVar2);
        vVar2.f12678g = vVar;
        this.f12677f = vVar;
        return vVar;
    }

    public final v d() {
        this.f12675d = true;
        return new v(this.f12672a, this.f12673b, this.f12674c, true, false);
    }

    public final v e(int i10) {
        v vVar;
        if (i10 > 0 && i10 <= this.f12674c - this.f12673b) {
            if (i10 >= 1024) {
                vVar = d();
            } else {
                vVar = w.c();
                byte[] bArr = this.f12672a;
                byte[] bArr2 = vVar.f12672a;
                int i11 = this.f12673b;
                h.f(bArr, bArr2, 0, i11, i11 + i10, 2, null);
            }
            vVar.f12674c = vVar.f12673b + i10;
            this.f12673b += i10;
            v vVar2 = this.f12678g;
            k.c(vVar2);
            vVar2.c(vVar);
            return vVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final void f(v vVar, int i10) {
        k.e(vVar, "sink");
        if (vVar.f12676e) {
            int i11 = vVar.f12674c;
            if (i11 + i10 > 8192) {
                if (!vVar.f12675d) {
                    int i12 = vVar.f12673b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = vVar.f12672a;
                        h.f(bArr, bArr, 0, i12, i11, 2, null);
                        vVar.f12674c -= vVar.f12673b;
                        vVar.f12673b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f12672a;
            byte[] bArr3 = vVar.f12672a;
            int i13 = vVar.f12674c;
            int i14 = this.f12673b;
            h.d(bArr2, bArr3, i13, i14, i14 + i10);
            vVar.f12674c += i10;
            this.f12673b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public v(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        k.e(bArr, "data");
        this.f12672a = bArr;
        this.f12673b = i10;
        this.f12674c = i11;
        this.f12675d = z10;
        this.f12676e = z11;
    }
}
