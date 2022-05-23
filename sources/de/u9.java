package de;

import ae.j;
import ae.p;
import ae.q;
import ae.z;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import ce.y;
import de.y00;
import gd.w;
import hd.a1;
import hd.c1;
import hd.f1;
import hd.m1;
import hd.s;
import hd.t2;
import ib.d;
import ib.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.g;
import je.h;
import je.v0;
import je.x0;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.d2;
import ne.e2;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.h1;
import ud.q1;
import ud.v4;
import vd.o0;
import zd.hj;
import zd.o6;
import zd.s1;
import zd.t1;

public class u9 extends v4<b> implements h1, Client.g, t1.a, g.c, View.OnClickListener, View.OnLongClickListener, o0.c {
    public iq f9725n0;
    public RecyclerView f9726o0;
    public ArrayList<f1> f9727p0;

    public class a extends ne.h1 {
        public a(RecyclerView recyclerView, v4 v4Var) {
            super(recyclerView, v4Var);
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            a1.b[] u10;
            rect.left = 0;
            a1 Ue = u9.this.Ue(view);
            if (!(Ue == null || (u10 = Ue.u()) == null)) {
                rect.left = a0.i(18.0f);
                for (a1.b bVar : u10) {
                    rect.left = (int) (rect.left + Math.max(a0.i(16.0f), bVar.f12697a.f12696b + a0.i(4.0f)));
                }
            }
        }

        @Override
        public void n(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar, View view) {
            a1.b[] u10;
            float alpha = view.getAlpha();
            a1 Ue = u9.this.Ue(view);
            if (!(Ue == null || (u10 = Ue.u()) == null)) {
                int U = recyclerView.getLayoutManager().U(view) + ((int) view.getTranslationY()) + Ue.m();
                int left = view.getLeft() - recyclerView.getLayoutManager().Q(view);
                for (int length = u10.length - 1; length >= 0; length--) {
                    a1.b bVar = u10[length];
                    a1 a1Var = bVar.f12700d;
                    if (a1Var == null || a1Var == Ue) {
                        int width = left - bVar.f12699c.getWidth();
                        bVar.f12699c.v(canvas, width, width, 0, U, null, alpha);
                        left = (int) (left - Math.max(a0.i(16.0f), bVar.f12697a.f12696b + a0.i(4.0f)));
                    } else {
                        return;
                    }
                }
            }
        }

        @Override
        public int p(int i10, View view) {
            a1 Ue = u9.this.Ue(view);
            int l10 = Ue != null ? Ue.l() : 0;
            if (l10 == 0) {
                return 0;
            }
            if (l10 != R.id.theme_color_filling) {
                return d.c(j.L(R.id.theme_color_filling), d.a(view.getAlpha(), j.L(l10)));
            }
            return j.L(l10);
        }

        @Override
        public boolean r() {
            return true;
        }
    }

    public static class b {
        public final TdApi.WebPage f9729a;
        public TdApi.WebPageInstantView f9730b;
        public String f9731c;

        public b(TdApi.WebPage webPage, TdApi.WebPageInstantView webPageInstantView, String str) {
            this.f9729a = webPage;
            this.f9730b = webPageInstantView;
            this.f9731c = str;
        }
    }

    public u9(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void We() {
        j0.c0(x9().f9729a.url);
    }

    public void Xe(TdApi.WebPageInstantView webPageInstantView) {
        if (Sa()) {
            return;
        }
        if (!t2.y2(webPageInstantView.version)) {
            j0.y0(R.string.InstantViewUnsupported, 0);
            j0.c0(Ve());
            return;
        }
        x9().f9730b = webPageInstantView;
        Se(true);
    }

    @Override
    public boolean A(String str) {
        return h.i(this, str);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public boolean C5(String str) {
        return h.m(this, str);
    }

    @Override
    public boolean D3(View view, g gVar, v0 v0Var, String str, boolean z10) {
        return h.f(this, view, gVar, v0Var, str, z10);
    }

    @Override
    public View Ga() {
        return this.f9726o0;
    }

    @Override
    public boolean H3(long j10) {
        return h.l(this, j10);
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_forward) {
            String str = x9().f9729a.url;
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            y00.m mVar = new y00.m(str);
            mVar.B(R.string.OpenInExternalApp, new Runnable() {
                @Override
                public final void run() {
                    u9.this.We();
                }
            });
            if (c0.Q(str)) {
                mVar.C(str);
            }
            y00Var.Vi(mVar);
            y00Var.ej();
        }
    }

    @Override
    public TdApi.WebPage J2(String str) {
        return h.a(this, str);
    }

    @Override
    public int L9() {
        return R.id.theme_color_ivHeader;
    }

    @Override
    public p O1(View view, g gVar) {
        return h.c(this, view, gVar);
    }

    @Override
    public boolean O4(String str) {
        return h.g(this, str);
    }

    @Override
    public int O9() {
        return R.id.theme_color_ivHeaderIcon;
    }

    @Override
    public int Q9() {
        return R.id.theme_color_ivHeaderIcon;
    }

    @Override
    public boolean R6(View view, String str) {
        return Ze(str, true);
    }

    @Override
    public int R9() {
        return R.id.controller_instantView;
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        float f12 = f10 - (p0.r(this.f9726o0)[0] - p0.r(q1Var.get())[0]);
        float f13 = f11 - (p0.r(this.f9726o0)[1] - p0.r(q1Var.get())[1]);
        View X = this.f9726o0.X(f12, f13);
        if (!(X instanceof e2)) {
            return super.S8(q1Var, f12, f13);
        }
        float top = f13 - X.getTop();
        e2 e2Var = (e2) X;
        int mode = e2Var.getMode();
        if (mode == 1) {
            View childAt = e2Var.getChildAt(0);
            return childAt == null || top < ((float) childAt.getTop()) || top >= ((float) childAt.getBottom());
        } else if (mode == 3) {
            View childAt2 = e2Var.getChildAt(0);
            return childAt2 == null || top < ((float) childAt2.getTop()) || top >= ((float) childAt2.getBottom()) || e2Var.getViewPagerPosition() == 0.0f;
        } else if (mode != 4) {
            return false;
        } else {
            View childAt3 = ((ViewGroup) e2Var.getChildAt(0)).getChildAt(0);
            return childAt3 == null || top < ((float) childAt3.getTop()) || top >= ((float) childAt3.getBottom()) || childAt3.getLeft() >= 0;
        }
    }

    public final void Se(boolean z10) {
        b x92 = x9();
        TdApi.WebPageInstantView webPageInstantView = x92.f9730b;
        if (!z10 || webPageInstantView.isFull) {
            ArrayList<a1> M = a1.M(this, Ve(), webPageInstantView, null, this, null);
            ArrayList arrayList = new ArrayList(M.size());
            this.f9727p0 = new ArrayList<>();
            Iterator<a1> it = M.iterator();
            while (it.hasNext()) {
                a1 next = it.next();
                if (next instanceof f1) {
                    f1 f1Var = (f1) next;
                    if (f1Var.Z(this, Te(), this.f9727p0)) {
                        this.f9727p0.add(f1Var);
                    }
                }
                arrayList.add(new ra(next.y()).G(next));
            }
            this.f9725n0.s2(arrayList, false);
            this.f9726o0.A0();
            if (!i.i(x92.f9731c)) {
                Ze(x92.f9731c, false);
            }
            if (!z10) {
                this.f24495b.v4().o(new TdApi.GetWebPageInstantView(Ve(), true), this);
                return;
            }
            return;
        }
        Log.e("TDLib error: instantView.isFull returned false on the second call", new Object[0]);
    }

    public String Te() {
        return x9().f9729a.displayUrl;
    }

    public final a1 Ue(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar == null || !(raVar.d() instanceof a1)) {
            return null;
        }
        return (a1) raVar.d();
    }

    public String Ve() {
        return x9().f9729a.url;
    }

    @Override
    public int W9() {
        return R.id.menu_iv;
    }

    @Override
    public CharSequence X9() {
        return x9().f9729a.siteName;
    }

    public final void Ye() {
        this.f9727p0.clear();
        for (ra raVar : this.f9725n0.D0()) {
            a1 a1Var = (a1) raVar.d();
            if (a1Var instanceof f1) {
                f1 f1Var = (f1) a1Var;
                if (f1Var.Z(this, Te(), this.f9727p0)) {
                    this.f9727p0.add(f1Var);
                }
            }
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        p0.n(this.f9726o0);
        z.u().U(this);
        t().u2(this, true);
    }

    public final boolean Ze(String str, boolean z10) {
        if (str == null) {
            return false;
        }
        String a10 = i.a(str);
        if (str.equals(a10)) {
            a10 = null;
        }
        List<ra> D0 = this.f9725n0.D0();
        int i10 = 0;
        for (ra raVar : D0) {
            Object d10 = raVar.d();
            if (d10 instanceof a1) {
                a1 a1Var = (a1) d10;
                boolean z11 = str.equals(a1Var.k()) || (a10 != null && a10.equals(a1Var.k()));
                if (z11 && !a1Var.E()) {
                    af(i10, a1Var, null, true);
                    return true;
                } else if (a1Var.C(str)) {
                    af(i10, a1Var, str, true);
                    return true;
                } else if (z11 && a1Var.E()) {
                    int i11 = i10 + 1;
                    if (i11 < D0.size()) {
                        Object d11 = D0.get(i11).d();
                        if (d11 instanceof a1) {
                            a1 a1Var2 = (a1) d11;
                            if (str.equals(a1Var2.k()) && !a1Var2.E()) {
                                af(i11, a1Var2, a1Var.k(), true);
                                return true;
                            }
                        }
                    }
                    af(i10, a1Var, null, false);
                    return true;
                }
            }
            i10++;
        }
        if (!str.isEmpty() || D0.isEmpty()) {
            return false;
        }
        af(0, null, null, true);
        return true;
    }

    @Override
    public boolean a5(String str) {
        return h.e(this, str);
    }

    public final void af(int i10, a1 a1Var, String str, boolean z10) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9726o0.getLayoutManager();
        if (linearLayoutManager != null) {
            if (i.i(str)) {
                if (z10) {
                    linearLayoutManager.z2(i10, 0);
                    return;
                }
                int i11 = i10 + 1;
                if (i11 < this.f9725n0.D()) {
                    linearLayoutManager.z2(i11, 0);
                } else {
                    linearLayoutManager.z2(i10, this.f24493a.O0(this.f9726o0));
                }
            } else if (a1Var != null) {
                linearLayoutManager.z2(i10, -a1Var.n(str, this.f24493a.O0(this.f9726o0)));
            }
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public void bf() {
        if (this.f24493a.Q1().X()) {
            Z8();
            return;
        }
        get();
        this.f24493a.Q1().h0(this);
    }

    @Override
    public boolean d5(View view, String str, boolean z10, hj.q qVar) {
        List<String> pathSegments;
        String Ve = Ve();
        Uri l02 = c0.l0(Ve);
        boolean z11 = false;
        if (l02 != null && this.f24495b.a7(l02.getHost(), false) && (pathSegments = l02.getPathSegments()) != null && pathSegments.size() == 1 && pathSegments.get(0).equals("iv")) {
            String queryParameter = l02.getQueryParameter("url");
            String queryParameter2 = l02.getQueryParameter("rhash");
            if (!i.i(queryParameter) && !i.i(queryParameter2)) {
                str = new Uri.Builder().scheme("https").authority(this.f24495b.Oc()).path("iv").appendQueryParameter("url", str).appendQueryParameter("rhash", queryParameter2).build().toString();
                z11 = true;
            }
        }
        this.f24495b.hd().E7(this, str, new hj.q(qVar).i().l(Ve).j(z11 ? str : null));
        return true;
    }

    @Override
    public void e2() {
        RecyclerView recyclerView = this.f9726o0;
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            int childCount = this.f9726o0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f9726o0.getChildAt(i10);
                if (childAt != null) {
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public boolean l2(String str) {
        return h.b(this, str);
    }

    @Override
    public boolean l7(View view, String str, String str2, hj.q qVar) {
        TdApi.RichText I0;
        if (qVar.f27707g == null || (I0 = e.I0(x9().f9730b, str2)) == null) {
            return false;
        }
        qVar.f27707g.b(view, ((d2) view).getBlock().A()).i(this).A(x0.z(this, this, I0, y.A0(13.0f), qVar.f27707g.h(), qVar));
        return true;
    }

    @Override
    public o0.b m5(TdApi.Message message) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            i10 = 7;
        } else if (constructor != 527777781) {
            return null;
        } else {
            i10 = 8;
        }
        int i11 = -1;
        for (int size = this.f9725n0.D0().size() - 1; size >= 0; size--) {
            a1 a1Var = (a1) this.f9725n0.D0().get(size).d();
            s X = a1Var instanceof c1 ? ((c1) a1Var).X() : null;
            if (X != null && X.v() == i10) {
                TdApi.Message a02 = X.a0();
                if (a02 == message) {
                    if (i11 == -1) {
                        i11 = arrayList.size();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                arrayList.add(a02);
            }
        }
        if (i11 != -1) {
            return new o0.b(arrayList, i11).q(Log.TAG_ROUND).s(true, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public View oc(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        yd.g.i(frameLayout, R.id.theme_color_background, this);
        RecyclerView recyclerView = (RecyclerView) p0.v(t(), R.layout.recycler, frameLayout);
        this.f9726o0 = recyclerView;
        int i10 = 1;
        recyclerView.setHasFixedSize(true);
        this.f9726o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerView recyclerView2 = this.f9726o0;
        if (!fd.a.f11879a) {
            i10 = 2;
        }
        recyclerView2.setOverScrollMode(i10);
        this.f9726o0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.f9726o0.setItemAnimator(null);
        frameLayout.addView(this.f9726o0);
        RecyclerView recyclerView3 = this.f9726o0;
        recyclerView3.g(new a(recyclerView3, this));
        this.f9725n0 = new iq(this);
        Se(false);
        this.f9726o0.setAdapter(this.f9725n0);
        t1.b().a(this);
        z.u().e(this);
        return frameLayout;
    }

    @Override
    public void onClick(View view) {
        int J0;
        a1 Ue = Ue(view);
        if (Ue != null && Ue.G()) {
            int i10 = 0;
            if (!(Ue.K(view, false) || !(Ue.x() instanceof TdApi.PageBlockDetails) || (J0 = this.f9725n0.J0(Ue)) == -1)) {
                if (((m1) Ue).C0()) {
                    try {
                        ArrayList<a1> M = a1.M(this, Ve(), x9().f9730b, Ue, this, null);
                        ra[] raVarArr = new ra[M.size()];
                        Iterator<a1> it = M.iterator();
                        while (it.hasNext()) {
                            a1 next = it.next();
                            raVarArr[i10] = new ra(next.y()).G(next);
                            i10++;
                        }
                        this.f9725n0.Y0(J0 + 1, raVarArr);
                    } catch (Throwable th) {
                        Log.e("Unsupported instant view block", th, new Object[0]);
                        t().I3().g(view).C(this.f24495b, R.string.InstantViewError).F();
                        return;
                    }
                } else {
                    int i11 = J0 + 1;
                    for (int i12 = i11; i12 < this.f9725n0.D0().size() && ((a1) this.f9725n0.C0(i12).d()).F(Ue); i12++) {
                        i10++;
                    }
                    this.f9725n0.R1(i11, i10);
                }
                Ye();
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        a1 Ue = Ue(view);
        return Ue != null && Ue.G() && Ue.K(view, true);
    }

    @Override
    public boolean p7(TdApi.Message message, boolean z10, boolean z11, List<TdApi.Message> list, long j10) {
        return false;
    }

    @Override
    public void r2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor != 778202453) {
            Log.unexpectedTdlibResponse(object, TdApi.GetWebPageInstantView.class, TdApi.WebPageInstantView.class);
        } else {
            final TdApi.WebPageInstantView webPageInstantView = (TdApi.WebPageInstantView) object;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    u9.this.Xe(webPageInstantView);
                }
            });
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_iv) {
            linearLayout.addView(d1Var.v2(R.id.menu_btn_forward, R.drawable.baseline_share_arrow_24, O9(), this, a0.i(52.0f), q.b(), d1Var), w.G2() ? 0 : -1);
        }
    }

    @Override
    public boolean z3(String str) {
        return h.h(this, str);
    }
}
