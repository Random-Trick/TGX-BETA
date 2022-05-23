package ud;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import gd.w;
import he.n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.b5;

public class z4 extends FrameLayoutFix implements y1, i2, b5.e {
    public final a M;
    public final RecyclerView N;

    public static class a extends RecyclerView.h<b> {
        public final b5 M;

        public a(b5 b5Var) {
            this.M = b5Var;
        }

        @Override
        public int D() {
            return 1;
        }

        public void Q(b bVar, int i10) {
        }

        public b S(ViewGroup viewGroup, int i10) {
            if (this.M.getParent() != null) {
                Log.w("ViewPagerHeaderViewCompact: topView is already attached to another cel", new Object[0]);
                ((ViewGroup) this.M.getParent()).removeView(this.M);
            }
            return new b(this.M);
        }
    }

    public static class b extends RecyclerView.c0 {
        public b(View view) {
            super(view);
            I(false);
        }
    }

    public z4(Context context) {
        super(context);
        b5 b5Var = new b5(context);
        b5Var.Y1(R.id.theme_color_headerTabActive);
        b5Var.Z1(R.id.theme_color_headerTabInactiveText, R.id.theme_color_headerTabActiveText);
        b5Var.setLayoutParams(FrameLayoutFix.q1(-2, n.e()));
        b5Var.X1(this);
        a aVar = new a(b5Var);
        this.M = aVar;
        RecyclerView recyclerView = new RecyclerView(context);
        this.N = recyclerView;
        recyclerView.setLayoutParams(FrameLayoutFix.r1(-1, n.e(), 48));
        recyclerView.setOverScrollMode(fd.a.f11879a ? 1 : 2);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, w.G2()));
        recyclerView.setAdapter(aVar);
        addView(recyclerView);
        setLayoutParams(FrameLayoutFix.q1(-1, n.b(true)));
    }

    public boolean A1() {
        View C;
        return ((LinearLayoutManager) this.N.getLayoutManager()).X1() != 0 || (C = this.N.getLayoutManager().C(0)) == null || C.getLeft() < 0;
    }

    public final boolean B1(float f10, float f11) {
        float top = f11 - (this.N.getTop() + ((int) this.N.getTranslationY()));
        return top >= 0.0f && top < ((float) this.M.M.getMeasuredHeight());
    }

    @Override
    public void T(int i10, int i11, int i12, int i13, float f10, boolean z10) {
        int measuredWidth;
        int measuredWidth2;
        int i14;
        View C = this.N.getLayoutManager().C(0);
        if (C != null && (measuredWidth = C.getMeasuredWidth()) > (measuredWidth2 = this.N.getMeasuredWidth()) && !this.N.C0()) {
            int i15 = measuredWidth - measuredWidth2;
            if (w.G2()) {
                i14 = C.getLeft() + i15;
            } else {
                i14 = -C.getLeft();
            }
            int i16 = -i14;
            int i17 = 1;
            if ((getParent() == null || ((View) getParent()).getMeasuredWidth() <= getMeasuredWidth()) && i15 >= i13 / 2) {
                int i18 = i10 + i16;
                int i19 = (int) (a0.i(16.0f) * (i10 >= i11 ? 1.0f : i10 / i11));
                if (i18 != i19) {
                    int i20 = (i19 - i18) + i16;
                    int i21 = measuredWidth2 - measuredWidth;
                    if (i20 < i21) {
                        i20 = i21;
                    }
                    if (i20 != i16) {
                        this.N.C1();
                        int i22 = i16 - i20;
                        if (w.G2()) {
                            i17 = -1;
                        }
                        int i23 = i22 * i17;
                        if (z10) {
                            this.N.u1(i23, 0);
                        } else {
                            this.N.scrollBy(i23, 0);
                        }
                    }
                }
            } else {
                int i24 = (int) ((-i15) * f10);
                if (i16 != i24) {
                    this.N.C1();
                    int i25 = i24 - i16;
                    if (!w.G2()) {
                        i17 = -1;
                    }
                    int i26 = i25 * i17;
                    if (z10) {
                        this.N.u1(i26, 0);
                    } else {
                        this.N.scrollBy(i26, 0);
                    }
                }
            }
        }
    }

    public RecyclerView getRecyclerView() {
        return this.N;
    }

    @Override
    public b5 getTopView() {
        return this.M.M;
    }

    @Override
    public void k0(float f10, float f11, float f12, boolean z10) {
        float f13 = 1.0f - f10;
        this.N.setAlpha(f13 <= 0.25f ? 0.0f : (f13 - 0.25f) / 0.25f);
        this.N.setTranslationY(n.f(true) * (1.0f - f13));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && !B1(motionEvent.getX(), motionEvent.getY())) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || B1(motionEvent.getX(), motionEvent.getY())) && super.onTouchEvent(motionEvent);
    }

    @Override
    public void s() {
        throw new UnsupportedOperationException("Method not decompiled: ud.z4.s():void");
    }

    public boolean z1() {
        int X1 = ((LinearLayoutManager) this.N.getLayoutManager()).X1();
        if (X1 != 0) {
            return X1 != -1;
        }
        View C = this.N.getLayoutManager().C(0);
        return C == null || C.getLeft() < 0 || C.getRight() > this.N.getMeasuredWidth();
    }
}
