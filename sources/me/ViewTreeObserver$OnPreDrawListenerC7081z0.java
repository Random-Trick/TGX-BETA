package me;

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
import be.C1357a0;
import be.C1362c;
import be.C1379j0;
import be.C1408x;
import be.C1410y;
import cd.C2104l;
import gd.C4779t2;
import gd.C4817v6;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import me.ViewTreeObserver$OnPreDrawListenerC7081z0;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.C2746n9;
import p038ce.View$OnClickListenerC3099t8;
import p051db.C3950k;
import p057e2.AbstractC4117a;
import p067ed.C4183a;
import p082fd.C4403w;
import p108hb.C5064d;
import p110hd.C5078d;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p139jb.AbstractC5911c;
import p143k0.C6038h;
import p156kd.C6257p;
import p168ld.RunnableC6507m;
import p291uc.C9639r;
import p335xd.C10192g;
import p364zd.C11524j;
import sc.C8731d;
import td.AbstractC9323v4;

public class ViewTreeObserver$OnPreDrawListenerC7081z0 extends FrameLayoutFix implements ViewTreeObserver.OnPreDrawListener, ViewPager.AbstractC1054i, C3950k.AbstractC3952b, View.OnClickListener, View.OnLongClickListener, C4403w.AbstractC4404a {
    public AbstractC9323v4<?> f22467M;
    public AbstractC7087f f22468N;
    public C7045v2 f22469O;
    public C7084c f22470P;
    public FrameLayoutFix f22471Q;
    public C6879f3 f22472R;
    public FrameLayoutFix f22473S;
    public RecyclerView f22474T;
    public ArrayList<C7085d> f22475U;
    public int f22476V;
    public C6851c0 f22477W;
    public View$OnLongClickListenerC7088g f22478a0;
    public AbstractC9323v4<?> f22479b0;
    public boolean f22480c0;
    public boolean f22481d0;
    public C3950k f22482e0;
    public boolean f22483f0 = true;
    public float f22484g0 = 1.0f;
    public float f22485h0;
    public C3950k f22486i0;
    public int f22487j0;
    public int f22488k0;
    public int f22489l0;
    public boolean f22490m0;
    public boolean f22491n0;
    public boolean f22492o0;
    public int f22493p0;
    public float f22494q0;
    public boolean f22495r0;
    public boolean f22496s0;
    public float f22497t0;
    public float f22498u0;
    public float f22499v0;
    public int f22500w0;
    public int f22501x0;
    public int f22502y0;

    public class C7082a extends FrameLayoutFix {
        public C7082a(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return true;
        }
    }

    public class C7083b extends RecyclerView.AbstractC0901o {
        public C7083b() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39421k0(view);
            int i = 0;
            rect.left = k0 == 0 ? ViewTreeObserver$OnPreDrawListenerC7081z0.getHorizontalPadding() : 0;
            if (k0 == ViewTreeObserver$OnPreDrawListenerC7081z0.this.f22478a0.mo6153D() - 1) {
                i = ViewTreeObserver$OnPreDrawListenerC7081z0.getHorizontalPadding();
            }
            rect.right = i;
        }
    }

    public static class C7084c extends AbstractC4117a {
        public final ViewTreeObserver$OnPreDrawListenerC7081z0 f22505M;
        public final C6038h<AbstractC9323v4<?>> f22506N = new C6038h<>(2);
        public final boolean f22507O;
        public final AbstractC9323v4<?> f22508P;
        public final AbstractC9323v4<?> f22509c;

        public C7084c(AbstractC9323v4<?> v4Var, ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, boolean z, AbstractC9323v4<?> v4Var2) {
            this.f22509c = v4Var;
            this.f22505M = z0Var;
            this.f22508P = v4Var2;
            this.f22507O = z;
        }

        @Override
        public void mo8826b(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(((AbstractC9323v4) obj).get());
        }

        @Override
        public int mo8825e() {
            return this.f22507O ? 2 : 1;
        }

        @Override
        public Object mo8823j(ViewGroup viewGroup, int i) {
            AbstractC9323v4<?> e = this.f22506N.m21471e(i);
            if (e == null) {
                if (i == 0) {
                    e = new View$OnClickListenerC3099t8(this.f22509c.mo4347s(), this.f22509c.mo4348c());
                    e.m9476Ad(this.f22505M);
                } else if (i == 1) {
                    e = new C2746n9(this.f22509c.mo4347s(), this.f22509c.mo4348c());
                    e.m9476Ad(this.f22505M);
                } else {
                    throw new RuntimeException("position == " + i);
                }
                this.f22506N.m21466j(i, e);
                AbstractC9323v4<?> v4Var = this.f22508P;
                if (v4Var != null) {
                    e.m9354R8(v4Var);
                }
            }
            viewGroup.addView(e.get());
            return e;
        }

        @Override
        public boolean mo8822k(View view, Object obj) {
            return (obj instanceof AbstractC9323v4) && ((AbstractC9323v4) obj).get() == view;
        }

        public void m17828v() {
            int n = this.f22506N.m21463n();
            for (int i = 0; i < n; i++) {
                this.f22506N.m21462o(i).mo417Z8();
            }
            this.f22506N.m21474b();
        }

        public AbstractC9323v4<?> m17827w(int i) {
            return this.f22506N.m21471e(i);
        }

        public void m17826x() {
            for (int i = 0; i < this.f22506N.m21463n(); i++) {
                AbstractC9323v4<?> o = this.f22506N.m21462o(i);
                if (o.mo407R9() == R.id.controller_emoji) {
                    ((View$OnClickListenerC3099t8) o).m31450af();
                }
            }
        }

        public void m17825y() {
            for (int i = 0; i < this.f22506N.m21463n(); i++) {
                AbstractC9323v4<?> o = this.f22506N.m21462o(i);
                switch (o.mo407R9()) {
                    case R.id.controller_emoji:
                        ((View$OnClickListenerC3099t8) o).m31453Xe();
                        break;
                    case R.id.controller_emojiMedia:
                        ((C2746n9) o).m33709Sf();
                        break;
                }
            }
            this.f22505M.m17887B2();
        }
    }

    public static class C7085d implements C3950k.AbstractC3952b {
        public Drawable f22510M;
        public Drawable f22511N;
        public boolean f22512O;
        public View f22513P;
        public ViewTreeObserver$OnPreDrawListenerC7081z0 f22514Q;
        public final int f22515R;
        public C3950k f22516S;
        public boolean f22517T;
        public int f22518U;
        public boolean f22519V;
        public boolean f22520W;
        public boolean f22521X;
        public Runnable f22522Y;
        public int f22523Z;
        public final int f22524a;
        public float f22525b;
        public int f22526c;

        public C7085d(ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, int i, int i2, int i3) {
            this.f22514Q = z0Var;
            this.f22524a = i;
            this.f22515R = i3;
            this.f22511N = C1362c.m37482g(z0Var.getResources(), i3);
            m17821d(i2);
        }

        public void m17819f() {
            if (this.f22521X || this.f22520W) {
                m17810o(!this.f22520W);
                if (this.f22521X) {
                    m17818g(false);
                }
            }
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            m17814k(f);
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public final void m17822c() {
            if (this.f22521X) {
                this.f22521X = false;
                m17810o(false);
                View view = this.f22513P;
                if (view != null) {
                    view.removeCallbacks(this.f22522Y);
                }
            }
        }

        public final void m17821d(int i) {
            if (this.f22526c != i) {
                Resources resources = this.f22514Q.getResources();
                this.f22526c = i;
                this.f22510M = C1362c.m37482g(resources, i);
                View view = this.f22513P;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        public void m17820e(Canvas canvas, int i, int i2) {
            float f = this.f22525b;
            if (f == 0.0f || this.f22512O) {
                Drawable drawable = this.f22510M;
                C1362c.m37487b(canvas, drawable, i - (drawable.getMinimumWidth() / 2), i2 - (this.f22510M.getMinimumHeight() / 2), this.f22514Q.f22481d0 ? C1410y.m37055W(C11524j.m226O(R.id.theme_color_icon, 2)) : C1410y.m37068J());
            } else if (f == 1.0f) {
                Drawable drawable2 = this.f22511N;
                if (drawable2 == null) {
                    drawable2 = this.f22510M;
                }
                C1362c.m37487b(canvas, drawable2, i - (drawable2.getMinimumWidth() / 2), i2 - (drawable2.getMinimumHeight() / 2), this.f22514Q.f22481d0 ? C1410y.m37055W(C11524j.m226O(R.id.theme_color_iconActive, 2)) : C1410y.m37037h());
            } else {
                Paint W = this.f22514Q.f22481d0 ? C1410y.m37055W(C11524j.m226O(R.id.theme_color_icon, 2)) : C1410y.m37068J();
                int alpha = W.getAlpha();
                if (this.f22517T) {
                    W.setAlpha((int) (alpha * (1.0f - this.f22525b)));
                } else if (this.f22519V) {
                    W.setAlpha((int) (alpha * (1.0f - (1.0f - C2057b.f7280b.getInterpolation(1.0f - this.f22525b)))));
                }
                Drawable drawable3 = this.f22510M;
                C1362c.m37487b(canvas, drawable3, i - (drawable3.getMinimumWidth() / 2), i2 - (this.f22510M.getMinimumHeight() / 2), W);
                W.setAlpha(alpha);
                Drawable drawable4 = this.f22511N;
                if (drawable4 == null) {
                    drawable4 = this.f22510M;
                }
                Paint h = C1410y.m37037h();
                int alpha2 = h.getAlpha();
                h.setAlpha((int) (alpha2 * this.f22525b));
                C1362c.m37487b(canvas, drawable4, i - (drawable4.getMinimumWidth() / 2), i2 - (drawable4.getMinimumHeight() / 2), h);
                h.setAlpha(alpha2);
            }
        }

        public final void m17818g(boolean z) {
            if (this.f22513P != null) {
                int i = this.f22523Z;
                this.f22523Z = i + 1;
                long j = 1000;
                j = 4000;
                switch (i) {
                    case 0:
                        m17810o(false);
                        if (z) {
                            j = 6000;
                            break;
                        }
                        break;
                    case 1:
                    case 3:
                    case 5:
                        j = 140;
                        break;
                    case 2:
                    case 4:
                        break;
                    case 6:
                        j = 370;
                        break;
                    case 7:
                        j = 130;
                        break;
                    case 8:
                        this.f22523Z = 0;
                        break;
                    default:
                        this.f22523Z = 0;
                        break;
                }
                this.f22513P.postDelayed(this.f22522Y, j);
            }
        }

        public C7085d m17817h() {
            this.f22512O = true;
            return this;
        }

        public void m17816i(View view) {
            this.f22513P = view;
        }

        public C7085d m17815j(float f, boolean z) {
            float f2 = this.f22525b;
            if (f2 == f || !z || this.f22513P == null) {
                C3950k kVar = this.f22516S;
                if (kVar != null) {
                    kVar.m29541l(f);
                }
                m17814k(f);
            } else {
                if (this.f22516S == null) {
                    this.f22516S = new C3950k(0, this, C2057b.f7280b, 180L, f2);
                }
                this.f22516S.m29544i(f);
            }
            return this;
        }

        public final void m17814k(float f) {
            if (this.f22525b != f) {
                this.f22525b = f;
                if (this.f22519V) {
                    if (f == 1.0f) {
                        m17809p();
                    } else {
                        m17822c();
                    }
                }
                View view = this.f22513P;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        public C7085d m17813l(boolean z) {
            this.f22519V = z;
            return this;
        }

        public C7085d m17812m() {
            this.f22517T = true;
            return this;
        }

        public C7085d m17811n(boolean z) {
            this.f22518U = z ? 1 : -1;
            return this;
        }

        public final void m17810o(boolean z) {
            if (this.f22520W != z) {
                this.f22520W = z;
                this.f22511N = C1362c.m37482g(this.f22514Q.getResources(), z ? R.drawable.deproko_baseline_animals_filled_blink_24 : this.f22515R);
                View view = this.f22513P;
                if (view != null) {
                    view.invalidate();
                }
            }
        }

        public final void m17809p() {
            if (!this.f22521X) {
                this.f22521X = true;
                if (this.f22522Y == null) {
                    this.f22522Y = new Runnable() {
                        @Override
                        public final void run() {
                            ViewTreeObserver$OnPreDrawListenerC7081z0.C7085d.this.m17819f();
                        }
                    };
                }
                this.f22523Z = 0;
                m17818g(true);
            }
        }
    }

    public static class C7086e extends View {
        public int f22527a;
        public C7085d f22528b;
        public boolean f22529c;

        public C7086e(Context context) {
            super(context);
        }

        public void m17808a() {
            this.f22529c = true;
        }

        public C7085d getSection() {
            return this.f22528b;
        }

        @Override
        public void onDraw(Canvas canvas) {
            C7085d dVar = this.f22528b;
            if (dVar != null) {
                dVar.m17820e(canvas, getMeasuredWidth() / 2, getMeasuredHeight() / 2);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int g = C1357a0.m37543g();
            int horizontalPadding = (g - (ViewTreeObserver$OnPreDrawListenerC7081z0.getHorizontalPadding() * 2)) / this.f22527a;
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(horizontalPadding, Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            if (this.f22528b != null && this.f22529c) {
                setTranslationX(C4403w.m27984G2() ? g - (horizontalPadding * (this.f22528b.f22524a + 1)) : this.f22528b.f22524a * horizontalPadding);
            }
        }

        public void setItemCount(int i) {
            this.f22527a = i;
        }

        public void setSection(C7085d dVar) {
            C7085d dVar2 = this.f22528b;
            if (dVar2 != null) {
                dVar2.m17816i(null);
            }
            this.f22528b = dVar;
            if (dVar != null) {
                dVar.m17816i(this);
            }
        }
    }

    public interface AbstractC7087f {
        boolean mo16455E(View view, TdApi.Animation animation);

        boolean mo16446F4(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState);

        void mo16389M2(ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, boolean z);

        long mo16269b();

        boolean mo16228g5();

        void mo16154p5();

        void mo16097w0(String str);
    }

    public static class View$OnLongClickListenerC7088g extends RecyclerView.AbstractC0890h<C7089h> implements View.OnLongClickListener {
        public final Context f22530M;
        public final View.OnClickListener f22531N;
        public final ArrayList<C7085d> f22532O;
        public final int f22533P;
        public final ViewTreeObserver$OnPreDrawListenerC7081z0 f22534Q;
        public final AbstractC9323v4<?> f22535R;
        public Object f22536S;
        public boolean f22537T;
        public boolean f22538U;
        public boolean f22539V;
        public boolean f22540W;
        public final ArrayList<C4817v6> f22541X;
        public final C7085d f22542Y;

        public View$OnLongClickListenerC7088g(Context context, ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var, View.OnClickListener onClickListener, int i, boolean z, AbstractC9323v4<?> v4Var) {
            this.f22530M = context;
            this.f22534Q = z0Var;
            this.f22531N = onClickListener;
            this.f22535R = v4Var;
            ArrayList<C7085d> arrayList = new ArrayList<>();
            this.f22532O = arrayList;
            arrayList.add(new C7085d(z0Var, -1, R.drawable.baseline_emoticon_outline_24, 0).m17817h());
            arrayList.add(new C7085d(z0Var, -2, R.drawable.deproko_baseline_gif_24, R.drawable.deproko_baseline_gif_filled_24));
            arrayList.add(new C7085d(z0Var, -3, R.drawable.outline_whatshot_24, R.drawable.baseline_whatshot_24).m17812m());
            C7085d m = new C7085d(z0Var, -4, R.drawable.baseline_access_time_24, R.drawable.baseline_watch_later_24).m17812m();
            this.f22542Y = m;
            this.f22536S = z ? arrayList.get(1) : m;
            if (z) {
                arrayList.get(1).m17815j(1.0f, false);
            } else {
                m.m17815j(1.0f, false);
            }
            this.f22533P = i;
            this.f22541X = new ArrayList<>();
        }

        @Override
        public int mo6153D() {
            int size = this.f22532O.size();
            ArrayList<C4817v6> arrayList = this.f22541X;
            return size + (arrayList != null ? arrayList.size() : 0);
        }

        @Override
        public int mo6150F(int i) {
            return i < this.f22532O.size() ? 0 : 1;
        }

        public void m17802g0(int i, C4817v6 v6Var) {
            this.f22541X.add(i, v6Var);
            m39311J(i + this.f22532O.size());
        }

        public final void m17801h0() {
            int k0;
            boolean z = this.f22538U || this.f22537T;
            if (this.f22539V != z) {
                this.f22539V = z;
                if (z) {
                    this.f22532O.add(this.f22542Y);
                    m39311J(this.f22532O.size() - 1);
                    return;
                }
                int indexOf = this.f22532O.indexOf(this.f22542Y);
                if (indexOf != -1) {
                    this.f22532O.remove(indexOf);
                    m39306O(indexOf);
                    return;
                }
                return;
            }
            Object obj = this.f22536S;
            if (obj != null && (k0 = m17798k0(obj)) != -1) {
                m39309L(k0, 2);
            }
        }

        public int m17800i0(boolean z) {
            if (!z) {
                return this.f22539V ? 1 : 0;
            }
            ?? r2 = this.f22538U;
            return this.f22537T ? r2 + 1 : r2 == true ? 1 : 0;
        }

        public final Object m17799j0(int i) {
            if (i < this.f22532O.size()) {
                return this.f22532O.get(i);
            }
            int size = i - this.f22532O.size();
            if (size < 0 || size >= this.f22541X.size()) {
                return null;
            }
            return this.f22541X.get(size);
        }

        public final int m17798k0(Object obj) {
            int D = mo6153D();
            for (int i = 0; i < D; i++) {
                if (m17799j0(i) == obj) {
                    return i;
                }
            }
            return -1;
        }

        public void m17797l0(int i, int i2) {
            this.f22541X.add(i2, this.f22541X.remove(i));
            m39310K(i + this.f22532O.size(), i2 + this.f22532O.size());
        }

        public void mo6146Q(C7089h hVar, int i) {
            int n = hVar.m39332n();
            if (n == 0) {
                C7085d dVar = this.f22532O.get(i);
                ((C7086e) hVar.f3479a).setSection(dVar);
                hVar.f3479a.setOnLongClickListener(dVar == this.f22542Y ? this : null);
            } else if (n == 1) {
                Object j0 = m17799j0(i);
                ((C7090i) hVar.f3479a).m17777g(this.f22536S == j0 ? 1.0f : 0.0f, false);
                ((C7090i) hVar.f3479a).m17776h((C4817v6) j0);
            }
        }

        public C7089h mo6145S(ViewGroup viewGroup, int i) {
            return C7089h.m17784O(this.f22530M, i, this.f22531N, this, this.f22533P, this.f22535R);
        }

        public void mo6144V(C7089h hVar) {
            if (hVar.m39332n() == 1) {
                ((C7090i) hVar.f3479a).m17783a();
            }
        }

        @Override
        public boolean onLongClick(View view) {
            if (view instanceof C7090i) {
                C4817v6 c = ((C7090i) view).m17781c();
                ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var = this.f22534Q;
                if (z0Var == null) {
                    return false;
                }
                z0Var.m17829z2(c);
                return true;
            }
            if (view instanceof C7086e) {
                C7085d section = ((C7086e) view).getSection();
                ViewTreeObserver$OnPreDrawListenerC7081z0 z0Var2 = this.f22534Q;
                if (z0Var2 != null && section == this.f22542Y) {
                    z0Var2.m17859T1();
                    return true;
                }
            }
            return false;
        }

        public void mo6143W(C7089h hVar) {
            if (hVar.m39332n() == 1) {
                ((C7090i) hVar.f3479a).m17782b();
            }
        }

        public void mo6142X(C7089h hVar) {
            if (hVar.m39332n() == 1) {
                ((C7090i) hVar.f3479a).mo4501a3();
            }
        }

        public void m17791r0(int i) {
            if (i >= 0 && i < this.f22541X.size()) {
                this.f22541X.remove(i);
                m39306O(i + this.f22532O.size());
            }
        }

        public void m17790s0(boolean z) {
            if (this.f22538U != z) {
                this.f22538U = z;
                m17801h0();
            }
        }

        public void m17789t0(boolean z) {
            if (this.f22540W != z) {
                this.f22540W = z;
            }
        }

        public void m17788u0(boolean z) {
            if (this.f22537T != z) {
                this.f22537T = z;
                m17801h0();
            }
        }

        public final void m17787w0(Object obj, boolean z, boolean z2, RecyclerView.AbstractC0902p pVar) {
            int k0 = m17798k0(obj);
            if (k0 != -1) {
                int F = mo6150F(k0);
                float f = 1.0f;
                if (F != 0) {
                    if (F == 1) {
                        View C = pVar.mo39262C(k0);
                        if (C == null || !(C instanceof C7090i)) {
                            m39312I(k0);
                            return;
                        }
                        C7090i iVar = (C7090i) C;
                        if (!z) {
                            f = 0.0f;
                        }
                        iVar.m17777g(f, z2);
                    }
                } else if (k0 >= 0 && k0 < this.f22532O.size()) {
                    C7085d dVar = this.f22532O.get(k0);
                    if (!z) {
                        f = 0.0f;
                    }
                    dVar.m17815j(f, z2);
                }
            }
        }

        public boolean m17786x0(Object obj, boolean z, RecyclerView.AbstractC0902p pVar) {
            Object obj2 = this.f22536S;
            if (obj2 == obj) {
                return false;
            }
            m17787w0(obj2, false, z, pVar);
            this.f22536S = obj;
            m17787w0(obj, true, z, pVar);
            return true;
        }

        public void m17785y0(ArrayList<C4817v6> arrayList) {
            int i;
            if (!this.f22541X.isEmpty()) {
                int size = this.f22541X.size();
                this.f22541X.clear();
                m39307N(this.f22532O.size(), size);
            }
            if (!(arrayList == null || arrayList.isEmpty())) {
                if (!arrayList.get(0).m25167r()) {
                    this.f22541X.addAll(arrayList);
                    i = arrayList.size();
                } else {
                    int i2 = 0;
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C4817v6 v6Var = arrayList.get(i3);
                        if (!v6Var.m25167r()) {
                            this.f22541X.add(v6Var);
                            i2++;
                        }
                    }
                    i = i2;
                }
                m39308M(this.f22532O.size(), i);
            }
        }
    }

    public static class C7089h extends RecyclerView.AbstractC0886d0 {
        public C7089h(View view) {
            super(view);
        }

        public static C7089h m17784O(Context context, int i, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, int i2, AbstractC9323v4<?> v4Var) {
            if (i == 0) {
                C7086e eVar = new C7086e(context);
                if (v4Var != null) {
                    v4Var.m9163t8(eVar);
                }
                eVar.setId(R.id.btn_section);
                eVar.setOnClickListener(onClickListener);
                eVar.setItemCount(i2);
                eVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
                return new C7089h(eVar);
            } else if (i == 1) {
                C7090i iVar = new C7090i(context);
                if (v4Var != null) {
                    v4Var.m9163t8(iVar);
                }
                iVar.setOnLongClickListener(onLongClickListener);
                iVar.setId(R.id.btn_stickerSet);
                iVar.setOnClickListener(onClickListener);
                iVar.m17779e(i2);
                iVar.setLayoutParams(new RecyclerView.LayoutParams(-2, -1));
                return new C7089h(iVar);
            } else {
                throw new RuntimeException("viewType == " + i);
            }
        }
    }

    public static class C7090i extends View implements AbstractC5911c, C3950k.AbstractC3952b {
        public float f22543M;
        public C4817v6 f22544N;
        public Path f22545O;
        public C3950k f22546P;
        public final C6257p f22547a = new C6257p(this, 0);
        public final RunnableC6507m f22548b = new RunnableC6507m(this);
        public int f22549c;

        public C7090i(Context context) {
            super(context);
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            if (i == 0) {
                m17778f(f);
            }
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
        }

        public void m17783a() {
            this.f22547a.mo20245f();
            this.f22548b.mo20245f();
        }

        @Override
        public void mo4501a3() {
            this.f22547a.mo20249Z();
            this.f22548b.mo20249Z();
        }

        public void m17782b() {
            this.f22547a.mo20247b();
            this.f22548b.mo20247b();
        }

        public C4817v6 m17781c() {
            return this.f22544N;
        }

        public final void m17780d() {
            int headerImagePadding = ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderImagePadding();
            this.f22547a.mo20256K0(headerImagePadding, headerImagePadding, getMeasuredWidth() - headerImagePadding, getMeasuredHeight() - headerImagePadding);
            this.f22548b.mo20256K0(headerImagePadding, headerImagePadding, getMeasuredWidth() - headerImagePadding, getMeasuredHeight() - headerImagePadding);
        }

        public void m17779e(int i) {
            this.f22549c = i;
        }

        public final void m17778f(float f) {
            if (this.f22543M != f) {
                this.f22543M = f;
                invalidate();
            }
        }

        public void m17777g(float f, boolean z) {
            if (z) {
                float f2 = this.f22543M;
                if (f2 != f) {
                    if (this.f22546P == null) {
                        this.f22546P = new C3950k(0, this, C2057b.f7280b, 180L, f2);
                    }
                    this.f22546P.m29544i(f);
                    return;
                }
            }
            C3950k kVar = this.f22546P;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            m17778f(f);
        }

        public void m17776h(C4817v6 v6Var) {
            this.f22544N = v6Var;
            this.f22545O = v6Var.m25177h(ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderSize() - (ViewTreeObserver$OnPreDrawListenerC7081z0.getHeaderImagePadding() * 2));
            this.f22547a.m20819G(v6Var.m25176i());
            this.f22548b.m20231r(v6Var.m25178g());
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredHeight = getMeasuredHeight() / 2;
            boolean z = this.f22543M != 0.0f;
            if (z) {
                float f = measuredWidth;
                float f2 = measuredHeight;
                canvas.drawCircle(f, f2, C1357a0.m37541i(18.0f) - ((int) (C1357a0.m37541i(4.0f) * (1.0f - this.f22543M))), C1410y.m37039g(C5064d.m24130b((int) (Color.alpha(i) * this.f22543M), C11524j.m178i())));
                canvas.save();
                float f3 = ((1.0f - this.f22543M) * 0.15f) + 0.85f;
                canvas.scale(f3, f3, f, f2);
            }
            C4817v6 v6Var = this.f22544N;
            if (v6Var == null || !v6Var.m25172m()) {
                if (this.f22547a.mo20246c0()) {
                    this.f22547a.mo20254O(canvas, this.f22545O);
                }
                this.f22547a.draw(canvas);
            } else {
                if (this.f22548b.mo20246c0()) {
                    if (this.f22547a.mo20246c0()) {
                        this.f22547a.mo20254O(canvas, this.f22545O);
                    }
                    this.f22547a.draw(canvas);
                }
                this.f22548b.draw(canvas);
            }
            if (z) {
                canvas.restore();
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.makeMeasureSpec((C1357a0.m37543g() - (ViewTreeObserver$OnPreDrawListenerC7081z0.getHorizontalPadding() * 2)) / this.f22549c, Log.TAG_TDLIB_OPTIONS), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
            m17780d();
        }
    }

    public ViewTreeObserver$OnPreDrawListenerC7081z0(Context context) {
        super(context);
    }

    public static int m17853W1(boolean z) {
        if (C4868i.m24726c2().m24814Q0() == 0) {
            return z ? R.drawable.deproko_baseline_insert_emoticon_26 : R.drawable.baseline_emoticon_outline_24;
        }
        int L0 = C4868i.m24726c2().m24849L0();
        return z ? L0 == 1 ? R.drawable.deproko_baseline_gif_24 : R.drawable.deproko_baseline_insert_sticker_26 : L0 == 1 ? R.drawable.deproko_baseline_gif_24 : R.drawable.deproko_baseline_stickers_24;
    }

    public boolean m17844f2(View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        C5078d.m23986z().m24002j();
        AbstractC9323v4<?> w = this.f22470P.m17827w(0);
        if (w == null) {
            return true;
        }
        ((View$OnClickListenerC3099t8) w).m31449bf();
        return true;
    }

    public static int getHeaderImagePadding() {
        return C1357a0.m37541i(10.0f);
    }

    public static int getHeaderPadding() {
        return C1357a0.m37541i(6.0f);
    }

    public static int getHeaderSize() {
        return C1357a0.m37541i(47.0f);
    }

    public static int getHorizontalPadding() {
        return C1357a0.m37541i(2.5f);
    }

    public boolean m17843h2(View view, int i) {
        if (i == R.id.btn_done) {
            setShowRecents(false);
            AbstractC9323v4<?> w = this.f22470P.m17827w(1);
            if (w != null) {
                ((C2746n9) w).m33705Tg();
            }
            this.f22467M.mo4348c().m2270r4().m14783o(new TdApi.ClearRecentStickers(), this.f22467M.mo4348c().m2392ja());
        }
        return true;
    }

    public boolean m17842i2(C4817v6 v6Var, View view, int i) {
        if (i != R.id.btn_delete) {
            return true;
        }
        this.f22467M.mo4348c().m2270r4().m14783o(new TdApi.ChangeStickerSet(v6Var.m25182c(), false, false), this.f22467M.mo4348c().m2392ja());
        return true;
    }

    public boolean m17840k2(C4817v6 v6Var, View view, int i) {
        if (i == R.id.btn_delete) {
            this.f22467M.mo4348c().m2270r4().m14783o(new TdApi.ChangeStickerSet(v6Var.m25182c(), false, true), this.f22467M.mo4348c().m2392ja());
        }
        return true;
    }

    public boolean m17839l2(final C4817v6 v6Var, View view, int i) {
        AbstractC9323v4<?> v4Var;
        if (i == R.id.btn_archive) {
            AbstractC9323v4<?> v4Var2 = this.f22479b0;
            if (v4Var2 != null) {
                v4Var2.m9261ee(C4403w.m27853m1(R.string.ArchiveStickerSet, v6Var.m25173l()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ArchiveStickerSetAction), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_archive_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view2, int i2) {
                        boolean k2;
                        k2 = ViewTreeObserver$OnPreDrawListenerC7081z0.this.m17840k2(v6Var, view2, i2);
                        return k2;
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
        } else if (i == R.id.btn_copyLink) {
            C1379j0.m37325i(C4779t2.m25528e2(v6Var.m25179f()), R.string.CopiedLink);
        } else if (i == R.id.more_btn_delete && (v4Var = this.f22479b0) != null) {
            v4Var.m9261ee(C4403w.m27853m1(R.string.RemoveStickerSet, v6Var.m25173l()), new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.RemoveStickerSetAction), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i2) {
                    boolean i22;
                    i22 = ViewTreeObserver$OnPreDrawListenerC7081z0.this.m17842i2(v6Var, view2, i2);
                    return i22;
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

    private void setAffectHeight(boolean z) {
        if (this.f22496s0 != z) {
            this.f22496s0 = z;
            if (z) {
                this.f22497t0 = this.f22485h0;
                float f = this.f22494q0;
                this.f22499v0 = f;
                this.f22498u0 = m17855V1(1 - Math.round(f)) - this.f22485h0;
            }
        }
    }

    private void setCircleFactor(float f) {
        if (this.f22484g0 != f) {
            this.f22484g0 = f;
            m17856U2();
        }
    }

    private void setCurrentPageFactor(float f) {
        if (this.f22494q0 != f) {
            this.f22494q0 = f;
            m17854V2();
        }
    }

    public void m17888A2() {
        AbstractC9323v4<?> w = this.f22470P.m17827w(1);
        if (w != null) {
            ((C2746n9) w).m33733If();
        }
    }

    public void m17887B2() {
        m17885C2(false);
    }

    public void m17885C2(boolean z) {
        AbstractC9323v4<?> w;
        int currentItem = this.f22469O.getCurrentItem();
        if (currentItem == 0) {
            AbstractC9323v4<?> w2 = this.f22470P.m17827w(0);
            if (w2 != null) {
                m17882E2(((View$OnClickListenerC3099t8) w2).m31452Ye(), z);
            }
        } else if (currentItem == 1 && (w = this.f22470P.m17827w(1)) != null) {
            m17882E2(((C2746n9) w).m33700Vf(), z);
        }
    }

    public final void m17882E2(int i, boolean z) {
        this.f22487j0 = i;
        int headerSize = i - ((int) (this.f22485h0 * getHeaderSize()));
        int max = Math.max(0, headerSize);
        this.f22489l0 = max;
        this.f22488k0 = max;
        if (headerSize < 0) {
            setHeaderHideFactor(0.0f);
        }
    }

    public final void m17880F2(int i) {
        AbstractC9323v4<?> w = this.f22470P.m17827w(0);
        if (w != null) {
            ((View$OnClickListenerC3099t8) w).m31448cf(i);
        }
    }

    public final void m17878G2(C4817v6 v6Var) {
        AbstractC9323v4<?> w = this.f22470P.m17827w(1);
        if (w != null) {
            ((C2746n9) w).m33650lh(v6Var);
        }
    }

    public boolean m17877H2(View view, TdApi.Animation animation) {
        AbstractC7087f fVar = this.f22468N;
        return fVar != null && fVar.mo16455E(view, animation);
    }

    public boolean m17874J2(View view, C2104l lVar, boolean z, TdApi.MessageSchedulingState messageSchedulingState) {
        AbstractC7087f fVar = this.f22468N;
        return fVar != null && fVar.mo16446F4(view, lVar, z, messageSchedulingState);
    }

    public final void m17873K2(float f, boolean z) {
        if (this.f22484g0 == f || !z || getVisibility() != 0) {
            C3950k kVar = this.f22482e0;
            if (kVar != null) {
                kVar.m29541l(f);
            }
            setCircleFactor(f);
            return;
        }
        if (this.f22482e0 == null) {
            this.f22482e0 = new C3950k(1, this, C2057b.f7284f, 210L, this.f22484g0);
        }
        if (f == 1.0f && this.f22484g0 == 0.0f) {
            this.f22482e0.m29557B(C2057b.f7284f);
            this.f22482e0.m29528y(210L);
        } else {
            this.f22482e0.m29557B(C2057b.f7280b);
            this.f22482e0.m29528y(100L);
        }
        this.f22482e0.m29544i(f);
    }

    public void m17871L2(boolean z, boolean z2) {
        if (!z2 || !this.f22495r0) {
            m17869M2(z, true, z2 ? R.drawable.baseline_search_24 : R.drawable.baseline_backspace_24, z2 ? 0 : -C1357a0.m37541i(1.5f));
        }
    }

    public final void m17869M2(boolean z, boolean z2, int i, int i2) {
        if (this.f22483f0 != z) {
            if (z && i != 0) {
                this.f22477W.m18782k(i, i2);
            }
            this.f22483f0 = z;
            m17873K2(z ? 1.0f : 0.0f, z2);
        }
    }

    public void m17868N1(int i, C4817v6 v6Var) {
        View$OnLongClickListenerC7088g gVar = this.f22478a0;
        gVar.m17802g0(i - gVar.m17800i0(true), v6Var);
    }

    public final void m17867N2(Object obj, boolean z) {
        if (this.f22478a0.m17786x0(obj, z, this.f22474T.getLayoutManager())) {
            int k0 = this.f22478a0.m17798k0(obj);
            int X1 = ((LinearLayoutManager) this.f22474T.getLayoutManager()).m39549X1();
            int a2 = ((LinearLayoutManager) this.f22474T.getLayoutManager()).m39546a2();
            int g = (C1357a0.m37543g() - (getHorizontalPadding() * 2)) / this.f22475U.size();
            if (X1 != -1) {
                int i = X1 * g;
                View C = this.f22474T.getLayoutManager().mo39262C(X1);
                if (C != null) {
                    i += -C.getLeft();
                }
                if (k0 - 2 < X1) {
                    int i2 = ((k0 * g) - (g / 2)) - (g * 1);
                    if (!z || this.f22485h0 == 1.0f) {
                        this.f22474T.scrollBy(i2 - i, 0);
                    } else {
                        this.f22474T.mo8024v1(i2 - i, 0);
                    }
                } else if (k0 + 2 > a2) {
                    int max = Math.max(0, ((k0 - this.f22475U.size()) * g) + (g * 2) + (g / 2));
                    if (!z || this.f22485h0 == 1.0f) {
                        this.f22474T.scrollBy(max - i, 0);
                    } else {
                        this.f22474T.mo8024v1(max - i, 0);
                    }
                }
            }
        }
    }

    public void m17866O1() {
        this.f22488k0 = this.f22489l0;
    }

    public void m17865O2(int i, boolean z, boolean z2) {
        if (this.f22478a0.f22537T && this.f22478a0.f22538U && z && i >= 1) {
            i--;
        }
        if (z) {
            i += this.f22478a0.f22532O.size() - this.f22478a0.m17800i0(false);
        }
        m17867N2(this.f22478a0.m17799j0(i), z2);
    }

    public final void m17864P2(float f, boolean z) {
        if (z) {
            if (this.f22486i0 == null) {
                this.f22486i0 = new C3950k(0, this, C2057b.f7280b, 210L, this.f22485h0);
            }
            this.f22486i0.m29544i(f);
            return;
        }
        C3950k kVar = this.f22486i0;
        if (kVar != null) {
            kVar.m29541l(f);
        }
        setHeaderHideFactor(f);
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (i == 0) {
            setHeaderHideFactor(f);
        } else if (i == 1) {
            setCircleFactor(f);
        }
    }

    public boolean m17863Q1() {
        return this.f22493p0 == 0 && this.f22494q0 == 0.0f;
    }

    public void m17862Q2(ArrayList<C4817v6> arrayList, boolean z, boolean z2) {
        this.f22478a0.m17790s0(z);
        this.f22478a0.m17788u0(z2);
        this.f22478a0.m17785y0(arrayList);
    }

    public void m17861R2(EditText editText) {
        this.f22501x0 = 1;
        C1408x.m37085f(editText);
    }

    public final void m17860S1() {
        AbstractC9323v4<?> v4Var = this.f22479b0;
        if (v4Var != null) {
            v4Var.m9261ee(null, new int[]{R.id.btn_delete, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ClearRecentEmojiAction), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean f2;
                    f2 = ViewTreeObserver$OnPreDrawListenerC7081z0.this.m17844f2(view, i);
                    return f2;
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
    }

    public final void m17859T1() {
        if (this.f22479b0 != null && this.f22478a0.f22537T) {
            this.f22479b0.m9261ee(null, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.ClearRecentStickers), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean h2;
                    h2 = ViewTreeObserver$OnPreDrawListenerC7081z0.this.m17843h2(view, i);
                    return h2;
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
    }

    public final void m17858T2() {
        float f = this.f22485h0;
        float f2 = 0.0f;
        if (f != 0.0f && f != 1.0f) {
            if (f > 0.25f && this.f22487j0 - getHeaderSize() > 0) {
                f2 = 1.0f;
            }
            m17838m2(f2, true);
        }
    }

    @Override
    public void mo9343T5(int i, int i2) {
        if (C4403w.m27981H1(i, i2)) {
            RecyclerView recyclerView = this.f22474T;
            if (recyclerView != null) {
                ((LinearLayoutManager) recyclerView.getLayoutManager()).m39572B2(C4403w.m27984G2());
            }
            C7045v2 v2Var = this.f22469O;
            if (v2Var != null) {
                v2Var.mo8255s();
            }
        }
    }

    public long m17857U1() {
        AbstractC7087f fVar = this.f22468N;
        if (fVar != null) {
            return fVar.mo16269b();
        }
        return 0L;
    }

    public final void m17856U2() {
        if (this.f22477W != null) {
            float f = this.f22484g0;
            float f2 = (0.39999998f * f) + 0.6f;
            this.f22477W.setAlpha(Math.min(1.0f, Math.max(0.0f, f)));
            this.f22477W.setScaleX(f2);
            this.f22477W.setScaleY(f2);
        }
    }

    public final float m17855V1(int i) {
        AbstractC9323v4<?> w;
        if (i != 1 || (w = this.f22470P.m17827w(1)) == null) {
            return 0.0f;
        }
        return ((C2746n9) w).m33697Wf();
    }

    public final void m17854V2() {
        FrameLayoutFix frameLayoutFix = this.f22473S;
        float f = -1.0f;
        frameLayoutFix.setTranslationX(frameLayoutFix.getMeasuredWidth() * this.f22494q0 * (C4403w.m27984G2() ? 1.0f : -1.0f));
        RecyclerView recyclerView = this.f22474T;
        if (recyclerView != null) {
            float measuredWidth = recyclerView.getMeasuredWidth() * (1.0f - this.f22494q0);
            if (!C4403w.m27984G2()) {
                f = 1.0f;
            }
            recyclerView.setTranslationX(measuredWidth * f);
        }
    }

    public final boolean m17852X1() {
        AbstractC7087f fVar = this.f22468N;
        return fVar != null && !fVar.mo16228g5();
    }

    public boolean m17851X2() {
        return this.f22481d0;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public final boolean m17850Y1() {
        AbstractC9323v4<?> w = this.f22470P.m17827w(1);
        return w != null && !this.f22495r0 && ((C2746n9) w).m33726Lg();
    }

    public void m17849Z() {
        this.f22470P.m17828v();
    }

    public void m17848Z1(EditText editText) {
        this.f22501x0 = 2;
        C1408x.m37088c(editText);
    }

    public void m17847a2(AbstractC9323v4<?> v4Var, boolean z, AbstractC7087f fVar, AbstractC9323v4<?> v4Var2, boolean z2) {
        int i;
        this.f22467M = v4Var;
        this.f22468N = fVar;
        this.f22479b0 = v4Var2;
        this.f22480c0 = z;
        this.f22481d0 = z2;
        ArrayList<C7085d> arrayList = new ArrayList<>();
        this.f22475U = arrayList;
        arrayList.add(new C7085d(this, 0, R.drawable.baseline_access_time_24, R.drawable.baseline_watch_later_24).m17815j(1.0f, false).m17812m().m17811n(false));
        this.f22475U.add(new C7085d(this, 1, R.drawable.baseline_emoticon_outline_24, R.drawable.baseline_emoticon_24).m17812m());
        this.f22475U.add(new C7085d(this, 2, R.drawable.deproko_baseline_animals_outline_24, R.drawable.deproko_baseline_animals_24).m17813l(!z2));
        this.f22475U.add(new C7085d(this, 3, R.drawable.baseline_restaurant_menu_24, R.drawable.baseline_restaurant_menu_24));
        this.f22475U.add(new C7085d(this, 4, R.drawable.baseline_directions_car_24, R.drawable.baseline_directions_car_24));
        this.f22475U.add(new C7085d(this, 5, R.drawable.deproko_baseline_lamp_24, R.drawable.deproko_baseline_lamp_filled_24));
        this.f22475U.add(new C7085d(this, 6, R.drawable.deproko_baseline_flag_outline_24, R.drawable.deproko_baseline_flag_filled_24).m17812m());
        if (z) {
            this.f22475U.add(new C7085d(this, 7, R.drawable.deproko_baseline_stickers_24, 0).m17817h().m17811n(true));
        } else {
            ArrayList<C7085d> arrayList2 = this.f22475U;
            arrayList2.get(arrayList2.size() - 1).m17811n(true);
        }
        this.f22470P = new C7084c(v4Var, this, z, v4Var2);
        C7045v2 v2Var = new C7045v2(getContext());
        this.f22469O = v2Var;
        v2Var.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        this.f22469O.mo18020c(this);
        this.f22469O.setAdapter(this.f22470P);
        this.f22469O.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        int headerSize = getHeaderSize();
        C7082a aVar = new C7082a(getContext());
        this.f22471Q = aVar;
        if (z2) {
            aVar.setBackgroundColor(C11524j.m226O(R.id.theme_color_filling, 2));
        } else {
            C10192g.m5782i(aVar, R.id.theme_color_filling, v4Var2);
        }
        this.f22471Q.setLayoutParams(FrameLayoutFix.m18008s1(-1, headerSize));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(getContext());
        this.f22473S = frameLayoutFix;
        frameLayoutFix.setPadding(getHorizontalPadding(), 0, getHorizontalPadding(), 0);
        this.f22473S.setLayoutParams(FrameLayoutFix.m18008s1(-1, headerSize));
        Iterator<C7085d> it = this.f22475U.iterator();
        while (it.hasNext()) {
            C7085d next = it.next();
            C7086e eVar = new C7086e(getContext());
            if (v4Var2 != null) {
                v4Var2.m9163t8(eVar);
            }
            eVar.setId(R.id.btn_section);
            eVar.m17808a();
            eVar.setOnClickListener(this);
            eVar.setOnLongClickListener(this);
            eVar.setSection(next);
            eVar.setItemCount(this.f22475U.size());
            eVar.setLayoutParams(FrameLayoutFix.m18008s1(-2, -1));
            this.f22473S.addView(eVar);
        }
        this.f22471Q.addView(this.f22473S);
        if (z) {
            RecyclerView recyclerView = new RecyclerView(getContext());
            this.f22474T = recyclerView;
            recyclerView.setHasFixedSize(true);
            this.f22474T.setItemAnimator(new C8731d(C2057b.f7280b, 180L));
            this.f22474T.setOverScrollMode(C4183a.f14083a ? 1 : 2);
            this.f22474T.setLayoutManager(new LinearLayoutManager(getContext(), 0, C4403w.m27984G2()));
            this.f22474T.m39434g(new C7083b());
            RecyclerView recyclerView2 = this.f22474T;
            View$OnLongClickListenerC7088g gVar = new View$OnLongClickListenerC7088g(getContext(), this, this, this.f22475U.size(), C4868i.m24726c2().m24849L0() == 1, v4Var2);
            this.f22478a0 = gVar;
            recyclerView2.setAdapter(gVar);
            this.f22474T.setLayoutParams(FrameLayoutFix.m18008s1(-1, headerSize));
            this.f22471Q.addView(this.f22474T);
        } else {
            this.f22474T = null;
            this.f22478a0 = null;
        }
        C6879f3 f3Var = new C6879f3(getContext());
        this.f22472R = f3Var;
        if (v4Var2 != null) {
            v4Var2.m9163t8(f3Var);
        }
        this.f22472R.setSimpleBottomTransparentShadow(true);
        FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(this.f22472R.getLayoutParams().width, this.f22472R.getLayoutParams().height);
        s1.topMargin = headerSize;
        this.f22472R.setLayoutParams(s1);
        if (z) {
            i = C4868i.m24726c2().m24814Q0();
            if (this.f22469O.getCurrentItem() != i) {
                this.f22469O.mo18027N(i, false);
            }
        } else {
            i = 0;
        }
        int i2 = C1357a0.m37541i(4.0f);
        int i3 = i2 * 2;
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1((C1357a0.m37541i(23.0f) * 2) + i3, (C1357a0.m37541i(23.0f) * 2) + i3, 85);
        int i4 = C1357a0.m37541i(16.0f) - i2;
        t1.bottomMargin = i4;
        t1.rightMargin = i4;
        C6851c0 c0Var = new C6851c0(getContext());
        this.f22477W = c0Var;
        if (v4Var2 != null) {
            v4Var2.m9163t8(c0Var);
        }
        this.f22477W.setId(R.id.btn_circle);
        if (i == 0) {
            this.f22477W.m18788e(R.drawable.baseline_backspace_24, -C1357a0.m37541i(1.5f), 46.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
            m17869M2(m17852X1(), false, 0, 0);
        } else {
            this.f22477W.m18789d(R.drawable.baseline_search_24, 46.0f, 4.0f, R.id.theme_color_circleButtonOverlay, R.id.theme_color_circleButtonOverlayIcon);
            m17869M2(m17850Y1(), false, 0, 0);
        }
        this.f22477W.setOnClickListener(this);
        this.f22477W.setLayoutParams(t1);
        m17856U2();
        addView(this.f22469O);
        addView(this.f22471Q);
        addView(this.f22472R);
        addView(this.f22477W);
        if (z2) {
            setBackgroundColor(C11524j.m226O(R.id.theme_color_chatKeyboard, 2));
        } else {
            C10192g.m5782i(this, R.id.theme_color_chatKeyboard, v4Var2);
        }
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    public void m17846b2() {
        C7084c cVar = this.f22470P;
        if (cVar != null) {
            cVar.m17826x();
        }
    }

    public boolean m17845d2() {
        return !this.f22490m0;
    }

    public int getCurrentItem() {
        return this.f22469O.getCurrentItem();
    }

    public int getHeaderBottom() {
        return ((int) (getHeaderSize() * (1.0f - this.f22485h0))) + C1357a0.m37541i(12.0f);
    }

    public float getHeaderHideFactor() {
        return this.f22485h0;
    }

    public int getSize() {
        return C1408x.m37090a();
    }

    public C9639r.AbstractC9641b getToneDelegate() {
        AbstractC9323v4<?> v4Var = this.f22467M;
        if (v4Var == null || !(v4Var instanceof C9639r.AbstractC9641b)) {
            return null;
        }
        return (C9639r.AbstractC9641b) v4Var;
    }

    @Override
    public void mo8853h4(int i) {
        this.f22493p0 = i;
        setAffectHeight(i != 0);
    }

    public void m17841j(boolean z) {
        int i = this.f22501x0;
        if (i == 1 && z) {
            this.f22502y0 = Build.VERSION.SDK_INT >= 24 ? 45 : 55;
        } else if (i == 2 && !z) {
            this.f22501x0 = 0;
        }
    }

    public final void m17838m2(float f, boolean z) {
        if (f == 1.0f) {
            this.f22488k0 = Math.max(0, this.f22487j0 - getHeaderSize());
        } else {
            int i = this.f22487j0;
            this.f22489l0 = i;
            this.f22488k0 = i;
        }
        m17864P2(f, z);
    }

    public final void m17837n2(int i) {
        this.f22487j0 = i;
        if (this.f22491n0) {
            m17887B2();
            this.f22491n0 = false;
        } else if (!this.f22490m0 && this.f22493p0 == 0) {
            float max = Math.max(0.0f, Math.min(1.0f, (i - this.f22488k0) / getHeaderSize()));
            if (max == 1.0f) {
                this.f22489l0 = Math.max(0, i - getHeaderSize());
            } else if (max == 0.0f) {
                this.f22489l0 = i;
                this.f22488k0 = i;
            }
            m17864P2(max, false);
        }
    }

    @Override
    public void onClick(View view) {
        AbstractC7087f fVar;
        AbstractC7087f fVar2;
        AbstractC9323v4<?> w;
        C4817v6 c;
        if (this.f22493p0 == 0) {
            int id2 = view.getId();
            if (id2 == R.id.btn_circle) {
                int currentItem = this.f22469O.getCurrentItem();
                if (currentItem == 0) {
                    AbstractC7087f fVar3 = this.f22468N;
                    if (fVar3 != null) {
                        fVar3.mo16154p5();
                    }
                } else if (currentItem == 1 && (fVar = this.f22468N) != null) {
                    fVar.mo16389M2(this, false);
                }
            } else if (id2 == R.id.btn_section) {
                C7085d section = ((C7086e) view).getSection();
                int i = section.f22524a;
                if (i < 0) {
                    int i2 = (-i) - 1;
                    if (i2 == 0) {
                        this.f22469O.mo18027N(0, true);
                    } else if (i2 == 1) {
                        AbstractC9323v4<?> w2 = this.f22470P.m17827w(1);
                        if (w2 != null && !((C2746n9) w2).m33656jh() && (fVar2 = this.f22468N) != null) {
                            fVar2.mo16389M2(this, false);
                        }
                    } else if (i2 == 2) {
                        AbstractC9323v4<?> w3 = this.f22470P.m17827w(1);
                        if (w3 != null) {
                            ((C2746n9) w3).m33653kh();
                        }
                    } else if (i2 == 3 && (w = this.f22470P.m17827w(1)) != null) {
                        ((C2746n9) w).m33644nh();
                    }
                } else if (!this.f22480c0 || i != this.f22475U.size() - 1) {
                    m17880F2(section.f22524a);
                } else {
                    this.f22469O.mo18027N(1, true);
                }
            } else if (id2 == R.id.btn_stickerSet && (c = ((C7090i) view).m17781c()) != null) {
                m17878G2(c);
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() == R.id.btn_section) {
            if (this.f22475U.get(0) == ((C7086e) view).getSection() && C5078d.m23986z().m24006f()) {
                m17860S1();
                return true;
            }
        }
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(C1408x.m37090a(), Log.TAG_TDLIB_OPTIONS));
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth != 0 && this.f22500w0 != measuredWidth) {
            this.f22500w0 = measuredWidth;
            m17854V2();
            this.f22470P.m17825y();
        }
    }

    @Override
    public boolean onPreDraw() {
        int i = this.f22501x0;
        if (i != 1 && i != 2) {
            return true;
        }
        int i2 = this.f22502y0 + 1;
        this.f22502y0 = i2;
        if (i2 < 60) {
            return false;
        }
        this.f22502y0 = 0;
        this.f22501x0 = 0;
        return true;
    }

    public void m17836p2(int i) {
        boolean z = false;
        if (this.f22491n0) {
            m17887B2();
            this.f22491n0 = false;
        } else if (!this.f22490m0 && this.f22493p0 == 0) {
            this.f22488k0 = 0;
            this.f22487j0 = i;
            m17864P2(Math.min(1.0f, Math.max(0.0f, i / getHeaderSize())), false);
            if (this.f22485h0 == 0.0f) {
                z = true;
            }
            m17871L2(z, true);
        }
    }

    public void m17835r2(int i, int i2) {
        int i0 = this.f22478a0.m17800i0(true);
        this.f22478a0.m17797l0(i - i0, i2 - i0);
    }

    public void setCurrentEmojiSection(int i) {
        int i2 = this.f22476V;
        if (i2 != i && i != -1) {
            boolean z = true;
            this.f22475U.get(i2).m17815j(0.0f, (this.f22485h0 == 1.0f || this.f22494q0 == 1.0f) ? false : true);
            this.f22476V = i;
            C7085d dVar = this.f22475U.get(i);
            if (this.f22485h0 == 1.0f || this.f22494q0 == 1.0f) {
                z = false;
            }
            dVar.m17815j(1.0f, z);
        }
    }

    public void setHasNewHots(boolean z) {
        this.f22478a0.m17789t0(z);
    }

    public void setHeaderHideFactor(float f) {
        if (this.f22485h0 != f) {
            this.f22485h0 = f;
            float f2 = (-getHeaderSize()) * this.f22485h0;
            this.f22471Q.setTranslationY(f2);
            this.f22472R.setTranslationY(f2);
            float interpolation = 1.0f - C2057b.f7280b.getInterpolation(Math.max(0.0f, Math.min(1.0f, f / 0.5f)));
            this.f22473S.setAlpha(interpolation);
            RecyclerView recyclerView = this.f22474T;
            if (recyclerView != null) {
                recyclerView.setAlpha(interpolation);
            }
        }
    }

    public void setIgnoreMovement(boolean z) {
        if (this.f22490m0 != z) {
            this.f22490m0 = z;
            if (z) {
                this.f22491n0 = true;
            } else {
                m17887B2();
            }
        }
    }

    public void setIsScrolling(boolean z) {
        if (this.f22492o0 != z) {
            this.f22492o0 = z;
            if (!z) {
                m17866O1();
                m17858T2();
            }
        }
    }

    public void setListener(AbstractC7087f fVar) {
        this.f22468N = fVar;
    }

    public void setMediaSection(boolean z) {
        if (this.f22475U.size() > 7) {
            this.f22475U.get(7).m17821d(z ? R.drawable.deproko_baseline_gif_24 : R.drawable.deproko_baseline_stickers_24);
        }
    }

    public void setPreferredSection(int i) {
        if (this.f22480c0) {
            C4868i.m24726c2().m24894E4(i);
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            setMediaSection(z);
        }
    }

    public void setShowFavorite(boolean z) {
        this.f22478a0.m17790s0(z);
    }

    public void setShowRecents(boolean z) {
        this.f22478a0.m17788u0(z);
    }

    public void m17834t2(String str) {
        AbstractC7087f fVar = this.f22468N;
        if (fVar != null) {
            fVar.mo16097w0(str);
        }
    }

    public void m17833u2(int i) {
        m17837n2(i);
    }

    public void m17832v2(CharSequence charSequence) {
        if (this.f22469O.getCurrentItem() == 0) {
            m17869M2(charSequence.length() > 0, true, R.drawable.baseline_backspace_24, -C1357a0.m37541i(1.5f));
        }
    }

    @Override
    public void mo8833x(int i, float f, int i2) {
        setCurrentPageFactor(i + f);
        if (this.f22496s0) {
            m17838m2(this.f22497t0 + (Math.abs(this.f22499v0 - this.f22494q0) * this.f22498u0), false);
        }
    }

    public void m17831x2() {
    }

    @Override
    public void mo8832x4(int i) {
        C4868i.m24726c2().m24873H4(i);
        boolean X1 = m17852X1();
        boolean Y1 = m17850Y1();
        int i2 = R.drawable.baseline_backspace_24;
        if (!X1 || !Y1) {
            if (X1 || Y1) {
                int i3 = 0;
                boolean z = (X1 && i == 0) || (Y1 && i == 1);
                if (i != 0) {
                    i2 = R.drawable.baseline_search_24;
                }
                if (i == 0) {
                    i3 = -C1357a0.m37541i(1.5f);
                }
                m17869M2(z, true, i2, i3);
            }
        } else if (i == 0) {
            this.f22477W.m18785h(R.drawable.baseline_backspace_24, -C1357a0.m37541i(1.5f));
        } else {
            this.f22477W.m18786g(R.drawable.baseline_search_24);
        }
        m17887B2();
    }

    public void m17830y2(int i) {
        View$OnLongClickListenerC7088g gVar = this.f22478a0;
        gVar.m17791r0(i - gVar.m17800i0(true));
    }

    public final void m17829z2(final C4817v6 v6Var) {
        AbstractC9323v4<?> v4Var = this.f22479b0;
        if (v4Var != null) {
            v4Var.m9261ee(null, new int[]{R.id.btn_copyLink, R.id.btn_archive, R.id.more_btn_delete}, new String[]{C4403w.m27869i1(R.string.CopyLink), C4403w.m27869i1(R.string.ArchivePack), C4403w.m27869i1(R.string.DeletePack)}, new int[]{1, 1, 2}, new int[]{R.drawable.baseline_link_24, R.drawable.baseline_archive_24, R.drawable.baseline_delete_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean l2;
                    l2 = ViewTreeObserver$OnPreDrawListenerC7081z0.this.m17839l2(v6Var, view, i);
                    return l2;
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
    }
}
