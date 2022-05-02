package gd;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import be.C1357a0;
import be.C1399s0;
import be.C1410y;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p051db.C3950k;
import p080fb.C4341g;
import p108hb.C5064d;
import p111he.AbstractC5143t;
import p156kd.AbstractC6264v;
import p156kd.C6238b;
import p156kd.C6240c;
import p194nd.C7462l1;

public class C4848z0 implements C3950k.AbstractC3952b, C6238b.AbstractC6239a {
    public static float[] f16528j0 = new float[8];
    public boolean f16531O;
    public int f16532P;
    public int f16533Q;
    public int f16534R;
    public float f16535S;
    public C4850b[] f16536T;
    public int f16537U;
    public int f16538V;
    public C4850b[] f16539W;
    public C3950k f16540X;
    public int f16541Y;
    public int f16542Z;
    public final ArrayList<C4630f0> f16543a;
    public C4850b[] f16544a0;
    public final AbstractC4761s4 f16545b;
    public float f16546b0;
    public C4341g f16547c;
    public int f16549d0;
    public int f16550e0;
    public C4630f0 f16551f0;
    public TdApi.ChatType f16552g0;
    public int f16553h0;
    public int f16554i0;
    public boolean f16529M = true;
    public boolean f16530N = true;
    public final List<Reference<AbstractC4849a>> f16548c0 = new ArrayList();

    public interface AbstractC4849a {
        void m25008a(boolean z);
    }

    public static class C4850b {
        public C4848z0 f16555a;
        public C4630f0 f16556b;
        public int f16557c;
        public int f16558d;
        public int f16559e;
        public float f16560f;
        public int f16561g;
        public int f16562h;
        public int f16563i;
        public int f16564j;
        public int f16565k;
        public C4850b f16566l;
        public int f16567m;

        public C4850b(C4848z0 z0Var, C4630f0 f0Var, int i, int i2, int i3, float f) {
            this.f16555a = z0Var;
            this.f16556b = f0Var;
            this.f16557c = i;
            this.f16558d = i2;
            this.f16559e = i3;
            this.f16560f = f;
        }

        public void m25007a() {
            if (this.f16555a.f16546b0 != 0.0f) {
                this.f16562h = m25002f();
                this.f16563i = m25001g();
                this.f16564j = m25003e();
                this.f16565k = m25004d();
            }
            this.f16567m = 0;
        }

        public boolean m25006b(C4850b bVar) {
            return bVar.f16556b == this.f16556b && bVar.f16561g == this.f16561g && bVar.f16562h == this.f16562h && bVar.f16563i == this.f16563i && bVar.f16564j == this.f16564j && bVar.f16565k == this.f16565k;
        }

        public float m25005c() {
            float f = this.f16555a.f16546b0;
            if (this.f16567m == 1) {
                if (f == 0.0f || this.f16566l != null) {
                    return 0.0f;
                }
                return f;
            } else if (f == 0.0f || this.f16566l != null) {
                return 1.0f;
            } else {
                return 1.0f - f;
            }
        }

        public int m25004d() {
            C4850b bVar;
            float f = this.f16555a.f16546b0;
            if (f == 0.0f || (bVar = this.f16566l) == null) {
                return this.f16565k;
            }
            int i = this.f16565k;
            return i + ((int) ((bVar.f16565k - i) * f));
        }

        public int m25003e() {
            C4850b bVar;
            float f = this.f16555a.f16546b0;
            if (f == 0.0f || (bVar = this.f16566l) == null) {
                return this.f16564j;
            }
            int i = this.f16564j;
            return i + ((int) ((bVar.f16564j - i) * f));
        }

        public int m25002f() {
            C4850b bVar;
            float f = this.f16555a.f16546b0;
            if (f == 0.0f || (bVar = this.f16566l) == null) {
                return this.f16562h;
            }
            int i = this.f16562h;
            return i + ((int) ((bVar.f16562h - i) * f));
        }

        public int m25001g() {
            C4850b bVar;
            float f = this.f16555a.f16546b0;
            if (f == 0.0f || (bVar = this.f16566l) == null) {
                return this.f16563i;
            }
            int i = this.f16563i;
            return i + ((int) ((bVar.f16563i - i) * f));
        }

        public boolean m25000h() {
            int i = this.f16561g;
            return ((i & 4) == 0 || (i & 2) == 0 || !this.f16555a.f16530N) ? false : true;
        }

        public boolean m24999i() {
            int i = this.f16561g;
            return ((i & 8) == 0 || (i & 2) == 0 || !this.f16555a.f16530N) ? false : true;
        }

        public boolean m24998j() {
            int i = this.f16561g;
            return ((i & 4) == 0 || (i & 1) == 0 || !this.f16555a.f16529M) ? false : true;
        }

        public boolean m24997k() {
            int i = this.f16561g;
            return ((i & 8) == 0 || (i & 1) == 0 || !this.f16555a.f16529M) ? false : true;
        }

        public void m24996l(C4850b bVar) {
            this.f16566l = bVar;
        }
    }

    public static class C4851c {
        public int[] f16568a;
        public float[] f16569b;

        public C4851c(int[] iArr, float[] fArr) {
            this.f16568a = iArr;
            this.f16569b = fArr;
        }
    }

    public C4848z0(C4630f0 f0Var, AbstractC4761s4 s4Var) {
        ArrayList<C4630f0> arrayList = new ArrayList<>();
        this.f16543a = arrayList;
        arrayList.add(f0Var);
        this.f16545b = s4Var;
        this.f16535S += f0Var.m26783F() / f0Var.m26785E();
    }

    public static int m25039I(C4848z0 z0Var, C6238b bVar, boolean z, C4850b[] bVarArr, int i) {
        int i2;
        ?? r11;
        if (bVarArr != null) {
            int length = bVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                C4850b bVar2 = bVarArr[i3];
                if (i == -1) {
                    i = bVar2.f16556b.m26771M();
                    i2 = i;
                } else {
                    i2 = i + 1;
                }
                C6240c l = bVar.m20992l(i);
                l.setTag(z0Var);
                if (!z || bVar2.f16556b.m26786D0()) {
                    bVar2.f16556b.m26734n0(l);
                }
                bVar2.f16556b.m26716w0(l);
                if (bVar2.f16556b.m26746h0()) {
                    r11 = bVar.m20994j(i);
                    bVar2.f16556b.m26738l0(r11);
                } else {
                    r11 = bVar.m20993k(i);
                    bVar2.f16556b.m26736m0(r11);
                }
                r11.setTag(z0Var);
                bVar2.f16556b.m26710z0(r11);
                i3++;
                i = i2;
            }
        }
        return i;
    }

    public static <T extends View & AbstractC5143t> void m25021n(T t, Canvas canvas, int i, int i2, C6238b bVar, C4850b[] bVarArr, boolean z) {
        int i3;
        if (bVarArr != null) {
            for (C4850b bVar2 : bVarArr) {
                C6240c K = bVar2.f16556b.m26773K();
                AbstractC6264v R = bVar2.f16556b.m26766R();
                if (K != null && R != null) {
                    int f = i + bVar2.m25002f();
                    int g = i2 + bVar2.m25001g();
                    int e = bVar2.m25003e();
                    int d = bVar2.m25004d();
                    float c = bVar2.m25005c();
                    boolean z2 = c != 1.0f;
                    if (z2) {
                        int V = C1399s0.m37202V(canvas);
                        float f2 = (0.4f * c) + 0.6f;
                        canvas.scale(f2, f2, (e / 2) + f, g + (d / 2));
                        K.mo20251U(K.getAlpha() * c);
                        i3 = V;
                    } else {
                        i3 = -1;
                    }
                    bVar2.f16556b.m26741k(e, d);
                    bVar2.f16556b.m26725s(t, canvas, f, g, K, R, 1.0f);
                    if (z) {
                        Paint E0 = C1410y.m37078E0(C5064d.m24132a(c, 436207616));
                        float[] fArr = f16528j0;
                        float f3 = f;
                        fArr[4] = f3;
                        fArr[0] = f3;
                        float f4 = f + e;
                        fArr[6] = f4;
                        fArr[2] = f4;
                        float f5 = g;
                        fArr[3] = f5;
                        fArr[1] = f5;
                        float f6 = g + d;
                        fArr[7] = f6;
                        fArr[5] = f6;
                        canvas.drawLine(fArr[0], fArr[1], fArr[2], fArr[3], E0);
                        float[] fArr2 = f16528j0;
                        canvas.drawLine(fArr2[4], fArr2[5], fArr2[6], fArr2[7], E0);
                    }
                    if (z2) {
                        C1399s0.m37204T(canvas, i3);
                        K.mo20254P();
                    }
                }
            }
        }
    }

    public static int m25017r(float f) {
        return (int) Math.floor(f);
    }

    public static float m25009z(float[] fArr, int i, int i2, int i3, float f) {
        float f2 = 0.0f;
        if (i == 0 && i2 == fArr.length) {
            for (float f3 : fArr) {
                f2 += f3;
            }
            return (i3 - ((fArr.length - 1) * f)) / f2;
        }
        for (int i4 = i; i4 < i2; i4++) {
            f2 += fArr[i4];
        }
        return (i3 - (((i2 - i) - 1) * f)) / f2;
    }

    public void m25047A() {
        C4850b[] bVarArr = this.f16536T;
        if (bVarArr != null) {
            for (C4850b bVar : bVarArr) {
                bVar.f16556b.m26781G().m18655P();
            }
        }
        C4850b[] bVarArr2 = this.f16539W;
        if (bVarArr2 != null) {
            for (C4850b bVar2 : bVarArr2) {
                bVar2.f16556b.m26781G().m18655P();
            }
        }
    }

    public final void m25046B(int i, int i2, boolean z) {
        this.f16549d0 = i;
        this.f16550e0 = i2;
        for (int size = this.f16548c0.size() - 1; size >= 0; size--) {
            AbstractC4849a aVar = this.f16548c0.get(size).get();
            if (aVar != null) {
                aVar.m25008a(z);
            } else {
                this.f16548c0.remove(size);
            }
        }
    }

    public boolean m25045C(View view, MotionEvent motionEvent) {
        C4850b[] bVarArr;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f16551f0 = null;
            if (!m25011x() && (bVarArr = this.f16536T) != null) {
                int length = bVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C4850b bVar = bVarArr[i];
                    if (bVar.f16556b.m26744i0(view, motionEvent)) {
                        this.f16551f0 = bVar.f16556b;
                        break;
                    }
                    i++;
                }
            }
            return this.f16551f0 != null;
        } else if (action == 1 || action == 3) {
            C4630f0 f0Var = this.f16551f0;
            if (f0Var == null) {
                return false;
            }
            boolean i0 = f0Var.m26744i0(view, motionEvent);
            this.f16551f0 = null;
            return i0;
        } else {
            C4630f0 f0Var2 = this.f16551f0;
            return f0Var2 != null && f0Var2.m26744i0(view, motionEvent);
        }
    }

    public boolean m25044D(View view) {
        C4630f0 f0Var = this.f16551f0;
        if (f0Var == null) {
            return false;
        }
        boolean j0 = f0Var.m26742j0(view);
        this.f16551f0 = null;
        return j0;
    }

    public int m25043E() {
        this.f16531O = false;
        return m25028f(this.f16532P, this.f16533Q, this.f16534R, true);
    }

    public int m25042F(long j, int i) {
        C4850b[] bVarArr;
        C4850b[] bVarArr2 = this.f16536T;
        if (bVarArr2 == null) {
            return 0;
        }
        if (i >= 0 && i < bVarArr2.length) {
            C4630f0 f0Var = bVarArr2[i].f16556b;
            if (f0Var.m26781G().m18601u() == j) {
                return m25041G(f0Var, true);
            }
        }
        for (C4850b bVar : this.f16536T) {
            if (bVar.f16556b.m26781G().m18601u() == j) {
                return m25041G(bVar.f16556b, true);
            }
        }
        return 0;
    }

    public int m25041G(C4630f0 f0Var, boolean z) {
        if (this.f16543a.remove(f0Var)) {
            this.f16535S -= f0Var.m26783F() / f0Var.m26785E();
            if (this.f16531O) {
                this.f16531O = false;
                return m25028f(this.f16532P, this.f16533Q, this.f16534R, z);
            }
        }
        return 0;
    }

    public int m25040H(C4630f0 f0Var) {
        Iterator<C4630f0> it = this.f16543a.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4630f0 next = it.next();
            if (f0Var.m26770N() == next.m26770N()) {
                this.f16543a.set(i, f0Var);
                if (next.m26783F() != f0Var.m26783F() || next.m26785E() != f0Var.m26785E()) {
                    return m25043E();
                }
            } else {
                i++;
            }
        }
        return 0;
    }

    public void m25038J(C6238b bVar, boolean z) {
        m25039I(this, bVar, z, this.f16536T, -1);
        m25039I(this, bVar, z, this.f16539W, -1);
        bVar.m20998f(this);
    }

    public final int m25037K(int r17, int r18, gd.C4848z0.C4850b[] r19, int r20, boolean r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4848z0.m25037K(int, int, gd.z0$b[], int, boolean, boolean):int");
    }

    public void m25036L(boolean z, boolean z2) {
        if (!(this.f16529M == z && this.f16530N == z2)) {
            this.f16529M = z;
            this.f16530N = z2;
            C4850b[] bVarArr = this.f16536T;
            if (bVarArr != null) {
                for (C4850b bVar : bVarArr) {
                    bVar.f16556b.m26726r0(bVar.m24998j(), bVar.m24997k(), bVar.m24999i(), bVar.m25000h());
                }
            }
            C4850b[] bVarArr2 = this.f16539W;
            if (bVarArr2 != null) {
                for (C4850b bVar2 : bVarArr2) {
                    bVar2.f16556b.m26726r0(bVar2.m24998j(), bVar2.m24997k(), bVar2.m24999i(), bVar2.m25000h());
                }
            }
        }
    }

    public void m25035M(long j, C3950k kVar) {
        Iterator<C4630f0> it = this.f16543a.iterator();
        while (it.hasNext()) {
            C4630f0 next = it.next();
            if (next.m26770N() == j) {
                next.m26712y0(kVar);
                return;
            }
        }
    }

    public void m25034N(long j, long j2, boolean z) {
        C4850b[] bVarArr = this.f16536T;
        if (bVarArr != null) {
            for (C4850b bVar : bVarArr) {
                bVar.f16556b.m26778H0(j, j2, z);
            }
        }
        C4850b[] bVarArr2 = this.f16539W;
        if (bVarArr2 != null) {
            for (C4850b bVar2 : bVarArr2) {
                bVar2.f16556b.m26778H0(j, j2, z);
            }
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        this.f16546b0 = f;
        int i2 = this.f16537U;
        int i3 = i2 + ((int) ((this.f16541Y - i2) * f));
        int i4 = this.f16538V;
        int i5 = i4 + ((int) ((this.f16542Z - i4) * f));
        m25046B(i3, i5, (i3 == this.f16549d0 && i5 == this.f16550e0) ? false : true);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (f == 1.0f) {
            this.f16540X.m29543l(0.0f);
            m25025j();
            this.f16546b0 = 0.0f;
            this.f16537U = this.f16541Y;
            this.f16538V = this.f16542Z;
            this.f16536T = this.f16544a0;
            this.f16542Z = 0;
            this.f16541Y = 0;
            this.f16544a0 = null;
        }
    }

    public void m25030d(C4630f0 f0Var, boolean z) {
        if (z) {
            this.f16543a.add(f0Var);
        } else {
            this.f16543a.add(0, f0Var);
        }
        this.f16535S += f0Var.m26783F() / f0Var.m26785E();
        this.f16531O = false;
    }

    public void m25029e(TdApi.ChatType chatType) {
        this.f16552g0 = chatType;
        C4850b[] bVarArr = this.f16536T;
        if (bVarArr != null) {
            for (C4850b bVar : bVarArr) {
                bVar.f16556b.m26781G().m18619l(chatType);
            }
        }
        C4850b[] bVarArr2 = this.f16539W;
        if (bVarArr2 != null) {
            for (C4850b bVar2 : bVarArr2) {
                bVar2.f16556b.m26781G().m18619l(chatType);
            }
        }
    }

    public int m25028f(int i, int i2, int i3, boolean z) {
        return m25027g(i, i2, i3, z, false, 1.0f);
    }

    public final int m25027g(int r28, int r29, int r30, boolean r31, boolean r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4848z0.m25027g(int, int, int, boolean, boolean, float):int");
    }

    @Override
    public boolean mo8015h(int i, AbstractC6264v vVar, long j) {
        return vVar.getTag() == this;
    }

    public final void m25026i() {
        this.f16551f0 = null;
    }

    public final void m25025j() {
        C4850b[] bVarArr = this.f16539W;
        if (bVarArr != null) {
            for (C4850b bVar : bVarArr) {
                bVar.f16567m = 0;
            }
            this.f16539W = null;
        }
    }

    public final void m25024k() {
        C3950k kVar = this.f16540X;
        if (kVar == null) {
            return;
        }
        if (kVar.m29533v() || this.f16540X.m29540o() != 0.0f) {
            this.f16540X.m29543l(0.0f);
            for (C4850b bVar : this.f16536T) {
                bVar.m25007a();
            }
            m25025j();
            this.f16546b0 = 0.0f;
        }
    }

    public void m25023l() {
        C4850b[] bVarArr = this.f16536T;
        if (bVarArr != null) {
            for (C4850b bVar : bVarArr) {
                bVar.f16556b.m26727r();
            }
        }
        C4850b[] bVarArr2 = this.f16539W;
        if (bVarArr2 != null) {
            for (C4850b bVar2 : bVarArr2) {
                bVar2.f16556b.m26727r();
            }
        }
    }

    public <T extends View & AbstractC5143t> void m25022m(T t, Canvas canvas, int i, int i2, C6238b bVar, boolean z) {
        this.f16553h0 = i;
        this.f16554i0 = i2;
        m25021n(t, canvas, i, i2, bVar, this.f16536T, z);
        m25021n(t, canvas, i, i2, bVar, this.f16539W, z);
    }

    public C4850b m25020o(long j) {
        C4850b[] bVarArr = this.f16536T;
        if (bVarArr != null) {
            for (C4850b bVar : bVarArr) {
                if (bVar.f16556b.m26770N() == j) {
                    return bVar;
                }
            }
        }
        C4850b[] bVarArr2 = this.f16539W;
        if (bVarArr2 == null) {
            return null;
        }
        for (C4850b bVar2 : bVarArr2) {
            if (bVar2.f16556b.m26770N() == j) {
                return bVar2;
            }
        }
        return null;
    }

    public C4630f0 m25019p(long j) {
        C4850b o = m25020o(j);
        if (o != null) {
            return o.f16556b;
        }
        return null;
    }

    public C4630f0 m25018q(float f, float f2) {
        C4850b[] bVarArr;
        if (this.f16536T == null) {
            return null;
        }
        float f3 = f - this.f16553h0;
        float f4 = f2 - this.f16554i0;
        int i = C1357a0.m37544i(2.0f);
        for (C4850b bVar : this.f16536T) {
            int B = bVar.f16556b.m26791B();
            int x = bVar.f16556b.m26715x();
            int i2 = bVar.f16562h;
            int i3 = B + i2;
            int i4 = bVar.f16561g;
            if ((i4 & 8) == 0) {
                i3 += i;
            }
            int i5 = bVar.f16563i;
            int i6 = x + i5;
            if ((i4 & 2) == 0) {
                i6 += i;
            }
            if (f3 >= i2 && f3 <= i3 && f4 >= i5 && f4 <= i6) {
                return bVar.f16556b;
            }
        }
        return null;
    }

    public float m25016s() {
        if (this.f16543a.isEmpty()) {
            return 1.0f;
        }
        return this.f16535S / this.f16543a.size();
    }

    public int m25015t() {
        C3950k kVar = this.f16540X;
        if (kVar == null || !kVar.m29533v()) {
            return this.f16538V;
        }
        return this.f16542Z;
    }

    public C7462l1 m25014u(long j, View view, int i, int i2, int i3) {
        C4850b o = m25020o(j);
        if (o == null) {
            return null;
        }
        C7462l1 I = o.f16556b.m26777I(view, i, i2, i3);
        if (I != null) {
            int i4 = o.f16561g;
            if ((i4 & 1) == 0 || (i4 & 4) == 0) {
                I.m15982r(0);
            }
            int i5 = o.f16561g;
            if ((i5 & 1) == 0 || (i5 & 8) == 0) {
                I.m15981s(0);
            }
            int i6 = o.f16561g;
            if ((i6 & 2) == 0 || (i6 & 8) == 0) {
                I.m15989k(0);
            }
            int i7 = o.f16561g;
            if ((i7 & 2) == 0 || (i7 & 4) == 0) {
                I.m15990j(0);
            }
        }
        return I;
    }

    public C4630f0 m25013v() {
        return this.f16543a.get(0);
    }

    public int m25012w() {
        C3950k kVar = this.f16540X;
        if (kVar == null || !kVar.m29533v()) {
            return this.f16537U;
        }
        return this.f16541Y;
    }

    public final boolean m25011x() {
        C3950k kVar;
        return this.f16546b0 != 0.0f || ((kVar = this.f16540X) != null && kVar.m29533v());
    }

    public boolean m25010y() {
        return this.f16543a.size() == 1;
    }
}
