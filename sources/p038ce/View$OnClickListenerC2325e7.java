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
            if (raVar.m32835j() == R.id.edit_proxy_tcpOnly) {
                cVar.getToggler().m10186r(View$OnClickListenerC2325e7.this.f8006B0.m32848b(), z);
            }
        }

        @Override
        public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            switch (raVar.m32835j()) {
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
        public boolean mo25355a(char c) {
            return C1363c0.m37460N(c);
        }
    }

    public class C2328c extends RecyclerView.AbstractC0901o {
        public C2328c() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            C2964ra raVar = (C2964ra) view.getTag();
            switch (raVar != null ? raVar.m32835j() : 0) {
                case R.id.edit_proxy_password:
                case R.id.edit_proxy_port:
                case R.id.edit_proxy_secret:
                    rect.bottom = C1357a0.m37541i(12.0f);
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

    public void m35095qf(boolean z, String str, int i, TdApi.ProxyType proxyType) {
        AbstractC9323v4<?> L;
        m34624if(false);
        if (!m9347Sa() && z) {
            C4868i.m24726c2().m24625p(str, i, proxyType, null, true, m9131x9().f8016b != null ? m9131x9().f8016b.f16689a : 0);
            C9270q1 q1Var = this.f30158T;
            if (!(q1Var == null || (L = q1Var.m9751L()) == null || L.mo407R9() == R.id.controller_proxyList)) {
                this.f30158T.m9749M().m9497p(new View$OnLongClickListenerC2502hx(this.f30165a, this.f30167b));
            }
            m9298Zb();
        }
    }

    public void m35094rf(final String str, final int i, final TdApi.ProxyType proxyType, TdApi.Object object) {
        final boolean z;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 196049779) {
            z = true;
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2325e7.this.m35095qf(z, str, i, proxyType);
                }
            });
        }
        z = false;
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2325e7.this.m35095qf(z, str, i, proxyType);
            }
        });
    }

    public void m35093sf(String str) {
        HandlerC10770jj dd = this.f30167b.m2485dd();
        AbstractView$OnTouchListenerC7889a aVar = this.f30165a;
        dd.m3578g8(new C10534a9(aVar, aVar.m14410z0()), str);
    }

    @Override
    public void mo419J(int i, View view) {
        if (i != R.id.menu_btn_delete) {
            if (i == R.id.menu_btn_forward) {
                C1408x.m37088c(m9333U9());
                this.f30167b.m2674R5(m9131x9().f8016b, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC2325e7.this.m35093sf((String) obj);
                    }
                });
            }
        } else if (C4868i.m24726c2().m24839M3(m9131x9().f8016b.f16689a)) {
            m34629cf();
        }
    }

    @Override
    public void mo30698K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        switch (i) {
            case R.id.edit_proxy_password:
            case R.id.edit_proxy_port:
            case R.id.edit_proxy_secret:
            case R.id.edit_proxy_server:
            case R.id.edit_proxy_username:
                m35096pf(i);
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
    public int mo31415Re() {
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
            return C4403w.m27869i1(R.string.Socks5Proxy);
        }
        if (i != 2) {
            return i != 3 ? "" : C4403w.m27869i1(R.string.HttpProxy);
        }
        return C4403w.m27869i1(R.string.MtprotoProxy);
    }

    @Override
    public void mo30697Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        int i;
        int i2;
        C2326a aVar = new C2326a(this);
        this.f8007v0 = aVar;
        int i3 = 1;
        aVar.m34250A2(this, m9131x9().f8016b == null);
        this.f8007v0.m34211S2(this);
        C4868i.C4880l lVar = m9131x9().f8016b;
        int i4 = m9131x9().f8015a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(70, 0, 0, R.string.Connection));
        arrayList.add(new C2964ra(2));
        String str = "";
        C2964ra L = new C2964ra(34, R.id.edit_proxy_server, 0, R.string.UseProxyServer).m32847b0(lVar != null ? lVar.f16690b : str).m32865L(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.f8008w0 = L;
        arrayList.add(L);
        C2964ra raVar = new C2964ra(34, R.id.edit_proxy_port, 0, R.string.UseProxyPort);
        if (lVar != null) {
            str = Integer.toString(lVar.f16691c);
        }
        C2964ra L2 = raVar.m32847b0(str).m32865L(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.f8009x0 = L2;
        arrayList.add(L2);
        if (i4 == 3) {
            C2964ra E = new C2964ra(7, (int) R.id.edit_proxy_tcpOnly, 0, (int) R.string.HttpProxyTransparent, (int) R.id.edit_proxy_tcpOnly, false).m32872E(lVar != null && !((TdApi.ProxyTypeHttp) lVar.f16681M).httpOnly);
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
                C2964ra L3 = new C2964ra(34, R.id.edit_proxy_secret, 0, R.string.ProxySecretHint).m32865L(new InputFilter[]{new C2327b()});
                if (lVar != null) {
                    str2 = ((TdApi.ProxyTypeMtproto) lVar.f16681M).secret;
                }
                C2964ra b0 = L3.m32847b0(str2);
                this.f8005A0 = b0;
                arrayList.add(b0);
                arrayList.add(new C2964ra(3));
                this.f8007v0.m34116x2(arrayList, false);
                recyclerView.setOverScrollMode(2);
                recyclerView.m39434g(new C2328c());
                recyclerView.m39434g(new C6897h1(recyclerView, this).m18531m(2, i + 2).m18531m(i2, i3 + i2));
                recyclerView.setAdapter(this.f8007v0);
                mo31397hf(false);
                m34628df(R.drawable.baseline_check_24);
            } else if (i4 != 3) {
                throw new IllegalStateException();
            }
        }
        arrayList.add(new C2964ra(8, 0, 0, R.string.ProxyCredentialsOptional));
        arrayList.add(new C2964ra(2));
        i2 = arrayList.size();
        C2964ra b02 = new C2964ra(34, R.id.edit_proxy_username, 0, R.string.ProxyUsernameHint).m32847b0(lVar != null ? C4868i.m24876H1(lVar.f16681M) : null);
        this.f8010y0 = b02;
        arrayList.add(b02);
        C2964ra P = new C2964ra(34, R.id.edit_proxy_password, 0, R.string.ProxyPasswordHint).m32861P(new AbstractC2420g6.C2421a(6, this));
        if (lVar != null) {
            str2 = C4868i.m24897E1(lVar.f16681M);
        }
        C2964ra b03 = P.m32847b0(str2);
        this.f8011z0 = b03;
        arrayList.add(b03);
        arrayList.add(new C2964ra(3));
        i3 = 2;
        this.f8007v0.m34116x2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.m39434g(new C2328c());
        recyclerView.m39434g(new C6897h1(recyclerView, this).m18531m(2, i + 2).m18531m(i2, i3 + i2));
        recyclerView.setAdapter(this.f8007v0);
        mo31397hf(false);
        m34628df(R.drawable.baseline_check_24);
    }

    @Override
    public boolean mo30696af() {
        TdApi.ProxyType proxyType;
        String trim = this.f8008w0.m32821x().trim();
        String trim2 = this.f8009x0.m32821x().trim();
        if (!C5070i.m24057m(trim2)) {
            trim2 = "";
        }
        boolean isEmpty = trim.isEmpty();
        boolean isEmpty2 = trim2.isEmpty();
        if (isEmpty) {
            this.f8007v0.m34178e3(R.id.edit_proxy_server, false, true);
        }
        if (isEmpty2) {
            this.f8007v0.m34178e3(R.id.edit_proxy_port, false, true);
        }
        if (isEmpty || isEmpty2) {
            return false;
        }
        int i = m9131x9().f8015a;
        if (i == 1) {
            proxyType = new TdApi.ProxyTypeSocks5(this.f8010y0.m32821x(), this.f8011z0.m32821x());
        } else if (i == 2) {
            proxyType = new TdApi.ProxyTypeMtproto(this.f8005A0.m32821x());
        } else if (i == 3) {
            proxyType = new TdApi.ProxyTypeHttp(this.f8010y0.m32821x(), this.f8011z0.m32821x(), !this.f8006B0.m32848b());
        } else {
            throw new IllegalStateException();
        }
        m35097of(trim, C5070i.m24051s(trim2), proxyType);
        return true;
    }

    @Override
    public void mo30695bf(boolean z) {
        m9387Md(z);
    }

    public final void m35097of(final String str, final int i, final TdApi.ProxyType proxyType) {
        m34624if(true);
        this.f30167b.m2270r4().m14783o(new TdApi.AddProxy(str, i, false, proxyType), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2325e7.this.m35094rf(str, i, proxyType, object);
            }
        });
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        if (raVar.m32835j() == R.id.edit_proxy_tcpOnly) {
            raVar.m32872E(this.f8007v0.m34201W2(view));
            m35096pf(0);
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_proxy) {
            if (this.f30167b.m2519ba() != 0) {
                d1Var.m10073Z1(linearLayout, this, mo9375O9());
            }
            d1Var.m10087U1(linearLayout, this, mo9375O9());
        }
    }

    public final void m35096pf(int i) {
        boolean z = false;
        if (i != 0) {
            this.f8007v0.m34178e3(i, false, false);
        }
        String trim = this.f8008w0.m32821x().trim();
        String trim2 = this.f8009x0.m32821x().trim();
        if (!trim.isEmpty() && !trim2.isEmpty()) {
            z = true;
        }
        mo31397hf(z);
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
