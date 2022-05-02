package sc;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1405v;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.List;
import me.C6847b2;
import me.C6879f3;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.C2139ap;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5123k;
import p139jb.AbstractC5919k;
import p139jb.AbstractRunnableC5910b;
import p141jd.C5996x0;
import p193nb.C7316a;
import p335xd.C10189d;
import p364zd.C11524j;
import sc.C8728c2;
import sc.View$OnClickListenerC8785j2;
import td.AbstractC9142a;
import td.AbstractC9201h1;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC8723c1 extends AbstractC8809o<Void> implements View.OnClickListener, View$OnClickListenerC8785j2.AbstractC8791f, C8728c2.AbstractC8730b, AbstractC9142a, AbstractC9201h1, C3950k.AbstractC3952b {
    public C2546iq f28099I0;
    public FrameLayoutFix f28100J0;
    public View$OnClickListenerC8785j2 f28101K0;
    public C8799l2 f28102L0;
    public TextView f28103M0;
    public TextView f28104N0;
    public C2964ra f28105O0;
    public C2964ra f28106P0;
    public int f28107Q0;
    public boolean f28108R0;
    public Location f28109S0;
    public Location f28110T0;
    public AbstractC5123k f28111U0;
    public boolean f28113W0;
    public Location f28114X0;
    public boolean f28115Y0;
    public List<C8862z1> f28116Z0;
    public boolean f28117a1;
    public List<C8862z1> f28118b1;
    public boolean f28119c1;
    public C8862z1 f28120d1;
    public C3950k f28121e1;
    public int f28122f1;
    public int f28123g1;
    public int f28124h1;
    public boolean f28125i1;
    public AbstractRunnableC5910b f28127k1;
    public AbstractC5123k f28128l1;
    public boolean f28129m1;
    public C3940f f28112V0 = new C3940f(1, this, C2057b.f7280b, 180);
    public String f28126j1 = "";

    public class C8724a extends FrameLayoutFix {
        public C8724a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return motionEvent.getAction() == 0 || super.onTouchEvent(motionEvent);
        }
    }

    public class C8725b extends C2546iq {
        public C8725b(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo11659G2(C2964ra raVar, int i, C8795k2 k2Var, boolean z) {
            int j = raVar.m32838j();
            if (j == R.id.btn_shareLiveLocation) {
                k2Var.setDefaultLiveLocation(true);
                k2Var.m11341G1(View$OnClickListenerC8723c1.this.f28108R0, z);
                k2Var.setEnabled(!View$OnClickListenerC8723c1.this.f28108R0);
            } else if (j == R.id.place) {
                boolean z2 = false;
                k2Var.m11341G1(false, false);
                C8862z1 z1Var = (C8862z1) raVar.m32847d();
                if (View$OnClickListenerC8723c1.this.f28120d1 != null && View$OnClickListenerC8723c1.this.f28120d1.equals(z1Var)) {
                    z2 = true;
                }
                if (z) {
                    k2Var.m11342F1(z2, true);
                } else {
                    k2Var.m11338L1(z1Var, z2);
                }
            }
        }
    }

    public class C8726c extends AbstractRunnableC5910b {
        public final String f28132M;

        public C8726c(String str) {
            this.f28132M = str;
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC8723c1.this.f28126j1.equals(this.f28132M) && View$OnClickListenerC8723c1.this.f28117a1) {
                View$OnClickListenerC8723c1.this.m11680Hg(this.f28132M);
            }
        }
    }

    public class C8727d implements C8728c2.AbstractC8730b {
        public final String f28134a;

        public C8727d(String str) {
            this.f28134a = str;
        }

        @Override
        public void mo11651M1(AbstractC5123k kVar, Location location, long j, List<C8862z1> list, String str) {
            if (View$OnClickListenerC8723c1.this.f28126j1.equals(this.f28134a) && View$OnClickListenerC8723c1.this.f28117a1) {
                View$OnClickListenerC8723c1.this.m11670Rg(list);
            }
        }

        @Override
        public void mo11650Z1(AbstractC5123k kVar, Location location, TdApi.Error error) {
            if (View$OnClickListenerC8723c1.this.f28126j1.equals(this.f28134a) && View$OnClickListenerC8723c1.this.f28117a1) {
                View$OnClickListenerC8723c1.this.m11670Rg(null);
            }
        }
    }

    public View$OnClickListenerC8723c1(View$OnClickListenerC8851y1 y1Var) {
        super(y1Var, (int) R.string.Location);
    }

    public void m11684Dg(int i, Location location) {
        if (!m9347Sa()) {
            this.f28108R0 = false;
            this.f28099I0.m34133s3(R.id.btn_shareLiveLocation);
            if (i == -5) {
                return;
            }
            if (i == -2) {
                AbstractC9323v4<?> F = this.f30168a.m14551P1().m9762F();
                if (F != null) {
                    F.m9330Uc(true);
                }
            } else if (i == -1) {
                C1405v.m37143C();
            } else if (i != 0) {
                C1379j0.m37295y0(R.string.DetectLocationError, 0);
            } else {
                if (location != null) {
                    if (this.f28114X0 == null) {
                        this.f28114X0 = C7389v0.m16655a2();
                    }
                    this.f28114X0.set(location);
                }
                m11681Gg();
            }
        }
    }

    public void m11683Eg(int i) {
        this.f28443n0.m11124m3(this.f28114X0.getLatitude(), this.f28114X0.getLongitude(), this.f28114X0.getAccuracy(), C7389v0.m16757A0(this.f28114X0), i);
    }

    public final int m11687Ag() {
        return View$OnClickListenerC8785j2.m11354r2(this.f28443n0.m11105x2()) + C2139ap.m35482W(82);
    }

    public final boolean m11686Bg() {
        List<C8862z1> list = this.f28116Z0;
        return list != null && !list.isEmpty();
    }

    @Override
    public void mo420Cc(String str) {
        m11678Jg(str.trim().toLowerCase());
    }

    public final void m11685Cg() {
        m11674Ng(true);
    }

    public void m11682Fg() {
        this.f28101K0.m11405F2();
    }

    public final void m11681Gg() {
        if (this.f28114X0 != null) {
            m9351Rc(this.f28443n0.getTargetChatId(), new AbstractC5919k() {
                @Override
                public final void mo3250a(int i) {
                    View$OnClickListenerC8723c1.this.m11683Eg(i);
                }
            });
        }
    }

    public final void m11680Hg(String str) {
        this.f28128l1 = C8728c2.m11658a(this.f30170b, this.f28443n0.getTargetChatId(), this.f28110T0, str, new C8727d(str));
    }

    public final void m11679Ig(Location location, boolean z) {
        AbstractC5123k kVar = this.f28111U0;
        if (kVar != null) {
            kVar.m23883a();
            this.f28111U0 = null;
        }
        if (z) {
            m11673Og(null, this.f28119c1);
            m11672Pg(0);
            return;
        }
        m11672Pg(R.string.LoadingPlaces);
        this.f28110T0 = location;
        this.f28111U0 = C8728c2.m11658a(this.f30170b, this.f28443n0.getTargetChatId(), location, null, this);
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i == R.id.menu_btn_search && this.f28115Y0 && this.f28109S0 != null) {
            this.f28443n0.getHeaderView().m10018z3();
            this.f30159R = this.f28443n0.getHeaderView();
            m11685Cg();
        }
    }

    public final void m11678Jg(String str) {
        if (!this.f28126j1.equals(str)) {
            this.f28126j1 = str;
            AbstractRunnableC5910b bVar = this.f28127k1;
            if (bVar != null) {
                bVar.m21858c();
            }
            AbstractC5123k kVar = this.f28128l1;
            if (kVar != null) {
                kVar.m23883a();
                this.f28128l1 = null;
            }
            if (!str.isEmpty()) {
                m11672Pg(R.string.LoadingPlaces);
                C8726c cVar = new C8726c(str);
                this.f28127k1 = cVar;
                C1379j0.m37335e0(cVar, 350L);
            } else if (this.f28129m1) {
                m11677Kg(null, true);
                ((LinearLayoutManager) m11273uf()).m39525z2(0, 0);
                this.f28101K0.m11360l2(true, true);
                m11668Tg();
            }
        }
    }

    public final void m11677Kg(C8862z1 z1Var, boolean z) {
        C8862z1 z1Var2 = this.f28120d1;
        if (z1Var2 == null || !z1Var2.equals(z1Var) || !z) {
            C8862z1 z1Var3 = this.f28120d1;
            this.f28120d1 = z1Var;
            if (z) {
                if (z1Var != null) {
                    this.f28099I0.m34136r3(z1Var);
                }
                if (z1Var3 != null) {
                    this.f28099I0.m34136r3(z1Var3);
                }
            }
            if (z1Var != null) {
                this.f28103M0.setText(z1Var.m11082f());
                this.f28102L0.setIsPlace(true);
                m11675Mg(z1Var.m11086b());
                this.f28101K0.m11371Y2(z1Var.m11084d(), z1Var.m11083e());
            }
        }
    }

    public final void m11676Lg(boolean z) {
        C2964ra raVar = this.f28099I0.m34243F0().get(0);
        int i = z ? C1357a0.m37544i(4.0f) : this.f28107Q0;
        if (raVar.m32840h() != i) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) m11273uf();
            int X1 = linearLayoutManager.m39552X1();
            View C = linearLayoutManager.mo39265C(X1);
            int top = C != null ? C.getTop() : 0;
            raVar.m32870J(i);
            this.f28099I0.m39315I(0);
            if (X1 != -1) {
                linearLayoutManager.m39525z2(X1, top);
            }
        }
    }

    @Override
    public void mo11651M1(AbstractC5123k kVar, Location location, long j, List<C8862z1> list, String str) {
        Location location2;
        if (this.f28111U0 == kVar) {
            this.f28111U0 = null;
        }
        if (!m9347Sa() && (location2 = this.f28110T0) != null && location2 == location && location2.getLongitude() == location.getLongitude() && this.f28110T0.getLatitude() == location.getLatitude()) {
            this.f28116Z0 = list;
            if (!this.f28117a1) {
                m11668Tg();
            }
            List<C8862z1> list2 = this.f28116Z0;
            m11672Pg((list2 == null || list2.isEmpty()) ? R.string.NoPlacesFound : this.f28129m1 ? R.string.FoundPlaces : R.string.NearbyPlaces);
            this.f28115Y0 = true;
        }
    }

    public final void m11675Mg(String str) {
        this.f28112V0.m29577p(!C5070i.m24062i(str), true);
        if (!C5070i.m24062i(str)) {
            this.f28104N0.setText(str);
        }
    }

    public final void m11674Ng(boolean z) {
        if (this.f28117a1 != z) {
            this.f28117a1 = z;
        }
    }

    public void m11673Og(List<C8862z1> list, boolean z) {
        List<C8862z1> list2 = this.f28118b1;
        boolean z2 = this.f28119c1;
        int size = (list2 == null || list2.isEmpty()) ? 0 : list2.size();
        int size2 = (list == null || list.isEmpty()) ? 0 : list.size();
        this.f28118b1 = list;
        this.f28119c1 = z;
        if (!(size == 0 && size2 == 0)) {
            C2964ra raVar = this.f28106P0;
            if (raVar != null) {
                if (!z2 && z) {
                    this.f28099I0.m34147o1(R.id.btn_shareLiveLocation);
                } else if (z2 && !z) {
                    this.f28099I0.m34132t0(1, raVar);
                }
            }
            int i = (z || this.f28106P0 == null) ? 2 : 3;
            if (size2 == 0) {
                this.f28099I0.m34207V1(i, size);
                if (z) {
                    m11672Pg(R.string.NoPlacesFound);
                }
                m11677Kg(null, true);
                return;
            }
            m11672Pg(z ? R.string.FoundPlaces : R.string.NearbyPlaces);
            int i2 = i + size;
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                this.f28099I0.m34243F0().remove(i3);
            }
            for (C8862z1 z1Var : list) {
                this.f28099I0.m34243F0().add(new C2964ra(82, R.id.place).m32873G(z1Var));
            }
            if (z) {
                m11677Kg(list.get(0), false);
            }
            if (size == 0) {
                this.f28099I0.m39311M(i, size2);
            } else {
                this.f28099I0.m39312L(i, Math.min(size, size2));
                if (size < size2) {
                    this.f28099I0.m39311M(i2, size2 - size);
                } else if (size > size2) {
                    this.f28099I0.m39310N(i + size2, size - size2);
                }
            }
            ((LinearLayoutManager) m11273uf()).m39525z2(0, 0);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        int i2;
        if (i != 0) {
            if (i == 1) {
                float i3 = C1357a0.m37544i(10.0f);
                this.f28103M0.setTranslationY((-i3) * f);
                this.f28104N0.setTranslationY(i3 * (1.0f - f));
                this.f28104N0.setAlpha(f);
            }
        } else if (this.f28125i1) {
            this.f28100J0.setTranslationY(-i2);
            int i4 = ((int) (this.f28122f1 * (1.0f - f))) - this.f28124h1;
            this.f28453x0.scrollBy(0, i4 - this.f28123g1);
            this.f28123g1 = i4;
        } else {
            this.f28100J0.setAlpha(f);
        }
    }

    public final void m11672Pg(int i) {
        m11671Qg(i != 0 ? C4403w.m27871i1(i) : "");
    }

    public final void m11671Qg(CharSequence charSequence) {
        int N0 = this.f28099I0.m34227N0(R.id.btn_places);
        if (N0 != -1 && this.f28099I0.m34243F0().get(N0).m32854Z(charSequence)) {
            this.f28099I0.m39315I(N0);
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_location;
    }

    public final void m11670Rg(List<C8862z1> list) {
        this.f28129m1 = true;
        m11673Og(list, true);
    }

    @Override
    public void mo11347S5() {
        m11677Kg(null, true);
    }

    public final void m11669Sg() {
        m11674Ng(false);
    }

    public final void m11668Tg() {
        this.f28129m1 = false;
        m11673Og(this.f28116Z0, false);
    }

    @Override
    public int mo418W9() {
        if (this.f28443n0.m11105x2()) {
            return 0;
        }
        return R.id.menu_search;
    }

    @Override
    public void mo11228Xf(boolean z) {
        super.mo11228Xf(z);
        View$OnClickListenerC8785j2 j2Var = this.f28101K0;
        if (j2Var != null) {
            j2Var.m11360l2(true, false);
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0) {
            if (f == 0.0f) {
                this.f28100J0.setVisibility(8);
                this.f28101K0.m11398K2();
                m11676Lg(true);
            } else if (f == 1.0f && this.f28119c1) {
                m11668Tg();
            }
        }
    }

    @Override
    public void mo11650Z1(AbstractC5123k kVar, Location location, TdApi.Error error) {
        Location location2;
        if (this.f28111U0 == kVar) {
            this.f28111U0 = null;
        }
        if (!m9347Sa() && (location2 = this.f28110T0) != null && location2 == location && location2.getLongitude() == location.getLongitude() && this.f28110T0.getLatitude() == location.getLatitude()) {
            this.f28116Z0 = null;
            if (!this.f28117a1) {
                m11668Tg();
            }
            if (error == null) {
                m11672Pg(R.string.PlaceSearchError);
                return;
            }
            m11671Qg(C4403w.m27871i1(R.string.PlaceSearchError) + ": " + C4779t2.m25379z5(error));
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f28101K0.m11407E2();
    }

    @Override
    public void mo11303Zf() {
        this.f28113W0 = true;
        Location location = this.f28109S0;
        if (location != null) {
            m11679Ig(location, false);
        }
    }

    @Override
    public boolean mo406cf() {
        return !this.f28443n0.m11105x2();
    }

    @Override
    public void mo11298cg(float f) {
        super.mo11298cg(f);
        this.f28100J0.setTranslationY(f);
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        this.f28101K0.m11398K2();
    }

    @Override
    public boolean mo404jc(boolean z) {
        C3950k kVar = this.f28121e1;
        return (kVar != null && kVar.m29533v()) || super.mo404jc(z);
    }

    @Override
    public int mo9224ka() {
        return R.string.SearchForPlaces;
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        this.f28101K0.m11393M2();
    }

    @Override
    public View mo403oc(Context context) {
        int r2 = View$OnClickListenerC8785j2.m11354r2(this.f28443n0.m11105x2());
        int W = C2139ap.m35482W(82);
        int i = C1357a0.m37544i(4.0f);
        int i2 = r2 + W + i;
        this.f28107Q0 = i2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, C6879f3.m18693p() + i2, 48);
        t1.topMargin = View$OnClickListenerC9170d1.m10065c3(false);
        C8724a aVar = new C8724a(context);
        this.f28100J0 = aVar;
        aVar.setLayoutParams(t1);
        m11300bf(false);
        this.f28453x0.setItemAnimator(new C8731d(C2057b.f7280b, 160L));
        RecyclerView.AbstractC0902p linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f28099I0 = new C8725b(this);
        ArrayList arrayList = new ArrayList();
        C2964ra J = new C2964ra(35).m32870J(i2);
        this.f28105O0 = J;
        arrayList.add(J);
        if (!this.f28443n0.m11105x2() && !C7316a.m17051j(this.f28443n0.getTargetChatId()) && !this.f28443n0.m11145a2()) {
            C2964ra raVar = new C2964ra(82, R.id.btn_shareLiveLocation);
            this.f28106P0 = raVar;
            arrayList.add(raVar);
        }
        arrayList.add(new C2964ra(8, R.id.btn_places, 0, R.string.PullToSeePlaces).m32846d0(R.id.theme_color_textLight));
        this.f28099I0.m34119x2(arrayList, false);
        m11288jg(linearLayoutManager);
        m11292hg(this.f28099I0);
        int i3 = C1357a0.m37544i(12.0f);
        int i4 = C1357a0.m37544i(20.0f) + (C1357a0.m37544i(20.0f) * 2) + i3;
        FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(i4, W, 51);
        int i5 = r2 + i;
        t12.topMargin = i5;
        C8799l2 l2Var = new C8799l2(context);
        this.f28102L0 = l2Var;
        l2Var.setPadding(C1357a0.m37544i(20.0f), 0, i3, 0);
        this.f28102L0.setLayoutParams(t12);
        C1399s0.m37196a0(this.f28102L0);
        View$OnClickListenerC8785j2 j2Var = new View$OnClickListenerC8785j2(context);
        this.f28101K0 = j2Var;
        j2Var.m11353t2(this, this.f28102L0, this.f28443n0.m11105x2());
        this.f28101K0.setCallback(this);
        this.f28100J0.addView(this.f28101K0);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, i + W);
        s1.topMargin = r2;
        View view = new View(context);
        view.setId(R.id.btn_send);
        C10189d.m5796h(view, this);
        view.setLayoutParams(s1);
        view.setOnClickListener(this);
        C1399s0.m37196a0(view);
        this.f28100J0.addView(view);
        this.f28100J0.addView(this.f28102L0);
        FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(-1, W, 51);
        t13.topMargin = i5;
        t13.leftMargin = i4;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setPadding(C1357a0.m37544i(80.0f) - i4, 0, 0, 0);
        frameLayoutFix.setLayoutParams(t13);
        FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(-1, -2, 16);
        t14.rightMargin = C1357a0.m37544i(12.0f);
        C6847b2 b2Var = new C6847b2(context);
        this.f28103M0 = b2Var;
        b2Var.setTypeface(C1389o.m37263i());
        this.f28103M0.setTextSize(1, 16.0f);
        this.f28103M0.setTextColor(C11524j.m217S0());
        m9126y8(this.f28103M0);
        this.f28103M0.setSingleLine(true);
        this.f28103M0.setGravity(16);
        this.f28103M0.setEllipsize(TextUtils.TruncateAt.END);
        this.f28103M0.setText(C4403w.m27871i1(R.string.Locating));
        this.f28103M0.setLayoutParams(t14);
        frameLayoutFix.addView(this.f28103M0);
        FrameLayout.LayoutParams t15 = FrameLayoutFix.m18007t1(-1, -2, 16);
        t15.topMargin = C1357a0.m37544i(10.0f);
        t15.rightMargin = C1357a0.m37544i(12.0f);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f28104N0 = b2Var2;
        b2Var2.setTextSize(1, 13.0f);
        this.f28104N0.setTextColor(C11524j.m213U0());
        m9480A8(Integer.valueOf((int) R.id.theme_color_textLight));
        this.f28104N0.setTypeface(C1389o.m37261k());
        this.f28104N0.setEllipsize(TextUtils.TruncateAt.END);
        this.f28104N0.setSingleLine(true);
        this.f28104N0.setLayoutParams(t15);
        this.f28104N0.setAlpha(0.0f);
        frameLayoutFix.addView(this.f28104N0);
        this.f28100J0.addView(frameLayoutFix);
        FrameLayout.LayoutParams t16 = FrameLayoutFix.m18007t1(-1, C6879f3.m18693p(), 48);
        t16.topMargin = i2;
        C6879f3 f3Var = new C6879f3(context);
        f3Var.setSimpleBottomTransparentShadow(true);
        f3Var.setLayoutParams(t16);
        f3Var.setAlpha(0.0f);
        m9163t8(f3Var);
        this.f28100J0.addView(f3Var);
        this.f28099I0.m34135s0(this.f28453x0, f3Var, C1357a0.m37544i(10.0f));
        this.f28451v0.addView(this.f28100J0);
        return this.f28451v0;
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_send) {
            C8862z1 z1Var = this.f28120d1;
            if (z1Var != null) {
                this.f28443n0.m11118p3(z1Var);
                return;
            }
            Location currentLocation = this.f28101K0.getCurrentLocation();
            if (currentLocation != null) {
                this.f28443n0.m11124m3(currentLocation.getLatitude(), currentLocation.getLongitude(), currentLocation.getAccuracy(), C7389v0.m16757A0(currentLocation), 0);
            }
        } else if (id2 != R.id.btn_shareLiveLocation) {
            if (id2 == R.id.place) {
                m11677Kg((C8862z1) ((C2964ra) view.getTag()).m32847d(), true);
            }
        } else if (!this.f28108R0) {
            this.f28108R0 = true;
            this.f28099I0.m34133s3(R.id.btn_shareLiveLocation);
            C5996x0.m21581y(this.f30168a, 15000L, true, true, new C5996x0.AbstractC6002f() {
                @Override
                public final void mo11688a(int i, Location location) {
                    View$OnClickListenerC8723c1.this.m11684Dg(i, location);
                }
            });
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10090S1(linearLayout, this);
        } else if (i == R.id.menu_search) {
            d1Var.m10053i2(linearLayout, this);
        }
    }

    @Override
    public int mo11267pf() {
        return TdApi.ChatActionChoosingLocation.CONSTRUCTOR;
    }

    @Override
    public void mo11346s1(Location location, boolean z, boolean z2, boolean z3, boolean z4) {
        Location location2;
        if (z2) {
            this.f28102L0.setShowProgress(false);
            if (!z) {
                this.f28114X0 = location;
            }
        }
        this.f28102L0.setIsCustom(z);
        if (!z) {
            this.f28103M0.setText(C4403w.m27871i1(R.string.SendCurrentLocation));
            this.f28102L0.setIsPlace(false);
            m11675Mg(location.getAccuracy() > 0.0f ? C4403w.m27846o2(R.string.AccurateToMeters, (int) location.getAccuracy()) : null);
        } else if (this.f28120d1 == null) {
            this.f28103M0.setText(C4403w.m27871i1(R.string.SendCurrentLocation));
            this.f28102L0.setIsPlace(false);
            m11675Mg(C5069h.m24079o(location.getLatitude()) + ", " + C5069h.m24079o(location.getLongitude()));
        }
        this.f28109S0 = location;
        if (this.f28443n0.m11105x2()) {
            this.f28110T0 = this.f28109S0;
        } else if (!this.f28113W0) {
        } else {
            if ((!z3 && ((location2 = this.f28110T0) == null || location2.distanceTo(location) >= 200.0f)) || !m11686Bg()) {
                m11679Ig(location, z4);
            }
        }
    }

    @Override
    public void mo10181t(int i, int i2, Intent intent) {
        if (i == 103) {
            this.f28101K0.m11396L2(i2 == -1);
        }
    }

    @Override
    public int mo401tf() {
        return m11687Ag() + ((this.f28443n0.m11105x2() || C7316a.m17051j(this.f28443n0.getTargetChatId()) || this.f28443n0.m11145a2()) ? 0 : C2139ap.m35482W(82)) + C2139ap.m35482W(8) + C1357a0.m37544i(10.0f);
    }

    @Override
    public void mo409xc() {
        this.f28126j1 = "";
        m11669Sg();
    }
}
