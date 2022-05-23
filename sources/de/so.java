package de;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.v;
import ce.x;
import ce.y;
import de.bl;
import de.f5;
import de.j10;
import de.k1;
import de.m6;
import de.o9;
import de.p0;
import de.qj;
import de.rh;
import de.s;
import de.s5;
import de.s8;
import de.u7;
import de.y00;
import eb.k;
import gd.w;
import hd.c3;
import hd.d7;
import hd.p7;
import hd.s4;
import hd.t2;
import ie.g0;
import ie.h0;
import ie.l0;
import ie.m0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import je.t;
import je.x0;
import kb.b;
import kb.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.c0;
import ne.c1;
import ne.f3;
import ne.h4;
import ne.k3;
import ne.n2;
import ne.o0;
import ne.v2;
import ne.y1;
import oc.v0;
import od.j1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.b5;
import ud.d1;
import ud.f2;
import ud.h1;
import ud.h2;
import ud.j1;
import ud.m;
import ud.q1;
import ud.r;
import ud.u0;
import ud.v4;
import ud.x2;
import ud.z4;
import zd.g1;
import zd.hj;
import zd.i1;
import zd.o6;
import zd.t7;
import zd.y8;

public class so extends v4<m> implements h1, j1, h0, h4.a, ViewPager.i, View.OnClickListener, View.OnLongClickListener, Client.g, zd.h1, zd.h0, zd.j1, t7.i, t7.j, t7.g, t7.b, t7.h, t7.d, m.c, la, m0, b5.c, sc.a, k.b, ud.a, ie.p {
    public static TdApi.SearchMessagesFilter[] J1;
    public static TdApi.SearchMessagesFilter[] K1;
    public FrameLayoutFix A0;
    public View A1;
    public ud.m B0;
    public int B1;
    public CustomRecyclerView C0;
    public int C1;
    public iq D0;
    public boolean D1;
    public v2 E0;
    public boolean E1;
    public h4 F0;
    public boolean F1;
    public z4 G0;
    public FrameLayoutFix H0;
    public SparseIntArray H1;
    public p I0;
    public int I1;
    public f3 J0;
    public float K0;
    public float L0;
    public boolean M0;
    public float N0;
    public eb.k O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean U0;
    public boolean V0;
    public boolean X0;
    public FrameLayoutFix Y0;
    public r Z0;
    public ImageView f9505a1;
    public u0 f9506b1;
    public u0 f9507c1;
    public u0 f9508d1;
    public u0 f9509e1;
    public u0 f9510f1;
    public float f9511g1;
    public int f9512h1;
    public x0 f9513i1;
    public ra f9515k1;
    public ra f9516l1;
    public o0 f9517m1;
    public int f9518n0;
    public boolean f9519n1;
    public TdApi.Chat f9520o0;
    public boolean f9521o1;
    public p7 f9522p0;
    public ra f9523p1;
    public TdApi.User f9524q0;
    public ra f9525q1;
    public TdApi.SecretChat f9526r0;
    public ra f9527r1;
    public TdApi.UserFullInfo f9528s0;
    public ra f9529s1;
    public TdApi.BasicGroup f9530t0;
    public int f9531t1;
    public TdApi.BasicGroupFullInfo f9532u0;
    public boolean f9533u1;
    public TdApi.Supergroup f9534v0;
    public int f9535v1;
    public TdApi.SupergroupFullInfo f9536w0;
    public float f9537w1;
    public ed.n f9538x0;
    public HashMap<CharSequence, int[]> f9543z1;
    public int f9540y0 = -1;
    public int f9542z0 = -1;
    public int T0 = -1;
    public int W0 = 0;
    public int f9514j1 = -1;
    public int f9539x1 = -1;
    public int f9541y1 = -1;
    public final ArrayList<j10<?>> G1 = new ArrayList<>(6);

    public class a extends ClickableSpan {
        public final int f9544a;
        public final long f9545b;

        public a(int i10, long j10) {
            this.f9544a = i10;
            this.f9545b = j10;
        }

        @Override
        public void onClick(View view) {
            if (this.f9544a == 0) {
                so.this.f24495b.hd().h7(so.this, this.f9545b, new hj.j().h().n());
                return;
            }
            hj hd2 = so.this.f24495b.hd();
            so soVar = so.this;
            hd2.h7(soVar, soVar.f9520o0.f19908id, new hj.j().h().n());
        }
    }

    public class b extends kb.b {
        public final f5 M;
        public final AtomicReference N;
        public final int O;
        public final View P;

        public b(f5 f5Var, AtomicReference atomicReference, int i10, View view) {
            this.M = f5Var;
            this.N = atomicReference;
            this.O = i10;
            this.P = view;
        }

        @Override
        public void b() {
            so.this.t().m1(false);
            if (!this.M.Sa()) {
                TdApi.Object object = (TdApi.Object) this.N.get();
                int constructor = object.getConstructor();
                if (constructor == -1679978726) {
                    this.M.t().I3().g(this.P).F(this.M, so.this.f24495b, R.drawable.baseline_error_24, t2.z5(object));
                } else if (constructor == 1829953909) {
                    so.this.ii(this.O, this.M, this.P, (TdApi.ChatMember) object, -1, true);
                }
            }
        }
    }

    public class c extends RecyclerView.t {
        public c() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (so.this.D1 && i10 == 1) {
                so.this.C0.C1();
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int i12 = 0;
            if (i11 != 0) {
                so.this.La();
                so.this.S0 = false;
            }
            if (so.this.D1 && !so.this.E1 && !so.this.F1 && i11 != 0) {
                so.this.C0.C1();
                if (so.this.f9537w1 == 0.0f) {
                    int X1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).X1();
                    int dj = so.this.dj();
                    if (X1 == 0) {
                        View C = recyclerView.getLayoutManager().C(0);
                        so soVar = so.this;
                        if (C != null) {
                            i12 = dj - C.getTop();
                        }
                        soVar.Li(i12);
                        return;
                    }
                    so.this.Li(dj);
                }
            }
        }
    }

    public class d extends FrameLayoutFix {
        public boolean M;
        public float N;
        public float O;
        public int P;
        public float Q;

        public d(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.M = true;
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = getChildAt(i10);
                    if ((childAt instanceof c0) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                        float left = childAt.getLeft() + childAt.getTranslationX();
                        float top = childAt.getTop() + childAt.getTranslationY();
                        if (x10 >= left && x10 < left + childAt.getMeasuredWidth() && y10 >= top && y10 < top + childAt.getMeasuredHeight()) {
                            this.M = false;
                            return false;
                        }
                    }
                }
            }
            return this.M;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.P;
            if (!(i12 == 0 || measuredHeight == i12)) {
                so.this.gm();
            }
            this.P = measuredHeight;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float y10 = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                this.N = motionEvent.getX();
                this.O = y10;
                float translationY = so.this.H0.getTranslationY() + so.Hj();
                so.this.S0 = false;
                float f10 = this.O;
                if (f10 >= translationY && f10 <= translationY + so.Bj() && so.this.H0 != null && so.this.H0.getParent() != null) {
                    so.this.T0 = 2;
                    so.this.S0 = true;
                    so.this.Mm(true);
                } else if (so.this.f9537w1 != 0.0f || !so.this.si(getMeasuredWidth(), this.O) || so.this.yi() >= so.this.Tl()) {
                    so.this.T0 = 1;
                    so.this.Mm(true);
                } else {
                    so.this.T0 = 0;
                    so.this.Mm(false);
                }
            }
            int i10 = so.this.T0;
            if (i10 == 0) {
                so.this.C0.dispatchTouchEvent(motionEvent);
                if (!so.this.U0 && !so.this.V0) {
                    so.this.gj(motionEvent);
                    if (motionEvent.getAction() == 2 && y10 < this.Q && so.this.yi() == so.this.Tl()) {
                        so.this.T0 = 3;
                        so.this.C0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                        so.this.C0.C1();
                        so.this.Mm(true);
                    }
                }
            } else if (i10 == 1) {
                so.this.E0.dispatchTouchEvent(motionEvent);
            } else if (i10 == 2) {
                if (!so.this.U0) {
                    if (!so.this.D1) {
                        so.this.gj(motionEvent);
                    } else if (motionEvent.getAction() == 1) {
                        so.this.E0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                    } else {
                        so.this.E0.dispatchTouchEvent(motionEvent);
                    }
                }
                motionEvent.offsetLocation(0.0f, -so.this.H0.getTranslationY());
                if (!so.this.S0) {
                    so.this.T0 = 1;
                    so.this.H0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                } else {
                    so.this.H0.dispatchTouchEvent(motionEvent);
                }
            } else if (i10 == 3) {
                so.this.gj(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                so.this.T0 = -1;
            }
            this.Q = y10;
            return true;
        }
    }

    public class e extends CustomRecyclerView {
        public e(Context context) {
            super(context);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z10) {
            super.requestDisallowInterceptTouchEvent(z10);
            so.this.Km(z10);
        }
    }

    public class f extends ud.n {
        public f(Context context, v4 v4Var) {
            super(context, v4Var);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z10) {
            super.requestDisallowInterceptTouchEvent(z10);
            so.this.Km(z10);
        }
    }

    public class g extends RecyclerView.t {
        public boolean f9548a;
        public int f9549b = 0;

        public g() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 1) {
                x.c(so.this.U9());
                so.this.La();
            }
            this.f9549b = so.this.W0;
            so.this.W0 = i10;
            so.this.Ni();
        }

        @Override
        public void b(androidx.recyclerview.widget.RecyclerView r3, int r4, int r5) {
            throw new UnsupportedOperationException("Method not decompiled: de.so.g.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    public class h extends iq {
        public h(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void D1(ra raVar, k3 k3Var, int i10, int i11) {
            if (raVar.j() == R.id.btn_slowMode) {
                so.this.f9525q1.X(so.Ej(ob.f.f19344a[i10]));
                so.this.D0.n3(so.this.f9525q1);
                so.this.im();
                so.this.Ri();
            } else if (raVar.j() == R.id.btn_chatTtl) {
                so.this.f9529s1.X(so.Ij(ob.f.f19345b[i10], so.this.Tj()));
                so.this.D0.n3(so.this.f9529s1);
                so.this.im();
                so.this.Ri();
            }
        }

        @Override
        public void I2(ra raVar, f3 f3Var) {
            int j10 = raVar.j();
            if (j10 == R.id.shadowBottom || j10 == R.id.shadowTop) {
                f3Var.setAlpha(0.0f);
            }
        }

        @Override
        public void K2(ra raVar, k3 k3Var) {
            super.K2(raVar, k3Var);
            k3Var.setShowOnlyValue(raVar.j() == R.id.btn_slowMode || raVar.j() == R.id.btn_chatTtl);
        }

        @Override
        public void R2(de.ra r18, uc.c r19, boolean r20) {
            throw new UnsupportedOperationException("Method not decompiled: de.so.h.R2(de.ra, uc.c, boolean):void");
        }

        @Override
        public void Y1(ra raVar, int i10, ne.o oVar) {
            oVar.setEnabled(false);
            oVar.setChat((c3) raVar.d());
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            if (raVar.j() == R.id.S) {
                ((ne.d) viewGroup.getChildAt(1)).k(so.this.f24495b, so.this.f9520o0);
            }
            if (so.this.Uj()) {
                so.this.Vl(raVar, viewGroup, y1Var);
            }
        }

        @Override
        public void y2(ra raVar, int i10, RecyclerView recyclerView) {
            if (recyclerView.getAdapter() != so.this.f9538x0) {
                recyclerView.setAdapter(so.this.f9538x0);
            }
        }
    }

    public class i extends RecyclerView.t {
        public i() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            so soVar = so.this;
            boolean z10 = true;
            if (i10 != 1 || !soVar.G0.z1()) {
                z10 = false;
            }
            soVar.U0 = z10;
        }
    }

    public class j extends ClickableSpan {
        public final TdApi.Chat f9553a;

        public j(TdApi.Chat chat) {
            this.f9553a = chat;
        }

        @Override
        public void onClick(View view) {
            so.this.f24495b.hd().C4(so.this, this.f9553a, new hj.j().h().n());
        }
    }

    public class k implements s5.a {
        public k() {
        }

        @Override
        public boolean a(s5 s5Var, TdApi.Chat chat) {
            so.this.Pl(s5Var, chat.f19908id, false);
            return true;
        }

        @Override
        public boolean b() {
            return true;
        }
    }

    public class l extends ClickableSpan {
        public final int f9556a;
        public final long f9557b;
        public final long f9558c;

        public l(int i10, long j10, long j11) {
            this.f9556a = i10;
            this.f9557b = j10;
            this.f9558c = j11;
        }

        @Override
        public void onClick(View view) {
            so.this.f24495b.hd().h7(so.this, this.f9556a == 0 ? this.f9557b : this.f9558c, new hj.j().h().n());
        }
    }

    public static class m {
        public TdApi.Chat f9559a;
        public p7 f9560b;
        public boolean f9561c;

        public m(TdApi.Chat chat, p7 p7Var, boolean z10) {
            this.f9559a = chat;
            this.f9560b = p7Var;
            this.f9561c = z10;
        }
    }

    public class n extends RecyclerView.o {
        public n() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            RecyclerView.c0 l02 = recyclerView.l0(view);
            if (l02 == null || l02.k() != so.this.D0.D0().size() - 1) {
                rect.setEmpty();
                return;
            }
            int measuredHeight = recyclerView.getMeasuredHeight();
            int Bj = (measuredHeight - so.Bj()) - so.Dj();
            int pj = so.this.pj();
            if (!so.this.Xl()) {
                rect.bottom = pj - so.Bj();
                return;
            }
            int max = Math.max(0, (recyclerView.getMeasuredHeight() + so.Bj()) - pj);
            if (max > 0) {
                rect.bottom = Bj - Math.max(0, measuredHeight - (pj + max));
            } else {
                rect.bottom = Bj;
            }
        }
    }

    public class o extends RecyclerView.o {
        public final j10<?> f9563a;

        public o(j10<?> j10Var) {
            this.f9563a = j10Var;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int i10;
            RecyclerView.c0 l02 = recyclerView.l0(view);
            if (l02 != null) {
                int k10 = l02.k();
                int D = recyclerView.getAdapter().D();
                boolean z10 = k10 == -1;
                int dj = (k10 == 0 || z10) ? so.this.dj() : 0;
                if (!so.this.Xl() || ((k10 != D - 1 && !z10) || (view instanceof n2) || (view instanceof c1))) {
                    i10 = 0;
                } else {
                    i10 = Math.max(0, (((recyclerView.getMeasuredHeight() - so.Dj()) - (z10 ? view.getMeasuredHeight() : this.f9563a.kf() - ap.W(8))) - so.uj()) - so.Bj());
                }
                rect.set(0, dj, 0, i10);
                return;
            }
            rect.set(0, so.this.dj(), 0, 0);
        }
    }

    public static class p extends View {
        public float f9565a;

        public p(Context context) {
            super(context);
        }

        public void a(float f10) {
            if (this.f9565a != f10) {
                this.f9565a = f10;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.f9565a != 0.0f) {
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(0.0f, measuredHeight - (this.f9565a * measuredHeight), getMeasuredWidth(), measuredHeight, y.g(ae.j.u()));
            }
        }
    }

    public so(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Ak(TdApi.SearchMessagesFilter searchMessagesFilter, int i10) {
        if (!Sa()) {
            Xm(searchMessagesFilter, i10);
            if (!Xj(searchMessagesFilter)) {
                int i11 = this.I1 - 1;
                this.I1 = i11;
                if (i11 == 0) {
                    n9();
                }
            }
        }
    }

    public static int Bj() {
        return ap.W(39);
    }

    public void Bk(TdApi.SearchMessagesFilter searchMessagesFilter, int i10) {
        if (!Sa()) {
            Xm(searchMessagesFilter, i10);
        }
    }

    public void Bl(final long j10, TdApi.Object object) {
        if (object.getConstructor() == -1035719349) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.Al(j10);
                }
            });
        }
    }

    public void Ck(final TdApi.SearchMessagesFilter searchMessagesFilter, boolean z10, TdApi.Object object) {
        final int i10;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.e("TDLib error getMessageCount chatId:%d, filter:%s, returnLocal:%b", Long.valueOf(C9()), searchMessagesFilter, Boolean.valueOf(z10));
            i10 = -1;
        } else if (constructor != 1295577348) {
            Log.unexpectedTdlibResponse(object, TdApi.GetChatMessageCount.class, TdApi.Count.class, TdApi.Error.class);
            return;
        } else {
            i10 = ((TdApi.Count) object).count;
        }
        if (z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.Ak(searchMessagesFilter, i10);
                }
            });
            if (i10 == -1) {
                zj(searchMessagesFilter, false);
                return;
            }
            return;
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Bk(searchMessagesFilter, i10);
            }
        });
    }

    public static int Dj() {
        return ap.W(3);
    }

    public void Dk(long j10) {
        if (!Sa() && this.f9520o0.f19908id == j10) {
            Qm(true);
            this.D0.p3(R.id.btn_notifications);
        }
    }

    public void Dl(final long j10, TdApi.Object object) {
        if (object.getConstructor() == -1601123095) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.Cl(j10);
                }
            });
        }
    }

    public static CharSequence Ej(int i10) {
        if (i10 == 0) {
            return w.i1(R.string.SlowModeDisabled);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j10 = i10;
        if (timeUnit.toHours(j10) > 0) {
            return w.q2(R.string.SlowModeHours, timeUnit.toHours(j10));
        }
        if (timeUnit.toMinutes(j10) > 0) {
            return w.q2(R.string.SlowModeMinutes, timeUnit.toMinutes(j10));
        }
        return w.q2(R.string.SlowModeSeconds, j10);
    }

    public void Ek(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (!Sa() && notificationSettingsScope.getConstructor() == this.f24495b.ka().j2(this.f9520o0.f19908id).getConstructor()) {
            Qm(true);
            this.D0.p3(R.id.btn_notifications);
        }
    }

    public void El() {
        this.D0.p3(R.id.btn_manageInviteLinks);
    }

    public static int Fj(int i10) {
        return Math.max(0, (i10 - a0.i(73.0f)) - a0.i(17.0f));
    }

    public void Fk(long j10, TdApi.Object object) {
        this.f24495b.v4().o(new TdApi.SetChatDiscussionGroup(this.f9520o0.f19908id, j10), this.f24495b.na());
    }

    public void Fl(TdApi.Object object, Runnable runnable) {
        TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr;
        for (TdApi.ChatInviteLinkCount chatInviteLinkCount : ((TdApi.ChatInviteLinkCounts) object).inviteLinkCounts) {
            this.f9540y0 += chatInviteLinkCount.inviteLinkCount;
            this.f9542z0 += chatInviteLinkCount.revokedInviteLinkCount;
        }
        runnable.run();
    }

    public void Gk(v4 v4Var, final long j10) {
        this.f24495b.v4().o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(ob.a.p(j10), true), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                so.this.Fk(j10, object);
            }
        });
        v4Var.Zb();
    }

    public void Gl(final Runnable runnable, final TdApi.Object object) {
        if (object.getConstructor() == 920326637) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    so.this.Fl(object, runnable);
                }
            });
        }
    }

    public static int Hj() {
        return a0.i(6.0f);
    }

    public static void Hk(kb.l lVar, TdApi.Object object) {
        lVar.a(((TdApi.Chat) object).f19908id);
    }

    public void Hl(Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            this.f9542z0 += ((TdApi.ChatInviteLinks) object).totalCount;
        }
        wd(runnable);
    }

    public static CharSequence Ij(int i10, boolean z10) {
        if (i10 == 0) {
            return w.i1(z10 ? R.string.ChannelTtlDisabled : R.string.ChatTtlDisabled);
        }
        return w.m1(z10 ? R.string.ChannelTtlEnabled : R.string.ChatTtlEnabled, w.v0(i10));
    }

    public void Ik(final kb.l lVar, final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -1601123095) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.Hk(l.this, object);
                }
            });
        }
    }

    public void Il(final Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            this.f9540y0 += ((TdApi.ChatInviteLinks) object).totalCount;
        }
        this.f24495b.v4().o(new TdApi.GetChatInviteLinks(this.f9520o0.f19908id, this.f24495b.fa(), true, 0, null, 1), new Client.g() {
            @Override
            public final void r2(TdApi.Object object2) {
                so.this.Hl(runnable, object2);
            }
        });
    }

    public Object Jk(long j10, long j11, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        return new l(i12, j10, j11);
    }

    public void Jl(View view) {
        v4<?> oj = oj();
        if (oj != null) {
            ((j10) oj).Eg(false);
        }
    }

    public void Kl(ra raVar, View view, int i10, ra raVar2, TextView textView, iq iqVar) {
        TdApi.SupergroupFullInfo supergroupFullInfo;
        boolean z10 = iqVar.y0().get(R.id.btn_prehistoryMode) == R.id.btn_visible;
        if (this.f9532u0 == null || z10) {
            int i11 = R.string.ChatHistoryHiddenInfo;
            if (z10 || (supergroupFullInfo = this.f9536w0) == null || supergroupFullInfo.linkedChatId == 0) {
                if (z10) {
                    i11 = R.string.ChatHistoryVisibleInfo;
                }
                raVar.W(i11);
            } else {
                raVar.X(new SpannableStringBuilder(w.i1(R.string.ChatHistoryHiddenInfo)).append((CharSequence) "\n\n").append(w.m1(R.string.ChatHistoryWarnLinkedChannel, this.f24495b.U3(this.f9536w0.linkedChatId))));
            }
        } else {
            raVar.X(w.o2(R.string.ChatHistoryPartiallyHiddenInfo, 100L));
        }
        iqVar.r3(iqVar.F0(raVar));
    }

    public void Lk(final long j10, final long j11, final kb.l lVar) {
        if (j10 != 0) {
            Ud(w.h1(R.string.LinkGroupConfirmOverride, new w.f() {
                @Override
                public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
                    Object Jk;
                    Jk = so.this.Jk(j11, j10, charSequence, i10, i11, i12, z10);
                    return Jk;
                }
            }, this.f24495b.U3(j11), this.f24495b.U3(j10)), w.i1(R.string.LinkGroupConfirmOverrideDone), R.drawable.baseline_remove_circle_24, 2, new Runnable() {
                @Override
                public final void run() {
                    l.this.a(j11);
                }
            });
        } else {
            lVar.a(j11);
        }
    }

    public void Ll(boolean z10, long j10, long j11, TdApi.Error error) {
        if (j11 != 0) {
            this.f24495b.v4().o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(ob.a.p(j11), z10), this.f24495b.na());
        }
    }

    public void Mk(final v4 v4Var, final long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        final kb.l rnVar = new kb.l() {
            @Override
            public final void a(long j11) {
                so.this.Gk(v4Var, j11);
            }
        };
        if (ob.a.g(j10)) {
            this.f24495b.v4().o(new TdApi.UpgradeBasicGroupChatToSupergroupChat(j10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.Ik(rnVar, object);
                }
            });
        } else if (supergroupFullInfo != null) {
            final long j11 = supergroupFullInfo.linkedChatId;
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.Lk(j11, j10, rnVar);
                }
            });
        }
    }

    public void Ml(final boolean z10) {
        this.f24495b.Qe(this.f9520o0.f19908id, new o6.r() {
            @Override
            public final void a(long j10, long j11, TdApi.Error error) {
                so.this.Ll(z10, j10, j11, error);
            }
        });
    }

    public Object Nk(long j10, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        return new a(i12, j10);
    }

    public void Nl(boolean z10, TdApi.Object object) {
        this.f24495b.v4().o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(this.f9534v0.f19965id, z10), this.f24495b.na());
    }

    public static boolean Ok(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void Ol(boolean z10, int i10, SparseIntArray sparseIntArray) {
        final boolean z11 = sparseIntArray.get(R.id.btn_prehistoryMode) == R.id.btn_visible;
        if (z10 == z11) {
            return;
        }
        if (this.f9532u0 != null) {
            Vd(w.H0(this, R.string.UpgradeChatPrompt, new Object[0]), w.i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    so.this.Ml(z11);
                }
            });
            return;
        }
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
        if (supergroupFullInfo == null || supergroupFullInfo.linkedChatId == 0) {
            this.f24495b.v4().o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(this.f9534v0.f19965id, z11), this.f24495b.na());
        } else {
            this.f24495b.v4().o(new TdApi.SetChatDiscussionGroup(0L, this.f9520o0.f19908id), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.Nl(z11, object);
                }
            });
        }
        this.D0.p3(R.id.btn_prehistoryMode);
    }

    public void Pk(final v4 v4Var, final long j10, boolean z10, boolean z11, boolean z12, final TdApi.SupergroupFullInfo supergroupFullInfo) {
        final Runnable gnVar = new Runnable() {
            @Override
            public final void run() {
                so.this.Mk(v4Var, j10, supergroupFullInfo);
            }
        };
        if (!z10) {
            gnVar.run();
            return;
        }
        CharSequence h12 = w.h1(R.string.LinkGroupConfirm, new w.f() {
            @Override
            public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z13) {
                Object Nk;
                Nk = so.this.Nk(j10, charSequence, i10, i11, i12, z13);
                return Nk;
            }
        }, this.f24495b.U3(j10), this.f24495b.U3(this.f9520o0.f19908id));
        SpannableStringBuilder spannableStringBuilder = h12 instanceof SpannableStringBuilder ? (SpannableStringBuilder) h12 : new SpannableStringBuilder(h12);
        if (!z11 || !z12) {
            if (z11) {
                spannableStringBuilder.append((CharSequence) "\n\n").append(w.H0(this, R.string.LinkGroupConfirmWarnPrivateGroup, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append(w.H0(this, R.string.LinkGroupConfirmWarnPrivateChannel, new Object[0]));
            }
        }
        if (supergroupFullInfo != null && !supergroupFullInfo.isAllHistoryAvailable) {
            spannableStringBuilder.append((CharSequence) "\n\n").append(w.H0(this, R.string.LinkGroupConfirmWarnPreHistory, new Object[0]));
        }
        ee(spannableStringBuilder, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.LinkGroupConfirmDone), w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_link_24, R.drawable.baseline_cancel_24}, new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Ok;
                Ok = so.Ok(gnVar, view, i10);
                return Ok;
            }
        });
    }

    public void Qk(TdApi.BasicGroup basicGroup, boolean z10) {
        TdApi.BasicGroup basicGroup2;
        if (!Sa() && (basicGroup2 = this.f9530t0) != null && basicGroup2.f19904id == basicGroup.f19904id) {
            Sm();
            if (z10) {
                Cl(basicGroup.upgradedToSupergroupId);
            }
        }
    }

    public void Rk(long j10, TdApi.ChatMember chatMember) {
        ed.n nVar;
        if (this.f9520o0.f19908id == j10 && (nVar = this.f9538x0) != null) {
            nVar.q0(chatMember);
        }
    }

    public static void Sk(boolean z10, u0 u0Var) {
        u0Var.setTranslationX(z10 ? 0.0f : a0.i(39.0f));
    }

    public void Tk(long j10) {
        TdApi.Chat chat = this.f9520o0;
        if (chat != null && chat.f19908id == j10) {
            final boolean Z8 = this.f24495b.hd().Z8(W9(), this.R, this.f9520o0, false);
            d1 d1Var = this.R;
            if (d1Var != null) {
                d1Var.S3(W9(), R.id.menu_btn_call, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        so.Sk(Z8, (u0) obj);
                    }
                });
            }
        }
    }

    public void Uk(long j10) {
        if (!Sa() && C9() == j10) {
            Sm();
        }
    }

    public void Vk(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (C9() == j10) {
            int L0 = this.D0.L0(R.id.btn_manageInviteLinks);
            int L02 = this.D0.L0(R.id.btn_manageJoinRequests);
            if ((chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount == 0) && L02 != -1) {
                this.D0.R1(L02 - 1, 2);
            } else if (chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount <= 0 || L02 != -1 || L0 == -1) {
                this.D0.p3(R.id.btn_manageJoinRequests);
            } else {
                this.D0.Y0(L0 + 1, new ra(11), new ra(5, R.id.btn_manageJoinRequests, 0, R.string.InviteLinkRequests));
            }
        }
    }

    public void Wk(long j10) {
        if (!Sa() && this.f9520o0.f19908id == j10 && this.D0 != null) {
            sn(R.id.btn_chatPermissions);
        }
    }

    public static boolean Xj(TdApi.SearchMessagesFilter searchMessagesFilter) {
        switch (searchMessagesFilter.getConstructor()) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return true;
            default:
                return false;
        }
    }

    public void Xk(long j10) {
        if (!Sa() && this.f9520o0.f19908id == j10) {
            Rm(true);
        }
    }

    public void Yk(long j10) {
        if (!Sa() && this.f9520o0.f19908id == j10) {
            on(false);
        }
    }

    public boolean Zk(View view, int i10) {
        if (i10 == R.id.btn_copyText) {
            ej();
            return true;
        } else if (i10 != R.id.btn_edit) {
            return true;
        } else {
            jj();
            return true;
        }
    }

    public boolean ak(View view, int i10) {
        if (i10 == R.id.btn_addAdmin) {
            li(1);
        } else if (i10 == R.id.btn_addMember) {
            li(0);
        } else if (i10 == R.id.btn_banMember) {
            li(2);
        }
        return true;
    }

    public void al(ud.m mVar, float f10, boolean z10, float f11, float f12) {
        mn();
    }

    public void bk(AtomicReference atomicReference, kb.b bVar, TdApi.Object object) {
        atomicReference.set(object);
        this.f24495b.hd().post(bVar);
    }

    public boolean bl(TdApi.User user, View view, int i10) {
        if (i10 == R.id.btn_deleteMember) {
            this.f24495b.v4().o(new TdApi.SetChatMemberStatus(this.f9520o0.f19908id, new TdApi.MessageSenderUser(user.f19979id), new TdApi.ChatMemberStatusBanned()), this.f24495b.na());
            return true;
        } else if (i10 != R.id.btn_openChat) {
            return true;
        } else {
            this.f24495b.hd().u7(this, user.f19979id, null);
            return true;
        }
    }

    public void ck(boolean z10, f5 f5Var, View view, TdApi.Error error) {
        String str;
        if (z10) {
            f5Var.Zb();
            return;
        }
        x2.h g10 = f5Var.t().I3().g(view);
        o6 o6Var = this.f24495b;
        if (error == null || !"USER_PRIVACY_RESTRICTED".equals(error.message)) {
            str = t2.z5(error);
        } else {
            str = w.i1(R.string.errorPrivacyAddMember);
        }
        g10.F(f5Var, o6Var, R.drawable.baseline_error_24, str);
    }

    public void cl(long j10, long j11, TdApi.MessageContent messageContent) {
        if (!Sa() && this.f9520o0.f19908id == j10) {
            lj(j11, messageContent);
        }
    }

    public void dk(final f5 f5Var, final View view, final boolean z10, final TdApi.Error error) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.ck(z10, f5Var, view, error);
            }
        });
    }

    public void dl(TdApi.Message message, long j10) {
        if (!Sa() && this.f9520o0.f19908id == message.chatId) {
            Cm(new long[]{j10});
        }
    }

    public void ek(int i10, f5 f5Var, View view, TdApi.ChatMember chatMember, int i11, SparseIntArray sparseIntArray) {
        int i12;
        if (i11 == R.id.btn_addMember) {
            if (sparseIntArray.size() > 0) {
                switch (sparseIntArray.get(R.id.btn_addMember)) {
                    case R.id.btn_forwardLast100:
                        i12 = 100;
                        break;
                    case R.id.btn_forwardLast15:
                        i12 = 15;
                        break;
                    case R.id.btn_forwardLast50:
                        i12 = 50;
                        break;
                }
                ii(i10, f5Var, view, chatMember, i12, false);
            }
            i12 = 0;
            ii(i10, f5Var, view, chatMember, i12, false);
        }
    }

    public void el(TdApi.Message message) {
        if (!Sa() && this.f9520o0.f19908id == message.chatId) {
            mi(message);
        }
    }

    public boolean fk(int i10, f5 f5Var, View view, TdApi.ChatMember chatMember, int i11, View view2, int i12) {
        if (i12 != R.id.btn_addMember) {
            return true;
        }
        ii(i10, f5Var, view, chatMember, i11, false);
        return true;
    }

    public void fl(long j10, long[] jArr) {
        if (!Sa() && this.f9520o0.f19908id == j10) {
            Cm(jArr);
        }
    }

    public void gk(f5 f5Var, View view, boolean z10, TdApi.Error error) {
        if (z10) {
            f5Var.Zb();
        } else {
            f5Var.t().I3().g(view).F(f5Var, this.f24495b, R.drawable.baseline_error_24, t2.z5(error));
        }
    }

    public void gl(boolean z10, TdApi.Object object) {
        if (t2.p3(object)) {
            j0.z0(w.m1(z10 ? R.string.BlockedBot : R.string.BlockedUser, this.f24495b.U3(this.f9520o0.f19908id)), 0);
        } else {
            this.f24495b.na().r2(object);
        }
    }

    public static float hj(float f10) {
        float a32 = d1.a3(true) * f10;
        float i10 = a0.i(4.0f);
        return Math.max(0.0f, a32 - i10) / (d1.a3(false) - i10);
    }

    public boolean hk(TdApi.ChatMember chatMember, final f5 f5Var, final View view, View view2, int i10) {
        if (i10 != R.id.btn_blockSender) {
            return true;
        }
        this.f24495b.Mb(this.f9520o0.f19908id, chatMember.memberId, new TdApi.ChatMemberStatusBanned(), chatMember.status, new o6.i() {
            @Override
            public final void a(boolean z10, TdApi.Error error) {
                so.this.gk(f5Var, view, z10, error);
            }
        });
        return true;
    }

    public boolean hl(final boolean z10, View view, int i10) {
        if (!Sa() && i10 == R.id.btn_blockSender) {
            o6 o6Var = this.f24495b;
            o6Var.d2(o6Var.Ab(this.f9520o0.f19908id), true, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.gl(z10, object);
                }
            });
        }
        return true;
    }

    public void ik() {
        ri(true);
    }

    public void il(boolean z10, TdApi.Object object) {
        if (t2.p3(object)) {
            j0.z0(w.m1(z10 ? R.string.UnblockedBot : R.string.UnblockedUser, this.f24495b.U3(this.f9520o0.f19908id)), 0);
        } else {
            this.f24495b.na().r2(object);
        }
    }

    public void jk(TdApi.Object object) {
        en(t2.z5(object));
    }

    public void jl(TdApi.Message message) {
        if (!Sa()) {
            mi(message);
        }
    }

    public void kk(int[] iArr, ArrayList arrayList) {
        Wm(false);
        if (iArr[1] == arrayList.size()) {
            Zb();
        }
    }

    public void kl(TdApi.Object object) {
        if (!Sa() && object.getConstructor() == -497558622) {
            TdApi.ChatMembers chatMembers = (TdApi.ChatMembers) object;
            ed.n nVar = this.f9538x0;
            if (nVar != null) {
                nVar.p0(chatMembers.members);
            }
        }
    }

    public void lk(final int[] iArr, final ArrayList arrayList, final TdApi.Object object) {
        iArr[0] = iArr[0] + 1;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    so.this.jk(object);
                }
            });
        } else if (constructor == -722616727) {
            iArr[1] = iArr[1] + 1;
        }
        if (iArr[0] == arrayList.size()) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    so.this.kk(iArr, arrayList);
                }
            });
        }
    }

    public void ll() {
        if (!Sa()) {
            this.D0.p3(R.id.btn_notifications);
        }
    }

    public static void mj(List<j10<?>> list, org.thunderdog.challegram.a aVar, o6 o6Var) {
        TdApi.SearchMessagesFilter[] sj = sj();
        ib.b.m(list, list.size() + sj.length);
        for (TdApi.SearchMessagesFilter searchMessagesFilter : sj) {
            list.add(j10.Ng(aVar, o6Var, searchMessagesFilter));
        }
    }

    public void mk(final ArrayList arrayList) {
        final int[] iArr = new int[2];
        Client.g goVar = new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                so.this.lk(iArr, arrayList, object);
            }
        };
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f24495b.v4().o((TdApi.Function) it.next(), goVar);
        }
    }

    public void ml(TdApi.SecretChat secretChat) {
        TdApi.SecretChat secretChat2;
        if (this.f9520o0 != null && (secretChat2 = this.f9526r0) != null && secretChat2.f19960id == secretChat.f19960id) {
            this.f9526r0 = secretChat;
            Ti();
        }
    }

    public static boolean nj(TdApi.Message message) {
        return message.sendingState == null && message.schedulingState == null;
    }

    public void nk(TdApi.Error error) {
        en(t2.z5(error));
        Wm(false);
    }

    public void nl(TdApi.Supergroup supergroup) {
        TdApi.Supergroup supergroup2;
        if (!Sa() && (supergroup2 = this.f9534v0) != null && supergroup2.f19965id == supergroup.f19965id) {
            this.f9534v0 = supergroup;
            bj();
            Si();
            on(false);
        }
    }

    public void ok(ArrayList arrayList, Runnable runnable, long j10, long j11, final TdApi.Error error) {
        if (error != null) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    so.this.nk(error);
                }
            });
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TdApi.Function function = (TdApi.Function) it.next();
            int constructor = function.getConstructor();
            if (constructor == -540350914) {
                ((TdApi.SetChatSlowModeDelay) function).chatId = j11;
            } else if (constructor == 164282047) {
                ((TdApi.SetChatTitle) function).chatId = j11;
            } else if (constructor == 1957213277) {
                ((TdApi.SetChatDescription) function).chatId = j11;
            } else {
                throw new UnsupportedOperationException(function.toString());
            }
        }
        runnable.run();
    }

    public void ol(TdApi.Supergroup supergroup) {
        TdApi.Supergroup supergroup2;
        if (!Sa() && (supergroup2 = this.f9534v0) != null && supergroup2.f19965id == supergroup.f19965id) {
            wm(supergroup);
        }
    }

    public void pk(int i10, ra raVar, y1 y1Var, String str) {
        Ri();
    }

    public void pl(TdApi.User user) {
        if (!Sa()) {
            this.f9524q0 = user;
            on(true);
            bj();
            Xi();
        }
    }

    public void qk(View view, int i10) {
        if (i10 != 0) {
            this.A1 = view;
            im();
        }
    }

    public Object ql(TdApi.ChatInviteLink chatInviteLink, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.h2(new y8(this.f24493a, this.f24495b), chatInviteLink.creatorUserId);
        }
        return null;
    }

    public boolean rk(View view, int i10) {
        if (i10 != R.id.btn_open) {
            switch (i10) {
                case R.id.btn_changePhotoCamera:
                    j0.Y(this.f24493a);
                    return true;
                case R.id.btn_changePhotoDelete:
                    this.f24495b.v4().o(new TdApi.SetChatPhoto(this.f9520o0.f19908id, null), this.f24495b.na());
                    return true;
                case R.id.btn_changePhotoGallery:
                    j0.a0(false);
                    return true;
                default:
                    return true;
            }
        } else {
            nm();
            return true;
        }
    }

    public static Object rl(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return w.d2(z10);
        }
        return null;
    }

    public static TdApi.SearchMessagesFilter[] sj() {
        boolean U2 = he.i.c2().U2();
        TdApi.SearchMessagesFilter[] searchMessagesFilterArr = U2 ? K1 : J1;
        if (searchMessagesFilterArr != null) {
            return searchMessagesFilterArr;
        }
        if (U2) {
            TdApi.SearchMessagesFilter[] searchMessagesFilterArr2 = {new TdApi.SearchMessagesFilterPhoto(), new TdApi.SearchMessagesFilterVideo(), new TdApi.SearchMessagesFilterDocument(), new TdApi.SearchMessagesFilterUrl(), new TdApi.SearchMessagesFilterAudio(), new TdApi.SearchMessagesFilterAnimation(), new TdApi.SearchMessagesFilterVoiceNote(), new TdApi.SearchMessagesFilterVideoNote()};
            K1 = searchMessagesFilterArr2;
            return searchMessagesFilterArr2;
        }
        TdApi.SearchMessagesFilter[] searchMessagesFilterArr3 = {new TdApi.SearchMessagesFilterPhotoAndVideo(), new TdApi.SearchMessagesFilterDocument(), new TdApi.SearchMessagesFilterUrl(), new TdApi.SearchMessagesFilterAudio(), new TdApi.SearchMessagesFilterAnimation(), new TdApi.SearchMessagesFilterVoiceNote(), new TdApi.SearchMessagesFilterVideoNote()};
        J1 = searchMessagesFilterArr3;
        return searchMessagesFilterArr3;
    }

    public boolean sk(View view, int i10) {
        if (i10 != R.id.btn_destroyChat) {
            return true;
        }
        this.f24495b.v4().o(new TdApi.DeleteChat(ob.a.b(this.f9534v0.f19965id)), this.f24495b.na());
        this.f24495b.hd().U2(this, C9());
        return true;
    }

    public void sl(TdApi.Object object) {
        TdApi.ChatInviteLink chatInviteLink;
        TdApi.ChatInviteLink[] chatInviteLinkArr = ((TdApi.ChatInviteLinks) object).inviteLinks;
        int length = chatInviteLinkArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                chatInviteLink = null;
                break;
            }
            chatInviteLink = chatInviteLinkArr[i10];
            if (chatInviteLink.isPrimary && !chatInviteLink.isRevoked) {
                break;
            }
            i10++;
        }
        if (chatInviteLink != null) {
            q4(chatInviteLink);
        }
    }

    public boolean tk(View view, int i10) {
        if (i10 == R.id.btn_destroyChat) {
            String i12 = w.i1(this.f9534v0.isChannel ? R.string.DestroyChannelHint : R.string.DestroyGroupHint);
            int[] iArr = {R.id.btn_destroyChat, R.id.btn_cancel};
            String[] strArr = new String[2];
            strArr[0] = w.i1(this.f9534v0.isChannel ? R.string.DestroyChannel : R.string.DestroyGroup);
            strArr[1] = w.i1(R.string.Cancel);
            ee(i12, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view2, int i11) {
                    boolean sk;
                    sk = so.this.sk(view2, i11);
                    return sk;
                }
            });
        }
        return true;
    }

    public void tl(final TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    so.this.sl(object);
                }
            });
        }
    }

    public static int uj() {
        return ap.W(2) + ap.W(8);
    }

    public Object uk(TdApi.Chat chat, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        return new j(chat);
    }

    public boolean ul(TdApi.ChatInviteLink chatInviteLink, View view, int i10) {
        if (i10 != R.id.btn_revokeLink) {
            return true;
        }
        this.f24495b.v4().o(new TdApi.RevokeChatInviteLink(this.f9520o0.f19908id, chatInviteLink.inviteLink), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                so.this.tl(object);
            }
        });
        return true;
    }

    public void vk() {
        this.f24495b.v4().o(new TdApi.SetChatDiscussionGroup(this.f9520o0.f19908id, 0L), this.f24495b.na());
    }

    public boolean vl(final TdApi.ChatInviteLink chatInviteLink, View view, int i10) {
        switch (i10) {
            case R.id.btn_copyLink:
                j0.i(chatInviteLink.inviteLink, R.string.CopiedLink);
                break;
            case R.id.btn_manageInviteLinks:
                km();
                break;
            case R.id.btn_manageJoinRequests:
                mm();
                break;
            case R.id.btn_revokeLink:
                ee(w.i1(this.f24495b.O6(this.f9520o0.f19908id) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{w.i1(R.string.RevokeLink), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i11) {
                        return g0.b(this, i11);
                    }

                    @Override
                    public final boolean r3(View view2, int i11) {
                        boolean ul;
                        ul = so.this.ul(chatInviteLink, view2, i11);
                        return ul;
                    }
                });
                break;
            case R.id.btn_shareLink:
                String U3 = this.f24495b.U3(this.f9520o0.f19908id);
                String j12 = w.j1(this.f24495b.O6(this.f9520o0.f19908id) ? R.string.ShareTextChannelLink : R.string.ShareTextChatLink, U3, chatInviteLink.inviteLink);
                String j13 = w.j1(R.string.ShareTextLink, U3, chatInviteLink.inviteLink);
                y00 y00Var = new y00(this.f24493a, this.f24495b);
                y00Var.Vi(new y00.m(j13).E(j12, null));
                y00Var.ej();
                break;
        }
        return true;
    }

    public boolean wk(qj qjVar, c3 c3Var) {
        Pl(qjVar, c3Var.e(), true);
        return true;
    }

    public void wl(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (Sa()) {
            return;
        }
        if (this.f9518n0 == 3) {
            ei(supergroupFullInfo);
        } else {
            di(supergroupFullInfo);
        }
    }

    public boolean xk(TdApi.Chat chat, w.f fVar, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            if (i10 == R.id.btn_new) {
                k kVar = new k();
                ArrayList<d7> arrayList = new ArrayList<>();
                o6 o6Var = this.f24495b;
                arrayList.add(new d7(o6Var, o6Var.da()));
                s5 s5Var = new s5(this.f24493a, this.f24495b);
                s5Var.ef(kVar);
                s5Var.ff(arrayList);
                ac(s5Var);
            } else if (i10 == R.id.btn_search) {
                qj qjVar = new qj(this.f24493a, this.f24495b);
                qjVar.Tg(new qj.b(1).a(new qj.c() {
                    @Override
                    public final boolean a(qj qjVar2, c3 c3Var) {
                        boolean wk;
                        wk = so.this.wk(qjVar2, c3Var);
                        return wk;
                    }
                }));
                ac(qjVar);
            }
        } else if (chat != null) {
            Ud(w.h1(R.string.UnlinkGroupConfirm, fVar, this.f24495b.W3(chat)), w.i1(R.string.UnlinkGroupDone), R.drawable.baseline_remove_circle_24, 2, new Runnable() {
                @Override
                public final void run() {
                    so.this.vk();
                }
            });
        }
        return true;
    }

    public void xl(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (!Sa()) {
            if (this.f24495b.u2(this.f9520o0)) {
                sn(R.id.btn_inviteLink);
            }
            if (Uj()) {
                sn(R.id.btn_channelType);
                sn(R.id.btn_linkedChat);
                int i10 = this.f9518n0;
                if (i10 == 7 || i10 == 6) {
                    int L0 = this.D0.L0(R.id.btn_linkedChat);
                    boolean z10 = true;
                    boolean z11 = L0 != -1;
                    boolean z12 = Ei() && (this.f9518n0 == 7 || supergroupFullInfo.linkedChatId != 0);
                    if (z11 != z12) {
                        if (z12) {
                            int L02 = this.D0.L0(R.id.btn_channelType);
                            if (L02 != -1) {
                                int i11 = L02 + 1;
                                this.D0.D0().add(i11, new ra(11));
                                this.D0.D0().add(L02 + 2, cm());
                                this.D0.M(i11, 2);
                            } else {
                                int L03 = this.D0.L0(R.id.btn_manageInviteLinks);
                                if (L03 != -1) {
                                    this.D0.D0().add(L03, new ra(11));
                                    this.D0.D0().add(L03, cm());
                                    this.D0.M(L03, 2);
                                } else {
                                    int L04 = this.D0.L0(R.id.shadowMiddle);
                                    if (L04 != -1) {
                                        int i12 = L04 + 1;
                                        this.D0.D0().add(i12, new ra(2));
                                        this.D0.D0().add(L04 + 2, cm());
                                        this.D0.D0().add(L04 + 3, new ra(3));
                                        this.D0.M(i12, 3);
                                    } else {
                                        z10 = false;
                                    }
                                }
                            }
                        } else if (this.D0.L0(R.id.btn_channelType) != -1) {
                            this.D0.R1(L0 - 1, 2);
                        } else if (this.D0.L0(R.id.btn_manageInviteLinks) != -1) {
                            this.D0.R1(L0, 2);
                        } else {
                            this.D0.R1(L0 - 1, 3);
                        }
                        if (z10) {
                            im();
                        }
                    }
                }
                Yi();
            }
            Qi();
            Vi();
            if (this.f9518n0 == 7) {
                Mi();
            }
            on(false);
        }
    }

    public void yk() {
        this.f24495b.v4().o(new TdApi.SetChatDiscussionGroup(0L, this.f9520o0.f19908id), this.f24495b.na());
    }

    public void yl(boolean z10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (Sa()) {
            return;
        }
        if (z10) {
            ed.n nVar = this.f9538x0;
            if (nVar != null) {
                nVar.o0(basicGroupFullInfo.members);
            }
            Sm();
            Qi();
            return;
        }
        bi(basicGroupFullInfo);
    }

    public boolean zk(w.f fVar, TdApi.Chat chat, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            Ud(w.h1(R.string.UnlinkChannelConfirm, fVar, this.f24495b.W3(chat)), w.i1(R.string.UnlinkChannelDone), R.drawable.baseline_remove_circle_24, 2, new Runnable() {
                @Override
                public final void run() {
                    so.this.yk();
                }
            });
        }
        return true;
    }

    public void zl(boolean z10, TdApi.UserFullInfo userFullInfo) {
        if (z10) {
            aj();
            Ui();
            return;
        }
        ci(userFullInfo);
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        ud.m mVar;
        int i10 = this.f9518n0;
        if ((i10 == 0 || i10 == 1) && (mVar = this.B0) != null) {
            mVar.setSubtitle(Rl(false));
            this.B0.setExpandedSubtitle(Rl(true));
        }
    }

    @Override
    public void A5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        Rj(notificationSettingsScope);
    }

    @Override
    public boolean A6() {
        return l0.a(this);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void Ac() {
        super.Ac();
        if (this.f9518n0 == 1) {
            this.f24495b.hd().Z8(R.id.menu_secretChat, this.R, this.f9520o0, true);
        }
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.a4(W9(), this, Da());
        }
    }

    public final int Ai() {
        int i10;
        int i11 = this.f9518n0;
        int i12 = 0;
        if (i11 == 1 || i11 == 0) {
            i12 = 0 + a0.i(48.0f);
        }
        if (this.f9518n0 == 1 && ob.a.j(this.f9520o0.f19908id) && this.f24495b.y6(this.f9520o0)) {
            i12 += a0.i(39.0f);
        }
        int W9 = W9();
        if (W9 == R.id.menu_profile) {
            if (Ii()) {
                i12 += a0.i(49.0f);
            }
            if (Ci()) {
                i12 += a0.i(49.0f);
            }
            i10 = a0.i(49.0f);
        } else if (W9 != R.id.menu_profile_manage) {
            i10 = a0.i(49.0f);
        } else if (!Jj()) {
            return i12;
        } else {
            i10 = a0.i(49.0f);
        }
        return i12 + i10;
    }

    public final String[] Aj() {
        ArrayList<j10<?>> qj = qj();
        String[] strArr = new String[qj.size()];
        Iterator<j10<?>> it = qj.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10++;
            strArr[i10] = it.next().X9().toString().toUpperCase();
        }
        return strArr;
    }

    public final void Am() {
        Dm(this.D0.L0(R.id.btn_inviteLink));
    }

    @Override
    public void B0(final TdApi.SecretChat secretChat) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.ml(secretChat);
            }
        });
    }

    @Override
    public void B3(long j10, boolean z10) {
        zd.g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        zd.g0.x(this, j10, i10, z10);
    }

    @Override
    public String B6() {
        return l0.b(this);
    }

    public final int Bi(int i10) {
        int i11;
        if (this.B1 == i10 && (i11 = this.C1) > 0) {
            return i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (ra raVar : this.D0.D0()) {
            i12 += zi(i13, i10, raVar);
            i13++;
        }
        this.B1 = i10;
        this.C1 = i12;
        return i12;
    }

    public final void Bm() {
        if (this.f9518n0 == 3) {
            Dm(this.D0.L0(R.id.membersList));
        }
    }

    @Override
    public long C9() {
        TdApi.Chat chat = this.f9520o0;
        if (chat != null) {
            return chat.f19908id;
        }
        return 0L;
    }

    @Override
    public void Cc(String str) {
        v4<?> oj = oj();
        if (oj != null) {
            ((j10) oj).Ag(str.trim());
        }
    }

    @Override
    public void Ce(int i10, LinearLayout linearLayout) {
        View childAt;
        View findViewById;
        v4<?> oj = oj();
        int i11 = 0;
        ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(0);
        if (viewGroup != null) {
            LinearLayout linearLayout2 = (LinearLayout) viewGroup.getChildAt(0);
            if (linearLayout2 != null) {
                int W9 = W9();
                int i12 = 8;
                if (W9 == R.id.menu_profile) {
                    View findViewById2 = linearLayout2.findViewById(R.id.menu_btn_manage);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(Ii() ? 0 : 8);
                    }
                    View findViewById3 = linearLayout2.findViewById(R.id.menu_btn_addContact);
                    if (findViewById3 != null) {
                        if (Ci()) {
                            i12 = 0;
                        }
                        findViewById3.setVisibility(i12);
                    }
                } else if (W9 == R.id.menu_profile_manage && (findViewById = linearLayout2.findViewById(R.id.menu_btn_more)) != null) {
                    if (Jj()) {
                        i12 = 0;
                    }
                    findViewById.setVisibility(i12);
                }
            }
            LinearLayout linearLayout3 = (LinearLayout) viewGroup.getChildAt(1);
            if (!(linearLayout3 == null || (childAt = linearLayout3.getChildAt(0)) == null)) {
                if (oj == null || !((j10) oj).rf()) {
                    i11 = 4;
                }
                childAt.setVisibility(i11);
            }
            pn();
        }
    }

    public boolean Ci() {
        TdApi.ChatMemberStatus O3 = this.f24495b.O3(this.f9520o0.f19908id);
        return (O3 == null || O3.getConstructor() == -5815259 || (!this.f24495b.A2(this.f9520o0) && !Di() && !Ji())) ? false : true;
    }

    public final String Cj() {
        return this.f24495b.j4(this.f9520o0.f19908id);
    }

    public final void Cm(long[] jArr) {
        int e10 = this.F0.e();
        for (int i10 = 0; i10 < e10; i10++) {
            v4<?> v10 = this.F0.v(i10);
            if (v10 != null) {
                ((j10) v10).zg(jArr);
            }
        }
        zm();
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    public boolean Di() {
        int i10 = this.f9518n0;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        int constructor = this.f9534v0.status.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != -70024163) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) this.f9534v0.status).rights.canRestrictMembers;
    }

    public final void Dm(int i10) {
        if (i10 != -1) {
            this.f9512h1--;
            ra remove = this.D0.D0().remove(i10);
            if (this.f9512h1 == 0) {
                this.D0.D0().remove(i10);
                this.D0.D0().remove(i10);
                this.D0.N(i10, 3);
            } else if (i10 == 1) {
                this.D0.D0().remove(i10);
                this.D0.N(i10, 2);
            } else {
                int i11 = i10 - 1;
                this.D0.D0().remove(i11);
                this.D0.N(i11, 2);
                int i12 = i10 - 1;
                if (i12 >= 0 && i12 < this.D0.D0().size()) {
                    boolean z10 = remove.A() == 38;
                    ra raVar = this.D0.D0().get(i12);
                    int A = raVar.A();
                    int i13 = z10 ? 11 : 1;
                    if (A != i13 && (A == 1 || A == 11)) {
                        raVar.f0(i13);
                        this.D0.I(i12);
                    }
                }
            }
            im();
        }
    }

    @Override
    public void E1(int i10, v4<?> v4Var) {
    }

    public final boolean Ei() {
        return (this.f9536w0 != null && this.f24495b.m2(this.f9520o0)) || (this.f9532u0 != null && this.f24495b.m2(this.f9520o0));
    }

    public final void Cl(final long j10) {
        if (!Sa()) {
            int i10 = this.f9518n0;
            if (i10 != 5 && i10 != 2) {
                return;
            }
            if (!Uj() || this.f24495b.e2().h2(j10) != null) {
                TdApi.Chat W2 = this.f24495b.W2(ob.a.b(j10));
                if (W2 == null) {
                    this.f24495b.v4().o(new TdApi.CreateSupergroupChat(j10, false), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            so.this.Dl(j10, object);
                        }
                    });
                    return;
                }
                ln();
                this.f9532u0 = null;
                this.f9530t0 = null;
                Hm(new m(W2, this.f9522p0, x9().f9561c));
                hn();
                ti();
                on(true);
                return;
            }
            this.f24495b.v4().o(new TdApi.GetSupergroupFullInfo(j10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.Bl(j10, object);
                }
            });
        }
    }

    public final boolean Fi() {
        TdApi.Supergroup supergroup;
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
        return supergroupFullInfo != null && supergroupFullInfo.memberCount < 1000 && (supergroup = this.f9534v0) != null && t2.P2(supergroup.status);
    }

    public final void Fm(boolean z10) {
        final Runnable ulVar = new Runnable() {
            @Override
            public final void run() {
                so.this.El();
            }
        };
        this.f9540y0 = 0;
        this.f9542z0 = 0;
        if (z10) {
            this.f24495b.v4().o(new TdApi.GetChatInviteLinkCounts(this.f9520o0.f19908id), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.Gl(ulVar, object);
                }
            });
        } else {
            this.f24495b.v4().o(new TdApi.GetChatInviteLinks(this.f9520o0.f19908id, this.f24495b.fa(), false, 0, null, 1), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.Il(ulVar, object);
                }
            });
        }
    }

    @Override
    public View G9() {
        return this.B0;
    }

    public final boolean Gi() {
        int i10 = this.f9518n0;
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            return Ei();
        }
        return false;
    }

    public final int Gj() {
        return Bi(this.C0.getMeasuredWidth());
    }

    public final void Gm(int i10) {
        v4<?> oj = oj();
        if (oj != null) {
            ((RecyclerView) oj.get()).scrollBy(0, i10);
        }
    }

    @Override
    public void H(final long j10, final long[] jArr) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.fl(j10, jArr);
            }
        });
    }

    @Override
    public void H0(long j10, String str) {
        zd.g0.t(this, j10, str);
    }

    @Override
    public void H8(LinearLayout linearLayout, float f10) {
        FrameLayoutFix frameLayoutFix = (FrameLayoutFix) linearLayout.getChildAt(0);
        LinearLayout linearLayout2 = (LinearLayout) frameLayoutFix.getChildAt(0);
        LinearLayout linearLayout3 = (LinearLayout) frameLayoutFix.getChildAt(1);
        float a32 = d1.a3(false);
        float interpolation = db.b.f7288c.getInterpolation(f10);
        linearLayout2.setTranslationY((-a32) * hj(f10));
        linearLayout2.setAlpha(1.0f - interpolation);
        for (int i10 = 0; i10 < linearLayout2.getChildCount(); i10++) {
            View childAt = linearLayout2.getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                ud.m mVar = this.B0;
                u0Var.h(R.id.theme_color_headerIcon, R.id.theme_color_white, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f);
            }
        }
        linearLayout3.setTranslationY(a32 - (f10 * a32));
        linearLayout3.setAlpha(interpolation);
    }

    @Override
    public boolean He() {
        return !Uj();
    }

    public final boolean Hi(long j10) {
        TdApi.ChatMember g02;
        TdApi.ChatMember g03;
        int i10 = this.f9518n0;
        if (i10 != 2) {
            if ((i10 != 3 && i10 != 4) || this.f9538x0 == null || this.f24495b.o7(j10) || (g03 = this.f9538x0.g0(j10)) == null || t2.P2(g03.status)) {
                return false;
            }
            long fa2 = this.f24495b.fa();
            if (t2.P2(this.f9534v0.status) || g03.inviterUserId == fa2) {
                return true;
            }
            return t2.H2(this.f9534v0.status) && !t2.H2(g03.status);
        } else if (this.f9538x0 == null || this.f24495b.o7(j10) || this.f9532u0 == null || (g02 = this.f9538x0.g0(j10)) == null || t2.P2(g02.status)) {
            return false;
        } else {
            long fa3 = this.f24495b.fa();
            if (t2.P2(this.f9530t0.status) || this.f9532u0.creatorUserId == fa3 || g02.inviterUserId == fa3) {
                return true;
            }
            return t2.H2(this.f9530t0.status) && !t2.H2(g02.status);
        }
    }

    public void Hm(m mVar) {
        super.Ad(mVar);
        TdApi.Chat chat = mVar.f9559a;
        this.f9520o0 = chat;
        this.f9522p0 = mVar.f9560b;
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup k22 = this.f24495b.e2().k2(ob.a.p(this.f9520o0.f19908id));
                this.f9534v0 = k22;
                this.f9518n0 = k22.isChannel ? 4 : 3;
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                this.f9526r0 = this.f24495b.e2().R1(ob.a.n(this.f9520o0.f19908id));
                this.f9524q0 = this.f24495b.e2().P2(this.f9526r0.userId);
                this.f9518n0 = 1;
                break;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                this.f9530t0 = this.f24495b.e2().S(ob.a.m(this.f9520o0.f19908id));
                this.f9518n0 = 2;
                break;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                this.f9524q0 = this.f24495b.e2().P2(ob.a.q(this.f9520o0.f19908id));
                this.f9518n0 = 0;
                break;
        }
        if (mVar.f9561c) {
            int i10 = this.f9518n0;
            if (i10 == 2) {
                this.f9518n0 = 5;
            } else if (i10 == 3) {
                this.f9518n0 = 6;
            } else if (i10 == 4) {
                this.f9518n0 = 7;
            }
            int i11 = this.f9518n0;
            if (i11 == 5) {
                TdApi.BasicGroupFullInfo O = this.f24495b.e2().O(this.f9530t0.f19904id);
                this.f9532u0 = O;
                if (O == null) {
                    throw new IllegalStateException("id:" + this.f9530t0.f19904id);
                }
            } else if (i11 == 6 || i11 == 7) {
                TdApi.SupergroupFullInfo h22 = this.f24495b.e2().h2(this.f9534v0.f19965id);
                this.f9536w0 = h22;
                if (h22 == null) {
                    throw new IllegalStateException("id:" + this.f9534v0.f19965id);
                }
            }
        }
    }

    @Override
    public void I6(int i10, v4<?> v4Var) {
        super.Ac();
        if (this.C0.getMeasuredWidth() != 0) {
            Pi(v4Var);
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        x0 x0Var = this.f9513i1;
        if (x0Var != null) {
            x0Var.F(Log.TAG_CRASH, w.G2());
            if (this.D0 != null) {
                sn(R.id.btn_description);
            }
        }
        z4 z4Var = this.G0;
        if (z4Var != null) {
            z4Var.s();
        }
        FrameLayoutFix frameLayoutFix = this.Y0;
        int i10 = 5;
        if (frameLayoutFix != null) {
            int childCount = frameLayoutFix.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.Y0.getChildAt(i11);
                if (p0.V(childAt, w.G2() ? 3 : 5)) {
                    if (childAt instanceof u0) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        if (w.G2()) {
                            layoutParams.leftMargin = a0.i(12.0f);
                            layoutParams.rightMargin = 0;
                        } else {
                            layoutParams.rightMargin = a0.i(12.0f);
                            layoutParams.leftMargin = 0;
                        }
                        childAt.setTranslationX(Math.abs(childAt.getTranslationX()) * (w.G2() ? 1.0f : -1.0f));
                    }
                    p0.r0(childAt);
                }
            }
        }
        if (p0.V(this.Z0, w.G2() ? 5 : 3)) {
            p0.r0(this.Z0);
        }
        ImageView imageView = this.f9505a1;
        if (!w.G2()) {
            i10 = 3;
        }
        if (p0.V(imageView, i10)) {
            p0.r0(this.f9505a1);
        }
        v2 v2Var = this.E0;
        if (v2Var != null) {
            v2Var.s();
        }
    }

    @Override
    public boolean Ie() {
        return !bb();
    }

    public final boolean Ii() {
        if (this.f24495b.m2(this.f9520o0)) {
            return true;
        }
        int i10 = this.f9518n0;
        if (i10 == 3) {
            return t2.H2(this.f9534v0.status);
        }
        if (i10 != 4) {
            return false;
        }
        return t2.H2(this.f9534v0.status);
    }

    public final void Im(boolean z10) {
        if (this.R0 != z10) {
            this.R0 = z10;
        }
    }

    @Override
    public void J(int i10, View view) {
        switch (i10) {
            case R.id.menu_btn_addContact:
                ji(view);
                return;
            case R.id.menu_btn_call:
                if (this.f9528s0 != null) {
                    this.f24495b.F4().c0().p0(this, this.f9524q0.f19979id, this.f9528s0);
                    return;
                }
                return;
            case R.id.menu_btn_clear:
                T8();
                return;
            case R.id.menu_btn_manage:
                Sl();
                return;
            case R.id.menu_btn_more:
                fn();
                return;
            case R.id.menu_btn_search:
                v4<?> oj = oj();
                if (oj != null && ((j10) oj).rf()) {
                    Yc();
                    return;
                }
                return;
            case R.id.menu_btn_stopwatch:
                this.f24495b.hd().P8(t(), this.f9520o0);
                return;
            default:
                return;
        }
    }

    @Override
    public void J3(long j10, long j11) {
        g1.i(this, j10, j11);
    }

    @Override
    public qd.c J4(long j10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        v4<?> v10;
        if (this.f9537w1 != 0.0f) {
            return null;
        }
        Iterator<j10<?>> it = this.G1.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() instanceof r10) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        if (!z10 || this.f9535v1 != i10 || (v10 = this.F0.v(i10)) == null) {
            return null;
        }
        return ((r10) v10).J4(j10, searchMessagesFilter);
    }

    @Override
    public void J8(float f10, boolean z10) {
        super.J8(f10, z10);
        this.G0.getTopView().setDisabledFactor(f10);
        Wi();
        Im(f10 != 0.0f);
    }

    @Override
    public int J9() {
        if (Uj()) {
            return 0;
        }
        return R.drawable.baseline_chat_bubble_24;
    }

    @Override
    public void Ja(int i10, int i11) {
        super.Ja(i10, i11);
        iq iqVar = this.D0;
        if (iqVar != null) {
            iqVar.Q5(i10, i11);
        }
    }

    @Override
    public boolean Je() {
        return true;
    }

    public boolean Ji() {
        int i10 = this.f9518n0;
        if (i10 == 2) {
            return t2.P2(this.f9530t0.status);
        }
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        int constructor = this.f9534v0.status.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != -70024163) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) this.f9534v0.status).rights.canPromoteMembers;
    }

    public final boolean Jj() {
        return Fi();
    }

    public final boolean Jm(String str) {
        if (ib.i.i(str) && Gi()) {
            str = w.i1(R.string.Description);
        }
        String str2 = str;
        x0 x0Var = this.f9513i1;
        int i10 = 0;
        if (x0Var != null && x0Var.v().equals(str2)) {
            return false;
        }
        x0 x0Var2 = new x0(this.f24495b, str2, s4.D9(), t.d.C, 7, new hj.q().o(C9()));
        this.f9513i1 = x0Var2;
        if (w.G2()) {
            i10 = Log.TAG_CRASH;
        }
        x0Var2.a(i10 | 8);
        this.f9513i1.B(Fj(a0.g()));
        return true;
    }

    @Override
    public void K2(final TdApi.BasicGroup basicGroup, final boolean z10) {
        int i10 = this.f9518n0;
        if (i10 == 2 || i10 == 5) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.Qk(basicGroup, z10);
                }
            });
        }
    }

    @Override
    public void K8(float f10) {
        if (this.R != null) {
            float hj = hj(f10);
            mn();
            ud.x0 filling = this.R.getFilling();
            float f11 = 0.0f;
            if (hj == 0.0f) {
                f11 = 1.0f;
            }
            filling.t0(f11);
            int d10 = ib.d.d(ae.j.n0(), ae.j.P0(), hj);
            if (Uj()) {
                this.R.u4(R9(), d10);
                return;
            }
            ud.m mVar = this.B0;
            if (mVar != null) {
                mVar.setTextColor(d10);
                this.B0.setMuteFadeFactor(f10);
            }
        }
    }

    @Override
    public boolean Ke() {
        return !Pd();
    }

    public final void Kh(float f10) {
        float Bj = Bj() * (1.0f - f10);
        r rVar = this.Z0;
        if (rVar != null) {
            rVar.setTranslationY(Bj);
            this.f9505a1.setTranslationY(Bj);
            this.f9508d1.setTranslationY(Bj);
            this.f9507c1.setTranslationY(Bj);
            this.f9506b1.setTranslationY(Bj);
            this.f9510f1.setTranslationY(Bj);
            this.f9509e1.setTranslationY(Bj);
        }
    }

    public final void Ki() {
        jb.c cVar = new jb.c(4);
        ie.u0 u0Var = new ie.u0(4);
        jb.c cVar2 = new jb.c(4);
        jb.c cVar3 = new jb.c(4);
        TdApi.Chat chat = this.f9520o0;
        if (!(chat == null || chat.photo == null || Uj())) {
            cVar.a(R.id.btn_open);
            u0Var.a(R.string.Open);
            cVar3.a(R.drawable.baseline_visibility_24);
            cVar2.a(1);
        }
        cVar.a(R.id.btn_changePhotoCamera);
        u0Var.a(R.string.ChatCamera);
        cVar3.a(R.drawable.baseline_camera_alt_24);
        cVar2.a(1);
        cVar.a(R.id.btn_changePhotoGallery);
        u0Var.a(R.string.Gallery);
        cVar3.a(R.drawable.baseline_image_24);
        cVar2.a(1);
        TdApi.Chat chat2 = this.f9520o0;
        if (!(chat2 == null || chat2.photo == null)) {
            cVar.a(R.id.btn_changePhotoDelete);
            u0Var.a(R.string.Delete);
            cVar3.a(R.drawable.baseline_delete_24);
            cVar2.a(2);
        }
        ee(null, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean rk;
                rk = so.this.rk(view, i10);
                return rk;
            }
        });
    }

    public final boolean Kj() {
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
        int i10 = supergroupFullInfo != null ? supergroupFullInfo.slowModeDelay : 0;
        ra raVar = this.f9523p1;
        return (raVar == null || i10 == ob.f.f19344a[raVar.s()]) ? false : true;
    }

    public final void Km(boolean z10) {
        if (this.V0 != z10) {
            this.V0 = z10;
            v4<?> oj = oj();
            if (oj != null) {
                ((j10) oj).Jf().requestDisallowInterceptTouchEvent(z10);
            }
        }
    }

    @Override
    public void L5() {
        if (this.f24495b.m2(this.f9520o0)) {
            Ki();
        } else {
            nm();
        }
    }

    @Override
    public void L8() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.getFilling().k0(ae.j.u());
        }
    }

    @Override
    public int L9() {
        return bb() ? R.id.theme_color_filling : super.L9();
    }

    public final void Li(int i10) {
        int min = Math.min(Tl(), i10);
        int yi = yi();
        if (yi != min) {
            this.C0.scrollBy(0, min - yi);
        }
    }

    public final boolean Lj(TdApi.SearchMessagesFilter searchMessagesFilter, int i10) {
        if (this.G1.isEmpty()) {
            return false;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        int size = this.G1.size();
        for (int i11 = i10; i11 < size; i11++) {
            j10<?> j10Var = this.G1.get(i11);
            if (j10.Pf(j10Var)) {
                if (searchMessagesFilter.getConstructor() == j10Var.wg().getConstructor()) {
                    return true;
                }
            }
        }
        return i10 > 0 && Lj(searchMessagesFilter, 0);
    }

    public final void Lm(boolean z10) {
        if (this.f9519n1 != z10) {
            this.f9519n1 = z10;
            if (this.f9517m1 == null) {
                o0 o0Var = new o0(t());
                this.f9517m1 = o0Var;
                o0Var.setId(R.id.btn_done);
                this.f9517m1.setOnClickListener(this);
                this.A0.addView(this.f9517m1);
            }
            this.f9517m1.p(z10, true);
        }
    }

    @Override
    public void M1(final TdApi.User user) {
        TdApi.User user2;
        if (Yj() && (user2 = this.f9524q0) != null && user2.f19979id == user.f19979id) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.pl(user);
                }
            });
        }
    }

    @Override
    public int M9() {
        if (Uj()) {
            return super.M9();
        }
        return (int) (he.n.e() + (he.n.f(true) * ((ud.n) this.C0).getScrollFactor()));
    }

    public final void Mi() {
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
        boolean z10 = false;
        boolean z11 = supergroupFullInfo != null && supergroupFullInfo.canGetMembers;
        d20 yj = yj();
        if (yj != null) {
            z10 = true;
        }
        if (z11 != z10) {
            if (z11) {
                d20 Ch = new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterRecent());
                this.G1.add(Ch);
                this.F0.w(this.G1.size() - 1);
                this.G0.getTopView().G1(Ch.X9().toString().toUpperCase());
            } else {
                int indexOf = this.G1.indexOf(yj);
                if (indexOf != -1) {
                    this.G1.remove(indexOf);
                    this.G0.getTopView().T1();
                    this.F0.x(indexOf);
                } else {
                    return;
                }
            }
            this.F0.l();
        }
    }

    public final boolean Mj() {
        TdApi.Chat chat = this.f9520o0;
        int i10 = chat != null ? chat.messageTtl : 0;
        ra raVar = this.f9527r1;
        return (raVar == null || i10 == ob.f.f19345b[raVar.s()]) ? false : true;
    }

    public final void Mm(boolean z10) {
        this.D1 = z10;
    }

    @Override
    public void N0(final long j10, int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Uk(j10);
            }
        });
    }

    @Override
    public void N1(long j10, boolean z10) {
        zd.g0.j(this, j10, z10);
    }

    @Override
    public boolean N3(f5 f5Var, View view, TdApi.MessageSender messageSender) {
        if (this.f24495b.n7(messageSender)) {
            return false;
        }
        ki(f5Var, view, messageSender);
        return false;
    }

    @Override
    public void N8(q1 q1Var) {
        super.N8(q1Var);
        if (!Uj()) {
            ((ud.n) this.C0).setFloatingButton(q1Var.H());
        }
    }

    public final void Ni() {
    }

    public final boolean Nj() {
        ra raVar = this.f9515k1;
        return (raVar != null && !ib.i.c(this.f9520o0.title, raVar.x())) || (this.f9516l1 != null && !ib.i.c(rj(), this.f9516l1.x())) || Mj() || Kj();
    }

    public final void Nm(float f10) {
        this.N0 = f10;
        float f11 = this.K0;
        float min = Math.min(f11, (((-Hj()) - f11) * f10) + f11);
        boolean z10 = true;
        this.I0.a(f10);
        this.J0.setTranslationY(min - (d1.a3(true) * this.N0));
        float a32 = d1.a3(true);
        float translationY = this.J0.getTranslationY() + a32 + Hj();
        Nd(translationY > a32 ? 0.0f : 1.0f - (translationY / a32));
        Pm(translationY < (((float) d1.getTopOffset()) + (((float) d1.a3(false)) / 2.0f)) - ((float) a0.i(8.0f)));
        if (translationY >= d1.a3(true) - a0.i(16.0f)) {
            z10 = false;
        }
        Ym(z10);
        this.L0 = min;
        bn(min);
    }

    @Override
    public int O9() {
        if (bb() && this.M0) {
            return R.id.theme_color_icon;
        }
        ud.m mVar = this.B0;
        return (mVar == null || mVar.t1()) ? R.id.theme_color_headerIcon : R.id.theme_color_white;
    }

    public final void Oi(int i10) {
        Pi(this.F0.v(i10));
    }

    public final void Oj(TdApi.SearchMessagesFilter searchMessagesFilter) {
        int xj = xj(searchMessagesFilter.getConstructor());
        if (xj <= -1) {
            zj(searchMessagesFilter, false);
            return;
        }
        int i10 = xj + 1;
        this.H1.put(searchMessagesFilter.getConstructor(), i10);
        if (!Xj(searchMessagesFilter) && i10 == 1) {
            hi(searchMessagesFilter);
        }
        rn();
    }

    public final void Om(boolean z10) {
        if (this.M0 != z10 && Xl()) {
            this.M0 = z10;
            pi(z10 ? 1.0f : 0.0f);
            if (!z10 && Na()) {
                W8(null);
            }
        }
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    @Override
    public void P0(int i10) {
        if (!this.f24495b.hd().L7(this, null, C9(), i10, null)) {
            int i11 = this.f9518n0;
            if (i11 == 0 || i11 == 1) {
                if (this.f9528s0 != null && !this.f24495b.hd().u3(this, i10, this.f9524q0, this.f9528s0)) {
                    switch (i10) {
                        case R.id.btn_newSecretChat:
                            this.f24495b.hd().S8(this, this.f9524q0.f19979id, true, null);
                            return;
                        case R.id.more_btn_block:
                            boolean z10 = !this.f24495b.h3(this.f9520o0.f19908id);
                            final boolean L6 = this.f24495b.L6(this.f9520o0.f19908id);
                            if (z10) {
                                CharSequence m12 = w.m1(L6 ? R.string.BlockBotConfirm : R.string.BlockUserConfirm, this.f24495b.U3(this.f9520o0.f19908id));
                                int[] iArr = {R.id.btn_blockSender, R.id.btn_cancel};
                                String[] strArr = new String[2];
                                strArr[0] = w.i1(L6 ? R.string.BlockBot : R.string.BlockContact);
                                strArr[1] = w.i1(R.string.Cancel);
                                ee(m12, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24}, new h0() {
                                    @Override
                                    public boolean P() {
                                        return g0.a(this);
                                    }

                                    @Override
                                    public Object a2(int i12) {
                                        return g0.b(this, i12);
                                    }

                                    @Override
                                    public final boolean r3(View view, int i12) {
                                        boolean hl;
                                        hl = so.this.hl(L6, view, i12);
                                        return hl;
                                    }
                                });
                                return;
                            }
                            o6 o6Var = this.f24495b;
                            o6Var.d2(o6Var.Ab(this.f9520o0.f19908id), false, new Client.g() {
                                @Override
                                public final void r2(TdApi.Object object) {
                                    so.this.il(L6, object);
                                }
                            });
                            return;
                        case R.id.more_btn_cloudChat:
                            this.f24495b.hd().u7(this, this.f9524q0.f19979id, null);
                            return;
                        case R.id.more_btn_delete:
                            this.f24495b.hd().P2(this, this.f9524q0.f19979id);
                            return;
                        case R.id.more_btn_privacy:
                            om();
                            return;
                        default:
                            return;
                    }
                }
            } else if (i11 == 2 || i11 == 3 || i11 == 4) {
                switch (i10) {
                    case R.id.btn_recentActions:
                        pm();
                        return;
                    case R.id.more_btn_addMember:
                        ji(null);
                        return;
                    case R.id.more_btn_editDescription:
                        jj();
                        return;
                    case R.id.more_btn_join:
                        Zj();
                        return;
                    case R.id.more_btn_privacy:
                        om();
                        return;
                    case R.id.more_btn_share:
                        cn(true);
                        return;
                    case R.id.more_btn_viewAdmins:
                        Sl();
                        return;
                    case R.id.more_btn_viewStats:
                        qm();
                        return;
                    default:
                        return;
                }
            } else if (i11 != 6 && i11 != 7) {
            } else {
                if (i10 == R.id.btn_destroyChat) {
                    fj();
                } else if (i10 == R.id.btn_inviteLink) {
                    km();
                }
            }
        }
    }

    public void Pi(v4<?> v4Var) {
        int Ul = Ul();
        int yi = yi();
        if (v4Var != null) {
            ((j10) v4Var).xf(yi, Ul);
        }
    }

    public final void Pj() {
        this.f9539x1 = -1;
        this.f9541y1 = -1;
    }

    public final void Pl(final v4<?> v4Var, final long j10, final boolean z10) {
        final boolean H3 = this.f24495b.H3(this.f9520o0.f19908id);
        final boolean H32 = this.f24495b.H3(j10);
        this.f24495b.e2().j2(ob.a.p(j10), new kb.j() {
            @Override
            public final void a(Object obj) {
                so.this.Pk(v4Var, j10, z10, H3, H32, (TdApi.SupergroupFullInfo) obj);
            }
        });
    }

    public final void Pm(boolean z10) {
        if (this.Q0 != z10) {
            this.Q0 = z10;
            pn();
        }
    }

    @Override
    public int Q9() {
        return this.M0 ? R.id.theme_color_text : super.Q9();
    }

    public final void Qi() {
        if (!Uj()) {
            String rj = rj();
            int L0 = this.D0.L0(R.id.btn_description);
            int i10 = 1;
            boolean z10 = L0 != -1;
            boolean z11 = !ib.i.i(rj) || Gi();
            if (z10 != z11) {
                if (z10) {
                    Dm(L0);
                    return;
                }
                ra Zl = Zl();
                Jm(rj);
                if (this.D0.L0(R.id.btn_username) == -1) {
                    i10 = 0;
                }
                oi(Zl, i10);
            } else if (z11 && Jm(rj)) {
                sn(R.id.btn_description);
            }
        }
    }

    public final void Qj(final long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Dk(j10);
            }
        });
    }

    public final void Ql() {
        this.D0.p3(R.id.btn_notifications);
    }

    public final void Qm(boolean z10) {
        ud.m mVar = this.B0;
        if (mVar != null) {
            mVar.setShowMute(this.f24495b.v3(this.f9520o0.f19908id));
            if (!z10) {
                this.B0.setShowVerify(this.f24495b.l4(this.f9520o0));
                this.B0.setShowScam(this.f24495b.L3(this.f9520o0));
                this.B0.setShowFake(this.f24495b.k3(this.f9520o0));
            }
        }
    }

    @Override
    public void R3(final long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Xk(j10);
            }
        });
    }

    @Override
    public int R9() {
        return R.id.controller_profile;
    }

    @Override
    public final boolean Rd() {
        return ob.a.j(this.f9520o0.f19908id) || (this.f9520o0.hasProtectedContent && !Uj());
    }

    public final void Ri() {
        Lm(Nj());
    }

    public final void Rj(final TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Ek(notificationSettingsScope);
            }
        });
    }

    public final CharSequence Rl(boolean z10) {
        TdApi.SearchMessagesFilter wg;
        int i10;
        if (this.P0) {
            if (z10) {
                return null;
            }
            v4<?> oj = oj();
            if (oj != null) {
                if (oj instanceof m10) {
                    TdApi.UserFullInfo userFullInfo = this.f9528s0;
                    if (userFullInfo != null && (i10 = userFullInfo.groupInCommonCount) > 0) {
                        return w.q2(R.string.xGroups, i10);
                    }
                } else if (oj instanceof e20) {
                    return w.i1(R.string.MediaRestricted);
                } else {
                    if (((oj instanceof p10) || (oj instanceof r10)) && (wg = ((j10) oj).wg()) != null) {
                        int xj = xj(wg.getConstructor());
                        if (xj == 0) {
                            switch (wg.getConstructor()) {
                                case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                                    return w.i1(R.string.TabEmptyLinks);
                                case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                                    return w.i1(R.string.TabEmptyMedias);
                                case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                                    return w.i1(R.string.TabEmptyPhotos);
                                case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                                    return w.i1(R.string.TabEmptyDocs);
                            }
                        } else if (xj > 0) {
                            switch (wg.getConstructor()) {
                                case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                                    return w.q2(R.string.xLinks, xj);
                                case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                                    return w.q2(R.string.xGIFs, xj);
                                case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                                    return w.q2(R.string.xVideos, xj);
                                case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                                    return w.q2(R.string.xVideoMessages, xj);
                                case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                                    return w.q2(R.string.xAudios, xj);
                                case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                                    return w.q2(R.string.xPhotos, xj);
                                case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                                    return w.q2(R.string.xMedia, xj);
                                case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                                    return w.q2(R.string.xFiles, xj);
                                case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                                    return w.q2(R.string.xVoiceMessages, xj);
                            }
                        }
                    }
                }
            }
        }
        if (z10) {
            return this.f24495b.Bc().o(this.f9520o0);
        }
        return this.f24495b.Bc().n(this.f9520o0);
    }

    public final void Rm(boolean z10) {
        ud.m mVar = this.B0;
        if (mVar != null) {
            TdApi.Chat chat = this.f9520o0;
            TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
            if (chatPhotoInfo == null) {
                mVar.setAvatarPlaceholder(this.f24495b.D3(chat, true, ud.m.getBaseAvatarRadiusDp(), null));
            } else {
                mVar.setAvatar(chatPhotoInfo);
            }
            if (z10) {
                this.B0.W1();
            }
        }
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    @Override
    public v4<?> S2(int i10) {
        j10<?> j10Var = qj().get(i10);
        if (!j10Var.Qf()) {
            j10Var.Hg();
            long j10 = this.f9520o0.f19908id;
            p7 p7Var = this.f9522p0;
            j10Var.Bg(new j10.d(j10, p7Var != null ? p7Var.g() : 0L));
            j10Var.Gg(this);
        }
        return j10Var;
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        View C;
        FrameLayoutFix frameLayoutFix;
        if (cb()) {
            return false;
        }
        eb.k kVar = this.O0;
        if (kVar != null && kVar.v()) {
            return false;
        }
        if (Uj() && Nj()) {
            return false;
        }
        float a32 = f11 - d1.a3(true);
        float translationY = this.H0.getTranslationY() + Hj();
        if (a32 >= translationY && a32 <= translationY + Bj() && (frameLayoutFix = this.H0) != null && frameLayoutFix.getParent() != null) {
            return (this.f9535v1 == 0 && this.f9537w1 == 0.0f && !this.G0.A1()) || f10 <= ((float) a0.i(12.0f));
        }
        if (!si(this.A0.getMeasuredWidth(), a32)) {
            return (this.f9535v1 == 0 && this.f9537w1 == 0.0f) || f10 <= ((float) a0.i(12.0f));
        }
        View X = this.C0.X(f10, a32);
        if (X instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) X;
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager.l2() == 0) {
                    return linearLayoutManager.X1() == 0 && (C = linearLayoutManager.C(0)) != null && linearLayoutManager.Q(C) == 0;
                }
            }
        }
        return true;
    }

    public final void Si() {
        if (this.f9518n0 == 4) {
            C9();
            long j10 = o6.f28043z2;
        }
    }

    public boolean Sj() {
        int i10 = this.f9518n0;
        return i10 == 2 || i10 == 5;
    }

    public final void Sl() {
        if (this.f9536w0 != null || this.f9532u0 != null) {
            so soVar = new so(this.f24493a, this.f24495b);
            soVar.Hm(new m(this.f9520o0, this.f9522p0, true));
            ac(soVar);
        }
    }

    public final void Sm() {
        TdApi.Chat chat;
        ud.m mVar = this.B0;
        if (mVar != null && (chat = this.f9520o0) != null) {
            mVar.setUseRedHighlight(this.f24495b.h7(chat.f19908id));
            this.B0.T1(this.f24495b.X3(this.f9520o0, false), Rl(false));
            this.B0.setExpandedSubtitle(Rl(true));
        }
    }

    @Override
    public void T0(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        g1.d(this, j10, j11, messageInteractionInfo);
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        zd.g0.q(this, j10, j11, i10, z10);
    }

    public final void Ti() {
        int L0 = this.D0.L0(R.id.btn_encryptionKey);
        boolean z10 = L0 != -1;
        boolean w22 = t2.w2(this.f9526r0);
        if (z10 == w22) {
            return;
        }
        if (w22) {
            oi(am(), 3);
        } else {
            Dm(L0);
        }
    }

    public boolean Tj() {
        int i10 = this.f9518n0;
        return i10 == 4 || i10 == 7;
    }

    public final int Tl() {
        return (Gj() - Dj()) - Bj();
    }

    public void Tm(boolean z10) {
        this.E1 = z10;
    }

    @Override
    public void U3(int i10) {
    }

    public final void Ui() {
        TdApi.UserFullInfo userFullInfo = this.f9528s0;
        boolean z10 = false;
        boolean z11 = userFullInfo != null && userFullInfo.groupInCommonCount > 0;
        m10 tj = tj();
        if (tj != null) {
            z10 = true;
        }
        if (z11 != z10) {
            if (z11) {
                m10 m10Var = new m10(this.f24493a, this.f24495b);
                this.G1.add(m10Var);
                this.F0.w(this.G1.size() - 1);
                this.G0.getTopView().G1(m10Var.X9().toString().toUpperCase());
            } else {
                int indexOf = this.G1.indexOf(tj);
                if (indexOf != -1) {
                    this.G1.remove(indexOf);
                    this.F0.x(indexOf);
                    this.G0.getTopView().S1(indexOf);
                } else {
                    return;
                }
            }
            this.F0.l();
        }
    }

    public final boolean Uj() {
        int i10 = this.f9518n0;
        return i10 == 5 || i10 == 6 || i10 == 7;
    }

    public int Ul() {
        return (Tl() - Bj()) - Hj();
    }

    public void Um(boolean z10) {
        this.F1 = z10;
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        xm(basicGroupFullInfo);
    }

    @Override
    public void V8() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.getFilling().k0(ae.j.k0());
        }
    }

    @Override
    public int V9() {
        return Uj() ? super.V9() : he.n.b(true);
    }

    public final void Vi() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.e4(this, W9());
        }
    }

    public final boolean Vj() {
        int i10 = this.f9518n0;
        return (i10 == 4 || i10 == 7) && !this.f9534v0.username.isEmpty();
    }

    public final void Vl(ra raVar, ViewGroup viewGroup, y1 y1Var) {
        int j10 = raVar.j();
        if (j10 == R.id.description) {
            y1Var.getEditText().setInputType(16385);
            p0.j0(y1Var.getEditText(), false);
            y1Var.setMaxLength(255);
        } else if (j10 == R.id.S) {
            y1Var.getEditText().setImeOptions(6);
            y1Var.getEditText().setInputType(16385);
        }
    }

    public void Vm(boolean z10, int i10) {
        if (this.X0 != z10) {
            this.X0 = z10;
            Wi();
            boolean z11 = false;
            if (this.Z0 == null) {
                FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, Bj());
                q12.topMargin = Hj();
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(t());
                this.Y0 = frameLayoutFix;
                frameLayoutFix.setLayoutParams(q12);
                FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, Bj(), w.G2() ? 5 : 3);
                r rVar = new r(t());
                this.Z0 = rVar;
                rVar.x(16.0f, R.id.theme_color_text);
                int maxDigitWidth = this.Z0.getMaxDigitWidth();
                this.Z0.setPadding(maxDigitWidth, 0, maxDigitWidth, 0);
                int i11 = a0.i(66.0f) - maxDigitWidth;
                r12.leftMargin = i11;
                r12.rightMargin = i11;
                this.Z0.setLayoutParams(r12);
                this.Z0.setTextTop(a0.i(15.0f) + a0.i(15.0f));
                this.Z0.F(w.o2(R.string.SelectedSuffix, 1L), false);
                t8(this.Z0);
                FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(a0.i(56.0f), Bj(), w.G2() ? 5 : 3);
                ImageView imageView = new ImageView(t());
                this.f9505a1 = imageView;
                imageView.setImageResource(R.drawable.baseline_close_24);
                this.f9505a1.setColorFilter(ae.j.o0());
                q8(this.f9505a1, R.id.theme_color_icon);
                this.f9505a1.setScaleType(ImageView.ScaleType.CENTER);
                this.f9505a1.setLayoutParams(r13);
                this.f9505a1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        so.this.Jl(view);
                    }
                });
                p0.T(this.f9505a1);
                yd.d.j(this.f9505a1);
                this.Y0.addView(this.Z0);
                this.Y0.addView(this.f9505a1);
                for (int i12 = 0; i12 < 5; i12++) {
                    u0 u0Var = new u0(t());
                    u0Var.g(R.id.theme_color_icon);
                    u0Var.setAlpha(0.0f);
                    FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(a0.i(48.0f), Bj(), w.G2() ? 3 : 5);
                    if (w.G2()) {
                        r14.leftMargin = a0.i(12.0f);
                    } else {
                        r14.rightMargin = a0.i(12.0f);
                    }
                    q8(u0Var, R.id.theme_color_icon);
                    u0Var.setLayoutParams(r14);
                    this.Y0.addView(u0Var);
                    u0Var.setOnClickListener(this);
                    yd.d.g(u0Var);
                    if (i12 == 0) {
                        this.f9507c1 = u0Var;
                        u0Var.setId(R.id.menu_btn_forward);
                        u0Var.setImageResource(R.drawable.baseline_forward_24);
                    } else if (i12 == 1) {
                        this.f9508d1 = u0Var;
                        u0Var.setId(R.id.menu_btn_copy);
                        u0Var.setImageResource(R.drawable.baseline_content_copy_24);
                    } else if (i12 == 2) {
                        this.f9506b1 = u0Var;
                        u0Var.setId(R.id.menu_btn_delete);
                        u0Var.setImageResource(R.drawable.baseline_delete_24);
                    } else if (i12 == 3) {
                        this.f9509e1 = u0Var;
                        u0Var.setId(R.id.menu_btn_clear);
                        u0Var.setImageResource(R.drawable.templarian_baseline_broom_24);
                    } else if (i12 == 4) {
                        this.f9510f1 = u0Var;
                        u0Var.setId(R.id.menu_btn_view);
                        u0Var.setImageResource(R.drawable.baseline_visibility_24);
                    }
                }
                Kh(0.0f);
                this.H0.addView(this.Y0);
            }
            this.Z0.setEnabled(z10);
            if (z10) {
                this.Z0.F(w.o2(i10, 1L), this.f9511g1 != 0.0f);
                r rVar2 = this.Z0;
                if (this.f9511g1 != 0.0f) {
                    z11 = true;
                }
                rVar2.w(1, z11);
            }
        }
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    @Override
    public int W9() {
        int i10 = this.f9518n0;
        if (i10 != 0) {
            return i10 != 1 ? Uj() ? R.id.menu_profile_manage : R.id.menu_profile : R.id.menu_profile_secret;
        }
        if (t2.K2(this.f9524q0)) {
            return R.id.menu_profile_bot;
        }
        TdApi.User user = this.f9524q0;
        if (user == null || (user.f19979id != 0 && (user.type.getConstructor() == -598644325 || this.f9524q0.type.getConstructor() == -970625144))) {
            return R.id.menu_profile_private;
        }
        return 0;
    }

    public final void Wi() {
        v4<?> oj;
        boolean z10 = qa() == 0.0f;
        if (z10 && (oj = oj()) != null) {
            z10 = !((j10) oj).Of();
        }
        this.E0.setPagingEnabled(z10);
        this.G0.getTopView().setTouchDisabled(!z10);
    }

    public final boolean Wj() {
        int i10 = this.f9518n0;
        return (i10 == 3 || i10 == 6) && !this.f9534v0.username.isEmpty();
    }

    public final boolean Wl() {
        TdApi.User user = this.f9524q0;
        return user.isContact || user.isMutualContact || t2.A2(user);
    }

    public final void Wm(boolean z10) {
        if (this.f9521o1 != z10) {
            this.f9521o1 = z10;
            Md(z10);
            this.f9517m1.setInProgress(z10);
        }
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        zd.g0.a(this, j10, chatActionBar);
    }

    @Override
    public void X1(final TdApi.Message message, long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.el(message);
            }
        });
    }

    @Override
    public boolean X8(boolean z10) {
        T8();
        return false;
    }

    @Override
    public CharSequence X9() {
        int i10 = this.f9518n0;
        int i11 = R.string.GroupInfo;
        if (i10 == 5) {
            if (t2.P2(this.f9530t0.status)) {
                i11 = R.string.ManageGroup;
            } else if (t2.H2(this.f9530t0.status) || this.f9520o0.permissions.canChangeInfo) {
                i11 = R.string.EditGroup;
            }
            return w.i1(i11);
        } else if (i10 == 6) {
            if (t2.H2(this.f9534v0.status)) {
                i11 = R.string.ManageGroup;
            } else if (this.f9520o0.permissions.canChangeInfo) {
                i11 = R.string.EditGroup;
            }
            return w.i1(i11);
        } else if (i10 != 7) {
            return super.X9();
        } else {
            return w.i1(R.string.ManageChannel);
        }
    }

    public final void Xi() {
        int L0 = this.D0.L0(R.id.btn_phone);
        int i10 = 0;
        boolean z10 = L0 != -1;
        boolean Wl = Wl();
        if (z10 != Wl) {
            if (z10) {
                Dm(L0);
                return;
            }
            if (this.D0.L0(R.id.btn_username) != -1) {
                i10 = 1;
            }
            if (this.D0.L0(R.id.btn_description) != -1) {
                i10++;
            }
            oi(em(), i10);
        } else if (Wl) {
            sn(R.id.btn_phone);
        }
    }

    public final boolean Xl() {
        int i10 = this.f9518n0;
        if (i10 == 5) {
            return t2.P2(this.f9530t0.status);
        }
        if (i10 != 6) {
            return true;
        }
        return t2.H2(this.f9534v0.status);
    }

    public final void Xm(TdApi.SearchMessagesFilter searchMessagesFilter, int i10) {
        int xj;
        if (i10 != -1 && (xj = xj(searchMessagesFilter.getConstructor())) != i10) {
            if (xj <= 0 || i10 > 0) {
                if (this.H1 == null) {
                    this.H1 = new SparseIntArray(sj().length - 3);
                }
                this.H1.put(searchMessagesFilter.getConstructor(), i10);
                if (!Xj(searchMessagesFilter) && xj <= 0 && i10 > 0) {
                    hi(searchMessagesFilter);
                }
                rn();
            }
        }
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        zd.g0.v(this, j10, message);
    }

    @Override
    public void Y3(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        Qj(j10);
    }

    public final void Yi() {
        int L0 = this.D0.L0(R.id.btn_prehistoryMode);
        boolean z10 = L0 != -1;
        boolean O2 = this.f24495b.O2(this.f9520o0);
        if (z10 != O2) {
            if (O2) {
                int L02 = this.D0.L0(R.id.btn_recentActions);
                if (L02 == -1) {
                    L02 = this.D0.L0(R.id.belowRecentActions);
                }
                if (L02 != -1) {
                    this.D0.D0().add(L02, new ra(11));
                    this.D0.D0().add(L02, new ra(5, R.id.btn_prehistoryMode, 0, R.string.ChatHistory));
                    this.D0.M(L02, 2);
                } else {
                    throw new AssertionError();
                }
            } else {
                this.D0.R1(L0 - 1, 2);
            }
            im();
        } else if (O2) {
            sn(R.id.btn_prehistoryMode);
        }
    }

    public final boolean Yj() {
        int i10 = this.f9518n0;
        return i10 == 0 || i10 == 1;
    }

    public o Yl(j10<?> j10Var) {
        return new o(j10Var);
    }

    public final void Ym(boolean z10) {
        if (this.P0 != z10) {
            this.P0 = z10;
            ud.m mVar = this.B0;
            if (mVar != null) {
                mVar.setSubtitle(Rl(false));
                this.B0.setExpandedSubtitle(Rl(true));
            }
        }
    }

    @Override
    public void Z8() {
        super.Z8();
        ln();
        ed.n nVar = this.f9538x0;
        if (nVar != null) {
            nVar.f0();
        }
        this.F0.Q2();
        p0.n(this.C0);
    }

    public final void Zi() {
        eb.k kVar;
        int Gj = Gj() - yi();
        int Bj = Bj() + Hj();
        int Hj = Gj + (((-Bj()) - Hj()) - a0.i(6.0f));
        float f10 = Hj;
        this.K0 = f10;
        Om(((float) (Hj() + Hj)) <= ((float) Bj));
        if ((!this.M0 && ((kVar = this.O0) == null || !kVar.v())) || this.K0 < this.H0.getTranslationY()) {
            this.L0 = f10;
            bn(f10);
        }
    }

    public final void Zj() {
        int i10 = this.f9518n0;
        if (i10 == 3 || i10 == 4) {
            this.f24495b.v4().o(new TdApi.AddChatMember(this.f9520o0.f19908id, this.f24495b.fa(), 0), this.f24495b.na());
        }
    }

    public final ra Zl() {
        return new ra(37, R.id.btn_description, R.drawable.baseline_info_24, (!Yj() || t2.K2(this.f9524q0)) ? R.string.Description : R.string.UserBio);
    }

    public void Zm(float f10) {
        if (this.f9511g1 != f10) {
            this.f9511g1 = f10;
            this.G0.getTopView().setOverlayFactor(f10);
            Kh(f10);
        }
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        zd.g0.f(this, j10, messageSender);
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    public final void aj() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            int W9 = W9();
            TdApi.UserFullInfo userFullInfo = this.f9528s0;
            d1Var.T3(W9, R.id.menu_btn_call, (userFullInfo.canBeCalled || userFullInfo.hasPrivateCalls) ? 1.0f : 0.0f);
        }
    }

    public final ra am() {
        return new ra(5, R.id.btn_encryptionKey, R.drawable.baseline_vpn_key_24, R.string.EncryptionKey);
    }

    public void an(int i10, int i11) {
        r rVar = this.Z0;
        if (rVar != null) {
            if (i10 > 0) {
                rVar.F(w.o2(i11, i10), this.f9511g1 > 0.0f);
            }
            this.Z0.E(i10);
        }
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        zd.g0.g(this, j10, draftMessage);
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    @Override
    public int ba() {
        return R.id.theme_color_background;
    }

    public final void bi(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f9532u0 = basicGroupFullInfo;
        this.f9538x0.p0(basicGroupFullInfo.members);
        Qi();
        if (t2.P2(this.f9530t0.status)) {
            sn(R.id.btn_inviteLink);
        }
    }

    public final void bj() {
        String str;
        int i10 = this.f9518n0;
        if (i10 == 0 || i10 == 1) {
            str = this.f9524q0.username;
        } else if (i10 == 3 || i10 == 4) {
            str = this.f9534v0.username;
        } else {
            return;
        }
        int L0 = this.D0.L0(R.id.btn_username);
        boolean z10 = L0 != -1;
        boolean z11 = !str.isEmpty();
        if (z10 != z11) {
            if (z10) {
                Dm(L0);
                int i11 = this.f9518n0;
                if (i11 == 3) {
                    if (this.f24495b.u2(this.f9520o0)) {
                        fi();
                    }
                    Sm();
                } else if (i11 == 4 && this.f24495b.u2(this.f9520o0)) {
                    fi();
                }
            } else {
                ra fm = fm();
                if (fm != null) {
                    oi(fm, 0);
                    int i12 = this.f9518n0;
                    if (i12 == 3) {
                        Bm();
                        if (this.f24495b.u2(this.f9520o0)) {
                            Am();
                        }
                        Sm();
                    } else if (i12 == 4 && this.f24495b.u2(this.f9520o0)) {
                        Am();
                    }
                }
            }
        } else if (z11) {
            sn(R.id.btn_username);
        }
    }

    public final ra bm() {
        return new ra(5, R.id.btn_inviteLink, R.drawable.baseline_link_24, R.string.PrimaryInviteLinkMenu);
    }

    public final void bn(float f10) {
        if (this.H0.getTranslationY() != f10) {
            this.H0.setTranslationY(f10);
            float a32 = d1.a3(true);
            this.I0.setTranslationY((f10 - a32) + Hj());
            this.J0.setTranslationY(f10 - (a32 * this.N0));
            if (qa() != 0.0f) {
                ja(this.R).setTranslationY(Math.max(0.0f, this.J0.getTranslationY() - d1.a3(false)));
            }
        }
    }

    @Override
    public void c1(final long j10, final TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Vk(j10, chatJoinRequestsInfo);
            }
        });
    }

    public final void ci(TdApi.UserFullInfo userFullInfo) {
        Qi();
        Ui();
        aj();
    }

    public void cj() {
        v4<?> oj;
        if (this.X0 && (oj = oj()) != null) {
            ((j10) oj).Eg(false);
        }
    }

    public final ra cm() {
        return new ra(5, R.id.btn_linkedChat, 0, this.f9518n0 == 7 ? R.string.LinkedGroup : R.string.LinkedChannel);
    }

    public final boolean cn(boolean z10) {
        String str;
        String Cj = Cj();
        if (ib.i.i(Cj)) {
            return false;
        }
        String Xc = this.f24495b.Xc(Cj);
        String X3 = this.f24495b.X3(this.f9520o0, false);
        int i10 = R.string.ShareTextLink;
        switch (this.f9518n0) {
            case 0:
            case 1:
                str = w.j1(this.f24495b.M6(this.f9520o0) ? R.string.ShareTextBotLink : R.string.ShareTextProfileLink, X3, Xc);
                i10 = R.string.ShareTextProfileLink2;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                str = w.j1(R.string.ShareTextChatLink, X3, Xc);
                break;
            case 4:
            case 7:
                str = w.j1(R.string.ShareTextChannelLink, X3, Xc);
                break;
            default:
                return false;
        }
        String j12 = w.j1(i10, X3, Xc);
        y00 y00Var = new y00(this.f24493a, this.f24495b);
        y00Var.Vi(new y00.m(j12).E(str, null));
        y00Var.ej();
        return true;
    }

    @Override
    public boolean dc() {
        return this.I1 > 0;
    }

    public final void di(TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f9536w0 = supergroupFullInfo;
        Qi();
        Vi();
        if (this.f24495b.u2(this.f9520o0)) {
            sn(R.id.btn_inviteLink);
        }
        on(false);
    }

    public final int dj() {
        return ((Gj() - Bj()) + Hj()) - f3.q();
    }

    public final ra dm() {
        return new ra(5, R.id.btn_notifications, R.drawable.baseline_notifications_24, R.string.Notifications);
    }

    public final void dn() {
        jb.c cVar = new jb.c(4);
        ie.u0 u0Var = new ie.u0(4);
        if (Ci()) {
            cVar.a(R.id.more_btn_addMember);
            u0Var.b(w.i1(R.string.AddMember));
        }
        int i10 = this.f9518n0;
        if ((i10 == 4 || i10 == 3) && this.f9534v0.username.length() > 0) {
            cVar.a(R.id.more_btn_share);
            u0Var.a(R.string.Share);
        }
        int i11 = this.f9518n0;
        if (i11 == 3 || i11 == 2) {
            if (!Ii()) {
                cVar.a(R.id.more_btn_viewAdmins);
                u0Var.a(R.string.ViewAdmins);
            }
            if (!this.f24495b.h3(C9())) {
                cVar.a(R.id.more_btn_privacy);
                u0Var.a(R.string.EditPrivacy);
            }
        }
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
        if (supergroupFullInfo != null && supergroupFullInfo.canGetStatistics) {
            cVar.a(R.id.more_btn_viewStats);
            u0Var.a(R.string.Stats);
        }
        this.f24495b.hd().D2(C9(), cVar, u0Var, false, true);
        if (cVar.g() > 0) {
            Yd(cVar.e(), u0Var.d(), 0);
        }
    }

    @Override
    public void e7(final long j10, int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Tk(j10);
            }
        });
    }

    @Override
    public void e9() {
        super.e9();
        if (!Uj()) {
            ((ud.n) this.C0).setFloatingButton(null);
        }
    }

    public final void ei(TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f9536w0 = supergroupFullInfo;
        Qi();
        Vi();
        if (t2.P2(this.f9534v0.status)) {
            sn(R.id.btn_inviteLink);
        }
        on(false);
    }

    public final void ej() {
        x0 x0Var = this.f9513i1;
        if (x0Var != null) {
            j0.i(x0Var.v(), R.string.CopiedText);
        }
    }

    public final ra em() {
        return new ra(6, R.id.btn_phone, R.drawable.baseline_phone_24, R.string.PhoneMobile);
    }

    public final void en(CharSequence charSequence) {
        this.f24493a.I3().g(this.f9517m1).F(this, this.f24495b, R.drawable.baseline_error_24, charSequence);
    }

    @Override
    public void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        vm(supergroupFullInfo);
    }

    @Override
    public void f4(long j10, String str) {
        zd.g0.d(this, j10, str);
    }

    @Override
    public void f5(final long j10, String str) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Yk(j10);
            }
        });
    }

    public final void fi() {
        if (this.D0.L0(R.id.btn_inviteLink) == -1) {
            oi(bm(), this.f9512h1);
        }
    }

    public final void fj() {
        if (Fi()) {
            int i10 = this.f9534v0.memberCount;
            if (this.f24495b.c3(this.f9520o0)) {
                i10--;
            }
            CharSequence n22 = i10 > 0 ? w.n2(R.string.DestroyX, i10, w.p(), this.f24495b.U3(C9())) : w.m1(R.string.DestroyXNoMembers, this.f24495b.U3(C9()));
            int[] iArr = {R.id.btn_destroyChat, R.id.btn_cancel};
            String[] strArr = new String[2];
            strArr[0] = w.i1(this.f9534v0.isChannel ? R.string.DestroyChannel : R.string.DestroyGroup);
            strArr[1] = w.i1(R.string.Cancel);
            ee(n22, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i11) {
                    return g0.b(this, i11);
                }

                @Override
                public final boolean r3(View view, int i11) {
                    boolean tk;
                    tk = so.this.tk(view, i11);
                    return tk;
                }
            });
        }
    }

    public final ra fm() {
        int i10 = this.f9518n0;
        if (i10 == 0 || i10 == 1) {
            if (this.f9524q0.username.isEmpty()) {
                return null;
            }
            if (!t2.K2(this.f9524q0)) {
                return new ra(6, R.id.btn_username, R.drawable.baseline_alternate_email_24, R.string.Username);
            }
            return new ra(6, (int) R.id.btn_username, (int) R.drawable.baseline_alternate_email_24, (CharSequence) (this.f24495b.Qc() + this.f9524q0.username), false);
        } else if ((i10 != 3 && i10 != 4) || this.f9534v0.username.isEmpty()) {
            return null;
        } else {
            return new ra(6, (int) R.id.btn_username, (int) R.drawable.baseline_alternate_email_24, (CharSequence) (this.f24495b.Qc() + this.f9534v0.username), false);
        }
    }

    public final void fn() {
        ?? Fi;
        int i10 = this.f9518n0;
        if (i10 == 0 || i10 == 1) {
            gn();
        } else if (i10 == 2 || i10 == 3 || i10 == 4) {
            dn();
        } else if ((i10 == 6 || i10 == 7) && (Fi = Fi()) > 0) {
            jb.c cVar = new jb.c(Fi == true ? 1 : 0);
            ie.u0 u0Var = new ie.u0(Fi);
            if (Fi()) {
                cVar.a(R.id.btn_destroyChat);
                u0Var.a(this.f9534v0.isChannel ? R.string.DestroyChannel : R.string.DestroyGroup);
            }
            Yd(cVar.e(), u0Var.d(), 0);
        }
    }

    @Override
    public void g5(final TdApi.Message message, final long j10, int i10, String str) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.dl(message, j10);
            }
        });
    }

    public final void gi(ArrayList<ra> arrayList) {
        if (Xl()) {
            arrayList.add(new ra(2, R.id.shadowTop));
            arrayList.add(new ra(39));
            arrayList.add(new ra(3, R.id.shadowBottom));
            return;
        }
        arrayList.add(new ra(39));
    }

    public final void gj(MotionEvent motionEvent) {
        v4<?> oj = oj();
        if (oj != null) {
            oj.get().dispatchTouchEvent(motionEvent);
        }
    }

    public final void gm() {
        if (!(this.D0.L0(R.id.btn_description) == -1 && this.D0.L0(R.id.description) == -1)) {
            im();
        }
        this.C0.A0();
        for (int i10 = 0; i10 < this.F0.e(); i10++) {
            v4<?> v10 = this.F0.v(i10);
            if (v10 != null) {
                ((j10) v10).og();
            }
        }
    }

    public final void gn() {
        TdApi.User user = this.f9524q0;
        if (user.f19979id == 0) {
            return;
        }
        if (user.type.getConstructor() == -598644325 || this.f9524q0.type.getConstructor() == -970625144) {
            boolean z10 = this.f9524q0.type.getConstructor() == -970625144;
            long fa2 = this.f24495b.fa();
            if (!z10) {
                long j10 = this.f9524q0.f19979id;
                if (j10 == fa2 && j10 != 0) {
                    Yd(new int[]{R.id.more_btn_edit}, new String[]{w.i1(R.string.EditName)}, 0);
                    return;
                }
            }
            long c10 = ob.a.c(this.f9524q0.f19979id);
            jb.c cVar = new jb.c(4);
            ie.u0 u0Var = new ie.u0(4);
            if (z10 && ((TdApi.UserTypeBot) this.f9524q0.type).canJoinGroups) {
                cVar.a(R.id.more_btn_addToGroup);
                u0Var.a(R.string.BotInvite);
            }
            if (this.f9518n0 == 0) {
                TdApi.User user2 = this.f9524q0;
                if (user2.f19979id != fa2 && !t2.K2(user2)) {
                    cVar.a(R.id.btn_newSecretChat);
                    u0Var.a(R.string.StartEncryptedChat);
                }
            }
            if (z10) {
                if (!ib.i.i(this.f9524q0.username)) {
                    cVar.a(R.id.more_btn_share);
                    u0Var.a(R.string.Share);
                }
            } else if (t2.A2(this.f9524q0)) {
                cVar.a(R.id.more_btn_share);
                u0Var.a(R.string.ShareContact);
            }
            if (!this.f9524q0.isSupport || this.f24495b.h3(c10)) {
                cVar.a(R.id.more_btn_block);
                u0Var.a(this.f24495b.h3(c10) ? z10 ? R.string.UnblockBot : R.string.Unblock : z10 ? R.string.BlockBot : R.string.BlockContact);
            }
            if (this.f24495b.N2(this.f9520o0)) {
                cVar.a(R.id.btn_setPasscode);
                u0Var.a(R.string.PasscodeTitle);
            }
            if (!this.f24495b.h3(c10)) {
                cVar.a(R.id.more_btn_privacy);
                u0Var.a(R.string.EditPrivacy);
            }
            if (t2.O2(this.f9524q0)) {
                cVar.a(R.id.more_btn_edit);
                u0Var.a(R.string.RenameContact);
                cVar.a(R.id.more_btn_delete);
                u0Var.a(R.string.DeleteContact);
            } else if (t2.H(this.f9524q0)) {
                cVar.a(R.id.more_btn_addToContacts);
                u0Var.a(R.string.AddContact);
            }
            if (this.f9518n0 == 1) {
                cVar.a(R.id.more_btn_cloudChat);
                u0Var.a(R.string.OpenCloudChat);
            }
            Yd(cVar.e(), u0Var.d(), 0);
        }
    }

    @Override
    public void h9(Canvas canvas, float f10, int i10, int i11) {
        float a32 = d1.a3(true);
        canvas.drawRect(0.0f, a32 - (f10 * a32), i10, i11, y.g(ae.j.u()));
    }

    public final void hi(TdApi.SearchMessagesFilter searchMessagesFilter) {
        TdApi.SearchMessagesFilter[] sj = sj();
        int size = this.G1.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size && !j10.Pf(this.G1.get(i10))) {
            i10++;
        }
        if (i10 < size) {
            for (TdApi.SearchMessagesFilter searchMessagesFilter2 : sj) {
                if (searchMessagesFilter2.getConstructor() == searchMessagesFilter.getConstructor()) {
                    break;
                }
                if (Lj(searchMessagesFilter2, i10)) {
                    i10++;
                }
            }
        }
        if (i10 == size) {
            z10 = true;
        }
        if (z10) {
            j10<?> Ng = j10.Ng(this.f24493a, this.f24495b, searchMessagesFilter);
            this.G1.add(Ng);
            this.F0.w(this.G1.size() - 1);
            this.G0.getTopView().G1(Ng.X9().toString().toUpperCase());
        } else {
            j10<?> j10Var = this.G1.get(i10);
            if (!j10.Pf(j10Var) || j10Var.wg().getConstructor() != searchMessagesFilter.getConstructor()) {
                j10<?> Ng2 = j10.Ng(this.f24493a, this.f24495b, searchMessagesFilter);
                this.G1.add(i10, Ng2);
                this.F0.w(i10);
                this.G0.getTopView().H1(Ng2.X9().toString().toUpperCase(), i10);
            } else {
                return;
            }
        }
        this.F0.l();
    }

    public void hm(int i10, int i11) {
        this.f9540y0 = i10;
        this.f9542z0 = i11;
        this.D0.p3(R.id.btn_manageInviteLinks);
    }

    public final void hn() {
        if (!Uj()) {
            this.f24495b.O9().g0(this.f9520o0.f19908id, this);
            this.f24495b.O9().k0(this);
        }
        this.f24495b.O9().d0(this.f9520o0.f19908id, this);
        switch (this.f9518n0) {
            case 0:
            case 1:
                this.f24495b.e2().d2(this.f9524q0.f19979id, this);
                if (this.f9518n0 == 1) {
                    this.f24495b.e2().a2(this.f9526r0.f19960id, this);
                    return;
                }
                return;
            case 2:
            case 5:
                this.f24495b.e2().Z1(this.f9530t0.f19904id, this);
                this.f24495b.e2().G(this.f9520o0.f19908id, this);
                return;
            case 3:
            case 4:
            case 6:
            case 7:
                this.f24495b.e2().b2(this.f9534v0.f19965id, this);
                this.f24495b.e2().G(this.f9520o0.f19908id, this);
                return;
            default:
                return;
        }
    }

    public final void ii(final int i10, final f5 f5Var, final View view, final TdApi.ChatMember chatMember, final int i11, boolean z10) {
        o6.i noVar = new o6.i() {
            @Override
            public final void a(boolean z11, TdApi.Error error) {
                so.this.dk(f5Var, view, z11, error);
            }
        };
        String Cb = this.f24495b.Cb(chatMember.memberId);
        TdApi.ChatMemberStatus O3 = this.f24495b.O3(this.f9520o0.f19908id);
        if (O3 == null) {
            O3 = Sj() ? this.f9530t0.status : this.f9534v0.status;
        }
        TdApi.ChatMemberStatus chatMemberStatus = O3;
        int i12 = R.string.AddToTheGroup;
        if (i11 == -1 && ((i10 == 0 || i10 == 1) && !t2.i3(chatMember.status, false) && Sj())) {
            f2 f2Var = new f2(R.id.btn_addMember);
            if (i10 == 1) {
                i12 = R.string.AddAdminToTheGroup;
            }
            me(f2Var.b(w.m1(i12, Cb)).p(new ra[]{new ra(13, (int) R.id.btn_forwardLast100, 0, (CharSequence) w.o2(R.string.ForwardLastXMessages, 100L), (int) R.id.btn_addMember, false), new ra(13, (int) R.id.btn_forwardLast50, 0, (CharSequence) w.o2(R.string.ForwardLastXMessages, 50L), (int) R.id.btn_addMember, true), new ra(13, (int) R.id.btn_forwardLast15, 0, (CharSequence) w.o2(R.string.ForwardLastXMessages, 15L), (int) R.id.btn_addMember, false), new ra(13, (int) R.id.btn_addToGroup, 0, (int) R.string.justAdd, (int) R.id.btn_addMember, false)}).j(new v4.r() {
                @Override
                public final void l6(int i13, SparseIntArray sparseIntArray) {
                    so.this.ek(i10, f5Var, view, chatMember, i13, sparseIntArray);
                }
            }).r(R.string.AddMemberBtn));
        } else if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (t2.P2(chatMember.status) || (t2.H2(chatMember.status) && !((TdApi.ChatMemberStatusAdministrator) chatMember.status).canBeEdited)) {
                        f5Var.t().I3().g(view).F(f5Var, this.f24495b, R.drawable.baseline_error_24, w.m1(R.string.YouCantBanX, Cb));
                    } else if (Sj() || Tj()) {
                        ee(w.m1(Sj() ? R.string.MemberCannotJoinGroup : R.string.MemberCannotJoinChannel, Cb), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{w.i1(R.string.BlockUser), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i13) {
                                return g0.b(this, i13);
                            }

                            @Override
                            public final boolean r3(View view2, int i13) {
                                boolean hk;
                                hk = so.this.hk(chatMember, f5Var, view, view2, i13);
                                return hk;
                            }
                        });
                    } else {
                        u7 u7Var = new u7(this.f24493a, this.f24495b);
                        u7Var.sg(new u7.d(this.f9520o0.f19908id, chatMember.memberId, true, chatMemberStatus, chatMember));
                        f5Var.id();
                        f5Var.ac(u7Var);
                    }
                }
            } else if (t2.P2(chatMember.status) || (t2.H2(chatMember.status) && !((TdApi.ChatMemberStatusAdministrator) chatMember.status).canBeEdited)) {
                x2.h g10 = f5Var.t().I3().g(view);
                o6 o6Var = this.f24495b;
                g10.F(f5Var, o6Var, R.drawable.baseline_info_24, w.j1(R.string.XIsAlreadyAdmin, o6Var.Cb(chatMember.memberId)));
            } else if (Di() || !(chatMember.status.getConstructor() == 1661432998 || chatMember.status.getConstructor() == -1653518666)) {
                u7 u7Var2 = new u7(this.f24493a, this.f24495b);
                u7Var2.sg(new u7.d(this.f9520o0.f19908id, chatMember.memberId, false, chatMemberStatus, chatMember).a(i11));
                f5Var.id();
                f5Var.ac(u7Var2);
            } else {
                f5Var.t().I3().g(view).F(f5Var, this.f24495b, R.drawable.baseline_error_24, w.m1(R.string.YouCantPromoteX, Cb));
            }
        } else if (t2.h3(chatMember.status)) {
            f5Var.t().I3().g(view).F(f5Var, this.f24495b, R.drawable.baseline_info_24, w.j1(R.string.XIsAlreadyInChat, Cb));
        } else if (z10) {
            v4.p.a aVar = new v4.p.a();
            if (Tj()) {
                i12 = R.string.QAddXToChannel;
            }
            ge(aVar.c(w.m1(i12, Cb)).d(new v4.o(R.id.btn_addMember, w.i1(R.string.AddMember), 1, R.drawable.baseline_person_add_24)).b().a(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i13) {
                    return g0.b(this, i13);
                }

                @Override
                public final boolean r3(View view2, int i13) {
                    boolean fk;
                    fk = so.this.fk(i10, f5Var, view, chatMember, i11, view2, i13);
                    return fk;
                }
            });
        } else {
            this.f24495b.Lb(this.f9520o0.f19908id, chatMember.memberId, new TdApi.ChatMemberStatusMember(), i11, chatMember.status, noVar);
        }
    }

    public final void ij() {
        s8 s8Var = new s8(this.f24493a, this.f24495b);
        s8Var.Sf(new s8.c(this.f9520o0.f19908id));
        ac(s8Var);
    }

    public final void im() {
        this.C1 = 0;
        this.B1 = 0;
        for (int i10 = 0; i10 < this.F0.e(); i10++) {
            v4<?> v10 = this.F0.v(i10);
            if (v10 != null) {
                ((j10) v10).pg();
            }
        }
        Zi();
    }

    public final void in() {
        TdApi.Supergroup supergroup = this.f9534v0;
        boolean z10 = !supergroup.signMessages;
        supergroup.signMessages = z10;
        this.f24495b.v4().o(new TdApi.ToggleSupergroupSignMessages(this.f9534v0.f19965id, z10), this.f24495b.na());
        this.D0.p3(R.id.btn_toggleSignatures);
    }

    @Override
    public void j0(final long j10, final long j11, final TdApi.MessageContent messageContent) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.cl(j10, j11, messageContent);
            }
        });
    }

    @Override
    public void j2(int i10) {
        Pj();
        if (this.E0.getCurrentItem() != i10) {
            this.G0.getTopView().V1(this.E0.getCurrentItem(), i10);
            this.f9541y1 = i10;
            Oi(i10);
            this.E0.N(i10, true);
        }
    }

    @Override
    public void j4(Object obj, j1.r rVar) {
        v4<?> v10;
        if (this.f9537w1 == 0.0f) {
            Iterator<j10<?>> it = this.G1.iterator();
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next() instanceof r10) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10 && this.f9535v1 == i10 && (v10 = this.F0.v(i10)) != null) {
                ((r10) v10).j4(obj, rVar);
            }
        }
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        super.j6(z10, bVar);
        ud.m mVar = this.B0;
        if (mVar != null) {
            mVar.setTextColor(ib.d.d(ae.j.n0(), ae.j.P0(), Da()));
        }
    }

    @Override
    public boolean jc(boolean z10) {
        eb.k kVar;
        if (cb() || ((kVar = this.O0) != null && kVar.v())) {
            return true;
        }
        if (this.X0) {
            cj();
            return true;
        } else if (!Uj() || !Nj()) {
            return false;
        } else {
            qe(null);
            return true;
        }
    }

    public final void ji(View view) {
        if (Ci() && !ab()) {
            if (this.f9518n0 == 3) {
                TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
                if (supergroupFullInfo != null) {
                    if (supergroupFullInfo.memberCount >= this.f24495b.Jc()) {
                        x2.h g10 = this.f24493a.I3().g(view);
                        o6 o6Var = this.f24495b;
                        g10.F(this, o6Var, R.drawable.baseline_error_24, w.q2(R.string.ParticipantXLimitReached, o6Var.Jc()));
                        return;
                    }
                } else {
                    return;
                }
            }
            if (Ji() || Di()) {
                jb.c cVar = new jb.c(3);
                jb.c cVar2 = new jb.c(3);
                ie.u0 u0Var = new ie.u0(3);
                cVar.a(R.id.btn_addMember);
                cVar2.a(R.drawable.baseline_person_add_24);
                u0Var.a(R.string.AddMember);
                if (Ji()) {
                    cVar.a(R.id.btn_addAdmin);
                    cVar2.a(R.drawable.baseline_stars_24);
                    u0Var.a(R.string.ChannelAddAdmin);
                }
                if (Di()) {
                    cVar.a(R.id.btn_banMember);
                    if (this.f9518n0 == 3) {
                        cVar2.a(R.drawable.baseline_block_24);
                        u0Var.a(R.string.BanMember);
                    } else {
                        cVar2.a(R.drawable.baseline_remove_circle_24);
                        u0Var.a(R.string.BanMember);
                    }
                }
                ee(null, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
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
                        boolean ak;
                        ak = so.this.ak(view2, i10);
                        return ak;
                    }
                });
                return;
            }
            li(0);
        }
    }

    public final void jj() {
        m6 m6Var = new m6(this.f24493a, this.f24495b);
        m6Var.wf(new m6.b(rj(), this.f9520o0.f19908id).a(this));
        ac(m6Var);
    }

    public final void jm() {
        u7 u7Var = new u7(this.f24493a, this.f24495b);
        u7Var.sg(new u7.d(this.f9520o0.f19908id));
        ac(u7Var);
    }

    public final void jn(View view) {
        if (this.f24495b.P2(this.f9520o0.f19908id)) {
            TdApi.Chat chat = this.f9520o0;
            boolean z10 = !chat.hasProtectedContent;
            chat.hasProtectedContent = z10;
            this.f24495b.v4().o(new TdApi.ToggleChatHasProtectedContent(this.f9520o0.f19908id, z10), this.f24495b.na());
            this.D0.p3(R.id.btn_toggleProtection);
            return;
        }
        t().I3().g(((uc.c) view).getToggler()).C(this.f24495b, Tj() ? R.string.OnlyOwnerChannel : R.string.OnlyOwnerGroup);
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        zd.g0.y(this, j10, videoChat);
    }

    @Override
    public void kc() {
        super.kc();
        if (!Uj()) {
            ((ud.n) this.C0).setFactorLocked(true);
        }
    }

    public final void ki(f5 f5Var, View view, TdApi.MessageSender messageSender) {
        TdApi.ChatMember h02;
        int i10 = this.f9531t1;
        final AtomicReference atomicReference = new AtomicReference();
        final b bVar = new b(f5Var, atomicReference, i10, view);
        ed.n nVar = this.f9538x0;
        if (nVar == null || (h02 = nVar.h0(messageSender)) == null) {
            t().E3(w.i1(R.string.LoadingInformation), new a.l() {
                @Override
                public final void a() {
                    b.this.c();
                }
            }, 1000L);
            La();
            this.f24495b.v4().o(new TdApi.GetChatMember(this.f9520o0.f19908id, messageSender), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    so.this.bk(atomicReference, bVar, object);
                }
            });
            return;
        }
        atomicReference.set(h02);
        bVar.run();
    }

    public final void kj() {
        throw new UnsupportedOperationException("Method not decompiled: de.so.kj():void");
    }

    public final void km() {
        TdApi.ChatMemberStatus O3 = this.f24495b.O3(this.f9520o0.f19908id);
        if (O3 != null) {
            p0 p0Var = new p0(this.f24493a, this.f24495b);
            p0Var.Hh(new p0.d(this.f9520o0.f19908id, this.f24495b.fa(), this, this, O3.getConstructor() == -160019714));
            ac(p0Var);
        }
    }

    public final void kn() {
        final boolean z10;
        TdApi.SupergroupFullInfo supergroupFullInfo;
        TdApi.SupergroupFullInfo supergroupFullInfo2 = this.f9536w0;
        if (supergroupFullInfo2 != null) {
            z10 = supergroupFullInfo2.isAllHistoryAvailable;
        } else if (this.f9532u0 != null) {
            z10 = false;
        } else {
            return;
        }
        final ra raVar = new ra(28, 0, 0, z10 ? R.string.ChatHistoryVisibleInfo : R.string.ChatHistoryHiddenInfo, false);
        if (!(z10 || (supergroupFullInfo = this.f9536w0) == null || supergroupFullInfo.linkedChatId == 0)) {
            raVar.X(new SpannableStringBuilder(w.i1(R.string.ChatHistoryHiddenInfo)).append((CharSequence) "\n\n").append(w.m1(R.string.ChatHistoryWarnLinkedChannel, this.f24495b.U3(this.f9536w0.linkedChatId))));
        }
        if (this.f9532u0 != null) {
            raVar.X(w.o2(R.string.ChatHistoryPartiallyHiddenInfo, 100L));
        }
        me(new f2(R.id.btn_prehistoryMode).p(new ra[]{new ra(13, (int) R.id.btn_visible, 0, (int) R.string.ChatHistoryVisible, (int) R.id.btn_prehistoryMode, z10), new ra(13, (int) R.id.btn_hidden, 0, (int) R.string.ChatHistoryHidden, (int) R.id.btn_prehistoryMode, !z10)}).i(raVar).n(new v4.n() {
            @Override
            public final void a(View view, int i10, ra raVar2, TextView textView, iq iqVar) {
                so.this.Kl(raVar, view, i10, raVar2, textView, iqVar);
            }
        }).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                so.this.Ol(z10, i10, sparseIntArray);
            }
        }));
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        zd.g0.w(this, j10, i10, z10);
    }

    @Override
    public void l5(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        g1.c(this, j10, j11, i10, replyMarkup);
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    public final void li(int i10) {
        this.f9531t1 = i10;
        f5 f5Var = new f5(this.f24493a, this.f24495b);
        f5Var.zg(10);
        boolean z10 = false;
        f5Var.Vg(!Tj() || i10 == 1);
        if (!Tj()) {
            boolean z11 = i10 == 2;
            if (i10 == 2) {
                z10 = true;
            }
            f5Var.Wg(z11, z10);
        }
        f5Var.Xg(new f5.b(this));
        int i11 = this.f9531t1;
        if (i11 == 0) {
            f5Var.Zg(R.string.AddMember, this.f9520o0.title);
        } else if (i11 == 1) {
            f5Var.Zg(R.string.ChannelAddAdmin, this.f9520o0.title);
        } else if (i11 == 2) {
            f5Var.Zg(R.string.BanMember, this.f9520o0.title);
        }
        ac(f5Var);
    }

    public final void lj(long j10, TdApi.MessageContent messageContent) {
        int e10 = this.F0.e();
        for (int i10 = 0; i10 < e10; i10++) {
            v4<?> v10 = this.F0.v(i10);
            if (v10 != null) {
                ((j10) v10).wf(j10, messageContent);
            }
        }
    }

    public final void lm() {
        final TdApi.ChatInviteLink vj = vj();
        if (vj == null) {
            km();
            return;
        }
        ie.u0 u0Var = new ie.u0(5);
        jb.c cVar = new jb.c(5);
        jb.c cVar2 = new jb.c(5);
        jb.c cVar3 = new jb.c(5);
        cVar2.a(R.id.btn_manageInviteLinks);
        u0Var.a(R.string.InviteLinkManage);
        cVar.a(R.drawable.baseline_add_link_24);
        cVar3.a(1);
        TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo = this.f9520o0.pendingJoinRequests;
        if (chatJoinRequestsInfo != null && chatJoinRequestsInfo.totalCount > 0) {
            cVar2.a(R.id.btn_manageJoinRequests);
            u0Var.a(R.string.InviteLinkRequests);
            cVar.a(R.drawable.baseline_pending_24);
            cVar3.a(1);
        }
        cVar2.a(R.id.btn_copyLink);
        u0Var.a(R.string.InviteLinkCopy);
        cVar.a(R.drawable.baseline_content_copy_24);
        cVar3.a(1);
        cVar2.a(R.id.btn_shareLink);
        u0Var.a(R.string.ShareLink);
        cVar.a(R.drawable.baseline_forward_24);
        cVar3.a(1);
        cVar.a(R.drawable.baseline_link_off_24);
        cVar2.a(R.id.btn_revokeLink);
        u0Var.a(R.string.RevokeLink);
        cVar3.a(2);
        ee(w.h1(R.string.format_nameAndStatus, bo.f7585a, vj.inviteLink, t2.p4(w.h1(R.string.CreatedByXOnDate, new w.f() {
            @Override
            public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
                Object ql;
                ql = so.this.ql(vj, charSequence, i10, i11, i12, z10);
                return ql;
            }
        }, this.f24495b.e2().J2(vj.creatorUserId), w.Z0(vj.date, TimeUnit.SECONDS)))), cVar2.e(), u0Var.d(), cVar3.e(), cVar.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean vl;
                vl = so.this.vl(vj, view, i10);
                return vl;
            }
        });
    }

    public final void ln() {
        if (!Uj()) {
            this.f24495b.O9().t0(this.f9520o0.f19908id, this);
            this.f24495b.O9().x0(this);
        }
        this.f24495b.O9().q0(this.f9520o0.f19908id, this);
        switch (this.f9518n0) {
            case 0:
            case 1:
                this.f24495b.e2().r2(this.f9524q0.f19979id, this);
                if (this.f9518n0 == 1) {
                    this.f24495b.e2().o2(this.f9526r0.f19960id, this);
                    return;
                }
                return;
            case 2:
            case 5:
                this.f24495b.e2().n2(this.f9530t0.f19904id, this);
                this.f24495b.e2().J1(this.f9520o0.f19908id, this);
                return;
            case 3:
            case 4:
            case 6:
            case 7:
                this.f24495b.e2().p2(this.f9534v0.f19965id, this);
                this.f24495b.e2().J1(this.f9520o0.f19908id, this);
                return;
            default:
                return;
        }
    }

    @Override
    public String ma() {
        v4<?> oj = oj();
        if (oj != null) {
            return ((j10) oj).Bf();
        }
        return null;
    }

    @Override
    public void mc(Configuration configuration) {
        CustomRecyclerView customRecyclerView;
        super.mc(configuration);
        if (!Uj() && (customRecyclerView = this.C0) != null) {
            ((ud.n) customRecyclerView).P1();
        }
    }

    public final void mi(TdApi.Message message) {
        int r42;
        if (nj(message) && C9() == message.chatId && (r42 = t2.r4(message, false)) != -869395657) {
            TdApi.SearchMessagesFilter[] sj = sj();
            int length = sj.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                TdApi.SearchMessagesFilter searchMessagesFilter = sj[i10];
                if (searchMessagesFilter.getConstructor() == r42) {
                    Oj(searchMessagesFilter);
                    break;
                }
                i10++;
            }
        }
        int e10 = this.F0.e();
        for (int i11 = 0; i11 < e10; i11++) {
            v4<?> v10 = this.F0.v(i11);
            if (v10 != null) {
                ((j10) v10).ef(message);
            }
        }
    }

    public final void mm() {
        s sVar = new s(this.f24493a, this.f24495b);
        sVar.Cg(new s.a(this.f9520o0.f19908id, "", this));
        ac(sVar);
    }

    public final void mn() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            ud.b backButton = d1Var.getBackButton();
            int j02 = ae.j.j0();
            ud.m mVar = this.B0;
            backButton.setColor(ib.d.d(ib.d.d(j02, -1, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f), ae.j.L(R.id.theme_color_icon), Da()));
            this.R.a4(W9(), this, Da());
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        Nm(f10);
    }

    public void ni(RecyclerView recyclerView) {
        recyclerView.k(new c());
    }

    public final void nm() {
        TdApi.ChatPhotoInfo chatPhotoInfo = this.f9520o0.photo;
        if (chatPhotoInfo != null && !t2.S2(chatPhotoInfo.small)) {
            od.j1.hk(this, this.f9520o0, this.B0);
        }
    }

    public void nn(long j10, String str) {
        if (C9() == j10) {
            TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
            if (supergroupFullInfo != null) {
                supergroupFullInfo.description = str;
            }
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f9532u0;
            if (basicGroupFullInfo != null) {
                basicGroupFullInfo.description = str;
            }
            Qi();
        }
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
    }

    @Override
    public void o6() {
        super.o6();
        if (Build.VERSION.SDK_INT >= 26 && this.D0 != null) {
            Ql();
        }
    }

    @Override
    public View oc(Context context) {
        d dVar = new d(context);
        this.A0 = dVar;
        yd.g.i(dVar, R.id.theme_color_background, this);
        this.A0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        v2 v2Var = new v2(context);
        this.E0 = v2Var;
        v2Var.setOverScrollMode(2);
        this.E0.c(this);
        v2 v2Var2 = this.E0;
        h4 h4Var = new h4(this);
        this.F0 = h4Var;
        v2Var2.setAdapter(h4Var);
        this.E0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.A0.addView(this.E0);
        if (Uj()) {
            this.C0 = new e(context);
        } else {
            ud.m mVar = new ud.m(context, this.f24495b, this);
            this.B0 = mVar;
            mVar.setAvatarExpandListener(new m.b() {
                @Override
                public final void a(m mVar2, float f10, boolean z10, float f11, float f12) {
                    so.this.al(mVar2, f10, z10, f11, f12);
                }
            });
            this.B0.setInnerRightMarginStart(a0.i(49.0f));
            this.B0.R1(a0.i(56.0f), Ai());
            this.B0.K1();
            this.B0.s1(this, false);
            this.B0.setPhotoOpenCallback(this);
            f fVar = new f(context, this);
            this.C0 = fVar;
            fVar.Q1(this.B0, this);
        }
        this.C0.k(new g());
        this.C0.setHasFixedSize(true);
        this.C0.g(new n());
        this.C0.setItemAnimator(null);
        this.C0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.C0.setOverScrollMode(2);
        this.C0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.A0.addView(this.C0);
        p pVar = new p(context);
        this.I0 = pVar;
        t8(pVar);
        this.I0.setLayoutParams(FrameLayoutFix.q1(-1, d1.a3(true)));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.H0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, Bj() + Hj() + a0.i(6.0f)));
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, Bj());
        q12.topMargin = Hj();
        z4 z4Var = new z4(context);
        this.G0 = z4Var;
        yd.g.i(z4Var, R.id.theme_color_filling, this);
        b5 topView = this.G0.getTopView();
        topView.a2();
        topView.setOnItemClickListener(this);
        topView.Y1(R.id.theme_color_profileSectionActive);
        topView.Z1(R.id.theme_color_textLight, R.id.theme_color_profileSectionActiveContent);
        t8(topView);
        topView.setItems(Aj());
        this.G0.getRecyclerView().setLayoutParams(FrameLayoutFix.q1(-1, -1));
        topView.setLayoutParams(FrameLayoutFix.q1(-2, -1));
        this.G0.setLayoutParams(q12);
        this.H0.addView(this.G0);
        t8(topView);
        FrameLayout.LayoutParams q13 = FrameLayoutFix.q1(-1, a0.i(6.0f));
        q13.topMargin = Bj() + Hj();
        f3 f3Var = new f3(context);
        t8(f3Var);
        f3Var.setSimpleBottomTransparentShadow(false);
        f3Var.setLayoutParams(q13);
        this.H0.addView(f3Var);
        FrameLayout.LayoutParams q14 = FrameLayoutFix.q1(-1, Hj());
        f3 f3Var2 = new f3(context);
        this.J0 = f3Var2;
        t8(f3Var2);
        this.J0.setSimpleTopShadow(true);
        this.J0.setLayoutParams(q14);
        if (Xl()) {
            this.A0.addView(this.H0);
            this.A0.addView(this.I0);
            this.A0.addView(this.J0);
        }
        this.D0 = new h(this);
        this.G0.getRecyclerView().k(new i());
        ti();
        this.C0.setAdapter(this.D0);
        ud.m mVar2 = this.B0;
        if (mVar2 != null) {
            mVar2.setShowLock(this.f9518n0 == 1);
            Qm(false);
            Sm();
            Rm(false);
            if (this.f9518n0 == 1) {
                this.f24495b.hd().Z8(W9(), this.R, this.f9520o0, true);
            }
        }
        hn();
        if (!Uj()) {
            this.f24495b.v4().o(new TdApi.GetChat(this.f9520o0.f19908id), this);
            int i10 = this.f9518n0;
            if (i10 == 0 || i10 == 1) {
                ym(this.f24495b.e2().D2(this.f9524q0.f19979id));
            } else if (i10 == 2) {
                xm(this.f24495b.e2().O(this.f9530t0.f19904id));
            } else if (i10 == 3) {
                this.f24495b.v4().o(new TdApi.GetSupergroupMembers(this.f9534v0.f19965id, new TdApi.SupergroupMembersFilterRecent(), 0, a0.b(a0.i(84.0f), 0)), this);
                vm(this.f24495b.e2().h2(this.f9534v0.f19965id));
            } else if (i10 == 4) {
                vm(this.f24495b.e2().h2(this.f9534v0.f19965id));
                if (t2.P2(this.f9534v0.status)) {
                    this.f24495b.v4().o(new TdApi.GetSupergroupMembers(this.f9534v0.f19965id, new TdApi.SupergroupMembersFilterAdministrators(), 0, a0.b(a0.i(84.0f), 0)), this);
                }
            }
        }
        return this.A0;
    }

    public final void oi(ra raVar, int i10) {
        int min = Math.min(this.f9512h1, i10);
        if (this.f9512h1 == 0) {
            this.D0.D0().add(1, raVar);
            this.D0.D0().add(2, new ra(3));
            this.D0.D0().add(3, new ra(2));
            this.D0.M(1, 3);
        } else {
            int i11 = 11;
            if (min == 0) {
                this.D0.D0().add(1, raVar);
                List<ra> D0 = this.D0.D0();
                if (raVar.A() != 7) {
                    i11 = 1;
                }
                D0.add(2, new ra(i11));
                this.D0.M(1, 2);
            } else {
                int max = Math.max(0, (min * 2) - 1) + 1;
                List<ra> D02 = this.D0.D0();
                if (raVar.A() != 7) {
                    i11 = 1;
                }
                D02.add(max, new ra(i11));
                this.D0.D0().add(max + 1, raVar);
                this.D0.M(max, 2);
            }
        }
        this.f9512h1++;
        im();
    }

    public final v4<?> oj() {
        return this.F0.v(this.E0.getCurrentItem());
    }

    public final void om() {
        bl blVar = new bl(this.f24493a, this.f24495b);
        blVar.Ad(new bl.c(C9()));
        ac(blVar);
    }

    public final void on(boolean z10) {
        if (this.B0 != null) {
            Sm();
            if (z10) {
                Rm(true);
            }
            this.B0.invalidate();
        }
    }

    @Override
    public void onClick(View view) {
        byte[] bArr;
        TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo;
        switch (view.getId()) {
            case R.id.avatar:
                Ki();
                return;
            case R.id.btn_channelType:
                ij();
                return;
            case R.id.btn_chatPermissions:
                jm();
                return;
            case R.id.btn_description:
                if (!Gi() || !ib.i.i(rj())) {
                    jb.c cVar = new jb.c(2);
                    ie.u0 u0Var = new ie.u0(2);
                    jb.c cVar2 = new jb.c(2);
                    if (Gi()) {
                        cVar.a(R.id.btn_edit);
                        u0Var.a(R.string.edit);
                        cVar2.a(R.drawable.baseline_edit_24);
                    }
                    cVar.a(R.id.btn_copyText);
                    u0Var.a(R.string.Copy);
                    cVar2.a(R.drawable.baseline_content_copy_24);
                    ee(null, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
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
                            boolean Zk;
                            Zk = so.this.Zk(view2, i10);
                            return Zk;
                        }
                    });
                    return;
                }
                jj();
                return;
            case R.id.btn_done:
                qi();
                return;
            case R.id.btn_encryptionKey:
                TdApi.SecretChat secretChat = this.f9526r0;
                if (secretChat != null && (bArr = secretChat.keyHash) != null && bArr.length > 0) {
                    o9 o9Var = new o9(this.f24493a, this.f24495b);
                    o9Var.Qe(new o9.b(this.f9524q0.f19979id, this.f9526r0.keyHash));
                    ac(o9Var);
                    return;
                }
                return;
            case R.id.btn_inviteLink:
                lm();
                return;
            case R.id.btn_linkedChat:
                kj();
                return;
            case R.id.btn_manageInviteLinks:
                km();
                return;
            case R.id.btn_manageJoinRequests:
                mm();
                return;
            case R.id.btn_notifications:
                this.f24495b.hd().G8(this, this.f9520o0.f19908id, true, null);
                return;
            case R.id.btn_phone:
                this.f24495b.hd().t3(this, view, view.getId(), this.f9524q0, false);
                return;
            case R.id.btn_prehistoryMode:
                kn();
                return;
            case R.id.btn_recentActions:
                pm();
                return;
            case R.id.btn_toggleProtection:
                jn(view);
                return;
            case R.id.btn_toggleSignatures:
                in();
                return;
            case R.id.btn_useExplicitDice:
                he.i.c2().i5(((ra) view.getTag()).m(), this.D0.S2(view));
                return;
            case R.id.btn_username:
                TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
                boolean z10 = false;
                boolean z11 = supergroupFullInfo != null && supergroupFullInfo.canSetUsername;
                TdApi.Chat chat = this.f9520o0;
                if (chat != null && this.f24495b.C2(chat)) {
                    z10 = true;
                }
                int i10 = 3;
                if (z11) {
                    i10 = 4;
                }
                if (z10) {
                    i10++;
                }
                jb.c cVar3 = new jb.c(i10);
                ie.u0 u0Var2 = new ie.u0(i10);
                jb.c cVar4 = new jb.c(i10);
                if (z11) {
                    cVar3.a(R.id.btn_editUsername);
                    u0Var2.a(R.string.edit);
                    cVar4.a(R.drawable.baseline_edit_24);
                }
                if (z10) {
                    cVar3.a(R.id.btn_manageInviteLinks);
                    u0Var2.a(R.string.InviteLinkManage);
                    cVar4.a(R.drawable.baseline_add_link_24);
                }
                if (z10 && (chatJoinRequestsInfo = this.f9520o0.pendingJoinRequests) != null && chatJoinRequestsInfo.totalCount > 0) {
                    cVar3.a(R.id.btn_manageJoinRequests);
                    u0Var2.a(R.string.InviteLinkRequests);
                    cVar4.a(R.drawable.baseline_pending_24);
                }
                cVar3.a(R.id.btn_copyUsername);
                u0Var2.a(R.string.Copy);
                cVar4.a(R.drawable.baseline_content_copy_24);
                cVar3.a(R.id.btn_copyLink);
                u0Var2.a(R.string.CopyLink);
                cVar4.a(R.drawable.baseline_link_24);
                cVar3.a(R.id.btn_share);
                u0Var2.a(R.string.Share);
                cVar4.a(R.drawable.baseline_forward_24);
                de("@" + this.f24495b.j4(this.f9520o0.f19908id), cVar3.e(), u0Var2.d(), null, cVar4.e());
                return;
            case R.id.btn_viewStatistics:
                qm();
                return;
            case R.id.menu_btn_clear:
                v4<?> oj = oj();
                if (oj != null) {
                    ((j10) oj).tf();
                    return;
                }
                return;
            case R.id.menu_btn_copy:
                v4<?> oj2 = oj();
                if (oj2 != null) {
                    ((j10) oj2).uf();
                    return;
                }
                return;
            case R.id.menu_btn_delete:
                v4<?> oj3 = oj();
                if (oj3 != null) {
                    ((j10) oj3).vf();
                    return;
                }
                return;
            case R.id.menu_btn_forward:
                v4<?> oj4 = oj();
                if (oj4 != null) {
                    ((j10) oj4).Ig();
                    return;
                }
                return;
            case R.id.menu_btn_view:
                v4<?> oj5 = oj();
                if (oj5 != null) {
                    ((j10) oj5).Og();
                    return;
                }
                return;
            case R.id.user:
                TdApi.User user = (TdApi.User) view.getTag();
                if (user != null) {
                    this.f24495b.hd().v7(this, user.f19979id, null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public boolean onLongClick(View view) {
        final TdApi.User user;
        if (view.getId() != R.id.user || (user = (TdApi.User) view.getTag()) == null) {
            return false;
        }
        int i10 = this.f9518n0;
        if (i10 != 2 && i10 != 3) {
            return false;
        }
        jb.c cVar = new jb.c(3);
        ie.u0 u0Var = new ie.u0(3);
        jb.c cVar2 = new jb.c(3);
        if (Hi(user.f19979id)) {
            cVar.a(R.id.btn_deleteMember);
            u0Var.a(R.string.KickFromGroup);
            cVar2.a(2);
        }
        if (!this.f24495b.o7(user.f19979id)) {
            cVar.a(R.id.btn_groupsInCommon);
            u0Var.a(R.string.ViewGroupsInCommon);
            cVar2.a(1);
        }
        if (cVar.f()) {
            cVar.a(R.id.btn_openChat);
            u0Var.a(R.string.OpenChat);
            cVar2.a(1);
        }
        cVar.a(R.id.btn_cancel);
        u0Var.a(R.string.Cancel);
        cVar2.a(1);
        ke(cVar.e(), u0Var.d(), cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view2, int i11) {
                boolean bl;
                bl = so.this.bl(user, view2, i11);
                return bl;
            }
        });
        return true;
    }

    @Override
    public void p6(long j10, boolean z10) {
        zd.g0.h(this, j10, z10);
    }

    public final void pi(float f10) {
        if (this.O0 == null) {
            this.O0 = new eb.k(0, this, db.b.f7287b, 218L, this.N0);
        }
        this.O0.i(f10);
    }

    public final int pj() {
        v4<?> oj = oj();
        if (oj != null) {
            return ((j10) oj).kf();
        }
        return 0;
    }

    public final void pm() {
        rh rhVar = new rh(this.f24493a, this.f24495b);
        rhVar.Lp(new rh.c0(3, null, this.f9520o0));
        ac(rhVar);
    }

    public final void pn() {
        ud.m mVar = this.B0;
        if (mVar != null) {
            mVar.setIgnoreMute(this.Q0);
            if (this.Q0) {
                v4<?> oj = oj();
                this.B0.setInnerRightMargin((!(oj instanceof j10) || !((j10) oj).rf()) ? 0 : a0.i(49.0f));
                return;
            }
            this.B0.setInnerRightMargin(Ai());
        }
    }

    @Override
    public void q2(long j10, boolean z10) {
        zd.g0.e(this, j10, z10);
    }

    @Override
    public void q4(TdApi.ChatInviteLink chatInviteLink) {
        TdApi.SupergroupFullInfo supergroupFullInfo;
        int i10 = this.f9518n0;
        if (i10 == 2) {
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f9532u0;
            if (basicGroupFullInfo != null) {
                basicGroupFullInfo.inviteLink = chatInviteLink;
                sn(R.id.btn_inviteLink);
            }
        } else if ((i10 == 3 || i10 == 4) && (supergroupFullInfo = this.f9536w0) != null) {
            supergroupFullInfo.inviteLink = chatInviteLink;
            sn(R.id.btn_inviteLink);
        }
    }

    public final void qi() {
        ri(false);
    }

    public final ArrayList<j10<?>> qj() {
        TdApi.UserFullInfo D2;
        if (this.G1.isEmpty()) {
            int i10 = this.f9518n0;
            if (i10 == 5 || i10 == 6) {
                this.G1.add(new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterAdministrators()));
                if (this.f9518n0 != 6 ? t2.P2(this.f9530t0.status) : t2.H2(this.f9534v0.status)) {
                    this.G1.add(new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterRestricted()));
                    this.G1.add(new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterBanned()));
                }
            } else if (i10 != 7) {
                String K3 = this.f24495b.K3(this.f9520o0);
                int i11 = this.f9518n0;
                if (i11 == 2 || i11 == 3) {
                    this.G1.add(new d20(this.f24493a, this.f24495b));
                }
                if (K3 == null) {
                    TdApi.SearchMessagesFilter[] sj = sj();
                    this.I1 = sj.length - 3;
                    for (TdApi.SearchMessagesFilter searchMessagesFilter : sj) {
                        if (Xj(searchMessagesFilter)) {
                            this.G1.add(j10.Ng(this.f24493a, this.f24495b, searchMessagesFilter));
                        } else {
                            zj(searchMessagesFilter, true);
                        }
                    }
                    for (TdApi.SearchMessagesFilter searchMessagesFilter2 : sj) {
                        if (Xj(searchMessagesFilter2)) {
                            zj(searchMessagesFilter2, true);
                        }
                    }
                } else {
                    this.G1.add(new e20(this.f24493a, this.f24495b).Qg(K3));
                }
                int i12 = this.f9518n0;
                if ((i12 == 0 || i12 == 1) && (D2 = this.f24495b.e2().D2(this.f9524q0.f19979id)) != null && D2.groupInCommonCount > 0) {
                    this.G1.add(new m10(this.f24493a, this.f24495b));
                }
            } else {
                this.G1.add(new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterAdministrators()));
                this.G1.add(new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterBanned()));
                TdApi.SupergroupFullInfo h22 = this.f24495b.e2().h2(this.f9534v0.f19965id);
                if (h22 != null && h22.canGetMembers) {
                    this.G1.add(new d20(this.f24493a, this.f24495b).Ch(new TdApi.SupergroupMembersFilterRecent()));
                }
            }
        }
        return this.G1;
    }

    public final void qm() {
        k1 k1Var = new k1(this.f24493a, this.f24495b);
        k1Var.Ad(new k1.b(this.f9520o0.f19908id));
        ac(k1Var);
    }

    public void qn(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        int i10;
        float f10 = 1.0f;
        float f11 = w.G2() ? 1.0f : -1.0f;
        u0 u0Var = this.f9507c1;
        int i11 = 0;
        if (u0Var != null) {
            u0Var.setAlpha(z12 ? 1.0f : 0.0f);
            i10 = (z12 ? a0.i(48.0f) : 0) + 0;
        } else {
            i10 = 0;
        }
        u0 u0Var2 = this.f9508d1;
        if (u0Var2 != null) {
            u0Var2.setAlpha(z10 ? 1.0f : 0.0f);
            this.f9508d1.setTranslationX(i10 * f11);
            i10 += z10 ? a0.i(48.0f) : 0;
        }
        u0 u0Var3 = this.f9506b1;
        if (u0Var3 != null) {
            u0Var3.setAlpha(z11 ? 1.0f : 0.0f);
            this.f9506b1.setTranslationX(i10 * f11);
            i10 += z11 ? a0.i(48.0f) : 0;
        }
        u0 u0Var4 = this.f9509e1;
        if (u0Var4 != null) {
            u0Var4.setAlpha(z13 ? 1.0f : 0.0f);
            this.f9509e1.setTranslationX(i10 * f11);
            if (z13) {
                i11 = a0.i(48.0f);
            }
            i10 += i11;
        }
        u0 u0Var5 = this.f9510f1;
        if (u0Var5 != null) {
            if (!z14) {
                f10 = 0.0f;
            }
            u0Var5.setAlpha(f10);
            this.f9510f1.setTranslationX(i10 * f11);
            if (z14) {
                a0.i(48.0f);
            }
        }
    }

    @Override
    public void r2(final TdApi.Object object) {
        if (object.getConstructor() == -1601123095) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.ll();
                }
            });
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.kl(object);
            }
        });
    }

    @Override
    public boolean r3(View view, int i10) {
        switch (i10) {
            case R.id.btn_copyLink:
                String Cj = Cj();
                if (ib.i.i(Cj)) {
                    return true;
                }
                j0.i(t2.F1(Cj), R.string.CopiedLink);
                return true;
            case R.id.btn_copyText:
                ej();
                return true;
            case R.id.btn_copyUsername:
                String Cj2 = Cj();
                if (ib.i.i(Cj2)) {
                    return true;
                }
                j0.i("@" + Cj2, R.string.CopiedUsername);
                return true;
            case R.id.btn_editUsername:
                ij();
                return true;
            case R.id.btn_manageInviteLinks:
                km();
                return true;
            case R.id.btn_manageJoinRequests:
                mm();
                return true;
            case R.id.btn_share:
                if (cn(false)) {
                    return true;
                }
                this.f24495b.hd().v3(this, i10, this.f9524q0);
                return true;
            default:
                this.f24495b.hd().v3(this, i10, this.f9524q0);
                return true;
        }
    }

    @Override
    public void r4(int i10) {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.e4(this, W9());
        }
        rn();
    }

    @Override
    public void rc() {
        v4<?> kd2 = kd();
        if (!(kd2 instanceof rh) || kd2.C9() != this.f9520o0.f19908id) {
            this.f24495b.hd().C4(this, this.f9520o0, null);
        } else {
            Zb();
        }
    }

    public final void ri(boolean z10) {
        if (this.f9521o1 || !Nj()) {
            return;
        }
        if (z10 || !Kj() || !ob.a.g(this.f9520o0.f19908id)) {
            final ArrayList arrayList = new ArrayList(3);
            ra raVar = this.f9515k1;
            String str = null;
            String x10 = raVar != null ? raVar.x() : null;
            if (this.f9515k1 != null && !ib.i.c(this.f9520o0.title, x10)) {
                if (ib.i.j(x10)) {
                    j0.y0(R.string.ChatTitleEmpty, 0);
                    return;
                }
                arrayList.add(new TdApi.SetChatTitle(this.f9520o0.f19908id, x10));
            }
            ra raVar2 = this.f9516l1;
            if (raVar2 != null) {
                str = raVar2.x();
            }
            if (this.f9516l1 != null && !ib.i.c(rj(), this.f9516l1.x())) {
                arrayList.add(new TdApi.SetChatDescription(this.f9520o0.f19908id, str));
            }
            boolean Kj = Kj();
            boolean Mj = Mj();
            if (Kj) {
                arrayList.add(new TdApi.SetChatSlowModeDelay(this.f9520o0.f19908id, ob.f.f19344a[this.f9523p1.s()]));
            }
            if (Mj) {
                arrayList.add(new TdApi.SetChatMessageTtl(this.f9520o0.f19908id, ob.f.f19345b[this.f9527r1.s()]));
            }
            if (!arrayList.isEmpty()) {
                Lm(true);
                Wm(true);
                final Runnable lmVar = new Runnable() {
                    @Override
                    public final void run() {
                        so.this.mk(arrayList);
                    }
                };
                if (!Kj || !ob.a.g(this.f9520o0.f19908id)) {
                    lmVar.run();
                } else {
                    this.f24495b.Qe(this.f9520o0.f19908id, new o6.r() {
                        @Override
                        public final void a(long j10, long j11, TdApi.Error error) {
                            so.this.ok(arrayList, lmVar, j10, j11, error);
                        }
                    });
                }
            }
        } else {
            Vd(w.H0(this, R.string.UpgradeChatPrompt, new Object[0]), w.i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    so.this.ik();
                }
            });
        }
    }

    public final String rj() {
        TdApi.UserFullInfo userFullInfo = this.f9528s0;
        if (userFullInfo == null) {
            TdApi.SupergroupFullInfo supergroupFullInfo = this.f9536w0;
            if (supergroupFullInfo != null) {
                return supergroupFullInfo.description;
            }
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f9532u0;
            return basicGroupFullInfo != null ? basicGroupFullInfo.description : "";
        } else if (!ib.i.i(userFullInfo.bio)) {
            return this.f9528s0.bio;
        } else {
            TdApi.BotInfo botInfo = this.f9528s0.botInfo;
            return botInfo != null ? botInfo.shareText : "";
        }
    }

    public final void rm(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (!supergroupFullInfo.description.isEmpty()) {
            Jm(supergroupFullInfo.description);
        }
    }

    public final void rn() {
        ud.m mVar = this.B0;
        if (mVar != null && this.P0) {
            mVar.setSubtitle(Rl(false));
            this.B0.setExpandedSubtitle(Rl(true));
        }
    }

    @Override
    public void s0(final TdApi.Supergroup supergroup) {
        int i10 = this.f9518n0;
        if (i10 == 4 || i10 == 3) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.nl(supergroup);
                }
            });
        } else if (i10 == 7 || i10 == 6) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.ol(supergroup);
                }
            });
        }
    }

    @Override
    public void s2(final long j10, final TdApi.ChatMember chatMember) {
        wd(new Runnable() {
            @Override
            public final void run() {
                so.this.Rk(j10, chatMember);
            }
        });
    }

    @Override
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    @Override
    public void s6(f5 f5Var, TdApi.MessageSender messageSender, int i10) {
        this.f24495b.v4().o(new TdApi.SetChatMemberStatus(this.f9520o0.f19908id, messageSender, new TdApi.ChatMemberStatusMember()), this.f24495b.na());
    }

    @Override
    public int s7() {
        int size = qj().size();
        return Math.min(size, this.f9533u1 ? size : 1);
    }

    @Override
    public void sc() {
        super.sc();
        if (!this.f9533u1) {
            this.f9533u1 = true;
            this.F0.l();
        }
        if (!Uj()) {
            ((ud.n) this.C0).setFactorLocked(false);
        }
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        long j10 = bundle.getLong(str + "chat_id");
        p7 l10 = p7.l(bundle, str);
        boolean z10 = bundle.getBoolean(str + "is_edit");
        TdApi.Chat R3 = this.f24495b.R3(j10);
        if (R3 == null || this.f24495b.u6(R3)) {
            return false;
        }
        if (z10) {
            int constructor = R3.type.getConstructor();
            if (constructor != -1472570774) {
                if (constructor != 973884508 || this.f24495b.e2().O(ob.a.m(R3.f19908id)) == null) {
                    return false;
                }
            } else if (this.f24495b.e2().h2(ob.a.p(R3.f19908id)) == null) {
                return false;
            }
        }
        super.sd(bundle, str);
        Hm(new m(R3, l10, z10));
        return true;
    }

    public final boolean si(int i10, float f10) {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.C0.getLayoutManager();
        int X1 = linearLayoutManager.X1();
        List<ra> D0 = this.D0.D0();
        int size = D0.size() - 1;
        int i11 = 0;
        int i12 = 0;
        for (ra raVar : D0) {
            if (i12 >= X1) {
                if (i12 == X1 && (C = linearLayoutManager.C(i12)) != null) {
                    i11 += C.getTop();
                }
                if (i12 != size) {
                    i11 += zi(i12, i10, raVar);
                }
            }
            i12++;
        }
        return f10 <= ((float) i11);
    }

    public final void sm(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (!basicGroupFullInfo.description.isEmpty()) {
            Jm(basicGroupFullInfo.description);
        }
    }

    public final void sn(int i10) {
        this.C0.getItemAnimator();
        this.D0.p3(i10);
        if (i10 == R.id.btn_description) {
            im();
        }
    }

    @Override
    public void t4(long j10, String[] strArr) {
        zd.g0.b(this, j10, strArr);
    }

    @Override
    public void t7(final long j10, TdApi.ChatPermissions chatPermissions) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                so.this.Wk(j10);
            }
        });
    }

    public final void ti() {
        switch (this.f9518n0) {
            case 0:
            case 1:
                xi();
                return;
            case 2:
            case 3:
                wi();
                return;
            case 4:
                ui();
                return;
            case 5:
            case 6:
            case 7:
                vi();
                return;
            default:
                return;
        }
    }

    public final m10 tj() {
        ArrayList<j10<?>> qj = qj();
        for (int size = qj.size() - 1; size >= 0; size--) {
            j10<?> j10Var = qj.get(size);
            if (j10Var instanceof m10) {
                return (m10) j10Var;
            }
        }
        return null;
    }

    public final void tm(TdApi.UserFullInfo userFullInfo) {
        if (!ib.i.i(userFullInfo.bio)) {
            Jm(userFullInfo.bio);
            return;
        }
        TdApi.BotInfo botInfo = userFullInfo.botInfo;
        if (botInfo != null && !ib.i.i(botInfo.shareText)) {
            Jm(userFullInfo.botInfo.shareText);
        }
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        String U2;
        if (i11 == -1) {
            if (i10 == 100) {
                File O = v.O();
                if (O != null) {
                    v0.m(O);
                    j0.y0(R.string.UploadingPhotoWait, 0);
                    this.f24495b.v4().o(new TdApi.SetChatPhoto(this.f9520o0.f19908id, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(O.getPath(), jd.d.j(O.getPath()), 0))), this.f24495b.na());
                }
            } else if (i10 == 101 && intent.getData() != null && (U2 = v0.U2(intent.getData())) != null) {
                if (U2.endsWith(".webp")) {
                    j0.z0("Webp is not supported for profile photos", 1);
                    return;
                }
                j0.y0(R.string.UploadingPhotoWait, 0);
                this.f24495b.v4().o(new TdApi.SetChatPhoto(this.f9520o0.f19908id, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(U2, jd.d.j(U2), 0))), this.f24495b.na());
            }
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        int i11;
        int i12;
        int i13;
        if (i10 != R.id.menu_clear) {
            switch (i10) {
                case R.id.menu_profile:
                case R.id.menu_profile_bot:
                case R.id.menu_profile_manage:
                case R.id.menu_profile_private:
                case R.id.menu_profile_secret:
                    LinearLayout linearLayout2 = new LinearLayout(t());
                    int i14 = 0;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setLayoutParams(FrameLayoutFix.r1(-2, -1, w.G2() ? 3 : 5));
                    u0 u0Var = null;
                    int O9 = O9();
                    int i15 = this.f9518n0;
                    if (i15 == 1 || i15 == 0) {
                        i13 = 1;
                        i11 = O9;
                        i12 = -1;
                        u0Var = d1Var.K1(linearLayout2, R.id.menu_btn_call, R.drawable.baseline_phone_24, O9, this, a0.i(48.0f));
                        TdApi.UserFullInfo userFullInfo = this.f9528s0;
                        u0Var.setAlpha((userFullInfo == null || (!userFullInfo.canBeCalled && !userFullInfo.hasPrivateCalls)) ? 0.0f : 1.0f);
                    } else {
                        i11 = O9;
                        i13 = 1;
                        i12 = -1;
                    }
                    if (this.f9518n0 == i13) {
                        h2 i22 = d1Var.i2(linearLayout2, this);
                        i22.l(this.f24495b.hd().m3(this.f9520o0.f19908id), ob.a.j(this.f9520o0.f19908id) && this.f24495b.y6(this.f9520o0));
                        if (!i22.getIsVisible()) {
                            u0Var.setTranslationX(a0.i(39.0f));
                        }
                    }
                    if (i10 == R.id.menu_profile) {
                        d1Var.K1(linearLayout2, R.id.menu_btn_manage, R.drawable.baseline_edit_24, i11, this, a0.i(49.0f)).setVisibility(Ii() ? 0 : 8);
                        d1Var.K1(linearLayout2, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, i11, this, a0.i(49.0f)).setVisibility(Ci() ? 0 : 8);
                    }
                    u0 c22 = d1Var.c2(linearLayout2, this, i11);
                    if (i10 == R.id.menu_profile_manage) {
                        c22.setVisibility(Jj() ? 0 : 4);
                    }
                    LinearLayout linearLayout3 = new LinearLayout(t());
                    linearLayout3.setLayoutParams(FrameLayoutFix.r1(-2, i12, w.G2() ? 3 : 5));
                    linearLayout3.setOrientation(0);
                    linearLayout3.setAlpha(0.0f);
                    linearLayout3.setTranslationY(d1.a3(false));
                    u0 g10 = d1Var.h2(linearLayout3, this, R.id.theme_color_icon).g(R.id.theme_color_icon);
                    ArrayList<j10<?>> qj = qj();
                    if (qj.isEmpty() || !qj.get(0).rf()) {
                        i14 = 4;
                    }
                    g10.setVisibility(i14);
                    FrameLayoutFix frameLayoutFix = new FrameLayoutFix(t());
                    frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-2, i12));
                    frameLayoutFix.addView(linearLayout2);
                    frameLayoutFix.addView(linearLayout3);
                    linearLayout.addView(frameLayoutFix);
                    if (Da() != 0.0f) {
                        H8(linearLayout, Da());
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            d1Var.O1(linearLayout, R.id.theme_color_textLight, B9());
        }
    }

    @Override
    public boolean u3() {
        return true;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        ym(userFullInfo);
    }

    public final void ui() {
        int i10;
        ra fm;
        boolean Vj = Vj();
        ArrayList<ra> arrayList = new ArrayList<>(20);
        arrayList.add(new ra(0));
        if (!Vj || (fm = fm()) == null) {
            i10 = 0;
        } else {
            arrayList.add(fm);
            i10 = 1;
        }
        if (!Vj && this.f24495b.u2(this.f9520o0)) {
            if (i10 > 0) {
                arrayList.add(new ra(1));
            }
            arrayList.add(bm());
            i10++;
        }
        if (i10 > 0) {
            arrayList.add(new ra(3));
        }
        this.f9512h1 = i10;
        if (i10 > 0) {
            arrayList.add(new ra(2));
        }
        arrayList.add(dm());
        arrayList.add(new ra(3));
        gi(arrayList);
        this.D0.s2(arrayList, false);
        Si();
    }

    public final void um(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (!supergroupFullInfo.description.isEmpty()) {
            Jm(supergroupFullInfo.description);
        }
    }

    @Override
    public boolean v5(View view) {
        qi();
        return false;
    }

    public final void vi() {
        throw new UnsupportedOperationException("Method not decompiled: de.so.vi():void");
    }

    public final TdApi.ChatInviteLink vj() {
        TdApi.ChatInviteLink chatInviteLink;
        TdApi.SupergroupFullInfo supergroupFullInfo;
        int i10 = this.f9518n0;
        if (i10 == 2) {
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f9532u0;
            if (basicGroupFullInfo == null) {
                return null;
            }
            chatInviteLink = basicGroupFullInfo.inviteLink;
        } else if ((i10 != 3 && i10 != 4) || (supergroupFullInfo = this.f9536w0) == null) {
            return null;
        } else {
            chatInviteLink = supergroupFullInfo.inviteLink;
        }
        return chatInviteLink;
    }

    @SuppressLint({"WrongThread"})
    public final void vm(final TdApi.SupergroupFullInfo supergroupFullInfo) {
        Runnable runnable;
        if (supergroupFullInfo != null) {
            boolean z10 = this.f9536w0 != null;
            this.f9536w0 = supergroupFullInfo;
            if (!z10) {
                if (this.f9518n0 == 3) {
                    um(supergroupFullInfo);
                } else {
                    rm(supergroupFullInfo);
                }
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        so.this.wl(supergroupFullInfo);
                    }
                };
            } else {
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        so.this.xl(supergroupFullInfo);
                    }
                };
            }
            this.f24495b.id(runnable);
        }
    }

    @Override
    public void w1(long j10, boolean z10) {
        zd.g0.c(this, j10, z10);
    }

    @Override
    public void w6(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        zd.g0.p(this, j10, chatPosition, z10, z11, z12);
    }

    public final void wi() {
        int i10;
        ra fm;
        if (this.f9538x0 == null) {
            this.f9538x0 = new ed.n(this, 0, this, this);
        }
        boolean Wj = Wj();
        ArrayList<ra> arrayList = new ArrayList<>(20);
        arrayList.add(new ra(0));
        if (!Wj || (fm = fm()) == null) {
            i10 = 0;
        } else {
            arrayList.add(fm);
            i10 = 1;
        }
        if (this.f24495b.u2(this.f9520o0) && !Wj) {
            if (i10 > 0) {
                arrayList.add(new ra(11));
            }
            arrayList.add(bm());
            i10++;
        }
        if (i10 > 0) {
            arrayList.add(new ra(3));
        }
        this.f9512h1 = i10;
        if (i10 > 0) {
            arrayList.add(new ra(2));
        }
        arrayList.add(dm());
        arrayList.add(new ra(3));
        gi(arrayList);
        this.D0.s2(arrayList, false);
    }

    public int wj() {
        return Bj() + Hj() + a0.i(6.0f);
    }

    public final void wm(TdApi.Supergroup supergroup) {
        this.f9534v0 = supergroup;
        this.D0.p3(R.id.btn_toggleProtection);
        int i10 = this.f9518n0;
        if (i10 == 6) {
            this.D0.p3(R.id.btn_channelType);
            this.D0.p3(R.id.btn_linkedChat);
            Yi();
        } else if (i10 == 7) {
            this.D0.p3(R.id.btn_toggleSignatures);
            this.D0.p3(R.id.btn_linkedChat);
            this.D0.p3(R.id.btn_channelType);
        }
    }

    @Override
    public void x(int i10, float f10, int i11) {
        int i12;
        if (this.f9541y1 != i10) {
            this.f9541y1 = i10;
            Oi(i10);
        }
        boolean z10 = false;
        int i13 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i13 == 0) {
            this.f9539x1 = -1;
        } else {
            this.S0 = false;
        }
        if (!(i13 == 0 || this.f9539x1 == (i12 = i10 + 1))) {
            this.f9539x1 = i12;
            Oi(i12);
        }
        this.f9535v1 = i10;
        this.f9537w1 = f10;
        this.G0.getTopView().setSelectionFactor(i10 + f10);
        if (i13 != 0) {
            z10 = true;
        }
        Um(z10);
    }

    @Override
    public void x1(long j10) {
        Qj(j10);
    }

    @Override
    public void x2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        Rj(notificationSettingsScope);
    }

    @Override
    public void x5(long j10, long j11) {
        zd.g0.s(this, j10, j11);
    }

    public final void xi() {
        int i10;
        TdApi.BotInfo botInfo;
        ra fm;
        ArrayList<ra> arrayList = new ArrayList<>(15);
        arrayList.add(new ra(0));
        if (this.f9524q0.username.isEmpty() || (fm = fm()) == null) {
            i10 = 0;
        } else {
            arrayList.add(fm);
            i10 = 1;
        }
        if (t2.K2(this.f9524q0)) {
            TdApi.UserFullInfo userFullInfo = this.f9528s0;
            if (userFullInfo != null && (!ib.i.i(userFullInfo.bio) || ((botInfo = this.f9528s0.botInfo) != null && !ib.i.i(botInfo.shareText)))) {
                arrayList.add(Zl());
                i10++;
            }
        } else {
            if (Wl()) {
                if (i10 > 0) {
                    arrayList.add(new ra(1));
                }
                arrayList.add(em());
                i10++;
            }
            if (this.f9518n0 == 1 && t2.w2(this.f9526r0)) {
                if (i10 > 0) {
                    arrayList.add(new ra(1));
                }
                arrayList.add(am());
                i10++;
            }
        }
        this.f9512h1 = i10;
        boolean o72 = this.f24495b.o7(this.f9524q0.f19979id);
        if (i10 != 0) {
            arrayList.add(new ra(3));
            if (!o72) {
                arrayList.add(new ra(2));
            }
        }
        if (!o72) {
            arrayList.add(dm());
            arrayList.add(new ra(3));
        }
        gi(arrayList);
        this.D0.s2(arrayList, false);
    }

    public final int xj(int i10) {
        SparseIntArray sparseIntArray = this.H1;
        if (sparseIntArray != null) {
            return sparseIntArray.get(i10, -1);
        }
        return -1;
    }

    public final void xm(final TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (basicGroupFullInfo != null) {
            final boolean z10 = this.f9532u0 != null;
            this.f9532u0 = basicGroupFullInfo;
            if (!z10) {
                sm(basicGroupFullInfo);
            }
            this.f24495b.id(new Runnable() {
                @Override
                public final void run() {
                    so.this.yl(z10, basicGroupFullInfo);
                }
            });
        }
    }

    @Override
    public void y1(long j10, long j11) {
        zd.g0.r(this, j10, j11);
    }

    @Override
    public void y2(final TdApi.Message message) {
        if (nj(message)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    so.this.jl(message);
                }
            });
        }
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        m w92 = w9();
        if (w92 == null) {
            return false;
        }
        super.yd(bundle, str);
        bundle.putLong(str + "chat_id", w92.f9559a.f19908id);
        p7 p7Var = w92.f9560b;
        if (p7Var != null) {
            p7Var.m(bundle, str + "message_thread");
        }
        bundle.putBoolean(str + "is_edit", w92.f9561c);
        return true;
    }

    public final int yi() {
        int measuredWidth = this.C0.getMeasuredWidth();
        int Tl = Tl();
        int X1 = ((LinearLayoutManager) this.C0.getLayoutManager()).X1();
        if (X1 >= this.D0.D0().size() - 2) {
            return Tl;
        }
        int i10 = 0;
        View C = this.C0.getLayoutManager().C(X1);
        if (C != null) {
            i10 = 0 - C.getTop();
        }
        for (int i11 = X1 - 1; i11 >= 0; i11--) {
            i10 += zi(i11, measuredWidth, this.D0.D0().get(i11));
        }
        return i10;
    }

    public final d20 yj() {
        d20 d20Var;
        TdApi.SupergroupMembersFilter gh;
        ArrayList<j10<?>> qj = qj();
        for (int size = qj.size() - 1; size >= 0; size--) {
            j10<?> j10Var = qj.get(size);
            if ((j10Var instanceof d20) && (gh = (d20Var = (d20) j10Var).gh()) != null && gh.getConstructor() == 1178199509) {
                return d20Var;
            }
        }
        return null;
    }

    public final void ym(final TdApi.UserFullInfo userFullInfo) {
        if (userFullInfo != null) {
            final boolean z10 = this.f9528s0 != null;
            this.f9528s0 = userFullInfo;
            if (!z10) {
                tm(userFullInfo);
            }
            this.f24495b.id(new Runnable() {
                @Override
                public final void run() {
                    so.this.zl(z10, userFullInfo);
                }
            });
        }
    }

    @Override
    public void z0() {
        i1.c(this);
    }

    public final int zi(int i10, int i11, ra raVar) {
        int A = raVar.A();
        if (A == 9) {
            if (this.f9543z1 == null) {
                this.f9543z1 = new HashMap<>();
            }
            return v0.y(raVar.u(), i11 - (a0.i(16.0f) * 2), 15.0f, this.f9543z1) + a0.i(6.0f) + a0.i(12.0f);
        } else if (A == 37) {
            x0 x0Var = this.f9513i1;
            if (x0Var == null) {
                return a0.i(76.0f);
            }
            x0Var.k(Fj(i11));
            return Math.max(((this.f9513i1.getHeight() + a0.i(34.0f)) - a0.i(13.0f)) + a0.i(12.0f) + a0.i(25.0f), a0.i(76.0f));
        } else if (A != 68) {
            return ap.W(raVar.A());
        } else {
            View view = this.A1;
            if (view != null) {
                return view.getMeasuredHeight();
            }
            return a0.i(60.0f) + a0.i(20.0f);
        }
    }

    public final void zj(final TdApi.SearchMessagesFilter searchMessagesFilter, final boolean z10) {
        this.f24495b.v4().o(new TdApi.GetChatMessageCount(C9(), searchMessagesFilter, z10), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                so.this.Ck(searchMessagesFilter, z10, object);
            }
        });
    }

    public final void zm() {
        if (this.H1 != null) {
            for (int i10 = 0; i10 < this.H1.size(); i10++) {
                zj(ob.e.i(this.H1.keyAt(i10)), true);
            }
        }
    }
}
