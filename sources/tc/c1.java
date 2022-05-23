package tc;

import ae.j;
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
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import ce.v;
import de.ap;
import de.iq;
import de.ra;
import eb.f;
import eb.k;
import gd.w;
import hd.t2;
import ib.h;
import ib.i;
import java.util.ArrayList;
import java.util.List;
import kd.x0;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.f3;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import tc.c2;
import tc.j2;
import ud.d1;
import ud.h1;
import ud.v4;

public class c1 extends o<Void> implements View.OnClickListener, j2.f, c2.b, ud.a, h1, k.b {
    public iq I0;
    public FrameLayoutFix J0;
    public j2 K0;
    public l2 L0;
    public TextView M0;
    public TextView N0;
    public ra O0;
    public ra P0;
    public int Q0;
    public boolean R0;
    public Location S0;
    public Location T0;
    public ie.k U0;
    public boolean W0;
    public Location X0;
    public boolean Y0;
    public List<z1> Z0;
    public boolean f23052a1;
    public List<z1> f23053b1;
    public boolean f23054c1;
    public z1 f23055d1;
    public k f23056e1;
    public int f23057f1;
    public int f23058g1;
    public int f23059h1;
    public boolean f23060i1;
    public kb.b f23062k1;
    public ie.k f23063l1;
    public boolean f23064m1;
    public f V0 = new f(1, this, db.b.f7287b, 180);
    public String f23061j1 = "";

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return motionEvent.getAction() == 0 || super.onTouchEvent(motionEvent);
        }
    }

    public class b extends iq {
        public b(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void C2(ra raVar, int i10, k2 k2Var, boolean z10) {
            int j10 = raVar.j();
            if (j10 == R.id.btn_shareLiveLocation) {
                k2Var.setDefaultLiveLocation(true);
                k2Var.D1(c1.this.R0, z10);
                k2Var.setEnabled(!c1.this.R0);
            } else if (j10 == R.id.place) {
                boolean z11 = false;
                k2Var.D1(false, false);
                z1 z1Var = (z1) raVar.d();
                if (c1.this.f23055d1 != null && c1.this.f23055d1.equals(z1Var)) {
                    z11 = true;
                }
                if (z10) {
                    k2Var.C1(z11, true);
                } else {
                    k2Var.H1(z1Var, z11);
                }
            }
        }
    }

    public class c extends kb.b {
        public final String M;

        public c(String str) {
            this.M = str;
        }

        @Override
        public void b() {
            if (c1.this.f23061j1.equals(this.M) && c1.this.f23052a1) {
                c1.this.Hg(this.M);
            }
        }
    }

    public class d implements c2.b {
        public final String f23066a;

        public d(String str) {
            this.f23066a = str;
        }

        @Override
        public void h4(ie.k kVar, Location location, long j10, List<z1> list, String str) {
            if (c1.this.f23061j1.equals(this.f23066a) && c1.this.f23052a1) {
                c1.this.Rg(list);
            }
        }

        @Override
        public void t3(ie.k kVar, Location location, TdApi.Error error) {
            if (c1.this.f23061j1.equals(this.f23066a) && c1.this.f23052a1) {
                c1.this.Rg(null);
            }
        }
    }

    public c1(y1 y1Var) {
        super(y1Var, (int) R.string.Location);
    }

    public void Dg(int i10, Location location) {
        if (!Sa()) {
            this.R0 = false;
            this.I0.p3(R.id.btn_shareLiveLocation);
            if (i10 == -5) {
                return;
            }
            if (i10 == -2) {
                v4<?> F = this.f24493a.Q1().F();
                if (F != null) {
                    F.Uc(true);
                }
            } else if (i10 == -1) {
                v.C();
            } else if (i10 != 0) {
                j0.y0(R.string.DetectLocationError, 0);
            } else {
                if (location != null) {
                    if (this.X0 == null) {
                        this.X0 = v0.a2();
                    }
                    this.X0.set(location);
                }
                Gg();
            }
        }
    }

    public void Eg(int i10) {
        this.f23267n0.n3(this.X0.getLatitude(), this.X0.getLongitude(), this.X0.getAccuracy(), v0.A0(this.X0), i10);
    }

    public final int Ag() {
        return j2.m2(this.f23267n0.s2()) + ap.W(82);
    }

    public final boolean Bg() {
        List<z1> list = this.Z0;
        return list != null && !list.isEmpty();
    }

    @Override
    public void Cc(String str) {
        Jg(str.trim().toLowerCase());
    }

    public final void Cg() {
        Ng(true);
    }

    public void Fg() {
        this.K0.B2();
    }

    public final void Gg() {
        if (this.X0 != null) {
            Rc(this.f23267n0.getTargetChatId(), new kb.k() {
                @Override
                public final void a(int i10) {
                    c1.this.Eg(i10);
                }
            });
        }
    }

    public final void Hg(String str) {
        this.f23063l1 = c2.a(this.f24495b, this.f23267n0.getTargetChatId(), this.T0, str, new d(str));
    }

    public final void Ig(Location location, boolean z10) {
        ie.k kVar = this.U0;
        if (kVar != null) {
            kVar.a();
            this.U0 = null;
        }
        if (z10) {
            Og(null, this.f23054c1);
            Pg(0);
            return;
        }
        Pg(R.string.LoadingPlaces);
        this.T0 = location;
        this.U0 = c2.a(this.f24495b, this.f23267n0.getTargetChatId(), location, null, this);
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 == R.id.menu_btn_search && this.Y0 && this.S0 != null) {
            this.f23267n0.getHeaderView().C3();
            this.R = this.f23267n0.getHeaderView();
            Cg();
        }
    }

    public final void Jg(String str) {
        if (!this.f23061j1.equals(str)) {
            this.f23061j1 = str;
            kb.b bVar = this.f23062k1;
            if (bVar != null) {
                bVar.c();
            }
            ie.k kVar = this.f23063l1;
            if (kVar != null) {
                kVar.a();
                this.f23063l1 = null;
            }
            if (!str.isEmpty()) {
                Pg(R.string.LoadingPlaces);
                c cVar = new c(str);
                this.f23062k1 = cVar;
                j0.e0(cVar, 350L);
            } else if (this.f23064m1) {
                Kg(null, true);
                ((LinearLayoutManager) uf()).z2(0, 0);
                this.K0.i2(true, true);
                Tg();
            }
        }
    }

    public final void Kg(z1 z1Var, boolean z10) {
        z1 z1Var2 = this.f23055d1;
        if (z1Var2 == null || !z1Var2.equals(z1Var) || !z10) {
            z1 z1Var3 = this.f23055d1;
            this.f23055d1 = z1Var;
            if (z10) {
                if (z1Var != null) {
                    this.I0.o3(z1Var);
                }
                if (z1Var3 != null) {
                    this.I0.o3(z1Var3);
                }
            }
            if (z1Var != null) {
                this.M0.setText(z1Var.f());
                this.L0.setIsPlace(true);
                Mg(z1Var.b());
                this.K0.X2(z1Var.d(), z1Var.e());
            }
        }
    }

    public final void Lg(boolean z10) {
        ra raVar = this.I0.D0().get(0);
        int i10 = z10 ? a0.i(4.0f) : this.Q0;
        if (raVar.h() != i10) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) uf();
            int X1 = linearLayoutManager.X1();
            View C = linearLayoutManager.C(X1);
            int top = C != null ? C.getTop() : 0;
            raVar.J(i10);
            this.I0.I(0);
            if (X1 != -1) {
                linearLayoutManager.z2(X1, top);
            }
        }
    }

    public final void Mg(String str) {
        this.V0.p(!i.i(str), true);
        if (!i.i(str)) {
            this.N0.setText(str);
        }
    }

    public final void Ng(boolean z10) {
        if (this.f23052a1 != z10) {
            this.f23052a1 = z10;
        }
    }

    public void Og(List<z1> list, boolean z10) {
        List<z1> list2 = this.f23053b1;
        boolean z11 = this.f23054c1;
        int size = (list2 == null || list2.isEmpty()) ? 0 : list2.size();
        int size2 = (list == null || list.isEmpty()) ? 0 : list.size();
        this.f23053b1 = list;
        this.f23054c1 = z10;
        if (!(size == 0 && size2 == 0)) {
            ra raVar = this.P0;
            if (raVar != null) {
                if (!z11 && z10) {
                    this.I0.k1(R.id.btn_shareLiveLocation);
                } else if (z11 && !z10) {
                    this.I0.s0(1, raVar);
                }
            }
            int i10 = (z10 || this.P0 == null) ? 2 : 3;
            if (size2 == 0) {
                this.I0.R1(i10, size);
                if (z10) {
                    Pg(R.string.NoPlacesFound);
                }
                Kg(null, true);
                return;
            }
            Pg(z10 ? R.string.FoundPlaces : R.string.NearbyPlaces);
            int i11 = i10 + size;
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                this.I0.D0().remove(i12);
            }
            for (z1 z1Var : list) {
                this.I0.D0().add(new ra(82, R.id.place).G(z1Var));
            }
            if (z10) {
                Kg(list.get(0), false);
            }
            if (size == 0) {
                this.I0.M(i10, size2);
            } else {
                this.I0.L(i10, Math.min(size, size2));
                if (size < size2) {
                    this.I0.M(i11, size2 - size);
                } else if (size > size2) {
                    this.I0.N(i10 + size2, size - size2);
                }
            }
            ((LinearLayoutManager) uf()).z2(0, 0);
        }
    }

    @Override
    public void P5() {
        Kg(null, true);
    }

    public final void Pg(int i10) {
        Qg(i10 != 0 ? w.i1(i10) : "");
    }

    public final void Qg(CharSequence charSequence) {
        int L0 = this.I0.L0(R.id.btn_places);
        if (L0 != -1 && this.I0.D0().get(L0).Z(charSequence)) {
            this.I0.I(L0);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_media_location;
    }

    public final void Rg(List<z1> list) {
        this.f23064m1 = true;
        Og(list, true);
    }

    public final void Sg() {
        Ng(false);
    }

    public final void Tg() {
        this.f23064m1 = false;
        Og(this.Z0, false);
    }

    @Override
    public int W9() {
        if (this.f23267n0.s2()) {
            return 0;
        }
        return R.id.menu_search;
    }

    @Override
    public void Xf(boolean z10) {
        super.Xf(z10);
        j2 j2Var = this.K0;
        if (j2Var != null) {
            j2Var.i2(true, false);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        this.K0.A2();
    }

    @Override
    public void Zf() {
        this.W0 = true;
        Location location = this.S0;
        if (location != null) {
            Ig(location, false);
        }
    }

    @Override
    public void c6() {
        super.c6();
        this.K0.F2();
    }

    @Override
    public boolean cf() {
        return !this.f23267n0.s2();
    }

    @Override
    public void cg(float f10) {
        super.cg(f10);
        this.J0.setTranslationY(f10);
    }

    @Override
    public void h4(ie.k kVar, Location location, long j10, List<z1> list, String str) {
        Location location2;
        if (this.U0 == kVar) {
            this.U0 = null;
        }
        if (!Sa() && (location2 = this.T0) != null && location2 == location && location2.getLongitude() == location.getLongitude() && this.T0.getLatitude() == location.getLatitude()) {
            this.Z0 = list;
            if (!this.f23052a1) {
                Tg();
            }
            List<z1> list2 = this.Z0;
            Pg((list2 == null || list2.isEmpty()) ? R.string.NoPlacesFound : this.f23064m1 ? R.string.FoundPlaces : R.string.NearbyPlaces);
            this.Y0 = true;
        }
    }

    @Override
    public boolean jc(boolean z10) {
        k kVar = this.f23056e1;
        return (kVar != null && kVar.v()) || super.jc(z10);
    }

    @Override
    public int ka() {
        return R.string.SearchForPlaces;
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        int i11;
        if (i10 != 0) {
            if (i10 == 1) {
                float i12 = a0.i(10.0f);
                this.M0.setTranslationY((-i12) * f10);
                this.N0.setTranslationY(i12 * (1.0f - f10));
                this.N0.setAlpha(f10);
            }
        } else if (this.f23060i1) {
            this.J0.setTranslationY(-i11);
            int i13 = ((int) (this.f23057f1 * (1.0f - f10))) - this.f23059h1;
            this.f23277x0.scrollBy(0, i13 - this.f23058g1);
            this.f23058g1 = i13;
        } else {
            this.J0.setAlpha(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0) {
            if (f10 == 0.0f) {
                this.J0.setVisibility(8);
                this.K0.F2();
                Lg(true);
            } else if (f10 == 1.0f && this.f23054c1) {
                Tg();
            }
        }
    }

    @Override
    public void o6() {
        super.o6();
        this.K0.I2();
    }

    @Override
    public View oc(Context context) {
        int m22 = j2.m2(this.f23267n0.s2());
        int W = ap.W(82);
        int i10 = a0.i(4.0f);
        int i11 = m22 + W + i10;
        this.Q0 = i11;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, f3.p() + i11, 48);
        r12.topMargin = d1.a3(false);
        a aVar = new a(context);
        this.J0 = aVar;
        aVar.setLayoutParams(r12);
        bf(false);
        this.f23277x0.setItemAnimator(new tc.d(db.b.f7287b, 160L));
        RecyclerView.p linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.I0 = new b(this);
        ArrayList arrayList = new ArrayList();
        ra J = new ra(35).J(i11);
        this.O0 = J;
        arrayList.add(J);
        if (!this.f23267n0.s2() && !ob.a.j(this.f23267n0.getTargetChatId()) && !this.f23267n0.Z1()) {
            ra raVar = new ra(82, R.id.btn_shareLiveLocation);
            this.P0 = raVar;
            arrayList.add(raVar);
        }
        arrayList.add(new ra(8, R.id.btn_places, 0, R.string.PullToSeePlaces).d0(R.id.theme_color_textLight));
        this.I0.s2(arrayList, false);
        jg(linearLayoutManager);
        hg(this.I0);
        int i12 = a0.i(12.0f);
        int i13 = a0.i(20.0f) + (a0.i(20.0f) * 2) + i12;
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(i13, W, 51);
        int i14 = m22 + i10;
        r13.topMargin = i14;
        l2 l2Var = new l2(context);
        this.L0 = l2Var;
        l2Var.setPadding(a0.i(20.0f), 0, i12, 0);
        this.L0.setLayoutParams(r13);
        p0.T(this.L0);
        j2 j2Var = new j2(context);
        this.K0 = j2Var;
        j2Var.n2(this, this.L0, this.f23267n0.s2());
        this.K0.setCallback(this);
        this.J0.addView(this.K0);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, i10 + W);
        q12.topMargin = m22;
        View view = new View(context);
        view.setId(R.id.btn_send);
        yd.d.h(view, this);
        view.setLayoutParams(q12);
        view.setOnClickListener(this);
        p0.T(view);
        this.J0.addView(view);
        this.J0.addView(this.L0);
        FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(-1, W, 51);
        r14.topMargin = i14;
        r14.leftMargin = i13;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        frameLayoutFix.setPadding(a0.i(80.0f) - i13, 0, 0, 0);
        frameLayoutFix.setLayoutParams(r14);
        FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(-1, -2, 16);
        r15.rightMargin = a0.i(12.0f);
        b2 b2Var = new b2(context);
        this.M0 = b2Var;
        b2Var.setTypeface(o.i());
        this.M0.setTextSize(1, 16.0f);
        this.M0.setTextColor(j.P0());
        y8(this.M0);
        this.M0.setSingleLine(true);
        this.M0.setGravity(16);
        this.M0.setEllipsize(TextUtils.TruncateAt.END);
        this.M0.setText(w.i1(R.string.Locating));
        this.M0.setLayoutParams(r15);
        frameLayoutFix.addView(this.M0);
        FrameLayout.LayoutParams r16 = FrameLayoutFix.r1(-1, -2, 16);
        r16.topMargin = a0.i(10.0f);
        r16.rightMargin = a0.i(12.0f);
        b2 b2Var2 = new b2(context);
        this.N0 = b2Var2;
        b2Var2.setTextSize(1, 13.0f);
        this.N0.setTextColor(j.R0());
        A8(Integer.valueOf((int) R.id.theme_color_textLight));
        this.N0.setTypeface(o.k());
        this.N0.setEllipsize(TextUtils.TruncateAt.END);
        this.N0.setSingleLine(true);
        this.N0.setLayoutParams(r16);
        this.N0.setAlpha(0.0f);
        frameLayoutFix.addView(this.N0);
        this.J0.addView(frameLayoutFix);
        FrameLayout.LayoutParams r17 = FrameLayoutFix.r1(-1, f3.p(), 48);
        r17.topMargin = i11;
        f3 f3Var = new f3(context);
        f3Var.setSimpleBottomTransparentShadow(true);
        f3Var.setLayoutParams(r17);
        f3Var.setAlpha(0.0f);
        t8(f3Var);
        this.J0.addView(f3Var);
        this.I0.r0(this.f23277x0, f3Var, a0.i(10.0f));
        this.f23275v0.addView(this.J0);
        return this.f23275v0;
    }

    @Override
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_send) {
            z1 z1Var = this.f23055d1;
            if (z1Var != null) {
                this.f23267n0.q3(z1Var);
                return;
            }
            Location currentLocation = this.K0.getCurrentLocation();
            if (currentLocation != null) {
                this.f23267n0.n3(currentLocation.getLatitude(), currentLocation.getLongitude(), currentLocation.getAccuracy(), v0.A0(currentLocation), 0);
            }
        } else if (id2 != R.id.btn_shareLiveLocation) {
            if (id2 == R.id.place) {
                Kg((z1) ((ra) view.getTag()).d(), true);
            }
        } else if (!this.R0) {
            this.R0 = true;
            this.I0.p3(R.id.btn_shareLiveLocation);
            x0.y(this.f24493a, 15000L, true, true, new x0.f() {
                @Override
                public final void a(int i10, Location location) {
                    c1.this.Dg(i10, location);
                }
            });
        }
    }

    @Override
    public int pf() {
        return TdApi.ChatActionChoosingLocation.CONSTRUCTOR;
    }

    @Override
    public void q1(Location location, boolean z10, boolean z11, boolean z12, boolean z13) {
        Location location2;
        if (z11) {
            this.L0.setShowProgress(false);
            if (!z10) {
                this.X0 = location;
            }
        }
        this.L0.setIsCustom(z10);
        if (!z10) {
            this.M0.setText(w.i1(R.string.SendCurrentLocation));
            this.L0.setIsPlace(false);
            Mg(location.getAccuracy() > 0.0f ? w.o2(R.string.AccurateToMeters, (int) location.getAccuracy()) : null);
        } else if (this.f23055d1 == null) {
            this.M0.setText(w.i1(R.string.SendCurrentLocation));
            this.L0.setIsPlace(false);
            Mg(h.o(location.getLatitude()) + ", " + h.o(location.getLongitude()));
        }
        this.S0 = location;
        if (this.f23267n0.s2()) {
            this.T0 = this.S0;
        } else if (!this.W0) {
        } else {
            if ((!z12 && ((location2 = this.T0) == null || location2.distanceTo(location) >= 200.0f)) || !Bg()) {
                Ig(location, z13);
            }
        }
    }

    @Override
    public void t3(ie.k kVar, Location location, TdApi.Error error) {
        Location location2;
        if (this.U0 == kVar) {
            this.U0 = null;
        }
        if (!Sa() && (location2 = this.T0) != null && location2 == location && location2.getLongitude() == location.getLongitude() && this.T0.getLatitude() == location.getLatitude()) {
            this.Z0 = null;
            if (!this.f23052a1) {
                Tg();
            }
            if (error == null) {
                Pg(R.string.PlaceSearchError);
                return;
            }
            Qg(w.i1(R.string.PlaceSearchError) + ": " + t2.z5(error));
        }
    }

    @Override
    public int tf() {
        return Ag() + ((this.f23267n0.s2() || ob.a.j(this.f23267n0.getTargetChatId()) || this.f23267n0.Z1()) ? 0 : ap.W(82)) + ap.W(8) + a0.i(10.0f);
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        if (i10 == 103) {
            this.K0.G2(i11 == -1);
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.P1(linearLayout, this);
        } else if (i10 == R.id.menu_search) {
            d1Var.g2(linearLayout, this);
        }
    }

    @Override
    public void xc() {
        this.f23061j1 = "";
        Sg();
    }
}
