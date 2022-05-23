package ne;

import ae.l;
import ae.p;
import ae.v;
import ae.z;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.y;
import eb.k;
import gd.w;
import hd.t2;
import ie.n0;
import java.util.Objects;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.j2;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.m;
import ud.s;
import ud.v4;
import zd.g0;
import zd.h0;
import zd.i1;
import zd.ic;
import zd.j1;
import zd.o6;
import zd.t7;
import zd.w7;

public class m1 extends FrameLayoutFix implements j2.d, k.b, h0, j1, t7.i, t7.h, t7.b, l, t7.j, n0 {
    public static final OvershootInterpolator f18189o0 = new OvershootInterpolator(1.24f);
    public f M;
    public RelativeLayout N;
    public View O;
    public final v P;
    public k Q;
    public m R;
    public LinearLayout S;
    public o6 T;
    public int U = -1;
    public int V = -1;
    public boolean W;
    public ImageView f18190a0;
    public int f18191b0;
    public float f18192c0;
    public boolean f18193d0;
    public eb.k f18194e0;
    public j2 f18195f0;
    public j2 f18196g0;
    public boolean f18197h0;
    public float f18198i0;
    public boolean f18199j0;
    public int f18200k0;
    public TdApi.User f18201l0;
    public TdApi.Chat f18202m0;
    public long f18203n0;

    public class a extends RelativeLayout {
        public final RectF M;
        public final Path f18204a = new Path();
        public int f18205b;
        public int f18206c;

        public a(Context context, RectF rectF) {
            super(context);
            m1.this = r1;
            this.M = rectF;
        }

        public final void a() {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f18205b != measuredWidth || this.f18206c != measuredHeight) {
                this.f18205b = measuredWidth;
                this.f18206c = measuredHeight;
                this.M.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Path path = this.f18204a;
                if (path != null) {
                    path.reset();
                    this.f18204a.addRoundRect(this.M, a0.i(4.0f), a0.i(4.0f), Path.Direction.CW);
                }
            }
        }

        @Override
        public void draw(Canvas canvas) {
            boolean z10 = !m1.this.M.f18214d;
            int b10 = z10 ? yd.g.b(canvas, this.f18204a) : Integer.MIN_VALUE;
            super.draw(canvas);
            if (z10) {
                yd.g.f(canvas, b10);
            }
            if (this.f18204a == null) {
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y.C0(ib.d.a(0.2f, ae.j.P0())));
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            a();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
            m1.this = r1;
        }

        @Override
        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), a0.i(4.0f));
        }
    }

    public class c extends Drawable {
        public final RectF f18208a;

        public c(RectF rectF) {
            m1.this = r1;
            this.f18208a = rectF;
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.drawRoundRect(this.f18208a, a0.i(4.0f), a0.i(4.0f), y.g(ae.j.u()));
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class d extends ImageView {
        public d(Context context) {
            super(context);
            m1.this = r1;
        }

        @Override
        public void onDraw(Canvas canvas) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            super.onDraw(canvas);
            canvas.restore();
        }
    }

    public interface e {
        void a7(f fVar, int i10, Object obj);

        void t2(f fVar, int i10, Object obj);
    }

    public static class f {
        public final View f18211a;
        public final View f18212b;
        public boolean f18213c;
        public boolean f18214d;
        public boolean f18215e;
        public boolean f18216f;
        public int f18217g;
        public hd.b f18218h;
        public ld.h f18219i;
        public String f18220j;
        public String f18221k;
        public int f18222l;
        public long f18223m;
        public long f18224n;
        public k f18225o;
        public o6 f18226p;
        public e f18227q;
        public g f18228r;
        public Object f18229s;
        public int[] f18230t;
        public int[] f18231u;
        public String[] f18232v;
        public boolean f18233w;
        public v4<?> f18234x;

        public f(o6 o6Var, View view, View view2, v4<?> v4Var) {
            this.f18226p = o6Var;
            this.f18211a = view;
            this.f18212b = view2;
            this.f18225o = view2 instanceof k ? (k) view2 : null;
            this.f18234x = v4Var;
        }

        public View A() {
            return this.f18211a;
        }

        public boolean B() {
            int[] iArr = this.f18230t;
            return iArr != null && iArr.length > 0;
        }

        public boolean C() {
            return this.f18214d;
        }

        public boolean D() {
            v4<?> v4Var;
            return !this.f18213c && ((v4Var = this.f18234x) == null || v4Var.Ne());
        }

        public f E(boolean z10) {
            v4<?> v4Var;
            this.f18213c = (!fd.b.f11915l || ((v4Var = this.f18234x) != null && v4Var.t().w1())) && z10;
            return this;
        }

        public f F(int i10) {
            this.f18217g = i10;
            return this;
        }

        public void G(long j10, long j11) {
            this.f18214d = true;
            this.f18215e = true;
            this.f18222l = 1;
            this.f18223m = j10;
            this.f18224n = j11;
        }

        public void H(long j10) {
            this.f18214d = j10 != 0;
            this.f18215e = true;
            this.f18222l = 2;
            this.f18223m = j10;
            this.f18224n = 0L;
        }

        public void I(e eVar, Object obj, int[] iArr, int[] iArr2, String[] strArr) {
            this.f18227q = eVar;
            if (this.f18229s == null) {
                this.f18229s = obj;
            }
            this.f18230t = iArr;
            this.f18231u = iArr2;
            this.f18232v = strArr;
        }

        public f J(boolean z10) {
            this.f18233w = z10;
            return this;
        }

        public void K(String str, String str2) {
            this.f18214d = true;
            this.f18220j = str;
            this.f18221k = str2;
        }

        public void L(ld.h hVar, hd.b bVar) {
            this.f18215e = true;
            this.f18219i = hVar;
            this.f18218h = bVar;
        }

        public f M(boolean z10) {
            this.f18216f = z10;
            return this;
        }

        public f N(g gVar) {
            this.f18228r = gVar;
            return this;
        }

        public f O(k kVar) {
            this.f18225o = kVar;
            return this;
        }

        public f P(Object obj) {
            this.f18229s = obj;
            return this;
        }

        public void Q(o6 o6Var) {
            this.f18226p = o6Var;
        }

        public boolean v() {
            return this.f18213c;
        }

        public float w(m1 m1Var) {
            return p0.s(this.f18211a)[0] - p0.s(m1Var)[0];
        }

        public float x(m1 m1Var) {
            return p0.s(this.f18211a)[1] - p0.s(m1Var)[1];
        }

        public g y() {
            return this.f18228r;
        }

        public int z() {
            if (!B()) {
                return 0;
            }
            int[] iArr = this.f18230t;
            int length = iArr.length;
            int length2 = iArr.length;
            if (length > 1) {
                length2++;
            }
            return length2 * a0.i(48.0f);
        }
    }

    public interface g {
        boolean a(eb.k kVar, float f10, Object obj);
    }

    public static class h implements k.b {
        public static final Interpolator R = new OvershootInterpolator(1.28f);
        public final boolean M;
        public final int N;
        public float O;
        public boolean P;
        public eb.k Q;
        public final i f18235a;
        public final View f18236b;
        public final String f18237c;

        public h(i iVar, View view, String str) {
            this.f18235a = iVar;
            this.f18236b = view;
            this.f18237c = str;
            boolean M0 = je.g.M0(str);
            this.M = M0;
            this.N = (int) v0.T1(str, y.P(12.0f, M0));
        }

        public final void a(float f10) {
            if (this.Q == null) {
                this.Q = new eb.k(0, this, R, 230L, this.O);
            }
            this.Q.i(f10);
        }

        public void b(Canvas canvas) {
            if (this.O != 0.0f) {
                int left = (this.f18236b.getLeft() + this.f18236b.getRight()) >> 1;
                int measuredHeight = this.f18235a.getMeasuredHeight();
                int i10 = a0.i(8.0f);
                int i11 = a0.i(8.0f);
                int i12 = a0.i(28.0f);
                int i13 = measuredHeight - ((int) ((i11 + i12) * this.O));
                RectF a02 = y.a0();
                int i14 = this.N;
                a02.set((left - (i14 / 2)) - i10, i13, (i14 / 2) + left + i10, i13 + i12);
                float d10 = ib.h.d(this.O);
                canvas.drawRoundRect(a02, a0.i(4.0f), a0.i(4.0f), y.g(ib.d.a(d10, 2080374784)));
                canvas.drawText(this.f18237c, left - (this.N / 2), a02.top + a0.i(18.0f), y.O(12.0f, ib.d.a(d10, -1), this.M));
            }
        }

        public final void c(float f10) {
            if (this.O != f10) {
                this.O = f10;
                this.f18235a.invalidate();
            }
        }

        public void d(boolean z10) {
            if (this.P != z10) {
                this.P = z10;
                a(z10 ? 1.0f : 0.0f);
                if (z10) {
                    j0.k(this.f18236b, false);
                }
            }
        }

        @Override
        public void n4(int i10, float f10, float f11, eb.k kVar) {
            c(f10);
        }

        @Override
        public void o4(int i10, float f10, eb.k kVar) {
        }
    }

    public static class i extends View {
        public h[] f18238a;

        public i(Context context) {
            super(context);
        }

        public void a(h[] hVarArr) {
            this.f18238a = hVarArr;
        }

        @Override
        public void onDraw(Canvas canvas) {
            h[] hVarArr = this.f18238a;
            if (hVarArr != null) {
                for (h hVar : hVarArr) {
                    hVar.b(canvas);
                }
            }
        }
    }

    public interface j {
        void W4(f fVar);
    }

    public interface k {
        void J5(f fVar);

        void T3(f fVar);

        void o1(f fVar);

        void w4(f fVar);
    }

    public m1(Context context) {
        super(context);
        v vVar = new v();
        this.P = vVar;
        setLayoutParams(FrameLayoutFix.q1(-1, -1));
        View view = new View(context);
        this.O = view;
        addView(view);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-2, -2, 17);
        RectF rectF = new RectF();
        a aVar = new a(context, rectF);
        this.N = aVar;
        aVar.setOutlineProvider(new b());
        this.N.setElevation(a0.i(1.0f));
        this.N.setTranslationZ(a0.i(1.0f));
        db.g.d(this.N, new c(rectF));
        this.N.setLayoutParams(r12);
        addView(this.N);
        vVar.f(this.N);
    }

    private void setActionView(ImageView imageView) {
        ImageView imageView2 = this.f18190a0;
        if (imageView2 != imageView) {
            int i10 = 0;
            if (imageView2 != null) {
                ((h) imageView2.getTag()).d(false);
            }
            this.f18190a0 = imageView;
            if (imageView != null) {
                i10 = imageView.getId();
            }
            this.f18191b0 = i10;
            if (imageView != null) {
                ((h) imageView.getTag()).d(true);
            }
        }
    }

    private void setHeaderUser(TdApi.User user) {
        this.R.setShowVerify(user.isVerified);
        this.R.setShowScam(user.isScam);
        this.R.setShowFake(user.isFake);
        this.R.T1(t2.r2(user), this.T.Bc().r(user.f19979id, user, false));
        S1();
    }

    private void setRevealFactor(float f10) {
        if (this.f18192c0 != f10) {
            this.f18192c0 = f10;
            float f11 = (0.3f * f10) + 0.7f;
            this.N.setScaleX(f11);
            this.N.setScaleY(f11);
            if (this.f18197h0) {
                float f12 = this.f18198i0;
                float d10 = ib.h.d(this.f18198i0 * (1.0f - ib.h.d((f10 - f12) / (1.3f - f12))));
                this.N.setAlpha(d10);
                this.O.setAlpha(d10);
                return;
            }
            float d11 = ib.h.d(f10);
            this.N.setAlpha(d11);
            this.O.setAlpha(d11);
        }
    }

    @Override
    public void A3(long j10, TdApi.UserStatus userStatus, boolean z10) {
        int i10 = this.f18200k0;
        if (i10 == 1 || i10 == 2) {
            V1();
        }
    }

    @Override
    public void A5(TdApi.NotificationSettingsScope notificationSettingsScope) {
        i1.b(this, notificationSettingsScope);
    }

    @Override
    public void B3(long j10, boolean z10) {
        g0.i(this, j10, z10);
    }

    @Override
    public void B5(long j10, int i10, boolean z10) {
        g0.x(this, j10, i10, z10);
    }

    @Override
    public void C4(int i10, int i11, float f10, boolean z10) {
        ae.k.c(this, i10, i11, f10, z10);
    }

    public final void E1(TdApi.Chat chat, long j10, boolean z10) {
        if (z10) {
            this.T.O9().d0(chat.f19908id, this);
            this.T.O9().j0(chat.f19908id, this);
            this.R.b1(chat.f19908id, j10);
        } else {
            this.T.O9().q0(chat.f19908id, this);
            this.T.O9().w0(chat.f19908id, this);
            this.R.J1();
        }
        switch (chat.type.getConstructor()) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                if (z10) {
                    this.T.e2().b2(ob.a.p(chat.f19908id), this);
                    return;
                } else {
                    this.T.e2().p2(ob.a.p(chat.f19908id), this);
                    return;
                }
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                if (z10) {
                    this.T.e2().d2(t2.o2(chat.type), this);
                    return;
                } else {
                    this.T.e2().r2(t2.o2(chat.type), this);
                    return;
                }
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                if (z10) {
                    this.T.e2().Z1(ob.a.m(chat.f19908id), this);
                    return;
                } else {
                    this.T.e2().n2(ob.a.m(chat.f19908id), this);
                    return;
                }
            default:
                return;
        }
    }

    public final void G1(TdApi.User user, boolean z10) {
        if (z10) {
            this.T.e2().d2(user.f19979id, this);
        } else {
            this.T.e2().r2(user.f19979id, this);
        }
    }

    @Override
    public void H0(long j10, String str) {
        g0.t(this, j10, str);
    }

    public final ImageView H1(int i10, int i11) {
        int bottom = this.N.getBottom();
        if (i11 <= bottom && i11 >= bottom - a0.i(48.0f) && this.S != null) {
            int left = i10 - this.N.getLeft();
            if (this.M.B()) {
                left -= this.S.getLeft();
            }
            int childCount = this.S.getChildCount();
            int i12 = 1;
            if (this.M.f18230t.length == 1) {
                i12 = 0;
            }
            for (int i13 = i12; i13 < childCount - i12; i13++) {
                View childAt = this.S.getChildAt(i13);
                if (childAt != null && left >= childAt.getLeft() && left <= childAt.getRight()) {
                    return (ImageView) childAt;
                }
            }
        }
        return null;
    }

    @Override
    public void H2(j2 j2Var) {
        this.f18195f0 = j2Var;
        k kVar = this.Q;
        if (kVar != null) {
            kVar.T3(this.M);
        }
        if (this.M.f18216f) {
            this.f18194e0.F(68L);
        }
        this.f18194e0.i(1.0f);
    }

    public int I1(float f10) {
        f fVar = this.M;
        if (fVar == null || !fVar.B() || this.S == null) {
            return 0;
        }
        float x10 = f10 + this.M.x(this);
        float bottom = (this.N.getBottom() - a0.i(48.0f)) - a0.i(48.0f);
        if (x10 > bottom) {
            return (int) (x10 - bottom);
        }
        return 0;
    }

    public void K1(f fVar) {
        ?? r22;
        ImageView imageView;
        View view;
        RelativeLayout.LayoutParams layoutParams;
        this.T = fVar.f18226p;
        this.M = fVar;
        this.Q = fVar.f18225o;
        if (fVar.f18217g != 0) {
            this.O.setBackgroundColor(fVar.f18217g);
        } else {
            yd.g.j(this.O, R.id.theme_color_previewBackground);
            this.P.f(this.O);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.N.getLayoutParams();
        if (!fVar.f18216f) {
            int i10 = a0.i(16.0f);
            layoutParams2.rightMargin = i10;
            layoutParams2.leftMargin = i10;
            int topOffset = d1.getTopOffset() + a0.i(12.0f);
            layoutParams2.bottomMargin = topOffset;
            layoutParams2.topMargin = topOffset;
        } else if (fd.b.f11914k) {
            int i11 = a0.i(16.0f);
            layoutParams2.rightMargin = i11;
            layoutParams2.leftMargin = i11;
            layoutParams2.topMargin = d1.getTopOffset() + a0.i(20.0f);
            layoutParams2.bottomMargin = d1.getTopOffset() + a0.i(16.0f);
        } else {
            int i12 = a0.i(26.0f);
            layoutParams2.rightMargin = i12;
            layoutParams2.leftMargin = i12;
            int topOffset2 = d1.getTopOffset() + a0.i(20.0f);
            layoutParams2.bottomMargin = topOffset2;
            layoutParams2.topMargin = topOffset2;
        }
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(14);
        fVar.f18212b.setId(R.id.forceTouch_content);
        fVar.f18212b.setLayoutParams(layoutParams3);
        this.N.addView(fVar.f18212b);
        if (fVar.C()) {
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, a0.i(56.0f));
            layoutParams4.addRule(5, R.id.forceTouch_content);
            layoutParams4.addRule(7, R.id.forceTouch_content);
            layoutParams3.addRule(3, R.id.forceTouch_header);
            if (fVar.f18215e) {
                m mVar = new m(getContext(), this.T, null);
                this.R = mVar;
                mVar.setId(R.id.forceTouch_header);
                this.R.Q1();
                this.R.R1(a0.i(8.0f), a0.i(8.0f));
                this.R.U1(ae.j.P0(), ae.j.R0());
                if (fVar.f18222l != 1 || fVar.f18223m == 0) {
                    layoutParams = layoutParams4;
                    if (fVar.f18222l != 2 || fVar.f18223m == 0) {
                        if (fVar.f18219i != null) {
                            this.R.setAvatar(fVar.f18219i);
                        } else {
                            this.R.setAvatarPlaceholder(fVar.f18218h);
                        }
                        this.R.T1(fVar.f18220j, fVar.f18221k);
                    } else {
                        Z1((int) fVar.f18223m, this.R);
                    }
                } else {
                    layoutParams = layoutParams4;
                    Y1(fVar.f18223m, fVar.f18224n, this.R);
                }
                this.R.setLayoutParams(layoutParams);
                RelativeLayout relativeLayout = this.N;
                View view2 = this.R;
                relativeLayout.addView(view2);
                view = view2;
            } else {
                s sVar = new s(getContext());
                sVar.setId(R.id.forceTouch_header);
                sVar.setTitle(fVar.f18220j);
                sVar.setSubtitle(fVar.f18221k);
                sVar.B1(ae.j.P0(), ae.j.R0());
                sVar.setLayoutParams(layoutParams4);
                this.N.addView(sVar);
                view = sVar;
            }
            this.P.d(view, R.id.theme_color_text, R.id.theme_color_textLight);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, a0.i(7.0f));
            layoutParams5.addRule(5, R.id.forceTouch_content);
            layoutParams5.addRule(7, R.id.forceTouch_content);
            layoutParams5.addRule(6, R.id.forceTouch_content);
            f3 f3Var = new f3(getContext());
            r22 = 1;
            f3Var.setSimpleBottomTransparentShadow(true);
            f3Var.setLayoutParams(layoutParams5);
            this.N.addView(f3Var);
            this.P.f(f3Var);
        } else {
            r22 = 1;
        }
        if (fVar.B()) {
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(0, a0.i(48.0f));
            layoutParams6.addRule(5, R.id.forceTouch_content);
            layoutParams6.addRule(7, R.id.forceTouch_content);
            layoutParams6.addRule(3, R.id.forceTouch_content);
            layoutParams6.addRule(14);
            if (fVar.f18216f) {
                int i13 = layoutParams6.height;
                layoutParams3.bottomMargin = i13;
                layoutParams6.topMargin = -i13;
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.S = linearLayout;
            linearLayout.setId(R.id.forceTouch_footer);
            this.S.setOrientation(0);
            LinearLayout linearLayout2 = this.S;
            int i14 = r22 == true ? 1 : 0;
            int i15 = r22 == true ? 1 : 0;
            linearLayout2.setGravity(i14);
            this.S.setLayoutParams(layoutParams6);
            if (fVar.f18230t.length > r22) {
                View view3 = new View(getContext());
                view3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                this.S.addView(view3);
            }
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, a0.i(48.0f));
            layoutParams7.addRule(2, R.id.forceTouch_footer);
            layoutParams7.addRule(5, R.id.forceTouch_footer);
            layoutParams7.addRule(7, R.id.forceTouch_footer);
            if (fVar.f18216f) {
                layoutParams7.bottomMargin = layoutParams3.bottomMargin;
            }
            i iVar = new i(getContext());
            iVar.setLayoutParams(layoutParams7);
            h[] hVarArr = new h[fVar.f18230t.length];
            boolean G2 = w.G2();
            for (int length = fVar.f18230t.length; length > 0; length--) {
                int length2 = G2 ? length - 1 : fVar.f18230t.length - length;
                int i16 = fVar.f18230t[length2];
                if (ce.c.l(fVar.f18231u[length2])) {
                    imageView = new d(getContext());
                } else {
                    imageView = new ImageView(getContext());
                }
                imageView.setId(i16);
                h hVar = new h(iVar, imageView, fVar.f18232v[length2]);
                hVarArr[length2] = hVar;
                imageView.setTag(hVar);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(ae.j.o0());
                this.P.e(imageView, R.id.theme_color_icon);
                imageView.setImageResource(fVar.f18231u[length2]);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.0f));
                this.S.addView(imageView);
            }
            iVar.a(hVarArr);
            if (fVar.f18232v.length > r22) {
                View view4 = new View(getContext());
                view4.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                this.S.addView(view4);
            }
            this.N.addView(this.S);
            this.N.addView(iVar);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, a0.i(6.0f));
            layoutParams8.addRule(5, R.id.forceTouch_content);
            layoutParams8.addRule(7, R.id.forceTouch_content);
            layoutParams8.addRule(8, R.id.forceTouch_content);
            f3 f3Var2 = new f3(getContext());
            f3Var2.setSimpleTopShadow(r22);
            f3Var2.setLayoutParams(layoutParams8);
            this.N.addView(f3Var2);
            this.P.f(f3Var2);
        }
        this.f18192c0 = 1.0f;
        setRevealFactor(0.0f);
        if (fVar.f18234x != null) {
            fVar.f18234x.Bd(this);
        }
        z.u().e(this);
    }

    @Override
    public void K2(TdApi.BasicGroup basicGroup, boolean z10) {
        this.T.hd().post(new l1(this));
    }

    public boolean L1() {
        eb.k kVar = this.f18194e0;
        return kVar == null || kVar.v();
    }

    @Override
    public void M1(TdApi.User user) {
        if (this.f18200k0 == 2) {
            setHeaderUser(user);
        }
    }

    @Override
    public void N0(long j10, int i10) {
        this.T.hd().post(new l1(this));
    }

    @Override
    public void N1(long j10, boolean z10) {
    }

    public final void O1(boolean z10) {
        if (this.f18191b0 != 0 && this.M.f18227q != null) {
            if (z10) {
                e eVar = this.M.f18227q;
                f fVar = this.M;
                eVar.a7(fVar, this.f18191b0, fVar.f18229s);
                return;
            }
            e eVar2 = this.M.f18227q;
            f fVar2 = this.M;
            eVar2.t2(fVar2, this.f18191b0, fVar2.f18229s);
        }
    }

    public void P1(float f10, float f11, float f12, float f13) {
        f fVar = this.M;
        if (fVar != null) {
            if (!(fVar.f18228r == null || this.M.f18234x == null)) {
                this.M.f18234x.Wb(f11, f13);
            }
            if (this.M.B()) {
                X1((int) (f10 + this.M.w(this)), (int) (f11 + this.M.x(this)));
            }
        }
    }

    public final void R1() {
        TdApi.Chat chat = this.f18202m0;
        if (chat != null) {
            E1(chat, this.f18203n0, false);
            this.f18202m0 = null;
        }
        TdApi.User user = this.f18201l0;
        if (user != null) {
            G1(user, false);
            this.f18201l0 = null;
        }
    }

    @Override
    public void R3(long j10, TdApi.ChatPhotoInfo chatPhotoInfo) {
        this.T.hd().post(new Runnable() {
            @Override
            public final void run() {
                m1.this.S1();
            }
        });
    }

    public final void S1() {
        TdApi.User user;
        if (!this.f18193d0) {
            int i10 = this.f18200k0;
            if (i10 == 1) {
                TdApi.Chat chat = this.f18202m0;
                if (chat != null) {
                    if (!this.T.k7(chat.f19908id)) {
                        TdApi.Chat chat2 = this.f18202m0;
                        if (chat2.photo != null) {
                            this.R.setAvatar(t2.D0(this.T, chat2));
                            return;
                        }
                    }
                    this.R.setAvatarPlaceholder(this.T.D3(this.f18202m0, true, m.getBaseAvatarRadiusDp(), null));
                }
            } else if (i10 != 2 || (user = this.f18201l0) == null) {
            } else {
                if (user.profilePhoto != null) {
                    this.R.setAvatar(t2.G0(this.T, user));
                } else {
                    this.R.setAvatarPlaceholder(this.T.e2().M2(this.f18201l0, false, m.getBaseAvatarRadiusDp(), null));
                }
            }
        }
    }

    @Override
    public boolean T0() {
        f fVar = this.M;
        if (fVar == null) {
            return false;
        }
        if (fVar.f18234x != null) {
            return this.M.f18234x.Rd();
        }
        if (this.M.f18212b instanceof n0) {
            return ((n0) this.M.f18212b).T0();
        }
        return false;
    }

    public final void T1() {
        TdApi.Chat chat;
        if (!j0.K()) {
            this.T.hd().post(new Runnable() {
                @Override
                public final void run() {
                    m1.this.T1();
                }
            });
        } else if (!this.f18193d0 && (chat = this.f18202m0) != null) {
            this.R.setShowMute(this.T.v3(chat.f19908id));
        }
    }

    @Override
    public void T5(long j10, long j11, int i10, boolean z10) {
        g0.q(this, j10, j11, i10, z10);
    }

    @Override
    public boolean U1(j2 j2Var, eb.k kVar) {
        f fVar = this.M;
        if (!(fVar == null || fVar.f18234x == null || !this.M.f18234x.Oe())) {
            this.f18199j0 = true;
        }
        k kVar2 = this.Q;
        if (kVar2 != null) {
            kVar2.o1(this.M);
        }
        this.f18196g0 = j2Var;
        if (this.f18199j0 || (this.f18191b0 == R.id.maximize && this.f18192c0 >= 0.8f)) {
            this.f18194e0.F(40L);
            this.f18194e0.y(140L);
            this.f18198i0 = this.f18192c0;
            this.f18197h0 = true;
            this.f18194e0.B(db.b.f7287b);
            if (this.M.f18228r != null && this.M.f18228r.a(this.f18194e0, 1.3f, this.M.f18229s)) {
                return true;
            }
            this.f18194e0.i(1.3f);
        } else {
            this.f18194e0.F(0L);
            this.f18194e0.i(0.0f);
            O1(false);
        }
        return true;
    }

    @Override
    public boolean V0() {
        return true;
    }

    public final void V1() {
        if (!this.f18193d0) {
            if (this.f18202m0 != null) {
                this.R.setSubtitle(this.T.Bc().n(this.f18202m0));
            }
            if (this.f18201l0 != null) {
                m mVar = this.R;
                ic Bc = this.T.Bc();
                TdApi.User user = this.f18201l0;
                mVar.setSubtitle(Bc.r(user.f19979id, user, false));
            }
        }
    }

    @Override
    public void V3(long j10, TdApi.BasicGroupFullInfo basicGroupFullInfo) {
        this.T.hd().post(new l1(this));
    }

    public final void W1() {
        TdApi.Chat chat;
        if (!this.f18193d0 && (chat = this.f18202m0) != null) {
            this.R.setTitle(this.T.W3(chat));
        }
    }

    @Override
    public void X(long j10, TdApi.ChatActionBar chatActionBar) {
        g0.a(this, j10, chatActionBar);
    }

    public final void X1(int i10, int i11) {
        int i12 = this.U;
        if (i12 == -1 && this.V == -1) {
            this.U = i10;
            this.V = i11;
        } else if (this.W || Math.max(Math.abs(i10 - i12), Math.abs(i11 - this.V)) >= a0.p()) {
            this.W = true;
            this.U = i10;
            this.V = i11;
            setActionView(H1(i10, i11));
        }
    }

    @Override
    public void Y(long j10, TdApi.Message message) {
        g0.v(this, j10, message);
    }

    public final void Y1(long j10, long j11, m mVar) {
        TdApi.Chat W2 = this.T.W2(j10);
        Objects.requireNonNull(W2);
        this.f18200k0 = 1;
        this.f18202m0 = W2;
        this.f18203n0 = j11;
        E1(W2, j11, true);
        mVar.setShowLock(ob.a.j(j10));
        mVar.setShowVerify(this.T.l4(W2));
        mVar.setShowScam(this.T.L3(W2));
        mVar.setShowFake(this.T.k3(W2));
        mVar.setShowMute(this.T.v3(W2.f19908id));
        mVar.T1(this.T.W3(W2), this.T.Bc().n(W2));
        S1();
    }

    @Override
    public void Y3(long j10, TdApi.ChatNotificationSettings chatNotificationSettings) {
        T1();
    }

    public final void Z1(int i10, m mVar) {
        TdApi.User u22 = this.T.e2().u2(i10);
        Objects.requireNonNull(u22);
        this.f18200k0 = 2;
        this.f18201l0 = u22;
        G1(u22, true);
        setHeaderUser(u22);
    }

    @Override
    public void a0(long j10, TdApi.MessageSender messageSender) {
        g0.f(this, j10, messageSender);
    }

    public final void b0() {
        this.f18193d0 = true;
        if (this.M.f18212b instanceof kb.c) {
            ((kb.c) this.M.f18212b).Q2();
        }
        m mVar = this.R;
        if (mVar != null) {
            mVar.Q2();
        }
        k kVar = this.Q;
        if (kVar != null) {
            kVar.w4(this.M);
        }
        R1();
        z.u().U(this);
    }

    @Override
    public void b2(long j10, TdApi.DraftMessage draftMessage) {
        g0.g(this, j10, draftMessage);
    }

    @Override
    public void c0() {
        if (fd.b.f11913j || he.i.c2().O2()) {
            this.f18194e0 = new eb.k(0, this, new DecelerateInterpolator(1.46f), 140L);
        } else {
            this.f18194e0 = new eb.k(0, this, f18189o0, 260L);
        }
    }

    @Override
    public void c1(long j10, TdApi.ChatJoinRequestsInfo chatJoinRequestsInfo) {
        g0.m(this, j10, chatJoinRequestsInfo);
    }

    @Override
    public void e7(long j10, int i10) {
        g0.k(this, j10, i10);
    }

    @Override
    public void f0(long j10, TdApi.SupergroupFullInfo supergroupFullInfo) {
        this.T.hd().post(new l1(this));
    }

    @Override
    public void f4(long j10, String str) {
        g0.d(this, j10, str);
    }

    @Override
    public void f5(long j10, String str) {
        this.T.hd().post(new Runnable() {
            @Override
            public final void run() {
                m1.this.W1();
            }
        });
    }

    @Override
    public void i3(p pVar, p pVar2) {
        ae.k.b(this, pVar, pVar2);
    }

    @Override
    public void j6(boolean z10, ae.b bVar) {
        this.P.n(z10);
    }

    @Override
    public void k3(long j10, TdApi.VideoChat videoChat) {
        g0.y(this, j10, videoChat);
    }

    @Override
    public void l0(long j10, int i10, boolean z10) {
        g0.w(this, j10, i10, z10);
    }

    @Override
    public void n4(int i10, float f10, float f11, eb.k kVar) {
        if (i10 == 0) {
            setRevealFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, eb.k kVar) {
        if (i10 == 0) {
            if (f10 == 0.0f || f10 == 1.3f) {
                b0();
                j2 j2Var = this.f18196g0;
                if (j2Var != null) {
                    j2Var.B2();
                }
                O1(true);
            } else if (f10 == 1.0f) {
                k kVar2 = this.Q;
                if (kVar2 != null) {
                    kVar2.J5(this.M);
                }
                j2 j2Var2 = this.f18195f0;
                if (j2Var2 != null) {
                    j2Var2.C2();
                }
            }
        }
    }

    @Override
    public void p6(long j10, boolean z10) {
        g0.h(this, j10, z10);
    }

    @Override
    public void q0(int i10) {
        ae.k.a(this, i10);
    }

    @Override
    public void q2(long j10, boolean z10) {
    }

    @Override
    public void s0(TdApi.Supergroup supergroup) {
        this.T.hd().post(new l1(this));
    }

    public void setBeforeMaximizeFactor(float f10) {
        if (this.f18192c0 >= 1.0f) {
            setRevealFactor((f10 * 0.1f) + 1.0f);
            eb.k kVar = this.f18194e0;
            if (kVar != null) {
                kVar.l(this.f18192c0);
            }
        }
    }

    @Override
    public void t4(long j10, String[] strArr) {
        g0.b(this, j10, strArr);
    }

    @Override
    public void t7(long j10, TdApi.ChatPermissions chatPermissions) {
        g0.n(this, j10, chatPermissions);
    }

    @Override
    public boolean u3() {
        return true;
    }

    @Override
    public void u7(long j10, TdApi.UserFullInfo userFullInfo) {
        w7.a(this, j10, userFullInfo);
    }

    @Override
    public void w1(long j10, boolean z10) {
        g0.c(this, j10, z10);
    }

    @Override
    public void w6(long j10, TdApi.ChatPosition chatPosition, boolean z10, boolean z11, boolean z12) {
        g0.p(this, j10, chatPosition, z10, z11, z12);
    }

    @Override
    public void x1(long j10) {
        i1.a(this, j10);
    }

    @Override
    public void x2(TdApi.NotificationSettingsScope notificationSettingsScope, TdApi.ScopeNotificationSettings scopeNotificationSettings) {
        T1();
    }

    @Override
    public void x5(long j10, long j11) {
        g0.s(this, j10, j11);
    }

    @Override
    public void y1(long j10, long j11) {
        g0.r(this, j10, j11);
    }

    @Override
    public void z0() {
        i1.c(this);
    }
}
