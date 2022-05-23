package de;

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
import ce.a0;
import ce.o;
import gd.w;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.c1;
import ne.d2;
import ne.e2;
import ne.n2;
import ne.o2;
import ne.p0;
import ne.q0;
import ne.s1;
import ne.y1;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.EmbeddableStickerView;
import ud.o0;
import ud.v4;
import vc.n;

public class ap extends RecyclerView.c0 {

    public class a extends fb.a {
        @Override
        public boolean a(char c10) {
            return (c10 >= '0' && c10 <= '9') || c10 == '.';
        }
    }

    public class b extends fb.a {
        @Override
        public boolean a(char c10) {
            return c10 >= '0' && c10 <= '9';
        }
    }

    public class c extends FrameLayoutFix {
        public c(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((a0.f() / 2) + a0.i(56.0f), Log.TAG_TDLIB_OPTIONS));
        }
    }

    public class d extends FrameLayoutFix {
        public int M;
        public final iq N;

        public d(Context context, iq iqVar) {
            super(context);
            this.N = iqVar;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredHeight = getMeasuredHeight();
            if (this.M != measuredHeight) {
                this.M = measuredHeight;
                if (this.N.B0() != null) {
                    this.N.B0().a(this, measuredHeight);
                }
            }
        }
    }

    public class e extends RecyclerView {
        public int f7482t1;

        public e(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int measuredWidth = getMeasuredWidth();
            int i12 = this.f7482t1;
            if (!(i12 == 0 || i12 == measuredWidth)) {
                A0();
            }
            this.f7482t1 = measuredWidth;
        }
    }

    public class f extends RecyclerView.o {
        @Override
        public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            RecyclerView.c0 l02 = recyclerView.l0(view);
            if (l02 == null || l02.k() != 0) {
                rect.left = 0;
                return;
            }
            int D = recyclerView.getAdapter().D();
            int i10 = a0.i(17.0f);
            int i11 = i10 + i10 + a0.i(50.0f);
            if (D != 0) {
                int measuredWidth = recyclerView.getMeasuredWidth();
                int max = Math.max(i11, measuredWidth / D);
                if (max > i11) {
                    max = Math.max(i11, (measuredWidth - (max - i11)) / D);
                }
                rect.left = Math.max(0, (measuredWidth - (max * D)) / 2);
                return;
            }
            rect.left = 0;
        }
    }

    public class g extends FrameLayoutFix {
        public final iq M;
        public final int N;

        public g(Context context, iq iqVar, int i10) {
            super(context);
            this.M = iqVar;
            this.N = i10;
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int i12;
            View C;
            ViewParent viewParent = this;
            do {
                viewParent = viewParent.getParent();
                if (viewParent instanceof RecyclerView) {
                    break;
                }
            } while (viewParent != null);
            int R0 = this.M.R0(this.N);
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < R0; i15++) {
                int A = this.M.D0().get(i15).A();
                if (A != 16 || viewParent == null || (C = ((RecyclerView) viewParent).getLayoutManager().C(i15)) == null) {
                    i12 = ap.W(A);
                } else {
                    i12 = C.getMeasuredHeight();
                }
                i14 += i12;
            }
            if (viewParent != null) {
                i13 = ((RecyclerView) viewParent).getMeasuredHeight();
            }
            int i16 = i13 - i14;
            if (i16 > a0.i(240.0f)) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i16, Log.TAG_TDLIB_OPTIONS));
            } else {
                super.onMeasure(i10, i11);
            }
        }
    }

    public class h extends FrameLayoutFix {
        public h(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int i12;
            int W = ap.W(3) + ap.W(2) + ap.W(20);
            ViewParent viewParent = this;
            do {
                viewParent = viewParent.getParent();
                if (viewParent instanceof RecyclerView) {
                    break;
                }
            } while (viewParent != null);
            int measuredHeight = viewParent != null ? ((RecyclerView) viewParent).getMeasuredHeight() : 0;
            int i13 = measuredHeight - W;
            int id2 = getId();
            if (id2 == R.id.changePhoneText) {
                i12 = a0.i(310.0f);
            } else if (id2 != R.id.inviteFriendsText) {
                i12 = a0.i(240.0f);
            } else {
                i12 = a0.i(120.0f);
            }
            if (i13 <= i12) {
                super.onMeasure(i10, i11);
            } else {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((measuredHeight / 2) - (((W + i12) + a0.i(12.0f)) / 2)) + i12, Log.TAG_TDLIB_OPTIONS));
            }
        }
    }

    public class i extends n2 {
        public i(Context context) {
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
                    canvas.translate(0.0f, ((getPaddingTop() + ((int) (((ap.W(39) / 2) + ap.W(3)) * (1.0f - (paddingTop2 / measuredHeight))))) + ((paddingTop2 / 2) * ((int) Math.signum(top)))) - paddingTop);
                }
                super.onDraw(canvas);
                if (top != 0) {
                    canvas.restore();
                }
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int i12 = 0;
            if (getParent() != null) {
                i12 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((((View) getParent()).getMeasuredHeight() - ap.W(39)) - ap.W(3)) - ap.W(3)), Log.TAG_TDLIB_OPTIONS);
            }
            super.onMeasure(i10, i12);
        }
    }

    public class j extends c1 {
        public j(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int i12 = 0;
            if (getParent() != null) {
                i12 = View.MeasureSpec.makeMeasureSpec(Math.max(0, ((((View) getParent()).getMeasuredHeight() - ap.W(39)) - ap.W(3)) - ap.W(3)), Log.TAG_TDLIB_OPTIONS);
            }
            super.onMeasure(i10, i12);
        }
    }

    public class k extends fb.a {
        @Override
        public boolean a(char c10) {
            return (c10 >= '0' && c10 <= '9') || (c10 >= 'a' && c10 <= 'f') || (c10 >= 'A' && c10 <= 'F');
        }
    }

    public static class l extends View {
        public ra f7483a;

        public l(Context context) {
            super(context);
        }

        private int getDesiredHeight() {
            ra raVar = this.f7483a;
            if (raVar != null) {
                return raVar.h();
            }
            return 0;
        }

        @Override
        public void onDraw(Canvas canvas) {
            ra raVar = this.f7483a;
            if (raVar != null && raVar.b()) {
                canvas.drawColor(ae.j.u());
            }
        }

        @Override
        public void onMeasure(int i10, int i11) {
            setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i10), View.MeasureSpec.makeMeasureSpec(getDesiredHeight(), Log.TAG_TDLIB_OPTIONS));
        }

        public void setItem(ra raVar) {
            ra raVar2 = this.f7483a;
            boolean z10 = true;
            boolean z11 = raVar2 != null && raVar2.b();
            this.f7483a = raVar;
            if (getMeasuredHeight() != getDesiredHeight()) {
                requestLayout();
            }
            if (raVar == null || !raVar.b()) {
                z10 = false;
            }
            if (z11 != z10) {
                invalidate();
            }
        }
    }

    public ap(View view) {
        super(view);
    }

    public static de.ap Q(android.content.Context r21, zd.o6 r22, int r23, final de.iq r24, android.view.View.OnClickListener r25, android.view.View.OnLongClickListener r26, ud.v4<?> r27, androidx.recyclerview.widget.RecyclerView.t r28, gb.c.a r29) {
        throw new UnsupportedOperationException("Method not decompiled: de.ap.Q(android.content.Context, zd.o6, int, de.iq, android.view.View$OnClickListener, android.view.View$OnLongClickListener, ud.v4, androidx.recyclerview.widget.RecyclerView$t, gb.c$a):de.ap");
    }

    public static TextView R(Context context, int i10, int i11, View.OnClickListener onClickListener, v4<?> v4Var) {
        b2 b2Var = new b2(context);
        if (i10 == 71) {
            b2Var.setGravity(17);
        } else {
            b2Var.setGravity((w.G2() ? 5 : 3) | 16);
        }
        b2Var.setMovementMethod(LinkMovementMethod.getInstance());
        b2Var.setTypeface(o.k());
        if (i10 == 93) {
            b2Var.setTextColor(ae.j.R0());
            b2Var.setTextSize(1, 12.0f);
            b2Var.setPadding(a0.i(16.0f), 0, a0.i(16.0f), a0.i(12.0f));
            db.g.d(b2Var, new oc.l(R.id.theme_color_filling));
            if (v4Var != null) {
                v4Var.z8(b2Var, R.id.theme_color_textLight);
                v4Var.t8(b2Var);
            }
        } else {
            b2Var.setTextColor(ae.j.L(i11));
            if (v4Var != null) {
                v4Var.z8(b2Var, i11);
            }
            b2Var.setTextSize(1, 15.0f);
            b2Var.setPadding(a0.i(16.0f), a0.i(6.0f), a0.i(16.0f), a0.i(12.0f));
        }
        b2Var.setLinkTextColor(ae.j.S0());
        b2Var.setHighlightColor(ae.j.T0());
        if (v4Var != null) {
            v4Var.u8(b2Var, R.id.theme_color_textLink);
            v4Var.r8(b2Var, R.id.theme_color_textLinkPressHighlight);
        }
        b2Var.setOnClickListener(onClickListener);
        b2Var.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return b2Var;
    }

    public static boolean U(int i10) {
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 22 || i10 == 37 || i10 == 47 || i10 == 67 || i10 == 69 || i10 == 77 || i10 == 85 || i10 == 79 || i10 == 80 || i10 == 98 || i10 == 99) {
            return true;
        }
        switch (i10) {
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

    public static void V(iq iqVar, FrameLayoutFix frameLayoutFix, y1 y1Var, o2 o2Var) {
        iqVar.C1((ra) frameLayoutFix.getTag(), frameLayoutFix, y1Var, o2Var);
    }

    public static int W(int r10) {
        throw new UnsupportedOperationException("Method not decompiled: de.ap.W(int):int");
    }

    public static int X(ra raVar) {
        int A = raVar.A();
        if (A == 35) {
            return raVar.h();
        }
        if (A != 41) {
            return W(A);
        }
        Object d10 = raVar.d();
        if (d10 == null || !(d10 instanceof hd.o)) {
            return 0;
        }
        return ((hd.o) d10).o();
    }

    public void P() {
        int n10 = n();
        if (n10 != 16) {
            if (!(n10 == 23 || n10 == 26)) {
                if (n10 == 38) {
                    return;
                }
                if (n10 == 43) {
                    ((n2) this.f2982a).e();
                    return;
                } else if (n10 == 57) {
                    ((ne.o) this.f2982a).e();
                    return;
                } else if (n10 == 72) {
                    ((s1) ((ViewGroup) ((ViewGroup) this.f2982a).getChildAt(0)).getChildAt(0)).a();
                    return;
                } else if (n10 != 76) {
                    if (n10 == 86) {
                        ((o0) ((FrameLayoutFix) this.f2982a).getChildAt(0)).e();
                        return;
                    } else if (n10 == 40) {
                        ((cd.a) this.f2982a).e();
                        return;
                    } else if (n10 == 41) {
                        ((yc.a) this.f2982a).e();
                        return;
                    } else if (!(n10 == 45 || n10 == 46)) {
                        switch (n10) {
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                                ((d2) this.f2982a).e();
                                return;
                            case 53:
                            case 54:
                            case 55:
                                ((e2) this.f2982a).e();
                                return;
                            default:
                                switch (n10) {
                                    case 130:
                                        ((EmbeddableStickerView) this.f2982a).a();
                                        return;
                                    case 131:
                                        ((q0) this.f2982a).e();
                                        return;
                                    case 132:
                                        ((n) this.f2982a).e();
                                        return;
                                    default:
                                        View view = this.f2982a;
                                        if (view instanceof ne.a) {
                                            ((ne.a) view).e();
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                }
            }
            ((p0) this.f2982a).b();
            return;
        }
        ((ne.a) ((RelativeLayout) this.f2982a).getChildAt(4)).e();
        if (n10 == 76) {
            ((ne.a) ((RelativeLayout) this.f2982a).getChildAt(5)).e();
        }
    }

    public void S() {
        int n10 = n();
        if (n10 == 16 || n10 == 76) {
            ((kb.c) ((RelativeLayout) this.f2982a).getChildAt(4)).Q2();
            if (n10 == 76) {
                ((kb.c) ((RelativeLayout) this.f2982a).getChildAt(5)).Q2();
                return;
            }
            return;
        }
        View view = this.f2982a;
        if (view instanceof kb.c) {
            ((kb.c) view).Q2();
        }
    }

    public void T() {
        int n10 = n();
        if (n10 != 16) {
            if (!(n10 == 23 || n10 == 26)) {
                if (n10 == 38) {
                    return;
                }
                if (n10 == 43) {
                    ((n2) this.f2982a).b();
                    return;
                } else if (n10 == 57) {
                    ((ne.o) this.f2982a).b();
                    return;
                } else if (n10 == 72) {
                    ((s1) ((ViewGroup) ((ViewGroup) this.f2982a).getChildAt(0)).getChildAt(0)).d();
                    return;
                } else if (n10 != 76) {
                    if (n10 == 86) {
                        ((o0) ((FrameLayoutFix) this.f2982a).getChildAt(0)).b();
                        return;
                    } else if (n10 == 40) {
                        ((cd.a) this.f2982a).b();
                        return;
                    } else if (n10 == 41) {
                        ((yc.a) this.f2982a).b();
                        return;
                    } else if (!(n10 == 45 || n10 == 46)) {
                        switch (n10) {
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                                ((d2) this.f2982a).b();
                                return;
                            case 53:
                            case 54:
                            case 55:
                                ((e2) this.f2982a).b();
                                return;
                            default:
                                switch (n10) {
                                    case 130:
                                        ((EmbeddableStickerView) this.f2982a).b();
                                        return;
                                    case 131:
                                        ((q0) this.f2982a).b();
                                        return;
                                    case 132:
                                        ((n) this.f2982a).b();
                                        return;
                                    default:
                                        View view = this.f2982a;
                                        if (view instanceof ne.a) {
                                            ((ne.a) view).b();
                                            return;
                                        }
                                        return;
                                }
                        }
                    }
                }
            }
            ((p0) this.f2982a).d();
            return;
        }
        ((ne.a) ((RelativeLayout) this.f2982a).getChildAt(4)).b();
        if (n10 == 76) {
            ((ne.a) ((RelativeLayout) this.f2982a).getChildAt(5)).b();
        }
    }
}
