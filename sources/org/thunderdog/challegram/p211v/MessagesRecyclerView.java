package org.thunderdog.challegram.p211v;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1379j0;
import gd.AbstractC4761s4;
import p037cb.C2057b;
import p037cb.C2065g;
import p038ce.View$OnClickListenerC2971rh;
import p051db.C3950k;
import p067ed.C4183a;
import p108hb.C5069h;
import p291uc.C9547g3;
import p291uc.C9570j;
import p291uc.C9580j1;
import p291uc.C9678w2;
import sc.C8731d;
import td.View$OnClickListenerC9170d1;

public class MessagesRecyclerView extends RecyclerView implements C3950k.AbstractC3952b {
    public int f25740A1;
    public C7926a f25741B1;
    public boolean f25742C1;
    public boolean f25743D1;
    public boolean f25744E1;
    public float f25745F1;
    public C3950k f25746G1;
    public boolean f25747H1;
    public boolean f25748I1;
    public float f25749J1;
    public float f25750K1;
    public int f25751L1;
    public C9678w2 f25752u1;
    public C9570j f25753v1;
    public C9547g3 f25754w1;
    public C8731d f25755x1;
    public boolean f25756y1;
    public int f25757z1;

    public class C7926a extends RecyclerView.AbstractC0901o {
        public AbstractC4761s4 f25758a;
        public int f25759b;
        public float f25760c;

        public C7926a() {
        }

        @Override
        public void mo8031k(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            int i;
            int i2;
            AbstractC4761s4 j0;
            int i3;
            int i4;
            float f;
            int i5;
            Object obj = null;
            this.f25758a = null;
            this.f25759b = 0;
            this.f25760c = 0.0f;
            C9580j1 j1Var = (C9580j1) recyclerView.getAdapter();
            if (j1Var.m8115k0() != 0) {
                int measuredWidth = recyclerView.getMeasuredWidth() / 2;
                int j3 = AbstractC4761s4.m25902j3(MessagesRecyclerView.this.f25752u1.m7615x3());
                int topOffset = MessagesRecyclerView.this.getTopOffset();
                int childCount = recyclerView.getChildCount() - 1;
                while (childCount >= 0) {
                    View childAt = recyclerView.getChildAt(childCount);
                    if (childAt.getTop() + childAt.getMeasuredHeight() > topOffset) {
                        break;
                    }
                    childCount--;
                }
                int i6 = 0;
                boolean z = false;
                while (i6 <= childCount) {
                    View childAt2 = recyclerView.getChildAt(i6);
                    int a = ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).m39380a();
                    if (a < a0Var.m39374b() && (j0 = j1Var.m8116j0(a)) != null) {
                        int top = childAt2.getTop();
                        if (j0.m25948e5()) {
                            top += j0.m25805t3();
                        }
                        if (top >= topOffset) {
                            i3 = top;
                        } else if (z) {
                            int i7 = this.f25759b - j3;
                            AbstractC4761s4 s4Var = this.f25758a;
                            if (s4Var != null) {
                                i7 -= s4Var.m25805t3();
                            }
                            i3 = Math.min(i7, topOffset);
                        } else {
                            i3 = topOffset;
                        }
                        boolean z2 = i6 == childCount;
                        float d = (!z2 || top - topOffset >= 0) ? 0.0f : C5069h.m24090d((-i4) / j3);
                        float f2 = z2 ? MessagesRecyclerView.this.f25745F1 : 1.0f;
                        float f3 = d == 1.0f ? f2 : 1.0f;
                        float f4 = f2;
                        i = i6;
                        float f5 = d;
                        i2 = childCount;
                        if (j0.m25942f1(canvas, measuredWidth, i3, f5, f3)) {
                            this.f25759b = i3;
                            this.f25758a = j0;
                            this.f25760c = f3;
                        } else if (z2) {
                            Object I4 = j0.m26164I4();
                            if (I4 != null) {
                                AbstractC4761s4 s4Var2 = (AbstractC4761s4) I4;
                                if (s4Var2.m26031V5() || !s4Var2.m25942f1(canvas, measuredWidth, i3, 1.0f, f4)) {
                                    f = f4;
                                    j0.m25789u9(obj);
                                } else {
                                    this.f25759b = i3;
                                    this.f25758a = s4Var2;
                                    this.f25760c = f4;
                                }
                            } else {
                                f = f4;
                            }
                            int i8 = a + 1;
                            while (i8 < j1Var.m8115k0()) {
                                AbstractC4761s4 j02 = j1Var.m8116j0(i8);
                                if (j02 != null) {
                                    i5 = i8;
                                    if (j02.m25942f1(canvas, measuredWidth, i3, 1.0f, f)) {
                                        j0.m25789u9(j02);
                                        this.f25759b = i3;
                                        this.f25758a = j0;
                                        this.f25760c = f;
                                    }
                                } else {
                                    i5 = i8;
                                }
                                i8 = i5 + 1;
                            }
                        }
                        z = true;
                        break;
                    }
                    i = i6;
                    i2 = childCount;
                    i6 = i + 1;
                    childCount = i2;
                    obj = null;
                }
            }
        }
    }

    public MessagesRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14141K1();
    }

    public int getTopOffset() {
        int W0 = this.f25752u1.m7741W0();
        View$OnClickListenerC9170d1 w = C1379j0.m37300w(getContext());
        return w != null ? W0 + w.getFilling().m9004u() : W0;
    }

    public boolean m14142J1() {
        return this.f25743D1;
    }

    public final void m14141K1() {
        setOverScrollMode(C4183a.f14083a ? 1 : 2);
        C8731d dVar = new C8731d(C2057b.f7280b, 140L);
        this.f25755x1 = dVar;
        dVar.m38721V(false);
        setItemAnimator(null);
        C9547g3 g3Var = new C9547g3();
        this.f25754w1 = g3Var;
        C9570j jVar = new C9570j(g3Var);
        this.f25753v1 = jVar;
        this.f25754w1.m8365R(jVar);
        this.f25753v1.m8220E(this);
        C7926a aVar = new C7926a();
        this.f25741B1 = aVar;
        m39437g(aVar);
    }

    public final void m14140L1() {
        int topOffset = getTopOffset();
        invalidate(topOffset, 0, getMeasuredWidth(), AbstractC4761s4.m25902j3(this.f25752u1.m7615x3()) + topOffset);
    }

    public final boolean m14139M1(float f, float f2) {
        if (this.f25741B1 == null || this.f25752u1.m7645r0().m32569Tk()) {
            return false;
        }
        C7926a aVar = this.f25741B1;
        if (aVar.f25758a == null || aVar.f25760c == 0.0f) {
            return false;
        }
        int i = C1357a0.m37544i(26.0f);
        int measuredWidth = getMeasuredWidth() / 2;
        int i2 = i / 2;
        int i3 = this.f25741B1.f25759b + C1357a0.m37544i(this.f25752u1.m7615x3() ? 5.0f : 8.0f) + i2;
        int l3 = this.f25741B1.f25758a.m25885l3();
        int k3 = this.f25741B1.f25758a.m25894k3();
        int i4 = C1357a0.m37544i(4.0f);
        this.f25751L1 = this.f25741B1.f25758a.m25912i3();
        int i5 = (l3 / 2) + k3 + i4;
        int i6 = i2 + i4;
        return f >= ((float) (measuredWidth - i5)) && f < ((float) (measuredWidth + i5)) && f2 >= ((float) (i3 - i6)) && f2 < ((float) (i3 + i6));
    }

    public final boolean m14138N1() {
        if (this.f25751L1 == 0) {
            return false;
        }
        this.f25752u1.m7645r0().m32347kl(this.f25751L1);
        return true;
    }

    public void m14137O1() {
    }

    public void m14136P1(View view) {
        RecyclerView.AbstractC0886d0 l0 = m39421l0(view);
        if (l0 != null && l0.m39335n() != 0) {
            this.f25753v1.m8195c0(l0);
        }
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        if (this.f25745F1 != f) {
            this.f25745F1 = f;
            m14140L1();
            if (f == 1.0f && this.f25747H1 && !this.f25744E1) {
                this.f25747H1 = false;
                this.f25746G1.m29555F(1500L);
                this.f25746G1.m29530y(180L);
                this.f25746G1.m29546i(0.0f);
            }
        }
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public C9678w2 getManager() {
        return this.f25752u1;
    }

    public C9547g3 getMessagesTouchHelper() {
        return this.f25754w1;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (this.f25745F1 <= 0.0f || motionEvent.getAction() != 0 || !m14139M1(motionEvent.getX(), motionEvent.getY())) {
            return onInterceptTouchEvent;
        }
        return true;
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f25742C1) {
            this.f25742C1 = true;
            this.f25752u1.m7648q2(true, z);
            this.f25742C1 = false;
        }
        C9678w2 w2Var = this.f25752u1;
        if (w2Var != null) {
            w2Var.m7645r0().m32200vo();
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f25752u1 != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (this.f25757z1 == measuredWidth && this.f25740A1 == measuredHeight) {
                this.f25752u1.m7672l2();
                return;
            }
            this.f25757z1 = measuredWidth;
            this.f25740A1 = measuredHeight;
            this.f25752u1.m7645r0().m32200vo();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.f25745F1 <= 0.0f || !m14139M1(x, y)) {
                z = false;
            }
            this.f25748I1 = z;
            if (z) {
                this.f25749J1 = x;
                this.f25750K1 = y;
            }
        } else if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    this.f25748I1 = false;
                }
            } else if (this.f25748I1 && (Math.abs(this.f25749J1 - motionEvent.getX()) > C1357a0.m37537p() || Math.abs(this.f25750K1 - motionEvent.getY()) > C1357a0.m37537p())) {
                this.f25748I1 = false;
            }
        } else if (this.f25748I1) {
            if (m14138N1()) {
                C2065g.m35722c(this);
            }
            this.f25748I1 = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z) {
        this.f25743D1 = z;
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setController(View$OnClickListenerC2971rh rhVar) {
        this.f25754w1.m8366Q(rhVar);
    }

    public void setIsScrolling(boolean z) {
        if (this.f25744E1 != z) {
            this.f25744E1 = z;
            if (this.f25746G1 == null) {
                this.f25746G1 = new C3950k(0, this, C2057b.f7280b, 180L, this.f25745F1);
            }
            if (!this.f25746G1.m29533v() || z) {
                this.f25747H1 = false;
                this.f25746G1.m29555F(z ? 0L : 1500L);
                this.f25746G1.m29530y(z ? 120L : 180L);
                this.f25746G1.m29546i(z ? 1.0f : 0.0f);
                return;
            }
            this.f25747H1 = true;
        }
    }

    public void setManager(C9678w2 w2Var) {
        this.f25752u1 = w2Var;
    }

    public void setMessageAnimatorEnabled(boolean z) {
        if (this.f25756y1 != z) {
            this.f25756y1 = z;
        }
    }

    @Override
    public void setTranslationY(float f) {
        if (this.f25745F1 == 0.0f) {
            super.setTranslationY(f);
        } else if (getTranslationY() != f) {
            super.setTranslationY(f);
            m14140L1();
        }
    }

    public MessagesRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m14141K1();
    }
}
