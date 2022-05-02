package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1359b;
import be.C1399s0;
import be.C1410y;
import gd.C4837y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.C2139ap;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p039d.C3563j;
import p051db.C3940f;
import p051db.C3950k;
import p067ed.C4183a;
import p108hb.C5064d;
import p108hb.C5069h;
import p139jb.AbstractC5911c;
import p291uc.C9717z3;
import p335xd.C10192g;
import p350yd.AbstractC10596d1;
import p350yd.AbstractC10664f9;
import p350yd.C10626e1;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9323v4;

public class View$OnClickListenerC9599l3 extends ViewGroup implements AbstractC5911c, C4837y0.AbstractC4839b, View.OnClickListener {
    public C9717z3 f31126M;
    public boolean f31127N;
    public int f31128O;
    public final C3950k.AbstractC3952b f31129P;
    public final C3940f f31130Q;
    public final C3940f f31131R;
    public AbstractC9605f f31132S;
    public final C3950k f31133T;
    public C4837y0 f31134U;
    public long f31135V;
    public boolean f31136W;
    public CustomRecyclerView f31137a;
    public C2546iq f31138b;
    public C9604e f31139c;

    public class C9600a extends RecyclerView.AbstractC0901o {
        public C9600a() {
        }

        @Override
        public void mo8031k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            float f;
            float f2;
            float f3;
            float f4;
            boolean z;
            if (View$OnClickListenerC9599l3.this.f31134U != null) {
                int recyclerHeight = View$OnClickListenerC9599l3.this.getRecyclerHeight();
                int W = C2139ap.m35482W(C3563j.f11957L0);
                int v = View$OnClickListenerC9599l3.this.f31134U.m4493v();
                if (v > 0) {
                    float focusPosition = View$OnClickListenerC9599l3.this.getFocusPosition();
                    int a = C5064d.m24132a(1.0f, C11524j.m172k());
                    int a2 = C5064d.m24132a(0.3f, a);
                    float f5 = v;
                    float min = Math.min(f5, recyclerHeight / W);
                    int i = C1357a0.m37544i(10.0f);
                    float i2 = C1357a0.m37544i(1.5f);
                    int i3 = C1357a0.m37544i(6.0f);
                    int i4 = C1357a0.m37544i(3.0f);
                    float f6 = i;
                    float f7 = f6 - i2;
                    float f8 = f6 + i2;
                    int i5 = i3 * 2;
                    int i6 = W - i5;
                    int i7 = v - 1;
                    int min2 = Math.min(i6, Math.max((i6 - (i4 * 3)) / 4, ((recyclerHeight - i5) - (i4 * i7)) / v));
                    int j = v <= 1 ? 0 : C5069h.m24084j(i4, i5, (min - 1.0f) / i7);
                    int min3 = Math.min(v, (recyclerHeight / min2) + 1);
                    if (f5 == min) {
                        f = f8;
                        f2 = i2;
                        f3 = 1.0f;
                    } else {
                        f3 = focusPosition / (f5 - min);
                        f = f8;
                        f2 = i2;
                    }
                    double d = focusPosition;
                    float f9 = f3;
                    int max = Math.max(0, (int) (d - Math.ceil(min3 * f3)));
                    int min4 = Math.min(v, ((int) Math.ceil(d)) + min3 + 1);
                    RectF a0 = C1410y.m37053a0();
                    float max2 = (recyclerHeight - i3) + (Math.max(0, (((v * min2) + (i7 * j)) + i5) - recyclerHeight) * f9);
                    while (max < min4) {
                        float ceil = max2 - ((float) Math.ceil((min2 + j) * max));
                        float f10 = ceil - min2;
                        float f11 = max;
                        int i8 = (focusPosition > f11 ? 1 : (focusPosition == f11 ? 0 : -1));
                        if (i8 == 0 || (max > ((int) focusPosition) && max < ((int) (focusPosition + min)))) {
                            f4 = f;
                            z = true;
                        } else {
                            f4 = f;
                            z = false;
                        }
                        a0.set(f7, f10, f4, ceil);
                        max2 = max2;
                        min2 = min2;
                        float f12 = f2;
                        canvas.drawRoundRect(a0, f12, f12, C1410y.m37042g(z ? a : a2));
                        if (!z) {
                            if (max != ((int) focusPosition) || i8 <= 0) {
                                float f13 = (focusPosition + min) - f11;
                                if (f13 > 0.0f) {
                                    if (f13 < 1.0f) {
                                        a0.set(f7, ((f10 - ceil) * f13) + ceil, f4, ceil);
                                        canvas.drawRoundRect(a0, f12, f12, C1410y.m37042g(a));
                                    }
                                    max++;
                                    f2 = f12;
                                    f = f4;
                                }
                            } else {
                                a0.set(f7, f10, f4, ceil + ((f10 - ceil) * (focusPosition - f11)));
                                canvas.drawRoundRect(a0, f12, f12, C1410y.m37042g(a));
                            }
                        }
                        max++;
                        f2 = f12;
                        f = f4;
                    }
                    canvas.drawRect(0.0f, recyclerView.getMeasuredHeight() - C1357a0.m37529x(), recyclerView.getMeasuredWidth(), recyclerView.getMeasuredHeight(), C1410y.m37042g(C5064d.m24132a(View$OnClickListenerC9599l3.this.getExpandFactor() * C5069h.m24090d(focusPosition), C11524j.m223P0())));
                }
            }
        }
    }

    public class C9601b implements C3950k.AbstractC3952b {
        public C9601b() {
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            View$OnClickListenerC9599l3.this.m8042p();
            View$OnClickListenerC9599l3.this.f31137a.invalidate();
            View$OnClickListenerC9599l3.this.f31139c.invalidate();
            View$OnClickListenerC9599l3.this.f31126M.setAlpha(View$OnClickListenerC9599l3.this.getExpandFactor());
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (i == 1 && f == 0.0f) {
                View$OnClickListenerC9599l3.this.f31131R.m29577p(false, false);
            }
        }
    }

    public class C9602c extends C2546iq {
        public C9602c(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var) {
            super(f9Var, onClickListener, v4Var);
        }

        @Override
        public void mo8030D2(C2964ra raVar, int i, C9494a1 a1Var) {
            a1Var.m8490E1((TdApi.Message) raVar.m32847d(), new TdApi.SearchMessagesFilterPinned(), raVar.m32824x(), false);
            View$OnClickListenerC9599l3.this.m8059B(a1Var, i);
        }

        @Override
        public void mo6144V(C2139ap apVar) {
            super.mo6144V(apVar);
            if (apVar.f3479a instanceof C9494a1) {
                View$OnClickListenerC9599l3.this.m8059B((C9494a1) apVar.f3479a, apVar.m39338k());
            }
        }
    }

    public class C9603d extends RecyclerView.AbstractC0910t {
        public C9603d() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            int X1;
            View C;
            int max;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null && i == 0 && (X1 = linearLayoutManager.m39552X1()) != -1 && (C = linearLayoutManager.mo39265C(X1)) != null && (max = Math.max(0, C.getBottom() - recyclerView.getMeasuredHeight())) != 0) {
                if (max > C.getMeasuredHeight() / 2) {
                    recyclerView.mo8024v1(0, max - C.getMeasuredHeight());
                } else {
                    recyclerView.mo8024v1(0, max);
                }
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (!(View$OnClickListenerC9599l3.this.f31134U == null || i2 == 0 || linearLayoutManager == null)) {
                int a2 = linearLayoutManager.m39549a2();
                int X1 = linearLayoutManager.m39552X1();
                if (a2 != -1 && a2 + 15 >= View$OnClickListenerC9599l3.this.f31134U.m4494u()) {
                    View$OnClickListenerC9599l3.this.f31134U.m4518G(false, null);
                } else if (X1 != -1 && X1 - 5 <= 0) {
                    View$OnClickListenerC9599l3.this.f31134U.m4518G(true, null);
                }
            }
            float expandFactor = View$OnClickListenerC9599l3.this.getExpandFactor();
            if (expandFactor > 0.0f && expandFactor < 1.0f) {
                View$OnClickListenerC9599l3.this.m8058C();
            }
        }
    }

    public class C9604e extends View {
        public C9604e(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            C1359b.m37515g(canvas, getPaddingLeft() + (((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) / 2.0f), getMeasuredHeight() / 2.0f, C11524j.m159q0(), View$OnClickListenerC9599l3.this.f31131R.m29586g(), 1.0f - View$OnClickListenerC9599l3.this.f31130Q.m29586g());
        }
    }

    public interface AbstractC9605f {
        void mo8028a(View$OnClickListenerC9599l3 l3Var);

        void mo8027b(View$OnClickListenerC9599l3 l3Var, TdApi.Message message);

        void mo8026c(View$OnClickListenerC9599l3 l3Var);
    }

    public View$OnClickListenerC9599l3(Context context) {
        super(context);
        C9601b bVar = new C9601b();
        this.f31129P = bVar;
        DecelerateInterpolator decelerateInterpolator = C2057b.f7280b;
        this.f31130Q = new C3940f(1, bVar, decelerateInterpolator, 120L);
        this.f31131R = new C3940f(0, bVar, decelerateInterpolator, 180L);
        this.f31133T = new C3950k(2, bVar, decelerateInterpolator, 180L);
        C9717z3 z3Var = new C9717z3(context);
        this.f31126M = z3Var;
        z3Var.setAlpha(0.0f);
        this.f31126M.setCanDismiss(true);
        this.f31126M.setDismissListener(new C9717z3.AbstractC9719b() {
            @Override
            public final void mo7432a(C9717z3 z3Var2) {
                View$OnClickListenerC9599l3.this.m8038t(z3Var2);
            }
        });
        this.f31126M.setItems(new C9717z3.C9720c(R.id.btn_showPinnedMessage, R.string.ShowPinnedList, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC9599l3.this.m8037u(view);
            }
        }));
        this.f31126M.setLayoutParams(new ViewGroup.LayoutParams(-1, C1357a0.m37544i(36.0f)));
        addView(this.f31126M);
        CustomRecyclerView customRecyclerView = (CustomRecyclerView) C1399s0.m37149y(context, R.layout.recycler_custom, null);
        this.f31137a = customRecyclerView;
        customRecyclerView.setItemAnimator(new C8731d(decelerateInterpolator, 180L));
        this.f31137a.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        this.f31137a.setVerticalScrollBarEnabled(false);
        C1399s0.m37174l0(this.f31137a);
        this.f31137a.setLayoutManager(new LinearLayoutManager(context, 1, true));
        this.f31137a.m39437g(new C9600a());
        addView(this.f31137a);
        C9604e eVar = new C9604e(context);
        this.f31139c = eVar;
        eVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                View$OnClickListenerC9599l3.this.m8036v(view);
            }
        });
        this.f31139c.setBackgroundResource(R.drawable.bg_btn_header);
        C1399s0.m37196a0(this.f31139c);
        addView(this.f31139c);
        C10192g.m5782i(this, R.id.theme_color_filling, null);
        C10192g.m5782i(this.f31137a, R.id.theme_color_filling, null);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setWillNotDraw(false);
    }

    private int getBottomBarHeight() {
        return (int) (C1357a0.m37544i(36.0f) * getExpandFactor());
    }

    public float getExpandFactor() {
        return this.f31131R.m29586g() * this.f31130Q.m29586g();
    }

    public float getFocusPosition() {
        int k0;
        int measuredHeight = this.f31137a.getMeasuredHeight();
        int W = C2139ap.m35482W(C3563j.f11957L0);
        int childCount = this.f31137a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f31137a.getChildAt(i);
            if ((childAt instanceof C9494a1) && (k0 = this.f31137a.m39424k0(childAt)) != -1) {
                return k0 + ((childAt.getBottom() - measuredHeight) / W);
            }
        }
        return 0.0f;
    }

    public int getRecyclerHeight() {
        int W = C2139ap.m35482W(C3563j.f11957L0);
        return W + Math.round(W * this.f31133T.m29540o() * getExpandFactor());
    }

    public static C2964ra m8039s(TdApi.Message message) {
        return new C2964ra(C3563j.f11957L0, R.id.y_res_0x7f070448).m32873G(message);
    }

    public void m8038t(C9717z3 z3Var) {
        AbstractC9605f fVar = this.f31132S;
        if (fVar != null) {
            fVar.mo8026c(this);
        }
    }

    public void m8037u(View view) {
        AbstractC9605f fVar = this.f31132S;
        if (fVar != null) {
            fVar.mo8028a(this);
        }
    }

    public void m8036v(View view) {
        if (this.f31130Q.m29585h() || this.f31131R.m29585h()) {
            this.f31131R.m29575r(true);
            return;
        }
        AbstractC9605f fVar = this.f31132S;
        if (fVar != null) {
            fVar.mo8026c(this);
        }
    }

    public void mo8060A() {
        m8058C();
    }

    public final void m8059B(C9494a1 a1Var, int i) {
        float expandFactor = 1.0f - getExpandFactor();
        int i2 = C1357a0.m37544i(28.0f);
        if (expandFactor != 1.0f) {
            i2 = expandFactor == 0.0f ? 0 : Math.round(i2 * (1.0f - C5069h.m24090d(Math.abs(i - getFocusPosition()))) * expandFactor);
        }
        a1Var.setContentInset(i2);
    }

    public final void m8058C() {
        int k0;
        int i;
        float focusPosition = getFocusPosition();
        float expandFactor = 1.0f - getExpandFactor();
        int i2 = C1357a0.m37544i(28.0f);
        for (int i3 = 0; i3 < this.f31137a.getChildCount(); i3++) {
            View childAt = this.f31137a.getChildAt(i3);
            if ((childAt instanceof C9494a1) && (k0 = this.f31137a.m39424k0(childAt)) != -1) {
                if (expandFactor == 1.0f) {
                    i = i2;
                } else {
                    i = expandFactor == 0.0f ? 0 : Math.round(i2 * (1.0f - C5069h.m24090d(Math.abs(k0 - focusPosition))) * expandFactor);
                }
                ((C9494a1) childAt).setContentInset(i);
            }
        }
    }

    @Override
    public void mo4486C3(AbstractC10596d1<TdApi.Message> d1Var, boolean z) {
        C10626e1.m4426a(this, d1Var, z);
    }

    @Override
    public void mo4485C6(AbstractC10596d1<TdApi.Message> d1Var, List<TdApi.Message> list, int i, boolean z) {
        C2964ra[] raVarArr = new C2964ra[list.size()];
        int i2 = 0;
        for (TdApi.Message message : list) {
            raVarArr[i2] = m8039s(message);
            i2++;
        }
        if (this.f31136W || this.f31138b.m34243F0().isEmpty()) {
            this.f31136W = false;
            this.f31138b.m34116y2(raVarArr, false);
            return;
        }
        this.f31138b.m34191b1(i, raVarArr);
    }

    @Override
    public void mo4484F5(AbstractC10596d1<TdApi.Message> d1Var) {
        C10626e1.m4419h(this, d1Var);
    }

    @Override
    public void mo4482J6(AbstractC10596d1<TdApi.Message> d1Var, int i) {
        if (i != 0 || this.f31131R.m29586g() == 0.0f) {
            this.f31130Q.m29577p(i > 1, true);
        }
        float max = Math.max(0.0f, Math.min(3.0f, i - 1));
        if (getExpandFactor() > 0.0f) {
            this.f31133T.m29546i(max);
        } else {
            this.f31133T.m29543l(max);
        }
    }

    @Override
    public void mo4501a3() {
        setMessageList(null);
    }

    public int getTotalHeight() {
        return getRecyclerHeight() + getBottomBarHeight();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.y_res_0x7f070448) {
            TdApi.Message message = (TdApi.Message) ((C2964ra) view.getTag()).m32847d();
            AbstractC9605f fVar = this.f31132S;
            if (fVar != null) {
                fVar.mo8027b(this, message);
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, getRecyclerHeight(), getMeasuredWidth(), getMeasuredHeight(), C1410y.m37042g(C11524j.m148w()));
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f31126M.layout(i, i4 - C1357a0.m37544i(36.0f), i3, i4);
        this.f31137a.layout(i, i2, i3, getRecyclerHeight());
        C9604e eVar = this.f31139c;
        eVar.layout(i3 - eVar.getMeasuredWidth(), i4 - this.f31139c.getMeasuredHeight(), i3, i4);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int totalHeight = getTotalHeight();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(totalHeight, Log.TAG_TDLIB_OPTIONS));
        this.f31137a.measure(i, View.MeasureSpec.makeMeasureSpec(getRecyclerHeight(), Log.TAG_TDLIB_OPTIONS));
        this.f31139c.measure(View.MeasureSpec.makeMeasureSpec(C1357a0.m37544i(40.0f), Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(C5069h.m24084j(C2139ap.m35482W(C3563j.f11957L0), C1357a0.m37544i(36.0f), getExpandFactor()), Log.TAG_TDLIB_OPTIONS));
        this.f31126M.measure(i, View.MeasureSpec.makeMeasureSpec(C1357a0.m37544i(36.0f), Log.TAG_TDLIB_OPTIONS));
        if (totalHeight != this.f31128O) {
            this.f31128O = totalHeight;
            mo8060A();
        }
    }

    public final void m8042p() {
        int totalHeight = getTotalHeight();
        if (totalHeight != this.f31128O) {
            this.f31128O = totalHeight;
            requestLayout();
            mo8060A();
            float expandFactor = getExpandFactor();
            if (expandFactor == 1.0f || expandFactor == 0.0f) {
                m8058C();
            }
        }
    }

    public void m8041q(boolean z) {
        this.f31131R.m29577p(false, z);
    }

    public void m8040r(AbstractC9323v4<?> v4Var) {
        C9602c cVar = new C9602c(v4Var, this, v4Var);
        this.f31138b = cVar;
        this.f31137a.setAdapter(cVar);
        this.f31137a.m39425k(new C9603d());
        v4Var.m9163t8(this);
        v4Var.m9163t8(this.f31137a);
        v4Var.m9163t8(this.f31139c);
        this.f31126M.m7434D1(v4Var);
    }

    public void setAnimationsDisabled(boolean z) {
        if (this.f31127N != z) {
            this.f31127N = z;
            this.f31137a.setItemAnimator(z ? null : new C8731d(C2057b.f7280b, 180L));
        }
    }

    public void setMaxFocusMessageId(long j) {
        if (this.f31135V != j) {
            this.f31135V = j;
        }
    }

    public void setMessageList(C4837y0 y0Var) {
        C4837y0 y0Var2 = this.f31134U;
        if (y0Var2 != y0Var) {
            if (y0Var2 != null) {
                y0Var2.m4505W(this);
                this.f31134U = null;
            }
            this.f31134U = y0Var;
            m8041q(false);
            this.f31130Q.m29577p(y0Var != null && y0Var.m4493v() > 1, false);
            this.f31133T.m29543l(Math.max(0.0f, Math.min(3.0f, y0Var != null ? y0Var.m4493v() - 1 : 0.0f)));
            if (y0Var != null) {
                y0Var.m4497r(this);
                ArrayList arrayList = new ArrayList(y0Var.m4494u());
                Iterator<TdApi.Message> it = y0Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(m8039s(it.next()));
                }
                this.f31138b.m34119x2(arrayList, false);
                y0Var.m4520E(null);
                return;
            }
            this.f31138b.m34116y2(new C2964ra[0], false);
        }
    }

    public void setMessageListener(AbstractC9605f fVar) {
        this.f31132S = fVar;
    }

    @Override
    public void mo4479t6(AbstractC10596d1<TdApi.Message> d1Var) {
        C10626e1.m4425b(this, d1Var);
    }

    public void mo4478x2(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
        boolean z = true;
        if (this.f31136W || this.f31138b.m34243F0().isEmpty()) {
            this.f31136W = false;
            this.f31138b.m34116y2(new C2964ra[]{m8039s(message)}, false);
            return;
        }
        if (((LinearLayoutManager) this.f31137a.getLayoutManager()).m39556T1() != 0) {
            z = false;
        }
        this.f31138b.m34132t0(i, m8039s(message));
        if (z) {
            ((LinearLayoutManager) this.f31137a.getLayoutManager()).m39525z2(0, 0);
        }
    }

    public void mo4480i7(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
        if (i2 == 3) {
            this.f31138b.m39315I(i);
        }
    }

    public void mo4483H6(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i, int i2) {
        this.f31138b.m34117y1(i, i2);
    }

    public void mo4481d4(AbstractC10596d1<TdApi.Message> d1Var, TdApi.Message message, int i) {
        if (i == 0 && this.f31138b.m34243F0().size() == 1) {
            this.f31136W = true;
        } else {
            this.f31138b.m34150n1(i);
        }
    }
}
