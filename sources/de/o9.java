package de;

import ae.j;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.a0;
import gd.w;
import ib.i;
import id.d;
import ie.o;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.f3;
import oc.v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import ud.v4;
import vc.s;
import yd.g;
import zd.o6;
import zd.s1;
import zd.t1;

public class o9 extends v4<b> implements t1.a {
    public byte[] f8975n0;
    public TextView f8976o0;
    public TextView f8977p0;

    public class a extends FrameLayoutFix {
        public a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i10, int i11) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)), Log.TAG_TDLIB_OPTIONS);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        }
    }

    public static class b {
        public long f8978a;
        public byte[] f8979b;

        public b(long j10, byte[] bArr) {
            this.f8978a = j10;
            this.f8979b = bArr;
        }
    }

    public o9(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public int A9() {
        return 3;
    }

    public final CharSequence Pe() {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence I = d.z().I(w.m1(R.string.EncryptionKeyDescription, this.f24495b.e2().C2(x9().f8978a)));
        if (I instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) I;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(I);
        }
        String s10 = v0.s(this.f8975n0);
        if (!i.i(s10)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.insert(0, (CharSequence) "\n");
            }
            spannableStringBuilder.insert(0, (CharSequence) s10);
            o oVar = new o(ce.o.j(), R.id.theme_color_background_textLight);
            z8(oVar, R.id.theme_color_background_textLight);
            spannableStringBuilder.setSpan(oVar, 0, s10.length(), 33);
        }
        return spannableStringBuilder;
    }

    public void Qe(b bVar) {
        super.Ad(bVar);
        this.f8975n0 = bVar.f8979b;
    }

    @Override
    public int R9() {
        return R.id.controller_encryptionKey;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.EncryptionKey);
    }

    @Override
    public void Z8() {
        super.Z8();
        t1.b().d(this);
    }

    @Override
    public void b4() {
        s1.a(this);
    }

    @Override
    public void e2() {
        TextView textView = this.f8976o0;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f8977p0;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }

    @Override
    public View oc(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        g.i(relativeLayout, R.id.theme_color_background, this);
        a aVar = new a(context);
        aVar.setId(R.id.btn_encryptionKey);
        int i10 = a0.i(12.0f);
        aVar.setPadding(i10, i10, i10, i10);
        g.i(aVar, R.id.theme_color_filling, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        aVar.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(new s(x9().f8979b));
        imageView.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        aVar.addView(imageView);
        relativeLayout.addView(aVar);
        f3 f3Var = new f3(context);
        f3Var.setSimpleBottomTransparentShadow(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, f3Var.getLayoutParams().height);
        layoutParams2.addRule(3, R.id.btn_encryptionKey);
        f3Var.setLayoutParams(layoutParams2);
        relativeLayout.addView(f3Var);
        f3 f3Var2 = new f3(context);
        f3Var2.setSimpleRightShadow(true);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(f3Var2.getLayoutParams().width, -1);
        layoutParams3.addRule(1, R.id.btn_encryptionKey);
        f3Var2.setLayoutParams(layoutParams3);
        relativeLayout.addView(f3Var2);
        CharSequence Pe = Pe();
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(3, R.id.btn_encryptionKey);
        b2 b2Var = new b2(context);
        this.f8976o0 = b2Var;
        b2Var.setGravity(17);
        this.f8976o0.setPadding(i10, 0, i10, 0);
        this.f8976o0.setTextColor(j.Q0());
        this.f8976o0.setText(Pe);
        this.f8976o0.setLayoutParams(layoutParams4);
        relativeLayout.addView(this.f8976o0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(1, R.id.btn_encryptionKey);
        b2 b2Var2 = new b2(context);
        this.f8977p0 = b2Var2;
        b2Var2.setGravity(17);
        this.f8977p0.setPadding(i10, i10, i10, i10);
        this.f8977p0.setText(Pe);
        this.f8977p0.setTextColor(j.Q0());
        this.f8977p0.setLayoutParams(layoutParams5);
        relativeLayout.addView(this.f8977p0);
        t1.b().a(this);
        return relativeLayout;
    }
}
