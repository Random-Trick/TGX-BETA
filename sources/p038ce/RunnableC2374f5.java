package p038ce;

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
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1408x;
import gd.C4601c3;
import gd.C4618d7;
import gd.C4779t2;
import ge.C4896n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.C6847b2;
import me.RunnableC6832a3;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import org.thunderdog.challegram.p211v.HeaderEditText;
import p038ce.C3034s5;
import p053dd.C3992a;
import p053dd.C4022o;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5129m0;
import p111he.AbstractC5155y0;
import p111he.AbstractC5157z0;
import p111he.C5115g0;
import p193nb.C7316a;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11133y7;
import td.AbstractC9201h1;
import td.AbstractC9299t2;
import td.C9270q1;
import td.C9289s;
import td.C9290s0;
import td.C9357x2;
import td.View$OnClickListenerC9170d1;

public class RunnableC2374f5 extends AbstractC9299t2<C2376b> implements AbstractC5117h0, C3992a.AbstractC3995c, TextWatcher, Runnable, AbstractC9201h1, AbstractC5155y0, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j, Comparator<TdApi.User> {
    public View$OnClickListenerC2377c f8140A0;
    public HeaderEditText f8141B0;
    public C3992a f8142C0;
    public C9289s f8143D0;
    public TdApi.MessageSender f8144E0;
    public List<C4618d7> f8145F0;
    public int f8146G0;
    public int f8147H0;
    public TdApi.Chat f8148I0;
    public C3034s5.AbstractC3035a f8149J0;
    public boolean f8150K0;
    public boolean f8151L0;
    public boolean f8152M0;
    public AbstractC2378d f8153N0;
    public int f8154O0;
    public String f8155P0;
    public boolean f8156Q0;
    public boolean f8157R0;
    public int f8158S0;
    public String f8159T0;
    public FrameLayoutFix f8160t0;
    public RunnableC6832a3 f8161u0;
    public View f8162v0;
    public TextView f8163w0;
    public AbstractC5129m0 f8164x0;
    public AbstractC5157z0 f8165y0;
    public C4618d7[] f8166z0;

    public class C2375a extends RecyclerView.AbstractC0910t {
        public C2375a() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i != 0) {
                RunnableC2374f5.this.mo9397La();
            }
        }
    }

    public static class View$OnClickListenerC2377c extends RunnableC6832a3.AbstractC6836d implements View.OnClickListener {
        public C4618d7[] f8172R;
        public int f8173S;
        public int[] f8174T;
        public String[] f8175U;
        public C4618d7[] f8176V;
        public int f8177W;
        public int[] f8178X;
        public String[] f8179Y;
        public RunnableC2374f5 f8180Z;

        public View$OnClickListenerC2377c(RunnableC6832a3 a3Var, RunnableC2374f5 f5Var) {
            super(a3Var);
            this.f8180Z = f5Var;
        }

        public C4618d7 m34723A0(int i) {
            return this.f8172R[i];
        }

        public int m34722B0(long j) {
            C4618d7[] d7VarArr = this.f8172R;
            if (!(d7VarArr == null || d7VarArr.length == 0)) {
                int i = 0;
                for (C4618d7 d7Var : d7VarArr) {
                    if (d7Var.m26869s() == j) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }

        public void m34721C0(C4618d7[] d7VarArr, int i, int[] iArr, String[] strArr) {
            this.f8172R = d7VarArr;
            this.f8173S = i;
            this.f8174T = iArr;
            this.f8175U = strArr;
            m39313H();
        }

        public void m34720D0(C4618d7[] d7VarArr, int i, int[] iArr, String[] strArr) {
            this.f8176V = d7VarArr;
            this.f8177W = i;
            this.f8178X = iArr;
            this.f8179Y = strArr;
            m39313H();
        }

        public void m34719E0() {
            if (this.f8172R != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8180Z.f8161u0.getLayoutManager();
                for (C4618d7 d7Var : this.f8172R) {
                    d7Var.m26887E();
                }
                int a2 = linearLayoutManager.m39546a2();
                for (int X1 = linearLayoutManager.m39549X1(); X1 <= a2; X1++) {
                    View C = linearLayoutManager.mo39262C(X1);
                    if (C != null) {
                        C4022o oVar = (C4022o) C;
                        oVar.m29276c1();
                        oVar.invalidate();
                    }
                }
            }
        }

        @Override
        public void mo18843d0(RunnableC6832a3.C6835c cVar) {
            ((C4022o) cVar.f3479a).m29285B0();
        }

        @Override
        public View mo18842e0(int i) {
            C4022o oVar = new C4022o(this.f21425P, this.f8180Z.f30167b);
            oVar.setOffsetLeft(C1357a0.m37541i(72.0f));
            oVar.setOnClickListener(this);
            C10189d.m5796h(oVar, this.f8180Z);
            C1399s0.m37193a0(oVar);
            return oVar;
        }

        @Override
        public void mo18841f0(RunnableC6832a3.C6835c cVar) {
            ((C4022o) cVar.f3479a).m29283F0();
        }

        @Override
        public int mo18840g0() {
            return C1357a0.m37541i(72.0f);
        }

        @Override
        public int mo18838i0(int i) {
            return this.f8176V == null ? this.f8174T[i] : this.f8178X[i];
        }

        @Override
        public int mo18837j0() {
            return this.f8176V == null ? this.f8173S : this.f8177W;
        }

        @Override
        public String mo18835l0(int i) {
            return this.f8176V == null ? this.f8175U[i] : this.f8179Y[i];
        }

        @Override
        public void onClick(View view) {
            if (view instanceof C4022o) {
                this.f8180Z.m34770Rg(((C4022o) view).getUser(), view);
            }
        }

        @Override
        public void mo18825w0(RunnableC6832a3.C6835c cVar, int i) {
            C4618d7[] d7VarArr = this.f8176V;
            C4618d7 d7Var = d7VarArr == null ? this.f8172R[i] : d7VarArr[i];
            ((C4022o) cVar.f3479a).setUser(d7Var);
            ((C4022o) cVar.f3479a).m29280O0(this.f8180Z.m34736og() && this.f8180Z.m34787Ag(d7Var), false);
        }

        public void m34718x0() {
            this.f8176V = null;
            this.f8178X = null;
            this.f8179Y = null;
            m39313H();
        }

        public int m34717y0() {
            C4618d7[] d7VarArr = this.f8176V;
            if (d7VarArr != null) {
                return d7VarArr.length;
            }
            return -1;
        }

        public C4618d7[] m34716z0() {
            return this.f8176V;
        }
    }

    public interface AbstractC2378d {
    }

    public RunnableC2374f5(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34786Bg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
            C1379j0.m37365E0(this);
        } else if (constructor != -722616727) {
            Log.unexpectedTdlibResponse(object, TdApi.AddChatMembers.class, TdApi.C7866Ok.class);
            C1379j0.m37365E0(this);
        } else {
            C1379j0.m37365E0(this);
            this.f30167b.m2485dd().m3881C4(this, this.f8148I0, null);
        }
    }

    public static int m34785Cg(C4618d7 d7Var, C4618d7 d7Var2) {
        int z1;
        int z12;
        TdApi.User r = d7Var.m26870r();
        TdApi.User r2 = d7Var2.m26870r();
        if (r == null || r2 == null || (z1 = C4779t2.m25382z1(r)) == (z12 = C4779t2.m25382z1(r2))) {
            return 0;
        }
        return z1 > z12 ? -1 : 1;
    }

    public void m34784Dg(ArrayList arrayList) {
        m9387Md(false);
        C3034s5 s5Var = new C3034s5(this.f30165a, this.f30167b);
        s5Var.m32004ef(this.f8149J0);
        s5Var.m32003ff(arrayList);
        m9291ac(s5Var);
        this.f8157R0 = false;
    }

    public void m34783Eg(final ArrayList arrayList) {
        Collections.sort(arrayList, C2323e5.f8003a);
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                RunnableC2374f5.this.m34784Dg(arrayList);
            }
        });
    }

    public void m34782Fg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 171203420) {
            long[] jArr = ((TdApi.Users) object).userIds;
            ArrayList<TdApi.User> T2 = this.f30167b.m2480e2().m1686T2(jArr);
            Collections.sort(T2, this);
            C4618d7[] d7VarArr = new C4618d7[jArr.length];
            this.f8166z0 = d7VarArr;
            if (d7VarArr.length > 0) {
                int i = 0;
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    i++;
                    this.f8166z0[i] = new C4618d7(this.f30167b, it.next());
                }
            }
            m34769Sg(this.f8166z0);
        }
    }

    public void m34779Ig() {
        if (!m9347Sa()) {
            m34728wg();
            m34754ch();
        }
    }

    public static int m34778Jg(C4618d7 d7Var, C4618d7 d7Var2) {
        return d7Var.m26875m().compareTo(d7Var2.m26875m());
    }

    public void m34777Kg(String str, C4618d7[] d7VarArr, int i, int[] iArr, String[] strArr) {
        if (!m9347Sa()) {
            if (str != null) {
                this.f8140A0.m34720D0(d7VarArr, i, iArr, strArr);
            } else {
                m34728wg();
                m34729vg();
                this.f8140A0.m34721C0(d7VarArr, i, iArr, strArr);
            }
            this.f8161u0.postInvalidate();
        }
    }

    public void m34776Lg(boolean z, C4618d7[] d7VarArr, final String str) {
        int codePointAt;
        int charCount;
        if (z) {
            m34750eh(d7VarArr);
        }
        ArrayList arrayList = new ArrayList();
        int min = Math.min(15, d7VarArr.length);
        final int[] iArr = new int[min];
        String[] strArr = new String[min];
        String str2 = null;
        int length = d7VarArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        final String[] strArr2 = strArr;
        while (i2 < length) {
            C4618d7 d7Var = d7VarArr[i2];
            if (d7Var == null) {
                Log.critical("ContactsController::sortUsers: TGUser is null", new Object[i]);
            } else {
                String lowerCase = C1363c0.m37417p(d7Var.m26879i().trim()).toLowerCase();
                String lowerCase2 = C1363c0.m37417p(d7Var.m26878j().trim()).toLowerCase();
                String t = d7Var.m26868t();
                if (t != null) {
                    t = t.toLowerCase();
                }
                String trim = (lowerCase + " " + lowerCase2).trim();
                if (str == null || lowerCase.startsWith(str) || lowerCase2.startsWith(str) || trim.startsWith(str) || (!C5070i.m24061i(t) && t.startsWith(str))) {
                    String str3 = "#";
                    if (!trim.isEmpty() && (((charCount = Character.charCount((codePointAt = trim.codePointAt(0)))) != 1 || !Character.isDigit(codePointAt)) && charCount <= trim.length())) {
                        str3 = trim.substring(0, charCount).toUpperCase();
                    }
                    arrayList.add(d7Var);
                    if (str2 == null) {
                        str2 = str3;
                    } else if (i3 > 0 && !str3.equals(str2)) {
                        iArr[i4] = i3;
                        strArr2[i4] = str2;
                        i4++;
                        if (iArr.length <= i4) {
                            int length2 = iArr.length + 15;
                            int[] iArr2 = new int[length2];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            String[] strArr3 = new String[length2];
                            System.arraycopy(strArr2, 0, strArr3, 0, strArr2.length);
                            strArr2 = strArr3;
                            iArr = iArr2;
                        }
                        str2 = str3;
                        i3 = 0;
                        i3++;
                        i2++;
                        i = 0;
                    }
                    i3++;
                    i2++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        if (i3 > 0) {
            iArr[i4] = i3;
            strArr2[i4] = str2;
            i4++;
        }
        final int i5 = i4;
        final C4618d7[] d7VarArr2 = new C4618d7[arrayList.size()];
        arrayList.toArray(d7VarArr2);
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                RunnableC2374f5.this.m34777Kg(str, d7VarArr2, i5, iArr, strArr2);
            }
        });
    }

    public static void m34750eh(C4618d7[] d7VarArr) {
        Arrays.sort(d7VarArr, C2279d5.f7895a);
    }

    @Override
    public boolean mo493A3(View view, int i) {
        AbstractC5129m0 m0Var;
        TdApi.MessageSender messageSender = this.f8144E0;
        if (messageSender != null && (m0Var = this.f8164x0) != null && i != R.id.btn_cancel) {
            m0Var.mo23863j(this, messageSender, i);
            m9298Zb();
        } else if (i == R.id.btn_gmailContacts) {
            m34727xg(2);
        } else if (i == R.id.btn_localContacts) {
            m34727xg(1);
        } else if (i == R.id.btn_newContact) {
            m34733rg();
        }
        return true;
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public final boolean m34787Ag(C4618d7 d7Var) {
        return m34736og() && m34726yg(d7Var.m26880h()) >= 0;
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    @Override
    public View mo8869G9() {
        return this.f8146G0 == 10 ? this.f8143D0 : m34730ug() ? this.f8142C0 : this.f8141B0;
    }

    @Override
    public View mo8868Ga() {
        if (m34730ug()) {
            return null;
        }
        return this.f8161u0;
    }

    @Override
    public void mo29400H3(int i) {
        ((FrameLayout.LayoutParams) this.f8161u0.getLayoutParams()).bottomMargin = i;
        this.f8161u0.requestLayout();
        RecyclerView yf = m9534yf();
        if (yf != null) {
            C1399s0.m37195Z(yf, i);
        }
    }

    @Override
    public boolean mo9423He() {
        return !m34730ug();
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        View$OnClickListenerC2377c cVar = this.f8140A0;
        if (cVar != null) {
            cVar.m34719E0();
        }
        RunnableC6832a3 a3Var = this.f8161u0;
        if (a3Var != null) {
            a3Var.invalidate();
        }
        if (this.f8141B0 != null) {
            int i = C1357a0.m37541i(68.0f);
            int i2 = m34737ng() ? C1357a0.m37541i(49.0f) : 0;
            HeaderEditText headerEditText = this.f8141B0;
            int i3 = C4403w.m27984G2() ? i2 : i;
            if (!C4403w.m27984G2()) {
                i = i2;
            }
            if (C1399s0.m37179h0(headerEditText, i3, 0, i, 0)) {
                C1399s0.m37145y0(this.f8141B0);
            }
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i != R.id.menu_btn_addContact) {
            if (i == R.id.menu_btn_clear) {
                m9341T8();
            } else if (i == R.id.menu_btn_search) {
                m9303Yc();
            }
        } else if (this.f8166z0 != null) {
            m34733rg();
        }
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        m34742ih(j, userStatus);
    }

    @Override
    public int mo9413J9() {
        int i = this.f8146G0;
        if (i == 10 || i == 7 || i == 1 || i == 4 || i == 8 || i == 6 || this.f8145F0.size() == 0) {
            return 0;
        }
        int i2 = this.f8146G0;
        return (i2 == 2 || i2 == 7) ? R.drawable.baseline_check_24 : R.drawable.baseline_arrow_forward_24;
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        View[] viewArr = new View[2];
        viewArr[0] = this.f8141B0;
        C3992a aVar = this.f8142C0;
        viewArr[1] = aVar == null ? null : aVar.getInput();
        C1408x.m37087d(viewArr);
    }

    @Override
    public int mo8865M9() {
        return C4896n.m24478e() + this.f8158S0;
    }

    public final void m34775Mg() {
        m34752dh();
        int i = this.f8147H0;
        if (i == 0) {
            this.f30167b.m2375kb(null, 10240, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    RunnableC2374f5.this.m34782Fg(object);
                }
            });
            this.f30167b.m2480e2().m1732I(this);
        } else if (i == 1) {
            m34773Og();
        } else if (i == 2) {
            m34774Ng();
        }
    }

    public final void m34774Ng() {
    }

    @Override
    public void mo23795O4() {
        this.f8157R0 = false;
        m9387Md(false);
    }

    public final void m34773Og() {
        C4383l.m28059a().m28058b(new Runnable() {
            @Override
            public final void run() {
                RunnableC2374f5.this.m34781Gg();
            }
        });
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                RunnableC2374f5.this.m34780Hg(user);
            }
        });
    }

    public final void m34781Gg() {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.RunnableC2374f5.m34781Gg():void");
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23935a(this);
    }

    @Override
    public boolean mo9575Qf(View view, C4601c3 c3Var) {
        C4618d7 d7Var;
        AbstractC5129m0 m0Var = this.f8164x0;
        if (m0Var != null) {
            TdApi.MessageSender l = c3Var.m27040l();
            this.f8144E0 = l;
            m0Var.mo23864X5(this, view, l);
            return true;
        } else if (!m34736og()) {
            return super.mo9575Qf(view, c3Var);
        } else {
            long a = c3Var.m27051a();
            long p = c3Var.m27036p();
            if (p != 0) {
                C10930q6 q6Var = this.f30167b;
                d7Var = new C4618d7(q6Var, q6Var.m2480e2().m1698Q2(p));
            } else {
                C10930q6 q6Var2 = this.f30167b;
                d7Var = new C4618d7(q6Var2, q6Var2.m2771L3(a));
            }
            if (!m34787Ag(d7Var) && !m34767Ug(d7Var, null)) {
                return false;
            }
            this.f8142C0.getSearchInput().setText("");
            return true;
        }
    }

    public final boolean m34771Qg() {
        int i;
        AbstractC5129m0 m0Var;
        if ((m9139w9() != null && m9139w9().f8170c) || (i = this.f8146G0) == 3 || i == 2 || i == 10) {
            return true;
        }
        return i == 1 && (m0Var = this.f8164x0) != null && m0Var.mo23866A6();
    }

    @Override
    public int mo407R9() {
        return R.id.controller_contacts;
    }

    public void m34770Rg(C4618d7 d7Var, View view) {
        int i = this.f8146G0;
        if (!(i == 2 || i == 3 || i == 5)) {
            if (i == 6) {
                mo9397La();
                this.f30167b.m2485dd().m3717S8(this, d7Var.m26869s(), false, null);
                return;
            } else if (i != 7) {
                mo9397La();
                AbstractC5129m0 m0Var = this.f8164x0;
                if (m0Var != null) {
                    TdApi.MessageSender l = d7Var.m26876l();
                    this.f8144E0 = l;
                    if (m0Var.mo23864X5(this, view, l)) {
                        m9298Zb();
                        return;
                    }
                    return;
                } else if (this.f8146G0 == 8) {
                    this.f30167b.m2930B4().m4713c0().m4549t0(this, d7Var.m26869s(), null);
                    return;
                } else {
                    this.f30167b.m2485dd().m3439u7(this, d7Var.m26869s(), null);
                    return;
                }
            }
        }
        m34767Ug(d7Var, (C4022o) view);
    }

    public final void m34769Sg(C4618d7[] d7VarArr) {
        if (d7VarArr.length == 0) {
            C1379j0.m37334d0(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2374f5.this.m34779Ig();
                }
            });
        } else {
            m34748fh(d7VarArr, null, false);
        }
    }

    @Override
    public void mo29399T() {
        ((FrameLayout.LayoutParams) this.f8161u0.getLayoutParams()).bottomMargin = (int) this.f8161u0.getTranslationY();
        this.f8161u0.requestLayout();
        RecyclerView yf = m9534yf();
        if (yf != null) {
            C1399s0.m37195Z(yf, (int) yf.getTranslationY());
        }
    }

    public final void m34768Tg(String str, boolean z) {
        if (str.length() == 0) {
            this.f8140A0.m34718x0();
        } else if (z) {
            m34748fh(this.f8140A0.m34716z0(), str, false);
        } else {
            m34748fh(this.f8166z0, str, false);
        }
    }

    public final boolean m34767Ug(C4618d7 d7Var, C4022o oVar) {
        int i;
        C3992a aVar;
        C9290s0 s0Var;
        C3992a aVar2 = this.f8142C0;
        if ((aVar2 != null && aVar2.m29409G1()) || this.f8157R0) {
            return false;
        }
        if (oVar != null || ((i = this.f8140A0.m34722B0(d7Var.m26869s())) != -1 && (oVar = (C4022o) this.f8161u0.getLayoutManager().mo39262C(i)) == null)) {
            i = -1;
        }
        int yg = m34726yg(d7Var.m26880h());
        if (!m34736og() || yg < 0) {
            int size = this.f8145F0.size() + 1;
            if (this.f8146G0 != 3 || size < this.f30167b.m2858Fc()) {
                this.f8145F0.add(d7Var);
                if (oVar != null) {
                    oVar.m29280O0(true, true);
                }
                if (m34730ug()) {
                    this.f8142C0.m29410F1(d7Var);
                }
                if (!(this.f8145F0.size() != 1 || this.f30157S == null || mo9413J9() == 0)) {
                    this.f30157S.m9617l(this);
                }
            } else {
                C9357x2.C9365h g = this.f30165a.m14584H3().m8985g(oVar);
                C10930q6 q6Var = this.f30167b;
                g.m8969F(this, q6Var, R.drawable.baseline_error_24, C4403w.m27836q2(R.string.ParticipantXLimitReached, q6Var.m2858Fc()));
                return false;
            }
        } else {
            this.f8145F0.remove(yg);
            if (oVar != null) {
                oVar.m29280O0(false, true);
            }
            if (m34730ug()) {
                this.f8142C0.m29402Q1(d7Var);
            }
            if (this.f8145F0.size() == 0 && (s0Var = this.f30157S) != null) {
                s0Var.m9623f();
            }
        }
        if (this.f8140A0.m34717y0() == 1 && (aVar = this.f8142C0) != null) {
            aVar.m29408I1();
        }
        if (this.f8146G0 == 7) {
            this.f8165y0.mo23793l(this.f8145F0);
        }
        if (i != -1) {
            this.f8140A0.m39312I(i);
        }
        return true;
    }

    @Override
    public int mo9326V9() {
        return C4896n.m24481b(false);
    }

    public void m34766Vg(boolean z) {
        this.f8150K0 = z;
    }

    @Override
    public int mo418W9() {
        AbstractC5129m0 m0Var;
        if (this.f8146G0 == 10) {
            return R.id.menu_search;
        }
        if (m34737ng()) {
            return R.id.menu_contacts;
        }
        if (this.f8146G0 != 1 || (m0Var = this.f8164x0) == null || !m0Var.mo23866A6()) {
            return 0;
        }
        return R.id.menu_search;
    }

    public void m34765Wg(boolean z, boolean z2) {
        this.f8151L0 = z;
        this.f8152M0 = z2;
    }

    @Override
    public CharSequence mo9313X9() {
        AbstractC5129m0 m0Var;
        if (this.f8146G0 != 1 || (m0Var = this.f8164x0) == null || !m0Var.mo23866A6()) {
            return super.mo9313X9();
        }
        return this.f8164x0.mo23865D6();
    }

    public void m34764Xg(C2376b bVar) {
        int i;
        super.m9476Ad(bVar);
        AbstractC5129m0 m0Var = bVar.f8168a;
        if (m0Var != null) {
            this.f8164x0 = m0Var;
            i = 1;
        } else {
            AbstractC5157z0 z0Var = bVar.f8169b;
            if (z0Var != null) {
                this.f8165y0 = z0Var;
                i = 7;
            } else {
                i = 0;
            }
        }
        if (this.f8146G0 == 0 && i != 0) {
            m34725zg(i);
        }
    }

    @Override
    public void mo29398Y2(int i) {
        if (this.f8158S0 != i) {
            this.f8158S0 = i;
            float f = i;
            this.f8161u0.setTranslationY(f);
            RecyclerView yf = m9534yf();
            if (yf != null) {
                yf.setTranslationY(f);
            }
            int M9 = mo8865M9();
            C9270q1 q1Var = this.f30158T;
            if (q1Var != null) {
                q1Var.m9757I().setBackgroundHeight(M9);
                this.f30158T.m9759H().m9616m(M9);
            }
        }
    }

    public void m34762Yg(TdApi.Chat chat) {
        this.f8148I0 = chat;
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C1399s0.m37162q(this.f8161u0);
        C3992a aVar = this.f8142C0;
        if (aVar != null) {
            aVar.m29401Z();
        }
        if (this.f8147H0 == 0) {
            this.f30167b.m2480e2().m1710N1(this);
        }
    }

    public void m34760Zg(int i, String str) {
        this.f8154O0 = i;
        this.f8155P0 = str;
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

    public void m34758ah(AbstractC2378d dVar) {
        this.f8153N0 = dVar;
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23934b(this, i);
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void m34756bh(int i) {
        this.f8147H0 = i;
    }

    public final void m34754ch() {
        this.f8156Q0 = true;
        TextView textView = this.f8163w0;
        int i = 8;
        if (textView == null) {
            C6847b2 b2Var = new C6847b2(mo4347s());
            this.f8163w0 = b2Var;
            b2Var.setText(C4403w.m27869i1(R.string.NoContacts));
            this.f8163w0.setTextColor(-7697782);
            this.f8163w0.setTextSize(1, 16.0f);
            this.f8163w0.setTypeface(C1389o.m37258k());
            this.f8163w0.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
            if (m9591Cf()) {
                this.f8163w0.setVisibility(8);
            }
            this.f8160t0.addView(this.f8163w0);
        } else if (textView.getParent() == null) {
            TextView textView2 = this.f8163w0;
            if (!m9591Cf()) {
                i = 0;
            }
            textView2.setVisibility(i);
            this.f8160t0.addView(this.f8163w0);
        }
    }

    public final void m34752dh() {
        View view = this.f8162v0;
        if (view == null) {
            View u0 = C1399s0.m37153u0(mo4347s());
            this.f8162v0 = u0;
            this.f8160t0.addView(u0);
        } else if (view.getParent() == null) {
            this.f8162v0.setVisibility(0);
            this.f8160t0.addView(this.f8162v0);
        }
    }

    public final void m34748fh(final C4618d7[] d7VarArr, final String str, final boolean z) {
        if (d7VarArr != null) {
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2374f5.this.m34776Lg(z, d7VarArr, str);
                }
            });
        }
    }

    public final void m34780Hg(TdApi.User user) {
        View$OnClickListenerC2377c cVar = this.f8140A0;
        if (cVar != null) {
            int B0 = cVar.m34722B0(user.f25439id);
            if (B0 != -1) {
                this.f8140A0.m34723A0(B0).m26889C(user, 0);
                m34744hh(B0, false);
            } else if (this.f8166z0 != null) {
                C4779t2.m25630O2(user);
            }
        }
    }

    public final void m34744hh(int i, boolean z) {
        View C = this.f8161u0.getLayoutManager().mo39262C(i);
        C4022o oVar = (C == null || !(C instanceof C4022o)) ? null : (C4022o) C;
        if (oVar != null) {
            if (z) {
                oVar.m29276c1();
            } else {
                oVar.m29279Q0();
            }
            oVar.invalidate();
            return;
        }
        this.f8140A0.m39312I(i);
    }

    public final void m34742ih(long j, TdApi.UserStatus userStatus) {
        int B0;
        View$OnClickListenerC2377c cVar = this.f8140A0;
        if (cVar != null && (B0 = cVar.m34722B0(j)) != -1) {
            this.f8140A0.m34723A0(B0).m26890B(userStatus);
            m34744hh(B0, true);
        }
    }

    @Override
    public boolean mo9549jf(C4601c3 c3Var) {
        return false;
    }

    @Override
    public void mo9222kc() {
        HeaderEditText headerEditText;
        super.mo9222kc();
        int i = this.f8146G0;
        if (i == 1 || i == 4 || i == 8 || i == 6) {
            headerEditText = this.f8141B0;
        } else {
            C3992a aVar = this.f8142C0;
            headerEditText = aVar == null ? null : aVar.getInput();
        }
        C1408x.m37088c(headerEditText);
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        super.mo9208mc(configuration);
        this.f8161u0.post(this);
    }

    public final boolean m34737ng() {
        int i = this.f8146G0;
        return i == 4 || i == 8;
    }

    @Override
    public View mo29397o() {
        return this.f8161u0;
    }

    @Override
    public View mo403oc(Context context) {
        AbstractC5129m0 m0Var;
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f8160t0 = frameLayoutFix;
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
        RunnableC6832a3 a3Var = new RunnableC6832a3(context);
        this.f8161u0 = a3Var;
        View$OnClickListenerC2377c cVar = new View$OnClickListenerC2377c(a3Var, this);
        this.f8140A0 = cVar;
        a3Var.setSectionedAdapter(cVar);
        this.f8161u0.m39422k(new C2375a());
        m9163t8(this.f8161u0);
        this.f8160t0.addView(this.f8161u0);
        if (this.f8146G0 == 10) {
            C9289s sVar = new C9289s(context);
            this.f8143D0 = sVar;
            sVar.setThemedTextColor(this);
            this.f8143D0.m9632D1(C1357a0.m37541i(49.0f), true);
            this.f8143D0.setTitle(this.f8154O0);
            this.f8143D0.setSubtitle(this.f8155P0);
        } else if (m34730ug()) {
            C3992a aVar = new C3992a(context);
            this.f8142C0 = aVar;
            aVar.setHint(m9368P8(this.f8146G0 == 7 ? this.f8165y0.mo23794j6() : R.string.SendMessageTo, this.f8142C0.getInput(), true, false));
            this.f8142C0.setCallback(this);
            List<C4618d7> list = this.f8145F0;
            if (list != null && list.size() > 0) {
                this.f8142C0.m29405M1(this.f8145F0);
                int currentWrapHeight = this.f8142C0.getCurrentWrapHeight();
                this.f8158S0 = currentWrapHeight;
                this.f8161u0.setTranslationY(currentWrapHeight);
                ((FrameLayout.LayoutParams) this.f8161u0.getLayoutParams()).bottomMargin = this.f8158S0;
            }
        } else if (this.f8146G0 != 1 || ((m0Var = this.f8164x0) != null && !m0Var.mo23866A6())) {
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, C4896n.m24478e());
            if (C4403w.m27984G2()) {
                s1.rightMargin = C1357a0.m37541i(68.0f);
                s1.leftMargin = m34737ng() ? C1357a0.m37541i(49.0f) : 0;
            } else {
                s1.leftMargin = C1357a0.m37541i(68.0f);
                s1.rightMargin = m34737ng() ? C1357a0.m37541i(49.0f) : 0;
            }
            HeaderEditText z = HeaderEditText.m14151z(C1379j0.m37307r(context).m14552P1().m9757I(), false, this);
            this.f8141B0 = z;
            z.setPadding(C1357a0.m37541i(5.0f), 0, C1357a0.m37541i(5.0f), 0);
            HeaderEditText headerEditText = this.f8141B0;
            headerEditText.setHint(C4403w.m27869i1(m9368P8(this.f8146G0 == 6 ? R.string.NewSecretChatWith : R.string.Search, headerEditText, true, false)));
            this.f8141B0.addTextChangedListener(this);
            this.f8141B0.setLayoutParams(s1);
        }
        if (m34771Qg()) {
            CustomRecyclerView qf = m9542qf(this.f8160t0);
            List<C4618d7> list2 = this.f8145F0;
            if (list2 != null && list2.size() > 0) {
                qf.setTranslationY(this.f8158S0);
                ((FrameLayout.LayoutParams) qf.getLayoutParams()).bottomMargin = this.f8158S0;
            }
        }
        m34775Mg();
        return this.f8160t0;
    }

    public final boolean m34736og() {
        int i = this.f8146G0;
        return i == 2 || i == 3 || i == 5 || i == 7;
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        mo29395q(charSequence.toString());
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_contacts) {
            d1Var.m10104N1(linearLayout, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, mo9375O9(), this, C1357a0.m37541i(49.0f));
        } else if (i == R.id.menu_search) {
            d1Var.m10050k2(linearLayout, this, mo9375O9());
        }
    }

    @Override
    public void mo29396p3(long j) {
        C9290s0 s0Var;
        int yg = m34726yg(j);
        if (yg != -1) {
            this.f8145F0.remove(yg);
            if (this.f8145F0.size() == 0 && (s0Var = this.f30157S) != null) {
                s0Var.m9623f();
            }
            C4618d7[] d7VarArr = this.f8166z0;
            int length = d7VarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (d7VarArr[i].m26880h() == j) {
                    View C = this.f8161u0.getLayoutManager().mo39262C(i2);
                    if (C != null && (C instanceof C4022o)) {
                        C4022o oVar = (C4022o) C;
                        if (oVar.getUser().m26880h() == j) {
                            oVar.m29280O0(false, true);
                        }
                    }
                    this.f8140A0.m39312I(i2);
                } else {
                    i2++;
                    i++;
                }
            }
            if (this.f8146G0 == 7) {
                this.f8165y0.mo23793l(this.f8145F0);
            }
        }
    }

    public int compare(TdApi.User user, TdApi.User user2) {
        return C4618d7.m26873o(user).compareTo(C4618d7.m26873o(user2));
    }

    @Override
    public void mo29395q(String str) {
        TextView textView;
        TextView textView2;
        if (this.f8159T0 == null) {
            this.f8159T0 = "";
        }
        if (!str.equals(this.f8159T0)) {
            boolean z = false;
            if (m34771Qg()) {
                boolean z2 = !this.f8159T0.isEmpty();
                boolean isEmpty = true ^ str.isEmpty();
                this.f8159T0 = str;
                if (z2 != isEmpty) {
                    if (isEmpty) {
                        m9544of(str);
                        if (this.f8156Q0 && (textView2 = this.f8163w0) != null) {
                            textView2.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    m9545nf();
                    if (this.f8156Q0 && (textView = this.f8163w0) != null) {
                        textView.setVisibility(0);
                    }
                } else if (isEmpty) {
                    m9543pf(str);
                }
            } else {
                C4618d7[] d7VarArr = this.f8166z0;
                if (d7VarArr != null && d7VarArr.length > 0) {
                    String p = C1363c0.m37417p(str.trim().toLowerCase());
                    if (!p.equals(this.f8159T0)) {
                        if (p.length() > this.f8159T0.length() && this.f8159T0.length() > 0 && p.startsWith(this.f8159T0)) {
                            z = true;
                        }
                        m34768Tg(p, z);
                        this.f8159T0 = p;
                    }
                }
            }
        }
    }

    public final void m34734qg() {
        int size = this.f8145F0.size();
        if (!(size == 0 || this.f8157R0)) {
            m9387Md(true);
            this.f8157R0 = true;
            long[] jArr = new long[size];
            for (int i = 0; i < size; i++) {
                jArr[i] = this.f8145F0.get(i).m26869s();
            }
            this.f30167b.m2270r4().m14783o(new TdApi.AddChatMembers(this.f8148I0.f25367id, jArr), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    RunnableC2374f5.this.m34786Bg(object);
                }
            });
        }
    }

    @Override
    public void mo9174rc() {
        int i = this.f8146G0;
        if (i == 2) {
            m34734qg();
        } else if (i == 3) {
            m34732sg();
        }
    }

    public final void m34733rg() {
        View$OnClickListenerC2393fk fkVar = new View$OnClickListenerC2393fk(this.f30165a, this.f30167b);
        fkVar.m34654vg(2);
        m9291ac(fkVar);
    }

    @Override
    public void run() {
        this.f8161u0.requestLayout();
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (this.f8146G0 == 2 && m9157te() == 3 && (m9164se(1) instanceof View$OnClickListenerC2740n5)) {
            m9287b9(1);
        }
    }

    public final void m34732sg() {
        int size = this.f8145F0.size();
        if (!(size == 0 || this.f8157R0)) {
            m9387Md(true);
            this.f8157R0 = true;
            final ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(this.f8145F0.get(i));
            }
            C4383l.m28059a().m28058b(new Runnable() {
                @Override
                public final void run() {
                    RunnableC2374f5.this.m34783Eg(arrayList);
                }
            });
        }
    }

    public final AbstractC2378d m34731tg() {
        return new AbstractC2378d() {
        };
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    public final boolean m34730ug() {
        int i = this.f8146G0;
        return i == 2 || i == 3 || i == 7;
    }

    public final void m34729vg() {
        this.f8156Q0 = false;
        TextView textView = this.f8163w0;
        if (textView != null && textView.getParent() != null) {
            this.f8163w0.setVisibility(8);
            this.f8160t0.removeView(this.f8163w0);
        }
    }

    @Override
    public boolean mo9134we() {
        C3992a aVar = this.f8142C0;
        return aVar == null || !aVar.m29409G1();
    }

    @Override
    public int mo9536wf() {
        int i;
        if (m9139w9() != null && m9139w9().f8170c) {
            return m9139w9().f8171d;
        }
        int i2 = 0;
        int i3 = 12549 | ((this.f8150K0 || (i = this.f8146G0) == 2 || i == 3) ? 0 : 64);
        boolean z = this.f8151L0;
        if (!z && !this.f8152M0) {
            i2 = 16;
        } else if (!z || !this.f8152M0) {
            i2 = z ? Log.TAG_VOICE : Log.TAG_VIDEO;
        }
        return i3 | i2;
    }

    public final void m34728wg() {
        View view = this.f8162v0;
        if (view != null && view.getParent() != null) {
            this.f8162v0.setVisibility(8);
            this.f8160t0.removeView(this.f8162v0);
        }
    }

    public final void m34727xg(int i) {
        RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30165a, this.f30167b);
        f5Var.m34725zg(5);
        f5Var.m34756bh(i);
        f5Var.m34758ah(m34731tg());
        m9291ac(f5Var);
    }

    public final int m34726yg(long j) {
        for (int i = 0; i < this.f8145F0.size(); i++) {
            if (this.f8145F0.get(i).m26880h() == j) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public View mo9533zf() {
        return this.f8161u0;
    }

    public void m34725zg(int i) {
        this.f8146G0 = i;
        if (i == 2 || i == 3 || i == 5 || i == 7) {
            int i2 = 10;
            if (i == 7) {
                long[] q4 = this.f8165y0.mo23792q4();
                if (q4 != null) {
                    i2 = q4.length;
                }
                this.f8145F0 = new ArrayList(i2);
                if (q4 != null) {
                    for (long j : q4) {
                        long q = C7316a.m17044q(j);
                        if (q != 0) {
                            TdApi.User v2 = this.f30167b.m2480e2().m1583v2(q);
                            if (v2 != null) {
                                this.f8145F0.add(new C4618d7(this.f30167b, v2));
                            }
                        } else {
                            TdApi.Chat U2 = this.f30167b.m2632U2(j);
                            if (U2 != null) {
                                this.f8145F0.add(new C4618d7(this.f30167b, U2));
                            }
                        }
                    }
                    return;
                }
                return;
            }
            this.f8145F0 = new ArrayList(10);
        }
    }

    public static class C2376b {
        public AbstractC5129m0 f8168a;
        public AbstractC5157z0 f8169b;
        public boolean f8170c;
        public int f8171d;

        public C2376b(AbstractC5129m0 m0Var) {
            this.f8168a = m0Var;
        }

        public C2376b m34724a(int i) {
            this.f8170c = true;
            this.f8171d = i;
            return this;
        }

        public C2376b(AbstractC5157z0 z0Var) {
            this.f8169b = z0Var;
        }
    }
}
