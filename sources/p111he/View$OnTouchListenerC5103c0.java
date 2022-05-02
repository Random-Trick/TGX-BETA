package p111he;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import be.C1399s0;
import ge.C4868i;
import java.util.Iterator;
import java.util.List;
import me.C6924j2;
import me.C6941k2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p111he.View$OnTouchListenerC5103c0;
import p139jb.AbstractC5911c;
import p350yd.C10930q6;
import p350yd.C11059v7;
import p350yd.C11165z7;
import p364zd.AbstractC11531p;
import p364zd.C11537v;
import td.C9207i1;

public class View$OnTouchListenerC5103c0 implements View.OnTouchListener, View.OnLongClickListener {
    public final C11537v f17139M;
    public final AbstractC11531p f17140N;
    public C6924j2 f17141a;
    public final AbstractC5106c f17142b;
    public final AbstractC5105b f17143c;

    public interface AbstractC5105b {
        void mo4198I0(View view, View view2);
    }

    public interface AbstractC5106c {
        List<C5104a> mo2024N3(View view);
    }

    public View$OnTouchListenerC5103c0(AbstractC5106c cVar, AbstractC5105b bVar, C11537v vVar, AbstractC11531p pVar) {
        this.f17142b = cVar;
        this.f17143c = bVar;
        this.f17139M = vVar;
        this.f17140N = pVar;
    }

    public static void m23953h(View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewParent parent = view2.getParent();
        if (parent != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int measuredHeight = view2.getMeasuredHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            ViewGroup viewGroup = (ViewGroup) parent;
            int measuredWidth3 = viewGroup.getMeasuredWidth();
            int measuredHeight3 = viewGroup.getMeasuredHeight();
            if (measuredWidth > 0 && measuredHeight > 0 && measuredWidth3 > 0 && measuredHeight3 > 0) {
                int[] u = C1399s0.m37157u(view);
                int i9 = u[0] + (measuredWidth2 / 2);
                int i10 = measuredHeight2 / 2;
                int[] u2 = C1399s0.m37157u(view2);
                u2[0] = (int) (u2[0] - view2.getTranslationX());
                u2[1] = (int) (u2[1] - view2.getTranslationY());
                int i11 = measuredWidth / 2;
                int i12 = u2[0] + i11;
                int i13 = measuredHeight / 2;
                int i14 = ((u[1] + i10) - i10) - i13;
                view2.setTranslationX(Math.max(i11, Math.min(measuredWidth3 - i11, i9)) - i12);
                view2.setTranslationY(i14 - (u2[1] + i13));
            }
        }
    }

    public void m23951j(List list, C6924j2 j2Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((C5104a) it.next()).mo4501a3();
        }
        if (this.f17141a == j2Var) {
            this.f17141a = null;
        }
    }

    public View$OnTouchListenerC5103c0 m23957d(View view) {
        view.setOnLongClickListener(this);
        return this;
    }

    public View$OnTouchListenerC5103c0 m23956e(View view) {
        view.setOnLongClickListener(null);
        return this;
    }

    public final void m23955f(View view, float f, float f2, boolean z) {
    }

    public void m23954g() {
        C6924j2 j2Var = this.f17141a;
        if (j2Var != null) {
            j2Var.m18408y2(true);
            this.f17141a = null;
        }
    }

    public final void m23952i(C5104a aVar, View view, View view2) {
        C6924j2 j2Var = this.f17141a;
        if (j2Var != null && !j2Var.m18446A2()) {
            this.f17143c.mo4198I0(view, view2);
            if (aVar.f17148Q != null) {
                aVar.f17148Q.onClick(view);
            }
            m23954g();
        }
    }

    public final void m23949l(final View view, final List<C5104a> list) {
        C6924j2 j2Var = this.f17141a;
        if (j2Var != null) {
            j2Var.m18408y2(false);
        }
        C9207i1 i1Var = new C9207i1(view.getContext());
        i1Var.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                View$OnTouchListenerC5103c0.m23953h(view, view2, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        i1Var.m9968b(this.f17139M, this.f17140N);
        for (final C5104a aVar : list) {
            aVar.f17150S = i1Var.m9969a(aVar.f17151a, aVar.f17152b, aVar.f17153c, aVar.f17144M, new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    View$OnTouchListenerC5103c0.this.m23952i(aVar, view, view2);
                }
            });
            aVar.f17150S.setVisibility(aVar.m23940h() ? 0 : 8);
            if (aVar.f17149R != 0) {
                C4868i.m24727c2().m24583u2(aVar.f17149R);
            }
        }
        i1Var.setAnchorMode(0);
        i1Var.setShouldPivotBottom(true);
        i1Var.setRightNumber(0);
        C6924j2 j2Var2 = new C6924j2(view.getContext());
        this.f17141a = j2Var2;
        j2Var2.m18045Q1(false);
        this.f17141a.m18435N2();
        this.f17141a.setOverlayStatusBar(true);
        this.f17141a.setDismissListener(new C6924j2.AbstractC6930f() {
            @Override
            public void mo3000j2(C6924j2 j2Var3) {
                C6941k2.m18400a(this, j2Var3);
            }

            @Override
            public final void mo2999y4(C6924j2 j2Var3) {
                View$OnTouchListenerC5103c0.this.m23951j(list, j2Var3);
            }
        });
        this.f17141a.m18431R2(i1Var);
    }

    public final void m23948m(View view, float f, float f2) {
    }

    @Override
    public boolean onLongClick(View view) {
        List<C5104a> N3 = this.f17142b.mo2024N3(view);
        if (N3 == null || N3.isEmpty()) {
            return false;
        }
        m23949l(view, N3);
        return true;
    }

    @Override
    public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: p111he.View$OnTouchListenerC5103c0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public static class C5104a implements AbstractC5911c {
        public final Drawable f17144M;
        public C10930q6 f17145N;
        public long f17146O;
        public C11059v7.AbstractC11069j f17147P;
        public View.OnClickListener f17148Q;
        public long f17149R;
        public View f17150S;
        public final int f17151a;
        public final CharSequence f17152b;
        public final int f17153c;

        public C5104a(int i, CharSequence charSequence, int i2) {
            this.f17151a = i;
            this.f17152b = charSequence;
            this.f17153c = i2;
            this.f17144M = null;
        }

        public void m23939i(long j, long j2, TdApi.UserStatus userStatus, boolean z) {
            if (j2 == j) {
                int i = 0;
                boolean z2 = (userStatus == null || userStatus.getConstructor() != -759984891 || ((TdApi.UserStatusOffline) userStatus).wasOnline == 0) ? false : true;
                View view = this.f17150S;
                if (view != null) {
                    if (!z2) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
            }
        }

        @Override
        public void mo4501a3() {
            C10930q6 q6Var = this.f17145N;
            if (q6Var != null && this.f17147P != null) {
                q6Var.m2480e2().m1599r2(this.f17146O, this.f17147P);
                this.f17145N = null;
                this.f17147P = null;
                this.f17150S = null;
            }
        }

        public C5104a m23942f(C10930q6 q6Var, final long j) {
            if (!(q6Var == null || j == 0)) {
                this.f17145N = q6Var;
                this.f17146O = j;
                this.f17147P = new C11059v7.AbstractC11069j() {
                    @Override
                    public boolean mo1350D3() {
                        return C11165z7.m1323a(this);
                    }

                    @Override
                    public final void mo1349J3(long j2, TdApi.UserStatus userStatus, boolean z) {
                        View$OnTouchListenerC5103c0.C5104a.this.m23939i(j, j2, userStatus, z);
                    }
                };
                q6Var.m2480e2().m1650e2(j, this.f17147P);
            }
            return this;
        }

        public C5104a m23941g(long j) {
            this.f17149R = j;
            return this;
        }

        public boolean m23940h() {
            C10930q6 q6Var;
            return this.f17146O == 0 || (q6Var = this.f17145N) == null || q6Var.m2480e2().m1729I2(this.f17146O);
        }

        public C5104a m23938j(View.OnClickListener onClickListener) {
            this.f17148Q = onClickListener;
            return this;
        }

        public C5104a(int i, CharSequence charSequence, Drawable drawable) {
            this.f17151a = i;
            this.f17152b = charSequence;
            this.f17153c = 0;
            this.f17144M = drawable;
        }
    }
}
