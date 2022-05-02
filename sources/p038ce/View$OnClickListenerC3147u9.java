package p038ce;

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
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import gd.AbstractC4576a1;
import gd.C4599c1;
import gd.C4632f1;
import gd.C4699m1;
import gd.C4756s;
import gd.C4779t2;
import ie.C5402h;
import ie.C5455v0;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6861d2;
import me.C6897h1;
import me.RunnableC6868e2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.x00;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5070i;
import p193nb.C7321e;
import p292ud.C9773p0;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import p364zd.C11532q;
import p364zd.C11541z;
import td.AbstractC9201h1;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC3147u9 extends AbstractC9323v4<C3149b> implements AbstractC9201h1, Client.AbstractC7865g, C11052v1.AbstractC11053a, RunnableC5390g.AbstractC5393c, View.OnClickListener, View.OnLongClickListener, C9773p0.AbstractC9776c {
    public C2546iq f10545n0;
    public RecyclerView f10546o0;
    public ArrayList<C4632f1> f10547p0;

    public class C3148a extends C6897h1 {
        public C3148a(RecyclerView recyclerView, AbstractC9323v4 v4Var) {
            super(recyclerView, v4Var);
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            AbstractC4576a1.C4578b[] u;
            rect.left = 0;
            AbstractC4576a1 Ue = View$OnClickListenerC3147u9.this.m31346Ue(view);
            if (!(Ue == null || (u = Ue.m27278u()) == null)) {
                rect.left = C1357a0.m37544i(18.0f);
                for (AbstractC4576a1.C4578b bVar : u) {
                    rect.left = (int) (rect.left + Math.max(C1357a0.m37544i(16.0f), bVar.f15041a.f15040b + C1357a0.m37544i(4.0f)));
                }
            }
        }

        @Override
        public void mo18530n(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var, View view) {
            AbstractC4576a1.C4578b[] u;
            float alpha = view.getAlpha();
            AbstractC4576a1 Ue = View$OnClickListenerC3147u9.this.m31346Ue(view);
            if (!(Ue == null || (u = Ue.m27278u()) == null)) {
                int U = recyclerView.getLayoutManager().m39234U(view) + ((int) view.getTranslationY()) + Ue.m27281m();
                int left = view.getLeft() - recyclerView.getLayoutManager().m39240Q(view);
                for (int length = u.length - 1; length >= 0; length--) {
                    AbstractC4576a1.C4578b bVar = u[length];
                    AbstractC4576a1 a1Var = bVar.f15044d;
                    if (a1Var == null || a1Var == Ue) {
                        int width = left - bVar.f15043c.getWidth();
                        bVar.f15043c.m22900v(canvas, width, width, 0, U, null, alpha);
                        left = (int) (left - Math.max(C1357a0.m37544i(16.0f), bVar.f15041a.f15040b + C1357a0.m37544i(4.0f)));
                    } else {
                        return;
                    }
                }
            }
        }

        @Override
        public int mo18528p(int i, View view) {
            AbstractC4576a1 Ue = View$OnClickListenerC3147u9.this.m31346Ue(view);
            int l = Ue != null ? Ue.mo26386l() : 0;
            if (l == 0) {
                return 0;
            }
            if (l != R.id.theme_color_filling) {
                return C5064d.m24130c(C11524j.m228N(R.id.theme_color_filling), C5064d.m24132a(view.getAlpha(), C11524j.m228N(l)));
            }
            return C11524j.m228N(l);
        }

        @Override
        public boolean mo18526r() {
            return true;
        }
    }

    public static class C3149b {
        public final TdApi.WebPage f10549a;
        public TdApi.WebPageInstantView f10550b;
        public String f10551c;

        public C3149b(TdApi.WebPage webPage, TdApi.WebPageInstantView webPageInstantView, String str) {
            this.f10549a = webPage;
            this.f10550b = webPageInstantView;
            this.f10551c = str;
        }
    }

    public View$OnClickListenerC3147u9(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31344We() {
        C1379j0.m37339c0(m9131x9().f10549a.url);
    }

    public void m31343Xe(TdApi.WebPageInstantView webPageInstantView) {
        if (m9347Sa()) {
            return;
        }
        if (!C4779t2.m25389y2(webPageInstantView.version)) {
            C1379j0.m37295y0(R.string.InstantViewUnsupported, 0);
            C1379j0.m37339c0(m31345Ve());
            return;
        }
        m9131x9().f10550b = webPageInstantView;
        m31348Se(true);
    }

    @Override
    public boolean mo18245A(String str) {
        return C5402h.m22841i(this, str);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public View mo8868Ga() {
        return this.f10546o0;
    }

    @Override
    public boolean mo18244H5(String str) {
        return C5402h.m22837m(this, str);
    }

    @Override
    public boolean mo18243I3(String str) {
        return C5402h.m22842h(this, str);
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_forward) {
            String str = m9131x9().f10549a.url;
            x00 x00Var = new x00(this.f30168a, this.f30170b);
            x00.C3281m mVar = new x00.C3281m(str);
            mVar.m30889B(R.string.OpenInExternalApp, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3147u9.this.m31344We();
                }
            });
            if (C1363c0.m37460Q(str)) {
                mVar.m30888C(str);
            }
            x00Var.m30996Vi(mVar);
            x00Var.m30962ej();
        }
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_ivHeader;
    }

    @Override
    public boolean mo18242M(View view, RunnableC5390g gVar, C5455v0 v0Var, String str, boolean z) {
        return C5402h.m22844f(this, view, gVar, v0Var, str, z);
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_ivHeaderIcon;
    }

    @Override
    public boolean mo18241P3(long j) {
        return C5402h.m22838l(this, j);
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_ivHeaderIcon;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_instantView;
    }

    @Override
    public boolean mo18240S6(View view, String str) {
        return m31341Ze(str, true);
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        float f3 = f - (C1399s0.m37157u(this.f10546o0)[0] - C1399s0.m37157u(q1Var.get())[0]);
        float f4 = f2 - (C1399s0.m37157u(this.f10546o0)[1] - C1399s0.m37157u(q1Var.get())[1]);
        View X = this.f10546o0.m39460X(f3, f4);
        if (!(X instanceof RunnableC6868e2)) {
            return super.mo8863S8(q1Var, f3, f4);
        }
        float top = f4 - X.getTop();
        RunnableC6868e2 e2Var = (RunnableC6868e2) X;
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

    public final void m31348Se(boolean z) {
        C3149b x9 = m9131x9();
        TdApi.WebPageInstantView webPageInstantView = x9.f10550b;
        if (!z || webPageInstantView.isFull) {
            ArrayList<AbstractC4576a1> N = AbstractC4576a1.m27291N(this, m31345Ve(), webPageInstantView, null, this, null);
            ArrayList arrayList = new ArrayList(N.size());
            this.f10547p0 = new ArrayList<>();
            Iterator<AbstractC4576a1> it = N.iterator();
            while (it.hasNext()) {
                AbstractC4576a1 next = it.next();
                if (next instanceof C4632f1) {
                    C4632f1 f1Var = (C4632f1) next;
                    if (f1Var.m26705a0(this, m31347Te(), this.f10547p0)) {
                        this.f10547p0.add(f1Var);
                    }
                }
                arrayList.add(new C2964ra(next.mo26320z()).m32873G(next));
            }
            this.f10545n0.m34119x2(arrayList, false);
            this.f10546o0.m39507A0();
            if (!C5070i.m24062i(x9.f10551c)) {
                m31341Ze(x9.f10551c, false);
            }
            if (!z) {
                this.f30170b.m2270r4().m14783o(new TdApi.GetWebPageInstantView(m31345Ve(), true), this);
                return;
            }
            return;
        }
        Log.m14724e("TDLib error: instantView.isFull returned false on the second call", new Object[0]);
    }

    public String m31347Te() {
        return m9131x9().f10549a.displayUrl;
    }

    @Override
    public TdApi.WebPage mo18239U2(String str) {
        return C5402h.m22849a(this, str);
    }

    public final AbstractC4576a1 m31346Ue(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar == null || !(raVar.m32847d() instanceof AbstractC4576a1)) {
            return null;
        }
        return (AbstractC4576a1) raVar.m32847d();
    }

    @Override
    public boolean mo18238V4(String str) {
        return C5402h.m22843g(this, str);
    }

    public String m31345Ve() {
        return m9131x9().f10549a.url;
    }

    @Override
    public AbstractC11531p mo18237W4(View view, RunnableC5390g gVar) {
        return C5402h.m22847c(this, view, gVar);
    }

    @Override
    public int mo418W9() {
        return R.id.menu_iv;
    }

    @Override
    public CharSequence mo9313X9() {
        return m9131x9().f10549a.siteName;
    }

    public final void m31342Ye() {
        this.f10547p0.clear();
        for (C2964ra raVar : this.f10545n0.m34243F0()) {
            AbstractC4576a1 a1Var = (AbstractC4576a1) raVar.m32847d();
            if (a1Var instanceof C4632f1) {
                C4632f1 f1Var = (C4632f1) a1Var;
                if (f1Var.m26705a0(this, m31347Te(), this.f10547p0)) {
                    this.f10547p0.add(f1Var);
                }
            }
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C1399s0.m37165q(this.f10546o0);
        C11541z.m7t().m42S(this);
        mo4347s().m14437t2(this, true);
    }

    public final boolean m31341Ze(String str, boolean z) {
        if (str == null) {
            return false;
        }
        String a = C5070i.m24070a(str);
        if (str.equals(a)) {
            a = null;
        }
        List<C2964ra> F0 = this.f10545n0.m34243F0();
        int i = 0;
        for (C2964ra raVar : F0) {
            Object d = raVar.m32847d();
            if (d instanceof AbstractC4576a1) {
                AbstractC4576a1 a1Var = (AbstractC4576a1) d;
                boolean z2 = str.equals(a1Var.m27282j()) || (a != null && a.equals(a1Var.m27282j()));
                if (z2 && !a1Var.m27296F()) {
                    m31340af(i, a1Var, null, true);
                    return true;
                } else if (a1Var.mo26463D(str)) {
                    m31340af(i, a1Var, str, true);
                    return true;
                } else if (z2 && a1Var.m27296F()) {
                    int i2 = i + 1;
                    if (i2 < F0.size()) {
                        Object d2 = F0.get(i2).m32847d();
                        if (d2 instanceof AbstractC4576a1) {
                            AbstractC4576a1 a1Var2 = (AbstractC4576a1) d2;
                            if (str.equals(a1Var2.m27282j()) && !a1Var2.m27296F()) {
                                m31340af(i2, a1Var2, a1Var.m27282j(), true);
                                return true;
                            }
                        }
                    }
                    m31340af(i, a1Var, null, false);
                    return true;
                }
            }
            i++;
        }
        if (!str.isEmpty() || F0.isEmpty()) {
            return false;
        }
        m31340af(0, null, null, true);
        return true;
    }

    public final void m31340af(int i, AbstractC4576a1 a1Var, String str, boolean z) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f10546o0.getLayoutManager();
        if (linearLayoutManager != null) {
            if (C5070i.m24062i(str)) {
                if (z) {
                    linearLayoutManager.m39525z2(i, 0);
                    return;
                }
                int i2 = i + 1;
                if (i2 < this.f10545n0.mo6153D()) {
                    linearLayoutManager.m39525z2(i2, 0);
                } else {
                    linearLayoutManager.m39525z2(i, this.f30168a.m14567L0(this.f10546o0));
                }
            } else if (a1Var != null) {
                linearLayoutManager.m39525z2(i, -a1Var.mo26442n(str, this.f30168a.m14567L0(this.f10546o0)));
            }
        }
    }

    public void m31339bf() {
        if (this.f30168a.m14551P1().m9736X()) {
            mo417Z8();
            return;
        }
        get();
        this.f30168a.m14551P1().m9718h0(this);
    }

    @Override
    public boolean mo18236f5(String str) {
        return C5402h.m22845e(this, str);
    }

    @Override
    public boolean mo18235g0(View view, String str, boolean z, HandlerC10770jj.C10788q qVar) {
        List<String> pathSegments;
        String Ve = m31345Ve();
        Uri l0 = C1363c0.m37427l0(Ve);
        boolean z2 = false;
        if (l0 != null && this.f30170b.m2598W6(l0.getHost(), false) && (pathSegments = l0.getPathSegments()) != null && pathSegments.size() == 1 && pathSegments.get(0).equals("iv")) {
            String queryParameter = l0.getQueryParameter("url");
            String queryParameter2 = l0.getQueryParameter("rhash");
            if (!C5070i.m24062i(queryParameter) && !C5070i.m24062i(queryParameter2)) {
                str = new Uri.Builder().scheme("https").authority(this.f30170b.m2778Kc()).path("iv").appendQueryParameter("url", str).appendQueryParameter("rhash", queryParameter2).build().toString();
                z2 = true;
            }
        }
        this.f30170b.m2485dd().m3858E7(this, str, new HandlerC10770jj.C10788q(qVar).m3322i().m3319l(Ve).m3321j(z2 ? str : null));
        return true;
    }

    @Override
    public void mo452g2() {
        RecyclerView recyclerView = this.f10546o0;
        if (!(recyclerView == null || recyclerView.getLayoutManager() == null)) {
            int childCount = this.f10546o0.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f10546o0.getChildAt(i);
                if (childAt != null) {
                    childAt.invalidate();
                }
            }
        }
    }

    @Override
    public boolean mo18234i0(View view, String str, String str2, HandlerC10770jj.C10788q qVar) {
        TdApi.RichText G0;
        if (qVar.f34544g == null || (G0 = C7321e.m17006G0(m9131x9().f10550b, str2)) == null) {
            return false;
        }
        qVar.f34544g.m8965b(view, ((C6861d2) view).getBlock().m27298B()).m8958i(this).m8974A(C5459x0.m22613z(this, this, G0, C1410y.m37086A0(13.0f), qVar.f34544g.m8959h(), qVar));
        return true;
    }

    @Override
    public boolean mo18233m2(String str) {
        return C5402h.m22848b(this, str);
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public View mo403oc(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C10192g.m5782i(frameLayout, R.id.theme_color_background, this);
        RecyclerView recyclerView = (RecyclerView) C1399s0.m37149y(mo4347s(), R.layout.recycler, frameLayout);
        this.f10546o0 = recyclerView;
        int i = 1;
        recyclerView.setHasFixedSize(true);
        this.f10546o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        RecyclerView recyclerView2 = this.f10546o0;
        if (!C4183a.f14083a) {
            i = 2;
        }
        recyclerView2.setOverScrollMode(i);
        this.f10546o0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f10546o0.setItemAnimator(null);
        frameLayout.addView(this.f10546o0);
        RecyclerView recyclerView3 = this.f10546o0;
        recyclerView3.m39437g(new C3148a(recyclerView3, this));
        this.f10545n0 = new C2546iq(this);
        m31348Se(false);
        this.f10546o0.setAdapter(this.f10545n0);
        C11052v1.m1768b().m1769a(this);
        C11541z.m7t().m23f(this);
        return frameLayout;
    }

    @Override
    public void onClick(View view) {
        int L0;
        AbstractC4576a1 Ue = m31346Ue(view);
        if (Ue != null && Ue.mo26461H()) {
            int i = 0;
            if (!(Ue.mo26660L(view, false) || !(Ue.m27275y() instanceof TdApi.PageBlockDetails) || (L0 = this.f10545n0.m34231L0(Ue)) == -1)) {
                if (((C4699m1) Ue).m26462D0()) {
                    try {
                        ArrayList<AbstractC4576a1> N = AbstractC4576a1.m27291N(this, m31345Ve(), m9131x9().f10550b, Ue, this, null);
                        C2964ra[] raVarArr = new C2964ra[N.size()];
                        Iterator<AbstractC4576a1> it = N.iterator();
                        while (it.hasNext()) {
                            AbstractC4576a1 next = it.next();
                            raVarArr[i] = new C2964ra(next.mo26320z()).m32873G(next);
                            i++;
                        }
                        this.f10545n0.m34191b1(L0 + 1, raVarArr);
                    } catch (Throwable th) {
                        Log.m14725e("Unsupported instant view block", th, new Object[0]);
                        mo4347s().m14584H3().m8985g(view).m8972C(this.f30170b, R.string.InstantViewError).m8919F();
                        return;
                    }
                } else {
                    int i2 = L0 + 1;
                    for (int i3 = i2; i3 < this.f10545n0.m34243F0().size() && ((AbstractC4576a1) this.f10545n0.m34246E0(i3).m32847d()).m27295G(Ue); i3++) {
                        i++;
                    }
                    this.f10545n0.m34207V1(i2, i);
                }
                m31342Ye();
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        AbstractC4576a1 Ue = m31346Ue(view);
        return Ue != null && Ue.mo26461H() && Ue.mo26660L(view, true);
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_iv) {
            linearLayout.addView(d1Var.m10133A2(R.id.menu_btn_forward, R.drawable.baseline_share_arrow_24, mo9375O9(), this, C1357a0.m37544i(52.0f), C11532q.m113b(), d1Var), C4403w.m27986G2() ? 0 : -1);
        }
    }

    @Override
    public boolean mo6987q7(TdApi.Message message, boolean z, boolean z2, List<TdApi.Message> list, long j) {
        return false;
    }

    @Override
    public C9773p0.C9775b mo6986s5(TdApi.Message message) {
        int i;
        ArrayList arrayList = new ArrayList();
        int constructor = message.content.getConstructor();
        if (constructor == 276722716) {
            i = 7;
        } else if (constructor != 527777781) {
            return null;
        } else {
            i = 8;
        }
        int i2 = -1;
        for (int size = this.f10545n0.m34243F0().size() - 1; size >= 0; size--) {
            AbstractC4576a1 a1Var = (AbstractC4576a1) this.f10545n0.m34243F0().get(size).m32847d();
            C4756s Y = a1Var instanceof C4599c1 ? ((C4599c1) a1Var).m27067Y() : null;
            if (Y != null && Y.m26331v() == i) {
                TdApi.Message a0 = Y.m26267a0();
                if (a0 == message) {
                    if (i2 == -1) {
                        i2 = arrayList.size();
                    } else {
                        throw new IllegalStateException();
                    }
                }
                arrayList.add(a0);
            }
        }
        if (i2 != -1) {
            return new C9773p0.C9775b(arrayList, i2).m6992q(Log.TAG_ROUND).m6990s(true, true);
        }
        throw new IllegalArgumentException();
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor != 778202453) {
            Log.unexpectedTdlibResponse(object, TdApi.GetWebPageInstantView.class, TdApi.WebPageInstantView.class);
        } else {
            final TdApi.WebPageInstantView webPageInstantView = (TdApi.WebPageInstantView) object;
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3147u9.this.m31343Xe(webPageInstantView);
                }
            });
        }
    }
}
