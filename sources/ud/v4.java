package ud;

import ae.u;
import ae.v;
import ae.z;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.j0;
import ce.p0;
import ce.x;
import ce.y;
import de.ap;
import de.iq;
import de.ra;
import de.vr;
import ee.k;
import gd.w;
import hd.t2;
import he.i;
import ie.g0;
import ie.h0;
import ie.o;
import ie.u0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kb.l;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.d3;
import ne.f3;
import ne.j2;
import ne.m1;
import ne.q1;
import ne.r3;
import ne.v1;
import ne.y1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.v.HeaderEditText;
import ud.e2;
import ud.f2;
import ud.v4;
import zd.d9;
import zd.hj;
import zd.o6;
import zd.w6;
import zd.y8;

public abstract class v4<T> implements kb.e<View>, ae.l, w.a, m1.k, a.h, a.i, d9, kb.c {
    public CharSequence M;
    public T N;
    public View O;
    public View P;
    public v4<?> Q;
    public d1 R;
    public s0 S;
    public q1 T;
    public v U;
    public View V;
    public float W;
    public Runnable X;
    public ArrayList<Runnable> Y;
    public ArrayList<Runnable> Z;
    public final org.thunderdog.challegram.a f24493a;
    public ud.r f24494a0;
    public final o6 f24495b;
    public HeaderEditText f24496b0;
    public int f24497c;
    public String f24498c0 = "";
    public float f24499d0;
    public float f24500e0;
    public boolean f24501f0;
    public lb.d<j> f24502g0;
    public List<f1> f24503h0;
    public List<l> f24504i0;
    public ArrayList<kb.c> f24505j0;
    public m1 f24506k0;
    public View f24507l0;
    public boolean f24508m0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (v4.this.Na()) {
                String charSequence2 = charSequence.toString();
                v4.this.Ae(charSequence2.length() > 0, true);
                if (!v4.this.f24498c0.equals(charSequence2)) {
                    v4.this.f24498c0 = charSequence2;
                    v4.this.Cc(charSequence2);
                }
            }
        }
    }

    public class b implements TextWatcher {
        public final y1 f24510a;

        public b(y1 y1Var) {
            this.f24510a = y1Var;
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            this.f24510a.setInErrorState(false);
        }
    }

    public class c extends LinearLayout {
        public boolean f24512a;
        public final y1 f24513b;

        public c(Context context, y1 y1Var) {
            super(context);
            this.f24513b = y1Var;
        }

        @Override
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            if (this.f24512a && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                this.f24512a = false;
                x.f(this.f24513b.getEditText());
            }
        }
    }

    public class d extends RecyclerView {
        public int f24515t1;
        public final e2 f24516u1;

        public d(Context context, e2 e2Var) {
            super(context);
            this.f24516u1 = e2Var;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f24515t1;
            if (i12 == 0 || i12 == measuredHeight) {
                this.f24515t1 = measuredHeight;
                return;
            }
            this.f24515t1 = measuredHeight;
            post(new Runnable() {
                @Override
                public final void run() {
                    v4.d.this.A0();
                }
            });
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            iq iqVar;
            int X1;
            View C;
            if (motionEvent.getAction() != 0 || (iqVar = this.f24516u1.f24134a) == null || iqVar.D() <= 0 || (X1 = ((LinearLayoutManager) getLayoutManager()).X1()) != 0 || (C = getLayoutManager().C(X1)) == null || motionEvent.getY() >= C.getTop()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public class e extends RecyclerView.o {
        public e() {
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.top = recyclerView.k0(view) == 0 ? (a0.f() / 2) + a0.i(12.0f) : 0;
        }
    }

    public class f extends iq {
        public final f2 f24519m0;

        public f(d9 d9Var, View.OnClickListener onClickListener, v4 v4Var, f2 f2Var) {
            super(d9Var, onClickListener, v4Var);
            this.f24519m0 = f2Var;
        }

        @Override
        public void R2(de.ra r3, uc.c r4, boolean r5) {
            throw new UnsupportedOperationException("Method not decompiled: ud.v4.f.R2(de.ra, uc.c, boolean):void");
        }

        @Override
        public void i2(ra raVar, o0 o0Var, r3 r3Var, boolean z10) {
            f2.a aVar = this.f24519m0.f24172x;
            if (aVar != null) {
                aVar.a(raVar, o0Var, r3Var, z10);
            }
        }
    }

    public class g extends FrameLayoutFix {
        public g(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return true;
        }
    }

    public class h extends Drawable {
        public final ae.p f24521a;

        public h(ae.p pVar) {
            this.f24521a = pVar;
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height() / 2;
            int itemHeight = q1.getItemHeight() / 2;
            float f10 = height - itemHeight;
            float f11 = width;
            ae.p pVar = this.f24521a;
            canvas.drawLine(0.0f, f10, f11, f10, y.D0(pVar != null ? pVar.e(R.id.theme_color_separator) : ae.j.M0()));
            float f12 = height + itemHeight;
            ae.p pVar2 = this.f24521a;
            canvas.drawLine(0.0f, f12, f11, f12, y.D0(pVar2 != null ? pVar2.e(R.id.theme_color_separator) : ae.j.M0()));
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

    public class i implements l {
        public final Runnable f24523a;

        public i(Runnable runnable) {
            this.f24523a = runnable;
        }

        @Override
        public void a(v4<?> v4Var, boolean z10) {
            if (z10) {
                this.f24523a.run();
                v4.this.od(this);
            }
        }
    }

    public interface j {
        void a(v4<?> v4Var, q1 q1Var, boolean z10);
    }

    public static class k {
        public View f24525a;
        public boolean f24526b;
        public boolean f24527c = true;
        public boolean f24528d = false;
        public int f24529e;
        public boolean f24530f;
        public k.g f24531g;
        public k.f f24532h;
        public int f24533i;
        public boolean f24534j;

        public k a(boolean z10) {
            this.f24527c = z10;
            return this;
        }

        public k b(View view) {
            this.f24525a = view;
            return this;
        }

        public k c(boolean z10) {
            this.f24530f = z10;
            return this;
        }

        public k d(int i10) {
            this.f24529e = i10;
            return this;
        }

        public k e(boolean z10) {
            this.f24526b = z10;
            return this;
        }

        public k f(boolean z10) {
            this.f24528d = z10;
            return this;
        }

        public k g(k.f fVar) {
            this.f24532h = fVar;
            return this;
        }

        public k h(boolean z10) {
            this.f24534j = z10;
            return this;
        }

        public k i(int i10) {
            this.f24533i = i10;
            return this;
        }

        public k j(k.g gVar) {
            this.f24531g = gVar;
            return this;
        }
    }

    public interface l {
        void a(v4<?> v4Var, boolean z10);
    }

    public interface m {
        boolean a(y1 y1Var, String str);
    }

    public interface n {
        void a(View view, int i10, ra raVar, TextView textView, iq iqVar);
    }

    public static class o {
        public final int f24535a;
        public final CharSequence f24536b;
        public final int f24537c;
        public final int f24538d;

        public static class a {
            public CharSequence f24540b;
            public int f24542d;
            public int f24541c = 1;
            public int f24539a = this.f24539a;
            public int f24539a = this.f24539a;

            public o a() {
                return new o(this.f24539a, this.f24540b, this.f24541c, this.f24542d);
            }

            public a b(int i10) {
                this.f24541c = i10;
                return this;
            }

            public a c(int i10) {
                this.f24542d = i10;
                return this;
            }

            public a d(int i10) {
                this.f24539a = i10;
                return this;
            }

            public a e(int i10) {
                return f(w.i1(i10));
            }

            public a f(CharSequence charSequence) {
                this.f24540b = charSequence;
                return this;
            }
        }

        public o(int i10, CharSequence charSequence, int i11, int i12) {
            this.f24535a = i10;
            this.f24536b = charSequence;
            this.f24537c = i11;
            this.f24538d = i12;
        }
    }

    public static class p {
        public final CharSequence f24543a;
        public final o[] f24544b;

        public static class a {
            public CharSequence f24545a;
            public List<o> f24546b = new ArrayList();

            public p a() {
                return new p(this.f24545a, (o[]) this.f24546b.toArray(new o[0]));
            }

            public a b() {
                return d(new o.a().d(R.id.btn_cancel).e(R.string.Cancel).c(R.drawable.baseline_cancel_24).a());
            }

            public a c(CharSequence charSequence) {
                this.f24545a = charSequence;
                return this;
            }

            public a d(o oVar) {
                if (oVar != null) {
                    this.f24546b.add(oVar);
                }
                return this;
            }
        }

        public p(CharSequence charSequence, o[] oVarArr) {
            this.f24543a = charSequence;
            this.f24544b = oVarArr;
        }
    }

    public interface q {
        int a(j2 j2Var, v1 v1Var);
    }

    public interface r {
        void l6(int i10, SparseIntArray sparseIntArray);
    }

    public interface s {
        void A2(int i10, k0.h<String> hVar);
    }

    public v4(Context context, o6 o6Var) {
        org.thunderdog.challegram.a r10 = j0.r(context);
        this.f24493a = r10;
        this.f24495b = o6Var;
        if (r10 == null) {
            throw new IllegalArgumentException();
        }
    }

    public boolean Ab(String str, int[] iArr, kb.f fVar, hj.q qVar, View view, int i10) {
        if (i10 == R.id.btn_copyLink) {
            j0.i(str, R.string.CopiedLink);
        } else if (i10 != R.id.btn_openLink) {
            if (i10 == R.id.btn_shareLink && iArr[0] == 0) {
                iArr[0] = 1;
                t2.j5(new y8(this.f24493a, this.f24495b), str);
            }
        } else if (fVar == null || !fVar.get()) {
            this.f24495b.hd().E7(this, str, qVar);
        }
        return true;
    }

    public static void Bb(int i10, int i11, int i12, TextView textView, long j10) {
        String str;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (ib.f.m(j10, timeUnit)) {
            str = w.j1(i10, w.T2(j10, timeUnit));
        } else {
            str = ib.f.n(j10, timeUnit) ? w.j1(i11, w.T2(j10, timeUnit)) : w.j1(i12, w.o0(j10, timeUnit), w.T2(j10, timeUnit));
        }
        p0.c0(textView, str.toUpperCase());
    }

    public static long Cb(q1 q1Var, AtomicReference atomicReference, AtomicReference atomicReference2, Calendar calendar) {
        ie.p0 p0Var = (ie.p0) q1Var.getCurrentItem();
        ie.p0 p0Var2 = (ie.p0) ((q1) atomicReference.get()).getCurrentItem();
        ie.p0 p0Var3 = (ie.p0) ((q1) atomicReference2.get()).getCurrentItem();
        if (p0Var == null || p0Var2 == null || p0Var3 == null) {
            return 0L;
        }
        int b10 = (int) p0Var.b();
        int a10 = (int) p0Var2.a();
        calendar.set(1, (int) p0Var.a());
        calendar.set(6, b10);
        calendar.set(11, a10);
        calendar.set(12, (int) p0Var3.a());
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static void Db(kb.l lVar, kb.h hVar, q1 q1Var, int i10) {
        lVar.a(hVar.get());
    }

    public int Eb(Calendar calendar, ArrayList arrayList, q1 q1Var, int i10) {
        calendar.setTimeInMillis(this.f24495b.H4());
        calendar.add(12, 1);
        int i11 = calendar.get(1);
        int i12 = calendar.get(6);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            if (((ie.p0) arrayList.get(i13)).a() == i11 && ((ie.p0) arrayList.get(i13)).b() == i12) {
                return Math.max(i13, i10);
            }
        }
        return i10;
    }

    public void Fb(kb.h hVar, Calendar calendar, AtomicReference atomicReference, AtomicReference atomicReference2, q1.e eVar, q1 q1Var, int i10) {
        if (hVar.get() < this.f24495b.H4()) {
            calendar.setTimeInMillis(this.f24495b.H4());
            calendar.add(12, 1);
            int i11 = calendar.get(11);
            int i12 = calendar.get(12);
            ((q1) atomicReference.get()).setCurrentItem(i11);
            ((q1) atomicReference2.get()).setCurrentItem(i12);
        }
        eVar.a(q1Var, i10);
    }

    public int Gb(q1 q1Var, Calendar calendar, q1 q1Var2, int i10) {
        if (q1Var.getCurrentIndex() != q1Var.getMinMaxProvider().a(q1Var2, 0)) {
            return i10;
        }
        calendar.setTimeInMillis(this.f24495b.H4());
        calendar.add(12, 1);
        return Math.max(i10, calendar.get(11));
    }

    public int Hb(q1 q1Var, q1 q1Var2, Calendar calendar, q1 q1Var3, int i10) {
        int a10 = q1Var.getMinMaxProvider().a(q1Var3, 0);
        int a11 = q1Var2.getMinMaxProvider().a(q1Var3, 0);
        if (q1Var.getCurrentIndex() != a10 || q1Var2.getCurrentIndex() != a11) {
            return i10;
        }
        calendar.setTimeInMillis(this.f24495b.H4());
        calendar.add(12, 1);
        return Math.max(i10, calendar.get(12));
    }

    public void Ib(kb.h hVar, kb.l lVar, j2 j2Var, View view) {
        long j10 = hVar.get();
        if (this.f24495b.H4() < j10) {
            lVar.a(j10);
            j2Var.s2(true);
        }
    }

    public int Jb(ae.p pVar, final int i10, final int i11, final int i12, final kb.l lVar, final j2 j2Var, v1 v1Var) {
        String o02;
        int itemHeight = q1.getItemHeight() * 5;
        LinearLayout linearLayout = new LinearLayout(this.f24493a);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, itemHeight));
        db.g.d(linearLayout, new h(pVar));
        if (pVar == null) {
            t8(linearLayout);
        }
        long H4 = this.f24495b.H4();
        final Calendar a10 = ib.f.a(H4);
        int i13 = a10.get(6);
        a10.set(13, 0);
        a10.set(14, 0);
        a10.add(12, 2);
        int i14 = a10.get(6) != i13 ? 1 : 0;
        int i15 = a10.get(11);
        int i16 = a10.get(12);
        final TextView textView = new TextView(this.f24493a);
        final kb.l f4Var = new kb.l() {
            @Override
            public final void a(long j10) {
                v4.Bb(i10, i11, i12, textView, j10);
            }
        };
        final ArrayList<T> arrayList = new ArrayList<>(366);
        for (int i17 = 366; i14 < i17; i17 = 366) {
            a10.setTimeInMillis(H4);
            a10.add(5, i14);
            H4 = H4;
            long f10 = ib.f.f(a10);
            if (i14 == 0) {
                o02 = w.i1(R.string.Today);
            } else if (i14 == 1) {
                o02 = w.i1(R.string.Tomorrow);
            } else {
                o02 = w.o0(f10, TimeUnit.MILLISECONDS);
            }
            textView = textView;
            itemHeight = itemHeight;
            arrayList.add(new ie.p0(0, o02).d(a10.get(1), a10.get(6)));
            i14++;
        }
        TextView textView2 = textView;
        int i18 = itemHeight;
        final q1 q1Var = new q1(t(), false);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final kb.h c4Var = new kb.h() {
            @Override
            public final long get() {
                long Cb;
                Cb = v4.Cb(q1.this, atomicReference, atomicReference2, a10);
                return Cb;
            }
        };
        final q1.e<T> g4Var = new q1.e() {
            @Override
            public final void a(q1 q1Var2, int i19) {
                v4.Db(l.this, c4Var, q1Var2, i19);
            }
        };
        q1Var.setNeedSeparators(false);
        q1Var.setMinMaxProvider(new q1.h() {
            @Override
            public final int a(q1 q1Var2, int i19) {
                int Eb;
                Eb = v4.this.Eb(a10, arrayList, q1Var2, i19);
                return Eb;
            }
        });
        q1Var.setItemChangeListener(new q1.e() {
            @Override
            public final void a(q1 q1Var2, int i19) {
                v4.this.Fb(c4Var, a10, atomicReference, atomicReference2, g4Var, q1Var2, i19);
            }
        });
        q1Var.setForcedTheme(pVar);
        q1Var.L1(this);
        q1Var.P1(arrayList, 0);
        q1Var.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.5f));
        linearLayout.addView(q1Var);
        ArrayList<T> arrayList2 = new ArrayList<>();
        for (int i19 = 0; i19 < 24; i19++) {
            a10.set(11, i19);
            arrayList2.add(new ie.p0(0, w.K1(a10.getTimeInMillis(), TimeUnit.MILLISECONDS)).c(i19));
        }
        final q1 q1Var2 = new q1(t(), false);
        atomicReference.set(q1Var2);
        q1Var2.setTrimItems(false);
        q1Var2.setMinMaxProvider(new q1.h() {
            @Override
            public final int a(q1 q1Var3, int i20) {
                int Gb;
                Gb = v4.this.Gb(q1Var, a10, q1Var3, i20);
                return Gb;
            }
        });
        q1Var2.setNeedSeparators(false);
        q1Var2.setItemChangeListener(g4Var);
        q1Var2.setForcedTheme(pVar);
        q1Var2.L1(this);
        q1Var2.P1(arrayList2, i15);
        q1Var2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(q1Var2);
        ArrayList<T> arrayList3 = new ArrayList<>();
        for (int i20 = 0; i20 < 60; i20++) {
            arrayList3.add(new ie.p0(0, i20 < 10 ? "0" + i20 : Integer.toString(i20)).c(i20));
        }
        q1 q1Var3 = new q1(t(), false);
        atomicReference2.set(q1Var3);
        q1Var3.setNeedSeparators(false);
        q1Var3.setItemChangeListener(g4Var);
        q1Var3.setMinMaxProvider(new q1.h() {
            @Override
            public final int a(q1 q1Var4, int i21) {
                int Hb;
                Hb = v4.this.Hb(q1Var, q1Var2, a10, q1Var4, i21);
                return Hb;
            }
        });
        q1Var3.setForcedTheme(pVar);
        q1Var3.setTrimItems(false);
        q1Var3.L1(this);
        q1Var3.P1(arrayList3, i16);
        q1Var3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(q1Var3);
        View view = new View(this.f24493a);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.5f));
        linearLayout.addView(view);
        v1Var.addView(linearLayout);
        int i21 = 0 + i18;
        p0.T(textView2);
        textView2.setGravity(17);
        textView2.setTextSize(1, 16.0f);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, a0.i(56.0f)));
        yd.g.i(textView2, R.id.theme_color_fillingPositive, pVar != null ? null : this).f(pVar);
        if (pVar != null) {
            textView2.setTextColor(pVar.e(R.id.theme_color_fillingPositiveContent));
        } else {
            textView2.setTextColor(ae.j.L(R.id.theme_color_fillingPositiveContent));
            z8(textView2, R.id.theme_color_fillingPositiveContent);
        }
        int i22 = i21 + a0.i(56.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                v4.this.Ib(c4Var, lVar, j2Var, view2);
            }
        });
        g4Var.a(null, -1);
        v1Var.addView(textView2);
        return i22;
    }

    public static void Kb(h0 h0Var, j2 j2Var, View view) {
        if (h0Var.r3(view, view.getId())) {
            j2Var.s2(true);
        }
    }

    public void Lb(j2 j2Var, View view) {
        v4<?> F = this.f24493a.Q1().F();
        if ((F instanceof h0) && ((h0) F).r3(view, view.getId())) {
            j2Var.s2(true);
        }
    }

    public int Mb(RecyclerView recyclerView, FrameLayoutFix frameLayoutFix, e2 e2Var) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager.X1() == 0) {
            int i10 = 0;
            View C = linearLayoutManager.C(0);
            if (C != null) {
                int f10 = a0.f();
                int min = Math.min(frameLayoutFix.getMeasuredHeight() - C.getTop(), e2Var.f24134a.v(-1)) + a0.i(56.0f);
                if (a0.t(this.f24493a)) {
                    i10 = a0.m();
                }
                return Math.min(f10, min + i10);
            }
        }
        return a0.f();
    }

    public static void Nb(f2 f2Var, e2 e2Var, j2 j2Var, View view) {
        s sVar;
        n nVar;
        int id2 = view.getId();
        if (id2 == R.id.btn_cancel) {
            e2.a aVar = f2Var.f24167s;
            if (aVar == null || !aVar.a(e2Var, view, true)) {
                j2Var.s2(true);
            }
        } else if (id2 != R.id.btn_save) {
            Object tag = view.getTag();
            if (!f2Var.f24169u) {
                e2Var.f24134a.H1(view);
            }
            if (tag != null && (tag instanceof ra) && (nVar = f2Var.f24154f) != null) {
                nVar.a(view, f2Var.f24149a, (ra) tag, e2Var.f24136c, e2Var.f24134a);
            }
        } else {
            e2.a aVar2 = f2Var.f24167s;
            if (aVar2 == null || !aVar2.a(e2Var, view, false)) {
                int z02 = e2Var.f24134a.z0();
                if (z02 == -1 || z02 == 0) {
                    r rVar = f2Var.f24152d;
                    if (rVar != null) {
                        rVar.l6(f2Var.f24149a, e2Var.f24134a.y0());
                    }
                } else if (z02 == 1 && (sVar = f2Var.f24153e) != null) {
                    sVar.A2(f2Var.f24149a, e2Var.f24134a.A0());
                }
                j2Var.s2(true);
            }
        }
    }

    public boolean Ob(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        if (runnable != null) {
            runnable.run();
        }
        Zb();
        return true;
    }

    public static boolean Pb(kb.i iVar, View view, int i10) {
        iVar.a(i10 == R.id.btn_done);
        return true;
    }

    public static boolean ib(AtomicReference atomicReference, View view, ie.o oVar) {
        AlertDialog alertDialog = (AlertDialog) atomicReference.get();
        if (alertDialog == null) {
            return false;
        }
        try {
            alertDialog.dismiss();
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean jb(k kVar, View view, int i10) {
        switch (i10) {
            case R.id.btn_takePhoto:
                ce.v.o(this.f24493a, kVar.f24526b, false);
                break;
            case R.id.btn_takeVideo:
                ce.v.o(this.f24493a, kVar.f24526b, true);
                break;
        }
        return true;
    }

    public static void kb(y1 y1Var, m mVar, boolean z10, AlertDialog alertDialog, View view) {
        if (mVar.a(y1Var, y1Var.getText().toString())) {
            if (z10) {
                x.c(y1Var.getEditText());
            }
            alertDialog.dismiss();
            return;
        }
        y1Var.setInErrorState(true);
    }

    public static void lb(m mVar, y1 y1Var, String str, boolean z10, AlertDialog alertDialog, View view) {
        if (mVar.a(y1Var, str)) {
            if (z10) {
                x.c(y1Var.getEditText());
            }
            alertDialog.dismiss();
            return;
        }
        y1Var.setInErrorState(true);
    }

    public static void mb(y1 y1Var, m mVar, boolean z10, DialogInterface dialogInterface, int i10) {
        if (!mVar.a(y1Var, y1Var.getText().toString())) {
            y1Var.setInErrorState(true);
        } else if (z10) {
            x.c(y1Var.getEditText());
        }
    }

    public static void nb(boolean z10, y1 y1Var, DialogInterface dialogInterface, int i10) {
        if (z10) {
            x.c(y1Var.getEditText());
        }
        dialogInterface.dismiss();
    }

    public static v4<?> o9(View view) {
        while (view != null) {
            Object tag = view.getTag();
            if (tag instanceof v4) {
                return (v4) tag;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    public static void ob(m mVar, y1 y1Var, String str, boolean z10, DialogInterface dialogInterface, int i10) {
        if (!mVar.a(y1Var, str)) {
            y1Var.setInErrorState(true);
        } else if (z10) {
            x.c(y1Var.getEditText());
        }
    }

    public static void pb(kb.k kVar, int i10, SparseIntArray sparseIntArray) {
        int i11;
        switch (sparseIntArray.get(i10)) {
            case R.id.btn_messageLive15Minutes:
                i11 = 900;
                break;
            case R.id.btn_messageLive1Hour:
                i11 = 3600;
                break;
            case R.id.btn_messageLive8Hours:
                i11 = 28800;
                break;
            case R.id.btn_messageLiveStop:
            default:
                return;
            case R.id.btn_messageLiveTemp:
                i11 = 60;
                break;
        }
        kVar.a(i11);
    }

    public static v4<?> q9(View view) {
        v4<?> v4Var = null;
        while (view != null) {
            Object tag = view.getTag();
            if (tag instanceof v4) {
                v4Var = (v4) tag;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return v4Var;
    }

    public void vb(i.e eVar, int i10, boolean z10) {
        if (z10) {
            vr vrVar = new vr(this.f24493a, this.f24495b);
            vrVar.ji(new vr.f(2, eVar).c(i10));
            ac(vrVar);
        }
    }

    public void xb(kb.f fVar, Runnable runnable) {
        if (Sa()) {
            return;
        }
        if (fVar == null || fVar.get()) {
            runnable.run();
        }
    }

    public boolean yb(String str, long j10, View view, int i10) {
        if (i10 == R.id.btn_phone_call) {
            ce.v.B(t2.W1(str));
            return true;
        } else if (i10 != R.id.btn_telegram_call) {
            return true;
        } else {
            this.f24495b.F4().c0().p0(this, j10, null);
            return true;
        }
    }

    public static boolean zb(Runnable runnable, View view, int i10) {
        if (i10 != R.id.btn_done) {
            return true;
        }
        runnable.run();
        return true;
    }

    public final void A8(Object obj) {
        v8(new u(2, R.id.theme_color_textLight, obj));
    }

    public int A9() {
        return 1;
    }

    @Deprecated
    public int Aa() {
        return d1.t2();
    }

    public void Ac() {
        q1 q1Var;
        if (Na() && (this.f24497c & 8388608) == 0 && C8()) {
            if (this.R == null || (q1Var = this.T) == null || q1Var.M().l() != this || this.R.getCurrentTransformMode() != 2) {
                Jd(0.0f, false);
                xc();
                Sb();
            }
        }
    }

    public void Ad(T t10) {
        this.N = t10;
    }

    public final void Ae(boolean z10, boolean z11) {
        d1 d1Var;
        if (la() == R.id.menu_clear && (d1Var = this.R) != null) {
            d1Var.k4(R.id.menu_clear, R.id.menu_btn_clear, z10, z11);
        }
    }

    public boolean B8() {
        return true;
    }

    public int B9() {
        return ae.q.b();
    }

    public final v Ba() {
        if (this.U == null) {
            this.U = new v();
        }
        return this.U;
    }

    public void Bc(int i10, boolean z10) {
    }

    public final void Bd(m1 m1Var) {
        this.f24506k0 = m1Var;
    }

    public void Be(View view, int i10, float f10) {
    }

    public void C4(int i10, int i11, float f10, boolean z10) {
        ae.k.c(this, i10, i11, f10, z10);
    }

    public boolean C8() {
        return true;
    }

    public long C9() {
        return 0L;
    }

    public View Ca() {
        if (this.f24507l0 == null) {
            this.f24507l0 = nc(t());
        }
        return this.f24507l0;
    }

    public void Cc(String str) {
    }

    public final void Cd(boolean z10) {
        d1 d1Var;
        if (la() == R.id.menu_clear && (d1Var = this.R) != null) {
            d1Var.l4(R.id.menu_clear, R.id.menu_btn_clear, z10);
        }
    }

    public void Ce(int i10, LinearLayout linearLayout) {
    }

    public boolean D8() {
        return true;
    }

    public ud.r D9(d1 d1Var) {
        if (this.f24494a0 == null) {
            ud.r A2 = d1.A2(t(), ya());
            this.f24494a0 = A2;
            t8(A2);
        }
        return this.f24494a0;
    }

    public final float Da() {
        return this.f24500e0;
    }

    public void Dc(int i10) {
    }

    public final void Dd(boolean z10) {
        if (Ua() != z10) {
            this.f24497c = ib.c.h(this.f24497c, 33554432, z10);
            uc(z10);
        }
    }

    public final void De(boolean z10) {
        if (z10) {
            this.V = this.P;
            View F9 = F9();
            this.P = F9;
            if (F9 == null) {
                x.c(this.V);
            } else {
                x.f(F9);
            }
        } else {
            View view = this.P;
            this.P = this.V;
            this.V = null;
            if (view != null) {
                x.c(view);
            }
        }
    }

    public boolean E8() {
        return true;
    }

    public int E9() {
        return J9();
    }

    public int Ea() {
        return he.n.e();
    }

    public AlertDialog Ec(int i10, CharSequence charSequence) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(i10));
        builder.setMessage(charSequence);
        builder.setPositiveButton(w.P0(), p4.f24351a);
        return Sd(builder);
    }

    public final void Ed(View view) {
        Fd(view, true);
    }

    public void Ee(boolean z10) {
        if (z10) {
            this.V = this.P;
            HeaderEditText headerEditText = this.f24496b0;
            this.P = headerEditText;
            x.f(headerEditText);
            return;
        }
        this.P = this.V;
        x.c(this.f24496b0);
        this.V = null;
    }

    public boolean F8() {
        return false;
    }

    public View F9() {
        return null;
    }

    public final View Fa(d1 d1Var) {
        int i10 = this.f24497c;
        if ((524288 & i10) != 0) {
            return D9(d1Var);
        }
        if ((1048576 & i10) != 0) {
            return ja(d1Var);
        }
        if ((i10 & Log.TAG_ACCOUNTS) != 0) {
            return I9(d1Var);
        }
        return null;
    }

    public AlertDialog Fc(int i10, CharSequence charSequence, CharSequence charSequence2, DialogInterface.OnClickListener onClickListener, int i11) {
        return Gc(i10, charSequence, charSequence2, onClickListener, l3.f24274a, i11);
    }

    public void Fd(View view, boolean z10) {
        int i10 = this.f24497c;
        if ((1048576 & i10) == 0 && (2097152 & i10) == 0) {
            this.P = view;
        } else {
            this.V = view;
        }
        if (z10) {
            this.f24497c = 32768 | i10;
        } else {
            this.f24497c = (-32769) & i10;
        }
    }

    public boolean Fe() {
        return Me();
    }

    public void G8(float f10) {
    }

    public View G9() {
        return null;
    }

    public View Ga() {
        return null;
    }

    public AlertDialog Gc(int i10, CharSequence charSequence, CharSequence charSequence2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i11) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(i10));
        builder.setMessage(charSequence);
        builder.setPositiveButton(charSequence2, onClickListener);
        if ((i11 & 1) == 0) {
            builder.setNegativeButton(w.i1(R.string.Cancel), onClickListener2);
        }
        if ((i11 & 2) != 0) {
            builder.setCancelable(false);
        }
        return Xb(Sd(builder), i11);
    }

    public final void Gd(int i10) {
        Hd(w.i1(i10));
    }

    public boolean Ge() {
        return false;
    }

    public void H8(LinearLayout linearLayout, float f10) {
    }

    public int H9() {
        return he.n.e();
    }

    public final View Ha() {
        return this.O;
    }

    public void Hc(int i10, int i11) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(i10));
        builder.setMessage(w.i1(i11));
        builder.setPositiveButton(w.P0(), k3.f24259a);
        Sd(builder);
    }

    public final void Hd(CharSequence charSequence) {
        this.M = charSequence;
        if (this.R != null && dd()) {
            this.R.q4(R9(), charSequence);
        }
    }

    public boolean He() {
        return true;
    }

    public boolean I8(float f10, float f11) {
        if (this.f24499d0 == f10) {
            return false;
        }
        View Ga = Ga();
        if (Ga == null) {
            this.f24499d0 = f10;
            return false;
        }
        Ga.setTranslationY(f11);
        if (Qd()) {
            if (f10 == 1.0f) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) Ga.getLayoutParams();
                int i10 = (int) f11;
                if (marginLayoutParams.bottomMargin != i10) {
                    marginLayoutParams.bottomMargin = i10;
                    Ga.setLayoutParams(marginLayoutParams);
                }
            } else if (this.f24499d0 == 1.0f) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) Ga.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != 0) {
                    marginLayoutParams2.bottomMargin = 0;
                    Ga.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        this.f24499d0 = f10;
        return true;
    }

    public View I9(d1 d1Var) {
        return null;
    }

    public void Ia() {
        HeaderEditText headerEditText = this.f24496b0;
        if (headerEditText != null) {
            d1.h4(headerEditText, a0.i(68.0f), a0.i(49.0f));
        }
        ud.r rVar = this.f24494a0;
        if (rVar != null) {
            d1.i4(rVar, a0.i(68.0f), 0);
        }
        View G9 = G9();
        if (G9 instanceof c2) {
            ((c2) G9).s();
        }
    }

    public void Ic(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
        Jc(i10, i11, w.P0(), onClickListener);
    }

    public void Id(v4<?> v4Var) {
        this.Q = v4Var;
    }

    public boolean Ie() {
        return true;
    }

    @Override
    public void J5(m1.f fVar) {
        sc();
    }

    public void J8(float f10, boolean z10) {
    }

    public int J9() {
        return 0;
    }

    public void Ja(int i10, int i11) {
    }

    public void Jc(int i10, int i11, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Fc(i10, w.i1(i11), charSequence, onClickListener, 0);
    }

    public final void Jd(float f10, boolean z10) {
        if (this.W != f10) {
            this.W = f10;
            J8(f10, z10);
        }
    }

    public boolean Je() {
        return false;
    }

    public void K8(float f10) {
    }

    public final int K9() {
        return ae.j.L(L9());
    }

    public boolean Ka() {
        return (this.f24497c & 134217728) != 0;
    }

    public void Kc(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z10) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(i10));
        builder.setMessage(charSequence);
        builder.setPositiveButton(w.P0(), onClickListener);
        if (z10) {
            builder.setNegativeButton(w.i1(R.string.Cancel), q4.f24387a);
        } else {
            builder.setCancelable(false);
        }
        Sd(builder);
    }

    public final void Kd(int i10) {
        ud.r rVar = this.f24494a0;
        if (rVar != null && rVar.E(i10)) {
            Dc(i10);
        }
    }

    public boolean Ke() {
        return true;
    }

    public void L8() {
    }

    public int L9() {
        return R.id.theme_color_headerBackground;
    }

    public void La() {
        if (Na()) {
            x.c(this.f24496b0);
        }
        View view = this.P;
        if (view != null) {
            x.c(view);
        }
    }

    public final boolean Lc(k kVar) {
        return this.f24493a.d2(kVar);
    }

    public final void Ld(boolean z10) {
        if (z10) {
            this.f24497c |= 16777216;
        } else {
            this.f24497c &= -16777217;
        }
    }

    public boolean Le() {
        return false;
    }

    @Override
    public final void M4() {
        if (!Sa()) {
            Z8();
        }
    }

    public void M8(d1 d1Var) {
        this.f24497c &= -4194305;
        this.R = d1Var;
        this.T = null;
        this.S = null;
    }

    public int M9() {
        return he.n.e();
    }

    public final boolean Ma() {
        return (this.f24497c & Log.TAG_ACCOUNTS) != 0;
    }

    public void Mc(int i10) {
        final AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(Ec(R.string.FeatureUnavailableSorry, c0.l(this, w.i1(i10), new o.a() {
            @Override
            public final boolean a(View view, o oVar) {
                boolean ib2;
                ib2 = v4.ib(atomicReference, view, oVar);
                return ib2;
            }
        })));
    }

    public final void Md(boolean z10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            q1Var.M().B(z10);
        }
    }

    public boolean Me() {
        return false;
    }

    public void N8(q1 q1Var) {
        this.f24497c |= 4194304;
        this.T = q1Var;
        this.R = q1Var.I();
        this.S = q1Var.H();
    }

    public int N9() {
        return ae.j.L(O9());
    }

    public final boolean Na() {
        return (this.f24497c & Log.TAG_NDK) != 0;
    }

    public final void Nc(final k kVar) {
        if (!kVar.f24527c || he.i.c2().r0() != 2) {
            Lc(kVar.c(S9()));
        } else {
            ee(null, new int[]{R.id.btn_takePhoto, R.id.btn_takeVideo}, new String[]{w.i1(R.string.TakePhoto), w.i1(R.string.TakeVideo)}, null, new int[]{R.drawable.baseline_camera_alt_24, R.drawable.baseline_videocam_24}, new h0() {
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
                    boolean jb2;
                    jb2 = v4.this.jb(kVar, view, i10);
                    return jb2;
                }
            });
        }
    }

    public final void Nd(float f10) {
        if (this.f24500e0 != f10) {
            this.f24500e0 = f10;
            K8(f10);
            Od(f10 == 1.0f);
            d1 d1Var = this.R;
            if (d1Var != null) {
                d1Var.invalidate();
            }
        }
    }

    public boolean Ne() {
        return true;
    }

    public final void O8(v vVar) {
        v vVar2 = this.U;
        if (vVar2 != null) {
            vVar.b(vVar2);
        }
        this.U = vVar;
    }

    public int O9() {
        return R.id.theme_color_headerIcon;
    }

    public final boolean Oa() {
        return (this.f24497c & Log.TAG_PLAYER) != 0;
    }

    public y1 Oc(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, CharSequence charSequence3, final String str, final m mVar, final boolean z10, kb.j<ViewGroup> jVar, ae.p pVar) {
        Button button;
        final y1 y1Var = new y1(this.f24493a);
        y1Var.setHint(charSequence2);
        y1Var.getEditText().setInputType(209);
        if (!ib.i.i(charSequence3)) {
            y1Var.setText(charSequence3);
            p0.g0(y1Var.getEditText(), 0, charSequence3.length());
        }
        y1Var.getEditText().addTextChangedListener(new b(y1Var));
        c cVar = new c(this.f24493a, y1Var);
        cVar.setOrientation(1);
        cVar.setGravity(1);
        int i12 = a0.i(16.0f);
        cVar.setPadding(i12, i12, i12, i12);
        cVar.addView(y1Var, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        if (jVar != null) {
            jVar.a(cVar);
        }
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.f24493a, ae.j.t()).setTitle(charSequence).setView(cVar).setPositiveButton(w.i1(i10), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i13) {
                v4.mb(y1.this, mVar, z10, dialogInterface, i13);
            }
        }).setNegativeButton(w.i1(i11), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i13) {
                v4.nb(z10, y1Var, dialogInterface, i13);
            }
        });
        boolean z11 = !ib.i.i(charSequence3) && !ib.i.i(str) && !charSequence3.equals(str);
        if (z11) {
            negativeButton.setNeutralButton(w.i1(R.string.ValueReset), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    v4.ob(v4.m.this, y1Var, str, z10, dialogInterface, i13);
                }
            });
        }
        negativeButton.setCancelable(false);
        final AlertDialog Sd = Sd(negativeButton);
        if (Sd.getWindow() != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                Sd.getWindow().setSoftInputMode(1);
            } else {
                Sd.getWindow().setSoftInputMode(5);
            }
        }
        Button button2 = Sd.getButton(-1);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    v4.kb(y1.this, mVar, z10, Sd, view);
                }
            });
        }
        if (z11 && (button = Sd.getButton(-3)) != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    v4.lb(v4.m.this, y1Var, str, z10, Sd, view);
                }
            });
        }
        return y1Var;
    }

    public final void Od(boolean z10) {
        if (this.f24501f0 != z10) {
            this.f24501f0 = z10;
            if (z10) {
                L8();
            } else {
                V8();
            }
        }
    }

    public final boolean Oe() {
        return (this.f24497c & 268435456) != 0;
    }

    public int P8(int i10, TextView textView, boolean z10, boolean z11) {
        return Q8(new f1(i10, textView, z10, z11));
    }

    public final int P9() {
        return ae.j.L(Q9());
    }

    public final boolean Pa() {
        int i10 = this.f24497c;
        return ((1048576 & i10) == 0 && (524288 & i10) == 0 && (i10 & Log.TAG_ACCOUNTS) == 0) ? false : true;
    }

    public y1 Pc(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, CharSequence charSequence3, m mVar, boolean z10) {
        return Oc(charSequence, charSequence2, i10, i11, charSequence3, null, mVar, z10, null, null);
    }

    public final boolean Pd() {
        return (this.f24497c & 16777216) != 0 && !Pa() && (this.f24500e0 == 0.0f || F8());
    }

    @Override
    public final void Q0(int i10, boolean z10) {
    }

    @Override
    public final void Q2() {
        Z8();
    }

    public void Q5(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: ud.v4.Q5(int, int):void");
    }

    public int Q8(f1 f1Var) {
        if (this.f24503h0 == null) {
            this.f24503h0 = new ArrayList();
        }
        this.f24503h0.add(f1Var);
        return f1Var.a();
    }

    public int Q9() {
        return R.id.theme_color_headerText;
    }

    public final void Qa(int i10) {
        ud.r rVar = this.f24494a0;
        if (rVar != null) {
            rVar.w(i10, false);
        }
    }

    public boolean Qb(boolean z10, int i10, Animator.AnimatorListener animatorListener) {
        return false;
    }

    public void Qc(String str, hj.q qVar) {
        hj hd2 = this.f24495b.hd();
        if (qVar == null) {
            qVar = new hj.q();
        }
        hd2.E7(this, str, qVar.m());
    }

    public boolean Qd() {
        return true;
    }

    public final void R8(v4<?> v4Var) {
        if (v4Var != null) {
            if (v4Var.U == null) {
                v4Var.U = new v();
            }
            if (this.U != null) {
                v4Var.U.m().addAll(this.U.m());
            }
            this.U = v4Var.U;
        }
    }

    public abstract int R9();

    public boolean Ra() {
        return (this.f24497c & 4194304) != 0;
    }

    public final void Rb() {
        this.f24497c &= -2097153;
    }

    public final void Rc(long j10, final kb.k kVar) {
        f2 f2Var = new f2(R.id.btn_shareLiveLocation);
        f2Var.p(new ra[]{new ra(13, (int) R.id.btn_messageLive15Minutes, 0, (CharSequence) w.o2(R.string.xMinutes, 15L), (int) R.id.btn_shareLiveLocation, true), new ra(13, (int) R.id.btn_messageLive1Hour, 0, (CharSequence) w.o2(R.string.xHours, 1L), (int) R.id.btn_shareLiveLocation, false), new ra(13, (int) R.id.btn_messageLive8Hours, 0, (CharSequence) w.o2(R.string.xHours, 8L), (int) R.id.btn_shareLiveLocation, false)});
        String j12 = ob.a.l(j10) ? w.j1(R.string.LiveLocationAlertPrivate, this.f24495b.e2().J2(this.f24495b.h4(j10))) : w.i1(R.string.LiveLocationAlertGroup);
        f2Var.a(new ra(84));
        f2Var.c(false);
        f2Var.b(j12);
        f2Var.r(R.string.Share);
        f2Var.j(new r() {
            @Override
            public final void l6(int i10, SparseIntArray sparseIntArray) {
                v4.pb(kb.k.this, i10, sparseIntArray);
            }
        });
        me(f2Var);
    }

    public boolean Rd() {
        return false;
    }

    public boolean S8(q1 q1Var, float f10, float f11) {
        return true;
    }

    public boolean S9() {
        return (this.f24497c & Log.TAG_CONTACT) != 0;
    }

    public boolean Sa() {
        return (this.f24497c & Log.TAG_VIDEO) != 0;
    }

    public final void Sb() {
        this.f24497c &= -1048577;
        gc();
        Jd(0.0f, false);
    }

    public void Sc() {
        Vc(R.string.NoCameraAccess);
    }

    public final AlertDialog Sd(AlertDialog.Builder builder) {
        return Xb(this.f24493a.x3(builder), 0);
    }

    @Override
    public void T3(m1.f fVar) {
        Ac();
    }

    public void T8() {
        U8("", false);
    }

    public final String T9() {
        return this.f24498c0;
    }

    public boolean Ta() {
        return (this.f24497c & Log.TAG_LUX) != 0;
    }

    public final void Tb() {
        this.f24497c &= -524289;
    }

    public void Tc() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(R.string.AppName));
        builder.setMessage(w.i1(R.string.NoGoogleMaps));
        builder.setPositiveButton(w.i1(R.string.Install), u4.f24482a);
        builder.setNegativeButton(w.i1(R.string.Cancel), j3.f24224a);
        Sd(builder);
    }

    public final void Td(final String str, final long j10) {
        if (j10 == 0) {
            ce.v.B(str);
        } else {
            je(new int[]{R.id.btn_phone_call, R.id.btn_telegram_call}, new String[]{w.i1(R.string.PhoneCall), w.i1(R.string.VoipInCallBranding)}, new h0() {
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
                    boolean yb2;
                    yb2 = v4.this.yb(str, j10, view, i10);
                    return yb2;
                }
            });
        }
    }

    public final void U8(String str, boolean z10) {
        HeaderEditText headerEditText = this.f24496b0;
        if (headerEditText != null) {
            if (z10) {
                this.f24498c0 = str;
            }
            headerEditText.setText(str);
            if (!str.isEmpty()) {
                p0.f0(this.f24496b0, str.length());
            }
            Ae(!str.isEmpty(), false);
        }
    }

    public View U9() {
        return this.P;
    }

    public final boolean Ua() {
        return (this.f24497c & 33554432) != 0;
    }

    public final void Ub() {
        this.f24497c = this.f24497c & (-524289) & (-1048577) & (-2097153);
    }

    public void Uc(boolean z10) {
        Vc((Build.VERSION.SDK_INT < 29 || !fd.a.f11897s || !z10) ? R.string.NoLocationAccess : R.string.NoLocationAccessBackground);
    }

    public final j2 Ud(CharSequence charSequence, String str, int i10, int i11, final Runnable runnable) {
        int[] iArr = {R.id.btn_done, R.id.btn_cancel};
        String[] strArr = new String[2];
        if (str == null) {
            str = w.i1(R.string.OK);
        }
        strArr[0] = str;
        strArr[1] = w.i1(R.string.Cancel);
        return ee(charSequence, iArr, strArr, new int[]{i11, 1}, new int[]{i10, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean zb2;
                zb2 = v4.zb(runnable, view, i12);
                return zb2;
            }
        });
    }

    public boolean V0() {
        return Ra() || Ua();
    }

    public void V8() {
    }

    public int V9() {
        return M9();
    }

    public boolean Va() {
        return false;
    }

    public final void Vb() {
        if (Ua()) {
            int i10 = this.f24497c;
            if ((i10 & 268435456) == 0) {
                this.f24497c = i10 | 268435456;
                j0.k(get(), false);
                this.f24493a.w0();
            }
        }
    }

    public void Vc(int i10) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(R.string.AppName));
        builder.setMessage(w.i1(i10));
        builder.setPositiveButton(w.P0(), o4.f24341a);
        builder.setNegativeButton(w.i1(R.string.Settings), r4.f24423a);
        Sd(builder);
    }

    public final j2 Vd(CharSequence charSequence, String str, Runnable runnable) {
        return Ud(charSequence, str, R.drawable.baseline_check_circle_24, 1, runnable);
    }

    public final void W8(Runnable runnable) {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.n2(true, runnable);
        }
    }

    public int W9() {
        return 0;
    }

    public final boolean Wa() {
        q1 q1Var = this.T;
        return q1Var != null && q1Var.S();
    }

    public final void Wb(float f10, float f11) {
        m1 m1Var;
        if ((this.f24497c & 268435456) == 0 && (m1Var = this.f24506k0) != null && !m1Var.L1()) {
            float I1 = (f10 - f11) + this.f24506k0.I1(f11);
            float f12 = 0.0f;
            if (I1 < 0.0f) {
                f12 = ib.h.d((-I1) / a0.i(64.0f));
            }
            if (f12 == 1.0f) {
                Vb();
                return;
            }
            m1 m1Var2 = this.f24506k0;
            if (m1Var2 != null) {
                m1Var2.setBeforeMaximizeFactor(f12);
            }
        }
    }

    public void Wc() {
        Vc(R.string.NoStorageAccess);
    }

    public final void Wd(final String str, final hj.q qVar, final kb.f fVar) {
        jb.c cVar = new jb.c(3);
        u0 u0Var = new u0(3);
        jb.c cVar2 = new jb.c(3);
        cVar.a(R.id.btn_openLink);
        u0Var.a(R.string.Open);
        cVar2.a(R.drawable.baseline_open_in_browser_24);
        cVar.a(R.id.btn_copyLink);
        u0Var.a(R.string.CopyLink);
        cVar2.a(R.drawable.baseline_link_24);
        cVar.a(R.id.btn_shareLink);
        u0Var.a(R.string.Share);
        cVar2.a(R.drawable.baseline_forward_24);
        final int[] iArr = {0};
        ee(str, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
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
                boolean Ab;
                Ab = v4.this.Ab(str, iArr, fVar, qVar, view, i10);
                return Ab;
            }
        });
    }

    public boolean X8(boolean z10) {
        return false;
    }

    public CharSequence X9() {
        return this.M;
    }

    public boolean Xa() {
        return (this.f24497c & Log.TAG_EMOJI) != 0;
    }

    public final AlertDialog Xb(AlertDialog alertDialog, int i10) {
        if (alertDialog == null) {
            return null;
        }
        if ((i10 & 4) != 0) {
            View findViewById = alertDialog.findViewById(16908299);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        return alertDialog;
    }

    public void Xc(String str, CharSequence charSequence) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        if (str != null && !str.isEmpty()) {
            builder.setTitle(str);
        }
        builder.setMessage(charSequence);
        builder.setPositiveButton(w.P0(), t4.f24469a);
        Sd(builder);
    }

    public final j2 Xd(CharSequence charSequence, final int i10, final int i11, final int i12, final kb.l lVar, final ae.p pVar) {
        return le(charSequence, true, new q() {
            @Override
            public final int a(j2 j2Var, v1 v1Var) {
                int Jb;
                Jb = v4.this.Jb(pVar, i10, i11, i12, lVar, j2Var, v1Var);
                return Jb;
            }
        }, pVar);
    }

    public final void Y8() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.p2();
        }
    }

    public final int Y9() {
        return 1275068416;
    }

    public final boolean Ya(w6 w6Var) {
        return xe() == w6Var.f28608b;
    }

    public void Yb(HeaderEditText headerEditText) {
    }

    public final void Yc() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.C3();
        }
    }

    public final void Yd(int[] iArr, String[] strArr, int i10) {
        be(iArr, strArr, null, i10, false);
    }

    public void Z8() {
        o6 o6Var;
        int i10 = this.f24497c;
        if ((i10 & Log.TAG_VIDEO) == 0) {
            this.f24497c = i10 | Log.TAG_VIDEO;
            List<f1> list = this.f24503h0;
            if (list != null) {
                list.clear();
            }
            if (!(this.O == null || (o6Var = this.f24495b) == null)) {
                o6Var.M4();
            }
            ze();
            View G9 = G9();
            if (G9 instanceof kb.c) {
                ((kb.c) G9).Q2();
            }
            rd();
            ArrayList<kb.c> arrayList = this.f24505j0;
            if (arrayList != null) {
                Iterator<kb.c> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().Q2();
                }
                return;
            }
            return;
        }
        Log.bug("Controller is already destroyed: name: %s, class: %s", this.M, getClass().getName());
    }

    public v4<?> Z9() {
        v4<?> v4Var = this.Q;
        return v4Var != null ? v4Var : this;
    }

    public final boolean Za(o6 o6Var) {
        return xe() == o6Var.A6();
    }

    public boolean Zb() {
        q1 q1Var = this.T;
        return q1Var != null && q1Var.g0();
    }

    public final void Zc(int i10) {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.D3(i10, true);
        }
    }

    public final void Zd(int[] iArr, String[] strArr, int[] iArr2) {
        ae(iArr, strArr, iArr2, 0);
    }

    public final void a9(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            q1Var.M().e(i10);
        }
    }

    public int aa() {
        return 0;
    }

    public final boolean ab() {
        q1 q1Var = this.T;
        return q1Var != null && q1Var.M().r();
    }

    public boolean ac(v4<?> v4Var) {
        q1 q1Var;
        return !ab() && (q1Var = this.T) != null && q1Var.h0(v4Var);
    }

    public final void ad(final int i10, final i.e eVar) {
        re(w.H0(this, R.string.TdlibLogsWarning, new Object[0]), new kb.i() {
            @Override
            public final void a(boolean z10) {
                v4.this.vb(eVar, i10, z10);
            }
        });
    }

    public final void ae(int[] iArr, String[] strArr, int[] iArr2, int i10) {
        be(iArr, strArr, iArr2, i10, false);
    }

    public final v4<?> b9(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().c(i10);
        }
        return null;
    }

    public int ba() {
        return R.id.theme_color_filling;
    }

    public final boolean bb() {
        return this.f24501f0;
    }

    public q1 bc() {
        return this.T;
    }

    public final void bd(CharSequence charSequence) {
        Fc(R.string.AppUpdateRequiredTitle, charSequence, w.i1(R.string.AppUpdateOk), s4.f24437a, 0);
    }

    public final void be(int[] iArr, String[] strArr, int[] iArr2, int i10, boolean z10) {
        d1 d1Var;
        if (!ab() && !this.f24493a.x1() && (d1Var = this.R) != null) {
            d1Var.L3(iArr, strArr, iArr2, i10, z10, this);
        }
    }

    @Override
    public final o6 c() {
        return this.f24495b;
    }

    public void c6() {
        this.f24497c = (this.f24497c & (-65537)) | Log.TAG_EMOJI;
    }

    public final v4<?> c9(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().g(i10);
        }
        return null;
    }

    public final Runnable ca() {
        return this.X;
    }

    public final boolean cb() {
        return this.f24500e0 != 0.0f && !this.f24501f0;
    }

    public final u1 cc() {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M();
        }
        return null;
    }

    public boolean cd(boolean z10) {
        return false;
    }

    public final j2 ce(CharSequence charSequence, int[] iArr, String[] strArr, h0 h0Var) {
        return ee(charSequence, iArr, strArr, null, null, h0Var);
    }

    public final v4<?> d9(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().h(i10);
        }
        return null;
    }

    public int da() {
        return 3;
    }

    public boolean db() {
        return false;
    }

    public boolean dc() {
        return false;
    }

    public boolean dd() {
        return false;
    }

    public final j2 de(CharSequence charSequence, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3) {
        return ee(charSequence, iArr, strArr, iArr2, iArr3, null);
    }

    public void e9() {
        this.f24497c &= -4194305;
        this.T = null;
        this.R = null;
        this.S = null;
    }

    public int ea() {
        return B9();
    }

    public boolean ec() {
        return false;
    }

    public final void ed() {
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                v4.this.Zb();
            }
        });
    }

    public final j2 ee(CharSequence charSequence, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, h0 h0Var) {
        return fe(charSequence, iArr, strArr, iArr2, iArr3, h0Var, null);
    }

    public boolean f9() {
        return false;
    }

    public final int fa() {
        return ae.j.L(ga());
    }

    public final void fc(boolean z10) {
        List<l> list = this.f24504i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f24504i0.get(size).a(this, z10);
            }
        }
    }

    public final void fd(Runnable runnable) {
        if (this.Z == null) {
            this.Z = new ArrayList<>();
        }
        this.Z.add(runnable);
    }

    public final j2 fe(CharSequence charSequence, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, h0 h0Var, ae.p pVar) {
        o[] oVarArr = new o[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            oVarArr[i10] = new o(iArr[i10], strArr[i10], iArr2 != null ? iArr2[i10] : 1, iArr3 != null ? iArr3[i10] : 0);
        }
        return he(new p(charSequence, oVarArr), h0Var, pVar);
    }

    public void g9(int i10, int i11, int i12, int i13) {
    }

    public int ga() {
        return Je() ? R.id.theme_color_filling : L9();
    }

    public void gc() {
    }

    public final void gd(Runnable runnable) {
        if (this.Y == null) {
            this.Y = new ArrayList<>();
        }
        this.Y.add(runnable);
    }

    public final j2 ge(p pVar, h0 h0Var) {
        return he(pVar, h0Var, null);
    }

    public void h9(Canvas canvas, float f10, int i10, int i11) {
    }

    public final int ha() {
        return ae.j.L(ia());
    }

    public void hc() {
    }

    public final void hd() {
        this.f24497c |= Log.TAG_TDLIB_FILES;
    }

    public final j2 he(p pVar, final h0 h0Var, ae.p pVar2) {
        int i10;
        View.OnClickListener onClickListener;
        final v4<T> v4Var = this;
        if (ab()) {
            Log.i("Ignoring options show because stack is locked", new Object[0]);
            return null;
        }
        final j2 j2Var = new j2(v4Var.f24493a);
        j2Var.setTag(v4Var);
        j2Var.L1(true);
        if (h0Var != null) {
            j2Var.setDisableCancelOnTouchDown(h0Var.P());
        }
        v1 v1Var = new v1(t(), v4Var, pVar2);
        v1Var.d(v4Var, c(), pVar.f24543a, false);
        v1Var.setLayoutParams(FrameLayoutFix.r1(-1, -2, 80));
        if (a0.t(v4Var.f24493a)) {
            int m10 = a0.m();
            v1Var.setPadding(0, 0, 0, m10);
            j2Var.setNeedFullScreen(true);
            i10 = m10;
        } else {
            i10 = 0;
        }
        f3 f3Var = new f3(v4Var.f24493a);
        f3Var.setSimpleTopShadow(true);
        v1Var.addView(f3Var, 0);
        v4Var.t8(f3Var);
        if (h0Var != null) {
            onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    v4.Kb(h0.this, j2Var, view);
                }
            };
        } else {
            onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    v4.this.Lb(j2Var, view);
                }
            };
        }
        View.OnClickListener onClickListener2 = onClickListener;
        o[] oVarArr = pVar.f24544b;
        int length = oVarArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i12 < length) {
            o oVar = oVarArr[i12];
            int i13 = i11;
            int i14 = i12;
            length = length;
            oVarArr = oVarArr;
            f3Var = f3Var;
            TextView a10 = v1.a(v4Var.f24493a, oVar.f24535a, oVar.f24536b, oVar.f24537c, oVar.f24538d, onClickListener2, Ba(), pVar2);
            yd.d.j(a10);
            if (pVar2 != null) {
                ae.j.C(a10, pVar2);
            }
            a10.setLayoutParams(new LinearLayout.LayoutParams(-1, a0.i(54.0f)));
            if (h0Var != null) {
                a10.setTag(h0Var.a2(i13));
            }
            v1Var.addView(a10);
            i11 = i13 + 1;
            i12 = i14 + 1;
            v4Var = this;
        }
        j2Var.P2(v1Var, f3Var.getLayoutParams().height + (a0.i(54.0f) * pVar.f24544b.length) + v1Var.getTextHeight() + i10);
        return j2Var;
    }

    public void i3(ae.p pVar, ae.p pVar2) {
    }

    public final void i9(Canvas canvas, int i10, int i11) {
        if (!this.f24501f0) {
            float f10 = this.f24500e0;
            if (f10 > 0.0f) {
                h9(canvas, f10, i10, i11);
            }
        }
    }

    public int ia() {
        return Je() ? R.id.theme_color_icon : O9();
    }

    public final void ic(q1 q1Var, boolean z10) {
        int i10 = this.f24497c;
        if (((i10 & 67108864) != 0) != z10) {
            this.f24497c = ib.c.h(i10, 67108864, z10);
            lb.d<j> dVar = this.f24502g0;
            if (dVar != null) {
                Iterator<j> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().a(this, q1Var, z10);
                }
            }
        }
    }

    public final void id() {
        this.f24497c |= 8388608;
    }

    public final j2 ie(int[] iArr, String[] strArr) {
        return ee(null, iArr, strArr, null, null, null);
    }

    public void j6(boolean z10, ae.b bVar) {
        v vVar = this.U;
        if (vVar != null) {
            vVar.n(z10);
        }
    }

    public final void j8(j jVar) {
        if (this.f24502g0 == null) {
            this.f24502g0 = new lb.d<>();
        }
        this.f24502g0.add(jVar);
    }

    public final void j9() {
        this.f24497c |= Log.TAG_NDK;
    }

    public HeaderEditText ja(d1 d1Var) {
        if (this.f24496b0 == null) {
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(-1, he.n.e());
            if (w.G2()) {
                q12.rightMargin = a0.i(68.0f);
                q12.leftMargin = a0.i(49.0f);
            } else {
                q12.leftMargin = a0.i(68.0f);
                q12.rightMargin = a0.i(49.0f);
            }
            HeaderEditText u92 = u9(d1Var);
            this.f24496b0 = u92;
            u92.addTextChangedListener(new a());
            this.f24496b0.setHint(w.i1(P8(ka(), this.f24496b0, true, false)));
            this.f24496b0.setLayoutParams(q12);
            Yb(this.f24496b0);
        }
        return this.f24496b0;
    }

    public boolean jc(boolean z10) {
        return false;
    }

    public boolean jd() {
        return false;
    }

    public final j2 je(int[] iArr, String[] strArr, h0 h0Var) {
        return ee(null, iArr, strArr, null, null, h0Var);
    }

    public final void k8(kb.c cVar) {
        if (cVar != null) {
            if (this.f24505j0 == null) {
                this.f24505j0 = new ArrayList<>();
            }
            this.f24505j0.add(cVar);
        }
    }

    public final void k9() {
        this.f24497c |= Log.TAG_PLAYER;
    }

    public int ka() {
        return R.string.Search;
    }

    public void kc() {
        this.f24497c &= -8193;
        View view = this.P;
        if (view != null && view.isEnabled()) {
            int i10 = this.f24497c;
            if (!((1048576 & i10) == 0 && (65536 & i10) == 0 && (131072 & i10) == 0)) {
                int i11 = i10 & (-65537);
                this.f24497c = i11;
                if ((536870912 & i11) != 0) {
                    this.f24497c = i11 & (-536870913);
                } else {
                    x.c(this.P);
                }
            }
        }
        tc();
        fc(false);
        this.f24493a.w2(this);
    }

    public final v4<?> kd() {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().n();
        }
        return null;
    }

    public final j2 ke(int[] iArr, String[] strArr, int[] iArr2, h0 h0Var) {
        return ee(null, iArr, strArr, iArr2, null, h0Var);
    }

    public final void l8(l lVar) {
        if (this.f24504i0 == null) {
            this.f24504i0 = new ArrayList();
        }
        if (!this.f24504i0.contains(lVar)) {
            this.f24504i0.add(lVar);
        }
    }

    public final void l9() {
        ArrayList<Runnable> arrayList = this.Y;
        if (arrayList != null) {
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.Y.clear();
        }
    }

    public int la() {
        return 0;
    }

    public void lc() {
    }

    public final void ld(TdApi.DeepLinkInfo deepLinkInfo) {
        if (deepLinkInfo.needUpdateApplication) {
            bd(ob.e.c1(deepLinkInfo.text) ? null : t2.t5(deepLinkInfo.text));
        } else {
            Ec(R.string.AppName, t2.t5(deepLinkInfo.text));
        }
    }

    public final j2 le(CharSequence charSequence, boolean z10, q qVar, ae.p pVar) {
        j2 j2Var = new j2(this.f24493a);
        j2Var.setTag(this);
        j2Var.L1(true);
        v1 v1Var = new v1(t(), this, pVar);
        v1Var.d(this, c(), charSequence, z10);
        v1Var.setLayoutParams(FrameLayoutFix.r1(-1, -2, 80));
        f3 f3Var = new f3(this.f24493a);
        f3Var.setSimpleTopShadow(true);
        v1Var.addView(f3Var, 0);
        t8(f3Var);
        int textHeight = v1Var.getTextHeight() + 0 + f3Var.getLayoutParams().height + qVar.a(j2Var, v1Var);
        if (a0.t(this.f24493a)) {
            int m10 = a0.m();
            textHeight += m10;
            v1Var.setPadding(0, 0, 0, m10);
            j2Var.setNeedFullScreen(true);
        }
        j2Var.P2(v1Var, textHeight);
        return j2Var;
    }

    public final void m8(Runnable runnable) {
        if (Ta()) {
            runnable.run();
        } else {
            l8(new i(runnable));
        }
    }

    public final void m9(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            ud(runnable);
        }
    }

    public String ma() {
        return null;
    }

    public void mc(Configuration configuration) {
    }

    public final void md(Runnable runnable) {
        j0.f0(runnable);
    }

    public final e2 me(final f2 f2Var) {
        FrameLayout frameLayout;
        d3 d3Var;
        int i10;
        j2 j2Var;
        int i11;
        String str;
        ra[] raVarArr;
        int i12 = 0;
        if (ab()) {
            Log.i("Ignoring showSettings because stack is locked", new Object[0]);
            return null;
        }
        int i13 = 2;
        int i14 = 1;
        int length = (f2Var.f24151c.length * 2) + 1;
        ArrayList<ra> arrayList = f2Var.f24150b;
        ArrayList arrayList2 = new ArrayList(length + ((arrayList == null || arrayList.isEmpty()) ? 0 : f2Var.f24150b.size() + 1));
        arrayList2.add(new ra(2));
        ArrayList<ra> arrayList3 = f2Var.f24150b;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            arrayList2.addAll(f2Var.f24150b);
            arrayList2.add(new ra(11));
        }
        if (f2Var.f24158j != null) {
            arrayList2.add(new ra(30, f2Var.f24155g, 0, f2Var.f24156h, false).U(f2Var.f24158j, f2Var.f24157i));
            arrayList2.add(new ra(11));
        }
        if (f2Var.f24159k) {
            boolean z10 = true;
            for (ra raVar : f2Var.f24151c) {
                if (z10) {
                    z10 = false;
                } else {
                    arrayList2.add(new ra(11));
                }
                arrayList2.add(raVar);
            }
        } else {
            arrayList2.ensureCapacity(arrayList2.size() + f2Var.f24151c.length);
            Collections.addAll(arrayList2, f2Var.f24151c);
        }
        final ?? frameLayoutFix = new FrameLayoutFix(this.f24493a);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        final e2 e2Var = new e2();
        final d dVar = new d(this.f24493a, e2Var);
        e2Var.f24135b = dVar;
        if (f2Var.f24165q) {
            dVar.g(new e());
        }
        dVar.setOverScrollMode(fd.a.f11879a ? 1 : 2);
        dVar.setItemAnimator(null);
        dVar.setLayoutManager(new LinearLayoutManager(t(), 1, false));
        final j2 j2Var2 = new j2(this.f24493a);
        e2Var.f24138e = j2Var2;
        j2Var2.setPopupHeightProvider(new j2.g() {
            @Override
            public final int getCurrentPopupHeight() {
                int Mb;
                Mb = v4.this.Mb(dVar, frameLayoutFix, e2Var);
                return Mb;
            }
        });
        j2Var2.L1(true);
        if (f2Var.f24160l) {
            j2Var2.I2();
        }
        j2Var2.h2();
        j2Var2.setDismissListener(f2Var.f24166r);
        View.OnClickListener o3Var = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                v4.Nb(f2.this, e2Var, j2Var2, view);
            }
        };
        ?? r02 = f2Var.f24171w;
        View.OnClickListener onClickListener = o3Var;
        f fVar = new f(r02 != 0 ? r02 : this, o3Var, this, f2Var);
        e2Var.f24134a = fVar;
        int s22 = fVar.s2(arrayList2, true);
        if (!f2Var.f24170v) {
            frameLayout = new g(this.f24493a);
            yd.g.i(frameLayout, R.id.theme_color_filling, this);
            frameLayout.setLayoutParams(FrameLayoutFix.r1(-1, a0.i(56.0f), 80));
            int i15 = 0;
            while (i15 < i13) {
                b2 b2Var = new b2(this.f24493a);
                int i16 = i15 == i14 ? f2Var.f24162n : f2Var.f24164p;
                b2Var.setTextColor(ae.j.L(i16));
                z8(b2Var, i16);
                b2Var.setTextSize(i14, 16.0f);
                View.OnClickListener onClickListener2 = onClickListener;
                b2Var.setOnClickListener(onClickListener2);
                b2Var.setBackgroundResource(R.drawable.bg_btn_header);
                b2Var.setGravity(17);
                b2Var.setPadding(a0.i(16.0f), i12, a0.i(16.0f), i12);
                if (i15 == 0) {
                    b2Var.setId(R.id.btn_cancel);
                    str = f2Var.f24163o.toUpperCase();
                    b2Var.setText(str);
                    b2Var.setLayoutParams(FrameLayoutFix.r1(-2, a0.i(55.0f), (w.G2() ? 5 : 3) | 80));
                    e2Var.f24137d = b2Var;
                } else {
                    b2Var.setId(R.id.btn_save);
                    str = f2Var.f24161m.toUpperCase();
                    b2Var.setText(str);
                    b2Var.setLayoutParams(FrameLayoutFix.r1(-2, a0.i(55.0f), (w.G2() ? 3 : 5) | 80));
                    e2Var.f24136c = b2Var;
                }
                p0.s0(b2Var, str);
                p0.T(b2Var);
                frameLayout.addView(b2Var);
                i15++;
                onClickListener = onClickListener2;
                i12 = 0;
                i13 = 2;
                i14 = 1;
            }
        } else {
            frameLayout = null;
        }
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 80);
        r12.bottomMargin = frameLayout != null ? a0.i(56.0f) : 0;
        dVar.setAdapter(e2Var.f24134a);
        dVar.setLayoutParams(r12);
        frameLayoutFix.addView(dVar);
        if (frameLayout != null) {
            frameLayoutFix.addView(frameLayout);
        }
        if (frameLayout != null) {
            FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-1, a0.i(1.0f), 80);
            r13.bottomMargin = a0.i(56.0f);
            d3 e10 = d3.e(this.f24493a, r13, true);
            e10.a();
            t8(e10);
            frameLayoutFix.addView(e10);
            d3Var = e10;
        } else {
            d3Var = null;
        }
        if (a0.t(this.f24493a)) {
            i10 = a0.m();
            View view = new View(this.f24493a);
            view.setBackgroundColor(ae.j.L(R.id.theme_color_filling));
            o8(view, R.id.theme_color_filling);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin += i10;
            dVar.setLayoutParams(layoutParams);
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams2.bottomMargin += i10;
                frameLayout.setLayoutParams(layoutParams2);
            }
            if (d3Var != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d3Var.getLayoutParams();
                layoutParams3.bottomMargin += i10;
                d3Var.setLayoutParams(layoutParams3);
            }
            view.setLayoutParams(FrameLayoutFix.r1(-1, i10, 80));
            FrameLayout.LayoutParams r14 = FrameLayoutFix.r1(-1, a0.i(1.0f), 80);
            r14.bottomMargin = i10;
            d3 e11 = d3.e(this.f24493a, r14, true);
            e11.a();
            t8(e11);
            frameLayoutFix.addView(e11);
            frameLayoutFix.addView(view);
            j2Var = j2Var2;
            j2Var.setNeedFullScreen(true);
        } else {
            j2Var = j2Var2;
            i10 = 0;
        }
        int v10 = e2Var.f24134a.v(-1) + (frameLayout != null ? a0.i(56.0f) : 0) + i10;
        int min = Math.min(a0.f(), v10);
        if (v10 <= a0.e() || s22 == -1) {
            i11 = 2;
        } else {
            i11 = 2;
            ((LinearLayoutManager) dVar.getLayoutManager()).z2(s22, ((a0.e() - a0.i(56.0f)) / 2) - (ap.W(((ra) arrayList2.get(s22)).A()) / 2));
        }
        j2Var.i2(this);
        j2Var.P2(frameLayoutFix, Math.min((a0.f() / i11) + a0.i(56.0f), min));
        return e2Var;
    }

    public final u n8(Object obj, int i10) {
        u l10 = Ba().l(obj, 2);
        if (l10 == null) {
            return z8(obj, i10);
        }
        l10.h(i10);
        return l10;
    }

    public final void n9() {
        Runnable runnable = this.X;
        if (runnable != null) {
            runnable.run();
            this.X = null;
        }
        ArrayList<Runnable> arrayList = this.Z;
        if (arrayList != null) {
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.Z.clear();
        }
    }

    public final int na() {
        return ae.j.L(oa());
    }

    public View nc(Context context) {
        throw new RuntimeException("Stub!");
    }

    public final void nd(kb.c cVar) {
        ArrayList<kb.c> arrayList;
        if (cVar != null && (arrayList = this.f24505j0) != null) {
            arrayList.remove(cVar);
        }
    }

    public final void ne(int i10, ra[] raVarArr, r rVar) {
        me(new f2(i10).p(raVarArr).j(rVar));
    }

    @Override
    public void o1(m1.f fVar) {
        kc();
    }

    public void o6() {
        q1 q1Var;
        View view = this.P;
        if (view != null && view.isEnabled() && Xa() && (this.f24497c & Log.TAG_COMPRESS) == 0 && (q1Var = this.T) != null && !q1Var.S()) {
            int i10 = this.f24497c;
            if (!((32768 & i10) == 0 && (i10 & Log.TAG_CONTACT) == 0) && !this.f24493a.z1() && !this.f24493a.B1()) {
                this.f24497c |= Log.TAG_COMPRESS;
                j0.u0(this.P);
            } else {
                x.c(this.P);
            }
        }
        this.f24497c &= -4097;
    }

    public final void o8(View view, int i10) {
        v8(new u(1, i10, view));
    }

    public int oa() {
        return Je() ? R.id.theme_color_text : Q9();
    }

    public abstract View oc(Context context);

    public final void od(l lVar) {
        List<l> list = this.f24504i0;
        if (list != null) {
            list.remove(lVar);
        }
    }

    public final void oe(int i10, ra[] raVarArr, r rVar, boolean z10) {
        me(new f2(i10).p(raVarArr).j(rVar).c(z10));
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return false;
    }

    public final void p8(View view) {
        v8(new u(1, R.id.theme_color_filling, view));
    }

    public final v4<?> p9(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().i(i10);
        }
        return null;
    }

    public long pa() {
        return 200L;
    }

    public void pc() {
        String ma2 = ma();
        if (ma2 == null) {
            ma2 = "";
        }
        U8(ma2, true);
    }

    public final v4<?> pd(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().v(i10);
        }
        return null;
    }

    public final void pe(CharSequence charSequence, String str, final Runnable runnable) {
        ee(charSequence, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{str, w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Ob;
                Ob = v4.this.Ob(runnable, view, i10);
                return Ob;
            }
        });
    }

    public void q0(int i10) {
    }

    public final u q8(Object obj, int i10) {
        u uVar = new u(6, i10, obj);
        v8(uVar);
        return uVar;
    }

    public float qa() {
        return this.W;
    }

    public void qc() {
    }

    public final void qd(Object obj) {
        v vVar = this.U;
        if (vVar != null) {
            vVar.o(obj);
        }
    }

    public final void qe(Runnable runnable) {
        pe(null, w.i1(R.string.DiscardChanges), runnable);
    }

    public final void r8(Object obj, int i10) {
        v8(new u(4, i10, obj));
    }

    public boolean r9() {
        return false;
    }

    public Interpolator ra() {
        return db.b.f7287b;
    }

    public void rc() {
    }

    public final void rd() {
        this.X = null;
    }

    public final j2 re(CharSequence charSequence, final kb.i iVar) {
        return ee(charSequence, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{w.i1(R.string.TdlibLogsWarningConfirm), w.i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_warning_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean Pb;
                Pb = v4.Pb(kb.i.this, view, i10);
                return Pb;
            }
        });
    }

    public final u s8(Object obj, int i10) {
        return v8(new u(3, i10, obj));
    }

    public boolean s9() {
        if (!this.f24508m0) {
            return false;
        }
        this.f24508m0 = false;
        return true;
    }

    public int sa() {
        return B9();
    }

    public void sc() {
        this.f24497c = (this.f24497c | Log.TAG_LUX) & (-8388609);
        View view = this.P;
        if (view != null && view.isEnabled()) {
            int i10 = this.f24497c;
            if ((i10 & Log.TAG_COMPRESS) == 0) {
                if ((32768 & i10) != 0) {
                    this.f24497c = i10 | Log.TAG_COMPRESS;
                    x.f(this.P);
                    j0.u0(this.P);
                }
                ye();
                tc();
                fc(true);
                this.f24493a.V(this);
            }
        }
        get().requestFocus();
        ye();
        tc();
        fc(true);
        this.f24493a.V(this);
    }

    public boolean sd(Bundle bundle, String str) {
        return false;
    }

    public final v4<?> se(int i10) {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.M().j(i10);
        }
        return null;
    }

    @Override
    public final org.thunderdog.challegram.a t() {
        return this.f24493a;
    }

    public final void t8(View view) {
        v8(new u(0, 0, view));
    }

    public final void t9() {
        this.f24508m0 = true;
    }

    public final int ta() {
        return ae.j.L(ua());
    }

    public void tc() {
    }

    public final void td(Runnable runnable) {
        gd.l.a().b(runnable);
    }

    public final int te() {
        q1 q1Var = this.T;
        if (q1Var != null) {
            return q1Var.N();
        }
        return 0;
    }

    public final void u8(Object obj, int i10) {
        v8(new u(9, i10, obj));
    }

    public final HeaderEditText u9(d1 d1Var) {
        return Je() ? d1Var.C2(this) : d1Var.F2(Le(), this);
    }

    public int ua() {
        return R.id.theme_color_headerLightBackground;
    }

    public void uc(boolean z10) {
    }

    public final void ud(Runnable runnable) {
        j0.d0(runnable);
    }

    public void ue(ValueAnimator valueAnimator, int i10, boolean z10) {
        valueAnimator.start();
    }

    public final u v8(u uVar) {
        if (uVar != null && !uVar.d()) {
            Ba().a(uVar);
        }
        return uVar;
    }

    public final View get() {
        if (this.O == null) {
            View oc2 = oc(t());
            this.O = oc2;
            oc2.setTag(this);
            o6 o6Var = this.f24495b;
            if (o6Var != null) {
                o6Var.I6();
            }
            ve();
        }
        return this.O;
    }

    public final int va() {
        return ae.j.L(wa());
    }

    public void vc() {
        this.f24497c |= 134217728;
    }

    public final void vd(Runnable runnable, long j10) {
        j0.e0(runnable, j10);
    }

    public final void ve() {
        z.u().e(this);
        w.h(this);
        this.f24493a.Q(this);
    }

    @Override
    public void w4(m1.f fVar) {
        lc();
        Z8();
    }

    public final void w8(Paint paint, int i10) {
        v8(new u(5, i10, paint));
    }

    public final T w9() {
        return this.N;
    }

    public int wa() {
        return R.id.theme_color_headerLightIcon;
    }

    public boolean wc(boolean z10) {
        View view;
        j2 Q0 = this.f24493a.Q0();
        if (!z10) {
            int i10 = this.f24497c;
            if ((131072 & i10) == 0) {
                return false;
            }
            this.f24497c = (-131073) & i10;
        } else if ((this.f24497c & Log.TAG_CONTACT) != 0) {
            return false;
        } else {
            if (Q0 != null) {
                Q0.n0();
            }
            this.f24497c = 131072 | this.f24497c;
        }
        if (Q0 != null) {
            Q0.j(z10);
        }
        if (z10 || (view = this.P) == null || !(view instanceof v1)) {
            return true;
        }
        boolean isFocusable = view.isFocusable();
        boolean isFocusableInTouchMode = this.P.isFocusableInTouchMode();
        this.P.setFocusable(false);
        this.P.setFocusableInTouchMode(false);
        this.P.clearFocus();
        this.f24493a.I2();
        this.P.setFocusable(isFocusable);
        this.P.setFocusableInTouchMode(isFocusableInTouchMode);
        return true;
    }

    public final void wd(Runnable runnable) {
        xd(runnable, null);
    }

    public boolean we() {
        return (this.f24497c & Log.TAG_PAINT) == 0;
    }

    public final void x8(Object obj, int i10) {
        v8(new u(7, i10, obj));
    }

    public final T x9() {
        T t10 = this.N;
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(toString() + " (" + getClass().getSimpleName() + ") arguments are null");
    }

    public int xa() {
        return 0;
    }

    public void xc() {
    }

    public final void xd(final Runnable runnable, final kb.f fVar) {
        if (runnable != null) {
            ud(new Runnable() {
                @Override
                public final void run() {
                    v4.this.xb(fVar, runnable);
                }
            });
        }
    }

    public final int xe() {
        o6 o6Var = this.f24495b;
        if (o6Var != null) {
            return o6Var.A6();
        }
        return -1;
    }

    public final void y8(Object obj) {
        v8(new u(2, R.id.theme_color_text, obj));
    }

    public long y9(boolean z10) {
        return z10 ? 2000L : 500L;
    }

    public int ya() {
        return R.id.theme_color_headerLightText;
    }

    public void yc() {
    }

    public boolean yd(Bundle bundle, String str) {
        return false;
    }

    public final void ye() {
        he.d.w().T(false);
    }

    public final u z8(Object obj, int i10) {
        u uVar = new u(2, i10, obj);
        v8(uVar);
        return uVar;
    }

    public final boolean z9() {
        return (this.f24497c & 67108864) != 0;
    }

    public long za(boolean z10) {
        return 0L;
    }

    public void zc() {
        La();
    }

    public final void zd(Runnable runnable, long j10) {
        this.X = runnable;
        if (j10 >= 0) {
            this.f24495b.hd().postDelayed(runnable, j10);
        }
    }

    public final void ze() {
        z.u().U(this);
        w.F2(this);
        this.f24493a.s2(this);
    }
}
