package vc;

import ae.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.y;
import dd.j;
import dd.l;
import de.f20;
import de.rh;
import eb.k;
import gd.w;
import hd.o;
import hd.p;
import hd.r;
import hd.t2;
import hd.u;
import hd.w2;
import hd.z;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.f3;
import ne.i;
import ne.y1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.NewFlowLayoutManager;
import ud.d1;
import ud.q1;
import ud.v4;
import vc.t;
import vc.x;
import zd.d9;
import zd.hj;
import zd.s1;
import zd.t1;

public class x extends FrameLayoutFix implements View.OnClickListener, j.c, t.a, k.b, View.OnLongClickListener, t1.a, i.d {
    public RecyclerView M;
    public f3 N;
    public GridLayoutManager O;
    public NewFlowLayoutManager P;
    public final t Q;
    public int R;
    public float S;
    public i T;
    public View U;
    public final v V;
    public h W;
    public d9 f25309a0;
    public boolean f25310b0;
    public int f25311c0;
    public boolean f25312d0;
    public float f25313e0;
    public k f25314f0;
    public float f25315g0;
    public float f25316h0;
    public eb.f f25317i0;
    public k f25318j0;
    public int f25319k0;
    public int f25320l0;
    public int f25321m0;
    public ArrayList<o<?>> f25322n0;
    public ViewGroup f25323o0;
    public int f25324p0;
    public int f25325q0;
    public ie.k f25326r0;
    public j f25327s0;

    public class a extends GridLayoutManager.b {
        public a() {
        }

        @Override
        public int f(int i10) {
            if (i10 == 0 || x.this.f25322n0 == null || !o.B(((o) x.this.f25322n0.get(i10 - 1)).v())) {
                return x.this.f25319k0;
            }
            return 1;
        }
    }

    public class b extends NewFlowLayoutManager {
        public final NewFlowLayoutManager.a V = new NewFlowLayoutManager.a();

        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override
        public NewFlowLayoutManager.a l3(int i10) {
            o oVar = (x.this.R != 1 || i10 == 0 || x.this.f25322n0 == null) ? null : (o) x.this.f25322n0.get(i10 - 1);
            if (oVar == null || !o.A(oVar.v())) {
                NewFlowLayoutManager.a aVar = this.V;
                aVar.f20175b = 100.0f;
                aVar.f20174a = 100.0f;
            } else {
                this.V.f20174a = oVar.m();
                this.V.f20175b = oVar.l();
            }
            return this.V;
        }
    }

    public class c extends GridLayoutManager.b {
        public c() {
        }

        @Override
        public int f(int i10) {
            if (x.this.R != 1 || i10 <= 0 || x.this.f25322n0 == null || !o.A(((o) x.this.f25322n0.get(i10 - 1)).v())) {
                return 100;
            }
            return x.this.P.m3(i10);
        }
    }

    public class d extends RecyclerView {
        public boolean f25330t1;

        public d(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRect(0.0f, x.this.c2(), getMeasuredWidth(), getMeasuredHeight(), y.g(x.this.Q.j0() ? ae.j.M(R.id.theme_color_filling, 2) : ae.j.u()));
            super.draw(canvas);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            x.this.s2();
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r5) {
            throw new UnsupportedOperationException("Method not decompiled: vc.x.d.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public class e extends RecyclerView.o {
        public e() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int i10 = 0;
            if (x.this.R != 1) {
                rect.top = 0;
                rect.right = 0;
                rect.left = 0;
                rect.bottom = 0;
                return;
            }
            int k02 = recyclerView.k0(view);
            rect.right = (k02 == -1 || x.this.P.o3(k02)) ? 0 : a0.i(3.0f);
            if (k02 != 0 || x.this.f25322n0 == null || x.this.f25322n0.isEmpty() || ((o) x.this.f25322n0.get(0)).v() != 15) {
                i10 = a0.i(3.0f);
            }
            rect.bottom = i10;
        }
    }

    public class f extends RecyclerView.t {
        public f() {
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            x.this.a2();
            if (x.this.U != null) {
                x.this.U.invalidate();
            }
        }
    }

    public class g extends ie.k {
        public final v4 f25334b;
        public final p f25335c;

        public g(v4 v4Var, p pVar) {
            this.f25334b = v4Var;
            this.f25335c = pVar;
        }

        public void e(v4 v4Var, long j10, p pVar) {
            if (!b()) {
                x.this.setItems(null);
                x.this.f25309a0.c().hd().h7(v4Var, j10, new hj.j().h().r(new w2(x.this.f25309a0.c().h4(j10), pVar.c(), false)));
            }
        }

        @Override
        public void c(TdApi.Object object) {
            final long P0 = t2.P0(object);
            if (P0 != 0) {
                final v4 v4Var = this.f25334b;
                final p pVar = this.f25335c;
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        x.g.this.e(v4Var, P0, pVar);
                    }
                });
            } else if (object.getConstructor() == -1679978726) {
                j0.t0(object);
            }
        }
    }

    public interface h {
        void a();
    }

    public interface i {
        int n2(x xVar);

        int s(x xVar);
    }

    public interface j {
        void i(r rVar, boolean z10);

        void k(hd.t tVar);

        void l(hd.x xVar, String str);

        void p(o<?> oVar);

        void q(hd.v vVar);
    }

    public x(Context context) {
        super(context);
        v vVar = new v();
        this.V = vVar;
        int Y1 = Y1(a0.g(), a0.f());
        this.f25319k0 = Y1;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, Y1);
        this.O = gridLayoutManager;
        gridLayoutManager.e3(new a());
        b bVar = new b(context, 100);
        this.P = bVar;
        bVar.e3(new c());
        t tVar = new t(context, this, vVar);
        this.Q = tVar;
        d dVar = new d(context);
        this.M = dVar;
        dVar.g(new e());
        this.M.k(new f());
        this.M.setOverScrollMode(2);
        this.M.setItemAnimator(null);
        this.M.setLayoutManager(this.P);
        this.M.setAdapter(tVar);
        this.M.setAlpha(0.0f);
        this.M.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        addView(this.M);
        vVar.f(this.M);
        f3 f3Var = new f3(context);
        this.N = f3Var;
        f3Var.setAlpha(0.0f);
        this.N.setSimpleTopShadow(true);
        this.N.setLayoutParams(new FrameLayout.LayoutParams(-1, this.N.getLayoutParams().height, 80));
        addView(this.N);
        vVar.f(this.N);
        t1.b().a(this);
    }

    public static int Y1(int i10, int i11) {
        int min = Math.min(i10, i11) / 4;
        if (min != 0) {
            return i10 / min;
        }
        return 5;
    }

    private int getBackgroundColor() {
        float f10 = this.S;
        if (f10 == 0.0f) {
            return 0;
        }
        float f11 = this.f25316h0;
        if (f11 == 0.0f) {
            return 0;
        }
        return ib.d.b((int) (f10 * 153.0f * f11), 0);
    }

    private float getVisibleFactor() {
        return this.f25313e0 * (1.0f - this.f25315g0);
    }

    public boolean h2(o oVar, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            l2(oVar);
            this.f25309a0.c().v4().o(new TdApi.RemoveRecentHashtag(((hd.v) oVar).c().substring(1)), this.f25309a0.c().na());
        }
        return true;
    }

    public boolean i2(o oVar, v4 v4Var, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        l2(oVar);
        if (v4Var instanceof rh) {
            ((rh) v4Var).Uo(((hd.x) oVar).d0());
        }
        this.f25309a0.c().v4().o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryInlineBots(), ob.a.c(((hd.x) oVar).d0())), this.f25309a0.c().na());
        return true;
    }

    public boolean j2(o oVar, y1 y1Var, String str) {
        if (ib.i.i(str)) {
            return false;
        }
        j d22 = d2();
        if (d22 == null) {
            return true;
        }
        d22.l((hd.x) oVar, str);
        return true;
    }

    private void setBackgroundFactor(float f10) {
        if (this.S != f10) {
            this.S = f10;
            j0.m0(ib.d.c(d1.t2(), getBackgroundColor()));
            View view = this.U;
            if (view != null) {
                view.invalidate();
            }
            u2();
        }
    }

    private void setBottomMargin(int i10) {
        if (this.f25325q0 != i10) {
            this.f25325q0 = i10;
            setTranslationY(-i10);
        }
        View view = this.U;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setItems(java.util.ArrayList<hd.o<?>> r7) {
        throw new UnsupportedOperationException("Method not decompiled: vc.x.setItems(java.util.ArrayList):void");
    }

    private void setItemsVisible(boolean z10) {
        if (this.f25310b0 != z10) {
            this.f25310b0 = z10;
            if (z10) {
                y2(true);
            }
            if (this.M.getMeasuredHeight() == 0) {
                this.f25312d0 = true;
            } else {
                W1(z10 ? 1.0f : 0.0f, false);
            }
        }
    }

    private void setLayoutManagerMode(int i10) {
        if (i10 != this.R) {
            this.R = i10;
            this.M.setLayoutManager(i10 == 2 ? this.O : this.P);
            this.M.A0();
        }
    }

    @Override
    public void E5(dd.j jVar, l lVar, boolean z10) {
        ArrayList<o<?>> arrayList = this.f25322n0;
        if (arrayList != null) {
            int i10 = 0;
            Iterator<o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                o<?> next = it.next();
                if (next.v() != 11 || !((hd.a0) next).Z().equals(lVar)) {
                    i10++;
                } else {
                    View C = this.O.C(i10 + 1);
                    if (C instanceof dd.j) {
                        ((dd.j) C).setStickerPressed(z10);
                        return;
                    } else {
                        this.Q.I(i10);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void J1(dd.j jVar, l lVar) {
    }

    @Override
    public int L() {
        i iVar = this.T;
        return Math.max(0, (iVar != null ? iVar.n2(this) : ((org.thunderdog.challegram.a) getContext()).N0().getMeasuredHeight()) - Math.min(k2(), a0.A() / 2));
    }

    @Override
    public boolean Q1(dd.j jVar) {
        return true;
    }

    public final void T1(d9 d9Var, ArrayList<o<?>> arrayList) {
        if (this.f25309a0 == d9Var && this.f25322n0 != null && arrayList != null && !arrayList.isEmpty()) {
            this.f25322n0.addAll(arrayList);
            this.Q.a0(arrayList);
            this.M.A0();
        }
    }

    public void V1(d9 d9Var, ArrayList<o<?>> arrayList, h hVar) {
        if (arrayList != null && !arrayList.isEmpty()) {
            T1(d9Var, arrayList);
        }
    }

    public final void W1(float f10, boolean z10) {
        Z1();
        z2();
        this.M.setAlpha(1.0f);
        if (this.f25314f0 == null) {
            this.f25314f0 = new k(0, this, db.b.f7287b, 190L, this.f25316h0);
        }
        this.f25314f0.i(f10);
    }

    @Override
    public boolean W2(dd.j jVar, View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        Object tag = jVar.getTag();
        if (!(tag instanceof o)) {
            return false;
        }
        o oVar = (o) tag;
        rh f22 = f2();
        if (f22 == null) {
            return false;
        }
        f22.zp(oVar.r(), oVar.p(), true, true, z11, messageSchedulingState);
        return false;
    }

    public boolean X1() {
        return this.f25310b0;
    }

    public final void Z1() {
        this.f25311c0 = Math.min(this.M.getMeasuredHeight(), k2() + a0.i(7.0f));
    }

    public final void a2() {
        if (this.f25316h0 == 1.0f && ((LinearLayoutManager) this.M.getLayoutManager()).a2() + 4 >= this.Q.D()) {
            m2();
        }
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public final int c2() {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.M.getLayoutManager();
        if (linearLayoutManager.X1() != 0 || (C = linearLayoutManager.C(0)) == null) {
            return 0;
        }
        return C.getMeasuredHeight() + C.getTop();
    }

    @Override
    public v4<?> c7(ne.i iVar, float f10, float f11) {
        f20.a aVar;
        Object tag = iVar.getTag();
        if (!(tag instanceof o)) {
            return null;
        }
        o oVar = (o) tag;
        int v10 = oVar.v();
        if (v10 == 6) {
            u uVar = (u) oVar;
            aVar = new f20.a(uVar.c().animation, uVar.Z().d());
        } else if (v10 != 10) {
            aVar = null;
        } else {
            z zVar = (z) oVar;
            aVar = new f20.a(zVar.c().photo, zVar.b0() != null ? zVar.b0() : zVar.a0(), zVar.Z());
        }
        if (aVar == null) {
            return null;
        }
        f20 f20Var = new f20(getContext(), oVar.V());
        f20Var.Ad(aVar);
        return f20Var;
    }

    public final j d2() {
        j jVar = this.f25327s0;
        if (jVar != null) {
            return jVar;
        }
        v4<?> t10 = j0.t(getContext());
        if (t10 instanceof rh) {
            return ((rh) t10).kk();
        }
        return null;
    }

    @Override
    public void e2() {
        RecyclerView.p layoutManager;
        RecyclerView recyclerView = this.M;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.M.getLayoutManager();
            int X1 = linearLayoutManager.X1();
            int a22 = linearLayoutManager.a2();
            if (!(X1 == -1 || a22 == -1)) {
                for (int max = Math.max(1, X1); max <= a22; max++) {
                    View C = layoutManager.C(max);
                    if (C != null) {
                        C.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public boolean f(ne.i iVar, float f10, float f11, v4<?> v4Var) {
        return false;
    }

    public final rh f2() {
        v4<?> t10 = j0.t(getContext());
        if (t10 instanceof rh) {
            return (rh) t10;
        }
        return null;
    }

    public boolean g2() {
        return this.f25310b0;
    }

    @Override
    public boolean g4(dd.j jVar, int i10, int i11) {
        return true;
    }

    @Override
    public long getStickerOutputChatId() {
        rh f22 = f2();
        if (f22 != null) {
            return f22.C9();
        }
        return 0L;
    }

    @Override
    public int getStickersListTop() {
        return (int) getTranslationY();
    }

    public d9 getTdlibDelegate() {
        return this.f25309a0;
    }

    public v getThemeProvider() {
        return this.V;
    }

    @Override
    public int getViewportHeight() {
        rh f22 = f2();
        if (f22 != null) {
            return f22.c2();
        }
        return getMeasuredHeight();
    }

    @Override
    public boolean i0(ne.i iVar, float f10, float f11) {
        Object tag = iVar.getTag();
        if (!(tag instanceof o)) {
            return false;
        }
        int v10 = ((o) tag).v();
        return v10 == 6 || v10 == 10;
    }

    @Override
    public void j5(dd.j jVar, l lVar) {
    }

    public final int k2() {
        int k32;
        int i10;
        ArrayList<o<?>> arrayList = this.f25322n0;
        int i11 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i12 = this.R;
            if (i12 != 0) {
                if (i12 == 1) {
                    Iterator<o<?>> it = this.f25322n0.iterator();
                    int i13 = 0;
                    while (it.hasNext()) {
                        o<?> next = it.next();
                        if (o.A(next.v())) {
                            break;
                        }
                        i11 += next.o();
                        i13++;
                    }
                    k32 = this.P.k3(a0.g()) - i13;
                    i10 = a0.i(118.0f);
                } else if (i12 != 2) {
                    return 0;
                } else {
                    Iterator<o<?>> it2 = this.f25322n0.iterator();
                    int i14 = 0;
                    while (it2.hasNext()) {
                        o<?> next2 = it2.next();
                        if (o.B(next2.v())) {
                            break;
                        }
                        i11 += next2.o();
                        i14++;
                    }
                    k32 = (int) Math.ceil((this.f25322n0.size() - i14) / this.f25319k0);
                    i10 = a0.g() / this.f25319k0;
                }
                return i11 + (k32 * i10);
            }
            Iterator<o<?>> it3 = this.f25322n0.iterator();
            while (it3.hasNext()) {
                i11 += it3.next().o();
            }
        }
        return i11;
    }

    public final void l2(o<?> oVar) {
        int indexOf;
        ArrayList<o<?>> arrayList = this.f25322n0;
        if (arrayList != null && (indexOf = arrayList.indexOf(oVar)) != -1) {
            if (this.f25322n0.size() == 1) {
                setItemsVisible(false);
            } else {
                this.f25322n0.remove(indexOf);
                this.Q.f0(indexOf);
            }
            v2();
            this.M.A0();
        }
    }

    public final void m2() {
        h hVar = this.W;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final void n2(float f10, boolean z10) {
        k kVar = this.f25318j0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setBackgroundFactor(f10);
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            this.f25313e0 = f10;
            this.f25316h0 = getVisibleFactor();
            z2();
            u2();
        } else if (i10 == 1) {
            setBackgroundFactor(f10);
        } else if (i10 == 3) {
            this.f25315g0 = f10;
            this.f25316h0 = getVisibleFactor();
            z2();
            u2();
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 0.0f) {
            setItems(null);
        }
    }

    @Override
    public void onClick(View view) {
        Object tag;
        int id2 = view.getId();
        if (id2 == R.id.btn_switchPmButton) {
            t2((p) view.getTag());
        } else if (id2 == R.id.result && (tag = view.getTag()) != null && (tag instanceof o)) {
            o<?> oVar = (o) tag;
            j d22 = d2();
            if (d22 != null) {
                switch (oVar.v()) {
                    case 12:
                        hd.x xVar = (hd.x) oVar;
                        d22.l(xVar, xVar.f0() ? xVar.b0(true) : null);
                        return;
                    case 13:
                        d22.q((hd.v) oVar);
                        return;
                    case 14:
                        d22.i((r) oVar, false);
                        return;
                    case 15:
                    default:
                        d22.p(oVar);
                        return;
                    case 16:
                        d22.k((hd.t) oVar);
                        return;
                }
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y.g(getBackgroundColor()));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return getVisibility() != 0 || getAlpha() == 0.0f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onLongClick(View view) {
        final o oVar = (o) view.getTag();
        final v4<?> F = j0.r(getContext()).Q1().F();
        if (!(oVar == null || F == null)) {
            if (oVar instanceof r) {
                if (!(F instanceof rh)) {
                    return false;
                }
                rh rhVar = (rh) F;
                return rhVar.Li() && rhVar.po((r) oVar);
            } else if (oVar instanceof hd.v) {
                F.ee(w.i1(R.string.HashtagDeleteHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.P0(), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view2, int i10) {
                        boolean h22;
                        h22 = x.this.h2(oVar, view2, i10);
                        return h22;
                    }
                });
                return true;
            } else {
                boolean z10 = oVar instanceof hd.x;
                if (z10 && ((hd.x) oVar).e0()) {
                    F.ee(w.i1(R.string.BotDeleteHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.P0(), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i10) {
                            return g0.b(this, i10);
                        }

                        @Override
                        public final boolean r3(View view2, int i10) {
                            boolean i22;
                            i22 = x.this.i2(oVar, F, view2, i10);
                            return i22;
                        }
                    });
                    return true;
                } else if (!z10 || d2() == null) {
                    return false;
                } else {
                    F.Pc(w.i1(R.string.Mention), w.i1(R.string.MentionPlaceholder), R.string.MentionAdd, R.string.Cancel, ((hd.x) oVar).b0(true), new v4.m() {
                        @Override
                        public final boolean a(y1 y1Var, String str) {
                            boolean j22;
                            j22 = x.this.j2(oVar, y1Var, str);
                            return j22;
                        }
                    }, false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f25324p0 != getMeasuredHeight()) {
            this.f25324p0 = getMeasuredHeight();
            y2(true);
            v2();
        }
        p2(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void p2(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            if (this.f25320l0 != i10 || this.f25321m0 != i11) {
                this.f25320l0 = i10;
                this.f25321m0 = i11;
                int Y1 = Y1(i10, i11);
                if (Y1 != this.f25319k0) {
                    this.f25319k0 = Y1;
                    this.O.d3(Y1);
                }
            }
        }
    }

    public void r2(d9 d9Var, ArrayList<o<?>> arrayList, boolean z10, h hVar, boolean z11) {
        this.f25309a0 = d9Var;
        this.Q.h0(d9Var.c());
        boolean z12 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            this.W = null;
        } else {
            n2(z10 ? 1.0f : 0.0f, this.f25316h0 != 0.0f);
            setItems(arrayList);
            this.W = hVar;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z12 = false;
        }
        setItemsVisible(z12);
        setHidden(z11);
    }

    public final void s2() {
        if (this.f25312d0) {
            this.f25312d0 = false;
            W1(this.f25310b0 ? 1.0f : 0.0f, true);
        }
    }

    public void setHidden(boolean z10) {
        if (this.f25317i0 == null) {
            if (z10) {
                this.f25317i0 = new eb.f(3, this, db.b.f7287b, 180L);
            } else {
                return;
            }
        }
        Z1();
        this.f25317i0.p(z10, this.f25313e0 > 0.0f);
    }

    public void setListener(j jVar) {
        this.f25327s0 = jVar;
    }

    public void setOffsetProvider(i iVar) {
        this.T = iVar;
    }

    public void setUseDarkMode(boolean z10) {
        this.Q.i0(z10);
    }

    public final void t2(p pVar) {
        ie.k kVar = this.f25326r0;
        if (kVar != null) {
            kVar.a();
            this.f25326r0 = null;
        }
        v4<?> s10 = j0.s();
        long j10 = 0;
        if (s10 instanceof rh) {
            rh rhVar = (rh) s10;
            if (rhVar.Cj(pVar.b0())) {
                rhVar.xo(pVar);
                return;
            }
            j10 = s10.C9();
        }
        pVar.c0(j10);
        this.f25326r0 = new g(s10, pVar);
        this.f25309a0.c().v4().o(new TdApi.CreatePrivateChat(pVar.b0(), false), this.f25326r0);
    }

    public final void u2() {
        setWillNotDraw(this.S * this.f25316h0 == 0.0f);
        View view = this.U;
        if (view != null) {
            view.invalidate();
        }
        invalidate();
    }

    public final void v2() {
        if (this.Q.D() > 0) {
            this.Q.I(0);
        }
    }

    @Override
    public void w2(dd.j jVar, l lVar) {
    }

    public void y2(boolean z10) {
        i iVar = this.T;
        if (iVar != null) {
            setBottomMargin(iVar.s(this));
            return;
        }
        v4<?> t10 = j0.t(getContext());
        float f10 = 0.0f;
        boolean z11 = t10 instanceof rh;
        if (z11) {
            rh rhVar = (rh) t10;
            setBottomMargin(rhVar.lk(false));
            f10 = 0.0f - rhVar.tk();
        }
        q1 Q1 = j0.r(getContext()).Q1();
        if (z10 && Q1 != null && Q1.S()) {
            f10 = Q1.J();
            if (z11) {
            }
        }
        setTranslationX(f10);
    }

    public final void z2() {
        float d10 = ib.h.d(this.f25316h0);
        this.M.setTranslationY(this.f25311c0 * (1.0f - this.f25316h0));
        this.N.setAlpha(d10);
        int i10 = d10 == 0.0f ? 4 : 0;
        if (this.M.getVisibility() != i10) {
            this.M.setVisibility(i10);
        }
    }
}
