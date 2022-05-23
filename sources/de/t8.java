package de;

import ae.j;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.h;
import ce.o;
import ce.p0;
import de.t8;
import eb.k;
import gd.w;
import ib.i;
import id.d;
import id.n;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.z0;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.v.RtlGridLayoutManager;
import ud.v4;
import vc.q;
import vc.r;
import zd.o6;
import zd.s1;
import zd.t1;

public class t8 extends v4<z0> implements View.OnClickListener, t1.a {
    public CustomRecyclerView f9621n0;
    public GridLayoutManager f9622o0;
    public d f9623p0;
    public int f9624q0;
    public q f9625r0;
    public boolean f9626s0;
    public k f9627t0;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            boolean z10 = true;
            if (!(i10 == 1 || i10 == 2)) {
                z10 = false;
            }
            if (t8.this.w9() != null && t8.this.w9().getCurrentItem() == 0) {
                t8.this.w9().setIsScrolling(z10);
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (t8.this.w9() != null && t8.this.w9().c2() && t8.this.w9().getCurrentItem() == 0) {
                t8.this.w9().p2(t8.this.Ye());
                if (t8.this.f9627t0 == null || !t8.this.f9627t0.v()) {
                    t8.this.w9().setCurrentEmojiSection(t8.this.Ze());
                }
            }
        }
    }

    public class b extends GridLayoutManager.b {
        public b() {
        }

        @Override
        public int f(int i10) {
            if (((e) t8.this.f9623p0.O.get(i10)).f9633a == 1) {
                return 1;
            }
            return t8.this.f9624q0;
        }
    }

    public class c implements k.b {
        public final int f9630a;
        public final int[] f9631b;

        public c(int i10, int[] iArr) {
            this.f9630a = i10;
            this.f9631b = iArr;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            int i11 = (int) (this.f9630a * f10);
            t8.this.f9621n0.scrollBy(0, i11 - this.f9631b[0]);
            this.f9631b[0] = i11;
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            t8.this.f9621n0.setScrollDisabled(false);
            if (t8.this.w9() != null) {
                t8.this.w9().setIgnoreMovement(false);
            }
        }
    }

    public static class d extends RecyclerView.h<f> implements d.AbstractC0123d {
        public final Context M;
        public final View.OnClickListener N;
        public final ArrayList<e> O;
        public int P;
        public final t8 Q;

        public d(Context context, View.OnClickListener onClickListener, t8 t8Var) {
            String[][] strArr;
            this.M = context;
            this.N = onClickListener;
            this.Q = t8Var;
            ArrayList<e> arrayList = new ArrayList<>();
            this.O = arrayList;
            arrayList.add(new e(2, 0));
            m0();
            int i10 = 0;
            for (String[] strArr2 : h.f5263i) {
                i10++;
                if (i10 == 0) {
                    this.O.add(new e(0, (int) R.string.SmileysAndPeople));
                } else if (i10 == 1) {
                    this.O.add(new e(0, (int) R.string.AnimalsAndNature));
                } else if (i10 == 2) {
                    this.O.add(new e(0, (int) R.string.FoodDrink));
                } else if (i10 == 3) {
                    this.O.add(new e(0, (int) R.string.TravelAndPlaces));
                } else if (i10 == 4) {
                    this.O.add(new e(0, (int) R.string.SymbolsAndObjects));
                } else if (i10 == 5) {
                    this.O.add(new e(0, (int) R.string.Flags));
                }
                ArrayList<e> arrayList2 = this.O;
                arrayList2.ensureCapacity(arrayList2.size() + strArr2.length + 1);
                for (String str : strArr2) {
                    this.O.add(new e(1, str));
                }
            }
        }

        public void g0() {
            this.Q.w9().setIgnoreMovement(false);
        }

        public void h0() {
            this.Q.w9().setIgnoreMovement(false);
        }

        @Override
        public int D() {
            return this.O.size();
        }

        @Override
        public int F(int i10) {
            return this.O.get(i10).f9633a;
        }

        @Override
        public void e(int i10, int i11) {
            if (this.Q.w9() != null) {
                this.Q.w9().setIgnoreMovement(true);
            }
            int e02 = i10 + e0();
            int e03 = i11 + e0();
            this.O.add(e03, this.O.remove(e02));
            K(e02, e03);
            if (this.Q.w9() != null) {
                this.Q.f9621n0.post(new Runnable() {
                    @Override
                    public final void run() {
                        t8.d.this.h0();
                    }
                });
            }
        }

        public int e0() {
            return 1;
        }

        public int f0(int r5) {
            throw new UnsupportedOperationException("Method not decompiled: de.t8.d.f0(int):int");
        }

        public int i0(int i10, int i11) {
            int i12 = 0;
            if (i10 == 0) {
                return 0;
            }
            int i13 = i10 - 1;
            int headerSize = z0.getHeaderSize() + z0.getHeaderPadding();
            double d10 = i11;
            int ceil = (int) Math.ceil(Math.min(this.P, i13) / d10);
            int g10 = headerSize + ((a0.g() / i11) * ceil);
            if (i13 >= 0 && i13 < ceil) {
                return g10;
            }
            int i14 = i13 - this.P;
            while (true) {
                String[][] strArr = h.f5263i;
                if (i12 >= strArr.length || i14 <= 0) {
                    break;
                }
                g10 += a0.i(32.0f);
                i14--;
                if (i14 > 0) {
                    g10 += ((int) Math.ceil(Math.min(strArr[i12].length, i14) / d10)) * (a0.g() / i11);
                    i14 -= strArr[i12].length;
                }
                i12++;
            }
            return g10;
        }

        public void Q(f fVar, int i10) {
            int n10 = fVar.n();
            if (n10 != 0) {
                boolean z10 = true;
                if (n10 == 1) {
                    e eVar = this.O.get(i10);
                    if (i10 >= e0() + this.P) {
                        z10 = false;
                    }
                    fVar.f2982a.setId(z10 ? R.id.emoji_recent : R.id.emoji);
                    ((r) fVar.f2982a).c(eVar.f9635c, eVar.f9636d);
                    return;
                }
                return;
            }
            p0.c0((TextView) fVar.f2982a, w.i1(this.O.get(i10).f9634b));
        }

        public f S(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                b2 b2Var = new b2(this.M);
                b2Var.setTypeface(o.i());
                if (this.Q.f9626s0) {
                    b2Var.setTextColor(j.M(R.id.theme_color_textLight, 2));
                } else {
                    b2Var.setTextColor(j.R0());
                    this.Q.A8(b2Var);
                }
                b2Var.setGravity(w.F1());
                b2Var.setTextSize(1, 15.0f);
                b2Var.setSingleLine(true);
                b2Var.setEllipsize(TextUtils.TruncateAt.END);
                b2Var.setPadding(a0.i(14.0f), a0.i(5.0f), a0.i(14.0f), a0.i(5.0f));
                b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(32.0f)));
                return new f(b2Var);
            } else if (i10 == 1) {
                r rVar = new r(this.M, this.Q.f9625r0);
                rVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                rVar.setOnClickListener(this.N);
                p0.T(rVar);
                yd.d.j(rVar);
                return new f(rVar);
            } else if (i10 == 2) {
                View view = new View(this.M);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, z0.getHeaderSize() + z0.getHeaderPadding()));
                return new f(view);
            } else {
                throw new RuntimeException("viewType == " + i10);
            }
        }

        public void l0() {
            int i10 = this.P;
            if (i10 > 0) {
                for (int i11 = i10; i11 >= 1; i11--) {
                    this.O.remove(i11);
                }
            }
            ArrayList<n> u10 = id.d.z().u();
            this.P = u10.size();
            ArrayList<e> arrayList = this.O;
            arrayList.ensureCapacity(arrayList.size() + this.P);
            Iterator<n> it = u10.iterator();
            int i12 = 1;
            while (it.hasNext()) {
                this.O.add(i12, new e(1, it.next().f14219a));
                i12++;
            }
            int i13 = this.P;
            if (i13 > i10) {
                M(i10 + 1, i13 - i10);
            } else if (i13 < i10) {
                N(i13 + 1, i10 - i13);
            }
            L(1, Math.min(this.P, i10));
        }

        public final void m0() {
            ArrayList<n> u10 = id.d.z().u();
            if (u10.isEmpty()) {
                this.P = 0;
                return;
            }
            this.O.ensureCapacity(u10.size());
            Iterator<n> it = u10.iterator();
            while (it.hasNext()) {
                this.O.add(new e(1, it.next().f14219a));
            }
            this.P = u10.size();
        }

        @Override
        public void o(String str) {
            int X1 = this.Q.f9622o0.X1();
            int a22 = this.Q.f9622o0.a2();
            if (X1 == -1 || a22 == -1) {
                L(0, this.O.size());
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i10 = -1;
            int i11 = 0;
            for (int i12 = X1; i12 <= a22; i12++) {
                e eVar = this.O.get(i12);
                if (eVar.f9633a == 1 && eVar.a()) {
                    if (i10 == -1) {
                        i10 = i12;
                    }
                    i11++;
                } else if (i10 != -1) {
                    arrayList.add(new int[]{i10, i11});
                    i10 = -1;
                    i11 = 0;
                }
            }
            if (i10 != -1) {
                arrayList.add(new int[]{i10, i11});
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                if (iArr[1] == 1) {
                    I(iArr[0]);
                } else {
                    L(iArr[0], iArr[1]);
                }
            }
            if (X1 > 0) {
                L(0, X1);
            }
            if (a22 < this.O.size() - 1) {
                L(a22 + 1, this.O.size() - a22);
            }
        }

        @Override
        public void r(int i10, n nVar) {
            if (this.Q.w9() != null) {
                this.Q.w9().setIgnoreMovement(true);
            }
            int e02 = i10 + e0();
            this.P++;
            this.O.add(e02, new e(1, nVar.f14219a));
            J(e02);
            if (this.Q.w9() != null) {
                this.Q.f9621n0.post(new Runnable() {
                    @Override
                    public final void run() {
                        t8.d.this.g0();
                    }
                });
            }
        }

        @Override
        public void t(int i10, n nVar) {
            int e02 = i10 + e0();
            this.O.set(e02, new e(1, nVar.f14219a));
            I(e02);
        }

        @Override
        public void u(String str, String str2, String[] strArr) {
            int X1 = this.Q.f9622o0.X1();
            int a22 = this.Q.f9622o0.a2();
            Iterator<e> it = this.O.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                e next = it.next();
                if (next.f9633a == 1 && i.c(next.f9635c, str)) {
                    View C = (i10 < X1 || i10 > a22) ? null : this.Q.f9622o0.C(i10);
                    if (!(C instanceof r) || !((r) C).a(str, str2, strArr)) {
                        I(i10);
                    }
                }
                i10++;
            }
        }
    }

    public static class f extends RecyclerView.c0 {
        public f(View view) {
            super(view);
        }
    }

    public t8(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public void Ia() {
        super.Ia();
        CustomRecyclerView customRecyclerView = this.f9621n0;
        if (customRecyclerView != null) {
            customRecyclerView.requestLayout();
        }
    }

    @Override
    public int R9() {
        return R.id.controller_emoji;
    }

    public final int We() {
        CustomRecyclerView customRecyclerView = this.f9621n0;
        int measuredWidth = customRecyclerView != null ? customRecyclerView.getMeasuredWidth() : 0;
        if (measuredWidth == 0) {
            measuredWidth = a0.g();
        }
        return Math.max(8, measuredWidth / a0.i(48.0f));
    }

    public void Xe() {
        int We;
        if (this.f9622o0 != null && this.f9624q0 != (We = We())) {
            this.f9624q0 = We;
            this.f9622o0.d3(We);
        }
    }

    public int Ye() {
        int X1 = this.f9622o0.X1();
        int i10 = 0;
        if (X1 == -1) {
            return 0;
        }
        View C = this.f9622o0.C(X1);
        if (C != null) {
            i10 = -C.getTop();
        }
        return i10 + this.f9623p0.i0(X1, this.f9624q0);
    }

    @Override
    public void Z8() {
        super.Z8();
        t1.b().d(this);
        id.d.z().H(this.f9623p0);
        p0.n(this.f9621n0);
    }

    public int Ze() {
        int k02;
        View X = this.f9621n0.X(0.0f, z0.getHeaderSize() + z0.getHeaderPadding());
        if (X == null || (k02 = this.f9621n0.k0(X)) == -1) {
            return -1;
        }
        return this.f9623p0.f0(k02);
    }

    public void af() {
        int a22 = this.f9622o0.a2();
        for (int X1 = this.f9622o0.X1(); X1 <= a22; X1++) {
            View C = this.f9622o0.C(X1);
            if (C != null) {
                C.invalidate();
            } else {
                this.f9623p0.I(X1);
            }
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public void bf() {
        d dVar = this.f9623p0;
        if (dVar != null) {
            dVar.l0();
        }
    }

    public void cf(int i10) {
        int i11;
        int i12;
        int i13;
        this.f9621n0.C1();
        if (i10 == 0) {
            i12 = 0;
            i11 = 0;
        } else {
            if (this.f9623p0.P > 0) {
                i11 = 1;
                for (int i14 = 0; i14 < i10; i14++) {
                    if (i14 == 0) {
                        i13 = this.f9623p0.P;
                    } else {
                        i13 = h.f5263i[i14 - 1].length + 1;
                    }
                    i11 += i13;
                }
            } else {
                i11 = 1;
                for (int i15 = 0; i15 < i10; i15++) {
                    i11 += h.f5263i[i15].length + 1;
                }
            }
            i12 = (this.f9623p0.i0(i11, this.f9624q0) - z0.getHeaderSize()) - z0.getHeaderPadding();
        }
        int Ze = Ze();
        if (Math.abs(i10 - Ze) > 4) {
            if (w9() != null) {
                w9().setIgnoreMovement(true);
            }
            if (i10 == 0) {
                this.f9622o0.z2(0, 0);
            } else {
                this.f9622o0.z2(i11, z0.getHeaderSize() + z0.getHeaderPadding());
            }
            if (w9() != null) {
                w9().setIgnoreMovement(false);
                return;
            }
            return;
        }
        int Ye = i12 - Ye();
        int[] iArr = new int[1];
        k kVar = this.f9627t0;
        if (kVar != null) {
            kVar.k();
        }
        this.f9621n0.setScrollDisabled(true);
        if (w9() != null) {
            w9().setIgnoreMovement(true);
            w9().setCurrentEmojiSection(i10);
        }
        k kVar2 = new k(0, new c(Ye, iArr), db.b.f7292g, Math.min(450, Math.max(250, Math.abs(Ze - i10) * 150)));
        this.f9627t0 = kVar2;
        kVar2.i(1.0f);
    }

    @Override
    public void e2() {
        CustomRecyclerView customRecyclerView = this.f9621n0;
        if (customRecyclerView != null) {
            int childCount = customRecyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f9621n0.getChildAt(i10);
                if (childAt != null) {
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public View oc(Context context) {
        int We = We();
        this.f9624q0 = We;
        RtlGridLayoutManager rtlGridLayoutManager = new RtlGridLayoutManager(context, We);
        int i10 = 1;
        this.f9622o0 = rtlGridLayoutManager.g3(true);
        this.f9625r0 = new q(context, x9().getToneDelegate(), this);
        this.f9623p0 = new d(context, this, this);
        this.f9626s0 = x9().V2();
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) p0.v(t(), R.layout.recycler_custom, w9());
        this.f9621n0 = customRecyclerView;
        customRecyclerView.setHasFixedSize(true);
        this.f9621n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f9621n0.setLayoutManager(this.f9622o0);
        CustomRecyclerView customRecyclerView2 = this.f9621n0;
        if (!fd.a.f11879a) {
            i10 = 2;
        }
        customRecyclerView2.setOverScrollMode(i10);
        this.f9621n0.setItemAnimator(new tc.d(db.b.f7287b, 140L));
        this.f9621n0.k(new a());
        this.f9622o0.e3(new b());
        this.f9621n0.setAdapter(this.f9623p0);
        t1.b().a(this);
        id.d.z().d(this.f9623p0);
        return this.f9621n0;
    }

    @Override
    public void onClick(View view) {
        if (view instanceof r) {
            r rVar = (r) view;
            String rawEmoji = rVar.getRawEmoji();
            String emojiColored = rVar.getEmojiColored();
            if (!i.i(rawEmoji)) {
                if (view.getId() == R.id.emoji) {
                    id.d.z().O(rawEmoji);
                }
                if (w9() != null) {
                    w9().n2(emojiColored);
                }
            }
        }
    }

    public static class e {
        public final int f9633a;
        public final int f9634b;
        public final String f9635c;
        public final int f9636d;

        public e(int i10, int i11) {
            this.f9633a = i10;
            this.f9634b = i11;
            this.f9635c = null;
            this.f9636d = 0;
        }

        public boolean a() {
            return this.f9636d != 0;
        }

        public e(int i10, String str) {
            this.f9633a = i10;
            this.f9635c = str;
            this.f9636d = h.i().g(str);
            this.f9634b = 0;
        }
    }
}
