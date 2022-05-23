package vc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.p0;
import ce.y;
import d.j;
import de.ap;
import de.iq;
import de.ra;
import eb.k;
import hd.y0;
import ib.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.v4;
import vc.y3;
import yd.g;
import zd.b1;
import zd.c1;
import zd.d9;

public class k3 extends ViewGroup implements kb.c, y0.b, View.OnClickListener {
    public y3 M;
    public boolean N;
    public int O;
    public final k.b P;
    public final eb.f Q;
    public final eb.f R;
    public f S;
    public final k T;
    public y0 U;
    public long V;
    public boolean W;
    public CustomRecyclerView f25079a;
    public iq f25080b;
    public e f25081c;

    public class a extends RecyclerView.o {
        public a() {
        }

        @Override
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            float f10;
            float f11;
            float f12;
            float f13;
            boolean z10;
            if (k3.this.U != null) {
                int recyclerHeight = k3.this.getRecyclerHeight();
                int W = ap.W(j.L0);
                int v10 = k3.this.U.v();
                if (v10 > 0) {
                    float focusPosition = k3.this.getFocusPosition();
                    int a10 = ib.d.a(1.0f, ae.j.k());
                    int a11 = ib.d.a(0.3f, a10);
                    float f14 = v10;
                    float min = Math.min(f14, recyclerHeight / W);
                    int i10 = a0.i(10.0f);
                    float i11 = a0.i(1.5f);
                    int i12 = a0.i(6.0f);
                    int i13 = a0.i(3.0f);
                    float f15 = i10;
                    float f16 = f15 - i11;
                    float f17 = f15 + i11;
                    int i14 = i12 * 2;
                    int i15 = W - i14;
                    int i16 = v10 - 1;
                    int min2 = Math.min(i15, Math.max((i15 - (i13 * 3)) / 4, ((recyclerHeight - i14) - (i13 * i16)) / v10));
                    int j10 = v10 <= 1 ? 0 : h.j(i13, i14, (min - 1.0f) / i16);
                    int min3 = Math.min(v10, (recyclerHeight / min2) + 1);
                    if (f14 == min) {
                        f10 = f17;
                        f11 = i11;
                        f12 = 1.0f;
                    } else {
                        f12 = focusPosition / (f14 - min);
                        f10 = f17;
                        f11 = i11;
                    }
                    double d10 = focusPosition;
                    float f18 = f12;
                    int max = Math.max(0, (int) (d10 - Math.ceil(min3 * f12)));
                    int min4 = Math.min(v10, ((int) Math.ceil(d10)) + min3 + 1);
                    RectF a02 = y.a0();
                    float max2 = (recyclerHeight - i12) + (Math.max(0, (((v10 * min2) + (i16 * j10)) + i14) - recyclerHeight) * f18);
                    while (max < min4) {
                        float ceil = max2 - ((float) Math.ceil((min2 + j10) * max));
                        float f19 = ceil - min2;
                        float f20 = max;
                        int i17 = (focusPosition > f20 ? 1 : (focusPosition == f20 ? 0 : -1));
                        if (i17 == 0 || (max > ((int) focusPosition) && max < ((int) (focusPosition + min)))) {
                            f13 = f10;
                            z10 = true;
                        } else {
                            f13 = f10;
                            z10 = false;
                        }
                        a02.set(f16, f19, f13, ceil);
                        max2 = max2;
                        min2 = min2;
                        float f21 = f11;
                        canvas.drawRoundRect(a02, f21, f21, y.g(z10 ? a10 : a11));
                        if (!z10) {
                            if (max != ((int) focusPosition) || i17 <= 0) {
                                float f22 = (focusPosition + min) - f20;
                                if (f22 > 0.0f) {
                                    if (f22 < 1.0f) {
                                        a02.set(f16, ((f19 - ceil) * f22) + ceil, f13, ceil);
                                        canvas.drawRoundRect(a02, f21, f21, y.g(a10));
                                    }
                                    max++;
                                    f11 = f21;
                                    f10 = f13;
                                }
                            } else {
                                a02.set(f16, f19, f13, ceil + ((f19 - ceil) * (focusPosition - f20)));
                                canvas.drawRoundRect(a02, f21, f21, y.g(a10));
                            }
                        }
                        max++;
                        f11 = f21;
                        f10 = f13;
                    }
                    canvas.drawRect(0.0f, recyclerView.getMeasuredHeight() - a0.x(), recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight(), y.g(ib.d.a(k3.this.getExpandFactor() * h.d(focusPosition), ae.j.M0())));
                }
            }
        }
    }

    public class b implements k.b {
        public b() {
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            k3.this.p();
            k3.this.f25079a.invalidate();
            k3.this.f25081c.invalidate();
            k3.this.M.setAlpha(k3.this.getExpandFactor());
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (i10 == 1 && f10 == 0.0f) {
                k3.this.R.p(false, false);
            }
        }
    }

    public class c extends iq {
        public c(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var) {
            super(d9Var, onClickListener, v4Var);
        }

        @Override
        public void V(ap apVar) {
            super.V(apVar);
            if (apVar.f2982a instanceof z0) {
                k3.this.B((z0) apVar.f2982a, apVar.k());
            }
        }

        @Override
        public void z2(ra raVar, int i10, z0 z0Var) {
            z0Var.C1((TdApi.Message) raVar.d(), new TdApi.SearchMessagesFilterPinned(), raVar.x(), false);
            k3.this.B(z0Var, i10);
        }
    }

    public class d extends RecyclerView.t {
        public d() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            int X1;
            View C;
            int max;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null && i10 == 0 && (X1 = linearLayoutManager.X1()) != -1 && (C = linearLayoutManager.C(X1)) != null && (max = Math.max(0, C.getBottom() - recyclerView.getMeasuredHeight())) != 0) {
                if (max > C.getMeasuredHeight() / 2) {
                    recyclerView.u1(0, max - C.getMeasuredHeight());
                } else {
                    recyclerView.u1(0, max);
                }
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (!(k3.this.U == null || i11 == 0 || linearLayoutManager == null)) {
                int a22 = linearLayoutManager.a2();
                int X1 = linearLayoutManager.X1();
                if (a22 != -1 && a22 + 15 >= k3.this.U.u()) {
                    k3.this.U.G(false, null);
                } else if (X1 != -1 && X1 - 5 <= 0) {
                    k3.this.U.G(true, null);
                }
            }
            float expandFactor = k3.this.getExpandFactor();
            if (expandFactor > 0.0f && expandFactor < 1.0f) {
                k3.this.C();
            }
        }
    }

    public class e extends View {
        public e(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            ce.b.g(canvas, getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2.0f), getMeasuredHeight() / 2.0f, ae.j.o0(), k3.this.R.g(), 1.0f - k3.this.Q.g());
        }
    }

    public interface f {
        void a(k3 k3Var);

        void b(k3 k3Var, TdApi.Message message);

        void c(k3 k3Var);
    }

    public k3(Context context) {
        super(context);
        b bVar = new b();
        this.P = bVar;
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.Q = new eb.f(1, bVar, decelerateInterpolator, 120L);
        this.R = new eb.f(0, bVar, decelerateInterpolator, 180L);
        this.T = new k(2, bVar, decelerateInterpolator, 180L);
        y3 y3Var = new y3(context);
        this.M = y3Var;
        y3Var.setAlpha(0.0f);
        this.M.setCanDismiss(true);
        this.M.setDismissListener(new y3.b() {
            @Override
            public final void a(y3 y3Var2) {
                k3.this.t(y3Var2);
            }
        });
        this.M.setItems(new y3.c(R.id.btn_showPinnedMessage, R.string.ShowPinnedList, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                k3.this.u(view);
            }
        }));
        this.M.setLayoutParams(new ViewGroup.LayoutParams(-1, a0.i(36.0f)));
        addView(this.M);
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) p0.v(context, R.layout.recycler_custom, null);
        this.f25079a = customRecyclerView;
        customRecyclerView.setItemAnimator(new tc.d(decelerateInterpolator, 180L));
        this.f25079a.setOverScrollMode(fd.a.f11879a ? 1 : 2);
        this.f25079a.setVerticalScrollBarEnabled(false);
        p0.e0(this.f25079a);
        this.f25079a.setLayoutManager(new LinearLayoutManager(context, 1, true));
        this.f25079a.g(new a());
        addView(this.f25079a);
        e eVar = new e(context);
        this.f25081c = eVar;
        eVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                k3.this.v(view);
            }
        });
        this.f25081c.setBackgroundResource(R.drawable.bg_btn_header);
        p0.T(this.f25081c);
        addView(this.f25081c);
        g.i(this, R.id.theme_color_filling, null);
        g.i(this.f25079a, R.id.theme_color_filling, null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setWillNotDraw(false);
    }

    private int getBottomBarHeight() {
        return (int) (a0.i(36.0f) * getExpandFactor());
    }

    public float getExpandFactor() {
        return this.R.g() * this.Q.g();
    }

    public float getFocusPosition() {
        int k02;
        int measuredHeight = this.f25079a.getMeasuredHeight();
        int W = ap.W(j.L0);
        int childCount = this.f25079a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f25079a.getChildAt(i10);
            if ((childAt instanceof z0) && (k02 = this.f25079a.k0(childAt)) != -1) {
                return k02 + ((childAt.getBottom() - measuredHeight) / W);
            }
        }
        return 0.0f;
    }

    public int getRecyclerHeight() {
        int W = ap.W(j.L0);
        return W + Math.round(W * this.T.o() * getExpandFactor());
    }

    public static ra s(TdApi.Message message) {
        return new ra(j.L0, R.id.y_res_0x7f07044a).G(message);
    }

    public void t(y3 y3Var) {
        f fVar = this.S;
        if (fVar != null) {
            fVar.c(this);
        }
    }

    public void u(View view) {
        f fVar = this.S;
        if (fVar != null) {
            fVar.a(this);
        }
    }

    public void v(View view) {
        if (this.Q.h() || this.R.h()) {
            this.R.r(true);
            return;
        }
        f fVar = this.S;
        if (fVar != null) {
            fVar.c(this);
        }
    }

    public void A() {
        C();
    }

    public final void B(z0 z0Var, int i10) {
        float expandFactor = 1.0f - getExpandFactor();
        int i11 = a0.i(28.0f);
        if (expandFactor != 1.0f) {
            i11 = expandFactor == 0.0f ? 0 : Math.round(i11 * (1.0f - h.d(Math.abs(i10 - getFocusPosition()))) * expandFactor);
        }
        z0Var.setContentInset(i11);
    }

    public final void C() {
        int k02;
        int i10;
        float focusPosition = getFocusPosition();
        float expandFactor = 1.0f - getExpandFactor();
        int i11 = a0.i(28.0f);
        for (int i12 = 0; i12 < this.f25079a.getChildCount(); i12++) {
            View childAt = this.f25079a.getChildAt(i12);
            if ((childAt instanceof z0) && (k02 = this.f25079a.k0(childAt)) != -1) {
                if (expandFactor == 1.0f) {
                    i10 = i11;
                } else {
                    i10 = expandFactor == 0.0f ? 0 : Math.round(i11 * (1.0f - h.d(Math.abs(k02 - focusPosition))) * expandFactor);
                }
                ((z0) childAt).setContentInset(i10);
            }
        }
    }

    @Override
    public void D(b1<TdApi.Message> b1Var, List<TdApi.Message> list, int i10, boolean z10) {
        ra[] raVarArr = new ra[list.size()];
        int i11 = 0;
        for (TdApi.Message message : list) {
            raVarArr[i11] = s(message);
            i11++;
        }
        if (this.W || this.f25080b.D0().isEmpty()) {
            this.W = false;
            this.f25080b.t2(raVarArr, false);
            return;
        }
        this.f25080b.Y0(i10, raVarArr);
    }

    @Override
    public void I2(b1<TdApi.Message> b1Var, int i10) {
        if (i10 != 0 || this.R.g() == 0.0f) {
            this.Q.p(i10 > 1, true);
        }
        float max = Math.max(0.0f, Math.min(3.0f, i10 - 1));
        if (getExpandFactor() > 0.0f) {
            this.T.i(max);
        } else {
            this.T.l(max);
        }
    }

    @Override
    public void K(b1<TdApi.Message> b1Var, boolean z10) {
        c1.a(this, b1Var, z10);
    }

    @Override
    public void Q2() {
        setMessageList(null);
    }

    @Override
    public void V5(b1<TdApi.Message> b1Var) {
        c1.h(this, b1Var);
    }

    @Override
    public void e4(b1<TdApi.Message> b1Var) {
        c1.b(this, b1Var);
    }

    public int getTotalHeight() {
        return getRecyclerHeight() + getBottomBarHeight();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.y_res_0x7f07044a) {
            TdApi.Message message = (TdApi.Message) ((ra) view.getTag()).d();
            f fVar = this.S;
            if (fVar != null) {
                fVar.b(this, message);
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, getRecyclerHeight(), getMeasuredWidth(), getMeasuredHeight(), y.g(ae.j.u()));
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.M.layout(i10, i13 - a0.i(36.0f), i12, i13);
        this.f25079a.layout(i10, i11, i12, getRecyclerHeight());
        e eVar = this.f25081c;
        eVar.layout(i12 - eVar.getMeasuredWidth(), i13 - this.f25081c.getMeasuredHeight(), i12, i13);
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int totalHeight = getTotalHeight();
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(totalHeight, Log.TAG_TDLIB_OPTIONS));
        this.f25079a.measure(i10, View.MeasureSpec.makeMeasureSpec(getRecyclerHeight(), Log.TAG_TDLIB_OPTIONS));
        this.f25081c.measure(View.MeasureSpec.makeMeasureSpec(a0.i(40.0f), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(h.j(ap.W(j.L0), a0.i(36.0f), getExpandFactor()), Log.TAG_TDLIB_OPTIONS));
        this.M.measure(i10, View.MeasureSpec.makeMeasureSpec(a0.i(36.0f), Log.TAG_TDLIB_OPTIONS));
        if (totalHeight != this.O) {
            this.O = totalHeight;
            A();
        }
    }

    public final void p() {
        int totalHeight = getTotalHeight();
        if (totalHeight != this.O) {
            this.O = totalHeight;
            requestLayout();
            A();
            float expandFactor = getExpandFactor();
            if (expandFactor == 1.0f || expandFactor == 0.0f) {
                C();
            }
        }
    }

    public void q(boolean z10) {
        this.R.p(false, z10);
    }

    public void r(v4<?> v4Var) {
        c cVar = new c(v4Var, this, v4Var);
        this.f25080b = cVar;
        this.f25079a.setAdapter(cVar);
        this.f25079a.k(new d());
        v4Var.t8(this);
        v4Var.t8(this.f25079a);
        v4Var.t8(this.f25081c);
        this.M.A1(v4Var);
    }

    public void setAnimationsDisabled(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            this.f25079a.setItemAnimator(z10 ? null : new tc.d(db.b.f7287b, 180L));
        }
    }

    public void setMaxFocusMessageId(long j10) {
        if (this.V != j10) {
            this.V = j10;
        }
    }

    public void setMessageList(y0 y0Var) {
        y0 y0Var2 = this.U;
        if (y0Var2 != y0Var) {
            if (y0Var2 != null) {
                y0Var2.V(this);
                this.U = null;
            }
            this.U = y0Var;
            q(false);
            this.Q.p(y0Var != null && y0Var.v() > 1, false);
            this.T.l(Math.max(0.0f, Math.min(3.0f, y0Var != null ? y0Var.v() - 1 : 0.0f)));
            if (y0Var != null) {
                y0Var.r(this);
                ArrayList arrayList = new ArrayList(y0Var.u());
                Iterator<TdApi.Message> it = y0Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(s(it.next()));
                }
                this.f25080b.s2(arrayList, false);
                y0Var.E(null);
                return;
            }
            this.f25080b.t2(new ra[0], false);
        }
    }

    public void setMessageListener(f fVar) {
        this.S = fVar;
    }

    public void s3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
        boolean z10 = true;
        if (this.W || this.f25080b.D0().isEmpty()) {
            this.W = false;
            this.f25080b.t2(new ra[]{s(message)}, false);
            return;
        }
        if (((LinearLayoutManager) this.f25079a.getLayoutManager()).T1() != 0) {
            z10 = false;
        }
        this.f25080b.s0(i10, s(message));
        if (z10) {
            ((LinearLayoutManager) this.f25079a.getLayoutManager()).z2(0, 0);
        }
    }

    public void T2(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
        if (i11 == 3) {
            this.f25080b.I(i10);
        }
    }

    public void C3(b1<TdApi.Message> b1Var, TdApi.Message message, int i10, int i11) {
        this.f25080b.u1(i10, i11);
    }

    public void G1(b1<TdApi.Message> b1Var, TdApi.Message message, int i10) {
        if (i10 == 0 && this.f25080b.D0().size() == 1) {
            this.W = true;
        } else {
            this.f25080b.j1(i10);
        }
    }
}
