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
    public List<C9158b> f29510M;
    public int f29511N;
    public int f29513P;
    public int f29515R;
    public boolean f29516S;
    public AbstractC9159c f29517T;
    public boolean f29518U;
    public int f29519V;
    public int f29520W;
    public int f29521a0;
    public float f29522b0;
    public AbstractC9161e f29523c0;
    public boolean f29526f0;
    public float f29527g0;
    public float f29528h0;
    public int f29529i0;
    public int f29530j0;
    public int f29531k0;
    public int f29532l0;
    public float f29533m0;
    public AbstractC9160d f29534n0;
    public int f29514Q = R.id.theme_color_headerText;
    public int f29524d0 = -1;
    public int f29525e0 = -1;
    public int f29512O = C1357a0.m37544i(19.0f);

    public static class C9157a extends View {
        public View$OnClickListenerC9156b5 f29535M;
        public int f29536N;
        public boolean f29537a;
        public boolean f29538b;
        public ViewParent f29539c;

        public C9157a(Context context) {
            super(context);
            C1399s0.m37196a0(this);
        }

        public void m10147b(View$OnClickListenerC9156b5 b5Var) {
            this.f29535M = b5Var;
        }

        public void m10146c(int i) {
            this.f29536N = i;
        }

        @Override
        public void onMeasure(int i, int i2) {
            if (this.f29535M.m10149d2()) {
                int i3 = 0;
                for (int i4 = 0; i4 < this.f29536N; i4++) {
                    i3 += ((C9158b) this.f29535M.f29510M.get(i4)).f29544e + (this.f29535M.f29512O * 2);
                }
                int i5 = ((C9158b) this.f29535M.f29510M.get(this.f29536N)).f29544e + (this.f29535M.f29512O * 2);
                if (C4403w.m27986G2()) {
                    i3 = (View.MeasureSpec.getSize(i) - i3) - i5;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, Log.TAG_TDLIB_OPTIONS), i2);
                setTranslationX(i3);
                return;
            }
            int N1 = this.f29535M.m10162N1(View.MeasureSpec.getSize(i));
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(N1, Log.TAG_TDLIB_OPTIONS), i2);
            setTranslationX(N1 * this.f29536N);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            View$OnClickListenerC9156b5 b5Var = this.f29535M;
            AbstractC9160d dVar = b5Var != null ? b5Var.f29534n0 : null;
            if (dVar == null) {
                return ((View) getParent()).getAlpha() >= 1.0f && super.onTouchEvent(motionEvent);
            }
            super.onTouchEvent(motionEvent);
            if (motionEvent.getAction() == 0) {
                ViewParent viewParent = this.f29539c;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                    this.f29539c = null;
                }
                boolean d = dVar.mo10135d(this, motionEvent, this.f29536N);
                this.f29538b = d;
                if (d) {
                    ViewParent parent = getParent();
                    this.f29539c = parent;
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
            if (!this.f29538b) {
                return true;
            }
            int action = motionEvent.getAction();
            if (action == 1) {
                if (this.f29537a) {
                    this.f29537a = false;
                    dVar.mo10138a(this, motionEvent, this.f29536N, true);
                }
                ViewParent viewParent2 = this.f29539c;
                if (viewParent2 != null) {
                    viewParent2.requestDisallowInterceptTouchEvent(false);
                    this.f29539c = null;
                }
            } else if (action == 2) {
                boolean z = motionEvent.getY() >= ((float) getMeasuredHeight());
                if (this.f29537a != z) {
                    this.f29537a = z;
                    if (z) {
                        dVar.mo10136c(this, motionEvent, this.f29536N);
                    } else {
                        dVar.mo10138a(this, motionEvent, this.f29536N, false);
                    }
                }
                if (z) {
                    dVar.mo10137b(this, motionEvent, this.f29536N);
                }
            } else if (action == 3) {
                if (this.f29537a) {
                    this.f29537a = false;
                    dVar.mo10138a(this, motionEvent, this.f29536N, false);
                }
                ViewParent viewParent3 = this.f29539c;
                if (viewParent3 != null) {
                    viewParent3.requestDisallowInterceptTouchEvent(false);
                    this.f29539c = null;
                }
            }
            return true;
        }
    }

    public interface AbstractC9159c {
        void mo8849k2(int i);
    }

    public interface AbstractC9160d {
        void mo10138a(View view, MotionEvent motionEvent, int i, boolean z);

        void mo10137b(View view, MotionEvent motionEvent, int i);

        void mo10136c(View view, MotionEvent motionEvent, int i);

        boolean mo10135d(View view, MotionEvent motionEvent, int i);
    }

    public interface AbstractC9161e {
        void mo8805S(int i, int i2, int i3, int i4, float f, boolean z);
    }

    public View$OnClickListenerC9156b5(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public void m10161O1() {
        m10158T1(this.f29522b0, true);
        invalidate();
    }

    private int getTotalWidth() {
        int i = 0;
        for (C9158b bVar : this.f29510M) {
            i += bVar.f29544e;
        }
        return i;
    }

    public void m10165J1(String str) {
        m10163M1(new C9158b(str), -1);
    }

    public void m10164L1(String str, int i) {
        m10163M1(new C9158b(str), i);
    }

    public void m10163M1(C9158b bVar, int i) {
        if (i == -1) {
            i = this.f29510M.size();
        }
        if (i == this.f29510M.size()) {
            this.f29510M.add(bVar);
        } else {
            this.f29510M.add(i, bVar);
        }
        TextPaint t0 = C1410y.m37015t0(C11524j.m161p0(), bVar.f29541b);
        bVar.m10142d(t0);
        int i2 = bVar.f29544e;
        int i3 = this.f29519V + (this.f29512O * 2) + i2;
        this.f29519V = i3;
        this.f29511N = i3 / this.f29510M.size();
        int N1 = m10162N1(i2);
        this.f29521a0 = N1;
        float f = this.f29522b0;
        if (i <= ((int) f)) {
            this.f29522b0 = f + 1.0f;
        }
        int i4 = N1 - (this.f29512O * 2);
        if (m10149d2() || i2 >= i4) {
            bVar.m10139g();
        } else {
            bVar.m10140f(i4, t0);
        }
        addView(m10159S1(this.f29510M.size() - 1));
        invalidate();
    }

    public final int m10162N1(int i) {
        int min = Math.min(i / this.f29510M.size(), this.f29511N);
        if (i - (this.f29510M.size() * min) < min / 2) {
            return i / this.f29510M.size();
        }
        return this.f29516S ? Math.max(min, Math.min((int) (min * 2.0f), i / this.f29510M.size())) : min;
    }

    public final void m10160Q1(int i, boolean z) {
        int i2;
        if (i != 0 && (i2 = this.f29520W) != i && this.f29510M != null) {
            boolean z2 = i2 != 0;
            this.f29520W = i;
            this.f29521a0 = m10162N1(i);
            int p0 = C11524j.m161p0();
            int i3 = this.f29521a0 - (this.f29512O * 2);
            for (C9158b bVar : this.f29510M) {
                if (z || bVar.f29544e >= i3) {
                    bVar.m10139g();
                } else {
                    bVar.m10140f(i3, C1410y.m37015t0(p0, bVar.f29541b));
                }
            }
            if (z2) {
                postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC9156b5.this.m10161O1();
                    }
                }, 10L);
            } else {
                m10158T1(this.f29522b0, true);
            }
        }
    }

    public final C9157a m10159S1(int i) {
        C9157a aVar = new C9157a(getContext());
        if (this.f29518U) {
            C10189d.m5795i(aVar);
        } else {
            C10189d.m5793k(aVar);
        }
        aVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        aVar.setOnClickListener(this);
        aVar.setOnLongClickListener(this);
        aVar.m10147b(this);
        aVar.m10146c(i);
        return aVar;
    }

    public final void m10158T1(float r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9156b5.m10158T1(float, boolean):void");
    }

    public void m10157U1(int i) {
        if (i < 0 || i >= this.f29510M.size()) {
            throw new IllegalArgumentException(i + " is out of range 0.." + this.f29510M.size());
        }
        this.f29510M.remove(i);
        if (((int) this.f29522b0) >= this.f29510M.size()) {
            this.f29522b0 -= 1.0f;
        }
        removeViewAt(i);
        invalidate();
    }

    public void m10156V1() {
        if (!this.f29510M.isEmpty()) {
            m10157U1(this.f29510M.size() - 1);
        }
    }

    public void m10155W1(int i, int i2) {
        if (i != i2 || i == -1) {
            this.f29524d0 = i;
            this.f29525e0 = i2;
            if (i2 != -1) {
                m10158T1(i2, false);
            }
        }
    }

    public void m10154X1(int i, String str) {
        C9158b bVar = new C9158b(str);
        this.f29510M.set(i, bVar);
        this.f29519V -= this.f29510M.get(i).f29544e + (this.f29512O * 2);
        bVar.m10142d(C1410y.m37015t0(C11524j.m161p0(), bVar.f29541b));
        int i2 = this.f29519V + bVar.f29544e + (this.f29512O * 2);
        this.f29519V = i2;
        this.f29511N = i2 / this.f29510M.size();
        this.f29520W = 0;
        requestLayout();
        invalidate();
    }

    public View$OnClickListenerC9156b5 m10153Y1(AbstractC9161e eVar) {
        this.f29523c0 = eVar;
        return this;
    }

    public boolean m10152Z1(int i) {
        if (this.f29515R == i) {
            return false;
        }
        this.f29515R = i;
        invalidate();
        return true;
    }

    public boolean m10151a2(int i, int i2) {
        if (this.f29513P == i && this.f29514Q == i2) {
            return false;
        }
        this.f29513P = i;
        this.f29514Q = i2;
        invalidate();
        return true;
    }

    public void m10150b2() {
        this.f29518U = true;
    }

    public final boolean m10149d2() {
        return getLayoutParams().width == -2;
    }

    @Override
    public void draw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: td.View$OnClickListenerC9156b5.draw(android.graphics.Canvas):void");
    }

    @Override
    public void onClick(View view) {
        if (this.f29517T != null && (view instanceof C9157a)) {
            this.f29517T.mo8849k2(((C9157a) view).f29536N);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f29527g0 != 0.0f;
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }

    @Override
    public void onMeasure(int i, int i2) {
        if (m10149d2()) {
            int size = (this.f29512O * 2 * this.f29510M.size()) + getTotalWidth();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Log.TAG_TDLIB_OPTIONS), i2);
            m10160Q1(size, true);
            return;
        }
        super.onMeasure(i, i2);
        m10160Q1(getMeasuredWidth(), false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f29526f0 || this.f29527g0 != 0.0f || super.onTouchEvent(motionEvent);
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
        if (this.f29527g0 != f) {
            this.f29527g0 = f;
            invalidate();
        }
    }

    public void setFitsParentWidth(boolean z) {
        this.f29516S = z;
    }

    public void setItems(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C9158b(str));
        }
        setItems(arrayList);
    }

    public void setOnItemClickListener(AbstractC9159c cVar) {
        this.f29517T = cVar;
    }

    public void setOnSlideOffListener(AbstractC9160d dVar) {
        this.f29534n0 = dVar;
    }

    public void setOverlayFactor(float f) {
        if (this.f29528h0 != f) {
            this.f29528h0 = f;
            invalidate();
        }
    }

    public void setSelectionFactor(float f) {
        if (this.f29522b0 != f) {
            this.f29522b0 = f;
            int i = this.f29525e0;
            if (i != -1 && ((int) f) == i && f % 1.0f == 0.0f) {
                this.f29525e0 = -1;
                this.f29524d0 = -1;
            }
            m10158T1(f, true);
            invalidate();
        }
    }

    public void setTextPadding(int i) {
        this.f29512O = i;
    }

    public void setTouchDisabled(boolean z) {
        if (this.f29526f0 != z) {
            this.f29526f0 = z;
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
        public final String f29540a;
        public final boolean f29541b;
        public final int f29542c;
        public Drawable f29543d;
        public int f29544e;
        public String f29545f;
        public int f29546g;

        public C9158b(String str) {
            this.f29540a = str;
            this.f29541b = RunnableC5390g.m22984M0(str);
            this.f29542c = 0;
        }

        public void m10142d(TextPaint textPaint) {
            int i;
            String str = this.f29540a;
            if (str != null) {
                i = (int) C7389v0.m16680T1(str, textPaint);
            } else {
                i = this.f29542c != 0 ? C1357a0.m37544i(24.0f) + C1357a0.m37544i(6.0f) : 0;
            }
            this.f29544e = i;
        }

        public Drawable m10141e() {
            int i;
            if (this.f29543d == null && (i = this.f29542c) != 0) {
                this.f29543d = C1362c.m37486f(i);
            }
            return this.f29543d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C9158b) {
                C9158b bVar = (C9158b) obj;
                if (bVar.f29542c == this.f29542c && C5070i.m24068c(bVar.f29540a, this.f29540a)) {
                    return true;
                }
            }
            return false;
        }

        public void m10140f(int i, TextPaint textPaint) {
            String str = this.f29540a;
            if (str != null) {
                String charSequence = TextUtils.ellipsize(str, textPaint, i, TextUtils.TruncateAt.END).toString();
                this.f29545f = charSequence;
                this.f29546g = (int) C7389v0.m16680T1(charSequence, textPaint);
                return;
            }
            this.f29545f = null;
            this.f29546g = this.f29544e;
        }

        public void m10139g() {
            this.f29545f = this.f29540a;
            this.f29546g = this.f29544e;
        }

        public C9158b(int i) {
            this.f29540a = null;
            this.f29541b = false;
            this.f29542c = i;
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
        List<C9158b> list2 = this.f29510M;
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
                if (!it.next().equals(this.f29510M.get(i2))) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        removeAllViews();
        this.f29510M = list;
        this.f29519V = 0;
        this.f29520W = 0;
        int p0 = C11524j.m161p0();
        int i3 = 0;
        for (C9158b bVar : list) {
            bVar.m10142d(C1410y.m37015t0(p0, bVar.f29541b));
            this.f29519V += bVar.f29544e + (this.f29512O * 2);
            addView(m10159S1(i3));
            i3++;
        }
        if (!list.isEmpty()) {
            i = this.f29519V / list.size();
        }
        this.f29511N = i;
    }
}
