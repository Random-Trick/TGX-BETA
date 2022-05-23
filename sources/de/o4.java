package de;

import android.content.Context;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import de.o4;
import de.y00;
import eb.k;
import gd.w;
import hd.b;
import hd.b3;
import hd.c3;
import he.i;
import ie.g0;
import ie.u0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kd.t0;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.f3;
import ne.i;
import ne.m1;
import ne.n2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.ChatsRecyclerView;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.d1;
import ud.d2;
import ud.f2;
import ud.h1;
import ud.m;
import ud.p;
import ud.q1;
import ud.t2;
import ud.v4;
import ud.x2;
import ud.x4;
import ud.z1;
import vc.v2;
import zd.d0;
import zd.e0;
import zd.e8;
import zd.f0;
import zd.f1;
import zd.g1;
import zd.gc;
import zd.h0;
import zd.hj;
import zd.i1;
import zd.j1;
import zd.k0;
import zd.k8;
import zd.l0;
import zd.m0;
import zd.n0;
import zd.o6;
import zd.s1;
import zd.t1;
import zd.t7;
import zd.u7;
import zd.v7;
import zd.w7;
import zd.w8;
import zd.x7;

public class o4 extends t2<h> implements h1, View.OnClickListener, View.OnLongClickListener, ChatsRecyclerView.b, h0, l0, zd.h1, f1, j1, t7.h, t7.b, t7.i, t7.g, f0, z1, t1.a, x4.b, i.c, w8.f, k.b, m1.j, t0.a, i.e, t7.j, i.c, n0, gc.e, d2, ud.j1 {
    public Intent A0;
    public nb B0;
    public j C0;
    public TdApi.ChatList D0;
    public boolean E0;
    public long F0;
    public boolean G0;
    public androidx.recyclerview.widget.g H0;
    public t0 I0;
    public k8 J0;
    public boolean K0;
    public boolean L0;
    public e8 M0;
    public f0 N0;
    public int O0 = 0;
    public int P0;
    public tc.d Q0;
    public List<y0.b> R0;
    public k0.e<TdApi.Chat> S0;
    public boolean T0;
    public RecyclerView U0;
    public iq V0;
    public eb.f W0;
    public kb.b X0;
    public x2.l Y0;
    public boolean f8944t0;
    public boolean f8945u0;
    public d0 f8946v0;
    public FrameLayoutFix f8947w0;
    public n2 f8948x0;
    public ChatsRecyclerView f8949y0;
    public wc.c f8950z0;

    public class a extends g.e {
        public int f8951d = -1;
        public int f8952e = -1;

        public a() {
            o4.this = r1;
        }

        @Override
        public void A(RecyclerView.c0 c0Var, int i10) {
            super.A(c0Var, i10);
            if (c0Var != null && c0Var.n() == 0) {
                ((wc.a) c0Var.f2982a).setIsDragging(true);
                o4.this.fk(1, true);
            }
        }

        @Override
        public void B(RecyclerView.c0 c0Var, int i10) {
        }

        @Override
        public void c(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            int i10;
            super.c(recyclerView, c0Var);
            int i11 = this.f8951d;
            if (!(i11 == -1 || (i10 = this.f8952e) == -1 || i11 == i10)) {
                o4.this.f8950z0.F0();
            }
            this.f8952e = -1;
            this.f8951d = -1;
            o4.this.f8949y0.setItemAnimator(null);
            o4.this.fk(1, false);
            ((wc.a) c0Var.f2982a).setIsDragging(false);
            if (o4.this.Y0 != null) {
                o4.this.Y0.F();
            }
        }

        @Override
        public int k(RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            b3 chat;
            if (c0Var.n() != 0 || (chat = ((wc.a) c0Var.f2982a).getChat()) == null || !chat.o0() || !o4.this.f8950z0.e0() || o4.this.f8946v0 != null) {
                return 0;
            }
            return g.e.t(3, 0);
        }

        @Override
        public boolean r() {
            return false;
        }

        @Override
        public boolean y(RecyclerView recyclerView, RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2) {
            int k10 = c0Var.k();
            int k11 = c0Var2.k();
            b3 h02 = o4.this.f8950z0.h0(k10);
            b3 h03 = o4.this.f8950z0.h0(k11);
            if (h02 != null && h03 != null && h02.o0() && h03.o0()) {
                if (this.f8951d == -1) {
                    this.f8951d = k10;
                }
                this.f8952e = k11;
                o4.this.f8950z0.s0(k10, k11);
                if (o4.this.Y0 != null) {
                    o4.this.Y0.J();
                }
            }
            return false;
        }

        @Override
        public void z(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10, RecyclerView.c0 c0Var2, int i11, int i12, int i13) {
            super.z(recyclerView, c0Var, i10, c0Var2, i11, i12, i13);
            c0Var.f2982a.invalidate();
            c0Var2.f2982a.invalidate();
            if (o4.this.Y0 != null) {
                o4.this.Y0.U();
            }
        }
    }

    public class b extends RecyclerView.t {
        public b() {
            o4.this = r1;
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            View C;
            boolean z10 = false;
            if (o4.this.K0 && o4.this.L0 && o4.this.O0 == 0 && i10 != 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager.X1() == 1 && (C = linearLayoutManager.C(1)) != null && linearLayoutManager.U(C) == 0) {
                    o4.this.gk(false);
                }
            }
            o4.this.O0 = i10;
            if (o4.this.K0 && i10 == 0) {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.getLayoutManager();
                int X1 = linearLayoutManager2.X1();
                if (X1 == 0) {
                    o4.this.gk(false);
                    View C2 = linearLayoutManager2.C(X1);
                    int i11 = C2 != null ? -linearLayoutManager2.U(C2) : 0;
                    if (i11 < wc.a.r1(he.i.c2().u0()) / 2) {
                        o4.this.f8949y0.u1(0, -i11);
                    } else {
                        o4.this.I();
                    }
                } else if (X1 == 1) {
                    View C3 = linearLayoutManager2.C(X1);
                    o4 o4Var = o4.this;
                    if (C3 == null || linearLayoutManager2.U(C3) < 0) {
                        z10 = true;
                    }
                    o4Var.gk(z10);
                } else {
                    o4.this.gk(true);
                }
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            if (o4.this.K0 && !o4.this.L0 && o4.this.O0 == 2 && i11 > 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).X1() > 0) {
                o4.this.gk(true);
            }
        }
    }

    public class c implements f0 {
        public c() {
            o4.this = r1;
        }

        public void c(e8 e8Var) {
            o4.this.f8950z0.G0(e8Var.L() > 0);
            o4.this.f8950z0.I0(0);
        }

        public void d(int i10) {
            o4.this.f8950z0.I0(i10);
        }

        @Override
        public void G6(e8 e8Var, TdApi.Chat chat, int i10, int i11, o6.g gVar) {
            e0.f(this, e8Var, chat, i10, i11, gVar);
        }

        @Override
        public void R0(e8 e8Var, TdApi.Chat chat, int i10) {
            final int i11 = 2;
            if (i10 != 0) {
                if (i10 == 1) {
                    i11 = 1;
                } else if (!(i10 == 2 || i10 == 3)) {
                    if (i10 != 4) {
                        return;
                    }
                }
                o4.this.wd(new Runnable() {
                    @Override
                    public final void run() {
                        o4.c.this.d(i11);
                    }
                });
            }
            i11 = 0;
            o4.this.wd(new Runnable() {
                @Override
                public final void run() {
                    o4.c.this.d(i11);
                }
            });
        }

        @Override
        public void U6(final e8 e8Var, int i10) {
            if (ib.c.h(i10, 1, false) != 0) {
                o4.this.wd(new Runnable() {
                    @Override
                    public final void run() {
                        o4.c.this.c(e8Var);
                    }
                });
            }
        }

        @Override
        public void X2(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
            e0.a(this, e8Var, chat, i10, gVar);
        }

        @Override
        public void Y6(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
            e0.g(this, e8Var, chat, i10, gVar);
        }

        @Override
        public void i2(e8 e8Var, TdApi.Chat chat, int i10, o6.g gVar) {
            e0.b(this, e8Var, chat, i10, gVar);
        }

        @Override
        public void i5(e8 e8Var, int i10, int i11) {
            e0.e(this, e8Var, i10, i11);
        }
    }

    public class d extends tc.d {
        public d(Interpolator interpolator, long j10) {
            super(interpolator, j10);
            o4.this = r1;
        }

        @Override
        public void q0(View view, float f10) {
            if ((o4.this.P0 & 2) == 0) {
                super.q0(view, f10);
            }
        }
    }

    public class e implements m1.e {
        public e() {
            o4.this = r1;
        }

        public static void b(int i10) {
            j0.z0(w.o2(R.string.ReadAllChatsDone, i10), 0);
        }

        @Override
        public void a7(m1.f fVar, int i10, Object obj) {
            if (i10 == R.id.btn_markChatAsRead) {
                o4.this.f24495b.Ra(new TdApi.ChatListArchive(), r4.f9212a);
            } else if (i10 == R.id.btn_pinUnpinChat) {
                o4.this.f24495b.tc().u0(1L);
            }
        }

        @Override
        public void t2(m1.f fVar, int i10, Object obj) {
        }
    }

    public class f extends RecyclerView {
        public f(Context context) {
            super(context);
            o4.this = r1;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return getAlpha() == 0.0f || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return getAlpha() > 0.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class g extends kb.b {
        public final long[] M;
        public final int N;

        public g(long[] jArr, int i10) {
            o4.this = r1;
            this.M = jArr;
            this.N = i10;
        }

        @Override
        public void b() {
            if (o4.this.X0 == this && o4.this.V0 != null) {
                o4.this.lk(this.M, this.N, true);
            }
        }
    }

    public static class i extends RecyclerView.o {
        public final o4 f8964a;
        public final Paint f8965b;
        public final Paint f8966c;

        public i(o4 o4Var) {
            this.f8964a = o4Var;
            Paint paint = new Paint(5);
            this.f8965b = paint;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3.q(), f3.r(), (float[]) null, Shader.TileMode.CLAMP));
            Paint paint2 = new Paint(5);
            this.f8966c = paint2;
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f3.p(), f3.a(), (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            if (k02 == -1) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            b3 h02 = this.f8964a.f8950z0.h0(k02);
            if (h02 != null) {
                b3 h03 = this.f8964a.f8950z0.h0(k02 + 1);
                if (h03 == null || (h02.i0() == h03.i0() && h02.p0() == h03.p0())) {
                    rect.bottom = a0.x();
                } else {
                    rect.bottom = a0.i(12.0f);
                }
                rect.top = 0;
                if (this.f8964a.I0 != null && this.f8964a.I0.w()) {
                    int ii = this.f8964a.ii();
                    if (k02 == ii) {
                        rect.top = t0.t();
                    } else if (k02 == ii - 1) {
                        rect.bottom = a0.i(1.0f);
                    }
                }
                if (this.f8964a.L0 && rect.top == 0 && h02.i0()) {
                    rect.top = -wc.a.r1(h02.F());
                    if (this.f8964a.I0 == null || !this.f8964a.I0.w()) {
                        rect.top -= a0.i(12.0f);
                    } else {
                        rect.top -= a0.i(1.0f);
                    }
                }
            } else if (this.f8964a.f8950z0.D() > 0 && this.f8964a.f8950z0.l0() && this.f8964a.K0 && k02 == this.f8964a.f8950z0.D() - 1) {
                rect.bottom = Math.max(0, recyclerView.getMeasuredHeight() - this.f8964a.Qh());
            }
        }

        @Override
        public void i(android.graphics.Canvas r33, androidx.recyclerview.widget.RecyclerView r34, androidx.recyclerview.widget.RecyclerView.z r35) {
            throw new UnsupportedOperationException("Method not decompiled: de.o4.i.i(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$z):void");
        }
    }

    public interface j {
        int a();

        void b(hj.j jVar);

        Object c();

        boolean d(TdApi.Chat chat, Runnable runnable);
    }

    public o4(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Ai(TdApi.Chat chat) {
        return !this.f24495b.k7(chat.f19908id);
    }

    public boolean Aj(View view, int i10) {
        switch (i10) {
            case R.id.btn_selectAll:
                ck(u3.f9701a, this.f24495b.A5(Wh()).f28793a);
                return true;
            case R.id.btn_selectChat:
            default:
                return true;
            case R.id.btn_selectMuted:
                final o6 o6Var = this.f24495b;
                Objects.requireNonNull(o6Var);
                ck(new kb.d() {
                    @Override
                    public final boolean a(Object obj) {
                        return o6.this.w3((TdApi.Chat) obj);
                    }
                }, this.f24495b.A5(Wh()).f28793a);
                return true;
            case R.id.btn_selectUnread:
                ck(v3.f9801a, this.f24495b.A5(Wh()).f28794b);
                return true;
        }
    }

    public boolean Bi(TdApi.Chat chat) {
        return ob.b.g(chat, this.D0);
    }

    public static void Bj(long[] jArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 217237013) {
            long j10 = ((TdApi.StorageStatistics) object).size;
            if (j10 > 0) {
                j0.z0(w.p2(R.string.ClearedSizeChats, jArr.length, c0.m(j10)), 0);
            } else {
                j0.z0(w.o2(R.string.ClearedNoneChats, jArr.length), 0);
            }
        }
    }

    public void Ci(List list) {
        this.f8945u0 = true;
        this.f8950z0.d0((b3[]) list.toArray(new b3[0]));
    }

    public boolean Cj(View view, int i10) {
        if (i10 != R.id.btn_clearCache) {
            return true;
        }
        final long[] v10 = ib.b.v(this.S0);
        j0.z0(w.o2(R.string.ClearingXChats, v10.length), 0);
        this.f24495b.v4().o(new TdApi.OptimizeStorage(0L, 0, 0, 0, null, v10, null, true, 0), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o4.Bj(v10, object);
            }
        });
        Yj();
        return true;
    }

    public void Di(TdApi.BasicGroup basicGroup) {
        Xh(ob.a.a(basicGroup.f19904id));
    }

    public void Dj(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.l2(notificationSettingsScope, scopeNotificationSettings);
        }
    }

    public void Ei(TdApi.Chat chat, int i10, o6.g gVar) {
        this.f8949y0.Q1(this.f8950z0.b0(chat, i10, gVar));
    }

    public void Ej(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.k2(j10, chatNotificationSettings);
        }
    }

    public void Fi(TdApi.Chat chat, int i10, o6.g gVar) {
        this.f8949y0.Q1(this.f8950z0.J0(chat, i10, gVar));
    }

    public void Fj(TdApi.SecretChat secretChat) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m2(secretChat);
        }
    }

    public void Gi(long j10, String str) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.S1(j10, str);
        }
    }

    public void Gj() {
        if (!Sa()) {
            Z9().Y8();
            p5(-1);
        }
    }

    public void Hi() {
        if (!Sa() && !mi()) {
            Zb();
        }
    }

    public void Hj(TdApi.Supergroup supergroup) {
        Xh(ob.a.b(supergroup.f19965id));
    }

    public void Ii(long j10, TdApi.DraftMessage draftMessage) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.T1(j10, draftMessage);
        }
    }

    public void Ij(TdApi.User user) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.n2(user);
        }
    }

    public void Ji(long j10, boolean z10) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.U1(j10, z10);
        }
    }

    public void Jj(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            wd(new n1(this));
        }
    }

    public void Ki(int i10) {
        if (ib.c.b(i10, 10)) {
            ai();
        }
    }

    public void Kj() {
        nb nbVar = this.B0;
        if (nbVar != null) {
            nbVar.ac(new qj(this.f24493a, this.f24495b).zg().Ag());
        }
    }

    public void Li(int i10, int i11) {
        if (i10 == 2) {
            this.f8950z0.W0();
        }
        ai();
        if (i11 == 1) {
            li();
            if (!this.f8945u0) {
                this.f8945u0 = true;
                this.f8950z0.f0();
            }
        }
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null && i10 == 0 && ((LinearLayoutManager) chatsRecyclerView.getLayoutManager()).a2() == this.f8950z0.D() - 1) {
            A0();
        }
    }

    public void Lj(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_archive) {
            o4 o4Var = new o4(this.f24493a, this.f24495b);
            o4Var.hk(new h(ob.b.f19339b).c(true));
            nb nbVar = this.B0;
            if (nbVar != null) {
                nbVar.ac(o4Var);
            }
        } else if (id2 == R.id.btn_invite) {
            this.f24495b.E4().u0(t(), true, new Runnable() {
                @Override
                public final void run() {
                    o4.this.Kj();
                }
            });
        }
    }

    public void Mi(long j10, boolean z10) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.V1(j10, z10);
        }
    }

    public void Mj(y0.b bVar, boolean z10) {
        if (!Sa() && !bVar.b()) {
            Z9().Kd(this.S0.p());
            qk();
            if (z10) {
                this.R0.remove(bVar);
            }
        }
    }

    public void Ni(TdApi.Chat chat, int i10, int i11, o6.g gVar) {
        this.f8949y0.Q1(this.f8950z0.r0(chat, i10, i11, gVar));
    }

    public void Nj(y0.b bVar, TdApi.Chat chat) {
        if (!Sa() && !bVar.b() && this.S0.h(chat.f19908id) < 0) {
            ek(chat, false);
        }
    }

    public void Oi(long j10, TdApi.ChatPermissions chatPermissions) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.W1(j10, chatPermissions);
        }
    }

    public void Oj(kb.d dVar, final y0.b bVar, final TdApi.Chat chat) {
        if (di(chat) != null && dVar.a(chat)) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    o4.this.Nj(bVar, chat);
                }
            });
        }
    }

    public void Pi(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.X1(j10, chatPhotoInfo);
        }
    }

    public void Qi(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.Y1(j10, chatPosition, z10, z11, z12);
            if (chatPosition.order == 0) {
                Xh(j10);
            }
        }
    }

    public void Qj(final kb.i iVar, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                kb.i.this.a(z10);
            }
        });
    }

    public void Ri(long j10, long j11, int i10) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.Z1(j10, j11, i10);
        }
    }

    public void Rj() {
        if (!Sa()) {
            this.f8949y0.I1();
            this.f8950z0.I(0);
            this.f8949y0.H1();
        }
    }

    public void Si(long j10, long j11) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.a2(j10, j11);
        }
    }

    public void Ti(TdApi.Chat chat, int i10, o6.g gVar) {
        this.f8949y0.Q1(this.f8950z0.E0(chat, i10, gVar));
    }

    public void Ui(long j10, String str) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.c2(j10, str);
        }
    }

    public void Vi(long j10, TdApi.Message message) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.d2(j10, message);
        }
    }

    public void Wi(long j10, int i10) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.e2(j10, i10);
        }
    }

    public void Xi(TdApi.Chat chat) {
        if (!Sa() && Ta()) {
            Zj(chat);
        }
    }

    public boolean aj(final k kVar, final float f10, Object obj) {
        o4 o4Var = new o4(t(), this.f24495b);
        o4Var.hk(new h(ob.b.f19339b).c(true));
        o4Var.gd(new Runnable() {
            @Override
            public final void run() {
                k.this.i(f10);
            }
        });
        o4Var.t9();
        t().Q1().h0(o4Var);
        return true;
    }

    public void bj(b3 b3Var) {
        dk(b3Var, true);
    }

    public void cj(CustomRecyclerView customRecyclerView, int i10, int i11, int i12, int i13) {
        if (i13 != i11 && this.f8950z0.l0() && this.K0 && this.f8950z0.D() > 0) {
            wc.c cVar = this.f8950z0;
            cVar.I(cVar.D() - 1);
        }
    }

    public void dj() {
        this.G0 = true;
        ai();
        n9();
    }

    public void ej() {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.dj();
            }
        });
    }

    public static void fj(View view, Rect rect) {
        ((wc.a) view).getAvatarReceiver().Z0(rect);
    }

    public void gj(b3 b3Var) {
        dk(b3Var, true);
    }

    public void hj(int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.S0.p(); i12++) {
            TdApi.Chat q10 = this.S0.q(i12);
            if (!this.f24495b.k7(q10.f19908id)) {
                if (i10 == -1) {
                    TdApi.ChatNotificationSettings chatNotificationSettings = q10.notificationSettings;
                    chatNotificationSettings.useDefaultMuteFor = true;
                    this.f24495b.Pb(q10.f19908id, chatNotificationSettings);
                } else {
                    this.f24495b.hc(q10.f19908id, i10);
                }
                i11++;
            }
        }
        j0.z0(w.o2(R.string.MutedXChats, i11), 0);
        Yj();
    }

    public static boolean ij(kb.k kVar, View view, int i10) {
        kVar.a(i10 == R.id.btn_menu_resetToDefault ? -1 : hj.i3(i10));
        return true;
    }

    public void jj() {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.S0.p(); i12++) {
            TdApi.Chat q10 = this.S0.q(i12);
            if (!this.f24495b.k7(q10.f19908id)) {
                if (this.f24495b.u3(q10) > 0) {
                    i11++;
                }
                if (this.f24495b.mb(q10).muteFor > 0) {
                    i10++;
                }
                this.f24495b.hc(q10.f19908id, 0);
            }
        }
        j0.z0(w.o2(i10 > 0 ? R.string.NotificationsOnXChats : R.string.UnmutedXChats, i11), 0);
        Yj();
    }

    public static boolean kj(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_unmute) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void lj(AtomicInteger atomicInteger, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727 && atomicInteger.decrementAndGet() == 0) {
            this.f24495b.hd().post(new n1(this));
        }
    }

    public boolean mj(boolean z10, View view, int i10) {
        if (i10 != R.id.btn_pinUnpinChat) {
            return true;
        }
        if (z10) {
            int p10 = this.S0.p();
            for (int i11 = 0; i11 < this.S0.p(); i11++) {
                if (!ob.b.g(this.S0.q(i11), this.D0)) {
                    p10--;
                }
            }
            final AtomicInteger atomicInteger = new AtomicInteger(p10);
            Client.g f4Var = new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o4.this.lj(atomicInteger, object);
                }
            };
            for (int i12 = 0; i12 < this.S0.p(); i12++) {
                long j10 = this.S0.j(i12);
                if (ob.b.g(this.S0.q(i12), this.D0)) {
                    this.f24495b.v4().o(new TdApi.ToggleChatIsPinned(this.D0, j10, false), f4Var);
                }
            }
            return true;
        }
        List<Long> S5 = this.f24495b.S5(this.D0);
        k0.e<TdApi.Chat> eVar = this.S0;
        TdApi.Chat[] chatArr = (TdApi.Chat[]) ib.b.e(eVar, new TdApi.Chat[eVar.p()]);
        ob.e.p1(chatArr, this.D0);
        for (TdApi.Chat chat : chatArr) {
            if (!ob.b.g(chat, this.D0)) {
                S5.add(Long.valueOf(chat.f19908id));
            }
        }
        ak(new TdApi.SetPinnedChats(this.D0, ib.b.d(S5)));
        return true;
    }

    public void nj(long j10, long j11, TdApi.MessageContent messageContent) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.g2(j10, j11, messageContent);
        }
    }

    public void oj(long j10, long j11, TdApi.MessageInteractionInfo messageInteractionInfo) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.h2(j10, j11, messageInteractionInfo);
        }
    }

    public void pj(long j10, long j11) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.R1(j10, j11, true);
        }
    }

    public void qj(long j10, long j11) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.R1(j10, j11, false);
        }
    }

    public void rj(TdApi.Message message, long j10) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.i2(message, j10);
        }
    }

    public void sj(long j10, long[] jArr) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.j2(j10, jArr);
        }
    }

    public void tj(int i10, int i11) {
        if (i10 != 0) {
            j0.z0(w.o2(i10, i11), 0);
        }
        Yj();
    }

    public void ui(AtomicInteger atomicInteger, boolean z10, int i10) {
        if (atomicInteger.decrementAndGet() == 0) {
            j0.z0(w.o2(z10 ? R.string.ClearedXHistories : R.string.DeletedXChats, i10), 0);
            Yj();
        }
    }

    public void uj(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.f24495b.hd().post(runnable);
        }
    }

    public boolean vi(final boolean z10, boolean z11, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        final int p10 = this.S0.p();
        final AtomicInteger atomicInteger = new AtomicInteger(p10);
        Runnable x2Var = new Runnable() {
            @Override
            public final void run() {
                o4.this.ui(atomicInteger, z10, p10);
            }
        };
        for (int i11 = 0; i11 < p10; i11++) {
            this.f24495b.O4(this.S0.j(i11), z11, x2Var);
        }
        return true;
    }

    public static void vj(Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            runnable.run();
        }
    }

    public void wi(String str, final boolean z10, final boolean z11) {
        String i12 = w.i1(R.string.NoUndoWarn);
        int[] iArr = {R.id.btn_delete, R.id.btn_cancel};
        String[] strArr = {str, w.i1(R.string.Cancel)};
        int[] iArr2 = {2, 1};
        int[] iArr3 = new int[2];
        iArr3[0] = z10 ? R.drawable.templarian_baseline_broom_24 : R.drawable.baseline_delete_24;
        iArr3[1] = R.drawable.baseline_cancel_24;
        ee(i12, iArr, strArr, iArr2, iArr3, new ie.h0() {
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
                boolean vi;
                vi = o4.this.vi(z10, z11, view, i10);
                return vi;
            }
        });
    }

    public boolean wj(boolean z10, final Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_archiveUnarchiveChat) {
            return true;
        }
        TdApi.ChatList chatListMain = z10 ? new TdApi.ChatListMain() : new TdApi.ChatListArchive();
        for (int i11 = 0; i11 < this.S0.p(); i11++) {
            this.f24495b.v4().o(new TdApi.AddChatToList(this.S0.j(i11), chatListMain), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    o4.vj(runnable, object);
                }
            });
        }
        return true;
    }

    public static void xi(kb.i iVar, int i10, SparseIntArray sparseIntArray) {
        iVar.a(sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory);
    }

    public boolean xj(Runnable runnable, View view, int i10) {
        if (i10 == R.id.btn_unblockSender || i10 == R.id.btn_blockSender) {
            for (int p10 = this.S0.p() - 1; p10 >= 0; p10--) {
                long j10 = this.S0.j(p10);
                o6 o6Var = this.f24495b;
                o6Var.d2(o6Var.Ab(j10), i10 == R.id.btn_blockSender, this.f24495b.oa(runnable));
            }
        }
        return true;
    }

    public static boolean yi(kb.i iVar, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        iVar.a(false);
        return true;
    }

    public static boolean yj(TdApi.Chat chat) {
        return true;
    }

    public boolean zi(TdApi.Chat chat) {
        return this.f24495b.k7(chat.f19908id);
    }

    public static boolean zj(TdApi.Chat chat) {
        return chat.unreadCount > 0 || chat.isMarkedAsUnread;
    }

    @Override
    public void A0() {
        k8 k8Var = this.J0;
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        k8Var.B(chatsRecyclerView != null ? chatsRecyclerView.getLoadCount() : 40, null);
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.p2(j10);
        }
    }

    @Override
    public void A5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        i1.b(this, notificationSettingsScope);
    }

    @Override
    public int A9() {
        return mi() ? 2 : 3;
    }

    @Override
    public void Ac() {
        d1 d1Var;
        super.Ac();
        if (mi() && (d1Var = this.R) != null) {
            d1Var.j4(W9());
        }
        Yi(this.f24495b.D4());
        qk();
    }

    @Override
    public void B0(final TdApi.SecretChat secretChat) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Fj(secretChat);
            }
        });
    }

    @Override
    public void B3(final long j10, final boolean z10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ji(j10, z10);
            }
        });
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        zd.g0.x(this, j10, i10, z10);
    }

    @Override
    public void D5(long j10, long j11) {
        g1.e(this, j10, j11);
    }

    @Override
    public void G6(e8 e8Var, final TdApi.Chat chat, final int i10, final int i11, final o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ni(chat, i10, i11, gVar);
            }
        });
    }

    @Override
    public View Ga() {
        return this.f8949y0;
    }

    @Override
    public boolean Ge() {
        return true;
    }

    @Override
    public void H(final long j10, final long[] jArr) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.sj(j10, jArr);
            }
        });
    }

    @Override
    public void H0(long j10, String str) {
        zd.g0.t(this, j10, str);
    }

    @Override
    public void I() {
        ChatsRecyclerView chatsRecyclerView;
        int i10;
        t0 t0Var;
        wc.c cVar = this.f8950z0;
        if (cVar != null && cVar.m0() && (chatsRecyclerView = this.f8949y0) != null) {
            chatsRecyclerView.C1();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8949y0.getLayoutManager();
            int j02 = this.f8950z0.j0(true, null);
            int r12 = wc.a.r1(he.i.c2().u0());
            int X1 = linearLayoutManager.X1();
            if (X1 != -1) {
                int i11 = r12 * X1;
                int D = this.f8950z0.D() - 1;
                if (!this.f8950z0.l0() || D <= 1 || X1 <= 0) {
                    i10 = X1;
                } else {
                    i10 = X1 - 1;
                    t0 t0Var2 = this.I0;
                    i11 += (t0Var2 == null || !t0Var2.w()) ? a0.i(12.0f) : t0.t() + a0.i(1.0f);
                    j02--;
                    D--;
                }
                if (!this.f8950z0.l0() && (t0Var = this.I0) != null && t0Var.w() && X1 >= ii()) {
                    i11 += t0.t();
                }
                if (j02 != 0 && D > j02 && X1 > j02) {
                    i10--;
                    i11 += a0.i(12.0f);
                }
                int x10 = i11 + (i10 * a0.x());
                if (this.f8950z0.l0() && this.K0) {
                    t0 t0Var3 = this.I0;
                    x10 -= r12 + ((t0Var3 == null || !t0Var3.w()) ? a0.i(12.0f) : a0.i(1.0f));
                }
                View C = linearLayoutManager.C(X1);
                if (C != null) {
                    x10 -= linearLayoutManager.U(C);
                }
                this.f8949y0.u1(0, -x10);
            }
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            p0.e0(chatsRecyclerView);
            this.f8950z0.v0();
        }
    }

    @Override
    public void J(int i10, View view) {
        jb.c cVar;
        int i11;
        int i12;
        CharSequence charSequence;
        int i13 = 0;
        switch (i10) {
            case R.id.menu_btn_clear:
                T8();
                return;
            case R.id.menu_btn_delete:
                Ph(false);
                return;
            case R.id.menu_btn_more:
                jb.c cVar2 = new jb.c(2);
                u0 u0Var = new u0(2);
                jb.c cVar3 = new jb.c(2);
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                while (i13 < this.S0.p()) {
                    TdApi.Chat q10 = this.S0.q(i13);
                    if (this.f24495b.l2(Wh(), q10)) {
                        if (ob.b.f(q10)) {
                            i15++;
                        } else {
                            i14++;
                        }
                    }
                    cVar3 = cVar3;
                    i15 = i15;
                    if (!this.f24495b.k7(q10.f19908id) && this.f24495b.p2(q10)) {
                        i16++;
                    }
                    if (this.f24495b.D2(q10)) {
                        i17++;
                    } else {
                        i18++;
                    }
                    if (this.f24495b.G2(q10)) {
                        i19++;
                    }
                    if (this.f24495b.i3(q10)) {
                        i21++;
                    } else {
                        i20++;
                    }
                    i13++;
                }
                jb.c cVar4 = cVar3;
                if (this.S0.p() < this.f24495b.A5(Wh()).f28793a) {
                    cVar2.a(R.id.more_btn_selectAll);
                    u0Var.a(R.string.SelectMore);
                    cVar = cVar4;
                    cVar.a(R.drawable.baseline_playlist_add_check_24);
                } else {
                    cVar = cVar4;
                }
                if (i14 + i15 > 0) {
                    cVar2.a(R.id.more_btn_archiveUnarchive);
                    u0Var.a(i15 > 0 ? R.string.Unarchive : R.string.Archive);
                    cVar.a(i15 > 0 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                }
                if (i17 > 0) {
                    cVar2.a(R.id.more_btn_markAsRead);
                    u0Var.a(R.string.MarkAsRead);
                    cVar.a(R.drawable.baseline_done_all_24);
                } else if (i18 > 0) {
                    cVar2.a(R.id.more_btn_markAsUnread);
                    u0Var.a(R.string.MarkAsUnread);
                    cVar.a(R.drawable.baseline_unsubscribe_24);
                }
                if (i19 == this.S0.p()) {
                    cVar2.a(R.id.more_btn_report);
                    u0Var.a(R.string.Report);
                    cVar.a(R.drawable.baseline_report_24);
                }
                if (i21 > 0) {
                    cVar2.a(R.id.more_btn_unblock);
                    u0Var.a(R.string.Unblock);
                    cVar.a(R.drawable.baseline_block_24);
                } else if (i20 == this.S0.p()) {
                    cVar2.a(R.id.more_btn_block);
                    u0Var.a(R.string.BlockContact);
                    cVar.a(R.drawable.baseline_block_24);
                }
                if (i16 == this.S0.p()) {
                    cVar2.a(R.id.more_btn_clearHistory);
                    u0Var.a(R.string.ClearHistory);
                    cVar.a(R.drawable.baseline_delete_24);
                }
                cVar2.a(R.id.more_btn_clearCache);
                u0Var.a(R.string.DeleteChatCache);
                cVar.a(R.drawable.templarian_baseline_broom_24);
                Z9().Zd(cVar2.e(), u0Var.d(), cVar.e());
                return;
            case R.id.menu_btn_muteUnmute:
                int Sh = Sh();
                if (Sh == 1) {
                    SparseIntArray sparseIntArray = new SparseIntArray(3);
                    int i22 = 0;
                    boolean z10 = false;
                    for (int i23 = 0; i23 < this.S0.p(); i23++) {
                        TdApi.Chat q11 = this.S0.q(i23);
                        if (!this.f24495b.k7(q11.f19908id)) {
                            i22++;
                            TdApi.ScopeNotificationSettings mb2 = this.f24495b.mb(q11);
                            sparseIntArray.put(mb2.getConstructor(), sparseIntArray.get(mb2.getConstructor()) + 1);
                            if (!z10 && this.f24495b.ka().B(q11.f19908id, true)) {
                                z10 = true;
                            }
                        }
                    }
                    int[] iArr = null;
                    TdApi.ScopeNotificationSettings nb2 = sparseIntArray.size() == 3 ? this.f24495b.nb(ob.e.h(sparseIntArray.keyAt(0))) : null;
                    final kb.k c4Var = new kb.k() {
                        @Override
                        public final void a(int i24) {
                            o4.this.hj(i24);
                        }
                    };
                    jb.c cVar5 = new jb.c(3);
                    jb.c cVar6 = new jb.c(3);
                    jb.c cVar7 = z10 ? new jb.c(3) : null;
                    u0 u0Var2 = new u0(3);
                    if (nb2 == null || !hd.t2.n3(nb2.muteFor)) {
                        i13 = 1;
                    }
                    hj.Z2(cVar5, cVar6, u0Var2, cVar7, false, i13, true, false, false, nb2 != null ? hj.p3(nb2.muteFor, true) : null, z10);
                    CharSequence q22 = w.q2(R.string.MuteXChats, i22);
                    int[] e10 = cVar5.e();
                    String[] d10 = u0Var2.d();
                    if (cVar7 != null) {
                        iArr = cVar7.e();
                    }
                    ee(q22, e10, d10, iArr, cVar6.e(), new ie.h0() {
                        @Override
                        public boolean P() {
                            return g0.a(this);
                        }

                        @Override
                        public Object a2(int i24) {
                            return g0.b(this, i24);
                        }

                        @Override
                        public final boolean r3(View view2, int i24) {
                            boolean ij;
                            ij = o4.ij(kb.k.this, view2, i24);
                            return ij;
                        }
                    });
                    return;
                } else if (Sh == 2 || Sh == 3) {
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = 0;
                    for (int i27 = 0; i27 < this.S0.p(); i27++) {
                        TdApi.Chat q12 = this.S0.q(i27);
                        if (!this.f24495b.k7(q12.f19908id)) {
                            if (this.f24495b.u3(q12) > 0) {
                                i25++;
                            }
                            int i28 = this.f24495b.mb(q12).muteFor;
                            if (i28 > 0) {
                                i26 = i24 == 0 ? i28 : Math.min(i28, i26);
                                i24++;
                            }
                        }
                    }
                    final Runnable s1Var = new Runnable() {
                        @Override
                        public final void run() {
                            o4.this.jj();
                        }
                    };
                    if (i24 > 0) {
                        ee(w.j1(this.S0.p() > i24 ? R.string.NotificationsEnableOverride3 : R.string.NotificationsEnableOverride2, w.Z1(hj.o3(i26))), new int[]{R.id.btn_unmute, R.id.btn_cancel}, new String[]{w.o2(R.string.EnableNotifications2, i25), w.i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_notifications_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i29) {
                                return g0.b(this, i29);
                            }

                            @Override
                            public final boolean r3(View view2, int i29) {
                                boolean kj;
                                kj = o4.kj(s1Var, view2, i29);
                                return kj;
                            }
                        });
                        return;
                    } else {
                        s1Var.run();
                        return;
                    }
                } else {
                    return;
                }
            case R.id.menu_btn_pinUnpin:
                int Th = Th();
                long j10 = 0;
                if (Th != 0) {
                    i12 = 0;
                    i11 = 0;
                    for (int i29 = 0; i29 < this.S0.p(); i29++) {
                        if (Th != 3 || !ob.b.g(this.S0.q(i29), this.D0)) {
                            j10 = this.S0.j(i29);
                            if (ob.a.j(j10)) {
                                i11++;
                            } else {
                                i12++;
                            }
                        }
                    }
                } else {
                    i12 = 0;
                    i11 = 0;
                }
                int i30 = i12 + i11;
                if (i30 == 1 && this.f24495b.C3(this.D0, j10)) {
                    this.f24495b.hd().K7(this, Wh(), this.S0.j(0), null, R.id.btn_pinUnpinChat, new n1(this));
                    return;
                } else if (i12 > 0 || i11 > 0) {
                    final boolean z11 = Th == 1;
                    int Ka = Wh().getConstructor() == -400991316 ? this.f24495b.Ka() : this.f24495b.Ja();
                    int k02 = this.f8950z0.k0(false);
                    int k03 = this.f8950z0.k0(true);
                    if (z11 || (k02 + i12 <= Ka && k03 + i11 <= Ka)) {
                        if (i30 == 1) {
                            charSequence = this.f24495b.U3(j10);
                        } else {
                            charSequence = w.q2(z11 ? R.string.UnpinXChats : R.string.PinXChats, i30);
                        }
                        int[] iArr2 = {R.id.btn_pinUnpinChat, R.id.btn_cancel};
                        String[] strArr = new String[2];
                        strArr[0] = w.i1(z11 ? R.string.UnpinFromTop : R.string.PinToTop);
                        strArr[1] = w.i1(R.string.Cancel);
                        int[] iArr3 = new int[2];
                        iArr3[0] = z11 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24;
                        iArr3[1] = R.drawable.baseline_cancel_24;
                        ee(charSequence, iArr2, strArr, null, iArr3, new ie.h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i31) {
                                return g0.b(this, i31);
                            }

                            @Override
                            public final boolean r3(View view2, int i31) {
                                boolean mj;
                                mj = o4.this.mj(z11, view2, i31);
                                return mj;
                            }
                        });
                        return;
                    }
                    this.f24493a.I3().g(view).i(Z9()).q(R.drawable.baseline_error_24).D(this.f24495b, Wh().getConstructor() == -400991316 ? w.q2(R.string.PinTooMuchWarn, Ka) : w.o2(R.string.ErrorPinnedChatsLimit, Ka));
                    return;
                } else {
                    return;
                }
            case R.id.menu_btn_search:
                Yc();
                return;
            default:
                return;
        }
    }

    @Override
    public void J3(final long j10, final long j11) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.qj(j10, j11);
            }
        });
    }

    @Override
    public void Ja(int i10, int i11) {
        Yi(this.f24495b.D4());
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.f2(w.H1(i10, i11));
        }
    }

    @Override
    public boolean Je() {
        return true;
    }

    @Override
    public void K2(final TdApi.BasicGroup basicGroup, boolean z10) {
        if (!hd.t2.h3(basicGroup.status)) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    o4.this.Di(basicGroup);
                }
            });
        }
    }

    @Override
    public boolean L4(ne.i iVar, float f10, float f11) {
        RecyclerView.c0 l02;
        if (iVar instanceof wc.a) {
            wc.a aVar = (wc.a) iVar;
            if (aVar.D0(f10, f11)) {
                b3 chat = aVar.getChat();
                if (this.f8949y0 != null && chat.o0() && this.f8950z0.e0() && (l02 = this.f8949y0.l0(iVar)) != null) {
                    iVar.S(f10, f11);
                    this.f24493a.k1(true);
                    this.H0.H(l02);
                    x2.l lVar = this.Y0;
                    if (lVar != null) {
                        lVar.E(true);
                    }
                    this.Y0 = this.f24493a.I3().g(iVar).i(Z9()).u(j4.f8387a).C(this.f24495b, R.string.DragChatsHint);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void M1(final TdApi.User user) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ij(user);
            }
        });
    }

    @Override
    public void N0(long j10, int i10) {
        zd.g0.l(this, j10, i10);
    }

    @Override
    public void N1(final long j10, final boolean z10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Mi(j10, z10);
            }
        });
    }

    @Override
    public void P0(int i10) {
        int i11;
        final int i12;
        final int i13;
        int i14;
        int i15 = 0;
        switch (i10) {
            case R.id.more_btn_archiveUnarchive:
            case R.id.more_btn_block:
            case R.id.more_btn_markAsRead:
            case R.id.more_btn_markAsUnread:
            case R.id.more_btn_report:
            case R.id.more_btn_unblock:
                switch (i10) {
                    case R.id.more_btn_archiveUnarchive:
                        i13 = Wh().getConstructor() == 362770115 ? R.string.UnarchivedXChats : R.string.ArchivedXChats;
                        i12 = ki();
                        i11 = 0;
                        break;
                    case R.id.more_btn_block:
                    case R.id.more_btn_unblock:
                        HashSet hashSet = new HashSet();
                        i11 = 0;
                        for (int i16 = 0; i16 < this.S0.p(); i16++) {
                            long i42 = this.f24495b.i4(this.S0.q(i16));
                            hashSet.add(Long.valueOf(i42));
                            if (this.f24495b.e2().y2(i42)) {
                                i11++;
                            }
                        }
                        int size = hashSet.size();
                        i13 = size == i11 ? i10 == R.id.more_btn_unblock ? R.string.UnblockedXBots : R.string.BlockedXBots : i10 == R.id.more_btn_unblock ? R.string.UnblockedXUsers : R.string.BlockedXUsers;
                        i12 = size;
                        break;
                    case R.id.more_btn_markAsRead:
                        i13 = R.string.ReadAllChatsDone;
                        i12 = ki();
                        i11 = 0;
                        break;
                    case R.id.more_btn_markAsUnread:
                        i13 = R.string.MarkedXChats;
                        i12 = ki();
                        i11 = 0;
                        break;
                    case R.id.more_btn_report:
                        i12 = ki();
                        i13 = 0;
                        i11 = 0;
                        break;
                    default:
                        return;
                }
                final Runnable x1Var = new Runnable() {
                    @Override
                    public final void run() {
                        o4.this.tj(i13, i12);
                    }
                };
                if (i12 == 1) {
                    switch (i10) {
                        case R.id.more_btn_archiveUnarchive:
                            i14 = R.id.btn_archiveUnarchiveChat;
                            break;
                        case R.id.more_btn_markAsRead:
                            i14 = R.id.btn_markChatAsRead;
                            break;
                        case R.id.more_btn_markAsUnread:
                            i14 = R.id.btn_markChatAsUnread;
                            break;
                        case R.id.more_btn_report:
                            hj.T7(Z9(), this.S0.j(0), null, x1Var, null);
                            return;
                        default:
                            i14 = 0;
                            break;
                    }
                    if (i14 != 0) {
                        this.f24495b.hd().K7(this, Wh(), this.S0.j(0), null, i14, x1Var);
                        return;
                    }
                }
                final AtomicInteger atomicInteger = new AtomicInteger(this.S0.p());
                final Runnable w2Var = new Runnable() {
                    @Override
                    public final void run() {
                        o4.this.uj(atomicInteger, x1Var);
                    }
                };
                switch (i10) {
                    case R.id.more_btn_archiveUnarchive:
                        final boolean z10 = Wh().getConstructor() == 362770115;
                        CharSequence q22 = w.q2(z10 ? R.string.UnarchiveXChats : R.string.ArchiveXChats, this.S0.p());
                        int[] iArr = {R.id.btn_archiveUnarchiveChat, R.id.btn_cancel};
                        String[] strArr = new String[2];
                        strArr[0] = w.i1(z10 ? R.string.Unarchive : R.string.Archive);
                        strArr[1] = w.i1(R.string.Cancel);
                        int[] iArr2 = new int[2];
                        iArr2[0] = z10 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24;
                        iArr2[1] = R.drawable.baseline_cancel_24;
                        ee(q22, iArr, strArr, null, iArr2, new ie.h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i17) {
                                return g0.b(this, i17);
                            }

                            @Override
                            public final boolean r3(View view, int i17) {
                                boolean wj;
                                wj = o4.this.wj(z10, w2Var, view, i17);
                                return wj;
                            }
                        });
                        return;
                    case R.id.more_btn_block:
                    case R.id.more_btn_unblock:
                        if (i10 == R.id.more_btn_unblock) {
                            for (int p10 = this.S0.p() - 1; p10 >= 0; p10--) {
                                long j10 = this.S0.j(p10);
                                o6 o6Var = this.f24495b;
                                o6Var.d2(o6Var.Ab(j10), false, this.f24495b.na());
                            }
                            return;
                        }
                        ee(w.q2(i11 == i12 ? R.string.BlockXBots : R.string.BlockXUsers, i12), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{w.i1(R.string.BlockContact), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                            @Override
                            public boolean P() {
                                return g0.a(this);
                            }

                            @Override
                            public Object a2(int i17) {
                                return g0.b(this, i17);
                            }

                            @Override
                            public final boolean r3(View view, int i17) {
                                boolean xj;
                                xj = o4.this.xj(w2Var, view, i17);
                                return xj;
                            }
                        });
                        return;
                    case R.id.more_btn_report:
                        hj.V7(Z9(), ib.b.v(this.S0), x1Var);
                        return;
                }
                while (i15 < this.S0.p()) {
                    switch (i10) {
                        case R.id.more_btn_markAsRead:
                            this.f24495b.R9(this.S0.j(i15), 0L, w2Var);
                            break;
                        case R.id.more_btn_markAsUnread:
                            this.f24495b.S9(this.S0.q(i15), w2Var);
                            break;
                    }
                    i15++;
                }
                return;
            case R.id.more_btn_clearCache:
                ee(w.q2(R.string.ClearXChats, this.S0.p()), new int[]{R.id.btn_clearCache, R.id.btn_cancel}, new String[]{w.i1(R.string.DeleteChatCache), w.i1(R.string.Cancel)}, null, new int[]{R.drawable.templarian_baseline_broom_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i17) {
                        return g0.b(this, i17);
                    }

                    @Override
                    public final boolean r3(View view, int i17) {
                        boolean Cj;
                        Cj = o4.this.Cj(view, i17);
                        return Cj;
                    }
                });
                return;
            case R.id.more_btn_clearHistory:
                Ph(true);
                return;
            case R.id.more_btn_selectAll:
                int i17 = 0;
                while (i15 < this.S0.p()) {
                    if (this.f24495b.D2(this.S0.q(i15))) {
                        i17++;
                    }
                    i15++;
                }
                jb.c cVar = new jb.c(3);
                u0 u0Var = new u0(3);
                jb.c cVar2 = new jb.c(3);
                cVar.a(R.id.btn_selectAll);
                u0Var.a(R.string.SelectAll);
                cVar2.a(R.drawable.baseline_playlist_add_check_24);
                if (i17 == this.S0.p() && i17 < this.f24495b.A5(Wh()).f28794b) {
                    cVar.a(R.id.btn_selectUnread);
                    u0Var.a(R.string.SelectUnread);
                    cVar2.a(R.drawable.baseline_unsubscribe_24);
                }
                cVar.a(R.id.btn_selectMuted);
                u0Var.a(R.string.SelectMuted);
                cVar2.a(R.drawable.baseline_notifications_off_24);
                ee(w.i1(R.string.SelectMore), cVar.e(), u0Var.d(), null, cVar2.e(), new ie.h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i18) {
                        return g0.b(this, i18);
                    }

                    @Override
                    public final boolean r3(View view, int i18) {
                        boolean Aj;
                        Aj = o4.this.Aj(view, i18);
                        return Aj;
                    }
                });
                return;
            default:
                return;
        }
    }

    public final void Ph(final boolean z10) {
        TdApi.SecretChat b42;
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.S0.p(); i11++) {
            if (this.f24495b.c3(this.S0.q(i11))) {
                i10++;
                j10 = this.S0.j(i11);
            }
        }
        if (i10 == 1) {
            this.f24495b.hd().K7(this, Wh(), j10, null, z10 ? R.id.btn_clearChatHistory : R.id.btn_removeChatFromList, new n1(this));
            return;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < this.S0.p(); i18++) {
            TdApi.Chat q10 = this.S0.q(i18);
            if (this.f24495b.c3(q10)) {
                i12++;
                if (this.f24495b.J2(q10.f19908id)) {
                    i16++;
                }
                if (!z10 && ob.a.j(q10.f19908id) && (b42 = this.f24495b.b4(q10.f19908id)) != null && b42.state.getConstructor() != -1945106707) {
                    i17++;
                }
                TdApi.ChatMemberStatus O3 = this.f24495b.O3(q10.f19908id);
                if (O3 != null && hd.t2.H2(O3)) {
                    i15++;
                }
                if (!this.f24495b.B7(q10) && !this.f24495b.H3(q10.f19908id)) {
                    if (this.f24495b.Q6(q10)) {
                        i13++;
                    } else {
                        i14++;
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(w.q2(z10 ? R.string.ClearXHistoriesConfirm : R.string.DeleteXChatsConfirm, i12));
        int i19 = i13 + i14;
        if (i19 + i15 > 0 || (!z10 && i17 > 0)) {
            spannableStringBuilder.append((CharSequence) "\n");
            if (i15 > 0) {
                spannableStringBuilder.append((CharSequence) "\n").append(w.q2(R.string.LosingXAdminRights, i15));
            }
            if (i19 > 0) {
                spannableStringBuilder.append((CharSequence) "\n").append(w.q2(i13 == 0 ? R.string.LeaveXPrivateGroup : i14 == 0 ? R.string.LeaveXPrivateChannel : R.string.LeaveXChats, i19));
            }
            if (!z10 && i17 > 0) {
                spannableStringBuilder.append((CharSequence) "\n").append(w.q2(R.string.ClosingXSecretChats, i17));
            }
        }
        final String o22 = w.o2(z10 ? R.string.ClearXHistories : R.string.DeleteXChats, this.S0.p());
        final kb.i w3Var = new kb.i() {
            @Override
            public final void a(boolean z11) {
                o4.this.wi(o22, z10, z11);
            }
        };
        if (i16 > 0) {
            me(new f2(R.id.btn_removeChatFromList).c(false).b(spannableStringBuilder).p(new ra[]{new ra(12, (int) R.id.btn_clearChatHistory, 0, w.q2(R.string.RevokeForX, i16), (int) R.id.btn_clearChatHistory, false)}).q(R.id.theme_color_textNegative).r(z10 ? R.string.ClearHistoryBtn : R.string.Delete).j(new v4.r() {
                @Override
                public final void l6(int i20, SparseIntArray sparseIntArray) {
                    o4.xi(kb.i.this, i20, sparseIntArray);
                }
            }));
        } else {
            ee(spannableStringBuilder, new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{o22, w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.templarian_baseline_broom_24, R.drawable.baseline_cancel_24}, new ie.h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i20) {
                    return g0.b(this, i20);
                }

                @Override
                public final boolean r3(View view, int i20) {
                    boolean yi;
                    yi = o4.yi(kb.i.this, view, i20);
                    return yi;
                }
            });
        }
    }

    @Override
    public boolean Qf(View view, c3 c3Var) {
        Vj(this.f24495b.W2(c3Var.a()));
        return true;
    }

    public int Qh() {
        t0 t0Var;
        int j02 = this.f8950z0.j0(true, null);
        int r12 = wc.a.r1(he.i.c2().u0());
        int D = this.f8950z0.D() - 1;
        int i10 = r12 * D;
        if (this.f8950z0.l0() && D > 1) {
            D--;
            t0 t0Var2 = this.I0;
            i10 += (t0Var2 == null || !t0Var2.w()) ? a0.i(12.0f) : t0.t() + a0.i(1.0f);
            j02--;
        }
        int i11 = D;
        if (!this.f8950z0.l0() && (t0Var = this.I0) != null && t0Var.w()) {
            i10 += t0.t();
        }
        if (j02 != 0 && D > j02) {
            i11--;
            i10 += a0.i(12.0f);
        }
        int x10 = i10 + (i11 * a0.x());
        if (this.f8950z0.l0() && this.K0) {
            t0 t0Var3 = this.I0;
            x10 -= r12 + ((t0Var3 == null || !t0Var3.w()) ? a0.i(12.0f) : a0.i(1.0f));
        }
        return x10 + ap.W(42);
    }

    @Override
    public void R(TdApi.ChatList chatList, int i10, int i11) {
        m0.b(this, chatList, i10, i11);
    }

    @Override
    public void R0(e8 e8Var, TdApi.Chat chat, int i10) {
        e0.d(this, e8Var, chat, i10);
    }

    @Override
    public void R3(final long j10, final TdApi.ChatPhotoInfo chatPhotoInfo) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Pi(j10, chatPhotoInfo);
            }
        });
    }

    @Override
    public int R9() {
        return R.id.controller_chats;
    }

    public final int Rh() {
        kb.d<TdApi.Chat> n3Var = new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean zi;
                zi = o4.this.zi((TdApi.Chat) obj);
                return zi;
            }
        };
        final o6 o6Var = this.f24495b;
        Objects.requireNonNull(o6Var);
        return ei(n3Var, new kb.d() {
            @Override
            public final boolean a(Object obj) {
                return o6.this.c3((TdApi.Chat) obj);
            }
        });
    }

    @Override
    public void S1(long j10, long j11, boolean z10) {
        g1.h(this, j10, j11, z10);
    }

    public final int Sh() {
        final o6 o6Var = this.f24495b;
        Objects.requireNonNull(o6Var);
        return ei(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                return o6.this.y3((TdApi.Chat) obj);
            }
        }, new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean Ai;
                Ai = o4.this.Ai((TdApi.Chat) obj);
                return Ai;
            }
        });
    }

    public k8 Sj() {
        if (this.J0 == null) {
            this.J0 = new k8(this.f24495b, Wh(), this.f8946v0, false);
        }
        return this.J0;
    }

    @Override
    public void T0(final long j10, final long j11, final TdApi.MessageInteractionInfo messageInteractionInfo) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.oj(j10, j11, messageInteractionInfo);
            }
        });
    }

    @Override
    public void T5(final long j10, final long j11, final int i10, boolean z10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ri(j10, j11, i10);
            }
        });
    }

    public final int Th() {
        return ei(new kb.d() {
            @Override
            public final boolean a(Object obj) {
                boolean Bi;
                Bi = o4.this.Bi((TdApi.Chat) obj);
                return Bi;
            }
        }, null);
    }

    public final CharSequence Tj() {
        long[] M = this.f24495b.E4().M();
        int I = this.f24495b.E4().I();
        if (I == 1) {
            return w.m1(R.string.ContactsOnTelegramSingle, this.f24495b.e2().J2(M[0]));
        }
        if (I == 2) {
            return w.m1(R.string.ContactsOnTelegramSeveral, this.f24495b.e2().C2(M[0]), this.f24495b.e2().C2(M[1]));
        }
        if (I == 3) {
            return w.m1(R.string.ContactsOnTelegramSeveral, c0.U(w.m0(), this.f24495b.e2().C2(M[0]), this.f24495b.e2().C2(M[1])), this.f24495b.e2().C2(M[2]));
        }
        if (I == 4) {
            return w.m1(R.string.ContactsOnTelegramSeveral, c0.U(w.m0(), this.f24495b.e2().C2(M[0]), this.f24495b.e2().C2(M[1]), this.f24495b.e2().C2(M[2])), this.f24495b.e2().C2(M[3]));
        }
        if (I >= 5) {
            return w.n2(R.string.ContactsOnTelegramMany, I - 3, w.p(), c0.U(w.m0(), this.f24495b.e2().C2(M[0]), this.f24495b.e2().C2(M[1]), this.f24495b.e2().C2(M[2])));
        }
        return null;
    }

    @Override
    public void U6(e8 e8Var, final int i10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ki(i10);
            }
        });
    }

    public boolean Uh(b3 b3Var) {
        return b3Var != null && !b3Var.i0() && this.f24495b.c3(b3Var.w());
    }

    public boolean Uj() {
        t0 t0Var;
        return (this.f8949y0 == null || (t0Var = this.I0) == null || !t0Var.w()) ? false : true;
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        u7.a(this, j10, basicGroupFullInfo);
    }

    public final void Vh() {
        List<y0.b> list = this.R0;
        if (list != null) {
            for (y0.b bVar : list) {
                bVar.a();
            }
            this.R0.clear();
        }
    }

    public final void Vj(final TdApi.Chat chat) {
        if (this.C0 == null) {
            Zj(chat);
            return;
        }
        Runnable z2Var = new Runnable() {
            @Override
            public final void run() {
                o4.this.Xi(chat);
            }
        };
        if (this.C0.d(chat, z2Var)) {
            z2Var.run();
        }
    }

    @Override
    public void W(long j10, long j11) {
        g1.f(this, j10, j11);
    }

    @Override
    public void W4(m1.f fVar) {
        fVar.M(true);
    }

    @Override
    public int W9() {
        return mi() ? R.id.menu_passcode : R.id.menu_search;
    }

    public TdApi.ChatList Wh() {
        if (this.D0 == null) {
            this.D0 = ob.b.f19338a;
        }
        return this.D0;
    }

    public final void Wj() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f8949y0.getLayoutManager();
        if (linearLayoutManager.X1() == 0) {
            View C = linearLayoutManager.C(0);
            if (C != null) {
                int max = Math.max(0, linearLayoutManager.U(C));
                this.f8949y0.u1(0, Math.max(0, linearLayoutManager.O(C)) - max);
            }
            nb nbVar = this.B0;
            if (nbVar != null) {
                nbVar.Vh(this);
                return;
            }
            return;
        }
        gk(true);
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        zd.g0.a(this, j10, chatActionBar);
    }

    @Override
    public void X1(final TdApi.Message message, final long j10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.rj(message, j10);
            }
        });
    }

    @Override
    public void X2(e8 e8Var, final TdApi.Chat chat, final int i10, final o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ei(chat, i10, gVar);
            }
        });
    }

    public final void Xh(long j10) {
        TdApi.Chat f10;
        if (ki() > 0 && (f10 = this.S0.f(j10)) != null && !this.f24495b.c3(f10)) {
            ek(f10, true);
        }
    }

    public void Xj(float f10, float f11) {
        ChatsRecyclerView chatsRecyclerView;
        if (Uj() && (chatsRecyclerView = this.f8949y0) != null) {
            RecyclerView.p layoutManager = chatsRecyclerView.getLayoutManager();
            View C = layoutManager.C(ii());
            int top = C != null ? C.getTop() : 0;
            if (top > 0) {
                int U = layoutManager.U(C);
                if ((C instanceof wc.a) && U < top && f11 < top) {
                    float f12 = U;
                    if (f11 >= f12) {
                        this.f8949y0.C1();
                        this.I0.O(f10, f11 - f12);
                    }
                }
            }
        }
    }

    @Override
    public void Y(final long j10, final TdApi.Message message) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Vi(j10, message);
            }
        });
    }

    @Override
    public void Y3(final long j10, final TdApi.ChatNotificationSettings chatNotificationSettings) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ej(j10, chatNotificationSettings);
            }
        });
    }

    @Override
    public void Y5(long[] jArr, int i10, boolean z10) {
        eb.f fVar;
        if (!Sa()) {
            nb nbVar = this.B0;
            boolean z11 = nbVar != null && nbVar.Ta() && (fVar = this.W0) != null && fVar.g() > 0.0f;
            ai();
            if (this.V0 != null) {
                kb.b bVar = this.X0;
                if (bVar != null) {
                    bVar.c();
                    this.X0 = null;
                }
                if (!z11 || jArr == null || jArr.length <= 0 || !z10) {
                    lk(jArr, i10, z11);
                    return;
                }
                g gVar = new g(jArr, i10);
                this.X0 = gVar;
                gVar.e(j0.o());
                j0.e0(this.X0, 1300L);
            }
        }
    }

    @Override
    public void Y6(e8 e8Var, final TdApi.Chat chat, final int i10, final o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ti(chat, i10, gVar);
            }
        });
    }

    public final void Yh() {
        this.f8950z0.f0();
        ik(this.J0.v() && this.f8950z0.i0().size() == 0);
    }

    public final void Yj() {
        Z9().m8(new Runnable() {
            @Override
            public final void run() {
                o4.this.Gj();
            }
        });
    }

    @Override
    public boolean Z5(t0 t0Var, boolean z10, boolean z11) {
        if (this.f8949y0 == null) {
            return false;
        }
        nb nbVar = this.B0;
        if (nbVar != null) {
            if (!nbVar.Ta()) {
                return false;
            }
        } else if (!Ta()) {
            return false;
        }
        if (this.f8950z0.i0().isEmpty() || ((LinearLayoutManager) this.f8949y0.getLayoutManager()).X1() != 0 || !z11) {
            return false;
        }
        fk(2, true);
        return true;
    }

    @Override
    public void Z8() {
        super.Z8();
        t0 t0Var = this.I0;
        if (t0Var != null) {
            t0Var.p();
        }
        e8 e8Var = this.M0;
        if (e8Var != null) {
            e8Var.M(this.N0);
        }
        wc.c cVar = this.f8950z0;
        if (cVar != null) {
            for (b3 b3Var : cVar.i0()) {
                b3Var.Q2();
            }
        }
        he.i.c2().I3(this);
        this.f24495b.tc().e0(this);
        this.f24495b.O9().o0(this);
        this.f24495b.e2().l2(this);
        this.J0.G(this);
        t1.b().d(this);
        this.f24495b.E4().i0(this);
    }

    public final void Zh() {
        if (this.J0.E()) {
            ok();
        } else {
            li();
        }
    }

    public final void Zj(TdApi.Chat chat) {
        hj.j jVar;
        j jVar2 = this.C0;
        Object c10 = jVar2 != null ? jVar2.c() : null;
        int F0 = v2.F0(this.f24495b.A6(), chat, null);
        if (F0 != 0) {
            jVar = new hj.j().r(c10).d(F0, v2.G0(this.f24495b.A6(), chat, null, F0));
        } else {
            jVar = new hj.j().r(c10);
        }
        j jVar3 = this.C0;
        if (jVar3 != null) {
            jVar3.b(jVar);
        }
        if (Wh().getConstructor() != -400991316) {
            jVar.h();
        }
        this.f24495b.hd().C4(this, chat, jVar);
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        zd.g0.f(this, j10, messageSender);
    }

    @Override
    public void a4(TdApi.ChatList chatList, boolean z10, int i10, int i11, int i12) {
        if (i10 == 0 && chatList.getConstructor() != -400991316 && ob.e.E(this.D0, chatList)) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    o4.this.Hi();
                }
            });
        }
    }

    public void ai() {
        Zh();
        Yh();
    }

    public final void ak(TdApi.Function function) {
        this.f24495b.v4().o(function, new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                o4.this.Jj(object);
            }
        });
    }

    @Override
    public void b2(final long j10, final TdApi.DraftMessage draftMessage) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ii(j10, draftMessage);
            }
        });
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void b6(long j10, long j11, TdApi.Sticker sticker) {
        g1.a(this, j10, j11, sticker);
    }

    public final void bi() {
        RecyclerView recyclerView = this.U0;
        if (recyclerView != null) {
            qd(recyclerView);
            p0.n(this.U0);
            this.f8947w0.removeView(this.U0);
            this.V0 = null;
            this.U0 = null;
            kb.b bVar = this.X0;
            if (bVar != null) {
                bVar.c();
                this.X0 = null;
            }
        }
    }

    public final void bk() {
        if (this.U0 == null) {
            this.V0 = new iq(this, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    o4.this.Lj(view);
                }
            }, this);
            ArrayList arrayList = new ArrayList(5);
            d0 d0Var = this.f8946v0;
            if (d0Var != null) {
                arrayList.add(new ra(24, 0, 0, d0Var.Y2()));
            } else if (Wh() instanceof TdApi.ChatListArchive) {
                arrayList.add(new ra(24, 0, 0, R.string.NoArchive));
            } else {
                e8 e8Var = this.M0;
                if (e8Var == null || e8Var.L() <= 0) {
                    int L = this.f24495b.E4().L();
                    arrayList.add(new ra(72, (int) R.id.inviteFriendsText, (int) R.drawable.baseline_forum_96, Tj(), false));
                    arrayList.add(new ra(2));
                    arrayList.add(new ra(20, R.id.btn_invite, 0, L > 0 ? R.string.ShowContacts : R.string.InviteContacts));
                    arrayList.add(new ra(3));
                } else {
                    arrayList.add(new ra(19, (int) R.id.changePhoneText, (int) R.drawable.baseline_archive_96, w.H0(this, R.string.OpenArchiveHint, new Object[0]), false));
                    arrayList.add(new ra(2));
                    arrayList.add(new ra(20, R.id.btn_archive, 0, R.string.OpenArchive));
                    arrayList.add(new ra(3));
                }
            }
            this.V0.s2(arrayList, false);
            f fVar = new f(t());
            this.U0 = fVar;
            fVar.setHasFixedSize(true);
            this.U0.setAlpha(0.0f);
            this.U0.setLayoutManager(new LinearLayoutManager(t(), 1, false));
            this.U0.setAdapter(this.V0);
            this.U0.setBackgroundColor(ae.j.b());
            o8(this.U0, R.id.theme_color_background);
            this.U0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayoutFix frameLayoutFix = this.f8947w0;
            frameLayoutFix.addView(this.U0, frameLayoutFix.indexOfChild(this.f8949y0) + 1);
        }
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        zd.g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public void c6() {
        super.c6();
        n2 n2Var = this.f8948x0;
        if (n2Var != null) {
            n2Var.b();
        }
    }

    public final void ci(List<k8.b> list) {
        int initialLoadCount = this.f8949y0.getInitialLoadCount();
        final ArrayList arrayList = new ArrayList(list.size());
        for (k8.b bVar : list) {
            initialLoadCount--;
            arrayList.add(new b3(this, Wh(), bVar.f27458a, initialLoadCount >= 0));
        }
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ci(arrayList);
            }
        });
    }

    public final void ck(final kb.d<TdApi.Chat> dVar, int i10) {
        TdApi.Chat di;
        final y0.b bVar = new y0.b();
        Iterator<b3> it = this.f8950z0.i0().iterator();
        while (it.hasNext()) {
            b3 next = it.next();
            if (Uh(next) && (di = di(next.w())) != null && dVar.a(di)) {
                if (i10 > 0) {
                    i10--;
                }
                if (this.S0.h(di.f19908id) < 0) {
                    ek(di, false);
                }
            }
        }
        if (this.R0 == null) {
            this.R0 = new ArrayList();
        }
        this.R0.add(bVar);
        final kb.i y3Var = new kb.i() {
            @Override
            public final void a(boolean z10) {
                o4.this.Mj(bVar, z10);
            }
        };
        if (i10 > 0 || i10 == -1) {
            this.f24495b.x5(this.D0, new kb.j() {
                @Override
                public final void a(Object obj) {
                    o4.this.Oj(dVar, bVar, (TdApi.Chat) obj);
                }
            }, new kb.i() {
                @Override
                public final void a(boolean z10) {
                    o4.this.Qj(y3Var, z10);
                }
            }, true);
        } else {
            y3Var.a(true);
        }
    }

    @Override
    public void d3(TdApi.NetworkType networkType) {
        k0.b(this, networkType);
    }

    @Override
    public void d7(o6 o6Var, long j10, boolean z10) {
        if (this.f24495b.A6() == o6Var.A6() && j10 == 1) {
            jk(z10);
        }
    }

    @Override
    public boolean dc() {
        return !this.G0;
    }

    @Override
    public boolean dd() {
        return true;
    }

    public TdApi.Chat di(TdApi.Chat chat) {
        d0 d0Var;
        if (chat == null || (((d0Var = this.f8946v0) != null && !d0Var.a(chat)) || ob.b.a(chat, Wh()) == null)) {
            return null;
        }
        return chat;
    }

    public final void dk(b3 b3Var, boolean z10) {
        if (Uh(b3Var)) {
            ek(b3Var.w(), z10);
        }
    }

    @Override
    public void e0(final int i10, int i11) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Yi(i10);
            }
        });
    }

    @Override
    public void e2() {
        ChatsRecyclerView chatsRecyclerView = this.f8949y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.F1();
        }
    }

    @Override
    public void e7(long j10, int i10) {
        zd.g0.k(this, j10, i10);
    }

    public final int ei(kb.d<TdApi.Chat> dVar, kb.d<TdApi.Chat> dVar2) {
        k0.e<TdApi.Chat> eVar = this.S0;
        if (eVar == null || eVar.p() == 0) {
            return 0;
        }
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < this.S0.p(); i11++) {
            TdApi.Chat P3 = this.f24495b.P3(this.S0.j(i11));
            if (dVar2 == null || dVar2.a(P3)) {
                boolean a10 = dVar.a(P3);
                if (i10 == 0) {
                    z10 = a10;
                } else if (a10 != z10) {
                    return 3;
                }
                i10++;
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return z10 ? 1 : 2;
    }

    public final void ek(TdApi.Chat chat, boolean z10) {
        k0.e<TdApi.Chat> eVar = this.S0;
        int h10 = eVar != null ? eVar.h(chat.f19908id) : -1;
        boolean z11 = h10 >= 0;
        if (this.f24495b.c3(chat) || z11) {
            boolean z12 = !z11;
            if (z12) {
                if (this.S0 == null) {
                    this.S0 = new k0.e<>();
                }
                k0.e<TdApi.Chat> eVar2 = this.S0;
                long j10 = chat.f19908id;
                eVar2.k(j10, this.f24495b.P3(j10));
                if (z10) {
                    if (this.S0.p() == 1) {
                        Z9().Zc(1);
                    } else {
                        Z9().Kd(this.S0.p());
                    }
                    qk();
                }
            } else {
                this.S0.n(h10);
                if (z10) {
                    if (this.S0.p() == 0) {
                        Z9().Y8();
                    } else {
                        Z9().Kd(this.S0.p());
                        qk();
                    }
                }
            }
            ChatsRecyclerView chatsRecyclerView = this.f8949y0;
            if (chatsRecyclerView != null) {
                chatsRecyclerView.b2(chat.f19908id, z12);
            }
        }
    }

    @Override
    public void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        v7.a(this, j10, supergroupFullInfo);
    }

    @Override
    public void f4(final long j10, final String str) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Gi(j10, str);
            }
        });
    }

    @Override
    public void f5(final long j10, final String str) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Ui(j10, str);
            }
        });
    }

    public d0 fi() {
        return this.f8946v0;
    }

    public final void fk(int i10, boolean z10) {
        int h10;
        int i11;
        if (!Sa() && this.f8949y0 != null && (i11 = this.P0) != (h10 = ib.c.h(this.P0, i10, z10))) {
            boolean z11 = true;
            boolean z12 = i11 != 0;
            if (h10 == 0) {
                z11 = false;
            }
            this.P0 = h10;
            if (z12 == z11) {
                return;
            }
            if (z11) {
                if (this.Q0 == null) {
                    this.Q0 = new d(db.b.f7287b, 180L);
                }
                this.f8949y0.setItemAnimator(this.Q0);
                return;
            }
            this.f8949y0.setItemAnimator(null);
        }
    }

    @Override
    public void g3(final long j10, final long j11) {
        this.f24495b.id(new Runnable() {
            @Override
            public final void run() {
                o4.this.pj(j10, j11);
            }
        });
    }

    @Override
    public void g5(TdApi.Message message, long j10, int i10, String str) {
        g1.j(this, message, j10, i10, str);
    }

    @Override
    public int ga() {
        return R.id.theme_color_filling;
    }

    public final int gi() {
        j jVar = this.C0;
        if (jVar != null) {
            return jVar.a();
        }
        return this.f8946v0 != null ? R.string.Chats : Wh().getConstructor() != 362770115 ? R.string.general_Messages : R.string.ArchiveTitle;
    }

    public final void gk(boolean z10) {
        if (this.L0 == z10) {
            return;
        }
        if (this.f8949y0 == null) {
            this.L0 = z10;
            return;
        }
        this.L0 = z10;
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                o4.this.Rj();
            }
        });
    }

    @Override
    public void h5(int i10) {
        wc.c cVar = this.f8950z0;
        if (cVar != null) {
            cVar.g0();
        }
    }

    public final String hi() {
        return w.i1(gi());
    }

    public void hk(h hVar) {
        super.Ad(hVar);
        if (this.J0 != null) {
            throw new IllegalStateException();
        } else if (hVar == null) {
            this.A0 = null;
            this.f8946v0 = null;
            this.C0 = null;
            this.D0 = ob.b.f19338a;
            this.E0 = false;
        } else {
            this.f8946v0 = hVar.f8959a;
            this.C0 = hVar.f8960b;
            TdApi.ChatList chatList = hVar.f8961c;
            if (chatList == null) {
                chatList = ob.b.f19338a;
            }
            this.D0 = chatList;
            this.E0 = hVar.f8963e;
        }
    }

    @Override
    public void i2(e8 e8Var, final TdApi.Chat chat, final int i10, final o6.g gVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Fi(chat, i10, gVar);
            }
        });
    }

    @Override
    public void i5(e8 e8Var, final int i10, final int i11) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Li(i10, i11);
            }
        });
    }

    @Override
    public int ia() {
        return R.id.theme_color_headerLightIcon;
    }

    public int ii() {
        return this.f8950z0.l0() ? 1 : 0;
    }

    public final void ik(boolean z10) {
        nb nbVar;
        if (this.T0 != z10) {
            this.T0 = z10;
            if (this.W0 == null) {
                this.W0 = new eb.f(0, this, db.b.f7287b, 180L, !z10);
            }
            if (z10) {
                bk();
                nb nbVar2 = this.B0;
                if (nbVar2 != null) {
                    nbVar2.Vh(this);
                }
            }
            ChatsRecyclerView chatsRecyclerView = this.f8949y0;
            this.W0.p(z10, chatsRecyclerView != null && Math.max(chatsRecyclerView.getMeasuredWidth(), this.f8949y0.getMeasuredHeight()) > 0 && this.F0 != 0 && SystemClock.uptimeMillis() - this.F0 >= 600 && ((nbVar = this.B0) == null ? Ta() : nbVar.Ta()));
        }
    }

    @Override
    public void j0(final long j10, final long j11, final TdApi.MessageContent messageContent) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.nj(j10, j11, messageContent);
            }
        });
    }

    public nb ji() {
        return this.B0;
    }

    public final void jk(boolean z10) {
        if (this.M0 != null && this.K0 != z10) {
            this.K0 = z10;
            if (this.f8949y0 != null) {
                wc.c cVar = this.f8950z0;
                cVar.I(cVar.D() - 1);
                if (z10) {
                    Wj();
                }
            }
        }
    }

    @Override
    public void k1(long j10, long j11, TdApi.UnreadReaction[] unreadReactionArr, int i10) {
        g1.l(this, j10, j11, unreadReactionArr, i10);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        zd.g0.y(this, j10, videoChat);
    }

    public final int ki() {
        k0.e<TdApi.Chat> eVar = this.S0;
        if (eVar != null) {
            return eVar.p();
        }
        return 0;
    }

    public o4 kk(nb nbVar) {
        this.B0 = nbVar;
        return this;
    }

    @Override
    public void l0(final long j10, final int i10, boolean z10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Wi(j10, i10);
            }
        });
    }

    @Override
    public void l5(long j10, long j11, int i10, TdApi.ReplyMarkup replyMarkup) {
        g1.c(this, j10, j11, i10, replyMarkup);
    }

    @Override
    public boolean lf(TdApi.Chat chat) {
        d0 d0Var;
        return chat != null && ((d0Var = this.f8946v0) == null || !d0Var.k6() || this.f8946v0.a(chat)) && ob.b.a(chat, Wh()) != null;
    }

    public void li() {
        n2 n2Var = this.f8948x0;
        if (n2Var != null && this.f8944t0) {
            this.f8944t0 = false;
            this.f8947w0.removeView(n2Var);
            this.f8948x0.Q2();
            this.f8948x0 = null;
        }
        mk();
    }

    public final void lk(long[] jArr, int i10, boolean z10) {
        int L0 = this.V0.L0(R.id.inviteFriendsText);
        if (L0 != -1) {
            ra raVar = this.V0.D0().get(L0);
            CharSequence Tj = Tj();
            View C = this.U0.getLayoutManager().C(L0);
            if (Tj != null && !Tj.equals(raVar.u())) {
                raVar.X(Tj);
                this.V0.r3(L0);
            }
            if (C != null) {
                ((ne.s1) ((ViewGroup) ((ViewGroup) C).getChildAt(0)).getChildAt(0)).i(jArr, i10, z10);
            }
        }
        int L02 = this.V0.L0(R.id.btn_invite);
        if (L02 != -1) {
            ra raVar2 = this.V0.D0().get(L02);
            int i11 = i10 > 0 ? R.string.ShowContacts : R.string.InviteContacts;
            if (raVar2.w() != i11) {
                raVar2.W(i11);
                this.V0.r3(L02);
            }
        }
    }

    @Override
    public boolean m1() {
        return this.J0.p();
    }

    @Override
    public RecyclerView m2() {
        return this.f8949y0;
    }

    @Override
    public void m6(t0 t0Var, boolean z10, float f10, boolean z11) {
        if (z11) {
            fk(2, false);
        }
    }

    public final boolean mi() {
        return this.C0 == null && ((w9() != null && w9().f8962d) || Wh().getConstructor() == -400991316);
    }

    public final void mk() {
        CharSequence charSequenceExtra;
        Intent intent = this.A0;
        if (intent != null && !this.f8944t0) {
            this.A0 = null;
            String type = intent.getType() == null ? "" : intent.getType();
            type.hashCode();
            if (type.equals("text/plain") || type.equals("message/rfc822")) {
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (stringExtra == null && (charSequenceExtra = intent.getCharSequenceExtra("android.intent.extra.TEXT")) != null) {
                    stringExtra = charSequenceExtra.toString();
                }
                if (stringExtra != null) {
                    String trim = stringExtra.trim();
                    if (trim.length() > 0) {
                        y00 y00Var = new y00(this.f24493a, this.f24495b);
                        y00Var.Vi(new y00.m(trim));
                        y00Var.ej();
                    }
                }
            }
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        RecyclerView recyclerView;
        if (i10 == 0 && (recyclerView = this.U0) != null) {
            recyclerView.setAlpha(f10);
        }
    }

    public boolean ni(b3 b3Var) {
        k0.e<TdApi.Chat> eVar;
        return Uh(b3Var) && (eVar = this.S0) != null && eVar.h(b3Var.x()) >= 0;
    }

    public final boolean nk(int i10) {
        return (i10 == 0 || i10 == 3) ? false : true;
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
        if (i10 == 0 && f10 == 0.0f) {
            bi();
        }
    }

    @Override
    public void o6() {
        super.o6();
        n2 n2Var = this.f8948x0;
        if (n2Var != null) {
            n2Var.e();
        }
    }

    @Override
    public View oc(Context context) {
        Sj();
        Yi(this.f24495b.D4());
        p pVar = new p(context);
        this.f8947w0 = pVar;
        pVar.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        ChatsRecyclerView chatsRecyclerView = (ChatsRecyclerView) p0.v(t(), R.layout.recycler_chats, this.f8947w0);
        this.f8949y0 = chatsRecyclerView;
        chatsRecyclerView.setMeasureListener(new CustomRecyclerView.a() {
            @Override
            public final void a(CustomRecyclerView customRecyclerView, int i10, int i11, int i12, int i13) {
                o4.this.cj(customRecyclerView, i10, i11, i12, i13);
            }
        });
        this.f8949y0.setItemAnimator(null);
        boolean z10 = false;
        if (Ua()) {
            this.f8949y0.setVerticalScrollBarEnabled(false);
        }
        this.f8949y0.setHasFixedSize(true);
        this.f8949y0.g(new i(this));
        yd.g.i(this.f8949y0, R.id.theme_color_filling, this);
        androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g(new a());
        this.H0 = gVar;
        gVar.m(this.f8949y0);
        this.f8950z0 = this.f8949y0.P1(this, this);
        this.f8949y0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        d0 d0Var = this.f8946v0;
        if (d0Var != null) {
            this.f8949y0.setTotalRes(d0Var.I3());
        }
        this.f8947w0.addView(this.f8949y0);
        p0.e0(this.f8949y0);
        Zh();
        if (!mi()) {
            qf(this.f8947w0);
        }
        Yi(this.f24495b.D4());
        this.f24495b.O9().a0(this);
        this.f24495b.e2().X1(this);
        he.i.c2().l(this);
        t1.b().a(this);
        this.J0.u(this, new kb.j() {
            @Override
            public final void a(Object obj) {
                o4.this.ci((List) obj);
            }
        }, this.f8949y0.getInitialLoadCount(), new Runnable() {
            @Override
            public final void run() {
                o4.this.ej();
            }
        });
        if (mi()) {
            this.f24495b.E4().u(this);
            if (this.f8946v0 == null && Wh().getConstructor() == -400991316) {
                this.f8949y0.k(new b());
                boolean V = this.f24495b.tc().V();
                this.L0 = V;
                this.K0 = V;
                this.M0 = this.f24495b.o3(ob.b.f19339b);
                this.N0 = new c();
                wc.c cVar = this.f8950z0;
                if (this.M0.L() > 0) {
                    z10 = true;
                }
                cVar.G0(z10);
                this.M0.K(this.N0);
                this.M0.D(null, 3, null);
                this.f24495b.tc().g(this);
            }
        }
        if (this.f8946v0 == null) {
            t0 t0Var = new t0(this.f24493a, this.f24495b, 0L, 0L, this.f8949y0, true, this);
            this.I0 = t0Var;
            t0Var.v();
        }
        this.F0 = SystemClock.uptimeMillis();
        return this.f8947w0;
    }

    public boolean oi() {
        return this.J0.v();
    }

    public void ok() {
        if (!this.f8944t0) {
            if (this.f8948x0 == null) {
                n2 n2Var = new n2(t());
                this.f8948x0 = n2Var;
                n2Var.h(1.0f);
                this.f8948x0.setLayoutParams(FrameLayoutFix.r1(a0.i(48.0f), a0.i(48.0f), 17));
            }
            if (this.f8948x0.getParent() == null) {
                this.f8947w0.addView(this.f8948x0);
            }
            this.f8944t0 = true;
        }
    }

    @Override
    public void onClick(View view) {
        b3 chat;
        if (view.getId() != R.id.chat || (chat = ((wc.a) view).getChat()) == null) {
            return;
        }
        if (ni(chat) || ki() > 0) {
            dk(chat, true);
        } else if (chat.i0()) {
            o4 o4Var = new o4(this.f24493a, this.f24495b);
            o4Var.hk(new h(new TdApi.ChatListArchive()).c(true));
            this.f24493a.Q1().h0(o4Var);
        } else {
            Vj(chat.w());
        }
    }

    @Override
    public boolean onLongClick(View view) {
        final b3 chat;
        if (view.getId() != R.id.chat || (chat = ((wc.a) view).getChat()) == null) {
            return false;
        }
        if (!chat.i0()) {
            this.f24495b.hd().r8(this, Wh(), chat.x(), null, Uh(chat), ni(chat), new Runnable() {
                @Override
                public final void run() {
                    o4.this.gj(chat);
                }
            });
            return true;
        } else if (ki() != 0) {
            return true;
        } else {
            this.f24495b.hd().n8(this, this.f24495b.o3(ob.b.f19339b));
            return true;
        }
    }

    @Override
    public void p5(int i10) {
        Vh();
        if (this.S0 != null) {
            while (this.S0.p() > 0) {
                ek(this.S0.q(0), false);
            }
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        zd.g0.h(this, j10, z10);
    }

    public boolean pi() {
        return this.f8946v0 != null;
    }

    public void Yi(int i10) {
        if (i10 == 0) {
            mk();
            Hd(hi());
            return;
        }
        Gd(hj.T8(i10));
    }

    @Override
    public void q2(long j10, boolean z10) {
        zd.g0.e(this, j10, z10);
    }

    public boolean qi() {
        return this.f8945u0;
    }

    public final void qk() {
        q1 bc2 = Z9().bc();
        d1 I = bc2 != null ? bc2.I() : null;
        if (I != null) {
            int Th = Th();
            int i10 = 8;
            boolean z10 = true;
            I.Q3(R.id.menu_chatBulkActions, R.id.menu_btn_pinUnpin, nk(Th) ? 0 : 8, Th == 1 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
            int Sh = Sh();
            I.Q3(R.id.menu_chatBulkActions, R.id.menu_btn_muteUnmute, Sh != 0 ? 0 : 8, Sh == 1 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
            int Rh = Rh();
            if (Rh == 0 || Rh == 3) {
                z10 = false;
            }
            if (z10) {
                i10 = 0;
            }
            I.Q3(R.id.menu_chatBulkActions, R.id.menu_btn_delete, i10, 0);
        }
    }

    @Override
    public m1.e r6(View view, m1.f fVar, jb.c cVar, jb.c cVar2, u0 u0Var, v4<?> v4Var) {
        final b3 chat = view instanceof wc.a ? ((wc.a) view).getChat() : null;
        if (chat == null || !chat.i0()) {
            ne.i iVar = (ne.i) view;
            return this.f24495b.hd().N2(this, iVar.getPreviewChatList(), iVar.getPreviewChatId(), null, cVar, cVar2, u0Var, ki() == 0, Uh(chat), ni(chat), new Runnable() {
                @Override
                public final void run() {
                    o4.this.bj(chat);
                }
            });
        }
        o6 o6Var = this.f24495b;
        TdApi.ChatListArchive chatListArchive = ob.b.f19339b;
        if (o6Var.w6(chatListArchive)) {
            cVar.a(R.id.btn_markChatAsRead);
            u0Var.a(R.string.ArchiveRead);
            cVar2.a(R.drawable.baseline_done_all_24);
        }
        boolean V = this.f24495b.tc().V();
        cVar.a(R.id.btn_pinUnpinChat);
        if (V) {
            cVar2.a(R.drawable.deproko_baseline_pin_24);
            u0Var.a(R.string.ArchivePin);
        } else {
            cVar2.a(R.drawable.baseline_arrow_upward_24);
            u0Var.a(R.string.ArchiveHide);
        }
        fVar.Q(this.f24495b);
        fVar.L(null, new hd.b(m.getBaseAvatarRadiusDp(), new b.a((int) R.id.theme_color_avatarArchive, (int) R.drawable.baseline_archive_24), null));
        fVar.K(w.i1(R.string.ArchiveTitle), w.o2(R.string.xChats, this.f24495b.k6(chatListArchive)));
        fVar.N(new m1.g() {
            @Override
            public final boolean a(k kVar, float f10, Object obj) {
                boolean aj;
                aj = o4.this.aj(kVar, f10, obj);
                return aj;
            }
        });
        return new e();
    }

    public boolean ri() {
        return this.F0 == 0 || SystemClock.uptimeMillis() - this.F0 <= 1000;
    }

    @Override
    public void s0(final TdApi.Supergroup supergroup) {
        if (!hd.t2.h3(supergroup.status)) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    o4.this.Hj(supergroup);
                }
            });
        }
    }

    @Override
    public void s5(long j10, long j11) {
        g1.g(this, j10, j11);
    }

    public boolean si() {
        return this.C0 != null;
    }

    @Override
    public void t4(long j10, String[] strArr) {
        zd.g0.b(this, j10, strArr);
    }

    @Override
    public void t7(final long j10, final TdApi.ChatPermissions chatPermissions) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Oi(j10, chatPermissions);
            }
        });
    }

    public boolean ti() {
        wc.c cVar;
        return this.K0 && (cVar = this.f8950z0) != null && cVar.l0() && ((LinearLayoutManager) this.f8949y0.getLayoutManager()).X1() == 0;
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        switch (i10) {
            case R.id.menu_chatBulkActions:
                int wa2 = wa();
                int Th = Th();
                boolean z10 = true;
                int i11 = 8;
                d1Var.K1(linearLayout, R.id.menu_btn_pinUnpin, Th == 1 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24, wa2, this, a0.i(52.0f)).setVisibility(nk(Th) ? 0 : 8);
                int Sh = Sh();
                d1Var.K1(linearLayout, R.id.menu_btn_muteUnmute, Sh == 1 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24, wa2, this, a0.i(52.0f)).setVisibility(Sh != 0 ? 0 : 8);
                int Rh = Rh();
                ud.u0 S1 = d1Var.S1(linearLayout, this, wa2);
                if (Rh == 0 || Rh == 3) {
                    z10 = false;
                }
                if (z10) {
                    i11 = 0;
                }
                S1.setVisibility(i11);
                d1Var.c2(linearLayout, this, wa());
                return;
            case R.id.menu_clear:
                d1Var.O1(linearLayout, ia(), ea());
                return;
            case R.id.menu_passcode:
                if (mi()) {
                    d1Var.Z1(linearLayout);
                }
                d1Var.g2(linearLayout, this);
                return;
            case R.id.menu_search:
                d1Var.g2(linearLayout, this);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean u3() {
        return x7.a(this);
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    @Override
    public TdApi.ChatList uf() {
        TdApi.ChatList Wh = Wh();
        if (Wh instanceof TdApi.ChatListMain) {
            return null;
        }
        return Wh;
    }

    @Override
    public void v1(int i10, ArrayList<w8.i> arrayList, int i11) {
    }

    @Override
    public int vf() {
        d0 d0Var = this.f8946v0;
        if (d0Var == null || !d0Var.k6()) {
            return Wh().getConstructor() == 362770115 ? R.string.MessagesArchive : super.vf();
        }
        return this.f8946v0.M(Wh().getConstructor() == 362770115);
    }

    @Override
    public void w1(long j10, boolean z10) {
        zd.g0.c(this, j10, z10);
    }

    @Override
    public void w6(final long j10, final TdApi.ChatPosition chatPosition, final boolean z10, final boolean z11, final boolean z12) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Qi(j10, chatPosition, z10, z11, z12);
            }
        });
    }

    @Override
    public boolean wc(boolean z10) {
        return super.wc(z10);
    }

    @Override
    public int wf() {
        return this.E0 ? 11 : 9;
    }

    @Override
    public void x1(long j10) {
        i1.a(this, j10);
    }

    @Override
    public void x2(final TdApi.NotificationSettingsScope notificationSettingsScope, final TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Dj(notificationSettingsScope, scopeNotificationSettings);
            }
        });
    }

    @Override
    public void x5(long j10, long j11) {
        zd.g0.s(this, j10, j11);
    }

    @Override
    public int xa() {
        return R.id.menu_chatBulkActions;
    }

    @Override
    public void y1(final long j10, final long j11) {
        wd(new Runnable() {
            @Override
            public final void run() {
                o4.this.Si(j10, j11);
            }
        });
    }

    @Override
    public void y2(TdApi.Message message) {
        g1.n(this, message);
    }

    @Override
    public void y6(t0 t0Var, boolean z10, boolean z11) {
        if (this.f8949y0 != null && !this.f8950z0.i0().isEmpty()) {
            int ii = ii();
            this.f8950z0.I(ii);
            if (ii > 0) {
                this.f8950z0.I(ii - 1);
            }
            if (this.f8950z0.l0() && this.K0) {
                wc.c cVar = this.f8950z0;
                cVar.I(cVar.D() - 1);
            }
        }
    }

    @Override
    public void yc() {
        super.yc();
        Vh();
    }

    @Override
    public void z0() {
        i1.c(this);
    }

    @Override
    public View zf() {
        return this.f8949y0;
    }

    public static class h {
        public d0 f8959a;
        public j f8960b;
        public TdApi.ChatList f8961c;
        public boolean f8962d;
        public boolean f8963e;

        public h(d0 d0Var) {
            this.f8959a = d0Var;
        }

        public h a(TdApi.ChatList chatList) {
            this.f8961c = chatList;
            return this;
        }

        public h b(boolean z10) {
            this.f8962d = z10;
            return this;
        }

        public h c(boolean z10) {
            this.f8963e = z10;
            return this;
        }

        public h(TdApi.ChatList chatList) {
            this.f8961c = chatList;
        }

        public h(j jVar) {
            this.f8960b = jVar;
        }

        public h(d0 d0Var, j jVar) {
            this.f8959a = d0Var;
            this.f8960b = jVar;
        }
    }
}
