package p038ce;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1389o;
import me.C6847b2;
import me.C6879f3;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5070i;
import p110hd.C5078d;
import p111he.C5132o;
import p291uc.C9655t;
import p335xd.C10192g;
import p350yd.C10930q6;
import p350yd.C11031u1;
import p350yd.C11052v1;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class C2820o9 extends AbstractC9323v4<C2822b> implements C11052v1.AbstractC11053a {
    public byte[] f9513n0;
    public TextView f9514o0;
    public TextView f9515p0;

    public class C2821a extends FrameLayoutFix {
        public C2821a(Context context) {
            super(context);
        }

        @Override
        public void onMeasure(int i, int i2) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)), Log.TAG_TDLIB_OPTIONS);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        }
    }

    public static class C2822b {
        public long f9517a;
        public byte[] f9518b;

        public C2822b(long j, byte[] bArr) {
            this.f9517a = j;
            this.f9518b = bArr;
        }
    }

    public C2820o9(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    public final CharSequence m33263Pe() {
        SpannableStringBuilder spannableStringBuilder;
        CharSequence I = C5078d.m23986z().m24024I(C4403w.m27853m1(R.string.EncryptionKeyDescription, this.f30167b.m2480e2().m1749D2(m9131x9().f9517a)));
        if (I instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) I;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(I);
        }
        String s = C7389v0.m16586s(this.f9513n0);
        if (!C5070i.m24061i(s)) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.insert(0, (CharSequence) "\n");
            }
            spannableStringBuilder.insert(0, (CharSequence) s);
            C5132o oVar = new C5132o(C1389o.m37259j(), R.id.theme_color_background_textLight);
            m9119z8(oVar, R.id.theme_color_background_textLight);
            spannableStringBuilder.setSpan(oVar, 0, s.length(), 33);
        }
        return spannableStringBuilder;
    }

    public void m33262Qe(C2822b bVar) {
        super.m9476Ad(bVar);
        this.f9513n0 = bVar.f9518b;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_encryptionKey;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.EncryptionKey);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        C11052v1.m1768b().m1766d(this);
    }

    @Override
    public void mo452g2() {
        TextView textView = this.f9514o0;
        if (textView != null) {
            textView.invalidate();
        }
        TextView textView2 = this.f9515p0;
        if (textView2 != null) {
            textView2.invalidate();
        }
    }

    @Override
    public void mo443o4() {
        C11031u1.m1981a(this);
    }

    @Override
    public View mo403oc(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C10192g.m5782i(relativeLayout, R.id.theme_color_background, this);
        C2821a aVar = new C2821a(context);
        aVar.setId(R.id.btn_encryptionKey);
        int i = C1357a0.m37541i(12.0f);
        aVar.setPadding(i, i, i, i);
        C10192g.m5782i(aVar, R.id.theme_color_filling, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(9);
        layoutParams.addRule(10);
        aVar.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(new C9655t(m9131x9().f9518b));
        imageView.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        aVar.addView(imageView);
        relativeLayout.addView(aVar);
        C6879f3 f3Var = new C6879f3(context);
        f3Var.setSimpleBottomTransparentShadow(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, f3Var.getLayoutParams().height);
        layoutParams2.addRule(3, R.id.btn_encryptionKey);
        f3Var.setLayoutParams(layoutParams2);
        relativeLayout.addView(f3Var);
        C6879f3 f3Var2 = new C6879f3(context);
        f3Var2.setSimpleRightShadow(true);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(f3Var2.getLayoutParams().width, -1);
        layoutParams3.addRule(1, R.id.btn_encryptionKey);
        f3Var2.setLayoutParams(layoutParams3);
        relativeLayout.addView(f3Var2);
        CharSequence Pe = m33263Pe();
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(3, R.id.btn_encryptionKey);
        C6847b2 b2Var = new C6847b2(context);
        this.f9514o0 = b2Var;
        b2Var.setGravity(17);
        this.f9514o0.setPadding(i, 0, i, 0);
        this.f9514o0.setTextColor(C11524j.m215T0());
        this.f9514o0.setText(Pe);
        this.f9514o0.setLayoutParams(layoutParams4);
        relativeLayout.addView(this.f9514o0);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(1, R.id.btn_encryptionKey);
        C6847b2 b2Var2 = new C6847b2(context);
        this.f9515p0 = b2Var2;
        b2Var2.setGravity(17);
        this.f9515p0.setPadding(i, i, i, i);
        this.f9515p0.setText(Pe);
        this.f9515p0.setTextColor(C11524j.m215T0());
        this.f9515p0.setLayoutParams(layoutParams5);
        relativeLayout.addView(this.f9515p0);
        C11052v1.m1768b().m1769a(this);
        return relativeLayout;
    }
}
