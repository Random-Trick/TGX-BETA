package p038ce;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1410y;
import cd.C2099j;
import cd.C2104l;
import gd.C4779t2;
import ge.C4896n;
import java.util.ArrayList;
import java.util.Iterator;
import me.C6977n2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.RtlGridLayoutManager;
import p037cb.C2057b;
import p067ed.C4183a;
import p110hd.C5078d;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7321e;
import p350yd.AbstractC10986s1;
import p350yd.C10930q6;
import p350yd.C10965r1;
import p364zd.C11510b;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class y20 extends AbstractC9323v4<AbstractC3334g> implements AbstractC9201h1, C2099j.AbstractC2102c, Client.AbstractC7865g, AbstractC9213j1, AbstractC10986s1 {
    public TdApi.StickerSetInfo f11066n0;
    public AbstractC3330e f11067o0;
    public RecyclerView f11068p0;
    public C3335h f11069q0;
    public int f11070r0;
    public int f11071s0;
    public int f11072t0;
    public GridLayoutManager f11073u0;
    public int f11074v0;
    public boolean f11075w0;
    public AbstractRunnableC5910b f11076x0;
    public ArrayList<C2104l> f11077y0;

    public class C3326a extends FrameLayoutFix {
        public C3326a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            y20.this.m30828kf(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    public class C3327b extends RecyclerView {
        public C3327b(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRect(0.0f, y20.this.f11067o0.mo30824K() - y20.this.f11074v0, getMeasuredWidth(), getMeasuredHeight(), C1410y.m37042g(C11524j.m148w()));
            super.draw(canvas);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return super.onTouchEvent(motionEvent);
            }
            return motionEvent.getY() + ((float) C4896n.m24479e()) >= ((float) (y20.this.f11067o0.mo30824K() - y20.this.f11074v0)) && super.onTouchEvent(motionEvent);
        }
    }

    public class C3328c extends RecyclerView.AbstractC0910t {
        public C3328c() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                y20.this.f11067o0.mo30823e0();
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            int X1 = y20.this.f11073u0.m39552X1();
            View C = y20.this.f11073u0.mo39265C(X1);
            if (C != null) {
                View C2 = X1 == 1 ? C : y20.this.f11073u0.mo39265C(1);
                float f = 0.0f;
                if (C2 == null) {
                    f = 1.0f;
                } else if (C2.getTop() < 0) {
                    f = Math.max(0.0f, Math.min(1.0f, (-C2.getTop()) / C1357a0.m37544i(8.0f)));
                }
                y20.this.f11073u0.mo39265C(1);
                y20 y20Var = y20.this;
                y20Var.f11074v0 = X1 > 0 ? y20Var.f11067o0.mo30824K() : -C.getTop();
                y20.this.f11067o0.mo30825A(f);
            }
        }
    }

    public class C3329d extends GridLayoutManager.AbstractC0873b {
        public C3329d() {
        }

        @Override
        public int mo7528f(int i) {
            if (i == 0 || (i == 1 && y20.this.f11069q0.mo6150F(1) == 2)) {
                return y20.this.f11070r0;
            }
            return 1;
        }
    }

    public interface AbstractC3330e {
        void mo30825A(float f);

        int mo30824K();

        void mo30823e0();

        int mo30822m();
    }

    public static class C3331f extends RecyclerView.AbstractC0886d0 {

        public class C3332a extends View {
            public final AbstractC3330e f11082a;

            public C3332a(Context context, AbstractC3330e eVar) {
                super(context);
                this.f11082a = eVar;
            }

            @Override
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(this.f11082a.mo30824K(), Log.TAG_TDLIB_OPTIONS));
            }
        }

        public class C3333b extends FrameLayoutFix {
            public final AbstractC3330e f11083M;

            public C3333b(Context context, AbstractC3330e eVar) {
                super(context);
                this.f11083M = eVar;
            }

            @Override
            public void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.f11083M.mo30822m(), Log.TAG_TDLIB_OPTIONS));
            }
        }

        public C3331f(View view) {
            super(view);
        }

        public static C3331f m30821O(Context context, C10930q6 q6Var, int i, C2099j.AbstractC2102c cVar, AbstractC3330e eVar) {
            if (i == 0) {
                return new C3331f(new C3332a(context, eVar));
            }
            if (i == 1) {
                C2099j jVar = new C2099j(context);
                jVar.m35605j(q6Var);
                jVar.setStickerMovementCallback(cVar);
                jVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return new C3331f(jVar);
            } else if (i == 2) {
                C3333b bVar = new C3333b(context, eVar);
                C6977n2 n2Var = new C6977n2(context);
                n2Var.m18228e(1.0f);
                n2Var.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 17));
                bVar.addView(n2Var);
                return new C3331f(bVar);
            } else {
                throw new IllegalArgumentException("viewType == " + i);
            }
        }
    }

    public interface AbstractC3334g {
        boolean mo30820B0();

        boolean mo30819G();

        boolean mo30818J0(View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState);

        void mo30817M0();

        long getStickerOutputChatId();

        void mo30816q();

        boolean mo30815y();
    }

    public static class C3335h extends RecyclerView.AbstractC0890h<C3331f> {
        public final AbstractC9323v4<?> f11084M;
        public final C2099j.AbstractC2102c f11085N;
        public final ArrayList<C2104l> f11086O = new ArrayList<>();
        public final AbstractC3330e f11087P;
        public final RecyclerView f11088Q;
        public boolean f11089R;

        public C3335h(AbstractC9323v4<?> v4Var, RecyclerView recyclerView, C2099j.AbstractC2102c cVar, AbstractC3330e eVar) {
            this.f11084M = v4Var;
            this.f11088Q = recyclerView;
            this.f11085N = cVar;
            this.f11087P = eVar;
        }

        @Override
        public int mo6153D() {
            return this.f11086O.isEmpty() ? this.f11089R ? 1 : 2 : 1 + this.f11086O.size();
        }

        @Override
        public int mo6150F(int i) {
            return this.f11086O.isEmpty() ? i == 1 ? 2 : 0 : i == 0 ? 0 : 1;
        }

        public void mo6146Q(C3331f fVar, int i) {
            if (fVar.m39335n() == 1) {
                ((C2099j) fVar.f3479a).setSticker(this.f11086O.get(i - 1));
            }
        }

        public C3331f mo6145S(ViewGroup viewGroup, int i) {
            return C3331f.m30821O(this.f11084M.mo4347s(), this.f11084M.mo4348c(), i, this.f11085N, this.f11087P);
        }

        public void mo6144V(C3331f fVar) {
            int n = fVar.m39335n();
            if (n == 1) {
                ((C2099j) fVar.f3479a).m35611d();
            } else if (n == 2) {
                ((C6977n2) ((ViewGroup) fVar.f3479a).getChildAt(0)).mo8225f();
            }
        }

        public void mo6143W(C3331f fVar) {
            int n = fVar.m39335n();
            if (n == 1) {
                ((C2099j) fVar.f3479a).m35606i();
            } else if (n == 2) {
                ((C6977n2) ((ViewGroup) fVar.f3479a).getChildAt(0)).mo8229b();
            }
        }

        public void mo6142X(C3331f fVar) {
            int n = fVar.m39335n();
            if (n == 1) {
                ((C2099j) fVar.f3479a).mo4501a3();
            } else if (n == 2) {
                ((C6977n2) ((ViewGroup) fVar.f3479a).getChildAt(0)).mo4501a3();
            }
        }

        public void m30808h0(ArrayList<C2104l> arrayList) {
            this.f11089R = true;
            m39309O(1);
            this.f11086O.addAll(arrayList);
            m39311M(1, arrayList.size());
        }
    }

    public y20(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public static int m30838af(int i, int i2) {
        int min = Math.min(i, i2) / 4;
        if (min != 0) {
            return i / min;
        }
        return 4;
    }

    public static int m30837bf() {
        return C1357a0.m37546g() / m30838af(C1357a0.m37546g(), C1357a0.m37547f());
    }

    public void m30834ef() {
        if (!m9347Sa()) {
            m30839Ze();
        }
    }

    public void m30833ff(TdApi.Object object) {
        if (!m9347Sa()) {
            C1379j0.m37293z0(C4779t2.m25379z5(object), 0);
        }
    }

    public void m30832gf(TdApi.StickerSet stickerSet) {
        if (!m9347Sa() && this.f11066n0.f25427id == stickerSet.f25426id) {
            m30826mf(stickerSet.stickers, stickerSet.stickerType, stickerSet.emojis);
            m30839Ze();
        }
    }

    @Override
    public void mo7577A4(C2099j jVar, C2104l lVar) {
    }

    @Override
    public int mo408A9() {
        return 4;
    }

    @Override
    public void mo7576B1(C2099j jVar, C2104l lVar, boolean z) {
        int df = m30835df(lVar);
        if (df != -1) {
            View C = this.f11073u0.mo39265C(df);
            if (C == null || !(C instanceof C2099j)) {
                this.f11069q0.m39315I(df);
            } else {
                ((C2099j) C).setStickerPressed(z);
            }
        }
    }

    @Override
    public void mo7568H1(C2099j jVar, C2104l lVar) {
    }

    @Override
    public void mo2038H4(int[] iArr, boolean z) {
        C10965r1.m2049c(this, iArr, z);
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        RecyclerView recyclerView = this.f11068p0;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    @Override
    public boolean mo9416Ie() {
        return false;
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more && this.f11066n0 != null) {
            C5320c cVar = new C5320c(4);
            C5146u0 u0Var = new C5146u0(4);
            C5320c cVar2 = new C5320c(4);
            cVar.m23285a(R.id.btn_share);
            u0Var.m23817a(R.string.Share);
            cVar2.m23285a(R.drawable.baseline_forward_24);
            cVar.m23285a(R.id.btn_copyLink);
            u0Var.m23817a(R.string.CopyLink);
            cVar2.m23285a(R.drawable.baseline_link_24);
            if (m9139w9() != null) {
                if (m9139w9().mo30819G()) {
                    cVar.m23285a(R.id.btn_archive);
                    u0Var.m23817a(R.string.StickersHide);
                    cVar2.m23285a(R.drawable.baseline_archive_24);
                }
                if (m9139w9().mo30820B0()) {
                    cVar.m23285a(R.id.btn_delete);
                    u0Var.m23817a(R.string.DeleteArchivedPack);
                    cVar2.m23285a(R.drawable.baseline_delete_24);
                }
            }
            m9282be(cVar.m23281e(), u0Var.m23814d(), cVar2.m23281e(), 0, true);
        }
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public void mo9391M8(View$OnClickListenerC9170d1 d1Var) {
        super.mo9391M8(d1Var);
        this.f11075w0 = true;
    }

    @Override
    public void mo8864N0(int i) {
        switch (i) {
            case R.id.btn_archive:
                if (m9139w9() != null) {
                    m9139w9().mo30816q();
                    return;
                }
                return;
            case R.id.btn_copyLink:
                C1379j0.m37328i(C4779t2.m25529e2(this.f11066n0.name), R.string.CopiedLink);
                return;
            case R.id.btn_delete:
                if (m9139w9() != null) {
                    m9139w9().mo30817M0();
                    return;
                }
                return;
            case R.id.btn_share:
                this.f30170b.m2485dd().m3568h8(this, this.f11066n0);
                return;
            default:
                return;
        }
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_stickerSet;
    }

    @Override
    public void mo2037U3(TdApi.StickerSets stickerSets, int i) {
        C10965r1.m2044h(this, stickerSets, i);
    }

    @Override
    public void mo7556U6(C2099j jVar, C2104l lVar) {
    }

    @Override
    public boolean mo136W0() {
        return this.f11075w0 || super.mo136W0();
    }

    @Override
    public int mo418W9() {
        return R.id.menu_more;
    }

    @Override
    public CharSequence mo9313X9() {
        TdApi.StickerSetInfo stickerSetInfo = this.f11066n0;
        if (stickerSetInfo == null) {
            return null;
        }
        return C5078d.m23987z().m24025I(C4779t2.m25398x0(this, this.f11066n0.title, C7321e.m17014C0(stickerSetInfo.title), null, null));
    }

    @Override
    public void mo2036Z(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2048d(this, stickerSetInfo);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C1399s0.m37165q(this.f11068p0);
        this.f30170b.m2781K9().m1786y0(this);
    }

    public final void m30839Ze() {
        AbstractRunnableC5910b bVar = this.f11076x0;
        if (bVar != null) {
            bVar.m21858c();
            this.f11076x0 = null;
        }
        this.f11069q0.m30808h0(this.f11077y0);
    }

    public int m30836cf() {
        return this.f11074v0;
    }

    @Override
    public void mo2035d5(final TdApi.StickerSet stickerSet) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                y20.this.m30832gf(stickerSet);
            }
        });
    }

    public int m30835df(C2104l lVar) {
        Iterator it = this.f11069q0.f11086O.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C2104l) it.next()).equals(lVar)) {
                return i + 1;
            }
            i++;
        }
        return -1;
    }

    @Override
    public boolean mo7547e1(C2099j jVar, int i, int i2) {
        return true;
    }

    @Override
    public void mo2034f6(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2046f(this, stickerSetInfo);
    }

    @Override
    public long getStickerOutputChatId() {
        return m9131x9().getStickerOutputChatId();
    }

    @Override
    public int getStickersListTop() {
        return C4896n.m24479e();
    }

    @Override
    public int getViewportHeight() {
        return -1;
    }

    public void m30831hf(int i) {
        this.f11068p0.mo8024v1(0, i);
    }

    public void m30830if() {
        this.f11068p0.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
    }

    @Override
    public void mo2033j3(int[] iArr) {
        C10965r1.m2051a(this, iArr);
    }

    public void m30829jf(AbstractC3330e eVar) {
        this.f11067o0 = eVar;
    }

    @Override
    public void mo2032k(long[] jArr, boolean z) {
        C10965r1.m2050b(this, jArr, z);
    }

    @Override
    public boolean mo7542k4(C2099j jVar, View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        return m9139w9() != null && m9131x9().mo30818J0(view, lVar, z, z2, messageSchedulingState);
    }

    public final void m30828kf(int i, int i2) {
        if (i != 0 && i2 != 0) {
            if (this.f11071s0 != i || this.f11072t0 != i2) {
                this.f11071s0 = i;
                this.f11072t0 = i2;
                int af = m30838af(i, i2);
                if (af != this.f11070r0) {
                    this.f11070r0 = af;
                    this.f11073u0.m39589d3(af);
                }
            }
        }
    }

    public void m30827lf(TdApi.StickerSetInfo stickerSetInfo) {
        this.f11066n0 = stickerSetInfo;
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        View$OnClickListenerC9170d1 d1Var;
        super.mo134m7(z, bVar);
        if (this.f11075w0 && (d1Var = this.f30159R) != null) {
            d1Var.m10123E3(this, null);
        }
    }

    public void m30826mf(TdApi.Sticker[] stickerArr, TdApi.StickerType stickerType, TdApi.Emojis[] emojisArr) {
        this.f11077y0 = new ArrayList<>(stickerArr.length);
        boolean z = m9139w9() == null || m9139w9().mo30815y();
        int i = 0;
        for (TdApi.Sticker sticker : stickerArr) {
            C2104l lVar = new C2104l(this.f30170b, sticker, stickerType, emojisArr[i].emojis);
            if (!z) {
                lVar.m35588A();
            }
            this.f11077y0.add(lVar);
            i++;
        }
    }

    @Override
    public View mo403oc(Context context) {
        int g = C1357a0.m37546g();
        this.f11071s0 = g;
        int f = C1357a0.m37547f();
        this.f11072t0 = f;
        this.f11070r0 = m30838af(g, f);
        C3326a aVar = new C3326a(context);
        aVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, -1);
        s1.topMargin = C4896n.m24479e();
        s1.bottomMargin = C1357a0.m37544i(56.0f);
        C3327b bVar = new C3327b(context);
        this.f11068p0 = bVar;
        m9163t8(bVar);
        this.f11068p0.setItemAnimator(null);
        this.f11068p0.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        RecyclerView recyclerView = this.f11068p0;
        RtlGridLayoutManager g3 = new RtlGridLayoutManager(context, this.f11070r0).m14123g3(true);
        this.f11073u0 = g3;
        recyclerView.setLayoutManager(g3);
        RecyclerView recyclerView2 = this.f11068p0;
        C3335h hVar = new C3335h(this, recyclerView2, this, this.f11067o0);
        this.f11069q0 = hVar;
        recyclerView2.setAdapter(hVar);
        this.f11068p0.setLayoutParams(s1);
        this.f11068p0.m39425k(new C3328c());
        this.f11073u0.m39588e3(new C3329d());
        aVar.addView(this.f11068p0);
        ArrayList<C2104l> arrayList = this.f11077y0;
        if (arrayList != null) {
            this.f11069q0.m30808h0(arrayList);
        } else if (this.f11066n0 != null) {
            this.f30170b.m2270r4().m14783o(new TdApi.GetStickerSet(this.f11066n0.f25427id), this);
        }
        if (this.f11066n0 != null) {
            this.f30170b.m2781K9().m1838l0(this);
        }
        return aVar;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_more) {
            d1Var.m10068b2(linearLayout, this);
        }
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1816236758) {
            TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
            m30826mf(stickerSet.stickers, stickerSet.stickerType, stickerSet.emojis);
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    y20.this.m30834ef();
                }
            });
        } else if (constructor == -1679978726) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    y20.this.m30833ff(object);
                }
            });
        }
    }

    @Override
    public boolean mo7534v0(C2099j jVar) {
        return true;
    }

    @Override
    public void mo2031y0(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2047e(this, stickerSetInfo);
    }
}
