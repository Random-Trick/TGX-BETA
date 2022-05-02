package sc;

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
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import gd.C4779t2;
import java.util.ArrayList;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.RtlGridLayoutManager;
import p037cb.C2057b;
import p082fd.C4356b0;
import p082fd.C4403w;
import p139jb.AbstractRunnableC5910b;
import p156kd.C6246h;
import p156kd.C6253l;
import p193nb.C7321e;
import p194nd.AbstractC7459k1;
import p194nd.AbstractC7511x;
import p194nd.AbstractC7513y;
import p194nd.C7462l1;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8112b;
import p225pd.C8113c;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import sc.View$OnClickListenerC8745e1;
import sc.View$OnClickListenerC8777i0;
import td.AbstractC9201h1;
import td.C9351w2;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC8833u0 extends AbstractC8809o<C8838e> implements C4356b0.AbstractC4359c, View$OnClickListenerC8745e1.AbstractC8746a, AbstractC9201h1, View.OnClickListener, View$OnClickListenerC8777i0.AbstractC8779b, AbstractC7459k1, AbstractC7511x, AbstractC7513y {
    public boolean f28500I0;
    public boolean f28501J0;
    public C4356b0.C4357a f28502K0;
    public C8743e f28503L0;
    public int f28504M0;
    public C9351w2 f28505N0;
    public boolean f28506O0;
    public Runnable f28507P0;
    public long f28508Q0;
    public boolean f28509R0;
    public View$OnClickListenerC8745e1 f28510S0;
    public View f28512U0;
    public RecyclerView f28513V0;
    public boolean f28514W0;
    public ValueAnimator f28515X0;
    public float f28516Y0;
    public C4356b0.C4358b f28517Z0;
    public boolean f28518a1;
    public AbstractRunnableC5910b f28520c1;
    public String f28521d1;
    public long f28522e1;
    public boolean f28523f1;
    public final C7462l1 f28511T0 = new C7462l1();
    public String f28519b1 = "";

    public class C8834a extends AbstractRunnableC5910b {
        public final Runnable f28524M;

        public C8834a(Runnable runnable) {
            this.f28524M = runnable;
        }

        @Override
        public void mo1364b() {
            this.f28524M.run();
        }
    }

    public class C8835b extends View {
        public C8835b(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || View$OnClickListenerC8833u0.this.f28516Y0 == 0.0f) {
                return super.onTouchEvent(motionEvent);
            }
            View$OnClickListenerC8833u0.this.m11243Ng();
            return true;
        }
    }

    public class C8836c extends AnimatorListenerAdapter {
        public C8836c() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            if (View$OnClickListenerC8833u0.this.f28514W0) {
                if (View$OnClickListenerC8833u0.this.f28516Y0 == 0.0f) {
                    View$OnClickListenerC8833u0 u0Var = View$OnClickListenerC8833u0.this;
                    u0Var.f28443n0.removeView(u0Var.f28513V0);
                    View$OnClickListenerC8833u0 u0Var2 = View$OnClickListenerC8833u0.this;
                    u0Var2.f28443n0.removeView(u0Var2.f28512U0);
                }
                View$OnClickListenerC8833u0.this.f28514W0 = false;
            }
        }
    }

    public class C8837d extends AbstractRunnableC5910b {
        public final String f28528M;

        public C8837d(String str) {
            this.f28528M = str;
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC8833u0.this.f28519b1.equals(this.f28528M)) {
                View$OnClickListenerC8833u0.this.m11211eh(this.f28528M);
            }
        }
    }

    public static class C8838e {
        public boolean f28530a;
    }

    public View$OnClickListenerC8833u0(View$OnClickListenerC8851y1 y1Var) {
        super(y1Var, (int) R.string.Gallery);
    }

    public static int m11245Lg(int i, int i2) {
        int min = Math.min(i, i2) / 3;
        if (i > i2) {
            return Math.max(5, i / min);
        }
        if (min == 0) {
            return 3;
        }
        return i / min;
    }

    public static C6246h m11242Og(C10930q6 q6Var, TdApi.Photo photo, long j, String str) {
        TdApi.PhotoSize m0 = C4779t2.m25475m0(photo, C1357a0.m37544i(76.0f), C1357a0.m37544i(76.0f));
        if (m0 != null) {
            return new C8774h1(q6Var, m0.photo, j, str);
        }
        return null;
    }

    public static String m11238Qg(boolean z) {
        return C4403w.m27871i1(z ? R.string.NoMediaYet : R.string.NoGalleryAccess);
    }

    public void m11237Rg(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
        this.f28443n0.m11120o3(this.f28510S0.m11606e0(true), this.f28518a1, new TdApi.MessageSendOptions(z, false, false, messageSchedulingState), z2, true);
    }

    public void m11236Sg(View view) {
        if (view.getId() == R.id.btn_sendAsFile) {
            this.f28443n0.m11143b3(new HandlerC10770jj.AbstractC10786o() {
                @Override
                public final void mo3333a(boolean z, TdApi.MessageSchedulingState messageSchedulingState, boolean z2) {
                    View$OnClickListenerC8833u0.this.m11237Rg(z, messageSchedulingState, z2);
                }
            });
        }
    }

    public void m11235Tg(float f, float f2, ValueAnimator valueAnimator) {
        m11208hh(f + (f2 * C2057b.m35738a(valueAnimator)));
    }

    public void m11233Ug(C4356b0.C4357a aVar, boolean z) {
        if (aVar == null || aVar.m28183i()) {
            m11210fh(z);
        } else {
            m11209gh(aVar);
        }
        Runnable runnable = this.f28507P0;
        if (runnable != null) {
            runnable.run();
            this.f28507P0 = null;
        }
        this.f28500I0 = true;
    }

    public static void m11232Vg(AbstractRunnableC5910b bVar, Runnable runnable) {
        if (bVar.m21857d()) {
            bVar.m21858c();
            runnable.run();
        }
    }

    public void m11230Wg() {
        if (this.f28519b1.equals(this.f28521d1)) {
            m11211eh(this.f28521d1);
        }
    }

    public void m11227Xg(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor != -1601123095) {
            Log.unexpectedTdlibResponse(object, TdApi.SearchPublicChat.class, TdApi.Chat.class);
        } else {
            TdApi.User b4 = this.f30170b.m2525b4((TdApi.Chat) object);
            if (b4 != null) {
                this.f28522e1 = b4.f25442id;
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC8833u0.this.m11230Wg();
                    }
                });
            }
        }
    }

    public void m11224Yg(String str, ArrayList arrayList) {
        if (this.f28519b1.equals(str)) {
            m11206jh(arrayList);
        }
    }

    public void m11223Zg(final String str, TdApi.Object object) {
        TdApi.InlineQueryResult[] inlineQueryResultArr;
        if (object.getConstructor() == 1000709656) {
            TdApi.InlineQueryResults inlineQueryResults = (TdApi.InlineQueryResults) object;
            final ArrayList arrayList = new ArrayList(inlineQueryResults.results.length);
            for (TdApi.InlineQueryResult inlineQueryResult : inlineQueryResults.results) {
                if (inlineQueryResult.getConstructor() == 1848319440) {
                    TdApi.InlineQueryResultPhoto inlineQueryResultPhoto = (TdApi.InlineQueryResultPhoto) inlineQueryResult;
                    C6246h Og = m11242Og(this.f30170b, inlineQueryResultPhoto.photo, inlineQueryResults.inlineQueryId, inlineQueryResultPhoto.f25389id);
                    if (Og != null) {
                        Og.m20898s0(2);
                        Og.mo20768t0(C1357a0.m37544i(76.0f));
                        arrayList.add(Og);
                    }
                }
            }
            C1379j0.m37337d0(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC8833u0.this.m11224Yg(str, arrayList);
                }
            });
        }
    }

    public void m11221ah(boolean z) {
        this.f28443n0.m11155U2(z);
    }

    @Override
    public void mo420Cc(String str) {
        m11213dh(str.trim().toLowerCase());
    }

    @Override
    public void mo9807F2(int i, C8112b bVar, boolean z) {
        if (C8112b.m13513c0(bVar.m13523X())) {
            this.f28510S0.m11597n0(bVar.m13549K(), z, m11273uf());
        }
    }

    @Override
    public View mo8869G9() {
        if (this.f28505N0 == null && this.f28502K0 != null) {
            C9351w2 O2 = this.f28443n0.getHeaderView().m10099O2(mo4347s(), this, this);
            this.f28505N0 = O2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) O2.getLayoutParams();
            layoutParams.width = -1;
            if (C4403w.m27986G2()) {
                layoutParams.leftMargin = C1357a0.m37544i(49.0f) * 2;
            } else {
                layoutParams.rightMargin = C1357a0.m37544i(49.0f) * 2;
            }
            m11204lh();
        }
        return this.f28505N0;
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        if (C1399s0.m37192c0(this.f28505N0, (C4403w.m27986G2() ? 5 : 3) | 48)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28505N0.getLayoutParams();
            if (C4403w.m27986G2()) {
                layoutParams.leftMargin = C1357a0.m37544i(49.0f) * 2;
                layoutParams.rightMargin = C1357a0.m37544i(68.0f);
            } else {
                layoutParams.rightMargin = C1357a0.m37544i(49.0f) * 2;
                layoutParams.leftMargin = C1357a0.m37544i(68.0f);
            }
            C1399s0.m37148y0(this.f28505N0);
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_clear) {
            m9341T8();
        } else if (i == R.id.menu_btn_more) {
            this.f28443n0.m11146Z2(false);
        } else if (i == R.id.menu_btn_search) {
            this.f28443n0.m11129k2(this.f30170b.m2737N5());
        }
    }

    @Override
    public ArrayList<C6246h> mo11249J0(boolean z) {
        return this.f28510S0.m11606e0(z);
    }

    public final void m11247Kg(float f) {
        if (this.f28514W0) {
            this.f28514W0 = false;
            ValueAnimator valueAnimator = this.f28515X0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f28515X0 = null;
            }
        }
        if (this.f28516Y0 != f) {
            this.f28514W0 = true;
            ValueAnimator b = C2057b.m35737b();
            this.f28515X0 = b;
            b.setInterpolator(C2057b.f7280b);
            this.f28515X0.setDuration(135L);
            final float f2 = this.f28516Y0;
            final float f3 = f - f2;
            this.f28515X0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    View$OnClickListenerC8833u0.this.m11235Tg(f2, f3, valueAnimator2);
                }
            });
            this.f28515X0.addListener(new C8836c());
            this.f28515X0.start();
        }
    }

    @Override
    public void mo11246L6(ArrayList<C6246h> arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z, boolean z2) {
        this.f28443n0.m11116r2();
        this.f28443n0.m11120o3(arrayList, false, messageSendOptions, z, z2);
    }

    public boolean m11244Mg() {
        throw new UnsupportedOperationException("Method not decompiled: sc.View$OnClickListenerC8833u0.m11244Mg():boolean");
    }

    public final void m11243Ng() {
        if (this.f28513V0 != null) {
            m11247Kg(0.0f);
        }
    }

    @Override
    public int mo11241P0() {
        return this.f28510S0.m11607d0();
    }

    public final String m11240Pg() {
        C4356b0.C4358b bVar = this.f28517Z0;
        return bVar != null ? bVar.m28175g() : C4403w.m27871i1(R.string.AllMedia);
    }

    @Override
    public void mo11239Q1(int i, C8112b bVar, boolean z) {
        this.f28510S0.m11595p0(bVar.m13549K(), z);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_gallery;
    }

    @Override
    public void mo11234U1(Cursor cursor, final boolean z) {
        Log.m14719i("Received gallery in %dms", Long.valueOf(SystemClock.uptimeMillis() - this.f28508Q0));
        this.f28508Q0 = SystemClock.uptimeMillis();
        final C4356b0.C4357a m = (!z || cursor == null || cursor.getCount() <= 0) ? null : C4356b0.m28203k().m28201m(cursor, true, 2);
        Log.m14719i("Parsed gallery in %dms", Long.valueOf(SystemClock.uptimeMillis() - this.f28508Q0));
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8833u0.this.m11233Ug(m, z);
            }
        });
    }

    @Override
    public int mo418W9() {
        return R.id.menu_more;
    }

    @Override
    public void mo11231Wf() {
        this.f28510S0.m11609a0((GridLayoutManager) m11273uf());
    }

    @Override
    public void mo11229Xe(java.util.List<p111he.View$OnTouchListenerC5103c0.C5104a> r8) {
        throw new UnsupportedOperationException("Method not decompiled: sc.View$OnClickListenerC8833u0.mo11229Xe(java.util.List):void");
    }

    @Override
    public void mo11228Xf(boolean z) {
        if (z) {
            this.f28510S0.m11598m0(true, (LinearLayoutManager) m11273uf());
        }
    }

    @Override
    public boolean mo11226Y3() {
        ArrayList<C6246h> e0 = this.f28510S0.m11606e0(false);
        if (e0 != null) {
            for (C6246h hVar : e0) {
                if ((hVar instanceof C6253l) && ((C6253l) hVar).m20872D0()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void mo11225Yf(TdApi.MessageSendOptions messageSendOptions, boolean z) {
        this.f28443n0.m11120o3(this.f28510S0.m11606e0(true), this.f28518a1, messageSendOptions, z, false);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        RecyclerView recyclerView = this.f28513V0;
        if (recyclerView != null) {
            C1399s0.m37165q(recyclerView);
        }
    }

    @Override
    public void mo11222a5() {
        if (Build.VERSION.SDK_INT < 23 || mo4347s().checkSelfPermission("android.permission.CAMERA") == 0) {
            this.f28443n0.m11148Y2();
        } else {
            mo4347s().m14580I2();
        }
    }

    @Override
    public long mo11220b() {
        return this.f28443n0.getTargetChatId();
    }

    public void m11219bh(Runnable runnable) {
        if (this.f28500I0) {
            if (runnable != null) {
                runnable.run();
            }
        } else if (this.f28506O0) {
            this.f28507P0 = runnable;
        } else {
            boolean z = true;
            this.f28506O0 = true;
            this.f28507P0 = runnable;
            C4356b0 k = C4356b0.m28203k();
            if (m9139w9() != null && !m9139w9().f28530a) {
                z = false;
            }
            k.m28207g(0L, this, z);
        }
    }

    @Override
    public boolean mo11218c0(C6246h hVar) {
        if (!(hVar instanceof C6253l) || this.f28517Z0 == null) {
            return false;
        }
        C8113c cVar = new C8113c(this.f30168a, this.f30170b);
        cVar.m13446u(hVar, this.f28517Z0.m28177e());
        View$OnClickListenerC7430j1 j1Var = new View$OnClickListenerC7430j1(this.f30168a, this.f30170b);
        j1Var.m16296Xk(View$OnClickListenerC7430j1.C7448r.m16049o(this, this, this, this, cVar, this.f28443n0.m11145a2()).m16045s(this.f28443n0.getTargetChatId()));
        j1Var.m16247dk();
        return true;
    }

    public final void m11217ch() {
        C4356b0.C4357a aVar = this.f28502K0;
        if (aVar != null && !aVar.m28183i()) {
            if (this.f28513V0 == null) {
                View$OnClickListenerC8777i0 i0Var = new View$OnClickListenerC8777i0(mo4347s(), this, this.f28502K0);
                FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(210.0f) + C1357a0.m37544i(8.0f), i0Var.mo11420v((C1357a0.m37544i(9.0f) + C1357a0.m37544i(9.0f) + C1357a0.m37544i(30.0f)) * 4) + (C1357a0.m37544i(8.0f) * 2), 51);
                t1.leftMargin = C1357a0.m37544i(50.0f);
                t1.topMargin = View$OnClickListenerC9170d1.getTopOffset();
                C8835b bVar = new C8835b(mo4347s());
                this.f28512U0 = bVar;
                bVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
                RecyclerView recyclerView = (RecyclerView) C1399s0.m37149y(this.f30168a, R.layout.recycler, this.f28443n0);
                this.f28513V0 = recyclerView;
                recyclerView.setLayoutParams(t1);
                this.f28513V0.setBackgroundResource(R.drawable.bg_popup_fixed);
                this.f28513V0.setLayoutManager(new LinearLayoutManager(mo4347s(), 1, false));
                this.f28513V0.setAdapter(i0Var);
                this.f28513V0.setOverScrollMode(2);
                this.f28513V0.setAlpha(0.0f);
                this.f28513V0.setScaleX(0.56f);
                this.f28513V0.setScaleY(0.56f);
            }
            C4356b0.C4358b bVar2 = this.f28517Z0;
            if (bVar2 != null) {
                this.f28502K0.m28184h(bVar2.m28178d());
            }
            if (this.f28513V0.getParent() == null) {
                this.f28443n0.addView(this.f28512U0);
                this.f28443n0.addView(this.f28513V0);
            }
            m11247Kg(1.0f);
        }
    }

    @Override
    public void mo11216d1(C4356b0.C4358b bVar) {
        if (!this.f28514W0) {
            m11243Ng();
            C4356b0.C4358b bVar2 = this.f28517Z0;
            if (bVar2 == bVar) {
                return;
            }
            if (bVar2 == null || bVar2.m28178d() != bVar.m28178d()) {
                this.f28517Z0 = bVar;
                m11207ih();
                m11204lh();
            }
        }
    }

    @Override
    public boolean mo11215df() {
        ArrayList<C6246h> e0 = this.f28510S0.m11606e0(false);
        if (e0 == null || e0.isEmpty()) {
            return true;
        }
        for (C6246h hVar : e0) {
            if (hVar.m20951E()) {
                return false;
            }
            if ((hVar instanceof C6253l) && !C7321e.m16965a1(((C6253l) hVar).m20868H0(false, false))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void mo11214dg(int i, int i2) {
        super.mo11214dg(i, i2);
        int Lg = m11245Lg(i, i2);
        if (this.f28504M0 != Lg) {
            this.f28504M0 = Lg;
            this.f28503L0.m11611n(Lg);
            this.f28453x0.m39507A0();
            ((GridLayoutManager) m11273uf()).m39589d3(Lg);
        }
    }

    public final void m11213dh(String str) {
        if (!this.f28519b1.equals(str)) {
            m9461Cd(false);
            AbstractRunnableC5910b bVar = this.f28520c1;
            if (bVar != null) {
                bVar.m21858c();
                this.f28520c1 = null;
            }
            this.f28519b1 = str;
            if (!str.isEmpty()) {
                C8837d dVar = new C8837d(str);
                this.f28520c1 = dVar;
                C1379j0.m37335e0(dVar, 500L);
            } else if (this.f28518a1) {
                m11207ih();
            }
        }
    }

    @Override
    public void mo11212eg(final Runnable runnable, long j) {
        this.f28508Q0 = SystemClock.uptimeMillis();
        final C8834a aVar = new C8834a(runnable);
        m11219bh(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC8833u0.m11232Vg(AbstractRunnableC5910b.this, runnable);
            }
        });
    }

    public final void m11211eh(final String str) {
        m9461Cd(true);
        if (this.f28522e1 == 0) {
            this.f28521d1 = str;
            if (!this.f28523f1) {
                this.f28523f1 = true;
                this.f30170b.m2270r4().m14783o(new TdApi.SearchPublicChat(this.f30170b.m2737N5()), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC8833u0.this.m11227Xg(object);
                    }
                });
                return;
            }
            return;
        }
        this.f30170b.m2270r4().m14783o(new TdApi.GetInlineQueryResults(this.f28522e1, this.f28443n0.getTargetChatId(), null, str, null), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC8833u0.this.m11223Zg(str, object);
            }
        });
    }

    public final void m11210fh(boolean z) {
        this.f28501J0 = z;
        m11321Of(m11238Qg(z), true);
    }

    public final void m11209gh(C4356b0.C4357a aVar) {
        this.f28502K0 = aVar;
        this.f28517Z0 = aVar != null ? aVar.m28185g() : null;
        m11205kh(true);
    }

    public final void m11208hh(float f) {
        if (this.f28516Y0 != f && this.f28514W0) {
            this.f28516Y0 = f;
            this.f28513V0.setAlpha(f);
            float f2 = (f * 0.44f) + 0.56f;
            this.f28513V0.setScaleX(f2);
            this.f28513V0.setScaleY(f2);
            this.f28513V0.setPivotX(C1357a0.m37544i(17.0f));
            this.f28513V0.setPivotY(C1357a0.m37544i(8.0f));
        }
    }

    public final void m11207ih() {
        if (this.f28518a1) {
            this.f28443n0.m11126l2();
            this.f28518a1 = false;
        }
        C4356b0.C4358b bVar = this.f28517Z0;
        boolean z = true;
        if (bVar != null) {
            View$OnClickListenerC8745e1 e1Var = this.f28510S0;
            ArrayList<C6246h> e = bVar.m28177e();
            if (!this.f28517Z0.m28169m() && !this.f28517Z0.m28170l()) {
                z = false;
            }
            e1Var.m11596o0(e, z);
        } else {
            this.f28510S0.m11596o0(null, true);
        }
        ((LinearLayoutManager) this.f28453x0.getLayoutManager()).m39525z2(0, 0);
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (this.f28516Y0 == 0.0f) {
            return super.mo404jc(z);
        }
        m11243Ng();
        return true;
    }

    public final void m11206jh(ArrayList<C6246h> arrayList) {
        this.f28518a1 = true;
        this.f28443n0.m11126l2();
        this.f28510S0.m11596o0(arrayList, false);
    }

    @Override
    public int mo9224ka() {
        return R.string.SearchForImages;
    }

    public final void m11205kh(boolean z) {
        C4356b0.C4357a aVar = this.f28502K0;
        if (aVar != null && !this.f28509R0) {
            this.f28509R0 = true;
            this.f28517Z0 = aVar.m28185g();
            m11207ih();
        }
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    public final void m11204lh() {
        C9351w2 w2Var = this.f28505N0;
        if (w2Var != null) {
            w2Var.setText(m11240Pg());
        }
    }

    @Override
    public boolean mo11203ng(final boolean z) {
        ArrayList<C6246h> e0 = this.f28510S0.m11606e0(false);
        if (e0 != null && !e0.isEmpty()) {
            boolean z2 = false;
            boolean z3 = false;
            for (C6246h hVar : e0) {
                if (hVar.m20951E()) {
                    z2 = true;
                }
                if ((hVar instanceof C6253l) && !C7321e.m16965a1(((C6253l) hVar).m20868H0(false, false))) {
                    z3 = true;
                }
            }
            if (z2 || z3) {
                m9185pe(C4403w.m27984H0(this, (!z2 || !z3) ? z3 ? R.string.DiscardMediaHint2 : R.string.DiscardMediaHint : R.string.DiscardMediaHint3, new Object[0]), C4403w.m27871i1((!z2 || !z3) ? z3 ? R.string.DiscardMediaMsg2 : R.string.DiscardMediaMsg : R.string.DiscardMediaMsg3), new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC8833u0.this.m11221ah(z);
                    }
                });
                return true;
            }
        }
        return false;
    }

    @Override
    public View mo403oc(Context context) {
        m11300bf(false);
        this.f28453x0.setItemAnimator(null);
        int Lg = m11245Lg(C1357a0.m37546g(), C1357a0.m37547f());
        this.f28503L0 = new C8743e(Lg, C1357a0.m37544i(4.0f), true, true, true);
        RtlGridLayoutManager rtlGridLayoutManager = new RtlGridLayoutManager(mo4347s(), Lg);
        this.f28510S0 = new View$OnClickListenerC8745e1(mo4347s(), this.f28453x0, rtlGridLayoutManager, this, 3);
        m11288jg(rtlGridLayoutManager);
        m11292hg(this.f28510S0);
        m11305Ye(this.f28503L0);
        if (!this.f28500I0) {
            m11219bh(null);
        } else if (this.f28502K0 == null) {
            m11321Of(m11238Qg(this.f28501J0), false);
        } else {
            m11205kh(false);
        }
        return this.f28451v0;
    }

    @Override
    public boolean mo11202og() {
        return true;
    }

    @Override
    public void onClick(View view) {
        m11217ch();
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_clear) {
            d1Var.m10090S1(linearLayout, this);
        } else if (i == R.id.menu_more) {
            d1Var.m10053i2(linearLayout, this);
            d1Var.m10068b2(linearLayout, this);
        }
    }

    @Override
    public void mo11201p2(C6246h hVar) {
        this.f28443n0.m11125l3(hVar, this.f28518a1);
    }

    @Override
    public C7462l1 mo9806v(int i, C8112b bVar) {
        View c0;
        int i2;
        if (!C8112b.m13513c0(bVar.m13523X()) || this.f28443n0.m11188B2() || (c0 = this.f28510S0.m11608c0(bVar.m13549K(), (LinearLayoutManager) m11273uf())) == null) {
            return null;
        }
        int top = c0.getTop();
        int bottom = c0.getBottom();
        int round = Math.round(this.f28453x0.getTranslationY()) + top + this.f28453x0.getTop();
        int measuredHeight = c0.getMeasuredHeight() + round;
        int left = c0.getLeft();
        int right = c0.getRight();
        int receiverOffset = ((C8765g1) c0).getReceiverOffset();
        int i3 = round + receiverOffset;
        int i4 = measuredHeight - receiverOffset;
        int i5 = left + receiverOffset;
        int i6 = right - receiverOffset;
        int i7 = top < 0 ? -top : 0;
        int i8 = bottom < 0 ? -bottom : 0;
        int currentBottomBarHeight = this.f28443n0.getCurrentBottomBarHeight();
        int measuredHeight2 = this.f28443n0.getMeasuredHeight();
        if (currentBottomBarHeight > 0 && i4 > (i2 = measuredHeight2 - currentBottomBarHeight)) {
            i8 += i4 - i2;
        }
        this.f28511T0.m15991i(i5, i3, i6, i4);
        this.f28511T0.m15988l(0, i7, 0, i8);
        return this.f28511T0;
    }

    @Override
    public boolean mo11197v1(int i, C8112b bVar) {
        return this.f28510S0.m11605f0(bVar.m13549K()) >= 0;
    }

    @Override
    public void mo409xc() {
        m11213dh("");
    }

    @Override
    public void mo11193y6(int i, C6246h hVar, int i2) {
        mo9397La();
        this.f28443n0.setCounter(i);
    }

    @Override
    public int mo11191zf() {
        return R.id.theme_color_chatBackground;
    }
}
