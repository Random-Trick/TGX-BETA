package hd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import ce.a0;
import ce.p0;
import ce.y;
import eb.k;
import gb.g;
import ib.d;
import ie.t;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld.b;
import ld.v;
import od.l1;
import org.drinkless.td.libcore.telegram.TdApi;

public class z0 implements k.b, b.a {
    public static float[] f13765j0 = new float[8];
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public b[] T;
    public int U;
    public int V;
    public b[] W;
    public k X;
    public int Y;
    public int Z;
    public final ArrayList<f0> f13766a;
    public b[] f13767a0;
    public final s4 f13768b;
    public float f13769b0;
    public g f13770c;
    public int f13772d0;
    public int f13773e0;
    public f0 f13774f0;
    public TdApi.ChatType f13775g0;
    public int f13776h0;
    public int f13777i0;
    public boolean M = true;
    public boolean N = true;
    public final List<Reference<a>> f13771c0 = new ArrayList();

    public interface a {
        void a(boolean z10);
    }

    public static class b {
        public z0 f13778a;
        public f0 f13779b;
        public int f13780c;
        public int f13781d;
        public int f13782e;
        public float f13783f;
        public int f13784g;
        public int f13785h;
        public int f13786i;
        public int f13787j;
        public int f13788k;
        public b f13789l;
        public int f13790m;

        public b(z0 z0Var, f0 f0Var, int i10, int i11, int i12, float f10) {
            this.f13778a = z0Var;
            this.f13779b = f0Var;
            this.f13780c = i10;
            this.f13781d = i11;
            this.f13782e = i12;
            this.f13783f = f10;
        }

        public void a() {
            if (this.f13778a.f13769b0 != 0.0f) {
                this.f13785h = f();
                this.f13786i = g();
                this.f13787j = e();
                this.f13788k = d();
            }
            this.f13790m = 0;
        }

        public boolean b(b bVar) {
            return bVar.f13779b == this.f13779b && bVar.f13784g == this.f13784g && bVar.f13785h == this.f13785h && bVar.f13786i == this.f13786i && bVar.f13787j == this.f13787j && bVar.f13788k == this.f13788k;
        }

        public float c() {
            float f10 = this.f13778a.f13769b0;
            if (this.f13790m == 1) {
                if (f10 == 0.0f || this.f13789l != null) {
                    return 0.0f;
                }
                return f10;
            } else if (f10 == 0.0f || this.f13789l != null) {
                return 1.0f;
            } else {
                return 1.0f - f10;
            }
        }

        public int d() {
            b bVar;
            float f10 = this.f13778a.f13769b0;
            if (f10 == 0.0f || (bVar = this.f13789l) == null) {
                return this.f13788k;
            }
            int i10 = this.f13788k;
            return i10 + ((int) ((bVar.f13788k - i10) * f10));
        }

        public int e() {
            b bVar;
            float f10 = this.f13778a.f13769b0;
            if (f10 == 0.0f || (bVar = this.f13789l) == null) {
                return this.f13787j;
            }
            int i10 = this.f13787j;
            return i10 + ((int) ((bVar.f13787j - i10) * f10));
        }

        public int f() {
            b bVar;
            float f10 = this.f13778a.f13769b0;
            if (f10 == 0.0f || (bVar = this.f13789l) == null) {
                return this.f13785h;
            }
            int i10 = this.f13785h;
            return i10 + ((int) ((bVar.f13785h - i10) * f10));
        }

        public int g() {
            b bVar;
            float f10 = this.f13778a.f13769b0;
            if (f10 == 0.0f || (bVar = this.f13789l) == null) {
                return this.f13786i;
            }
            int i10 = this.f13786i;
            return i10 + ((int) ((bVar.f13786i - i10) * f10));
        }

        public boolean h() {
            int i10 = this.f13784g;
            return ((i10 & 4) == 0 || (i10 & 2) == 0 || !this.f13778a.N) ? false : true;
        }

        public boolean i() {
            int i10 = this.f13784g;
            return ((i10 & 8) == 0 || (i10 & 2) == 0 || !this.f13778a.N) ? false : true;
        }

        public boolean j() {
            int i10 = this.f13784g;
            return ((i10 & 4) == 0 || (i10 & 1) == 0 || !this.f13778a.M) ? false : true;
        }

        public boolean k() {
            int i10 = this.f13784g;
            return ((i10 & 8) == 0 || (i10 & 1) == 0 || !this.f13778a.M) ? false : true;
        }

        public void l(b bVar) {
            this.f13789l = bVar;
        }
    }

    public static class c {
        public int[] f13791a;
        public float[] f13792b;

        public c(int[] iArr, float[] fArr) {
            this.f13791a = iArr;
            this.f13792b = fArr;
        }
    }

    public z0(f0 f0Var, s4 s4Var) {
        ArrayList<f0> arrayList = new ArrayList<>();
        this.f13766a = arrayList;
        arrayList.add(f0Var);
        this.f13768b = s4Var;
        this.S += f0Var.F() / f0Var.E();
    }

    public static int I(z0 z0Var, ld.b bVar, boolean z10, b[] bVarArr, int i10) {
        int i11;
        ?? r11;
        if (bVarArr != null) {
            int length = bVarArr.length;
            int i12 = 0;
            while (i12 < length) {
                b bVar2 = bVarArr[i12];
                if (i10 == -1) {
                    i10 = bVar2.f13779b.M();
                    i11 = i10;
                } else {
                    i11 = i10 + 1;
                }
                ld.c l10 = bVar.l(i10);
                l10.setTag(z0Var);
                if (!z10 || bVar2.f13779b.E0()) {
                    bVar2.f13779b.n0(l10);
                }
                bVar2.f13779b.w0(l10);
                if (bVar2.f13779b.h0()) {
                    r11 = bVar.j(i10);
                    bVar2.f13779b.l0(r11);
                } else {
                    r11 = bVar.k(i10);
                    bVar2.f13779b.m0(r11);
                }
                r11.setTag(z0Var);
                bVar2.f13779b.z0(r11);
                i12++;
                i10 = i11;
            }
        }
        return i10;
    }

    public static <T extends View & t> void n(T t10, Canvas canvas, int i10, int i11, ld.b bVar, b[] bVarArr, boolean z10) {
        int i12;
        if (bVarArr != null) {
            for (b bVar2 : bVarArr) {
                ld.c K = bVar2.f13779b.K();
                v R = bVar2.f13779b.R();
                if (K != null && R != null) {
                    int f10 = i10 + bVar2.f();
                    int g10 = i11 + bVar2.g();
                    int e10 = bVar2.e();
                    int d10 = bVar2.d();
                    float c10 = bVar2.c();
                    boolean z11 = c10 != 1.0f;
                    if (z11) {
                        int O = p0.O(canvas);
                        float f11 = (0.4f * c10) + 0.6f;
                        canvas.scale(f11, f11, (e10 / 2) + f10, g10 + (d10 / 2));
                        K.V(K.getAlpha() * c10);
                        i12 = O;
                    } else {
                        i12 = -1;
                    }
                    bVar2.f13779b.j(e10, d10);
                    bVar2.f13779b.s(t10, canvas, f10, g10, K, R, 1.0f);
                    if (z10) {
                        Paint D0 = y.D0(d.a(c10, 436207616));
                        float[] fArr = f13765j0;
                        float f12 = f10;
                        fArr[4] = f12;
                        fArr[0] = f12;
                        float f13 = f10 + e10;
                        fArr[6] = f13;
                        fArr[2] = f13;
                        float f14 = g10;
                        fArr[3] = f14;
                        fArr[1] = f14;
                        float f15 = g10 + d10;
                        fArr[7] = f15;
                        fArr[5] = f15;
                        canvas.drawLine(fArr[0], fArr[1], fArr[2], fArr[3], D0);
                        float[] fArr2 = f13765j0;
                        canvas.drawLine(fArr2[4], fArr2[5], fArr2[6], fArr2[7], D0);
                    }
                    if (z11) {
                        p0.N(canvas, i12);
                        K.Q();
                    }
                }
            }
        }
    }

    public static int r(float f10) {
        return (int) Math.floor(f10);
    }

    public static float z(float[] fArr, int i10, int i11, int i12, float f10) {
        float f11 = 0.0f;
        if (i10 == 0 && i11 == fArr.length) {
            for (float f12 : fArr) {
                f11 += f12;
            }
            return (i12 - ((fArr.length - 1) * f10)) / f11;
        }
        for (int i13 = i10; i13 < i11; i13++) {
            f11 += fArr[i13];
        }
        return (i12 - (((i11 - i10) - 1) * f10)) / f11;
    }

    public void A() {
        b[] bVarArr = this.T;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.f13779b.G().R();
            }
        }
        b[] bVarArr2 = this.W;
        if (bVarArr2 != null) {
            for (b bVar2 : bVarArr2) {
                bVar2.f13779b.G().R();
            }
        }
    }

    public final void B(int i10, int i11, boolean z10) {
        this.f13772d0 = i10;
        this.f13773e0 = i11;
        for (int size = this.f13771c0.size() - 1; size >= 0; size--) {
            a aVar = this.f13771c0.get(size).get();
            if (aVar != null) {
                aVar.a(z10);
            } else {
                this.f13771c0.remove(size);
            }
        }
    }

    public boolean C(View view, MotionEvent motionEvent) {
        b[] bVarArr;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f13774f0 = null;
            if (!x() && (bVarArr = this.T) != null) {
                int length = bVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    b bVar = bVarArr[i10];
                    if (bVar.f13779b.i0(view, motionEvent)) {
                        this.f13774f0 = bVar.f13779b;
                        break;
                    }
                    i10++;
                }
            }
            return this.f13774f0 != null;
        } else if (action == 1 || action == 3) {
            f0 f0Var = this.f13774f0;
            if (f0Var == null) {
                return false;
            }
            boolean i02 = f0Var.i0(view, motionEvent);
            this.f13774f0 = null;
            return i02;
        } else {
            f0 f0Var2 = this.f13774f0;
            return f0Var2 != null && f0Var2.i0(view, motionEvent);
        }
    }

    public boolean D(View view) {
        f0 f0Var = this.f13774f0;
        if (f0Var == null) {
            return false;
        }
        boolean j02 = f0Var.j0(view);
        this.f13774f0 = null;
        return j02;
    }

    public int E() {
        this.O = false;
        return f(this.P, this.Q, this.R, true);
    }

    public int F(long j10, int i10) {
        b[] bVarArr;
        b[] bVarArr2 = this.T;
        if (bVarArr2 == null) {
            return 0;
        }
        if (i10 >= 0 && i10 < bVarArr2.length) {
            f0 f0Var = bVarArr2[i10].f13779b;
            if (f0Var.G().v() == j10) {
                return G(f0Var, true);
            }
        }
        for (b bVar : this.T) {
            if (bVar.f13779b.G().v() == j10) {
                return G(bVar.f13779b, true);
            }
        }
        return 0;
    }

    public int G(f0 f0Var, boolean z10) {
        if (this.f13766a.remove(f0Var)) {
            this.S -= f0Var.F() / f0Var.E();
            if (this.O) {
                this.O = false;
                return f(this.P, this.Q, this.R, z10);
            }
        }
        return 0;
    }

    public int H(f0 f0Var) {
        Iterator<f0> it = this.f13766a.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            f0 next = it.next();
            if (f0Var.N() == next.N()) {
                this.f13766a.set(i10, f0Var);
                if (next.F() != f0Var.F() || next.E() != f0Var.E()) {
                    return E();
                }
            } else {
                i10++;
            }
        }
        return 0;
    }

    public void J(ld.b bVar, boolean z10) {
        I(this, bVar, z10, this.T, -1);
        I(this, bVar, z10, this.W, -1);
        bVar.f(this);
    }

    public final int K(int r17, int r18, hd.z0.b[] r19, int r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: hd.z0.K(int, int, hd.z0$b[], int, boolean, boolean):int");
    }

    public void L(boolean z10, boolean z11) {
        if (!(this.M == z10 && this.N == z11)) {
            this.M = z10;
            this.N = z11;
            b[] bVarArr = this.T;
            if (bVarArr != null) {
                for (b bVar : bVarArr) {
                    bVar.f13779b.r0(bVar.j(), bVar.k(), bVar.i(), bVar.h());
                }
            }
            b[] bVarArr2 = this.W;
            if (bVarArr2 != null) {
                for (b bVar2 : bVarArr2) {
                    bVar2.f13779b.r0(bVar2.j(), bVar2.k(), bVar2.i(), bVar2.h());
                }
            }
        }
    }

    public void M(long j10, k kVar) {
        Iterator<f0> it = this.f13766a.iterator();
        while (it.hasNext()) {
            f0 next = it.next();
            if (next.N() == j10) {
                next.y0(kVar);
                return;
            }
        }
    }

    public void N(long j10, long j11, boolean z10) {
        b[] bVarArr = this.T;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.f13779b.I0(j10, j11, z10);
            }
        }
        b[] bVarArr2 = this.W;
        if (bVarArr2 != null) {
            for (b bVar2 : bVarArr2) {
                bVar2.f13779b.I0(j10, j11, z10);
            }
        }
    }

    public void d(f0 f0Var, boolean z10) {
        if (z10) {
            this.f13766a.add(f0Var);
        } else {
            this.f13766a.add(0, f0Var);
        }
        this.S += f0Var.F() / f0Var.E();
        this.O = false;
    }

    public void e(TdApi.ChatType chatType) {
        this.f13775g0 = chatType;
        b[] bVarArr = this.T;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.f13779b.G().m(chatType);
            }
        }
        b[] bVarArr2 = this.W;
        if (bVarArr2 != null) {
            for (b bVar2 : bVarArr2) {
                bVar2.f13779b.G().m(chatType);
            }
        }
    }

    public int f(int i10, int i11, int i12, boolean z10) {
        return g(i10, i11, i12, z10, false, 1.0f);
    }

    public final int g(int r28, int r29, int r30, boolean r31, boolean r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: hd.z0.g(int, int, int, boolean, boolean, float):int");
    }

    public final void h() {
        this.f13774f0 = null;
    }

    public final void i() {
        b[] bVarArr = this.W;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.f13790m = 0;
            }
            this.W = null;
        }
    }

    @Override
    public boolean j(int i10, v vVar, long j10) {
        return vVar.getTag() == this;
    }

    public final void k() {
        k kVar = this.X;
        if (kVar == null) {
            return;
        }
        if (kVar.v() || this.X.o() != 0.0f) {
            this.X.l(0.0f);
            for (b bVar : this.T) {
                bVar.a();
            }
            i();
            this.f13769b0 = 0.0f;
        }
    }

    public void l() {
        b[] bVarArr = this.T;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.f13779b.r();
            }
        }
        b[] bVarArr2 = this.W;
        if (bVarArr2 != null) {
            for (b bVar2 : bVarArr2) {
                bVar2.f13779b.r();
            }
        }
    }

    public <T extends View & t> void m(T t10, Canvas canvas, int i10, int i11, ld.b bVar, boolean z10) {
        this.f13776h0 = i10;
        this.f13777i0 = i11;
        n(t10, canvas, i10, i11, bVar, this.T, z10);
        n(t10, canvas, i10, i11, bVar, this.W, z10);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        this.f13769b0 = f10;
        int i11 = this.U;
        int i12 = i11 + ((int) ((this.Y - i11) * f10));
        int i13 = this.V;
        int i14 = i13 + ((int) ((this.Z - i13) * f10));
        B(i12, i14, (i12 == this.f13772d0 && i14 == this.f13773e0) ? false : true);
    }

    public b o(long j10) {
        b[] bVarArr = this.T;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar.f13779b.N() == j10) {
                    return bVar;
                }
            }
        }
        b[] bVarArr2 = this.W;
        if (bVarArr2 == null) {
            return null;
        }
        for (b bVar2 : bVarArr2) {
            if (bVar2.f13779b.N() == j10) {
                return bVar2;
            }
        }
        return null;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (f10 == 1.0f) {
            this.X.l(0.0f);
            i();
            this.f13769b0 = 0.0f;
            this.U = this.Y;
            this.V = this.Z;
            this.T = this.f13767a0;
            this.Z = 0;
            this.Y = 0;
            this.f13767a0 = null;
        }
    }

    public f0 p(long j10) {
        b o10 = o(j10);
        if (o10 != null) {
            return o10.f13779b;
        }
        return null;
    }

    public f0 q(float f10, float f11) {
        b[] bVarArr;
        if (this.T == null) {
            return null;
        }
        float f12 = f10 - this.f13776h0;
        float f13 = f11 - this.f13777i0;
        int i10 = a0.i(2.0f);
        for (b bVar : this.T) {
            int B = bVar.f13779b.B();
            int x10 = bVar.f13779b.x();
            int i11 = bVar.f13785h;
            int i12 = B + i11;
            int i13 = bVar.f13784g;
            if ((i13 & 8) == 0) {
                i12 += i10;
            }
            int i14 = bVar.f13786i;
            int i15 = x10 + i14;
            if ((i13 & 2) == 0) {
                i15 += i10;
            }
            if (f12 >= i11 && f12 <= i12 && f13 >= i14 && f13 <= i15) {
                return bVar.f13779b;
            }
        }
        return null;
    }

    public float s() {
        if (this.f13766a.isEmpty()) {
            return 1.0f;
        }
        return this.S / this.f13766a.size();
    }

    public int t() {
        k kVar = this.X;
        if (kVar == null || !kVar.v()) {
            return this.V;
        }
        return this.Z;
    }

    public l1 u(long j10, View view, int i10, int i11, int i12) {
        b o10 = o(j10);
        if (o10 == null) {
            return null;
        }
        l1 I = o10.f13779b.I(view, i10, i11, i12);
        if (I != null) {
            int i13 = o10.f13784g;
            if ((i13 & 1) == 0 || (i13 & 4) == 0) {
                I.r(0);
            }
            int i14 = o10.f13784g;
            if ((i14 & 1) == 0 || (i14 & 8) == 0) {
                I.s(0);
            }
            int i15 = o10.f13784g;
            if ((i15 & 2) == 0 || (i15 & 8) == 0) {
                I.k(0);
            }
            int i16 = o10.f13784g;
            if ((i16 & 2) == 0 || (i16 & 4) == 0) {
                I.j(0);
            }
        }
        return I;
    }

    public f0 v() {
        return this.f13766a.get(0);
    }

    public int w() {
        k kVar = this.X;
        if (kVar == null || !kVar.v()) {
            return this.U;
        }
        return this.Y;
    }

    public final boolean x() {
        k kVar;
        return this.f13769b0 != 0.0f || ((kVar = this.X) != null && kVar.v());
    }

    public boolean y() {
        return this.f13766a.size() == 1;
    }
}
