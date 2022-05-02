package me;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import java.util.ArrayList;
import java.util.Iterator;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p364zd.AbstractC11531p;
import p364zd.C11514c0;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class View$OnClickListenerC6999q1<T> extends RecyclerView implements View.OnClickListener {
    public AbstractC11531p f22190B1;
    public AbstractC7007h<T> f22191C1;
    public AbstractC9323v4<?> f22192D1;
    public AbstractC7004e<T> f22194F1;
    public final TextPaint f22195u1;
    public final LinearLayoutManager f22196v1;
    public final boolean f22197w1;
    public int f22198x1;
    public ArrayList<T> f22199y1;
    public int f22200z1;
    public boolean f22189A1 = true;
    public boolean f22193E1 = true;

    public class C7000a extends RecyclerView.AbstractC0901o {
        public final ArrayList f22201a;

        public C7000a(ArrayList arrayList) {
            this.f22201a = arrayList;
        }

        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int k0 = recyclerView.m39421k0(view);
            if (k0 == 0) {
                rect.top = (recyclerView.getMeasuredHeight() / 2) - (View$OnClickListenerC6999q1.getItemHeight() / 2);
            }
            if (k0 == this.f22201a.size() - 1) {
                rect.bottom = (recyclerView.getMeasuredHeight() / 2) - (View$OnClickListenerC6999q1.getItemHeight() / 2);
            }
        }
    }

    public class C7001b extends RecyclerView.AbstractC0910t {
        public boolean f22203a;
        public final ArrayList f22204b;

        public C7001b(ArrayList arrayList) {
            this.f22204b = arrayList;
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i == 1) {
                this.f22203a = true;
            }
            if (i == 0) {
                this.f22203a = false;
                if (View$OnClickListenerC6999q1.this.f22197w1) {
                    View C = View$OnClickListenerC6999q1.this.f22196v1.mo39262C(View$OnClickListenerC6999q1.this.f22196v1.m39549X1());
                    if (C != null) {
                        View$OnClickListenerC6999q1 q1Var = View$OnClickListenerC6999q1.this;
                        q1Var.setCurrentIndex(q1Var.m18114N1());
                        int i2 = -View$OnClickListenerC6999q1.this.f22196v1.m39231U(C);
                        if (i2 > 0) {
                            int itemHeight = View$OnClickListenerC6999q1.getItemHeight();
                            if (i2 > itemHeight) {
                                i2 %= itemHeight;
                            }
                            if (i2 <= itemHeight / 2) {
                                View$OnClickListenerC6999q1.this.mo8024v1(0, -i2);
                            } else {
                                View$OnClickListenerC6999q1.this.mo8024v1(0, itemHeight - i2);
                            }
                        } else {
                            View$OnClickListenerC6999q1 q1Var2 = View$OnClickListenerC6999q1.this;
                            q1Var2.setCurrentIndex(q1Var2.m18114N1());
                        }
                    }
                } else {
                    View$OnClickListenerC6999q1.this.m18110R1(View$OnClickListenerC6999q1.this.m18114N1(), true);
                }
            }
        }

        @Override
        public void mo421b(RecyclerView recyclerView, int i, int i2) {
            int X1 = View$OnClickListenerC6999q1.this.f22196v1.m39549X1();
            if (X1 != -1) {
                View C = View$OnClickListenerC6999q1.this.f22196v1.mo39262C(X1);
                if (C != null) {
                    ((C7005f) C).m18103b();
                    if (View$OnClickListenerC6999q1.this.f22197w1 && X1 < this.f22204b.size() - View$OnClickListenerC6999q1.this.f22200z1 && i2 <= 0) {
                        View$OnClickListenerC6999q1.this.f22196v1.m39522z2(this.f22204b.size() + X1, C.getTop());
                    }
                }
                int a2 = View$OnClickListenerC6999q1.this.f22196v1.m39546a2();
                View C2 = View$OnClickListenerC6999q1.this.f22196v1.mo39262C(a2);
                if (C2 != null) {
                    ((C7005f) C2).m18103b();
                    if (View$OnClickListenerC6999q1.this.f22197w1 && a2 > this.f22204b.size() + View$OnClickListenerC6999q1.this.f22200z1 && i2 > 0) {
                        View$OnClickListenerC6999q1.this.f22196v1.m39522z2(a2 - this.f22204b.size(), C2.getTop());
                    }
                }
                while (true) {
                    X1++;
                    if (X1 >= a2) {
                        break;
                    }
                    View C3 = View$OnClickListenerC6999q1.this.f22196v1.mo39262C(X1);
                    if (C3 != null) {
                        ((C7005f) C3).m18103b();
                    }
                }
                if (!View$OnClickListenerC6999q1.this.f22197w1 && this.f22203a) {
                    View$OnClickListenerC6999q1 q1Var = View$OnClickListenerC6999q1.this;
                    q1Var.setCurrentIndex(q1Var.m18114N1());
                }
            }
        }
    }

    public static class C7002c<T> extends RecyclerView.AbstractC0890h<C7006g> {
        public final Context f22206M;
        public final View.OnClickListener f22207N;
        public final AbstractC9323v4<?> f22208O;
        public final ArrayList<C7003d<T>> f22209P;
        public final boolean f22210Q;

        public C7002c(Context context, View.OnClickListener onClickListener, boolean z, boolean z2, int i, ArrayList<T> arrayList, TextPaint textPaint, AbstractC9323v4<?> v4Var) {
            this.f22206M = context;
            this.f22207N = onClickListener;
            this.f22210Q = z;
            this.f22208O = v4Var;
            ArrayList<C7003d<T>> arrayList2 = new ArrayList<>();
            this.f22209P = arrayList2;
            arrayList2.ensureCapacity(arrayList.size());
            Iterator<T> it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                this.f22209P.add(new C7003d<>(i2, it.next(), textPaint, i, z2));
                i2++;
            }
        }

        @Override
        public int mo6153D() {
            return this.f22210Q ? this.f22209P.size() * 2 : this.f22209P.size();
        }

        public void mo6146Q(C7006g gVar, int i) {
            ArrayList<C7003d<T>> arrayList = this.f22209P;
            gVar.m18100P(arrayList.get(i % arrayList.size()));
        }

        public C7006g mo6145S(ViewGroup viewGroup, int i) {
            return C7006g.m18101O(this.f22206M, this.f22207N, this.f22208O);
        }
    }

    public static class C7003d<T> {
        public final int f22211a;
        public final String f22212b;
        public final TextPaint f22213c;
        public final int f22214d;
        public final int f22215e;
        public final boolean f22216f;
        public int f22217g;
        public String f22218h;
        public int f22219i;

        public C7003d(int i, T t, TextPaint textPaint, int i2, boolean z) {
            this.f22211a = i;
            String obj = t.toString();
            this.f22212b = obj;
            this.f22216f = z;
            if (obj != null) {
                this.f22213c = textPaint;
                this.f22214d = (int) C7389v0.m16680T1(obj, textPaint);
            } else {
                this.f22213c = null;
                this.f22214d = 0;
            }
            this.f22215e = i2;
        }

        public void m18106b(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
            float f;
            if (this.f22212b != null) {
                int itemHeight = View$OnClickListenerC6999q1.getItemHeight();
                int i6 = this.f22215e;
                int i7 = (i6 * itemHeight) / 2;
                int i8 = i2 / 2;
                int i9 = i3 + i8;
                int i10 = i7 + 0;
                if (i9 >= i10 && i9 <= i7 + 0) {
                    f = 0.0f;
                } else if (i9 < i7) {
                    f = Math.min((i10 - i9) / (((i6 / 2) * itemHeight) + i8), 1.0f);
                } else {
                    f = Math.min(((i9 - i7) + 0) / (((i6 / 2) * itemHeight) + i8), 1.0f);
                }
                if (f == 0.0f) {
                    canvas.drawText(this.f22218h, (i4 + (i / 2)) - (this.f22219i / 2), i5 + i8 + C1357a0.m37541i(8.0f), this.f22213c);
                } else if (f < 1.0f) {
                    canvas.save();
                    float f2 = 1.0f - f;
                    int i11 = i4 + (i / 2);
                    int i12 = i5 + i8;
                    canvas.scale(1.0f, (0.55f * f2) + 0.45f, i11, i12);
                    this.f22213c.setAlpha((int) (f2 * 255.0f));
                    canvas.drawText(this.f22218h, i11 - (this.f22219i / 2), i12 + C1357a0.m37541i(8.0f), this.f22213c);
                    this.f22213c.setAlpha(255);
                    canvas.restore();
                }
            }
        }

        public void m18105c(int i) {
            if (this.f22217g != i && i != 0 && this.f22212b != null) {
                this.f22217g = i;
                int i2 = i - C1357a0.m37541i(36.0f);
                int i3 = this.f22214d;
                if (i3 <= i2 || !this.f22216f) {
                    this.f22218h = this.f22212b;
                    this.f22219i = i3;
                    return;
                }
                String charSequence = TextUtils.ellipsize(this.f22212b, this.f22213c, i2, TextUtils.TruncateAt.END).toString();
                this.f22218h = charSequence;
                this.f22219i = (int) C7389v0.m16680T1(charSequence, this.f22213c);
            }
        }
    }

    public interface AbstractC7004e<T> {
        void mo9972a(View$OnClickListenerC6999q1<T> q1Var, int i);
    }

    public static class C7005f extends View {
        public int f22220M;
        public C7003d<?> f22221a;
        public int f22222b;
        public int f22223c;

        public C7005f(Context context) {
            super(context);
            C1399s0.m37193a0(this);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }

        public C7003d<?> m18104a() {
            return this.f22221a;
        }

        public void m18103b() {
            if (this.f22222b != getMeasuredWidth() || this.f22223c != getMeasuredHeight() || this.f22220M != getTop()) {
                invalidate();
            }
        }

        public void m18102c(C7003d<?> dVar) {
            this.f22221a = dVar;
        }

        @Override
        public void onDraw(Canvas canvas) {
            C7003d<?> dVar = this.f22221a;
            if (dVar != null) {
                int measuredWidth = getMeasuredWidth();
                this.f22222b = measuredWidth;
                int measuredHeight = getMeasuredHeight();
                this.f22223c = measuredHeight;
                int top = getTop();
                this.f22220M = top;
                dVar.m18106b(canvas, measuredWidth, measuredHeight, top, 0, 0);
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View$OnClickListenerC6999q1.getItemHeight(), Log.TAG_TDLIB_OPTIONS));
            C7003d<?> dVar = this.f22221a;
            if (dVar != null) {
                dVar.m18105c(getMeasuredWidth());
            }
        }
    }

    public static class C7006g extends RecyclerView.AbstractC0886d0 {
        public C7006g(View view) {
            super(view);
        }

        public static C7006g m18101O(Context context, View.OnClickListener onClickListener, AbstractC9323v4<?> v4Var) {
            C7005f fVar = new C7005f(context);
            fVar.setOnClickListener(onClickListener);
            if (v4Var != null) {
                v4Var.m9163t8(fVar);
            }
            return new C7006g(fVar);
        }

        public void m18100P(C7003d<?> dVar) {
            ((C7005f) this.f3479a).m18102c(dVar);
        }
    }

    public interface AbstractC7007h<T> {
        int mo9875a(View$OnClickListenerC6999q1<T> q1Var, int i);
    }

    public View$OnClickListenerC6999q1(Context context, boolean z) {
        super(context);
        this.f22197w1 = z;
        TextPaint textPaint = new TextPaint(5);
        this.f22195u1 = textPaint;
        textPaint.setTypeface(C1389o.m37258k());
        textPaint.setColor(C11524j.m217S0());
        textPaint.setTextSize(C1357a0.m37541i(17.0f));
        setItemAnimator(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f22196v1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
    }

    public static int getItemHeight() {
        return C1357a0.m37541i(48.0f);
    }

    public void setCurrentIndex(int i) {
        if (this.f22198x1 != i) {
            this.f22198x1 = i;
            AbstractC7004e<T> eVar = this.f22194F1;
            if (eVar != null) {
                eVar.mo9972a(this, i);
            }
        }
    }

    public void m18115M1(AbstractC9323v4<?> v4Var) {
        this.f22192D1 = v4Var;
        if (this.f22190B1 == null && v4Var != null) {
            v4Var.m9140w8(this.f22195u1, R.id.theme_color_text);
        }
    }

    public final int m18114N1() {
        int X1 = this.f22196v1.m39549X1();
        if (X1 == -1) {
            return -1;
        }
        if (this.f22197w1) {
            return (X1 + (this.f22200z1 / 2)) % this.f22199y1.size();
        }
        View C = this.f22196v1.mo39262C(X1);
        int U = C != null ? this.f22196v1.m39231U(C) : 0;
        if (X1 > 0) {
            X1 += this.f22200z1 / 2;
        }
        int max = Math.max(0, Math.min(this.f22199y1.size() - 1, X1 + Math.round((-U) / getItemHeight())));
        AbstractC7007h<T> hVar = this.f22191C1;
        return hVar != null ? hVar.mo9875a(this, max) : max;
    }

    public void m18113O1() {
        setForcedTheme(C11514c0.m348a(2));
    }

    public T m18112P1(int i) {
        if (i < 0 || i >= this.f22199y1.size()) {
            return null;
        }
        return this.f22199y1.get(i);
    }

    public void m18111Q1(ArrayList<T> arrayList, int i) {
        this.f22198x1 = i;
        this.f22199y1 = arrayList;
        int min = Math.min(arrayList.size(), 5);
        this.f22200z1 = min;
        if (min % 2 == 0) {
            this.f22200z1 = min - 1;
        }
        if (this.f22200z1 > 0) {
            C7002c cVar = new C7002c(getContext(), this, this.f22197w1, this.f22193E1, this.f22200z1, arrayList, this.f22195u1, this.f22190B1 == null ? this.f22192D1 : null);
            setAdapter(cVar);
            if (this.f22197w1) {
                int D = cVar.mo6153D() / 2;
                int size = D - (D % arrayList.size());
                int i2 = this.f22200z1;
                int i3 = (size - (i2 / 2)) + i;
                if (i2 + i3 >= cVar.mo6153D()) {
                    i3 -= arrayList.size();
                } else if (i3 - this.f22200z1 < 0) {
                    i3 += arrayList.size();
                }
                this.f22196v1.m39522z2(i3, 0);
            } else {
                if (i == 0) {
                    this.f22196v1.m39522z2(0, 0);
                } else {
                    this.f22196v1.m39522z2(i, ((getItemHeight() * 5) / 2) - (getItemHeight() / 2));
                }
                m39434g(new C7000a(arrayList));
                setOverScrollMode(2);
            }
            m39422k(new C7001b(arrayList));
        }
    }

    public final void m18110R1(int i, boolean z) {
        int i2;
        int i3;
        setCurrentIndex(i);
        if (z && i != -1) {
            if (i > 0) {
                i3 = ((getItemHeight() * this.f22200z1) / 2) - (getItemHeight() / 2);
                i2 = getItemHeight() * i;
            } else {
                i3 = 0;
                i2 = 0;
            }
            m39496D1();
            int X1 = this.f22196v1.m39549X1();
            if (X1 != -1) {
                int itemHeight = getItemHeight() * X1;
                if (X1 > 0) {
                    itemHeight += (getMeasuredHeight() / 2) - (getItemHeight() / 2);
                }
                View C = this.f22196v1.mo39262C(X1);
                int i4 = itemHeight + (C != null ? -this.f22196v1.m39231U(C) : 0);
                if (i4 != i2) {
                    mo8024v1(0, i2 - i4);
                    return;
                }
                return;
            }
            this.f22196v1.m39522z2(i, i3);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f22189A1) {
            int measuredHeight = getMeasuredHeight() / 2;
            int itemHeight = getItemHeight() / 2;
            float f = measuredHeight - itemHeight;
            float measuredWidth = getMeasuredWidth();
            AbstractC11531p pVar = this.f22190B1;
            canvas.drawLine(0.0f, f, measuredWidth, f, C1410y.m37075E0(pVar != null ? pVar.mo92e(R.id.theme_color_separator) : C11524j.m223P0()));
            float f2 = measuredHeight + itemHeight;
            float measuredWidth2 = getMeasuredWidth();
            AbstractC11531p pVar2 = this.f22190B1;
            canvas.drawLine(0.0f, f2, measuredWidth2, f2, C1410y.m37075E0(pVar2 != null ? pVar2.mo92e(R.id.theme_color_separator) : C11524j.m223P0()));
        }
    }

    public int getCurrentIndex() {
        return this.f22198x1;
    }

    public T getCurrentItem() {
        return m18112P1(this.f22198x1);
    }

    public AbstractC7007h<T> getMinMaxProvider() {
        return this.f22191C1;
    }

    @Override
    public void onClick(View view) {
        C7003d<?> a;
        if (this.f22197w1) {
            if (view != null && !this.f22196v1.m39169y0()) {
                int top = view.getTop() - (getItemHeight() * 2);
                int itemHeight = top / getItemHeight();
                while (itemHeight < 0) {
                    itemHeight += this.f22199y1.size();
                }
                setCurrentIndex((m18114N1() + itemHeight) % this.f22199y1.size());
                mo8024v1(0, top);
            }
        } else if ((view instanceof C7005f) && (a = ((C7005f) view).m18104a()) != null) {
            AbstractC7007h<T> hVar = this.f22191C1;
            int i = a.f22211a;
            if (hVar != null) {
                i = hVar.mo9875a(this, i);
            }
            m18110R1(i, true);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getItemHeight() * this.f22200z1, Log.TAG_TDLIB_OPTIONS));
    }

    public void setCurrentItem(int i) {
        m18110R1(i, true);
    }

    public void setForcedTheme(AbstractC11531p pVar) {
        this.f22190B1 = pVar;
        this.f22195u1.setColor(pVar != null ? pVar.mo92e(R.id.theme_color_text) : C11524j.m217S0());
    }

    public void setItemChangeListener(AbstractC7004e<T> eVar) {
        this.f22194F1 = eVar;
    }

    public void setMinMaxProvider(AbstractC7007h<T> hVar) {
        this.f22191C1 = hVar;
    }

    public void setNeedSeparators(boolean z) {
        if (this.f22189A1 != z) {
            this.f22189A1 = z;
            invalidate();
        }
    }

    public void setTrimItems(boolean z) {
        this.f22193E1 = z;
    }
}
