package org.thunderdog.challegram.v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import db.b;
import db.g;
import de.rh;
import eb.k;
import hd.s4;
import ib.h;
import tc.d;
import ud.d1;
import vc.f3;
import vc.i;
import vc.i1;
import vc.v2;

public class MessagesRecyclerView extends RecyclerView implements k.b {
    public a A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public float E1;
    public k F1;
    public boolean G1;
    public boolean H1;
    public float I1;
    public float J1;
    public int K1;
    public v2 f20163t1;
    public i f20164u1;
    public f3 f20165v1;
    public d f20166w1;
    public boolean f20167x1;
    public int f20168y1;
    public int f20169z1;

    public class a extends RecyclerView.o {
        public s4 f20170a;
        public int f20171b;
        public float f20172c;

        public a() {
        }

        @Override
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            int i10;
            int i11;
            s4 i02;
            int i12;
            int i13;
            float f10;
            int i14;
            Object obj = null;
            this.f20170a = null;
            this.f20171b = 0;
            this.f20172c = 0.0f;
            i1 i1Var = (i1) recyclerView.getAdapter();
            if (i1Var.j0() != 0) {
                int measuredWidth = recyclerView.getMeasuredWidth() / 2;
                int g32 = s4.g3(MessagesRecyclerView.this.f20163t1.x3());
                int topOffset = MessagesRecyclerView.this.getTopOffset();
                int childCount = recyclerView.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = recyclerView.getChildAt(childCount);
                    if (childAt.getTop() + childAt.getMeasuredHeight() > topOffset) {
                        break;
                    }
                    childCount--;
                }
                int i15 = 0;
                boolean z10 = false;
                while (i15 <= childCount) {
                    View childAt2 = recyclerView.getChildAt(i15);
                    int a10 = ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).a();
                    if (a10 < zVar.b() && (i02 = i1Var.i0(a10)) != null) {
                        int top = childAt2.getTop();
                        if (i02.d5()) {
                            top += i02.q3();
                        }
                        if (top >= topOffset) {
                            i12 = top;
                        } else if (z10) {
                            int i16 = this.f20171b - g32;
                            s4 s4Var = this.f20170a;
                            if (s4Var != null) {
                                i16 -= s4Var.q3();
                            }
                            i12 = Math.min(i16, topOffset);
                        } else {
                            i12 = topOffset;
                        }
                        boolean z11 = i15 == childCount;
                        float d10 = (!z11 || top - topOffset >= 0) ? 0.0f : h.d((-i13) / g32);
                        float f11 = z11 ? MessagesRecyclerView.this.E1 : 1.0f;
                        float f12 = d10 == 1.0f ? f11 : 1.0f;
                        float f13 = f11;
                        i10 = i15;
                        float f14 = d10;
                        i11 = childCount;
                        if (i02.e1(canvas, measuredWidth, i12, f14, f12)) {
                            this.f20171b = i12;
                            this.f20170a = i02;
                            this.f20172c = f12;
                        } else if (z11) {
                            Object I4 = i02.I4();
                            if (I4 != null) {
                                s4 s4Var2 = (s4) I4;
                                if (s4Var2.U5() || !s4Var2.e1(canvas, measuredWidth, i12, 1.0f, f13)) {
                                    f10 = f13;
                                    i02.u9(obj);
                                } else {
                                    this.f20171b = i12;
                                    this.f20170a = s4Var2;
                                    this.f20172c = f13;
                                }
                            } else {
                                f10 = f13;
                            }
                            int i17 = a10 + 1;
                            while (i17 < i1Var.j0()) {
                                s4 i03 = i1Var.i0(i17);
                                if (i03 != null) {
                                    i14 = i17;
                                    if (i03.e1(canvas, measuredWidth, i12, 1.0f, f10)) {
                                        i02.u9(i03);
                                        this.f20171b = i12;
                                        this.f20170a = i02;
                                        this.f20172c = f10;
                                    }
                                } else {
                                    i14 = i17;
                                }
                                i17 = i14 + 1;
                            }
                        }
                        z10 = true;
                        break;
                    }
                    i10 = i15;
                    i11 = childCount;
                    i15 = i10 + 1;
                    childCount = i11;
                    obj = null;
                }
            }
        }
    }

    public MessagesRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        J1();
    }

    public int getTopOffset() {
        int W0 = this.f20163t1.W0();
        d1 w10 = j0.w(getContext());
        return w10 != null ? W0 + w10.getFilling().v() : W0;
    }

    public boolean I1() {
        return this.C1;
    }

    public final void J1() {
        setOverScrollMode(fd.a.f11879a ? 1 : 2);
        d dVar = new d(b.f7287b, 140L);
        this.f20166w1 = dVar;
        dVar.V(false);
        setItemAnimator(null);
        f3 f3Var = new f3();
        this.f20165v1 = f3Var;
        i iVar = new i(f3Var);
        this.f20164u1 = iVar;
        this.f20165v1.R(iVar);
        this.f20164u1.D(this);
        a aVar = new a();
        this.A1 = aVar;
        g(aVar);
    }

    public final void K1() {
        int topOffset = getTopOffset();
        invalidate(topOffset, 0, getMeasuredWidth(), s4.g3(this.f20163t1.x3()) + topOffset);
    }

    public final boolean L1(float f10, float f11) {
        if (this.A1 == null || this.f20163t1.r0().Tk()) {
            return false;
        }
        a aVar = this.A1;
        if (aVar.f20170a == null || aVar.f20172c == 0.0f) {
            return false;
        }
        int i10 = a0.i(26.0f);
        int measuredWidth = getMeasuredWidth() / 2;
        int i11 = i10 / 2;
        int i12 = this.A1.f20171b + a0.i(this.f20163t1.x3() ? 5.0f : 8.0f) + i11;
        int i32 = this.A1.f20170a.i3();
        int h32 = this.A1.f20170a.h3();
        int i13 = a0.i(4.0f);
        this.K1 = this.A1.f20170a.f3();
        int i14 = (i32 / 2) + h32 + i13;
        int i15 = i11 + i13;
        return f10 >= ((float) (measuredWidth - i14)) && f10 < ((float) (measuredWidth + i14)) && f11 >= ((float) (i12 - i15)) && f11 < ((float) (i12 + i15));
    }

    public final boolean M1() {
        if (this.K1 == 0) {
            return false;
        }
        this.f20163t1.r0().kl(this.K1);
        return true;
    }

    public void N1() {
    }

    public void O1(View view) {
        RecyclerView.c0 l02 = l0(view);
        if (l02 != null && l02.n() != 0) {
            this.f20164u1.a0(l02);
        }
    }

    public v2 getManager() {
        return this.f20163t1;
    }

    public f3 getMessagesTouchHelper() {
        return this.f20165v1;
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        if (this.E1 != f10) {
            this.E1 = f10;
            K1();
            if (f10 == 1.0f && this.G1 && !this.D1) {
                this.G1 = false;
                this.F1.F(1500L);
                this.F1.y(180L);
                this.F1.i(0.0f);
            }
        }
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.E1 <= 0.0f || motionEvent.getAction() != 0 || !L1(motionEvent.getX(), motionEvent.getY())) {
            return onInterceptTouchEvent;
        }
        return true;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.B1) {
            this.B1 = true;
            this.f20163t1.q2(true, z10);
            this.B1 = false;
        }
        v2 v2Var = this.f20163t1;
        if (v2Var != null) {
            v2Var.r0().vo();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f20163t1 != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f20168y1 == measuredWidth && this.f20169z1 == measuredHeight) {
                this.f20163t1.l2();
                return;
            }
            this.f20168y1 = measuredWidth;
            this.f20169z1 = measuredHeight;
            this.f20163t1.r0().vo();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.E1 <= 0.0f || !L1(x10, y10)) {
                z10 = false;
            }
            this.H1 = z10;
            if (z10) {
                this.I1 = x10;
                this.J1 = y10;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.H1 = false;
                }
            } else if (this.H1 && (Math.abs(this.I1 - motionEvent.getX()) > a0.p() || Math.abs(this.J1 - motionEvent.getY()) > a0.p())) {
                this.H1 = false;
            }
        } else if (this.H1) {
            if (M1()) {
                g.c(this);
            }
            this.H1 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        this.C1 = z10;
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setController(rh rhVar) {
        this.f20165v1.Q(rhVar);
    }

    public void setIsScrolling(boolean z10) {
        if (this.D1 != z10) {
            this.D1 = z10;
            if (this.F1 == null) {
                this.F1 = new k(0, this, b.f7287b, 180L, this.E1);
            }
            if (!this.F1.v() || z10) {
                this.G1 = false;
                this.F1.F(z10 ? 0L : 1500L);
                this.F1.y(z10 ? 120L : 180L);
                this.F1.i(z10 ? 1.0f : 0.0f);
                return;
            }
            this.G1 = true;
        }
    }

    public void setManager(v2 v2Var) {
        this.f20163t1 = v2Var;
    }

    public void setMessageAnimatorEnabled(boolean z10) {
        if (this.f20167x1 != z10) {
            this.f20167x1 = z10;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        if (this.E1 == 0.0f) {
            super.setTranslationY(f10);
        } else if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            K1();
        }
    }

    public MessagesRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        J1();
    }
}
