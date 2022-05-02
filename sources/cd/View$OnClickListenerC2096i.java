package cd;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import be.C1357a0;
import be.C1379j0;
import be.C1389o;
import be.C1399s0;
import be.C1410y;
import ge.C4896n;
import me.C6847b2;
import me.C6879f3;
import me.C6924j2;
import me.C6941k2;
import me.C6977n2;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.R;
import p037cb.C2057b;
import p038ce.View$OnClickListenerC2971rh;
import p038ce.x00;
import p038ce.y20;
import p051db.C3950k;
import p082fd.C4403w;
import p108hb.C5064d;
import p139jb.AbstractRunnableC5910b;
import p335xd.C10192g;
import p350yd.AbstractC10664f9;
import p350yd.C10930q6;
import p364zd.C11524j;
import p364zd.C11537v;
import td.AbstractC9323v4;
import td.C9270q1;
import td.C9356x1;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2096i extends FrameLayoutFix implements y20.AbstractC3334g, y20.AbstractC3330e, View.OnClickListener, C3950k.AbstractC3952b, C6924j2.AbstractC6931g {
    public View$OnClickListenerC9170d1 f7381M;
    public y20 f7382N;
    public FrameLayoutFix f7383O;
    public TextView f7384P;
    public C6879f3 f7385Q;
    public RelativeLayout f7386R;
    public C6977n2 f7387S;
    public boolean f7388T = true;
    public C2098b f7389U;
    public final C11537v f7390V;
    public final C10930q6 f7391W;
    public float f7392a0;
    public C3950k f7393b0;
    public String f7394c0;
    public float f7395d0;
    public int f7396e0;
    public boolean f7397f0;
    public AbstractRunnableC5910b f7398g0;
    public TdApi.StickerSetInfo f7399h0;
    public C6924j2 f7400i0;

    public class C2097a extends AbstractRunnableC5910b {
        public C2097a() {
        }

        @Override
        public void mo1364b() {
            View$OnClickListenerC2096i.this.f7387S.m18231a(1.0f);
        }
    }

    public static class C2098b extends View {
        public float f7402a;

        public C2098b(Context context) {
            super(context);
            setLayoutParams(FrameLayoutFix.m18008s1(-1, View$OnClickListenerC9170d1.getTopOffset()));
        }

        public void m35612b(float f) {
            if (this.f7402a != f) {
                this.f7402a = f;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight;
            float f;
            if (this.f7402a > 0.0f) {
                canvas.drawRect(0.0f, measuredHeight - ((int) (this.f7402a * f)), getMeasuredWidth(), getMeasuredHeight(), C1410y.m37039g(C11524j.m148w()));
            }
        }
    }

    public View$OnClickListenerC2096i(Context context, C10930q6 q6Var) {
        super(context);
        C11537v vVar = new C11537v();
        this.f7390V = vVar;
        this.f7391W = q6Var;
        setLayoutParams(FrameLayoutFix.m18007t1(-1, -1, 80));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.f7383O = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(56.0f) + C1357a0.m37541i(7.0f), 80));
        C6879f3 f3Var = new C6879f3(context);
        f3Var.setSimpleTopShadow(true);
        this.f7383O.addView(f3Var);
        vVar.m74f(f3Var);
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        C10192g.m5781j(frameLayoutFix2, R.id.theme_color_filling);
        vVar.m74f(frameLayoutFix2);
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.m18007t1(-1, C1357a0.m37541i(56.0f), 80));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f7386R = relativeLayout;
        relativeLayout.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        this.f7386R.setBackgroundResource(R.drawable.bg_btn_header);
        this.f7386R.setOnClickListener(this);
        C1399s0.m37193a0(this.f7386R);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(13);
        C6847b2 b2Var = new C6847b2(context);
        this.f7384P = b2Var;
        b2Var.setId(R.id.btn_addStickerSet);
        this.f7384P.setTextSize(1, 16.0f);
        this.f7384P.setPadding(C1357a0.m37541i(12.0f), 0, C1357a0.m37541i(12.0f), 0);
        this.f7384P.setGravity(17);
        this.f7384P.setTypeface(C1389o.m37260i());
        this.f7384P.setSingleLine(true);
        this.f7384P.setEllipsize(TextUtils.TruncateAt.END);
        this.f7384P.setLayoutParams(layoutParams);
        this.f7386R.addView(this.f7384P);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C1357a0.m37541i(11.0f), C1357a0.m37541i(11.0f));
        layoutParams2.addRule(1, R.id.btn_addStickerSet);
        layoutParams2.addRule(15);
        C6977n2 n2Var = new C6977n2(context);
        this.f7387S = n2Var;
        n2Var.m18227g(4.5f, 0.0f, 10.0f);
        this.f7387S.setVisibility(0);
        this.f7387S.setLayoutParams(layoutParams2);
        vVar.m74f(this.f7387S);
        this.f7386R.addView(this.f7387S);
        frameLayoutFix2.addView(this.f7386R);
        this.f7383O.addView(frameLayoutFix2);
        this.f7381M = new View$OnClickListenerC9170d1(context);
        y20 y20Var = new y20(context, q6Var);
        this.f7382N = y20Var;
        y20Var.m9376O8(vVar);
        this.f7382N.m9476Ad(this);
        this.f7382N.m30827jf(this);
        this.f7382N.mo9391M8(this.f7381M);
        C6879f3 f3Var2 = new C6879f3(context);
        this.f7385Q = f3Var2;
        f3Var2.setSimpleTopShadow(true);
        vVar.m74f(this.f7385Q);
        if (Build.VERSION.SDK_INT >= 21) {
            C2098b bVar = new C2098b(context);
            this.f7389U = bVar;
            vVar.m74f(bVar);
        }
        m35614b2();
    }

    public void m35625O1(boolean z, boolean z2, boolean z3, int i, TdApi.Object object) {
        setInProgress(false);
        if (z) {
            TdApi.StickerSetInfo stickerSetInfo = this.f7399h0;
            stickerSetInfo.isInstalled = z2;
            stickerSetInfo.isArchived = z3;
            if (i == 0) {
                this.f7391W.m2781K9().m1919P(this.f7399h0);
            } else if (i == 1) {
                this.f7391W.m2781K9().m1927N(this.f7399h0);
            } else if (i == 2) {
                this.f7391W.m2781K9().m1923O(this.f7399h0);
            }
            if (this.f7388T) {
                this.f7400i0.m18408y2(true);
            } else {
                m35615a2(true);
            }
        } else if (object.getConstructor() == -1679978726) {
            C1379j0.m37302t0(object);
            m35615a2(true);
        }
    }

    public void m35624Q1(final boolean z, final boolean z2, final int i, final TdApi.Object object) {
        final boolean z3 = object.getConstructor() == -722616727;
        this.f7391W.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2096i.this.m35625O1(z3, z, z2, i, object);
            }
        });
    }

    public void m35623S1(C6924j2 j2Var) {
        this.f7382N.mo417Z8();
        this.f7387S.mo4501a3();
    }

    public void m35622T1(C6924j2 j2Var) {
        this.f7382N.m30828if();
    }

    public static View$OnClickListenerC2096i m35619W1(AbstractC10664f9 f9Var, TdApi.StickerSet stickerSet) {
        View$OnClickListenerC2096i iVar = new View$OnClickListenerC2096i(f9Var.mo4347s(), f9Var.mo4348c());
        iVar.m35626N1(stickerSet);
        iVar.m35617Y1();
        return iVar;
    }

    public static View$OnClickListenerC2096i m35618X1(AbstractC10664f9 f9Var, TdApi.StickerSetInfo stickerSetInfo) {
        View$OnClickListenerC2096i iVar = new View$OnClickListenerC2096i(f9Var.mo4347s(), f9Var.mo4348c());
        iVar.m35627M1(stickerSetInfo);
        iVar.m35617Y1();
        return iVar;
    }

    private int getHeaderTop() {
        return mo30822K() - this.f7382N.m30834cf();
    }

    private int getStatusBarLimit() {
        return C4896n.m24478e() / 2;
    }

    private void setInProgress(boolean z) {
        if (this.f7397f0 != z) {
            this.f7397f0 = z;
            this.f7386R.setEnabled(!z);
            AbstractRunnableC5910b bVar = this.f7398g0;
            if (bVar != null) {
                bVar.m21857c();
                this.f7386R.removeCallbacks(this.f7398g0);
                this.f7398g0 = null;
            }
            if (z) {
                C2097a aVar = new C2097a();
                this.f7398g0 = aVar;
                this.f7386R.postDelayed(aVar, 180L);
            }
        }
    }

    private void setStatusBarFactor(float f) {
        if (this.f7392a0 != f) {
            this.f7392a0 = f;
            C9356x1 T0 = ((AbstractView$OnTouchListenerC7889a) getContext()).m14537T0();
            int r4 = View$OnClickListenerC9170d1.m10032r4();
            C1379j0.m37316m0(C5064d.m24128d(T0 != null ? T0.getCurrentStatusBarColor() : r4, r4, f));
        }
    }

    @Override
    public void mo30823A(float f) {
        m35614b2();
    }

    @Override
    public boolean mo30818B0() {
        TdApi.StickerSetInfo stickerSetInfo = this.f7399h0;
        return !stickerSetInfo.isInstalled && stickerSetInfo.isArchived;
    }

    @Override
    public boolean mo30817G() {
        TdApi.StickerSetInfo stickerSetInfo = this.f7399h0;
        return stickerSetInfo.isInstalled && !stickerSetInfo.isArchived;
    }

    public final void m35630I1() {
        this.f7381M.m10045m3(this.f7382N, false);
        addView(this.f7382N.get());
        addView(this.f7385Q);
        C2098b bVar = this.f7389U;
        if (bVar != null) {
            addView(bVar);
        }
        addView(this.f7381M);
        addView(this.f7383O);
    }

    @Override
    public boolean mo30816J0(View view, C2104l lVar, boolean z, boolean z2, TdApi.MessageSchedulingState messageSchedulingState) {
        C9270q1 P1 = C1379j0.m37307r(getContext()).m14552P1();
        if (P1 == null) {
            return false;
        }
        AbstractC9323v4<?> F = P1.m9763F();
        if (F instanceof View$OnClickListenerC2971rh) {
            View$OnClickListenerC2971rh rhVar = (View$OnClickListenerC2971rh) F;
            if (rhVar.m32671Li()) {
                if (!rhVar.mo16446F4(view, lVar, z2, messageSchedulingState)) {
                    return false;
                }
                this.f7400i0.m18408y2(true);
                return true;
            }
        }
        x00 x00Var = new x00(getContext(), this.f7391W);
        x00Var.m30994Vi(new x00.C3281m(lVar.m35574j()));
        x00Var.m30960ej();
        return true;
    }

    public final void m35629J1() {
        if (!this.f7397f0) {
            m35621U1(1);
        }
    }

    @Override
    public int mo30822K() {
        return Math.max(0, C1357a0.m37545e() - m35628L1());
    }

    public final int m35628L1() {
        return Math.min(Math.max(C1357a0.m37545e() / 2, C1357a0.m37553B()), C1357a0.m37541i(350.0f));
    }

    @Override
    public void mo30815M0() {
        m35621U1(0);
    }

    public void m35627M1(TdApi.StickerSetInfo stickerSetInfo) {
        this.f7399h0 = stickerSetInfo;
        m35615a2(false);
        this.f7382N.m30825lf(stickerSetInfo);
        m35630I1();
    }

    public void m35626N1(TdApi.StickerSet stickerSet) {
        this.f7399h0 = new TdApi.StickerSetInfo(stickerSet.f25423id, stickerSet.title, stickerSet.name, stickerSet.thumbnail, stickerSet.thumbnailOutline, stickerSet.isInstalled, stickerSet.isArchived, stickerSet.isOfficial, stickerSet.stickerType, false, stickerSet.stickers.length, null);
        m35615a2(false);
        this.f7382N.m30825lf(this.f7399h0);
        this.f7382N.m30824mf(stickerSet.stickers, this.f7399h0.stickerType, stickerSet.emojis);
        m35630I1();
    }

    @Override
    public void mo45P5(int i, float f, float f2, C3950k kVar) {
        String str;
        int i2 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i2 >= 0 && (str = this.f7394c0) != null) {
            C1399s0.m37175j0(this.f7384P, str);
            this.f7390V.m65o(this.f7384P);
            this.f7384P.setTextColor(C11524j.m228N(this.f7396e0));
            this.f7390V.m77c(this.f7384P, this.f7396e0);
            this.f7394c0 = null;
        }
        this.f7387S.m18229d(i2 >= 0 ? 0.0f : this.f7395d0 * (1.0f - (f / 0.5f)));
        this.f7387S.invalidate();
        float f3 = f <= 0.5f ? 1.0f - (f / 0.5f) : (f - 0.5f) / 0.5f;
        float f4 = (0.19999999f * f3) + 0.8f;
        this.f7384P.setAlpha(f3);
        this.f7384P.setScaleX(f4);
        this.f7384P.setScaleY(f4);
    }

    public final void m35621U1(final int i) {
        final boolean z;
        final boolean z2 = false;
        if (i != 1) {
            if (i == 2) {
                z2 = true;
            }
            z = false;
        } else {
            z = true;
        }
        if (!this.f7397f0) {
            setInProgress(true);
            this.f7391W.m2270r4().m14783o(new TdApi.ChangeStickerSet(this.f7399h0.f25424id, z2, z), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2096i.this.m35624Q1(z2, z, i, object);
                }
            });
        }
    }

    public void m35620V1() {
        this.f7388T = true;
    }

    @Override
    public void mo35Y0(int i, float f, C3950k kVar) {
    }

    public void m35617Y1() {
        C6924j2 j2Var = new C6924j2(getContext());
        this.f7400i0 = j2Var;
        j2Var.setDismissListener(new C6924j2.AbstractC6930f() {
            @Override
            public void mo3000j2(C6924j2 j2Var2) {
                C6941k2.m18400a(this, j2Var2);
            }

            @Override
            public final void mo2999y4(C6924j2 j2Var2) {
                View$OnClickListenerC2096i.this.m35623S1(j2Var2);
            }
        });
        this.f7400i0.setShowListener(new C6924j2.AbstractC6932h() {
            @Override
            public final void mo18406f0(C6924j2 j2Var2) {
                View$OnClickListenerC2096i.this.m35622T1(j2Var2);
            }
        });
        this.f7400i0.setPopupHeightProvider(this);
        this.f7400i0.m18045Q1(true);
        this.f7400i0.m18436M2();
        this.f7400i0.m18435N2();
        this.f7400i0.m18430T2(this, m35628L1());
    }

    public final void m35616Z1(String str, boolean z, boolean z2) {
        String upperCase = str.toUpperCase();
        int i = z ? R.id.theme_color_textNeutral : R.id.theme_color_textNegative;
        if (this.f7384P.getText().toString().equals(upperCase) && this.f7384P.getCurrentTextColor() == C11524j.m228N(i)) {
            return;
        }
        if (z2) {
            C3950k kVar = this.f7393b0;
            if (kVar == null) {
                this.f7393b0 = new C3950k(0, this, C2057b.f7280b, 180L);
            } else {
                kVar.m29541l(0.0f);
            }
            this.f7394c0 = upperCase;
            this.f7396e0 = i;
            this.f7395d0 = this.f7387S.m18230c();
            this.f7393b0.m29544i(1.0f);
            return;
        }
        C1399s0.m37175j0(this.f7384P, upperCase);
        this.f7390V.m65o(this.f7384P);
        this.f7384P.setTextColor(C11524j.m228N(i));
        this.f7390V.m77c(this.f7384P, i);
    }

    public final void m35615a2(boolean z) {
        boolean z2 = false;
        if (this.f7399h0.stickerType.getConstructor() == -839756573) {
            TdApi.StickerSetInfo stickerSetInfo = this.f7399h0;
            String o2 = C4403w.m27844o2((!stickerSetInfo.isInstalled || stickerSetInfo.isArchived) ? R.string.AddXMasks : R.string.RemoveXMasks, stickerSetInfo.size);
            TdApi.StickerSetInfo stickerSetInfo2 = this.f7399h0;
            if (!stickerSetInfo2.isInstalled || stickerSetInfo2.isArchived) {
                z2 = true;
            }
            m35616Z1(o2, z2, z);
            return;
        }
        TdApi.StickerSetInfo stickerSetInfo3 = this.f7399h0;
        String o22 = C4403w.m27844o2((!stickerSetInfo3.isInstalled || stickerSetInfo3.isArchived) ? R.string.AddXStickers : R.string.RemoveXStickers, stickerSetInfo3.size);
        TdApi.StickerSetInfo stickerSetInfo4 = this.f7399h0;
        if (!stickerSetInfo4.isInstalled || stickerSetInfo4.isArchived) {
            z2 = true;
        }
        m35616Z1(o22, z2, z);
    }

    public final void m35614b2() {
        C2098b bVar;
        int topOffset = View$OnClickListenerC9170d1.getTopOffset();
        int max = Math.max(topOffset, getHeaderTop());
        this.f7381M.setTranslationY(max);
        C2098b bVar2 = this.f7389U;
        if (bVar2 != null) {
            bVar2.setTranslationY(max - View$OnClickListenerC9170d1.getTopOffset());
        }
        this.f7385Q.setTranslationY(max - C1357a0.m37541i(6.0f));
        int i = max - topOffset;
        float f = i > topOffset ? 0.0f : 1.0f - (i / topOffset);
        if (Build.VERSION.SDK_INT >= 21 && (bVar = this.f7389U) != null) {
            bVar.m35612b(f);
        }
        View$OnClickListenerC9170d1 d1Var = this.f7381M;
        if (d1Var != null && d1Var.getFilling() != null) {
            this.f7381M.getFilling().m9007s0(f);
        }
    }

    @Override
    public void mo30821e0() {
        C2098b bVar;
        if (Build.VERSION.SDK_INT >= 21 && (bVar = this.f7389U) != null) {
            if (bVar.f7402a >= 0.4f) {
                this.f7382N.m30829hf((int) (View$OnClickListenerC9170d1.getTopOffset() * (1.0f - this.f7389U.f7402a)));
            } else {
                this.f7382N.m30829hf(-((int) (View$OnClickListenerC9170d1.getTopOffset() * this.f7389U.f7402a)));
            }
        }
    }

    @Override
    public int getCurrentPopupHeight() {
        return getMeasuredHeight() - Math.max(0, getHeaderTop());
    }

    @Override
    public long getStickerOutputChatId() {
        C9270q1 P1 = C1379j0.m37307r(getContext()).m14552P1();
        if (P1 == null) {
            return 0L;
        }
        AbstractC9323v4<?> F = P1.m9763F();
        if (!(F instanceof View$OnClickListenerC2971rh) || !((View$OnClickListenerC2971rh) F).m32671Li()) {
            return 0L;
        }
        return F.mo9464C9();
    }

    @Override
    public void invalidate() {
        this.f7381M.m10124E3(this.f7382N, null);
    }

    @Override
    public int mo30820m() {
        return ((C1357a0.m37545e() - mo30822K()) - C1357a0.m37541i(56.0f)) - C4896n.m24478e();
    }

    @Override
    public void onClick(View view) {
        TdApi.StickerSetInfo stickerSetInfo = this.f7399h0;
        if (stickerSetInfo != null && !this.f7397f0) {
            boolean z = stickerSetInfo.isArchived;
            int i = 2;
            if (!z && !stickerSetInfo.isOfficial) {
                if (stickerSetInfo.isInstalled) {
                    i = 0;
                }
                m35621U1(i);
            } else if (z) {
                m35621U1(2);
            } else {
                m35629J1();
            }
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m35614b2();
    }

    @Override
    public void mo30814q() {
        m35629J1();
    }

    @Override
    public boolean mo30813y() {
        return false;
    }
}
