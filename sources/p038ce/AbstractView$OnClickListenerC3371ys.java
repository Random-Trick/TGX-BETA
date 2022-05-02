package p038ce;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import be.C1357a0;
import be.C1379j0;
import gd.C4779t2;
import ge.C4868i;
import ge.C4868i.AbstractC4872d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C6985o2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p082fd.C4403w;
import p111he.AbstractC5139r;
import p111he.C5137q;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p156kd.C6257p;
import p193nb.C7321e;
import p350yd.AbstractC10664f9;
import p350yd.AbstractC10985s0;
import p350yd.C10756j9;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9270q1;

public abstract class AbstractView$OnClickListenerC3371ys<T extends C4868i.AbstractC4872d> extends AbstractC3204vo<C3374c<T>> implements View.OnClickListener, AbstractC10985s0, C10756j9.AbstractC10759c {
    public final long f11210D0;
    public final int f11211E0;
    public final int f11212F0;
    public final int f11213G0;
    public final int f11214H0;
    public final int f11215I0;
    public final int f11216J0;
    public C2546iq f11217K0;
    public List<T> f11218L0;
    public boolean f11219M0;
    public T f11220N0;

    public class C3372a extends C2546iq {
        public C3372a(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var) {
            super(f9Var, onClickListener, v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            cVar.setDrawModifier(raVar.m32840f());
            if (raVar.m32835j() == R.id.btn_settings) {
                C4868i.AbstractC4872d dVar = (C4868i.AbstractC4872d) raVar.m32844d();
                boolean equals = dVar.equals(AbstractView$OnClickListenerC3371ys.this.mo30658Tg());
                int i = 0;
                boolean z2 = AbstractView$OnClickListenerC3371ys.this.f11220N0 != null && AbstractView$OnClickListenerC3371ys.this.f11220N0.equals(dVar);
                if (equals) {
                    cVar.setData(AbstractView$OnClickListenerC3371ys.this.f11212F0);
                } else {
                    TdApi.File file = null;
                    if (z2) {
                        if (!AbstractView$OnClickListenerC3371ys.this.f11219M0) {
                            file = dVar.m24537c();
                        }
                        cVar.setData(C4403w.m27822u0(file, AbstractView$OnClickListenerC3371ys.this.f11216J0, false));
                    } else {
                        int d = dVar.mo24530d(true);
                        boolean z3 = d == 1;
                        if (!z3) {
                            file = dVar.m24537c();
                        }
                        cVar.setData(C4403w.m27822u0(file, dVar.mo24528g() ? AbstractView$OnClickListenerC3371ys.this.f11213G0 : d == 2 ? AbstractView$OnClickListenerC3371ys.this.f11215I0 : AbstractView$OnClickListenerC3371ys.this.f11214H0, true ^ z3));
                    }
                }
                if (AbstractView$OnClickListenerC3371ys.this.f11220N0 == null) {
                    z2 = equals;
                }
                C6985o2 O1 = cVar.m10216O1();
                if (!z || z2) {
                    O1.m18179b(equals, z);
                }
                O1.m18178c(z2, z);
                if (equals && z2) {
                    i = R.id.theme_color_textNeutral;
                }
                cVar.setDataColorId(i);
                cVar.getReceiver().m20819G(dVar.m24536e());
            }
        }
    }

    public class C3373b implements AbstractC5139r {
        public C3373b() {
        }

        @Override
        public void mo23818a(View view, Canvas canvas) {
            C5137q.m23834a(this, view, canvas);
        }

        @Override
        public void mo23817b(View view, Canvas canvas) {
            C6257p receiver = ((C9137c) view).getReceiver();
            int i = C1357a0.m37541i(18.0f);
            int i2 = C1357a0.m37541i(64.0f) - (C1357a0.m37541i(12.0f) * 2);
            int measuredWidth = (view.getMeasuredWidth() - i) - i2;
            int i3 = i2 / 2;
            receiver.mo20256K0(measuredWidth, (view.getMeasuredHeight() / 2) - i3, view.getMeasuredWidth() - i, (view.getMeasuredHeight() / 2) + i3);
            receiver.draw(canvas);
        }
    }

    public AbstractView$OnClickListenerC3371ys(Context context, C10930q6 q6Var, long j, int i, int i2, int i3, int i4, int i5, int i6) {
        super(context, q6Var);
        this.f11210D0 = j;
        this.f11211E0 = i;
        this.f11212F0 = i2;
        this.f11213G0 = i3;
        this.f11214H0 = i4;
        this.f11215I0 = i5;
        this.f11216J0 = i6;
    }

    public void m30670Xg(C4868i.AbstractC4872d dVar, boolean z) {
        T t;
        if (!m9347Sa() && (t = this.f11220N0) != null && t.equals(dVar)) {
            if (z) {
                T Tg = mo30658Tg();
                this.f11220N0 = null;
                mo30659Pg(dVar);
                m30661gh(Tg);
                m30661gh(dVar);
                return;
            }
            m30663eh(mo30658Tg());
        }
    }

    public void m30669Yg(final C4868i.AbstractC4872d dVar, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30670Xg(dVar, z);
            }
        });
    }

    public void m30668Zg() {
        m30663eh(mo30658Tg());
    }

    public void m30667ah(C4868i.AbstractC4872d dVar, boolean z) {
        if (z) {
            C4868i.m24726c2().m24582u2(this.f11210D0);
            m30663eh(dVar);
        }
    }

    public void m30666bh(List list) {
        boolean z;
        if (!m9347Sa()) {
            this.f11218L0 = list;
            m30675Qg();
            T t = m9139w9() != null ? ((C3374c) m9139w9()).f11223a : null;
            if (t != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    C4868i.AbstractC4872d dVar = (C4868i.AbstractC4872d) it.next();
                    if (dVar.equals(t)) {
                        m30663eh(dVar);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C1379j0.m37292y0(R.string.EmojiUpdateUnavailable, 0);
                }
            }
        }
    }

    public void m30665ch(final List list) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30666bh(list);
            }
        });
    }

    public void m30664dh(TdApi.File file, boolean z) {
        T Sg;
        if (!m9347Sa() && (Sg = m30673Sg(file.f25373id)) != null) {
            C7321e.m16907u(file, Sg.m24537c());
            if (C4779t2.m25598T2(file)) {
                this.f30167b.m2413i5().m4030D0(file.f25373id, this);
                this.f30167b.m2413i5().m3986j0(Sg.m24537c(), this);
                T t = this.f11220N0;
                if (!(t == null || t.m24537c() == null || this.f11220N0.m24537c().f25373id != file.f25373id)) {
                    m30671Wg(this.f11220N0);
                }
            } else if (z) {
                this.f30167b.m2413i5().m4034B0(file, this);
            }
            m30661gh(Sg);
        }
    }

    public abstract void mo30659Pg(T t);

    public final void m30675Qg() {
        if (this.f11218L0 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f11218L0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(90, (int) R.id.btn_settings, 0, (CharSequence) t.m24538b(), false).m32870G(t).m32868I(new C3373b()));
            }
            arrayList.add(new C2964ra(3));
            this.f11217K0.m34116x2(arrayList, false);
            m9204n9();
        }
    }

    @Override
    public void mo3954R2(C10930q6 q6Var, int i, int i2, TdApi.File file) {
        if (file != null) {
            m30662fh(file, false);
        }
    }

    public final void m30674Rg(T t) {
        this.f11220N0 = t;
        this.f11219M0 = false;
        if (t.mo24528g() || t.m24537c() == null || t.m24535h() || C4779t2.m25586V2(t.m24537c())) {
            m30671Wg(t);
        } else {
            this.f30167b.m2413i5().m3991h(t.m24537c(), this, false);
        }
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return this.f11220N0 == null;
    }

    public final T m30673Sg(int i) {
        T t;
        TdApi.File c;
        for (C2964ra raVar : this.f11217K0.m34240F0()) {
            if (raVar.m32835j() == R.id.btn_settings && raVar.m32844d() != null && (c = (t = (T) raVar.m32844d()).m24537c()) != null && c.f25373id == i) {
                return t;
            }
        }
        return null;
    }

    public abstract T mo30658Tg();

    public abstract void mo30657Ug(AbstractC5918j<List<T>> jVar);

    @Override
    public void mo3953V0(TdApi.File file) {
        m30662fh(file, false);
    }

    public final View$OnClickListenerC2364ez m30672Vg() {
        if (m9139w9() != null) {
            return m9139w9().f11224b;
        }
        return null;
    }

    public final void m30671Wg(final T t) {
        this.f11219M0 = true;
        if (t.m24535h()) {
            this.f11220N0 = null;
            mo30659Pg(t);
            return;
        }
        t.mo24529f(new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                AbstractView$OnClickListenerC3371ys.this.m30669Yg(t, z);
            }
        });
    }

    @Override
    public boolean mo9270dc() {
        return this.f11218L0 == null;
    }

    public final void m30663eh(T t) {
        T Tg = mo30658Tg();
        T t2 = this.f11220N0;
        T t3 = t2 != null ? t2 : Tg;
        if (t2 != null) {
            if (!t2.equals(t)) {
                this.f30167b.m2413i5().m3986j0(this.f11220N0.m24537c(), this);
                this.f11220N0 = null;
            } else {
                return;
            }
        }
        if (!Tg.equals(t)) {
            m30674Rg(t);
        }
        m30661gh(t3);
        m30661gh(t);
    }

    public final void m30662fh(final TdApi.File file, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30664dh(file, z);
            }
        });
    }

    public final void m30661gh(T t) {
        int i = 0;
        for (C2964ra raVar : this.f11217K0.m34240F0()) {
            if (raVar.m32835j() != R.id.btn_settings || raVar.m32844d() == null || !raVar.m32844d().equals(t)) {
                i++;
            } else {
                this.f11217K0.m34124u3(i);
                return;
            }
        }
    }

    @Override
    public void mo2039h2(TdApi.UpdateFile updateFile) {
        m30662fh(updateFile.file, true);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (this.f11220N0 == null) {
            return super.mo404jc(z);
        }
        m9179qe(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30668Zg();
            }
        });
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_settings) {
            final C4868i.AbstractC4872d dVar = (C4868i.AbstractC4872d) ((C2964ra) view.getTag()).m32844d();
            if (this.f11210D0 == 0 || this.f11211E0 == 0 || !C4868i.m24726c2().m24763X2(this.f11210D0)) {
                m30663eh(dVar);
            } else {
                m9172re(C4403w.m27982H0(this, this.f11211E0, new Object[0]), new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z) {
                        AbstractView$OnClickListenerC3371ys.this.m30667ah(dVar, z);
                    }
                });
            }
        }
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f11217K0 = new C3372a(this, this, this);
        mo30657Ug(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractView$OnClickListenerC3371ys.this.m30665ch((List) obj);
            }
        });
        customRecyclerView.setAdapter(this.f11217K0);
    }

    public static class C3374c<T extends C4868i.AbstractC4872d> {
        public T f11223a;
        public View$OnClickListenerC2364ez f11224b;

        public C3374c(T t) {
            this.f11223a = t;
        }

        public C3374c(View$OnClickListenerC2364ez ezVar) {
            this.f11224b = ezVar;
        }
    }
}
