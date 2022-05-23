package ud;

import ae.j;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import ce.a0;
import ce.p0;
import ce.y;
import gd.w;
import ib.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.g;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;

public class b5 extends FrameLayoutFix implements c2, View.OnClickListener, View.OnLongClickListener {
    public List<b> M;
    public int N;
    public int P;
    public int R;
    public boolean S;
    public c T;
    public boolean U;
    public int V;
    public int W;
    public int f24057a0;
    public float f24058b0;
    public e f24059c0;
    public boolean f24062f0;
    public float f24063g0;
    public float f24064h0;
    public int f24065i0;
    public int f24066j0;
    public int f24067k0;
    public int f24068l0;
    public float f24069m0;
    public d f24070n0;
    public int Q = R.id.theme_color_headerText;
    public int f24060d0 = -1;
    public int f24061e0 = -1;
    public int O = a0.i(19.0f);

    public static class a extends View {
        public b5 M;
        public int N;
        public boolean f24071a;
        public boolean f24072b;
        public ViewParent f24073c;

        public a(Context context) {
            super(context);
            p0.T(this);
        }

        public void b(b5 b5Var) {
            this.M = b5Var;
        }

        public void c(int i10) {
            this.N = i10;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            if (this.M.c2()) {
                int i12 = 0;
                for (int i13 = 0; i13 < this.N; i13++) {
                    i12 += ((b) this.M.M.get(i13)).f24078e + (this.M.O * 2);
                }
                int i14 = ((b) this.M.M.get(this.N)).f24078e + (this.M.O * 2);
                if (w.G2()) {
                    i12 = (View.MeasureSpec.getSize(i10) - i12) - i14;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i14, Log.TAG_TDLIB_OPTIONS), i11);
                setTranslationX(i12);
                return;
            }
            int K1 = this.M.K1(View.MeasureSpec.getSize(i10));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(K1, Log.TAG_TDLIB_OPTIONS), i11);
            setTranslationX(K1 * this.N);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            b5 b5Var = this.M;
            d dVar = b5Var != null ? b5Var.f24070n0 : null;
            if (dVar == null) {
                return ((View) getParent()).getAlpha() >= 1.0f && super.onTouchEvent(motionEvent);
            }
            super.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0) {
                ViewParent viewParent = this.f24073c;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                    this.f24073c = null;
                }
                boolean d10 = dVar.d(this, motionEvent, this.N);
                this.f24072b = d10;
                if (d10) {
                    ViewParent parent = getParent();
                    this.f24073c = parent;
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            if (!this.f24072b) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 1) {
                if (this.f24071a) {
                    this.f24071a = false;
                    dVar.a(this, motionEvent, this.N, true);
                }
                ViewParent viewParent2 = this.f24073c;
                if (viewParent2 != null) {
                    viewParent2.requestDisallowInterceptTouchEvent(false);
                    this.f24073c = null;
                }
            } else if (action == 2) {
                boolean z10 = motionEvent.getY() >= ((float) getMeasuredHeight());
                if (this.f24071a != z10) {
                    this.f24071a = z10;
                    if (z10) {
                        dVar.c(this, motionEvent, this.N);
                    } else {
                        dVar.a(this, motionEvent, this.N, false);
                    }
                }
                if (z10) {
                    dVar.b(this, motionEvent, this.N);
                }
            } else if (action == 3) {
                if (this.f24071a) {
                    this.f24071a = false;
                    dVar.a(this, motionEvent, this.N, false);
                }
                ViewParent viewParent3 = this.f24073c;
                if (viewParent3 != null) {
                    viewParent3.requestDisallowInterceptTouchEvent(false);
                    this.f24073c = null;
                }
            }
            return true;
        }
    }

    public interface c {
        void j2(int i10);
    }

    public interface d {
        void a(View view, MotionEvent motionEvent, int i10, boolean z10);

        void b(View view, MotionEvent motionEvent, int i10);

        void c(View view, MotionEvent motionEvent, int i10);

        boolean d(View view, MotionEvent motionEvent, int i10);
    }

    public interface e {
        void T(int i10, int i11, int i12, int i13, float f10, boolean z10);
    }

    public b5(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public void L1() {
        R1(this.f24058b0, true);
        invalidate();
    }

    private int getTotalWidth() {
        int i10 = 0;
        for (b bVar : this.M) {
            i10 += bVar.f24078e;
        }
        return i10;
    }

    public void G1(String str) {
        I1(new b(str), -1);
    }

    public void H1(String str, int i10) {
        I1(new b(str), i10);
    }

    public void I1(b bVar, int i10) {
        if (i10 == -1) {
            i10 = this.M.size();
        }
        if (i10 == this.M.size()) {
            this.M.add(bVar);
        } else {
            this.M.add(i10, bVar);
        }
        TextPaint t02 = y.t0(j.n0(), bVar.f24075b);
        bVar.d(t02);
        int i11 = bVar.f24078e;
        int i12 = this.V + (this.O * 2) + i11;
        this.V = i12;
        this.N = i12 / this.M.size();
        int K1 = K1(i11);
        this.f24057a0 = K1;
        float f10 = this.f24058b0;
        if (i10 <= ((int) f10)) {
            this.f24058b0 = f10 + 1.0f;
        }
        int i13 = K1 - (this.O * 2);
        if (c2() || i11 >= i13) {
            bVar.g();
        } else {
            bVar.f(i13, t02);
        }
        addView(P1(this.M.size() - 1));
        invalidate();
    }

    public final int K1(int i10) {
        int min = Math.min(i10 / this.M.size(), this.N);
        if (i10 - (this.M.size() * min) < min / 2) {
            return i10 / this.M.size();
        }
        return this.S ? Math.max(min, Math.min((int) (min * 2.0f), i10 / this.M.size())) : min;
    }

    public final void O1(int i10, boolean z10) {
        int i11;
        if (i10 != 0 && (i11 = this.W) != i10 && this.M != null) {
            boolean z11 = i11 != 0;
            this.W = i10;
            this.f24057a0 = K1(i10);
            int n02 = j.n0();
            int i12 = this.f24057a0 - (this.O * 2);
            for (b bVar : this.M) {
                if (z10 || bVar.f24078e >= i12) {
                    bVar.g();
                } else {
                    bVar.f(i12, y.t0(n02, bVar.f24075b));
                }
            }
            if (z11) {
                postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        b5.this.L1();
                    }
                }, 10L);
            } else {
                R1(this.f24058b0, true);
            }
        }
    }

    public final a P1(int i10) {
        a aVar = new a(getContext());
        if (this.U) {
            yd.d.i(aVar);
        } else {
            yd.d.k(aVar);
        }
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        aVar.setOnClickListener(this);
        aVar.setOnLongClickListener(this);
        aVar.b(this);
        aVar.c(i10);
        return aVar;
    }

    public final void R1(float r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: ud.b5.R1(float, boolean):void");
    }

    public void S1(int i10) {
        if (i10 < 0 || i10 >= this.M.size()) {
            throw new IllegalArgumentException(i10 + " is out of range 0.." + this.M.size());
        }
        this.M.remove(i10);
        if (((int) this.f24058b0) >= this.M.size()) {
            this.f24058b0 -= 1.0f;
        }
        removeViewAt(i10);
        invalidate();
    }

    public void T1() {
        if (!this.M.isEmpty()) {
            S1(this.M.size() - 1);
        }
    }

    public void V1(int i10, int i11) {
        if (i10 != i11 || i10 == -1) {
            this.f24060d0 = i10;
            this.f24061e0 = i11;
            if (i11 != -1) {
                R1(i11, false);
            }
        }
    }

    public void W1(int i10, String str) {
        b bVar = new b(str);
        this.M.set(i10, bVar);
        this.V -= this.M.get(i10).f24078e + (this.O * 2);
        bVar.d(y.t0(j.n0(), bVar.f24075b));
        int i11 = this.V + bVar.f24078e + (this.O * 2);
        this.V = i11;
        this.N = i11 / this.M.size();
        this.W = 0;
        requestLayout();
        invalidate();
    }

    public b5 X1(e eVar) {
        this.f24059c0 = eVar;
        return this;
    }

    public boolean Y1(int i10) {
        if (this.R == i10) {
            return false;
        }
        this.R = i10;
        invalidate();
        return true;
    }

    public boolean Z1(int i10, int i11) {
        if (this.P == i10 && this.Q == i11) {
            return false;
        }
        this.P = i10;
        this.Q = i11;
        invalidate();
        return true;
    }

    public void a2() {
        this.U = true;
    }

    public final boolean c2() {
        return getLayoutParams().width == -2;
    }

    @Override
    public void draw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: ud.b5.draw(android.graphics.Canvas):void");
    }

    @Override
    public void onClick(View view) {
        if (this.T != null && (view instanceof a)) {
            this.T.j2(((a) view).N);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f24063g0 != 0.0f;
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        if (c2()) {
            int size = (this.O * 2 * this.M.size()) + getTotalWidth();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), i11);
            O1(size, true);
            return;
        }
        super.onMeasure(i10, i11);
        O1(getMeasuredWidth(), false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f24062f0 || this.f24063g0 != 0.0f || super.onTouchEvent(motionEvent);
    }

    @Override
    public void s() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null) {
                childAt.requestLayout();
            }
        }
    }

    public void setDisabledFactor(float f10) {
        if (this.f24063g0 != f10) {
            this.f24063g0 = f10;
            invalidate();
        }
    }

    public void setFitsParentWidth(boolean z10) {
        this.S = z10;
    }

    public void setItems(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new b(str));
        }
        setItems(arrayList);
    }

    public void setOnItemClickListener(c cVar) {
        this.T = cVar;
    }

    public void setOnSlideOffListener(d dVar) {
        this.f24070n0 = dVar;
    }

    public void setOverlayFactor(float f10) {
        if (this.f24064h0 != f10) {
            this.f24064h0 = f10;
            invalidate();
        }
    }

    public void setSelectionFactor(float f10) {
        if (this.f24058b0 != f10) {
            this.f24058b0 = f10;
            int i10 = this.f24061e0;
            if (i10 != -1 && ((int) f10) == i10 && f10 % 1.0f == 0.0f) {
                this.f24061e0 = -1;
                this.f24060d0 = -1;
            }
            R1(f10, true);
            invalidate();
        }
    }

    public void setTextPadding(int i10) {
        this.O = i10;
    }

    public void setTouchDisabled(boolean z10) {
        if (this.f24062f0 != z10) {
            this.f24062f0 = z10;
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != null && (childAt instanceof a)) {
                    childAt.setEnabled(!z10);
                }
            }
        }
    }

    public static class b {
        public final String f24074a;
        public final boolean f24075b;
        public final int f24076c;
        public Drawable f24077d;
        public int f24078e;
        public String f24079f;
        public int f24080g;

        public b(String str) {
            this.f24074a = str;
            this.f24075b = g.M0(str);
            this.f24076c = 0;
        }

        public void d(TextPaint textPaint) {
            int i10;
            String str = this.f24074a;
            if (str != null) {
                i10 = (int) v0.T1(str, textPaint);
            } else {
                i10 = this.f24076c != 0 ? a0.i(24.0f) + a0.i(6.0f) : 0;
            }
            this.f24078e = i10;
        }

        public Drawable e() {
            int i10;
            if (this.f24077d == null && (i10 = this.f24076c) != 0) {
                this.f24077d = ce.c.f(i10);
            }
            return this.f24077d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f24076c == this.f24076c && i.c(bVar.f24074a, this.f24074a)) {
                    return true;
                }
            }
            return false;
        }

        public void f(int i10, TextPaint textPaint) {
            String str = this.f24074a;
            if (str != null) {
                String charSequence = TextUtils.ellipsize(str, textPaint, i10, TextUtils.TruncateAt.END).toString();
                this.f24079f = charSequence;
                this.f24080g = (int) v0.T1(charSequence, textPaint);
                return;
            }
            this.f24079f = null;
            this.f24080g = this.f24078e;
        }

        public void g() {
            this.f24079f = this.f24074a;
            this.f24080g = this.f24078e;
        }

        public b(int i10) {
            this.f24074a = null;
            this.f24075b = false;
            this.f24076c = i10;
        }
    }

    public void setItems(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(new b(i10));
        }
        setItems(arrayList);
    }

    public void setItems(List<b> list) {
        boolean z10;
        List<b> list2 = this.M;
        int i10 = 0;
        if (list2 != null && list2.size() == list.size()) {
            Iterator<b> it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                i11++;
                if (!it.next().equals(this.M.get(i11))) {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                return;
            }
        }
        removeAllViews();
        this.M = list;
        this.V = 0;
        this.W = 0;
        int n02 = j.n0();
        int i12 = 0;
        for (b bVar : list) {
            bVar.d(y.t0(n02, bVar.f24075b));
            this.V += bVar.f24078e + (this.O * 2);
            addView(P1(i12));
            i12++;
        }
        if (!list.isEmpty()) {
            i10 = this.V / list.size();
        }
        this.N = i10;
    }
}
