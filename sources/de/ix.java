package de;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import ce.c0;
import ce.j0;
import de.e7;
import de.ix;
import ed.j;
import ed.k;
import gd.w;
import he.i;
import ie.g0;
import ie.h0;
import ie.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ne.o2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.j1;
import ud.v4;
import zd.hj;
import zd.l0;
import zd.o6;
import zd.y8;

public class ix extends vo<Void> implements View.OnLongClickListener, View.OnClickListener, i.m, l0, j1 {
    public iq D0;
    public List<i.l> E0;
    public int G0;
    public boolean I0;
    public androidx.recyclerview.widget.g K0;
    public boolean L0;
    public kb.b M0;
    public i.l F0 = new i.l(0, null, 0, null, null);
    public h H0 = new h();
    public ra J0 = new ra(7, R.id.btn_useProxyForCalls, 0, R.string.UseProxyForCalls);

    public class a extends d.b {
        public final List f8339a;

        public a(List list) {
            this.f8339a = list;
        }

        @Override
        public boolean a(int i10, int i11) {
            return false;
        }

        @Override
        public boolean b(int i10, int i11) {
            return ix.this.E0.get(i10) == this.f8339a.get(i11);
        }

        @Override
        public int d() {
            return this.f8339a.size();
        }

        @Override
        public int e() {
            return ix.this.E0.size();
        }
    }

    public class b implements t1.d {
        public b() {
        }

        @Override
        public void F6(int i10, int i11, Object obj) {
        }

        @Override
        public void W1(int i10, int i11) {
        }

        @Override
        public void Z3(int i10, int i11) {
        }

        @Override
        public void h0(int i10, int i11) {
            ix.this.oh(i10, i11);
        }
    }

    public class c implements Client.g {
        public final TdApi.Function M;
        public final int N;
        public final int f8342a;
        public final i.l f8343b;
        public final long[] f8344c;

        public c(int i10, i.l lVar, long[] jArr, TdApi.Function function, int i11) {
            this.f8342a = i10;
            this.f8343b = lVar;
            this.f8344c = jArr;
            this.M = function;
            this.N = i11;
        }

        public void b(i.l lVar, int i10, int i11) {
            if (!ix.this.Sa() && lVar.P == i10) {
                ix.this.dh();
                ix.this.D0.r3(ix.this.gh(i11));
            }
        }

        @Override
        public void r2(TdApi.Object object) {
            if (this.f8342a == this.f8343b.P) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long[] jArr = this.f8344c;
                long j10 = uptimeMillis - jArr[0];
                jArr[0] = SystemClock.uptimeMillis();
                switch (object.getConstructor()) {
                    case TdApi.Error.CONSTRUCTOR:
                        i.l lVar = this.f8343b;
                        int i10 = lVar.S + 1;
                        lVar.S = i10;
                        if (i10 >= 3 || j10 > 1000) {
                            lVar.Q = -3L;
                            lVar.R = (TdApi.Error) object;
                            break;
                        } else {
                            ix.this.f24495b.v4().o(new TdApi.SetAlarm(this.f8343b.S * 0.35d), this);
                            return;
                        }
                    case TdApi.Ok.CONSTRUCTOR:
                        ix.this.f24495b.v4().o(this.M, this);
                        return;
                    case TdApi.Proxy.CONSTRUCTOR:
                        ix.this.f24495b.v4().o(new TdApi.PingProxy(((TdApi.Proxy) object).f19956id), this);
                        return;
                    case TdApi.Seconds.CONSTRUCTOR:
                        this.f8343b.Q = Math.round(((TdApi.Seconds) object).seconds * 1000.0d);
                        this.f8343b.S = 0;
                        break;
                }
                hj hd2 = ix.this.f24495b.hd();
                final i.l lVar2 = this.f8343b;
                final int i11 = this.f8342a;
                final int i12 = this.N;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        ix.c.this.b(lVar2, i11, i12);
                    }
                });
            }
        }
    }

    public class d extends iq {
        public d(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            int j10 = raVar.j();
            if (j10 == R.id.btn_noProxy || j10 == R.id.btn_proxy) {
                i.l lVar = (i.l) raVar.d();
                if (lVar != null) {
                    cVar.setName(lVar.e());
                } else {
                    cVar.setName(R.string.ProxyNone);
                    lVar = ix.this.F0;
                }
                ix ixVar = ix.this;
                ixVar.fh(lVar, ixVar.H0);
                cVar.setDataColorId(ix.this.H0.f8349b);
                cVar.setData(ix.this.H0.f8348a);
                o2 L1 = cVar.L1();
                boolean z11 = true;
                if (!z10 || lVar.f13863a == ix.this.G0) {
                    L1.b(lVar.f13863a == ix.this.G0 && ix.this.H0.f8350c, z10);
                }
                if (lVar.f13863a != ix.this.G0) {
                    z11 = false;
                }
                L1.c(z11, z10);
            } else if (j10 == R.id.btn_useProxyForCalls) {
                cVar.getToggler().r(i.c2().H(2), z10);
            }
        }
    }

    public class e implements j.c {
        public e() {
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            if (raVar != null && raVar.j() == R.id.btn_proxy) {
                ix.this.sh((i.l) raVar.d());
            }
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            return raVar != null && raVar.j() == R.id.btn_proxy;
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public boolean d(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            int k10 = c0Var.k();
            int k11 = c0Var2.k();
            int ch = ix.this.ch(k10);
            int ch2 = ix.this.ch(k11);
            if (ch < 0 || ch >= ix.this.E0.size() || ch2 < 0 || ch2 >= ix.this.E0.size() || ch == ch2) {
                return false;
            }
            ix.this.oh(ch, ch2);
            return true;
        }

        @Override
        public float e() {
            return k.a(this);
        }

        @Override
        public void f(int i10, int i11) {
            ix.this.vh();
        }

        @Override
        public int g(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            return (raVar == null || raVar.j() != R.id.btn_proxy || ix.this.E0.size() <= 1) ? 0 : 3;
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override
        public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            throw new UnsupportedOperationException("Method not decompiled: de.ix.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public class g extends kb.b {
        public g() {
        }

        @Override
        public void b() {
            ix.this.xh(false);
        }
    }

    public static class h {
        public CharSequence f8348a;
        public int f8349b;
        public boolean f8350c;

        public h() {
        }

        public void a() {
            this.f8348a = null;
            this.f8350c = false;
            this.f8349b = 0;
        }
    }

    public ix(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void ih(int i10, int i11) {
        if (i10 == 0 && this.L0) {
            xh(false);
        } else if (i11 == 4 || i10 == 4) {
            qh();
        } else {
            this.D0.r3(gh(this.G0));
        }
    }

    public boolean jh(int i10, View view, int i11) {
        if (i11 != R.id.btn_removeProxy) {
            return true;
        }
        th(i10);
        return true;
    }

    public void kh(String str) {
        hj hd2 = this.f24495b.hd();
        org.thunderdog.challegram.a aVar = this.f24493a;
        hd2.g8(new y8(aVar, aVar.C0()), str);
    }

    public static void lh(String str) {
        if (!ib.i.i(str)) {
            j0.i(str, R.string.CopiedLink);
        }
    }

    public boolean mh(i.l lVar, View view, int i10) {
        switch (i10) {
            case R.id.btn_copyLink:
                this.f24495b.V5(lVar, hx.f8217a);
                return true;
            case R.id.btn_editProxy:
                e7 e7Var = new e7(this.f24493a, this.f24495b);
                e7Var.Ad(new e7.d(lVar));
                ac(e7Var);
                return true;
            case R.id.btn_removeProxy:
                sh(lVar);
                return true;
            case R.id.btn_share:
                this.f24495b.V5(lVar, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        ix.this.kh((String) obj);
                    }
                });
                return true;
            default:
                return true;
        }
    }

    public static int nh(i.l lVar, i.l lVar2) {
        long j10 = lVar.Q;
        long j11 = Long.MAX_VALUE;
        if (j10 < 0) {
            j10 = Long.MAX_VALUE;
        }
        long j12 = lVar2.Q;
        if (j12 >= 0) {
            j11 = j12;
        }
        if (j10 != j11) {
            return Long.compare(j10, j11);
        }
        int C1 = i.C1(lVar.M);
        int C12 = i.C1(lVar2.M);
        if (C1 != C12) {
            return Integer.compare(C1, C12);
        }
        return lVar.compareTo(lVar2);
    }

    public static ra ph(i.l lVar) {
        return new ra(90, R.id.btn_proxy).N(lVar.f13863a).G(lVar);
    }

    public static void zh(List<i.l> list) {
        Collections.sort(list, fx.f8005a);
    }

    @Override
    public void P0(int i10) {
        if (i10 != R.id.btn_sortByPing) {
            if (i10 == R.id.btn_toggleErrors) {
                i.c2().f6(4);
                i.l lVar = this.F0;
                if (lVar.R != null) {
                    this.D0.r3(gh(lVar.f13863a));
                }
                int i11 = 0;
                for (i.l lVar2 : this.E0) {
                    if (lVar2.R != null) {
                        this.D0.r3(hh(i11, lVar2.f13863a));
                    }
                    i11++;
                }
            }
        } else if (this.E0.size() > 1) {
            ArrayList arrayList = new ArrayList(this.E0);
            zh(arrayList);
            androidx.recyclerview.widget.d.b(new a(arrayList)).b(new b());
            vh();
        }
    }

    @Override
    public int R9() {
        return R.id.controller_proxyList;
    }

    @Override
    public int W9() {
        return R.id.menu_more;
    }

    @Override
    public void X0(i.l lVar, boolean z10) {
        int i10;
        int binarySearch = Collections.binarySearch(this.E0, lVar);
        if (binarySearch < 0) {
            int i11 = (-binarySearch) - 1;
            if (z10 && (i10 = this.G0) != lVar.f13863a) {
                int gh = gh(i10);
                this.G0 = lVar.f13863a;
                this.D0.I(gh);
            }
            this.E0.add(i11, lVar);
            int L0 = this.D0.L0(R.id.btn_noProxy);
            if (L0 != -1) {
                int i12 = L0 + (i11 * 2) + 1;
                this.D0.D0().add(i12, ph(lVar));
                this.D0.D0().add(i12, new ra(11));
                this.D0.M(i12, 2);
            }
        }
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.Proxy);
    }

    @Override
    public void Z8() {
        super.Z8();
        i.c2().N3(this);
        this.f24495b.O9().r0(this);
    }

    @Override
    public void a3(int i10, String str, int i11, TdApi.ProxyType proxyType, String str2, boolean z10, boolean z11) {
        int gh = gh(this.G0);
        if (!z10) {
            this.D0.r3(gh);
        } else if (!z11 || this.G0 != i10) {
            int gh2 = i10 != this.G0 ? gh(i10) : gh;
            this.G0 = i10;
            i.l eh = eh(i10);
            if (eh != null) {
                eh.f13864b = str;
                eh.f13865c = i11;
                eh.M = proxyType;
                eh.O = str2;
            }
            this.D0.r3(gh);
            if (gh != gh2) {
                uh(gh2);
                xh(true);
                this.D0.r3(gh2);
            }
            wh(i.l.c(proxyType));
        }
    }

    public final void ah(List<ra> list) {
        list.add(new ra(8, 0, 0, R.string.ProxyOther));
        list.add(new ra(2));
        list.add(this.J0);
        list.add(new ra(3));
        list.add(new ra(9, 0, 0, R.string.UseProxyForCallsInfo));
    }

    public final int bh() {
        int i10 = 0;
        for (i.l lVar : this.E0) {
            long j10 = lVar.Q;
            if (j10 >= 0 || j10 == -3) {
                i10++;
            }
        }
        return i10;
    }

    public final int ch(int i10) {
        if (i10 < 7) {
            return -1;
        }
        int i11 = i10 - 7;
        if (i11 > 0) {
            i11 /= 2;
        }
        if (i11 >= this.E0.size() || i11 < 0) {
            return -1;
        }
        return i11;
    }

    @Override
    public void d3(TdApi.NetworkType networkType) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ix.this.qh();
            }
        });
    }

    public final void dh() {
        throw new UnsupportedOperationException("Method not decompiled: de.ix.dh():void");
    }

    @Override
    public void e0(final int i10, final int i11) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ix.this.ih(i10, i11);
            }
        });
    }

    public final i.l eh(int i10) {
        for (i.l lVar : this.E0) {
            if (lVar.f13863a == i10) {
                return lVar;
            }
        }
        return null;
    }

    public final void fh(i.l lVar, h hVar) {
        String str;
        hVar.a();
        int i10 = lVar.f13863a;
        if (lVar.Q == -1) {
            rh(lVar, false);
        }
        int i11 = this.G0;
        int i12 = R.string.format_pingBest;
        if (i10 == i11) {
            int D4 = this.f24495b.D4();
            if (D4 != 0) {
                if (D4 == 3) {
                    hVar.f8348a = w.i1(R.string.network_Updating);
                } else if (D4 != 4) {
                    hVar.f8348a = w.i1(R.string.network_Connecting);
                } else {
                    hVar.f8348a = w.i1(R.string.network_WaitingForNetwork);
                }
            } else if (this.L0) {
                hVar.f8348a = w.i1(R.string.network_Connecting);
            } else {
                long j10 = lVar.Q;
                if (j10 == -1 || j10 == -2) {
                    hVar.f8348a = w.i1(R.string.ProxyChecking);
                    hVar.f8349b = R.id.theme_color_textLink;
                    hVar.f8350c = true;
                } else {
                    hVar.f8349b = R.id.theme_color_textLink;
                    hVar.f8350c = true;
                    if (j10 >= 0) {
                        int i13 = lVar.T;
                        if (i13 != 0) {
                            Object[] objArr = new Object[1];
                            if (i13 != 1) {
                                i12 = R.string.format_ping;
                            }
                            objArr[0] = w.j1(i12, c0.f(j10));
                            hVar.f8348a = w.n1(R.string.ProxyConnected, objArr);
                        } else {
                            hVar.f8348a = w.j1(R.string.ProxyConnected, w.j1(R.string.format_ping, c0.f(j10)));
                        }
                    } else {
                        hVar.f8348a = w.i1(R.string.Connected);
                    }
                }
            }
        } else if (this.f24495b.D4() == 4) {
            hVar.f8348a = w.i1(R.string.ProxyChecking);
        } else {
            long j11 = lVar.Q;
            if (j11 >= 0) {
                hVar.f8349b = R.id.theme_color_textSecure;
                int i14 = lVar.T;
                if (i14 != 0) {
                    Object[] objArr2 = new Object[1];
                    if (i14 != 1) {
                        i12 = R.string.format_ping;
                    }
                    objArr2[0] = w.j1(i12, c0.f(j11));
                    hVar.f8348a = w.n1(R.string.ProxyAvailable, objArr2);
                } else {
                    hVar.f8348a = w.j1(R.string.ProxyAvailable, w.j1(R.string.format_ping, c0.f(j11)));
                }
            } else if (j11 == -3) {
                hVar.f8349b = R.id.theme_color_textNegative;
                if (i.c2().H(4)) {
                    Object[] objArr3 = new Object[1];
                    if (lVar.R == null) {
                        str = "unknown";
                    } else {
                        str = lVar.R.code + ": " + lVar.R.message;
                    }
                    objArr3[0] = str;
                    hVar.f8348a = w.j1(R.string.ProxyErrorDetailed, objArr3);
                } else {
                    hVar.f8348a = w.i1(lVar.f13863a == 0 ? R.string.ProxyErrorDirect : R.string.ProxyError);
                }
            } else {
                hVar.f8348a = w.i1(R.string.ProxyChecking);
            }
        }
        CharSequence charSequence = hVar.f8348a;
        if (charSequence instanceof String) {
            hVar.f8348a = w.Z1((String) charSequence);
        }
    }

    @Override
    public void g7(boolean z10) {
    }

    public final int gh(int i10) {
        if (i10 == 0) {
            return 5;
        }
        return this.D0.P0(i10);
    }

    public final int hh(int i10, int i11) {
        int i12 = (i10 * 2) + 7;
        if (i11 == -1 || gh(i11) == i12) {
            return i12;
        }
        throw new IllegalStateException("index: " + i12 + ", proxyIndex: " + gh(i11));
    }

    public final void oh(int i10, int i11) {
        if (i10 != i11) {
            ib.b.w(this.E0, i10, i11);
            int hh = hh(i10, -1);
            int hh2 = hh(i11, -1);
            if (hh2 > hh) {
                this.D0.u1(hh, hh2);
                this.D0.u1(hh - 1, hh2 - 1);
                return;
            }
            int i12 = hh2 - 1;
            this.D0.u1(hh, i12);
            this.D0.u1(hh, i12);
        }
    }

    @Override
    public void onClick(View view) {
        ra raVar = (ra) view.getTag();
        switch (view.getId()) {
            case R.id.btn_addProxy:
                this.f24495b.hd().E2(this, false);
                return;
            case R.id.btn_noProxy:
                i.c2().R();
                return;
            case R.id.btn_proxy:
                i.l lVar = (i.l) raVar.d();
                if (lVar.f13863a == this.G0) {
                    yh(lVar);
                    return;
                } else {
                    i.c2().o(lVar.f13864b, lVar.f13865c, lVar.M, null, true);
                    return;
                }
            case R.id.btn_useProxyForCalls:
                i.c2().w5(2, this.D0.S2(view));
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.btn_proxy) {
            return false;
        }
        yh((i.l) ((ra) view.getTag()).d());
        kg().requestDisallowInterceptTouchEvent(true);
        view.setOnTouchListener(new f());
        return true;
    }

    @Override
    public boolean pg() {
        return true;
    }

    public final void qh() {
        if (!Sa()) {
            rh(this.F0, true);
            for (i.l lVar : this.E0) {
                rh(lVar, true);
            }
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.E0 = i.c2().j0();
        int H0 = i.c2().H0();
        this.G0 = H0;
        if (H0 != 0) {
            Iterator<i.l> it = this.E0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i.l next = it.next();
                if (next.f13863a == this.G0) {
                    this.I0 = next.b();
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(4, R.id.btn_addProxy, 0, R.string.ProxyAdd));
        arrayList.add(new ra(3));
        arrayList.add(new ra(9, 0, 0, R.string.ProxyInfo));
        arrayList.add(new ra(8, 0, 0, R.string.ProxyConnections));
        arrayList.add(new ra(2));
        arrayList.add(new ra(90, R.id.btn_noProxy, 0, R.string.ProxyNone));
        rh(this.F0, true);
        for (i.l lVar : this.E0) {
            arrayList.add(new ra(11));
            arrayList.add(ph(lVar));
            rh(lVar, true);
        }
        arrayList.add(new ra(3));
        if (this.I0) {
            ah(arrayList);
        }
        d dVar = new d(this);
        this.D0 = dVar;
        dVar.B2(this);
        this.D0.s2(arrayList, false);
        customRecyclerView.setAdapter(this.D0);
        this.K0 = j.a(customRecyclerView, new e());
        i.c2().r(this);
        this.f24495b.O9().e0(this);
    }

    public final void rh(i.l lVar, boolean z10) {
        iq iqVar;
        int i10 = lVar.f13863a;
        int i11 = lVar.P + 1;
        lVar.P = i11;
        lVar.Q = -2L;
        lVar.S = 0;
        if (z10 && (iqVar = this.D0) != null) {
            iqVar.r3(gh(i10));
        }
        TdApi.Function addProxy = i10 != 0 ? new TdApi.AddProxy(lVar.f13864b, lVar.f13865c, false, lVar.M) : new TdApi.PingProxy(0);
        this.f24495b.v4().o(addProxy, new c(i11, lVar, new long[]{SystemClock.uptimeMillis()}, addProxy, i10));
    }

    public final void sh(i.l lVar) {
        final int i10 = lVar.f13863a;
        if (i10 != 0) {
            ee(w.i1(R.string.ProxyRemoveInfo), new int[]{R.id.btn_removeProxy, R.id.btn_cancel}, new String[]{w.i1(R.string.ProxyRemove), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view, int i11) {
                    boolean jh;
                    jh = ix.this.jh(i10, view, i11);
                    return jh;
                }
            });
        }
    }

    @Override
    public void tg() {
        jb.c cVar = new jb.c(2);
        u0 u0Var = new u0(2);
        cVar.a(R.id.btn_toggleErrors);
        u0Var.a(i.c2().H(4) ? R.string.ProxyHideErrors : R.string.ProxyShowErrors);
        if (this.E0.size() > 1 && bh() == this.E0.size()) {
            ArrayList arrayList = new ArrayList(this.E0);
            zh(arrayList);
            if (!arrayList.equals(this.E0)) {
                cVar.a(R.id.btn_sortByPing);
                u0Var.a(R.string.ProxyReorderByPing);
            }
        }
        Yd(cVar.e(), u0Var.d(), 0);
    }

    public final void th(int i10) {
        int gh;
        if (i10 != 0) {
            if (i10 == this.G0) {
                i.c2().R();
            }
            if (i.c2().M3(i10) && (gh = gh(i10)) != -1) {
                this.D0.R1(gh - 1, 2);
                int ch = ch(gh);
                if (ch != -1) {
                    this.E0.remove(ch);
                }
            }
        }
    }

    public final void uh(int i10) {
        i.l lVar = (i.l) this.D0.D0().get(i10).d();
        if (lVar == null) {
            lVar = this.F0;
        }
        long j10 = lVar.Q;
        if (j10 < 0 && j10 != -2) {
            rh(lVar, true);
        }
    }

    public final void vh() {
        int[] iArr;
        if (!this.E0.isEmpty()) {
            iArr = new int[this.E0.size()];
            int i10 = 0;
            for (i.l lVar : this.E0) {
                lVar.N = i10;
                i10++;
                iArr[i10] = lVar.f13863a;
            }
        } else {
            iArr = null;
        }
        i.c2().v5(iArr);
    }

    public final void wh(boolean z10) {
        if (this.I0 != z10) {
            this.I0 = z10;
            if (z10) {
                int D = this.D0.D();
                ah(this.D0.D0());
                iq iqVar = this.D0;
                iqVar.M(D, iqVar.D() - D);
                return;
            }
            iq iqVar2 = this.D0;
            iqVar2.R1(iqVar2.D() - 5, 5);
        }
    }

    public final void xh(boolean z10) {
        if (this.L0 != z10) {
            this.L0 = z10;
            if (z10) {
                hj hd2 = this.f24495b.hd();
                g gVar = new g();
                this.M0 = gVar;
                hd2.postDelayed(gVar, 800L);
            } else {
                this.M0.c();
            }
            this.D0.r3(gh(this.G0));
        }
    }

    public final void yh(final i.l lVar) {
        jb.c cVar = new jb.c(3);
        u0 u0Var = new u0(3);
        jb.c cVar2 = new jb.c(3);
        jb.c cVar3 = new jb.c(3);
        cVar.a(R.id.btn_editProxy);
        u0Var.a(R.string.ProxyEdit);
        cVar3.a(R.drawable.baseline_edit_24);
        cVar2.a(1);
        if (lVar.M.getConstructor() != -1547188361) {
            cVar.a(R.id.btn_share);
            u0Var.a(R.string.Share);
            cVar3.a(R.drawable.baseline_forward_24);
            cVar2.a(1);
            cVar.a(R.id.btn_copyLink);
            u0Var.a(R.string.CopyLink);
            cVar3.a(R.drawable.baseline_link_24);
            cVar2.a(1);
        }
        cVar.a(R.id.btn_removeProxy);
        u0Var.a(R.string.ProxyRemove);
        cVar3.a(R.drawable.baseline_delete_24);
        cVar2.a(2);
        ee(lVar.e().toString(), cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean mh;
                mh = ix.this.mh(lVar, view, i10);
                return mh;
            }
        });
    }
}
