package td;

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
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import be.C1399s0;
import be.C1405v;
import be.C1408x;
import be.C1410y;
import de.View$OnClickListenerC4045k;
import gd.C4779t2;
import ge.C4862d;
import ge.C4868i;
import ge.C4896n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.C6847b2;
import me.C6862d3;
import me.C6879f3;
import me.C6924j2;
import me.C6957m1;
import me.C7025s3;
import me.C7043v1;
import me.View$OnClickListenerC6999q1;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.HeaderEditText;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.C2139ap;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p038ce.View$OnClickListenerC3209vr;
import p067ed.C4183a;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5067f;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p111he.C5136p0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5911c;
import p139jb.AbstractC5913e;
import p139jb.AbstractC5914f;
import p139jb.AbstractC5916h;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p139jb.AbstractC5920l;
import p143k0.C6038h;
import p154kb.C6227d;
import p193nb.C7316a;
import p193nb.C7321e;
import p335xd.C10189d;
import p335xd.C10192g;
import p350yd.AbstractC10664f9;
import p350yd.C10534a9;
import p350yd.C10930q6;
import p350yd.C11131y6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11526l;
import p364zd.AbstractC11531p;
import p364zd.C11510b;
import p364zd.C11524j;
import p364zd.C11525k;
import p364zd.C11532q;
import p364zd.C11536u;
import p364zd.C11537v;
import p364zd.C11541z;
import td.AbstractC9323v4;
import td.C9180e2;
import td.C9188f2;

public abstract class AbstractC9323v4<T> implements AbstractC5913e<View>, AbstractC11526l, C4403w.AbstractC4404a, C6957m1.AbstractC6968k, AbstractView$OnTouchListenerC7889a.AbstractC7897h, AbstractView$OnTouchListenerC7889a.AbstractC7898i, AbstractC10664f9, AbstractC5911c {
    public CharSequence f30151M;
    public T f30152N;
    public View f30153O;
    public View f30154P;
    public AbstractC9323v4<?> f30155Q;
    public View$OnClickListenerC9170d1 f30156R;
    public C9290s0 f30157S;
    public C9270q1 f30158T;
    public C11537v f30159U;
    public View f30160V;
    public float f30161W;
    public Runnable f30162X;
    public ArrayList<Runnable> f30163Y;
    public ArrayList<Runnable> f30164Z;
    public final AbstractView$OnTouchListenerC7889a f30165a;
    public C9279r f30166a0;
    public final C10930q6 f30167b;
    public HeaderEditText f30168b0;
    public int f30169c;
    public String f30170c0 = "";
    public float f30171d0;
    public float f30172e0;
    public boolean f30173f0;
    public C6227d<AbstractC9333j> f30174g0;
    public List<C9186f1> f30175h0;
    public List<AbstractC9335l> f30176i0;
    public ArrayList<AbstractC5911c> f30177j0;
    public C6957m1 f30178k0;
    public View f30179l0;
    public boolean f30180m0;

    public class C9324a implements TextWatcher {
        public C9324a() {
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (AbstractC9323v4.this.m9382Na()) {
                String charSequence2 = charSequence.toString();
                AbstractC9323v4.this.m9475Ae(charSequence2.length() > 0, true);
                if (!AbstractC9323v4.this.f30170c0.equals(charSequence2)) {
                    AbstractC9323v4.this.f30170c0 = charSequence2;
                    AbstractC9323v4.this.mo420Cc(charSequence2);
                }
            }
        }
    }

    public class C9325b implements TextWatcher {
        public final View$OnFocusChangeListenerC7069y1 f30182a;

        public C9325b(View$OnFocusChangeListenerC7069y1 y1Var) {
            this.f30182a = y1Var;
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f30182a.setInErrorState(false);
        }
    }

    public class C9326c extends LinearLayout {
        public boolean f30184a;
        public final View$OnFocusChangeListenerC7069y1 f30185b;

        public C9326c(Context context, View$OnFocusChangeListenerC7069y1 y1Var) {
            super(context);
            this.f30185b = y1Var;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f30184a && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
                this.f30184a = false;
                C1408x.m37085f(this.f30185b.getEditText());
            }
        }
    }

    public class C9327d extends RecyclerView {
        public int f30187u1;
        public final C9180e2 f30188v1;

        public C9327d(Context context, C9180e2 e2Var) {
            super(context);
            this.f30188v1 = e2Var;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int i3 = this.f30187u1;
            if (i3 == 0 || i3 == measuredHeight) {
                this.f30187u1 = measuredHeight;
                return;
            }
            this.f30187u1 = measuredHeight;
            post(new Runnable() {
                @Override
                public final void run() {
                    AbstractC9323v4.C9327d.this.m39504A0();
                }
            });
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            C2546iq iqVar;
            int X1;
            View C;
            if (motionEvent.getAction() != 0 || (iqVar = this.f30188v1.f29637a) == null || iqVar.mo6153D() <= 0 || (X1 = ((LinearLayoutManager) getLayoutManager()).m39549X1()) != 0 || (C = getLayoutManager().mo39262C(X1)) == null || motionEvent.getY() >= C.getTop()) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    public class C9328e extends RecyclerView.AbstractC0901o {
        public C9328e() {
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            rect.top = recyclerView.m39421k0(view) == 0 ? (C1357a0.m37544f() / 2) + C1357a0.m37541i(12.0f) : 0;
        }
    }

    public class C9329f extends C2546iq {
        public final C9188f2 f30191m0;

        public C9329f(AbstractC10664f9 f9Var, View.OnClickListener onClickListener, AbstractC9323v4 v4Var, C9188f2 f2Var) {
            super(f9Var, onClickListener, v4Var);
            this.f30191m0 = f2Var;
        }

        @Override
        public void mo394V2(p038ce.C2964ra r3, tc.C9137c r4, boolean r5) {
            throw new UnsupportedOperationException("Method not decompiled: td.AbstractC9323v4.C9329f.mo394V2(ce.ra, tc.c, boolean):void");
        }

        @Override
        public void mo9112n2(C2964ra raVar, C9256o0 o0Var, C7025s3 s3Var, boolean z) {
            C9188f2.AbstractC9189a aVar = this.f30191m0.f29675x;
            if (aVar != null) {
                aVar.mo9987a(raVar, o0Var, s3Var, z);
            }
        }
    }

    public class C9330g extends FrameLayoutFix {
        public C9330g(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return true;
        }
    }

    public class C9331h extends Drawable {
        public final AbstractC11531p f30194a;

        public C9331h(AbstractC11531p pVar) {
            this.f30194a = pVar;
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height() / 2;
            int itemHeight = View$OnClickListenerC6999q1.getItemHeight() / 2;
            float f = height - itemHeight;
            float f2 = width;
            AbstractC11531p pVar = this.f30194a;
            canvas.drawLine(0.0f, f, f2, f, C1410y.m37075E0(pVar != null ? pVar.mo92e(R.id.theme_color_separator) : C11524j.m223P0()));
            float f3 = height + itemHeight;
            AbstractC11531p pVar2 = this.f30194a;
            canvas.drawLine(0.0f, f3, f2, f3, C1410y.m37075E0(pVar2 != null ? pVar2.mo92e(R.id.theme_color_separator) : C11524j.m223P0()));
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class C9332i implements AbstractC9335l {
        public final Runnable f30196a;

        public C9332i(Runnable runnable) {
            this.f30196a = runnable;
        }

        @Override
        public void mo3383a(AbstractC9323v4<?> v4Var, boolean z) {
            if (z) {
                this.f30196a.run();
                AbstractC9323v4.this.m9193od(this);
            }
        }
    }

    public interface AbstractC9333j {
        void mo9111a(AbstractC9323v4<?> v4Var, C9270q1 q1Var, boolean z);
    }

    public static class C9334k {
        public View f30198a;
        public boolean f30199b;
        public boolean f30200c = true;
        public boolean f30201d = false;
        public int f30202e;
        public boolean f30203f;
        public View$OnClickListenerC4045k.AbstractC4052g f30204g;
        public View$OnClickListenerC4045k.AbstractC4051f f30205h;
        public int f30206i;
        public boolean f30207j;

        public C9334k m9110a(boolean z) {
            this.f30200c = z;
            return this;
        }

        public C9334k m9109b(View view) {
            this.f30198a = view;
            return this;
        }

        public C9334k m9108c(boolean z) {
            this.f30203f = z;
            return this;
        }

        public C9334k m9107d(int i) {
            this.f30202e = i;
            return this;
        }

        public C9334k m9106e(boolean z) {
            this.f30199b = z;
            return this;
        }

        public C9334k m9105f(boolean z) {
            this.f30201d = z;
            return this;
        }

        public C9334k m9104g(View$OnClickListenerC4045k.AbstractC4051f fVar) {
            this.f30205h = fVar;
            return this;
        }

        public C9334k m9103h(boolean z) {
            this.f30207j = z;
            return this;
        }

        public C9334k m9102i(int i) {
            this.f30206i = i;
            return this;
        }

        public C9334k m9101j(View$OnClickListenerC4045k.AbstractC4052g gVar) {
            this.f30204g = gVar;
            return this;
        }
    }

    public interface AbstractC9335l {
        void mo3383a(AbstractC9323v4<?> v4Var, boolean z);
    }

    public interface AbstractC9336m {
        boolean mo4197a(View$OnFocusChangeListenerC7069y1 y1Var, String str);
    }

    public interface AbstractC9337n {
        void mo3907a(View view, int i, C2964ra raVar, TextView textView, C2546iq iqVar);
    }

    public static class C9338o {
        public final int f30208a;
        public final CharSequence f30209b;
        public final int f30210c;
        public final int f30211d;

        public static class C9339a {
            public CharSequence f30213b;
            public int f30215d;
            public int f30214c = 1;
            public int f30212a = this.f30212a;
            public int f30212a = this.f30212a;

            public C9338o m9100a() {
                return new C9338o(this.f30212a, this.f30213b, this.f30214c, this.f30215d);
            }

            public C9339a m9099b(int i) {
                this.f30214c = i;
                return this;
            }

            public C9339a m9098c(int i) {
                this.f30215d = i;
                return this;
            }

            public C9339a m9097d(int i) {
                this.f30212a = i;
                return this;
            }

            public C9339a m9096e(int i) {
                return m9095f(C4403w.m27869i1(i));
            }

            public C9339a m9095f(CharSequence charSequence) {
                this.f30213b = charSequence;
                return this;
            }
        }

        public C9338o(int i, CharSequence charSequence, int i2, int i3) {
            this.f30208a = i;
            this.f30209b = charSequence;
            this.f30210c = i2;
            this.f30211d = i3;
        }
    }

    public static class C9340p {
        public final CharSequence f30216a;
        public final C9338o[] f30217b;

        public static class C9341a {
            public CharSequence f30218a;
            public List<C9338o> f30219b = new ArrayList();

            public C9340p m9094a() {
                return new C9340p(this.f30218a, (C9338o[]) this.f30219b.toArray(new C9338o[0]));
            }

            public C9341a m9093b() {
                return m9091d(new C9338o.C9339a().m9097d(R.id.btn_cancel).m9096e(R.string.Cancel).m9098c(R.drawable.baseline_cancel_24).m9100a());
            }

            public C9341a m9092c(CharSequence charSequence) {
                this.f30218a = charSequence;
                return this;
            }

            public C9341a m9091d(C9338o oVar) {
                if (oVar != null) {
                    this.f30219b.add(oVar);
                }
                return this;
            }
        }

        public C9340p(CharSequence charSequence, C9338o[] oVarArr) {
            this.f30216a = charSequence;
            this.f30217b = oVarArr;
        }
    }

    public interface AbstractC9342q {
        int mo9090a(C6924j2 j2Var, C9319v1 v1Var);
    }

    public interface AbstractC9343r {
        void mo1773l6(int i, SparseIntArray sparseIntArray);
    }

    public interface AbstractC9344s {
        void mo9089K2(int i, C6038h<String> hVar);
    }

    public AbstractC9323v4(Context context, C10930q6 q6Var) {
        AbstractView$OnTouchListenerC7889a r = C1379j0.m37307r(context);
        this.f30165a = r;
        this.f30167b = q6Var;
        if (r == null) {
            throw new IllegalArgumentException();
        }
    }

    public boolean m9478Ab(String str, int[] iArr, AbstractC5914f fVar, HandlerC10770jj.C10788q qVar, View view, int i) {
        if (i == R.id.btn_copyLink) {
            C1379j0.m37325i(str, R.string.CopiedLink);
        } else if (i != R.id.btn_openLink) {
            if (i == R.id.btn_shareLink && iArr[0] == 0) {
                iArr[0] = 1;
                C4779t2.m25490j5(new C10534a9(this.f30165a, this.f30167b), str);
            }
        } else if (fVar == null || !fVar.get()) {
            this.f30167b.m2485dd().m3858E7(this, str, qVar);
        }
        return true;
    }

    public static void m9470Bb(int i, int i2, int i3, TextView textView, long j) {
        String str;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (C5067f.m24107m(j, timeUnit)) {
            str = C4403w.m27865j1(i, C4403w.m27932T2(j, timeUnit));
        } else {
            str = C5067f.m24106n(j, timeUnit) ? C4403w.m27865j1(i2, C4403w.m27932T2(j, timeUnit)) : C4403w.m27865j1(i3, C4403w.m27846o0(j, timeUnit), C4403w.m27932T2(j, timeUnit));
        }
        C1399s0.m37175j0(textView, str.toUpperCase());
    }

    public static long m9462Cb(View$OnClickListenerC6999q1 q1Var, AtomicReference atomicReference, AtomicReference atomicReference2, Calendar calendar) {
        C5136p0 p0Var = (C5136p0) q1Var.getCurrentItem();
        C5136p0 p0Var2 = (C5136p0) ((View$OnClickListenerC6999q1) atomicReference.get()).getCurrentItem();
        C5136p0 p0Var3 = (C5136p0) ((View$OnClickListenerC6999q1) atomicReference2.get()).getCurrentItem();
        if (p0Var == null || p0Var2 == null || p0Var3 == null) {
            return 0L;
        }
        int b = (int) p0Var.m23837b();
        int a = (int) p0Var2.m23838a();
        calendar.set(1, (int) p0Var.m23838a());
        calendar.set(6, b);
        calendar.set(11, a);
        calendar.set(12, (int) p0Var3.m23838a());
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static void m9455Db(AbstractC5920l lVar, AbstractC5916h hVar, View$OnClickListenerC6999q1 q1Var, int i) {
        lVar.mo3050a(hVar.get());
    }

    public int m9448Eb(Calendar calendar, ArrayList arrayList, View$OnClickListenerC6999q1 q1Var, int i) {
        calendar.setTimeInMillis(this.f30167b.m2898D4());
        calendar.add(12, 1);
        int i2 = calendar.get(1);
        int i3 = calendar.get(6);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (((C5136p0) arrayList.get(i4)).m23838a() == i2 && ((C5136p0) arrayList.get(i4)).m23837b() == i3) {
                return Math.max(i4, i);
            }
        }
        return i;
    }

    public void m9440Fb(AbstractC5916h hVar, Calendar calendar, AtomicReference atomicReference, AtomicReference atomicReference2, View$OnClickListenerC6999q1.AbstractC7004e eVar, View$OnClickListenerC6999q1 q1Var, int i) {
        if (hVar.get() < this.f30167b.m2898D4()) {
            calendar.setTimeInMillis(this.f30167b.m2898D4());
            calendar.add(12, 1);
            int i2 = calendar.get(11);
            int i3 = calendar.get(12);
            ((View$OnClickListenerC6999q1) atomicReference.get()).setCurrentItem(i2);
            ((View$OnClickListenerC6999q1) atomicReference2.get()).setCurrentItem(i3);
        }
        eVar.mo9972a(q1Var, i);
    }

    public int m9434Gb(View$OnClickListenerC6999q1 q1Var, Calendar calendar, View$OnClickListenerC6999q1 q1Var2, int i) {
        if (q1Var.getCurrentIndex() != q1Var.getMinMaxProvider().mo9875a(q1Var2, 0)) {
            return i;
        }
        calendar.setTimeInMillis(this.f30167b.m2898D4());
        calendar.add(12, 1);
        return Math.max(i, calendar.get(11));
    }

    public int m9426Hb(View$OnClickListenerC6999q1 q1Var, View$OnClickListenerC6999q1 q1Var2, Calendar calendar, View$OnClickListenerC6999q1 q1Var3, int i) {
        int a = q1Var.getMinMaxProvider().mo9875a(q1Var3, 0);
        int a2 = q1Var2.getMinMaxProvider().mo9875a(q1Var3, 0);
        if (q1Var.getCurrentIndex() != a || q1Var2.getCurrentIndex() != a2) {
            return i;
        }
        calendar.setTimeInMillis(this.f30167b.m2898D4());
        calendar.add(12, 1);
        return Math.max(i, calendar.get(12));
    }

    public void m9419Ib(AbstractC5916h hVar, AbstractC5920l lVar, C6924j2 j2Var, View view) {
        long j = hVar.get();
        if (this.f30167b.m2898D4() < j) {
            lVar.mo3050a(j);
            j2Var.m18408y2(true);
        }
    }

    public int m9412Jb(AbstractC11531p pVar, final int i, final int i2, final int i3, final AbstractC5920l lVar, final C6924j2 j2Var, C9319v1 v1Var) {
        String o0;
        int itemHeight = View$OnClickListenerC6999q1.getItemHeight() * 5;
        LinearLayout linearLayout = new LinearLayout(this.f30165a);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, itemHeight));
        C2065g.m35718d(linearLayout, new C9331h(pVar));
        if (pVar == null) {
            m9163t8(linearLayout);
        }
        long D4 = this.f30167b.m2898D4();
        final Calendar a = C5067f.m24119a(D4);
        int i4 = a.get(6);
        a.set(13, 0);
        a.set(14, 0);
        a.add(12, 2);
        int i5 = a.get(6) != i4 ? 1 : 0;
        int i6 = a.get(11);
        int i7 = a.get(12);
        final TextView textView = new TextView(this.f30165a);
        final AbstractC5920l f4Var = new AbstractC5920l() {
            @Override
            public final void mo3050a(long j) {
                AbstractC9323v4.m9470Bb(i, i2, i3, textView, j);
            }
        };
        final ArrayList<T> arrayList = new ArrayList<>(366);
        for (int i8 = 366; i5 < i8; i8 = 366) {
            a.setTimeInMillis(D4);
            a.add(5, i5);
            D4 = D4;
            long f = C5067f.m24114f(a);
            if (i5 == 0) {
                o0 = C4403w.m27869i1(R.string.Today);
            } else if (i5 == 1) {
                o0 = C4403w.m27869i1(R.string.Tomorrow);
            } else {
                o0 = C4403w.m27846o0(f, TimeUnit.MILLISECONDS);
            }
            textView = textView;
            itemHeight = itemHeight;
            arrayList.add(new C5136p0(0, o0).m23835d(a.get(1), a.get(6)));
            i5++;
        }
        TextView textView2 = textView;
        int i9 = itemHeight;
        final View$OnClickListenerC6999q1 q1Var = new View$OnClickListenerC6999q1(mo4347s(), false);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final AbstractC5916h c4Var = new AbstractC5916h() {
            @Override
            public final long get() {
                long Cb;
                Cb = AbstractC9323v4.m9462Cb(View$OnClickListenerC6999q1.this, atomicReference, atomicReference2, a);
                return Cb;
            }
        };
        final View$OnClickListenerC6999q1.AbstractC7004e<T> g4Var = new View$OnClickListenerC6999q1.AbstractC7004e() {
            @Override
            public final void mo9972a(View$OnClickListenerC6999q1 q1Var2, int i10) {
                AbstractC9323v4.m9455Db(AbstractC5920l.this, c4Var, q1Var2, i10);
            }
        };
        q1Var.setNeedSeparators(false);
        q1Var.setMinMaxProvider(new View$OnClickListenerC6999q1.AbstractC7007h() {
            @Override
            public final int mo9875a(View$OnClickListenerC6999q1 q1Var2, int i10) {
                int Eb;
                Eb = AbstractC9323v4.this.m9448Eb(a, arrayList, q1Var2, i10);
                return Eb;
            }
        });
        q1Var.setItemChangeListener(new View$OnClickListenerC6999q1.AbstractC7004e() {
            @Override
            public final void mo9972a(View$OnClickListenerC6999q1 q1Var2, int i10) {
                AbstractC9323v4.this.m9440Fb(c4Var, a, atomicReference, atomicReference2, g4Var, q1Var2, i10);
            }
        });
        q1Var.setForcedTheme(pVar);
        q1Var.m18115M1(this);
        q1Var.m18111Q1(arrayList, 0);
        q1Var.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 2.5f));
        linearLayout.addView(q1Var);
        ArrayList<T> arrayList2 = new ArrayList<>();
        for (int i10 = 0; i10 < 24; i10++) {
            a.set(11, i10);
            arrayList2.add(new C5136p0(0, C4403w.m27969K1(a.getTimeInMillis(), TimeUnit.MILLISECONDS)).m23836c(i10));
        }
        final View$OnClickListenerC6999q1 q1Var2 = new View$OnClickListenerC6999q1(mo4347s(), false);
        atomicReference.set(q1Var2);
        q1Var2.setTrimItems(false);
        q1Var2.setMinMaxProvider(new View$OnClickListenerC6999q1.AbstractC7007h() {
            @Override
            public final int mo9875a(View$OnClickListenerC6999q1 q1Var3, int i11) {
                int Gb;
                Gb = AbstractC9323v4.this.m9434Gb(q1Var, a, q1Var3, i11);
                return Gb;
            }
        });
        q1Var2.setNeedSeparators(false);
        q1Var2.setItemChangeListener(g4Var);
        q1Var2.setForcedTheme(pVar);
        q1Var2.m18115M1(this);
        q1Var2.m18111Q1(arrayList2, i6);
        q1Var2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(q1Var2);
        ArrayList<T> arrayList3 = new ArrayList<>();
        for (int i11 = 0; i11 < 60; i11++) {
            arrayList3.add(new C5136p0(0, i11 < 10 ? "0" + i11 : Integer.toString(i11)).m23836c(i11));
        }
        View$OnClickListenerC6999q1 q1Var3 = new View$OnClickListenerC6999q1(mo4347s(), false);
        atomicReference2.set(q1Var3);
        q1Var3.setNeedSeparators(false);
        q1Var3.setItemChangeListener(g4Var);
        q1Var3.setMinMaxProvider(new View$OnClickListenerC6999q1.AbstractC7007h() {
            @Override
            public final int mo9875a(View$OnClickListenerC6999q1 q1Var4, int i12) {
                int Hb;
                Hb = AbstractC9323v4.this.m9426Hb(q1Var, q1Var2, a, q1Var4, i12);
                return Hb;
            }
        });
        q1Var3.setForcedTheme(pVar);
        q1Var3.setTrimItems(false);
        q1Var3.m18115M1(this);
        q1Var3.m18111Q1(arrayList3, i7);
        q1Var3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        linearLayout.addView(q1Var3);
        View view = new View(this.f30165a);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 0.5f));
        linearLayout.addView(view);
        v1Var.addView(linearLayout);
        int i12 = 0 + i9;
        C1399s0.m37193a0(textView2);
        textView2.setGravity(17);
        textView2.setTextSize(1, 16.0f);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37541i(56.0f)));
        C10192g.m5782i(textView2, R.id.theme_color_fillingPositive, pVar != null ? null : this).m16759f(pVar);
        if (pVar != null) {
            textView2.setTextColor(pVar.mo92e(R.id.theme_color_fillingPositiveContent));
        } else {
            textView2.setTextColor(C11524j.m228N(R.id.theme_color_fillingPositiveContent));
            m9119z8(textView2, R.id.theme_color_fillingPositiveContent);
        }
        int i13 = i12 + C1357a0.m37541i(56.0f);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                AbstractC9323v4.this.m9419Ib(c4Var, lVar, j2Var, view2);
            }
        });
        g4Var.mo9972a(null, -1);
        v1Var.addView(textView2);
        return i13;
    }

    public static void m9404Kb(AbstractC5117h0 h0Var, C6924j2 j2Var, View view) {
        if (h0Var.mo493A3(view, view.getId())) {
            j2Var.m18408y2(true);
        }
    }

    public void m9396Lb(C6924j2 j2Var, View view) {
        AbstractC9323v4<?> F = this.f30165a.m14552P1().m9763F();
        if ((F instanceof AbstractC5117h0) && ((AbstractC5117h0) F).mo493A3(view, view.getId())) {
            j2Var.m18408y2(true);
        }
    }

    public int m9389Mb(RecyclerView recyclerView, FrameLayoutFix frameLayoutFix, C9180e2 e2Var) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager.m39549X1() == 0) {
            int i = 0;
            View C = linearLayoutManager.mo39262C(0);
            if (C != null) {
                int f = C1357a0.m37544f();
                int min = Math.min(frameLayoutFix.getMeasuredHeight() - C.getTop(), e2Var.f29637a.mo11421v(-1)) + C1357a0.m37541i(56.0f);
                if (C1357a0.m37530t(this.f30165a)) {
                    i = C1357a0.m37537m();
                }
                return Math.min(f, min + i);
            }
        }
        return C1357a0.m37544f();
    }

    public static void m9381Nb(C9188f2 f2Var, C9180e2 e2Var, C6924j2 j2Var, View view) {
        AbstractC9344s sVar;
        AbstractC9337n nVar;
        int id2 = view.getId();
        if (id2 == R.id.btn_cancel) {
            C9180e2.AbstractC9181a aVar = f2Var.f29670s;
            if (aVar == null || !aVar.mo10016a(e2Var, view, true)) {
                j2Var.m18408y2(true);
            }
        } else if (id2 != R.id.btn_save) {
            Object tag = view.getTag();
            if (!f2Var.f29672u) {
                e2Var.f29637a.m34223N1(view);
            }
            if (tag != null && (tag instanceof C2964ra) && (nVar = f2Var.f29657f) != null) {
                nVar.mo3907a(view, f2Var.f29652a, (C2964ra) tag, e2Var.f29639c, e2Var.f29637a);
            }
        } else {
            C9180e2.AbstractC9181a aVar2 = f2Var.f29670s;
            if (aVar2 == null || !aVar2.mo10016a(e2Var, view, false)) {
                int B0 = e2Var.f29637a.m34249B0();
                if (B0 == -1 || B0 == 0) {
                    AbstractC9343r rVar = f2Var.f29655d;
                    if (rVar != null) {
                        rVar.mo1773l6(f2Var.f29652a, e2Var.f29637a.m34252A0());
                    }
                } else if (B0 == 1 && (sVar = f2Var.f29656e) != null) {
                    sVar.mo9089K2(f2Var.f29652a, e2Var.f29637a.m34247C0());
                }
                j2Var.m18408y2(true);
            }
        }
    }

    public boolean m9373Ob(Runnable runnable, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        if (runnable != null) {
            runnable.run();
        }
        m9298Zb();
        return true;
    }

    public static boolean m9365Pb(AbstractC5917i iVar, View view, int i) {
        iVar.mo1322a(i == R.id.btn_done);
        return true;
    }

    public static boolean m9236ib(AtomicReference atomicReference, View view, C5132o oVar) {
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

    public boolean m9229jb(C9334k kVar, View view, int i) {
        switch (i) {
            case R.id.btn_takePhoto:
                C1405v.m37106o(this.f30165a, kVar.f30199b, false);
                break;
            case R.id.btn_takeVideo:
                C1405v.m37106o(this.f30165a, kVar.f30199b, true);
                break;
        }
        return true;
    }

    public static void m9223kb(View$OnFocusChangeListenerC7069y1 y1Var, AbstractC9336m mVar, boolean z, AlertDialog alertDialog, View view) {
        if (mVar.mo4197a(y1Var, y1Var.getText().toString())) {
            if (z) {
                C1408x.m37088c(y1Var.getEditText());
            }
            alertDialog.dismiss();
            return;
        }
        y1Var.setInErrorState(true);
    }

    public static void m9217lb(AbstractC9336m mVar, View$OnFocusChangeListenerC7069y1 y1Var, String str, boolean z, AlertDialog alertDialog, View view) {
        if (mVar.mo4197a(y1Var, str)) {
            if (z) {
                C1408x.m37088c(y1Var.getEditText());
            }
            alertDialog.dismiss();
            return;
        }
        y1Var.setInErrorState(true);
    }

    public static void m9209mb(View$OnFocusChangeListenerC7069y1 y1Var, AbstractC9336m mVar, boolean z, DialogInterface dialogInterface, int i) {
        if (!mVar.mo4197a(y1Var, y1Var.getText().toString())) {
            y1Var.setInErrorState(true);
        } else if (z) {
            C1408x.m37088c(y1Var.getEditText());
        }
    }

    public static void m9202nb(boolean z, View$OnFocusChangeListenerC7069y1 y1Var, DialogInterface dialogInterface, int i) {
        if (z) {
            C1408x.m37088c(y1Var.getEditText());
        }
        dialogInterface.dismiss();
    }

    public static AbstractC9323v4<?> m9196o9(View view) {
        while (view != null) {
            Object tag = view.getTag();
            if (tag instanceof AbstractC9323v4) {
                return (AbstractC9323v4) tag;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    public static void m9194ob(AbstractC9336m mVar, View$OnFocusChangeListenerC7069y1 y1Var, String str, boolean z, DialogInterface dialogInterface, int i) {
        if (!mVar.mo4197a(y1Var, str)) {
            y1Var.setInErrorState(true);
        } else if (z) {
            C1408x.m37088c(y1Var.getEditText());
        }
    }

    public static void m9188pb(AbstractC5919k kVar, int i, SparseIntArray sparseIntArray) {
        int i2;
        switch (sparseIntArray.get(i)) {
            case R.id.btn_messageLive15Minutes:
                i2 = 900;
                break;
            case R.id.btn_messageLive1Hour:
                i2 = 3600;
                break;
            case R.id.btn_messageLive8Hours:
                i2 = 28800;
                break;
            case R.id.btn_messageLiveStop:
            default:
                return;
            case R.id.btn_messageLiveTemp:
                i2 = 60;
                break;
        }
        kVar.mo3250a(i2);
    }

    public static AbstractC9323v4<?> m9183q9(View view) {
        AbstractC9323v4<?> v4Var = null;
        while (view != null) {
            Object tag = view.getTag();
            if (tag instanceof AbstractC9323v4) {
                v4Var = (AbstractC9323v4) tag;
            }
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return v4Var;
    }

    public void m9145vb(C4868i.C4873e eVar, int i, boolean z) {
        if (z) {
            View$OnClickListenerC3209vr vrVar = new View$OnClickListenerC3209vr(this.f30165a, this.f30167b);
            vrVar.m31218ji(new View$OnClickListenerC3209vr.C3215f(2, eVar).m31194c(i));
            m9291ac(vrVar);
        }
    }

    public void m9130xb(AbstractC5914f fVar, Runnable runnable) {
        if (m9347Sa()) {
            return;
        }
        if (fVar == null || fVar.get()) {
            runnable.run();
        }
    }

    public boolean m9123yb(String str, long j, View view, int i) {
        if (i == R.id.btn_phone_call) {
            C1405v.m37141B(C4779t2.m25581W1(str));
            return true;
        } else if (i != R.id.btn_telegram_call) {
            return true;
        } else {
            this.f30167b.m2930B4().m4713c0().m4549t0(this, j, null);
            return true;
        }
    }

    public static boolean m9116zb(Runnable runnable, View view, int i) {
        if (i != R.id.btn_done) {
            return true;
        }
        runnable.run();
        return true;
    }

    public final void m9480A8(Object obj) {
        m9148v8(new C11536u(2, R.id.theme_color_textLight, obj));
    }

    public int mo408A9() {
        return 1;
    }

    @Deprecated
    public int m9479Aa() {
        return View$OnClickListenerC9170d1.m10022y2();
    }

    public void mo9477Ac() {
        C9270q1 q1Var;
        if (m9382Na() && (this.f30169c & 8388608) == 0 && mo9465C8()) {
            if (this.f30156R == null || (q1Var = this.f30158T) == null || q1Var.m9749M().m9501l() != this || this.f30156R.getCurrentTransformMode() != 2) {
                m9410Jd(0.0f, false);
                mo409xc();
                m9346Sb();
            }
        }
    }

    public void m9476Ad(T t) {
        this.f30152N = t;
    }

    public final void m9475Ae(boolean z, boolean z2) {
        View$OnClickListenerC9170d1 d1Var;
        if (mo415la() == R.id.menu_clear && (d1Var = this.f30156R) != null) {
            d1Var.m10061e4(R.id.menu_clear, R.id.menu_btn_clear, z, z2);
        }
    }

    public boolean mo9473B8() {
        return true;
    }

    public int mo9472B9() {
        return C11532q.m113b();
    }

    public final C11537v m9471Ba() {
        if (this.f30159U == null) {
            this.f30159U = new C11537v();
        }
        return this.f30159U;
    }

    public void mo9469Bc(int i, boolean z) {
    }

    public final void m9468Bd(C6957m1 m1Var) {
        this.f30178k0 = m1Var;
    }

    public void m9467Be(View view, int i, float f) {
    }

    public boolean mo9465C8() {
        return true;
    }

    public long mo9464C9() {
        return 0L;
    }

    public View m9463Ca() {
        if (this.f30179l0 == null) {
            this.f30179l0 = mo9201nc(mo4347s());
        }
        return this.f30179l0;
    }

    public void mo420Cc(String str) {
    }

    public final void m9461Cd(boolean z) {
        View$OnClickListenerC9170d1 d1Var;
        if (mo415la() == R.id.menu_clear && (d1Var = this.f30156R) != null) {
            d1Var.m10059f4(R.id.menu_clear, R.id.menu_btn_clear, z);
        }
    }

    public void mo9460Ce(int i, LinearLayout linearLayout) {
    }

    public boolean m9458D8() {
        return true;
    }

    public C9279r m9457D9(View$OnClickListenerC9170d1 d1Var) {
        if (this.f30166a0 == null) {
            C9279r E2 = View$OnClickListenerC9170d1.m10125E2(mo4347s(), m9124ya());
            this.f30166a0 = E2;
            m9163t8(E2);
        }
        return this.f30166a0;
    }

    public final float m9456Da() {
        return this.f30172e0;
    }

    public void m9454Dc(int i) {
    }

    public final void m9453Dd(boolean z) {
        if (m9332Ua() != z) {
            this.f30169c = C5063c.m24138h(this.f30169c, 33554432, z);
            m9152uc(z);
        }
    }

    public final void m9452De(boolean z) {
        if (z) {
            this.f30160V = this.f30154P;
            View F9 = m9442F9();
            this.f30154P = F9;
            if (F9 == null) {
                C1408x.m37088c(this.f30160V);
            } else {
                C1408x.m37085f(F9);
            }
        } else {
            View view = this.f30154P;
            this.f30154P = this.f30160V;
            this.f30160V = null;
            if (view != null) {
                C1408x.m37088c(view);
            }
        }
    }

    public boolean mo9450E8() {
        return true;
    }

    public int m9449E9() {
        return mo9413J9();
    }

    public int mo8870Ea() {
        return C4896n.m24478e();
    }

    public AlertDialog m9447Ec(int i, CharSequence charSequence) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(i));
        builder.setMessage(charSequence);
        builder.setPositiveButton(C4403w.m27950P0(), DialogInterface$OnClickListenerC9267p4.f29937a);
        return m9344Sd(builder);
    }

    public final void m9446Ed(View view) {
        mo9438Fd(view, true);
    }

    public void mo9445Ee(boolean z) {
        if (z) {
            this.f30160V = this.f30154P;
            HeaderEditText headerEditText = this.f30168b0;
            this.f30154P = headerEditText;
            C1408x.m37085f(headerEditText);
            return;
        }
        this.f30154P = this.f30160V;
        C1408x.m37088c(this.f30168b0);
        this.f30160V = null;
    }

    public boolean m9443F8() {
        return false;
    }

    public View m9442F9() {
        return null;
    }

    public final View m9441Fa(View$OnClickListenerC9170d1 d1Var) {
        int i = this.f30169c;
        if ((524288 & i) != 0) {
            return m9457D9(d1Var);
        }
        if ((1048576 & i) != 0) {
            return m9230ja(d1Var);
        }
        if ((i & Log.TAG_ACCOUNTS) != 0) {
            return m9420I9(d1Var);
        }
        return null;
    }

    public AlertDialog m9439Fc(int i, CharSequence charSequence, CharSequence charSequence2, DialogInterface.OnClickListener onClickListener, int i2) {
        return m9433Gc(i, charSequence, charSequence2, onClickListener, DialogInterface$OnClickListenerC9237l3.f29815a, i2);
    }

    public void mo9438Fd(View view, boolean z) {
        int i = this.f30169c;
        if ((1048576 & i) == 0 && (2097152 & i) == 0) {
            this.f30154P = view;
        } else {
            this.f30160V = view;
        }
        if (z) {
            this.f30169c = 32768 | i;
        } else {
            this.f30169c = (-32769) & i;
        }
    }

    public boolean m9437Fe() {
        return mo9386Me();
    }

    public void mo9435G8(float f) {
    }

    public View mo8869G9() {
        return null;
    }

    public View mo8868Ga() {
        return null;
    }

    public AlertDialog m9433Gc(int i, CharSequence charSequence, CharSequence charSequence2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(i));
        builder.setMessage(charSequence);
        builder.setPositiveButton(charSequence2, onClickListener);
        if ((i2 & 1) == 0) {
            builder.setNegativeButton(C4403w.m27869i1(R.string.Cancel), onClickListener2);
        }
        if ((i2 & 2) != 0) {
            builder.setCancelable(false);
        }
        return m9311Xb(m9344Sd(builder), i2);
    }

    public final void m9432Gd(int i) {
        m9424Hd(C4403w.m27869i1(i));
    }

    public boolean mo9431Ge() {
        return false;
    }

    public void mo9429H8(LinearLayout linearLayout, float f) {
    }

    public int m9428H9() {
        return C4896n.m24478e();
    }

    public final View m9427Ha() {
        return this.f30153O;
    }

    public void m9425Hc(int i, int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(i));
        builder.setMessage(C4403w.m27869i1(i2));
        builder.setPositiveButton(C4403w.m27950P0(), DialogInterface$OnClickListenerC9229k3.f29783a);
        m9344Sd(builder);
    }

    public final void m9424Hd(CharSequence charSequence) {
        this.f30151M = charSequence;
        if (this.f30156R != null && mo9269dd()) {
            this.f30156R.m10044m4(mo407R9(), charSequence);
        }
    }

    public boolean mo9423He() {
        return true;
    }

    public boolean mo9421I8(float f, float f2) {
        if (this.f30171d0 == f) {
            return false;
        }
        View Ga = mo8868Ga();
        if (Ga == null) {
            this.f30171d0 = f;
            return false;
        }
        Ga.setTranslationY(f2);
        if (mo9356Qd()) {
            if (f == 1.0f) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) Ga.getLayoutParams();
                int i = (int) f2;
                if (marginLayoutParams.bottomMargin != i) {
                    marginLayoutParams.bottomMargin = i;
                    Ga.setLayoutParams(marginLayoutParams);
                }
            } else if (this.f30171d0 == 1.0f) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) Ga.getLayoutParams();
                if (marginLayoutParams2.bottomMargin != 0) {
                    marginLayoutParams2.bottomMargin = 0;
                    Ga.setLayoutParams(marginLayoutParams2);
                }
            }
        }
        this.f30171d0 = f;
        return true;
    }

    public View m9420I9(View$OnClickListenerC9170d1 d1Var) {
        return null;
    }

    public void mo8867Ia() {
        HeaderEditText headerEditText = this.f30168b0;
        if (headerEditText != null) {
            View$OnClickListenerC9170d1.m10070a4(headerEditText, C1357a0.m37541i(68.0f), C1357a0.m37541i(49.0f));
        }
        C9279r rVar = this.f30166a0;
        if (rVar != null) {
            View$OnClickListenerC9170d1.m10067b4(rVar, C1357a0.m37541i(68.0f), 0);
        }
        View G9 = mo8869G9();
        if (G9 instanceof AbstractC9165c2) {
            ((AbstractC9165c2) G9).mo8255s();
        }
    }

    public void m9418Ic(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        m9411Jc(i, i2, C4403w.m27950P0(), onClickListener);
    }

    public void mo9417Id(AbstractC9323v4<?> v4Var) {
        this.f30155Q = v4Var;
    }

    public boolean mo9416Ie() {
        return true;
    }

    public void mo137J4(int i, int i2, float f, boolean z) {
        C11525k.m138c(this, i, i2, f, z);
    }

    public void mo9414J8(float f, boolean z) {
    }

    public int mo9413J9() {
        return 0;
    }

    public void mo8866Ja(int i, int i2) {
    }

    public void m9411Jc(int i, int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        m9439Fc(i, C4403w.m27869i1(i2), charSequence, onClickListener, 0);
    }

    public final void m9410Jd(float f, boolean z) {
        if (this.f30161W != f) {
            this.f30161W = f;
            mo9414J8(f, z);
        }
    }

    public boolean mo9409Je() {
        return false;
    }

    public void mo9407K8(float f) {
    }

    public final int m9406K9() {
        return C11524j.m228N(mo9398L9());
    }

    public boolean m9405Ka() {
        return (this.f30169c & 134217728) != 0;
    }

    public void m9403Kc(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(i));
        builder.setMessage(charSequence);
        builder.setPositiveButton(C4403w.m27950P0(), onClickListener);
        if (z) {
            builder.setNegativeButton(C4403w.m27869i1(R.string.Cancel), DialogInterface$OnClickListenerC9278q4.f29991a);
        } else {
            builder.setCancelable(false);
        }
        m9344Sd(builder);
    }

    public final void m9402Kd(int i) {
        C9279r rVar = this.f30166a0;
        if (rVar != null && rVar.m9679E(i)) {
            m9454Dc(i);
        }
    }

    public boolean mo9401Ke() {
        return true;
    }

    public void mo9399L8() {
    }

    public int mo9398L9() {
        return R.id.theme_color_headerBackground;
    }

    public void mo9397La() {
        if (m9382Na()) {
            C1408x.m37088c(this.f30168b0);
        }
        View view = this.f30154P;
        if (view != null) {
            C1408x.m37088c(view);
        }
    }

    public final boolean m9395Lc(C9334k kVar) {
        return this.f30165a.m14505c2(kVar);
    }

    public final void m9394Ld(boolean z) {
        if (z) {
            this.f30169c |= 16777216;
        } else {
            this.f30169c &= -16777217;
        }
    }

    public boolean m9393Le() {
        return false;
    }

    public void mo9391M8(View$OnClickListenerC9170d1 d1Var) {
        this.f30169c &= -4194305;
        this.f30156R = d1Var;
        this.f30158T = null;
        this.f30157S = null;
    }

    public int mo8865M9() {
        return C4896n.m24478e();
    }

    public final boolean m9390Ma() {
        return (this.f30169c & Log.TAG_ACCOUNTS) != 0;
    }

    public void m9388Mc(int i) {
        final AtomicReference atomicReference = new AtomicReference();
        atomicReference.set(m9447Ec(R.string.FeatureUnavailableSorry, C1363c0.m37425l(this, C4403w.m27869i1(i), new C5132o.AbstractC5133a() {
            @Override
            public final boolean mo490a(View view, C5132o oVar) {
                boolean ib;
                ib = AbstractC9323v4.m9236ib(atomicReference, view, oVar);
                return ib;
            }
        })));
    }

    public final void m9387Md(boolean z) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            q1Var.m9749M().m9514B(z);
        }
    }

    public boolean mo9386Me() {
        return false;
    }

    public void mo9384N8(C9270q1 q1Var) {
        this.f30169c |= 4194304;
        this.f30158T = q1Var;
        this.f30156R = q1Var.m9757I();
        this.f30157S = q1Var.m9759H();
    }

    public int mo9383N9() {
        return C11524j.m228N(mo9375O9());
    }

    public final boolean m9382Na() {
        return (this.f30169c & Log.TAG_NDK) != 0;
    }

    public final void m9380Nc(final C9334k kVar) {
        if (!kVar.f30200c || C4868i.m24726c2().m24608r0() != 2) {
            m9395Lc(kVar.m9108c(m9348S9()));
        } else {
            m9261ee(null, new int[]{R.id.btn_takePhoto, R.id.btn_takeVideo}, new String[]{C4403w.m27869i1(R.string.TakePhoto), C4403w.m27869i1(R.string.TakeVideo)}, null, new int[]{R.drawable.baseline_camera_alt_24, R.drawable.baseline_videocam_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean jb;
                    jb = AbstractC9323v4.this.m9229jb(kVar, view, i);
                    return jb;
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

    public final void m9379Nd(float f) {
        if (this.f30172e0 != f) {
            this.f30172e0 = f;
            mo9407K8(f);
            m9371Od(f == 1.0f);
            View$OnClickListenerC9170d1 d1Var = this.f30156R;
            if (d1Var != null) {
                d1Var.invalidate();
            }
        }
    }

    public boolean mo9378Ne() {
        return true;
    }

    @Override
    public final void mo6938O0(int i, boolean z) {
    }

    public final void m9376O8(C11537v vVar) {
        C11537v vVar2 = this.f30159U;
        if (vVar2 != null) {
            vVar.m78b(vVar2);
        }
        this.f30159U = vVar;
    }

    public int mo9375O9() {
        return R.id.theme_color_headerIcon;
    }

    public final boolean m9374Oa() {
        return (this.f30169c & Log.TAG_PLAYER) != 0;
    }

    public View$OnFocusChangeListenerC7069y1 m9372Oc(CharSequence charSequence, CharSequence charSequence2, int i, int i2, CharSequence charSequence3, final String str, final AbstractC9336m mVar, final boolean z, AbstractC5918j<ViewGroup> jVar, AbstractC11531p pVar) {
        Button button;
        final View$OnFocusChangeListenerC7069y1 y1Var = new View$OnFocusChangeListenerC7069y1(this.f30165a);
        y1Var.setHint(charSequence2);
        y1Var.getEditText().setInputType(209);
        if (!C5070i.m24061i(charSequence3)) {
            y1Var.setText(charSequence3);
            C1399s0.m37167n0(y1Var.getEditText(), 0, charSequence3.length());
        }
        y1Var.getEditText().addTextChangedListener(new C9325b(y1Var));
        C9326c cVar = new C9326c(this.f30165a, y1Var);
        cVar.setOrientation(1);
        cVar.setGravity(1);
        int i3 = C1357a0.m37541i(16.0f);
        cVar.setPadding(i3, i3, i3, i3);
        cVar.addView(y1Var, new LinearLayout.LayoutParams(-1, -2, 1.0f));
        if (jVar != null) {
            jVar.mo1330a(cVar);
        }
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.f30165a, C11524j.m150v()).setTitle(charSequence).setView(cVar).setPositiveButton(C4403w.m27869i1(i), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AbstractC9323v4.m9209mb(View$OnFocusChangeListenerC7069y1.this, mVar, z, dialogInterface, i4);
            }
        }).setNegativeButton(C4403w.m27869i1(i2), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                AbstractC9323v4.m9202nb(z, y1Var, dialogInterface, i4);
            }
        });
        boolean z2 = !C5070i.m24061i(charSequence3) && !C5070i.m24061i(str) && !charSequence3.equals(str);
        if (z2) {
            negativeButton.setNeutralButton(C4403w.m27869i1(R.string.ValueReset), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    AbstractC9323v4.m9194ob(AbstractC9323v4.AbstractC9336m.this, y1Var, str, z, dialogInterface, i4);
                }
            });
        }
        negativeButton.setCancelable(false);
        final AlertDialog Sd = m9344Sd(negativeButton);
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
                    AbstractC9323v4.m9223kb(View$OnFocusChangeListenerC7069y1.this, mVar, z, Sd, view);
                }
            });
        }
        if (z2 && (button = Sd.getButton(-3)) != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AbstractC9323v4.m9217lb(AbstractC9323v4.AbstractC9336m.this, y1Var, str, z, Sd, view);
                }
            });
        }
        return y1Var;
    }

    public final void m9371Od(boolean z) {
        if (this.f30173f0 != z) {
            this.f30173f0 = z;
            if (z) {
                mo9399L8();
            } else {
                mo9327V8();
            }
        }
    }

    public final boolean m9370Oe() {
        return (this.f30169c & 268435456) != 0;
    }

    public int m9368P8(int i, TextView textView, boolean z, boolean z2) {
        return m9361Q8(new C9186f1(i, textView, z, z2));
    }

    public final int m9367P9() {
        return C11524j.m228N(mo9360Q9());
    }

    public final boolean m9366Pa() {
        int i = this.f30169c;
        return ((1048576 & i) == 0 && (524288 & i) == 0 && (i & Log.TAG_ACCOUNTS) == 0) ? false : true;
    }

    public View$OnFocusChangeListenerC7069y1 m9364Pc(CharSequence charSequence, CharSequence charSequence2, int i, int i2, CharSequence charSequence3, AbstractC9336m mVar, boolean z) {
        return m9372Oc(charSequence, charSequence2, i, i2, charSequence3, null, mVar, z, null, null);
    }

    public final boolean m9363Pd() {
        return (this.f30169c & 16777216) != 0 && !m9366Pa() && (this.f30172e0 == 0.0f || m9443F8());
    }

    public int m9361Q8(C9186f1 f1Var) {
        if (this.f30175h0 == null) {
            this.f30175h0 = new ArrayList();
        }
        this.f30175h0.add(f1Var);
        return f1Var.m10014a();
    }

    public int mo9360Q9() {
        return R.id.theme_color_headerText;
    }

    public final void m9359Qa(int i) {
        C9279r rVar = this.f30166a0;
        if (rVar != null) {
            rVar.m9653w(i, false);
        }
    }

    public boolean mo9358Qb(boolean z, int i, Animator.AnimatorListener animatorListener) {
        return false;
    }

    public void m9357Qc(String str, HandlerC10770jj.C10788q qVar) {
        HandlerC10770jj dd = this.f30167b.m2485dd();
        if (qVar == null) {
            qVar = new HandlerC10770jj.C10788q();
        }
        dd.m3858E7(this, str, qVar.m3318m());
    }

    public boolean mo9356Qd() {
        return true;
    }

    public final void m9354R8(AbstractC9323v4<?> v4Var) {
        if (v4Var != null) {
            if (v4Var.f30159U == null) {
                v4Var.f30159U = new C11537v();
            }
            if (this.f30159U != null) {
                v4Var.f30159U.m67m().addAll(this.f30159U.m67m());
            }
            this.f30159U = v4Var.f30159U;
        }
    }

    public abstract int mo407R9();

    public boolean m9353Ra() {
        return (this.f30169c & 4194304) != 0;
    }

    public final void m9352Rb() {
        this.f30169c &= -2097153;
    }

    public final void m9351Rc(long j, final AbstractC5919k kVar) {
        C9188f2 f2Var = new C9188f2(R.id.btn_shareLiveLocation);
        f2Var.m9997p(new C2964ra[]{new C2964ra(13, (int) R.id.btn_messageLive15Minutes, 0, (CharSequence) C4403w.m27844o2(R.string.xMinutes, 15L), (int) R.id.btn_shareLiveLocation, true), new C2964ra(13, (int) R.id.btn_messageLive1Hour, 0, (CharSequence) C4403w.m27844o2(R.string.xHours, 1L), (int) R.id.btn_shareLiveLocation, false), new C2964ra(13, (int) R.id.btn_messageLive8Hours, 0, (CharSequence) C4403w.m27844o2(R.string.xHours, 8L), (int) R.id.btn_shareLiveLocation, false)});
        String j1 = C7316a.m17049l(j) ? C4403w.m27865j1(R.string.LiveLocationAlertPrivate, this.f30167b.m2480e2().m1721K2(this.f30167b.m2494d4(j))) : C4403w.m27869i1(R.string.LiveLocationAlertGroup);
        f2Var.m10012a(new C2964ra(84));
        f2Var.m10010c(false);
        f2Var.m10011b(j1);
        f2Var.m9995r(R.string.Share);
        f2Var.m10003j(new AbstractC9343r() {
            @Override
            public final void mo1773l6(int i, SparseIntArray sparseIntArray) {
                AbstractC9323v4.m9188pb(AbstractC5919k.this, i, sparseIntArray);
            }
        });
        m9206me(f2Var);
    }

    public boolean mo9350Rd() {
        return false;
    }

    @Override
    public final void mo6929S4() {
        if (!m9347Sa()) {
            mo417Z8();
        }
    }

    public boolean mo8863S8(C9270q1 q1Var, float f, float f2) {
        return true;
    }

    public boolean m9348S9() {
        return (this.f30169c & Log.TAG_CONTACT) != 0;
    }

    public boolean m9347Sa() {
        return (this.f30169c & Log.TAG_VIDEO) != 0;
    }

    public final void m9346Sb() {
        this.f30169c &= -1048577;
        mo416gc();
        m9410Jd(0.0f, false);
    }

    public void m9345Sc() {
        m9323Vc(R.string.NoCameraAccess);
    }

    public final AlertDialog m9344Sd(AlertDialog.Builder builder) {
        return m9311Xb(this.f30165a.m14422w3(builder), 0);
    }

    public void mo9343T5(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: td.AbstractC9323v4.mo9343T5(int, int):void");
    }

    public void m9341T8() {
        m9334U8("", false);
    }

    public final String m9340T9() {
        return this.f30170c0;
    }

    public boolean m9339Ta() {
        return (this.f30169c & Log.TAG_LUX) != 0;
    }

    public final void m9338Tb() {
        this.f30169c &= -524289;
    }

    public void m9337Tc() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(R.string.AppName));
        builder.setMessage(C4403w.m27869i1(R.string.NoGoogleMaps));
        builder.setPositiveButton(C4403w.m27869i1(R.string.Install), DialogInterface$OnClickListenerC9316u4.f30140a);
        builder.setNegativeButton(C4403w.m27869i1(R.string.Cancel), DialogInterface$OnClickListenerC9215j3.f29737a);
        m9344Sd(builder);
    }

    public final void m9336Td(final String str, final long j) {
        if (j == 0) {
            C1405v.m37141B(str);
        } else {
            m9227je(new int[]{R.id.btn_phone_call, R.id.btn_telegram_call}, new String[]{C4403w.m27869i1(R.string.PhoneCall), C4403w.m27869i1(R.string.VoipInCallBranding)}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean yb;
                    yb = AbstractC9323v4.this.m9123yb(str, j, view, i);
                    return yb;
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

    public final void m9334U8(String str, boolean z) {
        HeaderEditText headerEditText = this.f30168b0;
        if (headerEditText != null) {
            if (z) {
                this.f30170c0 = str;
            }
            headerEditText.setText(str);
            if (!str.isEmpty()) {
                C1399s0.m37169m0(this.f30168b0, str.length());
            }
            m9475Ae(!str.isEmpty(), false);
        }
    }

    public View m9333U9() {
        return this.f30154P;
    }

    public final boolean m9332Ua() {
        return (this.f30169c & 33554432) != 0;
    }

    public final void m9331Ub() {
        int i = this.f30169c & (-524289);
        this.f30169c = i;
        int i2 = i & (-1048577);
        this.f30169c = i2;
        this.f30169c = i2 & (-2097153);
    }

    public void m9330Uc(boolean z) {
        m9323Vc((Build.VERSION.SDK_INT < 29 || !C4183a.f14101s || !z) ? R.string.NoLocationAccess : R.string.NoLocationAccessBackground);
    }

    public final C6924j2 m9329Ud(CharSequence charSequence, String str, int i, int i2, final Runnable runnable) {
        int[] iArr = {R.id.btn_done, R.id.btn_cancel};
        String[] strArr = new String[2];
        if (str == null) {
            str = C4403w.m27869i1(R.string.OK);
        }
        strArr[0] = str;
        strArr[1] = C4403w.m27869i1(R.string.Cancel);
        return m9261ee(charSequence, iArr, strArr, new int[]{i2, 1}, new int[]{i, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i3) {
                boolean zb;
                zb = AbstractC9323v4.m9116zb(runnable, view, i3);
                return zb;
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
    }

    public void mo9327V8() {
    }

    public int mo9326V9() {
        return mo8865M9();
    }

    public boolean mo9325Va() {
        return false;
    }

    public final void m9324Vb() {
        if (m9332Ua()) {
            int i = this.f30169c;
            if ((i & 268435456) == 0) {
                this.f30169c = i | 268435456;
                C1379j0.m37321k(get(), false);
                this.f30165a.m14440t0();
            }
        }
    }

    public void m9323Vc(int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        builder.setTitle(C4403w.m27869i1(R.string.AppName));
        builder.setMessage(C4403w.m27869i1(i));
        builder.setPositiveButton(C4403w.m27950P0(), DialogInterface$OnClickListenerC9260o4.f29910a);
        builder.setNegativeButton(C4403w.m27869i1(R.string.Settings), DialogInterface$OnClickListenerC9288r4.f30049a);
        m9344Sd(builder);
    }

    public final C6924j2 m9322Vd(CharSequence charSequence, String str, Runnable runnable) {
        return m9329Ud(charSequence, str, R.drawable.baseline_check_circle_24, 1, runnable);
    }

    public boolean mo136W0() {
        return m9353Ra() || m9332Ua();
    }

    public final void m9320W8(Runnable runnable) {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10030t2(true, runnable);
        }
    }

    public int mo418W9() {
        return 0;
    }

    public final boolean m9319Wa() {
        C9270q1 q1Var = this.f30158T;
        return q1Var != null && q1Var.m9742S();
    }

    public final void m9318Wb(float f, float f2) {
        C6957m1 m1Var;
        if ((this.f30169c & 268435456) == 0 && (m1Var = this.f30178k0) != null && !m1Var.m18359O1()) {
            float M1 = (f - f2) + this.f30178k0.m18361M1(f2);
            float f3 = 0.0f;
            if (M1 < 0.0f) {
                f3 = C5069h.m24089d((-M1) / C1357a0.m37541i(64.0f));
            }
            if (f3 == 1.0f) {
                m9324Vb();
                return;
            }
            C6957m1 m1Var2 = this.f30178k0;
            if (m1Var2 != null) {
                m1Var2.setBeforeMaximizeFactor(f3);
            }
        }
    }

    public void m9317Wc() {
        m9323Vc(R.string.NoStorageAccess);
    }

    public final void m9316Wd(final String str, final HandlerC10770jj.C10788q qVar, final AbstractC5914f fVar) {
        C5320c cVar = new C5320c(3);
        C5146u0 u0Var = new C5146u0(3);
        C5320c cVar2 = new C5320c(3);
        cVar.m23284a(R.id.btn_openLink);
        u0Var.m23816a(R.string.Open);
        cVar2.m23284a(R.drawable.baseline_open_in_browser_24);
        cVar.m23284a(R.id.btn_copyLink);
        u0Var.m23816a(R.string.CopyLink);
        cVar2.m23284a(R.drawable.baseline_link_24);
        cVar.m23284a(R.id.btn_shareLink);
        u0Var.m23816a(R.string.Share);
        cVar2.m23284a(R.drawable.baseline_forward_24);
        final int[] iArr = {0};
        m9261ee(str, cVar.m23280e(), u0Var.m23813d(), null, cVar2.m23280e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Ab;
                Ab = AbstractC9323v4.this.m9478Ab(str, iArr, fVar, qVar, view, i);
                return Ab;
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

    public boolean mo9314X8(boolean z) {
        return false;
    }

    public CharSequence mo9313X9() {
        return this.f30151M;
    }

    public boolean m9312Xa() {
        return (this.f30169c & Log.TAG_EMOJI) != 0;
    }

    public final AlertDialog m9311Xb(AlertDialog alertDialog, int i) {
        if (alertDialog == null) {
            return null;
        }
        if ((i & 4) != 0) {
            View findViewById = alertDialog.findViewById(16908299);
            if (findViewById instanceof TextView) {
                ((TextView) findViewById).setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        return alertDialog;
    }

    public void m9310Xc(String str, CharSequence charSequence) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f30165a, C11524j.m150v());
        if (str != null && !str.isEmpty()) {
            builder.setTitle(str);
        }
        builder.setMessage(charSequence);
        builder.setPositiveButton(C4403w.m27950P0(), DialogInterface$OnClickListenerC9308t4.f30119a);
        m9344Sd(builder);
    }

    public final C6924j2 m9309Xd(CharSequence charSequence, final int i, final int i2, final int i3, final AbstractC5920l lVar, final AbstractC11531p pVar) {
        return m9214le(charSequence, true, new AbstractC9342q() {
            @Override
            public final int mo9090a(C6924j2 j2Var, C9319v1 v1Var) {
                int Jb;
                Jb = AbstractC9323v4.this.m9412Jb(pVar, i, i2, i3, lVar, j2Var, v1Var);
                return Jb;
            }
        }, pVar);
    }

    public final void m9307Y8() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10028u2();
        }
    }

    public final int m9306Y9() {
        return 1275068416;
    }

    public final boolean m9305Ya(C11131y6 y6Var) {
        return m9128xe() == y6Var.f35705b;
    }

    public void mo9304Yb(HeaderEditText headerEditText) {
    }

    public final void m9303Yc() {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10019z3();
        }
    }

    public final void m9302Yd(int[] iArr, String[] strArr, int i) {
        m9282be(iArr, strArr, null, i, false);
    }

    public void mo417Z8() {
        C10930q6 q6Var;
        int i = this.f30169c;
        if ((i & Log.TAG_VIDEO) == 0) {
            this.f30169c = i | Log.TAG_VIDEO;
            List<C9186f1> list = this.f30175h0;
            if (list != null) {
                list.clear();
            }
            if (!(this.f30153O == null || (q6Var = this.f30167b) == null)) {
                q6Var.m2818I4();
            }
            m9113ze();
            View G9 = mo8869G9();
            if (G9 instanceof AbstractC5911c) {
                ((AbstractC5911c) G9).mo4501a3();
            }
            m9173rd();
            ArrayList<AbstractC5911c> arrayList = this.f30177j0;
            if (arrayList != null) {
                Iterator<AbstractC5911c> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo4501a3();
                }
                return;
            }
            return;
        }
        Log.bug("Controller is already destroyed: name: %s, class: %s", this.f30151M, getClass().getName());
    }

    public AbstractC9323v4<?> m9300Z9() {
        AbstractC9323v4<?> v4Var = this.f30155Q;
        return v4Var != null ? v4Var : this;
    }

    public final boolean m9299Za(C10930q6 q6Var) {
        return m9128xe() == q6Var.m2188w6();
    }

    public boolean m9298Zb() {
        C9270q1 q1Var = this.f30158T;
        return q1Var != null && q1Var.m9721g0();
    }

    public final void m9297Zc(int i) {
        View$OnClickListenerC9170d1 d1Var = this.f30156R;
        if (d1Var != null) {
            d1Var.m10133A3(i, true);
        }
    }

    public final void m9296Zd(int[] iArr, String[] strArr, int[] iArr2) {
        m9289ae(iArr, strArr, iArr2, 0);
    }

    @Override
    public final void mo4501a3() {
        mo417Z8();
    }

    public void mo135a7(AbstractC11531p pVar, AbstractC11531p pVar2) {
    }

    public final void m9294a9(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            q1Var.m9749M().m9508e(i);
        }
    }

    public int mo9293aa() {
        return 0;
    }

    public final boolean m9292ab() {
        C9270q1 q1Var = this.f30158T;
        return q1Var != null && q1Var.m9749M().m9495r();
    }

    public boolean m9291ac(AbstractC9323v4<?> v4Var) {
        C9270q1 q1Var;
        return !m9292ab() && (q1Var = this.f30158T) != null && q1Var.m9719h0(v4Var);
    }

    public final void m9290ad(final int i, final C4868i.C4873e eVar) {
        m9172re(C4403w.m27982H0(this, R.string.TdlibLogsWarning, new Object[0]), new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                AbstractC9323v4.this.m9145vb(eVar, i, z);
            }
        });
    }

    public final void m9289ae(int[] iArr, String[] strArr, int[] iArr2, int i) {
        m9282be(iArr, strArr, iArr2, i, false);
    }

    public final AbstractC9323v4<?> m9287b9(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9510c(i);
        }
        return null;
    }

    public int mo9286ba() {
        return R.id.theme_color_filling;
    }

    public final boolean m9285bb() {
        return this.f30173f0;
    }

    public C9270q1 m9284bc() {
        return this.f30158T;
    }

    public final void m9283bd(CharSequence charSequence) {
        m9439Fc(R.string.AppUpdateRequiredTitle, charSequence, C4403w.m27869i1(R.string.AppUpdateOk), DialogInterface$OnClickListenerC9295s4.f30085a, 0);
    }

    public final void m9282be(int[] iArr, String[] strArr, int[] iArr2, int i, boolean z) {
        View$OnClickListenerC9170d1 d1Var;
        if (!m9292ab() && !this.f30165a.m14424w1() && (d1Var = this.f30156R) != null) {
            d1Var.m10114I3(iArr, strArr, iArr2, i, z, this);
        }
    }

    @Override
    public final C10930q6 mo4348c() {
        return this.f30167b;
    }

    public final AbstractC9323v4<?> m9280c9(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9506g(i);
        }
        return null;
    }

    public final Runnable m9279ca() {
        return this.f30162X;
    }

    public final boolean m9278cb() {
        return this.f30172e0 != 0.0f && !this.f30173f0;
    }

    public final C9312u1 m9277cc() {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M();
        }
        return null;
    }

    public boolean mo9276cd(boolean z) {
        return false;
    }

    public final C6924j2 m9275ce(CharSequence charSequence, int[] iArr, String[] strArr, AbstractC5117h0 h0Var) {
        return m9261ee(charSequence, iArr, strArr, null, null, h0Var);
    }

    public void mo6904d6() {
        int i = this.f30169c & (-65537);
        this.f30169c = i;
        this.f30169c = i | Log.TAG_EMOJI;
    }

    public final AbstractC9323v4<?> m9273d9(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9505h(i);
        }
        return null;
    }

    public int m9272da() {
        return 3;
    }

    public boolean mo9271db() {
        return false;
    }

    public boolean mo9270dc() {
        return false;
    }

    public boolean mo9269dd() {
        return false;
    }

    public final C6924j2 m9268de(CharSequence charSequence, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3) {
        return m9261ee(charSequence, iArr, strArr, iArr2, iArr3, null);
    }

    public void mo9266e9() {
        this.f30169c &= -4194305;
        this.f30158T = null;
        this.f30156R = null;
        this.f30157S = null;
    }

    public int m9265ea() {
        return mo9472B9();
    }

    public boolean mo9263ec() {
        return false;
    }

    public final void m9262ed() {
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                AbstractC9323v4.this.m9298Zb();
            }
        });
    }

    public final C6924j2 m9261ee(CharSequence charSequence, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, AbstractC5117h0 h0Var) {
        return m9254fe(charSequence, iArr, strArr, iArr2, iArr3, h0Var, null);
    }

    public boolean m9259f9() {
        return false;
    }

    public final int m9258fa() {
        return C11524j.m228N(mo9250ga());
    }

    public final void m9256fc(boolean z) {
        List<AbstractC9335l> list = this.f30176i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f30176i0.get(size).mo3383a(this, z);
            }
        }
    }

    public final void m9255fd(Runnable runnable) {
        if (this.f30164Z == null) {
            this.f30164Z = new ArrayList<>();
        }
        this.f30164Z.add(runnable);
    }

    public final C6924j2 m9254fe(CharSequence charSequence, int[] iArr, String[] strArr, int[] iArr2, int[] iArr3, AbstractC5117h0 h0Var, AbstractC11531p pVar) {
        C9338o[] oVarArr = new C9338o[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            oVarArr[i] = new C9338o(iArr[i], strArr[i], iArr2 != null ? iArr2[i] : 1, iArr3 != null ? iArr3[i] : 0);
        }
        return m9240he(new C9340p(charSequence, oVarArr), h0Var, pVar);
    }

    @Override
    public void mo9253g4(C6957m1.C6963f fVar) {
        mo9477Ac();
    }

    public void mo9251g9(int i, int i2, int i3, int i4) {
    }

    public int mo9250ga() {
        return mo9409Je() ? R.id.theme_color_filling : mo9398L9();
    }

    public void mo416gc() {
    }

    public final void m9248gd(Runnable runnable) {
        if (this.f30163Y == null) {
            this.f30163Y = new ArrayList<>();
        }
        this.f30163Y.add(runnable);
    }

    public final C6924j2 m9247ge(C9340p pVar, AbstractC5117h0 h0Var) {
        return m9240he(pVar, h0Var, null);
    }

    public void mo9245h9(Canvas canvas, float f, int i, int i2) {
    }

    public final int m9244ha() {
        return C11524j.m228N(mo9237ia());
    }

    public void m9242hc() {
    }

    public final void m9241hd() {
        this.f30169c |= Log.TAG_TDLIB_FILES;
    }

    public final C6924j2 m9240he(C9340p pVar, final AbstractC5117h0 h0Var, AbstractC11531p pVar2) {
        int i;
        View.OnClickListener onClickListener;
        final AbstractC9323v4<T> v4Var = this;
        if (m9292ab()) {
            Log.m14719i("Ignoring options show because stack is locked", new Object[0]);
            return null;
        }
        final C6924j2 j2Var = new C6924j2(v4Var.f30165a);
        j2Var.setTag(v4Var);
        j2Var.m18045Q1(true);
        if (h0Var != null) {
            j2Var.setDisableCancelOnTouchDown(h0Var.mo492Q());
        }
        C9319v1 v1Var = new C9319v1(mo4347s(), v4Var, pVar2);
        v1Var.m9482d(v4Var, mo4348c(), pVar.f30216a, false);
        v1Var.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
        if (C1357a0.m37530t(v4Var.f30165a)) {
            int m = C1357a0.m37537m();
            v1Var.setPadding(0, 0, 0, m);
            j2Var.setNeedFullScreen(true);
            i = m;
        } else {
            i = 0;
        }
        C6879f3 f3Var = new C6879f3(v4Var.f30165a);
        f3Var.setSimpleTopShadow(true);
        v1Var.addView(f3Var, 0);
        v4Var.m9163t8(f3Var);
        if (h0Var != null) {
            onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AbstractC9323v4.m9404Kb(AbstractC5117h0.this, j2Var, view);
                }
            };
        } else {
            onClickListener = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    AbstractC9323v4.this.m9396Lb(j2Var, view);
                }
            };
        }
        View.OnClickListener onClickListener2 = onClickListener;
        C9338o[] oVarArr = pVar.f30217b;
        int length = oVarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            C9338o oVar = oVarArr[i3];
            int i4 = i2;
            int i5 = i3;
            length = length;
            oVarArr = oVarArr;
            f3Var = f3Var;
            TextView a = C9319v1.m9485a(v4Var.f30165a, oVar.f30208a, oVar.f30209b, oVar.f30210c, oVar.f30211d, onClickListener2, m9471Ba(), pVar2);
            C10189d.m5794j(a);
            if (pVar2 != null) {
                C11524j.m246E(a, pVar2);
            }
            a.setLayoutParams(new LinearLayout.LayoutParams(-1, C1357a0.m37541i(54.0f)));
            if (h0Var != null) {
                a.setTag(h0Var.mo491b2(i4));
            }
            v1Var.addView(a);
            i2 = i4 + 1;
            i3 = i5 + 1;
            v4Var = this;
        }
        j2Var.m18430T2(v1Var, f3Var.getLayoutParams().height + (C1357a0.m37541i(54.0f) * pVar.f30217b.length) + v1Var.getTextHeight() + i);
        return j2Var;
    }

    public final void m9238i9(Canvas canvas, int i, int i2) {
        if (!this.f30173f0) {
            float f = this.f30172e0;
            if (f > 0.0f) {
                mo9245h9(canvas, f, i, i2);
            }
        }
    }

    public int mo9237ia() {
        return mo9409Je() ? R.id.theme_color_icon : mo9375O9();
    }

    public final void m9235ic(C9270q1 q1Var, boolean z) {
        int i = this.f30169c;
        if (((i & 67108864) != 0) != z) {
            this.f30169c = C5063c.m24138h(i, 67108864, z);
            C6227d<AbstractC9333j> dVar = this.f30174g0;
            if (dVar != null) {
                Iterator<AbstractC9333j> it = dVar.iterator();
                while (it.hasNext()) {
                    it.next().mo9111a(this, q1Var, z);
                }
            }
        }
    }

    public final void m9234id() {
        this.f30169c |= 8388608;
    }

    public final C6924j2 m9233ie(int[] iArr, String[] strArr) {
        return m9261ee(null, iArr, strArr, null, null, null);
    }

    public final void m9232j8(AbstractC9333j jVar) {
        if (this.f30174g0 == null) {
            this.f30174g0 = new C6227d<>();
        }
        this.f30174g0.add(jVar);
    }

    public final void m9231j9() {
        this.f30169c |= Log.TAG_NDK;
    }

    public HeaderEditText m9230ja(View$OnClickListenerC9170d1 d1Var) {
        if (this.f30168b0 == null) {
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(-1, C4896n.m24478e());
            if (C4403w.m27984G2()) {
                s1.rightMargin = C1357a0.m37541i(68.0f);
                s1.leftMargin = C1357a0.m37541i(49.0f);
            } else {
                s1.leftMargin = C1357a0.m37541i(68.0f);
                s1.rightMargin = C1357a0.m37541i(49.0f);
            }
            HeaderEditText u9 = m9155u9(d1Var);
            this.f30168b0 = u9;
            u9.addTextChangedListener(new C9324a());
            this.f30168b0.setHint(C4403w.m27869i1(m9368P8(mo9224ka(), this.f30168b0, true, false)));
            this.f30168b0.setLayoutParams(s1);
            mo9304Yb(this.f30168b0);
        }
        return this.f30168b0;
    }

    public boolean mo404jc(boolean z) {
        return false;
    }

    public boolean mo9228jd() {
        return false;
    }

    public final C6924j2 m9227je(int[] iArr, String[] strArr, AbstractC5117h0 h0Var) {
        return m9261ee(null, iArr, strArr, null, null, h0Var);
    }

    public final void m9226k8(AbstractC5911c cVar) {
        if (cVar != null) {
            if (this.f30177j0 == null) {
                this.f30177j0 = new ArrayList<>();
            }
            this.f30177j0.add(cVar);
        }
    }

    public final void m9225k9() {
        this.f30169c |= Log.TAG_PLAYER;
    }

    public int mo9224ka() {
        return R.string.Search;
    }

    public void mo9222kc() {
        this.f30169c &= -8193;
        View view = this.f30154P;
        if (view != null && view.isEnabled()) {
            int i = this.f30169c;
            if (!((1048576 & i) == 0 && (65536 & i) == 0 && (131072 & i) == 0)) {
                int i2 = i & (-65537);
                this.f30169c = i2;
                if ((536870912 & i2) != 0) {
                    this.f30169c = i2 & (-536870913);
                } else {
                    C1408x.m37088c(this.f30154P);
                }
            }
        }
        mo9159tc();
        m9256fc(false);
        this.f30165a.m14428v2(this);
    }

    public final AbstractC9323v4<?> m9221kd() {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9499n();
        }
        return null;
    }

    public final C6924j2 m9220ke(int[] iArr, String[] strArr, int[] iArr2, AbstractC5117h0 h0Var) {
        return m9261ee(null, iArr, strArr, iArr2, null, h0Var);
    }

    public final void m9219l8(AbstractC9335l lVar) {
        if (this.f30176i0 == null) {
            this.f30176i0 = new ArrayList();
        }
        if (!this.f30176i0.contains(lVar)) {
            this.f30176i0.add(lVar);
        }
    }

    public final void m9218l9() {
        ArrayList<Runnable> arrayList = this.f30163Y;
        if (arrayList != null) {
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f30163Y.clear();
        }
    }

    public int mo415la() {
        return 0;
    }

    public void mo9216lc() {
    }

    public final void m9215ld(TdApi.DeepLinkInfo deepLinkInfo) {
        if (deepLinkInfo.needUpdateApplication) {
            m9283bd(C7321e.m16965a1(deepLinkInfo.text) ? null : C4779t2.m25420t5(deepLinkInfo.text));
        } else {
            m9447Ec(R.string.AppName, C4779t2.m25420t5(deepLinkInfo.text));
        }
    }

    public final C6924j2 m9214le(CharSequence charSequence, boolean z, AbstractC9342q qVar, AbstractC11531p pVar) {
        C6924j2 j2Var = new C6924j2(this.f30165a);
        j2Var.setTag(this);
        j2Var.m18045Q1(true);
        C9319v1 v1Var = new C9319v1(mo4347s(), this, pVar);
        v1Var.m9482d(this, mo4348c(), charSequence, z);
        v1Var.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 80));
        C6879f3 f3Var = new C6879f3(this.f30165a);
        f3Var.setSimpleTopShadow(true);
        v1Var.addView(f3Var, 0);
        m9163t8(f3Var);
        int textHeight = v1Var.getTextHeight() + 0 + f3Var.getLayoutParams().height + qVar.mo9090a(j2Var, v1Var);
        if (C1357a0.m37530t(this.f30165a)) {
            int m = C1357a0.m37537m();
            textHeight += m;
            v1Var.setPadding(0, 0, 0, m);
            j2Var.setNeedFullScreen(true);
        }
        j2Var.m18430T2(v1Var, textHeight);
        return j2Var;
    }

    @Override
    public void mo9213m6(C6957m1.C6963f fVar) {
        mo9216lc();
        mo417Z8();
    }

    public void mo134m7(boolean z, C11510b bVar) {
        C11537v vVar = this.f30159U;
        if (vVar != null) {
            vVar.m66n(z);
        }
    }

    public final void m9212m8(Runnable runnable) {
        if (m9339Ta()) {
            runnable.run();
        } else {
            m9219l8(new C9332i(runnable));
        }
    }

    public final void m9211m9(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            m9151ud(runnable);
        }
    }

    public String mo9210ma() {
        return null;
    }

    public void mo9208mc(Configuration configuration) {
    }

    public final void m9207md(Runnable runnable) {
        C1379j0.m37330f0(runnable);
    }

    public final C9180e2 m9206me(final C9188f2 f2Var) {
        FrameLayout frameLayout;
        C6862d3 d3Var;
        int i;
        C6924j2 j2Var;
        int i2;
        String str;
        C2964ra[] raVarArr;
        int i3 = 0;
        if (m9292ab()) {
            Log.m14719i("Ignoring showSettings because stack is locked", new Object[0]);
            return null;
        }
        int i4 = 2;
        int i5 = 1;
        int length = (f2Var.f29654c.length * 2) + 1;
        ArrayList<C2964ra> arrayList = f2Var.f29653b;
        ArrayList arrayList2 = new ArrayList(length + ((arrayList == null || arrayList.isEmpty()) ? 0 : f2Var.f29653b.size() + 1));
        arrayList2.add(new C2964ra(2));
        ArrayList<C2964ra> arrayList3 = f2Var.f29653b;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            arrayList2.addAll(f2Var.f29653b);
            arrayList2.add(new C2964ra(11));
        }
        if (f2Var.f29661j != null) {
            arrayList2.add(new C2964ra(30, f2Var.f29658g, 0, f2Var.f29659h, false).m32856U(f2Var.f29661j, f2Var.f29660i));
            arrayList2.add(new C2964ra(11));
        }
        if (f2Var.f29662k) {
            boolean z = true;
            for (C2964ra raVar : f2Var.f29654c) {
                if (z) {
                    z = false;
                } else {
                    arrayList2.add(new C2964ra(11));
                }
                arrayList2.add(raVar);
            }
        } else {
            arrayList2.ensureCapacity(arrayList2.size() + f2Var.f29654c.length);
            Collections.addAll(arrayList2, f2Var.f29654c);
        }
        final ?? frameLayoutFix = new FrameLayoutFix(this.f30165a);
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        final C9180e2 e2Var = new C9180e2();
        final C9327d dVar = new C9327d(this.f30165a, e2Var);
        e2Var.f29638b = dVar;
        if (f2Var.f29668q) {
            dVar.m39434g(new C9328e());
        }
        dVar.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        dVar.setItemAnimator(null);
        dVar.setLayoutManager(new LinearLayoutManager(mo4347s(), 1, false));
        final C6924j2 j2Var2 = new C6924j2(this.f30165a);
        e2Var.f29641e = j2Var2;
        j2Var2.setPopupHeightProvider(new C6924j2.AbstractC6931g() {
            @Override
            public final int getCurrentPopupHeight() {
                int Mb;
                Mb = AbstractC9323v4.this.m9389Mb(dVar, frameLayoutFix, e2Var);
                return Mb;
            }
        });
        j2Var2.m18045Q1(true);
        if (f2Var.f29663l) {
            j2Var2.m18435N2();
        }
        j2Var2.m18417l2();
        j2Var2.setDismissListener(f2Var.f29669r);
        View.OnClickListener o3Var = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                AbstractC9323v4.m9381Nb(C9188f2.this, e2Var, j2Var2, view);
            }
        };
        ?? r0 = f2Var.f29674w;
        View.OnClickListener onClickListener = o3Var;
        C9329f fVar = new C9329f(r0 != 0 ? r0 : this, o3Var, this, f2Var);
        e2Var.f29637a = fVar;
        int x2 = fVar.m34116x2(arrayList2, true);
        if (!f2Var.f29673v) {
            frameLayout = new C9330g(this.f30165a);
            C10192g.m5782i(frameLayout, R.id.theme_color_filling, this);
            frameLayout.setLayoutParams(FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(56.0f), 80));
            int i6 = 0;
            while (i6 < i4) {
                C6847b2 b2Var = new C6847b2(this.f30165a);
                int i7 = i6 == i5 ? f2Var.f29665n : f2Var.f29667p;
                b2Var.setTextColor(C11524j.m228N(i7));
                m9119z8(b2Var, i7);
                b2Var.setTextSize(i5, 16.0f);
                View.OnClickListener onClickListener2 = onClickListener;
                b2Var.setOnClickListener(onClickListener2);
                b2Var.setBackgroundResource(R.drawable.bg_btn_header);
                b2Var.setGravity(17);
                b2Var.setPadding(C1357a0.m37541i(16.0f), i3, C1357a0.m37541i(16.0f), i3);
                if (i6 == 0) {
                    b2Var.setId(R.id.btn_cancel);
                    str = f2Var.f29666o.toUpperCase();
                    b2Var.setText(str);
                    b2Var.setLayoutParams(FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(55.0f), (C4403w.m27984G2() ? 5 : 3) | 80));
                    e2Var.f29640d = b2Var;
                } else {
                    b2Var.setId(R.id.btn_save);
                    str = f2Var.f29664m.toUpperCase();
                    b2Var.setText(str);
                    b2Var.setLayoutParams(FrameLayoutFix.m18007t1(-2, C1357a0.m37541i(55.0f), (C4403w.m27984G2() ? 3 : 5) | 80));
                    e2Var.f29639c = b2Var;
                }
                C1399s0.m37143z0(b2Var, str);
                C1399s0.m37193a0(b2Var);
                frameLayout.addView(b2Var);
                i6++;
                onClickListener = onClickListener2;
                i3 = 0;
                i4 = 2;
                i5 = 1;
            }
        } else {
            frameLayout = null;
        }
        FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(-1, -2, 80);
        t1.bottomMargin = frameLayout != null ? C1357a0.m37541i(56.0f) : 0;
        dVar.setAdapter(e2Var.f29637a);
        dVar.setLayoutParams(t1);
        frameLayoutFix.addView(dVar);
        if (frameLayout != null) {
            frameLayoutFix.addView(frameLayout);
        }
        if (frameLayout != null) {
            FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(1.0f), 80);
            t12.bottomMargin = C1357a0.m37541i(56.0f);
            C6862d3 e = C6862d3.m18733e(this.f30165a, t12, true);
            e.m18737a();
            m9163t8(e);
            frameLayoutFix.addView(e);
            d3Var = e;
        } else {
            d3Var = null;
        }
        if (C1357a0.m37530t(this.f30165a)) {
            i = C1357a0.m37537m();
            View view = new View(this.f30165a);
            view.setBackgroundColor(C11524j.m228N(R.id.theme_color_filling));
            m9197o8(view, R.id.theme_color_filling);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.getLayoutParams();
            layoutParams.bottomMargin += i;
            dVar.setLayoutParams(layoutParams);
            if (frameLayout != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams2.bottomMargin += i;
                frameLayout.setLayoutParams(layoutParams2);
            }
            if (d3Var != null) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d3Var.getLayoutParams();
                layoutParams3.bottomMargin += i;
                d3Var.setLayoutParams(layoutParams3);
            }
            view.setLayoutParams(FrameLayoutFix.m18007t1(-1, i, 80));
            FrameLayout.LayoutParams t13 = FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(1.0f), 80);
            t13.bottomMargin = i;
            C6862d3 e2 = C6862d3.m18733e(this.f30165a, t13, true);
            e2.m18737a();
            m9163t8(e2);
            frameLayoutFix.addView(e2);
            frameLayoutFix.addView(view);
            j2Var = j2Var2;
            j2Var.setNeedFullScreen(true);
        } else {
            j2Var = j2Var2;
            i = 0;
        }
        int v = e2Var.f29637a.mo11421v(-1) + (frameLayout != null ? C1357a0.m37541i(56.0f) : 0) + i;
        int min = Math.min(C1357a0.m37544f(), v);
        if (v <= C1357a0.m37545e() || x2 == -1) {
            i2 = 2;
        } else {
            i2 = 2;
            ((LinearLayoutManager) dVar.getLayoutManager()).m39522z2(x2, ((C1357a0.m37545e() - C1357a0.m37541i(56.0f)) / 2) - (C2139ap.m35479W(((C2964ra) arrayList2.get(x2)).m32876A()) / 2));
        }
        j2Var.m18416m2(this);
        j2Var.m18430T2(frameLayoutFix, Math.min((C1357a0.m37544f() / i2) + C1357a0.m37541i(56.0f), min));
        return e2Var;
    }

    public final C11536u m9205n8(Object obj, int i) {
        C11536u l = m9471Ba().m68l(obj, 2);
        if (l == null) {
            return m9119z8(obj, i);
        }
        l.m82h(i);
        return l;
    }

    public final void m9204n9() {
        Runnable runnable = this.f30162X;
        if (runnable != null) {
            runnable.run();
            this.f30162X = null;
        }
        ArrayList<Runnable> arrayList = this.f30164Z;
        if (arrayList != null) {
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            this.f30164Z.clear();
        }
    }

    public final int m9203na() {
        return C11524j.m228N(m9195oa());
    }

    public View mo9201nc(Context context) {
        throw new RuntimeException("Stub!");
    }

    public final void m9200nd(AbstractC5911c cVar) {
        ArrayList<AbstractC5911c> arrayList;
        if (cVar != null && (arrayList = this.f30177j0) != null) {
            arrayList.remove(cVar);
        }
    }

    public final void m9199ne(int i, C2964ra[] raVarArr, AbstractC9343r rVar) {
        m9206me(new C9188f2(i).m9997p(raVarArr).m10003j(rVar));
    }

    @Override
    public void mo9198o1(C6957m1.C6963f fVar) {
        mo9166sc();
    }

    public void mo6871o6() {
        C9270q1 q1Var;
        View view = this.f30154P;
        if (view != null && view.isEnabled() && m9312Xa() && (this.f30169c & Log.TAG_COMPRESS) == 0 && (q1Var = this.f30158T) != null && !q1Var.m9742S()) {
            int i = this.f30169c;
            if (!((32768 & i) == 0 && (i & Log.TAG_CONTACT) == 0) && !this.f30165a.m14414y1() && !this.f30165a.m14620A1()) {
                this.f30169c |= Log.TAG_COMPRESS;
                C1379j0.m37300u0(this.f30154P);
            } else {
                C1408x.m37088c(this.f30154P);
            }
        }
        this.f30169c &= -4097;
    }

    public final void m9197o8(View view, int i) {
        m9148v8(new C11536u(1, i, view));
    }

    public int m9195oa() {
        return mo9409Je() ? R.id.theme_color_text : mo9360Q9();
    }

    public abstract View mo403oc(Context context);

    public final void m9193od(AbstractC9335l lVar) {
        List<AbstractC9335l> list = this.f30176i0;
        if (list != null) {
            list.remove(lVar);
        }
    }

    public final void m9192oe(int i, C2964ra[] raVarArr, AbstractC9343r rVar, boolean z) {
        m9206me(new C9188f2(i).m9997p(raVarArr).m10003j(rVar).m10010c(z));
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public final void m9191p8(View view) {
        m9148v8(new C11536u(1, R.id.theme_color_filling, view));
    }

    public final AbstractC9323v4<?> m9190p9(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9504i(i);
        }
        return null;
    }

    public long mo9189pa() {
        return 200L;
    }

    public void mo9187pc() {
        String ma2 = mo9210ma();
        if (ma2 == null) {
            ma2 = "";
        }
        m9334U8(ma2, true);
    }

    public final AbstractC9323v4<?> m9186pd(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9491v(i);
        }
        return null;
    }

    public final void m9185pe(CharSequence charSequence, String str, final Runnable runnable) {
        m9261ee(charSequence, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{str, C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Ob;
                Ob = AbstractC9323v4.this.m9373Ob(runnable, view, i);
                return Ob;
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

    public void mo133q0(int i) {
    }

    public final C11536u m9184q8(Object obj, int i) {
        C11536u uVar = new C11536u(6, i, obj);
        m9148v8(uVar);
        return uVar;
    }

    public float m9182qa() {
        return this.f30161W;
    }

    public void mo8842qc() {
    }

    public final void m9180qd(Object obj) {
        C11537v vVar = this.f30159U;
        if (vVar != null) {
            vVar.m65o(obj);
        }
    }

    public final void m9179qe(Runnable runnable) {
        m9185pe(null, C4403w.m27869i1(R.string.DiscardChanges), runnable);
    }

    public final void m9178r8(Object obj, int i) {
        m9148v8(new C11536u(4, i, obj));
    }

    public boolean mo9177r9() {
        return false;
    }

    public Interpolator mo9176ra() {
        return C2057b.f7280b;
    }

    public void mo9174rc() {
    }

    public final void m9173rd() {
        this.f30162X = null;
    }

    public final C6924j2 m9172re(CharSequence charSequence, final AbstractC5917i iVar) {
        return m9261ee(charSequence, new int[]{R.id.btn_done, R.id.btn_cancel}, new String[]{C4403w.m27869i1(R.string.TdlibLogsWarningConfirm), C4403w.m27869i1(R.string.Cancel)}, new int[]{2, 1}, new int[]{R.drawable.baseline_warning_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Pb;
                Pb = AbstractC9323v4.m9365Pb(AbstractC5917i.this, view, i);
                return Pb;
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

    @Override
    public final AbstractView$OnTouchListenerC7889a mo4347s() {
        return this.f30165a;
    }

    @Override
    public void mo9171s6(C6957m1.C6963f fVar) {
        mo9222kc();
    }

    public final C11536u m9170s8(Object obj, int i) {
        return m9148v8(new C11536u(3, i, obj));
    }

    public boolean mo9169s9() {
        if (!this.f30180m0) {
            return false;
        }
        this.f30180m0 = false;
        return true;
    }

    public int m9168sa() {
        return mo9472B9();
    }

    public void mo9166sc() {
        int i = this.f30169c | Log.TAG_LUX;
        this.f30169c = i;
        this.f30169c = i & (-8388609);
        View view = this.f30154P;
        if (view != null && view.isEnabled()) {
            int i2 = this.f30169c;
            if ((i2 & Log.TAG_COMPRESS) == 0) {
                if ((32768 & i2) != 0) {
                    this.f30169c = i2 | Log.TAG_COMPRESS;
                    C1408x.m37085f(this.f30154P);
                    C1379j0.m37300u0(this.f30154P);
                }
                m9121ye();
                mo9159tc();
                m9256fc(true);
                this.f30165a.m14538T(this);
            }
        }
        get().requestFocus();
        m9121ye();
        mo9159tc();
        m9256fc(true);
        this.f30165a.m14538T(this);
    }

    public boolean mo9165sd(Bundle bundle, String str) {
        return false;
    }

    public final AbstractC9323v4<?> m9164se(int i) {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9749M().m9503j(i);
        }
        return null;
    }

    public final void m9163t8(View view) {
        m9148v8(new C11536u(0, 0, view));
    }

    public final void m9162t9() {
        this.f30180m0 = true;
    }

    public final int m9161ta() {
        return C11524j.m228N(m9154ua());
    }

    public void mo9159tc() {
    }

    public final void m9158td(Runnable runnable) {
        C4383l.m28059a().m28058b(runnable);
    }

    public final int m9157te() {
        C9270q1 q1Var = this.f30158T;
        if (q1Var != null) {
            return q1Var.m9748N();
        }
        return 0;
    }

    public final void m9156u8(Object obj, int i) {
        m9148v8(new C11536u(9, i, obj));
    }

    public final HeaderEditText m9155u9(View$OnClickListenerC9170d1 d1Var) {
        return mo9409Je() ? d1Var.m10119G2(this) : d1Var.m10111K2(m9393Le(), this);
    }

    public int m9154ua() {
        return R.id.theme_color_headerLightBackground;
    }

    public void m9152uc(boolean z) {
    }

    public final void m9151ud(Runnable runnable) {
        C1379j0.m37334d0(runnable);
    }

    public void mo9150ue(ValueAnimator valueAnimator, int i, boolean z) {
        valueAnimator.start();
    }

    public final C11536u m9148v8(C11536u uVar) {
        if (uVar != null && !uVar.m86d()) {
            m9471Ba().m79a(uVar);
        }
        return uVar;
    }

    public final View get() {
        if (this.f30153O == null) {
            View oc = mo403oc(mo4347s());
            this.f30153O = oc;
            oc.setTag(this);
            C10930q6 q6Var = this.f30167b;
            if (q6Var != null) {
                q6Var.m2880E6();
            }
            m9142ve();
        }
        return this.f30153O;
    }

    public final int m9146va() {
        return C11524j.m228N(m9138wa());
    }

    public void m9144vc() {
        this.f30169c |= 134217728;
    }

    public final void m9143vd(Runnable runnable, long j) {
        C1379j0.m37332e0(runnable, j);
    }

    public final void m9142ve() {
        C11541z.m7t().m23f(this);
        C4403w.m27875h(this);
        this.f30165a.m14554P(this);
    }

    public final void m9140w8(Paint paint, int i) {
        m9148v8(new C11536u(5, i, paint));
    }

    public final T m9139w9() {
        return this.f30152N;
    }

    public int m9138wa() {
        return R.id.theme_color_headerLightIcon;
    }

    public boolean mo9136wc(boolean z) {
        View view;
        C6924j2 N0 = this.f30165a.m14559N0();
        if (!z) {
            int i = this.f30169c;
            if ((131072 & i) == 0) {
                return false;
            }
            this.f30169c = (-131073) & i;
        } else if ((this.f30169c & Log.TAG_CONTACT) != 0) {
            return false;
        } else {
            if (N0 != null) {
                N0.mo14479j0();
            }
            this.f30169c = 131072 | this.f30169c;
        }
        if (N0 != null) {
            N0.mo14480j(z);
        }
        if (z || (view = this.f30154P) == null || !(view instanceof C7043v1)) {
            return true;
        }
        boolean isFocusable = view.isFocusable();
        boolean isFocusableInTouchMode = this.f30154P.isFocusableInTouchMode();
        this.f30154P.setFocusable(false);
        this.f30154P.setFocusableInTouchMode(false);
        this.f30154P.clearFocus();
        this.f30165a.m14585H2();
        this.f30154P.setFocusable(isFocusable);
        this.f30154P.setFocusableInTouchMode(isFocusableInTouchMode);
        return true;
    }

    public final void m9135wd(Runnable runnable) {
        m9129xd(runnable, null);
    }

    public boolean mo9134we() {
        return (this.f30169c & Log.TAG_PAINT) == 0;
    }

    public final void m9132x8(Object obj, int i) {
        m9148v8(new C11536u(7, i, obj));
    }

    public final T m9131x9() {
        T t = this.f30152N;
        if (t != null) {
            return t;
        }
        throw new NullPointerException(toString() + " (" + getClass().getSimpleName() + ") arguments are null");
    }

    public int mo8831xa() {
        return 0;
    }

    public void mo409xc() {
    }

    public final void m9129xd(final Runnable runnable, final AbstractC5914f fVar) {
        if (runnable != null) {
            m9151ud(new Runnable() {
                @Override
                public final void run() {
                    AbstractC9323v4.this.m9130xb(fVar, runnable);
                }
            });
        }
    }

    public final int m9128xe() {
        C10930q6 q6Var = this.f30167b;
        if (q6Var != null) {
            return q6Var.m2188w6();
        }
        return -1;
    }

    public final void m9126y8(Object obj) {
        m9148v8(new C11536u(2, R.id.theme_color_text, obj));
    }

    public long mo9125y9(boolean z) {
        return z ? 2000L : 500L;
    }

    public int m9124ya() {
        return R.id.theme_color_headerLightText;
    }

    public void mo8830yc() {
    }

    public boolean mo9122yd(Bundle bundle, String str) {
        return false;
    }

    public final void m9121ye() {
        C4862d.m24934w().m24961T(false);
    }

    public final C11536u m9119z8(Object obj, int i) {
        C11536u uVar = new C11536u(2, i, obj);
        m9148v8(uVar);
        return uVar;
    }

    public final boolean m9118z9() {
        return (this.f30169c & 67108864) != 0;
    }

    public long mo9117za(boolean z) {
        return 0L;
    }

    public void m9115zc() {
        mo9397La();
    }

    public final void m9114zd(Runnable runnable, long j) {
        this.f30162X = runnable;
        if (j >= 0) {
            this.f30167b.m2485dd().postDelayed(runnable, j);
        }
    }

    public final void m9113ze() {
        C11541z.m7t().m42S(this);
        C4403w.m27988F2(this);
        this.f30165a.m14446r2(this);
    }
}
