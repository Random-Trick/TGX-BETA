package ne;

import ae.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import ce.a0;
import ce.j0;
import ce.x;
import ce.y;
import dd.l;
import de.n9;
import de.t8;
import eb.k;
import gd.w;
import hd.t2;
import hd.v6;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.Iterator;
import ld.p;
import md.m;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.z0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import vc.q;

public class z0 extends FrameLayoutFix implements ViewTreeObserver.OnPreDrawListener, ViewPager.i, k.b, View.OnClickListener, View.OnLongClickListener, w.a {
    public v4<?> M;
    public f N;
    public v2 O;
    public c P;
    public FrameLayoutFix Q;
    public f3 R;
    public FrameLayoutFix S;
    public RecyclerView T;
    public ArrayList<d> U;
    public int V;
    public c0 W;
    public g f18478a0;
    public v4<?> f18479b0;
    public boolean f18480c0;
    public boolean f18481d0;
    public k f18482e0;
    public boolean f18483f0 = true;
    public float f18484g0 = 1.0f;
    public float f18485h0;
    public k f18486i0;
    public int f18487j0;
    public int f18488k0;
    public int f18489l0;
    public boolean f18490m0;
    public boolean f18491n0;
    public boolean f18492o0;
    public int f18493p0;
    public float f18494q0;
    public boolean f18495r0;
    public boolean f18496s0;
    public float f18497t0;
    public float f18498u0;
    public float f18499v0;
    public int f18500w0;
    public int f18501x0;
    public int f18502y0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return true;
        }
    }

    public class b extends RecyclerView.o {
        public b() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            int i10 = 0;
            rect.left = k02 == 0 ? z0.getHorizontalPadding() : 0;
            if (k02 == z0.this.f18478a0.D() - 1) {
                i10 = z0.getHorizontalPadding();
            }
            rect.right = i10;
        }
    }

    public static class c extends e2.a {
        public final z0 M;
        public final k0.h<v4<?>> N = new k0.h<>(2);
        public final boolean O;
        public final v4<?> P;
        public final v4<?> f18504c;

        public c(v4<?> v4Var, z0 z0Var, boolean z10, v4<?> v4Var2) {
            this.f18504c = v4Var;
            this.M = z0Var;
            this.P = v4Var2;
            this.O = z10;
        }

        @Override
        public void b(ViewGroup viewGroup, int i10, Object obj) {
            viewGroup.removeView(((v4) obj).get());
        }

        @Override
        public int e() {
            return this.O ? 2 : 1;
        }

        @Override
        public Object j(ViewGroup viewGroup, int i10) {
            v4<?> e10 = this.N.e(i10);
            if (e10 == null) {
                if (i10 == 0) {
                    e10 = new t8(this.f18504c.t(), this.f18504c.c());
                    e10.Ad(this.M);
                } else if (i10 == 1) {
                    e10 = new n9(this.f18504c.t(), this.f18504c.c());
                    e10.Ad(this.M);
                } else {
                    throw new RuntimeException("position == " + i10);
                }
                this.N.j(i10, e10);
                v4<?> v4Var = this.P;
                if (v4Var != null) {
                    e10.R8(v4Var);
                }
            }
            viewGroup.addView(e10.get());
            return e10;
        }

        @Override
        public boolean k(View view, Object obj) {
            return (obj instanceof v4) && ((v4) obj).get() == view;
        }

        public void v() {
            int n10 = this.N.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.N.o(i10).Z8();
            }
            this.N.b();
        }

        public v4<?> w(int i10) {
            return this.N.e(i10);
        }

        public void x() {
            for (int i10 = 0; i10 < this.N.n(); i10++) {
                v4<?> o10 = this.N.o(i10);
                if (o10.R9() == R.id.controller_emoji) {
                    ((t8) o10).af();
                }
            }
        }

        public void y() {
            for (int i10 = 0; i10 < this.N.n(); i10++) {
                v4<?> o10 = this.N.o(i10);
                switch (o10.R9()) {
                    case R.id.controller_emoji:
                        ((t8) o10).Xe();
                        break;
                    case R.id.controller_emojiMedia:
                        ((n9) o10).Sf();
                        break;
                }
            }
            this.M.y2();
        }
    }

    public static class d implements k.b {
        public Drawable M;
        public Drawable N;
        public boolean O;
        public View P;
        public z0 Q;
        public final int R;
        public k S;
        public boolean T;
        public int U;
        public boolean V;
        public boolean W;
        public boolean X;
        public Runnable Y;
        public int Z;
        public final int f18505a;
        public float f18506b;
        public int f18507c;

        public d(z0 z0Var, int i10, int i11, int i12) {
            this.Q = z0Var;
            this.f18505a = i10;
            this.R = i12;
            this.N = ce.c.g(z0Var.getResources(), i12);
            d(i11);
        }

        public void f() {
            if (this.X || this.W) {
                o(!this.W);
                if (this.X) {
                    g(false);
                }
            }
        }

        public final void c() {
            if (this.X) {
                this.X = false;
                o(false);
                View view = this.P;
                if (view != null) {
                    view.removeCallbacks(this.Y);
                }
            }
        }

        public final void d(int i10) {
            if (this.f18507c != i10) {
                Resources resources = this.Q.getResources();
                this.f18507c = i10;
                this.M = ce.c.g(resources, i10);
                View view = this.P;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        public void e(Canvas canvas, int i10, int i11) {
            float f10 = this.f18506b;
            if (f10 == 0.0f || this.O) {
                Drawable drawable = this.M;
                ce.c.b(canvas, drawable, i10 - (drawable.getMinimumWidth() / 2), i11 - (this.M.getMinimumHeight() / 2), this.Q.f18481d0 ? y.W(j.M(R.id.theme_color_icon, 2)) : y.J());
            } else if (f10 == 1.0f) {
                Drawable drawable2 = this.N;
                if (drawable2 == null) {
                    drawable2 = this.M;
                }
                ce.c.b(canvas, drawable2, i10 - (drawable2.getMinimumWidth() / 2), i11 - (drawable2.getMinimumHeight() / 2), this.Q.f18481d0 ? y.W(j.M(R.id.theme_color_iconActive, 2)) : y.h());
            } else {
                Paint W = this.Q.f18481d0 ? y.W(j.M(R.id.theme_color_icon, 2)) : y.J();
                int alpha = W.getAlpha();
                if (this.T) {
                    W.setAlpha((int) (alpha * (1.0f - this.f18506b)));
                } else if (this.V) {
                    W.setAlpha((int) (alpha * (1.0f - (1.0f - db.b.f7287b.getInterpolation(1.0f - this.f18506b)))));
                }
                Drawable drawable3 = this.M;
                ce.c.b(canvas, drawable3, i10 - (drawable3.getMinimumWidth() / 2), i11 - (this.M.getMinimumHeight() / 2), W);
                W.setAlpha(alpha);
                Drawable drawable4 = this.N;
                if (drawable4 == null) {
                    drawable4 = this.M;
                }
                Paint h10 = y.h();
                int alpha2 = h10.getAlpha();
                h10.setAlpha((int) (alpha2 * this.f18506b));
                ce.c.b(canvas, drawable4, i10 - (drawable4.getMinimumWidth() / 2), i11 - (drawable4.getMinimumHeight() / 2), h10);
                h10.setAlpha(alpha2);
            }
        }

        public final void g(boolean z10) {
            if (this.P != null) {
                int i10 = this.Z;
                this.Z = i10 + 1;
                long j10 = 1000;
                j10 = 4000;
                switch (i10) {
                    case 0:
                        o(false);
                        if (z10) {
                            j10 = 6000;
                            break;
                        }
                        break;
                    case 1:
                    case 3:
                    case 5:
                        j10 = 140;
                        break;
                    case 2:
                    case 4:
                        break;
                    case 6:
                        j10 = 370;
                        break;
                    case 7:
                        j10 = 130;
                        break;
                    case 8:
                        this.Z = 0;
                        break;
                    default:
                        this.Z = 0;
                        break;
                }
                this.P.postDelayed(this.Y, j10);
            }
        }

        public d h() {
            this.O = true;
            return this;
        }

        public void i(View view) {
            this.P = view;
        }

        public d j(float f10, boolean z10) {
            float f11 = this.f18506b;
            if (f11 == f10 || !z10 || this.P == null) {
                k kVar = this.S;
                if (kVar != null) {
                    kVar.l(f10);
                }
                k(f10);
            } else {
                if (this.S == null) {
                    this.S = new k(0, this, db.b.f7287b, 180L, f11);
                }
                this.S.i(f10);
            }
            return this;
        }

        public final void k(float f10) {
            if (this.f18506b != f10) {
                this.f18506b = f10;
                if (this.V) {
                    if (f10 == 1.0f) {
                        p();
                    } else {
                        c();
                    }
                }
                View view = this.P;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        public d l(boolean z10) {
            this.V = z10;
            return this;
        }

        public d m() {
            this.T = true;
            return this;
        }

        public d n(boolean z10) {
            this.U = z10 ? 1 : -1;
            return this;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            k(f10);
        }

        public final void o(boolean z10) {
            if (this.W != z10) {
                this.W = z10;
                this.N = ce.c.g(this.Q.getResources(), z10 ? R.drawable.deproko_baseline_animals_filled_blink_24 : this.R);
                View view = this.P;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        public final void p() {
            if (!this.X) {
                this.X = true;
                if (this.Y == null) {
                    this.Y = new Runnable() {
                        @Override
                        public final void run() {
                            z0.d.this.f();
                        }
                    };
                }
                this.Z = 0;
                g(true);
            }
        }
    }

    public static class e extends View {
        public int f18508a;
        public d f18509b;
        public boolean f18510c;

        public e(Context context) {
            super(context);
        }

        public void a() {
            this.f18510c = true;
        }

        public d getSection() {
            return this.f18509b;
        }

        @Override
        public void onDraw(Canvas canvas) {
            d dVar = this.f18509b;
            if (dVar != null) {
                dVar.e(canvas, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int g10 = a0.g();
            int horizontalPadding = (g10 - (z0.getHorizontalPadding() * 2)) / this.f18508a;
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(horizontalPadding, Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
            if (this.f18509b != null && this.f18510c) {
                setTranslationX(w.G2() ? g10 - (horizontalPadding * (this.f18509b.f18505a + 1)) : this.f18509b.f18505a * horizontalPadding);
            }
        }

        public void setItemCount(int i10) {
            this.f18508a = i10;
        }

        public void setSection(d dVar) {
            d dVar2 = this.f18509b;
            if (dVar2 != null) {
                dVar2.i(null);
            }
            this.f18509b = dVar;
            if (dVar != null) {
                dVar.i(this);
            }
        }
    }

    public interface f {
        boolean F(View view, TdApi.Animation animation);

        boolean P4(View view, l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState);

        void T6(z0 z0Var, boolean z10);

        long b();

        boolean c5();

        void k5();

        void w0(String str);
    }

    public static class g extends RecyclerView.h<h> implements View.OnLongClickListener {
        public final Context M;
        public final View.OnClickListener N;
        public final ArrayList<d> O;
        public final int P;
        public final z0 Q;
        public final v4<?> R;
        public Object S;
        public boolean T;
        public boolean U;
        public boolean V;
        public boolean W;
        public final ArrayList<v6> X;
        public final d Y;

        public g(Context context, z0 z0Var, View.OnClickListener onClickListener, int i10, boolean z10, v4<?> v4Var) {
            this.M = context;
            this.Q = z0Var;
            this.N = onClickListener;
            this.R = v4Var;
            ArrayList<d> arrayList = new ArrayList<>();
            this.O = arrayList;
            arrayList.add(new d(z0Var, -1, R.drawable.baseline_emoticon_outline_24, 0).h());
            arrayList.add(new d(z0Var, -2, R.drawable.deproko_baseline_gif_24, R.drawable.deproko_baseline_gif_filled_24));
            arrayList.add(new d(z0Var, -3, R.drawable.outline_whatshot_24, R.drawable.baseline_whatshot_24).m());
            d m10 = new d(z0Var, -4, R.drawable.baseline_access_time_24, R.drawable.baseline_watch_later_24).m();
            this.Y = m10;
            this.S = z10 ? arrayList.get(1) : m10;
            if (z10) {
                arrayList.get(1).j(1.0f, false);
            } else {
                m10.j(1.0f, false);
            }
            this.P = i10;
            this.X = new ArrayList<>();
        }

        @Override
        public int D() {
            int size = this.O.size();
            ArrayList<v6> arrayList = this.X;
            return size + (arrayList != null ? arrayList.size() : 0);
        }

        @Override
        public int F(int i10) {
            return i10 < this.O.size() ? 0 : 1;
        }

        public void f0(int i10, v6 v6Var) {
            this.X.add(i10, v6Var);
            J(i10 + this.O.size());
        }

        public final void g0() {
            int j02;
            boolean z10 = this.U || this.T;
            if (this.V != z10) {
                this.V = z10;
                if (z10) {
                    this.O.add(this.Y);
                    J(this.O.size() - 1);
                    return;
                }
                int indexOf = this.O.indexOf(this.Y);
                if (indexOf != -1) {
                    this.O.remove(indexOf);
                    O(indexOf);
                    return;
                }
                return;
            }
            Object obj = this.S;
            if (obj != null && (j02 = j0(obj)) != -1) {
                L(j02, 2);
            }
        }

        public int h0(boolean z10) {
            if (!z10) {
                return this.V ? 1 : 0;
            }
            ?? r22 = this.U;
            return this.T ? r22 + 1 : r22 == true ? 1 : 0;
        }

        public final Object i0(int i10) {
            if (i10 < this.O.size()) {
                return this.O.get(i10);
            }
            int size = i10 - this.O.size();
            if (size < 0 || size >= this.X.size()) {
                return null;
            }
            return this.X.get(size);
        }

        public final int j0(Object obj) {
            int D = D();
            for (int i10 = 0; i10 < D; i10++) {
                if (i0(i10) == obj) {
                    return i10;
                }
            }
            return -1;
        }

        public void k0(int i10, int i11) {
            this.X.add(i11, this.X.remove(i10));
            K(i10 + this.O.size(), i11 + this.O.size());
        }

        public void Q(h hVar, int i10) {
            int n10 = hVar.n();
            if (n10 == 0) {
                d dVar = this.O.get(i10);
                ((e) hVar.f2982a).setSection(dVar);
                hVar.f2982a.setOnLongClickListener(dVar == this.Y ? this : null);
            } else if (n10 == 1) {
                Object i02 = i0(i10);
                ((i) hVar.f2982a).g(this.S == i02 ? 1.0f : 0.0f, false);
                ((i) hVar.f2982a).h((v6) i02);
            }
        }

        public h S(ViewGroup viewGroup, int i10) {
            return h.O(this.M, i10, this.N, this, this.P, this.R);
        }

        public void V(h hVar) {
            if (hVar.n() == 1) {
                ((i) hVar.f2982a).a();
            }
        }

        public void W(h hVar) {
            if (hVar.n() == 1) {
                ((i) hVar.f2982a).b();
            }
        }

        @Override
        public boolean onLongClick(View view) {
            if (view instanceof i) {
                v6 c10 = ((i) view).c();
                z0 z0Var = this.Q;
                if (z0Var == null) {
                    return false;
                }
                z0Var.u2(c10);
                return true;
            }
            if (view instanceof e) {
                d section = ((e) view).getSection();
                z0 z0Var2 = this.Q;
                if (z0Var2 != null && section == this.Y) {
                    z0Var2.R1();
                    return true;
                }
            }
            return false;
        }

        public void X(h hVar) {
            if (hVar.n() == 1) {
                ((i) hVar.f2982a).Q2();
            }
        }

        public void q0(int i10) {
            if (i10 >= 0 && i10 < this.X.size()) {
                this.X.remove(i10);
                O(i10 + this.O.size());
            }
        }

        public void r0(boolean z10) {
            if (this.U != z10) {
                this.U = z10;
                g0();
            }
        }

        public void s0(boolean z10) {
            if (this.W != z10) {
                this.W = z10;
            }
        }

        public void t0(boolean z10) {
            if (this.T != z10) {
                this.T = z10;
                g0();
            }
        }

        public final void u0(Object obj, boolean z10, boolean z11, RecyclerView.p pVar) {
            int j02 = j0(obj);
            if (j02 != -1) {
                int F = F(j02);
                float f10 = 1.0f;
                if (F != 0) {
                    if (F == 1) {
                        View C = pVar.C(j02);
                        if (C == null || !(C instanceof i)) {
                            I(j02);
                            return;
                        }
                        i iVar = (i) C;
                        if (!z10) {
                            f10 = 0.0f;
                        }
                        iVar.g(f10, z11);
                    }
                } else if (j02 >= 0 && j02 < this.O.size()) {
                    d dVar = this.O.get(j02);
                    if (!z10) {
                        f10 = 0.0f;
                    }
                    dVar.j(f10, z11);
                }
            }
        }

        public boolean v0(Object obj, boolean z10, RecyclerView.p pVar) {
            Object obj2 = this.S;
            if (obj2 == obj) {
                return false;
            }
            u0(obj2, false, z10, pVar);
            this.S = obj;
            u0(obj, true, z10, pVar);
            return true;
        }

        public void w0(ArrayList<v6> arrayList) {
            int i10;
            if (!this.X.isEmpty()) {
                int size = this.X.size();
                this.X.clear();
                N(this.O.size(), size);
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                if (!arrayList.get(0).r()) {
                    this.X.addAll(arrayList);
                    i10 = arrayList.size();
                } else {
                    int i11 = 0;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        v6 v6Var = arrayList.get(i12);
                        if (!v6Var.r()) {
                            this.X.add(v6Var);
                            i11++;
                        }
                    }
                    i10 = i11;
                }
                M(this.O.size(), i10);
            }
        }
    }

    public static class h extends RecyclerView.c0 {
        public h(View view) {
            super(view);
        }

        public static h O(Context context, int i10, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i11, v4<?> v4Var) {
            if (i10 == 0) {
                e eVar = new e(context);
                if (v4Var != null) {
                    v4Var.t8(eVar);
                }
                eVar.setId(R.id.btn_section);
                eVar.setOnClickListener(onClickListener);
                eVar.setItemCount(i11);
                eVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
                return new h(eVar);
            } else if (i10 == 1) {
                i iVar = new i(context);
                if (v4Var != null) {
                    v4Var.t8(iVar);
                }
                iVar.setOnLongClickListener(onLongClickListener);
                iVar.setId(R.id.btn_stickerSet);
                iVar.setOnClickListener(onClickListener);
                iVar.e(i11);
                iVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
                return new h(iVar);
            } else {
                throw new RuntimeException("viewType == " + i10);
            }
        }
    }

    public static class i extends View implements kb.c, k.b {
        public float M;
        public v6 N;
        public Path O;
        public k P;
        public final p f18511a = new p(this, 0);
        public final m f18512b = new m(this);
        public int f18513c;

        public i(Context context) {
            super(context);
        }

        @Override
        public void Q2() {
            this.f18511a.b0();
            this.f18512b.b0();
        }

        public void a() {
            this.f18511a.e();
            this.f18512b.e();
        }

        public void b() {
            this.f18511a.b();
            this.f18512b.b();
        }

        public v6 c() {
            return this.N;
        }

        public final void d() {
            int headerImagePadding = z0.getHeaderImagePadding();
            this.f18511a.K0(headerImagePadding, headerImagePadding, getMeasuredWidth() - headerImagePadding, getMeasuredHeight() - headerImagePadding);
            this.f18512b.K0(headerImagePadding, headerImagePadding, getMeasuredWidth() - headerImagePadding, getMeasuredHeight() - headerImagePadding);
        }

        public void e(int i10) {
            this.f18513c = i10;
        }

        public final void f(float f10) {
            if (this.M != f10) {
                this.M = f10;
                invalidate();
            }
        }

        public void g(float f10, boolean z10) {
            if (z10) {
                float f11 = this.M;
                if (f11 != f10) {
                    if (this.P == null) {
                        this.P = new k(0, this, db.b.f7287b, 180L, f11);
                    }
                    this.P.i(f10);
                    return;
                }
            }
            k kVar = this.P;
            if (kVar != null) {
                kVar.l(f10);
            }
            f(f10);
        }

        public void h(v6 v6Var) {
            this.N = v6Var;
            this.O = v6Var.h(z0.getHeaderSize() - (z0.getHeaderImagePadding() * 2));
            this.f18511a.G(v6Var.i());
            this.f18512b.r(v6Var.g());
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            if (i10 == 0) {
                f(f10);
            }
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            boolean z10 = this.M != 0.0f;
            if (z10) {
                float f10 = measuredWidth;
                float f11 = measuredHeight;
                canvas.drawCircle(f10, f11, a0.i(18.0f) - ((int) (a0.i(4.0f) * (1.0f - this.M))), y.g(ib.d.b((int) (Color.alpha(i10) * this.M), j.i())));
                canvas.save();
                float f12 = ((1.0f - this.M) * 0.15f) + 0.85f;
                canvas.scale(f12, f12, f10, f11);
            }
            v6 v6Var = this.N;
            if (v6Var == null || !v6Var.m()) {
                if (this.f18511a.e0()) {
                    this.f18511a.P(canvas, this.O);
                }
                this.f18511a.draw(canvas);
            } else {
                if (this.f18512b.e0()) {
                    if (this.f18511a.e0()) {
                        this.f18511a.P(canvas, this.O);
                    }
                    this.f18511a.draw(canvas);
                }
                this.f18512b.draw(canvas);
            }
            if (z10) {
                canvas.restore();
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((a0.g() - (z0.getHorizontalPadding() * 2)) / this.f18513c, Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i11));
            d();
        }
    }

    public z0(Context context) {
        super(context);
    }

    public static int V1(boolean z10) {
        if (he.i.c2().Q0() == 0) {
            return z10 ? R.drawable.deproko_baseline_insert_emoticon_26 : R.drawable.baseline_emoticon_outline_24;
        }
        int L0 = he.i.c2().L0();
        return z10 ? L0 == 1 ? R.drawable.deproko_baseline_gif_24 : R.drawable.deproko_baseline_insert_sticker_26 : L0 == 1 ? R.drawable.deproko_baseline_gif_24 : R.drawable.deproko_baseline_stickers_24;
    }

    public boolean d2(View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        id.d.z().j();
        v4<?> w10 = this.P.w(0);
        if (w10 == null) {
            return true;
        }
        ((t8) w10).bf();
        return true;
    }

    public boolean f2(View view, int i10) {
        if (i10 == R.id.btn_done) {
            setShowRecents(false);
            v4<?> w10 = this.P.w(1);
            if (w10 != null) {
                ((n9) w10).Tg();
            }
            this.M.c().v4().o(new TdApi.ClearRecentStickers(), this.M.c().na());
        }
        return true;
    }

    public boolean g2(v6 v6Var, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        this.M.c().v4().o(new TdApi.ChangeStickerSet(v6Var.c(), false, false), this.M.c().na());
        return true;
    }

    public static int getHeaderImagePadding() {
        return a0.i(10.0f);
    }

    public static int getHeaderPadding() {
        return a0.i(6.0f);
    }

    public static int getHeaderSize() {
        return a0.i(47.0f);
    }

    public static int getHorizontalPadding() {
        return a0.i(2.5f);
    }

    public boolean h2(v6 v6Var, View view, int i10) {
        if (i10 == R.id.btn_delete) {
            this.M.c().v4().o(new TdApi.ChangeStickerSet(v6Var.c(), false, true), this.M.c().na());
        }
        return true;
    }

    public boolean i2(final v6 v6Var, View view, int i10) {
        v4<?> v4Var;
        if (i10 == R.id.btn_archive) {
            v4<?> v4Var2 = this.f18479b0;
            if (v4Var2 != null) {
                v4Var2.ee(w.m1(R.string.ArchiveStickerSet, v6Var.l()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.ArchiveStickerSetAction), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_archive_24, R.drawable.baseline_cancel_24}, new h0() {
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
                        boolean h22;
                        h22 = z0.this.h2(v6Var, view2, i11);
                        return h22;
                    }
                });
            }
        } else if (i10 == R.id.btn_copyLink) {
            j0.i(t2.e2(v6Var.f()), R.string.CopiedLink);
        } else if (i10 == R.id.more_btn_delete && (v4Var = this.f18479b0) != null) {
            v4Var.ee(w.m1(R.string.RemoveStickerSet, v6Var.l()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.RemoveStickerSetAction), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean g22;
                    g22 = z0.this.g2(v6Var, view2, i11);
                    return g22;
                }
            });
        }
        return true;
    }

    private void setAffectHeight(boolean z10) {
        if (this.f18496s0 != z10) {
            this.f18496s0 = z10;
            if (z10) {
                this.f18497t0 = this.f18485h0;
                float f10 = this.f18494q0;
                this.f18499v0 = f10;
                this.f18498u0 = T1(1 - Math.round(f10)) - this.f18485h0;
            }
        }
    }

    private void setCircleFactor(float f10) {
        if (this.f18484g0 != f10) {
            this.f18484g0 = f10;
            S2();
        }
    }

    private void setCurrentPageFactor(float f10) {
        if (this.f18494q0 != f10) {
            this.f18494q0 = f10;
            T2();
        }
    }

    public final void A2(int i10, boolean z10) {
        this.f18487j0 = i10;
        int headerSize = i10 - ((int) (this.f18485h0 * getHeaderSize()));
        int max = Math.max(0, headerSize);
        this.f18489l0 = max;
        this.f18488k0 = max;
        if (headerSize < 0) {
            setHeaderHideFactor(0.0f);
        }
    }

    public final void B2(int i10) {
        v4<?> w10 = this.P.w(0);
        if (w10 != null) {
            ((t8) w10).cf(i10);
        }
    }

    public final void C2(v6 v6Var) {
        v4<?> w10 = this.P.w(1);
        if (w10 != null) {
            ((n9) w10).lh(v6Var);
        }
    }

    public boolean D2(View view, TdApi.Animation animation) {
        f fVar = this.N;
        return fVar != null && fVar.F(view, animation);
    }

    public boolean E2(View view, l lVar, boolean z10, TdApi.MessageSchedulingState messageSchedulingState) {
        f fVar = this.N;
        return fVar != null && fVar.P4(view, lVar, z10, messageSchedulingState);
    }

    public final void F2(float f10, boolean z10) {
        if (this.f18484g0 == f10 || !z10 || getVisibility() != 0) {
            k kVar = this.f18482e0;
            if (kVar != null) {
                kVar.l(f10);
            }
            setCircleFactor(f10);
            return;
        }
        if (this.f18482e0 == null) {
            this.f18482e0 = new k(1, this, db.b.f7291f, 210L, this.f18484g0);
        }
        if (f10 == 1.0f && this.f18484g0 == 0.0f) {
            this.f18482e0.B(db.b.f7291f);
            this.f18482e0.y(210L);
        } else {
            this.f18482e0.B(db.b.f7287b);
            this.f18482e0.y(100L);
        }
        this.f18482e0.i(f10);
    }

    public void G2(boolean z10, boolean z11) {
        if (!z11 || !this.f18495r0) {
            I2(z10, true, z11 ? R.drawable.baseline_search_24 : R.drawable.baseline_backspace_24, z11 ? 0 : -a0.i(1.5f));
        }
    }

    public final void I2(boolean z10, boolean z11, int i10, int i11) {
        if (this.f18483f0 != z10) {
            if (z10 && i10 != 0) {
                this.W.k(i10, i11);
            }
            this.f18483f0 = z10;
            F2(z10 ? 1.0f : 0.0f, z11);
        }
    }

    public final void J2(Object obj, boolean z10) {
        if (this.f18478a0.v0(obj, z10, this.T.getLayoutManager())) {
            int j02 = this.f18478a0.j0(obj);
            int X1 = ((LinearLayoutManager) this.T.getLayoutManager()).X1();
            int a22 = ((LinearLayoutManager) this.T.getLayoutManager()).a2();
            int g10 = (a0.g() - (getHorizontalPadding() * 2)) / this.U.size();
            if (X1 != -1) {
                int i10 = X1 * g10;
                View C = this.T.getLayoutManager().C(X1);
                if (C != null) {
                    i10 += -C.getLeft();
                }
                if (j02 - 2 < X1) {
                    int i11 = ((j02 * g10) - (g10 / 2)) - (g10 * 1);
                    if (!z10 || this.f18485h0 == 1.0f) {
                        this.T.scrollBy(i11 - i10, 0);
                    } else {
                        this.T.u1(i11 - i10, 0);
                    }
                } else if (j02 + 2 > a22) {
                    int max = Math.max(0, ((j02 - this.U.size()) * g10) + (g10 * 2) + (g10 / 2));
                    if (!z10 || this.f18485h0 == 1.0f) {
                        this.T.scrollBy(max - i10, 0);
                    } else {
                        this.T.u1(max - i10, 0);
                    }
                }
            }
        }
    }

    public void K1(int i10, v6 v6Var) {
        g gVar = this.f18478a0;
        gVar.f0(i10 - gVar.h0(true), v6Var);
    }

    public void L1() {
        this.f18488k0 = this.f18489l0;
    }

    public void L2(int i10, boolean z10, boolean z11) {
        if (this.f18478a0.T && this.f18478a0.U && z10 && i10 >= 1) {
            i10--;
        }
        if (z10) {
            i10 += this.f18478a0.O.size() - this.f18478a0.h0(false);
        }
        J2(this.f18478a0.i0(i10), z11);
    }

    public final void M2(float f10, boolean z10) {
        if (z10) {
            if (this.f18486i0 == null) {
                this.f18486i0 = new k(0, this, db.b.f7287b, 210L, this.f18485h0);
            }
            this.f18486i0.i(f10);
            return;
        }
        k kVar = this.f18486i0;
        if (kVar != null) {
            kVar.l(f10);
        }
        setHeaderHideFactor(f10);
    }

    public void N2(ArrayList<v6> arrayList, boolean z10, boolean z11) {
        this.f18478a0.r0(z10);
        this.f18478a0.t0(z11);
        this.f18478a0.w0(arrayList);
    }

    public boolean O1() {
        return this.f18493p0 == 0 && this.f18494q0 == 0.0f;
    }

    public final void P1() {
        v4<?> v4Var = this.f18479b0;
        if (v4Var != null) {
            v4Var.ee(null, new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{w.i1(R.string.ClearRecentEmojiAction), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean d22;
                    d22 = z0.this.d2(view, i10);
                    return d22;
                }
            });
        }
    }

    public void P2(EditText editText) {
        this.f18501x0 = 1;
        x.f(editText);
    }

    @Override
    public void Q5(int i10, int i11) {
        if (w.H1(i10, i11)) {
            RecyclerView recyclerView = this.T;
            if (recyclerView != null) {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).B2(w.G2());
            }
            v2 v2Var = this.O;
            if (v2Var != null) {
                v2Var.s();
            }
        }
    }

    public final void R1() {
        if (this.f18479b0 != null && this.f18478a0.T) {
            this.f18479b0.ee(null, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.ClearRecentStickers), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean f22;
                    f22 = z0.this.f2(view, i10);
                    return f22;
                }
            });
        }
    }

    public final void R2() {
        float f10 = this.f18485h0;
        float f11 = 0.0f;
        if (f10 != 0.0f && f10 != 1.0f) {
            if (f10 > 0.25f && this.f18487j0 - getHeaderSize() > 0) {
                f11 = 1.0f;
            }
            j2(f11, true);
        }
    }

    public long S1() {
        f fVar = this.N;
        if (fVar != null) {
            return fVar.b();
        }
        return 0L;
    }

    public final void S2() {
        if (this.W != null) {
            float f10 = this.f18484g0;
            float f11 = (0.39999998f * f10) + 0.6f;
            this.W.setAlpha(Math.min(1.0f, Math.max(0.0f, f10)));
            this.W.setScaleX(f11);
            this.W.setScaleY(f11);
        }
    }

    public final float T1(int i10) {
        v4<?> w10;
        if (i10 != 1 || (w10 = this.P.w(1)) == null) {
            return 0.0f;
        }
        return ((n9) w10).Wf();
    }

    public final void T2() {
        FrameLayoutFix frameLayoutFix = this.S;
        float f10 = -1.0f;
        frameLayoutFix.setTranslationX(frameLayoutFix.getMeasuredWidth() * this.f18494q0 * (w.G2() ? 1.0f : -1.0f));
        RecyclerView recyclerView = this.T;
        if (recyclerView != null) {
            float measuredWidth = recyclerView.getMeasuredWidth() * (1.0f - this.f18494q0);
            if (!w.G2()) {
                f10 = 1.0f;
            }
            recyclerView.setTranslationX(measuredWidth * f10);
        }
    }

    @Override
    public void U3(int i10) {
        this.f18493p0 = i10;
        setAffectHeight(i10 != 0);
    }

    public boolean V2() {
        return this.f18481d0;
    }

    public final boolean W1() {
        f fVar = this.N;
        return fVar != null && !fVar.c5();
    }

    public final boolean X1() {
        v4<?> w10 = this.P.w(1);
        return w10 != null && !this.f18495r0 && ((n9) w10).Lg();
    }

    public void Y1(EditText editText) {
        this.f18501x0 = 2;
        x.c(editText);
    }

    public void Z1(v4<?> v4Var, boolean z10, f fVar, v4<?> v4Var2, boolean z11) {
        int i10;
        this.M = v4Var;
        this.N = fVar;
        this.f18479b0 = v4Var2;
        this.f18480c0 = z10;
        this.f18481d0 = z11;
        ArrayList<d> arrayList = new ArrayList<>();
        this.U = arrayList;
        arrayList.add(new d(this, 0, R.drawable.baseline_access_time_24, R.drawable.baseline_watch_later_24).j(1.0f, false).m().n(false));
        this.U.add(new d(this, 1, R.drawable.baseline_emoticon_outline_24, R.drawable.baseline_emoticon_24).m());
        this.U.add(new d(this, 2, R.drawable.deproko_baseline_animals_outline_24, R.drawable.deproko_baseline_animals_24).l(!z11));
        this.U.add(new d(this, 3, R.drawable.baseline_restaurant_menu_24, R.drawable.baseline_restaurant_menu_24));
        this.U.add(new d(this, 4, R.drawable.baseline_directions_car_24, R.drawable.baseline_directions_car_24));
        this.U.add(new d(this, 5, R.drawable.deproko_baseline_lamp_24, R.drawable.deproko_baseline_lamp_filled_24));
        this.U.add(new d(this, 6, R.drawable.deproko_baseline_flag_outline_24, R.drawable.deproko_baseline_flag_filled_24).m());
        if (z10) {
            this.U.add(new d(this, 7, R.drawable.deproko_baseline_stickers_24, 0).h().n(true));
        } else {
            ArrayList<d> arrayList2 = this.U;
            arrayList2.get(arrayList2.size() - 1).n(true);
        }
        this.P = new c(v4Var, this, z10, v4Var2);
        v2 v2Var = new v2(getContext());
        this.O = v2Var;
        v2Var.setOverScrollMode(fd.a.f11879a ? 1 : 2);
        this.O.c(this);
        this.O.setAdapter(this.P);
        this.O.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        int headerSize = getHeaderSize();
        a aVar = new a(getContext());
        this.Q = aVar;
        if (z11) {
            aVar.setBackgroundColor(j.M(R.id.theme_color_filling, 2));
        } else {
            yd.g.i(aVar, R.id.theme_color_filling, v4Var2);
        }
        this.Q.setLayoutParams(FrameLayoutFix.q1(-1, headerSize));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(getContext());
        this.S = frameLayoutFix;
        frameLayoutFix.setPadding(getHorizontalPadding(), 0, getHorizontalPadding(), 0);
        this.S.setLayoutParams(FrameLayoutFix.q1(-1, headerSize));
        Iterator<d> it = this.U.iterator();
        while (it.hasNext()) {
            d next = it.next();
            e eVar = new e(getContext());
            if (v4Var2 != null) {
                v4Var2.t8(eVar);
            }
            eVar.setId(R.id.btn_section);
            eVar.a();
            eVar.setOnClickListener(this);
            eVar.setOnLongClickListener(this);
            eVar.setSection(next);
            eVar.setItemCount(this.U.size());
            eVar.setLayoutParams(FrameLayoutFix.q1(-2, -1));
            this.S.addView(eVar);
        }
        this.Q.addView(this.S);
        if (z10) {
            RecyclerView recyclerView = new RecyclerView(getContext());
            this.T = recyclerView;
            recyclerView.setHasFixedSize(true);
            this.T.setItemAnimator(new tc.d(db.b.f7287b, 180L));
            this.T.setOverScrollMode(fd.a.f11879a ? 1 : 2);
            this.T.setLayoutManager(new LinearLayoutManager(getContext(), 0, w.G2()));
            this.T.g(new b());
            RecyclerView recyclerView2 = this.T;
            g gVar = new g(getContext(), this, this, this.U.size(), he.i.c2().L0() == 1, v4Var2);
            this.f18478a0 = gVar;
            recyclerView2.setAdapter(gVar);
            this.T.setLayoutParams(FrameLayoutFix.q1(-1, headerSize));
            this.Q.addView(this.T);
        } else {
            this.T = null;
            this.f18478a0 = null;
        }
        f3 f3Var = new f3(getContext());
        this.R = f3Var;
        if (v4Var2 != null) {
            v4Var2.t8(f3Var);
        }
        this.R.setSimpleBottomTransparentShadow(true);
        FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(this.R.getLayoutParams().width, this.R.getLayoutParams().height);
        q12.topMargin = headerSize;
        this.R.setLayoutParams(q12);
        if (z10) {
            i10 = he.i.c2().Q0();
            if (this.O.getCurrentItem() != i10) {
                this.O.N(i10, false);
            }
        } else {
            i10 = 0;
        }
        int i11 = a0.i(4.0f);
        int i12 = i11 * 2;
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1((a0.i(23.0f) * 2) + i12, (a0.i(23.0f) * 2) + i12, 85);
        int i13 = a0.i(16.0f) - i11;
        r12.bottomMargin = i13;
        r12.rightMargin = i13;
        c0 c0Var = new c0(getContext());
        this.W = c0Var;
        if (v4Var2 != null) {
            v4Var2.t8(c0Var);
        }
        this.W.setId(R.id.btn_circle);
        if (i10 == 0) {
            this.W.e(R.drawable.baseline_backspace_24, -a0.i(1.5f), 46.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
            I2(W1(), false, 0, 0);
        } else {
            this.W.d(R.drawable.baseline_search_24, 46.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
            I2(X1(), false, 0, 0);
        }
        this.W.setOnClickListener(this);
        this.W.setLayoutParams(r12);
        S2();
        addView(this.O);
        addView(this.Q);
        addView(this.R);
        addView(this.W);
        if (z11) {
            setBackgroundColor(j.M(R.id.theme_color_chatKeyboard, 2));
        } else {
            yd.g.i(this, R.id.theme_color_chatKeyboard, v4Var2);
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public void a2() {
        c cVar = this.P;
        if (cVar != null) {
            cVar.x();
        }
    }

    public void b0() {
        this.P.v();
    }

    public boolean c2() {
        return !this.f18490m0;
    }

    public int getCurrentItem() {
        return this.O.getCurrentItem();
    }

    public int getHeaderBottom() {
        return ((int) (getHeaderSize() * (1.0f - this.f18485h0))) + a0.i(12.0f);
    }

    public float getHeaderHideFactor() {
        return this.f18485h0;
    }

    public int getSize() {
        return x.a();
    }

    public q.b getToneDelegate() {
        v4<?> v4Var = this.M;
        if (v4Var == null || !(v4Var instanceof q.b)) {
            return null;
        }
        return (q.b) v4Var;
    }

    public void j(boolean z10) {
        int i10 = this.f18501x0;
        if (i10 == 1 && z10) {
            this.f18502y0 = Build.VERSION.SDK_INT >= 24 ? 45 : 55;
        } else if (i10 == 2 && !z10) {
            this.f18501x0 = 0;
        }
    }

    public final void j2(float f10, boolean z10) {
        if (f10 == 1.0f) {
            this.f18488k0 = Math.max(0, this.f18487j0 - getHeaderSize());
        } else {
            int i10 = this.f18487j0;
            this.f18489l0 = i10;
            this.f18488k0 = i10;
        }
        M2(f10, z10);
    }

    public final void k2(int i10) {
        this.f18487j0 = i10;
        if (this.f18491n0) {
            y2();
            this.f18491n0 = false;
        } else if (!this.f18490m0 && this.f18493p0 == 0) {
            float max = Math.max(0.0f, Math.min(1.0f, (i10 - this.f18488k0) / getHeaderSize()));
            if (max == 1.0f) {
                this.f18489l0 = Math.max(0, i10 - getHeaderSize());
            } else if (max == 0.0f) {
                this.f18489l0 = i10;
                this.f18488k0 = i10;
            }
            M2(max, false);
        }
    }

    public void l2(int i10) {
        boolean z10 = false;
        if (this.f18491n0) {
            y2();
            this.f18491n0 = false;
        } else if (!this.f18490m0 && this.f18493p0 == 0) {
            this.f18488k0 = 0;
            this.f18487j0 = i10;
            M2(Math.min(1.0f, Math.max(0.0f, i10 / getHeaderSize())), false);
            if (this.f18485h0 == 0.0f) {
                z10 = true;
            }
            G2(z10, true);
        }
    }

    public void m2(int i10, int i11) {
        int h02 = this.f18478a0.h0(true);
        this.f18478a0.k0(i10 - h02, i11 - h02);
    }

    public void n2(String str) {
        f fVar = this.N;
        if (fVar != null) {
            fVar.w0(str);
        }
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (i10 == 0) {
            setHeaderHideFactor(f10);
        } else if (i10 == 1) {
            setCircleFactor(f10);
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onClick(View view) {
        f fVar;
        f fVar2;
        v4<?> w10;
        v6 c10;
        if (this.f18493p0 == 0) {
            int id2 = view.getId();
            if (id2 == R.id.btn_circle) {
                int currentItem = this.O.getCurrentItem();
                if (currentItem == 0) {
                    f fVar3 = this.N;
                    if (fVar3 != null) {
                        fVar3.k5();
                    }
                } else if (currentItem == 1 && (fVar = this.N) != null) {
                    fVar.T6(this, false);
                }
            } else if (id2 == R.id.btn_section) {
                d section = ((e) view).getSection();
                int i10 = section.f18505a;
                if (i10 < 0) {
                    int i11 = (-i10) - 1;
                    if (i11 == 0) {
                        this.O.N(0, true);
                    } else if (i11 == 1) {
                        v4<?> w11 = this.P.w(1);
                        if (w11 != null && !((n9) w11).jh() && (fVar2 = this.N) != null) {
                            fVar2.T6(this, false);
                        }
                    } else if (i11 == 2) {
                        v4<?> w12 = this.P.w(1);
                        if (w12 != null) {
                            ((n9) w12).kh();
                        }
                    } else if (i11 == 3 && (w10 = this.P.w(1)) != null) {
                        ((n9) w10).nh();
                    }
                } else if (!this.f18480c0 || i10 != this.U.size() - 1) {
                    B2(section.f18505a);
                } else {
                    this.O.N(1, true);
                }
            } else if (id2 == R.id.btn_stickerSet && (c10 = ((i) view).c()) != null) {
                C2(c10);
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.btn_section) {
            if (this.U.get(0) == ((e) view).getSection() && id.d.z().f()) {
                P1();
                return true;
            }
        }
        return false;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(x.a(), Log.TAG_TDLIB_OPTIONS));
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth != 0 && this.f18500w0 != measuredWidth) {
            this.f18500w0 = measuredWidth;
            T2();
            this.P.y();
        }
    }

    @Override
    public boolean onPreDraw() {
        int i10 = this.f18501x0;
        if (i10 != 1 && i10 != 2) {
            return true;
        }
        int i11 = this.f18502y0 + 1;
        this.f18502y0 = i11;
        if (i11 < 60) {
            return false;
        }
        this.f18502y0 = 0;
        this.f18501x0 = 0;
        return true;
    }

    public void p2(int i10) {
        k2(i10);
    }

    public void r2(CharSequence charSequence) {
        if (this.O.getCurrentItem() == 0) {
            I2(charSequence.length() > 0, true, R.drawable.baseline_backspace_24, -a0.i(1.5f));
        }
    }

    @Override
    public void r4(int i10) {
        he.i.c2().H4(i10);
        boolean W1 = W1();
        boolean X1 = X1();
        int i11 = R.drawable.baseline_backspace_24;
        if (!W1 || !X1) {
            if (W1 || X1) {
                int i12 = 0;
                boolean z10 = (W1 && i10 == 0) || (X1 && i10 == 1);
                if (i10 != 0) {
                    i11 = R.drawable.baseline_search_24;
                }
                if (i10 == 0) {
                    i12 = -a0.i(1.5f);
                }
                I2(z10, true, i11, i12);
            }
        } else if (i10 == 0) {
            this.W.h(R.drawable.baseline_backspace_24, -a0.i(1.5f));
        } else {
            this.W.g(R.drawable.baseline_search_24);
        }
        y2();
    }

    public void s2() {
    }

    public void setCurrentEmojiSection(int i10) {
        int i11 = this.V;
        if (i11 != i10 && i10 != -1) {
            boolean z10 = true;
            this.U.get(i11).j(0.0f, (this.f18485h0 == 1.0f || this.f18494q0 == 1.0f) ? false : true);
            this.V = i10;
            d dVar = this.U.get(i10);
            if (this.f18485h0 == 1.0f || this.f18494q0 == 1.0f) {
                z10 = false;
            }
            dVar.j(1.0f, z10);
        }
    }

    public void setHasNewHots(boolean z10) {
        this.f18478a0.s0(z10);
    }

    public void setHeaderHideFactor(float f10) {
        if (this.f18485h0 != f10) {
            this.f18485h0 = f10;
            float f11 = (-getHeaderSize()) * this.f18485h0;
            this.Q.setTranslationY(f11);
            this.R.setTranslationY(f11);
            float interpolation = 1.0f - db.b.f7287b.getInterpolation(Math.max(0.0f, Math.min(1.0f, f10 / 0.5f)));
            this.S.setAlpha(interpolation);
            RecyclerView recyclerView = this.T;
            if (recyclerView != null) {
                recyclerView.setAlpha(interpolation);
            }
        }
    }

    public void setIgnoreMovement(boolean z10) {
        if (this.f18490m0 != z10) {
            this.f18490m0 = z10;
            if (z10) {
                this.f18491n0 = true;
            } else {
                y2();
            }
        }
    }

    public void setIsScrolling(boolean z10) {
        if (this.f18492o0 != z10) {
            this.f18492o0 = z10;
            if (!z10) {
                L1();
                R2();
            }
        }
    }

    public void setListener(f fVar) {
        this.N = fVar;
    }

    public void setMediaSection(boolean z10) {
        if (this.U.size() > 7) {
            this.U.get(7).d(z10 ? R.drawable.deproko_baseline_gif_24 : R.drawable.deproko_baseline_stickers_24);
        }
    }

    public void setPreferredSection(int i10) {
        if (this.f18480c0) {
            he.i.c2().E4(i10);
            boolean z10 = true;
            if (i10 != 1) {
                z10 = false;
            }
            setMediaSection(z10);
        }
    }

    public void setShowFavorite(boolean z10) {
        this.f18478a0.r0(z10);
    }

    public void setShowRecents(boolean z10) {
        this.f18478a0.t0(z10);
    }

    public void t2(int i10) {
        g gVar = this.f18478a0;
        gVar.q0(i10 - gVar.h0(true));
    }

    public final void u2(final v6 v6Var) {
        v4<?> v4Var = this.f18479b0;
        if (v4Var != null) {
            v4Var.ee(null, new int[]{R.id.btn_copyLink, R.id.btn_archive, R.id.more_btn_delete}, new String[]{w.i1(R.string.CopyLink), w.i1(R.string.ArchivePack), w.i1(R.string.DeletePack)}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_link_24, R.drawable.baseline_archive_24, R.drawable.baseline_delete_24}, new h0() {
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
                    boolean i22;
                    i22 = z0.this.i2(v6Var, view, i10);
                    return i22;
                }
            });
        }
    }

    public void v2() {
        v4<?> w10 = this.P.w(1);
        if (w10 != null) {
            ((n9) w10).If();
        }
    }

    @Override
    public void x(int i10, float f10, int i11) {
        setCurrentPageFactor(i10 + f10);
        if (this.f18496s0) {
            j2(this.f18497t0 + (Math.abs(this.f18499v0 - this.f18494q0) * this.f18498u0), false);
        }
    }

    public void y2() {
        z2(false);
    }

    public void z2(boolean z10) {
        v4<?> w10;
        int currentItem = this.O.getCurrentItem();
        if (currentItem == 0) {
            v4<?> w11 = this.P.w(0);
            if (w11 != null) {
                A2(((t8) w11).Ye(), z10);
            }
        } else if (currentItem == 1 && (w10 = this.P.w(1)) != null) {
            A2(((n9) w10).Vf(), z10);
        }
    }
}
