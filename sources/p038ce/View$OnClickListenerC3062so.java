package p038ce;

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
import be.C1357a0;
import be.C1379j0;
import be.C1399s0;
import be.C1405v;
import be.C1408x;
import be.C1410y;
import gd.AbstractC4761s4;
import gd.C4601c3;
import gd.C4618d7;
import gd.C4737p7;
import gd.C4779t2;
import ge.C4868i;
import ge.C4896n;
import id.C5337d;
import ie.C5428t;
import ie.C5459x0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.C6851c0;
import me.C6852c1;
import me.C6857d;
import me.C6879f3;
import me.C6919i4;
import me.C6942k3;
import me.C6977n2;
import me.C6981o;
import me.C6982o0;
import me.C7045v2;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p037cb.C2057b;
import p038ce.C2700m6;
import p038ce.C2820o9;
import p038ce.C3034s5;
import p038ce.RunnableC2374f5;
import p038ce.View$OnClickListenerC2192bl;
import p038ce.View$OnClickListenerC2602k1;
import p038ce.View$OnClickListenerC2855p0;
import p038ce.View$OnClickListenerC2928qj;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.View$OnClickListenerC3021s;
import p038ce.View$OnClickListenerC3043s8;
import p038ce.View$OnClickListenerC3141u7;
import p038ce.i10;
import p038ce.x00;
import p051db.C3950k;
import p053dd.C4017n;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.AbstractC5129m0;
import p111he.AbstractC5135p;
import p111he.C5115g0;
import p111he.C5127l0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5920l;
import p139jb.AbstractRunnableC5910b;
import p193nb.C7316a;
import p193nb.C7321e;
import p193nb.C7322f;
import p194nd.View$OnClickListenerC7430j1;
import p225pd.C8113c;
import p253rc.AbstractC8424a;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.AbstractC10747j0;
import p350yd.AbstractC10748j1;
import p350yd.AbstractC10817l1;
import p350yd.C10534a9;
import p350yd.C10721i0;
import p350yd.C10722i1;
import p350yd.C10791k1;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.HandlerC10770jj;
import p364zd.C11510b;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9142a;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9188f2;
import td.C9202h2;
import td.C9239m;
import td.C9270q1;
import td.C9279r;
import td.C9310u0;
import td.C9357x2;
import td.C9391z4;
import td.RunnableC9248n;
import td.RunnableC9355x0;
import td.View$OnClickListenerC9150b;
import td.View$OnClickListenerC9156b5;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC3062so extends AbstractC9323v4<C3075m> implements AbstractC9201h1, AbstractC9213j1, AbstractC5117h0, C6919i4.AbstractC6920a, ViewPager.AbstractC1054i, View.OnClickListener, View.OnLongClickListener, Client.AbstractC7865g, AbstractC10748j1, AbstractC10747j0, AbstractC10817l1, C11059v7.AbstractC11068i, C11059v7.AbstractC11069j, C11059v7.AbstractC11066g, C11059v7.AbstractC11061b, C11059v7.AbstractC11067h, C11059v7.AbstractC11063d, C9239m.AbstractC9242c, AbstractC2656la, AbstractC5129m0, View$OnClickListenerC9156b5.AbstractC9159c, AbstractC8424a, C3950k.AbstractC3952b, AbstractC9142a, AbstractC5135p {
    public static TdApi.SearchMessagesFilter[] f10271J1;
    public static TdApi.SearchMessagesFilter[] f10272K1;
    public FrameLayoutFix f10273A0;
    public View f10274A1;
    public C9239m f10275B0;
    public int f10276B1;
    public CustomRecyclerView f10277C0;
    public int f10278C1;
    public C2546iq f10279D0;
    public boolean f10280D1;
    public C7045v2 f10281E0;
    public boolean f10282E1;
    public C6919i4 f10283F0;
    public boolean f10284F1;
    public C9391z4 f10285G0;
    public FrameLayoutFix f10287H0;
    public SparseIntArray f10288H1;
    public C3078p f10289I0;
    public int f10290I1;
    public C6879f3 f10291J0;
    public float f10292K0;
    public float f10293L0;
    public boolean f10294M0;
    public float f10295N0;
    public C3950k f10296O0;
    public boolean f10297P0;
    public boolean f10298Q0;
    public boolean f10299R0;
    public boolean f10300S0;
    public boolean f10302U0;
    public boolean f10303V0;
    public boolean f10305X0;
    public FrameLayoutFix f10306Y0;
    public C9279r f10307Z0;
    public ImageView f10308a1;
    public C9310u0 f10309b1;
    public C9310u0 f10310c1;
    public C9310u0 f10311d1;
    public C9310u0 f10312e1;
    public C9310u0 f10313f1;
    public float f10314g1;
    public int f10315h1;
    public C5459x0 f10316i1;
    public C2964ra f10318k1;
    public C2964ra f10319l1;
    public C6982o0 f10320m1;
    public int f10321n0;
    public boolean f10322n1;
    public TdApi.Chat f10323o0;
    public boolean f10324o1;
    public C4737p7 f10325p0;
    public C2964ra f10326p1;
    public TdApi.User f10327q0;
    public C2964ra f10328q1;
    public TdApi.SecretChat f10329r0;
    public C2964ra f10330r1;
    public TdApi.UserFullInfo f10331s0;
    public C2964ra f10332s1;
    public TdApi.BasicGroup f10333t0;
    public int f10334t1;
    public TdApi.BasicGroupFullInfo f10335u0;
    public boolean f10336u1;
    public TdApi.Supergroup f10337v0;
    public int f10338v1;
    public TdApi.SupergroupFullInfo f10339w0;
    public float f10340w1;
    public C4017n f10341x0;
    public HashMap<CharSequence, int[]> f10346z1;
    public int f10343y0 = -1;
    public int f10345z0 = -1;
    public int f10301T0 = -1;
    public int f10304W0 = 0;
    public int f10317j1 = -1;
    public int f10342x1 = -1;
    public int f10344y1 = -1;
    public final ArrayList<i10<?>> f10286G1 = new ArrayList<>(6);

    public class C3063a extends ClickableSpan {
        public final int f10347a;
        public final long f10348b;

        public C3063a(int i, long j) {
            this.f10347a = i;
            this.f10348b = j;
        }

        @Override
        public void onClick(View view) {
            if (this.f10347a == 0) {
                View$OnClickListenerC3062so.this.f30167b.m2485dd().m3569h7(View$OnClickListenerC3062so.this, this.f10348b, new HandlerC10770jj.C10780j().m3368h().m3362n());
                return;
            }
            HandlerC10770jj dd = View$OnClickListenerC3062so.this.f30167b.m2485dd();
            View$OnClickListenerC3062so soVar = View$OnClickListenerC3062so.this;
            dd.m3569h7(soVar, soVar.f10323o0.f25367id, new HandlerC10770jj.C10780j().m3368h().m3362n());
        }
    }

    public class C3064b extends AbstractRunnableC5910b {
        public final RunnableC2374f5 f10350M;
        public final AtomicReference f10351N;
        public final int f10352O;
        public final View f10353P;

        public C3064b(RunnableC2374f5 f5Var, AtomicReference atomicReference, int i, View view) {
            this.f10350M = f5Var;
            this.f10351N = atomicReference;
            this.f10352O = i;
            this.f10353P = view;
        }

        @Override
        public void mo1364b() {
            View$OnClickListenerC3062so.this.mo4347s().m14470l1(false);
            if (!this.f10350M.m9347Sa()) {
                TdApi.Object object = (TdApi.Object) this.f10351N.get();
                int constructor = object.getConstructor();
                if (constructor == -1679978726) {
                    this.f10350M.mo4347s().m14584H3().m8985g(this.f10353P).m8969F(this.f10350M, View$OnClickListenerC3062so.this.f30167b, R.drawable.baseline_error_24, C4779t2.m25378z5(object));
                } else if (constructor == 1829953909) {
                    View$OnClickListenerC3062so.this.m31620ii(this.f10352O, this.f10350M, this.f10353P, (TdApi.ChatMember) object, -1, true);
                }
            }
        }
    }

    public class C3065c extends RecyclerView.AbstractC0910t {
        public C3065c() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (View$OnClickListenerC3062so.this.f10280D1 && i == 1) {
                View$OnClickListenerC3062so.this.f10277C0.m39496D1();
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            int i3 = 0;
            if (i2 != 0) {
                View$OnClickListenerC3062so.this.mo9397La();
                View$OnClickListenerC3062so.this.f10300S0 = false;
            }
            if (View$OnClickListenerC3062so.this.f10280D1 && !View$OnClickListenerC3062so.this.f10282E1 && !View$OnClickListenerC3062so.this.f10284F1 && i2 != 0) {
                View$OnClickListenerC3062so.this.f10277C0.m39496D1();
                if (View$OnClickListenerC3062so.this.f10340w1 == 0.0f) {
                    int X1 = ((LinearLayoutManager) recyclerView.getLayoutManager()).m39549X1();
                    int dj = View$OnClickListenerC3062so.this.m31664dj();
                    if (X1 == 0) {
                        View C = recyclerView.getLayoutManager().mo39262C(0);
                        View$OnClickListenerC3062so soVar = View$OnClickListenerC3062so.this;
                        if (C != null) {
                            i3 = dj - C.getTop();
                        }
                        soVar.m31823Li(i3);
                        return;
                    }
                    View$OnClickListenerC3062so.this.m31823Li(dj);
                }
            }
        }
    }

    public class C3066d extends FrameLayoutFix {
        public boolean f10356M;
        public float f10357N;
        public float f10358O;
        public int f10359P;
        public float f10360Q;

        public C3066d(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f10356M = true;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if ((childAt instanceof C6851c0) && childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                        float left = childAt.getLeft() + childAt.getTranslationX();
                        float top = childAt.getTop() + childAt.getTranslationY();
                        if (x >= left && x < left + childAt.getMeasuredWidth() && y >= top && y < top + childAt.getMeasuredHeight()) {
                            this.f10356M = false;
                            return false;
                        }
                    }
                }
            }
            return this.f10356M;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f10359P;
            if (!(i3 == 0 || measuredHeight == i3)) {
                View$OnClickListenerC3062so.this.m31634gm();
            }
            this.f10359P = measuredHeight;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float y = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                this.f10357N = motionEvent.getX();
                this.f10358O = y;
                float translationY = View$OnClickListenerC3062so.this.f10287H0.getTranslationY() + View$OnClickListenerC3062so.m31854Hj();
                View$OnClickListenerC3062so.this.f10300S0 = false;
                float f = this.f10358O;
                if (f >= translationY && f <= translationY + View$OnClickListenerC3062so.m31902Bj() && View$OnClickListenerC3062so.this.f10287H0 != null && View$OnClickListenerC3062so.this.f10287H0.getParent() != null) {
                    View$OnClickListenerC3062so.this.f10301T0 = 2;
                    View$OnClickListenerC3062so.this.f10300S0 = true;
                    View$OnClickListenerC3062so.this.m31811Mm(true);
                } else if (View$OnClickListenerC3062so.this.f10340w1 != 0.0f || !View$OnClickListenerC3062so.this.m31530si(getMeasuredWidth(), this.f10358O) || View$OnClickListenerC3062so.this.m31480yi() >= View$OnClickListenerC3062so.this.m31751Tl()) {
                    View$OnClickListenerC3062so.this.f10301T0 = 1;
                    View$OnClickListenerC3062so.this.m31811Mm(true);
                } else {
                    View$OnClickListenerC3062so.this.f10301T0 = 0;
                    View$OnClickListenerC3062so.this.m31811Mm(false);
                }
            }
            int i = View$OnClickListenerC3062so.this.f10301T0;
            if (i == 0) {
                View$OnClickListenerC3062so.this.f10277C0.dispatchTouchEvent(motionEvent);
                if (!View$OnClickListenerC3062so.this.f10302U0 && !View$OnClickListenerC3062so.this.f10303V0) {
                    View$OnClickListenerC3062so.this.m31637gj(motionEvent);
                    if (motionEvent.getAction() == 2 && y < this.f10360Q && View$OnClickListenerC3062so.this.m31480yi() == View$OnClickListenerC3062so.this.m31751Tl()) {
                        View$OnClickListenerC3062so.this.f10301T0 = 3;
                        View$OnClickListenerC3062so.this.f10277C0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                        View$OnClickListenerC3062so.this.f10277C0.m39496D1();
                        View$OnClickListenerC3062so.this.m31811Mm(true);
                    }
                }
            } else if (i == 1) {
                View$OnClickListenerC3062so.this.f10281E0.dispatchTouchEvent(motionEvent);
            } else if (i == 2) {
                if (!View$OnClickListenerC3062so.this.f10302U0) {
                    if (!View$OnClickListenerC3062so.this.f10280D1) {
                        View$OnClickListenerC3062so.this.m31637gj(motionEvent);
                    } else if (motionEvent.getAction() == 1) {
                        View$OnClickListenerC3062so.this.f10281E0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                    } else {
                        View$OnClickListenerC3062so.this.f10281E0.dispatchTouchEvent(motionEvent);
                    }
                }
                motionEvent.offsetLocation(0.0f, -View$OnClickListenerC3062so.this.f10287H0.getTranslationY());
                if (!View$OnClickListenerC3062so.this.f10300S0) {
                    View$OnClickListenerC3062so.this.f10301T0 = 1;
                    View$OnClickListenerC3062so.this.f10287H0.dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                } else {
                    View$OnClickListenerC3062so.this.f10287H0.dispatchTouchEvent(motionEvent);
                }
            } else if (i == 3) {
                View$OnClickListenerC3062so.this.m31637gj(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                View$OnClickListenerC3062so.this.f10301T0 = -1;
            }
            this.f10360Q = y;
            return true;
        }
    }

    public class C3067e extends CustomRecyclerView {
        public C3067e(Context context) {
            super(context);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            View$OnClickListenerC3062so.this.m31827Km(z);
        }
    }

    public class C3068f extends RunnableC9248n {
        public C3068f(Context context, AbstractC9323v4 v4Var) {
            super(context, v4Var);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            View$OnClickListenerC3062so.this.m31827Km(z);
        }
    }

    public class C3069g extends RecyclerView.AbstractC0910t {
        public boolean f10364a;
        public int f10365b = 0;

        public C3069g() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 1) {
                C1408x.m37088c(View$OnClickListenerC3062so.this.m9333U9());
                View$OnClickListenerC3062so.this.mo9397La();
            }
            this.f10365b = View$OnClickListenerC3062so.this.f10304W0;
            View$OnClickListenerC3062so.this.f10304W0 = i;
            View$OnClickListenerC3062so.this.m31807Ni();
        }

        @Override
        public void mo421b(androidx.recyclerview.widget.RecyclerView r3, int r4, int r5) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3062so.C3069g.mo421b(androidx.recyclerview.widget.RecyclerView, int, int):void");
        }
    }

    public class C3070h extends C2546iq {
        public C3070h(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo504C2(C2964ra raVar, int i, RecyclerView recyclerView) {
            if (recyclerView.getAdapter() != View$OnClickListenerC3062so.this.f10341x0) {
                recyclerView.setAdapter(View$OnClickListenerC3062so.this.f10341x0);
            }
        }

        @Override
        public void mo31467J1(C2964ra raVar, C6942k3 k3Var, int i, int i2) {
            if (raVar.m32835j() == R.id.btn_slowMode) {
                View$OnClickListenerC3062so.this.f10328q1.m32853X(View$OnClickListenerC3062so.m31878Ej(C7322f.f23230a[i]));
                View$OnClickListenerC3062so.this.f10279D0.m34137q3(View$OnClickListenerC3062so.this.f10328q1);
                View$OnClickListenerC3062so.this.m31616im();
                View$OnClickListenerC3062so.this.m31772Ri();
            } else if (raVar.m32835j() == R.id.btn_chatTtl) {
                View$OnClickListenerC3062so.this.f10332s1.m32853X(View$OnClickListenerC3062so.m31846Ij(C7322f.f23231b[i], View$OnClickListenerC3062so.this.m31753Tj()));
                View$OnClickListenerC3062so.this.f10279D0.m34137q3(View$OnClickListenerC3062so.this.f10332s1);
                View$OnClickListenerC3062so.this.m31616im();
                View$OnClickListenerC3062so.this.m31772Ri();
            }
        }

        @Override
        public void mo31466M2(C2964ra raVar, C6879f3 f3Var) {
            int j = raVar.m32835j();
            if (j == R.id.shadowBottom || j == R.id.shadowTop) {
                f3Var.setAlpha(0.0f);
            }
        }

        @Override
        public void mo31465O2(C2964ra raVar, C6942k3 k3Var) {
            super.mo31465O2(raVar, k3Var);
            k3Var.setShowOnlyValue(raVar.m32835j() == R.id.btn_slowMode || raVar.m32835j() == R.id.btn_chatTtl);
        }

        @Override
        public void mo394V2(p038ce.C2964ra r18, tc.C9137c r19, boolean r20) {
            throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3062so.C3070h.mo394V2(ce.ra, tc.c, boolean):void");
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setEnabled(false);
            oVar.setChat((C4601c3) raVar.m32844d());
        }

        @Override
        public void mo30690v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            if (raVar.m32835j() == R.id.S) {
                ((C6857d) viewGroup.getChildAt(1)).m18751k(View$OnClickListenerC3062so.this.f30167b, View$OnClickListenerC3062so.this.f10323o0);
            }
            if (View$OnClickListenerC3062so.this.m31744Uj()) {
                View$OnClickListenerC3062so.this.m31733Vl(raVar, viewGroup, y1Var);
            }
        }
    }

    public class C3071i extends RecyclerView.AbstractC0910t {
        public C3071i() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            View$OnClickListenerC3062so soVar = View$OnClickListenerC3062so.this;
            boolean z = true;
            if (i != 1 || !soVar.f10285G0.m8808C1()) {
                z = false;
            }
            soVar.f10302U0 = z;
        }
    }

    public class C3072j extends ClickableSpan {
        public final TdApi.Chat f10369a;

        public C3072j(TdApi.Chat chat) {
            this.f10369a = chat;
        }

        @Override
        public void onClick(View view) {
            View$OnClickListenerC3062so.this.f30167b.m2485dd().m3881C4(View$OnClickListenerC3062so.this, this.f10369a, new HandlerC10770jj.C10780j().m3368h().m3362n());
        }
    }

    public class C3073k implements C3034s5.AbstractC3035a {
        public C3073k() {
        }

        @Override
        public boolean mo31464a() {
            return true;
        }

        @Override
        public boolean mo31463b(C3034s5 s5Var, TdApi.Chat chat) {
            View$OnClickListenerC3062so.this.m31787Pl(s5Var, chat.f25367id, false);
            return true;
        }
    }

    public class C3074l extends ClickableSpan {
        public final int f10373a;
        public final long f10374b;
        public final long f10375c;

        public C3074l(int i, long j, long j2) {
            this.f10373a = i;
            this.f10374b = j;
            this.f10375c = j2;
        }

        @Override
        public void onClick(View view) {
            View$OnClickListenerC3062so.this.f30167b.m2485dd().m3569h7(View$OnClickListenerC3062so.this, this.f10373a == 0 ? this.f10374b : this.f10375c, new HandlerC10770jj.C10780j().m3368h().m3362n());
        }
    }

    public static class C3075m {
        public TdApi.Chat f10376a;
        public C4737p7 f10377b;
        public boolean f10378c;

        public C3075m(TdApi.Chat chat, C4737p7 p7Var, boolean z) {
            this.f10376a = chat;
            this.f10377b = p7Var;
            this.f10378c = z;
        }
    }

    public class C3076n extends RecyclerView.AbstractC0901o {
        public C3076n() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39418l0(view);
            if (l0 == null || l0.m39335k() != View$OnClickListenerC3062so.this.f10279D0.m34240F0().size() - 1) {
                rect.setEmpty();
                return;
            }
            int measuredHeight = recyclerView.getMeasuredHeight();
            int Bj = (measuredHeight - View$OnClickListenerC3062so.m31902Bj()) - View$OnClickListenerC3062so.m31886Dj();
            int pj = View$OnClickListenerC3062so.this.m31556pj();
            if (!View$OnClickListenerC3062so.this.m31715Xl()) {
                rect.bottom = pj - View$OnClickListenerC3062so.m31902Bj();
                return;
            }
            int max = Math.max(0, (recyclerView.getMeasuredHeight() + View$OnClickListenerC3062so.m31902Bj()) - pj);
            if (max > 0) {
                rect.bottom = Bj - Math.max(0, measuredHeight - (pj + max));
            } else {
                rect.bottom = Bj;
            }
        }
    }

    public class C3077o extends RecyclerView.AbstractC0901o {
        public final i10<?> f10380a;

        public C3077o(i10<?> i10Var) {
            this.f10380a = i10Var;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int i;
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39418l0(view);
            if (l0 != null) {
                int k = l0.m39335k();
                int D = recyclerView.getAdapter().mo6153D();
                boolean z = k == -1;
                int dj = (k == 0 || z) ? View$OnClickListenerC3062so.this.m31664dj() : 0;
                if (!View$OnClickListenerC3062so.this.m31715Xl() || ((k != D - 1 && !z) || (view instanceof C6977n2) || (view instanceof C6852c1))) {
                    i = 0;
                } else {
                    i = Math.max(0, (((recyclerView.getMeasuredHeight() - View$OnClickListenerC3062so.m31886Dj()) - (z ? view.getMeasuredHeight() : this.f10380a.m34349kf() - C2139ap.m35479W(8))) - View$OnClickListenerC3062so.m31512uj()) - View$OnClickListenerC3062so.m31902Bj());
                }
                rect.set(0, dj, 0, i);
                return;
            }
            rect.set(0, View$OnClickListenerC3062so.this.m31664dj(), 0, 0);
        }
    }

    public static class C3078p extends View {
        public float f10382a;

        public C3078p(Context context) {
            super(context);
        }

        public void m31462a(float f) {
            if (this.f10382a != f) {
                this.f10382a = f;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (this.f10382a != 0.0f) {
                float measuredHeight = getMeasuredHeight();
                canvas.drawRect(0.0f, measuredHeight - (this.f10382a * measuredHeight), getMeasuredWidth(), measuredHeight, C1410y.m37039g(C11524j.m148w()));
            }
        }
    }

    public View$OnClickListenerC3062so(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m31909Ak(TdApi.SearchMessagesFilter searchMessagesFilter, int i) {
        if (!m9347Sa()) {
            m31714Xm(searchMessagesFilter, i);
            if (!m31717Xj(searchMessagesFilter)) {
                int i2 = this.f10290I1 - 1;
                this.f10290I1 = i2;
                if (i2 == 0) {
                    m9204n9();
                }
            }
        }
    }

    public static int m31902Bj() {
        return C2139ap.m35479W(39);
    }

    public void m31901Bk(TdApi.SearchMessagesFilter searchMessagesFilter, int i) {
        if (!m9347Sa()) {
            m31714Xm(searchMessagesFilter, i);
        }
    }

    public void m31900Bl(final long j, TdApi.Object object) {
        if (object.getConstructor() == -1035719349) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31908Al(j);
                }
            });
        }
    }

    public void m31893Ck(final TdApi.SearchMessagesFilter searchMessagesFilter, boolean z, TdApi.Object object) {
        final int i;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            Log.m14724e("TDLib error getMessageCount chatId:%d, filter:%s, returnLocal:%b", Long.valueOf(mo9464C9()), searchMessagesFilter, Boolean.valueOf(z));
            i = -1;
        } else if (constructor != 1295577348) {
            Log.unexpectedTdlibResponse(object, TdApi.GetChatMessageCount.class, TdApi.Count.class, TdApi.Error.class);
            return;
        } else {
            i = ((TdApi.Count) object).count;
        }
        if (z) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31909Ak(searchMessagesFilter, i);
                }
            });
            if (i == -1) {
                m31471zj(searchMessagesFilter, false);
                return;
            }
            return;
        }
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31901Bk(searchMessagesFilter, i);
            }
        });
    }

    public static int m31886Dj() {
        return C2139ap.m35479W(3);
    }

    public void m31885Dk(long j) {
        if (!m9347Sa() && this.f10323o0.f25367id == j) {
            m31777Qm(true);
            this.f10279D0.m34130s3(R.id.btn_notifications);
        }
    }

    public void m31884Dl(final long j, TdApi.Object object) {
        if (object.getConstructor() == -1601123095) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31892Cl(j);
                }
            });
        }
    }

    public static CharSequence m31878Ej(int i) {
        if (i == 0) {
            return C4403w.m27869i1(R.string.SlowModeDisabled);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = i;
        if (timeUnit.toHours(j) > 0) {
            return C4403w.m27836q2(R.string.SlowModeHours, timeUnit.toHours(j));
        }
        if (timeUnit.toMinutes(j) > 0) {
            return C4403w.m27836q2(R.string.SlowModeMinutes, timeUnit.toMinutes(j));
        }
        return C4403w.m27836q2(R.string.SlowModeSeconds, j);
    }

    public void m31877Ek(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (!m9347Sa() && notificationSettingsScope.getConstructor() == this.f30167b.m2440ga().m3117j2(this.f10323o0.f25367id).getConstructor()) {
            m31777Qm(true);
            this.f10279D0.m34130s3(R.id.btn_notifications);
        }
    }

    public void m31876El() {
        this.f10279D0.m34130s3(R.id.btn_manageInviteLinks);
    }

    public static int m31870Fj(int i) {
        return Math.max(0, (i - C1357a0.m37541i(73.0f)) - C1357a0.m37541i(17.0f));
    }

    public void m31869Fk(long j, TdApi.Object object) {
        this.f30167b.m2270r4().m14783o(new TdApi.SetChatDiscussionGroup(this.f10323o0.f25367id, j), this.f30167b.m2392ja());
    }

    public void m31868Fl(TdApi.Object object, Runnable runnable) {
        TdApi.ChatInviteLinkCount[] chatInviteLinkCountArr;
        for (TdApi.ChatInviteLinkCount chatInviteLinkCount : ((TdApi.ChatInviteLinkCounts) object).inviteLinkCounts) {
            this.f10343y0 += chatInviteLinkCount.inviteLinkCount;
            this.f10345z0 += chatInviteLinkCount.revokedInviteLinkCount;
        }
        runnable.run();
    }

    public void m31861Gk(AbstractC9323v4 v4Var, final long j) {
        this.f30167b.m2270r4().m14783o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(C7316a.m17045p(j), true), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3062so.this.m31869Fk(j, object);
            }
        });
        v4Var.m9298Zb();
    }

    public void m31860Gl(final Runnable runnable, final TdApi.Object object) {
        if (object.getConstructor() == 920326637) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31868Fl(object, runnable);
                }
            });
        }
    }

    public static int m31854Hj() {
        return C1357a0.m37541i(6.0f);
    }

    public static void m31853Hk(AbstractC5920l lVar, TdApi.Object object) {
        lVar.mo3050a(((TdApi.Chat) object).f25367id);
    }

    public void m31852Hl(Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            this.f10345z0 += ((TdApi.ChatInviteLinks) object).totalCount;
        }
        m9135wd(runnable);
    }

    public static CharSequence m31846Ij(int i, boolean z) {
        if (i == 0) {
            return C4403w.m27869i1(z ? R.string.ChannelTtlDisabled : R.string.ChatTtlDisabled);
        }
        return C4403w.m27853m1(z ? R.string.ChannelTtlEnabled : R.string.ChatTtlEnabled, C4403w.m27818v0(i));
    }

    public void m31845Ik(final AbstractC5920l lVar, final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == -1601123095) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.m31853Hk(AbstractC5920l.this, object);
                }
            });
        }
    }

    public void m31844Il(final Runnable runnable, TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            this.f10343y0 += ((TdApi.ChatInviteLinks) object).totalCount;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.GetChatInviteLinks(this.f10323o0.f25367id, this.f30167b.m2519ba(), true, 0, null, 1), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object2) {
                View$OnClickListenerC3062so.this.m31852Hl(runnable, object2);
            }
        });
    }

    public Object m31837Jk(long j, long j2, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return new C3074l(i3, j, j2);
    }

    public void m31836Jl(View view) {
        AbstractC9323v4<?> oj = m31565oj();
        if (oj != null) {
            ((i10) oj).m34404Eg(false);
        }
    }

    public void m31828Kl(C2964ra raVar, View view, int i, C2964ra raVar2, TextView textView, C2546iq iqVar) {
        TdApi.SupergroupFullInfo supergroupFullInfo;
        boolean z = iqVar.m34252A0().get(R.id.btn_prehistoryMode) == R.id.btn_visible;
        if (this.f10335u0 == null || z) {
            int i2 = R.string.ChatHistoryHiddenInfo;
            if (z || (supergroupFullInfo = this.f10339w0) == null || supergroupFullInfo.linkedChatId == 0) {
                if (z) {
                    i2 = R.string.ChatHistoryVisibleInfo;
                }
                raVar.m32854W(i2);
            } else {
                raVar.m32853X(new SpannableStringBuilder(C4403w.m27869i1(R.string.ChatHistoryHiddenInfo)).append((CharSequence) "\n\n").append(C4403w.m27853m1(R.string.ChatHistoryWarnLinkedChannel, this.f30167b.m2691Q3(this.f10339w0.linkedChatId))));
            }
        } else {
            raVar.m32853X(C4403w.m27844o2(R.string.ChatHistoryPartiallyHiddenInfo, 100L));
        }
        iqVar.m34124u3(iqVar.m34235H0(raVar));
    }

    public void m31821Lk(final long j, final long j2, final AbstractC5920l lVar) {
        if (j != 0) {
            m9329Ud(C4403w.m27873h1(R.string.LinkGroupConfirmOverride, new C4403w.AbstractC4409f() {
                @Override
                public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
                    Object Jk;
                    Jk = View$OnClickListenerC3062so.this.m31837Jk(j2, j, charSequence, i, i2, i3, z);
                    return Jk;
                }
            }, this.f30167b.m2691Q3(j2), this.f30167b.m2691Q3(j)), C4403w.m27869i1(R.string.LinkGroupConfirmOverrideDone), R.drawable.baseline_remove_circle_24, 2, new Runnable() {
                @Override
                public final void run() {
                    AbstractC5920l.this.mo3050a(j2);
                }
            });
        } else {
            lVar.mo3050a(j2);
        }
    }

    public void m31820Ll(boolean z, long j, long j2, TdApi.Error error) {
        if (j2 != 0) {
            this.f30167b.m2270r4().m14783o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(C7316a.m17045p(j2), z), this.f30167b.m2392ja());
        }
    }

    public void m31813Mk(final AbstractC9323v4 v4Var, final long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        final AbstractC5920l rnVar = new AbstractC5920l() {
            @Override
            public final void mo3050a(long j2) {
                View$OnClickListenerC3062so.this.m31861Gk(v4Var, j2);
            }
        };
        if (C7316a.m17054g(j)) {
            this.f30167b.m2270r4().m14783o(new TdApi.UpgradeBasicGroupChatToSupergroupChat(j), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31845Ik(rnVar, object);
                }
            });
        } else if (supergroupFullInfo != null) {
            final long j2 = supergroupFullInfo.linkedChatId;
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31821Lk(j2, j, rnVar);
                }
            });
        }
    }

    public void m31812Ml(final boolean z) {
        this.f30167b.m2776Ke(this.f10323o0.f25367id, new C10930q6.AbstractC10948r() {
            @Override
            public final void mo1525a(long j, long j2, TdApi.Error error) {
                View$OnClickListenerC3062so.this.m31820Ll(z, j, j2, error);
            }
        });
    }

    public Object m31805Nk(long j, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return new C3063a(i3, j);
    }

    public void m31804Nl(boolean z, TdApi.Object object) {
        this.f30167b.m2270r4().m14783o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(this.f10337v0.f25425id, z), this.f30167b.m2392ja());
    }

    public static boolean m31797Ok(Runnable runnable, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        runnable.run();
        return true;
    }

    public void m31796Ol(boolean z, int i, SparseIntArray sparseIntArray) {
        final boolean z2 = sparseIntArray.get(R.id.btn_prehistoryMode) == R.id.btn_visible;
        if (z == z2) {
            return;
        }
        if (this.f10335u0 != null) {
            m9322Vd(C4403w.m27982H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27869i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31812Ml(z2);
                }
            });
            return;
        }
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
        if (supergroupFullInfo == null || supergroupFullInfo.linkedChatId == 0) {
            this.f30167b.m2270r4().m14783o(new TdApi.ToggleSupergroupIsAllHistoryAvailable(this.f10337v0.f25425id, z2), this.f30167b.m2392ja());
        } else {
            this.f30167b.m2270r4().m14783o(new TdApi.SetChatDiscussionGroup(0L, this.f10323o0.f25367id), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31804Nl(z2, object);
                }
            });
        }
        this.f10279D0.m34130s3(R.id.btn_prehistoryMode);
    }

    public void m31788Pk(final AbstractC9323v4 v4Var, final long j, boolean z, boolean z2, boolean z3, final TdApi.SupergroupFullInfo supergroupFullInfo) {
        final Runnable gnVar = new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31813Mk(v4Var, j, supergroupFullInfo);
            }
        };
        if (!z) {
            gnVar.run();
            return;
        }
        CharSequence h1 = C4403w.m27873h1(R.string.LinkGroupConfirm, new C4403w.AbstractC4409f() {
            @Override
            public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z4) {
                Object Nk;
                Nk = View$OnClickListenerC3062so.this.m31805Nk(j, charSequence, i, i2, i3, z4);
                return Nk;
            }
        }, this.f30167b.m2691Q3(j), this.f30167b.m2691Q3(this.f10323o0.f25367id));
        SpannableStringBuilder spannableStringBuilder = h1 instanceof SpannableStringBuilder ? (SpannableStringBuilder) h1 : new SpannableStringBuilder(h1);
        if (!z2 || !z3) {
            if (z2) {
                spannableStringBuilder.append((CharSequence) "\n\n").append(C4403w.m27982H0(this, R.string.LinkGroupConfirmWarnPrivateGroup, new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) "\n\n").append(C4403w.m27982H0(this, R.string.LinkGroupConfirmWarnPrivateChannel, new Object[0]));
            }
        }
        if (supergroupFullInfo != null && !supergroupFullInfo.isAllHistoryAvailable) {
            spannableStringBuilder.append((CharSequence) "\n\n").append(C4403w.m27982H0(this, R.string.LinkGroupConfirmWarnPreHistory, new Object[0]));
        }
        m9261ee(spannableStringBuilder, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.LinkGroupConfirmDone), C4403w.m27869i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_link_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Ok;
                Ok = View$OnClickListenerC3062so.m31797Ok(gnVar, view, i);
                return Ok;
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

    public void m31779Qk(TdApi.BasicGroup basicGroup, boolean z) {
        TdApi.BasicGroup basicGroup2;
        if (!m9347Sa() && (basicGroup2 = this.f10333t0) != null && basicGroup2.f25363id == basicGroup.f25363id) {
            m31759Sm();
            if (z) {
                m31892Cl(basicGroup.upgradedToSupergroupId);
            }
        }
    }

    public void m31770Rk(long j, TdApi.ChatMember chatMember) {
        C4017n nVar;
        if (this.f10323o0.f25367id == j && (nVar = this.f10341x0) != null) {
            nVar.m29302r0(chatMember);
        }
    }

    public static void m31761Sk(boolean z, C9310u0 u0Var) {
        u0Var.setTranslationX(z ? 0.0f : C1357a0.m37541i(39.0f));
    }

    public void m31752Tk(long j) {
        TdApi.Chat chat = this.f10323o0;
        if (chat != null && chat.f25367id == j) {
            final boolean Y8 = this.f30167b.m2485dd().m3657Y8(mo418W9(), this.f30156R, this.f10323o0, false);
            View$OnClickListenerC9170d1 d1Var = this.f30156R;
            if (d1Var != null) {
                d1Var.m10094Q3(mo418W9(), R.id.menu_btn_call, new AbstractC5918j() {
                    @Override
                    public final void mo1330a(Object obj) {
                        View$OnClickListenerC3062so.m31761Sk(Y8, (C9310u0) obj);
                    }
                });
            }
        }
    }

    public void m31743Uk(long j) {
        if (!m9347Sa() && mo9464C9() == j) {
            m31759Sm();
        }
    }

    public void m31734Vk(long j, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (mo9464C9() == j) {
            int N0 = this.f10279D0.m34224N0(R.id.btn_manageInviteLinks);
            int N02 = this.f10279D0.m34224N0(R.id.btn_manageJoinRequests);
            if ((chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount == 0) && N02 != -1) {
                this.f10279D0.m34204V1(N02 - 1, 2);
            } else if (chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount <= 0 || N02 != -1 || N0 == -1) {
                this.f10279D0.m34130s3(R.id.btn_manageJoinRequests);
            } else {
                this.f10279D0.m34188b1(N0 + 1, new C2964ra(11), new C2964ra(5, R.id.btn_manageJoinRequests, 0, R.string.InviteLinkRequests));
            }
        }
    }

    public void m31725Wk(long j) {
        if (!m9347Sa() && this.f10323o0.f25367id == j && this.f10279D0 != null) {
            m31525sn(R.id.btn_chatPermissions);
        }
    }

    public static boolean m31717Xj(TdApi.SearchMessagesFilter searchMessagesFilter) {
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

    public void m31716Xk(long j) {
        if (!m9347Sa() && this.f10323o0.f25367id == j) {
            m31768Rm(true);
        }
    }

    public void m31707Yk(long j) {
        if (!m9347Sa() && this.f10323o0.f25367id == j) {
            m31561on(false);
        }
    }

    public boolean m31698Zk(View view, int i) {
        if (i == R.id.btn_copyText) {
            m31655ej();
            return true;
        } else if (i != R.id.btn_edit) {
            return true;
        } else {
            m31610jj();
            return true;
        }
    }

    public boolean m31690ak(View view, int i) {
        if (i == R.id.btn_addAdmin) {
            m31593li(1);
        } else if (i == R.id.btn_addMember) {
            m31593li(0);
        } else if (i == R.id.btn_banMember) {
            m31593li(2);
        }
        return true;
    }

    public void m31689al(C9239m mVar, float f, boolean z, float f2, float f3) {
        m31579mn();
    }

    public void m31681bk(AtomicReference atomicReference, AbstractRunnableC5910b bVar, TdApi.Object object) {
        atomicReference.set(object);
        this.f30167b.m2485dd().post(bVar);
    }

    public boolean m31680bl(TdApi.User user, View view, int i) {
        if (i == R.id.btn_deleteMember) {
            this.f30167b.m2270r4().m14783o(new TdApi.SetChatMemberStatus(this.f10323o0.f25367id, new TdApi.MessageSenderUser(user.f25439id), new TdApi.ChatMemberStatusBanned()), this.f30167b.m2392ja());
            return true;
        } else if (i != R.id.btn_openChat) {
            return true;
        } else {
            this.f30167b.m2485dd().m3439u7(this, user.f25439id, null);
            return true;
        }
    }

    public void m31672ck(boolean z, RunnableC2374f5 f5Var, View view, TdApi.Error error) {
        String str;
        if (z) {
            f5Var.m9298Zb();
            return;
        }
        C9357x2.C9365h g = f5Var.mo4347s().m14584H3().m8985g(view);
        C10930q6 q6Var = this.f30167b;
        if (error == null || !"USER_PRIVACY_RESTRICTED".equals(error.message)) {
            str = C4779t2.m25378z5(error);
        } else {
            str = C4403w.m27869i1(R.string.errorPrivacyAddMember);
        }
        g.m8969F(f5Var, q6Var, R.drawable.baseline_error_24, str);
    }

    public void m31671cl(long j, long j2, TdApi.MessageContent messageContent) {
        if (!m9347Sa() && this.f10323o0.f25367id == j) {
            m31592lj(j2, messageContent);
        }
    }

    public void m31663dk(final RunnableC2374f5 f5Var, final View view, final boolean z, final TdApi.Error error) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31672ck(z, f5Var, view, error);
            }
        });
    }

    public void m31662dl(TdApi.Message message, long j) {
        if (!m9347Sa() && this.f10323o0.f25367id == message.chatId) {
            m31891Cm(new long[]{j});
        }
    }

    public void m31654ek(int i, RunnableC2374f5 f5Var, View view, TdApi.ChatMember chatMember, int i2, SparseIntArray sparseIntArray) {
        int i3;
        if (i2 == R.id.btn_addMember) {
            if (sparseIntArray.size() > 0) {
                switch (sparseIntArray.get(R.id.btn_addMember)) {
                    case R.id.btn_forwardLast100:
                        i3 = 100;
                        break;
                    case R.id.btn_forwardLast15:
                        i3 = 15;
                        break;
                    case R.id.btn_forwardLast50:
                        i3 = 50;
                        break;
                }
                m31620ii(i, f5Var, view, chatMember, i3, false);
            }
            i3 = 0;
            m31620ii(i, f5Var, view, chatMember, i3, false);
        }
    }

    public void m31653el(TdApi.Message message) {
        if (!m9347Sa() && this.f10323o0.f25367id == message.chatId) {
            m31584mi(message);
        }
    }

    public boolean m31645fk(int i, RunnableC2374f5 f5Var, View view, TdApi.ChatMember chatMember, int i2, View view2, int i3) {
        if (i3 != R.id.btn_addMember) {
            return true;
        }
        m31620ii(i, f5Var, view, chatMember, i2, false);
        return true;
    }

    public void m31644fl(long j, long[] jArr) {
        if (!m9347Sa() && this.f10323o0.f25367id == j) {
            m31891Cm(jArr);
        }
    }

    public void m31636gk(RunnableC2374f5 f5Var, View view, boolean z, TdApi.Error error) {
        if (z) {
            f5Var.m9298Zb();
        } else {
            f5Var.mo4347s().m14584H3().m8985g(view).m8969F(f5Var, this.f30167b, R.drawable.baseline_error_24, C4779t2.m25378z5(error));
        }
    }

    public void m31635gl(boolean z, TdApi.Object object) {
        if (C4779t2.m25450p3(object)) {
            C1379j0.m37290z0(C4403w.m27853m1(z ? R.string.BlockedBot : R.string.BlockedUser, this.f30167b.m2691Q3(this.f10323o0.f25367id)), 0);
        } else {
            this.f30167b.m2392ja().mo255t2(object);
        }
    }

    public static float m31628hj(float f) {
        float c3 = View$OnClickListenerC9170d1.m10066c3(true) * f;
        float i = C1357a0.m37541i(4.0f);
        return Math.max(0.0f, c3 - i) / (View$OnClickListenerC9170d1.m10066c3(false) - i);
    }

    public boolean m31627hk(TdApi.ChatMember chatMember, final RunnableC2374f5 f5Var, final View view, View view2, int i) {
        if (i != R.id.btn_blockSender) {
            return true;
        }
        this.f30167b.m2811Ib(this.f10323o0.f25367id, chatMember.memberId, new TdApi.ChatMemberStatusBanned(), chatMember.status, new C10930q6.AbstractC10939i() {
            @Override
            public final void mo1765a(boolean z, TdApi.Error error) {
                View$OnClickListenerC3062so.this.m31636gk(f5Var, view, z, error);
            }
        });
        return true;
    }

    public boolean m31626hl(final boolean z, View view, int i) {
        if (!m9347Sa() && i == R.id.btn_blockSender) {
            C10930q6 q6Var = this.f30167b;
            q6Var.m2496d2(q6Var.m2183wb(this.f10323o0.f25367id), true, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31635gl(z, object);
                }
            });
        }
        return true;
    }

    public void m31618ik() {
        m31539ri(true);
    }

    public void m31617il(boolean z, TdApi.Object object) {
        if (C4779t2.m25450p3(object)) {
            C1379j0.m37290z0(C4403w.m27853m1(z ? R.string.UnblockedBot : R.string.UnblockedUser, this.f30167b.m2691Q3(this.f10323o0.f25367id)), 0);
        } else {
            this.f30167b.m2392ja().mo255t2(object);
        }
    }

    public void m31609jk(TdApi.Object object) {
        m31651en(C4779t2.m25378z5(object));
    }

    public void m31608jl(TdApi.Message message) {
        if (!m9347Sa()) {
            m31584mi(message);
        }
    }

    public void m31600kk(int[] iArr, ArrayList arrayList) {
        m31723Wm(false);
        if (iArr[1] == arrayList.size()) {
            m9298Zb();
        }
    }

    public void m31599kl(TdApi.Object object) {
        if (!m9347Sa() && object.getConstructor() == -497558622) {
            TdApi.ChatMembers chatMembers = (TdApi.ChatMembers) object;
            C4017n nVar = this.f10341x0;
            if (nVar != null) {
                nVar.m29303q0(chatMembers.members);
            }
        }
    }

    public void m31591lk(final int[] iArr, final ArrayList arrayList, final TdApi.Object object) {
        iArr[0] = iArr[0] + 1;
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31609jk(object);
                }
            });
        } else if (constructor == -722616727) {
            iArr[1] = iArr[1] + 1;
        }
        if (iArr[0] == arrayList.size()) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31600kk(iArr, arrayList);
                }
            });
        }
    }

    public void m31590ll() {
        if (!m9347Sa()) {
            this.f10279D0.m34130s3(R.id.btn_notifications);
        }
    }

    public static void m31583mj(List<i10<?>> list, AbstractView$OnTouchListenerC7889a aVar, C10930q6 q6Var) {
        TdApi.SearchMessagesFilter[] sj = m31529sj();
        C5062b.m24159m(list, list.size() + sj.length);
        for (TdApi.SearchMessagesFilter searchMessagesFilter : sj) {
            list.add(i10.m34390Ng(aVar, q6Var, searchMessagesFilter));
        }
    }

    public void m31582mk(final ArrayList arrayList) {
        final int[] iArr = new int[2];
        Client.AbstractC7865g goVar = new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3062so.this.m31591lk(iArr, arrayList, object);
            }
        };
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f30167b.m2270r4().m14783o((TdApi.Function) it.next(), goVar);
        }
    }

    public void m31581ml(TdApi.SecretChat secretChat) {
        TdApi.SecretChat secretChat2;
        if (this.f10323o0 != null && (secretChat2 = this.f10329r0) != null && secretChat2.f25419id == secretChat.f25419id) {
            this.f10329r0 = secretChat;
            m31754Ti();
        }
    }

    public static boolean m31574nj(TdApi.Message message) {
        return message.sendingState == null && message.schedulingState == null;
    }

    public void m31573nk(TdApi.Error error) {
        m31651en(C4779t2.m25378z5(error));
        m31723Wm(false);
    }

    public void m31572nl(TdApi.Supergroup supergroup) {
        TdApi.Supergroup supergroup2;
        if (!m9347Sa() && (supergroup2 = this.f10337v0) != null && supergroup2.f25425id == supergroup.f25425id) {
            this.f10337v0 = supergroup;
            m31682bj();
            m31763Si();
            m31561on(false);
        }
    }

    public void m31564ok(ArrayList arrayList, Runnable runnable, long j, long j2, final TdApi.Error error) {
        if (error != null) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31573nk(error);
                }
            });
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TdApi.Function function = (TdApi.Function) it.next();
            int constructor = function.getConstructor();
            if (constructor == -540350914) {
                ((TdApi.SetChatSlowModeDelay) function).chatId = j2;
            } else if (constructor == 164282047) {
                ((TdApi.SetChatTitle) function).chatId = j2;
            } else if (constructor == 1957213277) {
                ((TdApi.SetChatDescription) function).chatId = j2;
            } else {
                throw new UnsupportedOperationException(function.toString());
            }
        }
        runnable.run();
    }

    public void m31563ol(TdApi.Supergroup supergroup) {
        TdApi.Supergroup supergroup2;
        if (!m9347Sa() && (supergroup2 = this.f10337v0) != null && supergroup2.f25425id == supergroup.f25425id) {
            m31492wm(supergroup);
        }
    }

    public void m31555pk(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        m31772Ri();
    }

    public void m31554pl(TdApi.User user) {
        if (!m9347Sa()) {
            this.f10327q0 = user;
            m31561on(true);
            m31682bj();
            m31718Xi();
        }
    }

    public void m31546qk(View view, int i) {
        if (i != 0) {
            this.f10274A1 = view;
            m31616im();
        }
    }

    public Object m31545ql(TdApi.ChatInviteLink chatInviteLink, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27872h2(new C10534a9(this.f30165a, this.f30167b), chatInviteLink.creatorUserId);
        }
        return null;
    }

    public boolean m31537rk(View view, int i) {
        if (i != R.id.btn_open) {
            switch (i) {
                case R.id.btn_changePhotoCamera:
                    C1379j0.m37343Y(this.f30165a);
                    return true;
                case R.id.btn_changePhotoDelete:
                    this.f30167b.m2270r4().m14783o(new TdApi.SetChatPhoto(this.f10323o0.f25367id, null), this.f30167b.m2392ja());
                    return true;
                case R.id.btn_changePhotoGallery:
                    C1379j0.m37340a0(false);
                    return true;
                default:
                    return true;
            }
        } else {
            m31571nm();
            return true;
        }
    }

    public static Object m31536rl(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        if (i3 == 0) {
            return C4403w.m27889d2(z);
        }
        return null;
    }

    public static TdApi.SearchMessagesFilter[] m31529sj() {
        boolean U2 = C4868i.m24726c2().m24784U2();
        TdApi.SearchMessagesFilter[] searchMessagesFilterArr = U2 ? f10272K1 : f10271J1;
        if (searchMessagesFilterArr != null) {
            return searchMessagesFilterArr;
        }
        if (U2) {
            TdApi.SearchMessagesFilter[] searchMessagesFilterArr2 = {new TdApi.SearchMessagesFilterPhoto(), new TdApi.SearchMessagesFilterVideo(), new TdApi.SearchMessagesFilterDocument(), new TdApi.SearchMessagesFilterUrl(), new TdApi.SearchMessagesFilterAudio(), new TdApi.SearchMessagesFilterAnimation(), new TdApi.SearchMessagesFilterVoiceNote(), new TdApi.SearchMessagesFilterVideoNote()};
            f10272K1 = searchMessagesFilterArr2;
            return searchMessagesFilterArr2;
        }
        TdApi.SearchMessagesFilter[] searchMessagesFilterArr3 = {new TdApi.SearchMessagesFilterPhotoAndVideo(), new TdApi.SearchMessagesFilterDocument(), new TdApi.SearchMessagesFilterUrl(), new TdApi.SearchMessagesFilterAudio(), new TdApi.SearchMessagesFilterAnimation(), new TdApi.SearchMessagesFilterVoiceNote(), new TdApi.SearchMessagesFilterVideoNote()};
        f10271J1 = searchMessagesFilterArr3;
        return searchMessagesFilterArr3;
    }

    public boolean m31528sk(View view, int i) {
        if (i != R.id.btn_destroyChat) {
            return true;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.DeleteChat(C7316a.m17059b(this.f10337v0.f25425id)), this.f30167b.m2392ja());
        this.f30167b.m2485dd().m3703U2(this, mo9464C9());
        return true;
    }

    public void m31527sl(TdApi.Object object) {
        TdApi.ChatInviteLink chatInviteLink;
        TdApi.ChatInviteLink[] chatInviteLinkArr = ((TdApi.ChatInviteLinks) object).inviteLinks;
        int length = chatInviteLinkArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                chatInviteLink = null;
                break;
            }
            chatInviteLink = chatInviteLinkArr[i];
            if (chatInviteLink.isPrimary && !chatInviteLink.isRevoked) {
                break;
            }
            i++;
        }
        if (chatInviteLink != null) {
            mo31500w4(chatInviteLink);
        }
    }

    public boolean m31519tk(View view, int i) {
        if (i == R.id.btn_destroyChat) {
            String i1 = C4403w.m27869i1(this.f10337v0.isChannel ? R.string.DestroyChannelHint : R.string.DestroyGroupHint);
            int[] iArr = {R.id.btn_destroyChat, R.id.btn_cancel};
            String[] strArr = new String[2];
            strArr[0] = C4403w.m27869i1(this.f10337v0.isChannel ? R.string.DestroyChannel : R.string.DestroyGroup);
            strArr[1] = C4403w.m27869i1(R.string.Cancel);
            m9261ee(i1, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i2) {
                    boolean sk;
                    sk = View$OnClickListenerC3062so.this.m31528sk(view2, i2);
                    return sk;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            });
        }
        return true;
    }

    public void m31518tl(final TdApi.Object object) {
        if (object.getConstructor() == 112891427) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31527sl(object);
                }
            });
        }
    }

    public static int m31512uj() {
        return C2139ap.m35479W(2) + C2139ap.m35479W(8);
    }

    public Object m31511uk(TdApi.Chat chat, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return new C3072j(chat);
    }

    public boolean m31510ul(TdApi.ChatInviteLink chatInviteLink, View view, int i) {
        if (i != R.id.btn_revokeLink) {
            return true;
        }
        this.f30167b.m2270r4().m14783o(new TdApi.RevokeChatInviteLink(this.f10323o0.f25367id, chatInviteLink.inviteLink), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3062so.this.m31518tl(object);
            }
        });
        return true;
    }

    public void m31503vk() {
        this.f30167b.m2270r4().m14783o(new TdApi.SetChatDiscussionGroup(this.f10323o0.f25367id, 0L), this.f30167b.m2392ja());
    }

    public boolean m31502vl(final TdApi.ChatInviteLink chatInviteLink, View view, int i) {
        switch (i) {
            case R.id.btn_copyLink:
                C1379j0.m37325i(chatInviteLink.inviteLink, R.string.CopiedLink);
                break;
            case R.id.btn_manageInviteLinks:
                m31598km();
                break;
            case R.id.btn_manageJoinRequests:
                m31580mm();
                break;
            case R.id.btn_revokeLink:
                m9261ee(C4403w.m27869i1(this.f30167b.m2784K6(this.f10323o0.f25367id) ? R.string.AreYouSureRevokeInviteLinkChannel : R.string.AreYouSureRevokeInviteLinkGroup), new int[]{R.id.btn_revokeLink, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.RevokeLink), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_link_off_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i2) {
                        boolean ul;
                        ul = View$OnClickListenerC3062so.this.m31510ul(chatInviteLink, view2, i2);
                        return ul;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i2) {
                        return C5115g0.m23934b(this, i2);
                    }
                });
                break;
            case R.id.btn_shareLink:
                String Q3 = this.f30167b.m2691Q3(this.f10323o0.f25367id);
                String j1 = C4403w.m27865j1(this.f30167b.m2784K6(this.f10323o0.f25367id) ? R.string.ShareTextChannelLink : R.string.ShareTextChatLink, Q3, chatInviteLink.inviteLink);
                String j12 = C4403w.m27865j1(R.string.ShareTextLink, Q3, chatInviteLink.inviteLink);
                x00 x00Var = new x00(this.f30165a, this.f30167b);
                x00Var.m30994Vi(new x00.C3281m(j12).m30884E(j1, null));
                x00Var.m30960ej();
                break;
        }
        return true;
    }

    public boolean m31494wk(View$OnClickListenerC2928qj qjVar, C4601c3 c3Var) {
        m31787Pl(qjVar, c3Var.m27047e(), true);
        return true;
    }

    public void m31493wl(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (m9347Sa()) {
            return;
        }
        if (this.f10321n0 == 3) {
            m31656ei(supergroupFullInfo);
        } else {
            m31665di(supergroupFullInfo);
        }
    }

    public boolean m31486xk(TdApi.Chat chat, C4403w.AbstractC4409f fVar, View view, int i) {
        if (i != R.id.btn_delete) {
            if (i == R.id.btn_new) {
                C3073k kVar = new C3073k();
                ArrayList<C4618d7> arrayList = new ArrayList<>();
                C10930q6 q6Var = this.f30167b;
                arrayList.add(new C4618d7(q6Var, q6Var.m2550Z9()));
                C3034s5 s5Var = new C3034s5(this.f30165a, this.f30167b);
                s5Var.m32004ef(kVar);
                s5Var.m32003ff(arrayList);
                m9291ac(s5Var);
            } else if (i == R.id.btn_search) {
                View$OnClickListenerC2928qj qjVar = new View$OnClickListenerC2928qj(this.f30165a, this.f30167b);
                qjVar.m33006Tg(new View$OnClickListenerC2928qj.C2930b(1).m33003a(new View$OnClickListenerC2928qj.AbstractC2931c() {
                    @Override
                    public final boolean mo33002a(View$OnClickListenerC2928qj qjVar2, C4601c3 c3Var) {
                        boolean wk;
                        wk = View$OnClickListenerC3062so.this.m31494wk(qjVar2, c3Var);
                        return wk;
                    }
                }));
                m9291ac(qjVar);
            }
        } else if (chat != null) {
            m9329Ud(C4403w.m27873h1(R.string.UnlinkGroupConfirm, fVar, this.f30167b.m2661S3(chat)), C4403w.m27869i1(R.string.UnlinkGroupDone), R.drawable.baseline_remove_circle_24, 2, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31503vk();
                }
            });
        }
        return true;
    }

    public void m31485xl(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (!m9347Sa()) {
            if (this.f30167b.m2256s2(this.f10323o0)) {
                m31525sn(R.id.btn_inviteLink);
            }
            if (m31744Uj()) {
                m31525sn(R.id.btn_channelType);
                m31525sn(R.id.btn_linkedChat);
                int i = this.f10321n0;
                if (i == 7 || i == 6) {
                    int N0 = this.f10279D0.m34224N0(R.id.btn_linkedChat);
                    boolean z = true;
                    boolean z2 = N0 != -1;
                    boolean z3 = m31879Ei() && (this.f10321n0 == 7 || supergroupFullInfo.linkedChatId != 0);
                    if (z2 != z3) {
                        if (z3) {
                            int N02 = this.f10279D0.m34224N0(R.id.btn_channelType);
                            if (N02 != -1) {
                                int i2 = N02 + 1;
                                this.f10279D0.m34240F0().add(i2, new C2964ra(11));
                                this.f10279D0.m34240F0().add(N02 + 2, m31670cm());
                                this.f10279D0.m39308M(i2, 2);
                            } else {
                                int N03 = this.f10279D0.m34224N0(R.id.btn_manageInviteLinks);
                                if (N03 != -1) {
                                    this.f10279D0.m34240F0().add(N03, new C2964ra(11));
                                    this.f10279D0.m34240F0().add(N03, m31670cm());
                                    this.f10279D0.m39308M(N03, 2);
                                } else {
                                    int N04 = this.f10279D0.m34224N0(R.id.shadowMiddle);
                                    if (N04 != -1) {
                                        int i3 = N04 + 1;
                                        this.f10279D0.m34240F0().add(i3, new C2964ra(2));
                                        this.f10279D0.m34240F0().add(N04 + 2, m31670cm());
                                        this.f10279D0.m34240F0().add(N04 + 3, new C2964ra(3));
                                        this.f10279D0.m39308M(i3, 3);
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                        } else if (this.f10279D0.m34224N0(R.id.btn_channelType) != -1) {
                            this.f10279D0.m34204V1(N0 - 1, 2);
                        } else if (this.f10279D0.m34224N0(R.id.btn_manageInviteLinks) != -1) {
                            this.f10279D0.m34204V1(N0, 2);
                        } else {
                            this.f10279D0.m34204V1(N0 - 1, 3);
                        }
                        if (z) {
                            m31616im();
                        }
                    }
                }
                m31709Yi();
            }
            m31781Qi();
            m31736Vi();
            if (this.f10321n0 == 7) {
                m31815Mi();
            }
            m31561on(false);
        }
    }

    public void m31478yk() {
        this.f30167b.m2270r4().m14783o(new TdApi.SetChatDiscussionGroup(0L, this.f10323o0.f25367id), this.f30167b.m2392ja());
    }

    public void m31477yl(boolean z, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (m9347Sa()) {
            return;
        }
        if (z) {
            C4017n nVar = this.f10341x0;
            if (nVar != null) {
                nVar.m29304p0(basicGroupFullInfo.members);
            }
            m31759Sm();
            m31781Qi();
            return;
        }
        m31683bi(basicGroupFullInfo);
    }

    public boolean m31470zk(C4403w.AbstractC4409f fVar, TdApi.Chat chat, View view, int i) {
        if (i == R.id.btn_delete) {
            m9329Ud(C4403w.m27873h1(R.string.UnlinkChannelConfirm, fVar, this.f30167b.m2661S3(chat)), C4403w.m27869i1(R.string.UnlinkChannelDone), R.drawable.baseline_remove_circle_24, 2, new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31478yk();
                }
            });
        }
        return true;
    }

    public void m31469zl(boolean z, TdApi.UserFullInfo userFullInfo) {
        if (z) {
            m31691aj();
            m31745Ui();
            return;
        }
        m31674ci(userFullInfo);
    }

    @Override
    public boolean mo493A3(View view, int i) {
        switch (i) {
            case R.id.btn_copyLink:
                String Cj = m31894Cj();
                if (C5070i.m24061i(Cj)) {
                    return true;
                }
                C1379j0.m37325i(C4779t2.m25694F1(Cj), R.string.CopiedLink);
                return true;
            case R.id.btn_copyText:
                m31655ej();
                return true;
            case R.id.btn_copyUsername:
                String Cj2 = m31894Cj();
                if (C5070i.m24061i(Cj2)) {
                    return true;
                }
                C1379j0.m37325i("@" + Cj2, R.string.CopiedUsername);
                return true;
            case R.id.btn_editUsername:
                m31619ij();
                return true;
            case R.id.btn_manageInviteLinks:
                m31598km();
                return true;
            case R.id.btn_manageJoinRequests:
                m31580mm();
                return true;
            case R.id.btn_share:
                if (m31669cn(false)) {
                    return true;
                }
                this.f30167b.m2485dd().m3433v3(this, i, this.f10327q0);
                return true;
            default:
                this.f30167b.m2485dd().m3433v3(this, i, this.f10327q0);
                return true;
        }
    }

    @Override
    public boolean mo23866A6() {
        return C5127l0.m23869a(this);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9477Ac() {
        super.mo9477Ac();
        if (this.f10321n0 == 1) {
            this.f30167b.m2485dd().m3657Y8(R.id.menu_secretChat, this.f30156R, this.f10323o0, true);
        }
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10080W3(mo418W9(), this, m9456Da());
        }
    }

    public final int m31911Ai() {
        int i;
        int i2 = this.f10321n0;
        int i3 = 0;
        if (i2 == 1 || i2 == 0) {
            i3 = 0 + C1357a0.m37541i(48.0f);
        }
        if (this.f10321n0 == 1 && C7316a.m17051j(this.f10323o0.f25367id) && this.f30167b.m2220u6(this.f10323o0)) {
            i3 += C1357a0.m37541i(39.0f);
        }
        int W9 = mo418W9();
        if (W9 == R.id.menu_profile) {
            if (m31847Ii()) {
                i3 += C1357a0.m37541i(49.0f);
            }
            if (m31895Ci()) {
                i3 += C1357a0.m37541i(49.0f);
            }
            i = C1357a0.m37541i(49.0f);
        } else if (W9 != R.id.menu_profile_manage) {
            i = C1357a0.m37541i(49.0f);
        } else if (!m31838Jj()) {
            return i3;
        } else {
            i = C1357a0.m37541i(49.0f);
        }
        return i3 + i;
    }

    public final String[] m31910Aj() {
        ArrayList<i10<?>> qj = m31547qj();
        String[] strArr = new String[qj.size()];
        Iterator<i10<?>> it = qj.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            strArr[i] = it.next().mo9313X9().toString().toUpperCase();
        }
        return strArr;
    }

    public final void m31907Am() {
        m31883Dm(this.f10279D0.m34224N0(R.id.btn_inviteLink));
    }

    @Override
    public void mo1557B0(final TdApi.SecretChat secretChat) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31581ml(secretChat);
            }
        });
    }

    @Override
    public void mo4076B4(long j, String[] strArr) {
        C10721i0.m4195b(this, j, strArr);
    }

    @Override
    public boolean mo23839B5(View view) {
        m31548qi();
        return false;
    }

    public final int m31903Bi(int i) {
        int i2;
        if (this.f10276B1 == i && (i2 = this.f10278C1) > 0) {
            return i2;
        }
        int i3 = 0;
        int i4 = 0;
        for (C2964ra raVar : this.f10279D0.m34240F0()) {
            i3 += m31472zi(i4, i, raVar);
            i4++;
        }
        this.f10276B1 = i;
        this.f10278C1 = i3;
        return i3;
    }

    public final void m31899Bm() {
        if (this.f10321n0 == 3) {
            m31883Dm(this.f10279D0.m34224N0(R.id.membersList));
        }
    }

    @Override
    public void mo4075C5(long j, long j2) {
        C10721i0.m4178s(this, j, j2);
    }

    @Override
    public long mo9464C9() {
        TdApi.Chat chat = this.f10323o0;
        if (chat != null) {
            return chat.f25367id;
        }
        return 0L;
    }

    @Override
    public void mo420Cc(String str) {
        AbstractC9323v4<?> oj = m31565oj();
        if (oj != null) {
            ((i10) oj).m34410Ag(str.trim());
        }
    }

    @Override
    public void mo9460Ce(int i, LinearLayout linearLayout) {
        View childAt;
        View findViewById;
        AbstractC9323v4<?> oj = m31565oj();
        int i2 = 0;
        ViewGroup viewGroup = (ViewGroup) linearLayout.getChildAt(0);
        if (viewGroup != null) {
            LinearLayout linearLayout2 = (LinearLayout) viewGroup.getChildAt(0);
            if (linearLayout2 != null) {
                int W9 = mo418W9();
                int i3 = 8;
                if (W9 == R.id.menu_profile) {
                    View findViewById2 = linearLayout2.findViewById(R.id.menu_btn_manage);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(m31847Ii() ? 0 : 8);
                    }
                    View findViewById3 = linearLayout2.findViewById(R.id.menu_btn_addContact);
                    if (findViewById3 != null) {
                        if (m31895Ci()) {
                            i3 = 0;
                        }
                        findViewById3.setVisibility(i3);
                    }
                } else if (W9 == R.id.menu_profile_manage && (findViewById = linearLayout2.findViewById(R.id.menu_btn_more)) != null) {
                    if (m31838Jj()) {
                        i3 = 0;
                    }
                    findViewById.setVisibility(i3);
                }
            }
            LinearLayout linearLayout3 = (LinearLayout) viewGroup.getChildAt(1);
            if (!(linearLayout3 == null || (childAt = linearLayout3.getChildAt(0)) == null)) {
                if (oj == null || !((i10) oj).mo33500rf()) {
                    i2 = 4;
                }
                childAt.setVisibility(i2);
            }
            m31552pn();
        }
    }

    public boolean m31895Ci() {
        TdApi.ChatMemberStatus K3 = this.f30167b.m2787K3(this.f10323o0.f25367id);
        return (K3 == null || K3.getConstructor() == -5815259 || (!this.f30167b.m2160y2(this.f10323o0) && !m31887Di() && !m31839Ji())) ? false : true;
    }

    public final String m31894Cj() {
        return this.f30167b.m2462f4(this.f10323o0.f25367id);
    }

    public final void m31891Cm(long[] jArr) {
        int e = this.f10283F0.mo8825e();
        for (int i = 0; i < e; i++) {
            AbstractC9323v4<?> v = this.f10283F0.m18455v(i);
            if (v != null) {
                ((i10) v).m34329zg(jArr);
            }
        }
        m31468zm();
    }

    @Override
    public void mo3249D2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        m31771Rj(notificationSettingsScope);
    }

    @Override
    public boolean mo1350D3() {
        return true;
    }

    @Override
    public String mo23865D6() {
        return C5127l0.m23868b(this);
    }

    public boolean m31887Di() {
        int i = this.f10321n0;
        if (i != 3 && i != 4) {
            return false;
        }
        int constructor = this.f10337v0.status.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != 82243562) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) this.f10337v0.status).canRestrictMembers;
    }

    public final void m31883Dm(int i) {
        if (i != -1) {
            this.f10315h1--;
            C2964ra remove = this.f10279D0.m34240F0().remove(i);
            if (this.f10315h1 == 0) {
                this.f10279D0.m34240F0().remove(i);
                this.f10279D0.m34240F0().remove(i);
                this.f10279D0.m39307N(i, 3);
            } else if (i == 1) {
                this.f10279D0.m34240F0().remove(i);
                this.f10279D0.m39307N(i, 2);
            } else {
                int i2 = i - 1;
                this.f10279D0.m34240F0().remove(i2);
                this.f10279D0.m39307N(i2, 2);
                int i3 = i - 1;
                if (i3 >= 0 && i3 < this.f10279D0.m34240F0().size()) {
                    boolean z = remove.m32876A() == 38;
                    C2964ra raVar = this.f10279D0.m34240F0().get(i3);
                    int A = raVar.m32876A();
                    int i4 = z ? 11 : 1;
                    if (A != i4 && (A == 1 || A == 11)) {
                        raVar.m32839f0(i4);
                        this.f10279D0.m39312I(i3);
                    }
                }
            }
            m31616im();
        }
    }

    @Override
    public void mo4051E2(final TdApi.Message message) {
        if (m31574nj(message)) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31608jl(message);
                }
            });
        }
    }

    @Override
    public void mo3248E5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        m31771Rj(notificationSettingsScope);
    }

    public final boolean m31879Ei() {
        return (this.f10339w0 != null && this.f30167b.m2352m2(this.f10323o0)) || (this.f10335u0 != null && this.f30167b.m2352m2(this.f10323o0));
    }

    public final void m31892Cl(final long j) {
        if (!m9347Sa()) {
            int i = this.f10321n0;
            if (i != 5 && i != 2) {
                return;
            }
            if (!m31744Uj() || this.f30167b.m2480e2().m1634i2(j) != null) {
                TdApi.Chat U2 = this.f30167b.m2632U2(C7316a.m17059b(j));
                if (U2 == null) {
                    this.f30167b.m2270r4().m14783o(new TdApi.CreateSupergroupChat(j, false), new Client.AbstractC7865g() {
                        @Override
                        public final void mo255t2(TdApi.Object object) {
                            View$OnClickListenerC3062so.this.m31884Dl(j, object);
                        }
                    });
                    return;
                }
                m31588ln();
                this.f10335u0 = null;
                this.f10333t0 = null;
                m31851Hm(new C3075m(U2, this.f10325p0, m9131x9().f10378c));
                m31624hn();
                m31521ti();
                m31561on(true);
                return;
            }
            this.f30167b.m2270r4().m14783o(new TdApi.GetSupergroupFullInfo(j), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31900Bl(j, object);
                }
            });
        }
    }

    public final boolean m31871Fi() {
        TdApi.Supergroup supergroup;
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
        return supergroupFullInfo != null && supergroupFullInfo.memberCount < 1000 && (supergroup = this.f10337v0) != null && C4779t2.m25623P2(supergroup.status);
    }

    public final void m31867Fm(boolean z) {
        final Runnable ulVar = new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31876El();
            }
        };
        this.f10343y0 = 0;
        this.f10345z0 = 0;
        if (z) {
            this.f30167b.m2270r4().m14783o(new TdApi.GetChatInviteLinkCounts(this.f10323o0.f25367id), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31860Gl(ulVar, object);
                }
            });
        } else {
            this.f30167b.m2270r4().m14783o(new TdApi.GetChatInviteLinks(this.f10323o0.f25367id, this.f30167b.m2519ba(), false, 0, null, 1), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31844Il(ulVar, object);
                }
            });
        }
    }

    @Override
    public void mo4074G5(long j, int i, boolean z) {
        C10721i0.m4173x(this, j, i, z);
    }

    @Override
    public View mo8869G9() {
        return this.f10275B0;
    }

    public final boolean m31863Gi() {
        int i = this.f10321n0;
        if (i == 2 || i == 3 || i == 4) {
            return m31879Ei();
        }
        return false;
    }

    public final int m31862Gj() {
        return m31903Bi(this.f10277C0.getMeasuredWidth());
    }

    public final void m31859Gm(int i) {
        AbstractC9323v4<?> oj = m31565oj();
        if (oj != null) {
            ((RecyclerView) oj.get()).scrollBy(0, i);
        }
    }

    @Override
    public void mo4050H(final long j, final long[] jArr) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31644fl(j, jArr);
            }
        });
    }

    @Override
    public void mo4073H0(long j, String str) {
        C10721i0.m4177t(this, j, str);
    }

    @Override
    public void mo9429H8(LinearLayout linearLayout, float f) {
        FrameLayoutFix frameLayoutFix = (FrameLayoutFix) linearLayout.getChildAt(0);
        LinearLayout linearLayout2 = (LinearLayout) frameLayoutFix.getChildAt(0);
        LinearLayout linearLayout3 = (LinearLayout) frameLayoutFix.getChildAt(1);
        float c3 = View$OnClickListenerC9170d1.m10066c3(false);
        float interpolation = C2057b.f7281c.getInterpolation(f);
        linearLayout2.setTranslationY((-c3) * m31628hj(f));
        linearLayout2.setAlpha(1.0f - interpolation);
        for (int i = 0; i < linearLayout2.getChildCount(); i++) {
            View childAt = linearLayout2.getChildAt(i);
            if (childAt instanceof C9310u0) {
                C9310u0 u0Var = (C9310u0) childAt;
                C9239m mVar = this.f10275B0;
                u0Var.m9517h(R.id.theme_color_headerIcon, R.id.theme_color_white, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f);
            }
        }
        linearLayout3.setTranslationY(c3 - (f * c3));
        linearLayout3.setAlpha(interpolation);
    }

    @Override
    public boolean mo9423He() {
        return !m31744Uj();
    }

    public final boolean m31855Hi(long j) {
        TdApi.ChatMember h0;
        TdApi.ChatMember h02;
        int i = this.f10321n0;
        if (i != 2) {
            if ((i != 3 && i != 4) || this.f10341x0 == null || this.f30167b.m2379k7(j) || (h02 = this.f10341x0.m29312h0(j)) == null || C4779t2.m25623P2(h02.status)) {
                return false;
            }
            long ba2 = this.f30167b.m2519ba();
            if (C4779t2.m25623P2(this.f10337v0.status) || h02.inviterUserId == ba2) {
                return true;
            }
            return C4779t2.m25679H2(this.f10337v0.status) && !C4779t2.m25679H2(h02.status);
        } else if (this.f10341x0 == null || this.f30167b.m2379k7(j) || this.f10335u0 == null || (h0 = this.f10341x0.m29312h0(j)) == null || C4779t2.m25623P2(h0.status)) {
            return false;
        } else {
            long ba3 = this.f30167b.m2519ba();
            if (C4779t2.m25623P2(this.f10333t0.status) || this.f10335u0.creatorUserId == ba3 || h0.inviterUserId == ba3) {
                return true;
            }
            return C4779t2.m25679H2(this.f10333t0.status) && !C4779t2.m25679H2(h0.status);
        }
    }

    public void m31851Hm(C3075m mVar) {
        super.m9476Ad(mVar);
        TdApi.Chat chat = mVar.f10376a;
        this.f10323o0 = chat;
        this.f10325p0 = mVar.f10377b;
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                TdApi.Supergroup l2 = this.f30167b.m2480e2().m1623l2(C7316a.m17045p(this.f10323o0.f25367id));
                this.f10337v0 = l2;
                this.f10321n0 = l2.isChannel ? 4 : 3;
                break;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                this.f10329r0 = this.f30167b.m2480e2().m1687T1(C7316a.m17047n(this.f10323o0.f25367id));
                this.f10327q0 = this.f30167b.m2480e2().m1698Q2(this.f10329r0.userId);
                this.f10321n0 = 1;
                break;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                this.f10333t0 = this.f30167b.m2480e2().m1693S(C7316a.m17048m(this.f10323o0.f25367id));
                this.f10321n0 = 2;
                break;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                this.f10327q0 = this.f30167b.m2480e2().m1698Q2(C7316a.m17044q(this.f10323o0.f25367id));
                this.f10321n0 = 0;
                break;
        }
        if (mVar.f10378c) {
            int i = this.f10321n0;
            if (i == 2) {
                this.f10321n0 = 5;
            } else if (i == 3) {
                this.f10321n0 = 6;
            } else if (i == 4) {
                this.f10321n0 = 7;
            }
            int i2 = this.f10321n0;
            if (i2 == 5) {
                TdApi.BasicGroupFullInfo O = this.f30167b.m2480e2().m1708O(this.f10333t0.f25363id);
                this.f10335u0 = O;
                if (O == null) {
                    throw new IllegalStateException("id:" + this.f10333t0.f25363id);
                }
            } else if (i2 == 6 || i2 == 7) {
                TdApi.SupergroupFullInfo i22 = this.f30167b.m2480e2().m1634i2(this.f10337v0.f25425id);
                this.f10339w0 = i22;
                if (i22 == null) {
                    throw new IllegalStateException("id:" + this.f10337v0.f25425id);
                }
            }
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        C5459x0 x0Var = this.f10316i1;
        if (x0Var != null) {
            x0Var.m22638F(Log.TAG_CRASH, C4403w.m27984G2());
            if (this.f10279D0 != null) {
                m31525sn(R.id.btn_description);
            }
        }
        C9391z4 z4Var = this.f10285G0;
        if (z4Var != null) {
            z4Var.mo8255s();
        }
        FrameLayoutFix frameLayoutFix = this.f10306Y0;
        int i = 5;
        if (frameLayoutFix != null) {
            int childCount = frameLayoutFix.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f10306Y0.getChildAt(i2);
                if (C1399s0.m37189c0(childAt, C4403w.m27984G2() ? 3 : 5)) {
                    if (childAt instanceof C9310u0) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        if (C4403w.m27984G2()) {
                            layoutParams.leftMargin = C1357a0.m37541i(12.0f);
                            layoutParams.rightMargin = 0;
                        } else {
                            layoutParams.rightMargin = C1357a0.m37541i(12.0f);
                            layoutParams.leftMargin = 0;
                        }
                        childAt.setTranslationX(Math.abs(childAt.getTranslationX()) * (C4403w.m27984G2() ? 1.0f : -1.0f));
                    }
                    C1399s0.m37145y0(childAt);
                }
            }
        }
        if (C1399s0.m37189c0(this.f10307Z0, C4403w.m27984G2() ? 5 : 3)) {
            C1399s0.m37145y0(this.f10307Z0);
        }
        ImageView imageView = this.f10308a1;
        if (!C4403w.m27984G2()) {
            i = 3;
        }
        if (C1399s0.m37189c0(imageView, i)) {
            C1399s0.m37145y0(this.f10308a1);
        }
        C7045v2 v2Var = this.f10281E0;
        if (v2Var != null) {
            v2Var.mo8255s();
        }
    }

    @Override
    public boolean mo9416Ie() {
        return !m9285bb();
    }

    public final boolean m31847Ii() {
        if (this.f30167b.m2352m2(this.f10323o0)) {
            return true;
        }
        int i = this.f10321n0;
        if (i == 3) {
            return C4779t2.m25679H2(this.f10337v0.status);
        }
        if (i != 4) {
            return false;
        }
        return C4779t2.m25679H2(this.f10337v0.status);
    }

    public final void m31843Im(boolean z) {
        if (this.f10299R0 != z) {
            this.f10299R0 = z;
        }
    }

    @Override
    public void mo419J(int i, View view) {
        switch (i) {
            case R.id.menu_btn_addContact:
                m31611ji(view);
                return;
            case R.id.menu_btn_call:
                if (this.f10331s0 != null) {
                    this.f30167b.m2930B4().m4713c0().m4549t0(this, this.f10327q0.f25439id, this.f10331s0);
                    return;
                }
                return;
            case R.id.menu_btn_clear:
                m9341T8();
                return;
            case R.id.menu_btn_manage:
                m31760Sl();
                return;
            case R.id.menu_btn_more:
                m31642fn();
                return;
            case R.id.menu_btn_search:
                AbstractC9323v4<?> oj = m31565oj();
                if (oj != null && ((i10) oj).mo33500rf()) {
                    m9303Yc();
                    return;
                }
                return;
            case R.id.menu_btn_stopwatch:
                this.f30167b.m2485dd().m3747P8(mo4347s(), this.f10323o0);
                return;
            default:
                return;
        }
    }

    @Override
    public void mo1349J3(long j, TdApi.UserStatus userStatus, boolean z) {
        C9239m mVar;
        int i = this.f10321n0;
        if ((i == 0 || i == 1) && (mVar = this.f10275B0) != null) {
            mVar.setSubtitle(m31769Rl(false));
            this.f10275B0.setExpandedSubtitle(m31769Rl(true));
        }
    }

    @Override
    public void mo4049J5(long j, long j2) {
        C10722i1.m4167e(this, j, j2);
    }

    @Override
    public void mo9414J8(float f, boolean z) {
        super.mo9414J8(f, z);
        this.f10285G0.getTopView().setDisabledFactor(f);
        m31727Wi();
        m31843Im(f != 0.0f);
    }

    @Override
    public int mo9413J9() {
        if (m31744Uj()) {
            return 0;
        }
        return R.drawable.baseline_chat_bubble_24;
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        super.mo8866Ja(i, i2);
        C2546iq iqVar = this.f10279D0;
        if (iqVar != null) {
            iqVar.mo9343T5(i, i2);
        }
    }

    @Override
    public boolean mo9409Je() {
        return true;
    }

    public boolean m31839Ji() {
        int i = this.f10321n0;
        if (i == 2) {
            return C4779t2.m25623P2(this.f10333t0.status);
        }
        if (i != 3 && i != 4) {
            return false;
        }
        int constructor = this.f10337v0.status.getConstructor();
        if (constructor == -160019714) {
            return true;
        }
        if (constructor != 82243562) {
            return false;
        }
        return ((TdApi.ChatMemberStatusAdministrator) this.f10337v0.status).canPromoteMembers;
    }

    public final boolean m31838Jj() {
        return m31871Fi();
    }

    public final boolean m31835Jm(String str) {
        if (C5070i.m24061i(str) && m31863Gi()) {
            str = C4403w.m27869i1(R.string.Description);
        }
        String str2 = str;
        C5459x0 x0Var = this.f10316i1;
        int i = 0;
        if (x0Var != null && x0Var.m22616v().equals(str2)) {
            return false;
        }
        C5459x0 x0Var2 = new C5459x0(this.f30167b, str2, AbstractC4761s4.m26211D9(), C5428t.AbstractC5441d.f17872C, 7, new HandlerC10770jj.C10788q().m3316o(mo9464C9()));
        this.f10316i1 = x0Var2;
        if (C4403w.m27984G2()) {
            i = Log.TAG_CRASH;
        }
        x0Var2.m22635a(i | 8);
        this.f10316i1.m22642B(m31870Fj(C1357a0.m37543g()));
        return true;
    }

    @Override
    public void mo4072K3(long j, boolean z) {
        C10721i0.m4188i(this, j, z);
    }

    @Override
    public void mo9407K8(float f) {
        if (this.f30156R != null) {
            float hj = m31628hj(f);
            m31579mn();
            RunnableC9355x0 filling = this.f30156R.getFilling();
            float f2 = 0.0f;
            if (hj == 0.0f) {
                f2 = 1.0f;
            }
            filling.m9007s0(f2);
            int d = C5064d.m24128d(C11524j.m161p0(), C11524j.m217S0(), hj);
            if (m31744Uj()) {
                this.f30156R.m10041n4(mo407R9(), d);
                return;
            }
            C9239m mVar = this.f10275B0;
            if (mVar != null) {
                mVar.setTextColor(d);
                this.f10275B0.setMuteFadeFactor(f);
            }
        }
    }

    @Override
    public boolean mo9401Ke() {
        return !m9363Pd();
    }

    public final void m31832Kh(float f) {
        float Bj = m31902Bj() * (1.0f - f);
        C9279r rVar = this.f10307Z0;
        if (rVar != null) {
            rVar.setTranslationY(Bj);
            this.f10308a1.setTranslationY(Bj);
            this.f10311d1.setTranslationY(Bj);
            this.f10310c1.setTranslationY(Bj);
            this.f10309b1.setTranslationY(Bj);
            this.f10313f1.setTranslationY(Bj);
            this.f10312e1.setTranslationY(Bj);
        }
    }

    public final void m31831Ki() {
        C5320c cVar = new C5320c(4);
        C5146u0 u0Var = new C5146u0(4);
        C5320c cVar2 = new C5320c(4);
        C5320c cVar3 = new C5320c(4);
        TdApi.Chat chat = this.f10323o0;
        if (!(chat == null || chat.photo == null || m31744Uj())) {
            cVar.m23284a(R.id.btn_open);
            u0Var.m23816a(R.string.Open);
            cVar3.m23284a(R.drawable.baseline_visibility_24);
            cVar2.m23284a(1);
        }
        cVar.m23284a(R.id.btn_changePhotoCamera);
        u0Var.m23816a(R.string.ChatCamera);
        cVar3.m23284a(R.drawable.baseline_camera_alt_24);
        cVar2.m23284a(1);
        cVar.m23284a(R.id.btn_changePhotoGallery);
        u0Var.m23816a(R.string.Gallery);
        cVar3.m23284a(R.drawable.baseline_image_24);
        cVar2.m23284a(1);
        TdApi.Chat chat2 = this.f10323o0;
        if (!(chat2 == null || chat2.photo == null)) {
            cVar.m23284a(R.id.btn_changePhotoDelete);
            u0Var.m23816a(R.string.Delete);
            cVar3.m23284a(R.drawable.baseline_delete_24);
            cVar2.m23284a(2);
        }
        m9261ee(null, cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), cVar3.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean rk;
                rk = View$OnClickListenerC3062so.this.m31537rk(view, i);
                return rk;
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

    public final boolean m31830Kj() {
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
        int i = supergroupFullInfo != null ? supergroupFullInfo.slowModeDelay : 0;
        C2964ra raVar = this.f10326p1;
        return (raVar == null || i == C7322f.f23230a[raVar.m32826s()]) ? false : true;
    }

    public final void m31827Km(boolean z) {
        if (this.f10303V0 != z) {
            this.f10303V0 = z;
            AbstractC9323v4<?> oj = m31565oj();
            if (oj != null) {
                ((i10) oj).m34397Jf().requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    @Override
    public void mo4071L0(final long j, int i) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31743Uk(j);
            }
        });
    }

    @Override
    public void mo9399L8() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.getFilling().m9023j0(C11524j.m148w());
        }
    }

    @Override
    public int mo9398L9() {
        return m9285bb() ? R.id.theme_color_filling : super.mo9398L9();
    }

    public final void m31823Li(int i) {
        int min = Math.min(m31751Tl(), i);
        int yi = m31480yi();
        if (yi != min) {
            this.f10277C0.scrollBy(0, min - yi);
        }
    }

    public final boolean m31822Lj(TdApi.SearchMessagesFilter searchMessagesFilter, int i) {
        if (this.f10286G1.isEmpty()) {
            return false;
        }
        if (i < 0) {
            i = 0;
        }
        int size = this.f10286G1.size();
        for (int i2 = i; i2 < size; i2++) {
            i10<?> i10Var = this.f10286G1.get(i2);
            if (i10.m34385Pf(i10Var)) {
                if (searchMessagesFilter.getConstructor() == i10Var.mo33042wg().getConstructor()) {
                    return true;
                }
            }
        }
        return i > 0 && m31822Lj(searchMessagesFilter, 0);
    }

    public final void m31819Lm(boolean z) {
        if (this.f10322n1 != z) {
            this.f10322n1 = z;
            if (this.f10320m1 == null) {
                C6982o0 o0Var = new C6982o0(mo4347s());
                this.f10320m1 = o0Var;
                o0Var.setId(R.id.btn_done);
                this.f10320m1.setOnClickListener(this);
                this.f10273A0.addView(this.f10320m1);
            }
            this.f10320m1.m18184p(z, true);
        }
    }

    @Override
    public int mo8865M9() {
        if (m31744Uj()) {
            return super.mo8865M9();
        }
        return (int) (C4896n.m24478e() + (C4896n.m24477f(true) * ((RunnableC9248n) this.f10277C0).getScrollFactor()));
    }

    public final void m31815Mi() {
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
        boolean z = false;
        boolean z2 = supergroupFullInfo != null && supergroupFullInfo.canGetMembers;
        c20 yj = m31479yj();
        if (yj != null) {
            z = true;
        }
        if (z2 != z) {
            if (z2) {
                c20 Ch = new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterRecent());
                this.f10286G1.add(Ch);
                this.f10283F0.m18454w(this.f10286G1.size() - 1);
                this.f10285G0.getTopView().m10166J1(Ch.mo9313X9().toString().toUpperCase());
            } else {
                int indexOf = this.f10286G1.indexOf(yj);
                if (indexOf != -1) {
                    this.f10286G1.remove(indexOf);
                    this.f10285G0.getTopView().m10157V1();
                    this.f10283F0.m18453x(indexOf);
                } else {
                    return;
                }
            }
            this.f10283F0.m28888l();
        }
    }

    public final boolean m31814Mj() {
        TdApi.Chat chat = this.f10323o0;
        int i = chat != null ? chat.messageTtl : 0;
        C2964ra raVar = this.f10330r1;
        return (raVar == null || i == C7322f.f23231b[raVar.m32826s()]) ? false : true;
    }

    public final void m31811Mm(boolean z) {
        this.f10280D1 = z;
    }

    @Override
    public void mo8864N0(int i) {
        if (!this.f30167b.m2485dd().m3788L7(this, null, mo9464C9(), i, null)) {
            int i2 = this.f10321n0;
            if (i2 == 0 || i2 == 1) {
                if (this.f10331s0 != null && !this.f30167b.m2485dd().m3443u3(this, i, this.f10327q0, this.f10331s0)) {
                    switch (i) {
                        case R.id.btn_newSecretChat:
                            this.f30167b.m2485dd().m3717S8(this, this.f10327q0.f25439id, true, null);
                            return;
                        case R.id.more_btn_block:
                            boolean z = !this.f30167b.m2463f3(this.f10323o0.f25367id);
                            final boolean H6 = this.f30167b.m2832H6(this.f10323o0.f25367id);
                            if (z) {
                                CharSequence m1 = C4403w.m27853m1(H6 ? R.string.BlockBotConfirm : R.string.BlockUserConfirm, this.f30167b.m2691Q3(this.f10323o0.f25367id));
                                int[] iArr = {R.id.btn_blockSender, R.id.btn_cancel};
                                String[] strArr = new String[2];
                                strArr[0] = C4403w.m27869i1(H6 ? R.string.BlockBot : R.string.BlockContact);
                                strArr[1] = C4403w.m27869i1(R.string.Cancel);
                                m9261ee(m1, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_block_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                                    @Override
                                    public final boolean mo493A3(View view, int i3) {
                                        boolean hl;
                                        hl = View$OnClickListenerC3062so.this.m31626hl(H6, view, i3);
                                        return hl;
                                    }

                                    @Override
                                    public boolean mo492Q() {
                                        return C5115g0.m23935a(this);
                                    }

                                    @Override
                                    public Object mo491b2(int i3) {
                                        return C5115g0.m23934b(this, i3);
                                    }
                                });
                                return;
                            }
                            C10930q6 q6Var = this.f30167b;
                            q6Var.m2496d2(q6Var.m2183wb(this.f10323o0.f25367id), false, new Client.AbstractC7865g() {
                                @Override
                                public final void mo255t2(TdApi.Object object) {
                                    View$OnClickListenerC3062so.this.m31617il(H6, object);
                                }
                            });
                            return;
                        case R.id.more_btn_cloudChat:
                            this.f30167b.m2485dd().m3439u7(this, this.f10327q0.f25439id, null);
                            return;
                        case R.id.more_btn_delete:
                            this.f30167b.m2485dd().m3753P2(this, this.f10327q0.f25439id);
                            return;
                        case R.id.more_btn_privacy:
                            m31562om();
                            return;
                        default:
                            return;
                    }
                }
            } else if (i2 == 2 || i2 == 3 || i2 == 4) {
                switch (i) {
                    case R.id.btn_recentActions:
                        m31553pm();
                        return;
                    case R.id.more_btn_addMember:
                        m31611ji(null);
                        return;
                    case R.id.more_btn_editDescription:
                        m31610jj();
                        return;
                    case R.id.more_btn_join:
                        m31699Zj();
                        return;
                    case R.id.more_btn_privacy:
                        m31562om();
                        return;
                    case R.id.more_btn_share:
                        m31669cn(true);
                        return;
                    case R.id.more_btn_viewAdmins:
                        m31760Sl();
                        return;
                    case R.id.more_btn_viewStats:
                        m31544qm();
                        return;
                    default:
                        return;
                }
            } else if (i2 != 6 && i2 != 7) {
            } else {
                if (i == R.id.btn_destroyChat) {
                    m31646fj();
                } else if (i == R.id.btn_inviteLink) {
                    m31598km();
                }
            }
        }
    }

    @Override
    public void mo9384N8(C9270q1 q1Var) {
        super.mo9384N8(q1Var);
        if (!m31744Uj()) {
            ((RunnableC9248n) this.f10277C0).setFloatingButton(q1Var.m9759H());
        }
    }

    public final void m31807Ni() {
    }

    public final boolean m31806Nj() {
        C2964ra raVar = this.f10318k1;
        return (raVar != null && !C5070i.m24067c(this.f10323o0.title, raVar.m32821x())) || (this.f10319l1 != null && !C5070i.m24067c(m31538rj(), this.f10319l1.m32821x())) || m31814Mj() || m31830Kj();
    }

    public final void m31803Nm(float f) {
        this.f10295N0 = f;
        float f2 = this.f10292K0;
        float min = Math.min(f2, (((-m31854Hj()) - f2) * f) + f2);
        boolean z = true;
        this.f10289I0.m31462a(f);
        this.f10291J0.setTranslationY(min - (View$OnClickListenerC9170d1.m10066c3(true) * this.f10295N0));
        float c3 = View$OnClickListenerC9170d1.m10066c3(true);
        float translationY = this.f10291J0.getTranslationY() + c3 + m31854Hj();
        m9379Nd(translationY > c3 ? 0.0f : 1.0f - (translationY / c3));
        m31786Pm(translationY < (((float) View$OnClickListenerC9170d1.getTopOffset()) + (((float) View$OnClickListenerC9170d1.m10066c3(false)) / 2.0f)) - ((float) C1357a0.m37541i(8.0f)));
        if (translationY >= View$OnClickListenerC9170d1.m10066c3(true) - C1357a0.m37541i(16.0f)) {
            z = false;
        }
        m31705Ym(z);
        this.f10293L0 = min;
        m31678bn(min);
    }

    @Override
    public int mo9375O9() {
        if (m9285bb() && this.f10294M0) {
            return R.id.theme_color_icon;
        }
        C9239m mVar = this.f10275B0;
        return (mVar == null || mVar.m9814r1()) ? R.id.theme_color_headerIcon : R.id.theme_color_white;
    }

    public final void m31799Oi(int i) {
        m31790Pi(this.f10283F0.m18455v(i));
    }

    public final void m31798Oj(TdApi.SearchMessagesFilter searchMessagesFilter) {
        int xj = m31487xj(searchMessagesFilter.getConstructor());
        if (xj <= -1) {
            m31471zj(searchMessagesFilter, false);
            return;
        }
        int i = xj + 1;
        this.f10288H1.put(searchMessagesFilter.getConstructor(), i);
        if (!m31717Xj(searchMessagesFilter) && i == 1) {
            m31629hi(searchMessagesFilter);
        }
        m31534rn();
    }

    public final void m31795Om(boolean z) {
        if (this.f10294M0 != z && m31715Xl()) {
            this.f10294M0 = z;
            m31557pi(z ? 1.0f : 0.0f);
            if (!z && m9382Na()) {
                m9320W8(null);
            }
        }
    }

    @Override
    public void mo1348P1(final TdApi.User user) {
        TdApi.User user2;
        if (m31708Yj() && (user2 = this.f10327q0) != null && user2.f25439id == user.f25439id) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31554pl(user);
                }
            });
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        m31803Nm(f);
    }

    public void m31790Pi(AbstractC9323v4<?> v4Var) {
        int Ul = m31742Ul();
        int yi = m31480yi();
        if (v4Var != null) {
            ((i10) v4Var).m34333xf(yi, Ul);
        }
    }

    public final void m31789Pj() {
        this.f10342x1 = -1;
        this.f10344y1 = -1;
    }

    public final void m31787Pl(final AbstractC9323v4<?> v4Var, final long j, final boolean z) {
        final boolean E3 = this.f30167b.m2883E3(this.f10323o0.f25367id);
        final boolean E32 = this.f30167b.m2883E3(j);
        this.f30167b.m2480e2().m1627k2(C7316a.m17045p(j), new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC3062so.this.m31788Pk(v4Var, j, z, E3, E32, (TdApi.SupergroupFullInfo) obj);
            }
        });
    }

    public final void m31786Pm(boolean z) {
        if (this.f10298Q0 != z) {
            this.f10298Q0 = z;
            m31552pn();
        }
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23935a(this);
    }

    @Override
    public void mo9805Q5() {
        if (this.f30167b.m2352m2(this.f10323o0)) {
            m31831Ki();
        } else {
            m31571nm();
        }
    }

    @Override
    public int mo9360Q9() {
        return this.f10294M0 ? R.id.theme_color_text : super.mo9360Q9();
    }

    public final void m31781Qi() {
        if (!m31744Uj()) {
            String rj = m31538rj();
            int N0 = this.f10279D0.m34224N0(R.id.btn_description);
            int i = 1;
            boolean z = N0 != -1;
            boolean z2 = !C5070i.m24061i(rj) || m31863Gi();
            if (z != z2) {
                if (z) {
                    m31883Dm(N0);
                    return;
                }
                C2964ra Zl = m31697Zl();
                m31835Jm(rj);
                if (this.f10279D0.m34224N0(R.id.btn_username) == -1) {
                    i = 0;
                }
                m31566oi(Zl, i);
            } else if (z2 && m31835Jm(rj)) {
                m31525sn(R.id.btn_description);
            }
        }
    }

    public final void m31780Qj(final long j) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31885Dk(j);
            }
        });
    }

    public final void m31778Ql() {
        this.f10279D0.m34130s3(R.id.btn_notifications);
    }

    public final void m31777Qm(boolean z) {
        C9239m mVar = this.f10275B0;
        if (mVar != null) {
            mVar.setShowMute(this.f30167b.m2255s3(this.f10323o0.f25367id));
            if (!z) {
                this.f10275B0.setShowVerify(this.f30167b.m2430h4(this.f10323o0));
            }
        }
    }

    @Override
    public void mo4070R1(long j, boolean z) {
        C10721i0.m4187j(this, j, z);
    }

    @Override
    public void mo4048R3(long j, long j2) {
        C10722i1.m4163i(this, j, j2);
    }

    @Override
    public C8113c mo9832R4(long j, TdApi.SearchMessagesFilter searchMessagesFilter) {
        AbstractC9323v4<?> v;
        if (this.f10340w1 != 0.0f) {
            return null;
        }
        Iterator<i10<?>> it = this.f10286G1.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next() instanceof q10) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z || this.f10338v1 != i || (v = this.f10283F0.m18455v(i)) == null) {
            return null;
        }
        return ((q10) v).mo9832R4(j, searchMessagesFilter);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_profile;
    }

    @Override
    public final boolean mo9350Rd() {
        return C7316a.m17051j(this.f10323o0.f25367id) || (this.f10323o0.hasProtectedContent && !m31744Uj());
    }

    public final void m31772Ri() {
        m31819Lm(m31806Nj());
    }

    public final void m31771Rj(final TdApi.NotificationSettingsScope notificationSettingsScope) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31877Ek(notificationSettingsScope);
            }
        });
    }

    public final CharSequence m31769Rl(boolean z) {
        TdApi.SearchMessagesFilter wg;
        int i;
        if (this.f10297P0) {
            if (z) {
                return null;
            }
            AbstractC9323v4<?> oj = m31565oj();
            if (oj != null) {
                if (oj instanceof l10) {
                    TdApi.UserFullInfo userFullInfo = this.f10331s0;
                    if (userFullInfo != null && (i = userFullInfo.groupInCommonCount) > 0) {
                        return C4403w.m27836q2(R.string.xGroups, i);
                    }
                } else if (oj instanceof d20) {
                    return C4403w.m27869i1(R.string.MediaRestricted);
                } else {
                    if (((oj instanceof o10) || (oj instanceof q10)) && (wg = ((i10) oj).mo33042wg()) != null) {
                        int xj = m31487xj(wg.getConstructor());
                        if (xj == 0) {
                            switch (wg.getConstructor()) {
                                case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                                    return C4403w.m27869i1(R.string.TabEmptyLinks);
                                case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                                case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                                    return C4403w.m27869i1(R.string.TabEmptyMedias);
                                case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                                    return C4403w.m27869i1(R.string.TabEmptyPhotos);
                                case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                                    return C4403w.m27869i1(R.string.TabEmptyDocs);
                            }
                        } else if (xj > 0) {
                            switch (wg.getConstructor()) {
                                case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xLinks, xj);
                                case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xGIFs, xj);
                                case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xVideos, xj);
                                case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xVideoMessages, xj);
                                case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xAudios, xj);
                                case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xPhotos, xj);
                                case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xMedia, xj);
                                case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xFiles, xj);
                                case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                                    return C4403w.m27836q2(R.string.xVoiceMessages, xj);
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            return this.f30167b.m2166xc().m3294o(this.f10323o0);
        }
        return this.f30167b.m2166xc().m3295n(this.f10323o0);
    }

    public final void m31768Rm(boolean z) {
        C9239m mVar = this.f10275B0;
        if (mVar != null) {
            TdApi.Chat chat = this.f10323o0;
            TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
            if (chatPhotoInfo == null) {
                mVar.setAvatarPlaceholder(this.f30167b.m2947A3(chat, true, C9239m.getBaseAvatarRadiusDp(), null));
            } else {
                mVar.setAvatar(chatPhotoInfo);
            }
            if (z) {
                this.f10275B0.m9826W1();
            }
        }
    }

    @Override
    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        View C;
        FrameLayoutFix frameLayoutFix;
        if (m9278cb()) {
            return false;
        }
        C3950k kVar = this.f10296O0;
        if (kVar != null && kVar.m29531v()) {
            return false;
        }
        if (m31744Uj() && m31806Nj()) {
            return false;
        }
        float c3 = f2 - View$OnClickListenerC9170d1.m10066c3(true);
        float translationY = this.f10287H0.getTranslationY() + m31854Hj();
        if (c3 >= translationY && c3 <= translationY + m31902Bj() && (frameLayoutFix = this.f10287H0) != null && frameLayoutFix.getParent() != null) {
            return (this.f10338v1 == 0 && this.f10340w1 == 0.0f && !this.f10285G0.m8807D1()) || f <= ((float) C1357a0.m37541i(12.0f));
        }
        if (!m31530si(this.f10273A0.getMeasuredWidth(), c3)) {
            return (this.f10338v1 == 0 && this.f10340w1 == 0.0f) || f <= ((float) C1357a0.m37541i(12.0f));
        }
        View X = this.f10277C0.m39457X(f, c3);
        if (X instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) X;
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                if (linearLayoutManager.m39535l2() == 0) {
                    return linearLayoutManager.m39549X1() == 0 && (C = linearLayoutManager.mo39262C(0)) != null && linearLayoutManager.m39237Q(C) == 0;
                }
            }
        }
        return true;
    }

    public final void m31763Si() {
        if (this.f10321n0 == 4) {
            mo9464C9();
            long j = C10930q6.f34962z2;
        }
    }

    public boolean m31762Sj() {
        int i = this.f10321n0;
        return i == 2 || i == 5;
    }

    public final void m31760Sl() {
        if (this.f10339w0 != null || this.f10335u0 != null) {
            View$OnClickListenerC3062so soVar = new View$OnClickListenerC3062so(this.f30165a, this.f30167b);
            soVar.m31851Hm(new C3075m(this.f10323o0, this.f10325p0, true));
            m9291ac(soVar);
        }
    }

    public final void m31759Sm() {
        TdApi.Chat chat;
        C9239m mVar = this.f10275B0;
        if (mVar != null && (chat = this.f10323o0) != null) {
            mVar.setUseRedHighlight(this.f30167b.m2491d7(chat.f25367id));
            this.f10275B0.m9831S1(this.f30167b.m2646T3(this.f10323o0, false), m31769Rl(false));
            this.f10275B0.setExpandedSubtitle(m31769Rl(true));
        }
    }

    @Override
    public void mo4047T0(long j, long j2, TdApi.MessageInteractionInfo messageInteractionInfo) {
        C10722i1.m4168d(this, j, j2, messageInteractionInfo);
    }

    public final void m31754Ti() {
        int N0 = this.f10279D0.m34224N0(R.id.btn_encryptionKey);
        boolean z = N0 != -1;
        boolean w2 = C4779t2.m25402w2(this.f10329r0);
        if (z == w2) {
            return;
        }
        if (w2) {
            m31566oi(m31688am(), 3);
        } else {
            m31883Dm(N0);
        }
    }

    public boolean m31753Tj() {
        int i = this.f10321n0;
        return i == 4 || i == 7;
    }

    public final int m31751Tl() {
        return (m31862Gj() - m31886Dj()) - m31902Bj();
    }

    public void m31750Tm(boolean z) {
        this.f10282E1 = z;
    }

    public final void m31745Ui() {
        TdApi.UserFullInfo userFullInfo = this.f10331s0;
        boolean z = false;
        boolean z2 = userFullInfo != null && userFullInfo.groupInCommonCount > 0;
        l10 tj = m31520tj();
        if (tj != null) {
            z = true;
        }
        if (z2 != z) {
            if (z2) {
                l10 l10Var = new l10(this.f30165a, this.f30167b);
                this.f10286G1.add(l10Var);
                this.f10283F0.m18454w(this.f10286G1.size() - 1);
                this.f10285G0.getTopView().m10166J1(l10Var.mo9313X9().toString().toUpperCase());
            } else {
                int indexOf = this.f10286G1.indexOf(tj);
                if (indexOf != -1) {
                    this.f10286G1.remove(indexOf);
                    this.f10283F0.m18453x(indexOf);
                    this.f10285G0.getTopView().m10158U1(indexOf);
                } else {
                    return;
                }
            }
            this.f10283F0.m28888l();
        }
    }

    public final boolean m31744Uj() {
        int i = this.f10321n0;
        return i == 5 || i == 6 || i == 7;
    }

    public int m31742Ul() {
        return (m31751Tl() - m31902Bj()) - m31854Hj();
    }

    public void m31741Um(boolean z) {
        this.f10284F1 = z;
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
    public void mo4069V5(long j, long j2, int i, boolean z) {
        C10721i0.m4180q(this, j, j2, i, z);
    }

    @Override
    public void mo9327V8() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.getFilling().m9023j0(C11524j.m167m0());
        }
    }

    @Override
    public int mo9326V9() {
        return m31744Uj() ? super.mo9326V9() : C4896n.m24481b(true);
    }

    public final void m31736Vi() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10074Y3(this, mo418W9());
        }
    }

    public final boolean m31735Vj() {
        int i = this.f10321n0;
        return (i == 4 || i == 7) && !this.f10337v0.username.isEmpty();
    }

    public final void m31733Vl(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
        int j = raVar.m32835j();
        if (j == R.id.description) {
            y1Var.getEditText().setInputType(16385);
            C1399s0.m37161q0(y1Var.getEditText(), false);
            y1Var.setMaxLength(255);
        } else if (j == R.id.S) {
            y1Var.getEditText().setImeOptions(6);
            y1Var.getEditText().setInputType(16385);
        }
    }

    public void m31732Vm(boolean z, int i) {
        if (this.f10305X0 != z) {
            this.f10305X0 = z;
            m31727Wi();
            boolean z2 = false;
            if (this.f10307Z0 == null) {
                FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, m31902Bj());
                s1.topMargin = m31854Hj();
                FrameLayoutFix frameLayoutFix = new FrameLayoutFix(mo4347s());
                this.f10306Y0 = frameLayoutFix;
                frameLayoutFix.setLayoutParams(s1);
                FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-2, m31902Bj(), C4403w.m27984G2() ? 5 : 3);
                C9279r rVar = new C9279r(mo4347s());
                this.f10307Z0 = rVar;
                rVar.m9652x(16.0f, R.id.theme_color_text);
                int maxDigitWidth = this.f10307Z0.getMaxDigitWidth();
                this.f10307Z0.setPadding(maxDigitWidth, 0, maxDigitWidth, 0);
                int i2 = C1357a0.m37541i(66.0f) - maxDigitWidth;
                t1.leftMargin = i2;
                t1.rightMargin = i2;
                this.f10307Z0.setLayoutParams(t1);
                this.f10307Z0.setTextTop(C1357a0.m37541i(15.0f) + C1357a0.m37541i(15.0f));
                this.f10307Z0.m9678F(C4403w.m27844o2(R.string.SelectedSuffix, 1L), false);
                m9163t8(this.f10307Z0);
                FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(C1357a0.m37541i(56.0f), m31902Bj(), C4403w.m27984G2() ? 5 : 3);
                ImageView imageView = new ImageView(mo4347s());
                this.f10308a1 = imageView;
                imageView.setImageResource(R.drawable.baseline_close_24);
                this.f10308a1.setColorFilter(C11524j.m159q0());
                m9184q8(this.f10308a1, R.id.theme_color_icon);
                this.f10308a1.setScaleType(ImageView.ScaleType.CENTER);
                this.f10308a1.setLayoutParams(t12);
                this.f10308a1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        View$OnClickListenerC3062so.this.m31836Jl(view);
                    }
                });
                C1399s0.m37193a0(this.f10308a1);
                C10189d.m5794j(this.f10308a1);
                this.f10306Y0.addView(this.f10307Z0);
                this.f10306Y0.addView(this.f10308a1);
                for (int i3 = 0; i3 < 5; i3++) {
                    C9310u0 u0Var = new C9310u0(mo4347s());
                    u0Var.m9518g(R.id.theme_color_icon);
                    u0Var.setAlpha(0.0f);
                    FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(C1357a0.m37541i(48.0f), m31902Bj(), C4403w.m27984G2() ? 3 : 5);
                    if (C4403w.m27984G2()) {
                        t13.leftMargin = C1357a0.m37541i(12.0f);
                    } else {
                        t13.rightMargin = C1357a0.m37541i(12.0f);
                    }
                    m9184q8(u0Var, R.id.theme_color_icon);
                    u0Var.setLayoutParams(t13);
                    this.f10306Y0.addView(u0Var);
                    u0Var.setOnClickListener(this);
                    C10189d.m5797g(u0Var);
                    if (i3 == 0) {
                        this.f10310c1 = u0Var;
                        u0Var.setId(R.id.menu_btn_forward);
                        u0Var.setImageResource(R.drawable.baseline_forward_24);
                    } else if (i3 == 1) {
                        this.f10311d1 = u0Var;
                        u0Var.setId(R.id.menu_btn_copy);
                        u0Var.setImageResource(R.drawable.baseline_content_copy_24);
                    } else if (i3 == 2) {
                        this.f10309b1 = u0Var;
                        u0Var.setId(R.id.menu_btn_delete);
                        u0Var.setImageResource(R.drawable.baseline_delete_24);
                    } else if (i3 == 3) {
                        this.f10312e1 = u0Var;
                        u0Var.setId(R.id.menu_btn_clear);
                        u0Var.setImageResource(R.drawable.templarian_baseline_broom_24);
                    } else if (i3 == 4) {
                        this.f10313f1 = u0Var;
                        u0Var.setId(R.id.menu_btn_view);
                        u0Var.setImageResource(R.drawable.baseline_visibility_24);
                    }
                }
                m31832Kh(0.0f);
                this.f10287H0.addView(this.f10306Y0);
            }
            this.f10307Z0.setEnabled(z);
            if (z) {
                this.f10307Z0.m9678F(C4403w.m27844o2(i, 1L), this.f10314g1 != 0.0f);
                C9279r rVar2 = this.f10307Z0;
                if (this.f10314g1 != 0.0f) {
                    z2 = true;
                }
                rVar2.m9653w(1, z2);
            }
        }
    }

    @Override
    public void mo4068W(long j, TdApi.ChatActionBar chatActionBar) {
        C10721i0.m4196a(this, j, chatActionBar);
    }

    @Override
    public void mo1566W2(final TdApi.BasicGroup basicGroup, final boolean z) {
        int i = this.f10321n0;
        if (i == 2 || i == 5) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31779Qk(basicGroup, z);
                }
            });
        }
    }

    @Override
    public int mo418W9() {
        int i = this.f10321n0;
        if (i != 0) {
            return i != 1 ? m31744Uj() ? R.id.menu_profile_manage : R.id.menu_profile : R.id.menu_profile_secret;
        }
        if (C4779t2.m25658K2(this.f10327q0)) {
            return R.id.menu_profile_bot;
        }
        TdApi.User user = this.f10327q0;
        if (user == null || (user.f25439id != 0 && (user.type.getConstructor() == -598644325 || this.f10327q0.type.getConstructor() == 1262387765))) {
            return R.id.menu_profile_private;
        }
        return 0;
    }

    public final void m31727Wi() {
        AbstractC9323v4<?> oj;
        boolean z = m9182qa() == 0.0f;
        if (z && (oj = m31565oj()) != null) {
            z = !((i10) oj).m34389Of();
        }
        this.f10281E0.setPagingEnabled(z);
        this.f10285G0.getTopView().setTouchDisabled(!z);
    }

    public final boolean m31726Wj() {
        int i = this.f10321n0;
        return (i == 3 || i == 6) && !this.f10337v0.username.isEmpty();
    }

    public final boolean m31724Wl() {
        TdApi.User user = this.f10327q0;
        return user.isContact || user.isMutualContact || C4779t2.m25728A2(user);
    }

    public final void m31723Wm(boolean z) {
        if (this.f10324o1 != z) {
            this.f10324o1 = z;
            m9387Md(z);
            this.f10320m1.setInProgress(z);
        }
    }

    @Override
    public void mo4044X1(final TdApi.Message message, long j) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31653el(message);
            }
        });
    }

    @Override
    public void mo18452X3(int i, AbstractC9323v4<?> v4Var) {
    }

    @Override
    public boolean mo23864X5(RunnableC2374f5 f5Var, View view, TdApi.MessageSender messageSender) {
        if (this.f30167b.m2395j7(messageSender)) {
            return false;
        }
        m31602ki(f5Var, view, messageSender);
        return false;
    }

    @Override
    public boolean mo9314X8(boolean z) {
        m9341T8();
        return false;
    }

    @Override
    public CharSequence mo9313X9() {
        int i = this.f10321n0;
        int i2 = R.string.GroupInfo;
        if (i == 5) {
            if (C4779t2.m25623P2(this.f10333t0.status)) {
                i2 = R.string.ManageGroup;
            } else if (C4779t2.m25679H2(this.f10333t0.status) || this.f10323o0.permissions.canChangeInfo) {
                i2 = R.string.EditGroup;
            }
            return C4403w.m27869i1(i2);
        } else if (i == 6) {
            if (C4779t2.m25679H2(this.f10337v0.status)) {
                i2 = R.string.ManageGroup;
            } else if (this.f10323o0.permissions.canChangeInfo) {
                i2 = R.string.EditGroup;
            }
            return C4403w.m27869i1(i2);
        } else if (i != 7) {
            return super.mo9313X9();
        } else {
            return C4403w.m27869i1(R.string.ManageChannel);
        }
    }

    public final void m31718Xi() {
        int N0 = this.f10279D0.m34224N0(R.id.btn_phone);
        int i = 0;
        boolean z = N0 != -1;
        boolean Wl = m31724Wl();
        if (z != Wl) {
            if (z) {
                m31883Dm(N0);
                return;
            }
            if (this.f10279D0.m34224N0(R.id.btn_username) != -1) {
                i = 1;
            }
            if (this.f10279D0.m34224N0(R.id.btn_description) != -1) {
                i++;
            }
            m31566oi(m31652em(), i);
        } else if (Wl) {
            m31525sn(R.id.btn_phone);
        }
    }

    public final boolean m31715Xl() {
        int i = this.f10321n0;
        if (i == 5) {
            return C4779t2.m25623P2(this.f10333t0.status);
        }
        if (i != 6) {
            return true;
        }
        return C4779t2.m25679H2(this.f10337v0.status);
    }

    public final void m31714Xm(TdApi.SearchMessagesFilter searchMessagesFilter, int i) {
        int xj;
        if (i != -1 && (xj = m31487xj(searchMessagesFilter.getConstructor())) != i) {
            if (xj <= 0 || i > 0) {
                if (this.f10288H1 == null) {
                    this.f10288H1 = new SparseIntArray(m31529sj().length - 3);
                }
                this.f10288H1.put(searchMessagesFilter.getConstructor(), i);
                if (!m31717Xj(searchMessagesFilter) && xj <= 0 && i > 0) {
                    m31629hi(searchMessagesFilter);
                }
                m31534rn();
            }
        }
    }

    @Override
    public void mo4067Y(long j, TdApi.Message message) {
        C10721i0.m4175v(this, j, message);
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final void m31709Yi() {
        int N0 = this.f10279D0.m34224N0(R.id.btn_prehistoryMode);
        boolean z = N0 != -1;
        boolean M2 = this.f30167b.m2756M2(this.f10323o0);
        if (z != M2) {
            if (M2) {
                int N02 = this.f10279D0.m34224N0(R.id.btn_recentActions);
                if (N02 == -1) {
                    N02 = this.f10279D0.m34224N0(R.id.belowRecentActions);
                }
                if (N02 != -1) {
                    this.f10279D0.m34240F0().add(N02, new C2964ra(11));
                    this.f10279D0.m34240F0().add(N02, new C2964ra(5, R.id.btn_prehistoryMode, 0, R.string.ChatHistory));
                    this.f10279D0.m39308M(N02, 2);
                } else {
                    throw new AssertionError();
                }
            } else {
                this.f10279D0.m34204V1(N0 - 1, 2);
            }
            m31616im();
        } else if (M2) {
            m31525sn(R.id.btn_prehistoryMode);
        }
    }

    public final boolean m31708Yj() {
        int i = this.f10321n0;
        return i == 0 || i == 1;
    }

    public C3077o m31706Yl(i10<?> i10Var) {
        return new C3077o(i10Var);
    }

    public final void m31705Ym(boolean z) {
        if (this.f10297P0 != z) {
            this.f10297P0 = z;
            C9239m mVar = this.f10275B0;
            if (mVar != null) {
                mVar.setSubtitle(m31769Rl(false));
                this.f10275B0.setExpandedSubtitle(m31769Rl(true));
            }
        }
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        m31588ln();
        C4017n nVar = this.f10341x0;
        if (nVar != null) {
            nVar.m29313g0();
        }
        this.f10283F0.mo4501a3();
        C1399s0.m37162q(this.f10277C0);
    }

    public final void m31700Zi() {
        C3950k kVar;
        int Gj = m31862Gj() - m31480yi();
        int Bj = m31902Bj() + m31854Hj();
        int Hj = Gj + (((-m31902Bj()) - m31854Hj()) - C1357a0.m37541i(6.0f));
        float f = Hj;
        this.f10292K0 = f;
        m31795Om(((float) (m31854Hj() + Hj)) <= ((float) Bj));
        if ((!this.f10294M0 && ((kVar = this.f10296O0) == null || !kVar.m29531v())) || this.f10292K0 < this.f10287H0.getTranslationY()) {
            this.f10293L0 = f;
            m31678bn(f);
        }
    }

    public final void m31699Zj() {
        int i = this.f10321n0;
        if (i == 3 || i == 4) {
            this.f30167b.m2270r4().m14783o(new TdApi.AddChatMember(this.f10323o0.f25367id, this.f30167b.m2519ba(), 0), this.f30167b.m2392ja());
        }
    }

    public final C2964ra m31697Zl() {
        return new C2964ra(37, R.id.btn_description, R.drawable.baseline_info_24, (!m31708Yj() || C4779t2.m25658K2(this.f10327q0)) ? R.string.Description : R.string.UserBio);
    }

    public void m31696Zm(float f) {
        if (this.f10314g1 != f) {
            this.f10314g1 = f;
            this.f10285G0.getTopView().setOverlayFactor(f);
            m31832Kh(f);
        }
    }

    @Override
    public void mo4066a0(long j, TdApi.MessageSender messageSender) {
        C10721i0.m4191f(this, j, messageSender);
    }

    public final void m31691aj() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            int W9 = mo418W9();
            TdApi.UserFullInfo userFullInfo = this.f10331s0;
            d1Var.m10092R3(W9, R.id.menu_btn_call, (userFullInfo.canBeCalled || userFullInfo.hasPrivateCalls) ? 1.0f : 0.0f);
        }
    }

    public final C2964ra m31688am() {
        return new C2964ra(5, R.id.btn_encryptionKey, R.drawable.baseline_vpn_key_24, R.string.EncryptionKey);
    }

    public void m31687an(int i, int i2) {
        C9279r rVar = this.f10307Z0;
        if (rVar != null) {
            if (i > 0) {
                rVar.m9678F(C4403w.m27844o2(i2, i), this.f10314g1 > 0.0f);
            }
            this.f10307Z0.m9679E(i);
        }
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23934b(this, i);
    }

    @Override
    public int mo9286ba() {
        return R.id.theme_color_background;
    }

    public final void m31683bi(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f10335u0 = basicGroupFullInfo;
        this.f10341x0.m29303q0(basicGroupFullInfo.members);
        m31781Qi();
        if (C4779t2.m25623P2(this.f10333t0.status)) {
            m31525sn(R.id.btn_inviteLink);
        }
    }

    public final void m31682bj() {
        String str;
        int i = this.f10321n0;
        if (i == 0 || i == 1) {
            str = this.f10327q0.username;
        } else if (i == 3 || i == 4) {
            str = this.f10337v0.username;
        } else {
            return;
        }
        int N0 = this.f10279D0.m34224N0(R.id.btn_username);
        boolean z = N0 != -1;
        boolean z2 = !str.isEmpty();
        if (z != z2) {
            if (z) {
                m31883Dm(N0);
                int i2 = this.f10321n0;
                if (i2 == 3) {
                    if (this.f30167b.m2256s2(this.f10323o0)) {
                        m31647fi();
                    }
                    m31759Sm();
                } else if (i2 == 4 && this.f30167b.m2256s2(this.f10323o0)) {
                    m31647fi();
                }
            } else {
                C2964ra fm = m31643fm();
                if (fm != null) {
                    m31566oi(fm, 0);
                    int i3 = this.f10321n0;
                    if (i3 == 3) {
                        m31899Bm();
                        if (this.f30167b.m2256s2(this.f10323o0)) {
                            m31907Am();
                        }
                        m31759Sm();
                    } else if (i3 == 4 && this.f30167b.m2256s2(this.f10323o0)) {
                        m31907Am();
                    }
                }
            }
        } else if (z2) {
            m31525sn(R.id.btn_username);
        }
    }

    public final C2964ra m31679bm() {
        return new C2964ra(5, R.id.btn_inviteLink, R.drawable.baseline_link_24, R.string.PrimaryInviteLinkMenu);
    }

    public final void m31678bn(float f) {
        if (this.f10287H0.getTranslationY() != f) {
            this.f10287H0.setTranslationY(f);
            float c3 = View$OnClickListenerC9170d1.m10066c3(true);
            this.f10289I0.setTranslationY((f - c3) + m31854Hj());
            this.f10291J0.setTranslationY(f - (c3 * this.f10295N0));
            if (m9182qa() != 0.0f) {
                m9230ja(this.f30156R).setTranslationY(Math.max(0.0f, this.f10291J0.getTranslationY() - View$OnClickListenerC9170d1.m10066c3(false)));
            }
        }
    }

    @Override
    public void mo4065c2(long j, TdApi.DraftMessage draftMessage) {
        C10721i0.m4190g(this, j, draftMessage);
    }

    @Override
    public void mo4064c4(final long j, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31716Xk(j);
            }
        });
    }

    @Override
    public void mo4043c6(long j, long j2, TdApi.Sticker sticker) {
        C10722i1.m4171a(this, j, j2, sticker);
    }

    public final void m31674ci(TdApi.UserFullInfo userFullInfo) {
        m31781Qi();
        m31745Ui();
        m31691aj();
    }

    public void m31673cj() {
        AbstractC9323v4<?> oj;
        if (this.f10305X0 && (oj = m31565oj()) != null) {
            ((i10) oj).m34404Eg(false);
        }
    }

    public final C2964ra m31670cm() {
        return new C2964ra(5, R.id.btn_linkedChat, 0, this.f10321n0 == 7 ? R.string.LinkedGroup : R.string.LinkedChannel);
    }

    public final boolean m31669cn(boolean z) {
        String str;
        String Cj = m31894Cj();
        if (C5070i.m24061i(Cj)) {
            return false;
        }
        String Tc = this.f30167b.m2637Tc(Cj);
        String T3 = this.f30167b.m2646T3(this.f10323o0, false);
        int i = R.string.ShareTextLink;
        switch (this.f10321n0) {
            case 0:
            case 1:
                str = C4403w.m27865j1(this.f30167b.m2816I6(this.f10323o0) ? R.string.ShareTextBotLink : R.string.ShareTextProfileLink, T3, Tc);
                i = R.string.ShareTextProfileLink2;
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                str = C4403w.m27865j1(R.string.ShareTextChatLink, T3, Tc);
                break;
            case 4:
            case 7:
                str = C4403w.m27865j1(R.string.ShareTextChannelLink, T3, Tc);
                break;
            default:
                return false;
        }
        String j1 = C4403w.m27865j1(i, T3, Tc);
        x00 x00Var = new x00(this.f30165a, this.f30167b);
        x00Var.m30994Vi(new x00.C3281m(j1).m30884E(str, null));
        x00Var.m30960ej();
        return true;
    }

    @Override
    public boolean mo9270dc() {
        return this.f10290I1 > 0;
    }

    public final void m31665di(TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f10339w0 = supergroupFullInfo;
        m31781Qi();
        m31736Vi();
        if (this.f30167b.m2256s2(this.f10323o0)) {
            m31525sn(R.id.btn_inviteLink);
        }
        m31561on(false);
    }

    public final int m31664dj() {
        return ((m31862Gj() - m31902Bj()) + m31854Hj()) - C6879f3.m18691q();
    }

    public final C2964ra m31661dm() {
        return new C2964ra(5, R.id.btn_notifications, R.drawable.baseline_notifications_24, R.string.Notifications);
    }

    public final void m31660dn() {
        C5320c cVar = new C5320c(4);
        C5146u0 u0Var = new C5146u0(4);
        if (m31895Ci()) {
            cVar.m23284a(R.id.more_btn_addMember);
            u0Var.m23815b(C4403w.m27869i1(R.string.AddMember));
        }
        int i = this.f10321n0;
        if ((i == 4 || i == 3) && this.f10337v0.username.length() > 0) {
            cVar.m23284a(R.id.more_btn_share);
            u0Var.m23816a(R.string.Share);
        }
        int i2 = this.f10321n0;
        if (i2 == 3 || i2 == 2) {
            if (!m31847Ii()) {
                cVar.m23284a(R.id.more_btn_viewAdmins);
                u0Var.m23816a(R.string.ViewAdmins);
            }
            if (!this.f30167b.m2463f3(mo9464C9())) {
                cVar.m23284a(R.id.more_btn_privacy);
                u0Var.m23816a(R.string.EditPrivacy);
            }
        }
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
        if (supergroupFullInfo != null && supergroupFullInfo.canGetStatistics) {
            cVar.m23284a(R.id.more_btn_viewStats);
            u0Var.m23816a(R.string.Stats);
        }
        this.f30167b.m2485dd().m3873D2(mo9464C9(), cVar, u0Var, false, true);
        if (cVar.m23278g() > 0) {
            m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
        }
    }

    @Override
    public AbstractC9323v4<?> mo18451e3(int i) {
        i10<?> i10Var = m31547qj().get(i);
        if (!i10Var.m34383Qf()) {
            i10Var.m34400Hg();
            long j = this.f10323o0.f25367id;
            C4737p7 p7Var = this.f10325p0;
            i10Var.m34408Bg(new i10.C2519d(j, p7Var != null ? p7Var.m26294g() : 0L));
            i10Var.m34401Gg(this);
        }
        return i10Var;
    }

    @Override
    public void mo4063e7(final long j, int i) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31752Tk(j);
            }
        });
    }

    @Override
    public void mo9266e9() {
        super.mo9266e9();
        if (!m31744Uj()) {
            ((RunnableC9248n) this.f10277C0).setFloatingButton(null);
        }
    }

    public final void m31656ei(TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f10339w0 = supergroupFullInfo;
        m31781Qi();
        m31736Vi();
        if (C4779t2.m25623P2(this.f10337v0.status)) {
            m31525sn(R.id.btn_inviteLink);
        }
        m31561on(false);
    }

    public final void m31655ej() {
        C5459x0 x0Var = this.f10316i1;
        if (x0Var != null) {
            C1379j0.m37325i(x0Var.m22616v(), R.string.CopiedText);
        }
    }

    public final C2964ra m31652em() {
        return new C2964ra(6, R.id.btn_phone, R.drawable.baseline_phone_24, R.string.PhoneMobile);
    }

    public final void m31651en(CharSequence charSequence) {
        this.f30165a.m14584H3().m8985g(this.f10320m1).m8969F(this, this.f30167b, R.drawable.baseline_error_24, charSequence);
    }

    public final void m31647fi() {
        if (this.f10279D0.m34224N0(R.id.btn_inviteLink) == -1) {
            m31566oi(m31679bm(), this.f10315h1);
        }
    }

    public final void m31646fj() {
        if (m31871Fi()) {
            int i = this.f10337v0.memberCount;
            if (this.f30167b.m2542a3(this.f10323o0)) {
                i--;
            }
            CharSequence n2 = i > 0 ? C4403w.m27848n2(R.string.DestroyX, i, C4403w.m27843p(), this.f30167b.m2691Q3(mo9464C9())) : C4403w.m27853m1(R.string.DestroyXNoMembers, this.f30167b.m2691Q3(mo9464C9()));
            int[] iArr = {R.id.btn_destroyChat, R.id.btn_cancel};
            String[] strArr = new String[2];
            strArr[0] = C4403w.m27869i1(this.f10337v0.isChannel ? R.string.DestroyChannel : R.string.DestroyGroup);
            strArr[1] = C4403w.m27869i1(R.string.Cancel);
            m9261ee(n2, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i2) {
                    boolean tk;
                    tk = View$OnClickListenerC3062so.this.m31519tk(view, i2);
                    return tk;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i2) {
                    return C5115g0.m23934b(this, i2);
                }
            });
        }
    }

    public final C2964ra m31643fm() {
        int i = this.f10321n0;
        if (i == 0 || i == 1) {
            if (this.f10327q0.username.isEmpty()) {
                return null;
            }
            if (!C4779t2.m25658K2(this.f10327q0)) {
                return new C2964ra(6, R.id.btn_username, R.drawable.baseline_alternate_email_24, R.string.Username);
            }
            return new C2964ra(6, (int) R.id.btn_username, (int) R.drawable.baseline_alternate_email_24, (CharSequence) (this.f30167b.m2746Mc() + this.f10327q0.username), false);
        } else if ((i != 3 && i != 4) || this.f10337v0.username.isEmpty()) {
            return null;
        } else {
            return new C2964ra(6, (int) R.id.btn_username, (int) R.drawable.baseline_alternate_email_24, (CharSequence) (this.f30167b.m2746Mc() + this.f10337v0.username), false);
        }
    }

    public final void m31642fn() {
        ?? Fi;
        int i = this.f10321n0;
        if (i == 0 || i == 1) {
            m31633gn();
        } else if (i == 2 || i == 3 || i == 4) {
            m31660dn();
        } else if ((i == 6 || i == 7) && (Fi = m31871Fi()) > 0) {
            C5320c cVar = new C5320c(Fi == true ? 1 : 0);
            C5146u0 u0Var = new C5146u0(Fi);
            if (m31871Fi()) {
                cVar.m23284a(R.id.btn_destroyChat);
                u0Var.m23816a(this.f10337v0.isChannel ? R.string.DestroyChannel : R.string.DestroyGroup);
            }
            m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
        }
    }

    public final void m31638gi(ArrayList<C2964ra> arrayList) {
        if (m31715Xl()) {
            arrayList.add(new C2964ra(2, R.id.shadowTop));
            arrayList.add(new C2964ra(39));
            arrayList.add(new C2964ra(3, R.id.shadowBottom));
            return;
        }
        arrayList.add(new C2964ra(39));
    }

    public final void m31637gj(MotionEvent motionEvent) {
        AbstractC9323v4<?> oj = m31565oj();
        if (oj != null) {
            oj.get().dispatchTouchEvent(motionEvent);
        }
    }

    public final void m31634gm() {
        if (!(this.f10279D0.m34224N0(R.id.btn_description) == -1 && this.f10279D0.m34224N0(R.id.description) == -1)) {
            m31616im();
        }
        this.f10277C0.m39504A0();
        for (int i = 0; i < this.f10283F0.mo8825e(); i++) {
            AbstractC9323v4<?> v = this.f10283F0.m18455v(i);
            if (v != null) {
                ((i10) v).m34345og();
            }
        }
    }

    public final void m31633gn() {
        TdApi.User user = this.f10327q0;
        if (user.f25439id == 0) {
            return;
        }
        if (user.type.getConstructor() == -598644325 || this.f10327q0.type.getConstructor() == 1262387765) {
            boolean z = this.f10327q0.type.getConstructor() == 1262387765;
            long ba2 = this.f30167b.m2519ba();
            if (!z) {
                long j = this.f10327q0.f25439id;
                if (j == ba2 && j != 0) {
                    m9302Yd(new int[]{R.id.more_btn_edit}, new String[]{C4403w.m27869i1(R.string.EditName)}, 0);
                    return;
                }
            }
            long c = C7316a.m17058c(this.f10327q0.f25439id);
            C5320c cVar = new C5320c(4);
            C5146u0 u0Var = new C5146u0(4);
            if (z && ((TdApi.UserTypeBot) this.f10327q0.type).canJoinGroups) {
                cVar.m23284a(R.id.more_btn_addToGroup);
                u0Var.m23816a(R.string.BotInvite);
            }
            if (this.f10321n0 == 0) {
                TdApi.User user2 = this.f10327q0;
                if (user2.f25439id != ba2 && !C4779t2.m25658K2(user2)) {
                    cVar.m23284a(R.id.btn_newSecretChat);
                    u0Var.m23816a(R.string.StartEncryptedChat);
                }
            }
            if (z) {
                if (!C5070i.m24061i(this.f10327q0.username)) {
                    cVar.m23284a(R.id.more_btn_share);
                    u0Var.m23816a(R.string.Share);
                }
            } else if (C4779t2.m25728A2(this.f10327q0)) {
                cVar.m23284a(R.id.more_btn_share);
                u0Var.m23816a(R.string.ShareContact);
            }
            if (!this.f10327q0.isSupport || this.f30167b.m2463f3(c)) {
                cVar.m23284a(R.id.more_btn_block);
                u0Var.m23816a(this.f30167b.m2463f3(c) ? z ? R.string.UnblockBot : R.string.Unblock : z ? R.string.BlockBot : R.string.BlockContact);
            }
            if (this.f30167b.m2772L2(this.f10323o0)) {
                cVar.m23284a(R.id.btn_setPasscode);
                u0Var.m23816a(R.string.PasscodeTitle);
            }
            if (!this.f30167b.m2463f3(c)) {
                cVar.m23284a(R.id.more_btn_privacy);
                u0Var.m23816a(R.string.EditPrivacy);
            }
            if (C4779t2.m25630O2(this.f10327q0)) {
                cVar.m23284a(R.id.more_btn_edit);
                u0Var.m23816a(R.string.RenameContact);
                cVar.m23284a(R.id.more_btn_delete);
                u0Var.m23816a(R.string.DeleteContact);
            } else if (C4779t2.m25682H(this.f10327q0)) {
                cVar.m23284a(R.id.more_btn_addToContacts);
                u0Var.m23816a(R.string.AddContact);
            }
            if (this.f10321n0 == 1) {
                cVar.m23284a(R.id.more_btn_cloudChat);
                u0Var.m23816a(R.string.OpenCloudChat);
            }
            m9302Yd(cVar.m23280e(), u0Var.m23813d(), 0);
        }
    }

    @Override
    public void mo1556h0(long j, TdApi.SupergroupFullInfo supergroupFullInfo) {
        m31501vm(supergroupFullInfo);
    }

    @Override
    public void mo4062h1(final long j, final TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31734Vk(j, chatJoinRequestsInfo);
            }
        });
    }

    @Override
    public void mo8853h4(int i) {
    }

    @Override
    public void mo9245h9(Canvas canvas, float f, int i, int i2) {
        float c3 = View$OnClickListenerC9170d1.m10066c3(true);
        canvas.drawRect(0.0f, c3 - (f * c3), i, i2, C1410y.m37039g(C11524j.m148w()));
    }

    public final void m31629hi(TdApi.SearchMessagesFilter searchMessagesFilter) {
        TdApi.SearchMessagesFilter[] sj = m31529sj();
        int size = this.f10286G1.size();
        boolean z = false;
        int i = 0;
        while (i < size && !i10.m34385Pf(this.f10286G1.get(i))) {
            i++;
        }
        if (i < size) {
            for (TdApi.SearchMessagesFilter searchMessagesFilter2 : sj) {
                if (searchMessagesFilter2.getConstructor() == searchMessagesFilter.getConstructor()) {
                    break;
                }
                if (m31822Lj(searchMessagesFilter2, i)) {
                    i++;
                }
            }
        }
        if (i == size) {
            z = true;
        }
        if (z) {
            i10<?> Ng = i10.m34390Ng(this.f30165a, this.f30167b, searchMessagesFilter);
            this.f10286G1.add(Ng);
            this.f10283F0.m18454w(this.f10286G1.size() - 1);
            this.f10285G0.getTopView().m10166J1(Ng.mo9313X9().toString().toUpperCase());
        } else {
            i10<?> i10Var = this.f10286G1.get(i);
            if (!i10.m34385Pf(i10Var) || i10Var.mo33042wg().getConstructor() != searchMessagesFilter.getConstructor()) {
                i10<?> Ng2 = i10.m34390Ng(this.f30165a, this.f30167b, searchMessagesFilter);
                this.f10286G1.add(i, Ng2);
                this.f10283F0.m18454w(i);
                this.f10285G0.getTopView().m10165L1(Ng2.mo9313X9().toString().toUpperCase(), i);
            } else {
                return;
            }
        }
        this.f10283F0.m28888l();
    }

    public void m31625hm(int i, int i2) {
        this.f10343y0 = i;
        this.f10345z0 = i2;
        this.f10279D0.m34130s3(R.id.btn_manageInviteLinks);
    }

    public final void m31624hn() {
        if (!m31744Uj()) {
            this.f30167b.m2781K9().m1858g0(this.f10323o0.f25367id, this);
            this.f30167b.m2781K9().m1842k0(this);
        }
        this.f30167b.m2781K9().m1870d0(this.f10323o0.f25367id, this);
        switch (this.f10321n0) {
            case 0:
            case 1:
                this.f30167b.m2480e2().m1646f2(this.f10327q0.f25439id, this);
                if (this.f10321n0 == 1) {
                    this.f30167b.m2480e2().m1658c2(this.f10329r0.f25419id, this);
                    return;
                }
                return;
            case 2:
            case 5:
                this.f30167b.m2480e2().m1662b2(this.f10333t0.f25363id, this);
                this.f30167b.m2480e2().m1740G(this.f10323o0.f25367id, this);
                return;
            case 3:
            case 4:
            case 6:
            case 7:
                this.f30167b.m2480e2().m1654d2(this.f10337v0.f25425id, this);
                this.f30167b.m2480e2().m1740G(this.f10323o0.f25367id, this);
                return;
            default:
                return;
        }
    }

    @Override
    public void mo1565i4(long j, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        m31484xm(basicGroupFullInfo);
    }

    @Override
    public void mo4061i5(final long j, String str) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31707Yk(j);
            }
        });
    }

    public final void m31620ii(final int i, final RunnableC2374f5 f5Var, final View view, final TdApi.ChatMember chatMember, final int i2, boolean z) {
        C10930q6.AbstractC10939i noVar = new C10930q6.AbstractC10939i() {
            @Override
            public final void mo1765a(boolean z2, TdApi.Error error) {
                View$OnClickListenerC3062so.this.m31663dk(f5Var, view, z2, error);
            }
        };
        String yb = this.f30167b.m2151yb(chatMember.memberId);
        TdApi.ChatMemberStatus K3 = this.f30167b.m2787K3(this.f10323o0.f25367id);
        if (K3 == null) {
            K3 = m31762Sj() ? this.f10333t0.status : this.f10337v0.status;
        }
        TdApi.ChatMemberStatus chatMemberStatus = K3;
        int i3 = R.string.AddToTheGroup;
        if (i2 == -1 && ((i == 0 || i == 1) && !C4779t2.m25499i3(chatMember.status, false) && m31762Sj())) {
            C9188f2 f2Var = new C9188f2(R.id.btn_addMember);
            if (i == 1) {
                i3 = R.string.AddAdminToTheGroup;
            }
            m9206me(f2Var.m10011b(C4403w.m27853m1(i3, yb)).m9997p(new C2964ra[]{new C2964ra(13, (int) R.id.btn_forwardLast100, 0, (CharSequence) C4403w.m27844o2(R.string.ForwardLastXMessages, 100L), (int) R.id.btn_addMember, false), new C2964ra(13, (int) R.id.btn_forwardLast50, 0, (CharSequence) C4403w.m27844o2(R.string.ForwardLastXMessages, 50L), (int) R.id.btn_addMember, true), new C2964ra(13, (int) R.id.btn_forwardLast15, 0, (CharSequence) C4403w.m27844o2(R.string.ForwardLastXMessages, 15L), (int) R.id.btn_addMember, false), new C2964ra(13, (int) R.id.btn_addToGroup, 0, (int) R.string.justAdd, (int) R.id.btn_addMember, false)}).m10003j(new AbstractC9323v4.AbstractC9343r() {
                @Override
                public final void mo1773l6(int i4, SparseIntArray sparseIntArray) {
                    View$OnClickListenerC3062so.this.m31654ek(i, f5Var, view, chatMember, i4, sparseIntArray);
                }
            }).m9995r(R.string.AddMemberBtn));
        } else if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (C4779t2.m25623P2(chatMember.status) || (C4779t2.m25679H2(chatMember.status) && !((TdApi.ChatMemberStatusAdministrator) chatMember.status).canBeEdited)) {
                        f5Var.mo4347s().m14584H3().m8985g(view).m8969F(f5Var, this.f30167b, R.drawable.baseline_error_24, C4403w.m27853m1(R.string.YouCantBanX, yb));
                    } else if (m31762Sj() || m31753Tj()) {
                        m9261ee(C4403w.m27853m1(m31762Sj() ? R.string.MemberCannotJoinGroup : R.string.MemberCannotJoinChannel, yb), new int[]{R.id.btn_blockSender, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.BlockUser), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_remove_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                            @Override
                            public final boolean mo493A3(View view2, int i4) {
                                boolean hk;
                                hk = View$OnClickListenerC3062so.this.m31627hk(chatMember, f5Var, view, view2, i4);
                                return hk;
                            }

                            @Override
                            public boolean mo492Q() {
                                return C5115g0.m23935a(this);
                            }

                            @Override
                            public Object mo491b2(int i4) {
                                return C5115g0.m23934b(this, i4);
                            }
                        });
                    } else {
                        View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30165a, this.f30167b);
                        u7Var.m31376sg(new View$OnClickListenerC3141u7.C3145d(this.f10323o0.f25367id, chatMember.memberId, true, chatMemberStatus, chatMember));
                        f5Var.m9234id();
                        f5Var.m9291ac(u7Var);
                    }
                }
            } else if (C4779t2.m25623P2(chatMember.status) || (C4779t2.m25679H2(chatMember.status) && !((TdApi.ChatMemberStatusAdministrator) chatMember.status).canBeEdited)) {
                C9357x2.C9365h g = f5Var.mo4347s().m14584H3().m8985g(view);
                C10930q6 q6Var = this.f30167b;
                g.m8969F(f5Var, q6Var, R.drawable.baseline_info_24, C4403w.m27865j1(R.string.XIsAlreadyAdmin, q6Var.m2151yb(chatMember.memberId)));
            } else if (m31887Di() || !(chatMember.status.getConstructor() == 1661432998 || chatMember.status.getConstructor() == -1653518666)) {
                View$OnClickListenerC3141u7 u7Var2 = new View$OnClickListenerC3141u7(this.f30165a, this.f30167b);
                u7Var2.m31376sg(new View$OnClickListenerC3141u7.C3145d(this.f10323o0.f25367id, chatMember.memberId, false, chatMemberStatus, chatMember).m31351a(i2));
                f5Var.m9234id();
                f5Var.m9291ac(u7Var2);
            } else {
                f5Var.mo4347s().m14584H3().m8985g(view).m8969F(f5Var, this.f30167b, R.drawable.baseline_error_24, C4403w.m27853m1(R.string.YouCantPromoteX, yb));
            }
        } else if (C4779t2.m25506h3(chatMember.status)) {
            f5Var.mo4347s().m14584H3().m8985g(view).m8969F(f5Var, this.f30167b, R.drawable.baseline_info_24, C4403w.m27865j1(R.string.XIsAlreadyInChat, yb));
        } else if (z) {
            AbstractC9323v4.C9340p.C9341a aVar = new AbstractC9323v4.C9340p.C9341a();
            if (m31753Tj()) {
                i3 = R.string.QAddXToChannel;
            }
            m9247ge(aVar.m9092c(C4403w.m27853m1(i3, yb)).m9091d(new AbstractC9323v4.C9338o(R.id.btn_addMember, C4403w.m27869i1(R.string.AddMember), 1, R.drawable.baseline_person_add_24)).m9093b().m9094a(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i4) {
                    boolean fk;
                    fk = View$OnClickListenerC3062so.this.m31645fk(i, f5Var, view, chatMember, i2, view2, i4);
                    return fk;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23935a(this);
                }

                @Override
                public Object mo491b2(int i4) {
                    return C5115g0.m23934b(this, i4);
                }
            });
        } else {
            this.f30167b.m2827Hb(this.f10323o0.f25367id, chatMember.memberId, new TdApi.ChatMemberStatusMember(), i2, chatMember.status, noVar);
        }
    }

    public final void m31619ij() {
        View$OnClickListenerC3043s8 s8Var = new View$OnClickListenerC3043s8(this.f30165a, this.f30167b);
        s8Var.m31936Sf(new View$OnClickListenerC3043s8.C3046c(this.f10323o0.f25367id));
        m9291ac(s8Var);
    }

    public final void m31616im() {
        this.f10278C1 = 0;
        this.f10276B1 = 0;
        for (int i = 0; i < this.f10283F0.mo8825e(); i++) {
            AbstractC9323v4<?> v = this.f10283F0.m18455v(i);
            if (v != null) {
                ((i10) v).m34343pg();
            }
        }
        m31700Zi();
    }

    public final void m31615in() {
        TdApi.Supergroup supergroup = this.f10337v0;
        boolean z = !supergroup.signMessages;
        supergroup.signMessages = z;
        this.f30167b.m2270r4().m14783o(new TdApi.ToggleSupergroupSignMessages(this.f10337v0.f25425id, z), this.f30167b.m2392ja());
        this.f10279D0.m34130s3(R.id.btn_toggleSignatures);
    }

    @Override
    public void mo23863j(RunnableC2374f5 f5Var, TdApi.MessageSender messageSender, int i) {
        this.f30167b.m2270r4().m14783o(new TdApi.SetChatMemberStatus(this.f10323o0.f25367id, messageSender, new TdApi.ChatMemberStatusMember()), this.f30167b.m2392ja());
    }

    @Override
    public boolean mo404jc(boolean z) {
        C3950k kVar;
        if (m9278cb() || ((kVar = this.f10296O0) != null && kVar.m29531v())) {
            return true;
        }
        if (this.f10305X0) {
            m31673cj();
            return true;
        } else if (!m31744Uj() || !m31806Nj()) {
            return false;
        } else {
            m9179qe(null);
            return true;
        }
    }

    public final void m31611ji(View view) {
        if (m31895Ci() && !m9292ab()) {
            if (this.f10321n0 == 3) {
                TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
                if (supergroupFullInfo != null) {
                    if (supergroupFullInfo.memberCount >= this.f30167b.m2858Fc()) {
                        C9357x2.C9365h g = this.f30165a.m14584H3().m8985g(view);
                        C10930q6 q6Var = this.f30167b;
                        g.m8969F(this, q6Var, R.drawable.baseline_error_24, C4403w.m27836q2(R.string.ParticipantXLimitReached, q6Var.m2858Fc()));
                        return;
                    }
                } else {
                    return;
                }
            }
            if (m31839Ji() || m31887Di()) {
                C5320c cVar = new C5320c(3);
                C5320c cVar2 = new C5320c(3);
                C5146u0 u0Var = new C5146u0(3);
                cVar.m23284a(R.id.btn_addMember);
                cVar2.m23284a(R.drawable.baseline_person_add_24);
                u0Var.m23816a(R.string.AddMember);
                if (m31839Ji()) {
                    cVar.m23284a(R.id.btn_addAdmin);
                    cVar2.m23284a(R.drawable.baseline_stars_24);
                    u0Var.m23816a(R.string.ChannelAddAdmin);
                }
                if (m31887Di()) {
                    cVar.m23284a(R.id.btn_banMember);
                    if (this.f10321n0 == 3) {
                        cVar2.m23284a(R.drawable.baseline_block_24);
                        u0Var.m23816a(R.string.BanMember);
                    } else {
                        cVar2.m23284a(R.drawable.baseline_remove_circle_24);
                        u0Var.m23816a(R.string.BanMember);
                    }
                }
                m9261ee(null, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i) {
                        boolean ak;
                        ak = View$OnClickListenerC3062so.this.m31690ak(view2, i);
                        return ak;
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
                return;
            }
            m31593li(0);
        }
    }

    public final void m31610jj() {
        C2700m6 m6Var = new C2700m6(this.f30165a, this.f30167b);
        m6Var.m33792wf(new C2700m6.C2702b(m31538rj(), this.f10323o0.f25367id).m33791a(this));
        m9291ac(m6Var);
    }

    public final void m31607jm() {
        View$OnClickListenerC3141u7 u7Var = new View$OnClickListenerC3141u7(this.f30165a, this.f30167b);
        u7Var.m31376sg(new View$OnClickListenerC3141u7.C3145d(this.f10323o0.f25367id));
        m9291ac(u7Var);
    }

    public final void m31606jn(View view) {
        if (this.f30167b.m2740N2(this.f10323o0.f25367id)) {
            TdApi.Chat chat = this.f10323o0;
            boolean z = !chat.hasProtectedContent;
            chat.hasProtectedContent = z;
            this.f30167b.m2270r4().m14783o(new TdApi.ToggleChatHasProtectedContent(this.f10323o0.f25367id, z), this.f30167b.m2392ja());
            this.f10279D0.m34130s3(R.id.btn_toggleProtection);
            return;
        }
        mo4347s().m14584H3().m8985g(((C9137c) view).getToggler()).m8972C(this.f30167b, m31753Tj() ? R.string.OnlyOwnerChannel : R.string.OnlyOwnerGroup);
    }

    @Override
    public void mo8849k2(int i) {
        m31789Pj();
        if (this.f10281E0.getCurrentItem() != i) {
            this.f10285G0.getTopView().m10156W1(this.f10281E0.getCurrentItem(), i);
            this.f10344y1 = i;
            m31799Oi(i);
            this.f10281E0.mo18027N(i, true);
        }
    }

    @Override
    public void mo4042k5(final TdApi.Message message, final long j, int i, String str) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31662dl(message, j);
            }
        });
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        if (!m31744Uj()) {
            ((RunnableC9248n) this.f10277C0).setFactorLocked(true);
        }
    }

    public final void m31602ki(RunnableC2374f5 f5Var, View view, TdApi.MessageSender messageSender) {
        TdApi.ChatMember i0;
        int i = this.f10334t1;
        final AtomicReference atomicReference = new AtomicReference();
        final C3064b bVar = new C3064b(f5Var, atomicReference, i, view);
        C4017n nVar = this.f10341x0;
        if (nVar == null || (i0 = nVar.m29311i0(messageSender)) == null) {
            mo4347s().m14603D3(C4403w.m27869i1(R.string.LoadingInformation), new AbstractView$OnTouchListenerC7889a.AbstractC7901l() {
                @Override
                public final void mo14405a() {
                    AbstractRunnableC5910b.this.m21857c();
                }
            }, 1000L);
            mo9397La();
            this.f30167b.m2270r4().m14783o(new TdApi.GetChatMember(this.f10323o0.f25367id, messageSender), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3062so.this.m31681bk(atomicReference, bVar, object);
                }
            });
            return;
        }
        atomicReference.set(i0);
        bVar.run();
    }

    public final void m31601kj() {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3062so.m31601kj():void");
    }

    public final void m31598km() {
        TdApi.ChatMemberStatus K3 = this.f30167b.m2787K3(this.f10323o0.f25367id);
        if (K3 != null) {
            View$OnClickListenerC2855p0 p0Var = new View$OnClickListenerC2855p0(this.f30165a, this.f30167b);
            p0Var.m33192Hh(new View$OnClickListenerC2855p0.C2860d(this.f10323o0.f25367id, this.f30167b.m2519ba(), this, this, K3.getConstructor() == -160019714));
            m9291ac(p0Var);
        }
    }

    public final void m31597kn() {
        final boolean z;
        TdApi.SupergroupFullInfo supergroupFullInfo;
        TdApi.SupergroupFullInfo supergroupFullInfo2 = this.f10339w0;
        if (supergroupFullInfo2 != null) {
            z = supergroupFullInfo2.isAllHistoryAvailable;
        } else if (this.f10335u0 != null) {
            z = false;
        } else {
            return;
        }
        final C2964ra raVar = new C2964ra(28, 0, 0, z ? R.string.ChatHistoryVisibleInfo : R.string.ChatHistoryHiddenInfo, false);
        if (!(z || (supergroupFullInfo = this.f10339w0) == null || supergroupFullInfo.linkedChatId == 0)) {
            raVar.m32853X(new SpannableStringBuilder(C4403w.m27869i1(R.string.ChatHistoryHiddenInfo)).append((CharSequence) "\n\n").append(C4403w.m27853m1(R.string.ChatHistoryWarnLinkedChannel, this.f30167b.m2691Q3(this.f10339w0.linkedChatId))));
        }
        if (this.f10335u0 != null) {
            raVar.m32853X(C4403w.m27844o2(R.string.ChatHistoryPartiallyHiddenInfo, 100L));
        }
        m9206me(new C9188f2(R.id.btn_prehistoryMode).m9997p(new C2964ra[]{new C2964ra(13, (int) R.id.btn_visible, 0, (int) R.string.ChatHistoryVisible, (int) R.id.btn_prehistoryMode, z), new C2964ra(13, (int) R.id.btn_hidden, 0, (int) R.string.ChatHistoryHidden, (int) R.id.btn_prehistoryMode, !z)}).m10004i(raVar).m9999n(new AbstractC9323v4.AbstractC9337n() {
            @Override
            public final void mo3907a(View view, int i, C2964ra raVar2, TextView textView, C2546iq iqVar) {
                View$OnClickListenerC3062so.this.m31828Kl(raVar, view, i, raVar2, textView, iqVar);
            }
        }).m10003j(new AbstractC9323v4.AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                View$OnClickListenerC3062so.this.m31796Ol(z, i, sparseIntArray);
            }
        }));
    }

    @Override
    public void mo4041l0(final long j, final long j2, final TdApi.MessageContent messageContent) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31671cl(j, j2, messageContent);
            }
        });
    }

    @Override
    public void mo3247l4(long j, TdApi.ChatNotificationSettings chatNotificationSettings) {
        m31780Qj(j);
    }

    @Override
    public int mo415la() {
        return R.id.menu_clear;
    }

    public final void m31593li(int i) {
        this.f10334t1 = i;
        RunnableC2374f5 f5Var = new RunnableC2374f5(this.f30165a, this.f30167b);
        f5Var.m34725zg(10);
        if (!m31753Tj()) {
            boolean z = false;
            f5Var.m34766Vg(i == 1);
            boolean z2 = i == 2;
            if (i == 2) {
                z = true;
            }
            f5Var.m34765Wg(z2, z);
        }
        f5Var.m34764Xg(new RunnableC2374f5.C2376b(this));
        int i2 = this.f10334t1;
        if (i2 == 0) {
            f5Var.m34760Zg(R.string.AddMember, this.f10323o0.title);
        } else if (i2 == 1) {
            f5Var.m34760Zg(R.string.ChannelAddAdmin, this.f10323o0.title);
        } else if (i2 == 2) {
            f5Var.m34760Zg(R.string.BanMember, this.f10323o0.title);
        }
        m9291ac(f5Var);
    }

    public final void m31592lj(long j, TdApi.MessageContent messageContent) {
        int e = this.f10283F0.mo8825e();
        for (int i = 0; i < e; i++) {
            AbstractC9323v4<?> v = this.f10283F0.m18455v(i);
            if (v != null) {
                ((i10) v).m34334wf(j, messageContent);
            }
        }
    }

    public final void m31589lm() {
        final TdApi.ChatInviteLink vj = m31504vj();
        if (vj == null) {
            m31598km();
            return;
        }
        C5146u0 u0Var = new C5146u0(5);
        C5320c cVar = new C5320c(5);
        C5320c cVar2 = new C5320c(5);
        C5320c cVar3 = new C5320c(5);
        cVar2.m23284a(R.id.btn_manageInviteLinks);
        u0Var.m23816a(R.string.InviteLinkManage);
        cVar.m23284a(R.drawable.baseline_add_link_24);
        cVar3.m23284a(1);
        TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo = this.f10323o0.pendingJoinRequests;
        if (chatJoinRequestsInfo != null && chatJoinRequestsInfo.totalCount > 0) {
            cVar2.m23284a(R.id.btn_manageJoinRequests);
            u0Var.m23816a(R.string.InviteLinkRequests);
            cVar.m23284a(R.drawable.baseline_pending_24);
            cVar3.m23284a(1);
        }
        cVar2.m23284a(R.id.btn_copyLink);
        u0Var.m23816a(R.string.InviteLinkCopy);
        cVar.m23284a(R.drawable.baseline_content_copy_24);
        cVar3.m23284a(1);
        cVar2.m23284a(R.id.btn_shareLink);
        u0Var.m23816a(R.string.ShareLink);
        cVar.m23284a(R.drawable.baseline_forward_24);
        cVar3.m23284a(1);
        cVar.m23284a(R.drawable.baseline_link_off_24);
        cVar2.m23284a(R.id.btn_revokeLink);
        u0Var.m23816a(R.string.RevokeLink);
        cVar3.m23284a(2);
        m9261ee(C4403w.m27873h1(R.string.format_nameAndStatus, C2198bo.f7687a, vj.inviteLink, C4779t2.m25449p4(C4403w.m27873h1(R.string.CreatedByXOnDate, new C4403w.AbstractC4409f() {
            @Override
            public final Object mo379a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
                Object ql;
                ql = View$OnClickListenerC3062so.this.m31545ql(vj, charSequence, i, i2, i3, z);
                return ql;
            }
        }, this.f30167b.m2480e2().m1721K2(vj.creatorUserId), C4403w.m27910Z0(vj.date, TimeUnit.SECONDS)))), cVar2.m23280e(), u0Var.m23813d(), cVar3.m23280e(), cVar.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean vl;
                vl = View$OnClickListenerC3062so.this.m31502vl(vj, view, i);
                return vl;
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

    public final void m31588ln() {
        if (!m31744Uj()) {
            this.f30167b.m2781K9().m1806t0(this.f10323o0.f25367id, this);
            this.f30167b.m2781K9().m1790x0(this);
        }
        this.f30167b.m2781K9().m1818q0(this.f10323o0.f25367id, this);
        switch (this.f10321n0) {
            case 0:
            case 1:
                this.f30167b.m2480e2().m1595s2(this.f10327q0.f25439id, this);
                if (this.f10321n0 == 1) {
                    this.f30167b.m2480e2().m1607p2(this.f10329r0.f25419id, this);
                    return;
                }
                return;
            case 2:
            case 5:
                this.f30167b.m2480e2().m1611o2(this.f10333t0.f25363id, this);
                this.f30167b.m2480e2().m1722K1(this.f10323o0.f25367id, this);
                return;
            case 3:
            case 4:
            case 6:
            case 7:
                this.f30167b.m2480e2().m1603q2(this.f10337v0.f25425id, this);
                this.f30167b.m2480e2().m1722K1(this.f10323o0.f25367id, this);
                return;
            default:
                return;
        }
    }

    @Override
    public void mo4060m0(long j, int i, boolean z) {
        C10721i0.m4174w(this, j, i, z);
    }

    @Override
    public void mo134m7(boolean z, C11510b bVar) {
        super.mo134m7(z, bVar);
        C9239m mVar = this.f10275B0;
        if (mVar != null) {
            mVar.setTextColor(C5064d.m24128d(C11524j.m161p0(), C11524j.m217S0(), m9456Da()));
        }
    }

    @Override
    public String mo9210ma() {
        AbstractC9323v4<?> oj = m31565oj();
        if (oj != null) {
            return ((i10) oj).m34409Bf();
        }
        return null;
    }

    @Override
    public void mo9208mc(Configuration configuration) {
        CustomRecyclerView customRecyclerView;
        super.mo9208mc(configuration);
        if (!m31744Uj() && (customRecyclerView = this.f10277C0) != null) {
            ((RunnableC9248n) customRecyclerView).m9799Q1();
        }
    }

    public final void m31584mi(TdApi.Message message) {
        int r4;
        if (m31574nj(message) && mo9464C9() == message.chatId && (r4 = C4779t2.m25435r4(message, false)) != -869395657) {
            TdApi.SearchMessagesFilter[] sj = m31529sj();
            int length = sj.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                TdApi.SearchMessagesFilter searchMessagesFilter = sj[i];
                if (searchMessagesFilter.getConstructor() == r4) {
                    m31798Oj(searchMessagesFilter);
                    break;
                }
                i++;
            }
        }
        int e = this.f10283F0.mo8825e();
        for (int i2 = 0; i2 < e; i2++) {
            AbstractC9323v4<?> v = this.f10283F0.m18455v(i2);
            if (v != null) {
                ((i10) v).mo34356ef(message);
            }
        }
    }

    public final void m31580mm() {
        View$OnClickListenerC3021s sVar = new View$OnClickListenerC3021s(this.f30165a, this.f30167b);
        sVar.m32117Cg(new View$OnClickListenerC3021s.C3022a(this.f10323o0.f25367id, "", this));
        m9291ac(sVar);
    }

    public final void m31579mn() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            View$OnClickListenerC9150b backButton = d1Var.getBackButton();
            int l0 = C11524j.m169l0();
            C9239m mVar = this.f10275B0;
            backButton.setColor(C5064d.m24128d(C5064d.m24128d(l0, -1, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f), C11524j.m228N(R.id.theme_color_icon), m9456Da()));
            this.f30156R.m10080W3(mo418W9(), this, m9456Da());
        }
    }

    public void m31575ni(RecyclerView recyclerView) {
        recyclerView.m39422k(new C3065c());
    }

    public final void m31571nm() {
        TdApi.ChatPhotoInfo chatPhotoInfo = this.f10323o0.photo;
        if (chatPhotoInfo != null && !C4779t2.m25604S2(chatPhotoInfo.small)) {
            View$OnClickListenerC7430j1.m16213hk(this, this.f10323o0, this.f10275B0);
        }
    }

    public void m31570nn(long j, String str) {
        if (mo9464C9() == j) {
            TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
            if (supergroupFullInfo != null) {
                supergroupFullInfo.description = str;
            }
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f10335u0;
            if (basicGroupFullInfo != null) {
                basicGroupFullInfo.description = str;
            }
            m31781Qi();
        }
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        if (Build.VERSION.SDK_INT >= 26 && this.f10279D0 != null) {
            m31778Ql();
        }
    }

    @Override
    public View mo403oc(Context context) {
        C3066d dVar = new C3066d(context);
        this.f10273A0 = dVar;
        C10192g.m5782i(dVar, R.id.theme_color_background, this);
        this.f10273A0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C7045v2 v2Var = new C7045v2(context);
        this.f10281E0 = v2Var;
        v2Var.setOverScrollMode(2);
        this.f10281E0.mo18020c(this);
        C7045v2 v2Var2 = this.f10281E0;
        C6919i4 i4Var = new C6919i4(this);
        this.f10283F0 = i4Var;
        v2Var2.setAdapter(i4Var);
        this.f10281E0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f10273A0.addView(this.f10281E0);
        if (m31744Uj()) {
            this.f10277C0 = new C3067e(context);
        } else {
            C9239m mVar = new C9239m(context, this.f30167b, this);
            this.f10275B0 = mVar;
            mVar.setAvatarExpandListener(new C9239m.AbstractC9241b() {
                @Override
                public final void mo9806a(C9239m mVar2, float f, boolean z, float f2, float f3) {
                    View$OnClickListenerC3062so.this.m31689al(mVar2, f, z, f2, f3);
                }
            });
            this.f10275B0.setInnerRightMarginStart(C1357a0.m37541i(49.0f));
            this.f10275B0.m9833Q1(C1357a0.m37541i(56.0f), m31911Ai());
            this.f10275B0.m9841K1();
            this.f10275B0.m9815q1(this, false);
            this.f10275B0.setPhotoOpenCallback(this);
            C3068f fVar = new C3068f(context, this);
            this.f10277C0 = fVar;
            fVar.m9798R1(this.f10275B0, this);
        }
        this.f10277C0.m39422k(new C3069g());
        this.f10277C0.setHasFixedSize(true);
        this.f10277C0.m39434g(new C3076n());
        this.f10277C0.setItemAnimator(null);
        this.f10277C0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f10277C0.setOverScrollMode(2);
        this.f10277C0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f10273A0.addView(this.f10277C0);
        C3078p pVar = new C3078p(context);
        this.f10289I0 = pVar;
        m9163t8(pVar);
        this.f10289I0.setLayoutParams(FrameLayoutFix.m18008s1(-1, View$OnClickListenerC9170d1.m10066c3(true)));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f10287H0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, m31902Bj() + m31854Hj() + C1357a0.m37541i(6.0f)));
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, m31902Bj());
        s1.topMargin = m31854Hj();
        C9391z4 z4Var = new C9391z4(context);
        this.f10285G0 = z4Var;
        C10192g.m5782i(z4Var, R.id.theme_color_filling, this);
        View$OnClickListenerC9156b5 topView = this.f10285G0.getTopView();
        topView.m10151b2();
        topView.setOnItemClickListener(this);
        topView.m10153Z1(R.id.theme_color_profileSectionActive);
        topView.m10152a2(R.id.theme_color_textLight, R.id.theme_color_profileSectionActiveContent);
        m9163t8(topView);
        topView.setItems(m31910Aj());
        this.f10285G0.getRecyclerView().setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        topView.setLayoutParams(FrameLayoutFix.m18008s1(-2, -1));
        this.f10285G0.setLayoutParams(s1);
        this.f10287H0.addView(this.f10285G0);
        m9163t8(topView);
        FrameLayout.LayoutParams s12 = FrameLayoutFix.m18008s1(-1, C1357a0.m37541i(6.0f));
        s12.topMargin = m31902Bj() + m31854Hj();
        C6879f3 f3Var = new C6879f3(context);
        m9163t8(f3Var);
        f3Var.setSimpleBottomTransparentShadow(false);
        f3Var.setLayoutParams(s12);
        this.f10287H0.addView(f3Var);
        FrameLayout.LayoutParams s13 = FrameLayoutFix.m18008s1(-1, m31854Hj());
        C6879f3 f3Var2 = new C6879f3(context);
        this.f10291J0 = f3Var2;
        m9163t8(f3Var2);
        this.f10291J0.setSimpleTopShadow(true);
        this.f10291J0.setLayoutParams(s13);
        if (m31715Xl()) {
            this.f10273A0.addView(this.f10287H0);
            this.f10273A0.addView(this.f10289I0);
            this.f10273A0.addView(this.f10291J0);
        }
        this.f10279D0 = new C3070h(this);
        this.f10285G0.getRecyclerView().m39422k(new C3071i());
        m31521ti();
        this.f10277C0.setAdapter(this.f10279D0);
        C9239m mVar2 = this.f10275B0;
        if (mVar2 != null) {
            mVar2.setShowLock(this.f10321n0 == 1);
            m31777Qm(false);
            m31759Sm();
            m31768Rm(false);
            if (this.f10321n0 == 1) {
                this.f30167b.m2485dd().m3657Y8(mo418W9(), this.f30156R, this.f10323o0, true);
            }
        }
        m31624hn();
        if (!m31744Uj()) {
            this.f30167b.m2270r4().m14783o(new TdApi.GetChat(this.f10323o0.f25367id), this);
            int i = this.f10321n0;
            if (i == 0 || i == 1) {
                m31476ym(this.f30167b.m2480e2().m1745E2(this.f10327q0.f25439id));
            } else if (i == 2) {
                m31484xm(this.f30167b.m2480e2().m1708O(this.f10333t0.f25363id));
            } else if (i == 3) {
                this.f30167b.m2270r4().m14783o(new TdApi.GetSupergroupMembers(this.f10337v0.f25425id, new TdApi.SupergroupMembersFilterRecent(), 0, C1357a0.m37548b(C1357a0.m37541i(84.0f), 0)), this);
                m31501vm(this.f30167b.m2480e2().m1634i2(this.f10337v0.f25425id));
            } else if (i == 4) {
                m31501vm(this.f30167b.m2480e2().m1634i2(this.f10337v0.f25425id));
                if (C4779t2.m25623P2(this.f10337v0.status)) {
                    this.f30167b.m2270r4().m14783o(new TdApi.GetSupergroupMembers(this.f10337v0.f25425id, new TdApi.SupergroupMembersFilterAdministrators(), 0, C1357a0.m37548b(C1357a0.m37541i(84.0f), 0)), this);
                }
            }
        }
        return this.f10273A0;
    }

    public final void m31566oi(C2964ra raVar, int i) {
        int min = Math.min(this.f10315h1, i);
        if (this.f10315h1 == 0) {
            this.f10279D0.m34240F0().add(1, raVar);
            this.f10279D0.m34240F0().add(2, new C2964ra(3));
            this.f10279D0.m34240F0().add(3, new C2964ra(2));
            this.f10279D0.m39308M(1, 3);
        } else {
            int i2 = 11;
            if (min == 0) {
                this.f10279D0.m34240F0().add(1, raVar);
                List<C2964ra> F0 = this.f10279D0.m34240F0();
                if (raVar.m32876A() != 7) {
                    i2 = 1;
                }
                F0.add(2, new C2964ra(i2));
                this.f10279D0.m39308M(1, 2);
            } else {
                int max = Math.max(0, (min * 2) - 1) + 1;
                List<C2964ra> F02 = this.f10279D0.m34240F0();
                if (raVar.m32876A() != 7) {
                    i2 = 1;
                }
                F02.add(max, new C2964ra(i2));
                this.f10279D0.m34240F0().add(max + 1, raVar);
                this.f10279D0.m39308M(max, 2);
            }
        }
        this.f10315h1++;
        m31616im();
    }

    public final AbstractC9323v4<?> m31565oj() {
        return this.f10283F0.m18455v(this.f10281E0.getCurrentItem());
    }

    public final void m31562om() {
        View$OnClickListenerC2192bl blVar = new View$OnClickListenerC2192bl(this.f30165a, this.f30167b);
        blVar.m9476Ad(new View$OnClickListenerC2192bl.C2195c(mo9464C9()));
        m9291ac(blVar);
    }

    public final void m31561on(boolean z) {
        if (this.f10275B0 != null) {
            m31759Sm();
            if (z) {
                m31768Rm(true);
            }
            this.f10275B0.invalidate();
        }
    }

    @Override
    public void onClick(View view) {
        byte[] bArr;
        TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo;
        switch (view.getId()) {
            case R.id.avatar:
                m31831Ki();
                return;
            case R.id.btn_channelType:
                m31619ij();
                return;
            case R.id.btn_chatPermissions:
                m31607jm();
                return;
            case R.id.btn_description:
                if (!m31863Gi() || !C5070i.m24061i(m31538rj())) {
                    C5320c cVar = new C5320c(2);
                    C5146u0 u0Var = new C5146u0(2);
                    C5320c cVar2 = new C5320c(2);
                    if (m31863Gi()) {
                        cVar.m23284a(R.id.btn_edit);
                        u0Var.m23816a(R.string.edit);
                        cVar2.m23284a(R.drawable.baseline_edit_24);
                    }
                    cVar.m23284a(R.id.btn_copyText);
                    u0Var.m23816a(R.string.Copy);
                    cVar2.m23284a(R.drawable.baseline_content_copy_24);
                    m9261ee(null, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
                        @Override
                        public final boolean mo493A3(View view2, int i) {
                            boolean Zk;
                            Zk = View$OnClickListenerC3062so.this.m31698Zk(view2, i);
                            return Zk;
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
                    return;
                }
                m31610jj();
                return;
            case R.id.btn_done:
                m31548qi();
                return;
            case R.id.btn_encryptionKey:
                TdApi.SecretChat secretChat = this.f10329r0;
                if (secretChat != null && (bArr = secretChat.keyHash) != null && bArr.length > 0) {
                    C2820o9 o9Var = new C2820o9(this.f30165a, this.f30167b);
                    o9Var.m33262Qe(new C2820o9.C2822b(this.f10327q0.f25439id, this.f10329r0.keyHash));
                    m9291ac(o9Var);
                    return;
                }
                return;
            case R.id.btn_inviteLink:
                m31589lm();
                return;
            case R.id.btn_linkedChat:
                m31601kj();
                return;
            case R.id.btn_manageInviteLinks:
                m31598km();
                return;
            case R.id.btn_manageJoinRequests:
                m31580mm();
                return;
            case R.id.btn_notifications:
                this.f30167b.m2485dd().m3837G8(this, this.f10323o0.f25367id, true, null);
                return;
            case R.id.btn_phone:
                this.f30167b.m2485dd().m3453t3(this, view, view.getId(), this.f10327q0, false);
                return;
            case R.id.btn_prehistoryMode:
                m31597kn();
                return;
            case R.id.btn_recentActions:
                m31553pm();
                return;
            case R.id.btn_toggleProtection:
                m31606jn(view);
                return;
            case R.id.btn_toggleSignatures:
                m31615in();
                return;
            case R.id.btn_useExplicitDice:
                C4868i.m24726c2().m24675i5(((C2964ra) view.getTag()).m32832m(), this.f10279D0.m34201W2(view));
                return;
            case R.id.btn_username:
                TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
                boolean z = false;
                boolean z2 = supergroupFullInfo != null && supergroupFullInfo.canSetUsername;
                TdApi.Chat chat = this.f10323o0;
                if (chat != null && this.f30167b.m2948A2(chat)) {
                    z = true;
                }
                int i = 3;
                if (z2) {
                    i = 4;
                }
                if (z) {
                    i++;
                }
                C5320c cVar3 = new C5320c(i);
                C5146u0 u0Var2 = new C5146u0(i);
                C5320c cVar4 = new C5320c(i);
                if (z2) {
                    cVar3.m23284a(R.id.btn_editUsername);
                    u0Var2.m23816a(R.string.edit);
                    cVar4.m23284a(R.drawable.baseline_edit_24);
                }
                if (z) {
                    cVar3.m23284a(R.id.btn_manageInviteLinks);
                    u0Var2.m23816a(R.string.InviteLinkManage);
                    cVar4.m23284a(R.drawable.baseline_add_link_24);
                }
                if (z && (chatJoinRequestsInfo = this.f10323o0.pendingJoinRequests) != null && chatJoinRequestsInfo.totalCount > 0) {
                    cVar3.m23284a(R.id.btn_manageJoinRequests);
                    u0Var2.m23816a(R.string.InviteLinkRequests);
                    cVar4.m23284a(R.drawable.baseline_pending_24);
                }
                cVar3.m23284a(R.id.btn_copyUsername);
                u0Var2.m23816a(R.string.Copy);
                cVar4.m23284a(R.drawable.baseline_content_copy_24);
                cVar3.m23284a(R.id.btn_copyLink);
                u0Var2.m23816a(R.string.CopyLink);
                cVar4.m23284a(R.drawable.baseline_link_24);
                cVar3.m23284a(R.id.btn_share);
                u0Var2.m23816a(R.string.Share);
                cVar4.m23284a(R.drawable.baseline_forward_24);
                m9268de("@" + this.f30167b.m2462f4(this.f10323o0.f25367id), cVar3.m23280e(), u0Var2.m23813d(), null, cVar4.m23280e());
                return;
            case R.id.btn_viewStatistics:
                m31544qm();
                return;
            case R.id.menu_btn_clear:
                AbstractC9323v4<?> oj = m31565oj();
                if (oj != null) {
                    ((i10) oj).m34339tf();
                    return;
                }
                return;
            case R.id.menu_btn_copy:
                AbstractC9323v4<?> oj2 = m31565oj();
                if (oj2 != null) {
                    ((i10) oj2).m34338uf();
                    return;
                }
                return;
            case R.id.menu_btn_delete:
                AbstractC9323v4<?> oj3 = m31565oj();
                if (oj3 != null) {
                    ((i10) oj3).m34336vf();
                    return;
                }
                return;
            case R.id.menu_btn_forward:
                AbstractC9323v4<?> oj4 = m31565oj();
                if (oj4 != null) {
                    ((i10) oj4).m34398Ig();
                    return;
                }
                return;
            case R.id.menu_btn_view:
                AbstractC9323v4<?> oj5 = m31565oj();
                if (oj5 != null) {
                    ((i10) oj5).m34388Og();
                    return;
                }
                return;
            case R.id.user:
                TdApi.User user = (TdApi.User) view.getTag();
                if (user != null) {
                    this.f30167b.m2485dd().m3429v7(this, user.f25439id, null);
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
        int i = this.f10321n0;
        if (i != 2 && i != 3) {
            return false;
        }
        C5320c cVar = new C5320c(3);
        C5146u0 u0Var = new C5146u0(3);
        C5320c cVar2 = new C5320c(3);
        if (m31855Hi(user.f25439id)) {
            cVar.m23284a(R.id.btn_deleteMember);
            u0Var.m23816a(R.string.KickFromGroup);
            cVar2.m23284a(2);
        }
        if (!this.f30167b.m2379k7(user.f25439id)) {
            cVar.m23284a(R.id.btn_groupsInCommon);
            u0Var.m23816a(R.string.ViewGroupsInCommon);
            cVar2.m23284a(1);
        }
        if (cVar.m23279f()) {
            cVar.m23284a(R.id.btn_openChat);
            u0Var.m23816a(R.string.OpenChat);
            cVar2.m23284a(1);
        }
        cVar.m23284a(R.id.btn_cancel);
        u0Var.m23816a(R.string.Cancel);
        cVar2.m23284a(1);
        m9220ke(cVar.m23280e(), u0Var.m23813d(), cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view2, int i2) {
                boolean bl;
                bl = View$OnClickListenerC3062so.this.m31680bl(user, view2, i2);
                return bl;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23935a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23934b(this, i2);
            }
        });
        return true;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        int i2;
        int i3;
        int i4;
        if (i != R.id.menu_clear) {
            switch (i) {
                case R.id.menu_profile:
                case R.id.menu_profile_bot:
                case R.id.menu_profile_manage:
                case R.id.menu_profile_private:
                case R.id.menu_profile_secret:
                    LinearLayout linearLayout2 = new LinearLayout(mo4347s());
                    int i5 = 0;
                    linearLayout2.setOrientation(0);
                    linearLayout2.setLayoutParams(FrameLayoutFix.m18007t1(-2, -1, C4403w.m27984G2() ? 3 : 5));
                    C9310u0 u0Var = null;
                    int O9 = mo9375O9();
                    int i6 = this.f10321n0;
                    if (i6 == 1 || i6 == 0) {
                        i4 = 1;
                        i2 = O9;
                        i3 = -1;
                        u0Var = d1Var.m10104N1(linearLayout2, R.id.menu_btn_call, R.drawable.baseline_phone_24, O9, this, C1357a0.m37541i(48.0f));
                        TdApi.UserFullInfo userFullInfo = this.f10331s0;
                        u0Var.setAlpha((userFullInfo == null || (!userFullInfo.canBeCalled && !userFullInfo.hasPrivateCalls)) ? 0.0f : 1.0f);
                    } else {
                        i2 = O9;
                        i4 = 1;
                        i3 = -1;
                    }
                    if (this.f10321n0 == i4) {
                        C9202h2 l2 = d1Var.m10048l2(linearLayout2, this);
                        l2.m9979l(this.f30167b.m2485dd().m3523m3(this.f10323o0.f25367id), C7316a.m17051j(this.f10323o0.f25367id) && this.f30167b.m2220u6(this.f10323o0));
                        if (!l2.getIsVisible()) {
                            u0Var.setTranslationX(C1357a0.m37541i(39.0f));
                        }
                    }
                    if (i == R.id.menu_profile) {
                        d1Var.m10104N1(linearLayout2, R.id.menu_btn_manage, R.drawable.baseline_edit_24, i2, this, C1357a0.m37541i(49.0f)).setVisibility(m31847Ii() ? 0 : 8);
                        d1Var.m10104N1(linearLayout2, R.id.menu_btn_addContact, R.drawable.baseline_person_add_24, i2, this, C1357a0.m37541i(49.0f)).setVisibility(m31895Ci() ? 0 : 8);
                    }
                    C9310u0 d2 = d1Var.m10065d2(linearLayout2, this, i2);
                    if (i == R.id.menu_profile_manage) {
                        d2.setVisibility(m31838Jj() ? 0 : 4);
                    }
                    LinearLayout linearLayout3 = new LinearLayout(mo4347s());
                    linearLayout3.setLayoutParams(FrameLayoutFix.m18007t1(-2, i3, C4403w.m27984G2() ? 3 : 5));
                    linearLayout3.setOrientation(0);
                    linearLayout3.setAlpha(0.0f);
                    linearLayout3.setTranslationY(View$OnClickListenerC9170d1.m10066c3(false));
                    C9310u0 g = d1Var.m10050k2(linearLayout3, this, R.id.theme_color_icon).m9518g(R.id.theme_color_icon);
                    ArrayList<i10<?>> qj = m31547qj();
                    if (qj.isEmpty() || !qj.get(0).mo33500rf()) {
                        i5 = 4;
                    }
                    g.setVisibility(i5);
                    FrameLayoutFix frameLayoutFix = new FrameLayoutFix(mo4347s());
                    frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-2, i3));
                    frameLayoutFix.addView(linearLayout2);
                    frameLayoutFix.addView(linearLayout3);
                    linearLayout.addView(frameLayoutFix);
                    if (m9456Da() != 0.0f) {
                        mo9429H8(linearLayout, m9456Da());
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            d1Var.m10096Q1(linearLayout, R.id.theme_color_textLight, mo9472B9());
        }
    }

    @Override
    public void mo4040p1(long j, long j2, TdApi.UnreadReaction[] unreadReactionArr, int i) {
        C10722i1.m4160l(this, j, j2, unreadReactionArr, i);
    }

    public final void m31557pi(float f) {
        if (this.f10296O0 == null) {
            this.f10296O0 = new C3950k(0, this, C2057b.f7280b, 218L, this.f10295N0);
        }
        this.f10296O0.m29544i(f);
    }

    public final int m31556pj() {
        AbstractC9323v4<?> oj = m31565oj();
        if (oj != null) {
            return ((i10) oj).m34349kf();
        }
        return 0;
    }

    public final void m31553pm() {
        View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(this.f30165a, this.f30167b);
        rhVar.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(3, null, this.f10323o0));
        m9291ac(rhVar);
    }

    public final void m31552pn() {
        C9239m mVar = this.f10275B0;
        if (mVar != null) {
            mVar.setIgnoreMute(this.f10298Q0);
            if (this.f10298Q0) {
                AbstractC9323v4<?> oj = m31565oj();
                this.f10275B0.setInnerRightMargin((!(oj instanceof i10) || !((i10) oj).mo33500rf()) ? 0 : C1357a0.m37541i(49.0f));
                return;
            }
            this.f10275B0.setInnerRightMargin(m31911Ai());
        }
    }

    @Override
    public void mo4059q6(long j, boolean z) {
        C10721i0.m4189h(this, j, z);
    }

    public final void m31548qi() {
        m31539ri(false);
    }

    public final ArrayList<i10<?>> m31547qj() {
        TdApi.UserFullInfo E2;
        if (this.f10286G1.isEmpty()) {
            int i = this.f10321n0;
            if (i == 5 || i == 6) {
                this.f10286G1.add(new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterAdministrators()));
                if (this.f10321n0 != 6 ? C4779t2.m25623P2(this.f10333t0.status) : C4779t2.m25679H2(this.f10337v0.status)) {
                    this.f10286G1.add(new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterRestricted()));
                    this.f10286G1.add(new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterBanned()));
                }
            } else if (i != 7) {
                String H3 = this.f30167b.m2835H3(this.f10323o0);
                int i2 = this.f10321n0;
                if (i2 == 2 || i2 == 3) {
                    this.f10286G1.add(new c20(this.f30165a, this.f30167b));
                }
                if (H3 == null) {
                    TdApi.SearchMessagesFilter[] sj = m31529sj();
                    this.f10290I1 = sj.length - 3;
                    for (TdApi.SearchMessagesFilter searchMessagesFilter : sj) {
                        if (m31717Xj(searchMessagesFilter)) {
                            this.f10286G1.add(i10.m34390Ng(this.f30165a, this.f30167b, searchMessagesFilter));
                        } else {
                            m31471zj(searchMessagesFilter, true);
                        }
                    }
                    for (TdApi.SearchMessagesFilter searchMessagesFilter2 : sj) {
                        if (m31717Xj(searchMessagesFilter2)) {
                            m31471zj(searchMessagesFilter2, true);
                        }
                    }
                } else {
                    this.f10286G1.add(new d20(this.f30165a, this.f30167b).m35150Qg(H3));
                }
                int i3 = this.f10321n0;
                if ((i3 == 0 || i3 == 1) && (E2 = this.f30167b.m2480e2().m1745E2(this.f10327q0.f25439id)) != null && E2.groupInCommonCount > 0) {
                    this.f10286G1.add(new l10(this.f30165a, this.f30167b));
                }
            } else {
                this.f10286G1.add(new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterAdministrators()));
                this.f10286G1.add(new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterBanned()));
                TdApi.SupergroupFullInfo i22 = this.f30167b.m2480e2().m1634i2(this.f10337v0.f25425id);
                if (i22 != null && i22.canGetMembers) {
                    this.f10286G1.add(new c20(this.f30165a, this.f30167b).m35355Ch(new TdApi.SupergroupMembersFilterRecent()));
                }
            }
        }
        return this.f10286G1;
    }

    public final void m31544qm() {
        View$OnClickListenerC2602k1 k1Var = new View$OnClickListenerC2602k1(this.f30165a, this.f30167b);
        k1Var.m9476Ad(new View$OnClickListenerC2602k1.C2604b(this.f10323o0.f25367id));
        m9291ac(k1Var);
    }

    public void m31543qn(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        int i;
        float f = 1.0f;
        float f2 = C4403w.m27984G2() ? 1.0f : -1.0f;
        C9310u0 u0Var = this.f10310c1;
        int i2 = 0;
        if (u0Var != null) {
            u0Var.setAlpha(z3 ? 1.0f : 0.0f);
            i = (z3 ? C1357a0.m37541i(48.0f) : 0) + 0;
        } else {
            i = 0;
        }
        C9310u0 u0Var2 = this.f10311d1;
        if (u0Var2 != null) {
            u0Var2.setAlpha(z ? 1.0f : 0.0f);
            this.f10311d1.setTranslationX(i * f2);
            i += z ? C1357a0.m37541i(48.0f) : 0;
        }
        C9310u0 u0Var3 = this.f10309b1;
        if (u0Var3 != null) {
            u0Var3.setAlpha(z2 ? 1.0f : 0.0f);
            this.f10309b1.setTranslationX(i * f2);
            i += z2 ? C1357a0.m37541i(48.0f) : 0;
        }
        C9310u0 u0Var4 = this.f10312e1;
        if (u0Var4 != null) {
            u0Var4.setAlpha(z4 ? 1.0f : 0.0f);
            this.f10312e1.setTranslationX(i * f2);
            if (z4) {
                i2 = C1357a0.m37541i(48.0f);
            }
            i += i2;
        }
        C9310u0 u0Var5 = this.f10313f1;
        if (u0Var5 != null) {
            if (!z5) {
                f = 0.0f;
            }
            u0Var5.setAlpha(f);
            this.f10313f1.setTranslationX(i * f2);
            if (z5) {
                C1357a0.m37541i(48.0f);
            }
        }
    }

    @Override
    public void mo4039r5(long j, long j2, int i, TdApi.ReplyMarkup replyMarkup) {
        C10722i1.m4169c(this, j, j2, i, replyMarkup);
    }

    @Override
    public void mo9174rc() {
        AbstractC9323v4<?> kd = m9221kd();
        if (!(kd instanceof View$OnClickListenerC2971rh) || kd.mo9464C9() != this.f10323o0.f25367id) {
            this.f30167b.m2485dd().m3881C4(this, this.f10323o0, null);
        } else {
            m9298Zb();
        }
    }

    public final void m31539ri(boolean z) {
        if (this.f10324o1 || !m31806Nj()) {
            return;
        }
        if (z || !m31830Kj() || !C7316a.m17054g(this.f10323o0.f25367id)) {
            final ArrayList arrayList = new ArrayList(3);
            C2964ra raVar = this.f10318k1;
            String str = null;
            String x = raVar != null ? raVar.m32821x() : null;
            if (this.f10318k1 != null && !C5070i.m24067c(this.f10323o0.title, x)) {
                if (C5070i.m24060j(x)) {
                    C1379j0.m37292y0(R.string.ChatTitleEmpty, 0);
                    return;
                }
                arrayList.add(new TdApi.SetChatTitle(this.f10323o0.f25367id, x));
            }
            C2964ra raVar2 = this.f10319l1;
            if (raVar2 != null) {
                str = raVar2.m32821x();
            }
            if (this.f10319l1 != null && !C5070i.m24067c(m31538rj(), this.f10319l1.m32821x())) {
                arrayList.add(new TdApi.SetChatDescription(this.f10323o0.f25367id, str));
            }
            boolean Kj = m31830Kj();
            boolean Mj = m31814Mj();
            if (Kj) {
                arrayList.add(new TdApi.SetChatSlowModeDelay(this.f10323o0.f25367id, C7322f.f23230a[this.f10326p1.m32826s()]));
            }
            if (Mj) {
                arrayList.add(new TdApi.SetChatMessageTtl(this.f10323o0.f25367id, C7322f.f23231b[this.f10330r1.m32826s()]));
            }
            if (!arrayList.isEmpty()) {
                m31819Lm(true);
                m31723Wm(true);
                final Runnable lmVar = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3062so.this.m31582mk(arrayList);
                    }
                };
                if (!Kj || !C7316a.m17054g(this.f10323o0.f25367id)) {
                    lmVar.run();
                } else {
                    this.f30167b.m2776Ke(this.f10323o0.f25367id, new C10930q6.AbstractC10948r() {
                        @Override
                        public final void mo1525a(long j, long j2, TdApi.Error error) {
                            View$OnClickListenerC3062so.this.m31564ok(arrayList, lmVar, j, j2, error);
                        }
                    });
                }
            }
        } else {
            m9322Vd(C4403w.m27982H0(this, R.string.UpgradeChatPrompt, new Object[0]), C4403w.m27869i1(R.string.Proceed), new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31618ik();
                }
            });
        }
    }

    public final String m31538rj() {
        TdApi.UserFullInfo userFullInfo = this.f10331s0;
        if (userFullInfo != null) {
            return !C5070i.m24061i(userFullInfo.bio) ? this.f10331s0.bio : this.f10331s0.shareText;
        }
        TdApi.SupergroupFullInfo supergroupFullInfo = this.f10339w0;
        if (supergroupFullInfo != null) {
            return supergroupFullInfo.description;
        }
        TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f10335u0;
        return basicGroupFullInfo != null ? basicGroupFullInfo.description : "";
    }

    public final void m31535rm(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (!supergroupFullInfo.description.isEmpty()) {
            m31835Jm(supergroupFullInfo.description);
        }
    }

    public final void m31534rn() {
        C9239m mVar = this.f10275B0;
        if (mVar != null && this.f10297P0) {
            mVar.setSubtitle(m31769Rl(false));
            this.f10275B0.setExpandedSubtitle(m31769Rl(true));
        }
    }

    @Override
    public void mo4058s2(long j, boolean z) {
        C10721i0.m4192e(this, j, z);
    }

    @Override
    public void mo4057s4(long j, String str) {
        C10721i0.m4193d(this, j, str);
    }

    @Override
    public int mo18450s7() {
        int size = m31547qj().size();
        return Math.min(size, this.f10336u1 ? size : 1);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (!this.f10336u1) {
            this.f10336u1 = true;
            this.f10283F0.m28888l();
        }
        if (!m31744Uj()) {
            ((RunnableC9248n) this.f10277C0).setFactorLocked(false);
        }
    }

    @Override
    public boolean mo9165sd(Bundle bundle, String str) {
        long j = bundle.getLong(str + "chat_id");
        C4737p7 l = C4737p7.m26289l(bundle, str);
        boolean z = bundle.getBoolean(str + "is_edit");
        TdApi.Chat N3 = this.f30167b.m2739N3(j);
        if (N3 == null || this.f30167b.m2284q6(N3)) {
            return false;
        }
        if (z) {
            int constructor = N3.type.getConstructor();
            if (constructor != -1472570774) {
                if (constructor != 973884508 || this.f30167b.m2480e2().m1708O(C7316a.m17048m(N3.f25367id)) == null) {
                    return false;
                }
            } else if (this.f30167b.m2480e2().m1634i2(C7316a.m17045p(N3.f25367id)) == null) {
                return false;
            }
        }
        super.mo9165sd(bundle, str);
        m31851Hm(new C3075m(N3, l, z));
        return true;
    }

    public final boolean m31530si(int i, float f) {
        View C;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.f10277C0.getLayoutManager();
        int X1 = linearLayoutManager.m39549X1();
        List<C2964ra> F0 = this.f10279D0.m34240F0();
        int size = F0.size() - 1;
        int i2 = 0;
        int i3 = 0;
        for (C2964ra raVar : F0) {
            if (i3 >= X1) {
                if (i3 == X1 && (C = linearLayoutManager.mo39262C(i3)) != null) {
                    i2 += C.getTop();
                }
                if (i3 != size) {
                    i2 += m31472zi(i3, i, raVar);
                }
            }
            i3++;
        }
        return f <= ((float) i2);
    }

    public final void m31526sm(TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (!basicGroupFullInfo.description.isEmpty()) {
            m31835Jm(basicGroupFullInfo.description);
        }
    }

    public final void m31525sn(int i) {
        this.f10277C0.getItemAnimator();
        this.f10279D0.m34130s3(i);
        if (i == R.id.btn_description) {
            m31616im();
        }
    }

    @Override
    public void mo10182t(int i, int i2, Intent intent) {
        String U2;
        if (i2 == -1) {
            if (i == 100) {
                File P = C1405v.m37127P();
                if (P != null) {
                    C7389v0.m16610m(P);
                    C1379j0.m37292y0(R.string.UploadingPhotoWait, 0);
                    this.f30167b.m2270r4().m14783o(new TdApi.SetChatPhoto(this.f10323o0.f25367id, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(P.getPath(), C5337d.m23202j(P.getPath()), 0))), this.f30167b.m2392ja());
                }
            } else if (i == 101 && intent.getData() != null && (U2 = C7389v0.m16675U2(intent.getData())) != null) {
                if (U2.endsWith(".webp")) {
                    C1379j0.m37290z0("Webp is not supported for profile photos", 1);
                    return;
                }
                C1379j0.m37292y0(R.string.UploadingPhotoWait, 0);
                this.f30167b.m2270r4().m14783o(new TdApi.SetChatPhoto(this.f10323o0.f25367id, new TdApi.InputChatPhotoStatic(new TdApi.InputFileGenerated(U2, C5337d.m23202j(U2), 0))), this.f30167b.m2392ja());
            }
        }
    }

    @Override
    public void mo1555t0(final TdApi.Supergroup supergroup) {
        int i = this.f10321n0;
        if (i == 4 || i == 3) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31572nl(supergroup);
                }
            });
        } else if (i == 7 || i == 6) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31563ol(supergroup);
                }
            });
        }
    }

    @Override
    public void mo9812t1(Object obj, View$OnClickListenerC7430j1.C7448r rVar) {
        AbstractC9323v4<?> v;
        if (this.f10340w1 == 0.0f) {
            Iterator<i10<?>> it = this.f10286G1.iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next() instanceof q10) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z && this.f10338v1 == i && (v = this.f10283F0.m18455v(i)) != null) {
                ((q10) v).mo9812t1(obj, rVar);
            }
        }
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        if (object.getConstructor() == -1601123095) {
            this.f30167b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31590ll();
                }
            });
        }
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31599kl(object);
            }
        });
    }

    @Override
    public void mo4056t7(final long j, TdApi.ChatPermissions chatPermissions) {
        this.f30167b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31725Wk(j);
            }
        });
    }

    public final void m31521ti() {
        switch (this.f10321n0) {
            case 0:
            case 1:
                m31488xi();
                return;
            case 2:
            case 3:
                m31496wi();
                return;
            case 4:
                m31513ui();
                return;
            case 5:
            case 6:
            case 7:
                m31505vi();
                return;
            default:
                return;
        }
    }

    public final l10 m31520tj() {
        ArrayList<i10<?>> qj = m31547qj();
        for (int size = qj.size() - 1; size >= 0; size--) {
            i10<?> i10Var = qj.get(size);
            if (i10Var instanceof l10) {
                return (l10) i10Var;
            }
        }
        return null;
    }

    public final void m31517tm(TdApi.UserFullInfo userFullInfo) {
        if (!C5070i.m24061i(userFullInfo.bio)) {
            m31835Jm(userFullInfo.bio);
        } else if (!C5070i.m24061i(userFullInfo.shareText)) {
            m31835Jm(userFullInfo.shareText);
        }
    }

    @Override
    public void mo1560u2(final long j, final TdApi.ChatMember chatMember) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3062so.this.m31770Rk(j, chatMember);
            }
        });
    }

    @Override
    public void mo4055u3(long j, TdApi.VideoChat videoChat) {
        C10721i0.m4172y(this, j, videoChat);
    }

    @Override
    public void mo1335u7(long j, TdApi.UserFullInfo userFullInfo) {
        m31476ym(userFullInfo);
    }

    public final void m31513ui() {
        int i;
        C2964ra fm;
        boolean Vj = m31735Vj();
        ArrayList<C2964ra> arrayList = new ArrayList<>(20);
        arrayList.add(new C2964ra(0));
        if (!Vj || (fm = m31643fm()) == null) {
            i = 0;
        } else {
            arrayList.add(fm);
            i = 1;
        }
        if (!Vj && this.f30167b.m2256s2(this.f10323o0)) {
            if (i > 0) {
                arrayList.add(new C2964ra(1));
            }
            arrayList.add(m31679bm());
            i++;
        }
        if (i > 0) {
            arrayList.add(new C2964ra(3));
        }
        this.f10315h1 = i;
        if (i > 0) {
            arrayList.add(new C2964ra(2));
        }
        arrayList.add(m31661dm());
        arrayList.add(new C2964ra(3));
        m31638gi(arrayList);
        this.f10279D0.m34116x2(arrayList, false);
        m31763Si();
    }

    public final void m31509um(TdApi.SupergroupFullInfo supergroupFullInfo) {
        if (!supergroupFullInfo.description.isEmpty()) {
            m31835Jm(supergroupFullInfo.description);
        }
    }

    public final void m31505vi() {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.View$OnClickListenerC3062so.m31505vi():void");
    }

    public final TdApi.ChatInviteLink m31504vj() {
        TdApi.ChatInviteLink chatInviteLink;
        TdApi.SupergroupFullInfo supergroupFullInfo;
        int i = this.f10321n0;
        if (i == 2) {
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f10335u0;
            if (basicGroupFullInfo == null) {
                return null;
            }
            chatInviteLink = basicGroupFullInfo.inviteLink;
        } else if ((i != 3 && i != 4) || (supergroupFullInfo = this.f10339w0) == null) {
            return null;
        } else {
            chatInviteLink = supergroupFullInfo.inviteLink;
        }
        return chatInviteLink;
    }

    @SuppressLint({"WrongThread"})
    public final void m31501vm(final TdApi.SupergroupFullInfo supergroupFullInfo) {
        Runnable runnable;
        if (supergroupFullInfo != null) {
            boolean z = this.f10339w0 != null;
            this.f10339w0 = supergroupFullInfo;
            if (!z) {
                if (this.f10321n0 == 3) {
                    m31509um(supergroupFullInfo);
                } else {
                    m31535rm(supergroupFullInfo);
                }
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3062so.this.m31493wl(supergroupFullInfo);
                    }
                };
            } else {
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3062so.this.m31485xl(supergroupFullInfo);
                    }
                };
            }
            this.f30167b.m2469ed(runnable);
        }
    }

    @Override
    public void mo18449w(int i, AbstractC9323v4<?> v4Var) {
        super.mo9477Ac();
        if (this.f10277C0.getMeasuredWidth() != 0) {
            m31790Pi(v4Var);
        }
    }

    @Override
    public void mo4054w1(long j, boolean z) {
        C10721i0.m4194c(this, j, z);
    }

    @Override
    public void mo31500w4(TdApi.ChatInviteLink chatInviteLink) {
        TdApi.SupergroupFullInfo supergroupFullInfo;
        int i = this.f10321n0;
        if (i == 2) {
            TdApi.BasicGroupFullInfo basicGroupFullInfo = this.f10335u0;
            if (basicGroupFullInfo != null) {
                basicGroupFullInfo.inviteLink = chatInviteLink;
                m31525sn(R.id.btn_inviteLink);
            }
        } else if ((i == 3 || i == 4) && (supergroupFullInfo = this.f10339w0) != null) {
            supergroupFullInfo.inviteLink = chatInviteLink;
            m31525sn(R.id.btn_inviteLink);
        }
    }

    @Override
    public void mo4053w6(long j, TdApi.ChatPosition chatPosition, boolean z, boolean z2, boolean z3) {
        C10721i0.m4181p(this, j, chatPosition, z, z2, z3);
    }

    public final void m31496wi() {
        int i;
        C2964ra fm;
        if (this.f10341x0 == null) {
            this.f10341x0 = new C4017n(this, 0, this, this);
        }
        boolean Wj = m31726Wj();
        ArrayList<C2964ra> arrayList = new ArrayList<>(20);
        arrayList.add(new C2964ra(0));
        if (!Wj || (fm = m31643fm()) == null) {
            i = 0;
        } else {
            arrayList.add(fm);
            i = 1;
        }
        if (this.f30167b.m2256s2(this.f10323o0) && !Wj) {
            if (i > 0) {
                arrayList.add(new C2964ra(11));
            }
            arrayList.add(m31679bm());
            i++;
        }
        if (i > 0) {
            arrayList.add(new C2964ra(3));
        }
        this.f10315h1 = i;
        if (i > 0) {
            arrayList.add(new C2964ra(2));
        }
        arrayList.add(m31661dm());
        arrayList.add(new C2964ra(3));
        m31638gi(arrayList);
        this.f10279D0.m34116x2(arrayList, false);
    }

    public int m31495wj() {
        return m31902Bj() + m31854Hj() + C1357a0.m37541i(6.0f);
    }

    public final void m31492wm(TdApi.Supergroup supergroup) {
        this.f10337v0 = supergroup;
        this.f10279D0.m34130s3(R.id.btn_toggleProtection);
        int i = this.f10321n0;
        if (i == 6) {
            this.f10279D0.m34130s3(R.id.btn_channelType);
            this.f10279D0.m34130s3(R.id.btn_linkedChat);
            m31709Yi();
        } else if (i == 7) {
            this.f10279D0.m34130s3(R.id.btn_toggleSignatures);
            this.f10279D0.m34130s3(R.id.btn_linkedChat);
            this.f10279D0.m34130s3(R.id.btn_channelType);
        }
    }

    @Override
    public void mo8833x(int i, float f, int i2) {
        int i3;
        if (this.f10344y1 != i) {
            this.f10344y1 = i;
            m31799Oi(i);
        }
        boolean z = false;
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i4 == 0) {
            this.f10342x1 = -1;
        } else {
            this.f10300S0 = false;
        }
        if (!(i4 == 0 || this.f10342x1 == (i3 = i + 1))) {
            this.f10342x1 = i3;
            m31799Oi(i3);
        }
        this.f10338v1 = i;
        this.f10340w1 = f;
        this.f10285G0.getTopView().setSelectionFactor(i + f);
        if (i4 != 0) {
            z = true;
        }
        m31741Um(z);
    }

    @Override
    public void mo3246x1(long j) {
        m31780Qj(j);
    }

    @Override
    public void mo8832x4(int i) {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10074Y3(this, mo418W9());
        }
        m31534rn();
    }

    public final void m31488xi() {
        int i;
        C2964ra fm;
        ArrayList<C2964ra> arrayList = new ArrayList<>(15);
        arrayList.add(new C2964ra(0));
        if (this.f10327q0.username.isEmpty() || (fm = m31643fm()) == null) {
            i = 0;
        } else {
            arrayList.add(fm);
            i = 1;
        }
        if (C4779t2.m25658K2(this.f10327q0)) {
            TdApi.UserFullInfo userFullInfo = this.f10331s0;
            if (userFullInfo != null && (!C5070i.m24061i(userFullInfo.bio) || !C5070i.m24061i(this.f10331s0.shareText))) {
                arrayList.add(m31697Zl());
                i++;
            }
        } else {
            if (m31724Wl()) {
                if (i > 0) {
                    arrayList.add(new C2964ra(1));
                }
                arrayList.add(m31652em());
                i++;
            }
            if (this.f10321n0 == 1 && C4779t2.m25402w2(this.f10329r0)) {
                if (i > 0) {
                    arrayList.add(new C2964ra(1));
                }
                arrayList.add(m31688am());
                i++;
            }
        }
        this.f10315h1 = i;
        boolean k7 = this.f30167b.m2379k7(this.f10327q0.f25439id);
        if (i != 0) {
            arrayList.add(new C2964ra(3));
            if (!k7) {
                arrayList.add(new C2964ra(2));
            }
        }
        if (!k7) {
            arrayList.add(m31661dm());
            arrayList.add(new C2964ra(3));
        }
        m31638gi(arrayList);
        this.f10279D0.m34116x2(arrayList, false);
    }

    public final int m31487xj(int i) {
        SparseIntArray sparseIntArray = this.f10288H1;
        if (sparseIntArray != null) {
            return sparseIntArray.get(i, -1);
        }
        return -1;
    }

    public final void m31484xm(final TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        if (basicGroupFullInfo != null) {
            final boolean z = this.f10335u0 != null;
            this.f10335u0 = basicGroupFullInfo;
            if (!z) {
                m31526sm(basicGroupFullInfo);
            }
            this.f30167b.m2469ed(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31477yl(z, basicGroupFullInfo);
                }
            });
        }
    }

    @Override
    public void mo4052y1(long j, long j2) {
        C10721i0.m4179r(this, j, j2);
    }

    @Override
    public boolean mo9122yd(Bundle bundle, String str) {
        C3075m w9 = m9139w9();
        if (w9 == null) {
            return false;
        }
        super.mo9122yd(bundle, str);
        bundle.putLong(str + "chat_id", w9.f10376a.f25367id);
        C4737p7 p7Var = w9.f10377b;
        if (p7Var != null) {
            p7Var.m26288m(bundle, str + "message_thread");
        }
        bundle.putBoolean(str + "is_edit", w9.f10378c);
        return true;
    }

    public final int m31480yi() {
        int measuredWidth = this.f10277C0.getMeasuredWidth();
        int Tl = m31751Tl();
        int X1 = ((LinearLayoutManager) this.f10277C0.getLayoutManager()).m39549X1();
        if (X1 >= this.f10279D0.m34240F0().size() - 2) {
            return Tl;
        }
        int i = 0;
        View C = this.f10277C0.getLayoutManager().mo39262C(X1);
        if (C != null) {
            i = 0 - C.getTop();
        }
        for (int i2 = X1 - 1; i2 >= 0; i2--) {
            i += m31472zi(i2, measuredWidth, this.f10279D0.m34240F0().get(i2));
        }
        return i;
    }

    public final c20 m31479yj() {
        c20 c20Var;
        TdApi.SupergroupMembersFilter gh;
        ArrayList<i10<?>> qj = m31547qj();
        for (int size = qj.size() - 1; size >= 0; size--) {
            i10<?> i10Var = qj.get(size);
            if ((i10Var instanceof c20) && (gh = (c20Var = (c20) i10Var).m35335gh()) != null && gh.getConstructor() == 1178199509) {
                return c20Var;
            }
        }
        return null;
    }

    public final void m31476ym(final TdApi.UserFullInfo userFullInfo) {
        if (userFullInfo != null) {
            final boolean z = this.f10331s0 != null;
            this.f10331s0 = userFullInfo;
            if (!z) {
                m31517tm(userFullInfo);
            }
            this.f30167b.m2469ed(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3062so.this.m31469zl(z, userFullInfo);
                }
            });
        }
    }

    @Override
    public void mo3245z0() {
        C10791k1.m3308c(this);
    }

    @Override
    public void mo4038z5(long j, long j2) {
        C10722i1.m4165g(this, j, j2);
    }

    public final int m31472zi(int i, int i2, C2964ra raVar) {
        int A = raVar.m32876A();
        if (A == 9) {
            if (this.f10346z1 == null) {
                this.f10346z1 = new HashMap<>();
            }
            return C7389v0.m16562y(raVar.m32824u(), i2 - (C1357a0.m37541i(16.0f) * 2), 15.0f, this.f10346z1) + C1357a0.m37541i(6.0f) + C1357a0.m37541i(12.0f);
        } else if (A == 37) {
            C5459x0 x0Var = this.f10316i1;
            if (x0Var == null) {
                return C1357a0.m37541i(76.0f);
            }
            x0Var.m22627k(m31870Fj(i2));
            return Math.max(((this.f10316i1.getHeight() + C1357a0.m37541i(34.0f)) - C1357a0.m37541i(13.0f)) + C1357a0.m37541i(12.0f) + C1357a0.m37541i(25.0f), C1357a0.m37541i(76.0f));
        } else if (A != 68) {
            return C2139ap.m35479W(raVar.m32876A());
        } else {
            View view = this.f10274A1;
            if (view != null) {
                return view.getMeasuredHeight();
            }
            return C1357a0.m37541i(60.0f) + C1357a0.m37541i(20.0f);
        }
    }

    public final void m31471zj(final TdApi.SearchMessagesFilter searchMessagesFilter, final boolean z) {
        this.f30167b.m2270r4().m14783o(new TdApi.GetChatMessageCount(mo9464C9(), searchMessagesFilter, z), new Client.AbstractC7865g() {
            @Override
            public final void mo255t2(TdApi.Object object) {
                View$OnClickListenerC3062so.this.m31893Ck(searchMessagesFilter, z, object);
            }
        });
    }

    public final void m31468zm() {
        if (this.f10288H1 != null) {
            for (int i = 0; i < this.f10288H1.size(); i++) {
                m31471zj(C7321e.m16943i(this.f10288H1.keyAt(i)), true);
            }
        }
    }
}
