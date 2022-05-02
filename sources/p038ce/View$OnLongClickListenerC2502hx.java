package p038ce;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.C0944d;
import androidx.recyclerview.widget.C0962g;
import androidx.recyclerview.widget.RecyclerView;
import be.C1363c0;
import be.C1379j0;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.C6985o2;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p038ce.View$OnClickListenerC2325e7;
import p038ce.View$OnLongClickListenerC2502hx;
import p053dd.C4007j;
import p053dd.C4012k;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5918j;
import p139jb.AbstractRunnableC5910b;
import p268t1.AbstractC8949d;
import p350yd.AbstractC10861n0;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import tc.C9137c;
import td.AbstractC9213j1;
import td.AbstractC9323v4;

public class View$OnLongClickListenerC2502hx extends AbstractC3204vo<Void> implements View.OnLongClickListener, View.OnClickListener, C4868i.AbstractC4881m, AbstractC10861n0, AbstractC9213j1 {
    public C2546iq f8541D0;
    public List<C4868i.C4880l> f8542E0;
    public int f8544G0;
    public boolean f8546I0;
    public C0962g f8548K0;
    public boolean f8549L0;
    public AbstractRunnableC5910b f8550M0;
    public C4868i.C4880l f8543F0 = new C4868i.C4880l(0, null, 0, null, null);
    public C2510h f8545H0 = new C2510h();
    public C2964ra f8547J0 = new C2964ra(7, R.id.btn_useProxyForCalls, 0, R.string.UseProxyForCalls);

    public class C2503a extends C0944d.AbstractC0946b {
        public final List f8551a;

        public C2503a(List list) {
            this.f8551a = list;
        }

        @Override
        public boolean mo30706a(int i, int i2) {
            return false;
        }

        @Override
        public boolean mo30705b(int i, int i2) {
            return View$OnLongClickListenerC2502hx.this.f8542E0.get(i) == this.f8551a.get(i2);
        }

        @Override
        public int mo30704d() {
            return this.f8551a.size();
        }

        @Override
        public int mo30703e() {
            return View$OnLongClickListenerC2502hx.this.f8542E0.size();
        }
    }

    public class C2504b implements AbstractC8949d {
        public C2504b() {
        }

        @Override
        public void mo10851K6(int i, int i2, Object obj) {
        }

        @Override
        public void mo10850W1(int i, int i2) {
        }

        @Override
        public void mo10849j0(int i, int i2) {
            View$OnLongClickListenerC2502hx.this.m34425oh(i, i2);
        }

        @Override
        public void mo10848m4(int i, int i2) {
        }
    }

    public class C2505c implements Client.AbstractC7865g {
        public final TdApi.Function f8554M;
        public final int f8555N;
        public final int f8557a;
        public final C4868i.C4880l f8558b;
        public final long[] f8559c;

        public C2505c(int i, C4868i.C4880l lVar, long[] jArr, TdApi.Function function, int i2) {
            this.f8557a = i;
            this.f8558b = lVar;
            this.f8559c = jArr;
            this.f8554M = function;
            this.f8555N = i2;
        }

        public void m34412b(C4868i.C4880l lVar, int i, int i2) {
            if (!View$OnLongClickListenerC2502hx.this.m9347Sa() && lVar.f16684P == i) {
                View$OnLongClickListenerC2502hx.this.m34436dh();
                View$OnLongClickListenerC2502hx.this.f8541D0.m34124u3(View$OnLongClickListenerC2502hx.this.m34433gh(i2));
            }
        }

        @Override
        public void mo255t2(TdApi.Object object) {
            if (this.f8557a == this.f8558b.f16684P) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long[] jArr = this.f8559c;
                long j = uptimeMillis - jArr[0];
                jArr[0] = SystemClock.uptimeMillis();
                switch (object.getConstructor()) {
                    case TdApi.Error.CONSTRUCTOR:
                        C4868i.C4880l lVar = this.f8558b;
                        int i = lVar.f16687S + 1;
                        lVar.f16687S = i;
                        if (i >= 3 || j > 1000) {
                            lVar.f16685Q = -3L;
                            lVar.f16686R = (TdApi.Error) object;
                            break;
                        } else {
                            View$OnLongClickListenerC2502hx.this.f30167b.m2270r4().m14783o(new TdApi.SetAlarm(this.f8558b.f16687S * 0.35d), this);
                            return;
                        }
                    case TdApi.C7866Ok.CONSTRUCTOR:
                        View$OnLongClickListenerC2502hx.this.f30167b.m2270r4().m14783o(this.f8554M, this);
                        return;
                    case TdApi.Proxy.CONSTRUCTOR:
                        View$OnLongClickListenerC2502hx.this.f30167b.m2270r4().m14783o(new TdApi.PingProxy(((TdApi.Proxy) object).f25415id), this);
                        return;
                    case TdApi.Seconds.CONSTRUCTOR:
                        this.f8558b.f16685Q = Math.round(((TdApi.Seconds) object).seconds * 1000.0d);
                        this.f8558b.f16687S = 0;
                        break;
                }
                HandlerC10770jj dd = View$OnLongClickListenerC2502hx.this.f30167b.m2485dd();
                final C4868i.C4880l lVar2 = this.f8558b;
                final int i2 = this.f8557a;
                final int i3 = this.f8555N;
                dd.post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnLongClickListenerC2502hx.C2505c.this.m34412b(lVar2, i2, i3);
                    }
                });
            }
        }
    }

    public class C2506d extends C2546iq {
        public C2506d(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            int j = raVar.m32835j();
            if (j == R.id.btn_noProxy || j == R.id.btn_proxy) {
                C4868i.C4880l lVar = (C4868i.C4880l) raVar.m32844d();
                if (lVar != null) {
                    cVar.setName(lVar.m24522e());
                } else {
                    cVar.setName(R.string.ProxyNone);
                    lVar = View$OnLongClickListenerC2502hx.this.f8543F0;
                }
                View$OnLongClickListenerC2502hx hxVar = View$OnLongClickListenerC2502hx.this;
                hxVar.m34434fh(lVar, hxVar.f8545H0);
                cVar.setDataColorId(View$OnLongClickListenerC2502hx.this.f8545H0.f8565b);
                cVar.setData(View$OnLongClickListenerC2502hx.this.f8545H0.f8564a);
                C6985o2 O1 = cVar.m10216O1();
                boolean z2 = true;
                if (!z || lVar.f16689a == View$OnLongClickListenerC2502hx.this.f8544G0) {
                    O1.m18179b(lVar.f16689a == View$OnLongClickListenerC2502hx.this.f8544G0 && View$OnLongClickListenerC2502hx.this.f8545H0.f8566c, z);
                }
                if (lVar.f16689a != View$OnLongClickListenerC2502hx.this.f8544G0) {
                    z2 = false;
                }
                O1.m18178c(z2, z);
            } else if (j == R.id.btn_useProxyForCalls) {
                cVar.getToggler().m10186r(C4868i.m24726c2().m24878H(2), z);
            }
        }
    }

    public class C2507e implements C4007j.AbstractC4010c {
        public C2507e() {
        }

        @Override
        public void mo9527a(RecyclerView.AbstractC0886d0 d0Var) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            if (raVar != null && raVar.m32835j() == R.id.btn_proxy) {
                View$OnLongClickListenerC2502hx.this.m34421sh((C4868i.C4880l) raVar.m32844d());
            }
        }

        @Override
        public boolean mo9526b(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return raVar != null && raVar.m32835j() == R.id.btn_proxy;
        }

        @Override
        public boolean mo29333c() {
            return false;
        }

        @Override
        public boolean mo29332d(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int k = d0Var.m39335k();
            int k2 = d0Var2.m39335k();
            int ch = View$OnLongClickListenerC2502hx.this.m34437ch(k);
            int ch2 = View$OnLongClickListenerC2502hx.this.m34437ch(k2);
            if (ch < 0 || ch >= View$OnLongClickListenerC2502hx.this.f8542E0.size() || ch2 < 0 || ch2 >= View$OnLongClickListenerC2502hx.this.f8542E0.size() || ch == ch2) {
                return false;
            }
            View$OnLongClickListenerC2502hx.this.m34425oh(ch, ch2);
            return true;
        }

        @Override
        public float mo9525e() {
            return C4012k.m29329a(this);
        }

        @Override
        public void mo29331f(int i, int i2) {
            View$OnLongClickListenerC2502hx.this.m34418vh();
        }

        @Override
        public int mo29330g(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            C2964ra raVar = (C2964ra) d0Var.f3479a.getTag();
            return (raVar == null || raVar.m32835j() != R.id.btn_proxy || View$OnLongClickListenerC2502hx.this.f8542E0.size() <= 1) ? 0 : 3;
        }
    }

    public class View$OnTouchListenerC2508f implements View.OnTouchListener {
        public View$OnTouchListenerC2508f() {
        }

        @Override
        public boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnLongClickListenerC2502hx.View$OnTouchListenerC2508f.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public class C2509g extends AbstractRunnableC5910b {
        public C2509g() {
        }

        @Override
        public void mo1364b() {
            View$OnLongClickListenerC2502hx.this.m34416xh(false);
        }
    }

    public static class C2510h {
        public CharSequence f8564a;
        public int f8565b;
        public boolean f8566c;

        public C2510h() {
        }

        public void m34411a() {
            this.f8564a = null;
            this.f8566c = false;
            this.f8565b = 0;
        }
    }

    public View$OnLongClickListenerC2502hx(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m34431ih(int i, int i2) {
        if (i == 0 && this.f8549L0) {
            m34416xh(false);
        } else if (i2 == 4 || i == 4) {
            m34423qh();
        } else {
            this.f8541D0.m34124u3(m34433gh(this.f8544G0));
        }
    }

    public boolean m34430jh(int i, View view, int i2) {
        if (i2 != R.id.btn_removeProxy) {
            return true;
        }
        m34420th(i);
        return true;
    }

    public void m34429kh(String str) {
        HandlerC10770jj dd = this.f30167b.m2485dd();
        AbstractView$OnTouchListenerC7889a aVar = this.f30165a;
        dd.m3578g8(new C10534a9(aVar, aVar.m14410z0()), str);
    }

    public static void m34428lh(String str) {
        if (!C5070i.m24061i(str)) {
            C1379j0.m37325i(str, R.string.CopiedLink);
        }
    }

    public boolean m34427mh(C4868i.C4880l lVar, View view, int i) {
        switch (i) {
            case R.id.btn_copyLink:
                this.f30167b.m2674R5(lVar, C2462gx.f8448a);
                return true;
            case R.id.btn_editProxy:
                View$OnClickListenerC2325e7 e7Var = new View$OnClickListenerC2325e7(this.f30165a, this.f30167b);
                e7Var.m9476Ad(new View$OnClickListenerC2325e7.C2329d(lVar));
                m9291ac(e7Var);
                return true;
            case R.id.btn_removeProxy:
                m34421sh(lVar);
                return true;
            case R.id.btn_share:
                this.f30167b.m2674R5(lVar, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnLongClickListenerC2502hx.this.m34429kh((String) obj);
                    }
                });
                return true;
            default:
                return true;
        }
    }

    public static int m34426nh(C4868i.C4880l lVar, C4868i.C4880l lVar2) {
        long j = lVar.f16685Q;
        long j2 = Long.MAX_VALUE;
        if (j < 0) {
            j = Long.MAX_VALUE;
        }
        long j3 = lVar2.f16685Q;
        if (j3 >= 0) {
            j2 = j3;
        }
        if (j != j2) {
            return Long.compare(j, j2);
        }
        int C1 = C4868i.m24911C1(lVar.f16681M);
        int C12 = C4868i.m24911C1(lVar2.f16681M);
        if (C1 != C12) {
            return Integer.compare(C1, C12);
        }
        return lVar.compareTo(lVar2);
    }

    public static C2964ra m34424ph(C4868i.C4880l lVar) {
        return new C2964ra(90, R.id.btn_proxy).m32863N(lVar.f16689a).m32870G(lVar);
    }

    public static void m34414zh(List<C4868i.C4880l> list) {
        Collections.sort(list, C2362ex.f8099a);
    }

    @Override
    public void mo8864N0(int i) {
        if (i != R.id.btn_sortByPing) {
            if (i == R.id.btn_toggleErrors) {
                C4868i.m24726c2().m24698f6(4);
                C4868i.C4880l lVar = this.f8543F0;
                if (lVar.f16686R != null) {
                    this.f8541D0.m34124u3(m34433gh(lVar.f16689a));
                }
                int i2 = 0;
                for (C4868i.C4880l lVar2 : this.f8542E0) {
                    if (lVar2.f16686R != null) {
                        this.f8541D0.m34124u3(m34432hh(i2, lVar2.f16689a));
                    }
                    i2++;
                }
            }
        } else if (this.f8542E0.size() > 1) {
            ArrayList arrayList = new ArrayList(this.f8542E0);
            m34414zh(arrayList);
            C0944d.m38882b(new C2503a(arrayList)).m38870b(new C2504b());
            m34418vh();
        }
    }

    @Override
    public void mo4623P4(C4868i.C4880l lVar, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(this.f8542E0, lVar);
        if (binarySearch < 0) {
            int i2 = (-binarySearch) - 1;
            if (z && (i = this.f8544G0) != lVar.f16689a) {
                int gh = m34433gh(i);
                this.f8544G0 = lVar.f16689a;
                this.f8541D0.m39312I(gh);
            }
            this.f8542E0.add(i2, lVar);
            int N0 = this.f8541D0.m34224N0(R.id.btn_noProxy);
            if (N0 != -1) {
                int i3 = N0 + (i2 * 2) + 1;
                this.f8541D0.m34240F0().add(i3, m34424ph(lVar));
                this.f8541D0.m34240F0().add(i3, new C2964ra(11));
                this.f8541D0.m39308M(i3, 2);
            }
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_proxyList;
    }

    @Override
    public int mo418W9() {
        return R.id.menu_more;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.Proxy);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C4868i.m24726c2().m24832N3(this);
        this.f30167b.m2781K9().m1814r0(this);
    }

    public final void m34439ah(List<C2964ra> list) {
        list.add(new C2964ra(8, 0, 0, R.string.ProxyOther));
        list.add(new C2964ra(2));
        list.add(this.f8547J0);
        list.add(new C2964ra(3));
        list.add(new C2964ra(9, 0, 0, R.string.UseProxyForCallsInfo));
    }

    public final int m34438bh() {
        int i = 0;
        for (C4868i.C4880l lVar : this.f8542E0) {
            long j = lVar.f16685Q;
            if (j >= 0 || j == -3) {
                i++;
            }
        }
        return i;
    }

    public final int m34437ch(int i) {
        if (i < 7) {
            return -1;
        }
        int i2 = i - 7;
        if (i2 > 0) {
            i2 /= 2;
        }
        if (i2 >= this.f8542E0.size() || i2 < 0) {
            return -1;
        }
        return i2;
    }

    public final void m34436dh() {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnLongClickListenerC2502hx.m34436dh():void");
    }

    @Override
    public void mo2996e0(final int i, final int i2) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnLongClickListenerC2502hx.this.m34431ih(i, i2);
            }
        });
    }

    public final C4868i.C4880l m34435eh(int i) {
        for (C4868i.C4880l lVar : this.f8542E0) {
            if (lVar.f16689a == i) {
                return lVar;
            }
        }
        return null;
    }

    public final void m34434fh(C4868i.C4880l lVar, C2510h hVar) {
        String str;
        hVar.m34411a();
        int i = lVar.f16689a;
        if (lVar.f16685Q == -1) {
            m34422rh(lVar, false);
        }
        int i2 = this.f8544G0;
        int i3 = R.string.format_pingBest;
        if (i == i2) {
            int z4 = this.f30167b.m2142z4();
            if (z4 != 0) {
                if (z4 == 3) {
                    hVar.f8564a = C4403w.m27869i1(R.string.network_Updating);
                } else if (z4 != 4) {
                    hVar.f8564a = C4403w.m27869i1(R.string.network_Connecting);
                } else {
                    hVar.f8564a = C4403w.m27869i1(R.string.network_WaitingForNetwork);
                }
            } else if (this.f8549L0) {
                hVar.f8564a = C4403w.m27869i1(R.string.network_Connecting);
            } else {
                long j = lVar.f16685Q;
                if (j == -1 || j == -2) {
                    hVar.f8564a = C4403w.m27869i1(R.string.ProxyChecking);
                    hVar.f8565b = R.id.theme_color_textLink;
                    hVar.f8566c = true;
                } else {
                    hVar.f8565b = R.id.theme_color_textLink;
                    hVar.f8566c = true;
                    if (j >= 0) {
                        int i4 = lVar.f16688T;
                        if (i4 != 0) {
                            Object[] objArr = new Object[1];
                            if (i4 != 1) {
                                i3 = R.string.format_ping;
                            }
                            objArr[0] = C4403w.m27865j1(i3, C1363c0.m37437f(j));
                            hVar.f8564a = C4403w.m27849n1(R.string.ProxyConnected, objArr);
                        } else {
                            hVar.f8564a = C4403w.m27865j1(R.string.ProxyConnected, C4403w.m27865j1(R.string.format_ping, C1363c0.m37437f(j)));
                        }
                    } else {
                        hVar.f8564a = C4403w.m27869i1(R.string.Connected);
                    }
                }
            }
        } else if (this.f30167b.m2142z4() == 4) {
            hVar.f8564a = C4403w.m27869i1(R.string.ProxyChecking);
        } else {
            long j2 = lVar.f16685Q;
            if (j2 >= 0) {
                hVar.f8565b = R.id.theme_color_textSecure;
                int i5 = lVar.f16688T;
                if (i5 != 0) {
                    Object[] objArr2 = new Object[1];
                    if (i5 != 1) {
                        i3 = R.string.format_ping;
                    }
                    objArr2[0] = C4403w.m27865j1(i3, C1363c0.m37437f(j2));
                    hVar.f8564a = C4403w.m27849n1(R.string.ProxyAvailable, objArr2);
                } else {
                    hVar.f8564a = C4403w.m27865j1(R.string.ProxyAvailable, C4403w.m27865j1(R.string.format_ping, C1363c0.m37437f(j2)));
                }
            } else if (j2 == -3) {
                hVar.f8565b = R.id.theme_color_textNegative;
                if (C4868i.m24726c2().m24878H(4)) {
                    Object[] objArr3 = new Object[1];
                    if (lVar.f16686R == null) {
                        str = "unknown";
                    } else {
                        str = lVar.f16686R.code + ": " + lVar.f16686R.message;
                    }
                    objArr3[0] = str;
                    hVar.f8564a = C4403w.m27865j1(R.string.ProxyErrorDetailed, objArr3);
                } else {
                    hVar.f8564a = C4403w.m27869i1(lVar.f16689a == 0 ? R.string.ProxyErrorDirect : R.string.ProxyError);
                }
            } else {
                hVar.f8564a = C4403w.m27869i1(R.string.ProxyChecking);
            }
        }
        CharSequence charSequence = hVar.f8564a;
        if (charSequence instanceof String) {
            hVar.f8564a = C4403w.m27909Z1((String) charSequence);
        }
    }

    @Override
    public void mo4622g7(boolean z) {
    }

    public final int m34433gh(int i) {
        if (i == 0) {
            return 5;
        }
        return this.f8541D0.m34215R0(i);
    }

    public final int m34432hh(int i, int i2) {
        int i3 = (i * 2) + 7;
        if (i2 == -1 || m34433gh(i2) == i3) {
            return i3;
        }
        throw new IllegalStateException("index: " + i3 + ", proxyIndex: " + m34433gh(i2));
    }

    @Override
    public void mo4621k3(int i, String str, int i2, TdApi.ProxyType proxyType, String str2, boolean z, boolean z2) {
        int gh = m34433gh(this.f8544G0);
        if (!z) {
            this.f8541D0.m34124u3(gh);
        } else if (!z2 || this.f8544G0 != i) {
            int gh2 = i != this.f8544G0 ? m34433gh(i) : gh;
            this.f8544G0 = i;
            C4868i.C4880l eh = m34435eh(i);
            if (eh != null) {
                eh.f16690b = str;
                eh.f16691c = i2;
                eh.f16681M = proxyType;
                eh.f16683O = str2;
            }
            this.f8541D0.m34124u3(gh);
            if (gh != gh2) {
                m34419uh(gh2);
                m34416xh(true);
                this.f8541D0.m34124u3(gh2);
            }
            m34417wh(C4868i.C4880l.m24524c(proxyType));
        }
    }

    @Override
    public void mo2995m3(TdApi.NetworkType networkType) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnLongClickListenerC2502hx.this.m34423qh();
            }
        });
    }

    public final void m34425oh(int i, int i2) {
        if (i != i2) {
            C5062b.m24149w(this.f8542E0, i, i2);
            int hh = m34432hh(i, -1);
            int hh2 = m34432hh(i2, -1);
            if (hh2 > hh) {
                this.f8541D0.m34114y1(hh, hh2);
                this.f8541D0.m34114y1(hh - 1, hh2 - 1);
                return;
            }
            int i3 = hh2 - 1;
            this.f8541D0.m34114y1(hh, i3);
            this.f8541D0.m34114y1(hh, i3);
        }
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar = (C2964ra) view.getTag();
        switch (view.getId()) {
            case R.id.btn_addProxy:
                this.f30167b.m2485dd().m3863E2(this, false);
                return;
            case R.id.btn_noProxy:
                C4868i.m24726c2().m24808R();
                return;
            case R.id.btn_proxy:
                C4868i.C4880l lVar = (C4868i.C4880l) raVar.m32844d();
                if (lVar.f16689a == this.f8544G0) {
                    m34415yh(lVar);
                    return;
                } else {
                    C4868i.m24726c2().m24633o(lVar.f16690b, lVar.f16691c, lVar.f16681M, null, true);
                    return;
                }
            case R.id.btn_useProxyForCalls:
                C4868i.m24726c2().m24564w5(2, this.f8541D0.m34201W2(view));
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
        m34415yh((C4868i.C4880l) ((C2964ra) view.getTag()).m32844d());
        m31303kg().requestDisallowInterceptTouchEvent(true);
        view.setOnTouchListener(new View$OnTouchListenerC2508f());
        return true;
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    public final void m34423qh() {
        if (!m9347Sa()) {
            m34422rh(this.f8543F0, true);
            for (C4868i.C4880l lVar : this.f8542E0) {
                m34422rh(lVar, true);
            }
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f8542E0 = C4868i.m24726c2().m24672j0();
        int H0 = C4868i.m24726c2().m24877H0();
        this.f8544G0 = H0;
        if (H0 != 0) {
            Iterator<C4868i.C4880l> it = this.f8542E0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4868i.C4880l next = it.next();
                if (next.f16689a == this.f8544G0) {
                    this.f8546I0 = next.m24525b();
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(4, R.id.btn_addProxy, 0, R.string.ProxyAdd));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.ProxyInfo));
        arrayList.add(new C2964ra(8, 0, 0, R.string.ProxyConnections));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(90, R.id.btn_noProxy, 0, R.string.ProxyNone));
        m34422rh(this.f8543F0, true);
        for (C4868i.C4880l lVar : this.f8542E0) {
            arrayList.add(new C2964ra(11));
            arrayList.add(m34424ph(lVar));
            m34422rh(lVar, true);
        }
        arrayList.add(new C2964ra(3));
        if (this.f8546I0) {
            m34439ah(arrayList);
        }
        C2506d dVar = new C2506d(this);
        this.f8541D0 = dVar;
        dVar.m34238F2(this);
        this.f8541D0.m34116x2(arrayList, false);
        customRecyclerView.setAdapter(this.f8541D0);
        this.f8548K0 = C4007j.m29342a(customRecyclerView, new C2507e());
        C4868i.m24726c2().m24609r(this);
        this.f30167b.m2781K9().m1866e0(this);
    }

    public final void m34422rh(C4868i.C4880l lVar, boolean z) {
        C2546iq iqVar;
        int i = lVar.f16689a;
        int i2 = lVar.f16684P + 1;
        lVar.f16684P = i2;
        lVar.f16685Q = -2L;
        lVar.f16687S = 0;
        if (z && (iqVar = this.f8541D0) != null) {
            iqVar.m34124u3(m34433gh(i));
        }
        TdApi.Function addProxy = i != 0 ? new TdApi.AddProxy(lVar.f16690b, lVar.f16691c, false, lVar.f16681M) : new TdApi.PingProxy(0);
        this.f30167b.m2270r4().m14783o(addProxy, new C2505c(i2, lVar, new long[]{SystemClock.uptimeMillis()}, addProxy, i));
    }

    public final void m34421sh(C4868i.C4880l lVar) {
        final int i = lVar.f16689a;
        if (i != 0) {
            m9261ee(C4403w.m27869i1(R.string.ProxyRemoveInfo), new int[]{R.id.btn_removeProxy, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ProxyRemove), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i2) {
                    boolean jh;
                    jh = View$OnLongClickListenerC2502hx.this.m34430jh(i, view, i2);
                    return jh;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            });
        }
    }

    @Override
    public void mo31296tg() {
        C5320c cVar = new C5320c(2);
        C5146u0 u0Var = new C5146u0(2);
        cVar.m23284a(R.id.btn_toggleErrors);
        u0Var.m23816a(C4868i.m24726c2().m24878H(4) ? R.string.ProxyHideErrors : R.string.ProxyShowErrors);
        if (this.f8542E0.size() > 1 && m34438bh() == this.f8542E0.size()) {
            ArrayList arrayList = new ArrayList(this.f8542E0);
            m34414zh(arrayList);
            if (!arrayList.equals(this.f8542E0)) {
                cVar.m23284a(R.id.btn_sortByPing);
                u0Var.m23816a(R.string.ProxyReorderByPing);
            }
        }
        m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
    }

    public final void m34420th(int i) {
        int gh;
        if (i != 0) {
            if (i == this.f8544G0) {
                C4868i.m24726c2().m24808R();
            }
            if (C4868i.m24726c2().m24839M3(i) && (gh = m34433gh(i)) != -1) {
                this.f8541D0.m34204V1(gh - 1, 2);
                int ch = m34437ch(gh);
                if (ch != -1) {
                    this.f8542E0.remove(ch);
                }
            }
        }
    }

    public final void m34419uh(int i) {
        C4868i.C4880l lVar = (C4868i.C4880l) this.f8541D0.m34240F0().get(i).m32844d();
        if (lVar == null) {
            lVar = this.f8543F0;
        }
        long j = lVar.f16685Q;
        if (j < 0 && j != -2) {
            m34422rh(lVar, true);
        }
    }

    public final void m34418vh() {
        int[] iArr;
        if (!this.f8542E0.isEmpty()) {
            iArr = new int[this.f8542E0.size()];
            int i = 0;
            for (C4868i.C4880l lVar : this.f8542E0) {
                lVar.f16682N = i;
                i++;
                iArr[i] = lVar.f16689a;
            }
        } else {
            iArr = null;
        }
        C4868i.m24726c2().m24571v5(iArr);
    }

    public final void m34417wh(boolean z) {
        if (this.f8546I0 != z) {
            this.f8546I0 = z;
            if (z) {
                int D = this.f8541D0.mo6153D();
                m34439ah(this.f8541D0.m34240F0());
                C2546iq iqVar = this.f8541D0;
                iqVar.m39308M(D, iqVar.mo6153D() - D);
                return;
            }
            C2546iq iqVar2 = this.f8541D0;
            iqVar2.m34204V1(iqVar2.mo6153D() - 5, 5);
        }
    }

    public final void m34416xh(boolean z) {
        if (this.f8549L0 != z) {
            this.f8549L0 = z;
            if (z) {
                HandlerC10770jj dd = this.f30167b.m2485dd();
                C2509g gVar = new C2509g();
                this.f8550M0 = gVar;
                dd.postDelayed(gVar, 800L);
            } else {
                this.f8550M0.m21857c();
            }
            this.f8541D0.m34124u3(m34433gh(this.f8544G0));
        }
    }

    public final void m34415yh(final C4868i.C4880l lVar) {
        C5320c cVar = new C5320c(3);
        C5146u0 u0Var = new C5146u0(3);
        C5320c cVar2 = new C5320c(3);
        C5320c cVar3 = new C5320c(3);
        cVar.m23284a(R.id.btn_editProxy);
        u0Var.m23816a(R.string.ProxyEdit);
        cVar3.m23284a(R.drawable.baseline_edit_24);
        cVar2.m23284a(1);
        if (lVar.f16681M.getConstructor() != -1547188361) {
            cVar.m23284a(R.id.btn_share);
            u0Var.m23816a(R.string.Share);
            cVar3.m23284a(R.drawable.baseline_forward_24);
            cVar2.m23284a(1);
            cVar.m23284a(R.id.btn_copyLink);
            u0Var.m23816a(R.string.CopyLink);
            cVar3.m23284a(R.drawable.baseline_link_24);
            cVar2.m23284a(1);
        }
        cVar.m23284a(R.id.btn_removeProxy);
        u0Var.m23816a(R.string.ProxyRemove);
        cVar3.m23284a(R.drawable.baseline_delete_24);
        cVar2.m23284a(2);
        m9261ee(lVar.m24522e().toString(), cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), cVar3.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean mh;
                mh = View$OnLongClickListenerC2502hx.this.m34427mh(lVar, view, i);
                return mh;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
    }
}
