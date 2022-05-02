package p038ce;

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
import androidx.recyclerview.widget.C0962g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1399s0;
import gd.C4587b;
import gd.C4592b3;
import gd.C4601c3;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import me.C6879f3;
import me.C6957m1;
import me.C6977n2;
import me.C7023s1;
import me.View$OnClickListenerC6902i;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.ChatsRecyclerView;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2805o4;
import p038ce.x00;
import p051db.C3940f;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5912d;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p139jb.AbstractRunnableC5910b;
import p141jd.C5974t0;
import p143k0.C6035e;
import p193nb.C7316a;
import p193nb.C7317b;
import p193nb.C7321e;
import p291uc.C9678w2;
import p335xd.C10192g;
import p337y0.C10327b;
import p350yd.AbstractC10650f0;
import p350yd.AbstractC10700h0;
import p350yd.AbstractC10701h1;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10748j1;
import p350yd.AbstractC10817l1;
import p350yd.AbstractC10861n0;
import p350yd.AbstractC10903p0;
import p350yd.C10676g0;
import p350yd.C10684g8;
import p350yd.C10721i0;
import p350yd.C10722i1;
import p350yd.C10733ic;
import p350yd.C10791k1;
import p350yd.C10838m0;
import p350yd.C10846m8;
import p350yd.C10882o0;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p350yd.C11059v7;
import p350yd.C11090w7;
import p350yd.C11111x7;
import p350yd.C11133y7;
import p350yd.C11134y8;
import p350yd.C11165z7;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9174d2;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9299t2;
import td.AbstractC9323v4;
import td.AbstractC9376x4;
import td.AbstractC9388z1;
import td.C9188f2;
import td.C9239m;
import td.C9261p;
import td.C9270q1;
import td.C9310u0;
import td.C9357x2;
import td.View$OnClickListenerC9170d1;
import vc.C9903a;
import vc.C9906c;

public class View$OnClickListenerC2805o4 extends AbstractC9299t2<C2813h> implements AbstractC9201h1, View.OnClickListener, View.OnLongClickListener, ChatsRecyclerView.AbstractC7919b, AbstractC10747j0, AbstractC10861n0, AbstractC10748j1, AbstractC10701h1, AbstractC10817l1, C11059v7.AbstractC11067h, C11059v7.AbstractC11061b, C11059v7.AbstractC11068i, C11059v7.AbstractC11066g, AbstractC10700h0, AbstractC9388z1, C11052v1.AbstractC11053a, AbstractC9376x4.AbstractC9378b, View$OnClickListenerC6902i.AbstractC6905c, C11134y8.AbstractC11141f, C3950k.AbstractC3952b, C6957m1.AbstractC6967j, C5974t0.AbstractC5975a, View$OnClickListenerC6902i.AbstractC6907e, C11059v7.AbstractC11069j, C4868i.AbstractC4871c, AbstractC10903p0, C10733ic.AbstractC10738e, AbstractC9174d2, AbstractC9213j1 {
    public Intent f9454A0;
    public C2760nb f9455B0;
    public AbstractC2815j f9456C0;
    public TdApi.ChatList f9457D0;
    public boolean f9458E0;
    public long f9459F0;
    public boolean f9460G0;
    public C0962g f9461H0;
    public C5974t0 f9462I0;
    public C10846m8 f9463J0;
    public boolean f9464K0;
    public boolean f9465L0;
    public C10684g8 f9466M0;
    public AbstractC10700h0 f9467N0;
    public int f9468O0 = 0;
    public int f9469P0;
    public C8731d f9470Q0;
    public List<C10327b> f9471R0;
    public C6035e<TdApi.Chat> f9472S0;
    public boolean f9473T0;
    public RecyclerView f9474U0;
    public C2546iq f9475V0;
    public C3940f f9476W0;
    public AbstractRunnableC5910b f9477X0;
    public C9357x2.C9370l f9478Y0;
    public boolean f9479t0;
    public boolean f9480u0;
    public AbstractC10650f0 f9481v0;
    public FrameLayoutFix f9482w0;
    public C6977n2 f9483x0;
    public ChatsRecyclerView f9484y0;
    public C9906c f9485z0;

    public class C2806a extends C0962g.AbstractC0968f {
        public int f9486d = -1;
        public int f9487e = -1;

        public C2806a() {
            View$OnClickListenerC2805o4.this = r1;
        }

        @Override
        public void mo9885A(RecyclerView.AbstractC0886d0 d0Var, int i) {
            super.mo9885A(d0Var, i);
            if (d0Var != null && d0Var.m39332n() == 0) {
                ((C9903a) d0Var.f3479a).setIsDragging(true);
                View$OnClickListenerC2805o4.this.m33364fk(1, true);
            }
        }

        @Override
        public void mo9884B(RecyclerView.AbstractC0886d0 d0Var, int i) {
        }

        @Override
        public void mo9881c(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            int i;
            super.mo9881c(recyclerView, d0Var);
            int i2 = this.f9486d;
            if (!(i2 == -1 || (i = this.f9487e) == -1 || i2 == i)) {
                View$OnClickListenerC2805o4.this.f9485z0.m6627H0();
            }
            this.f9487e = -1;
            this.f9486d = -1;
            View$OnClickListenerC2805o4.this.f9484y0.setItemAnimator(null);
            View$OnClickListenerC2805o4.this.m33364fk(1, false);
            ((C9903a) d0Var.f3479a).setIsDragging(false);
            if (View$OnClickListenerC2805o4.this.f9478Y0 != null) {
                View$OnClickListenerC2805o4.this.f9478Y0.m8919F();
            }
        }

        @Override
        public int mo9880k(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var) {
            C4592b3 chat;
            if (d0Var.m39332n() != 0 || (chat = ((C9903a) d0Var.f3479a).getChat()) == null || !chat.m27123n0() || !View$OnClickListenerC2805o4.this.f9485z0.m6599f0() || View$OnClickListenerC2805o4.this.f9481v0 != null) {
                return 0;
            }
            return C0962g.AbstractC0968f.m38781t(3, 0);
        }

        @Override
        public boolean mo9879r() {
            return false;
        }

        @Override
        public boolean mo9877y(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, RecyclerView.AbstractC0886d0 d0Var2) {
            int k = d0Var.m39335k();
            int k2 = d0Var2.m39335k();
            C4592b3 i0 = View$OnClickListenerC2805o4.this.f9485z0.m6593i0(k);
            C4592b3 i02 = View$OnClickListenerC2805o4.this.f9485z0.m6593i0(k2);
            if (i0 != null && i02 != null && i0.m27123n0() && i02.m27123n0()) {
                if (this.f9486d == -1) {
                    this.f9486d = k;
                }
                this.f9487e = k2;
                View$OnClickListenerC2805o4.this.f9485z0.m6580t0(k, k2);
                if (View$OnClickListenerC2805o4.this.f9478Y0 != null) {
                    View$OnClickListenerC2805o4.this.f9478Y0.m8915J();
                }
            }
            return false;
        }

        @Override
        public void mo9876z(RecyclerView recyclerView, RecyclerView.AbstractC0886d0 d0Var, int i, RecyclerView.AbstractC0886d0 d0Var2, int i2, int i3, int i4) {
            super.mo9876z(recyclerView, d0Var, i, d0Var2, i2, i3, i4);
            d0Var.f3479a.invalidate();
            d0Var2.f3479a.invalidate();
            if (View$OnClickListenerC2805o4.this.f9478Y0 != null) {
                View$OnClickListenerC2805o4.this.f9478Y0.m8904U();
            }
        }
    }

    public class C2807b extends RecyclerView.AbstractC0910t {
        public C2807b() {
            View$OnClickListenerC2805o4.this = r1;
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            View C;
            boolean z = false;
            if (View$OnClickListenerC2805o4.this.f9464K0 && View$OnClickListenerC2805o4.this.f9465L0 && View$OnClickListenerC2805o4.this.f9468O0 == 0 && i != 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager.m39549X1() == 1 && (C = linearLayoutManager.mo39262C(1)) != null && linearLayoutManager.m39231U(C) == 0) {
                    View$OnClickListenerC2805o4.this.m33359gk(false);
                }
            }
            View$OnClickListenerC2805o4.this.f9468O0 = i;
            if (View$OnClickListenerC2805o4.this.f9464K0 && i == 0) {
                LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) recyclerView.getLayoutManager();
                int X1 = linearLayoutManager2.m39549X1();
                if (X1 == 0) {
                    View$OnClickListenerC2805o4.this.m33359gk(false);
                    View C2 = linearLayoutManager2.mo39262C(X1);
                    int i2 = C2 != null ? -linearLayoutManager2.m39231U(C2) : 0;
                    if (i2 < C9903a.m6642r1(C4868i.m24726c2().m24584u0()) / 2) {
                        View$OnClickListenerC2805o4.this.f9484y0.mo8024v1(0, -i2);
                    } else {
                        View$OnClickListenerC2805o4.this.mo8829I();
                    }
                } else if (X1 == 1) {
                    View C3 = linearLayoutManager2.mo39262C(X1);
                    View$OnClickListenerC2805o4 o4Var = View$OnClickListenerC2805o4.this;
                    if (C3 == null || linearLayoutManager2.m39231U(C3) < 0) {
                        z = true;
                    }
                    o4Var.m33359gk(z);
                } else {
                    View$OnClickListenerC2805o4.this.m33359gk(true);
                }
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            if (View$OnClickListenerC2805o4.this.f9464K0 && !View$OnClickListenerC2805o4.this.f9465L0 && View$OnClickListenerC2805o4.this.f9468O0 == 2 && i2 > 0 && ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549X1() > 0) {
                View$OnClickListenerC2805o4.this.m33359gk(true);
            }
        }
    }

    public class C2808c implements AbstractC10700h0 {
        public C2808c() {
            View$OnClickListenerC2805o4.this = r1;
        }

        public void m33270c(C10684g8 g8Var) {
            View$OnClickListenerC2805o4.this.f9485z0.m6626I0(g8Var.m4301L() > 0);
            View$OnClickListenerC2805o4.this.f9485z0.m6624K0(0);
        }

        public void m33269d(int i) {
            View$OnClickListenerC2805o4.this.f9485z0.m6624K0(i);
        }

        @Override
        public void mo3013I5(C10684g8 g8Var, int i, int i2) {
            C10676g0.m4334e(this, g8Var, i, i2);
        }

        @Override
        public void mo3012T1(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
            C10676g0.m4338a(this, g8Var, chat, i, gVar);
        }

        @Override
        public void mo3011e4(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
            C10676g0.m4337b(this, g8Var, chat, i, gVar);
        }

        @Override
        public void mo3010g1(C10684g8 g8Var, TdApi.Chat chat, int i) {
            final int i2 = 2;
            if (i != 0) {
                if (i == 1) {
                    i2 = 1;
                } else if (!(i == 2 || i == 3)) {
                    if (i != 4) {
                        return;
                    }
                }
                View$OnClickListenerC2805o4.this.m9135wd(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2805o4.C2808c.this.m33269d(i2);
                    }
                });
            }
            i2 = 0;
            View$OnClickListenerC2805o4.this.m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.C2808c.this.m33269d(i2);
                }
            });
        }

        @Override
        public void mo3009i(final C10684g8 g8Var, int i) {
            if (C5063c.m24138h(i, 1, false) != 0) {
                View$OnClickListenerC2805o4.this.m9135wd(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2805o4.C2808c.this.m33270c(g8Var);
                    }
                });
            }
        }

        @Override
        public void mo3008m5(C10684g8 g8Var, TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
            C10676g0.m4332g(this, g8Var, chat, i, gVar);
        }

        @Override
        public void mo3007n7(C10684g8 g8Var, TdApi.Chat chat, int i, int i2, C10930q6.C10937g gVar) {
            C10676g0.m4333f(this, g8Var, chat, i, i2, gVar);
        }
    }

    public class C2809d extends C8731d {
        public C2809d(Interpolator interpolator, long j) {
            super(interpolator, j);
            View$OnClickListenerC2805o4.this = r1;
        }

        @Override
        public void mo11622q0(View view, float f) {
            if ((View$OnClickListenerC2805o4.this.f9469P0 & 2) == 0) {
                super.mo11622q0(view, f);
            }
        }
    }

    public class C2810e implements C6957m1.AbstractC6962e {
        public C2810e() {
            View$OnClickListenerC2805o4.this = r1;
        }

        public static void m33267b(int i) {
            C1379j0.m37290z0(C4403w.m27844o2(R.string.ReadAllChatsDone, i), 0);
        }

        @Override
        public void mo3385B6(C6957m1.C6963f fVar, int i, Object obj) {
            if (i == R.id.btn_markChatAsRead) {
                View$OnClickListenerC2805o4.this.f30167b.m2732Na(new TdApi.ChatListArchive(), C2958r4.f9823a);
            } else if (i == R.id.btn_pinUnpinChat) {
                View$OnClickListenerC2805o4.this.f30167b.m2294pc().m4092u0(1L);
            }
        }

        @Override
        public void mo3384E3(C6957m1.C6963f fVar, int i, Object obj) {
        }
    }

    public class C2811f extends RecyclerView {
        public C2811f(Context context) {
            super(context);
            View$OnClickListenerC2805o4.this = r1;
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

    public class C2812g extends AbstractRunnableC5910b {
        public final long[] f9494M;
        public final int f9495N;

        public C2812g(long[] jArr, int i) {
            View$OnClickListenerC2805o4.this = r1;
            this.f9494M = jArr;
            this.f9495N = i;
        }

        @Override
        public void mo1364b() {
            if (View$OnClickListenerC2805o4.this.f9477X0 == this && View$OnClickListenerC2805o4.this.f9475V0 != null) {
                View$OnClickListenerC2805o4.this.m33334lk(this.f9494M, this.f9495N, true);
            }
        }
    }

    public static class C2814i extends RecyclerView.AbstractC0901o {
        public final View$OnClickListenerC2805o4 f9502a;
        public final Paint f9503b;
        public final Paint f9504c;

        public C2814i(View$OnClickListenerC2805o4 o4Var) {
            this.f9502a = o4Var;
            Paint paint = new Paint(5);
            this.f9503b = paint;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18691q(), C6879f3.m18690r(), (float[]) null, Shader.TileMode.CLAMP));
            Paint paint2 = new Paint(5);
            this.f9504c = paint2;
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, C6879f3.m18692p(), C6879f3.m18707a(), (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39421k0(view);
            if (k0 == -1) {
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            C4592b3 i0 = this.f9502a.f9485z0.m6593i0(k0);
            if (i0 != null) {
                C4592b3 i02 = this.f9502a.f9485z0.m6593i0(k0 + 1);
                if (i02 == null || (i0.m27138h0() == i02.m27138h0() && i0.m27121o0() == i02.m27121o0())) {
                    rect.bottom = C1357a0.m37526x();
                } else {
                    rect.bottom = C1357a0.m37541i(12.0f);
                }
                rect.top = 0;
                if (this.f9502a.f9462I0 != null && this.f9502a.f9462I0.m21732w()) {
                    int ii = this.f9502a.m33351ii();
                    if (k0 == ii) {
                        rect.top = C5974t0.m21735t();
                    } else if (k0 == ii - 1) {
                        rect.bottom = C1357a0.m37541i(1.0f);
                    }
                }
                if (this.f9502a.f9465L0 && rect.top == 0 && i0.m27138h0()) {
                    rect.top = -C9903a.m6642r1(i0.m27201E());
                    if (this.f9502a.f9462I0 == null || !this.f9502a.f9462I0.m21732w()) {
                        rect.top -= C1357a0.m37541i(12.0f);
                    } else {
                        rect.top -= C1357a0.m37541i(1.0f);
                    }
                }
            } else if (this.f9502a.f9485z0.mo6153D() > 0 && this.f9502a.f9485z0.m6587m0() && this.f9502a.f9464K0 && k0 == this.f9502a.f9485z0.mo6153D() - 1) {
                rect.bottom = Math.max(0, recyclerView.getMeasuredHeight() - this.f9502a.m33434Qh());
            }
        }

        @Override
        public void mo8191i(android.graphics.Canvas r33, androidx.recyclerview.widget.RecyclerView r34, androidx.recyclerview.widget.RecyclerView.C0880a0 r35) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC2805o4.C2814i.mo8191i(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$a0):void");
        }
    }

    public interface AbstractC2815j {
        void mo3382a(HandlerC10770jj.C10780j jVar);

        int mo3381b();

        Object mo3380c();

        boolean mo3379d(TdApi.Chat chat, Runnable runnable);
    }

    public View$OnClickListenerC2805o4(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m33497Ai(TdApi.Chat chat) {
        return !this.f30167b.m2443g7(chat.f25367id);
    }

    public boolean m33496Aj(View view, int i) {
        switch (i) {
            case R.id.btn_selectAll:
                m33379ck(C3137u3.f10516a, this.f30167b.m2189w5(m33410Wh()).f33873a);
                return true;
            case R.id.btn_selectChat:
            default:
                return true;
            case R.id.btn_selectMuted:
                final C10930q6 q6Var = this.f30167b;
                Objects.requireNonNull(q6Var);
                m33379ck(new AbstractC5912d() {
                    @Override
                    public final boolean mo1511a(Object obj) {
                        return C10930q6.this.m2239t3((TdApi.Chat) obj);
                    }
                }, this.f30167b.m2189w5(m33410Wh()).f33873a);
                return true;
            case R.id.btn_selectUnread:
                m33379ck(C3180v3.f10626a, this.f30167b.m2189w5(m33410Wh()).f33874b);
                return true;
        }
    }

    public boolean m33493Bi(TdApi.Chat chat) {
        return C7317b.m17037g(chat, this.f9457D0);
    }

    public static void m33492Bj(long[] jArr, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 217237013) {
            long j = ((TdApi.StorageStatistics) object).size;
            if (j > 0) {
                C1379j0.m37290z0(C4403w.m27840p2(R.string.ClearedSizeChats, jArr.length, C1363c0.m37423m(j)), 0);
            } else {
                C1379j0.m37290z0(C4403w.m27844o2(R.string.ClearedNoneChats, jArr.length), 0);
            }
        }
    }

    public void m33489Ci(List list) {
        this.f9480u0 = true;
        this.f9485z0.m6600e0((C4592b3[]) list.toArray(new C4592b3[0]));
    }

    public boolean m33488Cj(View view, int i) {
        if (i != R.id.btn_clearCache) {
            return true;
        }
        final long[] v = C5062b.m24150v(this.f9472S0);
        C1379j0.m37290z0(C4403w.m27844o2(R.string.ClearingXChats, v.length), 0);
        this.f30167b.m2270r4().m14783o(new TdApi.OptimizeStorage(0L, 0, 0, 0, null, v, null, true, 0), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2805o4.m33492Bj(v, object);
            }
        });
        m33399Yj();
        return true;
    }

    public void m33485Di(TdApi.BasicGroup basicGroup) {
        m33406Xh(C7316a.m17060a(basicGroup.f25363id));
    }

    public void m33484Dj(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14170m2(notificationSettingsScope, scopeNotificationSettings);
        }
    }

    public void m33481Ei(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        this.f9484y0.m14191R1(this.f9485z0.m6604c0(chat, i, gVar));
    }

    public void m33480Ej(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14171l2(j, chatNotificationSettings);
        }
    }

    public void m33477Fi(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        this.f9484y0.m14191R1(this.f9485z0.m6623L0(chat, i, gVar));
    }

    public void m33476Fj(TdApi.SecretChat secretChat) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14169n2(secretChat);
        }
    }

    public void m33473Gi(long j, String str) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14189T1(j, str);
        }
    }

    public void m33472Gj() {
        if (!m9347Sa()) {
            m9300Z9().m9307Y8();
            mo8837u5(-1);
        }
    }

    public void m33469Hi() {
        if (!m9347Sa() && !m33331mi()) {
            m9298Zb();
        }
    }

    public void m33468Hj(TdApi.Supergroup supergroup) {
        m33406Xh(C7316a.m17059b(supergroup.f25425id));
    }

    public void m33465Ii(long j, TdApi.DraftMessage draftMessage) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14188U1(j, draftMessage);
        }
    }

    public void m33464Ij(TdApi.User user) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14168p2(user);
        }
    }

    public void m33461Ji(long j, boolean z) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14187V1(j, z);
        }
    }

    public void m33460Jj(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            m9135wd(new RunnableC2736n1(this));
        }
    }

    public void m33457Ki(int i) {
        if (C5063c.m24144b(i, 10)) {
            m33391ai();
        }
    }

    public void m33456Kj() {
        C2760nb nbVar = this.f9455B0;
        if (nbVar != null) {
            nbVar.m9291ac(new View$OnClickListenerC2928qj(this.f30165a, this.f30167b).m31290zg().m31316Ag());
        }
    }

    public void m33453Li(int i, int i2) {
        if (i == 2) {
            this.f9485z0.m6608Z0();
        }
        m33391ai();
        if (i2 == 1) {
            m33336li();
            if (!this.f9480u0) {
                this.f9480u0 = true;
                this.f9485z0.m6597g0();
            }
        }
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null && i == 0 && ((LinearLayoutManager) chatsRecyclerView.getLayoutManager()).m39546a2() == this.f9485z0.mo6153D() - 1) {
            mo14166A0();
        }
    }

    public void m33452Lj(View view) {
        int id2 = view.getId();
        if (id2 == R.id.btn_archive) {
            View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(this.f30165a, this.f30167b);
            o4Var.m33354hk(new C2813h(C7317b.f23225b).m33264c(true));
            C2760nb nbVar = this.f9455B0;
            if (nbVar != null) {
                nbVar.m9291ac(o4Var);
            }
        } else if (id2 == R.id.btn_invite) {
            this.f30167b.m2946A4().m1370u0(mo4347s(), true, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33456Kj();
                }
            });
        }
    }

    public void m33449Mi(long j, boolean z) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14186W1(j, z);
        }
    }

    public void m33448Mj(C10327b bVar, boolean z) {
        if (!m9347Sa() && !bVar.m5416b()) {
            m9300Z9().m9402Kd(this.f9472S0.m21496p());
            m33309qk();
            if (z) {
                this.f9471R0.remove(bVar);
            }
        }
    }

    public void m33445Ni(TdApi.Chat chat, int i, int i2, C10930q6.C10937g gVar) {
        this.f9484y0.m14191R1(this.f9485z0.m6581s0(chat, i, i2, gVar));
    }

    public void m33444Nj(C10327b bVar, TdApi.Chat chat) {
        if (!m9347Sa() && !bVar.m5416b() && this.f9472S0.m21503h(chat.f25367id) < 0) {
            m33369ek(chat, false);
        }
    }

    public void m33441Oi(long j, TdApi.ChatPermissions chatPermissions) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14185X1(j, chatPermissions);
        }
    }

    public void m33440Oj(AbstractC5912d dVar, final C10327b bVar, final TdApi.Chat chat) {
        if (m33376di(chat) != null && dVar.mo1511a(chat)) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33444Nj(bVar, chat);
                }
            });
        }
    }

    public void m33437Pi(long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14184Y1(j, chatPhotoInfo);
        }
    }

    public void m33433Qi(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14183Z1(j, chatPosition, z, z2, z3);
            if (chatPosition.order == 0) {
                m33406Xh(j);
            }
        }
    }

    public void m33432Qj(final AbstractC5917i iVar, final boolean z) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                AbstractC5917i.this.mo1322a(z);
            }
        });
    }

    public void m33429Ri(long j, long j2, int i) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14182a2(j, j2, i);
        }
    }

    public void m33428Rj() {
        if (!m9347Sa()) {
            this.f9484y0.m14161J1();
            this.f9485z0.m39312I(0);
            this.f9484y0.m14162I1();
        }
    }

    public void m33425Si(long j, long j2) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14181b2(j, j2);
        }
    }

    public void m33421Ti(TdApi.Chat chat, int i, C10930q6.C10937g gVar) {
        this.f9484y0.m14191R1(this.f9485z0.m6628G0(chat, i, gVar));
    }

    public void m33417Ui(long j, String str) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14179d2(j, str);
        }
    }

    public void m33413Vi(long j, TdApi.Message message) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14178e2(j, message);
        }
    }

    public void m33409Wi(long j, int i) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14177f2(j, i);
        }
    }

    public void m33405Xi(TdApi.Chat chat) {
        if (!m9347Sa() && m9339Ta()) {
            m33394Zj(chat);
        }
    }

    public boolean m33390aj(final C3950k kVar, final float f, Object obj) {
        View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(mo4347s(), this.f30167b);
        o4Var.m33354hk(new C2813h(C7317b.f23225b).m33264c(true));
        o4Var.m9248gd(new Runnable() {
            @Override
            public final void run() {
                C3950k.this.m29544i(f);
            }
        });
        o4Var.m9162t9();
        mo4347s().m14552P1().m9719h0(o4Var);
        return true;
    }

    public void m33385bj(C4592b3 b3Var) {
        m33374dk(b3Var, true);
    }

    public void m33380cj(CustomRecyclerView customRecyclerView, int i, int i2, int i3, int i4) {
        if (i4 != i2 && this.f9485z0.m6587m0() && this.f9464K0 && this.f9485z0.mo6153D() > 0) {
            C9906c cVar = this.f9485z0;
            cVar.m39312I(cVar.mo6153D() - 1);
        }
    }

    public void m33375dj() {
        this.f9460G0 = true;
        m33391ai();
        m9204n9();
    }

    public void m33370ej() {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33375dj();
            }
        });
    }

    public static void m33365fj(View view, Rect rect) {
        ((C9903a) view).getAvatarReceiver().mo20248a1(rect);
    }

    public void m33360gj(C4592b3 b3Var) {
        m33374dk(b3Var, true);
    }

    public void m33355hj(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9472S0.m21496p(); i3++) {
            TdApi.Chat q = this.f9472S0.m21495q(i3);
            if (!this.f30167b.m2443g7(q.f25367id)) {
                if (i == -1) {
                    TdApi.ChatNotificationSettings chatNotificationSettings = q.notificationSettings;
                    chatNotificationSettings.useDefaultMuteFor = true;
                    this.f30167b.m2763Lb(q.f25367id, chatNotificationSettings);
                } else {
                    this.f30167b.m2486dc(q.f25367id, i);
                }
                i2++;
            }
        }
        C1379j0.m37290z0(C4403w.m27844o2(R.string.MutedXChats, i2), 0);
        m33399Yj();
    }

    public static boolean m33350ij(AbstractC5919k kVar, View view, int i) {
        kVar.mo3250a(i == R.id.btn_menu_resetToDefault ? -1 : HandlerC10770jj.m3563i3(i));
        return true;
    }

    public void m33345jj() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f9472S0.m21496p(); i3++) {
            TdApi.Chat q = this.f9472S0.m21495q(i3);
            if (!this.f30167b.m2443g7(q.f25367id)) {
                if (this.f30167b.m2271r3(q) > 0) {
                    i2++;
                }
                if (this.f30167b.m2407ib(q).muteFor > 0) {
                    i++;
                }
                this.f30167b.m2486dc(q.f25367id, 0);
            }
        }
        C1379j0.m37290z0(C4403w.m27844o2(i > 0 ? R.string.NotificationsOnXChats : R.string.UnmutedXChats, i2), 0);
        m33399Yj();
    }

    public static boolean m33340kj(Runnable runnable, View view, int i) {
        if (i != R.id.btn_unmute) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void m33335lj(AtomicInteger atomicInteger, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727 && atomicInteger.decrementAndGet() == 0) {
            this.f30167b.m2485dd().post(new RunnableC2736n1(this));
        }
    }

    public boolean m33330mj(boolean z, View view, int i) {
        if (i != R.id.btn_pinUnpinChat) {
            return true;
        }
        if (z) {
            int p = this.f9472S0.m21496p();
            for (int i2 = 0; i2 < this.f9472S0.m21496p(); i2++) {
                if (!C7317b.m17037g(this.f9472S0.m21495q(i2), this.f9457D0)) {
                    p--;
                }
            }
            final AtomicInteger atomicInteger = new AtomicInteger(p);
            Client.AbstractC7865g f4Var = new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2805o4.this.m33335lj(atomicInteger, object);
                }
            };
            for (int i3 = 0; i3 < this.f9472S0.m21496p(); i3++) {
                long j = this.f9472S0.m21501j(i3);
                if (C7317b.m17037g(this.f9472S0.m21495q(i3), this.f9457D0)) {
                    this.f30167b.m2270r4().m14783o(new TdApi.ToggleChatIsPinned(this.f9457D0, j, false), f4Var);
                }
            }
            return true;
        }
        List<Long> O5 = this.f30167b.m2721O5(this.f9457D0);
        C6035e<TdApi.Chat> eVar = this.f9472S0;
        TdApi.Chat[] chatArr = (TdApi.Chat[]) C5062b.m24167e(eVar, new TdApi.Chat[eVar.m21496p()]);
        C7321e.m16926n1(chatArr, this.f9457D0);
        for (TdApi.Chat chat : chatArr) {
            if (!C7317b.m17037g(chat, this.f9457D0)) {
                O5.add(Long.valueOf(chat.f25367id));
            }
        }
        m33389ak(new TdApi.SetPinnedChats(this.f9457D0, C5062b.m24168d(O5)));
        return true;
    }

    public void m33325nj(long j, long j2, TdApi.MessageContent messageContent) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14175h2(j, j2, messageContent);
        }
    }

    public void m33320oj(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14174i2(j, j2, messageInteractionInfo);
        }
    }

    public void m33315pj(long j, long j2) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14190S1(j, j2, true);
        }
    }

    public void m33310qj(long j, long j2) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14190S1(j, j2, false);
        }
    }

    public void m33305rj(TdApi.Message message, long j) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14173j2(message, j);
        }
    }

    public void m33301sj(long j, long[] jArr) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14172k2(j, jArr);
        }
    }

    public void m33297tj(int i, int i2) {
        if (i != 0) {
            C1379j0.m37290z0(C4403w.m27844o2(i, i2), 0);
        }
        m33399Yj();
    }

    public void m33294ui(AtomicInteger atomicInteger, boolean z, int i) {
        if (atomicInteger.decrementAndGet() == 0) {
            C1379j0.m37290z0(C4403w.m27844o2(z ? R.string.ClearedXHistories : R.string.DeletedXChats, i), 0);
            m33399Yj();
        }
    }

    public void m33293uj(AtomicInteger atomicInteger, Runnable runnable) {
        if (atomicInteger.decrementAndGet() == 0) {
            this.f30167b.m2485dd().post(runnable);
        }
    }

    public boolean m33290vi(final boolean z, boolean z2, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        final int p = this.f9472S0.m21496p();
        final AtomicInteger atomicInteger = new AtomicInteger(p);
        Runnable x2Var = new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33294ui(atomicInteger, z, p);
            }
        };
        for (int i2 = 0; i2 < p; i2++) {
            this.f30167b.m2786K4(this.f9472S0.m21501j(i2), z2, x2Var);
        }
        return true;
    }

    public static void m33289vj(Runnable runnable, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -722616727) {
            runnable.run();
        }
    }

    public void m33286wi(String str, final boolean z, final boolean z2) {
        String i1 = C4403w.m27869i1(R.string.NoUndoWarn);
        int[] iArr = {R.id.btn_delete, R.id.btn_cancel};
        String[] strArr = {str, C4403w.m27869i1(R.string.Cancel)};
        int[] iArr2 = {2, 1};
        int[] iArr3 = new int[2];
        iArr3[0] = z ? R.drawable.templarian_baseline_broom_24 : R.drawable.baseline_delete_24;
        iArr3[1] = R.drawable.baseline_cancel_24;
        m9261ee(i1, iArr, strArr, iArr2, iArr3, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean vi;
                vi = View$OnClickListenerC2805o4.this.m33290vi(z, z2, view, i);
                return vi;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23934b(this, i);
            }
        });
    }

    public boolean m33285wj(boolean z, final Runnable runnable, View view, int i) {
        if (i != R.id.btn_archiveUnarchiveChat) {
            return true;
        }
        TdApi.ChatList chatListMain = z ? new TdApi.ChatListMain() : new TdApi.ChatListArchive();
        for (int i2 = 0; i2 < this.f9472S0.m21496p(); i2++) {
            this.f30167b.m2270r4().m14783o(new TdApi.AddChatToList(this.f9472S0.m21501j(i2), chatListMain), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2805o4.m33289vj(runnable, object);
                }
            });
        }
        return true;
    }

    public static void m33282xi(AbstractC5917i iVar, int i, SparseIntArray sparseIntArray) {
        iVar.mo1322a(sparseIntArray.get(R.id.btn_clearChatHistory) == R.id.btn_clearChatHistory);
    }

    public boolean m33281xj(Runnable runnable, View view, int i) {
        if (i == R.id.btn_unblockSender || i == R.id.btn_blockSender) {
            for (int p = this.f9472S0.m21496p() - 1; p >= 0; p--) {
                long j = this.f9472S0.m21501j(p);
                C10930q6 q6Var = this.f30167b;
                q6Var.m2496d2(q6Var.m2183wb(j), i == R.id.btn_blockSender, this.f30167b.m2376ka(runnable));
            }
        }
        return true;
    }

    public static boolean m33278yi(AbstractC5917i iVar, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        iVar.mo1322a(false);
        return true;
    }

    public static boolean m33277yj(TdApi.Chat chat) {
        return true;
    }

    public boolean m33274zi(TdApi.Chat chat) {
        return this.f30167b.m2443g7(chat.f25367id);
    }

    public static boolean m33273zj(TdApi.Chat chat) {
        return chat.unreadCount > 0 || chat.isMarkedAsUnread;
    }

    @Override
    public void mo14166A0() {
        C10846m8 m8Var = this.f9463J0;
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        m8Var.m3045B(chatsRecyclerView != null ? chatsRecyclerView.getLoadCount() : 40, null);
    }

    @Override
    public void mo4077A1(C10930q6 q6Var, long j, boolean z) {
        if (this.f30167b.m2188w6() == q6Var.m2188w6() && j == 1) {
            m33344jk(z);
        }
    }

    @Override
    public int mo408A9() {
        return m33331mi() ? 2 : 3;
    }

    @Override
    public void mo9477Ac() {
        View$OnClickListenerC9170d1 d1Var;
        super.mo9477Ac();
        if (m33331mi() && (d1Var = this.f30156R) != null) {
            d1Var.m10063d4(mo418W9());
        }
        m33400Yi(this.f30167b.m2142z4());
        m33309qk();
    }

    @Override
    public void mo1557B0(final TdApi.SecretChat secretChat) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33476Fj(secretChat);
            }
        });
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public void mo3249D2(final TdApi.NotificationSettingsScope notificationSettingsScope, final TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33484Dj(notificationSettingsScope, scopeNotificationSettings);
            }
        });
    }

    @Override
    public boolean mo1350D3() {
        return C11165z7.m1323a(this);
    }

    @Override
    public void mo4051E2(TdApi.Message message) {
        C10722i1.m4158n(this, message);
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        C10791k1.m3309b(this, notificationSettingsScope);
    }

    @Override
    public boolean mo21728G(C5974t0 t0Var, boolean z, boolean z2) {
        if (this.f9484y0 == null) {
            return false;
        }
        C2760nb nbVar = this.f9455B0;
        if (nbVar != null) {
            if (!nbVar.m9339Ta()) {
                return false;
            }
        } else if (!m9339Ta()) {
            return false;
        }
        if (this.f9485z0.m6591j0().isEmpty() || ((LinearLayoutManager) this.f9484y0.getLayoutManager()).m39549X1() != 0 || !z2) {
            return false;
        }
        m33364fk(2, true);
        return true;
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public View mo8868Ga() {
        return this.f9484y0;
    }

    @Override
    public boolean mo9431Ge() {
        return true;
    }

    @Override
    public void mo4050H(final long j, final long[] jArr) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33301sj(j, jArr);
            }
        });
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo8829I() {
        ChatsRecyclerView chatsRecyclerView;
        int i;
        C5974t0 t0Var;
        C9906c cVar = this.f9485z0;
        if (cVar != null && cVar.m6586n0() && (chatsRecyclerView = this.f9484y0) != null) {
            chatsRecyclerView.m39496D1();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9484y0.getLayoutManager();
            int k0 = this.f9485z0.m6589k0(true, null);
            int r1 = C9903a.m6642r1(C4868i.m24726c2().m24584u0());
            int X1 = linearLayoutManager.m39549X1();
            if (X1 != -1) {
                int i2 = r1 * X1;
                int D = this.f9485z0.mo6153D() - 1;
                if (!this.f9485z0.m6587m0() || D <= 1 || X1 <= 0) {
                    i = X1;
                } else {
                    i = X1 - 1;
                    C5974t0 t0Var2 = this.f9462I0;
                    i2 += (t0Var2 == null || !t0Var2.m21732w()) ? C1357a0.m37541i(12.0f) : C5974t0.m21735t() + C1357a0.m37541i(1.0f);
                    k0--;
                    D--;
                }
                if (!this.f9485z0.m6587m0() && (t0Var = this.f9462I0) != null && t0Var.m21732w() && X1 >= m33351ii()) {
                    i2 += C5974t0.m21735t();
                }
                if (k0 != 0 && D > k0 && X1 > k0) {
                    i--;
                    i2 += C1357a0.m37541i(12.0f);
                }
                int x = i2 + (i * C1357a0.m37526x());
                if (this.f9485z0.m6587m0() && this.f9464K0) {
                    C5974t0 t0Var3 = this.f9462I0;
                    x -= r1 + ((t0Var3 == null || !t0Var3.m21732w()) ? C1357a0.m37541i(12.0f) : C1357a0.m37541i(1.0f));
                }
                View C = linearLayoutManager.mo39262C(X1);
                if (C != null) {
                    x -= linearLayoutManager.m39231U(C);
                }
                this.f9484y0.mo8024v1(0, -x);
            }
        }
    }

    @Override
    public C6957m1.AbstractC6962e mo9611I4(View view, C6957m1.C6963f fVar, C5320c cVar, C5320c cVar2, C5146u0 u0Var, AbstractC9323v4<?> v4Var) {
        final C4592b3 chat = view instanceof C9903a ? ((C9903a) view).getChat() : null;
        if (chat == null || !chat.m27138h0()) {
            View$OnClickListenerC6902i iVar = (View$OnClickListenerC6902i) view;
            return this.f30167b.m2485dd().m3773N2(this, iVar.getPreviewChatList(), iVar.getPreviewChatId(), null, cVar, cVar2, u0Var, m33341ki() == 0, m33418Uh(chat), m33326ni(chat), new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33385bj(chat);
                }
            });
        }
        C10930q6 q6Var = this.f30167b;
        TdApi.ChatListArchive chatListArchive = C7317b.f23225b;
        if (q6Var.m2252s6(chatListArchive)) {
            cVar.m23284a(R.id.btn_markChatAsRead);
            u0Var.m23816a(R.string.ArchiveRead);
            cVar2.m23284a(R.drawable.baseline_done_all_24);
        }
        boolean V = this.f30167b.m2294pc().m4135V();
        cVar.m23284a(R.id.btn_pinUnpinChat);
        if (V) {
            cVar2.m23284a(R.drawable.deproko_baseline_pin_24);
            u0Var.m23816a(R.string.ArchivePin);
        } else {
            cVar2.m23284a(R.drawable.baseline_arrow_upward_24);
            u0Var.m23816a(R.string.ArchiveHide);
        }
        fVar.m18329Q(this.f30167b);
        fVar.m18334L(null, new C4587b(C9239m.getBaseAvatarRadiusDp(), new C4587b.C4588a((int) R.id.theme_color_avatarArchive, (int) R.drawable.baseline_archive_24), null));
        fVar.m18335K(C4403w.m27869i1(R.string.ArchiveTitle), C4403w.m27844o2(R.string.xChats, this.f30167b.m2460f6(chatListArchive)));
        fVar.m18332N(new C6957m1.AbstractC6964g() {
            @Override
            public final boolean mo18302a(C3950k kVar, float f, Object obj) {
                boolean aj;
                aj = View$OnClickListenerC2805o4.this.m33390aj(kVar, f, obj);
                return aj;
            }
        });
        return new C2810e();
    }

    @Override
    public void mo3013I5(C10684g8 g8Var, final int i, final int i2) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33453Li(i, i2);
            }
        });
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            C1399s0.m37171l0(chatsRecyclerView);
            this.f9485z0.m6577x0();
        }
    }

    @Override
    public void mo419J(int i, View view) {
        C5320c cVar;
        int i2;
        int i3;
        CharSequence charSequence;
        int i4 = 0;
        switch (i) {
            case R.id.menu_btn_clear:
                m9341T8();
                return;
            case R.id.menu_btn_delete:
                m33438Ph(false);
                return;
            case R.id.menu_btn_more:
                C5320c cVar2 = new C5320c(2);
                C5146u0 u0Var = new C5146u0(2);
                C5320c cVar3 = new C5320c(2);
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i4 < this.f9472S0.m21496p()) {
                    TdApi.Chat q = this.f9472S0.m21495q(i4);
                    if (this.f30167b.m2368l2(m33410Wh(), q)) {
                        if (C7317b.m17038f(q)) {
                            i6++;
                        } else {
                            i5++;
                        }
                    }
                    cVar3 = cVar3;
                    i6 = i6;
                    if (!this.f30167b.m2443g7(q.f25367id) && this.f30167b.m2304p2(q)) {
                        i7++;
                    }
                    if (this.f30167b.m2932B2(q)) {
                        i8++;
                    } else {
                        i9++;
                    }
                    if (this.f30167b.m2884E2(q)) {
                        i10++;
                    }
                    if (this.f30167b.m2447g3(q)) {
                        i12++;
                    } else {
                        i11++;
                    }
                    i4++;
                }
                C5320c cVar4 = cVar3;
                if (this.f9472S0.m21496p() < this.f30167b.m2189w5(m33410Wh()).f33873a) {
                    cVar2.m23284a(R.id.more_btn_selectAll);
                    u0Var.m23816a(R.string.SelectMore);
                    cVar = cVar4;
                    cVar.m23284a(R.drawable.baseline_playlist_add_check_24);
                } else {
                    cVar = cVar4;
                }
                if (i5 + i6 > 0) {
                    cVar2.m23284a(R.id.more_btn_archiveUnarchive);
                    u0Var.m23816a(i6 > 0 ? R.string.Unarchive : R.string.Archive);
                    cVar.m23284a(i6 > 0 ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24);
                }
                if (i8 > 0) {
                    cVar2.m23284a(R.id.more_btn_markAsRead);
                    u0Var.m23816a(R.string.MarkAsRead);
                    cVar.m23284a(R.drawable.baseline_done_all_24);
                } else if (i9 > 0) {
                    cVar2.m23284a(R.id.more_btn_markAsUnread);
                    u0Var.m23816a(R.string.MarkAsUnread);
                    cVar.m23284a(R.drawable.baseline_unsubscribe_24);
                }
                if (i10 == this.f9472S0.m21496p()) {
                    cVar2.m23284a(R.id.more_btn_report);
                    u0Var.m23816a(R.string.Report);
                    cVar.m23284a(R.drawable.baseline_report_24);
                }
                if (i12 > 0) {
                    cVar2.m23284a(R.id.more_btn_unblock);
                    u0Var.m23816a(R.string.Unblock);
                    cVar.m23284a(R.drawable.baseline_block_24);
                } else if (i11 == this.f9472S0.m21496p()) {
                    cVar2.m23284a(R.id.more_btn_block);
                    u0Var.m23816a(R.string.BlockContact);
                    cVar.m23284a(R.drawable.baseline_block_24);
                }
                if (i7 == this.f9472S0.m21496p()) {
                    cVar2.m23284a(R.id.more_btn_clearHistory);
                    u0Var.m23816a(R.string.ClearHistory);
                    cVar.m23284a(R.drawable.baseline_delete_24);
                }
                cVar2.m23284a(R.id.more_btn_clearCache);
                u0Var.m23816a(R.string.DeleteChatCache);
                cVar.m23284a(R.drawable.templarian_baseline_broom_24);
                m9300Z9().m9296Zd(cVar2.m23280e(), u0Var.m23813d(), cVar.m23280e());
                return;
            case R.id.menu_btn_muteUnmute:
                int Sh = m33426Sh();
                if (Sh == 1) {
                    SparseIntArray sparseIntArray = new SparseIntArray(3);
                    int i13 = 0;
                    boolean z = false;
                    for (int i14 = 0; i14 < this.f9472S0.m21496p(); i14++) {
                        TdApi.Chat q2 = this.f9472S0.m21495q(i14);
                        if (!this.f30167b.m2443g7(q2.f25367id)) {
                            i13++;
                            TdApi.ScopeNotificationSettings ib = this.f30167b.m2407ib(q2);
                            sparseIntArray.put(ib.getConstructor(), sparseIntArray.get(ib.getConstructor()) + 1);
                            if (!z && this.f30167b.m2440ga().m3240B(q2.f25367id, true)) {
                                z = true;
                            }
                        }
                    }
                    int[] iArr = null;
                    TdApi.ScopeNotificationSettings jb = sparseIntArray.size() == 3 ? this.f30167b.m2391jb(C7321e.m16946h(sparseIntArray.keyAt(0))) : null;
                    final AbstractC5919k c4Var = new AbstractC5919k() {
                        @Override
                        public final void mo3250a(int i15) {
                            View$OnClickListenerC2805o4.this.m33355hj(i15);
                        }
                    };
                    C5320c cVar5 = new C5320c(3);
                    C5320c cVar6 = new C5320c(3);
                    C5320c cVar7 = z ? new C5320c(3) : null;
                    C5146u0 u0Var2 = new C5146u0(3);
                    if (jb == null || !C4779t2.m25464n3(jb.muteFor)) {
                        i4 = 1;
                    }
                    HandlerC10770jj.m3653Z2(cVar5, cVar6, u0Var2, cVar7, false, i4, true, false, false, jb != null ? HandlerC10770jj.m3493p3(jb.muteFor, true) : null, z);
                    CharSequence q22 = C4403w.m27836q2(R.string.MuteXChats, i13);
                    int[] e = cVar5.m23280e();
                    String[] d = u0Var2.m23813d();
                    if (cVar7 != null) {
                        iArr = cVar7.m23280e();
                    }
                    m9261ee(q22, e, d, iArr, cVar6.m23280e(), new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i15) {
                            boolean ij;
                            ij = View$OnClickListenerC2805o4.m33350ij(AbstractC5919k.this, view2, i15);
                            return ij;
                        }

                        @Override
                        public boolean mo492Q() {
                            return C5115g0.m23935a(this);
                        }

                        @Override
                        public Object mo491b2(int i15) {
                            return C5115g0.m23934b(this, i15);
                        }
                    });
                    return;
                } else if (Sh == 2 || Sh == 3) {
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 0; i18 < this.f9472S0.m21496p(); i18++) {
                        TdApi.Chat q3 = this.f9472S0.m21495q(i18);
                        if (!this.f30167b.m2443g7(q3.f25367id)) {
                            if (this.f30167b.m2271r3(q3) > 0) {
                                i16++;
                            }
                            int i19 = this.f30167b.m2407ib(q3).muteFor;
                            if (i19 > 0) {
                                i17 = i15 == 0 ? i19 : Math.min(i19, i17);
                                i15++;
                            }
                        }
                    }
                    final Runnable s1Var = new Runnable() {
                        @Override
                        public final void run() {
                            View$OnClickListenerC2805o4.this.m33345jj();
                        }
                    };
                    if (i15 > 0) {
                        m9261ee(C4403w.m27865j1(this.f9472S0.m21496p() > i15 ? R.string.NotificationsEnableOverride3 : R.string.NotificationsEnableOverride2, C4403w.m27909Z1(HandlerC10770jj.m3503o3(i17))), new int[]{R.id.btn_unmute, R.id.btn_cancel}, new String[]{C4403w.m27844o2(R.string.EnableNotifications2, i16), C4403w.m27869i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_notifications_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i20) {
                                boolean kj;
                                kj = View$OnClickListenerC2805o4.m33340kj(s1Var, view2, i20);
                                return kj;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i20) {
                                return C5115g0.m23934b(this, i20);
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
                int Th = m33422Th();
                long j = 0;
                if (Th != 0) {
                    i3 = 0;
                    i2 = 0;
                    for (int i20 = 0; i20 < this.f9472S0.m21496p(); i20++) {
                        if (Th != 3 || !C7317b.m17037g(this.f9472S0.m21495q(i20), this.f9457D0)) {
                            j = this.f9472S0.m21501j(i20);
                            if (C7316a.m17051j(j)) {
                                i2++;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                int i21 = i3 + i2;
                if (i21 == 1 && this.f30167b.m2143z3(this.f9457D0, j)) {
                    this.f30167b.m2485dd().m3798K7(this, m33410Wh(), this.f9472S0.m21501j(0), null, R.id.btn_pinUnpinChat, new RunnableC2736n1(this));
                    return;
                } else if (i3 > 0 || i2 > 0) {
                    final boolean z2 = Th == 1;
                    int Ga = m33410Wh().getConstructor() == -400991316 ? this.f30167b.m2844Ga() : this.f30167b.m2860Fa();
                    int l0 = this.f9485z0.m6588l0(false);
                    int l02 = this.f9485z0.m6588l0(true);
                    if (z2 || (l0 + i3 <= Ga && l02 + i2 <= Ga)) {
                        if (i21 == 1) {
                            charSequence = this.f30167b.m2691Q3(j);
                        } else {
                            charSequence = C4403w.m27836q2(z2 ? R.string.UnpinXChats : R.string.PinXChats, i21);
                        }
                        int[] iArr2 = {R.id.btn_pinUnpinChat, R.id.btn_cancel};
                        String[] strArr = new String[2];
                        strArr[0] = C4403w.m27869i1(z2 ? R.string.UnpinFromTop : R.string.PinToTop);
                        strArr[1] = C4403w.m27869i1(R.string.Cancel);
                        int[] iArr3 = new int[2];
                        iArr3[0] = z2 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24;
                        iArr3[1] = R.drawable.baseline_cancel_24;
                        m9261ee(charSequence, iArr2, strArr, null, iArr3, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i22) {
                                boolean mj;
                                mj = View$OnClickListenerC2805o4.this.m33330mj(z2, view2, i22);
                                return mj;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i22) {
                                return C5115g0.m23934b(this, i22);
                            }
                        });
                        return;
                    }
                    this.f30165a.m14584H3().m8985g(view).m8958i(m9300Z9()).m8951q(R.drawable.baseline_error_24).m8971D(this.f30167b, m33410Wh().getConstructor() == -400991316 ? C4403w.m27836q2(R.string.PinTooMuchWarn, Ga) : C4403w.m27844o2(R.string.ErrorPinnedChatsLimit, Ga));
                    return;
                } else {
                    return;
                }
            case R.id.menu_btn_search:
                m9303Yc();
                return;
            default:
                return;
        }
    }

    @Override
    public boolean mo18487J1(View$OnClickListenerC6902i iVar, float f, float f2) {
        RecyclerView.AbstractC0886d0 l0;
        if (iVar instanceof C9903a) {
            C9903a aVar = (C9903a) iVar;
            if (aVar.m6664C0(f, f2)) {
                C4592b3 chat = aVar.getChat();
                if (this.f9484y0 != null && chat.m27123n0() && this.f9485z0.m6599f0() && (l0 = this.f9484y0.m39418l0(iVar)) != null) {
                    iVar.m18508R(f, f2);
                    this.f30165a.m14478j1(true);
                    this.f9461H0.m38815H(l0);
                    C9357x2.C9370l lVar = this.f9478Y0;
                    if (lVar != null) {
                        lVar.m8920E(true);
                    }
                    this.f9478Y0 = this.f30165a.m14584H3().m8985g(iVar).m8958i(m9300Z9()).m8948u(C2566j4.f8759a).m8972C(this.f30167b, R.string.DragChatsHint);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14167q2(j);
        }
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        m33400Yi(this.f30167b.m2142z4());
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14176g2(C4403w.m27981H1(i, i2));
        }
    }

    @Override
    public boolean mo9409Je() {
        return true;
    }

    @Override
    public void mo4072K3(final long j, final boolean z) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33461Ji(j, z);
            }
        });
    }

    @Override
    public void mo4071L0(long j, int i) {
        C10721i0.m4185l(this, j, i);
    }

    @Override
    public void mo21727L4(C5974t0 t0Var, boolean z, float f, boolean z2) {
        if (z2) {
            m33364fk(2, false);
        }
    }

    @Override
    public void mo8864N0(int i) {
        int i2;
        final int i3;
        final int i4;
        int i5;
        int i6 = 0;
        switch (i) {
            case R.id.more_btn_archiveUnarchive:
            case R.id.more_btn_block:
            case R.id.more_btn_markAsRead:
            case R.id.more_btn_markAsUnread:
            case R.id.more_btn_report:
            case R.id.more_btn_unblock:
                switch (i) {
                    case R.id.more_btn_archiveUnarchive:
                        i4 = m33410Wh().getConstructor() == 362770115 ? R.string.UnarchivedXChats : R.string.ArchivedXChats;
                        i3 = m33341ki();
                        i2 = 0;
                        break;
                    case R.id.more_btn_block:
                    case R.id.more_btn_unblock:
                        HashSet hashSet = new HashSet();
                        i2 = 0;
                        for (int i7 = 0; i7 < this.f9472S0.m21496p(); i7++) {
                            long e4 = this.f30167b.m2478e4(this.f9472S0.m21495q(i7));
                            hashSet.add(Long.valueOf(e4));
                            if (this.f30167b.m2480e2().m1567z2(e4)) {
                                i2++;
                            }
                        }
                        int size = hashSet.size();
                        i4 = size == i2 ? i == R.id.more_btn_unblock ? R.string.UnblockedXBots : R.string.BlockedXBots : i == R.id.more_btn_unblock ? R.string.UnblockedXUsers : R.string.BlockedXUsers;
                        i3 = size;
                        break;
                    case R.id.more_btn_markAsRead:
                        i4 = R.string.ReadAllChatsDone;
                        i3 = m33341ki();
                        i2 = 0;
                        break;
                    case R.id.more_btn_markAsUnread:
                        i4 = R.string.MarkedXChats;
                        i3 = m33341ki();
                        i2 = 0;
                        break;
                    case R.id.more_btn_report:
                        i3 = m33341ki();
                        i4 = 0;
                        i2 = 0;
                        break;
                    default:
                        return;
                }
                final Runnable x1Var = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2805o4.this.m33297tj(i4, i3);
                    }
                };
                if (i3 == 1) {
                    switch (i) {
                        case R.id.more_btn_archiveUnarchive:
                            i5 = R.id.btn_archiveUnarchiveChat;
                            break;
                        case R.id.more_btn_markAsRead:
                            i5 = R.id.btn_markChatAsRead;
                            break;
                        case R.id.more_btn_markAsUnread:
                            i5 = R.id.btn_markChatAsUnread;
                            break;
                        case R.id.more_btn_report:
                            HandlerC10770jj.m3708T7(m9300Z9(), this.f9472S0.m21501j(0), null, x1Var, null);
                            return;
                        default:
                            i5 = 0;
                            break;
                    }
                    if (i5 != 0) {
                        this.f30167b.m2485dd().m3798K7(this, m33410Wh(), this.f9472S0.m21501j(0), null, i5, x1Var);
                        return;
                    }
                }
                final AtomicInteger atomicInteger = new AtomicInteger(this.f9472S0.m21496p());
                final Runnable w2Var = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2805o4.this.m33293uj(atomicInteger, x1Var);
                    }
                };
                switch (i) {
                    case R.id.more_btn_archiveUnarchive:
                        final boolean z = m33410Wh().getConstructor() == 362770115;
                        CharSequence q2 = C4403w.m27836q2(z ? R.string.UnarchiveXChats : R.string.ArchiveXChats, this.f9472S0.m21496p());
                        int[] iArr = {R.id.btn_archiveUnarchiveChat, R.id.btn_cancel};
                        String[] strArr = new String[2];
                        strArr[0] = C4403w.m27869i1(z ? R.string.Unarchive : R.string.Archive);
                        strArr[1] = C4403w.m27869i1(R.string.Cancel);
                        int[] iArr2 = new int[2];
                        iArr2[0] = z ? R.drawable.baseline_unarchive_24 : R.drawable.baseline_archive_24;
                        iArr2[1] = R.drawable.baseline_cancel_24;
                        m9261ee(q2, iArr, strArr, null, iArr2, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view, int i8) {
                                boolean wj;
                                wj = View$OnClickListenerC2805o4.this.m33285wj(z, w2Var, view, i8);
                                return wj;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i8) {
                                return C5115g0.m23934b(this, i8);
                            }
                        });
                        return;
                    case R.id.more_btn_block:
                    case R.id.more_btn_unblock:
                        if (i == R.id.more_btn_unblock) {
                            for (int p = this.f9472S0.m21496p() - 1; p >= 0; p--) {
                                long j = this.f9472S0.m21501j(p);
                                C10930q6 q6Var = this.f30167b;
                                q6Var.m2496d2(q6Var.m2183wb(j), false, this.f30167b.m2392ja());
                            }
                            return;
                        }
                        m9261ee(C4403w.m27836q2(i2 == i3 ? R.string.BlockXBots : R.string.BlockXUsers, i3), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.BlockContact), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view, int i8) {
                                boolean xj;
                                xj = View$OnClickListenerC2805o4.this.m33281xj(w2Var, view, i8);
                                return xj;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i8) {
                                return C5115g0.m23934b(this, i8);
                            }
                        });
                        return;
                    case R.id.more_btn_report:
                        HandlerC10770jj.m3688V7(m9300Z9(), C5062b.m24150v(this.f9472S0), x1Var);
                        return;
                }
                while (i6 < this.f9472S0.m21496p()) {
                    switch (i) {
                        case R.id.more_btn_markAsRead:
                            this.f30167b.m2733N9(this.f9472S0.m21501j(i6), 0L, w2Var);
                            break;
                        case R.id.more_btn_markAsUnread:
                            this.f30167b.m2717O9(this.f9472S0.m21495q(i6), w2Var);
                            break;
                    }
                    i6++;
                }
                return;
            case R.id.more_btn_clearCache:
                m9261ee(C4403w.m27836q2(R.string.ClearXChats, this.f9472S0.m21496p()), new int[]{R.id.btn_clearCache, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.DeleteChatCache), C4403w.m27869i1(R.string.Cancel)}, null, new int[]{R.drawable.templarian_baseline_broom_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i8) {
                        boolean Cj;
                        Cj = View$OnClickListenerC2805o4.this.m33488Cj(view, i8);
                        return Cj;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i8) {
                        return C5115g0.m23934b(this, i8);
                    }
                });
                return;
            case R.id.more_btn_clearHistory:
                m33438Ph(true);
                return;
            case R.id.more_btn_selectAll:
                int i8 = 0;
                while (i6 < this.f9472S0.m21496p()) {
                    if (this.f30167b.m2932B2(this.f9472S0.m21495q(i6))) {
                        i8++;
                    }
                    i6++;
                }
                C5320c cVar = new C5320c(3);
                C5146u0 u0Var = new C5146u0(3);
                C5320c cVar2 = new C5320c(3);
                cVar.m23284a(R.id.btn_selectAll);
                u0Var.m23816a(R.string.SelectAll);
                cVar2.m23284a(R.drawable.baseline_playlist_add_check_24);
                if (i8 == this.f9472S0.m21496p() && i8 < this.f30167b.m2189w5(m33410Wh()).f33874b) {
                    cVar.m23284a(R.id.btn_selectUnread);
                    u0Var.m23816a(R.string.SelectUnread);
                    cVar2.m23284a(R.drawable.baseline_unsubscribe_24);
                }
                cVar.m23284a(R.id.btn_selectMuted);
                u0Var.m23816a(R.string.SelectMuted);
                cVar2.m23284a(R.drawable.baseline_notifications_off_24);
                m9261ee(C4403w.m27869i1(R.string.SelectMore), cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i9) {
                        boolean Aj;
                        Aj = View$OnClickListenerC2805o4.this.m33496Aj(view, i9);
                        return Aj;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i9) {
                        return C5115g0.m23934b(this, i9);
                    }
                });
                return;
            default:
                return;
        }
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33464Ij(user);
            }
        });
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        RecyclerView recyclerView;
        if (i == 0 && (recyclerView = this.f9474U0) != null) {
            recyclerView.setAlpha(f);
        }
    }

    public final void m33438Ph(final boolean z) {
        TdApi.SecretChat X3;
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < this.f9472S0.m21496p(); i2++) {
            if (this.f30167b.m2542a3(this.f9472S0.m21495q(i2))) {
                i++;
                j = this.f9472S0.m21501j(i2);
            }
        }
        if (i == 1) {
            this.f30167b.m2485dd().m3798K7(this, m33410Wh(), j, null, z ? R.id.btn_clearChatHistory : R.id.btn_removeChatFromList, new RunnableC2736n1(this));
            return;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f9472S0.m21496p(); i9++) {
            TdApi.Chat q = this.f9472S0.m21495q(i9);
            if (this.f30167b.m2542a3(q)) {
                i3++;
                if (this.f30167b.m2836H2(q.f25367id)) {
                    i7++;
                }
                if (!z && C7316a.m17051j(q.f25367id) && (X3 = this.f30167b.m2586X3(q.f25367id)) != null && X3.state.getConstructor() != -1945106707) {
                    i8++;
                }
                TdApi.ChatMemberStatus K3 = this.f30167b.m2787K3(q.f25367id);
                if (K3 != null && C4779t2.m25679H2(K3)) {
                    i6++;
                }
                if (!this.f30167b.m2171x7(q) && !this.f30167b.m2883E3(q.f25367id)) {
                    if (this.f30167b.m2752M6(q)) {
                        i4++;
                    } else {
                        i5++;
                    }
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C4403w.m27836q2(z ? R.string.ClearXHistoriesConfirm : R.string.DeleteXChatsConfirm, i3));
        int i10 = i4 + i5;
        if (i10 + i6 > 0 || (!z && i8 > 0)) {
            spannableStringBuilder.append((CharSequence) "\n");
            if (i6 > 0) {
                spannableStringBuilder.append((CharSequence) "\n").append(C4403w.m27836q2(R.string.LosingXAdminRights, i6));
            }
            if (i10 > 0) {
                spannableStringBuilder.append((CharSequence) "\n").append(C4403w.m27836q2(i4 == 0 ? R.string.LeaveXPrivateGroup : i5 == 0 ? R.string.LeaveXPrivateChannel : R.string.LeaveXChats, i10));
            }
            if (!z && i8 > 0) {
                spannableStringBuilder.append((CharSequence) "\n").append(C4403w.m27836q2(R.string.ClosingXSecretChats, i8));
            }
        }
        final String o2 = C4403w.m27844o2(z ? R.string.ClearXHistories : R.string.DeleteXChats, this.f9472S0.m21496p());
        final AbstractC5917i w3Var = new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z2) {
                View$OnClickListenerC2805o4.this.m33286wi(o2, z, z2);
            }
        };
        if (i7 > 0) {
            m9206me(new C9188f2(R.id.btn_removeChatFromList).m10010c(false).m10011b(spannableStringBuilder).m9997p(new C2964ra[]{new C2964ra(12, (int) R.id.btn_clearChatHistory, 0, C4403w.m27836q2(R.string.RevokeForX, i7), (int) R.id.btn_clearChatHistory, false)}).m9996q(R.id.theme_color_textNegative).m9995r(z ? R.string.ClearHistoryBtn : R.string.Delete).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i11, SparseIntArray sparseIntArray) {
                    View$OnClickListenerC2805o4.m33282xi(AbstractC5917i.this, i11, sparseIntArray);
                }
            }));
        } else {
            m9261ee(spannableStringBuilder, new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{o2, C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.templarian_baseline_broom_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i11) {
                    boolean yi;
                    yi = View$OnClickListenerC2805o4.m33278yi(AbstractC5917i.this, view, i11);
                    return yi;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i11) {
                    return C5115g0.m23934b(this, i11);
                }
            });
        }
    }

    @Override
    public boolean mo9575Qf(View view, C4601c3 c3Var) {
        m33412Vj(this.f30167b.m2632U2(c3Var.m27051a()));
        return true;
    }

    public int m33434Qh() {
        C5974t0 t0Var;
        int k0 = this.f9485z0.m6589k0(true, null);
        int r1 = C9903a.m6642r1(C4868i.m24726c2().m24584u0());
        int D = this.f9485z0.mo6153D() - 1;
        int i = r1 * D;
        if (this.f9485z0.m6587m0() && D > 1) {
            D--;
            C5974t0 t0Var2 = this.f9462I0;
            i += (t0Var2 == null || !t0Var2.m21732w()) ? C1357a0.m37541i(12.0f) : C5974t0.m21735t() + C1357a0.m37541i(1.0f);
            k0--;
        }
        int i2 = D;
        if (!this.f9485z0.m6587m0() && (t0Var = this.f9462I0) != null && t0Var.m21732w()) {
            i += C5974t0.m21735t();
        }
        if (k0 != 0 && D > k0) {
            i2--;
            i += C1357a0.m37541i(12.0f);
        }
        int x = i + (i2 * C1357a0.m37526x());
        if (this.f9485z0.m6587m0() && this.f9464K0) {
            C5974t0 t0Var3 = this.f9462I0;
            x -= r1 + ((t0Var3 == null || !t0Var3.m21732w()) ? C1357a0.m37541i(12.0f) : C1357a0.m37541i(1.0f));
        }
        return x + C2139ap.m35479W(42);
    }

    @Override
    public void mo4070R1(final long j, final boolean z) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33449Mi(j, z);
            }
        });
    }

    @Override
    public void mo4048R3(final long j, final long j2) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33310qj(j, j2);
            }
        });
    }

    @Override
    public int mo407R9() {
        return R.id.controller_chats;
    }

    public final int m33430Rh() {
        AbstractC5912d<TdApi.Chat> n3Var = new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean zi;
                zi = View$OnClickListenerC2805o4.this.m33274zi((TdApi.Chat) obj);
                return zi;
            }
        };
        final C10930q6 q6Var = this.f30167b;
        Objects.requireNonNull(q6Var);
        return m33371ei(n3Var, new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                return C10930q6.this.m2542a3((TdApi.Chat) obj);
            }
        });
    }

    @Override
    public void mo2963S(TdApi.ChatList chatList, int i, int i2) {
        C10882o0.m2965b(this, chatList, i, i2);
    }

    @Override
    public void mo21726S1(C5974t0 t0Var, boolean z, boolean z2) {
        if (this.f9484y0 != null && !this.f9485z0.m6591j0().isEmpty()) {
            int ii = m33351ii();
            this.f9485z0.m39312I(ii);
            if (ii > 0) {
                this.f9485z0.m39312I(ii - 1);
            }
            if (this.f9485z0.m6587m0() && this.f9464K0) {
                C9906c cVar = this.f9485z0;
                cVar.m39312I(cVar.mo6153D() - 1);
            }
        }
    }

    public final int m33426Sh() {
        final C10930q6 q6Var = this.f30167b;
        Objects.requireNonNull(q6Var);
        return m33371ei(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                return C10930q6.this.m2207v3((TdApi.Chat) obj);
            }
        }, new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean Ai;
                Ai = View$OnClickListenerC2805o4.this.m33497Ai((TdApi.Chat) obj);
                return Ai;
            }
        });
    }

    public C10846m8 m33424Sj() {
        if (this.f9463J0 == null) {
            this.f9463J0 = new C10846m8(this.f30167b, m33410Wh(), this.f9481v0, false);
        }
        return this.f9463J0;
    }

    @Override
    public void mo4047T0(final long j, final long j2, final TdApi.MessageInteractionInfo messageInteractionInfo) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33320oj(j, j2, messageInteractionInfo);
            }
        });
    }

    @Override
    public void mo3012T1(C10684g8 g8Var, final TdApi.Chat chat, final int i, final C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33481Ei(chat, i, gVar);
            }
        });
    }

    public final int m33422Th() {
        return m33371ei(new AbstractC5912d() {
            @Override
            public final boolean mo1511a(Object obj) {
                boolean Bi;
                Bi = View$OnClickListenerC2805o4.this.m33493Bi((TdApi.Chat) obj);
                return Bi;
            }
        }, null);
    }

    public final CharSequence m33420Tj() {
        long[] M = this.f30167b.m2946A4().m1425M();
        int I = this.f30167b.m2946A4().m1429I();
        if (I == 1) {
            return C4403w.m27853m1(R.string.ContactsOnTelegramSingle, this.f30167b.m2480e2().m1721K2(M[0]));
        }
        if (I == 2) {
            return C4403w.m27853m1(R.string.ContactsOnTelegramSeveral, this.f30167b.m2480e2().m1749D2(M[0]), this.f30167b.m2480e2().m1749D2(M[1]));
        }
        if (I == 3) {
            return C4403w.m27853m1(R.string.ContactsOnTelegramSeveral, C1363c0.m37453U(C4403w.m27854m0(), this.f30167b.m2480e2().m1749D2(M[0]), this.f30167b.m2480e2().m1749D2(M[1])), this.f30167b.m2480e2().m1749D2(M[2]));
        }
        if (I == 4) {
            return C4403w.m27853m1(R.string.ContactsOnTelegramSeveral, C1363c0.m37453U(C4403w.m27854m0(), this.f30167b.m2480e2().m1749D2(M[0]), this.f30167b.m2480e2().m1749D2(M[1]), this.f30167b.m2480e2().m1749D2(M[2])), this.f30167b.m2480e2().m1749D2(M[3]));
        }
        if (I >= 5) {
            return C4403w.m27848n2(R.string.ContactsOnTelegramMany, I - 3, C4403w.m27843p(), C1363c0.m37453U(C4403w.m27854m0(), this.f30167b.m2480e2().m1749D2(M[0]), this.f30167b.m2480e2().m1749D2(M[1]), this.f30167b.m2480e2().m1749D2(M[2])));
        }
        return null;
    }

    public boolean m33418Uh(C4592b3 b3Var) {
        return b3Var != null && !b3Var.m27138h0() && this.f30167b.m2542a3(b3Var.m27099w());
    }

    public boolean m33416Uj() {
        C5974t0 t0Var;
        return (this.f9484y0 == null || (t0Var = this.f9462I0) == null || !t0Var.m21732w()) ? false : true;
    }

    @Override
    public void mo4046V(long j, long j2) {
        C10722i1.m4166f(this, j, j2);
    }

    @Override
    public void mo4045V1(long j, long j2, boolean z) {
        C10722i1.m4164h(this, j, j2, z);
    }

    @Override
    public void mo4069V5(final long j, final long j2, final int i, boolean z) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33429Ri(j, j2, i);
            }
        });
    }

    public final void m33414Vh() {
        List<C10327b> list = this.f9471R0;
        if (list != null) {
            for (C10327b bVar : list) {
                bVar.m5417a();
            }
            this.f9471R0.clear();
        }
    }

    public final void m33412Vj(final TdApi.Chat chat) {
        if (this.f9456C0 == null) {
            m33394Zj(chat);
            return;
        }
        Runnable z2Var = new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33405Xi(chat);
            }
        };
        if (this.f9456C0.mo3379d(chat, z2Var)) {
            z2Var.run();
        }
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public void mo1566W2(final TdApi.BasicGroup basicGroup, boolean z) {
        if (!C4779t2.m25506h3(basicGroup.status)) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33485Di(basicGroup);
                }
            });
        }
    }

    @Override
    public int mo418W9() {
        return m33331mi() ? R.id.menu_passcode : R.id.menu_search;
    }

    public TdApi.ChatList m33410Wh() {
        if (this.f9457D0 == null) {
            this.f9457D0 = C7317b.f23224a;
        }
        return this.f9457D0;
    }

    public final void m33408Wj() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f9484y0.getLayoutManager();
        if (linearLayoutManager.m39549X1() == 0) {
            View C = linearLayoutManager.mo39262C(0);
            if (C != null) {
                int max = Math.max(0, linearLayoutManager.m39231U(C));
                this.f9484y0.mo8024v1(0, Math.max(0, linearLayoutManager.m39241O(C)) - max);
            }
            C2760nb nbVar = this.f9455B0;
            if (nbVar != null) {
                nbVar.m33569Vh(this);
                return;
            }
            return;
        }
        m33359gk(true);
    }

    @Override
    public void mo4044X1(final TdApi.Message message, final long j) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33305rj(message, j);
            }
        });
    }

    public final void m33406Xh(long j) {
        TdApi.Chat f;
        if (m33341ki() > 0 && (f = this.f9472S0.m21505f(j)) != null && !this.f30167b.m2542a3(f)) {
            m33369ek(f, true);
        }
    }

    public void m33404Xj(float f, float f2) {
        ChatsRecyclerView chatsRecyclerView;
        if (m33416Uj() && (chatsRecyclerView = this.f9484y0) != null) {
            RecyclerView.AbstractC0902p layoutManager = chatsRecyclerView.getLayoutManager();
            View C = layoutManager.mo39262C(m33351ii());
            int top = C != null ? C.getTop() : 0;
            if (top > 0) {
                int U = layoutManager.m39231U(C);
                if ((C instanceof C9903a) && U < top && f2 < top) {
                    float f3 = U;
                    if (f2 >= f3) {
                        this.f9484y0.m39496D1();
                        this.f9462I0.m21767O(f, f2 - f3);
                    }
                }
            }
        }
    }

    @Override
    public void mo4067Y(final long j, final TdApi.Message message) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33413Vi(j, message);
            }
        });
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
        if (i == 0 && f == 0.0f) {
            m33386bi();
        }
    }

    public final void m33401Yh() {
        this.f9485z0.m6597g0();
        m33349ik(this.f9463J0.m3018v() && this.f9485z0.m6591j0().size() == 0);
    }

    public final void m33399Yj() {
        m9300Z9().m9212m8(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33472Gj();
            }
        });
    }

    @Override
    public void mo1359Z5(long[] jArr, int i, boolean z) {
        C3940f fVar;
        if (!m9347Sa()) {
            C2760nb nbVar = this.f9455B0;
            boolean z2 = nbVar != null && nbVar.m9339Ta() && (fVar = this.f9476W0) != null && fVar.m29584g() > 0.0f;
            m33391ai();
            if (this.f9475V0 != null) {
                AbstractRunnableC5910b bVar = this.f9477X0;
                if (bVar != null) {
                    bVar.m21857c();
                    this.f9477X0 = null;
                }
                if (!z2 || jArr == null || jArr.length <= 0 || !z) {
                    m33334lk(jArr, i, z2);
                    return;
                }
                C2812g gVar = new C2812g(jArr, i);
                this.f9477X0 = gVar;
                gVar.m21855e(C1379j0.m37313o());
                C1379j0.m37332e0(this.f9477X0, 1300L);
            }
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C5974t0 t0Var = this.f9462I0;
        if (t0Var != null) {
            t0Var.m21739o();
        }
        C10684g8 g8Var = this.f9466M0;
        if (g8Var != null) {
            g8Var.m4300M(this.f9467N0);
        }
        C9906c cVar = this.f9485z0;
        if (cVar != null) {
            for (C4592b3 b3Var : cVar.m6591j0()) {
                b3Var.mo4501a3();
            }
        }
        C4868i.m24726c2().m24867I3(this);
        this.f30167b.m2294pc().m4124e0(this);
        this.f30167b.m2781K9().m1826o0(this);
        this.f30167b.m2480e2().m1619m2(this);
        this.f9463J0.m3040G(this);
        C11052v1.m1768b().m1766d(this);
        this.f30167b.m2946A4().m1394i0(this);
    }

    public final void m33396Zh() {
        if (this.f9463J0.m3042E()) {
            m33319ok();
        } else {
            m33336li();
        }
    }

    public final void m33394Zj(TdApi.Chat chat) {
        HandlerC10770jj.C10780j jVar;
        AbstractC2815j jVar2 = this.f9456C0;
        Object c = jVar2 != null ? jVar2.mo3380c() : null;
        int F0 = C9678w2.m7805F0(this.f30167b.m2188w6(), chat, null);
        if (F0 != 0) {
            jVar = new HandlerC10770jj.C10780j().m3358r(c).m3372d(F0, C9678w2.m7801G0(this.f30167b.m2188w6(), chat, null, F0));
        } else {
            jVar = new HandlerC10770jj.C10780j().m3358r(c);
        }
        AbstractC2815j jVar3 = this.f9456C0;
        if (jVar3 != null) {
            jVar3.mo3382a(jVar);
        }
        if (m33410Wh().getConstructor() != -400991316) {
            jVar.m3368h();
        }
        this.f30167b.m2485dd().m3881C4(this, chat, jVar);
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    public void m33391ai() {
        m33396Zh();
        m33401Yh();
    }

    public final void m33389ak(TdApi.Function function) {
        this.f30167b.m2270r4().m14783o(function, new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC2805o4.this.m33460Jj(object);
            }
        });
    }

    public final void m33386bi() {
        RecyclerView recyclerView = this.f9474U0;
        if (recyclerView != null) {
            m9180qd(recyclerView);
            C1399s0.m37162q(this.f9474U0);
            this.f9482w0.removeView(this.f9474U0);
            this.f9475V0 = null;
            this.f9474U0 = null;
            AbstractRunnableC5910b bVar = this.f9477X0;
            if (bVar != null) {
                bVar.m21857c();
                this.f9477X0 = null;
            }
        }
    }

    public final void m33384bk() {
        if (this.f9474U0 == null) {
            this.f9475V0 = new C2546iq(this, new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    View$OnClickListenerC2805o4.this.m33452Lj(view);
                }
            }, this);
            ArrayList arrayList = new ArrayList(5);
            AbstractC10650f0 f0Var = this.f9481v0;
            if (f0Var != null) {
                arrayList.add(new C2964ra(24, 0, 0, f0Var.mo4378i3()));
            } else if (m33410Wh() instanceof TdApi.ChatListArchive) {
                arrayList.add(new C2964ra(24, 0, 0, R.string.NoArchive));
            } else {
                C10684g8 g8Var = this.f9466M0;
                if (g8Var == null || g8Var.m4301L() <= 0) {
                    int L = this.f30167b.m2946A4().m1426L();
                    arrayList.add(new C2964ra(72, (int) R.id.inviteFriendsText, (int) R.drawable.baseline_forum_96, m33420Tj(), false));
                    arrayList.add(new C2964ra(2));
                    arrayList.add(new C2964ra(20, R.id.btn_invite, 0, L > 0 ? R.string.ShowContacts : R.string.InviteContacts));
                    arrayList.add(new C2964ra(3));
                } else {
                    arrayList.add(new C2964ra(19, (int) R.id.changePhoneText, (int) R.drawable.baseline_archive_96, C4403w.m27982H0(this, R.string.OpenArchiveHint, new Object[0]), false));
                    arrayList.add(new C2964ra(2));
                    arrayList.add(new C2964ra(20, R.id.btn_archive, 0, R.string.OpenArchive));
                    arrayList.add(new C2964ra(3));
                }
            }
            this.f9475V0.m34116x2(arrayList, false);
            C2811f fVar = new C2811f(mo4347s());
            this.f9474U0 = fVar;
            fVar.setHasFixedSize(true);
            this.f9474U0.setAlpha(0.0f);
            this.f9474U0.setLayoutManager(new LinearLayoutManager(mo4347s(), 1, false));
            this.f9474U0.setAdapter(this.f9475V0);
            this.f9474U0.setBackgroundColor(C11524j.m199b());
            m9197o8(this.f9474U0, R.id.theme_color_background);
            this.f9474U0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            FrameLayoutFix frameLayoutFix = this.f9482w0;
            frameLayoutFix.addView(this.f9474U0, frameLayoutFix.indexOfChild(this.f9484y0) + 1);
        }
    }

    @Override
    public void mo4065c2(final long j, final TdApi.DraftMessage draftMessage) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33465Ii(j, draftMessage);
            }
        });
    }

    @Override
    public void mo4064c4(final long j, final TdApi.ChatPhotoInfo chatPhotoInfo) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33437Pi(j, chatPhotoInfo);
            }
        });
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    public final void m33381ci(List<C10846m8.C10848b> list) {
        int initialLoadCount = this.f9484y0.getInitialLoadCount();
        final ArrayList arrayList = new ArrayList(list.size());
        for (C10846m8.C10848b bVar : list) {
            initialLoadCount--;
            arrayList.add(new C4592b3(this, m33410Wh(), bVar.f34205a, initialLoadCount >= 0));
        }
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33489Ci(arrayList);
            }
        });
    }

    public final void m33379ck(final AbstractC5912d<TdApi.Chat> dVar, int i) {
        TdApi.Chat di;
        final C10327b bVar = new C10327b();
        Iterator<C4592b3> it = this.f9485z0.m6591j0().iterator();
        while (it.hasNext()) {
            C4592b3 next = it.next();
            if (m33418Uh(next) && (di = m33376di(next.m27099w())) != null && dVar.mo1511a(di)) {
                if (i > 0) {
                    i--;
                }
                if (this.f9472S0.m21503h(di.f25367id) < 0) {
                    m33369ek(di, false);
                }
            }
        }
        if (this.f9471R0 == null) {
            this.f9471R0 = new ArrayList();
        }
        this.f9471R0.add(bVar);
        final AbstractC5917i y3Var = new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                View$OnClickListenerC2805o4.this.m33448Mj(bVar, z);
            }
        };
        if (i > 0 || i == -1) {
            this.f30167b.m2237t5(this.f9457D0, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC2805o4.this.m33440Oj(dVar, bVar, (TdApi.Chat) obj);
                }
            }, new AbstractC5917i() {
                @Override
                public final void mo1322a(boolean z) {
                    View$OnClickListenerC2805o4.this.m33432Qj(y3Var, z);
                }
            }, true);
        } else {
            y3Var.mo1322a(true);
        }
    }

    @Override
    public void mo6904d6() {
        super.mo6904d6();
        C6977n2 n2Var = this.f9483x0;
        if (n2Var != null) {
            n2Var.mo8229b();
        }
    }

    @Override
    public boolean mo9270dc() {
        return !this.f9460G0;
    }

    @Override
    public boolean mo9269dd() {
        return true;
    }

    public TdApi.Chat m33376di(TdApi.Chat chat) {
        AbstractC10650f0 f0Var;
        if (chat == null || (((f0Var = this.f9481v0) != null && !f0Var.mo1511a(chat)) || C7317b.m17043a(chat, m33410Wh()) == null)) {
            return null;
        }
        return chat;
    }

    public final void m33374dk(C4592b3 b3Var, boolean z) {
        if (m33418Uh(b3Var)) {
            m33369ek(b3Var.m27099w(), z);
        }
    }

    @Override
    public void mo2996e0(final int i, int i2) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33400Yi(i);
            }
        });
    }

    @Override
    public void mo3011e4(C10684g8 g8Var, final TdApi.Chat chat, final int i, final C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33477Fi(chat, i, gVar);
            }
        });
    }

    @Override
    public void mo4063e7(long j, int i) {
        C10721i0.m4186k(this, j, i);
    }

    public final int m33371ei(AbstractC5912d<TdApi.Chat> dVar, AbstractC5912d<TdApi.Chat> dVar2) {
        C6035e<TdApi.Chat> eVar = this.f9472S0;
        if (eVar == null || eVar.m21496p() == 0) {
            return 0;
        }
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < this.f9472S0.m21496p(); i2++) {
            TdApi.Chat L3 = this.f30167b.m2771L3(this.f9472S0.m21501j(i2));
            if (dVar2 == null || dVar2.mo1511a(L3)) {
                boolean a = dVar.mo1511a(L3);
                if (i == 0) {
                    z = a;
                } else if (a != z) {
                    return 3;
                }
                i++;
            }
        }
        if (i == 0) {
            return 0;
        }
        return z ? 1 : 2;
    }

    public final void m33369ek(TdApi.Chat chat, boolean z) {
        C6035e<TdApi.Chat> eVar = this.f9472S0;
        int h = eVar != null ? eVar.m21503h(chat.f25367id) : -1;
        boolean z2 = h >= 0;
        if (this.f30167b.m2542a3(chat) || z2) {
            boolean z3 = !z2;
            if (z3) {
                if (this.f9472S0 == null) {
                    this.f9472S0 = new C6035e<>();
                }
                C6035e<TdApi.Chat> eVar2 = this.f9472S0;
                long j = chat.f25367id;
                eVar2.m21500k(j, this.f30167b.m2771L3(j));
                if (z) {
                    if (this.f9472S0.m21496p() == 1) {
                        m9300Z9().m9297Zc(1);
                    } else {
                        m9300Z9().m9402Kd(this.f9472S0.m21496p());
                    }
                    m33309qk();
                }
            } else {
                this.f9472S0.m21498n(h);
                if (z) {
                    if (this.f9472S0.m21496p() == 0) {
                        m9300Z9().m9307Y8();
                    } else {
                        m9300Z9().m9402Kd(this.f9472S0.m21496p());
                        m33309qk();
                    }
                }
            }
            ChatsRecyclerView chatsRecyclerView = this.f9484y0;
            if (chatsRecyclerView != null) {
                chatsRecyclerView.m14180c2(chat.f25367id, z3);
            }
        }
    }

    public AbstractC10650f0 m33366fi() {
        return this.f9481v0;
    }

    public final void m33364fk(int i, boolean z) {
        int h;
        int i2;
        if (!m9347Sa() && this.f9484y0 != null && (i2 = this.f9469P0) != (h = C5063c.m24138h(this.f9469P0, i, z))) {
            boolean z2 = true;
            boolean z3 = i2 != 0;
            if (h == 0) {
                z2 = false;
            }
            this.f9469P0 = h;
            if (z3 == z2) {
                return;
            }
            if (z2) {
                if (this.f9470Q0 == null) {
                    this.f9470Q0 = new C2809d(C2057b.f7280b, 180L);
                }
                this.f9484y0.setItemAnimator(this.f9470Q0);
                return;
            }
            this.f9484y0.setItemAnimator(null);
        }
    }

    @Override
    public void mo3010g1(C10684g8 g8Var, TdApi.Chat chat, int i) {
        C10676g0.m4335d(this, g8Var, chat, i);
    }

    @Override
    public void mo452g2() {
        ChatsRecyclerView chatsRecyclerView = this.f9484y0;
        if (chatsRecyclerView != null) {
            chatsRecyclerView.m14164G1();
        }
    }

    @Override
    public int mo9250ga() {
        return R.id.theme_color_filling;
    }

    public final int m33361gi() {
        AbstractC2815j jVar = this.f9456C0;
        if (jVar != null) {
            return jVar.mo3381b();
        }
        return this.f9481v0 != null ? R.string.Chats : m33410Wh().getConstructor() != 362770115 ? R.string.general_Messages : R.string.ArchiveTitle;
    }

    public final void m33359gk(boolean z) {
        if (this.f9465L0 == z) {
            return;
        }
        if (this.f9484y0 == null) {
            this.f9465L0 = z;
            return;
        }
        this.f9465L0 = z;
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33428Rj();
            }
        });
    }

    @Override
    public void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        C11111x7.m1522a(this, j, supergroupFullInfo);
    }

    @Override
    public void mo4062h1(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        C10721i0.m4184m(this, j, chatJoinRequestsInfo);
    }

    public final String m33356hi() {
        return C4403w.m27869i1(m33361gi());
    }

    public void m33354hk(C2813h hVar) {
        super.m9476Ad(hVar);
        if (this.f9463J0 != null) {
            throw new IllegalStateException();
        } else if (hVar == null) {
            this.f9454A0 = null;
            this.f9481v0 = null;
            this.f9456C0 = null;
            this.f9457D0 = C7317b.f23224a;
            this.f9458E0 = false;
        } else {
            this.f9481v0 = hVar.f9497a;
            this.f9456C0 = hVar.f9498b;
            TdApi.ChatList chatList = hVar.f9499c;
            if (chatList == null) {
                chatList = C7317b.f23224a;
            }
            this.f9457D0 = chatList;
            this.f9458E0 = hVar.f9501e;
        }
    }

    @Override
    public void mo3009i(C10684g8 g8Var, final int i) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33457Ki(i);
            }
        });
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        C11090w7.m1524a(this, j, basicGroupFullInfo);
    }

    @Override
    public void mo4061i5(final long j, final String str) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33417Ui(j, str);
            }
        });
    }

    @Override
    public int mo9237ia() {
        return R.id.theme_color_headerLightIcon;
    }

    public int m33351ii() {
        return this.f9485z0.m6587m0() ? 1 : 0;
    }

    public final void m33349ik(boolean z) {
        C2760nb nbVar;
        if (this.f9473T0 != z) {
            this.f9473T0 = z;
            if (this.f9476W0 == null) {
                this.f9476W0 = new C3940f(0, this, C2057b.f7280b, 180L, !z);
            }
            if (z) {
                m33384bk();
                C2760nb nbVar2 = this.f9455B0;
                if (nbVar2 != null) {
                    nbVar2.m33569Vh(this);
                }
            }
            ChatsRecyclerView chatsRecyclerView = this.f9484y0;
            this.f9476W0.m29575p(z, chatsRecyclerView != null && Math.max(chatsRecyclerView.getMeasuredWidth(), this.f9484y0.getMeasuredHeight()) > 0 && this.f9459F0 != 0 && SystemClock.uptimeMillis() - this.f9459F0 >= 600 && ((nbVar = this.f9455B0) == null ? m9339Ta() : nbVar.m9339Ta()));
        }
    }

    public C2760nb m33346ji() {
        return this.f9455B0;
    }

    public final void m33344jk(boolean z) {
        if (this.f9466M0 != null && this.f9464K0 != z) {
            this.f9464K0 = z;
            if (this.f9484y0 != null) {
                C9906c cVar = this.f9485z0;
                cVar.m39312I(cVar.mo6153D() - 1);
                if (z) {
                    m33408Wj();
                }
            }
        }
    }

    @Override
    public void mo4042k5(TdApi.Message message, long j, int i, String str) {
        C10722i1.m4162j(this, message, j, i, str);
    }

    public final int m33341ki() {
        C6035e<TdApi.Chat> eVar = this.f9472S0;
        if (eVar != null) {
            return eVar.m21496p();
        }
        return 0;
    }

    public View$OnClickListenerC2805o4 m33339kk(C2760nb nbVar) {
        this.f9455B0 = nbVar;
        return this;
    }

    @Override
    public void mo4041l0(final long j, final long j2, final TdApi.MessageContent messageContent) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33325nj(j, j2, messageContent);
            }
        });
    }

    @Override
    public void mo3247l4(final long j, final TdApi.ChatNotificationSettings chatNotificationSettings) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33480Ej(j, chatNotificationSettings);
            }
        });
    }

    @Override
    public void mo24540l5(int i) {
        C9906c cVar = this.f9485z0;
        if (cVar != null) {
            cVar.m6595h0();
        }
    }

    @Override
    public boolean mo9547lf(TdApi.Chat chat) {
        AbstractC10650f0 f0Var;
        return chat != null && ((f0Var = this.f9481v0) == null || !f0Var.mo4377k6() || this.f9481v0.mo1511a(chat)) && C7317b.m17043a(chat, m33410Wh()) != null;
    }

    public void m33336li() {
        C6977n2 n2Var = this.f9483x0;
        if (n2Var != null && this.f9479t0) {
            this.f9479t0 = false;
            this.f9482w0.removeView(n2Var);
            this.f9483x0.mo4501a3();
            this.f9483x0 = null;
        }
        m33329mk();
    }

    public final void m33334lk(long[] jArr, int i, boolean z) {
        int N0 = this.f9475V0.m34224N0(R.id.inviteFriendsText);
        if (N0 != -1) {
            C2964ra raVar = this.f9475V0.m34240F0().get(N0);
            CharSequence Tj = m33420Tj();
            View C = this.f9474U0.getLayoutManager().mo39262C(N0);
            if (Tj != null && !Tj.equals(raVar.m32824u())) {
                raVar.m32853X(Tj);
                this.f9475V0.m34124u3(N0);
            }
            if (C != null) {
                ((C7023s1) ((ViewGroup) ((ViewGroup) C).getChildAt(0)).getChildAt(0)).m18075i(jArr, i, z);
            }
        }
        int N02 = this.f9475V0.m34224N0(R.id.btn_invite);
        if (N02 != -1) {
            C2964ra raVar2 = this.f9475V0.m34240F0().get(N02);
            int i2 = i > 0 ? R.string.ShowContacts : R.string.InviteContacts;
            if (raVar2.m32822w() != i2) {
                raVar2.m32854W(i2);
                this.f9475V0.m34124u3(N02);
            }
        }
    }

    @Override
    public void mo4060m0(final long j, final int i, boolean z) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33409Wi(j, i);
            }
        });
    }

    @Override
    public void mo2995m3(TdApi.NetworkType networkType) {
        C10838m0.m3048b(this, networkType);
    }

    @Override
    public void mo3008m5(C10684g8 g8Var, final TdApi.Chat chat, final int i, final C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33421Ti(chat, i, gVar);
            }
        });
    }

    public final boolean m33331mi() {
        return this.f9456C0 == null && ((m9139w9() != null && m9139w9().f9500d) || m33410Wh().getConstructor() == -400991316);
    }

    public final void m33329mk() {
        CharSequence charSequenceExtra;
        Intent intent = this.f9454A0;
        if (intent != null && !this.f9479t0) {
            this.f9454A0 = null;
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
                        x00 x00Var = new x00(this.f30165a, this.f30167b);
                        x00Var.m30994Vi(new x00.C3281m(trim));
                        x00Var.m30960ej();
                    }
                }
            }
        }
    }

    @Override
    public RecyclerView mo8809n2() {
        return this.f9484y0;
    }

    @Override
    public void mo2962n4(TdApi.ChatList chatList, boolean z, int i, int i2, int i3) {
        if (i == 0 && chatList.getConstructor() != -400991316 && C7321e.m17015C(this.f9457D0, chatList)) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33469Hi();
                }
            });
        }
    }

    @Override
    public void mo3007n7(C10684g8 g8Var, final TdApi.Chat chat, final int i, final int i2, final C10930q6.C10937g gVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33445Ni(chat, i, i2, gVar);
            }
        });
    }

    public boolean m33326ni(C4592b3 b3Var) {
        C6035e<TdApi.Chat> eVar;
        return m33418Uh(b3Var) && (eVar = this.f9472S0) != null && eVar.m21503h(b3Var.m27096x()) >= 0;
    }

    public final boolean m33324nk(int i) {
        return (i == 0 || i == 3) ? false : true;
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        C6977n2 n2Var = this.f9483x0;
        if (n2Var != null) {
            n2Var.mo8225f();
        }
    }

    @Override
    public View mo403oc(Context context) {
        m33424Sj();
        m33400Yi(this.f30167b.m2142z4());
        C9261p pVar = new C9261p(context);
        this.f9482w0 = pVar;
        pVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        ChatsRecyclerView chatsRecyclerView = (ChatsRecyclerView) C1399s0.m37146y(mo4347s(), R.layout.recycler_chats, this.f9482w0);
        this.f9484y0 = chatsRecyclerView;
        chatsRecyclerView.setMeasureListener(new CustomRecyclerView.AbstractC7920a() {
            @Override
            public final void mo14159a(CustomRecyclerView customRecyclerView, int i, int i2, int i3, int i4) {
                View$OnClickListenerC2805o4.this.m33380cj(customRecyclerView, i, i2, i3, i4);
            }
        });
        this.f9484y0.setItemAnimator(null);
        boolean z = false;
        if (m9332Ua()) {
            this.f9484y0.setVerticalScrollBarEnabled(false);
        }
        this.f9484y0.setHasFixedSize(true);
        this.f9484y0.m39434g(new C2814i(this));
        C10192g.m5782i(this.f9484y0, R.id.theme_color_filling, this);
        C0962g gVar = new C0962g(new C2806a());
        this.f9461H0 = gVar;
        gVar.m38809m(this.f9484y0);
        this.f9485z0 = this.f9484y0.m14192Q1(this, this);
        this.f9484y0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        AbstractC10650f0 f0Var = this.f9481v0;
        if (f0Var != null) {
            this.f9484y0.setTotalRes(f0Var.mo4379Q3());
        }
        this.f9482w0.addView(this.f9484y0);
        C1399s0.m37171l0(this.f9484y0);
        m33396Zh();
        if (!m33331mi()) {
            m9542qf(this.f9482w0);
        }
        m33400Yi(this.f30167b.m2142z4());
        this.f30167b.m2781K9().m1882a0(this);
        this.f30167b.m2480e2().m1668Z1(this);
        C4868i.m24726c2().m24657l(this);
        C11052v1.m1768b().m1769a(this);
        this.f9463J0.m3019u(this, new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC2805o4.this.m33381ci((List) obj);
            }
        }, this.f9484y0.getInitialLoadCount(), new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33370ej();
            }
        });
        if (m33331mi()) {
            this.f30167b.m2946A4().m1371u(this);
            if (this.f9481v0 == null && m33410Wh().getConstructor() == -400991316) {
                this.f9484y0.m39422k(new C2807b());
                boolean V = this.f30167b.m2294pc().m4135V();
                this.f9465L0 = V;
                this.f9464K0 = V;
                this.f9466M0 = this.f30167b.m2367l3(C7317b.f23225b);
                this.f9467N0 = new C2808c();
                C9906c cVar = this.f9485z0;
                if (this.f9466M0.m4301L() > 0) {
                    z = true;
                }
                cVar.m6626I0(z);
                this.f9466M0.m4302K(this.f9467N0);
                this.f9466M0.m4309D(null, 3, null);
                this.f30167b.m2294pc().m4121g(this);
            }
        }
        if (this.f9481v0 == null) {
            C5974t0 t0Var = new C5974t0(this.f30165a, this.f30167b, 0L, 0L, this.f9484y0, true, this);
            this.f9462I0 = t0Var;
            t0Var.m21733v();
        }
        this.f9459F0 = SystemClock.uptimeMillis();
        return this.f9482w0;
    }

    public boolean m33321oi() {
        return this.f9463J0.m3018v();
    }

    public void m33319ok() {
        if (!this.f9479t0) {
            if (this.f9483x0 == null) {
                C6977n2 n2Var = new C6977n2(mo4347s());
                this.f9483x0 = n2Var;
                n2Var.m18226h(1.0f);
                this.f9483x0.setLayoutParams(FrameLayoutFix.m18007t1(C1357a0.m37541i(48.0f), C1357a0.m37541i(48.0f), 17));
            }
            if (this.f9483x0.getParent() == null) {
                this.f9482w0.addView(this.f9483x0);
            }
            this.f9479t0 = true;
        }
    }

    @Override
    public void onClick(View view) {
        C4592b3 chat;
        if (view.getId() != R.id.chat || (chat = ((C9903a) view).getChat()) == null) {
            return;
        }
        if (m33326ni(chat) || m33341ki() > 0) {
            m33374dk(chat, true);
        } else if (chat.m27138h0()) {
            View$OnClickListenerC2805o4 o4Var = new View$OnClickListenerC2805o4(this.f30165a, this.f30167b);
            o4Var.m33354hk(new C2813h(new TdApi.ChatListArchive()).m33264c(true));
            this.f30165a.m14552P1().m9719h0(o4Var);
        } else {
            m33412Vj(chat.m27099w());
        }
    }

    @Override
    public boolean onLongClick(View view) {
        final C4592b3 chat;
        if (view.getId() != R.id.chat || (chat = ((C9903a) view).getChat()) == null) {
            return false;
        }
        if (!chat.m27138h0()) {
            this.f30167b.m2485dd().m3468r8(this, m33410Wh(), chat.m27096x(), null, m33418Uh(chat), m33326ni(chat), new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33360gj(chat);
                }
            });
            return true;
        } else if (m33341ki() != 0) {
            return true;
        } else {
            this.f30167b.m2485dd().m3508n8(this, this.f30167b.m2367l3(C7317b.f23225b));
            return true;
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        switch (i) {
            case R.id.menu_chatBulkActions:
                int wa = m9138wa();
                int Th = m33422Th();
                boolean z = true;
                int i2 = 8;
                d1Var.m10104N1(linearLayout, R.id.menu_btn_pinUnpin, Th == 1 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24, wa, this, C1357a0.m37541i(52.0f)).setVisibility(m33324nk(Th) ? 0 : 8);
                int Sh = m33426Sh();
                d1Var.m10104N1(linearLayout, R.id.menu_btn_muteUnmute, Sh == 1 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24, wa, this, C1357a0.m37541i(52.0f)).setVisibility(Sh != 0 ? 0 : 8);
                int Rh = m33430Rh();
                C9310u0 U1 = d1Var.m10087U1(linearLayout, this, wa);
                if (Rh == 0 || Rh == 3) {
                    z = false;
                }
                if (z) {
                    i2 = 0;
                }
                U1.setVisibility(i2);
                d1Var.m10065d2(linearLayout, this, m9138wa());
                return;
            case R.id.menu_clear:
                d1Var.m10096Q1(linearLayout, mo9237ia(), m9265ea());
                return;
            case R.id.menu_passcode:
                if (m33331mi()) {
                    d1Var.m10071a2(linearLayout);
                }
                d1Var.m10054i2(linearLayout, this);
                return;
            case R.id.menu_search:
                d1Var.m10054i2(linearLayout, this);
                return;
            default:
                return;
        }
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    public boolean m33316pi() {
        return this.f9481v0 != null;
    }

    public void m33400Yi(int i) {
        if (i == 0) {
            m33329mk();
            m9424Hd(m33356hi());
            return;
        }
        m9432Gd(HandlerC10770jj.m3707T8(i));
    }

    @Override
    public boolean mo14165q1() {
        return this.f9463J0.m3024p();
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    public boolean m33311qi() {
        return this.f9480u0;
    }

    public final void m33309qk() {
        C9270q1 bc = m9300Z9().m9284bc();
        View$OnClickListenerC9170d1 I = bc != null ? bc.m9757I() : null;
        if (I != null) {
            int Th = m33422Th();
            int i = 8;
            boolean z = true;
            I.m10097P3(R.id.menu_chatBulkActions, R.id.menu_btn_pinUnpin, m33324nk(Th) ? 0 : 8, Th == 1 ? R.drawable.deproko_baseline_pin_undo_24 : R.drawable.deproko_baseline_pin_24);
            int Sh = m33426Sh();
            I.m10097P3(R.id.menu_chatBulkActions, R.id.menu_btn_muteUnmute, Sh != 0 ? 0 : 8, Sh == 1 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_24);
            int Rh = m33430Rh();
            if (Rh == 0 || Rh == 3) {
                z = false;
            }
            if (z) {
                i = 0;
            }
            I.m10097P3(R.id.menu_chatBulkActions, R.id.menu_btn_delete, i, 0);
        }
    }

    @Override
    public void mo4039r5(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        C10722i1.m4169c(this, j, j2, i, replyMarkup);
    }

    public boolean m33306ri() {
        return this.f9459F0 == 0 || SystemClock.uptimeMillis() - this.f9459F0 <= 1000;
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4251s3(final long j, final long j2) {
        this.f30167b.m2469ed(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33315pj(j, j2);
            }
        });
    }

    @Override
    public void mo4057s4(final long j, final String str) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33473Gi(j, str);
            }
        });
    }

    public boolean m33302si() {
        return this.f9456C0 != null;
    }

    @Override
    public void mo1555t0(final TdApi.Supergroup supergroup) {
        if (!C4779t2.m25506h3(supergroup.status)) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2805o4.this.m33468Hj(supergroup);
                }
            });
        }
    }

    @Override
    public void mo4056t7(final long j, final TdApi.ChatPermissions chatPermissions) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33441Oi(j, chatPermissions);
            }
        });
    }

    public boolean m33298ti() {
        C9906c cVar;
        return this.f9464K0 && (cVar = this.f9485z0) != null && cVar.m6587m0() && ((LinearLayoutManager) this.f9484y0.getLayoutManager()).m39549X1() == 0;
    }

    @Override
    public void mo1358u1(int i, ArrayList<C11134y8.C11144i> arrayList, int i2) {
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo8837u5(int i) {
        m33414Vh();
        if (this.f9472S0 != null) {
            while (this.f9472S0.m21496p() > 0) {
                m33369ek(this.f9472S0.m21495q(0), false);
            }
        }
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        C11133y7.m1438a(this, j, userFullInfo);
    }

    @Override
    public TdApi.ChatList mo9538uf() {
        TdApi.ChatList Wh = m33410Wh();
        if (Wh instanceof TdApi.ChatListMain) {
            return null;
        }
        return Wh;
    }

    @Override
    public void mo18296v2(C6957m1.C6963f fVar) {
        fVar.m18333M(true);
    }

    @Override
    public int mo9537vf() {
        AbstractC10650f0 f0Var = this.f9481v0;
        if (f0Var == null || !f0Var.mo4377k6()) {
            return m33410Wh().getConstructor() == 362770115 ? R.string.MessagesArchive : super.mo9537vf();
        }
        return this.f9481v0.mo4380L(m33410Wh().getConstructor() == 362770115);
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo4053w6(final long j, final TdApi.ChatPosition chatPosition, final boolean z, final boolean z2, final boolean z3) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33433Qi(j, chatPosition, z, z2, z3);
            }
        });
    }

    @Override
    public boolean mo9136wc(boolean z) {
        return super.mo9136wc(z);
    }

    @Override
    public int mo9536wf() {
        return this.f9458E0 ? 11 : 9;
    }

    @Override
    public void mo3246x1(long j) {
        C10791k1.m3310a(this, j);
    }

    @Override
    public int mo8831xa() {
        return R.id.menu_chatBulkActions;
    }

    @Override
    public void mo4052y1(final long j, final long j2) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2805o4.this.m33425Si(j, j2);
            }
        });
    }

    @Override
    public void mo8830yc() {
        super.mo8830yc();
        m33414Vh();
    }

    @Override
    public void mo3245z0() {
        C10791k1.m3308c(this);
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }

    @Override
    public View mo9533zf() {
        return this.f9484y0;
    }

    public static class C2813h {
        public AbstractC10650f0 f9497a;
        public AbstractC2815j f9498b;
        public TdApi.ChatList f9499c;
        public boolean f9500d;
        public boolean f9501e;

        public C2813h(AbstractC10650f0 f0Var) {
            this.f9497a = f0Var;
        }

        public C2813h m33266a(TdApi.ChatList chatList) {
            this.f9499c = chatList;
            return this;
        }

        public C2813h m33265b(boolean z) {
            this.f9500d = z;
            return this;
        }

        public C2813h m33264c(boolean z) {
            this.f9501e = z;
            return this;
        }

        public C2813h(TdApi.ChatList chatList) {
            this.f9499c = chatList;
        }

        public C2813h(AbstractC2815j jVar) {
            this.f9498b = jVar;
        }

        public C2813h(AbstractC10650f0 f0Var, AbstractC2815j jVar) {
            this.f9497a = f0Var;
            this.f9498b = jVar;
        }
    }
}
