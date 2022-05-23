package xc;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.o;
import ce.p0;
import dd.j;
import dd.l;
import gd.w;
import hd.v6;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.c2;
import ne.d3;
import ne.n2;
import ne.z0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import yd.g;
import zd.o6;

public class e extends RecyclerView.h<a> implements View.OnClickListener {
    public final v4<?> M;
    public final ArrayList<b> N = new ArrayList<>();
    public final j.c O;
    public final boolean P;
    public RecyclerView.p Q;
    public v4<?> R;
    public boolean S;
    public k0.e<v6> T;

    public static class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }

        public static a O(Context context, o6 o6Var, int i10, boolean z10, View.OnClickListener onClickListener, j.c cVar, boolean z11, v4<?> v4Var) {
            if (i10 != 10) {
                switch (i10) {
                    case 0:
                        j jVar = new j(context);
                        jVar.j(o6Var);
                        if (z10) {
                            jVar.w();
                        }
                        jVar.setStickerMovementCallback(cVar);
                        jVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                        return new a(jVar);
                    case 1:
                        View view = new View(context);
                        view.setLayoutParams(FrameLayoutFix.q1(-2, -2));
                        return new a(view);
                    case 2:
                        b2 b2Var = new b2(context);
                        b2Var.setTypeface(o.i());
                        b2Var.setTextColor(ae.j.R0());
                        if (v4Var != null) {
                            v4Var.A8(b2Var);
                        }
                        b2Var.setGravity(w.F1());
                        b2Var.setTextSize(1, 15.0f);
                        b2Var.setSingleLine(true);
                        b2Var.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var.setPadding(a0.i(14.0f), a0.i(5.0f), a0.i(14.0f), a0.i(5.0f));
                        b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(32.0f)));
                        return new a(b2Var);
                    case 3:
                        View view2 = new View(context);
                        view2.setLayoutParams(new RecyclerView.LayoutParams(-1, z0.getHeaderSize() + z0.getHeaderPadding()));
                        return new a(view2);
                    case 4:
                    case 6:
                        b2 b2Var2 = new b2(context);
                        b2Var2.setTypeface(o.k());
                        b2Var2.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        b2Var2.setTextColor(ae.j.R0());
                        if (v4Var != null) {
                            v4Var.A8(b2Var2);
                        }
                        b2Var2.setTextSize(1, 15.0f);
                        b2Var2.setSingleLine(true);
                        b2Var2.setText(w.i1(i10 == 6 ? R.string.ComeAgainLater : R.string.NoStickerSets));
                        b2Var2.setGravity(17);
                        b2Var2.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var2.setPadding(a0.i(14.0f), z11 ? 0 : z0.getHeaderSize(), a0.i(14.0f), 0);
                        return new a(b2Var2);
                    case 5:
                        n2 n2Var = new n2(context);
                        n2Var.f(1.0f);
                        n2Var.setPadding(0, z11 ? 0 : z0.getHeaderSize(), 0, 0);
                        n2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        return new a(n2Var);
                    case 7:
                        RelativeLayout relativeLayout = new RelativeLayout(context);
                        relativeLayout.setOnClickListener(onClickListener);
                        relativeLayout.setPadding(a0.i(16.0f), a0.i(z11 ? 18.0f : 13.0f) - z0.getHeaderPadding(), a0.i(16.0f), 0);
                        relativeLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(z11 ? 57.0f : 52.0f)));
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, a0.i(16.0f));
                        layoutParams.addRule(w.i());
                        if (w.G2()) {
                            layoutParams.leftMargin = a0.i(6.0f);
                        } else {
                            layoutParams.rightMargin = a0.i(6.0f);
                        }
                        layoutParams.topMargin = a0.i(3.0f);
                        b2 b2Var3 = new b2(context);
                        g.i(b2Var3, R.id.theme_color_promo, v4Var).e(3.0f);
                        b2Var3.setId(R.id.btn_new);
                        b2Var3.setSingleLine(true);
                        b2Var3.setPadding(a0.i(4.0f), a0.i(1.0f), a0.i(4.0f), 0);
                        b2Var3.setTextColor(ae.j.L(R.id.theme_color_promoContent));
                        if (v4Var != null) {
                            v4Var.z8(b2Var3, R.id.theme_color_promoContent);
                            v4Var.t8(b2Var3);
                        }
                        b2Var3.setTypeface(o.g());
                        b2Var3.setTextSize(1, 10.0f);
                        b2Var3.setText(w.i1(R.string.New).toUpperCase());
                        b2Var3.setLayoutParams(layoutParams);
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, a0.i(28.0f));
                        if (w.G2()) {
                            layoutParams2.rightMargin = a0.i(16.0f);
                        } else {
                            layoutParams2.leftMargin = a0.i(16.0f);
                        }
                        layoutParams2.topMargin = a0.i(5.0f);
                        layoutParams2.addRule(w.G2() ? 9 : 11);
                        c2 c2Var = new c2(context);
                        if (v4Var != null) {
                            v4Var.t8(c2Var);
                        }
                        c2Var.setId(R.id.btn_addStickerSet);
                        c2Var.setText(R.string.Add);
                        c2Var.setOnClickListener(onClickListener);
                        c2Var.setLayoutParams(layoutParams2);
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                        if (w.G2()) {
                            layoutParams3.leftMargin = a0.i(12.0f);
                            layoutParams3.addRule(0, R.id.btn_new);
                            layoutParams3.addRule(1, R.id.btn_addStickerSet);
                        } else {
                            layoutParams3.rightMargin = a0.i(12.0f);
                            layoutParams3.addRule(1, R.id.btn_new);
                            layoutParams3.addRule(0, R.id.btn_addStickerSet);
                        }
                        b2 b2Var4 = new b2(context);
                        b2Var4.setTypeface(o.i());
                        b2Var4.setTextColor(ae.j.P0());
                        b2Var4.setGravity(w.F1());
                        if (v4Var != null) {
                            v4Var.y8(b2Var4);
                        }
                        b2Var4.setTextSize(1, 16.0f);
                        b2Var4.setSingleLine(true);
                        b2Var4.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var4.setLayoutParams(layoutParams3);
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                        layoutParams4.addRule(w.i());
                        layoutParams4.topMargin = a0.i(22.0f);
                        b2 b2Var5 = new b2(context);
                        b2Var5.setTypeface(o.k());
                        b2Var5.setTextSize(1, 15.0f);
                        b2Var5.setTextColor(ae.j.R0());
                        if (v4Var != null) {
                            v4Var.A8(b2Var5);
                        }
                        b2Var5.setSingleLine(true);
                        b2Var5.setEllipsize(TextUtils.TruncateAt.END);
                        b2Var5.setLayoutParams(layoutParams4);
                        relativeLayout.addView(b2Var3);
                        relativeLayout.addView(c2Var);
                        relativeLayout.addView(b2Var4);
                        relativeLayout.addView(b2Var5);
                        return new a(relativeLayout);
                    default:
                        throw new UnsupportedOperationException("viewType == " + i10);
                }
            } else {
                d3 d3Var = new d3(context);
                if (v4Var != null) {
                    v4Var.t8(d3Var);
                }
                d3Var.a();
                d3Var.setLayoutParams(new RecyclerView.LayoutParams(-1, a0.i(5.0f)));
                return new a(d3Var);
            }
        }
    }

    public e(v4<?> v4Var, j.c cVar, boolean z10, v4<?> v4Var2) {
        this.M = v4Var;
        this.O = cVar;
        this.P = z10;
        this.R = v4Var2;
    }

    public void n0(v6 v6Var, TdApi.Object object) {
        this.T.l(v6Var.c());
        E0(v6Var);
        if (object.getConstructor() == -722616727) {
            v6Var.y();
            D0(v6Var);
        }
    }

    public void o0(final v6 v6Var, final TdApi.Object object) {
        this.M.c().hd().post(new Runnable() {
            @Override
            public final void run() {
                e.this.n0(v6Var, object);
            }
        });
    }

    public void A0(RecyclerView.p pVar) {
        this.Q = pVar;
    }

    public void B0(int i10, boolean z10, RecyclerView.p pVar) {
        View C = pVar != null ? pVar.C(i10) : null;
        if (C == null || !(C instanceof j)) {
            I(i10);
        } else {
            ((j) C).setStickerPressed(z10);
        }
    }

    public void C0(l lVar, boolean z10, RecyclerView.p pVar) {
        int j02 = j0(lVar, 0);
        if (j02 != -1) {
            B0(j02, z10, pVar);
        }
    }

    @Override
    public int D() {
        return this.N.size();
    }

    public void D0(v6 v6Var) {
        if (this.Q != null) {
            int k10 = v6Var.k();
            View C = this.Q.C(k10);
            if (C != null && F(k10) == 7 && this.Q.Z(C) == 7) {
                ((c2) ((ViewGroup) C).getChildAt(1)).h(v6Var.o(), true);
            } else {
                I(k10);
            }
        }
    }

    public final void E0(v6 v6Var) {
        if (this.Q != null) {
            int k10 = v6Var.k();
            View C = this.Q.C(k10);
            if (C == null || F(k10) != 7) {
                I(k10);
            } else {
                ((c2) ((ViewGroup) C).getChildAt(1)).g(m0(v6Var.c()), true);
            }
        }
    }

    @Override
    public int F(int i10) {
        return this.N.get(i10).f26228a;
    }

    public void F0(v6 v6Var) {
        if (this.Q != null) {
            int k10 = v6Var.k();
            View C = this.Q.C(k10);
            if (C == null || F(k10) != 7) {
                I(k10);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) C;
            int i10 = 0;
            ((c2) viewGroup.getChildAt(1)).h(v6Var.o(), false);
            View childAt = viewGroup.getChildAt(0);
            if (v6Var.t()) {
                i10 = 8;
            }
            childAt.setVisibility(i10);
        }
    }

    public void c0(ArrayList<b> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.N.size();
            this.N.addAll(arrayList);
            M(size, arrayList.size());
        }
    }

    public void d0(int i10, ArrayList<b> arrayList) {
        this.N.addAll(i10, arrayList);
        M(i10, arrayList.size());
    }

    public final void e0() {
        if (!this.N.isEmpty()) {
            int size = this.N.size();
            this.N.clear();
            N(0, size);
        }
    }

    public b f0(int i10) {
        return this.N.get(i10);
    }

    public l g0(int i10) {
        if (i10 < 0 || i10 >= this.N.size()) {
            return null;
        }
        return this.N.get(i10).f26229b;
    }

    public v6 h0(int i10) {
        if (i10 < 0 || i10 >= this.N.size()) {
            return null;
        }
        return this.N.get(i10).f26230c;
    }

    public int i0(l lVar) {
        Iterator<b> it = this.N.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            b next = it.next();
            if (next.f26228a == 0 && lVar.equals(next.f26229b)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public int j0(l lVar, int i10) {
        if (i10 == 0) {
            return i0(lVar);
        }
        int size = this.N.size();
        while (i10 < size) {
            b bVar = this.N.get(i10);
            if (bVar.f26228a == 0 && lVar.equals(bVar.f26229b)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void k0(int i10, ArrayList<b> arrayList) {
        this.N.addAll(i10, arrayList);
        M(i10, arrayList.size());
    }

    public final void l0(final v6 v6Var) {
        k0.e<v6> eVar = this.T;
        if (eVar == null) {
            this.T = new k0.e<>();
        } else if (eVar.f(v6Var.c()) != null) {
            return;
        }
        this.T.k(v6Var.c(), v6Var);
        this.M.c().v4().o(new TdApi.ChangeStickerSet(v6Var.c(), true, false), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                e.this.o0(v6Var, object);
            }
        });
    }

    public final boolean m0(long j10) {
        k0.e<v6> eVar = this.T;
        return (eVar == null || eVar.f(j10) == null) ? false : true;
    }

    @Override
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag != null && (tag instanceof v6)) {
            v6 v6Var = (v6) tag;
            if (view.getId() != R.id.btn_addStickerSet) {
                v6Var.H(this.M);
                return;
            }
            ((c2) view).g(true, true);
            l0(v6Var);
        }
    }

    public int p0(int i10, int i11, int i12, ArrayList<v6> arrayList) {
        if (i10 == 0 || arrayList == null || i12 == -1) {
            return 0;
        }
        int i13 = i10 - 1;
        int headerSize = z0.getHeaderSize() + z0.getHeaderPadding();
        if (i13 == 0) {
            return headerSize;
        }
        int B = (arrayList.get(0).s() ? a0.B() : a0.g()) / i11;
        int i14 = headerSize;
        boolean z10 = false;
        for (int i15 = 0; i15 < i12 + 1 && i13 > 0 && i15 < arrayList.size(); i15++) {
            v6 v6Var = arrayList.get(i15);
            if (!v6Var.r()) {
                i14 += a0.i(v6Var.s() ? 52.0f : 32.0f);
                i13--;
            } else if (v6Var.n()) {
                z10 = true;
            }
            if (v6Var.q()) {
                i13--;
                if (z10) {
                    i14 += a0.i(32.0f);
                }
            }
            if (i13 > 0) {
                int min = Math.min(v6Var.s() ? 5 : v6Var.j(), i13);
                i14 += ((int) Math.ceil(min / i11)) * B;
                i13 -= min;
            }
        }
        return i14;
    }

    public void q0(int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList(i11);
        for (int i13 = (i10 + i11) - 1; i13 >= i10; i13--) {
            arrayList.add(0, this.N.remove(i13));
        }
        N(i10, i11);
        this.N.addAll(i12, arrayList);
        M(i12, i11);
    }

    public void Q(a aVar, int i10) {
        int n10 = aVar.n();
        if (n10 != 0) {
            String str = "";
            if (n10 == 2) {
                v6 h02 = h0(i10);
                TextView textView = (TextView) aVar.f2982a;
                if (h02 != null) {
                    str = h02.l();
                }
                p0.c0(textView, str);
                p0.l0((TextView) aVar.f2982a, w.F1());
            } else if (n10 == 7) {
                v6 h03 = h0(i10);
                if (h03 != null && !h03.t()) {
                    h03.J();
                }
                RelativeLayout relativeLayout = (RelativeLayout) aVar.f2982a;
                View childAt = relativeLayout.getChildAt(0);
                c2 c2Var = (c2) relativeLayout.getChildAt(1);
                TextView textView2 = (TextView) relativeLayout.getChildAt(2);
                TextView textView3 = (TextView) relativeLayout.getChildAt(3);
                relativeLayout.setTag(h03);
                childAt.setVisibility((h03 == null || h03.t()) ? 8 : 0);
                c2Var.g(h03 != null && !h03.q() && m0(h03.c()), false);
                c2Var.h(h03 != null && h03.o(), false);
                c2Var.setTag(h03);
                p0.c0(textView2, h03 != null ? h03.l() : str);
                if (h03 != null) {
                    str = w.o2(R.string.xStickers, h03.j());
                }
                textView3.setText(str);
                if (p0.R(childAt, w.G2())) {
                    int i11 = a0.i(6.0f);
                    int i12 = a0.i(3.0f);
                    int i13 = w.G2() ? i11 : 0;
                    if (w.G2()) {
                        i11 = 0;
                    }
                    p0.a0(childAt, i13, i12, i11, 0);
                    p0.r0(childAt);
                }
                if (p0.Q(c2Var, w.G2() ? 9 : 11)) {
                    int i14 = a0.i(16.0f);
                    int i15 = a0.i(5.0f);
                    int i16 = w.G2() ? 0 : i14;
                    if (!w.G2()) {
                        i14 = 0;
                    }
                    p0.a0(c2Var, i16, i15, i14, 0);
                    p0.r0(c2Var);
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView2.getLayoutParams();
                if (w.G2()) {
                    int i17 = a0.i(12.0f);
                    if (layoutParams.leftMargin != i17) {
                        layoutParams.leftMargin = i17;
                        layoutParams.rightMargin = 0;
                        layoutParams.addRule(0, R.id.btn_new);
                        layoutParams.addRule(1, R.id.btn_addStickerSet);
                        p0.r0(textView2);
                    }
                } else {
                    int i18 = a0.i(12.0f);
                    if (layoutParams.rightMargin != i18) {
                        layoutParams.rightMargin = i18;
                        layoutParams.leftMargin = 0;
                        layoutParams.addRule(1, R.id.btn_new);
                        layoutParams.addRule(0, R.id.btn_addStickerSet);
                        p0.r0(textView2);
                    }
                }
                p0.l0(textView2, w.F1());
                if (p0.R(textView3, w.G2())) {
                    p0.r0(textView3);
                }
            }
        } else {
            l g02 = g0(i10);
            if (g02 != null && g02.n()) {
                g02.t();
            }
            ((j) aVar.f2982a).setSticker(g02);
        }
    }

    public a S(ViewGroup viewGroup, int i10) {
        return a.O(this.M.t(), this.M.c(), i10, this.P, this, this.O, this.S, this.R);
    }

    public void V(a aVar) {
        int n10 = aVar.n();
        if (n10 == 0) {
            ((j) aVar.f2982a).d();
        } else if (n10 == 5) {
            ((n2) aVar.f2982a).e();
        }
    }

    public void W(a aVar) {
        int n10 = aVar.n();
        if (n10 == 0) {
            ((j) aVar.f2982a).i();
        } else if (n10 == 5) {
            ((n2) aVar.f2982a).b();
        }
    }

    public void X(a aVar) {
        int n10 = aVar.n();
        if (n10 == 0) {
            ((j) aVar.f2982a).Q2();
        } else if (n10 == 5) {
            ((n2) aVar.f2982a).Q2();
        }
    }

    public void w0(int i10, int i11) {
        for (int i12 = (i10 + i11) - 1; i12 >= i10; i12--) {
            this.N.remove(i12);
        }
        N(i10, i11);
    }

    public void x0() {
        this.S = true;
    }

    public void y0(b bVar) {
        e0();
        if (bVar != null) {
            this.N.add(bVar);
            J(0);
        }
    }

    public void z0(ArrayList<b> arrayList) {
        e0();
        if (arrayList != null && !arrayList.isEmpty()) {
            this.N.addAll(arrayList);
            M(0, arrayList.size());
        }
    }

    public static class b {
        public int f26228a;
        public final l f26229b;
        public final v6 f26230c;

        public b(int i10) {
            this.f26228a = i10;
            this.f26229b = null;
            this.f26230c = null;
        }

        public boolean a(int i10) {
            if (this.f26228a == i10) {
                return false;
            }
            this.f26228a = i10;
            return true;
        }

        public b(int i10, l lVar) {
            this.f26228a = i10;
            this.f26229b = lVar;
            this.f26230c = null;
        }

        public b(int i10, v6 v6Var) {
            this.f26228a = i10;
            this.f26229b = null;
            this.f26230c = v6Var;
        }
    }
}
