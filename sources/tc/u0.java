package tc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.p0;
import gd.b0;
import gd.w;
import hd.t2;
import java.util.ArrayList;
import kb.b;
import ld.h;
import ld.l;
import me.vkryl.android.widget.FrameLayoutFix;
import od.j1;
import od.k1;
import od.l1;
import od.x;
import od.y;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.RtlGridLayoutManager;
import tc.e1;
import tc.i0;
import ud.d1;
import ud.h1;
import ud.w2;
import zd.hj;
import zd.o6;

public class u0 extends o<e> implements b0.c, e1.a, h1, View.OnClickListener, i0.b, k1, x, y {
    public boolean I0;
    public boolean J0;
    public b0.a K0;
    public tc.e L0;
    public int M0;
    public w2 N0;
    public boolean O0;
    public Runnable P0;
    public long Q0;
    public boolean R0;
    public e1 S0;
    public View U0;
    public RecyclerView V0;
    public boolean W0;
    public ValueAnimator X0;
    public float Y0;
    public b0.b Z0;
    public boolean f23317a1;
    public kb.b f23319c1;
    public String f23320d1;
    public long f23321e1;
    public boolean f23322f1;
    public final l1 T0 = new l1();
    public String f23318b1 = "";

    public class a extends kb.b {
        public final Runnable M;

        public a(Runnable runnable) {
            this.M = runnable;
        }

        @Override
        public void b() {
            this.M.run();
        }
    }

    public class b extends View {
        public b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || u0.this.Y0 == 0.0f) {
                return super.onTouchEvent(motionEvent);
            }
            u0.this.Ng();
            return true;
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (u0.this.W0) {
                if (u0.this.Y0 == 0.0f) {
                    u0 u0Var = u0.this;
                    u0Var.f23267n0.removeView(u0Var.V0);
                    u0 u0Var2 = u0.this;
                    u0Var2.f23267n0.removeView(u0Var2.U0);
                }
                u0.this.W0 = false;
            }
        }
    }

    public class d extends kb.b {
        public final String M;

        public d(String str) {
            this.M = str;
        }

        @Override
        public void b() {
            if (u0.this.f23318b1.equals(this.M)) {
                u0.this.eh(this.M);
            }
        }
    }

    public static class e {
        public boolean f23325a;
    }

    public u0(y1 y1Var) {
        super(y1Var, (int) R.string.Gallery);
    }

    public static int Lg(int i10, int i11) {
        int min = Math.min(i10, i11) / 3;
        if (i10 > i11) {
            return Math.max(5, i10 / min);
        }
        if (min == 0) {
            return 3;
        }
        return i10 / min;
    }

    public static h Og(o6 o6Var, TdApi.Photo photo, long j10, String str) {
        TdApi.PhotoSize m02 = t2.m0(photo, a0.i(76.0f), a0.i(76.0f));
        if (m02 != null) {
            return new h1(o6Var, m02.photo, j10, str);
        }
        return null;
    }

    public static String Qg(boolean z10) {
        return w.i1(z10 ? R.string.NoMediaYet : R.string.NoGalleryAccess);
    }

    public void Rg(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        this.f23267n0.p3(this.S0.d0(true), this.f23317a1, new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState), z11, true);
    }

    public void Sg(View view) {
        if (view.getId() == R.id.btn_sendAsFile) {
            this.f23267n0.Z2(new hj.o() {
                @Override
                public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                    u0.this.Rg(z10, messageSchedulingState, z11);
                }
            });
        }
    }

    public void Tg(float f10, float f11, ValueAnimator valueAnimator) {
        hh(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void Ug(b0.a aVar, boolean z10) {
        if (aVar == null || aVar.i()) {
            fh(z10);
        } else {
            gh(aVar);
        }
        Runnable runnable = this.P0;
        if (runnable != null) {
            runnable.run();
            this.P0 = null;
        }
        this.I0 = true;
    }

    public static void Vg(kb.b bVar, Runnable runnable) {
        if (bVar.d()) {
            bVar.c();
            runnable.run();
        }
    }

    public void Wg() {
        if (this.f23318b1.equals(this.f23320d1)) {
            eh(this.f23320d1);
        }
    }

    public void Xg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor != -1601123095) {
            Log.unexpectedTdlibResponse(object, TdApi.SearchPublicChat.class, TdApi.Chat.class);
        } else {
            TdApi.User f42 = this.f24495b.f4((TdApi.Chat) object);
            if (f42 != null) {
                this.f23321e1 = f42.f19979id;
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        u0.this.Wg();
                    }
                });
            }
        }
    }

    public void Yg(String str, ArrayList arrayList) {
        if (this.f23318b1.equals(str)) {
            jh(arrayList);
        }
    }

    public void Zg(final String str, TdApi.Object object) {
        TdApi.InlineQueryResult[] inlineQueryResultArr;
        if (object.getConstructor() == 1000709656) {
            TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
            final ArrayList arrayList = new ArrayList(inlineQueryResults.results.length);
            for (TdApi.InlineQueryResult inlineQueryResult : inlineQueryResults.results) {
                if (inlineQueryResult.getConstructor() == 1848319440) {
                    TdApi.InlineQueryResultPhoto inlineQueryResultPhoto = (TdApi.InlineQueryResultPhoto) inlineQueryResult;
                    h Og = Og(this.f24495b, inlineQueryResultPhoto.photo, inlineQueryResults.inlineQueryId, inlineQueryResultPhoto.f19926id);
                    if (Og != null) {
                        Og.s0(2);
                        Og.t0(a0.i(76.0f));
                        arrayList.add(Og);
                    }
                }
            }
            j0.d0(new Runnable() {
                @Override
                public final void run() {
                    u0.this.Yg(str, arrayList);
                }
            });
        }
    }

    public void ah(boolean z10) {
        this.f23267n0.S2(z10);
    }

    @Override
    public void Cc(String str) {
        dh(str.trim().toLowerCase());
    }

    @Override
    public View G9() {
        if (this.N0 == null && this.K0 != null) {
            w2 L2 = this.f23267n0.getHeaderView().L2(t(), this, this);
            this.N0 = L2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) L2.getLayoutParams();
            layoutParams.width = -1;
            if (w.G2()) {
                layoutParams.leftMargin = a0.i(49.0f) * 2;
            } else {
                layoutParams.rightMargin = a0.i(49.0f) * 2;
            }
            lh();
        }
        return this.N0;
    }

    @Override
    public void H6(ArrayList<h> arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z10, boolean z11) {
        this.f23267n0.m2();
        this.f23267n0.p3(arrayList, false, messageSendOptions, z10, z11);
    }

    @Override
    public void Ia() {
        super.Ia();
        if (p0.V(this.N0, (w.G2() ? 5 : 3) | 48)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.N0.getLayoutParams();
            if (w.G2()) {
                layoutParams.leftMargin = a0.i(49.0f) * 2;
                layoutParams.rightMargin = a0.i(68.0f);
            } else {
                layoutParams.rightMargin = a0.i(49.0f) * 2;
                layoutParams.leftMargin = a0.i(68.0f);
            }
            p0.r0(this.N0);
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_clear) {
            T8();
        } else if (i10 == R.id.menu_btn_more) {
            this.f23267n0.Y2(false);
        } else if (i10 == R.id.menu_btn_search) {
            this.f23267n0.h2(this.f24495b.R5());
        }
    }

    public final void Kg(float f10) {
        if (this.W0) {
            this.W0 = false;
            ValueAnimator valueAnimator = this.X0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.X0 = null;
            }
        }
        if (this.Y0 != f10) {
            this.W0 = true;
            ValueAnimator b10 = db.b.b();
            this.X0 = b10;
            b10.setInterpolator(db.b.f7287b);
            this.X0.setDuration(135L);
            final float f11 = this.Y0;
            final float f12 = f10 - f11;
            this.X0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    u0.this.Tg(f11, f12, valueAnimator2);
                }
            });
            this.X0.addListener(new c());
            this.X0.start();
        }
    }

    @Override
    public ArrayList<h> L0(boolean z10) {
        return this.S0.d0(z10);
    }

    public boolean Mg() {
        throw new UnsupportedOperationException("Method not decompiled: tc.u0.Mg():boolean");
    }

    public final void Ng() {
        if (this.V0 != null) {
            Kg(0.0f);
        }
    }

    @Override
    public boolean P3() {
        ArrayList<h> d02 = this.S0.d0(false);
        if (d02 != null) {
            for (h hVar : d02) {
                if ((hVar instanceof l) && ((l) hVar).D0()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String Pg() {
        b0.b bVar = this.Z0;
        return bVar != null ? bVar.g() : w.i1(R.string.AllMedia);
    }

    @Override
    public void R1(Cursor cursor, final boolean z10) {
        Log.i("Received gallery in %dms", Long.valueOf(SystemClock.uptimeMillis() - this.Q0));
        this.Q0 = SystemClock.uptimeMillis();
        final b0.a m10 = (!z10 || cursor == null || cursor.getCount() <= 0) ? null : b0.k().m(cursor, true, 2);
        Log.i("Parsed gallery in %dms", Long.valueOf(SystemClock.uptimeMillis() - this.Q0));
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                u0.this.Ug(m10, z10);
            }
        });
    }

    @Override
    public boolean R4(h hVar) {
        if (!(hVar instanceof l) || this.Z0 == null) {
            return false;
        }
        qd.c cVar = new qd.c(this.f24493a, this.f24495b);
        ArrayList<h> e10 = this.Z0.e();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cVar.u(hVar, e10);
        Log.i("stack.set complete for %d files in %dms", Integer.valueOf(cVar.i()), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        j1 j1Var = new j1(this.f24493a, this.f24495b);
        j1Var.Xk(j1.r.o(this, this, this, this, cVar, this.f23267n0.Z1()).s(this.f23267n0.getTargetChatId()));
        j1Var.dk();
        return true;
    }

    @Override
    public int R9() {
        return R.id.controller_media_gallery;
    }

    @Override
    public int S0() {
        return this.S0.c0();
    }

    @Override
    public void S5(b0.b bVar) {
        if (!this.W0) {
            Ng();
            b0.b bVar2 = this.Z0;
            if (bVar2 == bVar) {
                return;
            }
            if (bVar2 == null || bVar2.d() != bVar.d()) {
                this.Z0 = bVar;
                ih();
                lh();
            }
        }
    }

    @Override
    public void S6(h hVar) {
        this.f23267n0.m3(hVar, this.f23317a1);
    }

    @Override
    public void V4() {
        if (Build.VERSION.SDK_INT < 23 || t().checkSelfPermission("android.permission.CAMERA") == 0) {
            this.f23267n0.X2();
        } else {
            t().J2();
        }
    }

    @Override
    public int W9() {
        return R.id.menu_more;
    }

    @Override
    public void Wf() {
        this.S0.a0((GridLayoutManager) uf());
    }

    @Override
    public void Xe(java.util.List<ie.c0.a> r8) {
        throw new UnsupportedOperationException("Method not decompiled: tc.u0.Xe(java.util.List):void");
    }

    @Override
    public void Xf(boolean z10) {
        if (z10) {
            this.S0.l0(true, (LinearLayoutManager) uf());
        }
    }

    @Override
    public void Yf(TdApi.MessageSendOptions messageSendOptions, boolean z10) {
        this.f23267n0.p3(this.S0.d0(true), this.f23317a1, messageSendOptions, z10, false);
    }

    @Override
    public void Z1(int i10, qd.b bVar, boolean z10) {
        if (qd.b.c0(bVar.X())) {
            this.S0.m0(bVar.K(), z10, uf());
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        RecyclerView recyclerView = this.V0;
        if (recyclerView != null) {
            p0.n(recyclerView);
        }
    }

    @Override
    public long b() {
        return this.f23267n0.getTargetChatId();
    }

    @Override
    public void b5(int i10, qd.b bVar, boolean z10) {
        this.S0.o0(bVar.K(), z10);
    }

    public void bh(Runnable runnable) {
        if (this.I0) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (this.O0) {
            this.P0 = runnable;
        } else {
            boolean z10 = true;
            this.O0 = true;
            this.P0 = runnable;
            b0 k10 = b0.k();
            if (w9() != null && !w9().f23325a) {
                z10 = false;
            }
            k10.g(0L, this, z10);
        }
    }

    public final void ch() {
        b0.a aVar = this.K0;
        if (aVar != null && !aVar.i()) {
            if (this.V0 == null) {
                i0 i0Var = new i0(t(), this, this.K0);
                FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(210.0f) + a0.i(8.0f), i0Var.v((a0.i(9.0f) + a0.i(9.0f) + a0.i(30.0f)) * 4) + (a0.i(8.0f) * 2), 51);
                r12.leftMargin = a0.i(50.0f);
                r12.topMargin = d1.getTopOffset();
                b bVar = new b(t());
                this.U0 = bVar;
                bVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                RecyclerView recyclerView = (RecyclerView) p0.v(this.f24493a, R.layout.recycler, this.f23267n0);
                this.V0 = recyclerView;
                recyclerView.setLayoutParams(r12);
                this.V0.setBackgroundResource(R.drawable.bg_popup_fixed);
                this.V0.setLayoutManager(new LinearLayoutManager(t(), 1, false));
                this.V0.setAdapter(i0Var);
                this.V0.setOverScrollMode(2);
                this.V0.setAlpha(0.0f);
                this.V0.setScaleX(0.56f);
                this.V0.setScaleY(0.56f);
            }
            b0.b bVar2 = this.Z0;
            if (bVar2 != null) {
                this.K0.h(bVar2.d());
            }
            if (this.V0.getParent() == null) {
                this.f23267n0.addView(this.U0);
                this.f23267n0.addView(this.V0);
            }
            Kg(1.0f);
        }
    }

    @Override
    public boolean df() {
        ArrayList<h> d02 = this.S0.d0(false);
        if (d02 == null || d02.isEmpty()) {
            return true;
        }
        for (h hVar : d02) {
            if (hVar.E()) {
                return false;
            }
            if ((hVar instanceof l) && !ob.e.c1(((l) hVar).H0(false, false))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void dg(int i10, int i11) {
        super.dg(i10, i11);
        int Lg = Lg(i10, i11);
        if (this.M0 != Lg) {
            this.M0 = Lg;
            this.L0.n(Lg);
            this.f23277x0.A0();
            ((GridLayoutManager) uf()).d3(Lg);
        }
    }

    public final void dh(String str) {
        if (!this.f23318b1.equals(str)) {
            Cd(false);
            kb.b bVar = this.f23319c1;
            if (bVar != null) {
                bVar.c();
                this.f23319c1 = null;
            }
            this.f23318b1 = str;
            if (!str.isEmpty()) {
                d dVar = new d(str);
                this.f23319c1 = dVar;
                j0.e0(dVar, 500L);
            } else if (this.f23317a1) {
                ih();
            }
        }
    }

    @Override
    public void eg(final Runnable runnable, long j10) {
        this.Q0 = SystemClock.uptimeMillis();
        final a aVar = new a(runnable);
        bh(new Runnable() {
            @Override
            public final void run() {
                u0.Vg(b.this, runnable);
            }
        });
    }

    public final void eh(final String str) {
        Cd(true);
        if (this.f23321e1 == 0) {
            this.f23320d1 = str;
            if (!this.f23322f1) {
                this.f23322f1 = true;
                this.f24495b.v4().o(new TdApi.SearchPublicChat(this.f24495b.R5()), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        u0.this.Xg(object);
                    }
                });
                return;
            }
            return;
        }
        this.f24495b.v4().o(new TdApi.GetInlineQueryResults(this.f23321e1, this.f23267n0.getTargetChatId(), null, str, null), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                u0.this.Zg(str, object);
            }
        });
    }

    public final void fh(boolean z10) {
        this.J0 = z10;
        Of(Qg(z10), true);
    }

    public final void gh(b0.a aVar) {
        this.K0 = aVar;
        this.Z0 = aVar != null ? aVar.g() : null;
        kh(true);
    }

    public final void hh(float f10) {
        if (this.Y0 != f10 && this.W0) {
            this.Y0 = f10;
            this.V0.setAlpha(f10);
            float f11 = (f10 * 0.44f) + 0.56f;
            this.V0.setScaleX(f11);
            this.V0.setScaleY(f11);
            this.V0.setPivotX(a0.i(17.0f));
            this.V0.setPivotY(a0.i(8.0f));
        }
    }

    public final void ih() {
        if (this.f23317a1) {
            this.f23267n0.i2();
            this.f23317a1 = false;
        }
        b0.b bVar = this.Z0;
        boolean z10 = true;
        if (bVar != null) {
            e1 e1Var = this.S0;
            ArrayList<h> e10 = bVar.e();
            if (!this.Z0.m() && !this.Z0.l()) {
                z10 = false;
            }
            e1Var.n0(e10, z10);
        } else {
            this.S0.n0(null, true);
        }
        ((LinearLayoutManager) this.f23277x0.getLayoutManager()).z2(0, 0);
    }

    @Override
    public boolean jc(boolean z10) {
        if (this.Y0 == 0.0f) {
            return super.jc(z10);
        }
        Ng();
        return true;
    }

    public final void jh(ArrayList<h> arrayList) {
        this.f23317a1 = true;
        this.f23267n0.i2();
        this.S0.n0(arrayList, false);
    }

    @Override
    public boolean k(int i10, qd.b bVar) {
        return this.S0.e0(bVar.K()) >= 0;
    }

    @Override
    public int ka() {
        return R.string.SearchForImages;
    }

    public final void kh(boolean z10) {
        b0.a aVar = this.K0;
        if (aVar != null && !this.R0) {
            this.R0 = true;
            this.Z0 = aVar.g();
            ih();
        }
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    public final void lh() {
        w2 w2Var = this.N0;
        if (w2Var != null) {
            w2Var.setText(Pg());
        }
    }

    @Override
    public boolean ng(final boolean z10) {
        ArrayList<h> d02 = this.S0.d0(false);
        if (d02 != null && !d02.isEmpty()) {
            boolean z11 = false;
            boolean z12 = false;
            for (h hVar : d02) {
                if (hVar.E()) {
                    z11 = true;
                }
                if ((hVar instanceof l) && !ob.e.c1(((l) hVar).H0(false, false))) {
                    z12 = true;
                }
            }
            if (z11 || z12) {
                pe(w.H0(this, (!z11 || !z12) ? z12 ? R.string.DiscardMediaHint2 : R.string.DiscardMediaHint : R.string.DiscardMediaHint3, new Object[0]), w.i1((!z11 || !z12) ? z12 ? R.string.DiscardMediaMsg2 : R.string.DiscardMediaMsg : R.string.DiscardMediaMsg3), new Runnable() {
                    @Override
                    public final void run() {
                        u0.this.ah(z10);
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public View oc(Context context) {
        bf(false);
        this.f23277x0.setItemAnimator(null);
        int Lg = Lg(a0.g(), a0.f());
        this.L0 = new tc.e(Lg, a0.i(4.0f), true, true, true);
        RtlGridLayoutManager rtlGridLayoutManager = new RtlGridLayoutManager(t(), Lg);
        this.S0 = new e1(t(), this.f23277x0, rtlGridLayoutManager, this, 3);
        jg(rtlGridLayoutManager);
        hg(this.S0);
        Ye(this.L0);
        if (!this.I0) {
            bh(null);
        } else if (this.K0 == null) {
            Of(Qg(this.J0), false);
        } else {
            kh(false);
        }
        return this.f23275v0;
    }

    @Override
    public boolean og() {
        return true;
    }

    @Override
    public void onClick(View view) {
        ch();
    }

    @Override
    public void p0(int i10, h hVar, int i11) {
        La();
        this.f23267n0.setCounter(i10);
    }

    @Override
    public l1 s1(int i10, qd.b bVar) {
        View b02;
        int i11;
        if (!qd.b.c0(bVar.X()) || this.f23267n0.y2() || (b02 = this.S0.b0(bVar.K(), (LinearLayoutManager) uf())) == null) {
            return null;
        }
        int top = b02.getTop();
        int bottom = b02.getBottom();
        int round = Math.round(this.f23277x0.getTranslationY()) + top + this.f23277x0.getTop();
        int measuredHeight = b02.getMeasuredHeight() + round;
        int left = b02.getLeft();
        int right = b02.getRight();
        int receiverOffset = ((g1) b02).getReceiverOffset();
        int i12 = round + receiverOffset;
        int i13 = measuredHeight - receiverOffset;
        int i14 = left + receiverOffset;
        int i15 = right - receiverOffset;
        int i16 = top < 0 ? -top : 0;
        int i17 = bottom < 0 ? -bottom : 0;
        int currentBottomBarHeight = this.f23267n0.getCurrentBottomBarHeight();
        int measuredHeight2 = this.f23267n0.getMeasuredHeight();
        if (currentBottomBarHeight > 0 && i13 > (i11 = measuredHeight2 - currentBottomBarHeight)) {
            i17 += i13 - i11;
        }
        this.T0.i(i14, i12, i15, i13);
        this.T0.l(0, i16, 0, i17);
        return this.T0;
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.P1(linearLayout, this);
        } else if (i10 == R.id.menu_more) {
            d1Var.g2(linearLayout, this);
            d1Var.a2(linearLayout, this);
        }
    }

    @Override
    public void xc() {
        dh("");
    }

    @Override
    public int zf() {
        return R.id.theme_color_chatBackground;
    }
}
