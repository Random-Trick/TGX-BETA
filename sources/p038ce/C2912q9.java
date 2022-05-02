package p038ce;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import be.C1357a0;
import ge.C4896n;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import p038ce.View$OnClickListenerC2971rh;
import p108hb.C5070i;
import p350yd.C10930q6;
import p364zd.C11524j;
import td.AbstractC9321v2;
import td.AbstractC9323v4;
import td.AbstractC9376x4;
import td.C9239m;
import td.View$OnClickListenerC9170d1;

public class C2912q9 extends AbstractC9376x4<C2914b> {
    public C2915c f9718x0;

    public class C2913a extends C2963r9 {
        public C2913a(Context context, C10930q6 q6Var) {
            super(context, q6Var);
        }

        @Override
        public int mo9537vf() {
            return R.string.GlobalSearch;
        }
    }

    public static class C2914b {
        public TdApi.ChatList f9720a;
        public long f9721b;
        public String f9722c;
        public TdApi.MessageSender f9723d;
        public boolean f9724e;

        public C2914b(TdApi.ChatList chatList, long j, String str, TdApi.MessageSender messageSender, boolean z) {
            this.f9720a = chatList;
            this.f9721b = j;
            this.f9722c = str;
            this.f9723d = messageSender;
            this.f9724e = z;
        }
    }

    public static class C2915c extends FrameLayoutFix implements AbstractC9321v2 {
        public C2915c(Context context) {
            super(context);
        }

        @Override
        public void setTextColor(int i) {
            ((C9239m) getChildAt(0)).setTextColor(i);
            TextView textView = (TextView) getChildAt(1);
            if (textView != null) {
                textView.setTextColor(i);
            }
            ImageView imageView = (ImageView) getChildAt(2);
            if (imageView != null) {
                imageView.setColorFilter(i);
            }
        }
    }

    public C2912q9(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public long mo9464C9() {
        if (m9139w9() != null) {
            return m9139w9().f9721b;
        }
        return 0L;
    }

    @Override
    public View mo8869G9() {
        return this.f9718x0;
    }

    @Override
    public View mo8868Ga() {
        AbstractC9323v4<?> bg = m8859bg(0);
        if (bg != null) {
            return bg.mo8868Ga();
        }
        return null;
    }

    @Override
    public int mo9398L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public int mo9375O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public int mo9360Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_hashtagPreview;
    }

    @Override
    public int mo8854gg() {
        return C5070i.m24061i(m9131x9().f9722c) ? 1 : 2;
    }

    @Override
    public String[] mo8852hg() {
        return null;
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        int gg = mo8854gg();
        for (int i = 0; i < gg; i++) {
            m8851ig(i).mo9222kc();
        }
    }

    @Override
    public AbstractC9323v4<?> mo8846mg(Context context, int i) {
        C2914b x9 = m9131x9();
        if (i == 0) {
            View$OnClickListenerC2971rh rhVar = new View$OnClickListenerC2971rh(mo4347s(), this.f30167b);
            rhVar.m32664Lp(new View$OnClickListenerC2971rh.C2977c0(x9.f9720a, this.f30167b.m2771L3(x9.f9721b), x9.f9722c, x9.f9723d, (TdApi.SearchMessagesFilter) null));
            return rhVar;
        } else if (i != 1) {
            return null;
        } else {
            C2913a aVar = new C2913a(mo4347s(), this.f30167b);
            aVar.m9476Ad(x9.f9722c);
            return aVar;
        }
    }

    @Override
    public void mo8845ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        C2915c cVar = new C2915c(context);
        this.f9718x0 = cVar;
        cVar.setLayoutParams(FrameLayoutFix.m18008s1(-1, C4896n.m24478e()));
        C9239m mVar = (C9239m) m8851ig(0).mo8869G9();
        mVar.setPhotoOpenDisabled(true);
        this.f9718x0.addView(mVar);
        if (mo8854gg() > 1) {
            mVar.setNeedArrow(true);
            TextView L2 = mo4347s().m14552P1().m9757I().m10109L2(context);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) L2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin -= View$OnClickListenerC9170d1.getTopOffset();
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = C1357a0.m37541i(68.0f) + C1357a0.m37541i(16.0f);
            L2.setText(((C2914b) m9131x9()).f9722c);
            L2.setAlpha(0.0f);
            m9126y8(L2);
            this.f9718x0.addView(L2);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.round_keyboard_arrow_left_24);
            imageView.setColorFilter(C11524j.m217S0());
            imageView.setAlpha(0.15f);
            m9184q8(imageView, R.id.theme_color_text);
            imageView.setLayoutParams(FrameLayoutFix.m18006u1(C1357a0.m37541i(24.0f), C4896n.m24478e(), 3, C1357a0.m37541i(68.0f) - C1357a0.m37541i(12.0f), 0, 0, 0));
            this.f9718x0.addView(imageView);
        }
    }

    @Override
    public void mo8844og(int i, int i2, float f, int i3) {
        float f2 = i2 + f;
        View childAt = this.f9718x0.getChildAt(0);
        View childAt2 = this.f9718x0.getChildAt(1);
        float measuredWidth = get().getMeasuredWidth() * 0.14f;
        childAt.setTranslationX(f2 == 1.0f ? 0.0f : (-measuredWidth) * f2);
        float f3 = 1.0f - f2;
        childAt.setAlpha(f3);
        if (childAt2 != null) {
            float f4 = measuredWidth * f3;
            childAt2.setTranslationX(f4);
            childAt2.setAlpha(f2);
            View childAt3 = this.f9718x0.getChildAt(2);
            childAt3.setTranslationX(f4);
            childAt3.setAlpha(f2 * 0.15f);
        }
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        int gg = mo8854gg();
        for (int i = 0; i < gg; i++) {
            m8851ig(i).mo9166sc();
        }
    }
}
