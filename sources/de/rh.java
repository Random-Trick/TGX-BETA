package de;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ce.p0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import de.d6;
import de.f5;
import de.j10;
import de.p9;
import de.q9;
import de.rh;
import de.so;
import de.y00;
import eb.k;
import g6.g;
import hd.c7;
import hd.l6;
import hd.p7;
import hd.s4;
import hd.t2;
import hd.w2;
import he.i;
import ie.c0;
import ie.h0;
import ie.l0;
import ie.u0;
import ie.y0;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jd.g0;
import k5.f;
import kd.t0;
import ld.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.c3;
import ne.d3;
import ne.i0;
import ne.j2;
import ne.l4;
import ne.m1;
import ne.m4;
import ne.n0;
import ne.n2;
import ne.q2;
import ne.t3;
import ne.v2;
import ne.z0;
import oc.v0;
import od.j1;
import od.k1;
import od.l1;
import od.p1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.MainActivity;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.HeaderEditText;
import org.thunderdog.challegram.v.MessagesLayoutManager;
import org.thunderdog.challegram.v.MessagesRecyclerView;
import tc.f0;
import tc.y1;
import ud.b5;
import ud.d1;
import ud.d2;
import ud.e2;
import ud.f2;
import ud.h1;
import ud.h2;
import ud.j1;
import ud.m;
import ud.q1;
import ud.u1;
import ud.v1;
import ud.v4;
import ud.x2;
import ud.x4;
import ud.z4;
import vc.d4;
import vc.e4;
import vc.f;
import vc.g;
import vc.g1;
import vc.j0;
import vc.j4;
import vc.k3;
import vc.k4;
import vc.m0;
import vc.m4;
import vc.q;
import vc.s3;
import vc.v3;
import vc.w3;
import vc.x;
import vc.y3;
import vd.y;
import zd.gc;
import zd.hj;
import zd.i1;
import zd.o6;
import zd.r0;
import zd.s0;
import zd.s1;
import zd.t1;
import zd.t7;
import zd.w6;
import zd.ya;

public class rh extends v4<c0> implements h1, y0, View.OnClickListener, ud.a, j1, h0, g.a, sc.a, d2, s3.a, d4.c, t1.a, f.a, zd.h0, zd.j1, z0.f, t7.h, t7.b, t7.g, t7.i, t7.j, k.b, w3.a, k1, m1.j, i.u, y.o, ViewPager.i, b5.c, s4.j, s0, q.b, m.c, t0.a, d6.e, c0.c, c0.b, gc.b {
    public static HashSet<String> B3;
    public d3 A0;
    public TdApi.ChatMember A1;
    public i0.c A2;
    public boolean A3;
    public boolean B0;
    public Object B1;
    public t0 B2;
    public z0 C0;
    public k0.e<s4> C1;
    public hd.p C2;
    public vc.a D0;
    public eb.k D1;
    public kb.b D2;
    public ImageView E0;
    public float E1;
    public hb.a E2;
    public e4 F0;
    public vc.d F1;
    public RecyclerView F2;
    public c3 G0;
    public int G1;
    public w3 G2;
    public ie.c0 H0;
    public boolean H1;
    public boolean H2;
    public j0 I0;
    public final eb.f I1;
    public eb.k I2;
    public j0 J0;
    public FrameLayoutFix J1;
    public float J2;
    public j0 K0;
    public TextView K1;
    public String K2;
    public v3 L0;
    public boolean L1;
    public TdApi.WebPage L2;
    public m4 M0;
    public int M1;
    public String M2;
    public ne.m4 N0;
    public String N1;
    public boolean N2;
    public FrameLayoutFix O0;
    public final eb.f O1;
    public boolean O2;
    public FrameLayoutFix P0;
    public final eb.f P1;
    public long P2;
    public ne.c0 Q0;
    public eb.k Q1;
    public TdApi.ChatAdministrators Q2;
    public ne.c0 R0;
    public boolean R1;
    public kb.j<TdApi.ChatAdministrators> R2;
    public vc.h S0;
    public float S2;
    public vc.h T0;
    public int T1;
    public final eb.f T2;
    public TdApi.Message U1;
    public boolean U2;
    public m4 V0;
    public s3 V1;
    public boolean V2;
    public RecyclerView W0;
    public i0 W1;
    public boolean W2;
    public p1 X0;
    public y3 X1;
    public kb.b X2;
    public d0 Y0;
    public i0.c Y1;
    public int Y2;
    public v2 Z0;
    public n0 Z1;
    public SparseIntArray Z2;
    public z4 f9259a1;
    public i0.c f9260a2;
    public boolean f9261a3;
    public float f9262b1;
    public k3 f9263b2;
    public boolean f9264b3;
    public int f9265c1;
    public i0.c f9266c2;
    public boolean f9267c3;
    public boolean f9268d1;
    public m0 f9269d2;
    public boolean f9270d3;
    public i0.c f9272e2;
    public boolean f9273e3;
    public boolean f9274f1;
    public boolean f9275f2;
    public d4 f9276f3;
    public boolean f9277g1;
    public int f9278g2;
    public FrameLayoutFix f9279g3;
    public boolean f9280h1;
    public int f9281h2;
    public q2 f9282h3;
    public int f9283i1;
    public int f9284i2;
    public ImageView f9285i3;
    public String f9286j1;
    public float f9287j2;
    public ImageView f9288j3;
    public TdApi.MessageSender f9289k1;
    public TdApi.Message f9290k2;
    public ImageView f9291k3;
    public TdApi.SearchMessagesFilter f9292l1;
    public int f9293l2;
    public ImageView f9294l3;
    public p7 f9295m1;
    public int f9296m2;
    public TextView f9297m3;
    public boolean f9298n0;
    public boolean f9299n1;
    public boolean f9300n2;
    public n2 f9301n3;
    public boolean f9302o0;
    public e0 f9303o1;
    public boolean f9304o2;
    public boolean f9305o3;
    public int f9306p0;
    public TdApi.InternalLinkTypeVideoChat f9307p1;
    public long f9308p2;
    public float f9309p3;
    public TdApi.Chat f9310q0;
    public boolean f9311q1;
    public TdApi.ReplyMarkupShowKeyboard f9312q2;
    public eb.k f9313q3;
    public TdApi.ChatList f9314r0;
    public long f9315r1;
    public ScrollView f9316r2;
    public TdApi.Function f9317r3;
    public vc.f f9318s0;
    public boolean f9319s1;
    public vc.g f9320s2;
    public boolean f9321s3;
    public ud.s f9322t0;
    public Object f9323t1;
    public float f9324t2;
    public boolean f9325t3;
    public vc.k1 f9326u0;
    public ie.k f9327u1;
    public long f9328u2;
    public eb.k f9329u3;
    public LinearLayout f9330v0;
    public x2.l f9331v1;
    public TdApi.ReplyMarkupShowKeyboard f9332v2;
    public MessagesRecyclerView f9334w0;
    public boolean f9335w1;
    public k5.f f9336w2;
    public boolean f9339x1;
    public boolean f9340x2;
    public kd.f f9342y0;
    public boolean f9343y1;
    public long f9344y2;
    public vc.h0 f9346z0;
    public s4 f9347z1;
    public View f9348z2;
    public String f9349z3;
    public boolean U0 = false;
    public int f9271e1 = 0;
    public float S1 = 1.0f;
    public float f9333v3 = -1.0f;
    public float f9337w3 = -1.0f;
    public int f9341x3 = -1;
    public int f9345y3 = -1;
    public final vc.v2 f9338x0 = new vc.v2(this);

    public class a implements p1.a {
        public a() {
        }

        @Override
        public boolean A4(p1 p1Var) {
            return true;
        }

        @Override
        public void O2(p1 p1Var, boolean z10) {
            if (!z10) {
                float value = p1Var.getValue();
                float[] fArr = he.i.S;
                p1Var.b(Math.round(value * (fArr.length - 1)) / (fArr.length - 1));
            }
        }

        @Override
        public void Y0(p1 p1Var, float f10) {
            float[] fArr = he.i.S;
            if (he.i.c2().m4(fArr[Math.round(f10 * (fArr.length - 1))])) {
                rh.this.f9338x0.u2();
            }
        }
    }

    public class a0 extends vc.a {
        public a0(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (rh.this.f9346z0 != null && getMeasuredWidth() > 0) {
                rh.this.f9346z0.W();
            }
        }
    }

    public class b implements m4.a {
        public b() {
        }

        @Override
        public void a(float f10) {
            rh.this.M0.setAlpha(ib.h.d(f10));
        }

        @Override
        public void b(boolean z10) {
            l4.a(this, z10);
        }

        @Override
        public void c(float f10) {
            l4.b(this, f10);
        }
    }

    public class b0 extends RecyclerView.o {
        public b0() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int i10 = ce.a0.i(3.0f);
            rect.bottom = i10;
            rect.top = i10;
            RecyclerView.c0 l02 = recyclerView.l0(view);
            int k10 = l02 != null ? l02.k() : -1;
            if (l02 == null || l02.n() != 0 || k10 == -1) {
                rect.right = 0;
                rect.left = 0;
            } else if (gd.w.G2()) {
                rect.right = i10;
                if (k10 != recyclerView.getAdapter().D() - 1) {
                    i10 = 0;
                }
                rect.left = i10;
            } else {
                rect.left = i10;
                if (k10 != recyclerView.getAdapter().D() - 1) {
                    i10 = 0;
                }
                rect.right = i10;
            }
        }
    }

    public class c implements m4.a {
        public final int f9354a;

        public c(int i10) {
            this.f9354a = i10;
        }

        @Override
        public void a(float f10) {
            rh.this.M0.setAlpha(ib.h.d(f10));
        }

        @Override
        public void b(boolean z10) {
            l4.a(this, z10);
        }

        @Override
        public void c(float f10) {
            float d10 = ib.h.d(f10);
            rh.this.N0.setTranslationY(this.f9354a * (1.0f - d10));
            rh.this.f9334w0.setTranslationY(-(this.f9354a * d10));
        }
    }

    public class d extends vc.d {
        public d(Context context, o6 o6Var) {
            super(context, o6Var);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            rh.this.sr();
        }
    }

    public static class d0 extends e2.a {
        public boolean M;
        public final List<j10<?>> N;
        public final k0.h<j10<?>> O = new k0.h<>();
        public final rh f9374c;

        public d0(rh rhVar, List<j10<?>> list) {
            this.f9374c = rhVar;
            this.N = list;
        }

        @Override
        public void b(ViewGroup viewGroup, int i10, Object obj) {
            if (obj instanceof rh) {
                viewGroup.removeView(((rh) obj).f9326u0);
            } else {
                viewGroup.removeView(((v4) obj).get());
            }
        }

        @Override
        public int e() {
            if (this.M) {
                return 1;
            }
            return 1 + this.N.size();
        }

        @Override
        public Object j(ViewGroup viewGroup, int i10) {
            if (i10 == 0) {
                viewGroup.addView(this.f9374c.f9326u0);
                return this.f9374c;
            }
            j10<?> e10 = this.O.e(i10);
            if (e10 == null) {
                e10 = this.N.get(i10 - 1);
                e10.Bg(new j10.d(this.f9374c.C9(), this.f9374c.qk()));
                e10.Fg(this.f9374c);
                this.O.j(i10, e10);
                e10.R8(this.f9374c);
                String str = this.f9374c.f9349z3;
                if (!ib.i.i(str)) {
                    e10.get();
                    e10.Ag(str);
                }
            }
            viewGroup.addView(e10.get());
            return e10;
        }

        @Override
        public boolean k(View view, Object obj) {
            return obj instanceof rh ? ((rh) obj).f9326u0 == view : (obj instanceof v4) && ((v4) obj).get() == view;
        }

        public void w() {
            int n10 = this.O.n();
            for (int i10 = 0; i10 < n10; i10++) {
                if (!this.O.o(i10).Sa()) {
                    this.O.o(i10).Z8();
                }
            }
            this.O.b();
        }
    }

    public class e extends v2 {
        public boolean f9375c1;

        public e(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f9375c1 = false;
            }
            if (!this.f9375c1) {
                this.f9375c1 = getCurrentItem() == 0 && (ce.j0.r(rh.this.t()).Z0().c0() || (rh.this.f9346z0 != null && rh.this.f9346z0.getInlineSearchContext().b0()));
            }
            return !this.f9375c1 && super.onInterceptTouchEvent(motionEvent);
        }
    }

    public static class e0 {
        public final String f9377a;

        public e0(String str) {
            this.f9377a = str;
        }
    }

    public class f extends ie.k {
        public final long f9378b;

        public f(long j10) {
            this.f9378b = j10;
        }

        public void e(long j10, TdApi.Object object) {
            if (!b() && rh.this.C9() == j10) {
                rh.this.f9338x0.M2((TdApi.ChatAdministrators) object);
            }
        }

        @Override
        public void c(final TdApi.Object object) {
            if (object.getConstructor() == -2126186435) {
                hj hd2 = rh.this.f24495b.hd();
                final long j10 = this.f9378b;
                hd2.post(new Runnable() {
                    @Override
                    public final void run() {
                        rh.f.this.e(j10, object);
                    }
                });
            }
        }
    }

    public class g implements k.b {
        public g() {
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            rh.this.Q0.setRotation(f10 * 180.0f);
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
            eb.l.a(this, i10, f10, kVar);
        }
    }

    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            rh.this.Rp(false);
            rh.this.f9306p0 &= -2;
        }
    }

    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override
        public void onAnimationEnd(Animator animator) {
            rh.this.Rp(false);
            rh.this.V1.b0();
            rh.this.f9306p0 &= -2;
        }
    }

    public class j extends kb.b {
        public final boolean[] M;
        public final g6.e N;
        public final k5.f O;
        public final boolean P;

        public j(boolean[] zArr, g6.e eVar, k5.f fVar, boolean z10) {
            this.M = zArr;
            this.N = eVar;
            this.O = fVar;
            this.P = z10;
        }

        @Override
        public void b() {
            boolean[] zArr = this.M;
            if (!zArr[0]) {
                zArr[0] = true;
                try {
                    g6.f.f12107b.b(rh.this.f9336w2, this.N);
                } catch (Throwable th) {
                    Log.w("Error removeLocationUpdates", th, new Object[0]);
                }
                Location location = null;
                try {
                    location = g6.f.f12107b.a(this.O);
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    Log.w("getLastLocation error", th2, new Object[0]);
                }
                if (location != null) {
                    rh.this.vq(this.P, location);
                } else {
                    rh.this.dk(this.P, false, true);
                }
            }
        }
    }

    public class k extends LinearLayout {
        public k(Context context) {
            super(context);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            rh.this.tr();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            rh.this.tr();
        }
    }

    public class l implements LocationListener {
        public final kb.b[] f9384a;
        public final LocationManager f9385b;
        public final boolean[] f9386c;
        public final boolean f9387d;

        public l(kb.b[] bVarArr, LocationManager locationManager, boolean[] zArr, boolean z10) {
            this.f9384a = bVarArr;
            this.f9385b = locationManager;
            this.f9386c = zArr;
            this.f9387d = z10;
        }

        @Override
        public void onLocationChanged(Location location) {
            this.f9384a[0].c();
            try {
                this.f9385b.removeUpdates(this);
            } catch (SecurityException unused) {
            } catch (Throwable th) {
                Log.w("removeUpdates failed. Probable resource leak", th, new Object[0]);
            }
            boolean[] zArr = this.f9386c;
            if (!zArr[0]) {
                zArr[0] = true;
                rh.this.vq(this.f9387d, location);
            }
        }

        @Override
        public void onProviderDisabled(String str) {
        }

        @Override
        public void onProviderEnabled(String str) {
        }

        @Override
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    public class m extends kb.b {
        public final boolean[] M;
        public final boolean N;

        public m(boolean[] zArr, boolean z10) {
            this.M = zArr;
            this.N = z10;
        }

        @Override
        public void b() {
            boolean[] zArr = this.M;
            if (!zArr[0]) {
                zArr[0] = true;
                rh.this.dk(this.N, false, true);
            }
        }
    }

    public class n implements ie.m0 {
        public final TdApi.Chat f9389a;

        public n(TdApi.Chat chat) {
            this.f9389a = chat;
        }

        public void c(boolean z10, TdApi.Error error, f5 f5Var, View view) {
            if (z10 || error == null) {
                f5Var.Zb();
            } else {
                f5Var.t().I3().g(view).F(f5Var, rh.this.f24495b, R.drawable.baseline_error_24, t2.z5(error));
            }
        }

        public void d(final f5 f5Var, final View view, final boolean z10, final TdApi.Error error) {
            rh.this.wd(new Runnable() {
                @Override
                public final void run() {
                    rh.n.this.c(z10, error, f5Var, view);
                }
            });
        }

        @Override
        public boolean A6() {
            return l0.a(this);
        }

        @Override
        public String B6() {
            return l0.b(this);
        }

        @Override
        public boolean N3(final f5 f5Var, final View view, TdApi.MessageSender messageSender) {
            if (rh.this.f24495b.n7(messageSender)) {
                return false;
            }
            rh.this.f24495b.Mb(this.f9389a.f19908id, messageSender, new TdApi.ChatMemberStatusMember(), null, new o6.i() {
                @Override
                public final void a(boolean z10, TdApi.Error error) {
                    rh.n.this.d(f5Var, view, z10, error);
                }
            });
            return true;
        }

        @Override
        public void s6(f5 f5Var, TdApi.MessageSender messageSender, int i10) {
            l0.c(this, f5Var, messageSender, i10);
        }
    }

    public class o extends kb.b {
        public o() {
        }

        @Override
        public void b() {
            rh.this.W1.O1(rh.this.f9260a2, false, true);
        }
    }

    public class p extends RecyclerView {
        public p(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return rh.this.H2 && getAlpha() == 1.0f && super.onTouchEvent(motionEvent);
        }
    }

    public class q implements Client.g {
        public final TdApi.MessageSchedulingState M;
        public final kb.i N;
        public final List f9392a;
        public final int f9393b;
        public final List f9394c;

        public q(List list, int i10, List list2, TdApi.MessageSchedulingState messageSchedulingState, kb.i iVar) {
            this.f9392a = list;
            this.f9393b = i10;
            this.f9394c = list2;
            this.M = messageSchedulingState;
            this.N = iVar;
        }

        public void d(TdApi.Object object) {
            if (rh.this.Ta()) {
                rh.this.Oq(t2.z5(object), true);
            } else {
                ce.j0.t0(object);
            }
        }

        public void e(TdApi.MessageSchedulingState messageSchedulingState, List list, kb.i iVar, int i10, int i11) {
            boolean z10 = false;
            if ((messageSchedulingState != null) == rh.this.f9299n1) {
                rh.this.f9338x0.X(list);
            }
            if (i10 == i11) {
                z10 = true;
            }
            iVar.a(z10);
            if (!rh.this.f9299n1 && messageSchedulingState != null && rh.this.Ta()) {
                rh.this.Kr(true);
            }
        }

        @Override
        public void r2(final TdApi.Object object) {
            int constructor = object.getConstructor();
            boolean z10 = true;
            if (constructor == -1679978726) {
                rh.this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        rh.q.this.d(object);
                    }
                });
            } else if (constructor == 1435961258) {
                TdApi.Message message = (TdApi.Message) object;
                this.f9392a.add(message);
                int size = this.f9392a.size();
                if (size < this.f9393b) {
                    rh.this.f24495b.O9().m0(message);
                    rh.this.f24495b.v4().o((TdApi.Function) this.f9394c.get(size), this);
                    z10 = false;
                }
                rh.this.f24495b.Z9().r2(object);
            } else {
                throw new UnsupportedOperationException(object.toString());
            }
            if (z10) {
                final int size2 = this.f9392a.size();
                if (size2 > 0) {
                    for (int i10 = size2 - 1; i10 >= 0; i10--) {
                        rh.this.f24495b.O9().z0((TdApi.Message) this.f9392a.get(i10));
                    }
                    final List<s4> p22 = rh.this.f9338x0.p2(this.f9392a);
                    hj hd2 = rh.this.f24495b.hd();
                    final TdApi.MessageSchedulingState messageSchedulingState = this.M;
                    final kb.i iVar = this.N;
                    final int i11 = this.f9393b;
                    hd2.post(new Runnable() {
                        @Override
                        public final void run() {
                            rh.q.this.e(messageSchedulingState, p22, iVar, size2, i11);
                        }
                    });
                    return;
                }
                hj hd3 = rh.this.f24495b.hd();
                final kb.i iVar2 = this.N;
                hd3.post(new Runnable() {
                    @Override
                    public final void run() {
                        kb.i.this.a(false);
                    }
                });
            }
        }
    }

    public class r extends kb.b {
        public r() {
        }

        @Override
        public void b() {
            if (rh.this.X2 == this && rh.this.Y2 != 0) {
                rh rhVar = rh.this;
                rhVar.Op(rhVar.Y2, true, false);
                rh.this.f24495b.hd().postDelayed(this, 4500L);
            }
        }
    }

    public class s extends FrameLayoutFix {
        public s(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return rh.this.qa() == 0.0f || super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return rh.this.qa() > 0.0f;
        }
    }

    public class t extends b2 {
        public final int f9395a;

        public t(Context context, int i10) {
            super(context);
            this.f9395a = i10;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            setPivotX(getMeasuredWidth() - this.f9395a);
            setPivotY(getMeasuredHeight() / 2);
        }
    }

    public class u extends vc.h0 {
        public u(Context context, o6 o6Var) {
            super(context, o6Var);
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            rh.this.tr();
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            rh.this.tr();
        }
    }

    public class v extends View {
        public v(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), ce.a0.i(36.0f), ce.y.g(ae.j.u()));
            if (rh.this.B2 != null) {
                rh.this.B2.q(canvas, 0);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return rh.this.B2 != null && rh.this.B2.P(motionEvent);
        }
    }

    public class w implements i0.c {
        public w() {
        }

        @Override
        public boolean O0() {
            return false;
        }

        public View get() {
            return rh.this.Z1;
        }

        @Override
        public int a6() {
            return rh.this.Z1.n(rh.this.Z1.getMeasuredWidth());
        }

        @Override
        public void o7() {
            ne.j0.b(this);
        }
    }

    public class x extends k3 {
        public x(Context context) {
            super(context);
        }

        @Override
        public void A() {
            super.A();
            rh.this.W1.I1(rh.this.f9266c2);
        }
    }

    public class y implements k3.f {
        public final Context f9401a;

        public y(Context context) {
            this.f9401a = context;
        }

        @Override
        public void a(k3 k3Var) {
            rh rhVar = new rh(this.f9401a, rh.this.f24495b);
            rhVar.Lp(new c0((TdApi.ChatList) null, rh.this.f9310q0, (String) null, (TdApi.MessageSender) null, new TdApi.SearchMessagesFilterPinned()));
            rh.this.ac(rhVar);
        }

        @Override
        public void b(k3 k3Var, TdApi.Message message) {
            rh.this.Ok(new ob.d(message.chatId, message.f19946id));
        }

        @Override
        public void c(k3 k3Var) {
            rh.this.Hj();
        }
    }

    public class z implements i0.c {
        public z() {
        }

        @Override
        public boolean O0() {
            return ne.j0.a(this);
        }

        public View get() {
            return rh.this.f9263b2;
        }

        @Override
        public int a6() {
            return rh.this.f9263b2.getTotalHeight();
        }

        @Override
        public void o7() {
            rh.this.f9263b2.q(false);
        }
    }

    public rh(Context context, o6 o6Var) {
        super(context, o6Var);
        DecelerateInterpolator decelerateInterpolator = db.b.f7287b;
        this.I1 = new eb.f(12, this, decelerateInterpolator, 180L);
        this.O1 = new eb.f(6, this, decelerateInterpolator, 180L);
        this.P1 = new eb.f(0, new g(), decelerateInterpolator, 120L);
        this.T2 = new eb.f(9, this, decelerateInterpolator, 150L);
    }

    public void Am(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        if (!Fp(z10, messageSchedulingState)) {
            Kp(true, z10, messageSchedulingState);
        }
    }

    public void An(boolean z10, TdApi.User user, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z13;
        o6 o6Var = this.f24495b;
        long j10 = this.f9310q0.f19908id;
        long qk = qk();
        long ko = z10 ? ko() : 0L;
        if (z11 || lo()) {
            z13 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z13 = false;
        }
        o6Var.wb(j10, qk, ko, new TdApi.MessageSendOptions(z13, false, false, messageSchedulingState2), new TdApi.InputMessageContact(new TdApi.Contact(user.phoneNumber, user.firstName, user.lastName, null, user.f19979id)), null);
    }

    public static int Bk() {
        return s4.X2();
    }

    public void Bl(boolean z10, DialogInterface dialogInterface, int i10) {
        Ko(z10);
    }

    public void Bm(long j10) {
        TdApi.Chat chat;
        if (C9() == j10 && (chat = this.f9310q0) != null) {
            Wi(chat.pendingJoinRequests);
        }
    }

    public void Bn(kb.h hVar, kb.e eVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        this.f24495b.wb(this.f9310q0.f19908id, qk(), hVar != null ? hVar.get() : 0L, new TdApi.MessageSendOptions(z10 || lo(), false, false, messageSchedulingState), (TdApi.InputMessageContent) eVar.get(), null);
    }

    public void Cl(View view) {
        switch (view.getId()) {
            case R.id.btn_search_jump:
                ll();
                return;
            case R.id.btn_search_next:
                this.f9338x0.W1(true);
                return;
            case R.id.btn_search_prev:
                this.f9338x0.W1(false);
                return;
            default:
                return;
        }
    }

    public void Cm(long j10) {
        TdApi.Chat chat;
        if (C9() == j10 && (chat = this.f9310q0) != null) {
            Wi(chat.pendingJoinRequests);
        }
    }

    public static long Cn(long j10) {
        return j10;
    }

    public void Dl(TdApi.Object object) {
        if (object.getConstructor() == -1679978726) {
            this.f24495b.v4().o(new TdApi.AddChatMember(this.f9310q0.f19908id, this.f24495b.fa(), 0), this.f24495b.na());
        }
    }

    public boolean Dm(View view, int i10) {
        return this.f9346z0.z0(i10);
    }

    public static TdApi.InputMessageContent Dn(String str) {
        return new TdApi.InputMessageDice(str, false);
    }

    public static boolean Dq(Object obj) {
        return obj instanceof c7;
    }

    public void El(DatePicker datePicker, int i10, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i10);
        calendar.set(2, i11);
        calendar.set(5, i12);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        ml((int) (calendar.getTimeInMillis() / 1000));
    }

    public void Em() {
        p5(-1);
    }

    public void En(List list, boolean z10, long j10, long j11, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            t2.g gVar = new t2.g();
            arrayList.add(this.f24495b.l5().B(t2.G5(str, t2.f0(str, null, gVar), gVar, null), z10));
        }
        for (TdApi.Function function : t2.B5(j10, qk(), j11, new TdApi.MessageSendOptions(z11, false, false, messageSchedulingState), (TdApi.InputMessageContent[]) arrayList.toArray(new TdApi.InputMessageContent[0]), z12)) {
            this.f24495b.v4().o(function, this.f24495b.Z9());
        }
    }

    public void Fl(DialogInterface dialogInterface, int i10) {
        ml(0);
    }

    public boolean Fm(View view, int i10) {
        k0.e<s4> eVar;
        if (i10 == R.id.btn_send && (eVar = this.C1) != null) {
            for (int p10 = eVar.p() - 1; p10 >= 0; p10--) {
                this.f24495b.v4().o(new TdApi.EditMessageSchedulingState(this.C1.q(p10).I2(), this.C1.j(p10), null), this.f24495b.na());
            }
            p5(-1);
        }
        return true;
    }

    public void Fn(boolean z10, long j10, String str, boolean z11, boolean z12, TdApi.MessageSchedulingState messageSchedulingState, boolean z13) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z14;
        o6 o6Var = this.f24495b;
        long j11 = this.f9310q0.f19908id;
        long qk = qk();
        long ko = z10 ? ko() : 0L;
        if (z12 || lo()) {
            z14 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z14 = false;
        }
        o6Var.vb(j11, qk, ko, new TdApi.MessageSendOptions(z14, false, false, messageSchedulingState2), j10, str);
        if (z11) {
            this.f9346z0.v0("", false);
            this.f9346z0.getInlineSearchContext().w0();
        }
    }

    public void Gl(TdApi.GetChatMessageByDate getChatMessageByDate, ob.d dVar) {
        if (this.f9317r3 == getChatMessageByDate) {
            this.f9317r3 = null;
            mq(false, true);
            this.f9338x0.Z0(dVar, dVar.g() ? 1 : 5, null, true);
        }
    }

    public void Gm() {
        p5(-1);
    }

    public void Gn(String str, int i10, boolean z10, long j10, long j11, boolean z11) {
        int i11;
        int i12;
        BitmapFactory.Options h10 = org.thunderdog.challegram.loader.b.h(str);
        int t02 = v0.t0(str);
        int b10 = org.thunderdog.challegram.loader.b.b(h10, 1280, 1280);
        int i13 = h10.outWidth / b10;
        int i14 = h10.outHeight / b10;
        if (v0.i1(t02)) {
            i12 = i14;
            i11 = i13;
        } else {
            i11 = i14;
            i12 = i13;
        }
        TdApi.InputFileGenerated w10 = jd.c.w(str, v0.S0(t02));
        this.f24495b.xb(j10, qk(), j11, z11, false, (TdApi.InputMessagePhoto) this.f24495b.l5().B(new TdApi.InputMessagePhoto(w10, null, null, i12, i11, null, i10), z10));
    }

    public void Hl(final TdApi.GetChatMessageByDate getChatMessageByDate, TdApi.Object object) {
        final ob.d dVar;
        if (object.getConstructor() == 1435961258) {
            TdApi.Message message = (TdApi.Message) object;
            dVar = new ob.d(message.chatId, message.f19946id);
        } else {
            dVar = new ob.d(C9(), 9L);
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Gl(getChatMessageByDate, dVar);
            }
        });
    }

    public boolean Hm(View view, int i10) {
        if (i10 == R.id.btn_unpinAll) {
            int p10 = this.C1.p();
            for (int i11 = 0; i11 < p10; i11++) {
                this.f24495b.v4().o(new TdApi.UnpinChatMessage(this.f9310q0.f19908id, this.C1.j(i11)), this.f24495b.na());
            }
            this.f9264b3 = true;
            p5(-1);
        }
        return true;
    }

    public void Hn(ld.l[] lVarArr, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, TdApi.MessageSendOptions messageSendOptions) {
        TdApi.InputMessageContent inputMessageContent;
        TdApi.InputFile inputFile;
        MediaMetadataRetriever mediaMetadataRetriever;
        TdApi.InputMessageContent[] inputMessageContentArr = new TdApi.InputMessageContent[lVarArr.length];
        int i10 = 0;
        for (ld.l lVar : lVarArr) {
            if (lVar.A() <= 0 || !z10) {
                if (lVar.e1()) {
                    boolean p12 = lVar.p1();
                    try {
                        mediaMetadataRetriever = v0.p2(lVar.q());
                        if (!p12) {
                            try {
                                String extractMetadata = mediaMetadataRetriever.extractMetadata(16);
                                if (ib.i.i(extractMetadata) || !ib.i.c(extractMetadata.toLowerCase(), "yes")) {
                                    p12 = true;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                        if (ib.i.m(extractMetadata2)) {
                            lVar.q0(ib.i.s(extractMetadata2));
                        }
                    } catch (Throwable unused2) {
                        mediaMetadataRetriever = null;
                    }
                    v0.H(mediaMetadataRetriever);
                    int[] iArr = new int[2];
                    lVar.N0(iArr);
                    int i11 = iArr[0];
                    int i12 = iArr[1];
                    t2.g gVar = new t2.g();
                    boolean z14 = fd.a.f11885g && (!z10 || !g0.q(lVar));
                    String q10 = lVar.q();
                    TdApi.InputFile x10 = z14 ? g0.x(q10, lVar, z10) : t2.f0(q10, null, gVar);
                    TdApi.FormattedText H0 = lVar.H0(true, !z11);
                    if (z10 && !z14) {
                        inputMessageContent = this.f24495b.l5().B(t2.G5(lVar.q(), x10, gVar, H0), z12);
                    } else if (!p12 || lVar.A() != 0 || (lVarArr.length != 1 && z13)) {
                        inputMessageContent = this.f24495b.l5().B(new TdApi.InputMessageVideo(x10, null, null, lVar.S0(true), i11, i12, v0.D(x10), H0, lVar.A()), z12);
                    } else {
                        inputMessageContent = this.f24495b.l5().B(new TdApi.InputMessageAnimation(x10, null, null, lVar.S0(true), i11, i12, H0), z12);
                    }
                } else {
                    int[] iArr2 = new int[2];
                    lVar.N0(iArr2);
                    int i13 = iArr2[0];
                    int i14 = iArr2[1];
                    if (!z10 || !jd.c.q(lVar)) {
                        inputFile = jd.c.y(lVar);
                    } else {
                        inputFile = t2.d0(lVar.q());
                    }
                    TdApi.FormattedText H02 = lVar.H0(true, !z11);
                    if (z10) {
                        inputMessageContent = this.f24495b.l5().B(new TdApi.InputMessageDocument(inputFile, null, false, H02), z12);
                    } else {
                        inputMessageContent = this.f24495b.l5().B(new TdApi.InputMessagePhoto(inputFile, null, null, i13, i14, H02, lVar.A()), z12);
                    }
                }
                inputMessageContentArr[i10] = inputMessageContent;
                i10++;
            } else {
                throw new IllegalArgumentException();
            }
        }
        for (TdApi.Function function : t2.B5(j10, qk(), j11, messageSendOptions, inputMessageContentArr, z13)) {
            this.f24495b.v4().o(function, this.f24495b.Z9());
        }
    }

    public void Il(TdApi.Object object) {
        if (!Sa()) {
            TdApi.ChatAdministrators chatAdministrators = (TdApi.ChatAdministrators) object;
            this.Q2 = chatAdministrators;
            this.R2.a(chatAdministrators);
        }
    }

    public void Im() {
        p5(-1);
    }

    public void In(l6 l6Var, long j10, long j11, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        this.f24495b.wb(j10, qk(), j11, new TdApi.MessageSendOptions(z10, false, false, messageSchedulingState), new TdApi.InputMessageVoiceNote(l6Var.i(), l6Var.c(), N.getWaveform(l6Var.f()), null), null);
    }

    public void Jl(final TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2126186435) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Il(object);
                }
            });
        } else if (constructor == -1679978726) {
            ce.j0.t0(object);
        }
    }

    public boolean Jm(View view, int i10) {
        if (i10 != R.id.btn_messageResend) {
            return true;
        }
        Yo();
        p5(-1);
        return true;
    }

    public static TdApi.InputMessageContent Jn(TdApi.Sticker sticker, String str) {
        return new TdApi.InputMessageSticker(new TdApi.InputFileId(sticker.sticker.f19913id), null, 0, 0, str);
    }

    public void Km(int i10, TdApi.HttpUrl httpUrl) {
        if (i10 == R.id.btn_copyLink) {
            ce.j0.i(httpUrl.url, R.string.CopiedLink);
            return;
        }
        y00 y00Var = new y00(t(), c());
        y00Var.Vi(new y00.m(httpUrl.url));
        y00Var.ej();
    }

    public static TdApi.InputMessageContent Kn(String str) {
        return new TdApi.InputMessageSticker(t2.d0(str), null, 0, 0, null);
    }

    public void Ll(long j10, View view) {
        this.f24495b.hd().B2(this, this.f24495b.e4(j10));
    }

    public void Lm(final int i10, TdApi.Object object) {
        if (object.getConstructor() == -2018019930) {
            final TdApi.HttpUrl httpUrl = (TdApi.HttpUrl) object;
            wd(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Km(i10, httpUrl);
                }
            });
        }
    }

    public void Ln(boolean z10, long j10, boolean z11, boolean z12) {
        if (!Sa()) {
            this.f9338x0.b3(null);
            if (z12) {
                if (z10 && j10 != 0 && ck() == j10) {
                    ko();
                }
                if (z11) {
                    jo(true);
                }
                this.f9346z0.v0("", false);
            }
            Zp(false);
        }
    }

    public void Ml(long j10, int i10, SparseIntArray sparseIntArray) {
        if (i10 == R.id.btn_reportSpam && j10 == C9() && Ta()) {
            boolean z10 = false;
            boolean z11 = sparseIntArray.get(R.id.btn_reportSpam) != 0;
            boolean z12 = sparseIntArray.get(R.id.btn_removeChatFromList) != 0;
            if (sparseIntArray.get(R.id.btn_blockSender) != 0) {
                z10 = true;
            }
            if (z11 || z12 || z10) {
                if (z10) {
                    o6 o6Var = this.f24495b;
                    o6Var.d2(o6Var.Ab(this.f9310q0.f19908id), true, this.f24495b.na());
                }
                if (z11) {
                    this.f24495b.v4().o(new TdApi.ReportChat(C9(), null, new TdApi.ChatReportReasonSpam(), null), this.f24495b.na());
                }
                if (z12) {
                    Ej();
                }
            }
        }
    }

    public boolean Mm(View view, int i10) {
        if (i10 == R.id.btn_shareMyContact) {
            up(this.f24495b.da(), true, t2.i0());
        }
        return true;
    }

    public void Mn(TdApi.Object object) {
        if (object instanceof TdApi.Error) {
            TdApi.Error error = (TdApi.Error) object;
            if (error.code != 400 || !"Have no rights to send a message".equals(error.message)) {
                this.f24495b.na().r2(object);
            }
        }
    }

    public void Nl(final long j10, View view) {
        me(new f2(R.id.btn_reportSpam).i(new ra(28, 0, 0, gd.w.m1(R.string.ReportChatSpam, this.f9310q0.title), false)).p(Xj() != 0 ? new ra[]{new ra(12, (int) R.id.btn_reportSpam, 0, (int) R.string.ReportSpam, true), new ra(12, (int) R.id.btn_removeChatFromList, 0, (int) R.string.DeleteChat, true), new ra(12, (int) R.id.btn_blockSender, 0, (int) R.string.BlockUser, true)} : new ra[]{new ra(12, (int) R.id.btn_reportSpam, 0, (int) R.string.ReportSpam, true), new ra(12, (int) R.id.btn_removeChatFromList, 0, (int) R.string.DeleteChat, true)}).j(new v4.r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                rh.this.Ml(j10, i10, sparseIntArray);
            }
        }).r(R.string.Done).q(R.id.theme_color_textNegative));
    }

    public void Nm(TdApi.NotificationSettingsScope notificationSettingsScope) {
        if (ob.e.l1(this.f24495b.d4(C9()), notificationSettingsScope)) {
            wr(true);
        }
    }

    public void Nn(boolean z10, g6.i iVar) {
        Status a10 = iVar.a();
        int c10 = a10.c();
        if (c10 == 0) {
            ak(z10, this.f9336w2);
        } else if (c10 != 6) {
            ak(z10, this.f9336w2);
        } else {
            try {
                a10.g(t(), 103);
            } catch (Throwable unused) {
                dk(z10, true, false);
            }
        }
    }

    public void Ol(long j10, View view) {
        this.f24495b.v4().o(new TdApi.AddChatToList(j10, new TdApi.ChatListMain()), this.f24495b.na());
        TdApi.ChatNotificationSettings M3 = this.f24495b.M3(j10);
        if (M3 != null) {
            this.f24495b.v4().o(new TdApi.SetChatNotificationSettings(j10, new TdApi.ChatNotificationSettings(true, 0, M3.useDefaultSound, M3.soundId, M3.useDefaultShowPreview, M3.showPreview, M3.useDefaultDisablePinnedMessageNotifications, M3.disablePinnedMessageNotifications, M3.useDefaultDisableMentionNotifications, M3.disableMentionNotifications)), this.f24495b.na());
        }
    }

    public void Om(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        if (C9() == j10) {
            this.f9318s0.j2(j10, chatNotificationSettings);
            wr(true);
        }
    }

    public static void On(TdApi.Object object) {
        if (object.getConstructor() != -722616727) {
            ce.j0.z0("Bot is already in chat", 0);
        }
    }

    public void Pl(ld.l lVar, ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z10, boolean z11) {
        Cp(new ld.l[]{lVar}, false, messageSendOptions, z10, z11);
    }

    public void Pm(hj.k kVar) {
        this.f24495b.hd().C8(this, kVar, this.f9347z1.X3());
    }

    public static void Pn(hd.g gVar) {
        he.b.d().h(gVar.b());
    }

    public void Ql(int i10, final ld.l lVar) {
        if (Sa()) {
            ld.q.c().a(lVar);
            return;
        }
        boolean z10 = false;
        if (lVar == null) {
            ce.j0.y0(i10 == 109 ? R.string.TakeVideoError : R.string.TakePhotoError, 0);
            return;
        }
        qd.c cVar = new qd.c(this.f24493a, this.f24495b);
        cVar.v(new qd.b(this.f24493a, this.f24495b, lVar));
        od.j1 j1Var = new od.j1(this.f24493a, this.f24495b);
        j1.r s10 = j1.r.o(this, null, null, new od.y() {
            @Override
            public final void H6(ArrayList arrayList, TdApi.MessageSendOptions messageSendOptions, boolean z11, boolean z12) {
                rh.this.Pl(lVar, arrayList, messageSendOptions, z11, z12);
            }
        }, cVar, ui()).s(C9());
        if (gl() || !he.i.c2().k1(2048L)) {
            z10 = true;
        }
        j1Var.Xk(s10.p(z10));
        j1Var.dk();
    }

    public static void Qm(o6.m mVar) {
        ce.j0.i(mVar.f28153a, mVar.f28154b ? R.string.CopiedLink : R.string.CopiedLinkPrivate);
    }

    public void Qn() {
        p5(-1);
    }

    public void Rl(String str, long j10, long j11, boolean z10) {
        vc.b bVar = new vc.b(str);
        bVar.d();
        this.f24495b.xb(j10, qk(), j11, z10, false, new TdApi.InputMessageAudio(t2.d0(str), null, bVar.a(), bVar.c(), bVar.b(), null));
    }

    public boolean Rm(TdApi.Message message, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        this.f24495b.v4().o(new TdApi.StopPoll(message.chatId, message.f19946id, message.replyMarkup), this.f24495b.na());
        return true;
    }

    public void Rn(long j10, TdApi.User user, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z12;
        o6 o6Var = this.f24495b;
        long j11 = this.f9310q0.f19908id;
        long qk = qk();
        if (z10 || lo()) {
            z12 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z12 = false;
        }
        o6Var.wb(j11, qk, j10, new TdApi.MessageSendOptions(z12, false, false, messageSchedulingState2), new TdApi.InputMessageContact(new TdApi.Contact(user.phoneNumber, user.firstName, user.lastName, null, user.f19979id)), null);
    }

    public void Sl(long j10) {
        if (this.f9310q0 != null && ob.a.m(C9()) == j10) {
            this.f9318s0.k2(this.f9310q0);
        }
    }

    public void Sm(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        if (this.f9347z1 != null && messageSchedulingState != null) {
            this.f24495b.v4().o(new TdApi.EditMessageSchedulingState(C9(), this.f9347z1.K3(), messageSchedulingState), this.f24495b.na());
            kj();
        }
    }

    public void Sn(View view, Rect rect) {
        this.G0.d1(view, rect);
    }

    public void Tl(long j10) {
        vc.v2 v2Var = this.f9338x0;
        if (v2Var != null) {
            v2Var.t0(this);
        }
        o6 o6Var = this.f24495b;
        Lp(new c0(o6Var, this.f9314r0, o6Var.P3(j10), (p7) null, (TdApi.SearchMessagesFilter) null));
    }

    public void Tm(s4 s4Var, TdApi.ChatMember chatMember, jb.c cVar, jb.c cVar2, u0 u0Var) {
        if (!s4Var.U5()) {
            Object N = g1.N(this, s4Var, chatMember, cVar, cVar2, u0Var, true);
            if (!cVar.f()) {
                Zq(s4Var, cVar.e(), u0Var.d(), cVar2.e(), N, chatMember, true);
            }
        }
    }

    public void Tn(long j10, TdApi.DraftMessage draftMessage, TdApi.Object object) {
        if (C9() == j10 && ob.e.L(ek(), draftMessage)) {
            if (object.getConstructor() == 1435961258) {
                cr((TdApi.Message) object, false, false);
            } else {
                uj(false);
            }
        }
    }

    public static boolean Ui(int i10, TdApi.ChatEventLogFilters chatEventLogFilters) {
        if (chatEventLogFilters == null) {
            return true;
        }
        switch (i10) {
            case R.id.btn_filterAdmins:
                return chatEventLogFilters.memberPromotions;
            case R.id.btn_filterAll:
                return t2.I2(chatEventLogFilters);
            case R.id.btn_filterDeletedMessages:
                return chatEventLogFilters.messageDeletions;
            case R.id.btn_filterEditedMessages:
                return chatEventLogFilters.messageEdits;
            case R.id.btn_filterInfo:
                return chatEventLogFilters.infoChanges;
            case R.id.btn_filterInviteLinks:
                return chatEventLogFilters.inviteLinkChanges;
            case R.id.btn_filterLeavingMembers:
                return chatEventLogFilters.memberLeaves;
            case R.id.btn_filterMembers:
                return chatEventLogFilters.memberJoins || chatEventLogFilters.memberInvites;
            case R.id.btn_filterPinnedMessages:
                return chatEventLogFilters.messagePins;
            case R.id.btn_filterRestrictions:
                return chatEventLogFilters.memberRestrictions;
            case R.id.btn_filterSettings:
                return chatEventLogFilters.settingChanges;
            case R.id.btn_filterVideoChats:
                return chatEventLogFilters.videoChatChanges;
            default:
                return false;
        }
    }

    public void Ul(final long j10, TdApi.Chat chat) {
        this.f24495b.id(new Runnable() {
            @Override
            public final void run() {
                rh.this.Tl(j10);
            }
        });
    }

    public void Um(final s4 s4Var, final jb.c cVar, final jb.c cVar2, final u0 u0Var, TdApi.Object object) {
        final TdApi.ChatMember chatMember = object.getConstructor() == 1829953909 ? (TdApi.ChatMember) object : null;
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Tm(s4Var, chatMember, cVar, cVar2, u0Var);
            }
        });
    }

    public void Un(final long j10, final TdApi.DraftMessage draftMessage, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Tn(j10, draftMessage, object);
            }
        });
    }

    public void Vl(TdApi.BasicGroup basicGroup, boolean z10) {
        if (ob.a.m(C9()) != basicGroup.f19904id) {
            return;
        }
        if (z10) {
            final long b10 = ob.a.b(basicGroup.upgradedToSupergroupId);
            this.f24495b.Y2(b10, new kb.j() {
                @Override
                public final void a(Object obj) {
                    rh.this.Ul(b10, (TdApi.Chat) obj);
                }
            });
            return;
        }
        rr(true);
    }

    public void Vm(TdApi.Message message, TdApi.MessageThreadInfo messageThreadInfo) {
        if (C9() == message.chatId) {
            TdApi.Message[] messageArr = messageThreadInfo.messages;
            if (messageArr.length > 0) {
                int i10 = 1;
                long[] jArr = messageArr.length > 1 ? new long[messageArr.length - 1] : null;
                while (true) {
                    TdApi.Message[] messageArr2 = messageThreadInfo.messages;
                    if (i10 < messageArr2.length) {
                        jArr[i10 - 1] = messageArr2[i10].f19946id;
                        i10++;
                    } else {
                        this.f24495b.hd().r7(this, messageThreadInfo.chatId, new ob.d(messageThreadInfo.chatId, messageThreadInfo.messages[0].f19946id, jArr), new hj.q().q(new ob.d(message.chatId, message.f19946id)).c(this).o(message.chatId));
                        return;
                    }
                }
            }
        }
    }

    public void Wl(long j10) {
        if (C9() == j10) {
            Qi();
        }
    }

    public void Wm(final TdApi.Message message, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            ce.j0.t0(object);
        } else if (constructor == -248536056) {
            final TdApi.MessageThreadInfo messageThreadInfo = (TdApi.MessageThreadInfo) object;
            wd(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Vm(message, messageThreadInfo);
                }
            });
        }
    }

    public void Xl(long j10, boolean z10) {
    }

    public void Xm(boolean z10, DialogInterface dialogInterface, int i10) {
        Cq(true);
        if (z10) {
            f1();
        }
    }

    public void Yl(long j10) {
        if (C9() == j10) {
            zr();
        }
    }

    public void Zl(long j10, TdApi.DraftMessage draftMessage) {
        vc.h0 h0Var;
        if (C9() == j10 && (h0Var = this.f9346z0) != null && !h0Var.C0() && !gl() && this.f9295m1 == null) {
            xr(j10, draftMessage);
        }
    }

    public void Zm(boolean z10, DialogInterface dialogInterface, int i10) {
        uq(z10);
    }

    public static boolean Zn(o6 o6Var, Context context, final eb.k kVar, final float f10, Object obj) {
        rh rhVar = new rh(context, o6Var);
        rhVar.Lp(((rh) obj).x9());
        rhVar.t9();
        rhVar.gd(new Runnable() {
            @Override
            public final void run() {
                k.this.i(f10);
            }
        });
        ce.j0.r(context).Q1().h0(rhVar);
        return true;
    }

    public void am(long j10, boolean z10) {
        if (C9() == j10) {
            j0 j0Var = this.J0;
            if (j0Var != null && j0Var.c(this.f24495b.l3(j10))) {
                this.K0.setTranslationX(this.J0.a() ? 0.0f : this.J0.getLayoutParams().width);
                this.D0.a();
            }
            if (this.f9299n1 && !z10) {
                t9();
                if (Pa()) {
                    this.f9264b3 = true;
                } else {
                    Zb();
                }
            }
        }
    }

    public void bm(long j10) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && chat.f19908id == j10) {
            this.f24495b.hd().Z8(R.id.menu_secretChat, this.R, this.f9310q0, false);
        }
    }

    public void bn(TdApi.SecretChat secretChat) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && t2.b2(chat) == secretChat.f19960id) {
            rr(true);
            if (secretChat.state.getConstructor() == -1945106707) {
                Qi();
            }
        }
    }

    public void cm(long j10) {
        if (this.f9310q0 != null && C9() == j10) {
            this.f9318s0.k2(this.f9310q0);
        }
    }

    public void cn(View view, dd.l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        if (Hp(view, lVar.j(), lVar.c(), true, z10, messageSchedulingState)) {
            this.P2 = SystemClock.uptimeMillis();
            this.f9346z0.v0("", false);
        }
    }

    public void dm(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (C9() == j10) {
            Wi(chatJoinRequestsInfo);
        }
    }

    public void dn(long j10) {
        if (ob.a.p(C9()) == j10) {
            this.f9318s0.k2(this.f9310q0);
            Xi();
        }
    }

    public void em(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        if (C9() == j10) {
            this.f9318s0.h2(this.f9310q0, chatPhotoInfo);
        }
    }

    public void en(TdApi.Supergroup supergroup) {
        if (ob.a.p(C9()) == supergroup.f19965id) {
            rr(true);
        }
    }

    public void fm(long j10) {
        if (C9() == j10) {
            wr(true);
        }
    }

    public void fn(long j10) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && t2.n2(chat) == j10) {
            rr(true);
        }
    }

    public void gm(long j10, long j11) {
        if (C9() == j10) {
            this.f9338x0.l3(j11);
        }
    }

    public boolean gn(e2 e2Var, View view, boolean z10) {
        jb.e eVar;
        if (z10) {
            return false;
        }
        TdApi.ChatEventLogFilters chatEventLogFilters = new TdApi.ChatEventLogFilters(true, true, true, true, true, true, true, true, true, true, true, true);
        int L0 = e2Var.f24134a.L0(R.id.btn_members);
        long[] jArr = null;
        if (L0 == -1 || !e2Var.f24134a.D0().get(L0).D()) {
            TdApi.ChatAdministrators chatAdministrators = this.Q2;
            eVar = new jb.e(chatAdministrators != null ? chatAdministrators.administrators.length : 10);
        } else {
            eVar = null;
        }
        List<ra> D0 = e2Var.f24134a.D0();
        int size = D0.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            ra raVar = D0.get(i11);
            int j10 = raVar.j();
            if (j10 == R.id.btn_filter) {
                boolean D = raVar.D();
                if (D) {
                    i10++;
                }
                switch (raVar.c()) {
                    case R.id.btn_filterAdmins:
                        chatEventLogFilters.memberPromotions = D;
                        continue;
                    case R.id.btn_filterDeletedMessages:
                        chatEventLogFilters.messageDeletions = D;
                        continue;
                    case R.id.btn_filterEditedMessages:
                        chatEventLogFilters.messageEdits = D;
                        continue;
                    case R.id.btn_filterInfo:
                        chatEventLogFilters.infoChanges = D;
                        continue;
                    case R.id.btn_filterInviteLinks:
                        chatEventLogFilters.inviteLinkChanges = D;
                        continue;
                    case R.id.btn_filterLeavingMembers:
                        chatEventLogFilters.memberLeaves = D;
                        continue;
                    case R.id.btn_filterMembers:
                        chatEventLogFilters.memberInvites = D;
                        chatEventLogFilters.memberJoins = D;
                        continue;
                    case R.id.btn_filterPinnedMessages:
                        chatEventLogFilters.messagePins = D;
                        continue;
                    case R.id.btn_filterRestrictions:
                        chatEventLogFilters.memberRestrictions = D;
                        continue;
                    case R.id.btn_filterSettings:
                        chatEventLogFilters.settingChanges = D;
                        continue;
                    case R.id.btn_filterVideoChats:
                        chatEventLogFilters.videoChatChanges = D;
                        continue;
                }
            } else if (j10 == R.id.user && raVar.D() && eVar != null) {
                eVar.a(raVar.n());
            }
        }
        if (i10 == 0 || (eVar != null && eVar.l() == 0)) {
            this.f24493a.I3().g(view).F(null, this.f24495b, R.drawable.baseline_warning_24, gd.w.i1(R.string.EventLogEmptyFilter));
            return true;
        }
        vc.v2 v2Var = this.f9338x0;
        if (eVar != null) {
            jArr = eVar.g();
        }
        v2Var.Z(chatEventLogFilters, jArr);
        return false;
    }

    public void hm(long j10, long j11) {
        kd.f fVar;
        if (C9() == j10 && (fVar = this.f9342y0) != null) {
            fVar.E(j10, j11);
        }
    }

    public static void hn(ra raVar, uc.c cVar, boolean z10) {
        int A = raVar.A();
        if (A == 12 || A == 69) {
            ((ne.w) cVar.getChildAt(0)).e(raVar.D(), z10);
        }
    }

    public static int ik() {
        return ((ce.a0.f() - ((d1.getTopOffset() + ce.a0.i(20.0f)) * 2)) - ce.a0.i(48.0f)) - ce.a0.i(56.0f);
    }

    public void im(long j10, String str) {
        if (C9() == j10) {
            this.f9318s0.i2(j10, str);
        }
    }

    public static void in(int[] iArr, View view, int i10, ra raVar, TextView textView, iq iqVar) {
        int A = raVar.A();
        if (A == 12 || A == 69) {
            boolean z10 = false;
            boolean h10 = ((ne.w) ((uc.c) view).getChildAt(0)).h();
            raVar.S(h10);
            List<ra> D0 = iqVar.D0();
            int size = D0.size();
            switch (raVar.j()) {
                case R.id.btn_filter:
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        ra raVar2 = D0.get(i12);
                        if (raVar2.j() == R.id.btn_filter && raVar2.D()) {
                            i11++;
                        }
                    }
                    if (i11 == iArr.length - 1) {
                        z10 = true;
                    }
                    int L0 = iqVar.L0(R.id.btn_filterAll);
                    if (L0 != -1) {
                        ra raVar3 = D0.get(L0);
                        if (raVar3.D() != z10) {
                            raVar3.S(z10);
                            iqVar.r3(L0);
                            return;
                        }
                        return;
                    }
                    return;
                case R.id.btn_filterAll:
                    for (int i13 = 0; i13 < size; i13++) {
                        ra raVar4 = D0.get(i13);
                        if (raVar4.j() == R.id.btn_filter && raVar4.D() != h10) {
                            raVar4.S(h10);
                            iqVar.r3(i13);
                        }
                    }
                    return;
                case R.id.btn_members:
                    for (int i14 = 0; i14 < size; i14++) {
                        ra raVar5 = D0.get(i14);
                        if (raVar5.j() == R.id.user && raVar5.D() != h10) {
                            raVar5.S(h10);
                            iqVar.r3(i14);
                        }
                    }
                    return;
                case R.id.user:
                    int L02 = iqVar.L0(R.id.btn_members);
                    if (L02 != -1) {
                        ra raVar6 = D0.get(L02);
                        if (raVar6.D()) {
                            raVar6.S(false);
                            iqVar.r3(L02);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public void jm(long j10, TdApi.Message message) {
        if (C9() == j10 && message == null) {
            this.f9338x0.h2();
        }
    }

    public void jn(TdApi.ChatAdministrators chatAdministrators) {
        String[] strArr;
        final int[] iArr;
        TdApi.ChatAdministrator[] chatAdministratorArr;
        if (Ta()) {
            TdApi.ChatEventLogFilters J0 = this.f9338x0.J0();
            long[] L0 = this.f9338x0.L0();
            ArrayList arrayList = new ArrayList();
            int i10 = 11;
            if (this.f24495b.O6(this.f9310q0.f19908id)) {
                iArr = new int[]{R.id.btn_filterAll, R.id.btn_filterAdmins, R.id.btn_filterMembers, R.id.btn_filterInviteLinks, R.id.btn_filterInfo, R.id.btn_filterSettings, R.id.btn_filterDeletedMessages, R.id.btn_filterEditedMessages, R.id.btn_filterPinnedMessages, R.id.btn_filterLeavingMembers, R.id.btn_filterVideoChats};
                strArr = new String[]{gd.w.i1(R.string.EventLogFilterAll), gd.w.i1(R.string.EventLogFilterNewAdmins), gd.w.i1(R.string.EventLogFilterNewMembers), gd.w.i1(R.string.EventLogFilterInviteLinks), gd.w.i1(R.string.EventLogFilterChannelInfo), gd.w.i1(R.string.EventLogFilterChannelSettings), gd.w.i1(R.string.EventLogFilterDeletedMessages), gd.w.i1(R.string.EventLogFilterEditedMessages), gd.w.i1(R.string.EventLogFilterPinnedMessages), gd.w.i1(R.string.EventLogFilterLeavingMembers), gd.w.i1(R.string.EventLogFilterLiveStreams)};
            } else {
                int[] iArr2 = {R.id.btn_filterAll, R.id.btn_filterRestrictions, R.id.btn_filterAdmins, R.id.btn_filterMembers, R.id.btn_filterInviteLinks, R.id.btn_filterInfo, R.id.btn_filterSettings, R.id.btn_filterDeletedMessages, R.id.btn_filterEditedMessages, R.id.btn_filterPinnedMessages, R.id.btn_filterLeavingMembers, R.id.btn_filterVideoChats};
                strArr = new String[]{gd.w.i1(R.string.EventLogFilterAll), gd.w.i1(R.string.EventLogFilterNewRestrictions), gd.w.i1(R.string.EventLogFilterNewAdmins), gd.w.i1(R.string.EventLogFilterNewMembers), gd.w.i1(R.string.EventLogFilterInviteLinks), gd.w.i1(R.string.EventLogFilterGroupInfo), gd.w.i1(R.string.EventLogFilterGroupSettings), gd.w.i1(R.string.EventLogFilterDeletedMessages), gd.w.i1(R.string.EventLogFilterEditedMessages), gd.w.i1(R.string.EventLogFilterPinnedMessages), gd.w.i1(R.string.EventLogFilterLeavingMembers), gd.w.i1(R.string.EventLogFilterVoiceChats)};
                iArr = iArr2;
            }
            int length = iArr.length;
            int i11 = 0;
            boolean z10 = true;
            int i12 = 0;
            while (i11 < length) {
                int i13 = iArr[i11];
                if (z10) {
                    z10 = false;
                } else {
                    arrayList.add(new ra(i10));
                }
                arrayList.add(new ra(12, i13 == R.id.btn_filterAll ? i13 : R.id.btn_filter, 0, strArr[i12], i13, Ui(i13, J0)).G(J0));
                i12++;
                i11++;
                i10 = 11;
            }
            arrayList.add(new ra(3).d0(R.id.theme_color_background));
            arrayList.add(new ra(2).d0(R.id.theme_color_background));
            arrayList.add(new ra(12, (int) R.id.btn_members, 0, (int) R.string.EventLogAllAdmins, L0 == null));
            for (TdApi.ChatAdministrator chatAdministrator : this.Q2.administrators) {
                arrayList.add(new ra(11));
                arrayList.add(new ra(69, (int) R.id.user, 0, this.f24495b.e2().J2(chatAdministrator.userId), L0 == null || ib.b.s(L0, chatAdministrator.userId) != -1).N(chatAdministrator.userId).O(chatAdministrator.userId));
            }
            ra[] raVarArr = new ra[arrayList.size()];
            arrayList.toArray(raVarArr);
            me(new f2(R.id.btn_filter).l(false).k(true).p(raVarArr).r(R.string.Apply).c(true).f(true).m(new e2.a() {
                @Override
                public final boolean a(e2 e2Var, View view, boolean z11) {
                    boolean gn;
                    gn = rh.this.gn(e2Var, view, z11);
                    return gn;
                }
            }).t(cd.f7641a).n(new v4.n() {
                @Override
                public final void a(View view, int i14, ra raVar, TextView textView, iq iqVar) {
                    rh.in(iArr, view, i14, raVar, textView, iqVar);
                }
            }));
        }
    }

    public void km(long j10) {
        if (C9() == j10) {
            wr(true);
        }
    }

    public void kn(y1 y1Var) {
        if (Ta() && !Sa()) {
            y1Var.v3();
        }
        this.V2 = false;
    }

    public void lm(TdApi.Object object) {
        ae.h hVar = new ae.h(c(), (TdApi.Background) object);
        this.f24495b.Ue().f(hVar, ae.j.x0());
        this.f24495b.tc().s0(hVar, true, ae.j.g0());
        Zb();
    }

    public void ln(float f10, float f11, ValueAnimator valueAnimator) {
        dq(f10 + (f11 * db.b.a(valueAnimator)));
    }

    public void mm(final TdApi.Object object) {
        if (object.getConstructor() == -429971172) {
            ud(new Runnable() {
                @Override
                public final void run() {
                    rh.this.lm(object);
                }
            });
        }
    }

    public void mn(j2 j2Var, TdApi.Users users, s4 s4Var, View view) {
        j2Var.s2(true);
        long[] jArr = users.userIds;
        if (jArr.length > 1) {
            ad.x.L3(this, s4Var, jArr);
        } else if (jArr.length == 1) {
            this.f24495b.hd().v7(this, users.userIds[0], new hj.q().s(t().I3().g(view)));
        }
    }

    public static Object nl(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 0) {
            return gd.w.d2(z10);
        }
        return null;
    }

    public void nm(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        op(messageSchedulingState);
    }

    public void nn(TdApi.Object object, TextView textView, final s4 s4Var, t3 t3Var, LinearLayout linearLayout, final j2 j2Var) {
        final TdApi.Users users = (TdApi.Users) object;
        long[] jArr = users.userIds;
        if (jArr.length > 1) {
            textView.setText(ad.s.xg(s4Var, users.totalCount).toString());
        } else if (jArr.length == 1) {
            textView.setText(id.d.z().I(this.f24495b.Cb(new TdApi.MessageSenderUser(users.userIds[0]))));
        } else {
            textView.setText(ad.s.wg(s4Var));
        }
        t3Var.f(this.f24495b, users);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                rh.this.mn(j2Var, users, s4Var, view);
            }
        });
    }

    public boolean ol(long j10, View view, int i10) {
        if (i10 != R.id.btn_reportChat) {
            return true;
        }
        this.f24495b.v4().o(new TdApi.ReportChat(j10, null, new TdApi.ChatReportReasonUnrelatedLocation(), null), this.f24495b.na());
        Gj();
        this.f24495b.hd().U2(this, j10);
        return true;
    }

    public void om(String str, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        Ip(str, false, true, false, z10, messageSchedulingState);
    }

    public void on(final TextView textView, final s4 s4Var, final t3 t3Var, final LinearLayout linearLayout, final j2 j2Var, final TdApi.Object object) {
        if (object.getConstructor() == 171203420) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    rh.this.nn(object, textView, s4Var, t3Var, linearLayout, j2Var);
                }
            });
        }
    }

    public void pl(final long j10, View view) {
        TdApi.ChatLocation r32 = this.f24495b.r3(j10);
        if (r32 != null) {
            ee(gd.w.T("%1$s\n\n%2$s", ke.f8485a, gd.w.i1(R.string.ReportLocationTitle), gd.w.m1(R.string.ReportLocationDesc, r32.address)), new int[]{R.id.btn_reportChat, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.ReportLocationAction), gd.w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_report_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return ie.g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return ie.g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean ol;
                    ol = rh.this.ol(j10, view2, i10);
                    return ol;
                }
            });
        }
    }

    public boolean pm(View view) {
        this.f9338x0.K2(true);
        return true;
    }

    public void pn(hj.o oVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        if (!Sa()) {
            oVar.a(z11 || z10, messageSchedulingState, z12);
        }
    }

    public void ql(TdApi.Chat chat, View view) {
        f5 f5Var = new f5(this.f24493a, this.f24495b);
        f5Var.zg(10);
        f5Var.Vg(true);
        f5Var.Xg(new f5.b(new n(chat)));
        f5Var.Zg(R.string.AddMember, chat.title);
        ac(f5Var);
    }

    public void qm(i0 i0Var) {
        vo();
    }

    public void qn(boolean z10, TdApi.Message message) {
        TdApi.Function function;
        if (message.isPinned != z10) {
            if (z10) {
                function = new TdApi.PinChatMessage(C9(), message.f19946id, false, false);
            } else {
                function = new TdApi.UnpinChatMessage(C9(), message.f19946id);
            }
            this.f24495b.v4().o(function, this.f24495b.na());
        }
    }

    public boolean rl(long j10, View view, int i10) {
        if (i10 != R.id.btn_shareMyContact) {
            return true;
        }
        this.f24495b.v4().o(new TdApi.SharePhoneNumber(this.f24495b.h4(j10)), this.f24495b.na());
        return true;
    }

    public void rm(y3 y3Var) {
        Gj();
    }

    public void rn(long j10, s4 s4Var, int i10, SparseIntArray sparseIntArray) {
        boolean z10 = sparseIntArray.get(R.id.btn_notifyMembers) != 0;
        boolean l10 = ob.a.l(j10);
        this.f24495b.v4().o(new TdApi.PinChatMessage(j10, s4Var.D4(), !l10 && !z10, l10 && !z10), this.f24495b.na());
    }

    public void sl(final long j10, View view) {
        TdApi.User da2 = this.f24495b.da();
        if (da2 != null) {
            ee(t2.r2(da2) + ", " + ce.c0.w(da2.phoneNumber), new int[]{R.id.btn_shareMyContact, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.SharePhoneNumberAction), gd.w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_contact_phone_24, R.drawable.baseline_cancel_24}, new h0() {
                @Override
                public boolean P() {
                    return ie.g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return ie.g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean rl;
                    rl = rh.this.rl(j10, view2, i10);
                    return rl;
                }
            });
        }
    }

    public void sm(View view) {
        ad.x.I3(this, this.f9310q0.f19908id, this.f9269d2.getInfo());
    }

    public void sn(long j10) {
        if (!Sa() && C9() == j10) {
            o6 o6Var = this.f24495b;
            o6Var.tb(o6Var.h4(j10), this.f9310q0.f19908id, this.N1);
            Fk();
        }
    }

    public void tl(View view) {
        if (this.f9338x0.q1()) {
            Ej();
        } else {
            this.f24495b.hd().t8(this, C9());
        }
    }

    public void tm() {
        this.f24495b.tc().o(this.f9310q0.f19908id, this.f9269d2.getInfo());
    }

    public void tn(Runnable runnable, TdApi.Object object) {
        if (t2.p3(object)) {
            this.f24495b.hd().post(runnable);
        } else {
            this.f24495b.na().r2(object);
        }
    }

    public void ul(boolean z10) {
        if (this.U1 != null && (this.f9306p0 & 1) == 0) {
            this.U1 = null;
            if (this.f9290k2 == null) {
                vj();
            }
            if (z10) {
                this.f9346z0.setTextChangedSinceChatOpened(true);
                dp();
            }
        }
    }

    public void um(n0 n0Var, int i10) {
        this.W1.I1(this.f9260a2);
    }

    public void vl(float f10, ValueAnimator valueAnimator) {
        dq(f10 - (db.b.a(valueAnimator) * f10));
    }

    public boolean vm(View view) {
        long C9 = C9();
        if (C9 == 0 || Sa()) {
            return false;
        }
        this.f24495b.v4().o(new TdApi.ReadAllChatMentions(C9), this.f24495b.na());
        return true;
    }

    public void vn(boolean z10, TdApi.InputMessageContent inputMessageContent, kb.j jVar, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z13;
        o6 o6Var = this.f24495b;
        long j10 = this.f9310q0.f19908id;
        long qk = qk();
        long ko = z10 ? ko() : 0L;
        if (z11 || lo()) {
            z13 = true;
            messageSchedulingState2 = messageSchedulingState;
        } else {
            messageSchedulingState2 = messageSchedulingState;
            z13 = false;
        }
        o6Var.wb(j10, qk, ko, new TdApi.MessageSendOptions(z13, false, false, messageSchedulingState2), inputMessageContent, jVar);
    }

    public boolean wl(View view, int i10) {
        if (i10 == R.id.btn_dismissForSelf) {
            this.f9338x0.u0();
            return true;
        } else if (i10 != R.id.btn_unpinMessage) {
            return true;
        } else {
            this.f24495b.v4().o(new TdApi.UnpinAllChatMessages(C9()), this.f24495b.na());
            return true;
        }
    }

    public static void wm(TdApi.ChatSource chatSource, long j10) {
        if (j10 >= TimeUnit.SECONDS.toMillis(5L)) {
            he.i.c2().v2(chatSource);
        }
    }

    public void xl(TdApi.Object object, long j10, long j11) {
        TdApi.Chat chat;
        TdApi.DraftMessage ek;
        if (object.getConstructor() == 1435961258 && (chat = this.f9310q0) != null && chat.f19908id == j10 && (ek = ek()) != null && ek.replyToMessageId == j11) {
            Qj((TdApi.Message) object);
        }
    }

    public void xm(boolean z10) {
        if (z10 && Ta()) {
            this.f9339x1 = true;
            ap();
        }
    }

    public void xn(boolean z10, TdApi.Audio audio, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
        this.f24495b.wb(this.f9310q0.f19908id, qk(), z10 ? ko() : 0L, new TdApi.MessageSendOptions(z11 || lo(), false, false, messageSchedulingState), t2.F5(audio), null);
    }

    public void yl(final long j10, final long j11, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.xl(object, j10, j11);
            }
        });
    }

    public void ym(TdApi.MessageSchedulingState messageSchedulingState) {
        if (!Fp(false, messageSchedulingState)) {
            Kp(true, false, messageSchedulingState);
        }
    }

    public void yn(hd.r rVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        if (ob.a.l(C9()) || rVar.b0() == null) {
            Ip(rVar.a0(), true, true, false, z10, messageSchedulingState);
            return;
        }
        Ip(rVar.a0() + '@' + rVar.b0(), true, true, false, z10, messageSchedulingState);
    }

    public static void yr(p1 p1Var) {
        float[] fArr = he.i.S;
        int length = fArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            } else if (fArr[i10] == he.i.c2().t0()) {
                z10 = true;
                break;
            } else {
                i11++;
                i10++;
            }
        }
        if (z10) {
            p1Var.setValue(i11 / (he.i.S.length - 1));
        }
    }

    public void zl(kb.b[] bVarArr, boolean[] zArr, boolean z10, Location location) {
        bVarArr[0].c();
        if (!zArr[0]) {
            zArr[0] = true;
            vq(z10, location);
        }
    }

    public void zm(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        Kp(false, z10, messageSchedulingState);
    }

    public void zn(String str, String str2, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
        if (ob.a.i(C9()) || str == null || str2.contains("@")) {
            if (this.L1 && this.M1 == 2) {
                Fk();
            }
            Ip(str2, false, false, false, z10, messageSchedulingState);
            return;
        }
        Ip(str2 + '@' + str, false, false, false, z10, messageSchedulingState);
    }

    @Override
    public void A1(int i10) {
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && this.f9318s0 != null && t2.n2(chat) == j10) {
            this.f9318s0.k2(this.f9310q0);
        }
    }

    @Override
    public void A5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        i1.b(this, notificationSettingsScope);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void Ac() {
        super.Ac();
        this.A3 = false;
        vc.f fVar = this.f9318s0;
        if (fVar != null) {
            fVar.setTranslationX(0.0f);
        }
        this.f24495b.hd().Z8(R.id.menu_secretChat, this.R, this.f9310q0, true);
        xq();
    }

    public final boolean Ai() {
        return this.f9265c1 == 0 && t2.Q(Ak()) && Li();
    }

    public boolean Aj(long j10, p7 p7Var) {
        p7 p7Var2;
        return C9() == j10 && (((p7Var2 = this.f9295m1) == null && p7Var == null) || (p7Var2 != null && p7Var2.equals(p7Var)));
    }

    public final TdApi.Message Ak() {
        k0.e<s4> eVar = this.C1;
        if (eVar == null || eVar.p() != 1) {
            return null;
        }
        return this.C1.q(0).Y3(this.C1.j(0));
    }

    public final void Ao(boolean z10) {
        zo(this.f9308p2, this.f9312q2, true, z10);
    }

    public void Ap(List<f0.h> list, boolean z10, boolean z11, boolean z12, TdApi.MessageSchedulingState messageSchedulingState) {
        TdApi.MessageSchedulingState messageSchedulingState2;
        boolean z13;
        if (Ek()) {
            int size = list.size();
            TdApi.InputMessageContent[] inputMessageContentArr = new TdApi.InputMessageContent[size];
            for (int i10 = 0; i10 < size; i10++) {
                f0.h hVar = list.get(i10);
                inputMessageContentArr[i10] = this.f24495b.l5().B(new TdApi.InputMessageAudio(t2.e0(hVar.i(), hVar.h()), null, (int) (hVar.f() / 1000), hVar.j(), hVar.d(), null), gl());
            }
            long j10 = this.f9310q0.f19908id;
            long qk = qk();
            long ko = z11 ? ko() : 0L;
            if (z12 || lo()) {
                z13 = true;
                messageSchedulingState2 = messageSchedulingState;
            } else {
                messageSchedulingState2 = messageSchedulingState;
                z13 = false;
            }
            for (TdApi.Function function : t2.B5(j10, qk, ko, new TdApi.MessageSendOptions(z13, false, false, messageSchedulingState2), inputMessageContentArr, z10)) {
                this.f24495b.v4().o(function, this.f24495b.Z9());
            }
        }
    }

    public void Aq(long j10, TdApi.Message[] messageArr) {
        if (messageArr != null && messageArr.length != 0) {
            Gk();
            y00 y00Var = new y00(this.f24493a, this.f24495b);
            y00Var.Vi(new y00.m(messageArr).z(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Qn();
                }
            }));
            y00Var.ej();
        }
    }

    public final void Ar() {
        t().Z0().x1();
    }

    @Override
    public void B0(final TdApi.SecretChat secretChat) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.bn(secretChat);
            }
        });
    }

    @Override
    public void B3(final long j10, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.am(j10, z10);
            }
        });
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        zd.g0.x(this, j10, i10, z10);
    }

    @Override
    public void Bc(int i10, boolean z10) {
        if (i10 == 4) {
            Fo(true);
        } else if (i10 == 6 && !z10) {
            Uc(false);
        }
    }

    public final boolean Bi(int i10) {
        int p10;
        TdApi.Chat chat = this.f9310q0;
        if (chat == null || !chat.canBeReported || this.C1 == null || i10 > 3 || dl() || (p10 = this.C1.p()) <= 1) {
            return false;
        }
        for (int i11 = 0; i11 < p10; i11++) {
            if (!this.C1.q(i11).o0()) {
                return false;
            }
        }
        return true;
    }

    public boolean Bj(long j10, p7 p7Var, boolean z10) {
        p7 p7Var2;
        return C9() == j10 && (((p7Var2 = this.f9295m1) == null && p7Var == null) || (p7Var2 != null && p7Var2.equals(p7Var))) && z10 == ui();
    }

    public final void Bo() {
        if (!this.N2) {
            z0 z0Var = this.C0;
            if (z0Var == null) {
                z0 z0Var2 = new z0(t());
                this.C0 = z0Var2;
                z0Var2.Z1(this, true, this, this, false);
                this.f9330v0.addView(this.C0);
                this.f9326u0.getViewTreeObserver().addOnPreDrawListener(this.C0);
            } else {
                z0Var.setVisibility(0);
            }
            if (this.f9300n2) {
                this.O2 = this.f9304o2;
                Mj();
            } else {
                this.O2 = S9();
            }
            Qp(true, true);
            if (this.O2) {
                this.E0.setImageResource(R.drawable.baseline_keyboard_24);
                this.C0.Y1(this.f9346z0);
                return;
            }
            this.E0.setImageResource(R.drawable.baseline_direction_arrow_down_24);
        }
    }

    public void Bp(final String str, final int i10, boolean z10) {
        if (str != null && Ek()) {
            final long j10 = this.f9310q0.f19908id;
            final long ko = z10 ? ko() : 0L;
            final boolean lo = lo();
            final boolean gl = gl();
            gd.b0.k().q(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Gn(str, i10, gl, j10, ko, lo);
                }
            });
        }
    }

    public void Bq(final long j10) {
        final TdApi.User da2;
        if (Ek() && (da2 = this.f24495b.da()) != null) {
            Lo(false, null, new hj.o() {
                @Override
                public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                    rh.this.Rn(j10, da2, z10, messageSchedulingState, z11);
                }
            });
        }
    }

    public final void Br() {
        float f10 = -vk();
        this.f9334w0.setTranslationY(f10);
        this.A0.setTranslationY(f10);
        this.V1.setTranslationY(f10);
        cj();
        vo();
    }

    @Override
    public boolean C8() {
        return this.A3;
    }

    @Override
    public long C9() {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null) {
            return chat.f19908id;
        }
        return 0L;
    }

    @Override
    public void Cc(String str) {
        gp(str);
    }

    public final boolean Ci() {
        int p10;
        TdApi.Chat chat = this.f9310q0;
        if (chat == null || !chat.canBeReported || this.C1 == null || dl() || (p10 = this.C1.p()) <= 1) {
            return false;
        }
        for (int i10 = 0; i10 < p10; i10++) {
            if (!this.C1.q(i10).v0()) {
                return false;
            }
        }
        return true;
    }

    public boolean Cj(long j10) {
        return j10 != 0 && ob.a.q(C9()) == j10;
    }

    public int Ck() {
        return (int) (this.W1.getTotalVisualHeight() * (1.0f - qa()));
    }

    public final void Co() {
        Wn(new kb.j() {
            @Override
            public final void a(Object obj) {
                rh.this.jn((TdApi.ChatAdministrators) obj);
            }
        });
    }

    public void Cp(final ld.l[] lVarArr, final boolean z10, final TdApi.MessageSendOptions messageSendOptions, final boolean z11, final boolean z12) {
        if (lVarArr != null && lVarArr.length != 0 && Ek()) {
            final long j10 = this.f9310q0.f19908id;
            final long ko = ko();
            final boolean gl = gl();
            gd.b0.k().q(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Hn(lVarArr, z12, z11, gl, z10, j10, ko, messageSendOptions);
                }
            });
        }
    }

    public void Cq(boolean z10) {
        Bq(z10 ? ko() : 0L);
    }

    public final void Cr() {
        if (this.f9279g3 != null) {
            float f10 = this.f9337w3;
            float f11 = ((1.0f - this.f9333v3) * 0.39999998f) + 0.6f;
            ImageView imageView = this.f9291k3;
            imageView.setAlpha((imageView.isEnabled() ? f11 : 0.6f) * f10);
            ImageView imageView2 = this.f9294l3;
            if (!imageView2.isEnabled()) {
                f11 = 0.6f;
            }
            imageView2.setAlpha(f11 * f10);
            float f12 = this.f9333v3;
            float f13 = (1.0f - f12) * f10;
            float f14 = ((1.0f - f12) * 0.4f) + 0.6f;
            float f15 = f10 * f12;
            float f16 = (f12 * 0.4f) + 0.6f;
            this.f9297m3.setAlpha(f13);
            this.f9297m3.setScaleX(f14);
            this.f9297m3.setScaleY(f14);
            this.f9301n3.setAlpha(f15);
            this.f9301n3.setScaleX(f16);
            this.f9301n3.setScaleY(f16);
        }
    }

    @Override
    public void D4(w6 w6Var, boolean z10, boolean z11) {
        r0.b(this, w6Var, z10, z11);
    }

    public boolean Di() {
        return Li() && C9() != 0 && !Tk() && !Ua();
    }

    public final void Dj() {
        k0.e<s4> eVar = this.C1;
        if (!(eVar == null || eVar.p() == 0)) {
            if (this.C1.p() == 1) {
                TdApi.Message Ak = Ak();
                TdApi.FormattedText y12 = Ak != null ? ob.e.y1(Ak.content) : null;
                if (y12 != null) {
                    ce.j0.i(t2.q5(y12), R.string.CopiedText);
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int p10 = this.C1.p();
            boolean z10 = true;
            for (int i10 = 0; i10 < p10; i10++) {
                long j10 = this.C1.j(i10);
                s4 q10 = this.C1.q(i10);
                TdApi.Message Y3 = q10.Y3(j10);
                if (Y3 != null) {
                    if (z10) {
                        z10 = false;
                    } else {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                    }
                    String V9 = this.f24495b.V9(Y3);
                    if (Y3.viaBotUserId != 0) {
                        spannableStringBuilder.append((CharSequence) gd.w.j1(R.string.message_nameViaBot, V9, "@" + this.f24495b.e2().Q2(Y3.viaBotUserId)));
                    } else {
                        spannableStringBuilder.append((CharSequence) V9);
                    }
                    spannableStringBuilder.append((CharSequence) ", [");
                    spannableStringBuilder.append((CharSequence) gd.w.y1(Y3.date, TimeUnit.SECONDS));
                    spannableStringBuilder.append((CharSequence) "]");
                    if (Y3.isChannelPost && !ib.i.i(Y3.authorSignature)) {
                        spannableStringBuilder.append((CharSequence) "\n[");
                        spannableStringBuilder.append((CharSequence) gd.w.j1(R.string.PostedBy, Y3.authorSignature));
                        spannableStringBuilder.append((CharSequence) "]");
                    }
                    if (Y3.replyToMessageId != 0) {
                        String P3 = q10.P3();
                        if (!ib.i.i(P3)) {
                            spannableStringBuilder.append((CharSequence) "\n[");
                            spannableStringBuilder.append((CharSequence) gd.w.j1(R.string.InReplyToX, P3));
                            spannableStringBuilder.append((CharSequence) "]");
                        }
                    }
                    if (Y3.forwardInfo != null) {
                        spannableStringBuilder.append((CharSequence) "\n[ ");
                        spannableStringBuilder.append((CharSequence) gd.w.j1(R.string.ForwardedFromX, q10.H4()));
                        spannableStringBuilder.append((CharSequence) " ]");
                    }
                    TdApi.FormattedText y13 = ob.e.y1(Y3.content);
                    if (Y3.content.getConstructor() != 1989037971) {
                        spannableStringBuilder.append((CharSequence) "\n[");
                        spannableStringBuilder.append((CharSequence) t2.C(this.f24495b, Y3, false));
                        spannableStringBuilder.append((CharSequence) "]");
                    }
                    if (!ob.e.c1(y13)) {
                        spannableStringBuilder.append('\n');
                        spannableStringBuilder.append(t2.q5(y13));
                    }
                }
            }
            ce.j0.i(SpannableString.valueOf(spannableStringBuilder), R.string.CopiedMessages);
        }
    }

    public boolean Dk() {
        boolean z10;
        if (cl()) {
            vc.h0 h0Var = this.f9346z0;
            TdApi.FormattedText d10 = h0Var != null ? h0Var.d(true) : null;
            switch (this.f9290k2.content.getConstructor()) {
                case TdApi.MessagePhoto.CONSTRUCTOR:
                case TdApi.MessageAudio.CONSTRUCTOR:
                case TdApi.MessageVoiceNote.CONSTRUCTOR:
                case TdApi.MessageDocument.CONSTRUCTOR:
                case TdApi.MessageAnimation.CONSTRUCTOR:
                case TdApi.MessageVideo.CONSTRUCTOR:
                    return !ob.e.O(ob.e.y1(this.f9290k2.content), d10);
                case TdApi.MessageText.CONSTRUCTOR:
                    TdApi.MessageText messageText = (TdApi.MessageText) this.f9290k2.content;
                    TdApi.InputMessageText inputMessageText = new TdApi.InputMessageText(d10, Zj(), false);
                    if (!ob.e.O(inputMessageText.text, messageText.text) || (((z10 = inputMessageText.disableWebPagePreview) && messageText.webPage != null) || (!z10 && messageText.webPage == null && this.L2 != null))) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    public void Do(long j10, TdApi.Game game, String str, TdApi.Message message) {
        String str2;
        TdApi.User u22 = this.f24495b.e2().u2(j10);
        p9 p9Var = new p9(this.f24493a, this.f24495b);
        long j11 = u22 != null ? u22.f19979id : 0L;
        if (u22 != null) {
            str2 = "@" + u22.username;
        } else {
            str2 = "Game";
        }
        p9Var.Ad(new p9.a(j11, game, str2, str, message, this));
        ac(p9Var);
    }

    public void Dp(TdApi.Location location, int i10, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        if (C9() == this.f9344y2) {
            np(new TdApi.InputMessageLocation(location, 0, i10, 0), true, z10, messageSchedulingState, null);
            if (this.f9340x2) {
                f1();
            }
        }
    }

    public final void Dr() {
        vc.v2 v2Var = this.f9338x0;
        int M0 = v2Var != null ? v2Var.M0() : -1;
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9292l1;
        if (searchMessagesFilter != null) {
            if (searchMessagesFilter.getConstructor() == 371805512) {
                if (M0 > 0) {
                    this.f9318s0.setForcedSubtitle(gd.w.q2(R.string.XPinnedMessages, M0));
                } else {
                    this.f9318s0.setForcedSubtitle(gd.w.i1(R.string.PinnedMessages));
                }
            }
        } else if (M0 > 0) {
            if (this.f24495b.n7(this.f9289k1)) {
                this.f9318s0.setForcedSubtitle(gd.w.q2(R.string.XFoundMessagesFromSelf, M0));
            } else {
                this.f9318s0.setForcedSubtitle(gd.w.r2(this.f9289k1.getConstructor() == -336109341 ? R.string.XFoundMessagesFromUser : R.string.XFoundMessagesFromChat, M0, this.f24495b.Db(this.f9289k1, true)));
            }
        } else if (this.f24495b.n7(this.f9289k1)) {
            this.f9318s0.setForcedSubtitle(gd.w.i1(R.string.FoundMessagesFromSelf));
        } else {
            this.f9318s0.setForcedSubtitle(gd.w.m1(this.f9289k1.getConstructor() == -336109341 ? R.string.FoundMessagesFromUser : R.string.FoundMessagesFromChat, this.f24495b.Db(this.f9289k1, true)));
        }
    }

    @Override
    public boolean E8() {
        return !Wk();
    }

    public final boolean Ei() {
        return false;
    }

    public void Ej() {
        if (Ta() && this.f9310q0 != null) {
            this.f24495b.O4(C9(), false, null);
            this.f24495b.hd().U2(this, C9());
        }
    }

    public boolean Ek() {
        TdApi.Chat chat = this.f9310q0;
        return chat != null && this.f24495b.y6(chat) && !dl();
    }

    public final void Eo() {
        this.f24495b.hd().p7(this, ob.a.p(C9()), new hj.j().h().n());
    }

    public void Ep(final l6 l6Var, boolean z10, boolean z11, final TdApi.MessageSchedulingState messageSchedulingState) {
        if (Ek()) {
            final long j10 = this.f9310q0.f19908id;
            final long ko = z10 ? ko() : 0L;
            final boolean z12 = z11 || lo();
            if (l6Var.g() == null) {
                gd.l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        rh.this.In(l6Var, j10, ko, z12, messageSchedulingState);
                    }
                });
            } else {
                this.f24495b.wb(j10, qk(), ko, new TdApi.MessageSendOptions(z12, false, false, messageSchedulingState), new TdApi.InputMessageVoiceNote(l6Var.i(), l6Var.c(), l6Var.g(), null), null);
            }
        }
    }

    public boolean Eq() {
        return Fq(this.N1);
    }

    public final void Er() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            ?? Fi = Fi();
            int i10 = 8;
            d1Var.Q3(R.id.menu_messageActions, R.id.menu_btn_selectInBetween, Fi != 0 ? 0 : 8, 0);
            d1 d1Var2 = this.R;
            boolean Ai = Ai();
            d1Var2.Q3(R.id.menu_messageActions, R.id.menu_btn_reply, Ai ? 0 : 8, 0);
            int i11 = Fi;
            if (Ai) {
                i11 = Fi + 1;
            }
            d1 d1Var3 = this.R;
            boolean Ii = Ii();
            d1Var3.Q3(R.id.menu_messageActions, R.id.menu_btn_forward, Ii ? 0 : 8, 0);
            int i12 = i11;
            if (Ii) {
                i12 = i11 + 1;
            }
            d1 d1Var4 = this.R;
            boolean yi = yi();
            d1Var4.Q3(R.id.menu_messageActions, R.id.menu_btn_edit, yi ? 0 : 8, 0);
            int i13 = i12;
            if (yi) {
                i13 = i12 + 1;
            }
            d1 d1Var5 = this.R;
            boolean wi = wi();
            d1Var5.Q3(R.id.menu_messageActions, R.id.menu_btn_copy, wi ? 0 : 8, 0);
            int i14 = i13;
            if (wi) {
                i14 = i13 + 1;
            }
            d1 d1Var6 = this.R;
            boolean Ci = Ci();
            d1Var6.Q3(R.id.menu_messageActions, R.id.menu_btn_retry, Ci ? 0 : 8, 0);
            int i15 = i14;
            if (Ci) {
                i15 = i14 + 1;
            }
            d1 d1Var7 = this.R;
            boolean xi = xi();
            d1Var7.Q3(R.id.menu_messageActions, R.id.menu_btn_delete, xi ? 0 : 8, 0);
            int i16 = i15;
            if (xi) {
                i16 = i15 + 1;
            }
            d1 d1Var8 = this.R;
            boolean Ki = Ki();
            d1Var8.Q3(R.id.menu_messageActions, R.id.menu_btn_view, Ki ? 0 : 8, 0);
            int i17 = i16;
            if (Ki) {
                i17 = i16 + 1;
            }
            d1 d1Var9 = this.R;
            boolean Hi = Hi();
            d1Var9.Q3(R.id.menu_messageActions, R.id.menu_btn_send, Hi ? 0 : 8, 0);
            int i18 = i17;
            if (Hi) {
                i18 = i17 + 1;
            }
            d1 d1Var10 = this.R;
            boolean vi = vi();
            d1Var10.Q3(R.id.menu_messageActions, R.id.menu_btn_clearCache, vi ? 0 : 8, 0);
            int i19 = i18;
            if (vi) {
                i19 = i18 + 1;
            }
            d1 d1Var11 = this.R;
            boolean Ji = Ji();
            d1Var11.Q3(R.id.menu_messageActions, R.id.btn_unpinAll, Ji ? 0 : 8, 0);
            int i20 = i19;
            if (Ji) {
                i20 = i19 + 1;
            }
            d1 d1Var12 = this.R;
            if (Bi(i20)) {
                i10 = 0;
            }
            d1Var12.Q3(R.id.menu_messageActions, R.id.menu_btn_report, i10, 0);
        }
    }

    @Override
    public boolean F(View view, TdApi.Animation animation) {
        if ((this.P2 != 0 && SystemClock.uptimeMillis() - this.P2 < 200) || !pp(view, animation, true)) {
            return false;
        }
        this.P2 = SystemClock.uptimeMillis();
        return true;
    }

    @Override
    public List<c0.a> F3(View view) {
        TdApi.FormattedText formattedText;
        vc.h0 h0Var = this.f9346z0;
        boolean z10 = false;
        if (h0Var != null) {
            TdApi.FormattedText d10 = h0Var.d(true);
            formattedText = this.f9346z0.d(false);
            if (!ob.e.P(d10, formattedText, true)) {
                z10 = true;
            }
        } else {
            formattedText = null;
        }
        List<c0.a> X2 = this.f24495b.hd().X2(C9(), cl(), z10, true);
        if (!z10 && this.f24495b.vc(formattedText) && !cl()) {
            if (X2 == null) {
                X2 = new ArrayList<>();
            }
            if (t2.F.f13581a.equals(formattedText.text)) {
                X2.add(new c0.a((int) R.id.btn_sendNoMarkdown, gd.w.i1(R.string.SendDiceAsEmoji), (int) R.drawable.baseline_gps_fixed_24));
            } else if (t2.G.f13581a.equals(formattedText.text)) {
                X2.add(new c0.a((int) R.id.btn_sendNoMarkdown, gd.w.i1(R.string.SendDiceAsEmoji), (int) R.drawable.baseline_casino_24));
            } else {
                X2.add(new c0.a((int) R.id.btn_sendNoMarkdown, gd.w.i1(R.string.SendDiceAsEmoji), ce.c.e(formattedText.text)));
            }
        }
        return X2;
    }

    public final boolean Fi() {
        k0.e<s4> eVar = this.C1;
        if (eVar == null || eVar.p() != 2) {
            return false;
        }
        long j10 = this.C1.j(0);
        long j11 = this.C1.j(1);
        int m02 = this.f9338x0.E0().m0(j10);
        int m03 = this.f9338x0.E0().m0(j11);
        if (m02 == -1 || m03 == -1) {
            return false;
        }
        return m02 - m03 > 1 || this.C1.q(0).b4(j10, j11) + this.C1.q(1).b4(j10, j11) > 0;
    }

    public final void Fj(long j10) {
        synchronized (this) {
            k0.e<s4> eVar = this.C1;
            if (eVar != null) {
                eVar.l(j10);
            }
        }
    }

    public void Fk() {
        if (this.L1) {
            this.J1.setVisibility(8);
            vc.h0 h0Var = this.f9346z0;
            if (h0Var != null) {
                h0Var.setVisibility(0);
                ej(false);
            }
            Jj();
            this.L1 = false;
        }
    }

    public final void Fo(boolean z10) {
        if (!this.V2) {
            boolean z11 = false;
            if (Build.VERSION.SDK_INT >= 23) {
                org.thunderdog.challegram.a t10 = t();
                if (z10) {
                    if (t10.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                        z11 = true;
                    }
                } else if (t10.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    t10.P2();
                    return;
                }
            }
            final y1 y1Var = new y1(this);
            y1Var.v2(this);
            if (z11) {
                y1Var.t3();
            }
            this.V2 = true;
            y1Var.a3(new Runnable() {
                @Override
                public final void run() {
                    rh.this.kn(y1Var);
                }
            }, 300L);
        }
    }

    public final boolean Fp(boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        if (!this.f9267c3) {
            return false;
        }
        l6 record = this.f9276f3.getRecord();
        if (record != null) {
            this.f9276f3.L1();
            Ep(record, true, z10, messageSchedulingState);
            wj(false);
        }
        return true;
    }

    public boolean Fq(String str) {
        if (!this.f24495b.M6(this.f9310q0)) {
            return false;
        }
        this.N1 = str;
        Gq(R.string.BotStart, 2);
        return true;
    }

    public void Fr(CharSequence charSequence, boolean z10) {
        this.G0.setIsActive(charSequence.length() > 0 || bl());
        ej(z10);
    }

    @Override
    public View G9() {
        if (Xk()) {
            return this.f9322t0;
        }
        if (fo()) {
            return this.f9259a1;
        }
        if (C9() != 0) {
            return this.f9318s0;
        }
        return null;
    }

    @Override
    public View Ga() {
        return this.W1;
    }

    public boolean Gi() {
        return this.f24495b.K2(this.f9310q0);
    }

    public final void Gj() {
        this.f24495b.v4().o(new TdApi.RemoveChatActionBar(C9()), this.f24495b.na());
    }

    public void Gk() {
        La();
        nj(false);
        qj();
    }

    public void Go(s4 s4Var) {
        if (ti()) {
            v4<?> kd2 = kd();
            if ((kd2 instanceof rh) && kd2.C9() == C9()) {
                ((rh) kd2).Ok(s4Var.G9());
                Zb();
                return;
            }
        }
        c().hd().r7(this, s4Var.I2(), s4Var.G9(), null);
    }

    public final void Gp(final String str, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        wp(null, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil, z10, z11, messageSchedulingState, new kb.e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent Kn;
                Kn = rh.Kn(str);
                return Kn;
            }
        });
    }

    public void Gq(int i10, int i11) {
        Hq(gd.w.i1(i10).toUpperCase(), i11, true);
    }

    public void Gr() {
        d3 d3Var = this.A0;
        if (d3Var != null) {
            d3Var.setColorId(this.f9338x0.x3() ? R.id.theme_color_bubble_chatSeparator : R.id.theme_color_chatSeparator);
        }
    }

    public void H(long j10, long[] jArr) {
        TdApi.Message message = this.f9290k2;
        if (message != null && message.chatId == j10 && ib.b.s(jArr, message.f19946id) != -1) {
            pj();
        }
    }

    @Override
    public void H0(long j10, String str) {
        zd.g0.t(this, j10, str);
    }

    @Override
    public void H4() {
        if (this.B0) {
            this.B0 = false;
        }
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null && !h0Var.isEnabled() && !el()) {
            this.f9346z0.setEnabled(true);
            this.f9346z0.requestFocus();
        }
    }

    public final boolean Hi() {
        k0.e<s4> eVar;
        if (this.f9265c1 != 0 || (eVar = this.C1) == null || eVar.p() <= 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.C1.p(); i10++) {
            TdApi.Message Y3 = this.C1.q(i10).Y3(this.C1.j(i10));
            if (Y3 == null || Y3.schedulingState == null) {
                return false;
            }
        }
        return true;
    }

    public final void Hj() {
        v4.o oVar;
        if (!zi(false)) {
            this.f9338x0.u0();
            return;
        }
        int Q0 = this.f9338x0.Q0();
        if (Q0 != -1) {
            v4.o oVar2 = null;
            v4.p.a c10 = new v4.p.a().c(Q0 > 1 ? gd.w.q2(R.string.UnpinXMessages, Q0) : null);
            if (zi(false)) {
                oVar = new v4.o.a().d(R.id.btn_unpinMessage).f(gd.w.i1(Q0 == 1 ? R.string.UnpinMessage : R.string.UnpinMessagesConfirm)).b(2).c(R.drawable.deproko_baseline_pin_undo_24).a();
            } else {
                oVar = null;
            }
            v4.p.a d10 = c10.d(oVar);
            if (!hl()) {
                oVar2 = new v4.o.a().d(R.id.btn_dismissForSelf).e(R.string.HideForYourself).c(R.drawable.baseline_close_24).a();
            }
            ge(d10.d(oVar2).b().a(), new h0() {
                @Override
                public boolean P() {
                    return ie.g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return ie.g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean wl;
                    wl = rh.this.wl(view, i10);
                    return wl;
                }
            });
        }
    }

    public final void Hk() {
        this.D0.setVisibility(4);
    }

    public final void Ho() {
        this.f9306p0 |= 1;
        Rp(true);
        final float uk = uk();
        final float f10 = 1.0f - uk;
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                rh.this.ln(uk, f10, valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(200L);
        b10.addListener(new h());
        b10.start();
    }

    public final boolean Hp(View view, final TdApi.Sticker sticker, final String str, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        return sticker != null && wp(view, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil, z10, z11, messageSchedulingState, new kb.e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent Jn;
                Jn = rh.Jn(TdApi.Sticker.this, str);
                return Jn;
            }
        });
    }

    public void Hq(CharSequence charSequence, int i10, boolean z10) {
        boolean z11;
        if (this.L1) {
            La();
            qr(charSequence, i10, z10);
            return;
        }
        if (this.J1 == null) {
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(t());
            this.J1 = frameLayoutFix;
            frameLayoutFix.setLayoutParams(new LinearLayout.LayoutParams(-1, ce.a0.i(49.0f)));
            b2 b2Var = new b2(t());
            this.K1 = b2Var;
            b2Var.setId(R.id.btn_chatAction);
            this.K1.setOnClickListener(this);
            this.K1.setTextSize(1, 16.0f);
            this.K1.setTypeface(ce.o.i());
            this.K1.setPadding(ce.a0.i(12.0f), 0, ce.a0.i(12.0f), 0);
            yd.d.h(this.K1, this);
            this.K1.setEllipsize(TextUtils.TruncateAt.END);
            this.K1.setGravity(17);
            this.K1.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.J1.addView(this.K1);
            if (i10 == 7) {
                ImageView imageView = new ImageView(t());
                imageView.setOnClickListener(this);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.baseline_help_outline_24);
                imageView.setColorFilter(ae.j.L(R.id.theme_color_textNeutral));
                q8(imageView, R.id.theme_color_textNeutral);
                imageView.setLayoutParams(FrameLayoutFix.r1(ce.a0.i(49.0f), ce.a0.i(49.0f), 21));
                imageView.setId(R.id.btn_help);
                this.J1.addView(imageView);
            }
            z11 = true;
        } else {
            z11 = false;
        }
        this.L1 = true;
        qr(charSequence, i10, z10);
        nj(false);
        qj();
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            h0Var.setVisibility(8);
            this.f9346z0.setTextSilently("");
        }
        Hk();
        Mk();
        Kk();
        if (z11) {
            LinearLayout linearLayout = this.f9330v0;
            linearLayout.addView(this.J1, Math.min(linearLayout.getChildCount(), 1));
        } else {
            this.J1.setVisibility(0);
        }
        La();
    }

    public final void Hr(boolean z10) {
    }

    @Override
    public void I0(View view, View view2) {
        int id2 = view.getId();
        if (id2 != R.id.btn_sendToast) {
            switch (id2) {
                case R.id.btn_sendNoMarkdown:
                    if (cl()) {
                        ep(false);
                        return;
                    } else {
                        Lo(false, null, new hj.o() {
                            @Override
                            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                                rh.this.zm(z10, messageSchedulingState, z11);
                            }
                        });
                        return;
                    }
                case R.id.btn_sendNoSound:
                    Lo(true, null, new hj.o() {
                        @Override
                        public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                            rh.this.Am(z10, messageSchedulingState, z11);
                        }
                    });
                    return;
                case R.id.btn_sendOnceOnline:
                    if (!Fp(false, new TdApi.MessageSchedulingStateSendWhenOnline())) {
                        Kp(true, false, new TdApi.MessageSchedulingStateSendWhenOnline());
                        return;
                    }
                    return;
                case R.id.btn_sendScheduled:
                    this.f24495b.hd().J7(this, new kb.j() {
                        @Override
                        public final void a(Object obj) {
                            rh.this.ym((TdApi.MessageSchedulingState) obj);
                        }
                    }, C9(), false, false, null);
                    return;
                default:
                    return;
            }
        } else {
            Pq(t2.q5(this.f9346z0.d(true)));
        }
    }

    @Override
    public void I4(final long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Bm(j10);
            }
        });
    }

    @Override
    public boolean I8(float f10, float f11) {
        if (!super.I8(f10, f11)) {
            return false;
        }
        MessagesRecyclerView messagesRecyclerView = this.f9334w0;
        if (messagesRecyclerView == null) {
            return true;
        }
        messagesRecyclerView.K1();
        return true;
    }

    @Override
    public void Ia() {
        v2 v2Var;
        super.Ia();
        if (fo() && (v2Var = this.Z0) != null) {
            v2Var.s();
        }
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            h0Var.s();
        }
        p0.e0(this.f9334w0);
        RecyclerView recyclerView = this.W0;
        if (recyclerView != null) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).B2(gd.w.G2());
            this.W0.A0();
            ((j4) this.W0.getAdapter()).f0(false);
        }
    }

    public final boolean Ii() {
        d0 d0Var;
        if (this.f9265c1 == 0 || (d0Var = this.Y0) == null) {
            k0.e<s4> eVar = this.C1;
            if (eVar == null) {
                return false;
            }
            int p10 = eVar.p();
            for (int i10 = 0; i10 < p10; i10++) {
                TdApi.Message Y3 = this.C1.q(i10).Y3(this.C1.j(i10));
                if (Y3 == null || !Y3.canBeForwarded) {
                    return false;
                }
            }
            return p10 > 0;
        }
        j10 j10Var = (j10) d0Var.O.e(this.f9265c1);
        return j10Var != null && j10Var.sf();
    }

    public final void Ij() {
        this.D0.setVisibility(0);
    }

    public final void Ik(boolean z10) {
        this.I1.p(false, z10);
        Ti();
    }

    public void Io(TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat) {
    }

    public final void Ip(String str, boolean z10, boolean z11, boolean z12, boolean z13, TdApi.MessageSchedulingState messageSchedulingState) {
        Jp(new TdApi.FormattedText(str, null), z10, true, z11, z12, z13, messageSchedulingState);
    }

    public void Iq(String str, int i10) {
        Hq(str, i10, true);
    }

    public final void Ir() {
        TdApi.Message[] h10;
        this.f9261a3 = true;
        if (this.C1 != null) {
            lj();
        }
        mj();
        hj();
        Zo();
        Pj();
        this.W1.C1(false);
        bp();
        this.f24495b.hd().Z8(R.id.menu_secretChat, this.R, this.f9310q0, true);
        this.f9334w0.setMessageAnimatorEnabled(false);
        kd.f fVar = this.f9342y0;
        if (fVar != null) {
            fVar.g();
            this.f9342y0 = null;
        }
        t0 t0Var = this.B2;
        if (t0Var != null) {
            t0Var.p();
            this.B2 = null;
        }
        this.f9318s0.f2(this.f24495b, this.f9310q0, this.f9295m1);
        if (this.f9280h1) {
            int i10 = this.f9283i1;
            if (i10 == 3) {
                Gq(R.string.Settings, 7);
                this.f9338x0.n2(this.f9310q0);
                this.f9334w0.setItemAnimator(new tc.d(db.b.f7287b, 120L));
                if (!(x9().f9371p == 0 || this.f9318s0 == null)) {
                    this.f9338x0.Z(new TdApi.ChatEventLogFilters(true, true, true, true, true, true, true, true, true, true, true, true), new long[]{x9().f9371p});
                }
            } else if (i10 != 4) {
                this.f9338x0.R1();
            } else {
                this.f9338x0.o2(this.f9310q0, this.f9286j1, this.f9289k1, this.f9292l1);
                rr(false);
            }
        } else {
            TdApi.Chat chat = this.f9310q0;
            Fd((chat == null || !this.f24495b.y6(chat)) ? null : this.f9346z0, false);
            if (this.f9310q0 != null) {
                if (this.f9346z0 != null) {
                    boolean z10 = !el();
                    if (this.f9346z0.isEnabled() != z10) {
                        this.f9346z0.setEnabled(z10);
                    }
                    if (z10) {
                        this.f9346z0.setIsSecret(he.i.c2().a3(this.f9310q0));
                    }
                }
                if (this.f24495b.y6(this.f9310q0)) {
                    TdApi.DraftMessage ek = ek();
                    if (ek != null) {
                        long j10 = ek.replyToMessageId;
                        if (j10 != 0 && !this.f9319s1) {
                            Oj(j10);
                        }
                    }
                    Hr(this.f24495b.O6(this.f9310q0.f19908id));
                }
                if (!this.f9280h1 && !Ua()) {
                    Qi();
                    Wi(this.f9310q0.pendingJoinRequests);
                }
                vc.h0 h0Var = this.f9346z0;
                if (h0Var != null) {
                    TdApi.Chat chat2 = this.f9310q0;
                    p7 p7Var = this.f9295m1;
                    v3 v3Var = this.L0;
                    h0Var.t0(chat2, p7Var, v3Var != null && v3Var.getIsSilent());
                }
                this.f9319s1 = false;
                rr(false);
                nj(false);
                this.f9338x0.m2(this.f9310q0, this.f9295m1, this.f9292l1, this, this.f9299n1, !this.f9280h1 && !Ua());
                Gr();
                j0 j0Var = this.J0;
                if (j0Var != null && j0Var.c(this.f24495b.l3(this.f9310q0.f19908id))) {
                    this.K0.setTranslationX(this.J0.a() ? 0.0f : this.J0.getLayoutParams().width);
                    this.D0.a();
                }
                switch (this.f9310q0.type.getConstructor()) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                        this.f24495b.e2().h2(ob.a.p(this.f9310q0.f19908id));
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        this.f24495b.e2().D2(t2.n2(this.f9310q0));
                        break;
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        this.f24495b.e2().O(ob.a.m(this.f9310q0.f19908id));
                        break;
                }
                if (this.f24495b.b7(this.f9310q0.f19908id) || this.f24495b.M6(this.f9310q0)) {
                    ur(R.drawable.deproko_baseline_bots_command_26);
                    vr(false);
                    this.f9342y0 = new kd.f(this, this.f9310q0);
                } else {
                    ur(0);
                    this.f9342y0 = null;
                }
                t0 t0Var2 = new t0(this.f24493a, this.f24495b, this.f9310q0.f19908id, qk(), this.f9348z2, false, this);
                this.B2 = t0Var2;
                t0Var2.v();
                vc.h0 h0Var2 = this.f9346z0;
                if (h0Var2 != null) {
                    h0Var2.setCommandListProvider(this.f9342y0);
                }
                p7 p7Var2 = this.f9295m1;
                if (p7Var2 != null) {
                    s4 s4Var = null;
                    for (TdApi.Message message : p7Var2.h()) {
                        if (s4Var == null) {
                            s4Var = s4.Y9(this.f9338x0, message, this.f9310q0, null);
                        } else {
                            s4Var.G0(message, true);
                        }
                    }
                    if (s4Var != null) {
                        s4Var.e9(true);
                        this.f9338x0.R2(s4Var);
                    }
                }
                long C9 = C9();
                Client v42 = this.f24495b.v4();
                TdApi.GetChatAdministrators getChatAdministrators = new TdApi.GetChatAdministrators(C9);
                f fVar2 = new f(C9);
                this.f9327u1 = fVar2;
                v42.o(getChatAdministrators, fVar2);
                wr(false);
                Zi();
                Xi();
            }
        }
    }

    @Override
    public void J(int i10, View view) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        TdApi.Message[] mp;
        d0 d0Var4;
        j10 j10Var;
        ob.d Lf;
        int i11 = 0;
        switch (i10) {
            case R.id.menu_btn_clear:
                if (dl()) {
                    T8();
                    return;
                } else {
                    gj();
                    return;
                }
            case R.id.menu_btn_clearCache:
                if (this.f9265c1 == 0 || (d0Var = this.Y0) == null) {
                    k0.e<s4> eVar = this.C1;
                    if (eVar != null && eVar.p() > 0) {
                        int p10 = this.C1.p();
                        k0.h hVar = new k0.h(p10);
                        while (i11 < p10) {
                            TdApi.Message Y3 = this.C1.q(i11).Y3(this.C1.j(i11));
                            TdApi.File j12 = t2.j1(Y3);
                            if (t2.N(Y3, j12)) {
                                hVar.j(j12.f19913id, j12);
                            }
                            i11++;
                        }
                        t2.k0(this, (TdApi.File[]) ib.b.f(hVar, new TdApi.File[hVar.n()]), new Runnable() {
                            @Override
                            public final void run() {
                                rh.this.Gm();
                            }
                        });
                        return;
                    }
                    return;
                }
                j10 j10Var2 = (j10) d0Var.O.e(this.f9265c1);
                if (j10Var2 != null) {
                    j10Var2.tf();
                    return;
                }
                return;
            case R.id.menu_btn_copy:
                if (this.C1 != null) {
                    Dj();
                    p5(-1);
                    return;
                }
                return;
            case R.id.menu_btn_delete:
                if (this.f9265c1 == 0 || (d0Var2 = this.Y0) == null) {
                    k0.e<s4> eVar2 = this.C1;
                    if (eVar2 != null && eVar2.p() > 0) {
                        int p11 = this.C1.p();
                        TdApi.Message[] messageArr = new TdApi.Message[p11];
                        while (i11 < p11) {
                            messageArr[i11] = this.C1.q(i11).Y3(this.C1.j(i11));
                            i11++;
                        }
                        this.f24495b.hd();
                        hj.w8(this, messageArr, new Runnable() {
                            @Override
                            public final void run() {
                                rh.this.Im();
                            }
                        });
                        return;
                    }
                    return;
                }
                j10 j10Var3 = (j10) d0Var2.O.e(this.f9265c1);
                if (j10Var3 != null) {
                    j10Var3.vf();
                    return;
                }
                return;
            case R.id.menu_btn_done:
            case R.id.menu_btn_help:
            case R.id.menu_btn_lock:
            case R.id.menu_btn_manage:
            case R.id.menu_btn_masks:
            case R.id.menu_btn_muteUnmute:
            case R.id.menu_btn_pictureInPicture:
            case R.id.menu_btn_pinUnpin:
            case R.id.menu_btn_share:
            case R.id.menu_btn_toggle:
            default:
                return;
            case R.id.menu_btn_down:
                ao(false);
                return;
            case R.id.menu_btn_edit:
                TdApi.Message Ak = Ak();
                if (Ak != null) {
                    Lj(Ak);
                    return;
                }
                return;
            case R.id.menu_btn_forward:
                if (this.f9265c1 == 0 || (d0Var3 = this.Y0) == null) {
                    k0.e<s4> eVar3 = this.C1;
                    if (eVar3 != null) {
                        int p12 = eVar3.p();
                        TdApi.Message Ak2 = Ak();
                        if (Ak2 != null) {
                            zq(Ak2);
                            return;
                        } else if (p12 > 1) {
                            TdApi.Message[] messageArr2 = new TdApi.Message[p12];
                            while (i11 < p12) {
                                messageArr2[i11] = this.C1.q(i11).Y3(this.C1.j(i11));
                                i11++;
                            }
                            Aq(this.f9310q0.f19908id, messageArr2);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    j10 j10Var4 = (j10) d0Var3.O.e(this.f9265c1);
                    if (j10Var4 != null) {
                        j10Var4.Ig();
                        return;
                    }
                    return;
                }
            case R.id.menu_btn_gallery:
                ce.v.t(false);
                return;
            case R.id.menu_btn_more:
                if (this.f9280h1) {
                    int i12 = this.f9283i1;
                    if (i12 == 2) {
                        jb.c cVar = new jb.c(2);
                        u0 u0Var = new u0(2);
                        cVar.a(R.id.btn_chatFontSizeScale);
                        u0Var.a(he.i.c2().A2() ? R.string.TextSizeScaleDisable : R.string.TextSizeScaleEnable);
                        if (he.i.c2().A()) {
                            cVar.a(R.id.btn_chatFontSizeReset);
                            u0Var.a(R.string.TextSizeReset);
                        }
                        Yd(cVar.e(), u0Var.d(), 0);
                        return;
                    } else if (i12 == 5) {
                        jb.c cVar2 = new jb.c(2);
                        u0 u0Var2 = new u0(2);
                        cVar2.a(R.id.btn_share);
                        u0Var2.a(R.string.Share);
                        cVar2.a(R.id.btn_copyLink);
                        u0Var2.a(R.string.CopyLink);
                        Yd(cVar2.e(), u0Var2.d(), 0);
                        return;
                    } else {
                        return;
                    }
                } else {
                    vc.h0 h0Var = this.f9346z0;
                    if (h0Var == null || !h0Var.V()) {
                        br();
                        return;
                    }
                    jb.c cVar3 = new jb.c(6);
                    u0 u0Var3 = new u0(6);
                    jb.c cVar4 = new jb.c(6);
                    cVar3.a(R.id.btn_bold);
                    u0Var3.a(R.string.TextFormatBold);
                    cVar4.a(R.drawable.baseline_format_bold_24);
                    cVar3.a(R.id.btn_italic);
                    u0Var3.a(R.string.TextFormatItalic);
                    cVar4.a(R.drawable.baseline_format_italic_24);
                    cVar3.a(R.id.btn_underline);
                    u0Var3.a(R.string.TextFormatUnderline);
                    cVar4.a(R.drawable.baseline_format_underlined_24);
                    cVar3.a(R.id.btn_strikethrough);
                    u0Var3.a(R.string.TextFormatStrikethrough);
                    cVar4.a(R.drawable.baseline_strikethrough_s_24);
                    cVar3.a(R.id.btn_monospace);
                    u0Var3.a(R.string.TextFormatMonospace);
                    cVar4.a(R.drawable.baseline_code_24);
                    cVar3.a(R.id.btn_spoiler);
                    u0Var3.a(R.string.TextFormatSpoiler);
                    cVar4.a(R.drawable.baseline_eye_off_24);
                    cVar3.a(R.id.btn_link);
                    u0Var3.a(R.string.TextFormatLink);
                    cVar4.a(R.drawable.baseline_link_24);
                    ee(null, cVar3.e(), u0Var3.d(), null, cVar4.e(), new h0() {
                        @Override
                        public boolean P() {
                            return ie.g0.a(this);
                        }

                        @Override
                        public Object a2(int i13) {
                            return ie.g0.b(this, i13);
                        }

                        @Override
                        public final boolean r3(View view2, int i13) {
                            boolean Dm;
                            Dm = rh.this.Dm(view2, i13);
                            return Dm;
                        }
                    });
                    return;
                }
            case R.id.menu_btn_reply:
                TdApi.Message Ak3 = Ak();
                if (Ak3 != null) {
                    cr(Ak3, true, true);
                    p5(-1);
                    vc.h0 h0Var2 = this.f9346z0;
                    if (h0Var2 != null && h0Var2.d0()) {
                        ce.x.f(this.f9346z0);
                        return;
                    }
                    return;
                }
                return;
            case R.id.menu_btn_report:
                if (!(this.C1 == null || (mp = mp()) == null)) {
                    Xo(mp, new Runnable() {
                        @Override
                        public final void run() {
                            rh.this.Em();
                        }
                    });
                    return;
                }
                return;
            case R.id.menu_btn_retry:
                k0.e<s4> eVar4 = this.C1;
                if (eVar4 != null && eVar4.p() > 0) {
                    long j10 = 0;
                    long j11 = 0;
                    int i13 = 0;
                    for (int i14 = 0; i14 < this.C1.p(); i14++) {
                        TdApi.Message Y32 = this.C1.q(i14).Y3(this.C1.j(i14));
                        long j13 = Y32.chatId;
                        if (j10 != j13 || j11 != Y32.mediaAlbumId || j11 == 0) {
                            j11 = Y32.mediaAlbumId;
                            i13++;
                            j10 = j13;
                        }
                    }
                    if (i13 > 0) {
                        ke(new int[]{R.id.btn_messageResend, R.id.btn_cancel}, new String[]{gd.w.o2(R.string.ResendXMessages, i13), gd.w.i1(R.string.Cancel)}, new int[]{3, 1}, new h0() {
                            @Override
                            public boolean P() {
                                return ie.g0.a(this);
                            }

                            @Override
                            public Object a2(int i15) {
                                return ie.g0.b(this, i15);
                            }

                            @Override
                            public final boolean r3(View view2, int i15) {
                                boolean Jm;
                                Jm = rh.this.Jm(view2, i15);
                                return Jm;
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            case R.id.menu_btn_search:
                if (this.f9338x0.m1()) {
                    Jk();
                    Yc();
                    return;
                }
                return;
            case R.id.menu_btn_selectInBetween:
                lp();
                return;
            case R.id.menu_btn_send:
                k0.e<s4> eVar5 = this.C1;
                if (eVar5 != null && eVar5.p() > 0) {
                    ee(gd.w.q2(R.string.SendXMessagesNow, this.C1.p()), new int[]{R.id.btn_send, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.SendNow), gd.w.i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_send_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return ie.g0.a(this);
                        }

                        @Override
                        public Object a2(int i15) {
                            return ie.g0.b(this, i15);
                        }

                        @Override
                        public final boolean r3(View view2, int i15) {
                            boolean Fm;
                            Fm = rh.this.Fm(view2, i15);
                            return Fm;
                        }
                    });
                    return;
                }
                return;
            case R.id.menu_btn_stopwatch:
                if (gl()) {
                    this.f24495b.hd().P8(t(), this.f9310q0);
                    return;
                }
                return;
            case R.id.menu_btn_unpinAll:
                k0.e<s4> eVar6 = this.C1;
                if (eVar6 != null && eVar6.p() > 0) {
                    ee(gd.w.q2(R.string.UnpinXMessages, this.C1.p()), new int[]{R.id.btn_unpinAll, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.Unpin), gd.w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.deproko_baseline_pin_undo_24, R.drawable.baseline_cancel_24}, new h0() {
                        @Override
                        public boolean P() {
                            return ie.g0.a(this);
                        }

                        @Override
                        public Object a2(int i15) {
                            return ie.g0.b(this, i15);
                        }

                        @Override
                        public final boolean r3(View view2, int i15) {
                            boolean Hm;
                            Hm = rh.this.Hm(view2, i15);
                            return Hm;
                        }
                    });
                    return;
                }
                return;
            case R.id.menu_btn_up:
                ao(true);
                return;
            case R.id.menu_btn_view:
                if (!(this.f9265c1 == 0 || (d0Var4 = this.Y0) == null || (j10Var = (j10) d0Var4.O.e(this.f9265c1)) == null || (Lf = j10Var.Lf()) == null)) {
                    Ok(Lf);
                    j10Var.Eg(false);
                    return;
                }
                return;
            case R.id.menu_btn_viewScheduled:
                Kr(false);
                return;
        }
    }

    @Override
    public void J0(s3 s3Var) {
        if (gr()) {
            tj();
        } else if (cl()) {
            pj();
        } else {
            uj(true);
        }
    }

    @Override
    public qd.c J4(long j10, TdApi.SearchMessagesFilter searchMessagesFilter) {
        int i10 = this.f9265c1;
        if (i10 == 0) {
            return this.f9338x0.p0(j10, searchMessagesFilter);
        }
        if (i10 == 1) {
            d0 d0Var = this.Y0;
            j10 j10Var = d0Var != null ? (j10) d0Var.O.e(1) : null;
            if (j10Var != null && (j10Var instanceof r10)) {
                return ((r10) j10Var).J4(j10, searchMessagesFilter);
            }
        }
        return null;
    }

    @Override
    public void J6() {
        if (this.f9267c3) {
            if (!this.f9270d3) {
                this.f9273e3 = true;
            }
            this.f9276f3.L1();
            this.f9276f3.K1();
            wj(false);
        }
    }

    @Override
    public void J8(float f10, boolean z10) {
        super.J8(f10, z10);
        this.W1.L1(1.0f - f10, false);
        Br();
        kq(f10);
    }

    @Override
    public void Ja(int i10, int i11) {
        z0 z0Var = this.C0;
        if (z0Var != null) {
            z0Var.Q5(i10, i11);
        }
        if (Ta() && !Tk()) {
            this.f9338x0.u2();
            vc.f fVar = this.f9318s0;
            if (fVar != null) {
                fVar.f2(this.f24495b, this.f9310q0, this.f9295m1);
            }
        }
    }

    @Override
    public boolean Je() {
        return true;
    }

    public final boolean Ji() {
        return ti() && zi(false);
    }

    public final void Jj() {
        this.E0.setVisibility(0);
        this.E0.setOnClickListener(this);
    }

    public void Jk() {
        x2.l lVar = this.f9331v1;
        if (lVar != null) {
            lVar.E(true);
        }
    }

    public final void Jo(final j2 j2Var, final s4 s4Var, boolean z10) {
        if (s4Var.s0() && !z10 && ((!s4Var.s6() || s4Var.z7()) && (j2Var.getChildAt(1) instanceof v1))) {
            final LinearLayout linearLayout = new LinearLayout(j2Var.getContext());
            final TextView a10 = v1.a(j2Var.getContext(), R.id.more_btn_openReadReceipts, gd.w.i1(R.string.LoadingMessageSeen), 1, R.drawable.baseline_visibility_24, null, null, null);
            final t3 t3Var = new t3(j2Var.getContext());
            a10.setLayoutParams(new LinearLayout.LayoutParams(0, ce.a0.i(54.0f), 1.0f));
            a10.setClickable(false);
            t3Var.setLayoutParams(new LinearLayout.LayoutParams(ce.a0.i(ce.a0.i(6.0f) + 72), ce.a0.i(54.0f)));
            linearLayout.addView(a10);
            linearLayout.addView(t3Var);
            p0.T(linearLayout);
            yd.d.g(linearLayout);
            ((v1) j2Var.getChildAt(1)).addView(linearLayout, 2);
            this.f24495b.v4().o(new TdApi.GetMessageViewers(s4Var.I2(), s4Var.K3()), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    rh.this.on(a10, s4Var, t3Var, linearLayout, j2Var, object);
                }
            });
        }
    }

    public final void Jp(TdApi.FormattedText formattedText, boolean z10, boolean z11, final boolean z12, final boolean z13, boolean z14, TdApi.MessageSchedulingState messageSchedulingState) {
        long j10;
        TdApi.InputMessageContent inputMessageContent;
        int i10;
        int i11;
        int i12;
        vc.h0 h0Var;
        if ((ob.e.c1(formattedText) && (!z10 || (h0Var = this.f9346z0) == null || h0Var.getText().length() <= 0)) || !Ek()) {
            return;
        }
        if (!this.U2 || !z10) {
            long C9 = C9();
            long qk = qk();
            if (z12) {
                j10 = z10 ? ck() : ko();
            } else {
                j10 = 0;
            }
            final long j11 = j10;
            boolean z15 = z14 || lo();
            if (!z11 || !this.f24495b.vc(formattedText)) {
                inputMessageContent = new TdApi.InputMessageText(formattedText, !z13, z10);
            } else {
                if (t2.F.f13581a.equals(formattedText.text)) {
                    i12 = R.string.ChatDisabledDart;
                    i11 = R.string.ChatRestrictedDart;
                    i10 = R.string.ChatRestrictedDartUntil;
                } else if (t2.G.f13581a.equals(formattedText.text)) {
                    i12 = R.string.ChatDisabledDice;
                    i11 = R.string.ChatRestrictedDice;
                    i10 = R.string.ChatRestrictedDiceUntil;
                } else {
                    i12 = R.string.ChatDisabledStickers;
                    i11 = R.string.ChatRestrictedStickers;
                    i10 = R.string.ChatRestrictedStickersUntil;
                }
                if (!dr(this.G0, R.id.right_sendStickersAndGifs, i12, i11, i10)) {
                    inputMessageContent = new TdApi.InputMessageDice(formattedText.text.trim(), z10);
                } else {
                    return;
                }
            }
            List<TdApi.SendMessage> h52 = t2.h5(C9, qk, j11, new TdApi.MessageSendOptions(z15, false, false, messageSchedulingState), inputMessageContent, this.f24495b.U9());
            if (z10) {
                int size = h52.size();
                ArrayList arrayList = new ArrayList(size);
                Zp(true);
                this.f9338x0.b3(arrayList);
                this.f24495b.v4().o(h52.get(0), new q(arrayList, size, h52, messageSchedulingState, new kb.i() {
                    @Override
                    public final void a(boolean z16) {
                        rh.this.Ln(z12, j11, z13, z16);
                    }
                }));
                return;
            }
            for (TdApi.SendMessage sendMessage : h52) {
                this.f24495b.v4().o(sendMessage, this.f24495b.Z9());
            }
        }
    }

    public void Jq() {
        TdApi.Message message;
        if (!ob.a.g(C9()) || (message = this.f9310q0.lastMessage) == null || message.content.getConstructor() != 104813723) {
            Gq(R.string.DeleteChat, 1);
        } else {
            Iq(gd.w.i1(R.string.OpenSupergroup).toUpperCase(), 4);
        }
    }

    public void Jr(TdApi.MessageSender messageSender, boolean z10) {
        q9 q9Var = new q9(t(), this.f24495b);
        q9Var.Ad(new q9.b(this.f9314r0, C9(), null, messageSender, z10));
        ac(q9Var);
    }

    @Override
    public void K2(final TdApi.BasicGroup basicGroup, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Vl(basicGroup, z10);
            }
        });
    }

    public final boolean Ki() {
        d0 d0Var;
        j10 j10Var;
        return (this.f9265c1 == 0 || (d0Var = this.Y0) == null || (j10Var = (j10) d0Var.O.e(this.f9265c1)) == null || j10Var.S0() != 1) ? false : true;
    }

    public final void Kj() {
        this.G0.setVisibility(0);
    }

    public final void Kk() {
        this.E0.setVisibility(4);
        this.E0.setOnClickListener(null);
    }

    public final void Ko(boolean z10) {
        y1 y1Var = new y1(this);
        y1Var.t2(1, this);
        y1Var.v3();
    }

    public void Kp(boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            Jp(h0Var.d(z10), true, z10, true, jo(false), z11, messageSchedulingState);
        }
    }

    public void Kq() {
        Gq(R.string.JoinChat, 3);
    }

    public void Kr(boolean z10) {
        rh rhVar = new rh(this.f24493a, this.f24495b);
        boolean S9 = S9();
        rhVar.Lp(new c0(this.f9314r0, this.f9310q0, this.f9295m1, null, 0, null).e(true).d(S9));
        if (z10) {
            rhVar.t9();
        }
        if (S9) {
            hd();
            this.f9277g1 = true;
        }
        ac(rhVar);
    }

    @Override
    public void L1(boolean z10, eb.k kVar) {
        this.D1 = kVar;
    }

    @Override
    public void L5() {
        TdApi.ChatPhotoInfo chatPhotoInfo;
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && (chatPhotoInfo = chat.photo) != null && !t2.S2(chatPhotoInfo.small)) {
            od.j1.hk(this, this.f9310q0, this.f9318s0);
        }
    }

    @Override
    public void La() {
        super.La();
        ce.x.c(this.f9346z0);
    }

    public boolean Li() {
        return this.f9346z0 != null && this.f9330v0.getVisibility() == 0 && this.f9346z0.getVisibility() == 0;
    }

    public final void Lj(TdApi.Message message) {
        if (this.f9290k2 == null && (this.f9306p0 & 1) == 0) {
            dp();
            if (Oa()) {
                p5(-1);
            } else if (Na()) {
                W8(null);
            }
            this.f9290k2 = message;
            TdApi.FormattedText y12 = ob.e.y1(message.content);
            Tp(true, y12.text);
            this.G0.setIsActive(!ib.i.i(y12.text) || bl());
            this.V1.C1(message, gd.w.i1(R.string.EditMessage));
            if (!gr() && this.U1 == null) {
                Ho();
            }
            if (this.f9346z0 != null) {
                TdApi.FormattedText O5 = this.f24495b.O5(message.chatId, message.f19946id);
                if (O5 != null) {
                    y12 = O5;
                }
                this.f9346z0.v0(he.i.c2().k1(4L) ? t2.H5(y12) : t2.q5(y12), true);
            }
            ce.x.f(this.f9346z0);
        }
    }

    public void Lk(boolean z10) {
        if (z10 && this.f9300n2) {
            this.f9304o2 = false;
        }
        oj(true, false);
    }

    public void Lo(final boolean z10, TdApi.MessageSchedulingState messageSchedulingState, final hj.o oVar) {
        if (messageSchedulingState != null || !ui()) {
            oVar.a(z10, messageSchedulingState, false);
        } else {
            c().hd().L8(this, C9(), false, new hj.o() {
                @Override
                public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState2, boolean z12) {
                    rh.this.pn(oVar, z10, z11, messageSchedulingState2, z12);
                }
            }, null);
        }
    }

    public void Lp(c0 c0Var) {
        super.Ad(c0Var);
        this.f9310q0 = c0Var.f9357b;
        this.f9295m1 = c0Var.f9368m;
        this.f9314r0 = c0Var.f9358c;
        this.f9315r1 = 0L;
        this.f9299n1 = c0Var.f9366k;
        this.f9303o1 = c0Var.f9369n;
        this.f9307p1 = c0Var.f9370o;
        this.f9286j1 = c0Var.f9363h;
        this.f9289k1 = c0Var.f9364i;
        this.f9292l1 = c0Var.f9365j;
        this.f9338x0.T2(c0Var.f9359d, c0Var.f9360e);
        this.f9280h1 = c0Var.f9361f;
        this.f9283i1 = c0Var.f9362g;
        this.f9311q1 = c0Var.f9367l;
        if (this.f9326u0 != null) {
            Ir();
        }
    }

    public void Lq() {
        this.f24495b.i4(this.f9310q0);
        if (this.f24495b.i7(this.f9310q0.f19908id) || !this.f24495b.M6(this.f9310q0)) {
            Gq(R.string.Unblock, 5);
        } else {
            Gq(R.string.RestartBot, 2);
        }
    }

    public vc.m4 Lr() {
        return this.V0;
    }

    @Override
    public void M1(TdApi.User user) {
    }

    public final void Mi() {
        ie.k kVar = this.f9327u1;
        if (kVar != null) {
            kVar.a();
            this.f9327u1 = null;
        }
    }

    public final void Mj() {
        if (this.f9300n2) {
            ScrollView scrollView = this.f9316r2;
            if (scrollView != null) {
                scrollView.setVisibility(8);
            }
            this.f9300n2 = false;
            ur(R.drawable.deproko_baseline_bots_keyboard_26);
        }
    }

    public final void Mk() {
        this.G0.setVisibility(4);
    }

    public final void Mo(final s4 s4Var, final boolean z10) {
        int i10;
        ra raVar;
        final long j10 = s4Var.X3().chatId;
        if (j10 != 0) {
            if (!z10) {
                s4Var.t6(new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        rh.this.qn(z10, (TdApi.Message) obj);
                    }
                }, false);
            } else if (this.f24495b.k7(C9())) {
                this.f24495b.v4().o(new TdApi.PinChatMessage(j10, s4Var.D4(), false, false), this.f24495b.na());
            } else {
                switch (ob.a.d(j10)) {
                    case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                        boolean O6 = this.f24495b.O6(C9());
                        int i11 = O6 ? R.string.PinMessageInThisChannel : R.string.PinMessageInThisGroup;
                        int i12 = O6 ? R.string.PinNotify2 : R.string.PinNotify;
                        i10 = i11;
                        raVar = new ra(12, (int) R.id.btn_notifyMembers, 0, i12, true);
                        break;
                    case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    case TdApi.ChatTypePrivate.CONSTRUCTOR:
                        i10 = R.string.PinMessageInChat;
                        raVar = new ra(12, (int) R.id.btn_notifyMembers, 0, gd.w.m1(R.string.PinMessageOther, this.f24495b.V3(j10, false, true)), true);
                        break;
                    default:
                        throw new RuntimeException();
                }
                me(new f2(R.id.btn_messagePin).a(new ra(28, 0, 0, i10)).j(new v4.r() {
                    @Override
                    public final void l6(int i13, SparseIntArray sparseIntArray) {
                        rh.this.rn(j10, s4Var, i13, sparseIntArray);
                    }
                }).p(new ra[]{raVar}).r(R.string.Pin));
            }
        }
    }

    public void Mp(int i10) {
        if (i10 == 1160523958) {
            i10 = 0;
        }
        int i11 = this.Y2;
        boolean z10 = i11 != 0;
        boolean z11 = i10 != 0;
        if (z10 != z11) {
            if (z11) {
                Op(i10, true, true);
            } else {
                Op(i11, false, false);
            }
            this.Y2 = i10;
            Ri();
        } else if (i11 != i10) {
            SparseIntArray sparseIntArray = this.Z2;
            if (sparseIntArray != null) {
                sparseIntArray.delete(i11);
            }
            Op(i10, true, true);
            this.Y2 = i10;
        }
    }

    public final void Mq(int i10, long j10, boolean z10) {
        this.G1 = i10;
        boolean z11 = z10 && this.I1.g() > 0.0f;
        if (i10 == 1) {
            this.F1.Y0(R.id.btn_follow, gd.w.i1(R.string.Follow), R.drawable.baseline_group_add_24, z11);
            this.F1.L();
        } else if (i10 == 2) {
            boolean x32 = this.f24495b.x3(C9());
            this.F1.Y0(R.id.btn_mute, gd.w.i1(x32 ? R.string.Mute : R.string.Unmute), x32 ? R.drawable.baseline_notifications_off_24 : R.drawable.baseline_notifications_active_24, z11);
            this.F1.L();
        } else if (i10 == 3) {
            this.F1.Y0(R.id.btn_unpinAll, gd.w.i1(zi(false) ? R.string.UnpinAll : R.string.DismissAllPinned), R.drawable.deproko_baseline_pin_undo_24, z10);
            this.F1.L();
        } else if (i10 == 4) {
            this.F1.Y0(R.id.btn_openLinkedChat, gd.w.i1(R.string.Discuss), R.drawable.baseline_chat_bubble_24, z11);
            this.F1.w0(null, j10, null);
        } else if (i10 == 5) {
            this.F1.Y0(R.id.btn_applyWallpaper, gd.w.i1(R.string.ChatBackgroundApply), R.drawable.baseline_warning_24, z11);
            this.F1.L();
        } else if (i10 == 100) {
            this.F1.Y0(R.id.btn_test, "test", R.drawable.baseline_warning_24, z11);
            this.F1.L();
        }
        this.I1.p(true, z10);
        Ti();
    }

    @Override
    public void N0(final long j10, int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.cm(j10);
            }
        });
    }

    @Override
    public void N1(long j10, boolean z10) {
        zd.g0.j(this, j10, z10);
    }

    @Override
    public void N6(w6 w6Var, int i10) {
        r0.f(this, w6Var, i10);
    }

    public final void Ni() {
        this.f9317r3 = null;
    }

    public final void Nj() {
        if (this.N2) {
            z0 z0Var = this.C0;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            Qp(false, false);
            this.E0.setImageResource(z0.V1(true));
        }
    }

    public void Nk() {
        rq(false);
    }

    public void No(int i10) {
        d4 d4Var = this.f9276f3;
        if (d4Var == null) {
            d4 d4Var2 = new d4(t());
            this.f9276f3 = d4Var2;
            d4Var2.D1(this);
            this.f9276f3.setCallback(this);
            this.f9326u0.addView(this.f9276f3);
        } else {
            d4Var.I1();
            this.f9276f3.H1();
            this.f9276f3.setVisibility(0);
            this.f9276f3.setAlpha(1.0f);
        }
        La();
        nj(false);
        qj();
        this.f9276f3.setDuration(i10);
        this.f9270d3 = false;
        this.f9267c3 = true;
        ej(false);
    }

    public final boolean Np(boolean z10) {
        return false;
    }

    public final void Nq(int i10) {
        Oq(gd.w.i1(i10), false);
    }

    @Override
    public boolean O3(d6 d6Var, long j10, long j11, TdApi.InputMessagePoll inputMessagePoll, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, kb.j<TdApi.Message> jVar) {
        if (C9() != j10 || qk() != j11) {
            return false;
        }
        np(inputMessagePoll, true, z10, messageSchedulingState, jVar);
        return true;
    }

    public final void Oi() {
        kb.b bVar = this.D2;
        if (bVar != null) {
            bVar.c();
            md(this.D2);
            this.D2 = null;
        }
    }

    public final void Oj(final long j10) {
        final long j11 = this.f9310q0.f19908id;
        s4 d02 = this.f9338x0.E0().d0(j10);
        if (d02 != null) {
            Qj(d02.X3());
        } else {
            this.f24495b.v4().o(new TdApi.GetMessage(j11, j10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    rh.this.yl(j11, j10, object);
                }
            });
        }
    }

    public void Ok(ob.d dVar) {
        if (Uk()) {
            this.f24495b.hd().r7(this, C9(), dVar, null);
            return;
        }
        this.f9338x0.Z0(dVar, 1, null, this.f9265c1 == 0);
        ar();
    }

    public final void Oo() {
        TdApi.Message message;
        int i10 = this.M1;
        if (i10 == 1) {
            La();
            this.f24495b.hd().t8(this, C9());
        } else if (i10 == 2) {
            final long C9 = C9();
            final Runnable ifVar = new Runnable() {
                @Override
                public final void run() {
                    rh.this.sn(C9);
                }
            };
            if (this.f24495b.h3(this.f9310q0.f19908id)) {
                o6 o6Var = this.f24495b;
                o6Var.d2(o6Var.Ab(this.f9310q0.f19908id), false, new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        rh.this.tn(ifVar, object);
                    }
                });
                return;
            }
            ifVar.run();
        } else if (i10 == 3) {
            this.f24495b.v4().o(new TdApi.AddChatMember(this.f9310q0.f19908id, this.f24495b.fa(), 0), this.f24495b.na());
        } else if (i10 == 4) {
            TdApi.Chat chat = this.f9310q0;
            if (chat != null && (message = chat.lastMessage) != null && message.content.getConstructor() == 104813723) {
                this.f24495b.hd().B7(this, ((TdApi.MessageChatUpgradeTo) this.f9310q0.lastMessage.content).supergroupId, null);
            }
        } else if (i10 == 5) {
            o6 o6Var2 = this.f24495b;
            o6Var2.d2(o6Var2.Ab(this.f9310q0.f19908id), false, this.f24495b.na());
        } else if (i10 == 7) {
            Co();
        }
    }

    public void Op(int i10, boolean z10, boolean z11) {
        TdApi.Message message;
        if (this.f9310q0 != null) {
            if (this.Z2 == null) {
                this.Z2 = new SparseIntArray(5);
            }
            Client.g ncVar = new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    rh.this.Mn(object);
                }
            };
            long qk = qk();
            if (qk == 0 && (message = this.U1) != null) {
                qk = message.messageThreadId;
                if (qk == 0) {
                    qk = message.f19946id;
                }
            }
            long j10 = qk;
            if (z10) {
                int uptimeMillis = (int) (SystemClock.uptimeMillis() / 1000);
                if (uptimeMillis - this.Z2.get(i10) >= 4 || z11) {
                    this.Z2.put(i10, uptimeMillis);
                    this.f24495b.v4().o(new TdApi.SendChatAction(this.f9310q0.f19908id, j10, ob.e.g(i10)), ncVar);
                }
            } else if (this.Z2.get(i10, 0) != 0) {
                this.Z2.delete(i10);
                this.f24495b.v4().o(new TdApi.SendChatAction(this.f9310q0.f19908id, j10, new TdApi.ChatActionCancel()), ncVar);
            }
        }
    }

    public final void Oq(CharSequence charSequence, boolean z10) {
        if (Ra()) {
            x2.l lVar = this.f9331v1;
            int i10 = R.drawable.baseline_warning_24;
            if (lVar == null) {
                x2.h u10 = t().I3().g(this.G0).u(new x2.f() {
                    @Override
                    public final void d1(View view, Rect rect) {
                        rh.this.Sn(view, rect);
                    }
                });
                if (!z10) {
                    i10 = 0;
                }
                this.f9331v1 = u10.q(i10).r(true).i(this).D(this.f24495b, charSequence);
            } else {
                x2.i k10 = t().I3().k(this.f24495b, charSequence, 0);
                if (!z10) {
                    i10 = 0;
                }
                lVar.V(k10, i10);
                this.f9331v1.Y();
            }
            this.f9331v1.H(false);
        }
    }

    @Override
    public boolean P() {
        return ie.g0.a(this);
    }

    @Override
    public void P0(final int i10) {
        if (!this.f24495b.hd().L7(this, null, C9(), i10, null)) {
            switch (i10) {
                case R.id.btn_botHelp:
                case R.id.btn_botSettings:
                    TdApi.Chat chat = this.f9310q0;
                    if (chat != null) {
                        if (this.f24495b.h3(chat.f19908id)) {
                            o6 o6Var = this.f24495b;
                            o6Var.d2(o6Var.Ab(this.f9310q0.f19908id), false, this.f24495b.na());
                        }
                        if (this.M1 == 2) {
                            Fk();
                        }
                        Ip(i10 == R.id.btn_botHelp ? "/help" : "/settings", false, false, false, false, null);
                        return;
                    }
                    return;
                case R.id.btn_chatFontSizeReset:
                    he.i.c2().S3();
                    yr(this.X0);
                    this.f9338x0.u2();
                    return;
                case R.id.btn_chatFontSizeScale:
                    he.i.c2().e6();
                    this.f9338x0.u2();
                    return;
                case R.id.btn_copyLink:
                case R.id.btn_share:
                    this.f24495b.v4().o(new TdApi.GetBackgroundUrl(x9().f9372q.name, ae.h.d0(x9().f9372q.type, this.N0.h())), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            rh.this.Lm(i10, object);
                        }
                    });
                    return;
                case R.id.btn_debugShowHideBottomBar:
                    if (this.G1 == 0) {
                        Mq(100, 0L, true);
                        return;
                    } else {
                        Ik(true);
                        return;
                    }
                case R.id.btn_mute:
                    if (this.f9310q0 != null) {
                        this.f24495b.hd().X8(this, this.f9310q0.f19908id, false, null);
                        return;
                    }
                    return;
                case R.id.btn_openLinkedChat:
                    Eo();
                    return;
                case R.id.btn_reportChat:
                    Xo(null, null);
                    return;
                case R.id.btn_search:
                    if (this.f9338x0.m1()) {
                        Yc();
                        return;
                    }
                    return;
                case R.id.btn_sendScreenshotNotification:
                    ce.j0.z0("Sent screenshot notification", 0);
                    this.f24495b.xa((int) (System.currentTimeMillis() / 1000));
                    return;
                case R.id.btn_shareMyContact:
                    TdApi.User da2 = this.f24495b.da();
                    if (da2 != null) {
                        ee(t2.r2(da2) + ", " + ce.c0.w(da2.phoneNumber), new int[]{R.id.btn_shareMyContact, R.id.btn_cancel}, new String[]{gd.w.i1(R.string.ShareMyContactInfo), gd.w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_contact_phone_24, R.drawable.baseline_cancel_24}, new h0() {
                            @Override
                            public boolean P() {
                                return ie.g0.a(this);
                            }

                            @Override
                            public Object a2(int i11) {
                                return ie.g0.b(this, i11);
                            }

                            @Override
                            public final boolean r3(View view, int i11) {
                                boolean Mm;
                                Mm = rh.this.Mm(view, i11);
                                return Mm;
                            }
                        });
                        return;
                    }
                    return;
                case R.id.btn_showPinnedMessage:
                    this.f9338x0.C2();
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public boolean P4(View view, dd.l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        if ((this.P2 != 0 && SystemClock.uptimeMillis() - this.P2 < 200) || !Hp(view, lVar.j(), lVar.c(), true, z10, messageSchedulingState)) {
            return false;
        }
        this.P2 = SystemClock.uptimeMillis();
        return true;
    }

    public boolean Pi(long j10, long j11, boolean z10, boolean z11) {
        if (C9() != j10 || j10 == 0) {
            return false;
        }
        return this.f9338x0.f0(j10, j11, z10, z11);
    }

    public final void Pj() {
        Oi();
        this.W1.O1(this.f9260a2, false, false);
    }

    public void Pk(ob.d dVar, ob.d dVar2) {
        Rk(dVar, this.f9338x0.x0(dVar2));
    }

    public void Po(l6 l6Var) {
        if (this.f9273e3) {
            kd.j1.y().r(l6Var);
            this.f9273e3 = false;
        } else if (this.f9267c3) {
            this.f9270d3 = true;
            this.f9276f3.W1(l6Var);
        } else {
            Ep(l6Var, true, false, null);
        }
    }

    public void Pp() {
        this.f9302o0 = true;
    }

    public void Pq(CharSequence charSequence) {
        this.Z1.y(charSequence, null, this.W1.G1(this.f9260a2));
        Oi();
        this.D2 = new o();
        this.W1.O1(this.f9260a2, true, true);
        vd(this.D2, 3000L);
    }

    @Override
    public boolean Qd() {
        return false;
    }

    public final void Qi() {
        TdApi.SecretChat b42;
        if (bo()) {
            ArrayList arrayList = new ArrayList();
            final long C9 = C9();
            final TdApi.Chat W2 = this.f24495b.W2(C9);
            TdApi.ChatActionBar chatActionBar = W2 != null ? W2.actionBar : null;
            if (chatActionBar != null) {
                switch (chatActionBar.getConstructor()) {
                    case TdApi.ChatActionBarReportSpam.CONSTRUCTOR:
                        arrayList.add(ho(C9, false));
                        if (((TdApi.ChatActionBarReportSpam) chatActionBar).canUnarchive) {
                            arrayList.add(io(C9));
                            break;
                        }
                        break;
                    case TdApi.ChatActionBarReportAddBlock.CONSTRUCTOR:
                        arrayList.add(ho(C9, true));
                        arrayList.add(go(C9));
                        if (((TdApi.ChatActionBarReportAddBlock) chatActionBar).canUnarchive) {
                            arrayList.add(io(C9));
                            break;
                        }
                        break;
                    case TdApi.ChatActionBarAddContact.CONSTRUCTOR:
                        arrayList.add(go(C9));
                        break;
                    case TdApi.ChatActionBarSharePhoneNumber.CONSTRUCTOR:
                        arrayList.add(new y3.c(R.id.btn_shareMyContact, R.string.SharePhoneNumber, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rh.this.sl(C9, view);
                            }
                        }));
                        break;
                    case TdApi.ChatActionBarReportUnrelatedLocation.CONSTRUCTOR:
                        arrayList.add(new y3.c(R.id.btn_reportLocation, R.string.ReportLocation, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rh.this.pl(C9, view);
                            }
                        }));
                        break;
                    case TdApi.ChatActionBarInviteMembers.CONSTRUCTOR:
                        arrayList.add(new y3.c(R.id.btn_invite, R.string.AddMember, new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                rh.this.ql(W2, view);
                            }
                        }));
                        break;
                }
            }
            if (ob.a.j(C9) && (b42 = this.f24495b.b4(C9)) != null && b42.state.getConstructor() == -1945106707) {
                arrayList.add(new y3.c(R.id.btn_delete, R.string.DeleteAndLeave, new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        rh.this.tl(view);
                    }
                }).b().a());
            }
            if (!arrayList.isEmpty()) {
                this.X1.setItems((y3.c[]) arrayList.toArray(new y3.c[0]));
            }
            this.W1.O1(this.Y1, !arrayList.isEmpty(), Ta());
        }
    }

    public void Qj(TdApi.Message message) {
        if (message == null || this.f9310q0 == null || this.f9280h1 || Ua()) {
            hj();
            return;
        }
        if (!gr()) {
            this.V1.C1(message, this.f24495b.O6(this.f9310q0.f19908id) ? this.f9310q0.title : null);
        }
        if (this.U1 != null || gr()) {
            this.U1 = message;
            return;
        }
        this.U1 = message;
        dq(1.0f);
    }

    public void Qk(ob.d dVar, hj.q qVar) {
        ob.d dVar2;
        if (qVar == null || (dVar2 = qVar.f27704d) == null || dVar2.c() != dVar.c()) {
            Ok(dVar);
        } else {
            Pk(dVar, qVar.f27704d);
        }
    }

    public final void Qo(hd.p pVar) {
        this.C2 = pVar;
        this.f24495b.tb(pVar.b0(), C9(), pVar.c());
    }

    public final void Qp(boolean z10, boolean z11) {
        if (this.N2 != z10) {
            this.N2 = z10;
            if (z10) {
                La();
            }
        }
    }

    public final void Qq() {
        this.V1.C1(this.f9290k2, gd.w.i1(R.string.EditMessage));
    }

    @Override
    public void R3(final long j10, final TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.em(j10, chatPhotoInfo);
            }
        });
    }

    @Override
    public int R9() {
        if (!this.f9280h1) {
            return R.id.controller_messages;
        }
        int i10 = this.f9283i1;
        if (i10 == 1) {
            return R.id.controller_wallpaper;
        }
        if (i10 == 2) {
            return R.id.controller_fontSize;
        }
        if (i10 == 3) {
            return R.id.controller_eventLog;
        }
        if (i10 == 4) {
            return R.id.controller_searchPreview;
        }
        if (i10 != 5) {
            return 0;
        }
        return R.id.controller_wallpaper_preview;
    }

    @Override
    public final boolean Rd() {
        return this.f9310q0 != null && (gl() || this.f9310q0.hasProtectedContent || this.f9338x0.Y0());
    }

    public final void Ri() {
        boolean z10 = this.Y2 != 0 && this.f24493a.L0() == 0 && !Sa();
        if (this.W2 != z10) {
            if (z10) {
                this.X2 = new r();
                this.f24495b.hd().postDelayed(this.X2, 4500L);
            } else {
                this.X2.c();
                this.X2 = null;
            }
            this.W2 = z10;
        }
    }

    public void Rj(TdApi.Message message) {
        if (Ek()) {
            o6 o6Var = this.f24495b;
            o6Var.t5(this.f9310q0.f19908id, message.chatId, message.f19946id, o6Var.j3(C9()), false);
        }
    }

    public void Rk(ob.d dVar, long[] jArr) {
        if (Uk()) {
            this.f24495b.hd().r7(this, C9(), dVar, null);
            return;
        }
        this.f9338x0.Z0(dVar, 1, jArr, this.f9265c1 == 0);
        ar();
    }

    public final void Ro(long j10, s4 s4Var) {
        synchronized (this) {
            if (this.C1 == null) {
                this.C1 = new k0.e<>();
            }
            this.C1.k(j10, s4Var);
        }
    }

    public final void Rp(boolean z10) {
        if (this.f9275f2 != z10) {
            this.f9275f2 = z10;
            if (z10) {
                int layerType = this.f9334w0.getLayerType();
                this.f9278g2 = layerType;
                if (layerType != 2) {
                    p0.Y(this.f9334w0, 2);
                }
                int layerType2 = this.V1.getLayerType();
                this.f9281h2 = layerType2;
                if (layerType2 != 2) {
                    p0.Y(this.V1, 2);
                }
                int layerType3 = this.A0.getLayerType();
                this.f9284i2 = layerType3;
                if (layerType3 != 2) {
                    p0.Y(this.A0, 2);
                    return;
                }
                return;
            }
            int i10 = this.f9278g2;
            if (i10 != 2) {
                p0.Y(this.f9334w0, i10);
            }
            int i11 = this.f9281h2;
            if (i11 != 2) {
                p0.Y(this.V1, i11);
            }
            int i12 = this.f9284i2;
            if (i12 != 2) {
                p0.Y(this.A0, i12);
            }
        }
    }

    public final void Rq() {
        this.V1.D1(this.K2, this.L2);
    }

    @Override
    public void S(w6 w6Var, int i10) {
        r0.d(this, w6Var, i10);
    }

    @Override
    public boolean S8(q1 q1Var, float f10, float f11) {
        if (t().Z0().c0() || this.f9262b1 > 0.0f || Dk()) {
            return false;
        }
        if (C9() == 0 || this.f9280h1) {
            return this.f9283i1 == 0 || f11 <= ((float) ((this.f9326u0.getMeasuredHeight() - this.f9330v0.getMeasuredHeight()) + d1.a3(true)));
        }
        int i10 = p0.r(q1Var.get())[1];
        if (this.H2) {
            int i11 = p0.r(this.E2)[1] - i10;
            if (f11 >= i11 && f11 < i11 + this.E2.getMeasuredHeight()) {
                if (((LinearLayoutManager) this.F2.getLayoutManager()).X1() != 0) {
                    return false;
                }
                View C = this.F2.getLayoutManager().C(0);
                return C == null || C.getLeft() >= 0;
            }
        }
        int Bk = Bk();
        z0 z0Var = this.C0;
        if (z0Var != null && z0Var.getVisibility() == 0 && f11 >= p0.r(this.C0)[1] - i10) {
            return this.C0.O1() && f10 <= ((float) Bk);
        }
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null && h0Var.getVisibility() == 0) {
            int i12 = p0.r(this.f9346z0)[1] - i10;
            if (f11 >= i12 && f11 < i12 + this.f9346z0.getMeasuredHeight()) {
                return f10 < ((float) this.E0.getMeasuredWidth()) || this.f9346z0.d0();
            }
        }
        if (fo() && f11 < d1.a3(true)) {
            return false;
        }
        if (!he.i.c2().C2()) {
            return true;
        }
        if (!gd.w.G2()) {
            return f10 <= ((float) Bk);
        }
        int measuredWidth = this.f9326u0.getMeasuredWidth();
        return measuredWidth != 0 && f10 >= ((float) (measuredWidth - Bk));
    }

    public void Si(boolean z10) {
        String Z1 = gd.w.Z1(gd.w.i1(z10 ? R.string.EventLogSelectedEvents : R.string.EventLogAllEvents));
        this.f9318s0.setForcedSubtitle(Z1);
        this.f9318s0.setSubtitle(Z1);
    }

    public long Sj() {
        if (!Ta() || Xa() || !this.f9338x0.i1()) {
            return 0L;
        }
        return C9();
    }

    public void Sk(String str, TdApi.WebPage webPage) {
        this.M2 = str;
        this.K2 = str;
        this.L2 = webPage;
    }

    public final void So() {
        Li();
    }

    public final void Sp(boolean z10) {
        if (this.f9343y1 != z10) {
            this.f9343y1 = z10;
            this.f9338x0.X2(z10);
            if (z10) {
                gq(false, Ta());
            }
        }
    }

    public final void Sq() {
        this.V1.C1(this.U1, this.f24495b.O6(this.f9310q0.f19908id) ? this.f9310q0.title : null);
    }

    @Override
    public void T5(final long j10, long j11, int i10, boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.fm(j10);
            }
        });
    }

    @Override
    public void T6(z0 z0Var, boolean z10) {
        Wp(0L, "@" + this.f24495b.y5());
    }

    public final void Ti() {
        boolean h10 = this.I1.h();
        if (this.H1 != h10) {
            this.H1 = h10;
            this.f9338x0.t2();
        }
    }

    public int Tj() {
        return (int) vk();
    }

    public boolean Tk() {
        return this.f9280h1;
    }

    public void To() {
        this.f9338x0.P1();
    }

    public final void Tp(boolean z10, String str) {
        this.G0.setInEditMode(z10);
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            h0Var.x0(z10, str);
        }
    }

    public final boolean Tq(View view) {
        return dr(view, R.id.right_sendStickersAndGifs, R.string.ChatDisabledStickers, R.string.ChatRestrictedStickers, R.string.ChatRestrictedStickersUntil);
    }

    @Override
    public void U3(int i10) {
        int i11 = this.f9271e1;
        if (i11 != i10) {
            boolean z10 = true;
            boolean z11 = i11 != 0;
            boolean z12 = i10 != 0;
            this.f9271e1 = i10;
            if (z11 != z12 && z12) {
                if (this.f9262b1 % 1.0f != 0.0f) {
                    z10 = false;
                }
                this.f9274f1 = z10;
                if (!z10) {
                    La();
                }
            }
        }
    }

    @Override
    public int[] U5(vc.q qVar, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
        return vc.q.e(qVar, view, view2, i10, i11, i12, i13, i14, this.f9326u0, this.f9330v0, this.C0);
    }

    public LinearLayout Uj() {
        return this.f9330v0;
    }

    public boolean Uk() {
        return this.f9280h1 && this.f9283i1 == 4;
    }

    public void Uo(long j10) {
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            h0Var.getInlineSearchContext().t0(j10);
        }
    }

    public final void Up(int i10, boolean z10) {
        vc.h0 h0Var;
        if (Vp(ib.c.h(this.f9293l2, i10, z10)) && i10 == 2 && (h0Var = this.f9346z0) != null) {
            h0Var.setEnabled(!z10);
        }
    }

    public void Uq(boolean z10, hd.y0 y0Var) {
        if (!ti()) {
            if (z10) {
                this.f9263b2.setMessageList(y0Var);
            }
            this.W1.O1(this.f9266c2, z10, Ta());
        } else if (!z10) {
            Zb();
        }
    }

    @Override
    public void V1(w6 w6Var, TdApi.User user, int i10, w6 w6Var2) {
        if (this.f24495b.A6() != w6Var.f28608b) {
            ij();
        }
    }

    @Override
    public void V3(final long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Sl(j10);
            }
        });
    }

    public final void Vi() {
        t().d3(this, !Ta() || this.f9262b1 >= 1.0f);
    }

    public final float Vj() {
        return vk() + wk();
    }

    public boolean Vk() {
        return this.G0.f();
    }

    public final boolean Vn() {
        String X;
        if (!this.G0.d()) {
            return false;
        }
        if (this.f9346z0.getInlineSearchContext().X() != null) {
            String str = "@" + ((Object) X) + " ";
            if (this.f9346z0.getText().toString().equals(str.toString())) {
                this.f9346z0.v0("", false);
            } else {
                this.f9346z0.v0(str, true);
            }
        }
        return true;
    }

    public void Vo(long[] jArr) {
        if (this.U1 != null) {
            for (long j10 : jArr) {
                if (j10 == this.U1.f19946id) {
                    if (gr() || cl()) {
                        this.U1 = null;
                        return;
                    } else {
                        uj(true);
                        return;
                    }
                }
            }
        }
    }

    public final boolean Vp(int i10) {
        vc.h0 h0Var;
        int i11 = this.f9293l2;
        boolean z10 = false;
        if (i11 == i10) {
            return false;
        }
        boolean z11 = i11 != 0;
        this.f9293l2 = i10;
        if (i10 != 0) {
            z10 = true;
        }
        if (!(z11 == z10 || (h0Var = this.f9346z0) == null)) {
            h0Var.setInputBlocked(z10);
        }
        return true;
    }

    public void Vq() {
        if (Ta()) {
            ce.x.f(this.f9346z0);
        }
    }

    @Override
    public void W4(m1.f fVar) {
        fVar.M(true);
        fVar.G(C9(), qk());
        fVar.E(true);
    }

    @Override
    public int W9() {
        if (this.f9299n1) {
            return 0;
        }
        int i10 = this.f9283i1;
        if (i10 == 1) {
            return R.id.menu_gallery;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return R.id.menu_search;
            }
            if (i10 == 4) {
                return 0;
            }
            if (i10 != 5) {
                if (C9() != 0) {
                    return (hl() || qk() != 0) ? R.id.menu_search : gl() ? R.id.menu_secretChat : R.id.menu_more;
                }
                return 0;
            }
        }
        return R.id.menu_more;
    }

    public final void Wi(TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        if (bo()) {
            if (chatJoinRequestsInfo == null || chatJoinRequestsInfo.totalCount == 0 || (this.f9310q0 != null && this.f24495b.tc().R(this.f9310q0.f19908id, chatJoinRequestsInfo))) {
                this.W1.O1(this.f9272e2, false, Ta());
                return;
            }
            if (chatJoinRequestsInfo.totalCount > 0) {
                this.f24495b.tc().j0(this.f9310q0.f19908id, true);
            }
            this.f9269d2.Q0(chatJoinRequestsInfo, Ta());
            this.W1.O1(this.f9272e2, true, Ta());
        }
    }

    public TdApi.Chat Wj() {
        return this.f9310q0;
    }

    public boolean Wk() {
        int i10;
        return this.f9280h1 && ((i10 = this.f9283i1) == 1 || i10 == 5);
    }

    public final void Wn(kb.j<TdApi.ChatAdministrators> jVar) {
        TdApi.ChatAdministrators chatAdministrators = this.Q2;
        if (chatAdministrators != null) {
            jVar.a(chatAdministrators);
        } else if (this.R2 != null) {
            this.R2 = jVar;
        } else {
            this.R2 = jVar;
            this.f24495b.v4().o(new TdApi.GetChatAdministrators(this.f9310q0.f19908id), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    rh.this.Jl(object);
                }
            });
        }
    }

    public void Wo() {
        he.i.c2().Q3(this);
        t().Z0().J0(this);
    }

    public void Wp(long j10, String str) {
        if (Li()) {
            vc.h0 h0Var = this.f9346z0;
            h0Var.v0(str + " ", true);
            ce.x.f(this.f9346z0);
            return;
        }
        this.f24495b.hd().u7(this, j10, new hj.j().h());
    }

    public void Wq(long j10, TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard) {
        zo(j10, replyMarkupShowKeyboard, false, false);
    }

    @Override
    public void X(final long j10, TdApi.ChatActionBar chatActionBar) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Wl(j10);
            }
        });
    }

    @Override
    public CharSequence X9() {
        int i10 = this.f9283i1;
        if (i10 == 1) {
            return gd.w.i1(R.string.Wallpaper);
        }
        if (i10 == 2) {
            return gd.w.i1(R.string.TextSize);
        }
        if (i10 == 5) {
            return gd.w.i1(R.string.ChatBackgroundPreview);
        }
        return gd.w.i1(hl() ? R.string.SavedMessages : R.string.ChatPreview);
    }

    public final void Xi() {
        long p10 = ob.a.p(C9());
        long j10 = 0;
        TdApi.SupergroupFullInfo h22 = p10 != 0 ? this.f24495b.e2().h2(p10) : null;
        if (h22 != null) {
            j10 = h22.linkedChatId;
        }
        if (this.f9315r1 != j10) {
            this.f9315r1 = j10;
            rr(true);
        }
    }

    public long Xj() {
        return t2.n2(this.f9310q0);
    }

    public boolean Xk() {
        return this.f9280h1 && this.f9283i1 == 5;
    }

    public int Xn() {
        if (Ua()) {
            return ik();
        }
        int f10 = ce.a0.f() - d1.a3(true);
        return (Li() || this.L1) ? f10 - ce.a0.i(49.0f) : f10;
    }

    public final void Xo(TdApi.Message[] messageArr, Runnable runnable) {
        hj.T7(this, C9(), messageArr, runnable, null);
    }

    public void Xp(boolean z10, boolean z11) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.O0.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.P0.getLayoutParams();
        if (z10) {
            layoutParams.addRule(2, R.id.msg_bottom);
            layoutParams.addRule(12, 0);
            layoutParams2.addRule(2, R.id.msg_bottom);
            layoutParams2.addRule(12, 0);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(2, 0);
            layoutParams2.addRule(12);
            layoutParams2.addRule(2, 0);
        }
        if (z10) {
            this.f9330v0.setVisibility(0);
            this.A0.setVisibility(0);
            this.V1.setVisibility(0);
            this.E0.setVisibility(0);
            if (z11) {
                this.D0.setVisibility(4);
                this.G0.setVisibility(0);
                return;
            }
            this.D0.setVisibility(0);
            this.G0.setVisibility(4);
            return;
        }
        Fk();
        this.f9330v0.setVisibility(8);
        this.V1.setVisibility(8);
        this.A0.setVisibility(8);
        this.E0.setVisibility(8);
        this.D0.setVisibility(8);
        this.G0.setVisibility(8);
    }

    public void Xq(String str, TdApi.WebPage webPage) {
        if (!this.f9280h1 && !Ua()) {
            String str2 = this.K2;
            this.K2 = str;
            this.L2 = webPage;
            this.M2 = null;
            if (str != null) {
                this.V1.D1(str, webPage);
                if (str2 == null) {
                    Ho();
                }
            } else if (this.f9290k2 != null) {
                Qq();
            } else if (this.U1 != null) {
                Sq();
            } else {
                vj();
            }
        }
    }

    @Override
    public void Y(final long j10, final TdApi.Message message) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.jm(j10, message);
            }
        });
    }

    @Override
    public void Y3(final long j10, final TdApi.ChatNotificationSettings chatNotificationSettings) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Om(j10, chatNotificationSettings);
            }
        });
    }

    @Override
    public void Yb(HeaderEditText headerEditText) {
        headerEditText.setInputType(524289);
        int i10 = ce.a0.i(112.0f);
        if (gd.w.G2()) {
            headerEditText.setPadding(i10, headerEditText.getPaddingTop(), headerEditText.getPaddingRight(), headerEditText.getPaddingBottom());
        } else {
            headerEditText.setPadding(headerEditText.getPaddingLeft(), headerEditText.getPaddingTop(), i10, headerEditText.getPaddingBottom());
        }
    }

    public final void Yi() {
        boolean z10 = this.f9262b1 > 0.0f || this.f9265c1 != 0;
        if (this.f9268d1 != z10) {
            this.f9268d1 = z10;
            if (z10) {
                ce.x.c(this.f9346z0);
            }
            Up(2, z10);
        }
    }

    public boolean Yj() {
        return this.f9304o2;
    }

    public final void Yk() {
        if (this.f9279g3 == null) {
            View.OnClickListener odVar = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    rh.this.Cl(view);
                }
            };
            org.thunderdog.challegram.a t10 = t();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(6, R.id.msg_bottom);
            layoutParams.addRule(8, R.id.msg_bottom);
            s sVar = new s(t10);
            this.f9279g3 = sVar;
            sVar.setMinimumHeight(ce.a0.i(49.0f));
            this.f9279g3.setLayoutParams(layoutParams);
            q2 q2Var = new q2(t10);
            this.f9282h3 = q2Var;
            q2Var.setLayoutParams(FrameLayoutFix.q1(-1, -1));
            this.f9279g3.addView(this.f9282h3);
            t8(this.f9282h3);
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(ce.a0.i(52.0f), ce.a0.i(49.0f), 19);
            r12.leftMargin = ce.a0.i(52.0f);
            ImageView G = p0.G(t10, R.drawable.baseline_person_24, R.id.theme_color_icon, this);
            this.f9285i3 = G;
            G.setId(R.id.btn_search_by);
            this.f9285i3.setOnClickListener(odVar);
            this.f9285i3.setLayoutParams(r12);
            this.f9279g3.addView(this.f9285i3);
            FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(ce.a0.i(52.0f), ce.a0.i(49.0f), 19);
            ImageView G2 = p0.G(t10, R.drawable.baseline_date_range_24, R.id.theme_color_icon, this);
            this.f9288j3 = G2;
            G2.setId(R.id.btn_search_jump);
            this.f9288j3.setOnClickListener(odVar);
            this.f9288j3.setLayoutParams(r13);
            this.f9279g3.addView(this.f9288j3);
            FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(ce.a0.i(52.0f), ce.a0.i(49.0f), 21);
            r14.rightMargin = ce.a0.i(52.0f);
            ImageView G3 = p0.G(t10, R.drawable.baseline_keyboard_arrow_up_24, R.id.theme_color_icon, this);
            this.f9291k3 = G3;
            G3.setId(R.id.btn_search_next);
            this.f9291k3.setOnClickListener(odVar);
            this.f9291k3.setLayoutParams(r14);
            this.f9291k3.setEnabled(false);
            this.f9279g3.addView(this.f9291k3);
            FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(ce.a0.i(52.0f), ce.a0.i(49.0f), 21);
            ImageView G4 = p0.G(t10, R.drawable.baseline_keyboard_arrow_down_24, R.id.theme_color_icon, this);
            this.f9294l3 = G4;
            G4.setId(R.id.btn_search_prev);
            this.f9294l3.setOnClickListener(odVar);
            this.f9294l3.setPadding(0, 0, ce.a0.i(12.0f), 0);
            this.f9294l3.setLayoutParams(r15);
            this.f9294l3.setEnabled(false);
            this.f9279g3.addView(this.f9294l3);
            int i10 = ce.a0.i(22.0f);
            FrameLayout.LayoutParams r16 = FrameLayoutFix.r1(-2, -2, 21);
            r16.rightMargin = (ce.a0.i(52.0f) * 2) + i10;
            r16.leftMargin = ce.a0.i(5.0f) + i10;
            t tVar = new t(t10, i10);
            this.f9297m3 = tVar;
            tVar.setId(R.id.btn_search_counter);
            this.f9297m3.setSingleLine(true);
            this.f9297m3.setTextSize(1, 15.0f);
            this.f9297m3.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            this.f9297m3.setTypeface(ce.o.i());
            this.f9297m3.setTextColor(ae.j.P0());
            y8(this.f9297m3);
            this.f9297m3.setLayoutParams(r16);
            this.f9279g3.addView(this.f9297m3);
            FrameLayout.LayoutParams r17 = FrameLayoutFix.r1(ce.a0.i(49.0f), ce.a0.i(49.0f), 21);
            r17.rightMargin = (ce.a0.i(52.0f) * 2) + i10;
            n2 n2Var = new n2(t10);
            this.f9301n3 = n2Var;
            n2Var.g(4.5f, 0.0f, 10.0f);
            this.f9301n3.setLayoutParams(r17);
            this.f9301n3.d(1.0f);
            this.f9279g3.addView(this.f9301n3);
            t8(this.f9301n3);
            lq(0.0f);
            kq(0.0f);
        }
    }

    public int Yn() {
        if (Ua()) {
            return ce.a0.g() - (ce.a0.i(26.0f) * 2);
        }
        return ce.a0.g();
    }

    public final void Yo() {
        k0.e<s4> eVar = this.C1;
        if (eVar != null && eVar.p() > 0) {
            int p10 = this.C1.p();
            long[] jArr = new long[p10];
            for (int i10 = 0; i10 < p10; i10++) {
                jArr[i10] = this.C1.j(i10);
            }
            this.f24495b.Ua(C9(), jArr);
        }
    }

    public void Yp(boolean z10) {
        this.f9261a3 = z10;
    }

    public final void Yq() {
        if (this.T2.h() && !ui() && !el() && Li() && Ek() && !cl() && !gl() && Ta() && !il() && !this.G0.d()) {
            long j10 = hl() ? 1024L : 512L;
            if (he.i.c2().X2(j10)) {
                long h42 = this.f24495b.h4(C9());
                boolean z10 = !hl() && this.f24495b.e2().H2(h42);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j10);
                sb2.append(hl() ? "_self" : z10 ? "_online" : al() ? "_channel" : "");
                String sb3 = sb2.toString();
                HashSet<String> hashSet = B3;
                if (hashSet == null || !hashSet.contains(sb3)) {
                    if (B3 == null) {
                        B3 = new HashSet<>();
                    }
                    B3.add(sb3);
                    if (hl()) {
                        Nq(R.string.HoldToRemind);
                    } else if (z10) {
                        Oq(gd.w.m1(R.string.HoldToSchedule2, this.f24495b.e2().C2(h42)), false);
                    } else if (al()) {
                        Nq(R.string.HoldToSilentBroadcast);
                    } else {
                        Nq(R.string.HoldToSchedule);
                    }
                }
            }
        }
    }

    @Override
    public void Z1(int i10, qd.b bVar, boolean z10) {
        int e02 = this.f9338x0.E0().e0(bVar);
        if (e02 != -1) {
            this.f9338x0.E0().i0(e02).f9(bVar, z10);
        }
    }

    @Override
    public boolean Z5(t0 t0Var, boolean z10, boolean z11) {
        return Ta();
    }

    @Override
    public void Z8() {
        ae.h I;
        Yp(false);
        cp();
        gq(false, false);
        I8(0.0f, 0.0f);
        Fk();
        Mp(TdApi.ChatActionCancel.CONSTRUCTOR);
        Ni();
        Mi();
        bp();
        this.A3 = true;
        vc.v2 v2Var = this.f9338x0;
        if (v2Var != null) {
            v2Var.t0(this);
        }
        x2.l lVar = this.f9331v1;
        if (lVar != null) {
            lVar.y();
            this.f9331v1 = null;
        }
        z0 z0Var = this.C0;
        if (z0Var != null) {
            z0Var.v2();
        }
        vc.m4 m4Var = this.M0;
        if (m4Var != null) {
            m4Var.Q2();
        }
        ne.m4 m4Var2 = this.N0;
        if (m4Var2 != null) {
            m4Var2.Q2();
            if (Wk() && !Xk() && (I = this.f24495b.tc().I(ae.j.g0())) != null && I.a0()) {
                this.f24495b.tc().s0(ae.h.f0(this.f24495b, I, this.N0.h()), true, ae.j.g0());
            }
        }
        this.N1 = null;
        this.U0 = false;
        mj();
        Zo();
        Vp(0);
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            if (h0Var.getInput().isEmpty()) {
                Fr("", false);
            } else {
                this.f9346z0.setText("");
            }
        }
        d0 d0Var = this.Y0;
        if (d0Var != null) {
            d0Var.w();
        }
        Pj();
        this.f9263b2.Q2();
        m0 m0Var = this.f9269d2;
        if (m0Var != null) {
            m0Var.Q2();
        }
        wj(true);
        qj();
        jj();
        Jd(0.0f, false);
        vc.f fVar = this.f9318s0;
        if (fVar != null) {
            fVar.I1();
        }
        if (this.f9302o0 || !this.f9298n0) {
            super.Z8();
            t0 t0Var = this.B2;
            if (t0Var != null) {
                t0Var.p();
                this.B2 = null;
            }
            i0 i0Var = this.W1;
            if (i0Var != null) {
                i0Var.Q2();
            }
            s3 s3Var = this.V1;
            if (s3Var != null) {
                s3Var.Q2();
            }
            this.F0.Q2();
            vc.h0 h0Var2 = this.f9346z0;
            if (h0Var2 != null) {
                h0Var2.Q2();
            }
            vc.m4 m4Var3 = this.V0;
            if (m4Var3 != null) {
                m4Var3.Q2();
            }
            if (this.f9336w2 != null) {
                sj();
            }
            kd.f fVar2 = this.f9342y0;
            if (fVar2 != null) {
                fVar2.g();
            }
            Wo();
            p0.n(this.f9334w0);
            p0.n(this.W0);
            RecyclerView recyclerView = this.W0;
            if (recyclerView != null) {
                ((j4) recyclerView.getAdapter()).h0();
            }
            this.f24495b.tc().b0(this);
            t1.b().d(this);
            z0 z0Var2 = this.C0;
            if (z0Var2 != null) {
                z0Var2.b0();
            }
            this.f9338x0.v2();
        }
        Ri();
        v0.f0();
    }

    public final void Zi() {
        if (!Tk() && !dl()) {
            Sp(this.f24495b.I3(this.f9310q0));
        }
    }

    public final boolean Zj() {
        String str;
        return ri() && (str = this.M2) != null && str.equals(this.K2);
    }

    public void Zk(boolean z10) {
        if (!Wa() || z10) {
            s3 s3Var = this.V1;
            if (s3Var != null) {
                s3Var.invalidate();
            }
            MessagesRecyclerView messagesRecyclerView = this.f9334w0;
            if (messagesRecyclerView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) messagesRecyclerView.getLayoutManager();
                for (int i10 = 0; i10 < linearLayoutManager.J(); i10++) {
                    View I = linearLayoutManager.I(i10);
                    if (I != null) {
                        I.invalidate();
                    }
                }
            }
            z0 z0Var = this.C0;
            if (z0Var != null) {
                z0Var.a2();
            }
            if (this.f9320s2 != null) {
                for (int i11 = 0; i11 < this.f9320s2.getChildCount(); i11++) {
                    View childAt = this.f9320s2.getChildAt(i11);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        childAt.invalidate();
                    }
                }
                return;
            }
            return;
        }
        this.f9335w1 = true;
    }

    public final void Zo() {
        this.f9290k2 = null;
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            h0Var.s0();
            Up(1, false);
        }
        this.G0.c(false, false);
    }

    public final void Zp(boolean z10) {
        if (this.U2 != z10) {
            this.U2 = z10;
            Md(z10);
            this.f9346z0.setInputBlocked(z10);
        }
    }

    @Deprecated
    public void Zq(s4 s4Var, int[] iArr, String[] strArr, int[] iArr2, Object obj, TdApi.ChatMember chatMember, boolean z10) {
        int i10;
        String[] t32;
        this.f9347z1 = s4Var;
        this.B1 = obj;
        this.A1 = chatMember;
        StringBuilder sb2 = new StringBuilder();
        TdApi.Chat chat = this.f9310q0;
        if (chat != null) {
            boolean O6 = this.f24495b.O6(chat.f19908id);
            if (s4Var.X3().content != null) {
                int constructor = s4Var.X3().content.getConstructor();
                if (constructor == 1115779641) {
                    String str = ((TdApi.MessageDice) s4Var.X3().content).emoji;
                    sb2.append(gd.w.j1(t2.F.f13581a.equals(str) ? R.string.SendDartHint : t2.G.f13581a.equals(str) ? R.string.SendDiceHint : R.string.SendUnknownDiceHint, str));
                } else if (constructor == 1779022878) {
                    String W9 = this.f24495b.W9(s4Var.X3(), true, true);
                    if (!ib.i.i(W9)) {
                        sb2.append(W9);
                        sb2.append(": ");
                    }
                    sb2.append(t2.C(this.f24495b, s4Var.X3(), true));
                }
            }
            if (O6 && s4Var.X4() > 0 && !s4Var.k6()) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(gd.w.o2(R.string.xViews, s4Var.X4()));
            }
        }
        if (s4Var.Y5() && (t32 = s4Var.t3()) != null) {
            if (sb2.length() > 0) {
                sb2.append("\n");
            }
            sb2.append(gd.w.j1(R.string.SendFailureInfo, ce.c0.U(", ", t32)));
        }
        if (!s4Var.p0()) {
            if (sb2.length() > 0) {
                sb2.append("\n\n");
            }
            TdApi.MessageSender messageSender = s4Var.X3().senderId;
            if (this.f24495b.e2().T1(messageSender)) {
                i10 = R.string.RestrictSavingBotInfo;
            } else if (this.f24495b.P6(messageSender)) {
                i10 = R.string.RestrictSavingChannelInfo;
            } else {
                i10 = this.f24495b.z7(messageSender) ? R.string.RestrictSavingUserInfo : R.string.RestrictSavingGroupInfo;
            }
            sb2.append(gd.w.i1(i10));
        }
        String trim = sb2.toString().trim();
        if (ib.i.i(trim)) {
            trim = null;
        }
        Jo(de(trim, iArr, strArr, null, iArr2), s4Var, z10);
    }

    @Override
    public void a0(final long j10, TdApi.MessageSender messageSender) {
        wd(new Runnable() {
            @Override
            public final void run() {
                rh.this.Yl(j10);
            }
        });
    }

    @Override
    public Object a2(int i10) {
        return ie.g0.b(this, i10);
    }

    public void aj() {
        bj(-1, -1, false);
    }

    public final void ak(boolean z10, k5.f fVar) {
        if (fVar != null) {
            bk(z10, fVar);
        } else {
            wq(z10);
        }
    }

    public boolean al() {
        return this.f24495b.O6(C9());
    }

    public final void ao(boolean z10) {
        this.f9338x0.W1(z10);
    }

    public final void ap() {
        if (this.f9339x1 && bc() != null) {
            ij();
            u1 M = bc().M();
            M.d(1);
            nb nbVar = new nb(this.f24493a, this.f24495b);
            nbVar.get();
            M.o(nbVar, 0);
        }
    }

    public final void aq(float f10) {
        if (this.S1 != f10) {
            this.S1 = f10;
            this.P0.setAlpha(ib.h.d(f10));
            sr();
        }
    }

    public final void ar() {
        v2 v2Var;
        if (this.f9265c1 != 0 && (v2Var = this.Z0) != null) {
            v2Var.N(0, true);
        }
    }

    @Override
    public long b() {
        return C9();
    }

    @Override
    public void b2(final long j10, final TdApi.DraftMessage draftMessage) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Zl(j10, draftMessage);
            }
        });
    }

    @Override
    public long b3() {
        return C9();
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    public void bj(int i10, int i11, boolean z10) {
        vc.h1 h1Var;
        vc.i1 E0;
        int j02;
        if (!Ua()) {
            vd.g0 a12 = t().a1();
            boolean z11 = C9() == a12.O();
            rh rhVar = null;
            if (z11) {
                long Z = a12.Z();
                LinearLayoutManager N0 = this.f9338x0.N0();
                if (i10 == -1) {
                    i10 = N0.X1();
                }
                if (i11 == -1) {
                    i11 = N0.a2();
                }
                if (i10 != -1 && i11 != -1 && !this.f9334w0.C0() && (j02 = (E0 = this.f9338x0.E0()).j0()) > 0) {
                    while (i10 <= i11) {
                        if (i10 >= 0 && i10 < j02 && vc.j1.T(E0.F(i10)) && E0.g0(i10).K3() == Z) {
                            View C = N0.C(i10);
                            if (C instanceof vc.h1) {
                                h1Var = (vc.h1) C;
                                s4 message = h1Var.getMessageView().getMessage();
                                if (message != null && message.K3() == Z) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i10++;
                    }
                }
            }
            h1Var = null;
            if (Ua()) {
                rhVar = this;
            }
            a12.q1(h1Var, rhVar);
            if (z11 && z10) {
                a12.k1();
            }
        }
    }

    public final void bk(final boolean z10, k5.f fVar) {
        final boolean[] zArr = new boolean[1];
        g6.e jeVar = new g6.e() {
            @Override
            public final void onLocationChanged(Location location) {
                rh.this.zl(r2, zArr, z10, location);
            }
        };
        final kb.b[] bVarArr = {new j(zArr, jeVar, fVar, z10)};
        ce.j0.e0(bVarArr[0], 3000L);
        try {
            g6.f.f12107b.c(this.f9336w2, LocationRequest.b().g(100).d(3000L).f(1).e(5000L), jeVar);
        } catch (SecurityException unused) {
            zArr[0] = true;
            wq(z10);
        } catch (Throwable th) {
            Log.w("requestLocationUpdates error", th, new Object[0]);
            zArr[0] = true;
            wq(z10);
        }
    }

    public boolean bl() {
        TdApi.Message message = this.f9290k2;
        return (message == null || message.content.getConstructor() == 1989037971) ? false : true;
    }

    public final boolean bo() {
        return !this.f9280h1 && !Ua() && !ui();
    }

    public final void bp() {
        if (this.f9279g3 != null) {
            this.f9297m3.setText("");
            this.f9294l3.setEnabled(false);
            this.f9291k3.setEnabled(false);
            mq(false, false);
            dj();
            kq(0.0f);
            Cr();
            boolean Q6 = this.f24495b.Q6(this.f9310q0);
            if (this.f9321s3 != Q6) {
                this.f9321s3 = Q6;
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9279g3.getLayoutParams();
                if (Q6) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(8, 0);
                    layoutParams.addRule(6, 0);
                    layoutParams.height = ce.a0.i(48.0f);
                } else {
                    layoutParams.addRule(12, 0);
                    layoutParams.addRule(8, R.id.msg_bottom);
                    layoutParams.addRule(6, R.id.msg_bottom);
                    layoutParams.height = -1;
                }
                this.f9279g3.setLayoutParams(layoutParams);
            }
        }
    }

    public final void bq(boolean z10, boolean z11) {
        if (this.R1 != z10) {
            this.R1 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.Q1 == null) {
                    this.Q1 = new eb.k(7, this, db.b.f7287b, 180L, this.S1);
                }
                this.Q1.i(f10);
                return;
            }
            eb.k kVar = this.Q1;
            if (kVar != null) {
                kVar.l(f10);
            }
            aq(f10);
        }
    }

    public void br() {
        kd.f fVar;
        if (this.f9310q0 != null) {
            jb.c cVar = new jb.c(4);
            u0 u0Var = new u0(4);
            if (!this.f9338x0.q1() && !this.f9343y1) {
                cVar.a(R.id.btn_search);
                u0Var.a(R.string.Search);
            }
            TdApi.ChatMemberStatus O3 = this.f24495b.O3(this.f9310q0.f19908id);
            if ((!this.f24495b.O6(this.f9310q0.f19908id) || (O3 != null && !t2.f3(O3))) && !this.f24495b.k7(this.f9310q0.f19908id)) {
                cVar.a(R.id.btn_mute);
                u0Var.a(this.f24495b.x3(this.f9310q0.f19908id) ? R.string.Mute : R.string.Unmute);
            }
            if (this.f24495b.F2(this.f9310q0.f19908id)) {
                cVar.a(R.id.btn_reportChat);
                u0Var.a(R.string.Report);
            }
            if (this.f24495b.N2(this.f9310q0)) {
                cVar.a(R.id.btn_setPasscode);
                u0Var.a(R.string.PasscodeTitle);
            }
            this.f24495b.hd().D2(C9(), cVar, u0Var, true, false);
            if (!this.f9343y1) {
                if (ob.a.l(this.f9310q0.f19908id) && t2.p5(this.f24495b.f4(this.f9310q0))) {
                    cVar.a(R.id.btn_shareMyContact);
                    u0Var.a(R.string.ShareMyContactInfo);
                }
                if (this.f9338x0.d0()) {
                    cVar.a(R.id.btn_showPinnedMessage);
                    u0Var.a(R.string.PinnedMessage);
                }
                if (this.f24495b.M6(this.f9310q0) && (fVar = this.f9342y0) != null) {
                    if (fVar.i() != null) {
                        cVar.a(R.id.btn_botHelp);
                        u0Var.a(R.string.BotHelp);
                    }
                    if (this.f9342y0.j() != null) {
                        cVar.a(R.id.btn_botSettings);
                        u0Var.a(R.string.BotSettings);
                    }
                }
            }
            if (!(this.f9315r1 == 0 || this.G1 == 4)) {
                cVar.a(R.id.btn_openLinkedChat);
                u0Var.a(this.f24495b.O6(C9()) ? R.string.LinkedGroup : R.string.LinkedChannel);
            }
            Yd(cVar.e(), u0Var.d(), 0);
        }
    }

    @Override
    public void c1(final long j10, final TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.dm(j10, chatJoinRequestsInfo);
            }
        });
    }

    @Override
    public int c2() {
        return d1.a3(true) + this.f9334w0.getMeasuredHeight();
    }

    @Override
    public boolean c5() {
        vc.h0 h0Var = this.f9346z0;
        return h0Var == null || h0Var.getText().length() == 0;
    }

    @Override
    public void c6() {
        super.c6();
        Ri();
        nr();
        this.f9338x0.Y2(true);
        dp();
        if (!S9() && !el()) {
            this.B0 = true;
            vc.h0 h0Var = this.f9346z0;
            if (h0Var != null) {
                h0Var.setEnabled(false);
            }
        }
    }

    public final void cj() {
        if (!Ua()) {
            float f10 = -Vj();
            FrameLayoutFix frameLayoutFix = this.O0;
            if (frameLayoutFix != null) {
                frameLayoutFix.setTranslationY(f10);
            }
            FrameLayoutFix frameLayoutFix2 = this.P0;
            if (frameLayoutFix2 != null) {
                frameLayoutFix2.setTranslationY(ok());
            }
            sr();
        }
    }

    public long ck() {
        TdApi.Message message = this.U1;
        if (message != null) {
            return message.f19946id;
        }
        return 0L;
    }

    public boolean cl() {
        return this.f9290k2 != null;
    }

    public boolean co() {
        return this.H1 && !Xk();
    }

    public final void cp() {
        this.D1 = null;
        this.E1 = 0.0f;
    }

    public final void cq(int i10) {
        if ((i10 <= 0 || (!this.f9280h1 && !Ua() && !ui())) && this.T1 != i10) {
            this.T1 = i10;
            boolean z10 = true;
            boolean z11 = i10 > 0;
            boolean Ta = Ta();
            vc.h hVar = this.T0;
            if (!Ta || this.S1 <= 0.0f) {
                z10 = false;
            }
            hVar.a(i10, false, z10);
            bq(z11, Ta);
        }
    }

    public void cr(TdApi.Message message, boolean z10, boolean z11) {
        TdApi.Message message2;
        if (!this.f9280h1 && !Ua()) {
            if (message != null && message.f19946id != 0) {
                String str = null;
                if (Na()) {
                    W8(null);
                } else if (Oa()) {
                    p5(-1);
                }
                if ((this.f9306p0 & 1) == 0 && ((message2 = this.U1) == null || message2.f19946id != message.f19946id)) {
                    if (!gr()) {
                        s3 s3Var = this.V1;
                        if (this.f24495b.O6(this.f9310q0.f19908id)) {
                            str = this.f9310q0.title;
                        }
                        s3Var.C1(message, str);
                    }
                    if (this.U1 != null || gr() || cl()) {
                        this.U1 = message;
                    } else {
                        this.U1 = message;
                        Ho();
                    }
                    if (z10) {
                        this.f9346z0.setTextChangedSinceChatOpened(true);
                        dp();
                    }
                }
                if (z11) {
                    ce.x.f(this.f9346z0);
                }
            } else if (gr()) {
                Rq();
            } else {
                uj(z10);
            }
        }
    }

    @Override
    public void d1(boolean z10) {
        Up(4, z10);
    }

    @Override
    public boolean dc() {
        vc.v2 v2Var = this.f9338x0;
        return v2Var != null && !v2Var.q1() && this.f9338x0.E0().j0() == 0;
    }

    public final void dj() {
        boolean z10 = true;
        boolean z11 = Ei() && ib.i.i(T9());
        if (!Ta() || qa() <= 0.0f) {
            z10 = false;
        }
        jq(z11, z10);
    }

    public final void dk(final boolean z10, boolean z11, boolean z12) {
        if (C9() == this.f9344y2) {
            AlertDialog.Builder builder = new AlertDialog.Builder(t(), ae.j.t());
            builder.setTitle(gd.w.i1(R.string.AppName));
            builder.setMessage(gd.w.i1(R.string.DetectLocationError));
            builder.setPositiveButton(gd.w.P0(), ug.f9748a);
            builder.setNegativeButton(gd.w.i1(R.string.ShareYouLocationUnableManually), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    rh.this.Bl(z10, dialogInterface, i10);
                }
            });
            Sd(builder);
        }
    }

    public final boolean dl() {
        return this.f9280h1 && this.f9283i1 == 3;
    }

    public boolean m12do() {
        return false;
    }

    public final void dp() {
        vc.h0 h0Var;
        if (Di() && !cl() && (h0Var = this.f9346z0) != null && h0Var.C0() && Ta()) {
            TdApi.DraftMessage draftMessage = new TdApi.DraftMessage(ck(), (int) (System.currentTimeMillis() / 1000), new TdApi.InputMessageText(this.f9346z0.d(false), Zj(), false));
            Client v42 = this.f24495b.v4();
            p7 p7Var = this.f9295m1;
            long b10 = p7Var != null ? p7Var.b() : this.f9310q0.f19908id;
            p7 p7Var2 = this.f9295m1;
            v42.o(new TdApi.SetChatDraftMessage(b10, p7Var2 != null ? p7Var2.g() : 0L, draftMessage), this.f24495b.na());
            for (int i10 = 0; i10 < te() - 1; i10++) {
                v4<?> se = se(i10);
                if (se instanceof rh) {
                    rh rhVar = (rh) se;
                    if (rhVar.Bj(C9(), this.f9295m1, ui()) && rhVar.Di() && rhVar.f9346z0 != null && !rhVar.cl()) {
                        rhVar.xr(C9(), !ob.e.b1(draftMessage) ? draftMessage : null);
                    }
                }
            }
        }
    }

    public void dq(float f10) {
        if (this.f9287j2 != f10) {
            this.f9287j2 = f10;
            Br();
        }
    }

    public final boolean dr(View view, int i10, int i11, int i12, int i13) {
        if (view == null) {
            return this.f24495b.wc(this.f9310q0, i10, i11, i12, i13);
        }
        CharSequence Z5 = this.f24495b.Z5(this.f9310q0, i10, i11, i12, i13);
        if (Z5 == null) {
            return false;
        }
        if (view == this.G0 || view == this.F0) {
            Oq(Z5, true);
        } else {
            t().I3().g(view).q(R.drawable.baseline_warning_24).i(this).D(this.f24495b, Z5).F();
        }
        return true;
    }

    @Override
    public void e2() {
        Zk(false);
    }

    @Override
    public void e7(final long j10, int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.bm(j10);
            }
        });
    }

    public final void ej(boolean z10) {
        oq(this.f9346z0.getText().length() > 0 || cl() || this.f9267c3, z10);
    }

    public TdApi.DraftMessage ek() {
        p7 p7Var = this.f9295m1;
        return p7Var != null ? p7Var.c() : this.f9310q0.draftMessage;
    }

    public final boolean el() {
        return this.f24495b.O6(C9()) && !this.f24495b.y6(this.f9310q0);
    }

    public final boolean eo() {
        return this.f24495b.Q6(this.f9310q0) && !Ek();
    }

    public final void ep(boolean z10) {
        vc.h0 h0Var;
        TdApi.MessageText messageText;
        boolean z11;
        if (this.f9290k2 != null && (h0Var = this.f9346z0) != null) {
            TdApi.FormattedText d10 = h0Var.d(z10);
            if (!ob.e.c1(d10) || cl()) {
                switch (this.f9290k2.content.getConstructor()) {
                    case TdApi.MessagePhoto.CONSTRUCTOR:
                    case TdApi.MessageAudio.CONSTRUCTOR:
                    case TdApi.MessageVoiceNote.CONSTRUCTOR:
                    case TdApi.MessageDocument.CONSTRUCTOR:
                    case TdApi.MessageAnimation.CONSTRUCTOR:
                    case TdApi.MessageVideo.CONSTRUCTOR:
                        if (!ob.e.O(ob.e.y1(this.f9290k2.content), d10)) {
                            o6 o6Var = this.f24495b;
                            TdApi.Message message = this.f9290k2;
                            o6Var.c5(message.chatId, message.f19946id, d10);
                            break;
                        }
                        break;
                    case TdApi.MessageAnimatedEmoji.CONSTRUCTOR:
                    case TdApi.MessageText.CONSTRUCTOR:
                        if (this.f9290k2.content.getConstructor() == 908195298) {
                            messageText = new TdApi.MessageText(ob.e.y1(this.f9290k2.content), null);
                        } else {
                            messageText = (TdApi.MessageText) this.f9290k2.content;
                        }
                        TdApi.InputMessageText inputMessageText = new TdApi.InputMessageText(d10, Zj(), false);
                        if (!ob.e.O(inputMessageText.text, messageText.text) || (((z11 = inputMessageText.disableWebPagePreview) && messageText.webPage != null) || (!z11 && messageText.webPage == null && this.L2 != null))) {
                            String trim = d10.text.trim();
                            if (trim.length() != 0) {
                                o6 o6Var2 = this.f24495b;
                                TdApi.Message message2 = this.f9290k2;
                                o6Var2.d5(message2.chatId, message2.f19946id, inputMessageText, this.L2, id.d.z().A(trim));
                                break;
                            } else {
                                return;
                            }
                        }
                        break;
                    default:
                        throw new UnsupportedOperationException(Integer.toString(this.f9290k2.content.getConstructor()));
                }
                pj();
            }
        }
    }

    public void eq() {
        if (!this.f9339x1) {
            this.f9339x1 = true;
            this.f24495b.F4().b1().a(this);
        }
    }

    public void er(TdApi.SecretChat secretChat) {
        int constructor = secretChat.state.getConstructor();
        if (constructor == -1945106707) {
            Hq(gd.w.i1(R.string.SecretChatCancelled), 6, false);
        } else if (constructor == -1637050756) {
            Hq(gd.w.j1(R.string.AwaitingEncryption, this.f24495b.e2().C2(secretChat.userId)), 6, false);
        }
    }

    @Override
    public void f0(final long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.dn(j10);
            }
        });
    }

    @Override
    public void f1() {
        jj();
        oj(true, false);
        ur(R.drawable.deproko_baseline_bots_command_26);
        long j10 = this.f9308p2;
        if (j10 != 0) {
            this.f9342y0.s(j10);
        }
    }

    @Override
    public void f4(long j10, String str) {
        zd.g0.d(this, j10, str);
    }

    @Override
    public void f5(final long j10, final String str) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.im(j10, str);
            }
        });
    }

    public void fj(TdApi.Message message) {
        TdApi.ReplyMarkup replyMarkup;
        TdApi.InlineKeyboardButton[][] inlineKeyboardButtonArr;
        if (!(this.C2 == null || (replyMarkup = message.replyMarkup) == null || replyMarkup.getConstructor() != -619317658)) {
            for (TdApi.InlineKeyboardButton[] inlineKeyboardButtonArr2 : ((TdApi.ReplyMarkupInlineKeyboard) message.replyMarkup).rows) {
                int length = inlineKeyboardButtonArr2.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        TdApi.InlineKeyboardButton inlineKeyboardButton = inlineKeyboardButtonArr2[i10];
                        if (inlineKeyboardButton.type.getConstructor() == -2035563307) {
                            jr((TdApi.InlineKeyboardButtonTypeSwitchInline) inlineKeyboardButton.type);
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
    }

    public TdApi.WebPage fk(TdApi.FormattedText formattedText) {
        TdApi.Message message = this.f9290k2;
        if (message == null || message.content.getConstructor() != 1989037971) {
            return null;
        }
        TdApi.MessageText messageText = (TdApi.MessageText) this.f9290k2.content;
        if (ob.e.P(formattedText, messageText.text, true)) {
            return messageText.webPage;
        }
        return null;
    }

    public boolean fl(long j10, long j11, s4 s4Var) {
        int h10;
        s4 q10;
        synchronized (this) {
            k0.e<s4> eVar = this.C1;
            if (eVar == null || eVar.p() <= 0 || (h10 = this.C1.h(j11)) < 0 || (q10 = this.C1.q(h10)) == null || q10.I2() != j10) {
                return false;
            }
            this.C1.o(h10, s4Var);
            return true;
        }
    }

    public final boolean fo() {
        return hl() && !Ua() && !Tk() && !ui();
    }

    public final void fp() {
        int F0 = vc.v2.F0(this.f24495b.A6(), this.f9310q0, this.f9295m1);
        if (!this.f9338x0.X0()) {
            if (this.f9280h1 || Ua() || F0 != 2) {
                TdApi.Chat chat = this.f9310q0;
                if (chat != null && vc.v2.c0(chat, this.f9295m1)) {
                    ob.d G0 = vc.v2.G0(this.f24495b.A6(), this.f9310q0, this.f9295m1, 2);
                    int b12 = this.f9338x0.b1();
                    s4 z02 = this.f9338x0.z0();
                    ob.d G9 = z02 != null ? z02.G9() : null;
                    int n02 = this.f9338x0.E0().n0(G0);
                    if (G9 == null || G9.c() != G0.c()) {
                        if (n02 != -1) {
                            this.f9338x0.Z0(G0, 4, null, true);
                            return;
                        } else {
                            this.f9338x0.A2(G0, 2);
                            return;
                        }
                    } else if (G9.d() < G0.d()) {
                        int n03 = this.f9338x0.E0().n0(G9);
                        if (b12 == -1 || n03 > b12) {
                            if (n02 != -1 && (n03 - n02 > 1 || (b12 != -1 && n03 > b12))) {
                                this.f9338x0.Z0(G0, 4, null, true);
                                return;
                            } else if (n02 == -1) {
                                this.f9338x0.A2(G0, 2);
                                return;
                            }
                        }
                    }
                }
            } else {
                this.f9338x0.Z0(vc.v2.G0(this.f24495b.A6(), this.f9310q0, this.f9295m1, F0), 4, null, true);
                return;
            }
        }
        this.f9338x0.K2(false);
    }

    public void fq(boolean z10) {
        this.f9298n0 = z10;
    }

    public void fr(ArrayList<dd.l> arrayList, boolean z10) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (this.E2 == null) {
                int i10 = ce.a0.i(72.0f) + ce.a0.i(2.5f);
                int i11 = ce.a0.i(6.5f) + i10;
                int i12 = ce.a0.i(12.0f);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, i11 + i12);
                layoutParams.addRule(2, R.id.msg_bottom);
                layoutParams.bottomMargin = -(ce.a0.i(8.0f) + i12);
                hb.a aVar = new hb.a(t());
                this.E2 = aVar;
                aVar.setLayoutParams(layoutParams);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(t(), 0, false);
                w3 w3Var = new w3(this, this, linearLayoutManager, this);
                this.G2 = w3Var;
                w3Var.h0(arrayList);
                p pVar = new p(t());
                this.F2 = pVar;
                pVar.setItemAnimator(null);
                this.F2.setOverScrollMode(fd.a.f11879a ? 1 : 2);
                this.F2.setAdapter(this.G2);
                this.F2.setLayoutManager(linearLayoutManager);
                this.F2.setLayoutParams(FrameLayoutFix.q1(-2, i11));
                this.E2.addView(this.F2);
                FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(ce.a0.i(27.0f), i12);
                q12.topMargin = i10;
                int i13 = ce.a0.i(55.0f) + ce.a0.i(2.5f);
                q12.leftMargin = i13;
                this.E2.setPivotX(i13 + (ce.a0.i(27.0f) / 2));
                this.E2.setPivotY(i10 + i12);
                ImageView imageView = new ImageView(t());
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.stickers_back_arrow);
                imageView.setColorFilter(new PorterDuffColorFilter(ae.j.l0(), PorterDuff.Mode.MULTIPLY));
                x8(imageView, R.id.theme_color_overlayFilling);
                imageView.setLayoutParams(q12);
                this.E2.addView(imageView);
            } else if (!z10 || !this.G2.b0()) {
                this.G2.h0(arrayList);
            } else {
                this.G2.a0(arrayList);
            }
            rq(true);
        } else if (!z10) {
            rq(false);
        }
    }

    public final void gj() {
        T8();
    }

    public z0 gk() {
        return this.C0;
    }

    public boolean gl() {
        TdApi.Chat chat = this.f9310q0;
        return chat != null && ob.a.j(chat.f19908id);
    }

    public final y3.c go(final long j10) {
        return new y3.c(R.id.btn_addContact, R.string.AddContact, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                rh.this.Ll(j10, view);
            }
        });
    }

    public final void gp(String str) {
        dj();
        vc.v2 v2Var = this.f9338x0;
        TdApi.Chat chat = this.f9310q0;
        v2Var.L2(chat.f19908id, this.f9295m1, null, chat.type.getConstructor() == 862366513, str);
        hp(str);
    }

    public void gq(boolean z10, boolean z11) {
        hq(z10, z11, Ta() || Z9().Ta());
    }

    public final boolean gr() {
        String str;
        String str2 = this.K2;
        return str2 != null && ((str = this.M2) == null || !str.equals(str2));
    }

    public void hj() {
        this.U1 = null;
        this.M2 = null;
        this.K2 = null;
        this.L2 = null;
        this.f9306p0 &= -2;
        dq(0.0f);
        this.V1.b0();
    }

    public boolean hk() {
        return this.O2;
    }

    public boolean hl() {
        TdApi.Chat chat = this.f9310q0;
        return chat != null && this.f24495b.k7(chat.f19908id);
    }

    public final y3.c ho(final long j10, boolean z10) {
        return new y3.c(R.id.btn_reportChat, z10 ? R.string.BlockContact : R.string.ReportSpam, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                rh.this.Nl(j10, view);
            }
        }).a();
    }

    public final void hp(String str) {
        if (!(this.Y0 == null || ib.i.c(this.f9349z3, str))) {
            this.f9349z3 = str;
            int n10 = this.Y0.O.n();
            for (int i10 = 0; i10 < n10; i10++) {
                j10 j10Var = (j10) this.Y0.O.o(i10);
                if (j10Var != null) {
                    j10Var.Ag(str);
                }
            }
        }
    }

    public void hq(boolean z10, boolean z11, boolean z12) {
        boolean z13 = false;
        if (this.f9343y1) {
            z10 = false;
        }
        this.O1.p(z10, z12);
        eb.f fVar = this.P1;
        if (z12 && this.O1.g() > 0.0f) {
            z13 = true;
        }
        fVar.p(z11, z13);
        Ti();
    }

    public void hr(View view) {
        this.f9334w0.O1(view);
    }

    public final void ij() {
        if (this.f9339x1) {
            this.f9339x1 = false;
            this.f24495b.F4().b1().x(this);
        }
    }

    public boolean il() {
        return this.f9267c3;
    }

    public final y3.c io(final long j10) {
        return new y3.c(R.id.btn_unarchiveChat, R.string.UnarchiveUnmute, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                rh.this.Ol(j10, view);
            }
        });
    }

    public void ip(s4 s4Var, float f10, float f11) {
        k0.e<s4> eVar;
        k0.e<s4> eVar2;
        jb.f fVar = new jb.f(s4Var.a4());
        s4Var.M3(fVar);
        int size = fVar.size();
        boolean O5 = s4Var.O5();
        Iterator<Long> it = fVar.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            long longValue = it.next().longValue();
            if ((!O5 ? (eVar = this.C1) == null || eVar.f(longValue) == null : !((eVar2 = this.C1) == null || eVar2.f(longValue) == null)) && un(longValue, s4Var, f10, f11, false, size)) {
                z10 = true;
            }
        }
        if (!z10) {
            int yk = yk();
            if (yk == 0) {
                Y8();
                return;
            }
            Kd(yk);
        }
        Er();
    }

    public final void iq(float f10) {
        if (this.f9309p3 != f10) {
            this.f9309p3 = f10;
            this.f9285i3.setAlpha(this.f9337w3 * f10);
            float f11 = (f10 * 0.4f) + 0.6f;
            this.f9285i3.setScaleX(f11);
            this.f9285i3.setScaleY(f11);
        }
    }

    public void ir(long j10) {
        this.f24495b.O9().d0(j10, this);
        this.f24495b.O9().k0(this);
        if (C9() == j10) {
            switch (this.f9310q0.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    this.f24495b.e2().b2(((TdApi.ChatTypeSupergroup) this.f9310q0.type).supergroupId, this);
                    return;
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    this.f24495b.e2().d2(t2.n2(this.f9310q0), this);
                    this.f24495b.e2().a2(t2.b2(this.f9310q0), this);
                    return;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    this.f24495b.e2().Z1(((TdApi.ChatTypeBasicGroup) this.f9310q0.type).basicGroupId, this);
                    return;
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    this.f24495b.e2().d2(t2.n2(this.f9310q0), this);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void j2(int i10) {
        if ((this.Z0.getCurrentItem() != 0 || !ce.j0.r(t()).Z0().c0()) && this.Z0.getCurrentItem() != i10) {
            this.f9259a1.getTopView().V1(this.Z0.getCurrentItem(), i10);
            this.Z0.N(i10, true);
        }
    }

    @Override
    public void j4(Object obj, j1.r rVar) {
        int i10 = this.f9265c1;
        if (i10 == 0) {
            rVar.f19674c = this;
        } else if (i10 == 1) {
            d0 d0Var = this.Y0;
            j10 j10Var = d0Var != null ? (j10) d0Var.O.e(1) : null;
            if (j10Var != null && (j10Var instanceof r10)) {
                ((r10) j10Var).j4(obj, rVar);
            }
        }
    }

    @Override
    public boolean jc(boolean z10) {
        org.thunderdog.challegram.a t10 = t();
        if (t10.Z0().c0()) {
            t10.Z0().U(true);
            return true;
        } else if (this.f9267c3) {
            J6();
            return true;
        } else if (Dk()) {
            if (bl()) {
                pe(gd.w.i1(R.string.DiscardEditCaptionHint), gd.w.i1(R.string.DiscardEditCaption), null);
            } else {
                pe(gd.w.i1(R.string.DiscardEditMsgHint), gd.w.i1(R.string.DiscardEditMsg), null);
            }
            return true;
        } else if (z10) {
            return false;
        } else {
            if (this.N2) {
                this.O2 = false;
                qj();
                return true;
            } else if (!this.f9300n2) {
                return false;
            } else {
                this.f9304o2 = false;
                nj(true);
                return true;
            }
        }
    }

    public final void jj() {
        this.f9328u2 = 0L;
        this.f9332v2 = null;
    }

    public int jk() {
        return this.D0.getVisibleChildrenWidth();
    }

    public final void jl() {
        if (this.f9303o1 != null) {
            this.f24495b.v4().o(new TdApi.JoinChatByInviteLink(this.f9303o1.f9377a), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    rh.this.Dl(object);
                }
            });
        } else {
            this.f24495b.v4().o(new TdApi.AddChatMember(this.f9310q0.f19908id, this.f24495b.fa(), 0), this.f24495b.na());
        }
    }

    public final boolean jo(boolean z10) {
        if (!ri()) {
            return false;
        }
        String str = this.M2;
        if (str != null) {
            boolean equals = str.equals(this.K2);
            this.M2 = null;
            return !equals;
        }
        if (z10) {
            this.K2 = null;
            this.M2 = null;
            if (this.f9290k2 == null && this.U1 == null) {
                vj();
            }
        }
        return true;
    }

    public void jp(long j10, s4 s4Var, float f10, float f11) {
        un(j10, s4Var, f10, f11, true, -1);
    }

    public final void jq(boolean z10, boolean z11) {
        if (this.f9305o3 != z10 || !z11) {
            this.f9305o3 = z10;
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                if (this.f9313q3 == null) {
                    this.f9313q3 = new eb.k(10, this, db.b.f7287b, 90L, this.f9309p3);
                }
                this.f9313q3.i(f10);
                return;
            }
            eb.k kVar = this.f9313q3;
            if (kVar != null) {
                kVar.l(f10);
            }
            iq(f10);
        }
    }

    public void jr(TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline) {
        hd.p pVar = this.C2;
        if (pVar != null) {
            TdApi.Chat W2 = this.f24495b.W2(pVar.Z());
            TdApi.User u22 = this.f24495b.e2().u2(this.C2.b0());
            if (W2 != null && u22 != null) {
                this.f24495b.hd().C4(this, W2, new hj.j().r(new c7(u22.username, inlineKeyboardButtonTypeSwitchInline.query)));
            }
        }
    }

    @Override
    public void k0(vc.q qVar, View view) {
        this.f9326u0.removeView(view);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        zd.g0.y(this, j10, videoChat);
    }

    @Override
    public void k5() {
        if (this.f9346z0.length() > 0) {
            this.f9346z0.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }

    @Override
    public void k7(final long j10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Cm(j10);
            }
        });
    }

    @Override
    public void kc() {
        if (!m12do()) {
            dp();
        }
        super.kc();
        this.f9334w0.C1();
        if (this.f9277g1) {
            this.f9277g1 = false;
        } else {
            La();
        }
        nr();
        this.f9338x0.W2(false);
    }

    public final void kj() {
        this.f9347z1 = null;
        this.B1 = null;
    }

    public x.j kk() {
        if (Li()) {
            return this.f9346z0;
        }
        return null;
    }

    public void kl(int i10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(i10 * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        ml((int) (calendar.getTimeInMillis() / 1000));
    }

    public long ko() {
        TdApi.Message message = this.U1;
        if (message != null) {
            long j10 = message.f19946id;
            if (j10 != 0 && (this.f9306p0 & 1) == 0) {
                uj(true);
                return j10;
            }
        }
        return 0L;
    }

    public final boolean un(final long r15, final hd.s4 r17, final float r18, final float r19, final boolean r20, final int r21) {
        throw new UnsupportedOperationException("Method not decompiled: de.rh.un(long, hd.s4, float, float, boolean, int):boolean");
    }

    public final void kq(float f10) {
        if (this.f9279g3 != null) {
            if (this.f9337w3 != f10) {
                this.f9337w3 = f10;
                this.f9288j3.setAlpha(f10);
                this.f9285i3.setAlpha(this.f9309p3 * f10);
                Cr();
            }
            boolean eo = eo();
            this.f9282h3.setRevealFactor(eo ? 1.0f : f10);
            this.f9279g3.setTranslationY(eo ? ce.a0.i(49.0f) * (1.0f - f10) : 0.0f);
            if (eo) {
                cj();
            }
        }
    }

    public void kr(long j10, TdApi.InlineKeyboardButtonTypeSwitchInline inlineKeyboardButtonTypeSwitchInline) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null) {
            TdApi.User u22 = j10 != 0 ? this.f24495b.e2().u2(j10) : this.f24495b.f4(chat);
            if (u22 != null && !ib.i.i(u22.username)) {
                String str = u22.username;
                if (!inlineKeyboardButtonTypeSwitchInline.inCurrentChat || !Li() || !Ek()) {
                    this.f24495b.hd().V8(this, str, inlineKeyboardButtonTypeSwitchInline.query, false);
                    return;
                }
                vc.h0 h0Var = this.f9346z0;
                if (h0Var != null) {
                    h0Var.v0("@" + u22.username + " " + inlineKeyboardButtonTypeSwitchInline.query, true);
                }
            }
        }
    }

    @Override
    public void l(w6 w6Var, TdApi.AuthorizationState authorizationState, int i10) {
        r0.g(this, w6Var, authorizationState, i10);
    }

    @Override
    public void l0(final long j10, int i10, boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.km(j10);
            }
        });
    }

    @Override
    public boolean l3(d6 d6Var) {
        return ui();
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public void lc() {
        super.lc();
        xj(false);
    }

    public final void lj() {
        synchronized (this) {
            k0.e<s4> eVar = this.C1;
            if (eVar != null) {
                eVar.b();
            }
        }
    }

    public int lk(boolean z10) {
        if (this.f9330v0.getVisibility() == 8) {
            return 0;
        }
        int measuredHeight = this.f9330v0.getMeasuredHeight();
        return !z10 ? (int) (measuredHeight + vk()) : measuredHeight;
    }

    public final void ll() {
        s4 z02;
        long f32 = this.f9338x0.z0() != null ? z02.f3() * 1000 : System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 2013);
        calendar.set(2, 7);
        calendar.set(5, 14);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long O0 = this.f9338x0.O0();
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = O0 == -1 ? timeInMillis : O0 * 1000;
        calendar.setTimeInMillis(Math.max(j10, Math.min(currentTimeMillis, f32)));
        DatePickerDialog datePickerDialog = new DatePickerDialog(t(), ae.j.t(), new DatePickerDialog.OnDateSetListener() {
            @Override
            public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                rh.this.El(datePicker, i10, i11, i12);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.setButton(-3, gd.w.i1(R.string.Beginning), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                rh.this.Fl(dialogInterface, i10);
            }
        });
        datePickerDialog.getDatePicker().setMaxDate(currentTimeMillis);
        try {
            datePickerDialog.getDatePicker().setMinDate(j10);
        } catch (Throwable unused) {
            if (j10 != timeInMillis) {
                try {
                    datePickerDialog.getDatePicker().setMinDate(timeInMillis);
                } catch (Throwable unused2) {
                }
            }
        }
        yd.g.k(datePickerDialog);
    }

    public boolean lo() {
        return this.f24495b.j3(C9());
    }

    public final void lp() {
        k0.e<s4> eVar = this.C1;
        if (eVar != null && eVar.p() == 2) {
            long j10 = this.C1.j(0);
            long j11 = this.C1.j(1);
            int m02 = this.f9338x0.E0().m0(j10);
            int m03 = this.f9338x0.E0().m0(j11);
            if (!(m02 == -1 || m03 == -1)) {
                jb.e eVar2 = new jb.e(10);
                int i10 = 0;
                for (int i11 = m03; i11 <= m02; i11++) {
                    s4 i02 = this.f9338x0.E0().i0(i11);
                    if (i02.q0()) {
                        i02.L3(eVar2, j10, j11);
                        int l10 = eVar2.l();
                        for (int i12 = 0; i12 < l10; i12++) {
                            long f10 = eVar2.f(i12);
                            i02.p9(f10, true, true, -1.0f, -1.0f, null);
                            Ro(f10, i02);
                        }
                        i10 += l10;
                        eVar2.c();
                    }
                }
                if (i10 > 0) {
                    Er();
                    Kd(this.C1.p());
                }
            }
        }
    }

    public final void lq(float f10) {
        if (this.f9333v3 != f10) {
            this.f9333v3 = f10;
            Cr();
        }
    }

    public final void lr() {
        if (this.f9300n2) {
            nj(true);
        } else {
            Ao(true);
        }
    }

    @Override
    public int m3() {
        return p0.r(this.E2)[1];
    }

    @Override
    public void m6(t0 t0Var, boolean z10, float f10, boolean z11) {
        this.W1.B1(this.A2, z10, f10);
    }

    @Override
    public void mc(Configuration configuration) {
        super.mc(configuration);
        this.f9338x0.u2();
        if (this.C0 != null) {
            this.O2 = false;
            if (this.N2) {
                qj();
            }
            this.C0.s2();
        }
        if (this.f9320s2 != null) {
            this.f9304o2 = false;
            if (this.f9300n2) {
                nj(false);
            }
        }
    }

    public final void mj() {
        this.C2 = null;
    }

    public vc.g mk() {
        return this.f9320s2;
    }

    public void ml(int i10) {
        if (i10 == 0) {
            this.f9317r3 = null;
            mq(false, true);
            this.f9338x0.Z0(new ob.d(C9(), 9L), 1, null, true);
            return;
        }
        final TdApi.GetChatMessageByDate getChatMessageByDate = new TdApi.GetChatMessageByDate(C9(), 0);
        this.f9317r3 = getChatMessageByDate;
        getChatMessageByDate.date = i10;
        mq(true, true);
        this.f24495b.v4().o(getChatMessageByDate, new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                rh.this.Hl(getChatMessageByDate, object);
            }
        });
    }

    public void mo(String str, int i10, int i11) {
        this.f9341x3 = i10;
        this.f9345y3 = i11;
        this.f9291k3.setEnabled(i10 < i11);
        this.f9294l3.setEnabled(i10 > 0);
        this.f9297m3.setText(str);
        mq(false, true);
        Cr();
    }

    public final TdApi.Message[] mp() {
        int p10;
        k0.e<s4> eVar = this.C1;
        if (eVar == null || (p10 = eVar.p()) == 0) {
            return null;
        }
        TdApi.Message[] messageArr = new TdApi.Message[p10];
        for (int i10 = 0; i10 < p10; i10++) {
            messageArr[i10] = this.C1.q(i10).Y3(this.C1.j(i10));
        }
        return messageArr;
    }

    public final boolean mq(boolean z10, boolean z11) {
        boolean z12 = this.f9325t3;
        if (z12 == z10 && z11) {
            return false;
        }
        this.f9325t3 = z10;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z11) {
            if (this.f9329u3 == null) {
                this.f9329u3 = new eb.k(11, this, db.b.f7287b, 90L, this.f9333v3);
            }
            this.f9329u3.i(f10);
        } else {
            eb.k kVar = this.f9329u3;
            if (kVar != null) {
                kVar.l(f10);
            }
            lq(f10);
        }
        return z12 != z10;
    }

    public final void mr() {
        if (this.N2) {
            qj();
        } else {
            Bo();
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 1) {
            qq(f10);
        } else if (i10 == 6) {
            this.O0.setAlpha(ib.h.d(f10));
            cj();
        } else if (i10 != 7) {
            switch (i10) {
                case 9:
                    nq(f10);
                    return;
                case 10:
                    iq(f10);
                    return;
                case 11:
                    lq(f10);
                    return;
                case 12:
                    sr();
                    return;
                default:
                    return;
            }
        } else {
            aq(f10);
        }
    }

    public final void nj(boolean z10) {
        oj(false, z10);
    }

    public vc.v2 nk() {
        return this.f9338x0;
    }

    public void no() {
        if (mq(true, true)) {
            this.f9345y3 = -1;
            this.f9341x3 = -1;
        }
    }

    public void np(final TdApi.InputMessageContent inputMessageContent, final boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, final kb.j<TdApi.Message> jVar) {
        if (Ek()) {
            Lo(z11, messageSchedulingState, new hj.o() {
                @Override
                public final void a(boolean z12, TdApi.MessageSchedulingState messageSchedulingState2, boolean z13) {
                    rh.this.vn(z10, inputMessageContent, jVar, z12, messageSchedulingState2, z13);
                }
            });
        }
    }

    public final void nq(float f10) {
        if (this.S2 != f10) {
            this.S2 = f10;
            float f11 = f10 * 0.5f;
            float f12 = 0.5f + f11;
            this.G0.setAlpha(f10);
            this.G0.setScaleX(f12);
            this.G0.setScaleY(f12);
            float f13 = 1.0f - f11;
            this.D0.setAlpha(1.0f - f10);
            this.D0.setScaleX(f13);
            this.D0.setScaleY(f13);
            x2.l lVar = this.f9331v1;
            if (lVar != null && lVar.L()) {
                this.f9331v1.U();
            }
        }
    }

    public final void nr() {
    }

    @Override
    public boolean o0(final View view, final dd.l lVar, final boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        if ((this.P2 != 0 && SystemClock.uptimeMillis() - this.P2 < 200) || Tq(view)) {
            return false;
        }
        Lo(z10, messageSchedulingState, new hj.o() {
            @Override
            public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState2, boolean z12) {
                rh.this.cn(view, lVar, z10, z11, messageSchedulingState2, z12);
            }
        });
        return true;
    }

    @Override
    public void o3(final boolean z10) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && ob.a.i(chat.f19908id)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(t(), ae.j.t());
            builder.setTitle(gd.w.i1(R.string.ShareYourLocation));
            builder.setMessage(gd.w.i1(R.string.ShareYouLocationInfo));
            builder.setPositiveButton(gd.w.P0(), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    rh.this.Zm(z10, dialogInterface, i10);
                }
            });
            builder.setNegativeButton(gd.w.i1(R.string.Cancel), fh.f7963a);
            Sd(builder);
        }
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        if (i10 != 1) {
            if (i10 == 12 && f10 == 0.0f) {
                this.G1 = 0;
            }
        } else if (f10 == 0.0f) {
            wo();
        }
    }

    @Override
    public void o6() {
        super.o6();
        Ri();
        So();
        this.f9338x0.Y2(false);
        if (this.B0) {
            ce.j0.F0(this, 200L);
        }
    }

    @Override
    public View oc(Context context) {
        int i10 = 1;
        this.f9261a3 = true;
        if (!Ua()) {
            ce.j0.l0(ce.j0.r(context), 18);
        }
        vc.k1 k1Var = new vc.k1(context);
        this.f9326u0 = k1Var;
        k1Var.setController(this);
        this.f9326u0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        vc.f fVar = new vc.f(context, this.f24495b, this);
        this.f9318s0 = fVar;
        fVar.setPhotoOpenCallback(this);
        int i11 = this.f9283i1;
        if (i11 == 3) {
            this.f9318s0.setForcedSubtitle(gd.w.Z1(gd.w.i1(R.string.EventLogAllEvents)));
        } else if (i11 != 4) {
            if (i11 == 5) {
                ud.s sVar = new ud.s(context);
                this.f9322t0 = sVar;
                sVar.setThemedTextColor(this);
                this.f9322t0.A1(ce.a0.i(12.0f), true);
                this.f9322t0.setTitle(X9());
                if (((c0) w9()).f9372q.document != null) {
                    this.f9322t0.setSubtitle(ce.c0.m(((c0) w9()).f9372q.document.document.size));
                } else if (((c0) w9()).f9372q.type.getConstructor() == 1290213117) {
                    this.f9322t0.setSubtitle(gd.w.i1(R.string.ChatBackgroundTypePattern));
                } else if (((c0) w9()).f9372q.type.getConstructor() == 993008684) {
                    TdApi.BackgroundTypeFill backgroundTypeFill = (TdApi.BackgroundTypeFill) ((c0) w9()).f9372q.type;
                    int constructor = backgroundTypeFill.fill.getConstructor();
                    if (constructor == -1839206017) {
                        this.f9322t0.setSubtitle(gd.w.i1(R.string.ChatBackgroundTypeGradient));
                    } else if (constructor == -1145469255) {
                        this.f9322t0.setSubtitle(gd.w.i1(R.string.ChatBackgroundTypeMulticolor));
                    } else if (constructor == 1010678813) {
                        this.f9322t0.setSubtitle(gd.w.i1(R.string.ChatBackgroundTypeSolid));
                    } else {
                        throw new UnsupportedOperationException(backgroundTypeFill.fill.toString());
                    }
                }
            }
            if (this.f9299n1) {
                this.f9318s0.setForcedSubtitle(gd.w.Z1(gd.w.i1(hl() ? R.string.Reminders : R.string.ScheduledMessages)));
            } else {
                this.f9318s0.setCallback(this);
            }
        } else if (this.f9289k1 == null && this.f9292l1 == null) {
            this.f9318s0.setForcedSubtitle(gd.w.j1(R.string.FoundMessagesQuery, this.f9286j1));
            this.f9318s0.setCallback(this);
        } else {
            Dr();
        }
        this.f9318s0.s1(this, true);
        vc.m4 m4Var = new vc.m4(context, this.f9338x0, this.f24495b);
        this.V0 = m4Var;
        int i12 = this.f9283i1;
        if (i12 == 5) {
            m4Var.j(new ae.h(this.f24495b, ((c0) w9()).f9372q));
        } else {
            m4Var.k(i12 == 1);
        }
        this.V0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        t8(this.V0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, R.id.msg_bottom);
        MessagesLayoutManager messagesLayoutManager = new MessagesLayoutManager(context, 1, true);
        messagesLayoutManager.L2(this.f9338x0);
        this.f9334w0 = (MessagesRecyclerView) p0.v(t(), R.layout.recycler_messages, this.f9326u0);
        if (Ua()) {
            this.f9334w0.setVerticalScrollBarEnabled(false);
        }
        t8(this.f9334w0);
        this.f9334w0.setId(R.id.msg_list);
        this.f9334w0.setManager(this.f9338x0);
        this.f9334w0.setController(this);
        this.f9334w0.setHasFixedSize(true);
        this.f9334w0.setLayoutManager(messagesLayoutManager);
        this.f9334w0.setLayoutParams(layoutParams);
        p0.e0(this.f9334w0);
        this.f9338x0.V1(context, this.f9334w0, messagesLayoutManager);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        k kVar = new k(context);
        this.f9330v0 = kVar;
        kVar.setId(R.id.msg_bottom);
        this.f9330v0.setOrientation(1);
        this.f9330v0.setMinimumHeight(ce.a0.i(49.0f));
        this.f9330v0.setLayoutParams(layoutParams2);
        if (this.f9283i1 == 0 && !Ua()) {
            u uVar = new u(context, this.f24495b);
            this.f9346z0 = uVar;
            uVar.setIsSecret(he.i.c2().a3(this.f9310q0));
            this.f9346z0.setId(R.id.msg_input);
            this.f9346z0.setTextColor(ae.j.P0());
            w8(this.f9346z0.getPlaceholderPaint(), R.id.theme_color_textPlaceholder);
            z8(this.f9346z0, R.id.theme_color_text);
            this.f9346z0.setHintTextColor(ae.j.U0());
            s8(this.f9346z0, R.id.theme_color_textPlaceholder);
            this.f9346z0.setLinkTextColor(ae.j.S0());
            u8(this.f9346z0, R.id.theme_color_textLink);
            yd.g.i(this.f9346z0, R.id.theme_color_filling, this);
            this.f9346z0.setHighlightColor(ae.j.z());
            r8(this.f9346z0, R.id.theme_color_textSelectionHighlight);
            Q8(this.f9346z0.u0(this));
            if (this.f9280h1) {
                this.f9346z0.setEnabled(false);
                this.f9346z0.w0(R.string.Message, new Object[0]);
            }
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, ce.a0.i(48.0f));
        layoutParams3.addRule(6, R.id.msg_bottom);
        s3 s3Var = new s3(t(), this.f24495b);
        this.V1 = s3Var;
        yd.g.i(s3Var, R.id.theme_color_filling, this);
        this.V1.setId(R.id.msg_bottomReply);
        this.V1.z1(this, this);
        this.V1.setOnClickListener(this);
        this.V1.setLayoutParams(layoutParams3);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(10);
        layoutParams4.addRule(6, R.id.msg_bottom);
        i0 i0Var = new i0(context);
        this.W1 = i0Var;
        i0Var.setLayoutParams(layoutParams4);
        this.W1.setTotalHeightChangeListener(new i0.d() {
            @Override
            public final void a(i0 i0Var2) {
                rh.this.qm(i0Var2);
            }
        });
        int i13 = ce.a0.i(36.0f);
        v vVar = new v(context);
        this.f9348z2 = vVar;
        vVar.setLayoutParams(FrameLayoutFix.q1(-1, i13));
        t8(this.f9348z2);
        int i14 = ce.a0.i(36.0f);
        y3 y3Var = new y3(context);
        this.X1 = y3Var;
        y3Var.setDismissListener(new y3.b() {
            @Override
            public final void a(y3 y3Var2) {
                rh.this.rm(y3Var2);
            }
        });
        this.X1.setLayoutParams(new FrameLayout.LayoutParams(-1, i14));
        this.X1.A1(this);
        int i15 = ce.a0.i(48.0f);
        m0 m0Var = new m0(context, this.f24495b);
        this.f9269d2 = m0Var;
        m0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, i15));
        this.f9269d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                rh.this.sm(view);
            }
        });
        this.f9269d2.setOnDismissRunnable(new Runnable() {
            @Override
            public final void run() {
                rh.this.tm();
            }
        });
        this.f24495b.tc().d(this);
        yd.d.h(this.f9269d2, this);
        p0.T(this.f9269d2);
        this.Z1 = new n0(context, this.f24495b);
        this.f9260a2 = new w();
        this.Z1.setTextSize(15.0f);
        y8(this.Z1);
        yd.g.i(this.Z1, R.id.theme_color_filling, this);
        this.Z1.setTextColorId(R.id.theme_color_text);
        this.Z1.setPadding(ce.a0.i(16.0f), ce.a0.i(8.0f), ce.a0.i(16.0f), ce.a0.i(8.0f));
        this.Z1.setHeightChangeListener(new n0.b() {
            @Override
            public final void a(n0 n0Var, int i16) {
                rh.this.um(n0Var, i16);
            }
        });
        x xVar = new x(context);
        this.f9263b2 = xVar;
        xVar.setAnimationsDisabled(true);
        this.f9263b2.r(this);
        this.f9263b2.setMessageListener(new y(context));
        z zVar = new z();
        this.f9266c2 = zVar;
        i0 i0Var2 = this.W1;
        i0.e eVar = new i0.e(this.f9269d2, i15);
        this.f9272e2 = eVar;
        i0.e eVar2 = new i0.e(this.f9348z2, i13);
        this.A2 = eVar2;
        i0.e eVar3 = new i0.e(this.X1, i14);
        this.Y1 = eVar3;
        i0Var2.E1(new i0.c[]{zVar, eVar, eVar2, eVar3, this.f9260a2}, this);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ce.a0.i(118.0f), ce.a0.i(74.0f));
        layoutParams5.addRule(11);
        layoutParams5.addRule(2, R.id.msg_bottom);
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.P0 = frameLayoutFix;
        frameLayoutFix.setLayoutParams(layoutParams5);
        aq(0.0f);
        int i16 = ce.a0.i(4.0f);
        int i17 = i16 * 2;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1((ce.a0.i(24.0f) * 2) + i17, (ce.a0.i(24.0f) * 2) + i17, 85);
        int i18 = ce.a0.i(16.0f) - i16;
        layoutParams5.bottomMargin = i18;
        layoutParams5.rightMargin = i18;
        ne.c0 c0Var = new ne.c0(context);
        this.R0 = c0Var;
        c0Var.setId(R.id.btn_mention);
        this.R0.setOnClickListener(this);
        this.R0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean vm;
                vm = rh.this.vm(view);
                return vm;
            }
        });
        t8(this.R0);
        this.R0.d(R.drawable.baseline_alternate_email_24, 48.0f, 4.0f, R.id.theme_color_circleButtonChat, R.id.theme_color_circleButtonChatIcon);
        this.R0.setLayoutParams(r12);
        this.P0.addView(this.R0);
        int i19 = ce.a0.i(24.0f);
        FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(r12.width + i19, -2, 85);
        r13.bottomMargin = (ce.a0.i(24.0f) * 2) - (ce.a0.i(28.0f) / 2);
        vc.h hVar = new vc.h(context);
        this.T0 = hVar;
        hVar.setLayoutParams(r13);
        this.T0.setPadding(i19, 0, 0, 0);
        t8(this.T0);
        this.P0.addView(this.T0);
        this.R0.setTag(this.T0);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(ce.a0.i(118.0f), ce.a0.i(74.0f));
        layoutParams6.addRule(11);
        layoutParams6.addRule(2, R.id.msg_bottom);
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        this.O0 = frameLayoutFix2;
        frameLayoutFix2.setLayoutParams(layoutParams6);
        this.O0.setAlpha(0.0f);
        if (Ua()) {
            this.O0.setTranslationY((-ce.a0.i(16.0f)) + ce.a0.i(4.0f));
        }
        FrameLayout.LayoutParams r14 = FrameLayoutFix.r1((ce.a0.i(24.0f) * 2) + i17, (ce.a0.i(24.0f) * 2) + i17, 85);
        int i20 = ce.a0.i(16.0f) - i16;
        layoutParams6.bottomMargin = i20;
        layoutParams6.rightMargin = i20;
        ne.c0 c0Var2 = new ne.c0(t());
        this.Q0 = c0Var2;
        c0Var2.setId(R.id.btn_scroll);
        this.Q0.setOnClickListener(this);
        this.Q0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean pm;
                pm = rh.this.pm(view);
                return pm;
            }
        });
        t8(this.Q0);
        this.Q0.d(R.drawable.baseline_arrow_downward_24, 48.0f, 4.0f, R.id.theme_color_circleButtonChat, R.id.theme_color_circleButtonChatIcon);
        this.Q0.setLayoutParams(r14);
        this.O0.addView(this.Q0);
        FrameLayout.LayoutParams r15 = FrameLayoutFix.r1(r14.width + i19, -2, 85);
        r15.bottomMargin = (ce.a0.i(24.0f) * 2) - (ce.a0.i(28.0f) / 2);
        vc.h hVar2 = new vc.h(context);
        this.S0 = hVar2;
        hVar2.setPadding(i19, 0, 0, 0);
        this.S0.setLayoutParams(r15);
        t8(this.S0);
        this.O0.addView(this.S0);
        this.Q0.setTag(this.S0);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, ce.a0.i(1.0f));
        layoutParams7.addRule(2, R.id.msg_bottom);
        d3 e10 = d3.e(context, layoutParams7, false);
        this.A0 = e10;
        e10.a();
        t8(this.A0);
        this.A0.setId(R.id.msg_bottomShadow);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(ce.a0.i(55.0f), ce.a0.i(49.0f));
        layoutParams8.addRule(10);
        if (gd.w.G2()) {
            layoutParams8.addRule(11);
        } else {
            layoutParams8.addRule(9);
        }
        ImageView imageView = new ImageView(context);
        this.E0 = imageView;
        imageView.setId(R.id.msg_emoji);
        this.E0.setScaleType(ImageView.ScaleType.CENTER);
        this.E0.setImageResource(z0.V1(true));
        this.E0.setColorFilter(ae.j.o0());
        q8(this.E0, R.id.theme_color_icon);
        this.E0.setOnClickListener(this);
        this.E0.setLayoutParams(layoutParams8);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, ce.a0.i(49.0f));
        layoutParams9.addRule(10);
        if (gd.w.G2()) {
            layoutParams9.addRule(9);
        } else {
            layoutParams9.addRule(11);
        }
        a0 a0Var = new a0(context);
        this.D0 = a0Var;
        a0Var.setOrientation(0);
        this.D0.setLayoutParams(layoutParams9);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(ce.a0.i(47.0f), ce.a0.i(49.0f));
        ee.a aVar = new ee.a(context, this);
        aVar.setId(R.id.msg_attach);
        aVar.setScaleType(ImageView.ScaleType.CENTER);
        aVar.setImageResource(R.drawable.deproko_baseline_attach_26);
        aVar.setColorFilter(ae.j.o0());
        q8(aVar, R.id.theme_color_icon);
        aVar.setOnClickListener(this);
        aVar.setLayoutParams(layoutParams10);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(ce.a0.i(47.0f), ce.a0.i(49.0f));
        ee.a aVar2 = new ee.a(context, this);
        this.I0 = aVar2;
        aVar2.setId(R.id.btn_camera);
        this.I0.setScaleType(ImageView.ScaleType.CENTER);
        this.I0.setImageResource(R.drawable.deproko_baseline_camera_26);
        this.I0.setColorFilter(ae.j.o0());
        q8(this.I0, R.id.theme_color_icon);
        this.I0.setOnClickListener(this);
        this.I0.setLayoutParams(layoutParams11);
        if (!this.f9299n1) {
            LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(ce.a0.i(47.0f), ce.a0.i(49.0f));
            ee.a aVar3 = new ee.a(context, this);
            this.J0 = aVar3;
            aVar3.setId(R.id.btn_viewScheduled);
            this.J0.setScaleType(ImageView.ScaleType.CENTER);
            this.J0.setImageResource(R.drawable.baseline_date_range_24);
            this.J0.setColorFilter(ae.j.o0());
            q8(this.J0, R.id.theme_color_icon);
            this.J0.setOnClickListener(this);
            this.J0.setLayoutParams(layoutParams12);
        }
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(ce.a0.i(47.0f), ce.a0.i(49.0f));
        j0 j0Var = new j0(context);
        this.K0 = j0Var;
        j0Var.setId(R.id.msg_command);
        this.K0.setColorFilter(ae.j.o0());
        q8(this.K0, R.id.theme_color_icon);
        this.K0.setScaleType(ImageView.ScaleType.CENTER);
        this.K0.setOnClickListener(this);
        this.K0.setVisibility(4);
        this.K0.setLayoutParams(layoutParams13);
        p0.T(this.K0);
        ur(0);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(ce.a0.i(47.0f), ce.a0.i(49.0f));
        layoutParams14.rightMargin = ce.a0.i(2.0f);
        e4 e4Var = new e4(context);
        this.F0 = e4Var;
        e4Var.setPadding(0, 0, ce.a0.i(2.0f), 0);
        this.F0.setHasTouchControls(true);
        t8(this.F0);
        this.F0.setLayoutParams(layoutParams14);
        this.D0.addView(this.K0);
        v3 v3Var = this.L0;
        if (v3Var != null) {
            this.D0.addView(v3Var);
        }
        j0 j0Var2 = this.J0;
        if (j0Var2 != null) {
            this.D0.addView(j0Var2);
        }
        j0 j0Var3 = this.I0;
        if (j0Var3 != null) {
            this.D0.addView(j0Var3);
        }
        this.D0.addView(aVar);
        this.D0.addView(this.F0);
        this.D0.a();
        RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(ce.a0.i(55.0f), ce.a0.i(49.0f));
        layoutParams15.addRule(10);
        if (gd.w.G2()) {
            layoutParams15.addRule(9);
        } else {
            layoutParams15.addRule(11);
        }
        c3 c3Var = new c3(context, this.f9299n1 ? R.drawable.baseline_schedule_24 : R.drawable.deproko_baseline_send_24);
        this.G0 = c3Var;
        c3Var.setOnClickListener(this);
        t8(this.G0);
        this.G0.setId(R.id.msg_send);
        this.G0.setVisibility(4);
        this.G0.setAlpha(0.0f);
        this.G0.setLayoutParams(layoutParams15);
        this.H0 = new ie.c0(this, this, Ba(), null).d(this.G0);
        if (this.f9280h1) {
            int i21 = this.f9283i1;
            if (i21 == 0) {
                this.f9330v0.addView(this.f9346z0);
            } else if (i21 == 1) {
                k4 k4Var = new k4(context);
                this.W0 = k4Var;
                k4Var.setLayoutManager(new LinearLayoutManager(context, 0, gd.w.G2()));
                this.W0.setAdapter(new j4(this, ae.z.u().j(false).a()));
                this.W0.g(new b0());
                this.W0.setLayoutParams(new LinearLayout.LayoutParams(-1, ce.a0.i(105.0f) + (ce.a0.i(3.0f) * 2)));
                yd.g.i(this.W0, R.id.theme_color_filling, this);
                this.f9330v0.addView(this.W0);
            } else if (i21 == 2) {
                FrameLayoutFix frameLayoutFix3 = new FrameLayoutFix(context);
                frameLayoutFix3.setLayoutParams(new LinearLayout.LayoutParams(-1, ce.a0.i(49.0f)));
                yd.g.i(frameLayoutFix3, R.id.theme_color_filling, this);
                b2 b2Var = new b2(context);
                b2Var.setTextSize(1, 12.0f);
                b2Var.setText("T");
                b2Var.setTypeface(ce.o.g());
                b2Var.setTextColor(ae.j.R0());
                A8(b2Var);
                b2Var.setGravity(17);
                b2Var.setLayoutParams(FrameLayoutFix.r1(ce.a0.i(46.0f), -1, 3));
                frameLayoutFix3.addView(b2Var);
                b2 b2Var2 = new b2(context);
                b2Var2.setTextSize(1, 18.0f);
                b2Var2.setText("T");
                b2Var2.setGravity(17);
                b2Var2.setPadding(0, 0, 0, ce.a0.i(1.0f));
                b2Var2.setTypeface(ce.o.g());
                b2Var2.setTextColor(ae.j.R0());
                A8(b2Var2);
                b2Var2.setLayoutParams(FrameLayoutFix.r1(ce.a0.i(46.0f), -1, 5));
                frameLayoutFix3.addView(b2Var2);
                p1 p1Var = new p1(context);
                this.X0 = p1Var;
                t8(p1Var);
                this.X0.h(true, false);
                this.X0.setValueCount(he.i.S.length);
                yr(this.X0);
                this.X0.setListener(new a());
                this.X0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
                this.X0.setForceBackgroundColorId(R.id.theme_color_sliderInactive);
                this.X0.setPadding(b2Var2.getLayoutParams().width, 0, b2Var2.getLayoutParams().width, 0);
                this.X0.g(R.id.theme_color_sliderActive, false);
                frameLayoutFix3.addView(this.X0);
                this.f9330v0.addView(frameLayoutFix3);
            } else if (i21 == 5) {
                yd.g.i(this.W0, R.id.theme_color_filling, this);
            }
        } else {
            vc.h0 h0Var = this.f9346z0;
            if (h0Var != null) {
                this.f9330v0.addView(h0Var);
            }
        }
        if (Wk()) {
            TdApi.Background background = ((c0) x9()).f9372q;
            ae.h I = this.f24495b.tc().I(ae.j.g0());
            if (!Xk() || (background != null && background.type.getConstructor() == 1972128891)) {
                int i22 = ce.a0.i(49.0f);
                this.N0 = new ne.m4(context);
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-1, i22);
                layoutParams16.addRule(2, R.id.msg_bottom);
                this.N0.setLayoutParams(layoutParams16);
                vc.m4 m4Var2 = new vc.m4(context, this.f9338x0, this.f24495b);
                this.M0 = m4Var2;
                m4Var2.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                this.M0.setAlpha(0.0f);
                if (!Xk() || background == null) {
                    this.N0.f(I, new c(i22));
                    boolean z10 = !this.N0.h();
                    this.M0.j(ae.h.f0(this.f24495b, I, z10));
                    this.M0.setSelfBlur(z10);
                    this.V0.setSelfBlur(!z10);
                    this.N0.k(I != null && I.a0(), false);
                    if (I != null && I.a0()) {
                        this.f9334w0.setTranslationY(-i22);
                    }
                } else {
                    this.N0.g(background, new b());
                    this.M0.j(new ae.h(this.f24495b, background, !this.N0.h()));
                    this.f9334w0.setTranslationY(-i22);
                }
            }
        }
        RelativeLayout.LayoutParams layoutParams17 = new RelativeLayout.LayoutParams(-1, ce.a0.i(48.0f));
        layoutParams17.addRule(12);
        d dVar = new d(context, this.f24495b);
        this.F1 = dVar;
        dVar.setOnClickListener(this);
        this.F1.setLayoutParams(layoutParams17);
        t8(this.F1);
        sr();
        if (this.f9283i1 == 5) {
            Mq(5, 0L, false);
            this.A0.setVisibility(8);
        }
        this.f9326u0.addView(this.V0);
        vc.m4 m4Var3 = this.M0;
        if (m4Var3 != null) {
            this.f9326u0.addView(m4Var3);
        }
        if (!this.f9280h1) {
            this.f9326u0.addView(this.V1);
        }
        this.f9326u0.addView(this.f9330v0);
        this.f9326u0.addView(this.f9334w0);
        this.f9326u0.addView(this.A0);
        this.f9326u0.addView(this.W1);
        this.f9326u0.addView(this.F1);
        this.f9326u0.addView(this.O0);
        this.f9326u0.addView(this.P0);
        if (this.f9283i1 == 0) {
            this.f9326u0.addView(this.E0);
            this.f9326u0.addView(this.D0);
            this.f9326u0.addView(this.G0);
            Yk();
            this.f9326u0.addView(this.f9279g3);
            qi();
        }
        ne.m4 m4Var4 = this.N0;
        if (m4Var4 != null) {
            this.f9326u0.addView(m4Var4, 2);
        }
        Ir();
        t1.b().a(this);
        if (!fo()) {
            return this.f9326u0;
        }
        z4 z4Var = new z4(context);
        this.f9259a1 = z4Var;
        t8(z4Var.getTopView());
        FrameLayout.LayoutParams layoutParams18 = (FrameLayout.LayoutParams) this.f9259a1.getRecyclerView().getLayoutParams();
        layoutParams18.leftMargin = ce.a0.i(56.0f);
        layoutParams18.rightMargin = ce.a0.i(56.0f);
        this.f9259a1.getTopView().setOnItemClickListener(this);
        t8(this.f9259a1.getTopView());
        ArrayList<j10> arrayList = new ArrayList(8);
        so.mj(arrayList, t(), c());
        String[] strArr = new String[arrayList.size() + 1];
        strArr[0] = gd.w.i1(R.string.TabMessages).toUpperCase();
        int i23 = 1;
        for (j10 j10Var : arrayList) {
            strArr[i23] = j10Var.X9().toString().toUpperCase();
            i23++;
        }
        this.f9259a1.getTopView().setItems(strArr);
        this.Y0 = new d0(this, arrayList);
        e eVar4 = new e(context);
        this.Z0 = eVar4;
        eVar4.setOffscreenPageLimit(1);
        v2 v2Var = this.Z0;
        if (!fd.a.f11879a) {
            i10 = 2;
        }
        v2Var.setOverScrollMode(i10);
        this.Z0.c(this);
        this.Z0.setAdapter(this.Y0);
        this.Z0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        FrameLayoutFix frameLayoutFix4 = new FrameLayoutFix(context);
        frameLayoutFix4.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        frameLayoutFix4.addView(this.Z0);
        return frameLayoutFix4;
    }

    public final void oj(boolean z10, boolean z11) {
        if (this.f9300n2) {
            ScrollView scrollView = this.f9316r2;
            if (scrollView != null) {
                scrollView.setVisibility(8);
            }
            if (this.f9304o2 && Ta()) {
                this.f9320s2.i(this.f9346z0);
            }
            this.f9300n2 = false;
            if (z10) {
                ur(R.drawable.deproko_baseline_bots_command_26);
                return;
            }
            ur(R.drawable.deproko_baseline_bots_keyboard_26);
            if (z11) {
                he.i c22 = he.i.c2();
                int A6 = this.f24495b.A6();
                TdApi.Chat chat = this.f9310q0;
                c22.h3(A6, chat.f19908id, chat.replyMarkupMessageId, true);
            }
        } else if (z10) {
            ur(R.drawable.deproko_baseline_bots_command_26);
        }
    }

    public final float ok() {
        float i10 = (-Vj()) - ((ce.a0.i(74.0f) - ce.a0.i(16.0f)) * this.O1.g());
        return Ua() ? i10 + (-ce.a0.i(16.0f)) + ce.a0.i(4.0f) : i10;
    }

    @Override
    public void onClick(View view) {
        ne.m4 m4Var;
        if (this.f9280h1) {
            int id2 = view.getId();
            if (id2 != R.id.btn_chatAction) {
                if (id2 == R.id.btn_help) {
                    x2.h d10 = t().I3().g(view).q(R.drawable.baseline_info_24).i(this).v(true).d();
                    o6 o6Var = this.f24495b;
                    d10.C(o6Var, o6Var.O6(this.f9310q0.f19908id) ? R.string.EventLogInfoDetailChannel : R.string.EventLogInfoDetail);
                } else if (id2 == R.id.btn_scroll) {
                    fp();
                }
            } else if (this.f9283i1 == 3) {
                Oo();
            }
        }
        switch (view.getId()) {
            case R.id.btn_applyWallpaper:
                TdApi.BackgroundType backgroundType = x9().f9372q.type;
                if (backgroundType.getConstructor() == 1972128891 && (m4Var = this.N0) != null) {
                    ((TdApi.BackgroundTypeWallpaper) backgroundType).isBlurred = m4Var.h();
                }
                c().v4().o(new TdApi.SetBackground(new TdApi.InputBackgroundRemote(x9().f9372q.f19903id), backgroundType, ae.j.x0()), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        rh.this.mm(object);
                    }
                });
                return;
            case R.id.btn_camera:
                if (!dr(view, R.id.right_sendMedia, R.string.ChatDisabledMedia, R.string.ChatRestrictedMedia, R.string.ChatRestrictedMediaUntil)) {
                    Nc(new v4.k().b(view).e(gl()));
                    return;
                }
                return;
            case R.id.btn_chatAction:
                Oo();
                return;
            case R.id.btn_follow:
                jl();
                return;
            case R.id.btn_mention:
                this.f9338x0.I2();
                return;
            case R.id.btn_mute:
                if (this.f9310q0 != null) {
                    this.f24495b.hd().X8(this, this.f9310q0.f19908id, false, null);
                    return;
                }
                return;
            case R.id.btn_openLinkedChat:
                Eo();
                return;
            case R.id.btn_scroll:
                fp();
                return;
            case R.id.btn_silent:
                if (this.f24495b.O6(this.f9310q0.f19908id)) {
                    this.f24495b.v4().o(new TdApi.ToggleChatDefaultDisableNotification(this.f9310q0.f19908id, this.L0.e()), this.f24495b.na());
                    int[] iArr = new int[2];
                    p0.u(this.f9330v0, iArr);
                    ce.j0.r0(this.L0.getIsSilent() ? R.string.ChannelNotifyMembersInfoOff : R.string.ChannelNotifyMembersInfoOn, 0, iArr[1] <= (ce.a0.f() / 2) + ce.a0.i(60.0f) ? -((this.f9326u0.getMeasuredHeight() - this.f9330v0.getTop()) + ce.a0.i(14.0f)) : 0);
                    if (this.f9346z0 != null) {
                        zr();
                        return;
                    }
                    return;
                }
                return;
            case R.id.btn_test:
                this.F1.Y0(R.id.btn_test_crash1, "try again", R.drawable.baseline_remove_circle_24, true);
                return;
            case R.id.btn_test_crash1:
                this.F1.Y0(R.id.btn_test, "test", R.drawable.baseline_warning_24, true);
                return;
            case R.id.btn_unpinAll:
                Hj();
                return;
            case R.id.btn_viewScheduled:
                Kr(false);
                return;
            case R.id.msg_attach:
                Jk();
                Fo(false);
                return;
            case R.id.msg_bottomReply:
                if (this.U1 != null) {
                    TdApi.Message message = this.U1;
                    Ok(new ob.d(message.chatId, message.f19946id));
                    return;
                }
                return;
            case R.id.msg_command:
                switch (this.f9296m2) {
                    case R.drawable.baseline_direction_arrow_down_24:
                    case R.drawable.baseline_keyboard_24:
                    case R.drawable.deproko_baseline_bots_keyboard_26:
                        lr();
                        return;
                    case R.drawable.deproko_baseline_bots_command_26:
                        oo();
                        return;
                    default:
                        return;
                }
            case R.id.msg_emoji:
                mr();
                return;
            case R.id.msg_send:
                if (Vn()) {
                    return;
                }
                if (cl()) {
                    ep(true);
                    return;
                } else if (this.f9299n1) {
                    this.f24495b.hd().L8(this, C9(), false, new hj.o() {
                        @Override
                        public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                            rh.this.nm(z10, messageSchedulingState, z11);
                        }
                    }, null);
                    return;
                } else {
                    op(null);
                    return;
                }
            default:
                return;
        }
    }

    public final void oo() {
        this.f9346z0.v0("/", true);
        ce.x.f(this.f9346z0);
    }

    public final void op(TdApi.MessageSchedulingState messageSchedulingState) {
        if (Fp(false, messageSchedulingState)) {
            return;
        }
        if (cl()) {
            ep(true);
        } else {
            Kp(true, false, messageSchedulingState);
        }
    }

    public final void oq(boolean z10, boolean z11) {
        if (this.T2.h() != z10 || !z11) {
            Jk();
            if (!this.T2.i()) {
                if (z10) {
                    Kj();
                } else {
                    Ij();
                }
            }
            this.T2.p(z10, z11 && Ta());
            Yq();
        }
    }

    public boolean or(long j10, s4 s4Var) {
        k0.e<s4> eVar = this.C1;
        if (eVar == null || s4Var == null || eVar.f(j10) == null) {
            return false;
        }
        un(j10, s4Var, -1.0f, -1.0f, false, 0);
        Er();
        return true;
    }

    @Override
    public void p1(boolean z10) {
        if (!this.T2.h()) {
            Nq(z10 ? R.string.HoldToVideo : R.string.HoldToAudio);
        }
    }

    @Override
    public void p2(boolean z10, boolean z11, boolean z12) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null && this.f24495b.M2(chat.f19908id)) {
            d6 d6Var = new d6(this.f24493a, this.f24495b);
            d6Var.kh(new d6.d(this.f9310q0.f19908id, this.f9295m1, this, z11, z12));
            ac(d6Var);
        }
    }

    @Override
    public void p3() {
        if (this.f9310q0 != null) {
            int i10 = 0;
            if (Uk()) {
                v4<?> Z9 = Z9();
                if (Z9 instanceof x4) {
                    x4 x4Var = (x4) Z9;
                    if (x4Var.dg() != 1) {
                        i10 = 1;
                    }
                    x4Var.j2(i10);
                    return;
                }
                return;
            }
            so soVar = new so(this.f24493a, this.f24495b);
            soVar.Ld(true);
            soVar.Hm(new so.m(this.f9310q0, this.f9295m1, false));
            ac(soVar);
        }
    }

    @Override
    public void p5(int i10) {
        if (i10 == -2 || i10 == -1) {
            k0.e<s4> eVar = this.C1;
            if (eVar != null) {
                int p10 = eVar.p();
                int i11 = 0;
                while (i11 < p10) {
                    this.C1.q(i11).p9(this.C1.j(i11), false, i10 == -1, -1.0f, -1.0f, i11 == p10 + (-1) ? this : null);
                    i11++;
                }
                lj();
            }
            d0 d0Var = this.Y0;
            if (d0Var != null) {
                int n10 = d0Var.O.n();
                for (int i12 = 0; i12 < n10; i12++) {
                    j10 j10Var = (j10) this.Y0.O.o(i12);
                    if (j10Var != null) {
                        j10Var.Eg(false);
                    }
                }
            }
            if (i10 == -1) {
                Y8();
            }
        }
        if (i10 == -2) {
            Ub();
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        zd.g0.h(this, j10, z10);
    }

    @Override
    public void pc() {
        super.pc();
        this.f9338x0.j2();
    }

    public final void pj() {
        TdApi.DraftMessage draftMessage;
        if (this.f9290k2 != null && (this.f9306p0 & 1) == 0) {
            vc.h0 h0Var = this.f9346z0;
            if (h0Var != null) {
                TdApi.Chat chat = this.f9310q0;
                h0Var.setDraft((chat == null || (draftMessage = chat.draftMessage) == null) ? null : draftMessage.inputMessageText);
                Up(1, false);
            }
            Tp(false, "");
            this.f9290k2 = null;
            vc.h0 h0Var2 = this.f9346z0;
            if (h0Var2 != null) {
                Fr(h0Var2.getInput(), true);
            }
            if (gr()) {
                Rq();
            } else if (this.U1 != null) {
                Sq();
            } else {
                vj();
            }
        }
    }

    public p7 pk() {
        return this.f9295m1;
    }

    public boolean po(hd.r rVar) {
        String str;
        if (!Li() || this.L1) {
            return false;
        }
        if (ob.a.i(C9())) {
            str = rVar.a0() + " ";
        } else {
            str = rVar.a0() + "@" + rVar.b0() + " ";
        }
        this.f9346z0.v0(str, true);
        ce.x.f(this.f9346z0);
        return true;
    }

    public final boolean pp(View view, final TdApi.Animation animation, boolean z10) {
        return wp(view, R.id.right_sendStickersAndGifs, R.string.ChatDisabledGifs, R.string.ChatRestrictedGifs, R.string.ChatRestrictedGifsUntil, z10, false, null, new kb.e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent E5;
                E5 = t2.E5(TdApi.Animation.this);
                return E5;
            }
        });
    }

    public void pq(Object obj) {
        this.f9323t1 = obj;
        this.f9319s1 = obj != null && Dq(obj);
    }

    public void pr(long j10) {
        this.f24495b.O9().q0(j10, this);
        this.f24495b.O9().x0(this);
        if (C9() == j10) {
            switch (this.f9310q0.type.getConstructor()) {
                case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                    this.f24495b.e2().p2(((TdApi.ChatTypeSupergroup) this.f9310q0.type).supergroupId, this);
                    return;
                case TdApi.ChatTypeSecret.CONSTRUCTOR:
                    this.f24495b.e2().r2(t2.n2(this.f9310q0), this);
                    this.f24495b.e2().o2(t2.b2(this.f9310q0), this);
                    return;
                case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                    this.f24495b.e2().n2(((TdApi.ChatTypeBasicGroup) this.f9310q0.type).basicGroupId, this);
                    return;
                case TdApi.ChatTypePrivate.CONSTRUCTOR:
                    this.f24495b.e2().r2(t2.n2(this.f9310q0), this);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void q2(final long j10, final boolean z10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Xl(j10, z10);
            }
        });
    }

    @Override
    public void q6(final boolean z10) {
        if (this.f9310q0 != null && ob.a.i(C9())) {
            AlertDialog.Builder builder = new AlertDialog.Builder(t(), ae.j.t());
            builder.setTitle(gd.w.i1(R.string.ShareYourPhoneNumberTitle));
            builder.setMessage(gd.w.j1(R.string.ShareYourPhoneNumberDesc, this.f24495b.W3(this.f9310q0)));
            builder.setPositiveButton(gd.w.P0(), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    rh.this.Xm(z10, dialogInterface, i10);
                }
            });
            builder.setNegativeButton(gd.w.i1(R.string.Cancel), qh.f9161a);
            Sd(builder);
        }
    }

    @Override
    public void qc() {
        v2 v2Var = this.Z0;
        if (v2Var != null) {
            v2Var.setPagingEnabled(false);
        }
    }

    public final void qi() {
        he.i.c2().t(this);
        t().Z0().I(this);
    }

    public final void qj() {
        rj(false);
    }

    public long qk() {
        p7 p7Var = this.f9295m1;
        if (p7Var != null) {
            return p7Var.g();
        }
        return 0L;
    }

    public boolean qo(s4 s4Var, String str) {
        String str2;
        if (!Li()) {
            return false;
        }
        if (!this.f24495b.b7(C9()) || !s4Var.z4().l()) {
            str2 = str + ' ';
        } else {
            str2 = str + '@' + s4Var.z4().j() + ' ';
        }
        this.f9346z0.v0(str2, true);
        ce.x.f(this.f9346z0);
        return true;
    }

    public void qp(final TdApi.Audio audio, final boolean z10) {
        if (Ek()) {
            Lo(false, null, new hj.o() {
                @Override
                public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
                    rh.this.xn(z10, audio, z11, messageSchedulingState, z12);
                }
            });
        }
    }

    public final void qq(float f10) {
        if (this.J2 != f10) {
            this.J2 = f10;
            float f11 = (0.2f * f10) + 0.8f;
            this.E2.setScaleX(f11);
            this.E2.setScaleY(f11);
            this.E2.setAlpha(Math.min(1.0f, Math.max(0.0f, f10)));
        }
    }

    public final void qr(CharSequence charSequence, int i10, boolean z10) {
        this.M1 = i10;
        this.K1.setEnabled(z10);
        this.K1.setTextColor(z10 ? ae.j.S0() : ae.j.P0());
        qd(this.K1);
        z8(this.K1, z10 ? R.id.theme_color_textLink : R.id.theme_color_text);
        p0.c0(this.K1, charSequence);
    }

    @Override
    public boolean r3(android.view.View r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: de.rh.r3(android.view.View, int):boolean");
    }

    @Override
    public void r4(int i10) {
        if (this.f9265c1 != i10) {
            this.f9265c1 = i10;
            Yi();
        }
    }

    @Override
    public void r5(final String str) {
        Lo(false, null, new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                rh.this.om(str, z10, messageSchedulingState, z11);
            }
        });
    }

    public final boolean ri() {
        return !gl() || he.i.c2().X2(2L) || he.i.c2().S2();
    }

    public final void rj(boolean z10) {
        if (this.N2) {
            z0 z0Var = this.C0;
            if (z0Var != null) {
                z0Var.setVisibility(8);
            }
            if (this.O2 && Ta() && !z10) {
                this.C0.P2(this.f9346z0);
            }
            Qp(false, true);
            this.E0.setImageResource(z0.V1(true));
        }
    }

    public MessagesRecyclerView rk() {
        return this.f9334w0;
    }

    public void ro() {
    }

    public void rp(final hd.r rVar) {
        Lo(false, null, new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                rh.this.yn(rVar, z10, messageSchedulingState, z11);
            }
        });
    }

    public final void rq(boolean z10) {
        if (this.H2 != z10) {
            this.H2 = z10;
            boolean z11 = this.E2.getParent() == null && z10;
            if (z11) {
                this.f9326u0.addView(this.E2);
            }
            si(z10 ? 1.0f : 0.0f, z11);
        }
    }

    public final void rr(boolean z10) {
        if (z10) {
            zr();
        }
        if (Ua()) {
            Xp(false, false);
        } else if (Uk()) {
            Xp(false, false);
            if (ti()) {
                Mq(3, 0L, z10);
            }
        } else {
            TdApi.ChatMemberStatus O3 = this.f24495b.O3(this.f9310q0.f19908id);
            if (this.f24495b.O6(this.f9310q0.f19908id) && O3 != null && !t2.H2(O3)) {
                Xp(false, false);
                if (t2.f3(O3)) {
                    Mq(1, 0L, z10);
                    return;
                }
                TdApi.SupergroupFullInfo h22 = this.f24495b.e2().h2(ob.a.p(this.f9310q0.f19908id));
                if (h22 != null) {
                    long j10 = h22.linkedChatId;
                    if (j10 != 0) {
                        Mq(4, j10, z10);
                        return;
                    }
                }
                Mq(2, 0L, z10);
            } else if (this.f24495b.i7(this.f9310q0.f19908id)) {
                Xp(false, false);
                Mq(2, 0L, z10);
            } else {
                Ik(z10);
                TdApi.SecretChat b42 = this.f24495b.b4(this.f9310q0.f19908id);
                if (b42 != null && !t2.D3(b42)) {
                    er(b42);
                } else if (this.f24495b.i3(this.f9310q0) && this.f24495b.B7(this.f9310q0)) {
                    Lq();
                } else if (this.f24495b.g4(this.f9310q0) || ((ob.a.g(this.f9310q0.f19908id) && (!this.f24495b.g3(this.f9310q0.f19908id) || t2.o3(O3))) || (this.f24495b.u7(this.f9310q0) && t2.o3(O3) && this.f9295m1 == null))) {
                    if (!this.f24495b.u7(this.f9310q0) || O3 == null || !t2.T(O3)) {
                        Jq();
                    } else {
                        Kq();
                    }
                } else if (!this.f24495b.M6(this.f9310q0) || this.f9310q0.lastMessage != null) {
                    CharSequence M5 = this.f24495b.M5(this.f9310q0);
                    if (M5 != null) {
                        Hq(M5, 6, false);
                    } else {
                        Fk();
                    }
                } else {
                    Eq();
                }
            }
        }
    }

    @Override
    public void s0(final TdApi.Supergroup supergroup) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.en(supergroup);
            }
        });
    }

    @Override
    public l1 s1(int i10, qd.b bVar) {
        d0 d0Var;
        j10 j10Var;
        int e02;
        View C;
        boolean fo = fo();
        if (!((fo && this.f9265c1 != 0) || (e02 = this.f9338x0.E0().e0(bVar)) == -1 || (C = this.f9338x0.N0().C(e02)) == null)) {
            RecyclerView.c0 l02 = this.f9334w0.l0(C);
            if ((l02 instanceof vc.j1) && vc.j1.T(l02.n())) {
                return this.f9338x0.E0().i0(e02).U3(bVar.d(), C, C.getTop(), this.f9334w0.getBottom() - C.getBottom(), C.getTop() + d1.a3(true) + ((int) this.f9334w0.getTranslationY()));
            }
        }
        if (!fo || this.f9265c1 != 1 || (d0Var = this.Y0) == null || (j10Var = (j10) d0Var.O.e(this.f9265c1)) == null || !(j10Var instanceof r10)) {
            return null;
        }
        ((r10) j10Var).s1(i10, bVar);
        return null;
    }

    @Override
    public void sc() {
        vc.h0 h0Var;
        o6 o6Var;
        super.sc();
        if (this.f9310q0 != null && !Ua()) {
            final TdApi.ChatSource N3 = this.f24495b.N3(this.f9314r0, this.f9310q0.f19908id);
            if (N3 != null && he.i.c2().Y2(N3)) {
                t().I3().g(this.f9318s0).i(this).z(true).j(true).w(true).v(true).q(R.drawable.baseline_info_24).d().D(this.f24495b, gd.w.A1(this, N3)).s(new kb.l() {
                    @Override
                    public final void a(long j10) {
                        rh.wm(TdApi.ChatSource.this, j10);
                    }
                }).G(10L, TimeUnit.SECONDS);
            }
            TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat = this.f9307p1;
            if (internalLinkTypeVideoChat != null) {
                Io(internalLinkTypeVideoChat);
                this.f9307p1 = null;
            }
        }
        Yq();
        if (!this.f9339x1 && !this.f9280h1 && !Ua()) {
            ya.o1().e0(this.f24495b.A6(), 4, new kb.i() {
                @Override
                public final void a(boolean z10) {
                    rh.this.xm(z10);
                }
            });
        }
        ce.j0.l0(this.f24493a, 18);
        if (!Tk() && (o6Var = this.f24495b) != null) {
            ((MainActivity) this.f24493a).t4(o6Var.A6());
        }
        d0 d0Var = this.Y0;
        if (d0Var != null && d0Var.M) {
            d0Var.M = false;
            d0Var.l();
        }
        if (this.f9346z0 != null && m12do()) {
            this.f9346z0.setTextChangedSinceChatOpened(false);
        }
        this.f9334w0.setMessageAnimatorEnabled(true);
        So();
        this.f9338x0.W2(true);
        long j10 = this.f9328u2;
        if (j10 != 0) {
            zo(j10, this.f9332v2, false, false);
            this.f9328u2 = 0L;
            this.f9332v2 = null;
        }
        if (this.f9330v0.getVisibility() == 0 && (h0Var = this.f9346z0) != null && h0Var.isEnabled() && !el()) {
            this.f9346z0.setEnabled(false);
            this.f9346z0.setEnabled(true);
        }
        vc.h0 h0Var2 = this.f9346z0;
        if (h0Var2 != null && h0Var2.isEnabled()) {
            this.f9346z0.requestFocus();
        }
        if (this.f9335w1) {
            Zk(true);
            this.f9335w1 = false;
        }
        wr(true);
        if (!this.f9280h1) {
            int te = te();
            if (te == 4 && (se(2) instanceof s5)) {
                b9(2);
                b9(1);
            } else if (te == 3 && (se(1) instanceof s5)) {
                b9(1);
            }
            c9(R.id.controller_call);
            v4<?> kd2 = kd();
            if ((kd2 instanceof o4) && ((o4) kd2).si()) {
                b9(te() - 2);
            }
        }
        ap();
        if (this.f9311q1) {
            this.f9311q1 = false;
            ce.x.f(this.f9346z0);
        }
    }

    @Override
    public boolean sd(Bundle bundle, String str) {
        int i10 = bundle.getInt(str + "type", 0);
        long j10 = bundle.getLong(str + "chat_id", 0L);
        TdApi.Chat R3 = this.f24495b.R3(j10);
        if (j10 != 0 && R3 == null) {
            return false;
        }
        c0 c0Var = null;
        TdApi.ChatList W = t2.W(bundle.getString(str + "chat_list", null));
        p7 l10 = p7.l(bundle, str + "thread");
        TdApi.SearchMessagesFilter V4 = t2.V4(bundle, str + "filter_");
        if (i10 == 0) {
            c0Var = new c0(this.f24495b, W, R3, l10, V4);
        } else if (i10 == 1) {
            ob.d dVar = null;
            int i11 = bundle.getInt(str + "mode", 0);
            long j11 = bundle.getLong(str + "message_id", 0L);
            long j12 = bundle.getLong(str + "message_chat_id", 0L);
            if (j11 != 0) {
                dVar = new ob.d(j12, j11);
            }
            c0Var = new c0(W, R3, l10, dVar, i11, V4);
        } else if (i10 == 2) {
            c0Var = new c0(bundle.getInt(str + "mode", 0), W, R3);
        } else if (i10 == 3) {
            c0Var = new c0(W, R3, bundle.getString(str + "query", null), t2.X4(bundle, str + "sender_"), V4);
        } else if (i10 == 4) {
            String string = bundle.getString(str + "query", null);
            TdApi.MessageSender X4 = t2.X4(bundle, str + "sender_");
            int i12 = bundle.getInt(str + "mode", 0);
            long j13 = bundle.getLong(str + "message_id", 0L);
            c0Var = new c0(W, R3, string, X4, V4, j13 != 0 ? new ob.d(bundle.getLong(str + "message_chat_id", 0L), j13) : null, i12);
        }
        if (c0Var == null) {
            return false;
        }
        super.sd(bundle, str);
        c0Var.f9366k = bundle.getBoolean(str + "scheduled", false);
        Lp(c0Var);
        return true;
    }

    public final void si(float f10, boolean z10) {
        if (this.I2 == null) {
            this.I2 = new eb.k(1, this, db.b.f7287b, 180L, this.J2);
        }
        if (f10 == 1.0f && this.J2 == 0.0f) {
            this.I2.B(db.b.f7291f);
            this.I2.y(210L);
        } else {
            this.I2.B(db.b.f7287b);
            this.I2.y(100L);
        }
        this.I2.j(f10, z10 ? this.E2 : null);
    }

    public final void sj() {
        k5.f fVar = this.f9336w2;
        if (fVar != null) {
            try {
                fVar.e();
            } catch (Throwable th) {
                Log.w("GoogleApiClient throws", th, new Object[0]);
            }
            this.f9336w2 = null;
        }
    }

    public float sk() {
        return this.f9262b1;
    }

    public void so(CharSequence charSequence) {
        ie.c0 c0Var = this.H0;
        if (c0Var != null) {
            c0Var.g();
        }
        z0 z0Var = this.C0;
        if (z0Var != null) {
            z0Var.r2(charSequence);
        }
        if (m12do() && Ta()) {
            dp();
        }
    }

    public void sp(final String str, final String str2) {
        Lo(false, null, new hj.o() {
            @Override
            public final void a(boolean z10, TdApi.MessageSchedulingState messageSchedulingState, boolean z11) {
                rh.this.zn(str2, str, z10, messageSchedulingState, z11);
            }
        });
    }

    public void sq(boolean z10) {
        if (this.f9310q0 != null) {
            Op(TdApi.ChatActionTyping.CONSTRUCTOR, z10, false);
        }
    }

    public final void sr() {
        if (this.F1 != null) {
            float g10 = this.I1.g();
            float g11 = this.O1.g();
            int i10 = ce.a0.i(48.0f);
            int i11 = 0;
            int d10 = eo() ? (int) (i10 * ib.h.d(this.f9337w3)) : 0;
            int i12 = (g10 > 1.0f ? 1 : (g10 == 1.0f ? 0 : -1));
            if (i12 != 0) {
                d10 += (int) (i10 * (1.0f - g10));
            }
            float f10 = d10;
            float i13 = ce.a0.i(74.0f) - ce.a0.i(16.0f);
            float i14 = (((-Vj()) - ce.a0.i(16.0f)) - i13) - (i13 * this.S1);
            this.F1.setCollapseFactor(g11);
            this.F1.setAlpha(1.0f - ((g11 * 1.0f) * (1.0f - g10)));
            int measuredWidth = (int) ((((this.F1.getMeasuredWidth() / 2.0f) - ce.a0.i(16.0f)) - (i10 / 2)) * g11);
            vc.d dVar = this.F1;
            if (!(i12 == 0 && g11 == 0.0f)) {
                f10 += (i14 - f10) * g11;
            }
            dVar.setTranslationY(f10);
            this.F1.setTranslationX(measuredWidth);
            if (g10 <= 0.0f) {
                i11 = 8;
            }
            if (this.F1.getVisibility() != i11) {
                this.F1.setVisibility(i11);
            }
        }
    }

    @Override
    public void t4(long j10, String[] strArr) {
        zd.g0.b(this, j10, strArr);
    }

    @Override
    public void t7(long j10, TdApi.ChatPermissions chatPermissions) {
        zd.g0.n(this, j10, chatPermissions);
    }

    @Override
    public void tc() {
        aj();
        Vi();
        Ri();
        k3 k3Var = this.f9263b2;
        if (k3Var != null) {
            k3Var.setAnimationsDisabled(!Ta());
        }
    }

    public boolean ti() {
        TdApi.SearchMessagesFilter searchMessagesFilter = this.f9292l1;
        return searchMessagesFilter != null && searchMessagesFilter.getConstructor() == 371805512;
    }

    public final void tj() {
        if ((this.f9306p0 & 1) == 0) {
            this.M2 = this.K2;
            if (this.f9290k2 != null) {
                Qq();
            } else if (this.U1 != null) {
                Sq();
            } else {
                vj();
            }
            this.f9346z0.setTextChangedSinceChatOpened(true);
        }
    }

    public float tk() {
        return get().getMeasuredWidth() * this.f9262b1;
    }

    public void to(long j10, int i10) {
        if (C9() != j10 || this.f9283i1 != 4) {
            return;
        }
        if (this.f9289k1 != null || this.f9292l1 != null) {
            Dr();
        }
    }

    public void tp(ld.l lVar, TdApi.MessageSendOptions messageSendOptions, boolean z10, boolean z11) {
        Cp(new ld.l[]{lVar}, false, messageSendOptions, z10, z11);
    }

    public final void tq(int i10, boolean z10) {
        if (i10 == 0 || (!this.f9280h1 && !Ua())) {
            this.S0.a(i10, true ^ this.f24495b.x3(C9()), z10 && this.O1.g() > 0.0f && Ta());
        }
    }

    public final void tr() {
        int top = this.f9330v0.getTop();
        vc.h0 h0Var = this.f9346z0;
        float bottom = (top + (h0Var != null ? h0Var.getBottom() : ce.a0.i(49.0f))) - ce.a0.i(49.0f);
        this.G0.setTranslationY(bottom);
        this.E0.setTranslationY(bottom);
        this.D0.setTranslationY(bottom);
        if (this.f9324t2 != bottom) {
            this.f9324t2 = bottom;
            vo();
            Ar();
        }
    }

    @Override
    public void u(final int i10, int i11, Intent intent) {
        final String U2;
        if (i11 == -1) {
            boolean z10 = false;
            if (i10 != 109) {
                switch (i10) {
                    case 100:
                        break;
                    case 101:
                    case 104:
                        Uri data = intent != null ? intent.getData() : null;
                        if (data != null) {
                            String U22 = v0.U2(data);
                            if (this.f9280h1) {
                                if (this.f9283i1 == 1) {
                                    this.f24495b.tc().s0(new ae.h(this.f24495b, U22), true, ae.j.g0());
                                    return;
                                }
                                return;
                            } else if (U22 != null && U22.endsWith(".webp")) {
                                Gp(U22, true, false, null);
                                return;
                            } else if (i10 == 104) {
                                yp(Collections.singletonList(U22), false, true, false, null);
                                return;
                            } else {
                                Bp(U22, 0, true);
                                return;
                            }
                        } else {
                            return;
                        }
                    case 102:
                        Uri data2 = intent.getData();
                        if (data2 != null && (U2 = v0.U2(data2)) != null) {
                            final long j10 = this.f9310q0.f19908id;
                            final boolean lo = lo();
                            final long ko = ko();
                            gd.l.a().b(new Runnable() {
                                @Override
                                public final void run() {
                                    rh.this.Rl(U2, j10, ko, lo);
                                }
                            });
                            return;
                        }
                        return;
                    case 103:
                        ak(this.f9340x2, this.f9336w2);
                        return;
                    default:
                        return;
                }
            }
            File O = ce.v.O();
            if (O != null) {
                if (!gl()) {
                    v0.m(O);
                }
                if (i10 == 109) {
                    z10 = true;
                }
                v0.R2(O, z10, new kb.j() {
                    @Override
                    public final void a(Object obj) {
                        rh.this.Ql(i10, (l) obj);
                    }
                });
            }
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        int i11 = 0;
        r1 = false;
        boolean z10 = false;
        int i12 = 0;
        switch (i10) {
            case R.id.menu_chat:
                ud.u0 K1 = d1Var.K1(linearLayout, R.id.menu_btn_viewScheduled, R.drawable.baseline_date_range_24, O9(), this, ce.a0.i(52.0f));
                if (!this.f24495b.l3(C9())) {
                    i11 = 8;
                }
                K1.setVisibility(i11);
                d1Var.a2(linearLayout, this);
                return;
            case R.id.menu_clear:
                d1Var.P1(linearLayout, this).setColorId(R.id.theme_color_headerLightIcon);
                return;
            case R.id.menu_gallery:
                d1Var.K1(linearLayout, R.id.menu_btn_gallery, R.drawable.baseline_image_24, O9(), this, ce.a0.i(52.0f));
                return;
            case R.id.menu_messageActions:
                int wa2 = wa();
                ud.u0 K12 = d1Var.K1(linearLayout, R.id.menu_btn_selectInBetween, R.drawable.baseline_toc_24, wa2, this, ce.a0.i(49.0f));
                K12.g(wa());
                K12.setTag(gd.w.i1(R.string.SelectMessagesInBetween));
                K12.setVisibility(8);
                ud.u0 K13 = d1Var.K1(linearLayout, R.id.menu_btn_send, R.drawable.baseline_send_24, wa2, this, ce.a0.i(52.0f));
                ?? Hi = Hi();
                K13.setVisibility(Hi != 0 ? 0 : 8);
                ud.u0 j22 = d1Var.j2(linearLayout, this, wa2);
                boolean Ki = Ki();
                j22.setVisibility(Ki ? 0 : 8);
                int i13 = Hi;
                if (Ki) {
                    i13 = Hi + 1;
                }
                ud.u0 d22 = d1Var.d2(linearLayout, this, wa2);
                boolean Ai = Ai();
                d22.setVisibility(Ai ? 0 : 8);
                int i14 = i13;
                if (Ai) {
                    i14 = i13 + 1;
                }
                ud.u0 W1 = d1Var.W1(linearLayout, this, wa2);
                boolean yi = yi();
                W1.setVisibility(yi ? 0 : 8);
                int i15 = i14;
                if (yi) {
                    i15 = i14 + 1;
                }
                int i16 = i15;
                ud.u0 K14 = d1Var.K1(linearLayout, R.id.menu_btn_clearCache, R.drawable.templarian_baseline_broom_24, wa2, this, ce.a0.i(52.0f));
                boolean vi = vi();
                K14.setVisibility(vi ? 0 : 8);
                if (vi) {
                    i16++;
                }
                ud.u0 K15 = d1Var.K1(linearLayout, R.id.menu_btn_unpinAll, R.drawable.deproko_baseline_pin_undo_24, wa2, this, ce.a0.i(52.0f));
                boolean Ji = Ji();
                K15.setVisibility(Ji ? 0 : 8);
                if (Ji) {
                    i16++;
                }
                ud.u0 f22 = d1Var.f2(linearLayout, this, wa2);
                boolean Ci = Ci();
                f22.setVisibility(Ci ? 0 : 8);
                if (Ci) {
                    i16++;
                }
                ud.u0 S1 = d1Var.S1(linearLayout, this, wa2);
                boolean xi = xi();
                S1.setVisibility(xi ? 0 : 8);
                if (xi) {
                    i16++;
                }
                ud.u0 K16 = d1Var.K1(linearLayout, R.id.menu_btn_report, R.drawable.baseline_report_24, wa2, this, ce.a0.i(52.0f));
                ud.u0 R1 = d1Var.R1(linearLayout, this, wa2);
                boolean wi = wi();
                R1.setVisibility(wi ? 0 : 8);
                if (wi) {
                    i16++;
                }
                ud.u0 Y1 = d1Var.Y1(linearLayout, this, wa2);
                boolean Ii = Ii();
                Y1.setVisibility(Ii ? 0 : 8);
                if (Ii) {
                    i16++;
                }
                if (!Bi(i16)) {
                    i12 = 8;
                }
                K16.setVisibility(i12);
                return;
            case R.id.menu_more:
                d1Var.a2(linearLayout, this);
                return;
            case R.id.menu_search:
                d1Var.g2(linearLayout, this);
                return;
            case R.id.menu_secretChat:
                h2 i22 = d1Var.i2(linearLayout, this);
                String m32 = this.f24495b.hd().m3(C9());
                if (gl() && this.f24495b.y6(this.f9310q0)) {
                    z10 = true;
                }
                i22.l(m32, z10);
                d1Var.a2(linearLayout, this);
                return;
            case R.id.menu_share:
                d1Var.K1(linearLayout, R.id.menu_btn_share, R.drawable.baseline_share_arrow_24, O9(), this, ce.a0.i(52.0f));
                return;
            default:
                return;
        }
    }

    @Override
    public boolean u3() {
        return true;
    }

    @Override
    public void u7(final long j10, TdApi.UserFullInfo userFullInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.fn(j10);
            }
        });
    }

    public boolean ui() {
        return this.f9299n1;
    }

    public void uj(final boolean z10) {
        this.f24495b.id(new Runnable() {
            @Override
            public final void run() {
                rh.this.ul(z10);
            }
        });
    }

    public float uk() {
        return this.f9287j2;
    }

    public void uo(long j10, long j11, TdApi.MessageContent messageContent) {
        TdApi.Message message = this.f9290k2;
        if (message == null || message.chatId != j10 || message.f19946id != j11) {
            return;
        }
        if (!message.canBeEdited) {
            pj();
            return;
        }
        TdApi.MessageContent messageContent2 = message.content;
        message.content = messageContent;
        this.V1.C1(message, gd.w.i1(R.string.EditMessage));
        this.f9290k2.content = messageContent2;
    }

    public void up(final TdApi.User user, final boolean z10, TdApi.MessageSendOptions messageSendOptions) {
        if (Ek()) {
            Lo(messageSendOptions.disableNotification, messageSendOptions.schedulingState, new hj.o() {
                @Override
                public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState, boolean z12) {
                    rh.this.An(z10, user, z11, messageSchedulingState, z12);
                }
            });
        }
    }

    public final void uq(final boolean z10) {
        this.f9340x2 = z10;
        this.f9344y2 = C9();
        if (t().o0(false) != 0) {
            t().L2(false, false, null);
            return;
        }
        try {
            if (this.f9336w2 == null) {
                f.a aVar = new f.a(t());
                aVar.a(g6.f.f12106a);
                k5.f c10 = aVar.c();
                this.f9336w2 = c10;
                c10.d();
            }
            g6.f.f12109d.a(this.f9336w2, new g.a().a(LocationRequest.b()).c(true).b()).c(new k5.l() {
                @Override
                public final void a(k5.k kVar) {
                    rh.this.Nn(z10, (g6.i) kVar);
                }
            });
        } catch (Throwable unused) {
            vq(z10, null);
        }
    }

    public final void ur(int i10) {
        if (i10 != 0) {
            if (this.K0.c(true)) {
                this.D0.a();
            }
            if (this.f9296m2 != i10) {
                this.f9296m2 = i10;
                this.K0.setImageResource(i10);
            }
        } else if (this.K0.c(false)) {
            this.D0.a();
        }
    }

    @Override
    public void v0(w6 w6Var, TdApi.User user, boolean z10, boolean z11) {
        r0.a(this, w6Var, user, z10, z11);
    }

    public final boolean vi() {
        d0 d0Var;
        if (this.f9265c1 != 0 && (d0Var = this.Y0) != null) {
            j10 j10Var = (j10) d0Var.O.e(this.f9265c1);
            return j10Var != null && j10Var.nf();
        } else if (this.C1 == null) {
            return false;
        } else {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < this.C1.p(); i11++) {
                s4 q10 = this.C1.q(i11);
                if (t2.M(q10.Y3(this.C1.j(i11)))) {
                    i10++;
                    z10 = z10 || q10.O2() > 0;
                }
            }
            return i10 > 1 || z10;
        }
    }

    public final void vj() {
        this.f9306p0 |= 1;
        if (this.U2) {
            dq(0.0f);
            this.V1.b0();
            this.f9306p0 &= -2;
            return;
        }
        Rp(true);
        final float uk = uk();
        ValueAnimator b10 = db.b.b();
        b10.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                rh.this.vl(uk, valueAnimator);
            }
        });
        b10.setInterpolator(db.b.f7287b);
        b10.setDuration(200L);
        b10.addListener(new i());
        b10.start();
    }

    public final float vk() {
        return this.f9287j2 * (1.0f - qa()) * this.V1.getLayoutParams().height;
    }

    public final void vo() {
        t().J3();
        this.f9338x0.l2();
    }

    public final boolean vp(View view, int i10, int i11, int i12, int i13, final kb.h hVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState, final kb.e<TdApi.InputMessageContent> eVar) {
        if (dr(view, i10, i11, i12, i13) || !Ek()) {
            return false;
        }
        Lo(z10, messageSchedulingState, new hj.o() {
            @Override
            public final void a(boolean z11, TdApi.MessageSchedulingState messageSchedulingState2, boolean z12) {
                rh.this.Bn(hVar, eVar, z11, messageSchedulingState2, z12);
            }
        });
        return true;
    }

    public final void vq(boolean z10, Location location) {
        if (C9() == this.f9344y2) {
            np(new TdApi.InputMessageLocation(new TdApi.Location(location.getLatitude(), location.getLongitude(), location.getAccuracy()), 0, v0.A0(location), 0), true, false, null, null);
            if (z10) {
                f1();
            }
        }
    }

    public void vr(boolean z10) {
        boolean Np = Np(!z10 || !ob.a.l(C9()));
        if (this.K0.c(z10) || Np) {
            this.D0.a();
        }
    }

    @Override
    public void w0(String str) {
        this.f9346z0.p0(str);
    }

    @Override
    public void w1(long j10, boolean z10) {
        zd.g0.c(this, j10, z10);
    }

    @Override
    public void w3(float f10, eb.k kVar) {
        if (this.D1 == kVar && this.E1 != f10) {
            this.E1 = f10;
            vc.i1 E0 = this.f9338x0.E0();
            int j02 = E0.j0();
            for (int i10 = 0; i10 < j02; i10++) {
                s4 i02 = E0.i0(i10);
                if (i02 != null) {
                    i02.e8();
                }
            }
        }
    }

    @Override
    public void w6(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        zd.g0.p(this, j10, chatPosition, z10, z11, z12);
    }

    @Override
    public boolean wc(boolean z10) {
        vc.g gVar;
        z0 z0Var;
        if (dl()) {
            int i10 = 4;
            int i11 = 0;
            this.f9330v0.setVisibility(z10 ? 4 : 0);
            d3 d3Var = this.A0;
            if (!z10) {
                i10 = 0;
            }
            d3Var.setVisibility(i10);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9334w0.getLayoutParams();
            int i12 = R.id.msg_bottom;
            layoutParams.addRule(2, z10 ? 0 : R.id.msg_bottom);
            this.f9334w0.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.O0.getLayoutParams();
            if (z10) {
                i12 = 0;
            }
            layoutParams2.addRule(2, i12);
            if (z10) {
                i11 = -1;
            }
            layoutParams2.addRule(12, i11);
            this.O0.setLayoutParams(layoutParams2);
        }
        if (!Ta()) {
            return super.wc(z10);
        }
        if (z10 && !S9()) {
            if (this.N2) {
                rj(true);
            }
            if (this.f9300n2) {
                nj(true);
            }
        }
        boolean wc2 = super.wc(z10);
        if (this.N2 && (z0Var = this.C0) != null) {
            z0Var.j(z10);
        }
        if (this.f9300n2 && (gVar = this.f9320s2) != null) {
            gVar.f(z10);
        }
        return wc2;
    }

    public final boolean wi() {
        d0 d0Var;
        if (this.f9265c1 == 0 || (d0Var = this.Y0) == null) {
            k0.e<s4> eVar = this.C1;
            if (eVar == null || eVar.p() == 0) {
                return false;
            }
            if (this.C1.p() == 1) {
                TdApi.Message Ak = Ak();
                return Ak.canBeSaved && t2.L(Ak);
            }
            for (int i10 = 0; i10 < this.C1.p(); i10++) {
                if (!this.C1.q(i10).Y3(this.C1.j(i10)).canBeSaved) {
                    return false;
                }
            }
            return !gl();
        }
        j10 j10Var = (j10) d0Var.O.e(this.f9265c1);
        return j10Var != null && j10Var.of();
    }

    public final void wj(boolean z10) {
        if (this.f9267c3) {
            this.f9267c3 = false;
            ej(!z10);
            if (z10) {
                this.f9276f3.K1();
                this.f9276f3.setAlpha(0.0f);
                this.f9276f3.setVisibility(8);
                return;
            }
            this.f9276f3.E1();
        }
    }

    public final float wk() {
        if (!eo() || this.f9337w3 == -1.0f) {
            return 0.0f;
        }
        return ce.a0.i(49.0f) * this.f9337w3;
    }

    public final void wo() {
        this.G2.h0(null);
        this.f9326u0.removeView(this.E2);
    }

    public final boolean wp(View view, int i10, int i11, int i12, int i13, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState, kb.e<TdApi.InputMessageContent> eVar) {
        return vp(view, i10, i11, i12, i13, z10 ? new kb.h() {
            @Override
            public final long get() {
                return rh.this.ko();
            }
        } : null, z11, messageSchedulingState, eVar);
    }

    public final void wq(boolean z10) {
        try {
            LocationManager locationManager = (LocationManager) t().getSystemService("location");
            boolean[] zArr = new boolean[1];
            l lVar = new l(r9, locationManager, zArr, z10);
            kb.b[] bVarArr = {new m(zArr, z10)};
            ce.j0.e0(bVarArr[0], 3000L);
            locationManager.requestLocationUpdates("gps", 1L, 0.0f, lVar);
            locationManager.requestLocationUpdates("network", 1L, 0.0f, lVar);
        } catch (SecurityException unused) {
            dk(z10, true, false);
        } catch (Throwable th) {
            Log.w("Error occured", th, new Object[0]);
            dk(z10, true, false);
        }
    }

    public final void wr(boolean z10) {
        TdApi.Chat chat = this.f9310q0;
        if (chat != null) {
            p7 p7Var = this.f9295m1;
            if (p7Var != null) {
                tq(p7Var.k() ? o6.A2 : 0, z10);
            } else {
                tq(chat.unreadCount, true);
                cq(this.f9310q0.unreadMentionCount);
            }
            int i10 = this.G1;
            if (i10 == 2) {
                Mq(i10, 0L, z10);
            }
        }
    }

    @Override
    public void x(int i10, float f10, int i11) {
        float f11 = i10 + f10;
        this.f9259a1.getTopView().setSelectionFactor(f11);
        if (this.f9262b1 != f11) {
            this.f9262b1 = f11;
            if (this.f9274f1) {
                this.f9274f1 = false;
                La();
            }
            Yi();
            aj();
            Vi();
        }
    }

    @Override
    public void x1(long j10) {
        i1.a(this, j10);
    }

    @Override
    public void x2(final TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.Nm(notificationSettingsScope);
            }
        });
    }

    @Override
    public void x5(final long j10, final long j11) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.hm(j10, j11);
            }
        });
    }

    @Override
    public int xa() {
        return R.id.menu_messageActions;
    }

    @Override
    public void xc() {
        this.f9338x0.f2();
        hp(null);
    }

    public final boolean xi() {
        d0 d0Var;
        if (this.f9265c1 == 0 || (d0Var = this.Y0) == null) {
            k0.e<s4> eVar = this.C1;
            if (eVar == null) {
                return false;
            }
            int p10 = eVar.p();
            for (int i10 = 0; i10 < p10; i10++) {
                TdApi.Message Y3 = this.C1.q(i10).Y3(this.C1.j(i10));
                if (Y3 == null || (!Y3.canBeDeletedForAllUsers && !Y3.canBeDeletedOnlyForSelf)) {
                    return false;
                }
            }
            return p10 > 0;
        }
        j10 j10Var = (j10) d0Var.O.e(this.f9265c1);
        return j10Var != null && j10Var.pf();
    }

    public void xj(boolean z10) {
        k3 k3Var = this.f9263b2;
        if (k3Var != null) {
            k3Var.q(z10);
        }
    }

    public float xk() {
        return this.E1;
    }

    public void xo(hd.p pVar) {
        this.f24495b.tb(pVar.b0(), C9(), pVar.c());
        this.f9346z0.setText("");
    }

    public final void xp(View view, final String str, final long j10) {
        int i10;
        int i11;
        int i12;
        if (t2.F.f13581a.equals(str)) {
            i12 = R.string.ChatDisabledDart;
            i11 = R.string.ChatRestrictedDart;
            i10 = R.string.ChatRestrictedDartUntil;
        } else if (t2.G.f13581a.equals(str)) {
            i12 = R.string.ChatDisabledDice;
            i11 = R.string.ChatRestrictedDice;
            i10 = R.string.ChatRestrictedDiceUntil;
        } else {
            i12 = R.string.ChatDisabledStickers;
            i11 = R.string.ChatRestrictedStickers;
            i10 = R.string.ChatRestrictedStickersUntil;
        }
        vp(view, R.id.right_sendStickersAndGifs, i12, i11, i10, new kb.h() {
            @Override
            public final long get() {
                long Cn;
                Cn = rh.Cn(j10);
                return Cn;
            }
        }, false, null, new kb.e() {
            @Override
            public final Object get() {
                TdApi.InputMessageContent Dn;
                Dn = rh.Dn(str);
                return Dn;
            }
        });
    }

    public final void xq() {
        Object obj = this.f9323t1;
        if (obj != null) {
            yq(obj);
            this.f9323t1 = null;
        }
    }

    public final void xr(final long j10, final TdApi.DraftMessage draftMessage) {
        if (!cl()) {
            if (draftMessage == null || draftMessage.replyToMessageId == 0) {
                uj(false);
            } else {
                s4 d02 = this.f9338x0.E0().d0(draftMessage.replyToMessageId);
                if (d02 != null) {
                    cr(d02.X3(), false, false);
                } else {
                    this.f24495b.v4().o(new TdApi.GetMessage(j10, draftMessage.replyToMessageId), new Client.g() {
                        @Override
                        public final void r2(TdApi.Object object) {
                            rh.this.Un(j10, draftMessage, object);
                        }
                    });
                }
            }
            this.f9346z0.setDraft(draftMessage != null ? draftMessage.inputMessageText : null);
        }
    }

    @Override
    public void y1(final long j10, final long j11) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                rh.this.gm(j10, j11);
            }
        });
    }

    @Override
    public void y4(boolean z10) {
        if (!this.T2.h()) {
            Nq(z10 ? R.string.HoldToVideo : R.string.HoldToAudio);
        }
    }

    @Override
    public TdApi.ChatList y5(d6 d6Var) {
        return this.f9314r0;
    }

    @Override
    public void y6(t0 t0Var, boolean z10, boolean z11) {
    }

    @Override
    public void yc() {
        v2 v2Var = this.Z0;
        if (v2Var != null) {
            v2Var.setPagingEnabled(true);
        }
        if (this.f9264b3) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    rh.this.Zb();
                }
            });
        }
    }

    @Override
    public boolean yd(Bundle bundle, String str) {
        c0 w92 = w9();
        if (w92 == null) {
            return false;
        }
        super.yd(bundle, str);
        bundle.putInt(str + "type", w92.f9356a);
        String str2 = str + "chat_id";
        TdApi.Chat chat = w92.f9357b;
        bundle.putLong(str2, chat != null ? chat.f19908id : 0L);
        String str3 = str + "chat_list";
        TdApi.ChatList chatList = w92.f9358c;
        bundle.putString(str3, chatList != null ? t2.o4(chatList) : "");
        t2.a5(bundle, str + "filter_", w92.f9365j);
        if (w92.f9356a == 1 || w92.f9356a == 4) {
            bundle.putInt(str + "mode", w92.f9360e);
            if (w92.f9359d != null) {
                bundle.putLong(str + "message_id", w92.f9359d.d());
                bundle.putLong(str + "message_chat_id", w92.f9359d.c());
            }
        }
        if (w92.f9356a == 2) {
            bundle.putInt(str + "mode", w92.f9362g);
        }
        if (w92.f9356a == 3 || w92.f9356a == 4) {
            bundle.putString(str + "query", w92.f9363h);
            t2.c5(bundle, str + "sender_", w92.f9364i);
        }
        bundle.putBoolean(str + "scheduled", w92.f9366k);
        return true;
    }

    public final boolean yi() {
        TdApi.Message Ak = Ak();
        return !ti() && this.f9265c1 == 0 && Ak != null && Ak.canBeEdited && t2.O(Ak.content);
    }

    public boolean yj(long j10) {
        return C9() == j10;
    }

    public int yk() {
        k0.e<s4> eVar = this.C1;
        if (eVar != null) {
            return eVar.p();
        }
        return 0;
    }

    public void yo(String str) {
        vc.h0 h0Var = this.f9346z0;
        h0Var.v0("@" + str + " ", true);
    }

    public void yp(final List<String> list, final boolean z10, boolean z11, boolean z12, final TdApi.MessageSchedulingState messageSchedulingState) {
        if (Ek()) {
            final long j10 = this.f9310q0.f19908id;
            final boolean gl = gl();
            final boolean z13 = z12 || lo();
            final long ko = z11 ? ko() : 0L;
            gd.b0.k().q(new Runnable() {
                @Override
                public final void run() {
                    rh.this.En(list, gl, j10, ko, z13, messageSchedulingState, z10);
                }
            });
        }
    }

    public void yq(Object obj) {
        if (Ek()) {
            if (obj instanceof hd.p) {
                Qo((hd.p) obj);
            } else if (obj instanceof c7) {
                vc.h0 h0Var = this.f9346z0;
                if (h0Var != null) {
                    h0Var.v0(obj.toString(), true);
                }
            } else if (obj instanceof String) {
                Ip((String) obj, false, false, false, false, null);
            } else if (obj instanceof TdApi.User) {
                up((TdApi.User) obj, true, t2.i0());
            } else if (obj instanceof l6) {
                Po((l6) obj);
            } else if (obj instanceof w2) {
                w2 w2Var = (w2) obj;
                if (w2Var.c()) {
                    this.f24495b.xb(this.f9310q0.f19908id, qk(), 0L, false, false, new TdApi.InputMessageGame(w2Var.b(), w2Var.a()));
                } else if (w2Var.d()) {
                    if (ob.a.l(this.f9310q0.f19908id)) {
                        Fq(w2Var.a());
                        return;
                    } else {
                        this.f24495b.tb(w2Var.b(), this.f9310q0.f19908id, w2Var.a());
                        return;
                    }
                } else if (ob.a.i(this.f9310q0.f19908id)) {
                    return;
                }
                this.f24495b.v4().o(new TdApi.AddChatMember(this.f9310q0.f19908id, w2Var.b(), 0), ad.f7459a);
            } else if (obj instanceof TdApi.Message) {
                Rj((TdApi.Message) obj);
            } else if (obj instanceof TdApi.Audio) {
                qp((TdApi.Audio) obj, false);
            } else if (obj instanceof hd.g) {
                final hd.g gVar = (hd.g) obj;
                yp(Collections.singletonList(gVar.a()), false, false, false, null);
                gd.l.a().b(new Runnable() {
                    @Override
                    public final void run() {
                        rh.Pn(hd.g.this);
                    }
                });
            }
        }
    }

    @Override
    public void z(o6 o6Var, boolean z10) {
        r0.h(this, o6Var, z10);
    }

    @Override
    public void z0() {
        i1.c(this);
    }

    @Override
    public void z5(w6 w6Var, int i10, int i11) {
        r0.e(this, w6Var, i10, i11);
    }

    public boolean zi(boolean z10) {
        if (!z10 ? Ek() : Li()) {
            TdApi.Chat chat = this.f9310q0;
            if (chat != null && this.f24495b.E2(chat) && !this.f9299n1) {
                return true;
            }
        }
        return false;
    }

    public boolean zj(long j10, long j11) {
        int i10;
        p7 p7Var;
        return C9() == j10 && (!(j11 == 0 || (p7Var = this.f9295m1) == null || p7Var.g() != j11) || (i10 == 0 && this.f9295m1 == null));
    }

    public c3 zk() {
        return this.G0;
    }

    public final void zo(long j10, TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard, boolean z10, boolean z11) {
        if (this.f9320s2 == null) {
            ScrollView scrollView = new ScrollView(t());
            this.f9316r2 = scrollView;
            yd.g.i(scrollView, R.id.theme_color_chatKeyboard, this);
            vc.g gVar = new vc.g(t());
            this.f9320s2 = gVar;
            gVar.setThemeProvider(this);
            this.f9320s2.setCallback(this);
            this.f9316r2.addView(this.f9320s2);
            this.f9316r2.setLayoutParams(new LinearLayout.LayoutParams(-1, this.f9320s2.getSize()));
            this.f9330v0.addView(this.f9316r2);
            this.f9326u0.getViewTreeObserver().addOnPreDrawListener(this.f9320s2);
            this.f9316r2.setVisibility(8);
        }
        if (this.f9308p2 != j10) {
            this.f9308p2 = j10;
            this.f9312q2 = replyMarkupShowKeyboard;
            this.f9320s2.setKeyboard(replyMarkupShowKeyboard);
        }
        if (z11) {
            he.i.c2().h3(this.f24495b.A6(), C9(), j10, false);
        }
        if (z10 || (replyMarkupShowKeyboard.isPersonal && !he.i.c2().S5(this.f24495b.A6(), C9(), j10))) {
            if (this.N2) {
                this.f9304o2 = this.O2;
                Nj();
            } else {
                this.f9304o2 = S9();
            }
            this.f9316r2.setVisibility(0);
            this.f9300n2 = true;
            if (this.f9304o2) {
                ur(R.drawable.baseline_keyboard_24);
                this.f9320s2.c(this.f9346z0);
                return;
            }
            ur(R.drawable.baseline_direction_arrow_down_24);
            return;
        }
        this.f9316r2.setVisibility(8);
        ur(R.drawable.deproko_baseline_bots_keyboard_26);
    }

    public void zp(final long j10, final String str, final boolean z10, final boolean z11, boolean z12, TdApi.MessageSchedulingState messageSchedulingState) {
        if (Ek()) {
            Lo(z12, messageSchedulingState, new hj.o() {
                @Override
                public final void a(boolean z13, TdApi.MessageSchedulingState messageSchedulingState2, boolean z14) {
                    rh.this.Fn(z10, j10, str, z11, z13, messageSchedulingState2, z14);
                }
            });
        }
    }

    public void zq(TdApi.Message message) {
        Aq(message.chatId, new TdApi.Message[]{message});
    }

    public void zr() {
        vc.h0 h0Var = this.f9346z0;
        if (h0Var != null) {
            h0Var.D0(this.f9310q0, this.f9295m1, this.f24495b.j3(C9()));
        }
    }

    public static class c0 {
        public final int f9356a;
        public final TdApi.Chat f9357b;
        public final TdApi.ChatList f9358c;
        public final ob.d f9359d;
        public final int f9360e;
        public final boolean f9361f;
        public final int f9362g;
        public String f9363h;
        public TdApi.MessageSender f9364i;
        public TdApi.SearchMessagesFilter f9365j;
        public boolean f9366k;
        public boolean f9367l;
        public p7 f9368m;
        public e0 f9369n;
        public TdApi.InternalLinkTypeVideoChat f9370o;
        public long f9371p;
        public TdApi.Background f9372q;

        public c0(o6 o6Var, TdApi.ChatList chatList, TdApi.Chat chat, p7 p7Var, TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f9356a = 0;
            this.f9358c = chatList;
            this.f9357b = chat;
            this.f9368m = p7Var;
            int F0 = vc.v2.F0(o6Var.A6(), chat, p7Var);
            this.f9360e = F0;
            this.f9359d = vc.v2.G0(o6Var.A6(), chat, p7Var, F0);
            this.f9365j = searchMessagesFilter;
            this.f9361f = false;
            this.f9362g = 0;
        }

        public c0 b(long j10) {
            this.f9371p = j10;
            return this;
        }

        public c0 c(e0 e0Var) {
            this.f9369n = e0Var;
            return this;
        }

        public c0 d(boolean z10) {
            this.f9367l = z10;
            return this;
        }

        public c0 e(boolean z10) {
            this.f9366k = z10;
            return this;
        }

        public c0 f(TdApi.Background background) {
            this.f9372q = background;
            return this;
        }

        public c0 g(TdApi.InternalLinkTypeVideoChat internalLinkTypeVideoChat) {
            this.f9370o = internalLinkTypeVideoChat;
            return this;
        }

        public c0(TdApi.ChatList chatList, TdApi.Chat chat, p7 p7Var, ob.d dVar, int i10, TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f9356a = 1;
            this.f9358c = chatList;
            this.f9357b = chat;
            this.f9368m = p7Var;
            this.f9359d = dVar;
            this.f9360e = i10;
            this.f9365j = searchMessagesFilter;
            this.f9361f = false;
            this.f9362g = 0;
        }

        public c0(int i10, TdApi.ChatList chatList, TdApi.Chat chat) {
            this.f9356a = 2;
            this.f9362g = i10;
            this.f9357b = chat;
            this.f9358c = chatList;
            this.f9361f = true;
            this.f9360e = 0;
            this.f9359d = null;
        }

        public c0(TdApi.ChatList chatList, TdApi.Chat chat, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter) {
            this.f9356a = 3;
            this.f9357b = chat;
            this.f9358c = chatList;
            this.f9363h = str;
            this.f9364i = messageSender;
            this.f9365j = searchMessagesFilter;
            this.f9361f = true;
            this.f9362g = 4;
            this.f9360e = 0;
            this.f9359d = null;
        }

        public c0(TdApi.ChatList chatList, TdApi.Chat chat, String str, TdApi.MessageSender messageSender, TdApi.SearchMessagesFilter searchMessagesFilter, ob.d dVar, int i10) {
            this.f9356a = 4;
            this.f9357b = chat;
            this.f9358c = chatList;
            this.f9363h = str;
            this.f9364i = messageSender;
            this.f9365j = searchMessagesFilter;
            this.f9361f = true;
            this.f9362g = 4;
            this.f9359d = dVar;
            this.f9360e = i10;
        }
    }
}
