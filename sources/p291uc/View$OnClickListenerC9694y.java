package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1410y;
import cd.C2099j;
import cd.C2104l;
import gd.AbstractC4718o;
import gd.C4575a0;
import gd.C4729p;
import gd.C4747r;
import gd.C4776t;
import gd.C4779t2;
import gd.C4801u;
import gd.C4809v;
import gd.C4822w2;
import gd.C4828x;
import gd.C4847z;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6879f3;
import me.View$OnClickListenerC6902i;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.NewFlowLayoutManager;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.e20;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5123k;
import p111he.C5115g0;
import p193nb.C7316a;
import p291uc.C9661u;
import p291uc.View$OnClickListenerC9694y;
import p350yd.AbstractC10664f9;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import p364zd.C11537v;
import td.AbstractC9323v4;
import td.C9270q1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC9694y extends FrameLayoutFix implements View.OnClickListener, C2099j.AbstractC2102c, C9661u.AbstractC9662a, C3950k.AbstractC3952b, View.OnLongClickListener, C11052v1.AbstractC11053a, View$OnClickListenerC6902i.AbstractC6906d {
    public RecyclerView f31493M;
    public C6879f3 f31494N;
    public GridLayoutManager f31495O;
    public NewFlowLayoutManager f31496P;
    public final C9661u f31497Q;
    public int f31498R;
    public float f31499S;
    public AbstractC9703i f31500T;
    public View f31501U;
    public final C11537v f31502V;
    public AbstractC9702h f31503W;
    public AbstractC10664f9 f31504a0;
    public boolean f31505b0;
    public int f31506c0;
    public boolean f31507d0;
    public float f31508e0;
    public C3950k f31509f0;
    public float f31510g0;
    public float f31511h0;
    public C3940f f31512i0;
    public C3950k f31513j0;
    public int f31514k0;
    public int f31515l0;
    public int f31516m0;
    public ArrayList<AbstractC4718o<?>> f31517n0;
    public ViewGroup f31518o0;
    public int f31519p0;
    public int f31520q0;
    public AbstractC5123k f31521r0;
    public AbstractC9704j f31522s0;

    public class C9695a extends GridLayoutManager.AbstractC0873b {
        public C9695a() {
        }

        @Override
        public int mo7528f(int i) {
            if (i == 0 || View$OnClickListenerC9694y.this.f31517n0 == null || !AbstractC4718o.m26359B(((AbstractC4718o) View$OnClickListenerC9694y.this.f31517n0.get(i - 1)).m26331v())) {
                return View$OnClickListenerC9694y.this.f31514k0;
            }
            return 1;
        }
    }

    public class C9696b extends NewFlowLayoutManager {
        public final NewFlowLayoutManager.C7927a f31524W = new NewFlowLayoutManager.C7927a();

        public C9696b(Context context, int i) {
            super(context, i);
        }

        @Override
        public NewFlowLayoutManager.C7927a mo7529l3(int i) {
            AbstractC4718o oVar = (View$OnClickListenerC9694y.this.f31498R != 1 || i == 0 || View$OnClickListenerC9694y.this.f31517n0 == null) ? null : (AbstractC4718o) View$OnClickListenerC9694y.this.f31517n0.get(i - 1);
            if (oVar == null || !AbstractC4718o.m26360A(oVar.m26331v())) {
                NewFlowLayoutManager.C7927a aVar = this.f31524W;
                aVar.f25768b = 100.0f;
                aVar.f25767a = 100.0f;
            } else {
                this.f31524W.f25767a = oVar.mo25048m();
                this.f31524W.f25768b = oVar.mo25049l();
            }
            return this.f31524W;
        }
    }

    public class C9697c extends GridLayoutManager.AbstractC0873b {
        public C9697c() {
        }

        @Override
        public int mo7528f(int i) {
            if (View$OnClickListenerC9694y.this.f31498R != 1 || i <= 0 || View$OnClickListenerC9694y.this.f31517n0 == null || !AbstractC4718o.m26360A(((AbstractC4718o) View$OnClickListenerC9694y.this.f31517n0.get(i - 1)).m26331v())) {
                return 100;
            }
            return View$OnClickListenerC9694y.this.f31496P.m14129m3(i);
        }
    }

    public class C9698d extends RecyclerView {
        public boolean f31527u1;

        public C9698d(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRect(0.0f, View$OnClickListenerC9694y.this.m7548d2(), getMeasuredWidth(), getMeasuredHeight(), C1410y.m37042g(View$OnClickListenerC9694y.this.f31497Q.m7831k0() ? C11524j.m226O(R.id.theme_color_filling, 2) : C11524j.m148w()));
            super.draw(canvas);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            View$OnClickListenerC9694y.this.m7532x2();
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r5) {
            throw new UnsupportedOperationException("Method not decompiled: p291uc.View$OnClickListenerC9694y.C9698d.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public class C9699e extends RecyclerView.AbstractC0901o {
        public C9699e() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int i = 0;
            if (View$OnClickListenerC9694y.this.f31498R != 1) {
                rect.top = 0;
                rect.right = 0;
                rect.left = 0;
                rect.bottom = 0;
                return;
            }
            int k0 = recyclerView.m39424k0(view);
            rect.right = (k0 == -1 || View$OnClickListenerC9694y.this.f31496P.m14127o3(k0)) ? 0 : C1357a0.m37544i(3.0f);
            if (k0 != 0 || View$OnClickListenerC9694y.this.f31517n0 == null || View$OnClickListenerC9694y.this.f31517n0.isEmpty() || ((AbstractC4718o) View$OnClickListenerC9694y.this.f31517n0.get(0)).m26331v() != 15) {
                i = C1357a0.m37544i(3.0f);
            }
            rect.bottom = i;
        }
    }

    public class C9700f extends RecyclerView.AbstractC0910t {
        public C9700f() {
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            View$OnClickListenerC9694y.this.m7549b2();
            if (View$OnClickListenerC9694y.this.f31501U != null) {
                View$OnClickListenerC9694y.this.f31501U.invalidate();
            }
        }
    }

    public class C9701g extends AbstractC5123k {
        public final AbstractC9323v4 f31532b;
        public final C4729p f31533c;

        public C9701g(AbstractC9323v4 v4Var, C4729p pVar) {
            this.f31532b = v4Var;
            this.f31533c = pVar;
        }

        public void m7525e(AbstractC9323v4 v4Var, long j, C4729p pVar) {
            if (!m23882b()) {
                View$OnClickListenerC9694y.this.setItems(null);
                View$OnClickListenerC9694y.this.f31504a0.mo4348c().m2485dd().m3569h7(v4Var, j, new HandlerC10770jj.C10780j().m3368h().m3358r(new C4822w2(View$OnClickListenerC9694y.this.f31504a0.mo4348c().m2494d4(j), pVar.m26341h(), false)));
            }
        }

        @Override
        public void mo7438c(TdApi.Object object) {
            final long P0 = C4779t2.m25626P0(object);
            if (P0 != 0) {
                final AbstractC9323v4 v4Var = this.f31532b;
                final C4729p pVar = this.f31533c;
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC9694y.C9701g.this.m7525e(v4Var, P0, pVar);
                    }
                });
            } else if (object.getConstructor() == -1679978726) {
                C1379j0.m37305t0(object);
            }
        }
    }

    public interface AbstractC9702h {
        void mo7524a();
    }

    public interface AbstractC9703i {
        int mo7523R6(View$OnClickListenerC9694y yVar);

        int mo7522r4(View$OnClickListenerC9694y yVar);
    }

    public interface AbstractC9704j {
        void mo7521b(C4828x xVar, String str);

        void mo7520e(C4809v vVar);

        void mo7519n(AbstractC4718o<?> oVar);

        void mo7518p(C4776t tVar);

        void mo7517t(C4747r rVar, boolean z);
    }

    public View$OnClickListenerC9694y(Context context) {
        super(context);
        C11537v vVar = new C11537v();
        this.f31502V = vVar;
        int Z1 = m7551Z1(C1357a0.m37546g(), C1357a0.m37547f());
        this.f31514k0 = Z1;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, Z1);
        this.f31495O = gridLayoutManager;
        gridLayoutManager.m39588e3(new C9695a());
        C9696b bVar = new C9696b(context, 100);
        this.f31496P = bVar;
        bVar.m39588e3(new C9697c());
        C9661u uVar = new C9661u(context, this, vVar);
        this.f31497Q = uVar;
        C9698d dVar = new C9698d(context);
        this.f31493M = dVar;
        dVar.m39437g(new C9699e());
        this.f31493M.m39425k(new C9700f());
        this.f31493M.setOverScrollMode(2);
        this.f31493M.setItemAnimator(null);
        this.f31493M.setLayoutManager(this.f31496P);
        this.f31493M.setAdapter(uVar);
        this.f31493M.setAlpha(0.0f);
        this.f31493M.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        addView(this.f31493M);
        vVar.m74f(this.f31493M);
        C6879f3 f3Var = new C6879f3(context);
        this.f31494N = f3Var;
        f3Var.setAlpha(0.0f);
        this.f31494N.setSimpleTopShadow(true);
        this.f31494N.setLayoutParams(new FrameLayout.LayoutParams(-1, this.f31494N.getLayoutParams().height, 80));
        addView(this.f31494N);
        vVar.m74f(this.f31494N);
        C11052v1.m1768b().m1769a(this);
    }

    public static int m7551Z1(int i, int i2) {
        int min = Math.min(i, i2) / 4;
        if (min != 0) {
            return i / min;
        }
        return 5;
    }

    private int getBackgroundColor() {
        float f = this.f31499S;
        if (f == 0.0f) {
            return 0;
        }
        float f2 = this.f31511h0;
        if (f2 == 0.0f) {
            return 0;
        }
        return C5064d.m24131b((int) (f * 153.0f * f2), 0);
    }

    private float getVisibleFactor() {
        return this.f31508e0 * (1.0f - this.f31510g0);
    }

    public boolean m7543k2(AbstractC4718o oVar, View view, int i) {
        if (i == R.id.btn_delete) {
            m7538p2(oVar);
            this.f31504a0.mo4348c().m2270r4().m14783o(new TdApi.RemoveRecentHashtag(((C4809v) oVar).m26341h().substring(1)), this.f31504a0.mo4348c().m2392ja());
        }
        return true;
    }

    public boolean m7541l2(AbstractC4718o oVar, AbstractC9323v4 v4Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        m7538p2(oVar);
        if (v4Var instanceof View$OnClickListenerC2971rh) {
            ((View$OnClickListenerC2971rh) v4Var).m32552Uo(((C4828x) oVar).m25123d0());
        }
        this.f31504a0.mo4348c().m2270r4().m14783o(new TdApi.RemoveTopChat(new TdApi.TopChatCategoryInlineBots(), C7316a.m17058c(((C4828x) oVar).m25123d0())), this.f31504a0.mo4348c().m2392ja());
        return true;
    }

    public boolean m7540m2(AbstractC4718o oVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (C5070i.m24062i(str)) {
            return false;
        }
        AbstractC9704j f2 = m7546f2();
        if (f2 == null) {
            return true;
        }
        f2.mo7521b((C4828x) oVar, str);
        return true;
    }

    private void setBackgroundFactor(float f) {
        if (this.f31499S != f) {
            this.f31499S = f;
            if (Build.VERSION.SDK_INT >= 21) {
                C1379j0.m37319m0(C5064d.m24130c(View$OnClickListenerC9170d1.m10021y2(), getBackgroundColor()));
            }
            View view = this.f31501U;
            if (view != null) {
                view.invalidate();
            }
            m7530z2();
        }
    }

    private void setBottomMargin(int i) {
        if (this.f31520q0 != i) {
            this.f31520q0 = i;
            setTranslationY(-i);
        }
        View view = this.f31501U;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setItems(java.util.ArrayList<gd.AbstractC4718o<?>> r7) {
        throw new UnsupportedOperationException("Method not decompiled: p291uc.View$OnClickListenerC9694y.setItems(java.util.ArrayList):void");
    }

    private void setItemsVisible(boolean z) {
        if (this.f31505b0 != z) {
            this.f31505b0 = z;
            if (z) {
                m7575B2(true);
            }
            if (this.f31493M.getMeasuredHeight() == 0) {
                this.f31507d0 = true;
            } else {
                m7553X1(z ? 1.0f : 0.0f, false);
            }
        }
    }

    private void setLayoutManagerMode(int i) {
        if (i != this.f31498R) {
            this.f31498R = i;
            this.f31493M.setLayoutManager(i == 2 ? this.f31495O : this.f31496P);
            this.f31493M.m39507A0();
        }
    }

    public final void m7578A2() {
        if (this.f31497Q.mo6153D() > 0) {
            this.f31497Q.m39315I(0);
        }
    }

    @Override
    public void mo7577A4(C2099j jVar, C2104l lVar) {
    }

    @Override
    public void mo7576B1(C2099j jVar, C2104l lVar, boolean z) {
        ArrayList<AbstractC4718o<?>> arrayList = this.f31517n0;
        if (arrayList != null) {
            int i = 0;
            Iterator<AbstractC4718o<?>> it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC4718o<?> next = it.next();
                if (next.m26331v() != 11 || !((C4575a0) next).m27300Z().equals(lVar)) {
                    i++;
                } else {
                    View C = this.f31495O.mo39265C(i + 1);
                    if (C instanceof C2099j) {
                        ((C2099j) C).setStickerPressed(z);
                        return;
                    } else {
                        this.f31497Q.m39315I(i);
                        return;
                    }
                }
            }
        }
    }

    public void m7575B2(boolean z) {
        AbstractC9703i iVar = this.f31500T;
        if (iVar != null) {
            setBottomMargin(iVar.mo7523R6(this));
            return;
        }
        AbstractC9323v4<?> t = C1379j0.m37306t(getContext());
        float f = 0.0f;
        boolean z2 = t instanceof View$OnClickListenerC2971rh;
        if (z2) {
            View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) t;
            setBottomMargin(rhVar.m32335lk(false));
            f = 0.0f - rhVar.m32230tk();
        }
        C9270q1 P1 = C1379j0.m37310r(getContext()).m14551P1();
        if (z && P1 != null && P1.m9741S()) {
            f = P1.m9754J();
            if (z2) {
            }
        }
        setTranslationX(f);
    }

    public final void m7573C2() {
        float d = C5069h.m24090d(this.f31511h0);
        this.f31493M.setTranslationY(this.f31506c0 * (1.0f - this.f31511h0));
        this.f31494N.setAlpha(d);
        int i = d == 0.0f ? 4 : 0;
        if (this.f31493M.getVisibility() != i) {
            this.f31493M.setVisibility(i);
        }
    }

    @Override
    public void mo7568H1(C2099j jVar, C2104l lVar) {
    }

    @Override
    public int mo7565L() {
        AbstractC9703i iVar = this.f31500T;
        return Math.max(0, (iVar != null ? iVar.mo7522r4(this) : ((AbstractView$OnTouchListenerC7889a) getContext()).m14572K0().getMeasuredHeight()) - Math.min(m7539n2(), C1357a0.m37557A() / 2));
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            this.f31508e0 = f;
            this.f31511h0 = getVisibleFactor();
            m7573C2();
            m7530z2();
        } else if (i == 1) {
            setBackgroundFactor(f);
        } else if (i == 3) {
            this.f31510g0 = f;
            this.f31511h0 = getVisibleFactor();
            m7573C2();
            m7530z2();
        }
    }

    @Override
    public void mo7556U6(C2099j jVar, C2104l lVar) {
    }

    public final void m7555V1(AbstractC10664f9 f9Var, ArrayList<AbstractC4718o<?>> arrayList) {
        if (this.f31504a0 == f9Var && this.f31517n0 != null && arrayList != null && !arrayList.isEmpty()) {
            this.f31517n0.addAll(arrayList);
            this.f31497Q.m7840a0(arrayList);
            this.f31493M.m39507A0();
        }
    }

    public void m7554W1(AbstractC10664f9 f9Var, ArrayList<AbstractC4718o<?>> arrayList, AbstractC9702h hVar) {
        if (arrayList != null && !arrayList.isEmpty()) {
            m7555V1(f9Var, arrayList);
        }
    }

    public final void m7553X1(float f, boolean z) {
        m7550a2();
        m7573C2();
        this.f31493M.setAlpha(1.0f);
        if (this.f31509f0 == null) {
            this.f31509f0 = new C3950k(0, this, C2057b.f7280b, 190L, this.f31511h0);
        }
        this.f31509f0.m29546i(f);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 0.0f) {
            setItems(null);
        }
    }

    public boolean m7552Y1() {
        return this.f31505b0;
    }

    @Override
    public AbstractC9323v4<?> mo6637Z3(View$OnClickListenerC6902i iVar, float f, float f2) {
        e20.C2320a aVar;
        Object tag = iVar.getTag();
        if (!(tag instanceof AbstractC4718o)) {
            return null;
        }
        AbstractC4718o oVar = (AbstractC4718o) tag;
        int v = oVar.m26331v();
        if (v == 6) {
            C4801u uVar = (C4801u) oVar;
            aVar = new e20.C2320a(uVar.m26341h().animation, uVar.m25225Z().m26839d());
        } else if (v != 10) {
            aVar = null;
        } else {
            C4847z zVar = (C4847z) oVar;
            aVar = new e20.C2320a(zVar.m26341h().photo, zVar.m25050b0() != null ? zVar.m25050b0() : zVar.m25051a0(), zVar.m25052Z());
        }
        if (aVar == null) {
            return null;
        }
        e20 e20Var = new e20(getContext(), oVar.m26346V());
        e20Var.m9476Ad(aVar);
        return e20Var;
    }

    public final void m7550a2() {
        this.f31506c0 = Math.min(this.f31493M.getMeasuredHeight(), m7539n2() + C1357a0.m37544i(7.0f));
    }

    public final void m7549b2() {
        if (this.f31511h0 == 1.0f && ((LinearLayoutManager) this.f31493M.getLayoutManager()).m39549a2() + 4 >= this.f31497Q.mo6153D()) {
            m7537r2();
        }
    }

    @Override
    public boolean mo6636d(View$OnClickListenerC6902i iVar, float f, float f2, AbstractC9323v4<?> v4Var) {
        return false;
    }

    public final int m7548d2() {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f31493M.getLayoutManager();
        if (linearLayoutManager.m39552X1() != 0 || (C = linearLayoutManager.mo39265C(0)) == null) {
            return 0;
        }
        return C.getMeasuredHeight() + C.getTop();
    }

    @Override
    public boolean mo7547e1(C2099j jVar, int i, int i2) {
        return true;
    }

    @Override
    public boolean mo6635e2(View$OnClickListenerC6902i iVar, float f, float f2) {
        Object tag = iVar.getTag();
        if (!(tag instanceof AbstractC4718o)) {
            return false;
        }
        int v = ((AbstractC4718o) tag).m26331v();
        return v == 6 || v == 10;
    }

    public final AbstractC9704j m7546f2() {
        AbstractC9704j jVar = this.f31522s0;
        if (jVar != null) {
            return jVar;
        }
        AbstractC9323v4<?> t = C1379j0.m37306t(getContext());
        if (t instanceof View$OnClickListenerC2971rh) {
            return ((View$OnClickListenerC2971rh) t).m32348kk();
        }
        return null;
    }

    @Override
    public void mo452g2() {
        RecyclerView.AbstractC0902p layoutManager;
        RecyclerView recyclerView = this.f31493M;
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f31493M.getLayoutManager();
            int X1 = linearLayoutManager.m39552X1();
            int a2 = linearLayoutManager.m39549a2();
            if (!(X1 == -1 || a2 == -1)) {
                for (int max = Math.max(1, X1); max <= a2; max++) {
                    View C = layoutManager.mo39265C(max);
                    if (C != null) {
                        C.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public long getStickerOutputChatId() {
        View$OnClickListenerC2971rh h2 = m7545h2();
        if (h2 != null) {
            return h2.mo9464C9();
        }
        return 0L;
    }

    @Override
    public int getStickersListTop() {
        return (int) getTranslationY();
    }

    public AbstractC10664f9 getTdlibDelegate() {
        return this.f31504a0;
    }

    public C11537v getThemeProvider() {
        return this.f31502V;
    }

    @Override
    public int getViewportHeight() {
        View$OnClickListenerC2971rh h2 = m7545h2();
        if (h2 != null) {
            return h2.mo7583d2();
        }
        return getMeasuredHeight();
    }

    public final View$OnClickListenerC2971rh m7545h2() {
        AbstractC9323v4<?> t = C1379j0.m37306t(getContext());
        if (t instanceof View$OnClickListenerC2971rh) {
            return (View$OnClickListenerC2971rh) t;
        }
        return null;
    }

    public boolean m7544i2() {
        return this.f31505b0;
    }

    @Override
    public boolean mo7542k4(C2099j jVar, View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        Object tag = jVar.getTag();
        if (!(tag instanceof AbstractC4718o)) {
            return false;
        }
        AbstractC4718o oVar = (AbstractC4718o) tag;
        View$OnClickListenerC2971rh h2 = m7545h2();
        if (h2 == null) {
            return false;
        }
        h2.m32147zp(oVar.m26335r(), oVar.m26337p(), true, true, z2, messageSchedulingState);
        return false;
    }

    public final int m7539n2() {
        int k3;
        int i;
        ArrayList<AbstractC4718o<?>> arrayList = this.f31517n0;
        int i2 = 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i3 = this.f31498R;
            if (i3 != 0) {
                if (i3 == 1) {
                    Iterator<AbstractC4718o<?>> it = this.f31517n0.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        AbstractC4718o<?> next = it.next();
                        if (AbstractC4718o.m26360A(next.m26331v())) {
                            break;
                        }
                        i2 += next.m26338o();
                        i4++;
                    }
                    k3 = this.f31496P.m14130k3(C1357a0.m37546g()) - i4;
                    i = C1357a0.m37544i(118.0f);
                } else if (i3 != 2) {
                    return 0;
                } else {
                    Iterator<AbstractC4718o<?>> it2 = this.f31517n0.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        AbstractC4718o<?> next2 = it2.next();
                        if (AbstractC4718o.m26359B(next2.m26331v())) {
                            break;
                        }
                        i2 += next2.m26338o();
                        i5++;
                    }
                    k3 = (int) Math.ceil((this.f31517n0.size() - i5) / this.f31514k0);
                    i = C1357a0.m37546g() / this.f31514k0;
                }
                return i2 + (k3 * i);
            }
            Iterator<AbstractC4718o<?>> it3 = this.f31517n0.iterator();
            while (it3.hasNext()) {
                i2 += it3.next().m26338o();
            }
        }
        return i2;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void onClick(View view) {
        Object tag;
        int id2 = view.getId();
        if (id2 == R.id.btn_switchPmButton) {
            m7531y2((C4729p) view.getTag());
        } else if (id2 == R.id.result && (tag = view.getTag()) != null && (tag instanceof AbstractC4718o)) {
            AbstractC4718o<?> oVar = (AbstractC4718o) tag;
            AbstractC9704j f2 = m7546f2();
            if (f2 != null) {
                switch (oVar.m26331v()) {
                    case 12:
                        C4828x xVar = (C4828x) oVar;
                        f2.mo7521b(xVar, xVar.m25121f0() ? xVar.m25125b0(true) : null);
                        return;
                    case 13:
                        f2.mo7520e((C4809v) oVar);
                        return;
                    case 14:
                        f2.mo7517t((C4747r) oVar, false);
                        return;
                    case 15:
                    default:
                        f2.mo7519n(oVar);
                        return;
                    case 16:
                        f2.mo7518p((C4776t) oVar);
                        return;
                }
            }
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), C1410y.m37042g(getBackgroundColor()));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return getVisibility() != 0 || getAlpha() == 0.0f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onLongClick(View view) {
        final AbstractC4718o oVar = (AbstractC4718o) view.getTag();
        final AbstractC9323v4<?> F = C1379j0.m37310r(getContext()).m14551P1().m9762F();
        if (!(oVar == null || F == null)) {
            if (oVar instanceof C4747r) {
                if (!(F instanceof View$OnClickListenerC2971rh)) {
                    return false;
                }
                View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) F;
                return rhVar.m32674Li() && rhVar.m32278po((C4747r) oVar);
            } else if (oVar instanceof C4809v) {
                F.m9261ee(C4403w.m27871i1(R.string.HashtagDeleteHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27952P0(), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean k2;
                        k2 = View$OnClickListenerC9694y.this.m7543k2(oVar, view2, i);
                        return k2;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23936a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23935b(this, i);
                    }
                });
                return true;
            } else {
                boolean z = oVar instanceof C4828x;
                if (z && ((C4828x) oVar).m25122e0()) {
                    F.m9261ee(C4403w.m27871i1(R.string.BotDeleteHint), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27952P0(), C4403w.m27871i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean l2;
                            l2 = View$OnClickListenerC9694y.this.m7541l2(oVar, F, view2, i);
                            return l2;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23936a(this);
                        }

                        @Override
                        public Object mo491b2(int i) {
                            return C5115g0.m23935b(this, i);
                        }
                    });
                    return true;
                } else if (!z || m7546f2() == null) {
                    return false;
                } else {
                    F.m9364Pc(C4403w.m27871i1(R.string.Mention), C4403w.m27871i1(R.string.MentionPlaceholder), R.string.MentionAdd, R.string.Cancel, ((C4828x) oVar).m25125b0(true), new AbstractC9323v4.AbstractC9336m() {
                        @Override
                        public final boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str) {
                            boolean m2;
                            m2 = View$OnClickListenerC9694y.this.m7540m2(oVar, y1Var, str);
                            return m2;
                        }
                    }, false);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f31519p0 != getMeasuredHeight()) {
            this.f31519p0 = getMeasuredHeight();
            m7575B2(true);
            m7578A2();
        }
        m7535u2(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void m7538p2(AbstractC4718o<?> oVar) {
        int indexOf;
        ArrayList<AbstractC4718o<?>> arrayList = this.f31517n0;
        if (arrayList != null && (indexOf = arrayList.indexOf(oVar)) != -1) {
            if (this.f31517n0.size() == 1) {
                setItemsVisible(false);
            } else {
                this.f31517n0.remove(indexOf);
                this.f31497Q.m7835g0(indexOf);
            }
            m7578A2();
            this.f31493M.m39507A0();
        }
    }

    public final void m7537r2() {
        AbstractC9702h hVar = this.f31503W;
        if (hVar != null) {
            hVar.mo7524a();
        }
    }

    public void setHidden(boolean z) {
        if (this.f31512i0 == null) {
            if (z) {
                this.f31512i0 = new C3940f(3, this, C2057b.f7280b, 180L);
            } else {
                return;
            }
        }
        m7550a2();
        this.f31512i0.m29577p(z, this.f31508e0 > 0.0f);
    }

    public void setListener(AbstractC9704j jVar) {
        this.f31522s0 = jVar;
    }

    public void setOffsetProvider(AbstractC9703i iVar) {
        this.f31500T = iVar;
    }

    public void setUseDarkMode(boolean z) {
        this.f31497Q.m7832j0(z);
    }

    public final void m7536t2(float f, boolean z) {
        C3950k kVar = this.f31513j0;
        if (kVar != null) {
            kVar.m29543l(f);
        }
        setBackgroundFactor(f);
    }

    public final void m7535u2(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (this.f31515l0 != i || this.f31516m0 != i2) {
                this.f31515l0 = i;
                this.f31516m0 = i2;
                int Z1 = m7551Z1(i, i2);
                if (Z1 != this.f31514k0) {
                    this.f31514k0 = Z1;
                    this.f31495O.m39589d3(Z1);
                }
            }
        }
    }

    @Override
    public boolean mo7534v0(C2099j jVar) {
        return true;
    }

    public void m7533v2(AbstractC10664f9 f9Var, ArrayList<AbstractC4718o<?>> arrayList, boolean z, AbstractC9702h hVar, boolean z2) {
        this.f31504a0 = f9Var;
        this.f31497Q.m7833i0(f9Var.mo4348c());
        boolean z3 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            this.f31503W = null;
        } else {
            m7536t2(z ? 1.0f : 0.0f, this.f31511h0 != 0.0f);
            setItems(arrayList);
            this.f31503W = hVar;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z3 = false;
        }
        setItemsVisible(z3);
        setHidden(z2);
    }

    public final void m7532x2() {
        if (this.f31507d0) {
            this.f31507d0 = false;
            m7553X1(this.f31505b0 ? 1.0f : 0.0f, true);
        }
    }

    public final void m7531y2(C4729p pVar) {
        AbstractC5123k kVar = this.f31521r0;
        if (kVar != null) {
            kVar.m23883a();
            this.f31521r0 = null;
        }
        AbstractC9323v4<?> s = C1379j0.m37308s();
        long j = 0;
        if (s instanceof View$OnClickListenerC2971rh) {
            View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) s;
            if (rhVar.m32791Cj(pVar.m26312b0())) {
                rhVar.m32174xo(pVar);
                return;
            }
            j = s.mo9464C9();
        }
        pVar.m26311c0(j);
        this.f31521r0 = new C9701g(s, pVar);
        this.f31504a0.mo4348c().m2270r4().m14783o(new TdApi.CreatePrivateChat(pVar.m26312b0(), false), this.f31521r0);
    }

    public final void m7530z2() {
        setWillNotDraw(this.f31499S * this.f31511h0 == 0.0f);
        View view = this.f31501U;
        if (view != null) {
            view.invalidate();
        }
        invalidate();
    }
}
