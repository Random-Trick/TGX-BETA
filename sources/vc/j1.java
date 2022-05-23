package vc;

import ae.j;
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
import ce.a0;
import ce.o;
import ce.y;
import db.g;
import gd.w;
import hd.s4;
import he.i;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.d1;
import org.thunderdog.challegram.R;
import ud.v4;

public class j1 extends RecyclerView.c0 {

    public class a extends d1 {
        public final v2 f25060b;

        public a(Context context, v2 v2Var) {
            super(context);
            this.f25060b = v2Var;
        }

        @Override
        public void onDraw(Canvas canvas) {
            int i10;
            if (this.f25060b.x3()) {
                ce.b.d(this, canvas, s4.y2(this.f25060b));
                i10 = s4.z2(this.f25060b);
            } else {
                i10 = j.R0();
            }
            setTextColorIfNeeded(i10);
            super.onDraw(canvas);
        }
    }

    public class b extends FrameLayoutFix {
        public b(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int defaultSize = FrameLayout.getDefaultSize(getSuggestedMinimumHeight(), i11);
            int i12 = a0.i(200.0f);
            if (i12 > defaultSize) {
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 0));
            } else {
                super.onMeasure(i10, i11);
            }
        }
    }

    public class c extends Drawable {
        public final ImageView[] f25061a;
        public final TextView[] f25062b;
        public final View[] f25063c;
        public final v2 f25064d;

        public c(ImageView[] imageViewArr, TextView[] textViewArr, View[] viewArr, v2 v2Var) {
            this.f25061a = imageViewArr;
            this.f25062b = textViewArr;
            this.f25063c = viewArr;
            this.f25064d = v2Var;
        }

        @Override
        public void draw(Canvas canvas) {
            int top = this.f25061a[0].getTop();
            int min = Math.min(this.f25062b[0].getLeft(), this.f25062b[1].getLeft());
            int max = Math.max(this.f25062b[0].getRight(), this.f25062b[1].getRight());
            int bottom = this.f25063c[0].getBottom();
            int i10 = a0.i(6.0f);
            int i11 = a0.i(9.0f);
            int i12 = min - i11;
            int i13 = max + i11;
            int i14 = top - a0.i(12.0f);
            int i15 = bottom + a0.i(8.0f);
            RectF a02 = y.a0();
            a02.set(i12, i14, i13, i15);
            float f10 = i10;
            canvas.drawRoundRect(a02, f10, f10, y.g(s4.y2(this.f25064d)));
            int z22 = s4.z2(this.f25064d);
            if (this.f25062b[0].getCurrentTextColor() != z22) {
                this.f25062b[0].setTextColor(z22);
                this.f25061a[0].setColorFilter(z22);
            }
        }

        @Override
        public int getOpacity() {
            return 0;
        }

        @Override
        public void setAlpha(int i10) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public j1(View view) {
        super(view);
    }

    public static j1 P(Context context, v2 v2Var, int i10, v4<?> v4Var) {
        if (i10 == 0) {
            a aVar = new a(context, v2Var);
            aVar.setTextSize(1, i.c2().t0());
            aVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            if (v4Var != null) {
                v4Var.t8(aVar);
            }
            return new j1(aVar);
        } else if (i10 == 100 || i10 == 101) {
            b bVar = new b(context);
            bVar.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            boolean z10 = i10 == 101;
            ImageView[] imageViewArr = new ImageView[1];
            TextView[] textViewArr = new TextView[2];
            View[] viewArr = new View[1];
            RelativeLayout relativeLayout = new RelativeLayout(context);
            if (z10) {
                g.d(relativeLayout, new c(imageViewArr, textViewArr, viewArr, v2Var));
                if (v4Var != null) {
                    v4Var.t8(relativeLayout);
                }
            }
            relativeLayout.setLayoutParams(FrameLayoutFix.r1(-1, -2, 17));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, a0.i(50.0f));
            layoutParams.addRule(14);
            layoutParams.topMargin = a0.i(16.0f);
            ImageView imageView = new ImageView(context);
            imageViewArr[0] = imageView;
            imageView.setId(R.id.secret_icon);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.baseline_lock_48);
            if (z10) {
                imageView.setColorFilter(-1);
            } else {
                imageView.setColorFilter(j.W0());
                if (v4Var != null) {
                    v4Var.q8(imageView, R.id.theme_color_textSecure);
                }
            }
            imageView.setLayoutParams(layoutParams);
            relativeLayout.addView(imageView);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(14);
            layoutParams2.addRule(3, R.id.secret_icon);
            b2 b2Var = new b2(context);
            textViewArr[0] = b2Var;
            b2Var.setId(R.id.secret_title);
            if (z10) {
                b2Var.setTextColor(-1);
            } else {
                b2Var.setTextColor(j.W0());
                if (v4Var != null) {
                    v4Var.z8(b2Var, R.id.theme_color_textSecure);
                }
            }
            b2Var.setTextSize(1, 15.0f);
            b2Var.setTypeface(o.i());
            b2Var.setText(w.i1(R.string.SecretChats));
            b2Var.setGravity(17);
            b2Var.setPadding(0, a0.i(5.0f), 0, a0.i(10.0f));
            b2Var.setLayoutParams(layoutParams2);
            relativeLayout.addView(b2Var);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(3, R.id.secret_title);
            layoutParams3.bottomMargin = a0.i(16.0f);
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
            viewArr[0] = frameLayoutFix;
            frameLayoutFix.setLayoutParams(layoutParams3);
            b2 b2Var2 = new b2(context);
            textViewArr[1] = b2Var2;
            b2Var2.setTextSize(1, 15.0f);
            b2Var2.setGravity(3);
            b2Var2.setTypeface(o.k());
            b2Var2.setText(w.j1(R.string.format_EncryptedDescription, w.i1(R.string.EncryptedDescription1), w.i1(R.string.EncryptedDescription2), w.i1(R.string.EncryptedDescription3), w.i1(R.string.EncryptedDescription4)));
            if (z10) {
                b2Var2.setTextColor(-1);
            } else {
                b2Var2.setTextColor(j.P0());
                if (v4Var != null) {
                    v4Var.y8(b2Var2);
                }
            }
            b2Var2.setLineSpacing(a0.i(4.0f), 1.0f);
            b2Var2.setLayoutParams(FrameLayoutFix.r1(-2, -2, 1));
            frameLayoutFix.addView(b2Var2);
            relativeLayout.addView(frameLayoutFix);
            bVar.addView(relativeLayout);
            return new j1(bVar);
        } else if (i10 < 10) {
            return new j1(Q(context, i10, v2Var, v4Var));
        } else {
            h1 h1Var = new h1(context);
            h1Var.a(Q(context, i10 - 10, v2Var, v4Var), v2Var, v4Var);
            return new j1(h1Var);
        }
    }

    public static g1 Q(Context context, int i10, v2 v2Var, v4<?> v4Var) {
        if (i10 == 1) {
            g1 g1Var = new g1(context);
            g1Var.setManager(v2Var);
            if (v4Var != null) {
                v4Var.t8(g1Var);
            }
            return g1Var;
        } else if (i10 == 2) {
            g1 g1Var2 = new g1(context);
            g1Var2.setManager(v2Var);
            if (v4Var != null) {
                v4Var.t8(g1Var2);
            }
            g1Var2.b1();
            return g1Var2;
        } else if (i10 == 3) {
            g1 g1Var3 = new g1(context);
            g1Var3.setManager(v2Var);
            if (v4Var != null) {
                v4Var.t8(g1Var3);
            }
            g1Var3.Y0();
            return g1Var3;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    public static g1 S(View view) {
        if (view instanceof g1) {
            return (g1) view;
        }
        if (view instanceof h1) {
            return ((h1) view).getMessageView();
        }
        return null;
    }

    public static boolean T(int i10) {
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        return i10 >= 10 && i10 < 100 && T(i10 - 10);
    }

    public void O() {
        int n10 = n();
        if (!T(n10)) {
            return;
        }
        if (n10 >= 10) {
            ((h1) this.f2982a).e();
        } else {
            ((g1) this.f2982a).y0();
        }
    }

    public void R() {
        int n10 = n();
        if (!T(n10)) {
            return;
        }
        if (n10 >= 10) {
            ((h1) this.f2982a).b();
        } else {
            ((g1) this.f2982a).B0();
        }
    }

    public void U(s4 s4Var) {
        if (n() >= 10) {
            ((h1) this.f2982a).setMessage(s4Var);
        } else {
            ((g1) this.f2982a).setMessage(s4Var);
        }
    }
}
