package ne;

import ae.c0;
import ae.j;
import ae.p;
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
import ce.a0;
import ce.o;
import ce.p0;
import ce.y;
import java.util.ArrayList;
import java.util.Iterator;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;

public class q1<T> extends RecyclerView implements View.OnClickListener {
    public p A1;
    public h<T> B1;
    public v4<?> C1;
    public e<T> E1;
    public final TextPaint f18319t1;
    public final LinearLayoutManager f18320u1;
    public final boolean f18321v1;
    public int f18322w1;
    public ArrayList<T> f18323x1;
    public int f18324y1;
    public boolean f18325z1 = true;
    public boolean D1 = true;

    public class a extends RecyclerView.o {
        public final ArrayList f18326a;

        public a(ArrayList arrayList) {
            this.f18326a = arrayList;
        }

        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int k02 = recyclerView.k0(view);
            if (k02 == 0) {
                rect.top = (recyclerView.getMeasuredHeight() / 2) - (q1.getItemHeight() / 2);
            }
            if (k02 == this.f18326a.size() - 1) {
                rect.bottom = (recyclerView.getMeasuredHeight() / 2) - (q1.getItemHeight() / 2);
            }
        }
    }

    public class b extends RecyclerView.t {
        public boolean f18328a;
        public final ArrayList f18329b;

        public b(ArrayList arrayList) {
            this.f18329b = arrayList;
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 == 1) {
                this.f18328a = true;
            }
            if (i10 == 0) {
                this.f18328a = false;
                if (q1.this.f18321v1) {
                    View C = q1.this.f18320u1.C(q1.this.f18320u1.X1());
                    if (C != null) {
                        q1 q1Var = q1.this;
                        q1Var.setCurrentIndex(q1Var.M1());
                        int i11 = -q1.this.f18320u1.U(C);
                        if (i11 > 0) {
                            int itemHeight = q1.getItemHeight();
                            if (i11 > itemHeight) {
                                i11 %= itemHeight;
                            }
                            if (i11 <= itemHeight / 2) {
                                q1.this.u1(0, -i11);
                            } else {
                                q1.this.u1(0, itemHeight - i11);
                            }
                        } else {
                            q1 q1Var2 = q1.this;
                            q1Var2.setCurrentIndex(q1Var2.M1());
                        }
                    }
                } else {
                    q1.this.Q1(q1.this.M1(), true);
                }
            }
        }

        @Override
        public void b(RecyclerView recyclerView, int i10, int i11) {
            int X1 = q1.this.f18320u1.X1();
            if (X1 != -1) {
                View C = q1.this.f18320u1.C(X1);
                if (C != null) {
                    ((f) C).b();
                    if (q1.this.f18321v1 && X1 < this.f18329b.size() - q1.this.f18324y1 && i11 <= 0) {
                        q1.this.f18320u1.z2(this.f18329b.size() + X1, C.getTop());
                    }
                }
                int a22 = q1.this.f18320u1.a2();
                View C2 = q1.this.f18320u1.C(a22);
                if (C2 != null) {
                    ((f) C2).b();
                    if (q1.this.f18321v1 && a22 > this.f18329b.size() + q1.this.f18324y1 && i11 > 0) {
                        q1.this.f18320u1.z2(a22 - this.f18329b.size(), C2.getTop());
                    }
                }
                while (true) {
                    X1++;
                    if (X1 >= a22) {
                        break;
                    }
                    View C3 = q1.this.f18320u1.C(X1);
                    if (C3 != null) {
                        ((f) C3).b();
                    }
                }
                if (!q1.this.f18321v1 && this.f18328a) {
                    q1 q1Var = q1.this;
                    q1Var.setCurrentIndex(q1Var.M1());
                }
            }
        }
    }

    public static class c<T> extends RecyclerView.h<g> {
        public final Context M;
        public final View.OnClickListener N;
        public final v4<?> O;
        public final ArrayList<d<T>> P;
        public final boolean Q;

        public c(Context context, View.OnClickListener onClickListener, boolean z10, boolean z11, int i10, ArrayList<T> arrayList, TextPaint textPaint, v4<?> v4Var) {
            this.M = context;
            this.N = onClickListener;
            this.Q = z10;
            this.O = v4Var;
            ArrayList<d<T>> arrayList2 = new ArrayList<>();
            this.P = arrayList2;
            arrayList2.ensureCapacity(arrayList.size());
            Iterator<T> it = arrayList.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                this.P.add(new d<>(i11, it.next(), textPaint, i10, z11));
                i11++;
            }
        }

        @Override
        public int D() {
            return this.Q ? this.P.size() * 2 : this.P.size();
        }

        public void Q(g gVar, int i10) {
            ArrayList<d<T>> arrayList = this.P;
            gVar.P(arrayList.get(i10 % arrayList.size()));
        }

        public g S(ViewGroup viewGroup, int i10) {
            return g.O(this.M, this.N, this.O);
        }
    }

    public static class d<T> {
        public final int f18331a;
        public final String f18332b;
        public final TextPaint f18333c;
        public final int f18334d;
        public final int f18335e;
        public final boolean f18336f;
        public int f18337g;
        public String f18338h;
        public int f18339i;

        public d(int i10, T t10, TextPaint textPaint, int i11, boolean z10) {
            this.f18331a = i10;
            String obj = t10.toString();
            this.f18332b = obj;
            this.f18336f = z10;
            if (obj != null) {
                this.f18333c = textPaint;
                this.f18334d = (int) v0.T1(obj, textPaint);
            } else {
                this.f18333c = null;
                this.f18334d = 0;
            }
            this.f18335e = i11;
        }

        public void b(Canvas canvas, int i10, int i11, int i12, int i13, int i14) {
            float f10;
            if (this.f18332b != null) {
                int itemHeight = q1.getItemHeight();
                int i15 = this.f18335e;
                int i16 = (i15 * itemHeight) / 2;
                int i17 = i11 / 2;
                int i18 = i12 + i17;
                int i19 = i16 + 0;
                if (i18 >= i19 && i18 <= i16 + 0) {
                    f10 = 0.0f;
                } else if (i18 < i16) {
                    f10 = Math.min((i19 - i18) / (((i15 / 2) * itemHeight) + i17), 1.0f);
                } else {
                    f10 = Math.min(((i18 - i16) + 0) / (((i15 / 2) * itemHeight) + i17), 1.0f);
                }
                if (f10 == 0.0f) {
                    canvas.drawText(this.f18338h, (i13 + (i10 / 2)) - (this.f18339i / 2), i14 + i17 + a0.i(8.0f), this.f18333c);
                } else if (f10 < 1.0f) {
                    canvas.save();
                    float f11 = 1.0f - f10;
                    int i20 = i13 + (i10 / 2);
                    int i21 = i14 + i17;
                    canvas.scale(1.0f, (0.55f * f11) + 0.45f, i20, i21);
                    this.f18333c.setAlpha((int) (f11 * 255.0f));
                    canvas.drawText(this.f18338h, i20 - (this.f18339i / 2), i21 + a0.i(8.0f), this.f18333c);
                    this.f18333c.setAlpha(255);
                    canvas.restore();
                }
            }
        }

        public void c(int i10) {
            if (this.f18337g != i10 && i10 != 0 && this.f18332b != null) {
                this.f18337g = i10;
                int i11 = i10 - a0.i(36.0f);
                int i12 = this.f18334d;
                if (i12 <= i11 || !this.f18336f) {
                    this.f18338h = this.f18332b;
                    this.f18339i = i12;
                    return;
                }
                String charSequence = TextUtils.ellipsize(this.f18332b, this.f18333c, i11, TextUtils.TruncateAt.END).toString();
                this.f18338h = charSequence;
                this.f18339i = (int) v0.T1(charSequence, this.f18333c);
            }
        }
    }

    public interface e<T> {
        void a(q1<T> q1Var, int i10);
    }

    public static class f extends View {
        public int M;
        public d<?> f18340a;
        public int f18341b;
        public int f18342c;

        public f(Context context) {
            super(context);
            p0.T(this);
            setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        }

        public d<?> a() {
            return this.f18340a;
        }

        public void b() {
            if (this.f18341b != getMeasuredWidth() || this.f18342c != getMeasuredHeight() || this.M != getTop()) {
                invalidate();
            }
        }

        public void c(d<?> dVar) {
            this.f18340a = dVar;
        }

        @Override
        public void onDraw(Canvas canvas) {
            d<?> dVar = this.f18340a;
            if (dVar != null) {
                int measuredWidth = getMeasuredWidth();
                this.f18341b = measuredWidth;
                int measuredHeight = getMeasuredHeight();
                this.f18342c = measuredHeight;
                int top = getTop();
                this.M = top;
                dVar.b(canvas, measuredWidth, measuredHeight, top, 0, 0);
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(q1.getItemHeight(), Log.TAG_TDLIB_OPTIONS));
            d<?> dVar = this.f18340a;
            if (dVar != null) {
                dVar.c(getMeasuredWidth());
            }
        }
    }

    public static class g extends RecyclerView.c0 {
        public g(View view) {
            super(view);
        }

        public static g O(Context context, View.OnClickListener onClickListener, v4<?> v4Var) {
            f fVar = new f(context);
            fVar.setOnClickListener(onClickListener);
            if (v4Var != null) {
                v4Var.t8(fVar);
            }
            return new g(fVar);
        }

        public void P(d<?> dVar) {
            ((f) this.f2982a).c(dVar);
        }
    }

    public interface h<T> {
        int a(q1<T> q1Var, int i10);
    }

    public q1(Context context, boolean z10) {
        super(context);
        this.f18321v1 = z10;
        TextPaint textPaint = new TextPaint(5);
        this.f18319t1 = textPaint;
        textPaint.setTypeface(o.k());
        textPaint.setColor(j.P0());
        textPaint.setTextSize(a0.i(17.0f));
        setItemAnimator(null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.f18320u1 = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
    }

    public static int getItemHeight() {
        return a0.i(48.0f);
    }

    public void setCurrentIndex(int i10) {
        if (this.f18322w1 != i10) {
            this.f18322w1 = i10;
            e<T> eVar = this.E1;
            if (eVar != null) {
                eVar.a(this, i10);
            }
        }
    }

    public void L1(v4<?> v4Var) {
        this.C1 = v4Var;
        if (this.A1 == null && v4Var != null) {
            v4Var.w8(this.f18319t1, R.id.theme_color_text);
        }
    }

    public final int M1() {
        int X1 = this.f18320u1.X1();
        if (X1 == -1) {
            return -1;
        }
        if (this.f18321v1) {
            return (X1 + (this.f18324y1 / 2)) % this.f18323x1.size();
        }
        View C = this.f18320u1.C(X1);
        int U = C != null ? this.f18320u1.U(C) : 0;
        if (X1 > 0) {
            X1 += this.f18324y1 / 2;
        }
        int max = Math.max(0, Math.min(this.f18323x1.size() - 1, X1 + Math.round((-U) / getItemHeight())));
        h<T> hVar = this.B1;
        return hVar != null ? hVar.a(this, max) : max;
    }

    public void N1() {
        setForcedTheme(c0.a(2));
    }

    public T O1(int i10) {
        if (i10 < 0 || i10 >= this.f18323x1.size()) {
            return null;
        }
        return this.f18323x1.get(i10);
    }

    public void P1(ArrayList<T> arrayList, int i10) {
        this.f18322w1 = i10;
        this.f18323x1 = arrayList;
        int min = Math.min(arrayList.size(), 5);
        this.f18324y1 = min;
        if (min % 2 == 0) {
            this.f18324y1 = min - 1;
        }
        if (this.f18324y1 > 0) {
            c cVar = new c(getContext(), this, this.f18321v1, this.D1, this.f18324y1, arrayList, this.f18319t1, this.A1 == null ? this.C1 : null);
            setAdapter(cVar);
            if (this.f18321v1) {
                int D = cVar.D() / 2;
                int size = D - (D % arrayList.size());
                int i11 = this.f18324y1;
                int i12 = (size - (i11 / 2)) + i10;
                if (i11 + i12 >= cVar.D()) {
                    i12 -= arrayList.size();
                } else if (i12 - this.f18324y1 < 0) {
                    i12 += arrayList.size();
                }
                this.f18320u1.z2(i12, 0);
            } else {
                if (i10 == 0) {
                    this.f18320u1.z2(0, 0);
                } else {
                    this.f18320u1.z2(i10, ((getItemHeight() * 5) / 2) - (getItemHeight() / 2));
                }
                g(new a(arrayList));
                setOverScrollMode(2);
            }
            k(new b(arrayList));
        }
    }

    public final void Q1(int i10, boolean z10) {
        int i11;
        int i12;
        setCurrentIndex(i10);
        if (z10 && i10 != -1) {
            if (i10 > 0) {
                i12 = ((getItemHeight() * this.f18324y1) / 2) - (getItemHeight() / 2);
                i11 = getItemHeight() * i10;
            } else {
                i12 = 0;
                i11 = 0;
            }
            C1();
            int X1 = this.f18320u1.X1();
            if (X1 != -1) {
                int itemHeight = getItemHeight() * X1;
                if (X1 > 0) {
                    itemHeight += (getMeasuredHeight() / 2) - (getItemHeight() / 2);
                }
                View C = this.f18320u1.C(X1);
                int i13 = itemHeight + (C != null ? -this.f18320u1.U(C) : 0);
                if (i13 != i11) {
                    u1(0, i11 - i13);
                    return;
                }
                return;
            }
            this.f18320u1.z2(i10, i12);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f18325z1) {
            int measuredHeight = getMeasuredHeight() / 2;
            int itemHeight = getItemHeight() / 2;
            float f10 = measuredHeight - itemHeight;
            float measuredWidth = getMeasuredWidth();
            p pVar = this.A1;
            canvas.drawLine(0.0f, f10, measuredWidth, f10, y.D0(pVar != null ? pVar.e(R.id.theme_color_separator) : j.M0()));
            float f11 = measuredHeight + itemHeight;
            float measuredWidth2 = getMeasuredWidth();
            p pVar2 = this.A1;
            canvas.drawLine(0.0f, f11, measuredWidth2, f11, y.D0(pVar2 != null ? pVar2.e(R.id.theme_color_separator) : j.M0()));
        }
    }

    public int getCurrentIndex() {
        return this.f18322w1;
    }

    public T getCurrentItem() {
        return O1(this.f18322w1);
    }

    public h<T> getMinMaxProvider() {
        return this.B1;
    }

    @Override
    public void onClick(View view) {
        d<?> a10;
        if (this.f18321v1) {
            if (view != null && !this.f18320u1.y0()) {
                int top = view.getTop() - (getItemHeight() * 2);
                int itemHeight = top / getItemHeight();
                while (itemHeight < 0) {
                    itemHeight += this.f18323x1.size();
                }
                setCurrentIndex((M1() + itemHeight) % this.f18323x1.size());
                u1(0, top);
            }
        } else if ((view instanceof f) && (a10 = ((f) view).a()) != null) {
            h<T> hVar = this.B1;
            int i10 = a10.f18331a;
            if (hVar != null) {
                i10 = hVar.a(this, i10);
            }
            Q1(i10, true);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getItemHeight() * this.f18324y1, Log.TAG_TDLIB_OPTIONS));
    }

    public void setCurrentItem(int i10) {
        Q1(i10, true);
    }

    public void setForcedTheme(p pVar) {
        this.A1 = pVar;
        this.f18319t1.setColor(pVar != null ? pVar.e(R.id.theme_color_text) : j.P0());
    }

    public void setItemChangeListener(e<T> eVar) {
        this.E1 = eVar;
    }

    public void setMinMaxProvider(h<T> hVar) {
        this.B1 = hVar;
    }

    public void setNeedSeparators(boolean z10) {
        if (this.f18325z1 != z10) {
            this.f18325z1 = z10;
            invalidate();
        }
    }

    public void setTrimItems(boolean z10) {
        this.D1 = z10;
    }
}
