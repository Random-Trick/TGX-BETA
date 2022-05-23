package org.thunderdog.challegram;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.p0;
import de.a7;
import de.ax;
import de.b;
import de.bl;
import de.cu;
import de.fk;
import de.fw;
import de.fz;
import de.ga;
import de.i5;
import de.ii;
import de.iq;
import de.lj;
import de.lk;
import de.nb;
import de.ov;
import de.qs;
import de.ra;
import de.rh;
import de.s5;
import de.so;
import de.vr;
import de.wt;
import de.ww;
import eb.k;
import gd.l;
import gd.w;
import he.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k0.h;
import kb.j;
import kd.t0;
import md.y;
import ne.b2;
import ne.j2;
import ne.k2;
import ne.o1;
import ne.z1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.b;
import ud.e2;
import ud.f2;
import ud.q1;
import ud.u1;
import ud.v4;
import yd.g;
import zd.d1;
import zd.hj;
import zd.o6;
import zd.r0;
import zd.s0;
import zd.w6;
import zd.y8;
import zd.ya;

public class MainActivity extends org.thunderdog.challegram.a implements s0 {
    public Bundle Q1;
    public w6 R1;
    public Handler S1;
    public eb.f T1;
    public ViewGroup U1;
    public final h<rh> V1 = new h<>();
    public boolean W1;

    public class a implements k.b {
        public a() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (MainActivity.this.U1 != null) {
                boolean z10 = false;
                o1 o1Var = (o1) MainActivity.this.U1.getChildAt(0);
                if (f10 > 0.0f) {
                    z10 = true;
                }
                o1Var.setLooping(z10);
                MainActivity.this.U1.setAlpha(f10);
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (f10 == 0.0f && MainActivity.this.U1 != null) {
                ((o1) MainActivity.this.U1.getChildAt(0)).setLooping(false);
                MainActivity mainActivity = MainActivity.this;
                mainActivity.V.removeView(mainActivity.U1);
                MainActivity.this.U1 = null;
            }
        }
    }

    public class b implements a.k {
        public final String f20000a;
        public final Intent f20001b;

        public b(String str, Intent intent) {
            this.f20000a = str;
            this.f20001b = intent;
        }

        @Override
        public void e(org.thunderdog.challegram.a aVar, boolean z10) {
            if (!z10) {
                MainActivity.this.x4(this.f20000a, this.f20001b, false);
                MainActivity.this.z2(this);
            }
        }
    }

    public class c implements a.k {
        public final String f20003a;
        public final Intent f20004b;

        public c(String str, Intent intent) {
            this.f20003a = str;
            this.f20004b = intent;
        }

        @Override
        public void e(org.thunderdog.challegram.a aVar, boolean z10) {
            if (!z10) {
                MainActivity.this.x4(this.f20003a, this.f20004b, false);
                MainActivity.this.z2(this);
            }
        }
    }

    public class d implements v4.n {
        public d() {
        }

        @Override
        public void a(View view, int i10, ra raVar, TextView textView, iq iqVar) {
            int A = raVar.A();
            if (A == 12 || A == 69) {
                boolean D = raVar.D();
                List<ra> D0 = iqVar.D0();
                int i11 = 0;
                if (raVar.j() == R.id.btn_selectAll) {
                    for (ra raVar2 : D0) {
                        if (raVar2.A() == 69 && raVar2.D() != D) {
                            raVar2.S(D);
                            iqVar.r3(i11);
                        }
                        i11++;
                    }
                } else if (D) {
                    Iterator<ra> it = D0.iterator();
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        if (!it.hasNext()) {
                            i11 = 1;
                            break;
                        }
                        ra next = it.next();
                        if (next.j() == R.id.btn_selectAll) {
                            i13 = i12;
                        }
                        if (next.A() == 69 && !next.D()) {
                            break;
                        }
                        i12++;
                    }
                    if (!(i11 == 0 || i13 == -1 || D0.get(i13).D())) {
                        D0.get(i13).S(true);
                        iqVar.r3(i13);
                    }
                } else {
                    int i14 = 0;
                    for (ra raVar3 : D0) {
                        if (raVar3.j() != R.id.btn_selectAll) {
                            i14++;
                        } else if (raVar3.D()) {
                            raVar3.S(false);
                            iqVar.r3(i14);
                            return;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public class e implements s0 {
        public final e2 f20007a;

        public e(e2 e2Var) {
            this.f20007a = e2Var;
        }

        @Override
        public void D4(w6 w6Var, boolean z10, boolean z11) {
            r0.b(this, w6Var, z10, z11);
        }

        @Override
        public void N6(w6 w6Var, int i10) {
            r0.f(this, w6Var, i10);
        }

        @Override
        public void S(w6 w6Var, int i10) {
            r0.d(this, w6Var, i10);
        }

        @Override
        public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
            r0.c(this, w6Var, user, i10, w6Var2);
        }

        @Override
        public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
            r0.g(this, w6Var, authorizationState, i10);
        }

        @Override
        public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
            int J0;
            iq iqVar = this.f20007a.f24134a;
            if (iqVar != null && (J0 = iqVar.J0(w6Var)) != -1) {
                this.f20007a.f24134a.I(J0);
            }
        }

        @Override
        public void z(o6 o6Var, boolean z10) {
            r0.h(this, o6Var, z10);
        }

        @Override
        public void z5(w6 w6Var, int i10, int i11) {
            r0.e(this, w6Var, i10, i11);
        }
    }

    public class f implements u1.a {
        public final int f20009a;
        public final int f20010b;
        public final Intent f20011c;

        public f(int i10, int i11, Intent intent) {
            this.f20009a = i10;
            this.f20010b = i11;
            this.f20011c = intent;
        }

        @Override
        public void a(u1 u1Var) {
            if (!u1Var.q()) {
                u1Var.w(this);
                MainActivity.super.onActivityResult(this.f20009a, this.f20010b, this.f20011c);
            }
        }
    }

    public static <T extends v4<?>> boolean H4(T t10) {
        return t10.db();
    }

    public void I4(final String str, final w6 w6Var) {
        if (this.X.F() != null) {
            w6Var.c().Y1(new Runnable() {
                @Override
                public final void run() {
                    MainActivity.this.M4(w6Var, str);
                }
            });
        }
    }

    public void J4(o6 o6Var) {
        i5(o6Var.A6());
        o6Var.M4();
    }

    public void K4(final o6 o6Var) {
        o6Var.I6();
        this.S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.J4(o6Var);
            }
        });
    }

    public void M4(w6 w6Var, String str) {
        w6Var.c().hd().D7(new y8(this, this.f20033k0), str, null, null);
    }

    public static void N4(AtomicBoolean atomicBoolean, o6 o6Var) {
        if (o6Var.n4(atomicBoolean.get(), false)) {
            atomicBoolean.set(true);
        }
        y.n().i();
    }

    public static void O4(o6 o6Var) {
        long b32 = i.c2().b3();
        b.a.a(b32, o6Var.A6(), "Syncing other accounts, since user launched the app.", new Object[0]);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(o6Var.n4(false, false));
        ya.o1().c3(b32, -1, null, false, false, 3, new j() {
            @Override
            public final void a(Object obj) {
                MainActivity.N4(atomicBoolean, (o6) obj);
            }
        });
    }

    public void P4() {
        if (db.c.a(this)) {
            i.c2().r2();
        }
    }

    public void Q4(o6 o6Var) {
        if (C0() == o6Var && !o6Var.e7()) {
            u5(false);
        }
    }

    public void R4(final o6 o6Var) {
        this.S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.Q4(o6Var);
            }
        });
    }

    public void S4(final o6 o6Var, boolean z10) {
        if (C0() != o6Var) {
            return;
        }
        if (z10) {
            u5(true);
        } else {
            o6Var.Y1(new Runnable() {
                @Override
                public final void run() {
                    MainActivity.this.R4(o6Var);
                }
            });
        }
    }

    public void T4(w6 w6Var) {
        new t0(this, w6Var.c(), 0L, 0L, null, false, null).v().Q(true).p();
    }

    public void U4(final w6 w6Var) {
        this.S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.T4(w6Var);
            }
        });
    }

    public void V4(final w6 w6Var) {
        w6Var.c().Y1(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.U4(w6Var);
            }
        });
    }

    public void W4(final o6 o6Var, long j10, long j11) {
        y8 y8Var = new y8(this, o6Var);
        hj.j jVar = new hj.j();
        Objects.requireNonNull(o6Var);
        hj.j j12 = jVar.j(new Runnable() {
            @Override
            public final void run() {
                o6.this.M4();
            }
        });
        if (j10 != 0) {
            j12.e(new ob.d(j11, j10));
        }
        o6Var.hd().h7(y8Var, j11, j12);
    }

    public void X4(final o6 o6Var, final long j10, final long j11) {
        o6Var.I6();
        this.S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.W4(o6Var, j10, j11);
            }
        });
    }

    public static void Y4(j jVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jVar.a((w6) it.next());
        }
    }

    public static boolean Z4(SparseIntArray sparseIntArray, w6 w6Var) {
        return sparseIntArray.get(w6Var.f28608b + 1) == w6Var.f28608b + 1;
    }

    public static boolean a5(int i10, w6 w6Var) {
        return w6Var.f28608b == i10;
    }

    public static void b5(boolean z10, List list, j jVar, int i10, final SparseIntArray sparseIntArray) {
        List list2;
        if (z10) {
            list2 = ib.b.o(list, new kb.d() {
                @Override
                public final boolean a(Object obj) {
                    boolean Z4;
                    Z4 = MainActivity.Z4(sparseIntArray, (w6) obj);
                    return Z4;
                }
            });
        } else {
            final int i11 = sparseIntArray.get(R.id.account) - 1;
            list2 = ib.b.o(list, new kb.d() {
                @Override
                public final boolean a(Object obj) {
                    boolean a52;
                    a52 = MainActivity.a5(i11, (w6) obj);
                    return a52;
                }
            });
        }
        if (!list2.isEmpty()) {
            jVar.a(list2);
        }
    }

    public static void c5(AtomicReference atomicReference, AtomicBoolean atomicBoolean, j2 j2Var) {
        if (atomicReference.get() != null) {
            ya.o1().b1().x((s0) atomicReference.get());
            atomicBoolean.set(false);
        }
    }

    public static String d5(int i10) {
        return "nav_item_" + i10;
    }

    public static boolean q4(int i10, v4<?> v4Var) {
        switch (i10) {
            case R.id.controller_fontSize:
            case R.id.controller_settings:
            case R.id.controller_storageSettings:
            case R.id.controller_wallpaper:
                return true;
            default:
                return false;
        }
    }

    public static v4<?> s5(org.thunderdog.challegram.a aVar, o6 o6Var, int i10, Bundle bundle, String str) {
        v4<?> v4Var;
        switch (i10) {
            case R.id.controller_chatSettings:
                v4Var = new cu(aVar, o6Var);
                break;
            case R.id.controller_fontSize:
            case R.id.controller_wallpaper:
                rh rhVar = new rh(aVar, o6Var);
                rhVar.Lp(new rh.c0(i10 == R.id.controller_fontSize ? 2 : 1, null, null));
                return rhVar;
            case R.id.controller_messages:
                v4Var = new rh(aVar, o6Var);
                break;
            case R.id.controller_networkStats:
                v4Var = new ov(aVar, o6Var);
                break;
            case R.id.controller_newChannel:
                v4Var = new i5(aVar, o6Var);
                break;
            case R.id.controller_newGroup:
                v4Var = new s5(aVar, o6Var);
                break;
            case R.id.controller_notificationSettings:
                v4Var = new fw(aVar, o6Var);
                break;
            case R.id.controller_passcode:
                v4Var = new ii(aVar, o6Var);
                break;
            case R.id.controller_privacyException:
                v4Var = new bl(aVar, o6Var);
                break;
            case R.id.controller_privacyKey:
                v4Var = new ax(aVar, o6Var);
                break;
            case R.id.controller_privacySettings:
                v4Var = new ww(aVar, o6Var);
                break;
            case R.id.controller_profile:
                v4Var = new so(aVar, o6Var);
                break;
            case R.id.controller_settings:
                return new wt(aVar, o6Var);
            case R.id.controller_storageSettings:
                return new qs(aVar, o6Var);
            case R.id.controller_themeSettings:
                v4Var = new fz(aVar, o6Var);
                break;
            default:
                return null;
        }
        if (!v4Var.sd(bundle, str)) {
            return null;
        }
        if ((v4Var instanceof ii) || v4Var.C9() == 0 || !o6Var.t6(v4Var.C9())) {
            return v4Var;
        }
        if (!(v4Var instanceof rh)) {
            return null;
        }
        ii iiVar = new ii(aVar, o6Var);
        TdApi.Chat P3 = o6Var.P3(v4Var.C9());
        iiVar.Ef(new ii.b(P3, o6Var.A3(P3), null));
        return iiVar;
    }

    public void A4(int i10, boolean z10) {
        if (this.X.X()) {
            nb nbVar = new nb(this, ya.o1().U(i10).c());
            if (z10) {
                F4(nbVar);
            } else {
                this.X.Q(nbVar);
            }
        }
    }

    public final void B4(o6 o6Var, String str, Intent intent) {
        nb nbVar = new nb(this, this.R1.c());
        if (intent != null) {
            nbVar.Rh(o6Var, str, intent);
        }
        F4(nbVar);
    }

    @Override
    public void D4(w6 w6Var, boolean z10, boolean z11) {
        r0.b(this, w6Var, z10, z11);
    }

    public final void E4() {
        v4<?> v42 = v4(this.R1.c());
        if (v42 != null) {
            this.X.Q(v42);
            this.X.R(new fk(this, this.R1.c()), 0);
        } else if (ga.Df()) {
            this.X.Q(new fk(this, this.R1.c()));
        } else {
            this.X.Q(new ga(this));
        }
    }

    public final void F4(nb nbVar) {
        this.X.Q(nbVar);
    }

    public final void G4() {
        nb nbVar = new nb(this, this.R1.c());
        nbVar.get();
        this.X.R(nbVar, 0);
    }

    @Override
    public void N6(w6 w6Var, int i10) {
        r0.f(this, w6Var, i10);
    }

    @Override
    public boolean R1() {
        return true;
    }

    @Override
    public void S(w6 w6Var, int i10) {
        r0.d(this, w6Var, i10);
    }

    @Override
    public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        if (this.R1.f28608b != w6Var.f28608b) {
            this.R1 = w6Var;
            u3(w6Var.c());
            if (i10 != 3 && i10 != 4) {
                t4(w6Var.f28608b);
                v4<?> F = this.X.F();
                if (F == null || F.c() == null || F.c().A6() != w6Var.f28608b) {
                    nb nbVar = new nb(this, w6Var.c());
                    if (this.X.X()) {
                        this.X.D0(nbVar);
                    } else {
                        this.X.E0(nbVar, false, false);
                    }
                }
            }
        }
    }

    @Override
    public void b2() {
        u5(C0().e7());
    }

    public void f5(v4<?> v4Var) {
        if (r1()) {
            v4Var.get();
            v4Var.Z8();
        } else if (this.X.X()) {
            this.X.Q(v4Var);
            G4();
        } else {
            n1();
            this.X.h0(v4Var);
        }
    }

    public final void g5() {
        TdApi.Call J = ya.o1().c0().J();
        o6 L = ya.o1().c0().L();
        if (J == null) {
            if (this.X.X()) {
                A4(C0().A6(), false);
            }
            j0.y0(R.string.CallNoLongerActive, 0);
            return;
        }
        v4<?> F = this.X.F();
        if (F != null && F.xe() == L.A6() && (F instanceof de.b)) {
            de.b bVar = (de.b) F;
            if (bVar.Ye(J.userId)) {
                bVar.af(J);
                return;
            }
        }
        de.b bVar2 = new de.b(this, L);
        bVar2.bf(new b.e(J));
        f5(bVar2);
    }

    public void h5() {
        if (this.X.X()) {
            A4(C0().A6(), false);
        }
        LinkedList linkedList = new LinkedList();
        Iterator<w6> it = ya.o1().iterator();
        while (it.hasNext()) {
            w6 next = it.next();
            if (next.B(true) && next.c().e2().k0()) {
                linkedList.add(next);
            }
        }
        if (!linkedList.isEmpty()) {
            if (linkedList.size() == 1) {
                new t0(this, ((w6) linkedList.get(0)).c(), 0L, 0L, null, false, null).v().Q(false).p();
            } else {
                m5(linkedList, null, null, new j() {
                    @Override
                    public final void a(Object obj) {
                        MainActivity.this.V4((w6) obj);
                    }
                });
            }
        }
    }

    public final void i5(int i10) {
        if (this.X.X()) {
            A4(i10, true);
            return;
        }
        n1();
        int N = this.X.N();
        if (!this.X.M().r()) {
            for (int i11 = N - 2; i11 >= 1; i11--) {
                this.X.M().c(i11);
            }
            v4<?> j10 = this.X.M().j(0);
            nb nbVar = null;
            if (!(j10.R9() == R.id.controller_main && j10.xe() == i10)) {
                nbVar = new nb(this, ya.R0(i10));
            }
            if (N > 1) {
                if (nbVar != null) {
                    this.X.M().y(0, nbVar);
                }
                this.X.g0();
            } else if (nbVar != null) {
                this.X.E0(nbVar, false, false);
            }
        }
    }

    public final void j5(int i10, final long j10, final long j11) {
        final o6 c10 = ya.p1(i10).U(i10).c();
        c10.Y1(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.X4(c10, j11, j10);
            }
        });
    }

    public final void k5(int i10) {
        if (i10 != -1) {
            lk lkVar = new lk(this, ya.p1(i10).U(i10).c());
            if (lkVar.Vf() == -1) {
                if (this.X.X()) {
                    A4(this.f20033k0.A6(), false);
                }
            } else if (!(this.X.F() instanceof lk)) {
                f5(lkVar);
            }
        }
    }

    @Override
    public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        p5(w6Var, authorizationState, i10);
    }

    public void l5(CharSequence charSequence, String str, j<w6> jVar) {
        m5(ya.o1().V(), charSequence, str, jVar);
    }

    public final void m5(List<w6> list, CharSequence charSequence, String str, final j<w6> jVar) {
        n5(list, charSequence, str, false, new j() {
            @Override
            public final void a(Object obj) {
                MainActivity.Y4(j.this, (List) obj);
            }
        });
    }

    public final void n5(final List<w6> list, CharSequence charSequence, String str, final boolean z10, final j<List<w6>> jVar) {
        e2 me2;
        if (list.size() <= 1) {
            jVar.a(ib.b.g(C0().A1()));
            return;
        }
        boolean k12 = C0().F4().k1();
        int A6 = C0().A6();
        ArrayList arrayList = new ArrayList(list.size() + 2 + (z10 ? 1 : 0));
        arrayList.add(new ra(35).J(a0.i(12.0f)).E(true));
        if (z10) {
            arrayList.add(new ra(12, (int) R.id.btn_selectAll, 0, (int) R.string.SelectAll, (int) R.id.btn_selectAll, k12));
        }
        boolean z11 = false;
        for (w6 w6Var : list) {
            String t10 = w6Var.t();
            int i10 = w6Var.f28608b;
            boolean z12 = A6 == i10;
            if (z12) {
                z11 = true;
            }
            int i11 = z10 ? 69 : 85;
            int i12 = i10 + 1;
            if (z12) {
                t10 = w.j1(k12 ? R.string.LastUsedAccount : R.string.CurrentAccount, t10);
            }
            arrayList.add(new ra(i11, i12, 0, t10, z10 ? w6Var.f28608b + 1 : R.id.account, z12 || (k12 && z10)).G(w6Var).O(w6Var.r()));
        }
        arrayList.add(new ra(35).J(a0.i(12.0f)).E(true));
        if (!z11 && !z10) {
            ((ra) arrayList.get(1)).S(true);
        }
        CharSequence i13 = ib.i.i(charSequence) ? w.i1(R.string.PerformAs) : charSequence;
        String i14 = ib.i.i(str) ? w.i1(R.string.Proceed) : str;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicReference atomicReference = new AtomicReference();
        f2 g10 = new f2(R.id.account).b(i13).o(arrayList).s(i14).l(false).n(z10 ? new d() : null).j(new v4.r() {
            @Override
            public final void l6(int i15, SparseIntArray sparseIntArray) {
                MainActivity.b5(z10, list, jVar, i15, sparseIntArray);
            }
        }).g(new j2.f() {
            @Override
            public final void h3(j2 j2Var) {
                MainActivity.c5(atomicReference, atomicBoolean, j2Var);
            }

            @Override
            public void w(j2 j2Var) {
                k2.a(this, j2Var);
            }
        });
        v4<?> F = this.X.F();
        if (!(F == null || (me2 = F.me(g10)) == null || me2.f24134a == null)) {
            e eVar = new e(me2);
            if (atomicBoolean.get()) {
                atomicReference.set(eVar);
                ya.o1().b1().a(eVar);
            }
        }
    }

    public void o5() {
        if (ya.o1().t0()) {
            this.X.C0();
            z4(this.R1.c(), this.R1.c().T1());
        }
    }

    @Override
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.X.X()) {
            this.X.M().a(new f(i10, i11, intent));
        } else {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i("MainActivity.onCreate", new Object[0]);
        this.S1 = new Handler();
        ya.o1().b1().a(this);
        q5();
        r4(this.f20033k0).get();
        this.Q1 = bundle;
        i.e K0 = ya.o1().K0();
        if (K0 != null) {
            vr vrVar = new vr(this, this.f20033k0);
            vrVar.ji(new vr.f(K0));
            this.X.Q(vrVar);
        } else {
            z4(this.R1.c(), this.R1.c().T1());
        }
        final o6 j02 = ya.o1().j0();
        j02.X1(new Runnable() {
            @Override
            public final void run() {
                MainActivity.O4(o6.this);
            }
        });
    }

    @Override
    public void onDestroy() {
        ya.o1().b1().x(this);
        s4();
        Log.i("MainActivity.onDestroy", new Object[0]);
        Log.close();
        super.onDestroy();
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent != null ? intent.getAction() : null;
        if (!ib.i.i(action)) {
            x4(action, intent, false);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("MainActivity.onPause", new Object[0]);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("MainActivity.onResume", new Object[0]);
        this.f20033k0.E4().f0(this);
        j0.C0();
        if (!this.W1 && !i.c2().e2()) {
            this.W1 = true;
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    MainActivity.this.P4();
                }
            });
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        v4<?> v4Var = null;
        if (bundle == null) {
            super.onSaveInstanceState(null);
            return;
        }
        q1 q1Var = this.X;
        int N = q1Var != null ? q1Var.N() : 0;
        if (N > 1) {
            while (true) {
                v4<?> j10 = this.X.M().j(N - 1);
                if (j10 == null || j10.c() == this.R1.c()) {
                    break;
                }
                N--;
            }
        }
        if (N > 1) {
            v4Var = this.X.M().j(N - 1);
        }
        if (N <= 1 || v4Var == null) {
            bundle.putInt("nav_stack_type", 0);
            super.onSaveInstanceState(bundle);
            return;
        }
        bundle.putInt("nav_account_id", this.R1.f28608b);
        int i10 = 0;
        for (int i11 = N - 1; i11 >= 0; i11--) {
            v4<?> j11 = this.X.M().j(i11);
            if (j11 != null) {
                String d52 = d5(i10);
                int R9 = j11.R9();
                if (!q4(R9, j11)) {
                    if (!j11.yd(bundle, d52 + "_")) {
                    }
                }
                bundle.putInt(d52, R9);
                i10++;
            }
        }
        if (i10 > 0) {
            bundle.putInt("nav_stack_type", 2);
            bundle.putInt("nav_item_count", i10);
        } else {
            bundle.putInt("nav_stack_type", 0);
        }
        super.onSaveInstanceState(bundle);
    }

    public void p4(CharSequence charSequence, String str, j<List<w6>> jVar) {
        n5(ya.o1().V(), charSequence, str, true, jVar);
    }

    public final void p5(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        int v02;
        if (this.R1.f28608b != w6Var.f28608b && (this.X.X() || !this.X.F().Ya(w6Var))) {
            return;
        }
        if (this.X.X()) {
            z4(this.R1.c(), this.R1.c().T1());
            return;
        }
        v4<?> l10 = this.X.M().l();
        boolean z10 = true;
        if (i10 == 2) {
            v4<?> j10 = this.X.M().j(0);
            if (this.R1.f28608b == w6Var.f28608b || !H4(l10) || H4(j10) || j10.xe() == w6Var.f28608b || l10.xe() != w6Var.f28608b) {
                z10 = false;
            }
            if (H4(j10) || !j10.Ya(w6Var)) {
                nb nbVar = new nb(this, w6Var.c());
                if (z10) {
                    w6Var.c().tc().f0(this.R1.c().tc());
                }
                this.X.E0(nbVar, false, false);
            }
        } else if (i10 == 1 && this.R1.f28608b == w6Var.f28608b && (v02 = this.f20033k0.F4().v0(this.R1.f28608b)) != -1) {
            this.f20033k0.F4().d0(v02, 0);
        } else {
            v4<?> v42 = v4(w6Var.c());
            if (v42 == null) {
                if (j0.J() && authorizationState.getConstructor() == 306402531 && (l10 instanceof fk)) {
                    ((fk) l10).ng();
                }
                v4<?> j11 = this.X.M().j(0);
                if (!H4(j11) && j11.Ya(w6Var)) {
                    if (this.X.S()) {
                        v4<?> K = this.X.K();
                        if (K == null || !K.Ya(w6Var) || !K.db()) {
                            v4<?> l11 = this.X.M().l();
                            if (l11 != null && l11.Ya(w6Var) && l11.db() && (l11 instanceof fk) && !((fk) l11).Wf()) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    this.X.E0(new fk(this, w6Var.c()), true, false);
                }
            } else if (l10 == null || l10.R9() != v42.R9()) {
                this.X.h0(v42);
            }
        }
    }

    public final void q5() {
        w6 k02 = ya.o1().k0();
        this.R1 = k02;
        k02.c().Te();
        u3(this.R1.c());
    }

    public final rh r4(o6 o6Var) {
        rh rhVar = new rh(this, o6Var);
        rhVar.fq(true);
        rhVar.get();
        this.V1.j(o6Var.A6(), rhVar);
        return rhVar;
    }

    public final void r5(boolean z10) {
        d1 W1 = this.f20033k0.F4().W1();
        if (W1.m()) {
            W1.v(this);
        }
    }

    public void s4() {
        for (int n10 = this.V1.n() - 1; n10 >= 0; n10--) {
            rh o10 = this.V1.o(n10);
            o10.Pp();
            o10.Z8();
            this.V1.l(n10);
        }
    }

    public void t4(int i10) {
        for (int n10 = this.V1.n() - 1; n10 >= 0; n10--) {
            if (this.V1.i(n10) != i10) {
                rh o10 = this.V1.o(n10);
                o10.Pp();
                o10.Z8();
                this.V1.l(n10);
            }
        }
    }

    public final int t5(Bundle bundle) {
        int i10;
        int i11;
        if (bundle == null || (i10 = bundle.getInt("nav_stack_type", 0)) == 0) {
            return 0;
        }
        if (!(this.R1.f28608b == bundle.getInt("nav_account_id", 0) && i10 == 2 && (i11 = bundle.getInt("nav_item_count")) > 0)) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            String d52 = d5(i13);
            int i14 = bundle.getInt(d52);
            o6 c10 = this.R1.c();
            v4<?> s52 = s5(this, c10, i14, bundle, d52 + "_");
            if (s52 != null) {
                s52.get();
                if (i12 == 0) {
                    this.X.Q(s52);
                } else {
                    this.X.R(s52, 0);
                }
                i12++;
            }
        }
        return i12 > 0 ? 2 : 0;
    }

    public void u4(boolean z10) {
        w6 U = ya.o1().U(this.f20033k0.F4().c2(z10));
        this.R1 = U;
        U.c().Te();
        u3(this.R1.c());
    }

    public final void u5(boolean z10) {
        if (z10 || this.T1 != null) {
            if (this.U1 == null) {
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setOrientation(1);
                linearLayout.setGravity(17);
                int i10 = -1;
                linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                g.j(linearLayout, R.id.theme_color_filling);
                linearLayout.addView(new o1(this));
                b2 b2Var = new b2(this);
                b2Var.setTextSize(2, 22.0f);
                b2Var.setPadding(a0.i(12.0f), a0.i(14.0f), a0.i(12.0f), a0.i(14.0f));
                b2Var.setTextColor(ae.j.P0());
                b2Var.setGravity(17);
                p0.c0(b2Var, w.i1(R.string.Optimizing));
                linearLayout.addView(b2Var);
                b2 b2Var2 = new b2(this);
                b2Var2.setTextSize(2, 15.0f);
                b2Var2.setGravity(17);
                b2Var2.setPadding(a0.i(24.0f), 0, a0.i(24.0f), 0);
                b2Var2.setTextColor(ae.j.P0());
                b2Var2.setText(w.i1(R.string.OptimizingInfo));
                linearLayout.addView(b2Var2);
                z1 z1Var = this.f20043p0;
                if (z1Var != null) {
                    i10 = this.V.indexOfChild(z1Var);
                }
                this.V.addView(linearLayout, i10);
                this.U1 = linearLayout;
                linearLayout.setAlpha(0.0f);
            }
            if (this.T1 == null) {
                this.T1 = new eb.f(0, new a(), db.b.f7287b, 220L);
            }
            this.T1.o(z10 ? 0L : 180L);
            this.T1.p(z10, true);
        }
    }

    @Override
    public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
    }

    public final v4<?> v4(o6 o6Var) {
        TdApi.AuthorizationState S1 = o6Var.S1();
        int constructor = S1.getConstructor();
        if (constructor == 52643073) {
            lj ljVar = new lj(this, o6Var);
            ljVar.bg(new lj.a(7, (TdApi.AuthorizationStateWaitCode) S1, o6Var.R1()));
            return ljVar;
        } else if (constructor == 187548796) {
            lj ljVar2 = new lj(this, o6Var);
            ljVar2.bg(new lj.a(5, (TdApi.AuthorizationStateWaitPassword) S1));
            return ljVar2;
        } else if (constructor != 550350511) {
            return null;
        } else {
            a7 a7Var = new a7(this, o6Var);
            a7Var.sf(new a7.b(0, (TdApi.AuthorizationStateWaitRegistration) S1, o6Var.R1()));
            return a7Var;
        }
    }

    public final void L4(w6 w6Var, String str, Intent intent) {
        if (this.X.X()) {
            B4(w6Var.c(), str, intent);
            return;
        }
        v4<?> j10 = this.X.M().j(0);
        if (j10 instanceof nb) {
            ((nb) j10).Rh(w6Var.c(), str, intent);
        }
    }

    public rh w4(o6 o6Var, boolean z10) {
        rh e10 = this.V1.e(o6Var.A6());
        if (e10 != null) {
            return e10;
        }
        if (z10) {
            return r4(o6Var);
        }
        return null;
    }

    public final boolean x4(java.lang.String r17, final android.content.Intent r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.thunderdog.challegram.MainActivity.x4(java.lang.String, android.content.Intent, boolean):boolean");
    }

    public final void y4() {
        Intent intent = getIntent();
        String action = intent != null ? intent.getAction() : null;
        if (ib.i.i(action) || !x4(action, intent, true)) {
            Bundle bundle = this.Q1;
            if (bundle != null) {
                int t52 = t5(bundle);
                this.Q1 = null;
                if (t52 == 2) {
                    G4();
                }
                if (t52 != 0) {
                    return;
                }
            }
            B4(null, null, null);
        }
    }

    @Override
    public void z(final o6 o6Var, final boolean z10) {
        this.S1.post(new Runnable() {
            @Override
            public final void run() {
                MainActivity.this.S4(o6Var, z10);
            }
        });
    }

    public final void z4(o6 o6Var, int i10) {
        if (i10 == 1) {
            int v02 = o6Var.F4().v0(o6Var.A6());
            if (v02 == -1) {
                E4();
            } else {
                o6Var.F4().d0(v02, 1);
            }
        } else if (i10 == 2) {
            y4();
        }
    }

    @Override
    public void z5(w6 w6Var, int i10, int i11) {
        r0.e(this, w6Var, i10, i11);
    }
}
