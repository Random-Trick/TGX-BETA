package p038ce;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bd.C1355a;
import be.C1357a0;
import be.C1389o;
import gd.AbstractC4718o;
import me.AbstractC6828a;
import me.C6847b2;
import me.C6852c1;
import me.C6861d2;
import me.C6977n2;
import me.C6981o;
import me.C6985o2;
import me.C6992p0;
import me.C6998q0;
import me.C7023s1;
import me.RunnableC6868e2;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7368l;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import p037cb.C2065g;
import p066eb.AbstractC4178a;
import p082fd.C4403w;
import p139jb.AbstractC5911c;
import p291uc.C9621o;
import p334xc.C10185a;
import p364zd.C11524j;
import td.AbstractC9323v4;
import td.C9256o0;

public class C2139ap extends RecyclerView.AbstractC0886d0 {

    public class C2140a extends AbstractC4178a {
        @Override
        public boolean mo25356a(char c) {
            return (c >= '0' && c <= '9') || c == '.';
        }
    }

    public class C2141b extends AbstractC4178a {
        @Override
        public boolean mo25356a(char c) {
            return c >= '0' && c <= '9';
        }
    }

    public class C2142c extends FrameLayoutFix {
        public C2142c(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((C1357a0.m37547f() / 2) + C1357a0.m37544i(56.0f), Log.TAG_TDLIB_OPTIONS));
        }
    }

    public class C2143d extends FrameLayoutFix {
        public int f7532M;
        public final C2546iq f7533N;

        public C2143d(Context context, C2546iq iqVar) {
            super(context);
            this.f7533N = iqVar;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            if (this.f7532M != measuredHeight) {
                this.f7532M = measuredHeight;
                if (this.f7533N.m34248D0() != null) {
                    this.f7533N.m34248D0().mo23937a(this, measuredHeight);
                }
            }
        }
    }

    public class C2144e extends RecyclerView {
        public int f7534u1;

        public C2144e(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f7534u1;
            if (!(i3 == 0 || i3 == measuredWidth)) {
                m39507A0();
            }
            this.f7534u1 = measuredWidth;
        }
    }

    public class C2145f extends RecyclerView.AbstractC0901o {
        @Override
        public void mo7527g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0880a0 a0Var) {
            RecyclerView.AbstractC0886d0 l0 = recyclerView.m39421l0(view);
            if (l0 == null || l0.m39338k() != 0) {
                rect.left = 0;
                return;
            }
            int D = recyclerView.getAdapter().mo6153D();
            int i = C1357a0.m37544i(17.0f);
            int i2 = i + i + C1357a0.m37544i(50.0f);
            if (D != 0) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                int max = Math.max(i2, measuredWidth / D);
                if (max > i2) {
                    max = Math.max(i2, (measuredWidth - (max - i2)) / D);
                }
                rect.left = Math.max(0, (measuredWidth - (max * D)) / 2);
                return;
            }
            rect.left = 0;
        }
    }

    public class C2146g extends FrameLayoutFix {
        public final C2546iq f7535M;
        public final int f7536N;

        public C2146g(Context context, C2546iq iqVar, int i) {
            super(context);
            this.f7535M = iqVar;
            this.f7536N = i;
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3;
            View C;
            ViewParent viewParent = this;
            do {
                viewParent = viewParent.getParent();
                if (viewParent instanceof RecyclerView) {
                    break;
                }
            } while (viewParent != null);
            int T0 = this.f7535M.m34213T0(this.f7536N);
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < T0; i6++) {
                int A = this.f7535M.m34243F0().get(i6).m32879A();
                if (A != 16 || viewParent == null || (C = ((RecyclerView) viewParent).getLayoutManager().mo39265C(i6)) == null) {
                    i3 = C2139ap.m35482W(A);
                } else {
                    i3 = C.getMeasuredHeight();
                }
                i5 += i3;
            }
            if (viewParent != null) {
                i4 = ((RecyclerView) viewParent).getMeasuredHeight();
            }
            int i7 = i4 - i5;
            if (i7 > C1357a0.m37544i(240.0f)) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i7, Log.TAG_TDLIB_OPTIONS));
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    public class C2147h extends FrameLayoutFix {
        public C2147h(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3;
            int W = C2139ap.m35482W(3) + C2139ap.m35482W(2) + C2139ap.m35482W(20);
            ViewParent viewParent = this;
            do {
                viewParent = viewParent.getParent();
                if (viewParent instanceof RecyclerView) {
                    break;
                }
            } while (viewParent != null);
            int measuredHeight = viewParent != null ? ((RecyclerView) viewParent).getMeasuredHeight() : 0;
            int i4 = measuredHeight - W;
            int id2 = getId();
            if (id2 == R.id.changePhoneText) {
                i3 = C1357a0.m37544i(310.0f);
            } else if (id2 != R.id.inviteFriendsText) {
                i3 = C1357a0.m37544i(240.0f);
            } else {
                i3 = C1357a0.m37544i(120.0f);
            }
            if (i4 <= i3) {
                super.onMeasure(i, i2);
            } else {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((measuredHeight / 2) - (((W + i3) + C1357a0.m37544i(12.0f)) / 2)) + i3, Log.TAG_TDLIB_OPTIONS));
            }
        }
    }

    public class C2148i extends C6977n2 {
        public C2148i(Context context) {
            super(context);
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop() + (((measuredHeight - getPaddingTop()) - getPaddingBottom()) / 2);
            int top = getTop();
            int paddingTop2 = ((measuredHeight - getPaddingTop()) - getPaddingBottom()) - Math.abs(top);
            if (paddingTop2 > 0) {
                if (top != 0) {
                    canvas.save();
                    canvas.translate(0.0f, ((getPaddingTop() + ((int) (((C2139ap.m35482W(39) / 2) + C2139ap.m35482W(3)) * (1.0f - (paddingTop2 / measuredHeight))))) + ((paddingTop2 / 2) * ((int) Math.signum(top)))) - paddingTop);
                }
                super.onDraw(canvas);
                if (top != 0) {
                    canvas.restore();
                }
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3 = 0;
            if (getParent() != null) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((((View) getParent()).getMeasuredHeight() - C2139ap.m35482W(39)) - C2139ap.m35482W(3)) - C2139ap.m35482W(3)), Log.TAG_TDLIB_OPTIONS);
            }
            super.onMeasure(i, i3);
        }
    }

    public class C2149j extends C6852c1 {
        public C2149j(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int i3 = 0;
            if (getParent() != null) {
                i3 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((((View) getParent()).getMeasuredHeight() - C2139ap.m35482W(39)) - C2139ap.m35482W(3)) - C2139ap.m35482W(3)), Log.TAG_TDLIB_OPTIONS);
            }
            super.onMeasure(i, i3);
        }
    }

    public class C2150k extends AbstractC4178a {
        @Override
        public boolean mo25356a(char c) {
            return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F');
        }
    }

    public static class C2151l extends View {
        public C2964ra f7537a;

        public C2151l(Context context) {
            super(context);
        }

        private int getDesiredHeight() {
            C2964ra raVar = this.f7537a;
            if (raVar != null) {
                return raVar.m32840h();
            }
            return 0;
        }

        @Override
        public void onDraw(Canvas canvas) {
            C2964ra raVar = this.f7537a;
            if (raVar != null && raVar.m32851b()) {
                canvas.drawColor(C11524j.m148w());
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.MeasureSpec.makeMeasureSpec(getDesiredHeight(), Log.TAG_TDLIB_OPTIONS));
        }

        public void setItem(C2964ra raVar) {
            C2964ra raVar2 = this.f7537a;
            boolean z = true;
            boolean z2 = raVar2 != null && raVar2.m32851b();
            this.f7537a = raVar;
            if (getMeasuredHeight() != getDesiredHeight()) {
                requestLayout();
            }
            if (raVar == null || !raVar.m32851b()) {
                z = false;
            }
            if (z2 != z) {
                invalidate();
            }
        }
    }

    public C2139ap(View view) {
        super(view);
    }

    public static p038ce.C2139ap m35488Q(android.content.Context r21, p350yd.C10930q6 r22, int r23, final p038ce.C2546iq r24, android.view.View.OnClickListener r25, android.view.View.OnLongClickListener r26, td.AbstractC9323v4<?> r27, androidx.recyclerview.widget.RecyclerView.AbstractC0910t r28, p080fb.C4336c.AbstractC4337a r29) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2139ap.m35488Q(android.content.Context, yd.q6, int, ce.iq, android.view.View$OnClickListener, android.view.View$OnLongClickListener, td.v4, androidx.recyclerview.widget.RecyclerView$t, fb.c$a):ce.ap");
    }

    public static TextView m35487R(Context context, int i, int i2, View.OnClickListener onClickListener, AbstractC9323v4<?> v4Var) {
        C6847b2 b2Var = new C6847b2(context);
        if (i == 71) {
            b2Var.setGravity(17);
        } else {
            b2Var.setGravity((C4403w.m27986G2() ? 5 : 3) | 16);
        }
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        b2Var.setTypeface(C1389o.m37261k());
        if (i == 93) {
            b2Var.setTextColor(C11524j.m213U0());
            b2Var.setTextSize(1, 12.0f);
            b2Var.setPadding(C1357a0.m37544i(16.0f), 0, C1357a0.m37544i(16.0f), C1357a0.m37544i(12.0f));
            C2065g.m35721d(b2Var, new C7368l(R.id.theme_color_filling));
            if (v4Var != null) {
                v4Var.m9119z8(b2Var, R.id.theme_color_textLight);
                v4Var.m9163t8(b2Var);
            }
        } else {
            b2Var.setTextColor(C11524j.m228N(i2));
            if (v4Var != null) {
                v4Var.m9119z8(b2Var, i2);
            }
            b2Var.setTextSize(1, 15.0f);
            b2Var.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(6.0f), C1357a0.m37544i(16.0f), C1357a0.m37544i(12.0f));
        }
        b2Var.setLinkTextColor(C11524j.m211V0());
        b2Var.setHighlightColor(C11524j.m209W0());
        if (v4Var != null) {
            v4Var.m9156u8(b2Var, R.id.theme_color_textLink);
            v4Var.m9178r8(b2Var, R.id.theme_color_textLinkPressHighlight);
        }
        b2Var.setOnClickListener(onClickListener);
        b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return b2Var;
    }

    public static boolean m35484U(int i) {
        if (i == 4 || i == 5 || i == 6 || i == 7 || i == 12 || i == 13 || i == 22 || i == 37 || i == 47 || i == 67 || i == 69 || i == 77 || i == 85 || i == 79 || i == 80 || i == 98 || i == 99) {
            return true;
        }
        switch (i) {
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
                return true;
            default:
                return false;
        }
    }

    public static void m35483V(C2546iq iqVar, FrameLayoutFix frameLayoutFix, View$OnFocusChangeListenerC7069y1 y1Var, C6985o2 o2Var) {
        iqVar.mo34236I1((C2964ra) frameLayoutFix.getTag(), frameLayoutFix, y1Var, o2Var);
    }

    public static int m35482W(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C2139ap.m35482W(int):int");
    }

    public static int m35481X(C2964ra raVar) {
        int A = raVar.m32879A();
        if (A == 35) {
            return raVar.m32840h();
        }
        if (A != 41) {
            return m35482W(A);
        }
        Object d = raVar.m32847d();
        if (d == null || !(d instanceof AbstractC4718o)) {
            return 0;
        }
        return ((AbstractC4718o) d).m26338o();
    }

    public void m35489P() {
        int n = m39335n();
        if (n != 16) {
            if (!(n == 23 || n == 26)) {
                if (n == 38) {
                    return;
                }
                if (n == 43) {
                    ((C6977n2) this.f3479a).mo8225f();
                    return;
                } else if (n == 57) {
                    ((C6981o) this.f3479a).m18195f();
                    return;
                } else if (n == 72) {
                    ((C7023s1) ((ViewGroup) ((ViewGroup) this.f3479a).getChildAt(0)).getChildAt(0)).m18083a();
                    return;
                } else if (n != 76) {
                    if (n == 86) {
                        ((C9256o0) ((FrameLayoutFix) this.f3479a).getChildAt(0)).mo8225f();
                        return;
                    } else if (n == 40) {
                        ((C1355a) this.f3479a).m37564f();
                        return;
                    } else if (n == 41) {
                        ((C10185a) this.f3479a).m5810f();
                        return;
                    } else if (!(n == 45 || n == 46)) {
                        switch (n) {
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                                ((C6861d2) this.f3479a).m18739f();
                                return;
                            case 53:
                            case 54:
                            case 55:
                                ((RunnableC6868e2) this.f3479a).m18716f();
                                return;
                            default:
                                switch (n) {
                                    case 130:
                                        ((EmbeddableStickerView) this.f3479a).m14047a();
                                        return;
                                    case 131:
                                        ((C6998q0) this.f3479a).m18123f();
                                        return;
                                    case 132:
                                        ((C9621o) this.f3479a).m7995f();
                                        return;
                                    default:
                                        View view = this.f3479a;
                                        if (view instanceof AbstractC6828a) {
                                            ((AbstractC6828a) view).mo8225f();
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                }
            }
            ((C6992p0) this.f3479a).m18147b();
            return;
        }
        ((AbstractC6828a) ((RelativeLayout) this.f3479a).getChildAt(4)).mo8225f();
        if (n == 76) {
            ((AbstractC6828a) ((RelativeLayout) this.f3479a).getChildAt(5)).mo8225f();
        }
    }

    public void m35486S() {
        int n = m39335n();
        if (n == 16 || n == 76) {
            ((AbstractC5911c) ((RelativeLayout) this.f3479a).getChildAt(4)).mo4501a3();
            if (n == 76) {
                ((AbstractC5911c) ((RelativeLayout) this.f3479a).getChildAt(5)).mo4501a3();
                return;
            }
            return;
        }
        View view = this.f3479a;
        if (view instanceof AbstractC5911c) {
            ((AbstractC5911c) view).mo4501a3();
        }
    }

    public void m35485T() {
        int n = m39335n();
        if (n != 16) {
            if (!(n == 23 || n == 26)) {
                if (n == 38) {
                    return;
                }
                if (n == 43) {
                    ((C6977n2) this.f3479a).mo8229b();
                    return;
                } else if (n == 57) {
                    ((C6981o) this.f3479a).m18199b();
                    return;
                } else if (n == 72) {
                    ((C7023s1) ((ViewGroup) ((ViewGroup) this.f3479a).getChildAt(0)).getChildAt(0)).m18080d();
                    return;
                } else if (n != 76) {
                    if (n == 86) {
                        ((C9256o0) ((FrameLayoutFix) this.f3479a).getChildAt(0)).mo8229b();
                        return;
                    } else if (n == 40) {
                        ((C1355a) this.f3479a).m37565b();
                        return;
                    } else if (n == 41) {
                        ((C10185a) this.f3479a).m5811b();
                        return;
                    } else if (!(n == 45 || n == 46)) {
                        switch (n) {
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                                ((C6861d2) this.f3479a).m18740b();
                                return;
                            case 53:
                            case 54:
                            case 55:
                                ((RunnableC6868e2) this.f3479a).m18717b();
                                return;
                            default:
                                switch (n) {
                                    case 130:
                                        ((EmbeddableStickerView) this.f3479a).m14046b();
                                        return;
                                    case 131:
                                        ((C6998q0) this.f3479a).m18124b();
                                        return;
                                    case 132:
                                        ((C9621o) this.f3479a).m7996b();
                                        return;
                                    default:
                                        View view = this.f3479a;
                                        if (view instanceof AbstractC6828a) {
                                            ((AbstractC6828a) view).mo8229b();
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                }
            }
            ((C6992p0) this.f3479a).m18145d();
            return;
        }
        ((AbstractC6828a) ((RelativeLayout) this.f3479a).getChildAt(4)).mo8229b();
        if (n == 76) {
            ((AbstractC6828a) ((RelativeLayout) this.f3479a).getChildAt(5)).mo8229b();
        }
    }
}
