package td;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import ge.C4896n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p067ed.C4183a;
import p082fd.C4403w;
import td.View$OnClickListenerC9156b5;

public class C9391z4 extends FrameLayoutFix implements AbstractC9382y1, AbstractC9208i2, View$OnClickListenerC9156b5.AbstractC9161e {
    public final C9392a f30433M;
    public final RecyclerView f30434N;

    public static class C9392a extends RecyclerView.AbstractC0890h<C9393b> {
        public final View$OnClickListenerC9156b5 f30435M;

        public C9392a(View$OnClickListenerC9156b5 b5Var) {
            this.f30435M = b5Var;
        }

        @Override
        public int mo6153D() {
            return 1;
        }

        public void mo6146Q(C9393b bVar, int i) {
        }

        public C9393b mo6145S(ViewGroup viewGroup, int i) {
            if (this.f30435M.getParent() != null) {
                Log.m14709w("ViewPagerHeaderViewCompact: topView is already attached to another cel", new Object[0]);
                ((ViewGroup) this.f30435M.getParent()).removeView(this.f30435M);
            }
            return new C9393b(this.f30435M);
        }
    }

    public static class C9393b extends RecyclerView.AbstractC0886d0 {
        public C9393b(View view) {
            super(view);
            m39351I(false);
        }
    }

    public C9391z4(Context context) {
        super(context);
        View$OnClickListenerC9156b5 b5Var = new View$OnClickListenerC9156b5(context);
        b5Var.m10153Z1(R.id.theme_color_headerTabActive);
        b5Var.m10152a2(R.id.theme_color_headerTabInactiveText, R.id.theme_color_headerTabActiveText);
        b5Var.setLayoutParams(FrameLayoutFix.m18008s1(-2, C4896n.m24478e()));
        b5Var.m10154Y1(this);
        C9392a aVar = new C9392a(b5Var);
        this.f30433M = aVar;
        RecyclerView recyclerView = new RecyclerView(context);
        this.f30434N = recyclerView;
        recyclerView.setLayoutParams(FrameLayoutFix.m18007t1(-1, C4896n.m24478e(), 48));
        recyclerView.setOverScrollMode(C4183a.f14083a ? 1 : 2);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, C4403w.m27984G2()));
        recyclerView.setAdapter(aVar);
        addView(recyclerView);
        setLayoutParams(FrameLayoutFix.m18008s1(-1, C4896n.m24481b(true)));
    }

    public boolean m8808C1() {
        int X1 = ((LinearLayoutManager) this.f30434N.getLayoutManager()).m39549X1();
        if (X1 != 0) {
            return X1 != -1;
        }
        View C = this.f30434N.getLayoutManager().mo39262C(0);
        return C == null || C.getLeft() < 0 || C.getRight() > this.f30434N.getMeasuredWidth();
    }

    public boolean m8807D1() {
        View C;
        return ((LinearLayoutManager) this.f30434N.getLayoutManager()).m39549X1() != 0 || (C = this.f30434N.getLayoutManager().mo39262C(0)) == null || C.getLeft() < 0;
    }

    public final boolean m8806E1(float f, float f2) {
        float top = f2 - (this.f30434N.getTop() + ((int) this.f30434N.getTranslationY()));
        return top >= 0.0f && top < ((float) this.f30433M.f30435M.getMeasuredHeight());
    }

    @Override
    public void mo8805S(int i, int i2, int i3, int i4, float f, boolean z) {
        int measuredWidth;
        int measuredWidth2;
        int i5;
        View C = this.f30434N.getLayoutManager().mo39262C(0);
        if (C != null && (measuredWidth = C.getMeasuredWidth()) > (measuredWidth2 = this.f30434N.getMeasuredWidth()) && !this.f30434N.m39500C0()) {
            int i6 = measuredWidth - measuredWidth2;
            if (C4403w.m27984G2()) {
                i5 = C.getLeft() + i6;
            } else {
                i5 = -C.getLeft();
            }
            int i7 = -i5;
            int i8 = 1;
            if ((getParent() == null || ((View) getParent()).getMeasuredWidth() <= getMeasuredWidth()) && i6 >= i4 / 2) {
                int i9 = i + i7;
                int i10 = (int) (C1357a0.m37541i(16.0f) * (i >= i2 ? 1.0f : i / i2));
                if (i9 != i10) {
                    int i11 = (i10 - i9) + i7;
                    int i12 = measuredWidth2 - measuredWidth;
                    if (i11 < i12) {
                        i11 = i12;
                    }
                    if (i11 != i7) {
                        this.f30434N.m39496D1();
                        int i13 = i7 - i11;
                        if (C4403w.m27984G2()) {
                            i8 = -1;
                        }
                        int i14 = i13 * i8;
                        if (z) {
                            this.f30434N.mo8024v1(i14, 0);
                        } else {
                            this.f30434N.scrollBy(i14, 0);
                        }
                    }
                }
            } else {
                int i15 = (int) ((-i6) * f);
                if (i7 != i15) {
                    this.f30434N.m39496D1();
                    int i16 = i15 - i7;
                    if (!C4403w.m27984G2()) {
                        i8 = -1;
                    }
                    int i17 = i16 * i8;
                    if (z) {
                        this.f30434N.mo8024v1(i17, 0);
                    } else {
                        this.f30434N.scrollBy(i17, 0);
                    }
                }
            }
        }
    }

    public RecyclerView getRecyclerView() {
        return this.f30434N;
    }

    @Override
    public View$OnClickListenerC9156b5 getTopView() {
        return this.f30433M.f30435M;
    }

    @Override
    public void mo8402i0(float f, float f2, float f3, boolean z) {
        float f4 = 1.0f - f;
        this.f30434N.setAlpha(f4 <= 0.25f ? 0.0f : (f4 - 0.25f) / 0.25f);
        this.f30434N.setTranslationY(C4896n.m24477f(true) * (1.0f - f4));
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() == 0 && !m8806E1(motionEvent.getX(), motionEvent.getY())) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || m8806E1(motionEvent.getX(), motionEvent.getY())) && super.onTouchEvent(motionEvent);
    }

    @Override
    public void mo8255s() {
        throw new UnsupportedOperationException("Method not decompiled: td.C9391z4.mo8255s():void");
    }
}
