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
            cVar.setDrawModifier(raVar.m32843f());
            if (raVar.m32838j() == R.id.btn_settings) {
                C4868i.AbstractC4872d dVar = (C4868i.AbstractC4872d) raVar.m32847d();
                boolean equals = dVar.equals(AbstractView$OnClickListenerC3371ys.this.mo30660Tg());
                int i = 0;
                boolean z2 = AbstractView$OnClickListenerC3371ys.this.f11220N0 != null && AbstractView$OnClickListenerC3371ys.this.f11220N0.equals(dVar);
                if (equals) {
                    cVar.setData(AbstractView$OnClickListenerC3371ys.this.f11212F0);
                } else {
                    TdApi.File file = null;
                    if (z2) {
                        if (!AbstractView$OnClickListenerC3371ys.this.f11219M0) {
                            file = dVar.m24538c();
                        }
                        cVar.setData(C4403w.m27824u0(file, AbstractView$OnClickListenerC3371ys.this.f11216J0, false));
                    } else {
                        int d = dVar.mo24531d(true);
                        boolean z3 = d == 1;
                        if (!z3) {
                            file = dVar.m24538c();
                        }
                        cVar.setData(C4403w.m27824u0(file, dVar.mo24529g() ? AbstractView$OnClickListenerC3371ys.this.f11213G0 : d == 2 ? AbstractView$OnClickListenerC3371ys.this.f11215I0 : AbstractView$OnClickListenerC3371ys.this.f11214H0, true ^ z3));
                    }
                }
                if (AbstractView$OnClickListenerC3371ys.this.f11220N0 == null) {
                    z2 = equals;
                }
                C6985o2 O1 = cVar.m10215O1();
                if (!z || z2) {
                    O1.m18179b(equals, z);
                }
                O1.m18178c(z2, z);
                if (equals && z2) {
                    i = R.id.theme_color_textNeutral;
                }
                cVar.setDataColorId(i);
                cVar.getReceiver().m20820G(dVar.m24537e());
            }
        }
    }

    public class C3373b implements AbstractC5139r {
        public C3373b() {
        }

        @Override
        public void mo23819a(View view, Canvas canvas) {
            C5137q.m23835a(this, view, canvas);
        }

        @Override
        public void mo23818b(View view, Canvas canvas) {
            C6257p receiver = ((C9137c) view).getReceiver();
            int i = C1357a0.m37544i(18.0f);
            int i2 = C1357a0.m37544i(64.0f) - (C1357a0.m37544i(12.0f) * 2);
            int measuredWidth = (view.getMeasuredWidth() - i) - i2;
            int i3 = i2 / 2;
            receiver.mo20257K0(measuredWidth, (view.getMeasuredHeight() / 2) - i3, view.getMeasuredWidth() - i, (view.getMeasuredHeight() / 2) + i3);
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

    public void m30672Xg(C4868i.AbstractC4872d dVar, boolean z) {
        T t;
        if (!m9347Sa() && (t = this.f11220N0) != null && t.equals(dVar)) {
            if (z) {
                T Tg = mo30660Tg();
                this.f11220N0 = null;
                mo30661Pg(dVar);
                m30663gh(Tg);
                m30663gh(dVar);
                return;
            }
            m30665eh(mo30660Tg());
        }
    }

    public void m30671Yg(final C4868i.AbstractC4872d dVar, final boolean z) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30672Xg(dVar, z);
            }
        });
    }

    public void m30670Zg() {
        m30665eh(mo30660Tg());
    }

    public void m30669ah(C4868i.AbstractC4872d dVar, boolean z) {
        if (z) {
            C4868i.m24727c2().m24583u2(this.f11210D0);
            m30665eh(dVar);
        }
    }

    public void m30668bh(List list) {
        boolean z;
        if (!m9347Sa()) {
            this.f11218L0 = list;
            m30677Qg();
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
                        m30665eh(dVar);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C1379j0.m37295y0(R.string.EmojiUpdateUnavailable, 0);
                }
            }
        }
    }

    public void m30667ch(final List list) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30668bh(list);
            }
        });
    }

    public void m30666dh(TdApi.File file, boolean z) {
        T Sg;
        if (!m9347Sa() && (Sg = m30675Sg(file.f25376id)) != null) {
            C7321e.m16907u(file, Sg.m24538c());
            if (C4779t2.m25599T2(file)) {
                this.f30170b.m2413i5().m4030D0(file.f25376id, this);
                this.f30170b.m2413i5().m3986j0(Sg.m24538c(), this);
                T t = this.f11220N0;
                if (!(t == null || t.m24538c() == null || this.f11220N0.m24538c().f25376id != file.f25376id)) {
                    m30673Wg(this.f11220N0);
                }
            } else if (z) {
                this.f30170b.m2413i5().m4034B0(file, this);
            }
            m30663gh(Sg);
        }
    }

    public abstract void mo30661Pg(T t);

    public final void m30677Qg() {
        if (this.f11218L0 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t : this.f11218L0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new C2964ra(11));
                }
                arrayList.add(new C2964ra(90, (int) R.id.btn_settings, 0, (CharSequence) t.m24539b(), false).m32873G(t).m32871I(new C3373b()));
            }
            arrayList.add(new C2964ra(3));
            this.f11217K0.m34119x2(arrayList, false);
            m9204n9();
        }
    }

    @Override
    public void mo3954R2(C10930q6 q6Var, int i, int i2, TdApi.File file) {
        if (file != null) {
            m30664fh(file, false);
        }
    }

    public final void m30676Rg(T t) {
        this.f11220N0 = t;
        this.f11219M0 = false;
        if (t.mo24529g() || t.m24538c() == null || t.m24536h() || C4779t2.m25587V2(t.m24538c())) {
            m30673Wg(t);
        } else {
            this.f30170b.m2413i5().m3991h(t.m24538c(), this, false);
        }
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return this.f11220N0 == null;
    }

    public final T m30675Sg(int i) {
        T t;
        TdApi.File c;
        for (C2964ra raVar : this.f11217K0.m34243F0()) {
            if (raVar.m32838j() == R.id.btn_settings && raVar.m32847d() != null && (c = (t = (T) raVar.m32847d()).m24538c()) != null && c.f25376id == i) {
                return t;
            }
        }
        return null;
    }

    public abstract T mo30660Tg();

    public abstract void mo30659Ug(AbstractC5918j<List<T>> jVar);

    @Override
    public void mo3953V0(TdApi.File file) {
        m30664fh(file, false);
    }

    public final View$OnClickListenerC2364ez m30674Vg() {
        if (m9139w9() != null) {
            return m9139w9().f11224b;
        }
        return null;
    }

    public final void m30673Wg(final T t) {
        this.f11219M0 = true;
        if (t.m24536h()) {
            this.f11220N0 = null;
            mo30661Pg(t);
            return;
        }
        t.mo24530f(new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                AbstractView$OnClickListenerC3371ys.this.m30671Yg(t, z);
            }
        });
    }

    @Override
    public boolean mo9270dc() {
        return this.f11218L0 == null;
    }

    public final void m30665eh(T t) {
        T Tg = mo30660Tg();
        T t2 = this.f11220N0;
        T t3 = t2 != null ? t2 : Tg;
        if (t2 != null) {
            if (!t2.equals(t)) {
                this.f30170b.m2413i5().m3986j0(this.f11220N0.m24538c(), this);
                this.f11220N0 = null;
            } else {
                return;
            }
        }
        if (!Tg.equals(t)) {
            m30676Rg(t);
        }
        m30663gh(t3);
        m30663gh(t);
    }

    public final void m30664fh(final TdApi.File file, final boolean z) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30666dh(file, z);
            }
        });
    }

    public final void m30663gh(T t) {
        int i = 0;
        for (C2964ra raVar : this.f11217K0.m34243F0()) {
            if (raVar.m32838j() != R.id.btn_settings || raVar.m32847d() == null || !raVar.m32847d().equals(t)) {
                i++;
            } else {
                this.f11217K0.m34127u3(i);
                return;
            }
        }
    }

    @Override
    public void mo2039h2(TdApi.UpdateFile updateFile) {
        m30664fh(updateFile.file, true);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (this.f11220N0 == null) {
            return super.mo404jc(z);
        }
        m9179qe(new Runnable() {
            @Override
            public final void run() {
                AbstractView$OnClickListenerC3371ys.this.m30670Zg();
            }
        });
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_settings) {
            final C4868i.AbstractC4872d dVar = (C4868i.AbstractC4872d) ((C2964ra) view.getTag()).m32847d();
            if (this.f11210D0 == 0 || this.f11211E0 == 0 || !C4868i.m24727c2().m24764X2(this.f11210D0)) {
                m30665eh(dVar);
            } else {
                m9172re(C4403w.m27984H0(this, this.f11211E0, new Object[0]), new AbstractC5917i() {
                    @Override
                    public final void mo1322a(boolean z) {
                        AbstractView$OnClickListenerC3371ys.this.m30669ah(dVar, z);
                    }
                });
            }
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        this.f11217K0 = new C3372a(this, this, this);
        mo30659Ug(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                AbstractView$OnClickListenerC3371ys.this.m30667ch((List) obj);
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
