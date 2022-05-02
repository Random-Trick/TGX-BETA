package p038ce;

import android.content.Context;
import android.graphics.Rect;
import android.location.Location;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C0944d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1399s0;
import be.C1405v;
import gd.C4684k5;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import me.C6851c0;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.C2546iq;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5919k;
import p141jd.C5996x0;
import p156kd.C6246h;
import p193nb.C7321e;
import p268t1.AbstractC8949d;
import p335xd.C10192g;
import p350yd.AbstractC10748j1;
import p350yd.C10651f1;
import p350yd.C10712hc;
import p350yd.C10722i1;
import p350yd.C10930q6;
import p364zd.AbstractC11531p;
import p364zd.C11524j;
import sc.C8731d;
import sc.C8795k2;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;

public abstract class AbstractView$OnClickListenerC3344yb<V extends View, T> extends AbstractC9323v4<C3351f> implements View.OnClickListener, C5996x0.AbstractC6003g, AbstractC9213j1, C3950k.AbstractC3952b, Client.AbstractC7865g, AbstractC10748j1, Comparator<C3352g<T>>, C10651f1.AbstractC10652a, AbstractC8949d {
    public C3940f f11115A0;
    public boolean f11116B0;
    public boolean f11117C0;
    public C3352g<T> f11118D0;
    public int f11119E0;
    public C3352g<T> f11120F0;
    public int f11121G0;
    public boolean f11122H0;
    public boolean f11123I0;
    public List<C3352g<T>> f11124J0;
    public List<C3352g<T>> f11125K0;
    public FrameLayoutFix f11126n0;
    public CustomRecyclerView f11127o0;
    public C2546iq f11128p0;
    public V f11129q0;
    public C6851c0 f11130r0;
    public C6851c0 f11131s0;
    public C6851c0 f11132t0;
    public C6851c0 f11133u0;
    public float f11134v0;
    public C3940f f11135w0;
    public boolean f11136x0;
    public C5996x0 f11137y0;
    public boolean f11138z0;

    public class C3345a extends RecyclerView.AbstractC0910t {
        public C3345a() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            AbstractView$OnClickListenerC3344yb.this.m30713xf();
        }
    }

    public class C3346b extends C2546iq.C2549c {
        public C3346b(int i) {
            super(i);
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39421k0(view);
            if (k0 > 0) {
                rect.top = 0;
            } else if (k0 == 0) {
                rect.top = (recyclerView.getMeasuredHeight() - C2139ap.m35479W(2)) - C2139ap.m35479W(83);
            }
        }

        @Override
        public boolean mo30707l(C2964ra raVar) {
            return super.mo30707l(raVar) && (raVar.m32876A() != 2 || !raVar.m32848b());
        }
    }

    public class C3347c extends C2546iq {

        public class RunnableC3348a implements Runnable {
            public final C8795k2 f11142a;
            public final TdApi.Message f11143b;

            public RunnableC3348a(C8795k2 k2Var, TdApi.Message message) {
                this.f11142a = k2Var;
                this.f11143b = message;
            }

            @Override
            public void run() {
                if (this.f11142a.getSubtitleUpdater() == this) {
                    C10930q6 q6Var = AbstractView$OnClickListenerC3344yb.this.f30167b;
                    TdApi.Message message = this.f11143b;
                    C4684k5.C4685a ga2 = C4684k5.m26512ga(q6Var, Math.max(message.date, message.editDate));
                    this.f11142a.m11338M1(ga2.f15717a);
                    if (ga2.f15718b != -1) {
                        this.f11142a.m11344E1(this, SystemClock.uptimeMillis() - ga2.f15718b);
                    }
                }
            }
        }

        public C3347c(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo11660G2(C2964ra raVar, int i, C8795k2 k2Var, boolean z) {
            String str;
            String i1;
            boolean z2 = false;
            long j = 0;
            switch (raVar.m32835j()) {
                case R.id.liveLocation:
                    C3352g gVar = (C3352g) raVar.m32844d();
                    AbstractView$OnClickListenerC3344yb.this.m30804Ag(k2Var, gVar.f11167f, gVar.f11168g, false);
                    return;
                case R.id.liveLocationSelf:
                    TdApi.Message f0 = AbstractView$OnClickListenerC3344yb.this.f30167b.m2480e2().m1648f0(AbstractView$OnClickListenerC3344yb.this.m9131x9().f11160k);
                    if (f0 != null) {
                        C4684k5.C4685a ga2 = C4684k5.m26512ga(AbstractView$OnClickListenerC3344yb.this.f30167b, Math.max(f0.date, f0.editDate));
                        TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) f0.content;
                        long max = Math.max(0L, ((f0.date + messageLocation.livePeriod) * 1000) - System.currentTimeMillis());
                        String i12 = C4403w.m27869i1(R.string.StopSharingLiveLocation);
                        String str2 = ga2.f15717a;
                        if (messageLocation.expiresIn == 0) {
                            z2 = true;
                        }
                        int i2 = messageLocation.livePeriod;
                        if (max > 0) {
                            j = SystemClock.uptimeMillis() + max;
                        }
                        k2Var.m11341I1(i12, str2, true, true, z2, i2, j);
                        k2Var.m11342G1(AbstractView$OnClickListenerC3344yb.this.f11122H0, z);
                        if (ga2.f15718b != -1) {
                            k2Var.m11344E1(new RunnableC3348a(k2Var, f0), SystemClock.uptimeMillis() - ga2.f15718b);
                            return;
                        }
                        return;
                    }
                    k2Var.setDefaultLiveLocation(false);
                    k2Var.m11342G1(AbstractView$OnClickListenerC3344yb.this.f11122H0, z);
                    return;
                case R.id.place:
                    C3351f x9 = AbstractView$OnClickListenerC3344yb.this.m9131x9();
                    int i3 = x9.f11150a;
                    if (i3 == 0) {
                        TdApi.Message message = x9.f11155f;
                        if (message != null) {
                            AbstractView$OnClickListenerC3344yb.this.m30804Ag(k2Var, message, x9.f11156g, true);
                            return;
                        }
                        if (AbstractView$OnClickListenerC3344yb.this.f11118D0 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(C4403w.m27964L2(C7389v0.m16664Y(x9.f11151b, x9.f11152c, AbstractView$OnClickListenerC3344yb.this.f11118D0.f11162a, AbstractView$OnClickListenerC3344yb.this.f11118D0.f11163b)));
                            if (!C5070i.m24061i(x9.f11154e)) {
                                sb2.append(C1363c0.f4975a);
                                sb2.append(x9.f11154e);
                            }
                            str = sb2.toString();
                        } else if (AbstractView$OnClickListenerC3344yb.this.f11117C0) {
                            str = C4403w.m27869i1(R.string.CalculatingDistance);
                        } else {
                            str = !C5070i.m24061i(x9.f11154e) ? x9.f11154e : C4403w.m27851n(x9.f11151b, x9.f11152c);
                        }
                        String str3 = str;
                        if (x9.f11159j != 0) {
                            i1 = AbstractView$OnClickListenerC3344yb.this.f30167b.m2691Q3(x9.f11159j);
                        } else {
                            i1 = !C5070i.m24061i(x9.f11153d) ? x9.f11153d : C4403w.m27869i1(R.string.DroppedPin);
                        }
                        k2Var.m11340J1(i1, str3, R.id.theme_color_file, null, false, 0, 0L);
                        if (x9.f11159j != 0) {
                            C6246h b3 = AbstractView$OnClickListenerC3344yb.this.f30167b.m2526b3(x9.f11159j);
                            if (b3 != null) {
                                k2Var.setRoundedLocationImage(b3);
                                return;
                            } else {
                                k2Var.setPlaceholder(AbstractView$OnClickListenerC3344yb.this.f30167b.m2915C3(x9.f11159j, false));
                                return;
                            }
                        } else {
                            k2Var.setLocationImage(x9.f11157h);
                            return;
                        }
                    } else if (i3 == 1) {
                        C3352g gVar2 = (C3352g) raVar.m32844d();
                        AbstractView$OnClickListenerC3344yb.this.m30804Ag(k2Var, gVar2.f11167f, gVar2.f11168g, true);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public class RunnableC3349d implements Runnable {
        public final C8795k2 f11146a;
        public final TdApi.Message f11147b;
        public final boolean f11148c;

        public RunnableC3349d(C8795k2 k2Var, TdApi.Message message, boolean z) {
            this.f11146a = k2Var;
            this.f11147b = message;
            this.f11148c = z;
        }

        @Override
        public void run() {
            if (this.f11146a.getSubtitleUpdater() == this) {
                C4684k5.C4685a rf = AbstractView$OnClickListenerC3344yb.this.m30725rf(this.f11147b, this.f11148c);
                this.f11146a.m11338M1(rf.f15717a);
                if (rf.f15718b != -1) {
                    this.f11146a.m11344E1(this, SystemClock.uptimeMillis() - rf.f15718b);
                }
            }
        }
    }

    public class C3350e extends C0944d.AbstractC0946b {
        public C3350e() {
        }

        @Override
        public boolean mo30706a(int i, int i2) {
            return true;
        }

        @Override
        public boolean mo30705b(int i, int i2) {
            return AbstractView$OnClickListenerC3344yb.this.f11124J0.get(i) == AbstractView$OnClickListenerC3344yb.this.f11125K0.get(i2);
        }

        @Override
        public int mo30704d() {
            return AbstractView$OnClickListenerC3344yb.this.f11125K0.size();
        }

        @Override
        public int mo30703e() {
            return AbstractView$OnClickListenerC3344yb.this.f11124J0.size();
        }
    }

    public static class C3352g<D> {
        public double f11162a;
        public double f11163b;
        public float f11164c;
        public float f11165d;
        public int f11166e;
        public TdApi.Message f11167f;
        public long f11168g = 0;
        public boolean f11169h;
        public boolean f11170i;
        public boolean f11171j;
        public final AbstractView$OnClickListenerC3344yb<?, D> f11172k;
        public D f11173l;

        public C3352g(AbstractView$OnClickListenerC3344yb<?, D> ybVar, double d, double d2) {
            this.f11172k = ybVar;
            this.f11162a = d;
            this.f11163b = d2;
        }

        public C3352g<D> m30699a(TdApi.Message message, boolean z) {
            this.f11167f = message;
            this.f11169h = z;
            this.f11168g = message != null ? SystemClock.uptimeMillis() + (((TdApi.MessageLocation) message.content).expiresIn * 1000) : 0L;
            return this;
        }
    }

    public AbstractView$OnClickListenerC3344yb(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    private void m30787Jf() {
        if (!m9347Sa()) {
            if (m9312Xa()) {
                this.f11136x0 = true;
                return;
            }
            mo30786Kf(this.f11129q0, false);
            m30719uf(false);
        }
    }

    public void m30784Mf(TdApi.Message message) {
        if (!m9347Sa()) {
            m30733nf(message);
        }
    }

    public void m30783Nf(CustomRecyclerView customRecyclerView, int i, int i2, int i3, int i4) {
        if (i2 > 0 && i2 != i4) {
            customRecyclerView.m39504A0();
        }
        m30713xf();
    }

    public static boolean m30782Of(CustomRecyclerView customRecyclerView, float f, float f2) {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) customRecyclerView.getLayoutManager();
        return linearLayoutManager.m39549X1() != 0 || (C = linearLayoutManager.mo39262C(0)) == null || ((float) (C.getTop() + C.getMeasuredHeight())) < f2;
    }

    public void m30780Pf() {
        if (!m9347Sa()) {
            m30787Jf();
        }
    }

    public void m30778Qf() {
        mo30786Kf(this.f11129q0, true);
        m9151ud(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3344yb.this.m30780Pf();
            }
        });
    }

    public void m30776Rf(int i) {
        if (this.f11118D0 != null) {
            C3351f fVar = (C3351f) m9131x9();
            this.f11122H0 = true;
            this.f11128p0.m34130s3(R.id.liveLocationSelf);
            C10930q6 q6Var = this.f30167b;
            long j = fVar.f11160k;
            long j2 = fVar.f11161l;
            boolean h3 = q6Var.m2431h3(j);
            C3352g<T> gVar = this.f11118D0;
            q6Var.m2231tb(j, j2, 0L, h3, false, new TdApi.InputMessageLocation(new TdApi.Location(gVar.f11162a, gVar.f11163b, gVar.f11164c), i, this.f11118D0.f11166e, 0));
        }
    }

    public void m30774Sf(long j, long j2, int i) {
        if (!m9347Sa() && ((C3351f) m9131x9()).f11160k == j) {
            m30794Fg(j2, i);
        }
    }

    public void m30772Tf(long j, long[] jArr) {
        if (!m9347Sa() && ((C3351f) m9131x9()).f11160k == j) {
            m30720tg(jArr);
        }
    }

    public void m30770Uf(ArrayList arrayList) {
        if (!m9347Sa()) {
            m30801Cf(arrayList);
        }
    }

    public void m30768Vf(long j, long j2, TdApi.MessageLocation messageLocation) {
        if (!m9347Sa() && ((C3351f) m9131x9()).f11160k == j) {
            m30792Gg(j2, messageLocation);
        }
    }

    public static C2964ra m30754cg() {
        return new C2964ra(83, R.id.liveLocationSelf);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public final int m30805Af(int i) {
        if (m30793Gf()) {
            i--;
        }
        return m30766Wf() + i;
    }

    public final void m30804Ag(C8795k2 k2Var, TdApi.Message message, long j, boolean z) {
        C10712hc hcVar = new C10712hc(this.f30167b, message.chatId, message.senderId);
        k2Var.setRoundedLocationImage(hcVar.m4215a());
        C4684k5.C4685a rf = m30725rf(message, z);
        TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
        k2Var.m11340J1(hcVar.m4211e(), rf.f15717a, hcVar.m4214b(), hcVar.m4212d(), j == 0 || SystemClock.uptimeMillis() >= j, messageLocation.livePeriod, j);
        if (rf.f15718b != -1) {
            k2Var.m11344E1(new RunnableC3349d(k2Var, message, z), SystemClock.uptimeMillis() - rf.f15718b);
        }
    }

    public abstract void mo30803Bf(V v);

    public final void m30802Bg(float f) {
        if (this.f11134v0 != f) {
            this.f11134v0 = f;
            this.f11129q0.setTranslationY(f / 2.0f);
            C6851c0 c0Var = this.f11131s0;
            if (c0Var != null) {
                c0Var.setTranslationY(f);
            }
            this.f11130r0.setTranslationY(m30723sf());
        }
    }

    public final void m30801Cf(ArrayList<C3352g<T>> arrayList) {
        int i;
        int size = this.f11124J0.size();
        this.f11124J0.addAll(arrayList);
        List<C2964ra> F0 = this.f11128p0.m34240F0();
        int size2 = F0.size();
        if (((C3351f) m9131x9()).f11150a == 0) {
            i = 4;
            C5062b.m24159m(F0, arrayList.size() + size2 + 4);
            F0.add(new C2964ra(3));
            F0.add(new C2964ra(8, 0, 0, R.string.LiveLocations));
            F0.add(new C2964ra(2));
            if (this.f30167b.m2236t6(((C3351f) m9131x9()).f11160k)) {
                F0.add(m30754cg());
            }
        } else {
            C5062b.m24159m(F0, arrayList.size() + size2);
            i = 0;
        }
        Iterator<C3352g<T>> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C3352g<T> next = it.next();
            F0.add(m30756bg(next));
            mo30740jg(next, size + i2);
            i2++;
        }
        this.f11128p0.m39308M(size2, arrayList.size() + i);
        m30718ug();
        m30744hg(false, true);
        m30729pf(true);
    }

    public final void m30800Cg(int i) {
        if (this.f11121G0 != i) {
            int Xf = m30764Xf();
            this.f11121G0 = i;
            if (i == -1 || mo30788Ig(i)) {
                C4868i.m24726c2().m24782U4(i);
            }
            int Xf2 = m30764Xf();
            if (Xf != Xf2) {
                mo30750eg(Xf, Xf2);
            }
        }
    }

    public abstract boolean mo30799Df(V v);

    public final void m30798Dg(Location location) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float bearing = location.getBearing();
        int A0 = C7389v0.m16757A0(location);
        C3352g<T> gVar = this.f11118D0;
        if (gVar == null || gVar.f11162a != latitude || gVar.f11163b != longitude) {
            if (gVar == null) {
                C3352g<T> gVar2 = new C3352g<>(this, latitude, longitude);
                this.f11118D0 = gVar2;
                gVar2.f11170i = true;
                if (this.f11123I0) {
                    mo30740jg(gVar2, -1);
                    m30744hg(true, false);
                }
            } else {
                gVar.f11162a = latitude;
                gVar.f11163b = longitude;
            }
            C3352g<T> gVar3 = this.f11118D0;
            gVar3.f11166e = A0;
            gVar3.f11165d = bearing;
            this.f11117C0 = false;
            m30752dg();
        } else if (gVar.f11166e != A0) {
            gVar.f11166e = A0;
            gVar.f11165d = bearing;
            if (this.f11116B0) {
                m30796Eg();
            }
        }
    }

    @Override
    public void mo4051E2(TdApi.Message message) {
        m30731of(message);
    }

    public abstract int[] mo30797Ef();

    public final void m30796Eg() {
        C3352g<T> gVar;
        int i = this.f11119E0;
        if (i == 0) {
            mo30732ng(this.f11129q0, null, this.f11138z0, false, false);
        } else if (i == 1 && (gVar = this.f11118D0) != null) {
            mo30732ng(this.f11129q0, gVar, this.f11138z0, this.f11116B0, false);
        }
    }

    public final int m30795Ff() {
        int size = this.f11124J0.size();
        return m30793Gf() ? size - 1 : size;
    }

    public final void m30794Fg(long j, int i) {
        int Hf = m30791Hf(j);
        if (Hf != -1) {
            this.f11124J0.get(Hf).f11167f.editDate = i;
        }
    }

    @Override
    public void mo9435G8(float f) {
        this.f11132t0.setAlpha(f);
        this.f11133u0.setAlpha(f);
        this.f11133u0.setTranslationY((-View$OnClickListenerC9170d1.m10066c3(true)) * (1.0f - f));
    }

    public final boolean m30793Gf() {
        return ((C3351f) m9131x9()).f11150a == 0;
    }

    public final void m30792Gg(long j, TdApi.MessageLocation messageLocation) {
        int Hf = m30791Hf(j);
        if (Hf != -1) {
            C3352g<T> gVar = this.f11124J0.get(Hf);
            gVar.f11167f.content = messageLocation;
            if (messageLocation.expiresIn != 0 || !m30793Gf() || ((C3351f) m9131x9()).f11155f == null) {
                m30715wf(gVar, Hf);
            } else {
                m30722sg(gVar, Hf);
            }
        }
    }

    @Override
    public void mo4050H(final long j, final long[] jArr) {
        if (!m9347Sa()) {
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    AbstractView$OnClickListenerC3344yb.this.m30772Tf(j, jArr);
                }
            });
        }
    }

    public final int m30791Hf(long j) {
        int i = 0;
        for (C3352g<T> gVar : this.f11124J0) {
            TdApi.Message message = gVar.f11167f;
            if (message != null && message.f25406id == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void m30790Hg(final long j, final long j2, final TdApi.MessageLocation messageLocation) {
        if (!m9347Sa() && messageLocation.livePeriod > 0) {
            m9211m9(new Runnable() {
                @Override
                public final void run() {
                    AbstractView$OnClickListenerC3344yb.this.m30768Vf(j, j2, messageLocation);
                }
            });
        }
    }

    public final int m30789If(TdApi.MessageSender messageSender, long j) {
        int i = 0;
        int i2 = -1;
        for (C3352g<T> gVar : this.f11124J0) {
            TdApi.Message message = gVar.f11167f;
            if (message != null) {
                if (message.f25406id == j) {
                    return i;
                }
                if (C7321e.m16975W(message.senderId, messageSender) && (i != 0 || !m30793Gf())) {
                    i2 = i;
                }
            }
            i++;
        }
        return i2;
    }

    public abstract boolean mo30788Ig(int i);

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo10851K6(int i, int i2, Object obj) {
        Log.m14719i("onChanged %d", Integer.valueOf(i));
        if (m30793Gf()) {
            i--;
        }
        int Wf = i + m30766Wf();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f11128p0.m39312I(Wf + i3);
        }
    }

    public abstract void mo30786Kf(V v, boolean z);

    @Override
    public void mo1718L1(TdApi.Location location, int i) {
    }

    public final boolean m30785Lf() {
        return this.f11123I0;
    }

    @Override
    public boolean mo9386Me() {
        return true;
    }

    @Override
    public void mo8864N0(int i) {
        int i2;
        switch (i) {
            case R.id.btn_layerTypeMapDark:
                i2 = 1;
                break;
            case R.id.btn_layerTypeMapDefault:
                i2 = 0;
                break;
            case R.id.btn_layerTypeMapHybrid:
                i2 = 4;
                break;
            case R.id.btn_layerTypeMapSatellite:
                i2 = 2;
                break;
            case R.id.btn_layerTypeMapTerrain:
                i2 = 3;
                break;
            default:
                return;
        }
        if (m30764Xf() != i2 && ((i2 == 0 && !C11524j.m141z0()) || (i2 == 1 && C11524j.m141z0()))) {
            i2 = -1;
        }
        m30800Cg(i2);
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_headerButtonIcon;
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i != 0) {
            if (i == 1) {
                float f3 = 1.0f - f;
                this.f11131s0.setAlpha(f3);
                float f4 = (f3 * 0.4f) + 0.6f;
                this.f11131s0.setScaleX(f4);
                this.f11131s0.setScaleY(f4);
                this.f11130r0.setTranslationY(m30723sf());
            }
        } else if (f == 0.0f) {
            this.f11130r0.setIconColorId(R.id.theme_color_icon);
        } else if (f == 1.0f) {
            this.f11130r0.setIconColorId(R.id.theme_color_iconActive);
        } else {
            this.f11130r0.setCustomIconColor(C5064d.m24128d(C11524j.m159q0(), C11524j.m228N(R.id.theme_color_iconActive), f));
        }
    }

    @Override
    public void mo4352Q0(C10930q6 q6Var, ArrayList<TdApi.Message> arrayList) {
        if (!m9347Sa()) {
            m30719uf(true);
        }
    }

    @Override
    public void mo4048R3(long j, long j2) {
    }

    @Override
    public int mo407R9() {
        return R.id.controller_map;
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return f2 <= ((float) View$OnClickListenerC9170d1.m10066c3(true));
    }

    @Override
    public void mo4047T0(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        C10722i1.m4168d(this, j, j2, messageInteractionInfo);
    }

    @Override
    public void mo4046V(long j, long j2) {
        C10722i1.m4166f(this, j, j2);
    }

    @Override
    public void mo4045V1(long j, long j2, boolean z) {
        C10722i1.m4164h(this, j, j2, z);
    }

    @Override
    public void mo4376V3(C5996x0 x0Var, String str, Location location) {
        if (!m9347Sa()) {
            this.f11130r0.setInProgress(false);
            if (location != null) {
                V v = this.f11129q0;
                if (v != null) {
                    mo30799Df(v);
                }
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1788203700:
                        if (str.equals("share_live")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1041597869:
                        if (str.equals("focus_self")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -223054120:
                        if (str.equals("focus_target")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f11122H0 = false;
                        this.f11128p0.m34130s3(R.id.liveLocationSelf);
                        m9351Rc(((C3351f) m9131x9()).f11160k, new AbstractC5919k() {
                            @Override
                            public final void mo3250a(int i) {
                                AbstractView$OnClickListenerC3344yb.this.m30776Rf(i);
                            }
                        });
                        return;
                    case 1:
                        if (this.f11119E0 != 1) {
                            m30714wg(1, null);
                            return;
                        } else if (!m30710yg(true ^ this.f11116B0) && !this.f11116B0) {
                            m30714wg(0, null);
                            return;
                        } else {
                            return;
                        }
                    case 2:
                        m30798Dg(location);
                        m30714wg(0, null);
                        return;
                    default:
                        return;
                }
            } else if (C7389v0.m16742E(this.f30165a) && this.f11129q0 != null) {
                m30708zg(true);
                if (!mo30799Df(this.f11129q0)) {
                    this.f11137y0.m21585s(str, null, 1000L, true);
                }
            }
        }
    }

    @Override
    public void mo10850W1(int i, int i2) {
        Log.m14719i("onInserted %d", Integer.valueOf(i));
        int Wf = m30766Wf() + i;
        if (m30793Gf()) {
            Wf--;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f11128p0.m34129t0(Wf + i3, m30756bg(this.f11124J0.get(i + i3)));
        }
    }

    public final int m30766Wf() {
        int size = this.f11128p0.m34240F0().size();
        int size2 = this.f11124J0.size();
        if (m30793Gf()) {
            size2--;
        }
        return size - size2;
    }

    @Override
    public void mo4044X1(TdApi.Message message, long j) {
        m30731of(message);
    }

    public final int m30764Xf() {
        int i = this.f11121G0;
        return i != -1 ? i : C11524j.m141z0() ? 1 : 0;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final V m30762Yf() {
        V v = this.f11129q0;
        if (v != null) {
            return v;
        }
        throw new IllegalStateException();
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C3351f fVar = (C3351f) m9131x9();
        if (fVar.f11160k != 0) {
            this.f30167b.m2781K9().m1806t0(fVar.f11160k, this);
            this.f30167b.m2930B4().m4735W1().m4357s(this);
        }
        for (C3352g<T> gVar : this.f11124J0) {
            T t = gVar.f11173l;
            if (t instanceof AbstractC5911c) {
                ((AbstractC5911c) t).mo4501a3();
            }
        }
        m30710yg(false);
        V v = this.f11129q0;
        if (v != null) {
            mo30803Bf(v);
            this.f11129q0 = null;
        }
        C5996x0 x0Var = this.f11137y0;
        if (x0Var != null) {
            x0Var.m21593k();
        }
        C1399s0.m37162q(this.f11127o0);
    }

    public final C3352g<T> m30760Zf(boolean z) {
        Location l;
        C3352g<T> gVar = this.f11118D0;
        if (gVar != null) {
            return gVar;
        }
        if (!this.f11117C0 || !z || (l = C5996x0.m21592l(this.f30165a, true)) == null) {
            return null;
        }
        C3352g<T> gVar2 = new C3352g<>(this, l.getLatitude(), l.getLongitude());
        gVar2.f11170i = true;
        return gVar2;
    }

    @Override
    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
        super.mo135a7(pVar, pVar2);
        if (this.f11121G0 == -1) {
            boolean c = pVar.mo94c();
            boolean c2 = pVar2.mo94c();
            if (c != c2) {
                mo30750eg(!c2 ? 1 : 0, c2 ? 1 : 0);
            }
        }
    }

    public abstract boolean mo30758ag(V v);

    @Override
    public void mo4351b4(ArrayList<C10930q6> arrayList, ArrayList<ArrayList<TdApi.Message>> arrayList2) {
        if (!m9347Sa()) {
            m30719uf(true);
        }
    }

    public final C2964ra m30756bg(C3352g<T> gVar) {
        return new C2964ra(83, R.id.liveLocation).m32870G(gVar);
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        V v = this.f11129q0;
        if (v != null) {
            mo30726qg(v);
        }
    }

    @Override
    public boolean mo9270dc() {
        return !this.f11138z0;
    }

    public final void m30752dg() {
        C3352g<T> gVar;
        this.f11128p0.m34130s3(R.id.place);
        m30796Eg();
        m30718ug();
        if (this.f11123I0 && (gVar = this.f11118D0) != null) {
            mo30738kg(gVar, -1);
        }
    }

    public abstract void mo30750eg(int i, int i2);

    public abstract boolean mo30748fg(V v, double d, double d2);

    public abstract void mo30746gg(V v);

    public final void m30744hg(boolean z, boolean z2) {
        if (this.f11119E0 != 0) {
            m30714wg(0, null);
        } else if ((z || ((C3351f) m9131x9()).f11150a != 0) && this.f11129q0 != null) {
            m30796Eg();
        }
    }

    public abstract void mo30742ig(C3352g<T> gVar, boolean z);

    @Override
    public void mo10849j0(int i, int i2) {
        int Wf = m30766Wf();
        if (m30793Gf()) {
            Wf--;
        }
        Log.m14719i("moveItem %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        this.f11128p0.m34114y1(i + Wf, Wf + i2);
    }

    public abstract void mo30740jg(C3352g<T> gVar, int i);

    @Override
    public void mo4350k1(C10930q6 q6Var, TdApi.Message message) {
        if (this.f11123I0 && this.f30167b.m2188w6() == q6Var.m2188w6() && ((C3351f) m9131x9()).f11160k == message.chatId) {
            this.f11128p0.m34130s3(R.id.liveLocationSelf);
        }
    }

    @Override
    public void mo4042k5(TdApi.Message message, long j, int i, String str) {
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        C5996x0 x0Var = this.f11137y0;
        if (x0Var != null) {
            x0Var.m21596h();
        }
    }

    public abstract void mo30738kg(C3352g<T> gVar, int i);

    @Override
    public void mo4041l0(long j, long j2, TdApi.MessageContent messageContent) {
        if (messageContent.getConstructor() == 303973492) {
            m30790Hg(j, j2, (TdApi.MessageLocation) messageContent);
        }
    }

    public abstract void mo30736lg(C3352g<T> gVar, boolean z);

    @Override
    public void mo10848m4(int i, int i2) {
        Log.m14719i("onRemoved %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (m30793Gf()) {
            i--;
        }
        int Wf = m30766Wf();
        if (i2 == 1) {
            this.f11128p0.m34147n1(Wf + i);
        } else {
            this.f11128p0.m34204V1(Wf + i, i2);
        }
    }

    public abstract void mo30734mg(C3352g<T> gVar, int i);

    @Override
    public void mo4362n5(C5996x0 x0Var, int i, String str, Location location) {
        if (!m9347Sa()) {
            this.f11130r0.setInProgress(false);
            m30708zg(false);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1788203700:
                    if (str.equals("share_live")) {
                        c = 0;
                        break;
                    }
                    break;
                case -223054120:
                    if (str.equals("focus_target")) {
                        c = 1;
                        break;
                    }
                    break;
                case 0:
                    if (str.equals("")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f11122H0 = false;
                    this.f11128p0.m34130s3(R.id.liveLocationSelf);
                    return;
                case 1:
                    if (this.f11118D0 == null && this.f11124J0.size() > 0) {
                        if (this.f11119E0 != 2 || this.f11120F0 != this.f11124J0.get(0)) {
                            m30714wg(0, null);
                            return;
                        }
                        return;
                    }
                    return;
                case 2:
                    if (this.f11118D0 == null) {
                        m30714wg(2, this.f11124J0.get(0));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void m30733nf(TdApi.Message message) {
        int If = m30789If(message.senderId, message.f25406id);
        if (If != -1) {
            C3352g<T> gVar = this.f11124J0.get(If);
            gVar.m30699a(message, true);
            m30715wf(gVar, If);
            return;
        }
        int Wf = m30766Wf();
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        C3352g<T> gVar2 = new C3352g<>(this, location.latitude, location.longitude);
        gVar2.m30699a(message, true);
        int binarySearch = Collections.binarySearch(this.f11124J0, gVar2, this);
        if (binarySearch < 0) {
            List<C2964ra> F0 = this.f11128p0.m34240F0();
            boolean z = m30795Ff() == 0 && ((C3351f) m9131x9()).f11150a == 0;
            int i = (-binarySearch) - 1;
            this.f11124J0.add(i, gVar2);
            mo30740jg(gVar2, i);
            C3351f fVar = (C3351f) m9131x9();
            if (!z) {
                F0.add(m30756bg(gVar2));
                this.f11128p0.m39311J((Wf + i) - (m30793Gf() ? 1 : 0));
            } else {
                int size = F0.size();
                boolean t6 = this.f30167b.m2236t6(fVar.f11160k);
                int i2 = t6 ? 4 : 3;
                C5062b.m24159m(F0, F0.size() + i2);
                F0.add(new C2964ra(3));
                F0.add(new C2964ra(8, 0, 0, R.string.LiveLocations));
                F0.add(new C2964ra(2));
                if (t6) {
                    F0.add(m30754cg());
                }
                F0.add(m30756bg(gVar2));
                this.f11128p0.m39308M(size, i2 + 1);
            }
            m30744hg(true, true);
            m30729pf(true);
        }
    }

    public abstract boolean mo30732ng(V v, C3352g<T> gVar, boolean z, boolean z2, boolean z3);

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        if (this.f11136x0) {
            this.f11136x0 = false;
            m30787Jf();
            return;
        }
        V v = this.f11129q0;
        if (v != null) {
            mo30716vg(v);
        }
    }

    @Override
    public View mo403oc(Context context) {
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f11126n0 = frameLayoutFix;
        C10192g.m5782i(frameLayoutFix, R.id.theme_color_filling, this);
        this.f11126n0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        int W = C2139ap.m35479W(83);
        this.f11121G0 = C4868i.m24726c2().m24687h1();
        V zf = mo30709zf(context, W);
        this.f11129q0 = zf;
        if (zf != null) {
            this.f11126n0.addView(zf);
            C6851c0 c0Var = new C6851c0(context);
            this.f11131s0 = c0Var;
            c0Var.setBottomText(C4403w.m27869i1(R.string.DirectionGo).toUpperCase());
            this.f11131s0.setId(R.id.btn_direction);
            this.f11131s0.setOnClickListener(this);
            this.f11131s0.m18789d(R.drawable.baseline_directions_24, 56.0f, 4.0f, R.id.theme_color_circleButtonRegular, R.id.theme_color_circleButtonRegularIcon);
            int i = C1357a0.m37541i(4.0f);
            int i2 = i * 2;
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f) + i2, C1357a0.m37541i(56.0f) + i2, 85);
            int i3 = C1357a0.m37541i(16.0f) - i;
            t1.rightMargin = i3;
            t1.bottomMargin = i3 + W;
            this.f11131s0.setLayoutParams(t1);
            m9163t8(this.f11131s0);
            this.f11126n0.addView(this.f11131s0);
            C6851c0 c0Var2 = new C6851c0(context);
            this.f11130r0 = c0Var2;
            c0Var2.setId(R.id.btn_gps);
            this.f11130r0.setOnClickListener(this);
            this.f11130r0.m18789d(R.drawable.baseline_gps_fixed_24, 56.0f, 4.0f, R.id.theme_color_filling, R.id.theme_color_icon);
            FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f) + i2, C1357a0.m37541i(56.0f) + i2, 85);
            int i4 = C1357a0.m37541i(16.0f) - i;
            t12.rightMargin = i4;
            int i5 = i4 + W;
            t12.bottomMargin = i5;
            if (this.f11131s0 != null) {
                t12.bottomMargin = i5 + C1357a0.m37541i(16.0f) + C1357a0.m37541i(56.0f);
            }
            this.f11130r0.setLayoutParams(t12);
            m9163t8(this.f11130r0);
            this.f11126n0.addView(this.f11130r0);
            C6851c0 c0Var3 = new C6851c0(context);
            this.f11132t0 = c0Var3;
            c0Var3.setId(R.id.btn_layer);
            this.f11132t0.setOnClickListener(this);
            this.f11132t0.m18789d(R.drawable.baseline_layers_24, 36.0f, 4.0f, R.id.theme_color_filling, R.id.theme_color_icon);
            FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(C1357a0.m37541i(36.0f) + i2, C1357a0.m37541i(36.0f) + i2, 53);
            t13.rightMargin = C1357a0.m37541i(10.0f) - i;
            t13.topMargin = View$OnClickListenerC9170d1.getTopOffset() + t13.rightMargin;
            this.f11132t0.setLayoutParams(t13);
            this.f11132t0.setAlpha(0.0f);
            m9163t8(this.f11132t0);
            this.f11126n0.addView(this.f11132t0);
            C6851c0 c0Var4 = new C6851c0(context);
            this.f11133u0 = c0Var4;
            c0Var4.setEnabled(false);
            this.f11133u0.setAlpha(0.0f);
            this.f11133u0.m18789d(0, 36.0f, 4.0f, R.id.theme_color_filling, R.id.theme_color_icon);
            FrameLayout.LayoutParams t14 = FrameLayoutFix.m18007t1(C1357a0.m37541i(36.0f) + i2, C1357a0.m37541i(36.0f) + i2, 51);
            t14.leftMargin = C1357a0.m37541i(10.0f) - i;
            t14.topMargin = View$OnClickListenerC9170d1.getTopOffset() + t14.leftMargin;
            this.f11133u0.setLayoutParams(t14);
            m9163t8(this.f11133u0);
            this.f11126n0.addView(this.f11133u0);
            CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37146y(mo4347s(), R.layout.recycler_custom, this.f11126n0);
            this.f11127o0 = customRecyclerView;
            customRecyclerView.m39422k(new C3345a());
            C10192g.m5784g(this.f11127o0);
            this.f11127o0.setOverScrollMode(2);
            this.f11127o0.setVerticalScrollBarEnabled(false);
            this.f11127o0.m39434g(new C3346b(R.id.theme_color_background));
            m9163t8(this.f11127o0);
            this.f11127o0.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
            this.f11127o0.setMeasureListener(new CustomRecyclerView.AbstractC7920a() {
                @Override
                public final void mo14159a(CustomRecyclerView customRecyclerView2, int i6, int i7, int i8, int i9) {
                    AbstractView$OnClickListenerC3344yb.this.m30783Nf(customRecyclerView2, i6, i7, i8, i9);
                }
            });
            this.f11127o0.setTouchInterceptor(C3297xb.f11007a);
            this.f11127o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
            this.f11127o0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f11128p0 = new C3347c(this);
            C3351f fVar = (C3351f) m9131x9();
            this.f11124J0 = new ArrayList();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C2964ra(2).m32872E(true));
            int i6 = fVar.f11150a;
            if (i6 == 0) {
                C3352g<T> gVar = new C3352g<>(this, fVar.f11151b, fVar.f11152c);
                TdApi.Message message = fVar.f11155f;
                gVar.m30699a(message, message != null);
                gVar.f11171j = true;
                this.f11124J0.add(gVar);
                arrayList.add(new C2964ra(83, R.id.place));
            } else if (i6 == 1) {
                TdApi.Message f0 = this.f30167b.m2480e2().m1648f0(fVar.f11160k);
                if (f0 != null || this.f30167b.m2236t6(fVar.f11160k)) {
                    arrayList.add(m30754cg());
                }
                if (f0 != null) {
                    TdApi.Location location = ((TdApi.MessageLocation) f0.content).location;
                    C3352g<T> gVar2 = new C3352g<>(this, location.latitude, location.longitude);
                    this.f11118D0 = gVar2;
                    gVar2.f11170i = true;
                }
                TdApi.Message message2 = fVar.f11155f;
                if (message2 != null && !this.f30167b.m2411i7(message2)) {
                    C3352g<T> gVar3 = new C3352g<>(this, fVar.f11151b, fVar.f11152c);
                    gVar3.m30699a(fVar.f11155f, true);
                    this.f11124J0.add(gVar3);
                    arrayList.add(m30756bg(gVar3));
                }
            }
            this.f11128p0.m34116x2(arrayList, false);
            this.f11127o0.setAdapter(this.f11128p0);
            this.f11126n0.addView(this.f11127o0);
            if (fVar.f11150a == 1 && fVar.f11155f != null) {
                ((LinearLayoutManager) this.f11127o0.getLayoutManager()).m39522z2(0, -W);
            }
            m30721tf();
            this.f11117C0 = C7389v0.m16742E(context);
            if (mo30758ag(this.f11129q0)) {
                m9158td(new Runnable() {
                    @Override
                    public final void run() {
                        AbstractView$OnClickListenerC3344yb.this.m30778Qf();
                    }
                });
            } else {
                mo30786Kf(this.f11129q0, false);
            }
            if (fVar.f11160k != 0) {
                this.f30167b.m2781K9().m1858g0(fVar.f11160k, this);
                this.f30167b.m2930B4().m4735W1().m4372d(this);
                this.f30167b.m2270r4().m14783o(new TdApi.SearchChatRecentLocationMessages(fVar.f11160k, 100), this);
            }
            return this.f11126n0;
        }
        throw new IllegalStateException();
    }

    public final void m30731of(final TdApi.Message message) {
        if (!m9347Sa() && message.content.getConstructor() == 303973492 && message.schedulingState == null && !this.f30167b.m2411i7(message) && ((TdApi.MessageLocation) message.content).livePeriod > 0) {
            m9211m9(new Runnable() {
                @Override
                public final void run() {
                    AbstractView$OnClickListenerC3344yb.this.m30784Mf(message);
                }
            });
        }
    }

    public abstract boolean mo30730og(V v);

    @Override
    public void onClick(View view) {
        int[] Ef;
        int i;
        int i2;
        C3351f fVar = (C3351f) m9131x9();
        switch (view.getId()) {
            case R.id.btn_direction:
                if (!mo30748fg(this.f11129q0, fVar.f11151b, fVar.f11152c)) {
                    C1405v.m37105p(fVar.f11151b, fVar.f11152c, fVar.f11153d, fVar.f11154e);
                    return;
                }
                return;
            case R.id.btn_gps:
                if (this.f11119E0 == 1) {
                    this.f11130r0.setInProgress(false);
                    this.f11137y0.m21596h();
                    m30714wg(0, null);
                    return;
                }
                this.f11130r0.setInProgress(true);
                this.f11137y0.m21585s("focus_self", null, -1L, true);
                return;
            case R.id.btn_layer:
                C5320c cVar = new C5320c(4);
                C5146u0 u0Var = new C5146u0(4);
                for (int i3 : mo30797Ef()) {
                    if (i3 == 0) {
                        i2 = R.id.btn_layerTypeMapDefault;
                        i = R.string.LayerMapDefault;
                    } else if (i3 == 1) {
                        i2 = R.id.btn_layerTypeMapDark;
                        i = R.string.LayerMapDark;
                    } else if (i3 == 2) {
                        i2 = R.id.btn_layerTypeMapSatellite;
                        i = R.string.LayerMapSatellite;
                    } else if (i3 == 3) {
                        i2 = R.id.btn_layerTypeMapTerrain;
                        i = R.string.LayerMapTerrain;
                    } else if (i3 == 4) {
                        i2 = R.id.btn_layerTypeMapHybrid;
                        i = R.string.LayerMapHybrid;
                    } else {
                        throw new IllegalArgumentException();
                    }
                    cVar.m23284a(i2);
                    u0Var.m23816a(i);
                }
                if (!cVar.m23279f()) {
                    m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
                    return;
                }
                return;
            case R.id.liveLocation:
                C3352g<T> gVar = (C3352g) ((C2964ra) view.getTag()).m32844d();
                if (this.f11119E0 == 2 && this.f11120F0 == gVar) {
                    m30714wg(0, null);
                    return;
                } else if (gVar != null) {
                    m30714wg(2, gVar);
                    return;
                } else {
                    return;
                }
            case R.id.liveLocationSelf:
                if (!this.f11122H0) {
                    TdApi.Message f0 = this.f30167b.m2480e2().m1648f0(fVar.f11160k);
                    this.f11122H0 = true;
                    this.f11128p0.m34130s3(R.id.liveLocationSelf);
                    if (f0 != null) {
                        this.f30167b.m2270r4().m14783o(new TdApi.EditMessageLiveLocation(f0.chatId, f0.f25406id, null, null, 0, 0), this.f30167b.m2392ja());
                        return;
                    } else {
                        this.f11137y0.m21585s("share_live", null, 10000L, true);
                        return;
                    }
                } else {
                    return;
                }
            case R.id.place:
                int i4 = this.f11119E0;
                if (i4 == 0 || i4 == 1 || (i4 == 2 && m30793Gf() && this.f11120F0 != this.f11124J0.get(0))) {
                    if (m30793Gf()) {
                        m30714wg(2, this.f11124J0.get(0));
                        return;
                    }
                    return;
                } else if (this.f11118D0 != null) {
                    m30714wg(0, null);
                    return;
                } else if (this.f11119E0 == 2) {
                    m30708zg(true);
                    this.f11137y0.m21585s("focus_target", null, -1L, true);
                    return;
                } else {
                    m30714wg(2, this.f11124J0.get(0));
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    public final void m30729pf(boolean z) {
        int Ff;
        if (this.f11129q0 != null && (Ff = m30795Ff()) != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f11127o0.getLayoutManager();
            if (linearLayoutManager.m39549X1() <= 0) {
                View C = linearLayoutManager.mo39262C(0);
                int U = C != null ? linearLayoutManager.m39231U(C) : 0;
                int W = C2139ap.m35479W(83);
                if (Ff > 1) {
                    W += W / 2;
                }
                if (m30793Gf()) {
                    if (Ff == 1) {
                        W += W / 2;
                    }
                    W += C2139ap.m35479W(3) + C2139ap.m35479W(2) + C2139ap.m35479W(8);
                }
                if (C == null || Math.min(this.f11127o0.getMeasuredWidth(), this.f11127o0.getMeasuredHeight()) == 0) {
                    linearLayoutManager.m39522z2(0, -W);
                } else if (U > (-W)) {
                    this.f11127o0.m39496D1();
                    this.f11127o0.mo8024v1(0, W + U);
                }
            }
        }
    }

    public final void m30728pg() {
        m30714wg(3, null);
    }

    public final void m30727qf() {
        LinearLayoutManager linearLayoutManager;
        int X1;
        if (this.f11129q0 != null) {
            int measuredWidth = this.f11127o0.getMeasuredWidth();
            int measuredHeight = this.f11127o0.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0 && (X1 = (linearLayoutManager = (LinearLayoutManager) this.f11127o0.getLayoutManager()).m39549X1()) != -1) {
                int W = (measuredHeight - C2139ap.m35479W(2)) - C2139ap.m35479W(83);
                int r = this.f11128p0.mo11422r(X1);
                View C = linearLayoutManager.mo39262C(X1);
                if (C != null) {
                    r -= linearLayoutManager.m39231U(C);
                }
                if (X1 > 0) {
                    r += W;
                }
                int topOffset = measuredWidth >= measuredHeight ? 0 : measuredWidth + View$OnClickListenerC9170d1.getTopOffset();
                if (r > topOffset) {
                    this.f11127o0.m39496D1();
                    this.f11127o0.mo8024v1(0, topOffset - r);
                }
            }
        }
    }

    public abstract void mo30726qg(V v);

    @Override
    public void mo4039r5(final long j, final long j2, final int i, TdApi.ReplyMarkup replyMarkup) {
        if (!m9347Sa()) {
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    AbstractView$OnClickListenerC3344yb.this.m30774Sf(j, j2, i);
                }
            });
        }
    }

    public final C4684k5.C4685a m30725rf(TdApi.Message message, boolean z) {
        TdApi.Location location = ((TdApi.MessageLocation) message.content).location;
        C3352g<T> gVar = this.f11118D0;
        if (!z && m30793Gf()) {
            gVar = this.f11124J0.get(0);
        }
        StringBuilder sb2 = new StringBuilder();
        C4684k5.C4685a ga2 = C4684k5.m26512ga(this.f30167b, Math.max(message.date, message.editDate));
        sb2.append(ga2.f15717a);
        long j = ga2.f15718b;
        if (gVar != null) {
            if (sb2.length() > 0) {
                sb2.append(C1363c0.f4975a);
            }
            sb2.append(C4403w.m27964L2(C7389v0.m16664Y(location.latitude, location.longitude, gVar.f11162a, gVar.f11163b)));
        } else if (this.f11117C0) {
            if (sb2.length() > 0) {
                sb2.append(C1363c0.f4975a);
            }
            sb2.append(C4403w.m27869i1(R.string.Calculating));
        }
        return new C4684k5.C4685a(sb2.toString(), j);
    }

    public final List<C3352g<T>> m30724rg() {
        List<C3352g<T>> list = this.f11124J0;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException();
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        this.f11138z0 = true;
        if (this.f11137y0 == null) {
            this.f11137y0 = new C5996x0(this.f30165a, this, true, false);
        }
        m30708zg(true);
        this.f11137y0.m21595i("", null);
    }

    public final float m30723sf() {
        float f = this.f11134v0;
        C3940f fVar = this.f11135w0;
        return fVar != null ? f + (fVar.m29584g() * (C1357a0.m37541i(16.0f) + C1357a0.m37541i(56.0f))) : f;
    }

    public final void m30722sg(C3352g<T> gVar, int i) {
        int size = this.f11128p0.m34240F0().size();
        int Af = m30805Af(i);
        this.f11124J0.remove(i);
        mo30734mg(gVar, i);
        if (m30795Ff() == 0 && ((C3351f) m9131x9()).f11150a == 0) {
            int i2 = 4;
            if (this.f11128p0.m34240F0().get(size - 2).m32835j() == R.id.liveLocationSelf) {
                i2 = 5;
            }
            this.f11128p0.m34204V1(size - i2, i2);
        } else {
            this.f11128p0.m34147n1(Af);
        }
        m30744hg(true, true);
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                Log.m14709w("Error: %s", C4779t2.m25378z5(object));
            } else if (constructor == -16498159) {
                TdApi.Message[] messageArr = ((TdApi.Messages) object).messages;
                if (messageArr.length > 0) {
                    final ArrayList arrayList = new ArrayList(messageArr.length);
                    for (TdApi.Message message : messageArr) {
                        if (message.content.getConstructor() == 303973492 && !message.isOutgoing && !this.f30167b.m2411i7(message)) {
                            TdApi.Message message2 = null;
                            C3352g<T> gVar = this.f11124J0.isEmpty() ? null : this.f11124J0.get(0);
                            if (gVar != null) {
                                message2 = gVar.f11167f;
                            }
                            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
                            if (messageLocation.livePeriod > 0 && ((message2 == null || message2.f25406id != message.f25406id) && (messageLocation.expiresIn > 0 || message2 == null || ((C3351f) m9131x9()).f11150a == 1))) {
                                TdApi.Location location = messageLocation.location;
                                arrayList.add(new C3352g(this, location.latitude, location.longitude).m30699a(message, true));
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Collections.sort(arrayList, this);
                        m9151ud(new Runnable() {
                            @Override
                            public final void run() {
                                AbstractView$OnClickListenerC3344yb.this.m30770Uf(arrayList);
                            }
                        });
                    }
                }
            }
        }
    }

    public final void m30721tf() {
        boolean z = false;
        boolean z2 = ((C3351f) m9131x9()).f11150a == 1;
        if (z2) {
            z2 = this.f11119E0 != 2 || this.f11120F0 == null;
        }
        C3940f fVar = this.f11135w0;
        if (fVar != null && fVar.m29583h()) {
            z = true;
        }
        if (z != z2) {
            if (this.f11135w0 == null) {
                this.f11135w0 = new C3940f(1, this, C2057b.f7280b, 180L);
            }
            this.f11135w0.m29575p(z2, this.f11138z0);
        }
    }

    public final void m30720tg(long[] jArr) {
        int i = 0;
        for (int size = this.f11124J0.size() - 1; size >= 0; size--) {
            C3352g<T> gVar = this.f11124J0.get(size);
            TdApi.Message message = gVar.f11167f;
            if (!(message == null || C5062b.m24153s(jArr, message.f25406id) == -1)) {
                m30722sg(gVar, size);
                i++;
                if (i == jArr.length) {
                    return;
                }
            }
        }
    }

    public final void m30719uf(boolean z) {
        boolean z2 = this.f30167b.m2480e2().m1648f0(((C3351f) m9131x9()).f11160k) != null;
        if (this.f11123I0 != z2) {
            this.f11123I0 = z2;
            this.f11122H0 = false;
            C3352g<T> gVar = this.f11118D0;
            if (gVar != null) {
                if (z2) {
                    Log.m14719i("adding my location, because started sharing", new Object[0]);
                    mo30740jg(this.f11118D0, -1);
                } else {
                    mo30734mg(gVar, -1);
                }
                m30744hg(z, true);
            }
            this.f11128p0.m34130s3(R.id.liveLocationSelf);
            if (!z2 && ((C3351f) m9131x9()).f11158i) {
                m9298Zb();
            }
        }
    }

    public final void m30718ug() {
        List<C3352g<T>> list = this.f11125K0;
        if (list == null) {
            this.f11125K0 = new ArrayList(this.f11124J0);
        } else {
            list.clear();
            this.f11125K0.addAll(this.f11124J0);
        }
        Collections.sort(this.f11125K0, this);
        boolean z = false;
        int i = 0;
        for (C3352g<T> gVar : this.f11124J0) {
            if (gVar != this.f11125K0.get(i)) {
                z = true;
            }
            i++;
        }
        this.f11128p0.m34186b3(R.id.liveLocation);
        if (z) {
            C0944d.m38882b(new C3350e()).m38870b(this);
            this.f11124J0.clear();
            this.f11124J0.addAll(this.f11125K0);
        }
    }

    public final void m30717vf(C3352g<T> gVar, int i) {
        TdApi.Message message = gVar.f11167f;
        if (message != null) {
            TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
            TdApi.Location location = messageLocation.location;
            gVar.f11168g = SystemClock.uptimeMillis() + (messageLocation.expiresIn * 1000);
            double d = location.latitude;
            if (d == gVar.f11162a && location.longitude == gVar.f11163b) {
                mo30742ig(gVar, ((TdApi.MessageLocation) gVar.f11167f.content).expiresIn > 0);
                return;
            }
            gVar.f11162a = d;
            gVar.f11163b = location.longitude;
            mo30738kg(gVar, i);
            if (this.f11119E0 == 2 && this.f11120F0 == gVar) {
                mo30732ng(this.f11129q0, gVar, this.f11138z0, false, false);
            } else {
                m30796Eg();
            }
        }
    }

    public abstract void mo30716vg(V v);

    @Override
    public void mo4349w5(boolean z) {
    }

    public final void m30715wf(C3352g<T> gVar, int i) {
        m30717vf(gVar, i);
        m30718ug();
    }

    public final void m30714wg(int r13, p038ce.AbstractView$OnClickListenerC3344yb.C3352g<T> r14) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.AbstractView$OnClickListenerC3344yb.m30714wg(int, ce.yb$g):void");
    }

    public final void m30713xf() {
        float f;
        View C;
        int max;
        int measuredWidth = this.f11129q0.getMeasuredWidth();
        int measuredHeight = this.f11129q0.getMeasuredHeight() - View$OnClickListenerC9170d1.getTopOffset();
        if (measuredHeight > measuredWidth) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f11127o0.getLayoutManager();
            int X1 = linearLayoutManager.m39549X1();
            if (X1 > 0) {
                max = measuredWidth - measuredHeight;
            } else if (X1 == 0 && (C = linearLayoutManager.mo39262C(0)) != null) {
                max = Math.max(measuredWidth - measuredHeight, linearLayoutManager.m39231U(C));
            }
            f = max;
            m30802Bg(f);
        }
        f = 0.0f;
        m30802Bg(f);
    }

    public final void m30712xg(boolean z) {
        C3940f fVar = this.f11115A0;
        if (z != (fVar != null && fVar.m29583h())) {
            if (this.f11115A0 == null) {
                this.f11115A0 = new C3940f(0, this, C2057b.f7280b, 180L);
            }
            this.f11115A0.m29575p(z, true);
        }
    }

    public int compare(C3352g<T> gVar, C3352g<T> gVar2) {
        double d;
        double d2;
        boolean z;
        boolean z2 = gVar.f11171j;
        if (z2 != gVar2.f11171j) {
            return z2 ? -1 : 1;
        }
        boolean z3 = false;
        boolean z4 = gVar.f11167f == null;
        if (z4 != (gVar2.f11167f == null)) {
            return z4 ? -1 : 1;
        }
        boolean z5 = m30793Gf() && ((C3351f) m9131x9()).f11155f == null;
        if (z5) {
            C3351f fVar = (C3351f) m9131x9();
            d2 = fVar.f11151b;
            d = fVar.f11152c;
            z = z5;
        } else {
            C3352g<T> gVar3 = this.f11118D0;
            z = gVar3 != null;
            if (z) {
                d2 = gVar3.f11162a;
                d = gVar3.f11163b;
            } else {
                d2 = 0.0d;
                d = 0.0d;
            }
        }
        if (gVar.f11167f == null) {
            double d3 = d2;
            double d4 = d;
            float Y = C7389v0.m16664Y(d3, d4, gVar.f11162a, gVar.f11163b);
            float Y2 = C7389v0.m16664Y(d3, d4, gVar2.f11162a, gVar2.f11163b);
            if (Y != Y2) {
                return Y < Y2 ? -1 : 1;
            }
            return 0;
        }
        boolean z6 = gVar.f11170i;
        if (z6 != gVar2.f11170i) {
            return z6 ? -1 : 1;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z7 = gVar.f11168g < uptimeMillis;
        if (gVar2.f11168g < uptimeMillis) {
            z3 = true;
        }
        if (z7 != z3) {
            return z7 ? 1 : -1;
        }
        TdApi.Message message = gVar.f11167f;
        TdApi.Message message2 = gVar2.f11167f;
        TdApi.MessageLocation messageLocation = (TdApi.MessageLocation) message.content;
        TdApi.MessageLocation messageLocation2 = (TdApi.MessageLocation) message2.content;
        if (z) {
            TdApi.Location location = messageLocation.location;
            double d5 = d2;
            double d6 = d;
            float Y3 = C7389v0.m16664Y(d5, d6, location.latitude, location.longitude);
            TdApi.Location location2 = messageLocation2.location;
            float Y4 = C7389v0.m16664Y(d5, d6, location2.latitude, location2.longitude);
            if (Y3 != Y4) {
                return Y3 < Y4 ? -1 : 1;
            }
        }
        int max = Math.max(message.date, message.editDate);
        int max2 = Math.max(message2.date, message2.editDate);
        if (max != max2) {
            return Integer.compare(max, max2);
        }
        long P0 = C7321e.m16988P0(message);
        long P02 = C7321e.m16988P0(message2);
        if (P0 != P02) {
            return Long.compare(P0, P02);
        }
        return Long.compare(message.f25406id, message2.f25406id);
    }

    public final boolean m30710yg(boolean z) {
        C3352g<T> gVar;
        if (this.f11116B0 == z) {
            return false;
        }
        if (z && !mo30730og(this.f11129q0)) {
            return false;
        }
        this.f11116B0 = z;
        this.f11130r0.m18786g(z ? R.drawable.baseline_explore_24 : R.drawable.baseline_gps_fixed_24);
        if (!z || !((gVar = this.f11118D0) == null || gVar.f11166e == 0)) {
            m30796Eg();
        }
        if (z) {
            return true;
        }
        mo30746gg(this.f11129q0);
        return true;
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }

    @Override
    public long mo9117za(boolean z) {
        return 260L;
    }

    public abstract V mo30709zf(Context context, int i);

    public final void m30708zg(boolean z) {
        if (this.f11117C0 != z) {
            this.f11117C0 = z;
            this.f11128p0.m34130s3(R.id.place);
            this.f11128p0.m34186b3(R.id.liveLocation);
        }
    }

    public static class C3351f {
        public final int f11150a;
        public double f11151b;
        public double f11152c;
        public String f11153d;
        public String f11154e;
        public TdApi.Message f11155f;
        public long f11156g;
        public C6246h f11157h;
        public boolean f11158i;
        public long f11159j;
        public long f11160k;
        public long f11161l;

        public C3351f(double d, double d2) {
            this.f11150a = 0;
            this.f11151b = d;
            this.f11152c = d2;
        }

        public C3351f m30702a(long j, long j2) {
            this.f11160k = j;
            this.f11161l = j2;
            return this;
        }

        public C3351f m30701b(long j) {
            this.f11159j = j;
            return this;
        }

        public C3351f m30700c(boolean z) {
            this.f11158i = z;
            return this;
        }

        public C3351f(double d, double d2, TdApi.Message message) {
            this.f11150a = (message == null || ((TdApi.MessageLocation) message.content).expiresIn != 0) ? 1 : 0;
            this.f11151b = d;
            this.f11152c = d2;
            this.f11155f = message;
            if (message != null) {
                this.f11156g = SystemClock.uptimeMillis() + (((TdApi.MessageLocation) message.content).expiresIn * 1000);
            }
        }
    }
}
