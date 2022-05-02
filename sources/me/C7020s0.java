package me;

import ad.GestureDetector$OnGestureListenerC0256a;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import be.C1357a0;
import be.C1399s0;
import ge.C4868i;
import me.vkryl.android.widget.FrameLayoutFix;
import p037cb.C2057b;
import p051db.C3950k;
import p051db.C3953l;

public class C7020s0 extends FrameLayoutFix implements GestureDetector$OnGestureListenerC0256a.AbstractC0257a {
    public View f22250M;
    public float f22251N;
    public float f22252O;
    public float f22253P;
    public float f22254Q;
    public boolean f22255R;
    public boolean f22256S;
    public GestureDetector$OnGestureListenerC0256a f22257T = new GestureDetector$OnGestureListenerC0256a(getContext(), this);

    public class C7021a implements C3950k.AbstractC3952b {
        public final float f22258M;
        public final float f22259N;
        public final int f22260O;
        public final View f22262a;
        public final float f22263b;
        public final float f22264c;

        public C7021a(View view, float f, float f2, float f3, float f4, int i) {
            this.f22262a = view;
            this.f22263b = f;
            this.f22264c = f2;
            this.f22258M = f3;
            this.f22259N = f4;
            this.f22260O = i;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            int measuredWidth = ((C7020s0.this.getMeasuredWidth() - this.f22262a.getMeasuredWidth()) - C7020s0.this.getPaddingLeft()) - C7020s0.this.getPaddingRight();
            int measuredHeight = ((C7020s0.this.getMeasuredHeight() - this.f22262a.getMeasuredHeight()) - C7020s0.this.getPaddingTop()) - C7020s0.this.getPaddingBottom();
            View view = this.f22262a;
            float f3 = this.f22263b;
            view.setTranslationX(f3 + (((this.f22264c * measuredWidth) - f3) * f));
            View view2 = this.f22262a;
            float f4 = this.f22258M;
            view2.setTranslationY(f4 + (((this.f22259N * measuredHeight) - f4) * f));
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            if (C1399s0.m37192c0(this.f22262a, this.f22260O)) {
                this.f22262a.setTranslationX(0.0f);
                this.f22262a.setTranslationY(0.0f);
                C1399s0.m37148y0(this.f22262a);
                C4868i.m24727c2().m24776V4(this.f22260O);
            }
        }
    }

    public class C7022b implements C3950k.AbstractC3952b {
        public final float f22265M;
        public final boolean f22266N;
        public final View f22268a;
        public final float f22269b;
        public final float f22270c;

        public C7022b(View view, float f, float f2, float f3, boolean z) {
            this.f22268a = view;
            this.f22269b = f;
            this.f22270c = f2;
            this.f22265M = f3;
            this.f22266N = z;
        }

        @Override
        public void mo45P5(int i, float f, float f2, C3950k kVar) {
            this.f22268a.setAlpha(this.f22269b * (1.0f - f));
            View view = this.f22268a;
            float f3 = this.f22270c;
            view.setScaleX(f3 + ((0.7f - f3) * f));
            View view2 = this.f22268a;
            float f4 = this.f22265M;
            view2.setScaleY(f4 + ((0.7f - f4) * f));
        }

        @Override
        public void mo35Y0(int i, float f, C3950k kVar) {
            C7020s0.this.removeView(this.f22268a);
            if (this.f22266N && C7020s0.this.getChildCount() == 0 && C7020s0.this.getParent() != null) {
                ((ViewGroup) C7020s0.this.getParent()).removeView(C7020s0.this);
            }
        }
    }

    public C7020s0(Context context) {
        super(context);
    }

    public static boolean m18086G1(float f, float f2, float f3, float f4, int i, int i2) {
        return f >= f3 && f2 >= f4 && f < f3 + ((float) i) && f2 < f4 + ((float) i2);
    }

    public static void m18085I1(View view, float f, float f2, float f3, int i, float f4, float f5, C3950k kVar) {
        view.setScaleX(f + ((1.0f - f) * f4));
        view.setScaleY(f2 + ((1.0f - f2) * f4));
        view.setAlpha(f3 + ((1.0f - f3) * f4));
    }

    public void m18089D1(final View view) {
        if (view.getTag() instanceof C3950k) {
            ((C3950k) view.getTag()).m29544k();
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
        C3950k kVar = new C3950k(0, new C3950k.AbstractC3952b() {
            @Override
            public final void mo45P5(int i, float f, float f2, C3950k kVar2) {
                C7020s0.m18085I1(view, scaleX, scaleY, alpha, i, f, f2, kVar2);
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar2) {
                C3953l.m29528a(this, i, f, kVar2);
            }
        }, C2057b.f7280b, 140L);
        view.setTag(kVar);
        kVar.m29546i(1.0f);
    }

    public final void m18088E1(float f, float f2) {
        if (this.f22255R) {
            View view = this.f22250M;
            this.f22255R = false;
            float measuredHeight = getMeasuredHeight() / 2;
            int measuredHeight2 = view.getMeasuredHeight() / 2;
            float x = view.getX() + (view.getMeasuredWidth() / 2);
            float y = view.getY() + measuredHeight2;
            float f3 = 0.0f;
            float f4 = x > ((float) (getMeasuredWidth() / 2)) ? 1.0f : 0.0f;
            float f5 = measuredHeight2 / 2;
            float f6 = (y <= measuredHeight - f5 || y >= f5 + measuredHeight) ? y > measuredHeight ? 1.0f : 0.0f : 0.5f;
            float q = C1357a0.m37536q();
            if (!(f == 0.0f && f2 == 0.0f) && Math.max(Math.abs(f), Math.abs(f2)) > q) {
                double degrees = Math.toDegrees(Math.atan2(f2, f));
                double abs = Math.abs(degrees);
                if (Math.abs(f) >= q) {
                    if (abs > 115.0d) {
                        f4 = 0.0f;
                    } else if (abs < 65.0d) {
                        f4 = 1.0f;
                    }
                }
                if (Math.abs(f2) >= q && abs >= 45.0d && abs <= 135.0d) {
                    int i = (f6 > 0.5f ? 1 : (f6 == 0.5f ? 0 : -1));
                    if (degrees > 0.0d) {
                        if (i >= 0) {
                            f6 = 1.0f;
                        }
                        f6 = 0.5f;
                    } else {
                        if (i < 0) {
                            f6 = 0.0f;
                        }
                        f6 = 0.5f;
                    }
                }
            }
            int i2 = ((FrameLayout.LayoutParams) view.getLayoutParams()).gravity;
            int i3 = (f4 > 1.0f ? 1 : (f4 == 1.0f ? 0 : -1));
            int i4 = (f6 == 1.0f ? 80 : f6 == 0.5f ? 16 : 48) | (i3 == 0 ? 5 : f4 == 0.5f ? 1 : 3);
            if ((i2 & 7) != 5) {
                f3 = f4;
            } else if (i3 != 0) {
                f3 = -1.0f;
            }
            int i5 = i2 & 112;
            if (i5 == 16) {
                f6 -= 0.5f;
            } else if (i5 == 80) {
                f6 -= 1.0f;
            }
            float f7 = f6;
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            C3950k kVar = (C3950k) view.getTag();
            if (kVar != null) {
                kVar.m29544k();
            }
            new C3950k(0, new C7021a(view, translationX, f3, translationY, f7, i4), C2057b.f7280b, 230L).m29546i(1.0f);
        }
    }

    public final View m18087F1(float f, float f2) {
        if (this.f22256S) {
            return null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && m18086G1(f, f2, childAt.getLeft() + childAt.getTranslationX(), childAt.getTop() + childAt.getTranslationY(), childAt.getMeasuredWidth(), childAt.getMeasuredHeight())) {
                if (childAt.getAlpha() == 1.0f && childAt.getVisibility() == 0 && childAt.getScaleX() == 1.0f && childAt.getScaleY() == 1.0f) {
                    return childAt;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public void m18084J1(View view, boolean z) {
        if (view.getTag() instanceof C3950k) {
            ((C3950k) view.getTag()).m29544k();
        }
        C3950k kVar = new C3950k(0, new C7022b(view, view.getAlpha(), view.getScaleX(), view.getScaleY(), z), C2057b.f7280b, 140L);
        view.setTag(kVar);
        kVar.m29546i(1.0f);
    }

    @Override
    public boolean mo7205o7(float f, float f2) {
        if (!this.f22255R) {
            return false;
        }
        m18088E1(f, f2);
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            m18088E1(0.0f, 0.0f);
            View F1 = m18087F1(x, y);
            this.f22250M = F1;
            if (F1 == null) {
                return true;
            }
            this.f22257T.m41997a(motionEvent);
            this.f22251N = x;
            this.f22252O = y;
            this.f22253P = this.f22250M.getTranslationX();
            this.f22254Q = this.f22250M.getTranslationY();
            C3950k kVar = (C3950k) this.f22250M.getTag();
            if (kVar != null && kVar.m29533v()) {
                kVar.m29544k();
                this.f22255R = true;
                return true;
            }
        } else if (action == 1) {
            this.f22257T.m41997a(motionEvent);
        } else if (action == 2 && this.f22250M != null && Math.max(Math.abs(x - this.f22251N), Math.abs(y - this.f22252O)) >= C1357a0.m37537p()) {
            this.f22251N = x;
            this.f22252O = y;
            this.f22255R = true;
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: me.C7020s0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f22256S = z;
    }
}
