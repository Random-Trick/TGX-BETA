package ne;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bd.a;
import ce.a0;
import ce.p0;
import eb.k;
import eb.l;
import he.i;
import me.vkryl.android.widget.FrameLayoutFix;

public class s0 extends FrameLayoutFix implements a.AbstractC0060a {
    public View M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public boolean R;
    public boolean S;
    public bd.a T = new bd.a(getContext(), this);

    public class a implements k.b {
        public final float M;
        public final float N;
        public final int O;
        public final View f18364a;
        public final float f18365b;
        public final float f18366c;

        public a(View view, float f10, float f11, float f12, float f13, int i10) {
            this.f18364a = view;
            this.f18365b = f10;
            this.f18366c = f11;
            this.M = f12;
            this.N = f13;
            this.O = i10;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            int measuredWidth = ((s0.this.getMeasuredWidth() - this.f18364a.getMeasuredWidth()) - s0.this.getPaddingLeft()) - s0.this.getPaddingRight();
            int measuredHeight = ((s0.this.getMeasuredHeight() - this.f18364a.getMeasuredHeight()) - s0.this.getPaddingTop()) - s0.this.getPaddingBottom();
            View view = this.f18364a;
            float f12 = this.f18365b;
            view.setTranslationX(f12 + (((this.f18366c * measuredWidth) - f12) * f10));
            View view2 = this.f18364a;
            float f13 = this.M;
            view2.setTranslationY(f13 + (((this.N * measuredHeight) - f13) * f10));
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            if (p0.V(this.f18364a, this.O)) {
                this.f18364a.setTranslationX(0.0f);
                this.f18364a.setTranslationY(0.0f);
                p0.r0(this.f18364a);
                i.c2().V4(this.O);
            }
        }
    }

    public class b implements k.b {
        public final float M;
        public final boolean N;
        public final View f18367a;
        public final float f18368b;
        public final float f18369c;

        public b(View view, float f10, float f11, float f12, boolean z10) {
            this.f18367a = view;
            this.f18368b = f10;
            this.f18369c = f11;
            this.M = f12;
            this.N = z10;
        }

        @Override
        public void n4(int i10, float f10, float f11, k kVar) {
            this.f18367a.setAlpha(this.f18368b * (1.0f - f10));
            View view = this.f18367a;
            float f12 = this.f18369c;
            view.setScaleX(f12 + ((0.7f - f12) * f10));
            View view2 = this.f18367a;
            float f13 = this.M;
            view2.setScaleY(f13 + ((0.7f - f13) * f10));
        }

        @Override
        public void o4(int i10, float f10, k kVar) {
            s0.this.removeView(this.f18367a);
            if (this.N && s0.this.getChildCount() == 0 && s0.this.getParent() != null) {
                ((ViewGroup) s0.this.getParent()).removeView(s0.this);
            }
        }
    }

    public s0(Context context) {
        super(context);
    }

    public static boolean D1(float f10, float f11, float f12, float f13, int i10, int i11) {
        return f10 >= f12 && f11 >= f13 && f10 < f12 + ((float) i10) && f11 < f13 + ((float) i11);
    }

    public static void E1(View view, float f10, float f11, float f12, int i10, float f13, float f14, k kVar) {
        view.setScaleX(f10 + ((1.0f - f10) * f13));
        view.setScaleY(f11 + ((1.0f - f11) * f13));
        view.setAlpha(f12 + ((1.0f - f12) * f13));
    }

    public void A1(final View view) {
        if (view.getTag() instanceof k) {
            ((k) view.getTag()).k();
        }
        if (view.getParent() == null) {
            addView(view);
            view.setScaleX(0.7f);
            view.setScaleY(0.7f);
            view.setAlpha(0.0f);
        }
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        final float alpha = view.getAlpha();
        k kVar = new k(0, new k.b() {
            @Override
            public final void n4(int i10, float f10, float f11, k kVar2) {
                s0.E1(view, scaleX, scaleY, alpha, i10, f10, f11, kVar2);
            }

            @Override
            public void o4(int i10, float f10, k kVar2) {
                l.a(this, i10, f10, kVar2);
            }
        }, db.b.f7287b, 140L);
        view.setTag(kVar);
        kVar.i(1.0f);
    }

    public final void B1(float f10, float f11) {
        if (this.R) {
            View view = this.M;
            this.R = false;
            float measuredHeight = getMeasuredHeight() / 2;
            int measuredHeight2 = view.getMeasuredHeight() / 2;
            float x10 = view.getX() + (view.getMeasuredWidth() / 2);
            float y10 = view.getY() + measuredHeight2;
            float f12 = 0.0f;
            float f13 = x10 > ((float) (getMeasuredWidth() / 2)) ? 1.0f : 0.0f;
            float f14 = measuredHeight2 / 2;
            float f15 = (y10 <= measuredHeight - f14 || y10 >= f14 + measuredHeight) ? y10 > measuredHeight ? 1.0f : 0.0f : 0.5f;
            float q10 = a0.q();
            if (!(f10 == 0.0f && f11 == 0.0f) && Math.max(Math.abs(f10), Math.abs(f11)) > q10) {
                double degrees = Math.toDegrees(Math.atan2(f11, f10));
                double abs = Math.abs(degrees);
                if (Math.abs(f10) >= q10) {
                    if (abs > 115.0d) {
                        f13 = 0.0f;
                    } else if (abs < 65.0d) {
                        f13 = 1.0f;
                    }
                }
                if (Math.abs(f11) >= q10 && abs >= 45.0d && abs <= 135.0d) {
                    int i10 = (f15 > 0.5f ? 1 : (f15 == 0.5f ? 0 : -1));
                    if (degrees > 0.0d) {
                        if (i10 >= 0) {
                            f15 = 1.0f;
                        }
                        f15 = 0.5f;
                    } else {
                        if (i10 < 0) {
                            f15 = 0.0f;
                        }
                        f15 = 0.5f;
                    }
                }
            }
            int i11 = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
            int i12 = (f13 > 1.0f ? 1 : (f13 == 1.0f ? 0 : -1));
            int i13 = (f15 == 1.0f ? 80 : f15 == 0.5f ? 16 : 48) | (i12 == 0 ? 5 : f13 == 0.5f ? 1 : 3);
            if ((i11 & 7) != 5) {
                f12 = f13;
            } else if (i12 != 0) {
                f12 = -1.0f;
            }
            int i14 = i11 & 112;
            if (i14 == 16) {
                f15 -= 0.5f;
            } else if (i14 == 80) {
                f15 -= 1.0f;
            }
            float f16 = f15;
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            k kVar = (k) view.getTag();
            if (kVar != null) {
                kVar.k();
            }
            new k(0, new a(view, translationX, f12, translationY, f16, i13), db.b.f7287b, 230L).i(1.0f);
        }
    }

    public final View C1(float f10, float f11) {
        if (this.S) {
            return null;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && D1(f10, f11, childAt.getLeft() + childAt.getTranslationX(), childAt.getTop() + childAt.getTranslationY(), childAt.getMeasuredWidth(), childAt.getMeasuredHeight())) {
                if (childAt.getAlpha() == 1.0f && childAt.getVisibility() == 0 && childAt.getScaleX() == 1.0f && childAt.getScaleY() == 1.0f) {
                    return childAt;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void G1(View view, boolean z10) {
        if (view.getTag() instanceof k) {
            ((k) view.getTag()).k();
        }
        k kVar = new k(0, new b(view, view.getAlpha(), view.getScaleX(), view.getScaleY(), z10), db.b.f7287b, 140L);
        view.setTag(kVar);
        kVar.i(1.0f);
    }

    @Override
    public boolean n7(float f10, float f11) {
        if (!this.R) {
            return false;
        }
        B1(f10, f11);
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            B1(0.0f, 0.0f);
            View C1 = C1(x10, y10);
            this.M = C1;
            if (C1 == null) {
                return true;
            }
            this.T.a(motionEvent);
            this.N = x10;
            this.O = y10;
            this.P = this.M.getTranslationX();
            this.Q = this.M.getTranslationY();
            k kVar = (k) this.M.getTag();
            if (kVar != null && kVar.v()) {
                kVar.k();
                this.R = true;
                return true;
            }
        } else if (action == 1) {
            this.T.a(motionEvent);
        } else if (action == 2 && this.M != null && Math.max(Math.abs(x10 - this.N), Math.abs(y10 - this.O)) >= a0.p()) {
            this.N = x10;
            this.O = y10;
            this.R = true;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: ne.s0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        this.S = z10;
    }
}
