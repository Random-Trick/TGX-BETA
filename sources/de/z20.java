package de;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.y;
import dd.j;
import dd.l;
import hd.t2;
import he.n;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.n2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.RtlGridLayoutManager;
import ud.d1;
import ud.h1;
import ud.j1;
import ud.v4;
import zd.o6;
import zd.p1;
import zd.q1;

public class z20 extends v4<g> implements h1, j.c, Client.g, j1, q1 {
    public TdApi.StickerSetInfo f10266n0;
    public e f10267o0;
    public RecyclerView f10268p0;
    public h f10269q0;
    public int f10270r0;
    public int f10271s0;
    public int f10272t0;
    public GridLayoutManager f10273u0;
    public int f10274v0;
    public boolean f10275w0;
    public kb.b f10276x0;
    public ArrayList<l> f10277y0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            z20.this.kf(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        }
    }

    public class b extends RecyclerView {
        public b(Context context) {
            super(context);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRect(0.0f, z20.this.f10267o0.K() - z20.this.f10274v0, getMeasuredWidth(), getMeasuredHeight(), y.g(ae.j.u()));
            super.draw(canvas);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return super.onTouchEvent(motionEvent);
            }
            return motionEvent.getY() + ((float) n.e()) >= ((float) (z20.this.f10267o0.K() - z20.this.f10274v0)) && super.onTouchEvent(motionEvent);
        }
    }

    public class c extends RecyclerView.t {
        public c() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                z20.this.f10267o0.g0();
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int X1 = z20.this.f10273u0.X1();
            View C = z20.this.f10273u0.C(X1);
            if (C != null) {
                View C2 = X1 == 1 ? C : z20.this.f10273u0.C(1);
                float f10 = 0.0f;
                if (C2 == null) {
                    f10 = 1.0f;
                } else if (C2.getTop() < 0) {
                    f10 = Math.max(0.0f, Math.min(1.0f, (-C2.getTop()) / a0.i(8.0f)));
                }
                z20.this.f10273u0.C(1);
                z20 z20Var = z20.this;
                z20Var.f10274v0 = X1 > 0 ? z20Var.f10267o0.K() : -C.getTop();
                z20.this.f10267o0.A(f10);
            }
        }
    }

    public class d extends GridLayoutManager.b {
        public d() {
        }

        @Override
        public int f(int i10) {
            if (i10 == 0 || (i10 == 1 && z20.this.f10269q0.F(1) == 2)) {
                return z20.this.f10270r0;
            }
            return 1;
        }
    }

    public interface e {
        void A(float f10);

        int K();

        void g0();

        int n();
    }

    public static class f extends RecyclerView.c0 {

        public class a extends View {
            public final e f10281a;

            public a(Context context, e eVar) {
                super(context);
                this.f10281a = eVar;
            }

            @Override
            public void onMeasure(int i10, int i11) {
                setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.MeasureSpec.makeMeasureSpec(this.f10281a.K(), Log.TAG_TDLIB_OPTIONS));
            }
        }

        public class b extends FrameLayoutFix {
            public final e M;

            public b(Context context, e eVar) {
                super(context);
                this.M = eVar;
            }

            @Override
            public void onMeasure(int i10, int i11) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(this.M.n(), Log.TAG_TDLIB_OPTIONS));
            }
        }

        public f(View view) {
            super(view);
        }

        public static f O(Context context, o6 o6Var, int i10, j.c cVar, e eVar) {
            if (i10 == 0) {
                return new f(new a(context, eVar));
            }
            if (i10 == 1) {
                j jVar = new j(context);
                jVar.j(o6Var);
                jVar.setStickerMovementCallback(cVar);
                jVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
                return new f(jVar);
            } else if (i10 == 2) {
                b bVar = new b(context, eVar);
                n2 n2Var = new n2(context);
                n2Var.f(1.0f);
                n2Var.setLayoutParams(FrameLayoutFix.r1(-2, -2, 17));
                bVar.addView(n2Var);
                return new f(bVar);
            } else {
                throw new IllegalArgumentException("viewType == " + i10);
            }
        }
    }

    public interface g {
        boolean C0();

        boolean F();

        void L0();

        boolean M(View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState);

        long getStickerOutputChatId();

        void q();

        boolean y();
    }

    public static class h extends RecyclerView.h<f> {
        public final v4<?> M;
        public final j.c N;
        public final ArrayList<l> O = new ArrayList<>();
        public final e P;
        public final RecyclerView Q;
        public boolean R;

        public h(v4<?> v4Var, RecyclerView recyclerView, j.c cVar, e eVar) {
            this.M = v4Var;
            this.Q = recyclerView;
            this.N = cVar;
            this.P = eVar;
        }

        @Override
        public int D() {
            return this.O.isEmpty() ? this.R ? 1 : 2 : 1 + this.O.size();
        }

        @Override
        public int F(int i10) {
            return this.O.isEmpty() ? i10 == 1 ? 2 : 0 : i10 == 0 ? 0 : 1;
        }

        public void Q(f fVar, int i10) {
            if (fVar.n() == 1) {
                ((j) fVar.f2982a).setSticker(this.O.get(i10 - 1));
            }
        }

        public f S(ViewGroup viewGroup, int i10) {
            return f.O(this.M.t(), this.M.c(), i10, this.N, this.P);
        }

        public void V(f fVar) {
            int n10 = fVar.n();
            if (n10 == 1) {
                ((j) fVar.f2982a).d();
            } else if (n10 == 2) {
                ((n2) ((ViewGroup) fVar.f2982a).getChildAt(0)).e();
            }
        }

        public void W(f fVar) {
            int n10 = fVar.n();
            if (n10 == 1) {
                ((j) fVar.f2982a).i();
            } else if (n10 == 2) {
                ((n2) ((ViewGroup) fVar.f2982a).getChildAt(0)).b();
            }
        }

        public void X(f fVar) {
            int n10 = fVar.n();
            if (n10 == 1) {
                ((j) fVar.f2982a).Q2();
            } else if (n10 == 2) {
                ((n2) ((ViewGroup) fVar.f2982a).getChildAt(0)).Q2();
            }
        }

        public void g0(ArrayList<l> arrayList) {
            this.R = true;
            O(1);
            this.O.addAll(arrayList);
            M(1, arrayList.size());
        }
    }

    public z20(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static int af(int i10, int i11) {
        int min = Math.min(i10, i11) / 4;
        if (min != 0) {
            return i10 / min;
        }
        return 4;
    }

    public static int bf() {
        return a0.g() / af(a0.g(), a0.f());
    }

    public void ef() {
        if (!Sa()) {
            Ze();
        }
    }

    public void ff(TdApi.Object object) {
        if (!Sa()) {
            j0.z0(t2.z5(object), 0);
        }
    }

    public void gf(TdApi.StickerSet stickerSet) {
        if (!Sa() && this.f10266n0.f19964id == stickerSet.f19963id) {
            mf(stickerSet.stickers, stickerSet.stickerType, stickerSet.emojis);
            Ze();
        }
    }

    @Override
    public int A9() {
        return 4;
    }

    @Override
    public void E5(j jVar, l lVar, boolean z10) {
        int df = df(lVar);
        if (df != -1) {
            View C = this.f10273u0.C(df);
            if (C == null || !(C instanceof j)) {
                this.f10269q0.I(df);
            } else {
                ((j) C).setStickerPressed(z10);
            }
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        RecyclerView recyclerView = this.f10268p0;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    @Override
    public boolean Ie() {
        return false;
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more && this.f10266n0 != null) {
            jb.c cVar = new jb.c(4);
            u0 u0Var = new u0(4);
            jb.c cVar2 = new jb.c(4);
            cVar.a(R.id.btn_share);
            u0Var.a(R.string.Share);
            cVar2.a(R.drawable.baseline_forward_24);
            cVar.a(R.id.btn_copyLink);
            u0Var.a(R.string.CopyLink);
            cVar2.a(R.drawable.baseline_link_24);
            if (w9() != null) {
                if (w9().F()) {
                    cVar.a(R.id.btn_archive);
                    u0Var.a(R.string.StickersHide);
                    cVar2.a(R.drawable.baseline_archive_24);
                }
                if (w9().C0()) {
                    cVar.a(R.id.btn_delete);
                    u0Var.a(R.string.DeleteArchivedPack);
                    cVar2.a(R.drawable.baseline_delete_24);
                }
            }
            be(cVar.e(), u0Var.d(), cVar2.e(), 0, true);
        }
    }

    @Override
    public void J1(j jVar, l lVar) {
    }

    @Override
    public int L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public void M3(TdApi.StickerSets stickerSets, int i10) {
        p1.h(this, stickerSets, i10);
    }

    @Override
    public void M8(d1 d1Var) {
        super.M8(d1Var);
        this.f10275w0 = true;
    }

    @Override
    public int O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public void P0(int i10) {
        switch (i10) {
            case R.id.btn_archive:
                if (w9() != null) {
                    w9().q();
                    return;
                }
                return;
            case R.id.btn_copyLink:
                j0.i(t2.e2(this.f10266n0.name), R.string.CopiedLink);
                return;
            case R.id.btn_delete:
                if (w9() != null) {
                    w9().L0();
                    return;
                }
                return;
            case R.id.btn_share:
                this.f24495b.hd().h8(this, this.f10266n0);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean Q1(j jVar) {
        return true;
    }

    @Override
    public int Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public int R9() {
        return R.id.controller_stickerSet;
    }

    @Override
    public boolean V0() {
        return this.f10275w0 || super.V0();
    }

    @Override
    public boolean W2(j jVar, View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        return w9() != null && x9().M(view, lVar, z10, z11, messageSchedulingState);
    }

    @Override
    public int W9() {
        return R.id.menu_more;
    }

    @Override
    public CharSequence X9() {
        TdApi.StickerSetInfo stickerSetInfo = this.f10266n0;
        if (stickerSetInfo == null) {
            return null;
        }
        return id.d.z().I(t2.x0(this, this.f10266n0.title, ob.e.E0(stickerSetInfo.title), null, null));
    }

    @Override
    public void Y4(final TdApi.StickerSet stickerSet) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                z20.this.gf(stickerSet);
            }
        });
    }

    @Override
    public void Z(TdApi.StickerSetInfo stickerSetInfo) {
        p1.d(this, stickerSetInfo);
    }

    @Override
    public void Z2(int[] iArr) {
        p1.a(this, iArr);
    }

    @Override
    public void Z8() {
        super.Z8();
        p0.n(this.f10268p0);
        this.f24495b.O9().y0(this);
    }

    public final void Ze() {
        kb.b bVar = this.f10276x0;
        if (bVar != null) {
            bVar.c();
            this.f10276x0 = null;
        }
        this.f10269q0.g0(this.f10277y0);
    }

    public int cf() {
        return this.f10274v0;
    }

    public int df(l lVar) {
        Iterator it = this.f10269q0.O.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((l) it.next()).equals(lVar)) {
                return i10 + 1;
            }
            i10++;
        }
        return -1;
    }

    @Override
    public void e6(TdApi.StickerSetInfo stickerSetInfo) {
        p1.f(this, stickerSetInfo);
    }

    @Override
    public boolean g4(j jVar, int i10, int i11) {
        return true;
    }

    @Override
    public long getStickerOutputChatId() {
        return x9().getStickerOutputChatId();
    }

    @Override
    public int getStickersListTop() {
        return n.e();
    }

    @Override
    public int getViewportHeight() {
        return -1;
    }

    @Override
    public void h(long[] jArr, boolean z10) {
        p1.b(this, jArr, z10);
    }

    public void hf(int i10) {
        this.f10268p0.u1(0, i10);
    }

    public void m17if() {
        this.f10268p0.setItemAnimator(new tc.d(db.b.f7287b, 180L));
    }

    @Override
    public void j5(j jVar, l lVar) {
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        d1 d1Var;
        super.j6(z10, bVar);
        if (this.f10275w0 && (d1Var = this.R) != null) {
            d1Var.G3(this, null);
        }
    }

    public void jf(e eVar) {
        this.f10267o0 = eVar;
    }

    public final void kf(int i10, int i11) {
        if (i10 != 0 && i11 != 0) {
            if (this.f10271s0 != i10 || this.f10272t0 != i11) {
                this.f10271s0 = i10;
                this.f10272t0 = i11;
                int af = af(i10, i11);
                if (af != this.f10270r0) {
                    this.f10270r0 = af;
                    this.f10273u0.d3(af);
                }
            }
        }
    }

    public void lf(TdApi.StickerSetInfo stickerSetInfo) {
        this.f10266n0 = stickerSetInfo;
    }

    public void mf(TdApi.Sticker[] stickerArr, TdApi.StickerType stickerType, TdApi.Emojis[] emojisArr) {
        this.f10277y0 = new ArrayList<>(stickerArr.length);
        boolean z10 = w9() == null || w9().y();
        int i10 = 0;
        for (TdApi.Sticker sticker : stickerArr) {
            l lVar = new l(this.f24495b, sticker, stickerType, emojisArr[i10].emojis);
            if (!z10) {
                lVar.A();
            }
            this.f10277y0.add(lVar);
            i10++;
        }
    }

    @Override
    public View oc(Context context) {
        int g10 = a0.g();
        this.f10271s0 = g10;
        int f10 = a0.f();
        this.f10272t0 = f10;
        this.f10270r0 = af(g10, f10);
        a aVar = new a(context);
        aVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, -1);
        q12.topMargin = n.e();
        q12.bottomMargin = a0.i(56.0f);
        b bVar = new b(context);
        this.f10268p0 = bVar;
        t8(bVar);
        this.f10268p0.setItemAnimator(null);
        this.f10268p0.setOverScrollMode(fd.a.f11879a ? 1 : 2);
        RecyclerView recyclerView = this.f10268p0;
        RtlGridLayoutManager g32 = new RtlGridLayoutManager(context, this.f10270r0).g3(true);
        this.f10273u0 = g32;
        recyclerView.setLayoutManager(g32);
        RecyclerView recyclerView2 = this.f10268p0;
        h hVar = new h(this, recyclerView2, this, this.f10267o0);
        this.f10269q0 = hVar;
        recyclerView2.setAdapter(hVar);
        this.f10268p0.setLayoutParams(q12);
        this.f10268p0.k(new c());
        this.f10273u0.e3(new d());
        aVar.addView(this.f10268p0);
        ArrayList<l> arrayList = this.f10277y0;
        if (arrayList != null) {
            this.f10269q0.g0(arrayList);
        } else if (this.f10266n0 != null) {
            this.f24495b.v4().o(new TdApi.GetStickerSet(this.f10266n0.f19964id), this);
        }
        if (this.f10266n0 != null) {
            this.f24495b.O9().l0(this);
        }
        return aVar;
    }

    @Override
    public void r2(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1816236758) {
            TdApi.StickerSet stickerSet = (TdApi.StickerSet) object;
            mf(stickerSet.stickers, stickerSet.stickerType, stickerSet.emojis);
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    z20.this.ef();
                }
            });
        } else if (constructor == -1679978726) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    z20.this.ff(object);
                }
            });
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_more) {
            d1Var.a2(linearLayout, this);
        }
    }

    @Override
    public void w2(j jVar, l lVar) {
    }

    @Override
    public void y0(TdApi.StickerSetInfo stickerSetInfo) {
        p1.e(this, stickerSetInfo);
    }

    @Override
    public void z4(int[] iArr, boolean z10) {
        p1.c(this, iArr, z10);
    }
}
