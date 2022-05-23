package de;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import ce.x;
import de.s5;
import ed.a;
import ed.o;
import gd.l;
import gd.w;
import hd.c3;
import hd.d7;
import he.n;
import ib.i;
import ie.g0;
import ie.h0;
import ie.m0;
import ie.y0;
import ie.z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.a3;
import ne.b2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import org.thunderdog.challegram.v.HeaderEditText;
import ud.d1;
import ud.h1;
import ud.q1;
import ud.s;
import ud.s0;
import ud.t2;
import ud.x2;
import yd.g;
import zd.o6;
import zd.t7;
import zd.w7;

public class f5 extends t2<b> implements h0, a.c, TextWatcher, Runnable, h1, y0, t7.i, t7.j, Comparator<TdApi.User> {
    public c A0;
    public HeaderEditText B0;
    public ed.a C0;
    public s D0;
    public TdApi.MessageSender E0;
    public List<d7> F0;
    public int G0;
    public int H0;
    public TdApi.Chat I0;
    public s5.a J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public d N0;
    public int O0;
    public String P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public String T0;
    public FrameLayoutFix f7929t0;
    public a3 f7930u0;
    public View f7931v0;
    public TextView f7932w0;
    public m0 f7933x0;
    public z0 f7934y0;
    public d7[] f7935z0;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 != 0) {
                f5.this.La();
            }
        }
    }

    public static class c extends a3.d implements View.OnClickListener {
        public d7[] R;
        public int S;
        public int[] T;
        public String[] U;
        public d7[] V;
        public int W;
        public int[] X;
        public String[] Y;
        public f5 Z;

        public c(a3 a3Var, f5 f5Var) {
            super(a3Var);
            this.Z = f5Var;
        }

        public void A0(d7[] d7VarArr, int i10, int[] iArr, String[] strArr) {
            this.R = d7VarArr;
            this.S = i10;
            this.T = iArr;
            this.U = strArr;
            H();
        }

        public void B0(d7[] d7VarArr, int i10, int[] iArr, String[] strArr) {
            this.V = d7VarArr;
            this.W = i10;
            this.X = iArr;
            this.Y = strArr;
            H();
        }

        public void C0() {
            if (this.R != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.Z.f7930u0.getLayoutManager();
                for (d7 d7Var : this.R) {
                    d7Var.E();
                }
                int a22 = linearLayoutManager.a2();
                for (int X1 = linearLayoutManager.X1(); X1 <= a22; X1++) {
                    View C = linearLayoutManager.C(X1);
                    if (C != null) {
                        o oVar = (o) C;
                        oVar.e1();
                        oVar.invalidate();
                    }
                }
            }
        }

        @Override
        public void c0(a3.c cVar) {
            ((o) cVar.f2982a).C0();
        }

        @Override
        public View d0(int i10) {
            o oVar = new o(this.P, this.Z.f24495b);
            oVar.setOffsetLeft(a0.i(72.0f));
            oVar.setOnClickListener(this);
            yd.d.h(oVar, this.Z);
            p0.T(oVar);
            return oVar;
        }

        @Override
        public void e0(a3.c cVar) {
            ((o) cVar.f2982a).G0();
        }

        @Override
        public int f0() {
            return a0.i(72.0f);
        }

        @Override
        public int h0(int i10) {
            return this.V == null ? this.T[i10] : this.X[i10];
        }

        @Override
        public int i0() {
            return this.V == null ? this.S : this.W;
        }

        @Override
        public String k0(int i10) {
            return this.V == null ? this.U[i10] : this.Y[i10];
        }

        @Override
        public void onClick(View view) {
            if (view instanceof o) {
                this.Z.Rg(((o) view).getUser(), view);
            }
        }

        @Override
        public void u0(a3.c cVar, int i10) {
            d7[] d7VarArr = this.V;
            d7 d7Var = d7VarArr == null ? this.R[i10] : d7VarArr[i10];
            ((o) cVar.f2982a).setUser(d7Var);
            ((o) cVar.f2982a).Q0(this.Z.og() && this.Z.Ag(d7Var), false);
        }

        public void v0() {
            this.V = null;
            this.X = null;
            this.Y = null;
            H();
        }

        public int w0() {
            d7[] d7VarArr = this.V;
            if (d7VarArr != null) {
                return d7VarArr.length;
            }
            return -1;
        }

        public d7[] x0() {
            return this.V;
        }

        public d7 y0(int i10) {
            return this.R[i10];
        }

        public int z0(long j10) {
            d7[] d7VarArr = this.R;
            if (!(d7VarArr == null || d7VarArr.length == 0)) {
                int i10 = 0;
                for (d7 d7Var : d7VarArr) {
                    if (d7Var.s() == j10) {
                        return i10;
                    }
                    i10++;
                }
            }
            return -1;
        }
    }

    public interface d {
    }

    public f5(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Bg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
            j0.E0(this);
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.AddChatMembers.class, TdApi.Ok.class);
            j0.E0(this);
        } else {
            j0.E0(this);
            this.f24495b.hd().C4(this, this.I0, null);
        }
    }

    public static int Cg(d7 d7Var, d7 d7Var2) {
        int z12;
        int z13;
        TdApi.User r10 = d7Var.r();
        TdApi.User r11 = d7Var2.r();
        if (r10 == null || r11 == null || (z12 = hd.t2.z1(r10)) == (z13 = hd.t2.z1(r11))) {
            return 0;
        }
        return z12 > z13 ? -1 : 1;
    }

    public void Dg(ArrayList arrayList) {
        Md(false);
        s5 s5Var = new s5(this.f24493a, this.f24495b);
        s5Var.ef(this.J0);
        s5Var.ff(arrayList);
        ac(s5Var);
        this.R0 = false;
    }

    public void Eg(final ArrayList arrayList) {
        Collections.sort(arrayList, e5.f7831a);
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                f5.this.Dg(arrayList);
            }
        });
    }

    public void Fg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 171203420) {
            long[] jArr = ((TdApi.Users) object).userIds;
            ArrayList<TdApi.User> T2 = this.f24495b.e2().T2(jArr);
            Collections.sort(T2, this);
            d7[] d7VarArr = new d7[jArr.length];
            this.f7935z0 = d7VarArr;
            if (d7VarArr.length > 0) {
                int i10 = 0;
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    i10++;
                    this.f7935z0[i10] = new d7(this.f24495b, it.next());
                }
            }
            Sg(this.f7935z0);
        }
    }

    public void Ig() {
        if (!Sa()) {
            wg();
            ch();
        }
    }

    public static int Jg(d7 d7Var, d7 d7Var2) {
        return d7Var.m().compareTo(d7Var2.m());
    }

    public void Kg(String str, d7[] d7VarArr, int i10, int[] iArr, String[] strArr) {
        if (!Sa()) {
            if (str != null) {
                this.A0.B0(d7VarArr, i10, iArr, strArr);
            } else {
                wg();
                vg();
                this.A0.A0(d7VarArr, i10, iArr, strArr);
            }
            this.f7930u0.postInvalidate();
        }
    }

    public void Lg(boolean z10, d7[] d7VarArr, final String str) {
        int codePointAt;
        int charCount;
        if (z10) {
            eh(d7VarArr);
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(15, d7VarArr.length);
        final int[] iArr = new int[min];
        String[] strArr = new String[min];
        String str2 = null;
        int length = d7VarArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        final String[] strArr2 = strArr;
        while (i11 < length) {
            d7 d7Var = d7VarArr[i11];
            if (d7Var == null) {
                Log.critical("ContactsController::sortUsers: TGUser is null", new Object[i10]);
            } else {
                String lowerCase = c0.p(d7Var.i().trim()).toLowerCase();
                String lowerCase2 = c0.p(d7Var.j().trim()).toLowerCase();
                String t10 = d7Var.t();
                if (t10 != null) {
                    t10 = t10.toLowerCase();
                }
                String trim = (lowerCase + " " + lowerCase2).trim();
                if (str == null || lowerCase.startsWith(str) || lowerCase2.startsWith(str) || trim.startsWith(str) || (!i.i(t10) && t10.startsWith(str))) {
                    String str3 = "#";
                    if (!trim.isEmpty() && (((charCount = Character.charCount((codePointAt = trim.codePointAt(0)))) != 1 || !Character.isDigit(codePointAt)) && charCount <= trim.length())) {
                        str3 = trim.substring(0, charCount).toUpperCase();
                    }
                    arrayList.add(d7Var);
                    if (str2 == null) {
                        str2 = str3;
                    } else if (i12 > 0 && !str3.equals(str2)) {
                        iArr[i13] = i12;
                        strArr2[i13] = str2;
                        i13++;
                        if (iArr.length <= i13) {
                            int length2 = iArr.length + 15;
                            int[] iArr2 = new int[length2];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            String[] strArr3 = new String[length2];
                            System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
                            strArr2 = strArr3;
                            iArr = iArr2;
                        }
                        str2 = str3;
                        i12 = 0;
                        i12++;
                        i11++;
                        i10 = 0;
                    }
                    i12++;
                    i11++;
                    i10 = 0;
                }
            }
            i11++;
            i10 = 0;
        }
        if (i12 > 0) {
            iArr[i13] = i12;
            strArr2[i13] = str2;
            i13++;
        }
        final int i14 = i13;
        final d7[] d7VarArr2 = new d7[arrayList.size()];
        arrayList.toArray(d7VarArr2);
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                f5.this.Kg(str, d7VarArr2, i14, iArr, strArr2);
            }
        });
    }

    public static void eh(d7[] d7VarArr) {
        Arrays.sort(d7VarArr, d5.f7748a);
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        ih(j10, userStatus);
    }

    @Override
    public int A9() {
        return 3;
    }

    public final boolean Ag(d7 d7Var) {
        return og() && yg(d7Var.h()) >= 0;
    }

    @Override
    public View G9() {
        return this.G0 == 10 ? this.D0 : ug() ? this.C0 : this.B0;
    }

    @Override
    public View Ga() {
        if (ug()) {
            return null;
        }
        return this.f7930u0;
    }

    @Override
    public void H4() {
        this.R0 = false;
        Md(false);
    }

    @Override
    public boolean He() {
        return !ug();
    }

    @Override
    public void Ia() {
        super.Ia();
        c cVar = this.A0;
        if (cVar != null) {
            cVar.C0();
        }
        a3 a3Var = this.f7930u0;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        if (this.B0 != null) {
            int i10 = a0.i(68.0f);
            int i11 = ng() ? a0.i(49.0f) : 0;
            HeaderEditText headerEditText = this.B0;
            int i12 = w.G2() ? i11 : i10;
            if (!w.G2()) {
                i10 = i11;
            }
            if (p0.a0(headerEditText, i12, 0, i10, 0)) {
                p0.r0(this.B0);
            }
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 != R.id.menu_btn_addContact) {
            if (i10 == R.id.menu_btn_clear) {
                T8();
            } else if (i10 == R.id.menu_btn_search) {
                Yc();
            }
        } else if (this.f7935z0 != null) {
            rg();
        }
    }

    @Override
    public int J9() {
        int i10 = this.G0;
        if (i10 == 10 || i10 == 7 || i10 == 1 || i10 == 4 || i10 == 8 || i10 == 6 || this.F0.size() == 0) {
            return 0;
        }
        int i11 = this.G0;
        return (i11 == 2 || i11 == 7) ? R.drawable.baseline_check_24 : R.drawable.baseline_arrow_forward_24;
    }

    @Override
    public void La() {
        super.La();
        View[] viewArr = new View[2];
        viewArr[0] = this.B0;
        ed.a aVar = this.C0;
        viewArr[1] = aVar == null ? null : aVar.getInput();
        x.d(viewArr);
    }

    @Override
    public void M1(final TdApi.User user) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                f5.this.Hg(user);
            }
        });
    }

    @Override
    public void M2(int i10) {
        if (this.S0 != i10) {
            this.S0 = i10;
            float f10 = i10;
            this.f7930u0.setTranslationY(f10);
            RecyclerView yf = yf();
            if (yf != null) {
                yf.setTranslationY(f10);
            }
            int M9 = M9();
            q1 q1Var = this.T;
            if (q1Var != null) {
                q1Var.I().setBackgroundHeight(M9);
                this.T.H().m(M9);
            }
        }
    }

    @Override
    public int M9() {
        return n.e() + this.S0;
    }

    public final void Mg() {
        dh();
        int i10 = this.H0;
        if (i10 == 0) {
            this.f24495b.ob(null, 10240, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    f5.this.Fg(object);
                }
            });
            this.f24495b.e2().I(this);
        } else if (i10 == 1) {
            Og();
        } else if (i10 == 2) {
            Ng();
        }
    }

    public final void Ng() {
    }

    public final void Og() {
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                f5.this.Gg();
            }
        });
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    public final void Gg() {
        throw new UnsupportedOperationException("Method not decompiled: de.f5.Gg():void");
    }

    @Override
    public boolean Qf(View view, c3 c3Var) {
        d7 d7Var;
        m0 m0Var = this.f7933x0;
        if (m0Var != null) {
            TdApi.MessageSender l10 = c3Var.l();
            this.E0 = l10;
            m0Var.N3(this, view, l10);
            return true;
        } else if (!og()) {
            return super.Qf(view, c3Var);
        } else {
            long a10 = c3Var.a();
            long p10 = c3Var.p();
            if (p10 != 0) {
                o6 o6Var = this.f24495b;
                d7Var = new d7(o6Var, o6Var.e2().P2(p10));
            } else {
                o6 o6Var2 = this.f24495b;
                d7Var = new d7(o6Var2, o6Var2.P3(a10));
            }
            if (!Ag(d7Var) && !Ug(d7Var, null)) {
                return false;
            }
            this.C0.getSearchInput().setText("");
            return true;
        }
    }

    public final boolean Qg() {
        int i10;
        m0 m0Var;
        if ((w9() != null && w9().f7939c) || (i10 = this.G0) == 3 || i10 == 2 || i10 == 10) {
            return true;
        }
        return i10 == 1 && (m0Var = this.f7933x0) != null && m0Var.A6();
    }

    @Override
    public int R9() {
        return R.id.controller_contacts;
    }

    public void Rg(d7 d7Var, View view) {
        int i10 = this.G0;
        if (!(i10 == 2 || i10 == 3 || i10 == 5)) {
            if (i10 == 6) {
                La();
                this.f24495b.hd().S8(this, d7Var.s(), false, null);
                return;
            } else if (i10 != 7) {
                La();
                m0 m0Var = this.f7933x0;
                if (m0Var != null) {
                    TdApi.MessageSender l10 = d7Var.l();
                    this.E0 = l10;
                    if (m0Var.N3(this, view, l10)) {
                        Zb();
                        return;
                    }
                    return;
                } else if (this.G0 == 8) {
                    this.f24495b.F4().c0().p0(this, d7Var.s(), null);
                    return;
                } else {
                    this.f24495b.hd().u7(this, d7Var.s(), null);
                    return;
                }
            }
        }
        Ug(d7Var, (o) view);
    }

    public final void Sg(d7[] d7VarArr) {
        if (d7VarArr.length == 0) {
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    f5.this.Ig();
                }
            });
        } else {
            fh(d7VarArr, null, false);
        }
    }

    public final void Tg(String str, boolean z10) {
        if (str.length() == 0) {
            this.A0.v0();
        } else if (z10) {
            fh(this.A0.x0(), str, false);
        } else {
            fh(this.f7935z0, str, false);
        }
    }

    @Override
    public void U() {
        ((FrameLayout.LayoutParams) this.f7930u0.getLayoutParams()).bottomMargin = (int) this.f7930u0.getTranslationY();
        this.f7930u0.requestLayout();
        RecyclerView yf = yf();
        if (yf != null) {
            p0.S(yf, (int) yf.getTranslationY());
        }
    }

    public final boolean Ug(d7 d7Var, o oVar) {
        int i10;
        ed.a aVar;
        s0 s0Var;
        ed.a aVar2 = this.C0;
        if ((aVar2 != null && aVar2.D1()) || this.R0) {
            return false;
        }
        if (oVar != null || ((i10 = this.A0.z0(d7Var.s())) != -1 && (oVar = (o) this.f7930u0.getLayoutManager().C(i10)) == null)) {
            i10 = -1;
        }
        int yg = yg(d7Var.h());
        if (!og() || yg < 0) {
            int size = this.F0.size() + 1;
            if (this.G0 != 3 || size < this.f24495b.Jc()) {
                this.F0.add(d7Var);
                if (oVar != null) {
                    oVar.Q0(true, true);
                }
                if (ug()) {
                    this.C0.C1(d7Var);
                }
                if (!(this.F0.size() != 1 || this.S == null || J9() == 0)) {
                    this.S.l(this);
                }
            } else {
                x2.h g10 = this.f24493a.I3().g(oVar);
                o6 o6Var = this.f24495b;
                g10.F(this, o6Var, R.drawable.baseline_error_24, w.q2(R.string.ParticipantXLimitReached, o6Var.Jc()));
                return false;
            }
        } else {
            this.F0.remove(yg);
            if (oVar != null) {
                oVar.Q0(false, true);
            }
            if (ug()) {
                this.C0.O1(d7Var);
            }
            if (this.F0.size() == 0 && (s0Var = this.S) != null) {
                s0Var.f();
            }
        }
        if (this.A0.w0() == 1 && (aVar = this.C0) != null) {
            aVar.E1();
        }
        if (this.G0 == 7) {
            this.f7934y0.m(this.F0);
        }
        if (i10 != -1) {
            this.A0.I(i10);
        }
        return true;
    }

    @Override
    public int V9() {
        return n.b(false);
    }

    public void Vg(boolean z10) {
        this.K0 = z10;
    }

    @Override
    public int W9() {
        m0 m0Var;
        if (this.G0 == 10) {
            return R.id.menu_search;
        }
        if (ng()) {
            return R.id.menu_contacts;
        }
        if (this.G0 != 1 || (m0Var = this.f7933x0) == null || !m0Var.A6()) {
            return 0;
        }
        return R.id.menu_search;
    }

    public void Wg(boolean z10, boolean z11) {
        this.L0 = z10;
        this.M0 = z11;
    }

    @Override
    public CharSequence X9() {
        m0 m0Var;
        if (this.G0 != 1 || (m0Var = this.f7933x0) == null || !m0Var.A6()) {
            return super.X9();
        }
        return this.f7933x0.B6();
    }

    public void Xg(b bVar) {
        int i10;
        super.Ad(bVar);
        m0 m0Var = bVar.f7937a;
        if (m0Var != null) {
            this.f7933x0 = m0Var;
            i10 = 1;
        } else {
            z0 z0Var = bVar.f7938b;
            if (z0Var != null) {
                this.f7934y0 = z0Var;
                i10 = 7;
            } else {
                i10 = 0;
            }
        }
        if (this.G0 == 0 && i10 != 0) {
            zg(i10);
        }
    }

    public void Yg(TdApi.Chat chat) {
        this.I0 = chat;
    }

    @Override
    public void Z8() {
        super.Z8();
        p0.n(this.f7930u0);
        ed.a aVar = this.C0;
        if (aVar != null) {
            aVar.b0();
        }
        if (this.H0 == 0) {
            this.f24495b.e2().L1(this);
        }
    }

    public void Zg(int i10, String str) {
        this.O0 = i10;
        this.P0 = str;
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    public void ah(d dVar) {
        this.N0 = dVar;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void bh(int i10) {
        this.H0 = i10;
    }

    public final void ch() {
        this.Q0 = true;
        TextView textView = this.f7932w0;
        int i10 = 8;
        if (textView == null) {
            b2 b2Var = new b2(t());
            this.f7932w0 = b2Var;
            b2Var.setText(w.i1(R.string.NoContacts));
            this.f7932w0.setTextColor(-7697782);
            this.f7932w0.setTextSize(1, 16.0f);
            this.f7932w0.setTypeface(ce.o.k());
            this.f7932w0.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
            if (Cf()) {
                this.f7932w0.setVisibility(8);
            }
            this.f7929t0.addView(this.f7932w0);
        } else if (textView.getParent() == null) {
            TextView textView2 = this.f7932w0;
            if (!Cf()) {
                i10 = 0;
            }
            textView2.setVisibility(i10);
            this.f7929t0.addView(this.f7932w0);
        }
    }

    public final void dh() {
        View view = this.f7931v0;
        if (view == null) {
            View n02 = p0.n0(t());
            this.f7931v0 = n02;
            this.f7929t0.addView(n02);
        } else if (view.getParent() == null) {
            this.f7931v0.setVisibility(0);
            this.f7929t0.addView(this.f7931v0);
        }
    }

    @Override
    public void e3(long j10) {
        s0 s0Var;
        int yg = yg(j10);
        if (yg != -1) {
            this.F0.remove(yg);
            if (this.F0.size() == 0 && (s0Var = this.S) != null) {
                s0Var.f();
            }
            d7[] d7VarArr = this.f7935z0;
            int length = d7VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (d7VarArr[i10].h() == j10) {
                    View C = this.f7930u0.getLayoutManager().C(i11);
                    if (C != null && (C instanceof o)) {
                        o oVar = (o) C;
                        if (oVar.getUser().h() == j10) {
                            oVar.Q0(false, true);
                        }
                    }
                    this.A0.I(i11);
                } else {
                    i11++;
                    i10++;
                }
            }
            if (this.G0 == 7) {
                this.f7934y0.m(this.F0);
            }
        }
    }

    public final void fh(final d7[] d7VarArr, final String str, final boolean z10) {
        if (d7VarArr != null) {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    f5.this.Lg(z10, d7VarArr, str);
                }
            });
        }
    }

    public final void Hg(TdApi.User user) {
        c cVar = this.A0;
        if (cVar != null) {
            int z02 = cVar.z0(user.f19979id);
            if (z02 != -1) {
                this.A0.y0(z02).C(user, 0);
                hh(z02, false);
            } else if (this.f7935z0 != null) {
                hd.t2.O2(user);
            }
        }
    }

    public final void hh(int i10, boolean z10) {
        View C = this.f7930u0.getLayoutManager().C(i10);
        o oVar = (C == null || !(C instanceof o)) ? null : (o) C;
        if (oVar != null) {
            if (z10) {
                oVar.e1();
            } else {
                oVar.V0();
            }
            oVar.invalidate();
            return;
        }
        this.A0.I(i10);
    }

    public final void ih(long j10, TdApi.UserStatus userStatus) {
        int z02;
        c cVar = this.A0;
        if (cVar != null && (z02 = cVar.z0(j10)) != -1) {
            this.A0.y0(z02).B(userStatus);
            hh(z02, true);
        }
    }

    @Override
    public boolean jf(c3 c3Var) {
        return false;
    }

    @Override
    public void kc() {
        HeaderEditText headerEditText;
        super.kc();
        int i10 = this.G0;
        if (i10 == 1 || i10 == 4 || i10 == 8 || i10 == 6) {
            headerEditText = this.B0;
        } else {
            ed.a aVar = this.C0;
            headerEditText = aVar == null ? null : aVar.getInput();
        }
        x.c(headerEditText);
    }

    @Override
    public void mc(Configuration configuration) {
        super.mc(configuration);
        this.f7930u0.post(this);
    }

    @Override
    public View n() {
        return this.f7930u0;
    }

    public final boolean ng() {
        int i10 = this.G0;
        return i10 == 4 || i10 == 8;
    }

    @Override
    public View oc(Context context) {
        m0 m0Var;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f7929t0 = frameLayoutFix;
        g.i(frameLayoutFix, R.id.theme_color_filling, this);
        a3 a3Var = new a3(context);
        this.f7930u0 = a3Var;
        c cVar = new c(a3Var, this);
        this.A0 = cVar;
        a3Var.setSectionedAdapter(cVar);
        this.f7930u0.k(new a());
        t8(this.f7930u0);
        this.f7929t0.addView(this.f7930u0);
        if (this.G0 == 10) {
            s sVar = new s(context);
            this.D0 = sVar;
            sVar.setThemedTextColor(this);
            this.D0.A1(a0.i(49.0f), true);
            this.D0.setTitle(this.O0);
            this.D0.setSubtitle(this.P0);
        } else if (ug()) {
            ed.a aVar = new ed.a(context);
            this.C0 = aVar;
            aVar.setHint(P8(this.G0 == 7 ? this.f7934y0.i6() : R.string.SendMessageTo, this.C0.getInput(), true, false));
            this.C0.setCallback(this);
            List<d7> list = this.F0;
            if (list != null && list.size() > 0) {
                this.C0.I1(this.F0);
                int currentWrapHeight = this.C0.getCurrentWrapHeight();
                this.S0 = currentWrapHeight;
                this.f7930u0.setTranslationY(currentWrapHeight);
                ((FrameLayout.LayoutParams) this.f7930u0.getLayoutParams()).bottomMargin = this.S0;
            }
        } else if (this.G0 != 1 || ((m0Var = this.f7933x0) != null && !m0Var.A6())) {
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, n.e());
            if (w.G2()) {
                q12.rightMargin = a0.i(68.0f);
                q12.leftMargin = ng() ? a0.i(49.0f) : 0;
            } else {
                q12.leftMargin = a0.i(68.0f);
                q12.rightMargin = ng() ? a0.i(49.0f) : 0;
            }
            HeaderEditText z10 = HeaderEditText.z(j0.r(context).Q1().I(), false, this);
            this.B0 = z10;
            z10.setPadding(a0.i(5.0f), 0, a0.i(5.0f), 0);
            HeaderEditText headerEditText = this.B0;
            headerEditText.setHint(w.i1(P8(this.G0 == 6 ? R.string.NewSecretChatWith : R.string.Search, headerEditText, true, false)));
            this.B0.addTextChangedListener(this);
            this.B0.setLayoutParams(q12);
        }
        if (Qg()) {
            CustomRecyclerView qf = qf(this.f7929t0);
            List<d7> list2 = this.F0;
            if (list2 != null && list2.size() > 0) {
                qf.setTranslationY(this.S0);
                ((FrameLayout.LayoutParams) qf.getLayoutParams()).bottomMargin = this.S0;
            }
        }
        Mg();
        return this.f7929t0;
    }

    public final boolean og() {
        int i10 = this.G0;
        return i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        p(charSequence.toString());
    }

    @Override
    public void p(String str) {
        TextView textView;
        TextView textView2;
        if (this.T0 == null) {
            this.T0 = "";
        }
        if (!str.equals(this.T0)) {
            boolean z10 = false;
            if (Qg()) {
                boolean z11 = !this.T0.isEmpty();
                boolean isEmpty = true ^ str.isEmpty();
                this.T0 = str;
                if (z11 != isEmpty) {
                    if (isEmpty) {
                        of(str);
                        if (this.Q0 && (textView2 = this.f7932w0) != null) {
                            textView2.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    nf();
                    if (this.Q0 && (textView = this.f7932w0) != null) {
                        textView.setVisibility(0);
                    }
                } else if (isEmpty) {
                    pf(str);
                }
            } else {
                d7[] d7VarArr = this.f7935z0;
                if (d7VarArr != null && d7VarArr.length > 0) {
                    String p10 = c0.p(str.trim().toLowerCase());
                    if (!p10.equals(this.T0)) {
                        if (p10.length() > this.T0.length() && this.T0.length() > 0 && p10.startsWith(this.T0)) {
                            z10 = true;
                        }
                        Tg(p10, z10);
                        this.T0 = p10;
                    }
                }
            }
        }
    }

    public int compare(TdApi.User user, TdApi.User user2) {
        return d7.o(user).compareTo(d7.o(user2));
    }

    public final void qg() {
        int size = this.F0.size();
        if (!(size == 0 || this.R0)) {
            Md(true);
            this.R0 = true;
            long[] jArr = new long[size];
            for (int i10 = 0; i10 < size; i10++) {
                jArr[i10] = this.F0.get(i10).s();
            }
            this.f24495b.v4().o(new TdApi.AddChatMembers(this.I0.f19908id, jArr), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    f5.this.Bg(object);
                }
            });
        }
    }

    @Override
    public boolean r3(View view, int i10) {
        m0 m0Var;
        TdApi.MessageSender messageSender = this.E0;
        if (messageSender != null && (m0Var = this.f7933x0) != null && i10 != R.id.btn_cancel) {
            m0Var.s6(this, messageSender, i10);
            Zb();
        } else if (i10 == R.id.btn_gmailContacts) {
            xg(2);
        } else if (i10 == R.id.btn_localContacts) {
            xg(1);
        } else if (i10 == R.id.btn_newContact) {
            rg();
        }
        return true;
    }

    @Override
    public void rc() {
        int i10 = this.G0;
        if (i10 == 2) {
            qg();
        } else if (i10 == 3) {
            sg();
        }
    }

    public final void rg() {
        fk fkVar = new fk(this.f24493a, this.f24495b);
        fkVar.vg(2);
        ac(fkVar);
    }

    @Override
    public void run() {
        this.f7930u0.requestLayout();
    }

    @Override
    public void sc() {
        super.sc();
        if (this.G0 == 2 && te() == 3 && (se(1) instanceof n5)) {
            b9(1);
        }
    }

    public final void sg() {
        int size = this.F0.size();
        if (!(size == 0 || this.R0)) {
            Md(true);
            this.R0 = true;
            final ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(this.F0.get(i10));
            }
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    f5.this.Eg(arrayList);
                }
            });
        }
    }

    public final d tg() {
        return new d() {
        };
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_contacts) {
            d1Var.K1(linearLayout, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, O9(), this, a0.i(49.0f));
        } else if (i10 == R.id.menu_search) {
            d1Var.h2(linearLayout, this, O9());
        }
    }

    @Override
    public boolean u3() {
        return true;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    public final boolean ug() {
        int i10 = this.G0;
        return i10 == 2 || i10 == 3 || i10 == 7;
    }

    public final void vg() {
        this.Q0 = false;
        TextView textView = this.f7932w0;
        if (textView != null && textView.getParent() != null) {
            this.f7932w0.setVisibility(8);
            this.f7929t0.removeView(this.f7932w0);
        }
    }

    @Override
    public boolean we() {
        ed.a aVar = this.C0;
        return aVar == null || !aVar.D1();
    }

    @Override
    public int wf() {
        int i10;
        if (w9() != null && w9().f7939c) {
            return w9().f7940d;
        }
        int i11 = 0;
        int i12 = 12549 | ((this.K0 || (i10 = this.G0) == 2 || i10 == 3) ? 0 : 64);
        boolean z10 = this.L0;
        if (!z10 && !this.M0) {
            i11 = 16;
        } else if (!z10 || !this.M0) {
            i11 = z10 ? Log.TAG_VOICE : Log.TAG_VIDEO;
        }
        return i12 | i11;
    }

    public final void wg() {
        View view = this.f7931v0;
        if (view != null && view.getParent() != null) {
            this.f7931v0.setVisibility(8);
            this.f7929t0.removeView(this.f7931v0);
        }
    }

    public final void xg(int i10) {
        f5 f5Var = new f5(this.f24493a, this.f24495b);
        f5Var.zg(5);
        f5Var.bh(i10);
        f5Var.ah(tg());
        ac(f5Var);
    }

    @Override
    public void y3(int i10) {
        ((FrameLayout.LayoutParams) this.f7930u0.getLayoutParams()).bottomMargin = i10;
        this.f7930u0.requestLayout();
        RecyclerView yf = yf();
        if (yf != null) {
            p0.S(yf, i10);
        }
    }

    public final int yg(long j10) {
        for (int i10 = 0; i10 < this.F0.size(); i10++) {
            if (this.F0.get(i10).h() == j10) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public View zf() {
        return this.f7930u0;
    }

    public void zg(int i10) {
        this.G0 = i10;
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7) {
            int i11 = 10;
            if (i10 == 7) {
                long[] d42 = this.f7934y0.d4();
                if (d42 != null) {
                    i11 = d42.length;
                }
                this.F0 = new ArrayList(i11);
                if (d42 != null) {
                    for (long j10 : d42) {
                        long q10 = ob.a.q(j10);
                        if (q10 != 0) {
                            TdApi.User u22 = this.f24495b.e2().u2(q10);
                            if (u22 != null) {
                                this.F0.add(new d7(this.f24495b, u22));
                            }
                        } else {
                            TdApi.Chat W2 = this.f24495b.W2(j10);
                            if (W2 != null) {
                                this.F0.add(new d7(this.f24495b, W2));
                            }
                        }
                    }
                    return;
                }
                return;
            }
            this.F0 = new ArrayList(10);
        }
    }

    public static class b {
        public m0 f7937a;
        public z0 f7938b;
        public boolean f7939c;
        public int f7940d;

        public b(m0 m0Var) {
            this.f7937a = m0Var;
        }

        public b a(int i10) {
            this.f7939c = true;
            this.f7940d = i10;
            return this;
        }

        public b(z0 z0Var) {
            this.f7938b = z0Var;
        }
    }
}
