package de;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import ce.a0;
import ce.j0;
import gd.w;
import hd.t2;
import he.i;
import he.i.d;
import ie.q;
import ie.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kb.j;
import ld.p;
import ne.o2;
import ob.e;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.q1;
import ud.v4;
import zd.d9;
import zd.h9;
import zd.o6;
import zd.q0;

public abstract class ys<T extends i.d> extends vo<c<T>> implements View.OnClickListener, q0, h9.c {
    public final long D0;
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public iq K0;
    public List<T> L0;
    public boolean M0;
    public T N0;

    public class a extends iq {
        public a(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var) {
            super(d9Var, onClickListener, v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            cVar.setDrawModifier(raVar.f());
            if (raVar.j() == R.id.btn_settings) {
                i.d dVar = (i.d) raVar.d();
                boolean equals = dVar.equals(ys.this.Tg());
                int i10 = 0;
                boolean z11 = ys.this.N0 != null && ys.this.N0.equals(dVar);
                if (equals) {
                    cVar.setData(ys.this.F0);
                } else {
                    TdApi.File file = null;
                    if (z11) {
                        if (!ys.this.M0) {
                            file = dVar.c();
                        }
                        cVar.setData(w.u0(file, ys.this.J0, false));
                    } else {
                        int d10 = dVar.d(true);
                        boolean z12 = d10 == 1;
                        if (!z12) {
                            file = dVar.c();
                        }
                        cVar.setData(w.u0(file, dVar.g() ? ys.this.G0 : d10 == 2 ? ys.this.I0 : ys.this.H0, true ^ z12));
                    }
                }
                if (ys.this.N0 == null) {
                    z11 = equals;
                }
                o2 L1 = cVar.L1();
                if (!z10 || z11) {
                    L1.b(equals, z10);
                }
                L1.c(z11, z10);
                if (equals && z11) {
                    i10 = R.id.theme_color_textNeutral;
                }
                cVar.setDataColorId(i10);
                cVar.getReceiver().G(dVar.e());
            }
        }
    }

    public class b implements r {
        public b() {
        }

        @Override
        public void a(View view, Canvas canvas) {
            q.a(this, view, canvas);
        }

        @Override
        public void b(View view, Canvas canvas) {
            p receiver = ((uc.c) view).getReceiver();
            int i10 = a0.i(18.0f);
            int i11 = a0.i(64.0f) - (a0.i(12.0f) * 2);
            int measuredWidth = (view.getMeasuredWidth() - i10) - i11;
            int i12 = i11 / 2;
            receiver.K0(measuredWidth, (view.getMeasuredHeight() / 2) - i12, view.getMeasuredWidth() - i10, (view.getMeasuredHeight() / 2) + i12);
            receiver.draw(canvas);
        }
    }

    public ys(Context context, o6 o6Var, long j10, int i10, int i11, int i12, int i13, int i14, int i15) {
        super(context, o6Var);
        this.D0 = j10;
        this.E0 = i10;
        this.F0 = i11;
        this.G0 = i12;
        this.H0 = i13;
        this.I0 = i14;
        this.J0 = i15;
    }

    public void Xg(i.d dVar, boolean z10) {
        T t10;
        if (!Sa() && (t10 = this.N0) != null && t10.equals(dVar)) {
            if (z10) {
                T Tg = Tg();
                this.N0 = null;
                Pg(dVar);
                gh(Tg);
                gh(dVar);
                return;
            }
            eh(Tg());
        }
    }

    public void Yg(final i.d dVar, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ys.this.Xg(dVar, z10);
            }
        });
    }

    public void Zg() {
        eh(Tg());
    }

    public void ah(i.d dVar, boolean z10) {
        if (z10) {
            i.c2().u2(this.D0);
            eh(dVar);
        }
    }

    public void bh(List list) {
        boolean z10;
        if (!Sa()) {
            this.L0 = list;
            Qg();
            T t10 = w9() != null ? ((c) w9()).f10239a : null;
            if (t10 != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    i.d dVar = (i.d) it.next();
                    if (dVar.equals(t10)) {
                        eh(dVar);
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    j0.y0(R.string.EmojiUpdateUnavailable, 0);
                }
            }
        }
    }

    public void ch(final List list) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ys.this.bh(list);
            }
        });
    }

    public void dh(TdApi.File file, boolean z10) {
        T Sg;
        if (!Sa() && (Sg = Sg(file.f19913id)) != null) {
            e.v(file, Sg.c());
            if (t2.T2(file)) {
                this.f24495b.m5().D0(file.f19913id, this);
                this.f24495b.m5().j0(Sg.c(), this);
                T t10 = this.N0;
                if (!(t10 == null || t10.c() == null || this.N0.c().f19913id != file.f19913id)) {
                    Wg(this.N0);
                }
            } else if (z10) {
                this.f24495b.m5().B0(file, this);
            }
            gh(Sg);
        }
    }

    @Override
    public void K0(o6 o6Var, int i10, int i11, TdApi.File file) {
        if (file != null) {
            fh(file, false);
        }
    }

    public abstract void Pg(T t10);

    public final void Qg() {
        if (this.L0 != null) {
            ArrayList arrayList = new ArrayList();
            for (T t10 : this.L0) {
                if (!arrayList.isEmpty()) {
                    arrayList.add(new ra(11));
                }
                arrayList.add(new ra(90, (int) R.id.btn_settings, 0, (CharSequence) t10.b(), false).G(t10).I(new b()));
            }
            arrayList.add(new ra(3));
            this.K0.s2(arrayList, false);
            n9();
        }
    }

    public final void Rg(T t10) {
        this.N0 = t10;
        this.M0 = false;
        if (t10.g() || t10.c() == null || t10.h() || t2.V2(t10.c())) {
            Wg(t10);
        } else {
            this.f24495b.m5().h(t10.c(), this, false);
        }
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        return this.N0 == null;
    }

    public final T Sg(int i10) {
        T t10;
        TdApi.File c10;
        for (ra raVar : this.K0.D0()) {
            if (raVar.j() == R.id.btn_settings && raVar.d() != null && (c10 = (t10 = (T) raVar.d()).c()) != null && c10.f19913id == i10) {
                return t10;
            }
        }
        return null;
    }

    public abstract T Tg();

    @Override
    public void U0(TdApi.File file) {
        fh(file, false);
    }

    public abstract void Ug(j<List<T>> jVar);

    public final fz Vg() {
        if (w9() != null) {
            return w9().f10240b;
        }
        return null;
    }

    public final void Wg(final T t10) {
        this.M0 = true;
        if (t10.h()) {
            this.N0 = null;
            Pg(t10);
            return;
        }
        t10.f(new kb.i() {
            @Override
            public final void a(boolean z10) {
                ys.this.Yg(t10, z10);
            }
        });
    }

    @Override
    public boolean dc() {
        return this.L0 == null;
    }

    public final void eh(T t10) {
        T Tg = Tg();
        T t11 = this.N0;
        T t12 = t11 != null ? t11 : Tg;
        if (t11 != null) {
            if (!t11.equals(t10)) {
                this.f24495b.m5().j0(this.N0.c(), this);
                this.N0 = null;
            } else {
                return;
            }
        }
        if (!Tg.equals(t10)) {
            Rg(t10);
        }
        gh(t12);
        gh(t10);
    }

    public final void fh(final TdApi.File file, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                ys.this.dh(file, z10);
            }
        });
    }

    public final void gh(T t10) {
        int i10 = 0;
        for (ra raVar : this.K0.D0()) {
            if (raVar.j() != R.id.btn_settings || raVar.d() == null || !raVar.d().equals(t10)) {
                i10++;
            } else {
                this.K0.r3(i10);
                return;
            }
        }
    }

    @Override
    public void h2(TdApi.UpdateFile updateFile) {
        fh(updateFile.file, true);
    }

    @Override
    public boolean jc(boolean z10) {
        if (this.N0 == null) {
            return super.jc(z10);
        }
        qe(new Runnable() {
            @Override
            public final void run() {
                ys.this.Zg();
            }
        });
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_settings) {
            final i.d dVar = (i.d) ((ra) view.getTag()).d();
            if (this.D0 == 0 || this.E0 == 0 || !i.c2().X2(this.D0)) {
                eh(dVar);
            } else {
                re(w.H0(this, this.E0, new Object[0]), new kb.i() {
                    @Override
                    public final void a(boolean z10) {
                        ys.this.ah(dVar, z10);
                    }
                });
            }
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        this.K0 = new a(this, this, this);
        Ug(new j() {
            @Override
            public final void a(Object obj) {
                ys.this.ch((List) obj);
            }
        });
        customRecyclerView.setAdapter(this.K0);
    }

    public static class c<T extends i.d> {
        public T f10239a;
        public fz f10240b;

        public c(T t10) {
            this.f10239a = t10;
        }

        public c(fz fzVar) {
            this.f10240b = fzVar;
        }
    }
}
