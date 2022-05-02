package td;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1362c;
import be.C1399s0;
import be.C1410y;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p335xd.C10189d;
import p364zd.C11524j;

public class View$OnClickListenerC9156b5 extends FrameLayoutFix implements AbstractC9165c2, View.OnClickListener, View.OnLongClickListener {
    public List<C9158b> f29507M;
    public int f29508N;
    public int f29510P;
    public int f29512R;
    public boolean f29513S;
    public AbstractC9159c f29514T;
    public boolean f29515U;
    public int f29516V;
    public int f29517W;
    public int f29518a0;
    public float f29519b0;
    public AbstractC9161e f29520c0;
    public boolean f29523f0;
    public float f29524g0;
    public float f29525h0;
    public int f29526i0;
    public int f29527j0;
    public int f29528k0;
    public int f29529l0;
    public float f29530m0;
    public AbstractC9160d f29531n0;
    public int f29511Q = R.id.theme_color_headerText;
    public int f29521d0 = -1;
    public int f29522e0 = -1;
    public int f29509O = C1357a0.m37541i(19.0f);

    public static class C9157a extends View {
        public View$OnClickListenerC9156b5 f29532M;
        public int f29533N;
        public boolean f29534a;
        public boolean f29535b;
        public ViewParent f29536c;

        public C9157a(Context context) {
            super(context);
            C1399s0.m37193a0(this);
        }

        public void m10148b(View$OnClickListenerC9156b5 b5Var) {
            this.f29532M = b5Var;
        }

        public void m10147c(int i) {
            this.f29533N = i;
        }

        @Override
        public void onMeasure(int i, int i2) {
            if (this.f29532M.m10150d2()) {
                int i3 = 0;
                for (int i4 = 0; i4 < this.f29533N; i4++) {
                    i3 += ((C9158b) this.f29532M.f29507M.get(i4)).f29541e + (this.f29532M.f29509O * 2);
                }
                int i5 = ((C9158b) this.f29532M.f29507M.get(this.f29533N)).f29541e + (this.f29532M.f29509O * 2);
                if (C4403w.m27984G2()) {
                    i3 = (View.MeasureSpec.getSize(i) - i3) - i5;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, Log.TAG_TDLIB_OPTIONS), i2);
                setTranslationX(i3);
                return;
            }
            int N1 = this.f29532M.m10163N1(View.MeasureSpec.getSize(i));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(N1, Log.TAG_TDLIB_OPTIONS), i2);
            setTranslationX(N1 * this.f29533N);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View$OnClickListenerC9156b5 b5Var = this.f29532M;
            AbstractC9160d dVar = b5Var != null ? b5Var.f29531n0 : null;
            if (dVar == null) {
                return ((View) getParent()).getAlpha() >= 1.0f && super.onTouchEvent(motionEvent);
            }
            super.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0) {
                ViewParent viewParent = this.f29536c;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                    this.f29536c = null;
                }
                boolean d = dVar.mo10136d(this, motionEvent, this.f29533N);
                this.f29535b = d;
                if (d) {
                    ViewParent parent = getParent();
                    this.f29536c = parent;
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            if (!this.f29535b) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 1) {
                if (this.f29534a) {
                    this.f29534a = false;
                    dVar.mo10139a(this, motionEvent, this.f29533N, true);
                }
                ViewParent viewParent2 = this.f29536c;
                if (viewParent2 != null) {
                    viewParent2.requestDisallowInterceptTouchEvent(false);
                    this.f29536c = null;
                }
            } else if (action == 2) {
                boolean z = motionEvent.getY() >= ((float) getMeasuredHeight());
                if (this.f29534a != z) {
                    this.f29534a = z;
                    if (z) {
                        dVar.mo10137c(this, motionEvent, this.f29533N);
                    } else {
                        dVar.mo10139a(this, motionEvent, this.f29533N, false);
                    }
                }
                if (z) {
                    dVar.mo10138b(this, motionEvent, this.f29533N);
                }
            } else if (action == 3) {
                if (this.f29534a) {
                    this.f29534a = false;
                    dVar.mo10139a(this, motionEvent, this.f29533N, false);
                }
                ViewParent viewParent3 = this.f29536c;
                if (viewParent3 != null) {
                    viewParent3.requestDisallowInterceptTouchEvent(false);
                    this.f29536c = null;
                }
            }
            return true;
        }
    }

    public interface AbstractC9159c {
        void mo8849k2(int i);
    }

    public interface AbstractC9160d {
        void mo10139a(View view, MotionEvent motionEvent, int i, boolean z);

        void mo10138b(View view, MotionEvent motionEvent, int i);

        void mo10137c(View view, MotionEvent motionEvent, int i);

        boolean mo10136d(View view, MotionEvent motionEvent, int i);
    }

    public interface AbstractC9161e {
        void mo8805S(int i, int i2, int i3, int i4, float f, boolean z);
    }

    public View$OnClickListenerC9156b5(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public void m10162O1() {
        m10159T1(this.f29519b0, true);
        invalidate();
    }

    private int getTotalWidth() {
        int i = 0;
        for (C9158b bVar : this.f29507M) {
            i += bVar.f29541e;
        }
        return i;
    }

    public void m10166J1(String str) {
        m10164M1(new C9158b(str), -1);
    }

    public void m10165L1(String str, int i) {
        m10164M1(new C9158b(str), i);
    }

    public void m10164M1(C9158b bVar, int i) {
        if (i == -1) {
            i = this.f29507M.size();
        }
        if (i == this.f29507M.size()) {
            this.f29507M.add(bVar);
        } else {
            this.f29507M.add(i, bVar);
        }
        TextPaint t0 = C1410y.m37012t0(C11524j.m161p0(), bVar.f29538b);
        bVar.m10143d(t0);
        int i2 = bVar.f29541e;
        int i3 = this.f29516V + (this.f29509O * 2) + i2;
        this.f29516V = i3;
        this.f29508N = i3 / this.f29507M.size();
        int N1 = m10163N1(i2);
        this.f29518a0 = N1;
        float f = this.f29519b0;
        if (i <= ((int) f)) {
            this.f29519b0 = f + 1.0f;
        }
        int i4 = N1 - (this.f29509O * 2);
        if (m10150d2() || i2 >= i4) {
            bVar.m10140g();
        } else {
            bVar.m10141f(i4, t0);
        }
        addView(m10160S1(this.f29507M.size() - 1));
        invalidate();
    }

    public final int m10163N1(int i) {
        int min = Math.min(i / this.f29507M.size(), this.f29508N);
        if (i - (this.f29507M.size() * min) < min / 2) {
            return i / this.f29507M.size();
        }
        return this.f29513S ? Math.max(min, Math.min((int) (min * 2.0f), i / this.f29507M.size())) : min;
    }

    public final void m10161Q1(int i, boolean z) {
        int i2;
        if (i != 0 && (i2 = this.f29517W) != i && this.f29507M != null) {
            boolean z2 = i2 != 0;
            this.f29517W = i;
            this.f29518a0 = m10163N1(i);
            int p0 = C11524j.m161p0();
            int i3 = this.f29518a0 - (this.f29509O * 2);
            for (C9158b bVar : this.f29507M) {
                if (z || bVar.f29541e >= i3) {
                    bVar.m10140g();
                } else {
                    bVar.m10141f(i3, C1410y.m37012t0(p0, bVar.f29538b));
                }
            }
            if (z2) {
                postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC9156b5.this.m10162O1();
                    }
                }, 10L);
            } else {
                m10159T1(this.f29519b0, true);
            }
        }
    }

    public final C9157a m10160S1(int i) {
        C9157a aVar = new C9157a(getContext());
        if (this.f29515U) {
            C10189d.m5795i(aVar);
        } else {
            C10189d.m5793k(aVar);
        }
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        aVar.setOnClickListener(this);
        aVar.setOnLongClickListener(this);
        aVar.m10148b(this);
        aVar.m10147c(i);
        return aVar;
    }

    public final void m10159T1(float r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9156b5.m10159T1(float, boolean):void");
    }

    public void m10158U1(int i) {
        if (i < 0 || i >= this.f29507M.size()) {
            throw new IllegalArgumentException(i + " is out of range 0.." + this.f29507M.size());
        }
        this.f29507M.remove(i);
        if (((int) this.f29519b0) >= this.f29507M.size()) {
            this.f29519b0 -= 1.0f;
        }
        removeViewAt(i);
        invalidate();
    }

    public void m10157V1() {
        if (!this.f29507M.isEmpty()) {
            m10158U1(this.f29507M.size() - 1);
        }
    }

    public void m10156W1(int i, int i2) {
        if (i != i2 || i == -1) {
            this.f29521d0 = i;
            this.f29522e0 = i2;
            if (i2 != -1) {
                m10159T1(i2, false);
            }
        }
    }

    public void m10155X1(int i, String str) {
        C9158b bVar = new C9158b(str);
        this.f29507M.set(i, bVar);
        this.f29516V -= this.f29507M.get(i).f29541e + (this.f29509O * 2);
        bVar.m10143d(C1410y.m37012t0(C11524j.m161p0(), bVar.f29538b));
        int i2 = this.f29516V + bVar.f29541e + (this.f29509O * 2);
        this.f29516V = i2;
        this.f29508N = i2 / this.f29507M.size();
        this.f29517W = 0;
        requestLayout();
        invalidate();
    }

    public View$OnClickListenerC9156b5 m10154Y1(AbstractC9161e eVar) {
        this.f29520c0 = eVar;
        return this;
    }

    public boolean m10153Z1(int i) {
        if (this.f29512R == i) {
            return false;
        }
        this.f29512R = i;
        invalidate();
        return true;
    }

    public boolean m10152a2(int i, int i2) {
        if (this.f29510P == i && this.f29511Q == i2) {
            return false;
        }
        this.f29510P = i;
        this.f29511Q = i2;
        invalidate();
        return true;
    }

    public void m10151b2() {
        this.f29515U = true;
    }

    public final boolean m10150d2() {
        return getLayoutParams().width == -2;
    }

    @Override
    public void draw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9156b5.draw(android.graphics.Canvas):void");
    }

    @Override
    public void onClick(View view) {
        if (this.f29514T != null && (view instanceof C9157a)) {
            this.f29514T.mo8849k2(((C9157a) view).f29533N);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f29524g0 != 0.0f;
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (m10150d2()) {
            int size = (this.f29509O * 2 * this.f29507M.size()) + getTotalWidth();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), i2);
            m10161Q1(size, true);
            return;
        }
        super.onMeasure(i, i2);
        m10161Q1(getMeasuredWidth(), false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f29523f0 || this.f29524g0 != 0.0f || super.onTouchEvent(motionEvent);
    }

    @Override
    public void mo8255s() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                childAt.requestLayout();
            }
        }
    }

    public void setDisabledFactor(float f) {
        if (this.f29524g0 != f) {
            this.f29524g0 = f;
            invalidate();
        }
    }

    public void setFitsParentWidth(boolean z) {
        this.f29513S = z;
    }

    public void setItems(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C9158b(str));
        }
        setItems(arrayList);
    }

    public void setOnItemClickListener(AbstractC9159c cVar) {
        this.f29514T = cVar;
    }

    public void setOnSlideOffListener(AbstractC9160d dVar) {
        this.f29531n0 = dVar;
    }

    public void setOverlayFactor(float f) {
        if (this.f29525h0 != f) {
            this.f29525h0 = f;
            invalidate();
        }
    }

    public void setSelectionFactor(float f) {
        if (this.f29519b0 != f) {
            this.f29519b0 = f;
            int i = this.f29522e0;
            if (i != -1 && ((int) f) == i && f % 1.0f == 0.0f) {
                this.f29522e0 = -1;
                this.f29521d0 = -1;
            }
            m10159T1(f, true);
            invalidate();
        }
    }

    public void setTextPadding(int i) {
        this.f29509O = i;
    }

    public void setTouchDisabled(boolean z) {
        if (this.f29523f0 != z) {
            this.f29523f0 = z;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt != null && (childAt instanceof C9157a)) {
                    childAt.setEnabled(!z);
                }
            }
        }
    }

    public static class C9158b {
        public final String f29537a;
        public final boolean f29538b;
        public final int f29539c;
        public Drawable f29540d;
        public int f29541e;
        public String f29542f;
        public int f29543g;

        public C9158b(String str) {
            this.f29537a = str;
            this.f29538b = RunnableC5390g.m22983M0(str);
            this.f29539c = 0;
        }

        public void m10143d(TextPaint textPaint) {
            int i;
            String str = this.f29537a;
            if (str != null) {
                i = (int) C7389v0.m16680T1(str, textPaint);
            } else {
                i = this.f29539c != 0 ? C1357a0.m37541i(24.0f) + C1357a0.m37541i(6.0f) : 0;
            }
            this.f29541e = i;
        }

        public Drawable m10142e() {
            int i;
            if (this.f29540d == null && (i = this.f29539c) != 0) {
                this.f29540d = C1362c.m37483f(i);
            }
            return this.f29540d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9158b) {
                C9158b bVar = (C9158b) obj;
                if (bVar.f29539c == this.f29539c && C5070i.m24067c(bVar.f29537a, this.f29537a)) {
                    return true;
                }
            }
            return false;
        }

        public void m10141f(int i, TextPaint textPaint) {
            String str = this.f29537a;
            if (str != null) {
                String charSequence = TextUtils.ellipsize(str, textPaint, i, TextUtils.TruncateAt.END).toString();
                this.f29542f = charSequence;
                this.f29543g = (int) C7389v0.m16680T1(charSequence, textPaint);
                return;
            }
            this.f29542f = null;
            this.f29543g = this.f29541e;
        }

        public void m10140g() {
            this.f29542f = this.f29537a;
            this.f29543g = this.f29541e;
        }

        public C9158b(int i) {
            this.f29537a = null;
            this.f29538b = false;
            this.f29539c = i;
        }
    }

    public void setItems(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(new C9158b(i));
        }
        setItems(arrayList);
    }

    public void setItems(List<C9158b> list) {
        boolean z;
        List<C9158b> list2 = this.f29507M;
        int i = 0;
        if (list2 != null && list2.size() == list.size()) {
            Iterator<C9158b> it = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                i2++;
                if (!it.next().equals(this.f29507M.get(i2))) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        removeAllViews();
        this.f29507M = list;
        this.f29516V = 0;
        this.f29517W = 0;
        int p0 = C11524j.m161p0();
        int i3 = 0;
        for (C9158b bVar : list) {
            bVar.m10143d(C1410y.m37012t0(p0, bVar.f29538b));
            this.f29516V += bVar.f29541e + (this.f29509O * 2);
            addView(m10160S1(i3));
            i3++;
        }
        if (!list.isEmpty()) {
            i = this.f29516V / list.size();
        }
        this.f29508N = i;
    }
}
