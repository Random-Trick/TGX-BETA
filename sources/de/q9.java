package de;

import ae.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ce.a0;
import de.rh;
import he.n;
import ib.i;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.widget.ViewPager;
import ud.d1;
import ud.m;
import ud.v2;
import ud.v4;
import ud.x4;
import zd.o6;

public class q9 extends x4<b> {
    public c f9139x0;

    public class a extends r9 {
        public a(Context context, o6 o6Var) {
            super(context, o6Var);
        }

        @Override
        public int vf() {
            return R.string.GlobalSearch;
        }
    }

    public static class b {
        public TdApi.ChatList f9141a;
        public long f9142b;
        public String f9143c;
        public TdApi.MessageSender f9144d;
        public boolean f9145e;

        public b(TdApi.ChatList chatList, long j10, String str, TdApi.MessageSender messageSender, boolean z10) {
            this.f9141a = chatList;
            this.f9142b = j10;
            this.f9143c = str;
            this.f9144d = messageSender;
            this.f9145e = z10;
        }
    }

    public static class c extends FrameLayoutFix implements v2 {
        public c(Context context) {
            super(context);
        }

        @Override
        public void setTextColor(int i10) {
            ((m) getChildAt(0)).setTextColor(i10);
            TextView textView = (TextView) getChildAt(1);
            if (textView != null) {
                textView.setTextColor(i10);
            }
            ImageView imageView = (ImageView) getChildAt(2);
            if (imageView != null) {
                imageView.setColorFilter(i10);
            }
        }
    }

    public q9(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public long C9() {
        if (w9() != null) {
            return w9().f9142b;
        }
        return 0L;
    }

    @Override
    public View G9() {
        return this.f9139x0;
    }

    @Override
    public View Ga() {
        v4<?> bg = bg(0);
        if (bg != null) {
            return bg.Ga();
        }
        return null;
    }

    @Override
    public int L9() {
        return R.id.theme_color_filling;
    }

    @Override
    public int O9() {
        return R.id.theme_color_headerLightIcon;
    }

    @Override
    public int Q9() {
        return R.id.theme_color_text;
    }

    @Override
    public int R9() {
        return R.id.controller_hashtagPreview;
    }

    @Override
    public int gg() {
        return i.i(x9().f9143c) ? 1 : 2;
    }

    @Override
    public String[] hg() {
        return null;
    }

    @Override
    public void kc() {
        super.kc();
        int gg = gg();
        for (int i10 = 0; i10 < gg; i10++) {
            ig(i10).kc();
        }
    }

    @Override
    public v4<?> mg(Context context, int i10) {
        b x92 = x9();
        if (i10 == 0) {
            rh rhVar = new rh(t(), this.f24495b);
            rhVar.Lp(new rh.c0(x92.f9141a, this.f24495b.P3(x92.f9142b), x92.f9143c, x92.f9144d, (TdApi.SearchMessagesFilter) null));
            return rhVar;
        } else if (i10 != 1) {
            return null;
        } else {
            a aVar = new a(t(), this.f24495b);
            aVar.Ad(x92.f9143c);
            return aVar;
        }
    }

    @Override
    public void ng(Context context, FrameLayoutFix frameLayoutFix, ViewPager viewPager) {
        c cVar = new c(context);
        this.f9139x0 = cVar;
        cVar.setLayoutParams(FrameLayoutFix.q1(-1, n.e()));
        m mVar = (m) ig(0).G9();
        mVar.setPhotoOpenDisabled(true);
        this.f9139x0.addView(mVar);
        if (gg() > 1) {
            mVar.setNeedArrow(true);
            TextView G2 = t().Q1().I().G2(context);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) G2.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin -= d1.getTopOffset();
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = a0.i(68.0f) + a0.i(16.0f);
            G2.setText(((b) x9()).f9143c);
            G2.setAlpha(0.0f);
            y8(G2);
            this.f9139x0.addView(G2);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.round_keyboard_arrow_left_24);
            imageView.setColorFilter(j.P0());
            imageView.setAlpha(0.15f);
            q8(imageView, R.id.theme_color_text);
            imageView.setLayoutParams(FrameLayoutFix.s1(a0.i(24.0f), n.e(), 3, a0.i(68.0f) - a0.i(12.0f), 0, 0, 0));
            this.f9139x0.addView(imageView);
        }
    }

    @Override
    public void og(int i10, int i11, float f10, int i12) {
        float f11 = i11 + f10;
        View childAt = this.f9139x0.getChildAt(0);
        View childAt2 = this.f9139x0.getChildAt(1);
        float measuredWidth = get().getMeasuredWidth() * 0.14f;
        childAt.setTranslationX(f11 == 1.0f ? 0.0f : (-measuredWidth) * f11);
        float f12 = 1.0f - f11;
        childAt.setAlpha(f12);
        if (childAt2 != null) {
            float f13 = measuredWidth * f12;
            childAt2.setTranslationX(f13);
            childAt2.setAlpha(f11);
            View childAt3 = this.f9139x0.getChildAt(2);
            childAt3.setTranslationX(f13);
            childAt3.setAlpha(f11 * 0.15f);
        }
    }

    @Override
    public void sc() {
        super.sc();
        int gg = gg();
        for (int i10 = 0; i10 < gg; i10++) {
            ig(i10).sc();
        }
    }
}
