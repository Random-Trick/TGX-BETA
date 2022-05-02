package p038ce;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1408x;
import ge.C4868i;
import java.util.ArrayList;
import me.C6897h1;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.AbstractC2420g6;
import p038ce.C2546iq;
import p066eb.AbstractC4178a;
import p082fd.C4403w;
import p108hb.C5070i;
import p139jb.AbstractC5918j;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9201h1;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2325e7 extends AbstractC2420g6<C2329d> implements C2546iq.AbstractC2551e, AbstractC9201h1, View.OnClickListener {
    public C2964ra f8005A0;
    public C2964ra f8006B0;
    public C2546iq f8007v0;
    public C2964ra f8008w0;
    public C2964ra f8009x0;
    public C2964ra f8010y0;
    public C2964ra f8011z0;

    public class C2326a extends C2546iq {
        public C2326a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32838j() == R.id.edit_proxy_tcpOnly) {
                cVar.getToggler().m10185r(View$OnClickListenerC2325e7.this.f8006B0.m32851b(), z);
            }
        }

        @Override
        public void mo30692v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            switch (raVar.m32838j()) {
                case R.id.edit_proxy_password:
                    y1Var.getEditText().setInputType(Log.TAG_YOUTUBE);
                    y1Var.getEditText().setIsPassword(true);
                    return;
                case R.id.edit_proxy_port:
                    y1Var.getEditText().setInputType(2);
                    y1Var.getEditText().setIsPassword(false);
                    return;
                case R.id.edit_proxy_secret:
                case R.id.edit_proxy_tcpOnly:
                default:
                    return;
                case R.id.edit_proxy_server:
                    y1Var.getEditText().setInputType(17);
                    y1Var.getEditText().setIsPassword(false);
                    return;
                case R.id.edit_proxy_username:
                    y1Var.getEditText().setInputType(33);
                    y1Var.getEditText().setIsPassword(false);
                    return;
            }
        }
    }

    public class C2327b extends AbstractC4178a {
        public C2327b() {
        }

        @Override
        public boolean mo25356a(char c) {
            return C1363c0.m37463N(c);
        }
    }

    public class C2328c extends RecyclerView.AbstractC0901o {
        public C2328c() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            C2964ra raVar = (C2964ra) view.getTag();
            switch (raVar != null ? raVar.m32838j() : 0) {
                case R.id.edit_proxy_password:
                case R.id.edit_proxy_port:
                case R.id.edit_proxy_secret:
                    rect.bottom = C1357a0.m37544i(12.0f);
                    return;
                default:
                    rect.bottom = 0;
                    return;
            }
        }
    }

    public View$OnClickListenerC2325e7(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35098qf(boolean z, String str, int i, TdApi.ProxyType proxyType) {
        AbstractC9323v4<?> L;
        m34627if(false);
        if (!m9347Sa() && z) {
            C4868i.m24727c2().m24626p(str, i, proxyType, null, true, m9131x9().f8016b != null ? m9131x9().f8016b.f16689a : 0);
            C9270q1 q1Var = this.f30161T;
            if (!(q1Var == null || (L = q1Var.m9750L()) == null || L.mo407R9() == R.id.controller_proxyList)) {
                this.f30161T.m9748M().m9497p(new View$OnLongClickListenerC2502hx(this.f30168a, this.f30170b));
            }
            m9298Zb();
        }
    }

    public void m35097rf(final String str, final int i, final TdApi.ProxyType proxyType, TdApi.Object object) {
        final boolean z;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == 196049779) {
            z = true;
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2325e7.this.m35098qf(z, str, i, proxyType);
                }
            });
        }
        z = false;
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2325e7.this.m35098qf(z, str, i, proxyType);
            }
        });
    }

    public void m35096sf(String str) {
        HandlerC10770jj dd = this.f30170b.m2485dd();
        AbstractView$OnTouchListenerC7889a aVar = this.f30168a;
        dd.m3578g8(new C10534a9(aVar, aVar.m14409z0()), str);
    }

    @Override
    public void mo419J(int i, View view) {
        if (i != R.id.menu_btn_delete) {
            if (i == R.id.menu_btn_forward) {
                C1408x.m37091c(m9333U9());
                this.f30170b.m2674R5(m9131x9().f8016b, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2325e7.this.m35096sf((String) obj);
                    }
                });
            }
        } else if (C4868i.m24727c2().m24840M3(m9131x9().f8016b.f16689a)) {
            m34632cf();
        }
    }

    @Override
    public void mo30700K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        switch (i) {
            case R.id.edit_proxy_password:
            case R.id.edit_proxy_port:
            case R.id.edit_proxy_secret:
            case R.id.edit_proxy_server:
            case R.id.edit_proxy_username:
                m35099pf(i);
                return;
            case R.id.edit_proxy_tcpOnly:
            default:
                return;
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_proxy;
    }

    @Override
    public int mo31417Re() {
        return R.id.theme_color_background;
    }

    @Override
    public int mo418W9() {
        return 0;
    }

    @Override
    public CharSequence mo9313X9() {
        int i = m9131x9().f8015a;
        if (i == 1) {
            return C4403w.m27871i1(R.string.Socks5Proxy);
        }
        if (i != 2) {
            return i != 3 ? "" : C4403w.m27871i1(R.string.HttpProxy);
        }
        return C4403w.m27871i1(R.string.MtprotoProxy);
    }

    @Override
    public void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        int i;
        int i2;
        C2326a aVar = new C2326a(this);
        this.f8007v0 = aVar;
        int i3 = 1;
        aVar.m34253A2(this, m9131x9().f8016b == null);
        this.f8007v0.m34214S2(this);
        C4868i.C4880l lVar = m9131x9().f8016b;
        int i4 = m9131x9().f8015a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(70, 0, 0, R.string.Connection));
        arrayList.add(new C2964ra(2));
        String str = "";
        C2964ra L = new C2964ra(34, R.id.edit_proxy_server, 0, R.string.UseProxyServer).m32850b0(lVar != null ? lVar.f16690b : str).m32868L(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.f8008w0 = L;
        arrayList.add(L);
        C2964ra raVar = new C2964ra(34, R.id.edit_proxy_port, 0, R.string.UseProxyPort);
        if (lVar != null) {
            str = Integer.toString(lVar.f16691c);
        }
        C2964ra L2 = raVar.m32850b0(str).m32868L(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.f8009x0 = L2;
        arrayList.add(L2);
        if (i4 == 3) {
            C2964ra E = new C2964ra(7, (int) R.id.edit_proxy_tcpOnly, 0, (int) R.string.HttpProxyTransparent, (int) R.id.edit_proxy_tcpOnly, false).m32875E(lVar != null && !((TdApi.ProxyTypeHttp) lVar.f16681M).httpOnly);
            this.f8006B0 = E;
            arrayList.add(E);
            i = 3;
        } else {
            i = 2;
        }
        arrayList.add(new C2964ra(3));
        if (i4 == 3) {
            arrayList.add(new C2964ra(9, 0, 0, R.string.HttpProxyTransparentHint));
        }
        String str2 = null;
        if (i4 != 1) {
            if (i4 == 2) {
                arrayList.add(new C2964ra(8, 0, 0, R.string.ProxyCredentials));
                arrayList.add(new C2964ra(2));
                i2 = arrayList.size();
                C2964ra L3 = new C2964ra(34, R.id.edit_proxy_secret, 0, R.string.ProxySecretHint).m32868L(new InputFilter[]{new C2327b()});
                if (lVar != null) {
                    str2 = ((TdApi.ProxyTypeMtproto) lVar.f16681M).secret;
                }
                C2964ra b0 = L3.m32850b0(str2);
                this.f8005A0 = b0;
                arrayList.add(b0);
                arrayList.add(new C2964ra(3));
                this.f8007v0.m34119x2(arrayList, false);
                recyclerView.setOverScrollMode(2);
                recyclerView.m39437g(new C2328c());
                recyclerView.m39437g(new C6897h1(recyclerView, this).m18531m(2, i + 2).m18531m(i2, i3 + i2));
                recyclerView.setAdapter(this.f8007v0);
                mo31399hf(false);
                m34631df(R.drawable.baseline_check_24);
            } else if (i4 != 3) {
                throw new IllegalStateException();
            }
        }
        arrayList.add(new C2964ra(8, 0, 0, R.string.ProxyCredentialsOptional));
        arrayList.add(new C2964ra(2));
        i2 = arrayList.size();
        C2964ra b02 = new C2964ra(34, R.id.edit_proxy_username, 0, R.string.ProxyUsernameHint).m32850b0(lVar != null ? C4868i.m24877H1(lVar.f16681M) : null);
        this.f8010y0 = b02;
        arrayList.add(b02);
        C2964ra P = new C2964ra(34, R.id.edit_proxy_password, 0, R.string.ProxyPasswordHint).m32864P(new AbstractC2420g6.C2421a(6, this));
        if (lVar != null) {
            str2 = C4868i.m24898E1(lVar.f16681M);
        }
        C2964ra b03 = P.m32850b0(str2);
        this.f8011z0 = b03;
        arrayList.add(b03);
        arrayList.add(new C2964ra(3));
        i3 = 2;
        this.f8007v0.m34119x2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.m39437g(new C2328c());
        recyclerView.m39437g(new C6897h1(recyclerView, this).m18531m(2, i + 2).m18531m(i2, i3 + i2));
        recyclerView.setAdapter(this.f8007v0);
        mo31399hf(false);
        m34631df(R.drawable.baseline_check_24);
    }

    @Override
    public boolean mo30698af() {
        TdApi.ProxyType proxyType;
        String trim = this.f8008w0.m32824x().trim();
        String trim2 = this.f8009x0.m32824x().trim();
        if (!C5070i.m24058m(trim2)) {
            trim2 = "";
        }
        boolean isEmpty = trim.isEmpty();
        boolean isEmpty2 = trim2.isEmpty();
        if (isEmpty) {
            this.f8007v0.m34181e3(R.id.edit_proxy_server, false, true);
        }
        if (isEmpty2) {
            this.f8007v0.m34181e3(R.id.edit_proxy_port, false, true);
        }
        if (isEmpty || isEmpty2) {
            return false;
        }
        int i = m9131x9().f8015a;
        if (i == 1) {
            proxyType = new TdApi.ProxyTypeSocks5(this.f8010y0.m32824x(), this.f8011z0.m32824x());
        } else if (i == 2) {
            proxyType = new TdApi.ProxyTypeMtproto(this.f8005A0.m32824x());
        } else if (i == 3) {
            proxyType = new TdApi.ProxyTypeHttp(this.f8010y0.m32824x(), this.f8011z0.m32824x(), !this.f8006B0.m32851b());
        } else {
            throw new IllegalStateException();
        }
        m35100of(trim, C5070i.m24052s(trim2), proxyType);
        return true;
    }

    @Override
    public void mo30697bf(boolean z) {
        m9387Md(z);
    }

    public final void m35100of(final String str, final int i, final TdApi.ProxyType proxyType) {
        m34627if(true);
        this.f30170b.m2270r4().m14783o(new TdApi.AddProxy(str, i, false, proxyType), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2325e7.this.m35097rf(str, i, proxyType, object);
            }
        });
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32838j() == R.id.edit_proxy_tcpOnly) {
            raVar.m32875E(this.f8007v0.m34204W2(view));
            m35099pf(0);
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_proxy) {
            if (this.f30170b.m2519ba() != 0) {
                d1Var.m10072Z1(linearLayout, this, mo9375O9());
            }
            d1Var.m10086U1(linearLayout, this, mo9375O9());
        }
    }

    public final void m35099pf(int i) {
        boolean z = false;
        if (i != 0) {
            this.f8007v0.m34181e3(i, false, false);
        }
        String trim = this.f8008w0.m32824x().trim();
        String trim2 = this.f8009x0.m32824x().trim();
        if (!trim.isEmpty() && !trim2.isEmpty()) {
            z = true;
        }
        mo31399hf(z);
    }

    public static class C2329d {
        public int f8015a;
        public C4868i.C4880l f8016b;

        public C2329d(int i) {
            this.f8015a = i;
        }

        public C2329d(C4868i.C4880l lVar) {
            int constructor = lVar.f16681M.getConstructor();
            if (constructor == -1964826627) {
                this.f8015a = 2;
            } else if (constructor == -1547188361) {
                this.f8015a = 3;
            } else if (constructor == -890027341) {
                this.f8015a = 1;
            } else {
                throw new IllegalArgumentException("proxy.type == " + lVar.f16681M);
            }
            this.f8016b = lVar;
        }
    }
}
