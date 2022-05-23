package de;

import ae.j;
import ae.p;
import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import ce.a0;
import ce.p0;
import ce.v;
import de.iq;
import eb.k;
import gd.w;
import hd.k5;
import hd.t2;
import ib.i;
import ie.u0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kd.x0;
import ld.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.c0;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import tc.k2;
import ud.j1;
import ud.q1;
import ud.v4;
import zd.d1;
import zd.fc;
import zd.g1;
import zd.h1;
import zd.o6;

public abstract class yb<V extends View, T> extends v4<f> implements View.OnClickListener, x0.g, j1, k.b, Client.g, h1, Comparator<g<T>>, d1.a, t1.d {
    public eb.f A0;
    public boolean B0;
    public boolean C0;
    public g<T> D0;
    public int E0;
    public g<T> F0;
    public int G0;
    public boolean H0;
    public boolean I0;
    public List<g<T>> J0;
    public List<g<T>> K0;
    public FrameLayoutFix f10161n0;
    public CustomRecyclerView f10162o0;
    public iq f10163p0;
    public V f10164q0;
    public c0 f10165r0;
    public c0 f10166s0;
    public c0 f10167t0;
    public c0 f10168u0;
    public float f10169v0;
    public eb.f f10170w0;
    public boolean f10171x0;
    public x0 f10172y0;
    public boolean f10173z0;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            yb.this.xf();
        }
    }

    public class b extends iq.c {
        public b(int i10) {
            super(i10);
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            if (k02 > 0) {
                rect.top = 0;
            } else if (k02 == 0) {
                rect.top = (recyclerView.getMeasuredHeight() - ap.W(2)) - ap.W(83);
            }
        }

        @Override
        public boolean l(ra raVar) {
            return super.l(raVar) && (raVar.A() != 2 || !raVar.b());
        }
    }

    public class c extends iq {

        public class a implements Runnable {
            public final k2 f10177a;
            public final TdApi.Message f10178b;

            public a(k2 k2Var, TdApi.Message message) {
                this.f10177a = k2Var;
                this.f10178b = message;
            }

            @Override
            public void run() {
                if (this.f10177a.getSubtitleUpdater() == this) {
                    o6 o6Var = yb.this.f24495b;
                    TdApi.Message message = this.f10178b;
                    k5.a ga2 = k5.ga(o6Var, Math.max(message.date, message.editDate));
                    this.f10177a.I1(ga2.f13197a);
                    if (ga2.f13198b != -1) {
                        this.f10177a.B1(this, SystemClock.uptimeMillis() - ga2.f13198b);
                    }
                }
            }
        }

        public c(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void C2(ra raVar, int i10, k2 k2Var, boolean z10) {
            String str;
            String i12;
            boolean z11 = false;
            long j10 = 0;
            switch (raVar.j()) {
                case R.id.liveLocation:
                    g gVar = (g) raVar.d();
                    yb.this.Ag(k2Var, gVar.f10201f, gVar.f10202g, false);
                    return;
                case R.id.liveLocationSelf:
                    TdApi.Message f02 = yb.this.f24495b.e2().f0(yb.this.x9().f10194k);
                    if (f02 != null) {
                        k5.a ga2 = k5.ga(yb.this.f24495b, Math.max(f02.date, f02.editDate));
                        TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) f02.content;
                        long max = Math.max(0L, ((f02.date + messageLocation.livePeriod) * 1000) - System.currentTimeMillis());
                        String i13 = w.i1(R.string.StopSharingLiveLocation);
                        String str2 = ga2.f13197a;
                        if (messageLocation.expiresIn == 0) {
                            z11 = true;
                        }
                        int i11 = messageLocation.livePeriod;
                        if (max > 0) {
                            j10 = SystemClock.uptimeMillis() + max;
                        }
                        k2Var.E1(i13, str2, true, true, z11, i11, j10);
                        k2Var.D1(yb.this.H0, z10);
                        if (ga2.f13198b != -1) {
                            k2Var.B1(new a(k2Var, f02), SystemClock.uptimeMillis() - ga2.f13198b);
                            return;
                        }
                        return;
                    }
                    k2Var.setDefaultLiveLocation(false);
                    k2Var.D1(yb.this.H0, z10);
                    return;
                case R.id.place:
                    f x92 = yb.this.x9();
                    int i14 = x92.f10184a;
                    if (i14 == 0) {
                        TdApi.Message message = x92.f10189f;
                        if (message != null) {
                            yb.this.Ag(k2Var, message, x92.f10190g, true);
                            return;
                        }
                        if (yb.this.D0 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(w.L2(v0.Y(x92.f10185b, x92.f10186c, yb.this.D0.f10196a, yb.this.D0.f10197b)));
                            if (!i.i(x92.f10188e)) {
                                sb2.append(ce.c0.f5242a);
                                sb2.append(x92.f10188e);
                            }
                            str = sb2.toString();
                        } else if (yb.this.C0) {
                            str = w.i1(R.string.CalculatingDistance);
                        } else {
                            str = !i.i(x92.f10188e) ? x92.f10188e : w.n(x92.f10185b, x92.f10186c);
                        }
                        String str3 = str;
                        if (x92.f10193j != 0) {
                            i12 = yb.this.f24495b.U3(x92.f10193j);
                        } else {
                            i12 = !i.i(x92.f10187d) ? x92.f10187d : w.i1(R.string.DroppedPin);
                        }
                        k2Var.G1(i12, str3, R.id.theme_color_file, null, false, 0, 0L);
                        if (x92.f10193j != 0) {
                            h d32 = yb.this.f24495b.d3(x92.f10193j);
                            if (d32 != null) {
                                k2Var.setRoundedLocationImage(d32);
                                return;
                            } else {
                                k2Var.setPlaceholder(yb.this.f24495b.F3(x92.f10193j, false));
                                return;
                            }
                        } else {
                            k2Var.setLocationImage(x92.f10191h);
                            return;
                        }
                    } else if (i14 == 1) {
                        g gVar2 = (g) raVar.d();
                        yb.this.Ag(k2Var, gVar2.f10201f, gVar2.f10202g, true);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public class d implements Runnable {
        public final k2 f10180a;
        public final TdApi.Message f10181b;
        public final boolean f10182c;

        public d(k2 k2Var, TdApi.Message message, boolean z10) {
            this.f10180a = k2Var;
            this.f10181b = message;
            this.f10182c = z10;
        }

        @Override
        public void run() {
            if (this.f10180a.getSubtitleUpdater() == this) {
                k5.a rf = yb.this.rf(this.f10181b, this.f10182c);
                this.f10180a.I1(rf.f13197a);
                if (rf.f13198b != -1) {
                    this.f10180a.B1(this, SystemClock.uptimeMillis() - rf.f13198b);
                }
            }
        }
    }

    public class e extends d.b {
        public e() {
        }

        @Override
        public boolean a(int i10, int i11) {
            return true;
        }

        @Override
        public boolean b(int i10, int i11) {
            return yb.this.J0.get(i10) == yb.this.K0.get(i11);
        }

        @Override
        public int d() {
            return yb.this.K0.size();
        }

        @Override
        public int e() {
            return yb.this.J0.size();
        }
    }

    public static class g<D> {
        public double f10196a;
        public double f10197b;
        public float f10198c;
        public float f10199d;
        public int f10200e;
        public TdApi.Message f10201f;
        public long f10202g = 0;
        public boolean f10203h;
        public boolean f10204i;
        public boolean f10205j;
        public final yb<?, D> f10206k;
        public D f10207l;

        public g(yb<?, D> ybVar, double d10, double d11) {
            this.f10206k = ybVar;
            this.f10196a = d10;
            this.f10197b = d11;
        }

        public g<D> a(TdApi.Message message, boolean z10) {
            this.f10201f = message;
            this.f10203h = z10;
            this.f10202g = message != null ? SystemClock.uptimeMillis() + (((TdApi.MessageLocation) message.content).expiresIn * 1000) : 0L;
            return this;
        }
    }

    public yb(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    private void Jf() {
        if (!Sa()) {
            if (Xa()) {
                this.f10171x0 = true;
                return;
            }
            Kf(this.f10164q0, false);
            uf(false);
        }
    }

    public void Mf(TdApi.Message message) {
        if (!Sa()) {
            nf(message);
        }
    }

    public void Nf(CustomRecyclerView customRecyclerView, int i10, int i11, int i12, int i13) {
        if (i11 > 0 && i11 != i13) {
            customRecyclerView.A0();
        }
        xf();
    }

    public static boolean Of(CustomRecyclerView customRecyclerView, float f10, float f11) {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) customRecyclerView.getLayoutManager();
        return linearLayoutManager.X1() != 0 || (C = linearLayoutManager.C(0)) == null || ((float) (C.getTop() + C.getMeasuredHeight())) < f11;
    }

    public void Pf() {
        if (!Sa()) {
            Jf();
        }
    }

    public void Qf() {
        Kf(this.f10164q0, true);
        ud(new Runnable() {
            @Override
            public final void run() {
                yb.this.Pf();
            }
        });
    }

    public void Rf(int i10) {
        if (this.D0 != null) {
            f fVar = (f) x9();
            this.H0 = true;
            this.f10163p0.p3(R.id.liveLocationSelf);
            o6 o6Var = this.f24495b;
            long j10 = fVar.f10194k;
            long j11 = fVar.f10195l;
            boolean j32 = o6Var.j3(j10);
            g<T> gVar = this.D0;
            o6Var.xb(j10, j11, 0L, j32, false, new TdApi.InputMessageLocation(new TdApi.Location(gVar.f10196a, gVar.f10197b, gVar.f10198c), i10, this.D0.f10200e, 0));
        }
    }

    public void Sf(long j10, long j11, int i10) {
        if (!Sa() && ((f) x9()).f10194k == j10) {
            Fg(j11, i10);
        }
    }

    public void Tf(long j10, long[] jArr) {
        if (!Sa() && ((f) x9()).f10194k == j10) {
            tg(jArr);
        }
    }

    public void Uf(ArrayList arrayList) {
        if (!Sa()) {
            Cf(arrayList);
        }
    }

    public void Vf(long j10, long j11, TdApi.MessageLocation messageLocation) {
        if (!Sa() && ((f) x9()).f10194k == j10) {
            Gg(j11, messageLocation);
        }
    }

    public static ra cg() {
        return new ra(83, R.id.liveLocationSelf);
    }

    @Override
    public int A9() {
        return 3;
    }

    public final int Af(int i10) {
        if (Gf()) {
            i10--;
        }
        return Wf() + i10;
    }

    public final void Ag(k2 k2Var, TdApi.Message message, long j10, boolean z10) {
        fc fcVar = new fc(this.f24495b, message.chatId, message.senderId);
        k2Var.setRoundedLocationImage(fcVar.a());
        k5.a rf = rf(message, z10);
        TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
        k2Var.G1(fcVar.e(), rf.f13197a, fcVar.b(), fcVar.d(), j10 == 0 || SystemClock.uptimeMillis() >= j10, messageLocation.livePeriod, j10);
        if (rf.f13198b != -1) {
            k2Var.B1(new d(k2Var, message, z10), SystemClock.uptimeMillis() - rf.f13198b);
        }
    }

    public abstract void Bf(V v10);

    public final void Bg(float f10) {
        if (this.f10169v0 != f10) {
            this.f10169v0 = f10;
            this.f10164q0.setTranslationY(f10 / 2.0f);
            c0 c0Var = this.f10166s0;
            if (c0Var != null) {
                c0Var.setTranslationY(f10);
            }
            this.f10165r0.setTranslationY(sf());
        }
    }

    public final void Cf(ArrayList<g<T>> arrayList) {
        int i10;
        int size = this.J0.size();
        this.J0.addAll(arrayList);
        List<ra> D0 = this.f10163p0.D0();
        int size2 = D0.size();
        if (((f) x9()).f10184a == 0) {
            i10 = 4;
            ib.b.m(D0, arrayList.size() + size2 + 4);
            D0.add(new ra(3));
            D0.add(new ra(8, 0, 0, R.string.LiveLocations));
            D0.add(new ra(2));
            if (this.f24495b.x6(((f) x9()).f10194k)) {
                D0.add(cg());
            }
        } else {
            ib.b.m(D0, arrayList.size() + size2);
            i10 = 0;
        }
        Iterator<g<T>> it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            g<T> next = it.next();
            D0.add(bg(next));
            jg(next, size + i11);
            i11++;
        }
        this.f10163p0.M(size2, arrayList.size() + i10);
        ug();
        hg(false, true);
        pf(true);
    }

    public final void Cg(int i10) {
        if (this.G0 != i10) {
            int Xf = Xf();
            this.G0 = i10;
            if (i10 == -1 || Ig(i10)) {
                he.i.c2().U4(i10);
            }
            int Xf2 = Xf();
            if (Xf != Xf2) {
                eg(Xf, Xf2);
            }
        }
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    public abstract boolean Df(V v10);

    public final void Dg(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float bearing = location.getBearing();
        int A0 = v0.A0(location);
        g<T> gVar = this.D0;
        if (gVar == null || gVar.f10196a != latitude || gVar.f10197b != longitude) {
            if (gVar == null) {
                g<T> gVar2 = new g<>(this, latitude, longitude);
                this.D0 = gVar2;
                gVar2.f10204i = true;
                if (this.I0) {
                    jg(gVar2, -1);
                    hg(true, false);
                }
            } else {
                gVar.f10196a = latitude;
                gVar.f10197b = longitude;
            }
            g<T> gVar3 = this.D0;
            gVar3.f10200e = A0;
            gVar3.f10199d = bearing;
            this.C0 = false;
            dg();
        } else if (gVar.f10200e != A0) {
            gVar.f10200e = A0;
            gVar.f10199d = bearing;
            if (this.B0) {
                Eg();
            }
        }
    }

    public abstract int[] Ef();

    public final void Eg() {
        g<T> gVar;
        int i10 = this.E0;
        if (i10 == 0) {
            ng(this.f10164q0, null, this.f10173z0, false, false);
        } else if (i10 == 1 && (gVar = this.D0) != null) {
            ng(this.f10164q0, gVar, this.f10173z0, this.B0, false);
        }
    }

    @Override
    public void F6(int i10, int i11, Object obj) {
        Log.i("onChanged %d", Integer.valueOf(i10));
        if (Gf()) {
            i10--;
        }
        int Wf = i10 + Wf();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f10163p0.I(Wf + i12);
        }
    }

    public final int Ff() {
        int size = this.J0.size();
        return Gf() ? size - 1 : size;
    }

    public final void Fg(long j10, int i10) {
        int Hf = Hf(j10);
        if (Hf != -1) {
            this.J0.get(Hf).f10201f.editDate = i10;
        }
    }

    @Override
    public void G8(float f10) {
        this.f10167t0.setAlpha(f10);
        this.f10168u0.setAlpha(f10);
        this.f10168u0.setTranslationY((-ud.d1.a3(true)) * (1.0f - f10));
    }

    public final boolean Gf() {
        return ((f) x9()).f10184a == 0;
    }

    public final void Gg(long j10, TdApi.MessageLocation messageLocation) {
        int Hf = Hf(j10);
        if (Hf != -1) {
            g<T> gVar = this.J0.get(Hf);
            gVar.f10201f.content = messageLocation;
            if (messageLocation.expiresIn != 0 || !Gf() || ((f) x9()).f10189f == null) {
                wf(gVar, Hf);
            } else {
                sg(gVar, Hf);
            }
        }
    }

    @Override
    public void H(final long j10, final long[] jArr) {
        if (!Sa()) {
            ud(new Runnable() {
                @Override
                public final void run() {
                    yb.this.Tf(j10, jArr);
                }
            });
        }
    }

    @Override
    public void H1(TdApi.Location location, int i10) {
    }

    public final int Hf(long j10) {
        int i10 = 0;
        for (g<T> gVar : this.J0) {
            TdApi.Message message = gVar.f10201f;
            if (message != null && message.f19946id == j10) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final void Hg(final long j10, final long j11, final TdApi.MessageLocation messageLocation) {
        if (!Sa() && messageLocation.livePeriod > 0) {
            m9(new Runnable() {
                @Override
                public final void run() {
                    yb.this.Vf(j10, j11, messageLocation);
                }
            });
        }
    }

    public final int If(TdApi.MessageSender messageSender, long j10) {
        int i10 = 0;
        int i11 = -1;
        for (g<T> gVar : this.J0) {
            TdApi.Message message = gVar.f10201f;
            if (message != null) {
                if (message.f19946id == j10) {
                    return i10;
                }
                if (ob.e.Y(message.senderId, messageSender) && (i10 != 0 || !Gf())) {
                    i11 = i10;
                }
            }
            i10++;
        }
        return i11;
    }

    public abstract boolean Ig(int i10);

    @Override
    public void J3(long j10, long j11) {
    }

    public abstract void Kf(V v10, boolean z10);

    public final boolean Lf() {
        return this.I0;
    }

    @Override
    public void M5(o6 o6Var, TdApi.Message message) {
        if (this.I0 && this.f24495b.A6() == o6Var.A6() && ((f) x9()).f10194k == message.chatId) {
            this.f10163p0.p3(R.id.liveLocationSelf);
        }
    }

    @Override
    public boolean Me() {
        return true;
    }

    @Override
    public int O9() {
        return R.id.theme_color_headerButtonIcon;
    }

    @Override
    public void P0(int i10) {
        int i11;
        switch (i10) {
            case R.id.btn_layerTypeMapDark:
                i11 = 1;
                break;
            case R.id.btn_layerTypeMapDefault:
                i11 = 0;
                break;
            case R.id.btn_layerTypeMapHybrid:
                i11 = 4;
                break;
            case R.id.btn_layerTypeMapSatellite:
                i11 = 2;
                break;
            case R.id.btn_layerTypeMapTerrain:
                i11 = 3;
                break;
            default:
                return;
        }
        if (Xf() != i11 && ((i11 == 0 && !j.x0()) || (i11 == 1 && j.x0()))) {
            i11 = -1;
        }
        Cg(i11);
    }

    @Override
    public void Q3(ArrayList<o6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        if (!Sa()) {
            uf(true);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_map;
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    @Override
    public void S4(x0 x0Var, String str, Location location) {
        if (!Sa()) {
            this.f10165r0.setInProgress(false);
            if (location != null) {
                V v10 = this.f10164q0;
                if (v10 != null) {
                    Df(v10);
                }
                str.hashCode();
                char c10 = 65535;
                switch (str.hashCode()) {
                    case -1788203700:
                        if (str.equals("share_live")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1041597869:
                        if (str.equals("focus_self")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -223054120:
                        if (str.equals("focus_target")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        this.H0 = false;
                        this.f10163p0.p3(R.id.liveLocationSelf);
                        Rc(((f) x9()).f10194k, new kb.k() {
                            @Override
                            public final void a(int i10) {
                                yb.this.Rf(i10);
                            }
                        });
                        return;
                    case 1:
                        if (this.E0 != 1) {
                            wg(1, null);
                            return;
                        } else if (!yg(true ^ this.B0) && !this.B0) {
                            wg(0, null);
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        Dg(location);
                        wg(0, null);
                        return;
                    default:
                        return;
                }
            } else if (v0.E(this.f24493a) && this.f10164q0 != null) {
                zg(true);
                if (!Df(this.f10164q0)) {
                    this.f10172y0.s(str, null, 1000L, true);
                }
            }
        }
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        return f11 <= ((float) ud.d1.a3(true));
    }

    @Override
    public void T0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        g1.d(this, j10, j11, messageInteractionInfo);
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    @Override
    public void W1(int i10, int i11) {
        Log.i("onInserted %d", Integer.valueOf(i10));
        int Wf = Wf() + i10;
        if (Gf()) {
            Wf--;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            this.f10163p0.s0(Wf + i12, bg(this.J0.get(i10 + i12)));
        }
    }

    public final int Wf() {
        int size = this.f10163p0.D0().size();
        int size2 = this.J0.size();
        if (Gf()) {
            size2--;
        }
        return size - size2;
    }

    @Override
    public void X1(TdApi.Message message, long j10) {
        of(message);
    }

    public final int Xf() {
        int i10 = this.G0;
        return i10 != -1 ? i10 : j.x0() ? 1 : 0;
    }

    public final V Yf() {
        V v10 = this.f10164q0;
        if (v10 != null) {
            return v10;
        }
        throw new IllegalStateException();
    }

    @Override
    public void Z3(int i10, int i11) {
        Log.i("onRemoved %d %d", Integer.valueOf(i10), Integer.valueOf(i11));
        if (Gf()) {
            i10--;
        }
        int Wf = Wf();
        if (i11 == 1) {
            this.f10163p0.j1(Wf + i10);
        } else {
            this.f10163p0.R1(Wf + i10, i11);
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        f fVar = (f) x9();
        if (fVar.f10194k != 0) {
            this.f24495b.O9().t0(fVar.f10194k, this);
            this.f24495b.F4().W1().s(this);
        }
        for (g<T> gVar : this.J0) {
            T t10 = gVar.f10207l;
            if (t10 instanceof kb.c) {
                ((kb.c) t10).Q2();
            }
        }
        yg(false);
        V v10 = this.f10164q0;
        if (v10 != null) {
            Bf(v10);
            this.f10164q0 = null;
        }
        x0 x0Var = this.f10172y0;
        if (x0Var != null) {
            x0Var.k();
        }
        p0.n(this.f10162o0);
    }

    public final g<T> Zf(boolean z10) {
        Location l10;
        g<T> gVar = this.D0;
        if (gVar != null) {
            return gVar;
        }
        if (!this.C0 || !z10 || (l10 = x0.l(this.f24493a, true)) == null) {
            return null;
        }
        g<T> gVar2 = new g<>(this, l10.getLatitude(), l10.getLongitude());
        gVar2.f10204i = true;
        return gVar2;
    }

    public abstract boolean ag(V v10);

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    public final ra bg(g<T> gVar) {
        return new ra(83, R.id.liveLocation).G(gVar);
    }

    @Override
    public void c6() {
        super.c6();
        V v10 = this.f10164q0;
        if (v10 != null) {
            qg(v10);
        }
    }

    @Override
    public boolean dc() {
        return !this.f10173z0;
    }

    public final void dg() {
        g<T> gVar;
        this.f10163p0.p3(R.id.place);
        Eg();
        ug();
        if (this.I0 && (gVar = this.D0) != null) {
            kg(gVar, -1);
        }
    }

    public abstract void eg(int i10, int i11);

    @Override
    public void f2(o6 o6Var, ArrayList<TdApi.Message> arrayList) {
        if (!Sa()) {
            uf(true);
        }
    }

    public abstract boolean fg(V v10, double d10, double d11);

    @Override
    public void g5(TdApi.Message message, long j10, int i10, String str) {
    }

    public abstract void gg(V v10);

    @Override
    public void h0(int i10, int i11) {
        int Wf = Wf();
        if (Gf()) {
            Wf--;
        }
        Log.i("moveItem %d %d", Integer.valueOf(i10), Integer.valueOf(i11));
        this.f10163p0.u1(i10 + Wf, Wf + i11);
    }

    public final void hg(boolean z10, boolean z11) {
        if (this.E0 != 0) {
            wg(0, null);
        } else if ((z10 || ((f) x9()).f10184a != 0) && this.f10164q0 != null) {
            Eg();
        }
    }

    @Override
    public void i3(p pVar, p pVar2) {
        super.i3(pVar, pVar2);
        if (this.G0 == -1) {
            boolean c10 = pVar.c();
            boolean c11 = pVar2.c();
            if (c10 != c11) {
                eg(!c11 ? 1 : 0, c11 ? 1 : 0);
            }
        }
    }

    public abstract void ig(g<T> gVar, boolean z10);

    @Override
    public void j0(long j10, long j11, TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 303973492) {
            Hg(j10, j11, (TdApi.MessageLocation) messageContent);
        }
    }

    public abstract void jg(g<T> gVar, int i10);

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void kc() {
        super.kc();
        x0 x0Var = this.f10172y0;
        if (x0Var != null) {
            x0Var.h();
        }
    }

    public abstract void kg(g<T> gVar, int i10);

    @Override
    public void l4(x0 x0Var, int i10, String str, Location location) {
        if (!Sa()) {
            this.f10165r0.setInProgress(false);
            zg(false);
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1788203700:
                    if (str.equals("share_live")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -223054120:
                    if (str.equals("focus_target")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 0:
                    if (str.equals("")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    this.H0 = false;
                    this.f10163p0.p3(R.id.liveLocationSelf);
                    return;
                case 1:
                    if (this.D0 == null && this.J0.size() > 0) {
                        if (this.E0 != 2 || this.F0 != this.J0.get(0)) {
                            wg(0, null);
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    if (this.D0 == null) {
                        wg(2, this.J0.get(0));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void l5(final long j10, final long j11, final int i10, TdApi.ReplyMarkup replyMarkup) {
        if (!Sa()) {
            ud(new Runnable() {
                @Override
                public final void run() {
                    yb.this.Sf(j10, j11, i10);
                }
            });
        }
    }

    public abstract void lg(g<T> gVar, boolean z10);

    public abstract void mg(g<T> gVar, int i10);

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 != 0) {
            if (i10 == 1) {
                float f12 = 1.0f - f10;
                this.f10166s0.setAlpha(f12);
                float f13 = (f12 * 0.4f) + 0.6f;
                this.f10166s0.setScaleX(f13);
                this.f10166s0.setScaleY(f13);
                this.f10165r0.setTranslationY(sf());
            }
        } else if (f10 == 0.0f) {
            this.f10165r0.setIconColorId(R.id.theme_color_icon);
        } else if (f10 == 1.0f) {
            this.f10165r0.setIconColorId(R.id.theme_color_iconActive);
        } else {
            this.f10165r0.setCustomIconColor(ib.d.d(j.o0(), j.L(R.id.theme_color_iconActive), f10));
        }
    }

    public final void nf(TdApi.Message message) {
        int If = If(message.senderId, message.f19946id);
        if (If != -1) {
            g<T> gVar = this.J0.get(If);
            gVar.a(message, true);
            wf(gVar, If);
            return;
        }
        int Wf = Wf();
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        g<T> gVar2 = new g<>(this, location.latitude, location.longitude);
        gVar2.a(message, true);
        int binarySearch = Collections.binarySearch(this.J0, gVar2, this);
        if (binarySearch < 0) {
            List<ra> D0 = this.f10163p0.D0();
            boolean z10 = Ff() == 0 && ((f) x9()).f10184a == 0;
            int i10 = (-binarySearch) - 1;
            this.J0.add(i10, gVar2);
            jg(gVar2, i10);
            f fVar = (f) x9();
            if (!z10) {
                D0.add(bg(gVar2));
                this.f10163p0.J((Wf + i10) - (Gf() ? 1 : 0));
            } else {
                int size = D0.size();
                boolean x62 = this.f24495b.x6(fVar.f10194k);
                int i11 = x62 ? 4 : 3;
                ib.b.m(D0, D0.size() + i11);
                D0.add(new ra(3));
                D0.add(new ra(8, 0, 0, R.string.LiveLocations));
                D0.add(new ra(2));
                if (x62) {
                    D0.add(cg());
                }
                D0.add(bg(gVar2));
                this.f10163p0.M(size, i11 + 1);
            }
            hg(true, true);
            pf(true);
        }
    }

    public abstract boolean ng(V v10, g<T> gVar, boolean z10, boolean z11, boolean z12);

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void o6() {
        super.o6();
        if (this.f10171x0) {
            this.f10171x0 = false;
            Jf();
            return;
        }
        V v10 = this.f10164q0;
        if (v10 != null) {
            vg(v10);
        }
    }

    @Override
    public View oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f10161n0 = frameLayoutFix;
        yd.g.i(frameLayoutFix, R.id.theme_color_filling, this);
        this.f10161n0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        int W = ap.W(83);
        this.G0 = he.i.c2().h1();
        V zf = zf(context, W);
        this.f10164q0 = zf;
        if (zf != null) {
            this.f10161n0.addView(zf);
            c0 c0Var = new c0(context);
            this.f10166s0 = c0Var;
            c0Var.setBottomText(w.i1(R.string.DirectionGo).toUpperCase());
            this.f10166s0.setId(R.id.btn_direction);
            this.f10166s0.setOnClickListener(this);
            this.f10166s0.d(R.drawable.baseline_directions_24, 56.0f, 4.0f, R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon);
            int i10 = a0.i(4.0f);
            int i11 = i10 * 2;
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(56.0f) + i11, a0.i(56.0f) + i11, 85);
            int i12 = a0.i(16.0f) - i10;
            r12.rightMargin = i12;
            r12.bottomMargin = i12 + W;
            this.f10166s0.setLayoutParams(r12);
            t8(this.f10166s0);
            this.f10161n0.addView(this.f10166s0);
            c0 c0Var2 = new c0(context);
            this.f10165r0 = c0Var2;
            c0Var2.setId(R.id.btn_gps);
            this.f10165r0.setOnClickListener(this);
            this.f10165r0.d(R.drawable.baseline_gps_fixed_24, 56.0f, 4.0f, R.id.theme_color_filling, R.id.theme_color_icon);
            FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(a0.i(56.0f) + i11, a0.i(56.0f) + i11, 85);
            int i13 = a0.i(16.0f) - i10;
            r13.rightMargin = i13;
            int i14 = i13 + W;
            r13.bottomMargin = i14;
            if (this.f10166s0 != null) {
                r13.bottomMargin = i14 + a0.i(16.0f) + a0.i(56.0f);
            }
            this.f10165r0.setLayoutParams(r13);
            t8(this.f10165r0);
            this.f10161n0.addView(this.f10165r0);
            c0 c0Var3 = new c0(context);
            this.f10167t0 = c0Var3;
            c0Var3.setId(R.id.btn_layer);
            this.f10167t0.setOnClickListener(this);
            this.f10167t0.d(R.drawable.baseline_layers_24, 36.0f, 4.0f, R.id.theme_color_filling, R.id.theme_color_icon);
            FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(a0.i(36.0f) + i11, a0.i(36.0f) + i11, 53);
            r14.rightMargin = a0.i(10.0f) - i10;
            r14.topMargin = ud.d1.getTopOffset() + r14.rightMargin;
            this.f10167t0.setLayoutParams(r14);
            this.f10167t0.setAlpha(0.0f);
            t8(this.f10167t0);
            this.f10161n0.addView(this.f10167t0);
            c0 c0Var4 = new c0(context);
            this.f10168u0 = c0Var4;
            c0Var4.setEnabled(false);
            this.f10168u0.setAlpha(0.0f);
            this.f10168u0.d(0, 36.0f, 4.0f, R.id.theme_color_filling, R.id.theme_color_icon);
            FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(a0.i(36.0f) + i11, a0.i(36.0f) + i11, 51);
            r15.leftMargin = a0.i(10.0f) - i10;
            r15.topMargin = ud.d1.getTopOffset() + r15.leftMargin;
            this.f10168u0.setLayoutParams(r15);
            t8(this.f10168u0);
            this.f10161n0.addView(this.f10168u0);
            CustomRecyclerView customRecyclerView = (CustomRecyclerView) p0.v(t(), R.layout.recycler_custom, this.f10161n0);
            this.f10162o0 = customRecyclerView;
            customRecyclerView.k(new a());
            yd.g.g(this.f10162o0);
            this.f10162o0.setOverScrollMode(2);
            this.f10162o0.setVerticalScrollBarEnabled(false);
            this.f10162o0.g(new b(R.id.theme_color_background));
            t8(this.f10162o0);
            this.f10162o0.setItemAnimator(new tc.d(db.b.f7287b, 180L));
            this.f10162o0.setMeasureListener(new CustomRecyclerView.a() {
                @Override
                public final void a(CustomRecyclerView customRecyclerView2, int i15, int i16, int i17, int i18) {
                    yb.this.Nf(customRecyclerView2, i15, i16, i17, i18);
                }
            });
            this.f10162o0.setTouchInterceptor(xb.f10008a);
            this.f10162o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
            this.f10162o0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f10163p0 = new c(this);
            f fVar = (f) x9();
            this.J0 = new ArrayList();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ra(2).E(true));
            int i15 = fVar.f10184a;
            if (i15 == 0) {
                g<T> gVar = new g<>(this, fVar.f10185b, fVar.f10186c);
                TdApi.Message message = fVar.f10189f;
                gVar.a(message, message != null);
                gVar.f10205j = true;
                this.J0.add(gVar);
                arrayList.add(new ra(83, R.id.place));
            } else if (i15 == 1) {
                TdApi.Message f02 = this.f24495b.e2().f0(fVar.f10194k);
                if (f02 != null || this.f24495b.x6(fVar.f10194k)) {
                    arrayList.add(cg());
                }
                if (f02 != null) {
                    TdApi.Location location = ((TdApi.MessageLocation) f02.content).location;
                    g<T> gVar2 = new g<>(this, location.latitude, location.longitude);
                    this.D0 = gVar2;
                    gVar2.f10204i = true;
                }
                TdApi.Message message2 = fVar.f10189f;
                if (message2 != null && !this.f24495b.m7(message2)) {
                    g<T> gVar3 = new g<>(this, fVar.f10185b, fVar.f10186c);
                    gVar3.a(fVar.f10189f, true);
                    this.J0.add(gVar3);
                    arrayList.add(bg(gVar3));
                }
            }
            this.f10163p0.s2(arrayList, false);
            this.f10162o0.setAdapter(this.f10163p0);
            this.f10161n0.addView(this.f10162o0);
            if (fVar.f10184a == 1 && fVar.f10189f != null) {
                ((LinearLayoutManager) this.f10162o0.getLayoutManager()).z2(0, -W);
            }
            tf();
            this.C0 = v0.E(context);
            if (ag(this.f10164q0)) {
                td(new Runnable() {
                    @Override
                    public final void run() {
                        yb.this.Qf();
                    }
                });
            } else {
                Kf(this.f10164q0, false);
            }
            if (fVar.f10194k != 0) {
                this.f24495b.O9().g0(fVar.f10194k, this);
                this.f24495b.F4().W1().d(this);
                this.f24495b.v4().o(new TdApi.SearchChatRecentLocationMessages(fVar.f10194k, 100), this);
            }
            return this.f10161n0;
        }
        throw new IllegalStateException();
    }

    public final void of(final TdApi.Message message) {
        if (!Sa() && message.content.getConstructor() == 303973492 && message.schedulingState == null && !this.f24495b.m7(message) && ((TdApi.MessageLocation) message.content).livePeriod > 0) {
            m9(new Runnable() {
                @Override
                public final void run() {
                    yb.this.Mf(message);
                }
            });
        }
    }

    public abstract boolean og(V v10);

    @Override
    public void onClick(View view) {
        int[] Ef;
        int i10;
        int i11;
        f fVar = (f) x9();
        switch (view.getId()) {
            case R.id.btn_direction:
                if (!fg(this.f10164q0, fVar.f10185b, fVar.f10186c)) {
                    v.p(fVar.f10185b, fVar.f10186c, fVar.f10187d, fVar.f10188e);
                    return;
                }
                return;
            case R.id.btn_gps:
                if (this.E0 == 1) {
                    this.f10165r0.setInProgress(false);
                    this.f10172y0.h();
                    wg(0, null);
                    return;
                }
                this.f10165r0.setInProgress(true);
                this.f10172y0.s("focus_self", null, -1L, true);
                return;
            case R.id.btn_layer:
                jb.c cVar = new jb.c(4);
                u0 u0Var = new u0(4);
                for (int i12 : Ef()) {
                    if (i12 == 0) {
                        i11 = R.id.btn_layerTypeMapDefault;
                        i10 = R.string.LayerMapDefault;
                    } else if (i12 == 1) {
                        i11 = R.id.btn_layerTypeMapDark;
                        i10 = R.string.LayerMapDark;
                    } else if (i12 == 2) {
                        i11 = R.id.btn_layerTypeMapSatellite;
                        i10 = R.string.LayerMapSatellite;
                    } else if (i12 == 3) {
                        i11 = R.id.btn_layerTypeMapTerrain;
                        i10 = R.string.LayerMapTerrain;
                    } else if (i12 == 4) {
                        i11 = R.id.btn_layerTypeMapHybrid;
                        i10 = R.string.LayerMapHybrid;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    cVar.a(i11);
                    u0Var.a(i10);
                }
                if (!cVar.f()) {
                    Yd(cVar.e(), u0Var.d(), 0);
                    return;
                }
                return;
            case R.id.liveLocation:
                g<T> gVar = (g) ((ra) view.getTag()).d();
                if (this.E0 == 2 && this.F0 == gVar) {
                    wg(0, null);
                    return;
                } else if (gVar != null) {
                    wg(2, gVar);
                    return;
                } else {
                    return;
                }
            case R.id.liveLocationSelf:
                if (!this.H0) {
                    TdApi.Message f02 = this.f24495b.e2().f0(fVar.f10194k);
                    this.H0 = true;
                    this.f10163p0.p3(R.id.liveLocationSelf);
                    if (f02 != null) {
                        this.f24495b.v4().o(new TdApi.EditMessageLiveLocation(f02.chatId, f02.f19946id, null, null, 0, 0), this.f24495b.na());
                        return;
                    } else {
                        this.f10172y0.s("share_live", null, 10000L, true);
                        return;
                    }
                } else {
                    return;
                }
            case R.id.place:
                int i13 = this.E0;
                if (i13 == 0 || i13 == 1 || (i13 == 2 && Gf() && this.F0 != this.J0.get(0))) {
                    if (Gf()) {
                        wg(2, this.J0.get(0));
                        return;
                    }
                    return;
                } else if (this.D0 != null) {
                    wg(0, null);
                    return;
                } else if (this.E0 == 2) {
                    zg(true);
                    this.f10172y0.s("focus_target", null, -1L, true);
                    return;
                } else {
                    wg(2, this.J0.get(0));
                    return;
                }
            default:
                return;
        }
    }

    public final void pf(boolean z10) {
        int Ff;
        if (this.f10164q0 != null && (Ff = Ff()) != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f10162o0.getLayoutManager();
            if (linearLayoutManager.X1() <= 0) {
                View C = linearLayoutManager.C(0);
                int U = C != null ? linearLayoutManager.U(C) : 0;
                int W = ap.W(83);
                if (Ff > 1) {
                    W += W / 2;
                }
                if (Gf()) {
                    if (Ff == 1) {
                        W += W / 2;
                    }
                    W += ap.W(3) + ap.W(2) + ap.W(8);
                }
                if (C == null || Math.min(this.f10162o0.getMeasuredWidth(), this.f10162o0.getMeasuredHeight()) == 0) {
                    linearLayoutManager.z2(0, -W);
                } else if (U > (-W)) {
                    this.f10162o0.C1();
                    this.f10162o0.u1(0, W + U);
                }
            }
        }
    }

    public final void pg() {
        wg(3, null);
    }

    @Override
    public void q5(boolean z10) {
    }

    public final void qf() {
        LinearLayoutManager linearLayoutManager;
        int X1;
        if (this.f10164q0 != null) {
            int measuredWidth = this.f10162o0.getMeasuredWidth();
            int measuredHeight = this.f10162o0.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0 && (X1 = (linearLayoutManager = (LinearLayoutManager) this.f10162o0.getLayoutManager()).X1()) != -1) {
                int W = (measuredHeight - ap.W(2)) - ap.W(83);
                int s10 = this.f10163p0.s(X1);
                View C = linearLayoutManager.C(X1);
                if (C != null) {
                    s10 -= linearLayoutManager.U(C);
                }
                if (X1 > 0) {
                    s10 += W;
                }
                int topOffset = measuredWidth >= measuredHeight ? 0 : measuredWidth + ud.d1.getTopOffset();
                if (s10 > topOffset) {
                    this.f10162o0.C1();
                    this.f10162o0.u1(0, topOffset - s10);
                }
            }
        }
    }

    public abstract void qg(V v10);

    @Override
    public void r2(TdApi.Object object) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.w("Error: %s", t2.z5(object));
            } else if (constructor == -16498159) {
                TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
                if (messageArr.length > 0) {
                    final ArrayList arrayList = new ArrayList(messageArr.length);
                    for (TdApi.Message message : messageArr) {
                        if (message.content.getConstructor() == 303973492 && !message.isOutgoing && !this.f24495b.m7(message)) {
                            TdApi.Message message2 = null;
                            g<T> gVar = this.J0.isEmpty() ? null : this.J0.get(0);
                            if (gVar != null) {
                                message2 = gVar.f10201f;
                            }
                            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
                            if (messageLocation.livePeriod > 0 && ((message2 == null || message2.f19946id != message.f19946id) && (messageLocation.expiresIn > 0 || message2 == null || ((f) x9()).f10184a == 1))) {
                                TdApi.Location location = messageLocation.location;
                                arrayList.add(new g(this, location.latitude, location.longitude).a(message, true));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Collections.sort(arrayList, this);
                        ud(new Runnable() {
                            @Override
                            public final void run() {
                                yb.this.Uf(arrayList);
                            }
                        });
                    }
                }
            }
        }
    }

    public final k5.a rf(TdApi.Message message, boolean z10) {
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        g<T> gVar = this.D0;
        if (!z10 && Gf()) {
            gVar = this.J0.get(0);
        }
        StringBuilder sb2 = new StringBuilder();
        k5.a ga2 = k5.ga(this.f24495b, Math.max(message.date, message.editDate));
        sb2.append(ga2.f13197a);
        long j10 = ga2.f13198b;
        if (gVar != null) {
            if (sb2.length() > 0) {
                sb2.append(ce.c0.f5242a);
            }
            sb2.append(w.L2(v0.Y(location.latitude, location.longitude, gVar.f10196a, gVar.f10197b)));
        } else if (this.C0) {
            if (sb2.length() > 0) {
                sb2.append(ce.c0.f5242a);
            }
            sb2.append(w.i1(R.string.Calculating));
        }
        return new k5.a(sb2.toString(), j10);
    }

    public final List<g<T>> rg() {
        List<g<T>> list = this.J0;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException();
    }

    @Override
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    @Override
    public void sc() {
        super.sc();
        this.f10173z0 = true;
        if (this.f10172y0 == null) {
            this.f10172y0 = new x0(this.f24493a, this, true, false);
        }
        zg(true);
        this.f10172y0.i("", null);
    }

    public final float sf() {
        float f10 = this.f10169v0;
        eb.f fVar = this.f10170w0;
        return fVar != null ? f10 + (fVar.g() * (a0.i(16.0f) + a0.i(56.0f))) : f10;
    }

    public final void sg(g<T> gVar, int i10) {
        int size = this.f10163p0.D0().size();
        int Af = Af(i10);
        this.J0.remove(i10);
        mg(gVar, i10);
        if (Ff() == 0 && ((f) x9()).f10184a == 0) {
            int i11 = 4;
            if (this.f10163p0.D0().get(size - 2).j() == R.id.liveLocationSelf) {
                i11 = 5;
            }
            this.f10163p0.R1(size - i11, i11);
        } else {
            this.f10163p0.j1(Af);
        }
        hg(true, true);
    }

    public final void tf() {
        boolean z10 = false;
        boolean z11 = ((f) x9()).f10184a == 1;
        if (z11) {
            z11 = this.E0 != 2 || this.F0 == null;
        }
        eb.f fVar = this.f10170w0;
        if (fVar != null && fVar.h()) {
            z10 = true;
        }
        if (z10 != z11) {
            if (this.f10170w0 == null) {
                this.f10170w0 = new eb.f(1, this, db.b.f7287b, 180L);
            }
            this.f10170w0.p(z11, this.f10173z0);
        }
    }

    public final void tg(long[] jArr) {
        int i10 = 0;
        for (int size = this.J0.size() - 1; size >= 0; size--) {
            g<T> gVar = this.J0.get(size);
            TdApi.Message message = gVar.f10201f;
            if (!(message == null || ib.b.s(jArr, message.f19946id) == -1)) {
                sg(gVar, size);
                i10++;
                if (i10 == jArr.length) {
                    return;
                }
            }
        }
    }

    public final void uf(boolean z10) {
        boolean z11 = this.f24495b.e2().f0(((f) x9()).f10194k) != null;
        if (this.I0 != z11) {
            this.I0 = z11;
            this.H0 = false;
            g<T> gVar = this.D0;
            if (gVar != null) {
                if (z11) {
                    Log.i("adding my location, because started sharing", new Object[0]);
                    jg(this.D0, -1);
                } else {
                    mg(gVar, -1);
                }
                hg(z10, true);
            }
            this.f10163p0.p3(R.id.liveLocationSelf);
            if (!z11 && ((f) x9()).f10192i) {
                Zb();
            }
        }
    }

    public final void ug() {
        List<g<T>> list = this.K0;
        if (list == null) {
            this.K0 = new ArrayList(this.J0);
        } else {
            list.clear();
            this.K0.addAll(this.J0);
        }
        Collections.sort(this.K0, this);
        boolean z10 = false;
        int i10 = 0;
        for (g<T> gVar : this.J0) {
            if (gVar != this.K0.get(i10)) {
                z10 = true;
            }
            i10++;
        }
        this.f10163p0.Y2(R.id.liveLocation);
        if (z10) {
            androidx.recyclerview.widget.d.b(new e()).b(this);
            this.J0.clear();
            this.J0.addAll(this.K0);
        }
    }

    public final void vf(g<T> gVar, int i10) {
        TdApi.Message message = gVar.f10201f;
        if (message != null) {
            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
            TdApi.Location location = messageLocation.location;
            gVar.f10202g = SystemClock.uptimeMillis() + (messageLocation.expiresIn * 1000);
            double d10 = location.latitude;
            if (d10 == gVar.f10196a && location.longitude == gVar.f10197b) {
                ig(gVar, ((TdApi.MessageLocation) gVar.f10201f.content).expiresIn > 0);
                return;
            }
            gVar.f10196a = d10;
            gVar.f10197b = location.longitude;
            kg(gVar, i10);
            if (this.E0 == 2 && this.F0 == gVar) {
                ng(this.f10164q0, gVar, this.f10173z0, false, false);
            } else {
                Eg();
            }
        }
    }

    public abstract void vg(V v10);

    public final void wf(g<T> gVar, int i10) {
        vf(gVar, i10);
        ug();
    }

    public final void wg(int r13, de.yb.g<T> r14) {
        throw new UnsupportedOperationException("Method not decompiled: de.yb.wg(int, de.yb$g):void");
    }

    public final void xf() {
        float f10;
        View C;
        int max;
        int measuredWidth = this.f10164q0.getMeasuredWidth();
        int measuredHeight = this.f10164q0.getMeasuredHeight() - ud.d1.getTopOffset();
        if (measuredHeight > measuredWidth) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f10162o0.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            if (X1 > 0) {
                max = measuredWidth - measuredHeight;
            } else if (X1 == 0 && (C = linearLayoutManager.C(0)) != null) {
                max = Math.max(measuredWidth - measuredHeight, linearLayoutManager.U(C));
            }
            f10 = max;
            Bg(f10);
        }
        f10 = 0.0f;
        Bg(f10);
    }

    public final void xg(boolean z10) {
        eb.f fVar = this.A0;
        if (z10 != (fVar != null && fVar.h())) {
            if (this.A0 == null) {
                this.A0 = new eb.f(0, this, db.b.f7287b, 180L);
            }
            this.A0.p(z10, true);
        }
    }

    @Override
    public void y2(TdApi.Message message) {
        of(message);
    }

    public int compare(g<T> gVar, g<T> gVar2) {
        double d10;
        double d11;
        boolean z10;
        boolean z11 = gVar.f10205j;
        if (z11 != gVar2.f10205j) {
            return z11 ? -1 : 1;
        }
        boolean z12 = false;
        boolean z13 = gVar.f10201f == null;
        if (z13 != (gVar2.f10201f == null)) {
            return z13 ? -1 : 1;
        }
        boolean z14 = Gf() && ((f) x9()).f10189f == null;
        if (z14) {
            f fVar = (f) x9();
            d11 = fVar.f10185b;
            d10 = fVar.f10186c;
            z10 = z14;
        } else {
            g<T> gVar3 = this.D0;
            z10 = gVar3 != null;
            if (z10) {
                d11 = gVar3.f10196a;
                d10 = gVar3.f10197b;
            } else {
                d11 = 0.0d;
                d10 = 0.0d;
            }
        }
        if (gVar.f10201f == null) {
            double d12 = d11;
            double d13 = d10;
            float Y = v0.Y(d12, d13, gVar.f10196a, gVar.f10197b);
            float Y2 = v0.Y(d12, d13, gVar2.f10196a, gVar2.f10197b);
            if (Y != Y2) {
                return Y < Y2 ? -1 : 1;
            }
            return 0;
        }
        boolean z15 = gVar.f10204i;
        if (z15 != gVar2.f10204i) {
            return z15 ? -1 : 1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z16 = gVar.f10202g < uptimeMillis;
        if (gVar2.f10202g < uptimeMillis) {
            z12 = true;
        }
        if (z16 != z12) {
            return z16 ? 1 : -1;
        }
        TdApi.Message message = gVar.f10201f;
        TdApi.Message message2 = gVar2.f10201f;
        TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
        TdApi.MessageLocation messageLocation2 = (TdApi.MessageLocation) message2.content;
        if (z10) {
            TdApi.Location location = messageLocation.location;
            double d14 = d11;
            double d15 = d10;
            float Y3 = v0.Y(d14, d15, location.latitude, location.longitude);
            TdApi.Location location2 = messageLocation2.location;
            float Y4 = v0.Y(d14, d15, location2.latitude, location2.longitude);
            if (Y3 != Y4) {
                return Y3 < Y4 ? -1 : 1;
            }
        }
        int max = Math.max(message.date, message.editDate);
        int max2 = Math.max(message2.date, message2.editDate);
        if (max != max2) {
            return Integer.compare(max, max2);
        }
        long R0 = ob.e.R0(message);
        long R02 = ob.e.R0(message2);
        if (R0 != R02) {
            return Long.compare(R0, R02);
        }
        return Long.compare(message.f19946id, message2.f19946id);
    }

    public final boolean yg(boolean z10) {
        g<T> gVar;
        if (this.B0 == z10) {
            return false;
        }
        if (z10 && !og(this.f10164q0)) {
            return false;
        }
        this.B0 = z10;
        this.f10165r0.g(z10 ? R.drawable.baseline_explore_24 : R.drawable.baseline_gps_fixed_24);
        if (!z10 || !((gVar = this.D0) == null || gVar.f10200e == 0)) {
            Eg();
        }
        if (z10) {
            return true;
        }
        gg(this.f10164q0);
        return true;
    }

    @Override
    public long za(boolean z10) {
        return 260L;
    }

    public abstract V zf(Context context, int i10);

    public final void zg(boolean z10) {
        if (this.C0 != z10) {
            this.C0 = z10;
            this.f10163p0.p3(R.id.place);
            this.f10163p0.Y2(R.id.liveLocation);
        }
    }

    public static class f {
        public final int f10184a;
        public double f10185b;
        public double f10186c;
        public String f10187d;
        public String f10188e;
        public TdApi.Message f10189f;
        public long f10190g;
        public h f10191h;
        public boolean f10192i;
        public long f10193j;
        public long f10194k;
        public long f10195l;

        public f(double d10, double d11) {
            this.f10184a = 0;
            this.f10185b = d10;
            this.f10186c = d11;
        }

        public f a(long j10, long j11) {
            this.f10194k = j10;
            this.f10195l = j11;
            return this;
        }

        public f b(long j10) {
            this.f10193j = j10;
            return this;
        }

        public f c(boolean z10) {
            this.f10192i = z10;
            return this;
        }

        public f(double d10, double d11, TdApi.Message message) {
            this.f10184a = (message == null || ((TdApi.MessageLocation) message.content).expiresIn != 0) ? 1 : 0;
            this.f10185b = d10;
            this.f10186c = d11;
            this.f10189f = message;
            if (message != null) {
                this.f10190g = SystemClock.uptimeMillis() + (((TdApi.MessageLocation) message.content).expiresIn * 1000);
            }
        }
    }
}
