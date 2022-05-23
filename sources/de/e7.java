package de;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.x;
import de.g6;
import de.iq;
import gd.w;
import he.i;
import java.util.ArrayList;
import kb.j;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.h1;
import ud.q1;
import ud.v4;
import zd.hj;
import zd.o6;
import zd.y8;

public class e7 extends g6<d> implements iq.e, h1, View.OnClickListener {
    public ra A0;
    public ra B0;
    public iq f7833v0;
    public ra f7834w0;
    public ra f7835x0;
    public ra f7836y0;
    public ra f7837z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            if (raVar.j() == R.id.edit_proxy_tcpOnly) {
                cVar.getToggler().r(e7.this.B0.b(), z10);
            }
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            switch (raVar.j()) {
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

    public class b extends fb.a {
        public b() {
        }

        @Override
        public boolean a(char c10) {
            return c0.N(c10);
        }
    }

    public class c extends RecyclerView.o {
        public c() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            ra raVar = (ra) view.getTag();
            switch (raVar != null ? raVar.j() : 0) {
                case R.id.edit_proxy_password:
                case R.id.edit_proxy_port:
                case R.id.edit_proxy_secret:
                    rect.bottom = a0.i(12.0f);
                    return;
                default:
                    rect.bottom = 0;
                    return;
            }
        }
    }

    public e7(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void qf(boolean z10, String str, int i10, TdApi.ProxyType proxyType) {
        v4<?> L;
        m2if(false);
        if (!Sa() && z10) {
            i.c2().p(str, i10, proxyType, null, true, x9().f7842b != null ? x9().f7842b.f13863a : 0);
            q1 q1Var = this.T;
            if (!(q1Var == null || (L = q1Var.L()) == null || L.R9() == R.id.controller_proxyList)) {
                this.T.M().p(new ix(this.f24493a, this.f24495b));
            }
            Zb();
        }
    }

    public void rf(final String str, final int i10, final TdApi.ProxyType proxyType, TdApi.Object object) {
        final boolean z10;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 196049779) {
            z10 = true;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    e7.this.qf(z10, str, i10, proxyType);
                }
            });
        }
        z10 = false;
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                e7.this.qf(z10, str, i10, proxyType);
            }
        });
    }

    public void sf(String str) {
        hj hd2 = this.f24495b.hd();
        org.thunderdog.challegram.a aVar = this.f24493a;
        hd2.g8(new y8(aVar, aVar.C0()), str);
    }

    @Override
    public void J(int i10, View view) {
        if (i10 != R.id.menu_btn_delete) {
            if (i10 == R.id.menu_btn_forward) {
                x.c(U9());
                this.f24495b.V5(x9().f7842b, new j() {
                    @Override
                    public final void a(Object obj) {
                        e7.this.sf((String) obj);
                    }
                });
            }
        } else if (i.c2().M3(x9().f7842b.f13863a)) {
            cf();
        }
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        switch (i10) {
            case R.id.edit_proxy_password:
            case R.id.edit_proxy_port:
            case R.id.edit_proxy_secret:
            case R.id.edit_proxy_server:
            case R.id.edit_proxy_username:
                pf(i10);
                return;
            case R.id.edit_proxy_tcpOnly:
            default:
                return;
        }
    }

    @Override
    public int R9() {
        return R.id.controller_proxy;
    }

    @Override
    public int Re() {
        return R.id.theme_color_background;
    }

    @Override
    public int W9() {
        return 0;
    }

    @Override
    public CharSequence X9() {
        int i10 = x9().f7841a;
        if (i10 == 1) {
            return w.i1(R.string.Socks5Proxy);
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : w.i1(R.string.HttpProxy);
        }
        return w.i1(R.string.MtprotoProxy);
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        int i10;
        int i11;
        a aVar = new a(this);
        this.f7833v0 = aVar;
        int i12 = 1;
        aVar.v2(this, x9().f7842b == null);
        this.f7833v0.O2(this);
        i.l lVar = x9().f7842b;
        int i13 = x9().f7841a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(70, 0, 0, R.string.Connection));
        arrayList.add(new ra(2));
        String str = "";
        ra L = new ra(34, R.id.edit_proxy_server, 0, R.string.UseProxyServer).b0(lVar != null ? lVar.f13864b : str).L(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.f7834w0 = L;
        arrayList.add(L);
        ra raVar = new ra(34, R.id.edit_proxy_port, 0, R.string.UseProxyPort);
        if (lVar != null) {
            str = Integer.toString(lVar.f13865c);
        }
        ra L2 = raVar.b0(str).L(new InputFilter[]{new InputFilter.LengthFilter(255)});
        this.f7835x0 = L2;
        arrayList.add(L2);
        if (i13 == 3) {
            ra E = new ra(7, (int) R.id.edit_proxy_tcpOnly, 0, (int) R.string.HttpProxyTransparent, (int) R.id.edit_proxy_tcpOnly, false).E(lVar != null && !((TdApi.ProxyTypeHttp) lVar.M).httpOnly);
            this.B0 = E;
            arrayList.add(E);
            i10 = 3;
        } else {
            i10 = 2;
        }
        arrayList.add(new ra(3));
        if (i13 == 3) {
            arrayList.add(new ra(9, 0, 0, R.string.HttpProxyTransparentHint));
        }
        String str2 = null;
        if (i13 != 1) {
            if (i13 == 2) {
                arrayList.add(new ra(8, 0, 0, R.string.ProxyCredentials));
                arrayList.add(new ra(2));
                i11 = arrayList.size();
                ra L3 = new ra(34, R.id.edit_proxy_secret, 0, R.string.ProxySecretHint).L(new InputFilter[]{new b()});
                if (lVar != null) {
                    str2 = ((TdApi.ProxyTypeMtproto) lVar.M).secret;
                }
                ra b02 = L3.b0(str2);
                this.A0 = b02;
                arrayList.add(b02);
                arrayList.add(new ra(3));
                this.f7833v0.s2(arrayList, false);
                recyclerView.setOverScrollMode(2);
                recyclerView.g(new c());
                recyclerView.g(new ne.h1(recyclerView, this).m(2, i10 + 2).m(i11, i12 + i11));
                recyclerView.setAdapter(this.f7833v0);
                hf(false);
                df(R.drawable.baseline_check_24);
            } else if (i13 != 3) {
                throw new IllegalStateException();
            }
        }
        arrayList.add(new ra(8, 0, 0, R.string.ProxyCredentialsOptional));
        arrayList.add(new ra(2));
        i11 = arrayList.size();
        ra b03 = new ra(34, R.id.edit_proxy_username, 0, R.string.ProxyUsernameHint).b0(lVar != null ? i.H1(lVar.M) : null);
        this.f7836y0 = b03;
        arrayList.add(b03);
        ra P = new ra(34, R.id.edit_proxy_password, 0, R.string.ProxyPasswordHint).P(new g6.a(6, this));
        if (lVar != null) {
            str2 = i.E1(lVar.M);
        }
        ra b04 = P.b0(str2);
        this.f7837z0 = b04;
        arrayList.add(b04);
        arrayList.add(new ra(3));
        i12 = 2;
        this.f7833v0.s2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.g(new c());
        recyclerView.g(new ne.h1(recyclerView, this).m(2, i10 + 2).m(i11, i12 + i11));
        recyclerView.setAdapter(this.f7833v0);
        hf(false);
        df(R.drawable.baseline_check_24);
    }

    @Override
    public boolean af() {
        TdApi.ProxyType proxyType;
        String trim = this.f7834w0.x().trim();
        String trim2 = this.f7835x0.x().trim();
        if (!ib.i.m(trim2)) {
            trim2 = "";
        }
        boolean isEmpty = trim.isEmpty();
        boolean isEmpty2 = trim2.isEmpty();
        if (isEmpty) {
            this.f7833v0.b3(R.id.edit_proxy_server, false, true);
        }
        if (isEmpty2) {
            this.f7833v0.b3(R.id.edit_proxy_port, false, true);
        }
        if (isEmpty || isEmpty2) {
            return false;
        }
        int i10 = x9().f7841a;
        if (i10 == 1) {
            proxyType = new TdApi.ProxyTypeSocks5(this.f7836y0.x(), this.f7837z0.x());
        } else if (i10 == 2) {
            proxyType = new TdApi.ProxyTypeMtproto(this.A0.x());
        } else if (i10 == 3) {
            proxyType = new TdApi.ProxyTypeHttp(this.f7836y0.x(), this.f7837z0.x(), !this.B0.b());
        } else {
            throw new IllegalStateException();
        }
        of(trim, ib.i.s(trim2), proxyType);
        return true;
    }

    @Override
    public void bf(boolean z10) {
        Md(z10);
    }

    public final void of(final String str, final int i10, final TdApi.ProxyType proxyType) {
        m2if(true);
        this.f24495b.v4().o(new TdApi.AddProxy(str, i10, false, proxyType), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                e7.this.rf(str, i10, proxyType, object);
            }
        });
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        if (raVar.j() == R.id.edit_proxy_tcpOnly) {
            raVar.E(this.f7833v0.S2(view));
            pf(0);
        }
    }

    public final void pf(int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            this.f7833v0.b3(i10, false, false);
        }
        String trim = this.f7834w0.x().trim();
        String trim2 = this.f7835x0.x().trim();
        if (!trim.isEmpty() && !trim2.isEmpty()) {
            z10 = true;
        }
        hf(z10);
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_proxy) {
            if (this.f24495b.fa() != 0) {
                d1Var.Y1(linearLayout, this, O9());
            }
            d1Var.S1(linearLayout, this, O9());
        }
    }

    public static class d {
        public int f7841a;
        public i.l f7842b;

        public d(int i10) {
            this.f7841a = i10;
        }

        public d(i.l lVar) {
            int constructor = lVar.M.getConstructor();
            if (constructor == -1964826627) {
                this.f7841a = 2;
            } else if (constructor == -1547188361) {
                this.f7841a = 3;
            } else if (constructor == -890027341) {
                this.f7841a = 1;
            } else {
                throw new IllegalArgumentException("proxy.type == " + lVar.M);
            }
            this.f7842b = lVar;
        }
    }
}
