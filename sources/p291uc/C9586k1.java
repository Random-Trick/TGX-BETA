package p291uc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import be.C1357a0;
import be.C1359b;
import be.C1389o;
import be.C1410y;
import gd.AbstractC4761s4;
import ge.C4868i;
import me.C6847b2;
import me.C6860d1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.thunderdog.challegram.R;
import p037cb.C2065g;
import p082fd.C4403w;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C9586k1 extends RecyclerView.AbstractC0886d0 {

    public class C9587a extends C6860d1 {
        public final C9678w2 f31090b;

        public C9587a(Context context, C9678w2 w2Var) {
            super(context);
            this.f31090b = w2Var;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i;
            if (this.f31090b.m7615x3()) {
                C1359b.m37515d(this, canvas, AbstractC4761s4.m26249A2(this.f31090b));
                i = AbstractC4761s4.m26239B2(this.f31090b);
            } else {
                i = C11524j.m213U0();
            }
            setTextColorIfNeeded(i);
            super.onDraw(canvas);
        }
    }

    public class C9588b extends FrameLayoutFix {
        public C9588b(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i2);
            int i3 = C1357a0.m37541i(200.0f);
            if (i3 > defaultSize) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 0));
            } else {
                super.onMeasure(i, i2);
            }
        }
    }

    public class C9589c extends Drawable {
        public final ImageView[] f31091a;
        public final TextView[] f31092b;
        public final View[] f31093c;
        public final C9678w2 f31094d;

        public C9589c(ImageView[] imageViewArr, TextView[] textViewArr, View[] viewArr, C9678w2 w2Var) {
            this.f31091a = imageViewArr;
            this.f31092b = textViewArr;
            this.f31093c = viewArr;
            this.f31094d = w2Var;
        }

        @Override
        public void draw(Canvas canvas) {
            int top = this.f31091a[0].getTop();
            int min = Math.min(this.f31092b[0].getLeft(), this.f31092b[1].getLeft());
            int max = Math.max(this.f31092b[0].getRight(), this.f31092b[1].getRight());
            int bottom = this.f31093c[0].getBottom();
            int i = C1357a0.m37541i(6.0f);
            int i2 = C1357a0.m37541i(9.0f);
            int i3 = min - i2;
            int i4 = max + i2;
            int i5 = top - C1357a0.m37541i(12.0f);
            int i6 = bottom + C1357a0.m37541i(8.0f);
            RectF a0 = C1410y.m37050a0();
            a0.set(i3, i5, i4, i6);
            float f = i;
            canvas.drawRoundRect(a0, f, f, C1410y.m37039g(AbstractC4761s4.m26249A2(this.f31094d)));
            int B2 = AbstractC4761s4.m26239B2(this.f31094d);
            if (this.f31092b[0].getCurrentTextColor() != B2) {
                this.f31092b[0].setTextColor(B2);
                this.f31091a[0].setColorFilter(B2);
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public C9586k1(View view) {
        super(view);
    }

    public static C9586k1 m8096P(Context context, C9678w2 w2Var, int i, AbstractC9323v4<?> v4Var) {
        if (i == 0) {
            C9587a aVar = new C9587a(context, w2Var);
            aVar.setTextSize(1, C4868i.m24726c2().m24592t0());
            aVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            if (v4Var != null) {
                v4Var.m9163t8(aVar);
            }
            return new C9586k1(aVar);
        } else if (i == 100 || i == 101) {
            C9588b bVar = new C9588b(context);
            bVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            boolean z = i == 101;
            ImageView[] imageViewArr = new ImageView[1];
            TextView[] textViewArr = new TextView[2];
            View[] viewArr = new View[1];
            RelativeLayout relativeLayout = new RelativeLayout(context);
            if (z) {
                C2065g.m35718d(relativeLayout, new C9589c(imageViewArr, textViewArr, viewArr, w2Var));
                if (v4Var != null) {
                    v4Var.m9163t8(relativeLayout);
                }
            }
            relativeLayout.setLayoutParams(FrameLayoutFix.m18007t1(-1, -2, 17));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1357a0.m37541i(50.0f));
            layoutParams.addRule(14);
            layoutParams.topMargin = C1357a0.m37541i(16.0f);
            ImageView imageView = new ImageView(context);
            imageViewArr[0] = imageView;
            imageView.setId(R.id.secret_icon);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.baseline_lock_48);
            if (z) {
                imageView.setColorFilter(-1);
            } else {
                imageView.setColorFilter(C11524j.m203Z0());
                if (v4Var != null) {
                    v4Var.m9184q8(imageView, R.id.theme_color_textSecure);
                }
            }
            imageView.setLayoutParams(layoutParams);
            relativeLayout.addView(imageView);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(3, R.id.secret_icon);
            C6847b2 b2Var = new C6847b2(context);
            textViewArr[0] = b2Var;
            b2Var.setId(R.id.secret_title);
            if (z) {
                b2Var.setTextColor(-1);
            } else {
                b2Var.setTextColor(C11524j.m203Z0());
                if (v4Var != null) {
                    v4Var.m9119z8(b2Var, R.id.theme_color_textSecure);
                }
            }
            b2Var.setTextSize(1, 15.0f);
            b2Var.setTypeface(C1389o.m37260i());
            b2Var.setText(C4403w.m27869i1(R.string.SecretChats));
            b2Var.setGravity(17);
            b2Var.setPadding(0, C1357a0.m37541i(5.0f), 0, C1357a0.m37541i(10.0f));
            b2Var.setLayoutParams(layoutParams2);
            relativeLayout.addView(b2Var);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(3, R.id.secret_title);
            layoutParams3.bottomMargin = C1357a0.m37541i(16.0f);
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
            viewArr[0] = frameLayoutFix;
            frameLayoutFix.setLayoutParams(layoutParams3);
            C6847b2 b2Var2 = new C6847b2(context);
            textViewArr[1] = b2Var2;
            b2Var2.setTextSize(1, 15.0f);
            b2Var2.setGravity(3);
            b2Var2.setTypeface(C1389o.m37258k());
            b2Var2.setText(C4403w.m27865j1(R.string.format_EncryptedDescription, C4403w.m27869i1(R.string.EncryptedDescription1), C4403w.m27869i1(R.string.EncryptedDescription2), C4403w.m27869i1(R.string.EncryptedDescription3), C4403w.m27869i1(R.string.EncryptedDescription4)));
            if (z) {
                b2Var2.setTextColor(-1);
            } else {
                b2Var2.setTextColor(C11524j.m217S0());
                if (v4Var != null) {
                    v4Var.m9126y8(b2Var2);
                }
            }
            b2Var2.setLineSpacing(C1357a0.m37541i(4.0f), 1.0f);
            b2Var2.setLayoutParams(FrameLayoutFix.m18007t1(-2, -2, 1));
            frameLayoutFix.addView(b2Var2);
            relativeLayout.addView(frameLayoutFix);
            bVar.addView(relativeLayout);
            return new C9586k1(bVar);
        } else if (i < 10) {
            return new C9586k1(m8095Q(context, i, w2Var, v4Var));
        } else {
            C9565i1 i1Var = new C9565i1(context);
            i1Var.m8230a(m8095Q(context, i - 10, w2Var, v4Var), w2Var, v4Var);
            return new C9586k1(i1Var);
        }
    }

    public static C9552h1 m8095Q(Context context, int i, C9678w2 w2Var, AbstractC9323v4<?> v4Var) {
        if (i == 1) {
            C9552h1 h1Var = new C9552h1(context);
            h1Var.setManager(w2Var);
            if (v4Var != null) {
                v4Var.m9163t8(h1Var);
            }
            return h1Var;
        } else if (i == 2) {
            C9552h1 h1Var2 = new C9552h1(context);
            h1Var2.setManager(w2Var);
            if (v4Var != null) {
                v4Var.m9163t8(h1Var2);
            }
            h1Var2.m8343W0();
            return h1Var2;
        } else if (i == 3) {
            C9552h1 h1Var3 = new C9552h1(context);
            h1Var3.setManager(w2Var);
            if (v4Var != null) {
                v4Var.m9163t8(h1Var3);
            }
            h1Var3.m8344U0();
            return h1Var3;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public static C9552h1 m8093S(View view) {
        if (view instanceof C9552h1) {
            return (C9552h1) view;
        }
        if (view instanceof C9565i1) {
            return ((C9565i1) view).getMessageView();
        }
        return null;
    }

    public static boolean m8092T(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return i >= 10 && i < 100 && m8092T(i - 10);
    }

    public void m8097O() {
        int n = m39332n();
        if (!m8092T(n)) {
            return;
        }
        if (n >= 10) {
            ((C9565i1) this.f3479a).mo8225f();
        } else {
            ((C9552h1) this.f3479a).m8323w0();
        }
    }

    public void m8094R() {
        int n = m39332n();
        if (!m8092T(n)) {
            return;
        }
        if (n >= 10) {
            ((C9565i1) this.f3479a).mo8229b();
        } else {
            ((C9552h1) this.f3479a).m8321x0();
        }
    }

    public void m8091U(AbstractC4761s4 s4Var) {
        if (m39332n() >= 10) {
            ((C9565i1) this.f3479a).setMessage(s4Var);
        } else {
            ((C9552h1) this.f3479a).setMessage(s4Var);
        }
    }
}
