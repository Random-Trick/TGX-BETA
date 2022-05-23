package dd;

import ae.j;
import ae.v;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ce.a0;
import ce.j0;
import ce.o;
import ce.p0;
import ce.y;
import de.rh;
import de.y00;
import de.z20;
import eb.k;
import gd.w;
import he.n;
import ib.d;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.f3;
import ne.j2;
import ne.k2;
import ne.n2;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.q1;
import ud.v4;
import ud.x1;
import yd.g;
import zd.d9;
import zd.o6;

public class i extends FrameLayoutFix implements z20.g, z20.e, View.OnClickListener, k.b, j2.g {
    public d1 M;
    public z20 N;
    public FrameLayoutFix O;
    public TextView P;
    public f3 Q;
    public RelativeLayout R;
    public n2 S;
    public boolean T = true;
    public b U;
    public final v V;
    public final o6 W;
    public float f7373a0;
    public k f7374b0;
    public String f7375c0;
    public float f7376d0;
    public int f7377e0;
    public boolean f7378f0;
    public kb.b f7379g0;
    public TdApi.StickerSetInfo f7380h0;
    public j2 f7381i0;

    public class a extends kb.b {
        public a() {
        }

        @Override
        public void b() {
            i.this.S.a(1.0f);
        }
    }

    public static class b extends View {
        public float f7382a;

        public b(Context context) {
            super(context);
            setLayoutParams(FrameLayoutFix.q1(-1, d1.getTopOffset()));
        }

        public void b(float f10) {
            if (this.f7382a != f10) {
                this.f7382a = f10;
                invalidate();
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            int measuredHeight;
            float f10;
            if (this.f7382a > 0.0f) {
                canvas.drawRect(0.0f, measuredHeight - ((int) (this.f7382a * f10)), getMeasuredWidth(), getMeasuredHeight(), y.g(j.u()));
            }
        }
    }

    public i(Context context, o6 o6Var) {
        super(context);
        v vVar = new v();
        this.V = vVar;
        this.W = o6Var;
        setLayoutParams(FrameLayoutFix.r1(-1, -1, 80));
        FrameLayoutFix frameLayoutFix = new FrameLayoutFix(context);
        this.O = frameLayoutFix;
        frameLayoutFix.setLayoutParams(FrameLayoutFix.r1(-1, a0.i(56.0f) + a0.i(7.0f), 80));
        f3 f3Var = new f3(context);
        f3Var.setSimpleTopShadow(true);
        this.O.addView(f3Var);
        vVar.f(f3Var);
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        g.j(frameLayoutFix2, R.id.theme_color_filling);
        vVar.f(frameLayoutFix2);
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.r1(-1, a0.i(56.0f), 80));
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.R = relativeLayout;
        relativeLayout.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        this.R.setBackgroundResource(R.drawable.bg_btn_header);
        this.R.setOnClickListener(this);
        p0.T(this.R);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.addRule(13);
        b2 b2Var = new b2(context);
        this.P = b2Var;
        b2Var.setId(R.id.btn_addStickerSet);
        this.P.setTextSize(1, 16.0f);
        this.P.setPadding(a0.i(12.0f), 0, a0.i(12.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(o.i());
        this.P.setSingleLine(true);
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setLayoutParams(layoutParams);
        this.R.addView(this.P);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a0.i(11.0f), a0.i(11.0f));
        layoutParams2.addRule(1, R.id.btn_addStickerSet);
        layoutParams2.addRule(15);
        n2 n2Var = new n2(context);
        this.S = n2Var;
        n2Var.g(4.5f, 0.0f, 10.0f);
        this.S.setVisibility(0);
        this.S.setLayoutParams(layoutParams2);
        vVar.f(this.S);
        this.R.addView(this.S);
        frameLayoutFix2.addView(this.R);
        this.O.addView(frameLayoutFix2);
        this.M = new d1(context);
        z20 z20Var = new z20(context, o6Var);
        this.N = z20Var;
        z20Var.O8(vVar);
        this.N.Ad(this);
        this.N.jf(this);
        this.N.M8(this.M);
        f3 f3Var2 = new f3(context);
        this.Q = f3Var2;
        f3Var2.setSimpleTopShadow(true);
        vVar.f(this.Q);
        b bVar = new b(context);
        this.U = bVar;
        vVar.f(bVar);
        a2();
    }

    public void L1(boolean z10, boolean z11, boolean z12, int i10, TdApi.Object object) {
        setInProgress(false);
        if (z10) {
            TdApi.StickerSetInfo stickerSetInfo = this.f7380h0;
            stickerSetInfo.isInstalled = z11;
            stickerSetInfo.isArchived = z12;
            if (i10 == 0) {
                this.W.O9().P(this.f7380h0);
            } else if (i10 == 1) {
                this.W.O9().N(this.f7380h0);
            } else if (i10 == 2) {
                this.W.O9().O(this.f7380h0);
            }
            if (this.T) {
                this.f7381i0.s2(true);
            } else {
                Z1(true);
            }
        } else if (object.getConstructor() == -1679978726) {
            j0.t0(object);
            Z1(true);
        }
    }

    public void O1(final boolean z10, final boolean z11, final int i10, final TdApi.Object object) {
        final boolean z12 = object.getConstructor() == -722616727;
        this.W.hd().post(new Runnable() {
            @Override
            public final void run() {
                i.this.L1(z12, z10, z11, i10, object);
            }
        });
    }

    public void P1(j2 j2Var) {
        this.N.Z8();
        this.S.Q2();
    }

    public void R1(j2 j2Var) {
        this.N.m17if();
    }

    public static i V1(d9 d9Var, TdApi.StickerSet stickerSet) {
        i iVar = new i(d9Var.t(), d9Var.c());
        iVar.K1(stickerSet);
        iVar.X1();
        return iVar;
    }

    public static i W1(d9 d9Var, TdApi.StickerSetInfo stickerSetInfo) {
        i iVar = new i(d9Var.t(), d9Var.c());
        iVar.I1(stickerSetInfo);
        iVar.X1();
        return iVar;
    }

    private int getHeaderTop() {
        return K() - this.N.cf();
    }

    private int getStatusBarLimit() {
        return n.e() / 2;
    }

    private void setInProgress(boolean z10) {
        if (this.f7378f0 != z10) {
            this.f7378f0 = z10;
            this.R.setEnabled(!z10);
            kb.b bVar = this.f7379g0;
            if (bVar != null) {
                bVar.c();
                this.R.removeCallbacks(this.f7379g0);
                this.f7379g0 = null;
            }
            if (z10) {
                a aVar = new a();
                this.f7379g0 = aVar;
                this.R.postDelayed(aVar, 180L);
            }
        }
    }

    private void setStatusBarFactor(float f10) {
        if (this.f7373a0 != f10) {
            this.f7373a0 = f10;
            x1 X0 = ((org.thunderdog.challegram.a) getContext()).X0();
            int x42 = d1.x4();
            j0.m0(d.d(X0 != null ? X0.getCurrentStatusBarColor() : x42, x42, f10));
        }
    }

    @Override
    public void A(float f10) {
        a2();
    }

    @Override
    public boolean C0() {
        TdApi.StickerSetInfo stickerSetInfo = this.f7380h0;
        return !stickerSetInfo.isInstalled && stickerSetInfo.isArchived;
    }

    public final void E1() {
        this.M.n3(this.N, false);
        addView(this.N.get());
        addView(this.Q);
        b bVar = this.U;
        if (bVar != null) {
            addView(bVar);
        }
        addView(this.M);
        addView(this.O);
    }

    @Override
    public boolean F() {
        TdApi.StickerSetInfo stickerSetInfo = this.f7380h0;
        return stickerSetInfo.isInstalled && !stickerSetInfo.isArchived;
    }

    public final void G1() {
        if (!this.f7378f0) {
            S1(1);
        }
    }

    public final int H1() {
        return Math.min(Math.max(a0.e() / 2, a0.B()), a0.i(350.0f));
    }

    public void I1(TdApi.StickerSetInfo stickerSetInfo) {
        this.f7380h0 = stickerSetInfo;
        Z1(false);
        this.N.lf(stickerSetInfo);
        E1();
    }

    @Override
    public int K() {
        return Math.max(0, a0.e() - H1());
    }

    public void K1(TdApi.StickerSet stickerSet) {
        this.f7380h0 = new TdApi.StickerSetInfo(stickerSet.f19963id, stickerSet.title, stickerSet.name, stickerSet.thumbnail, stickerSet.thumbnailOutline, stickerSet.isInstalled, stickerSet.isArchived, stickerSet.isOfficial, stickerSet.stickerType, false, stickerSet.stickers.length, null);
        Z1(false);
        this.N.lf(this.f7380h0);
        this.N.mf(stickerSet.stickers, this.f7380h0.stickerType, stickerSet.emojis);
        E1();
    }

    @Override
    public void L0() {
        S1(0);
    }

    @Override
    public boolean M(View view, l lVar, boolean z10, boolean z11, TdApi.MessageSchedulingState messageSchedulingState) {
        q1 Q1 = j0.r(getContext()).Q1();
        if (Q1 == null) {
            return false;
        }
        v4<?> F = Q1.F();
        if (F instanceof rh) {
            rh rhVar = (rh) F;
            if (rhVar.Li()) {
                if (!rhVar.P4(view, lVar, z11, messageSchedulingState)) {
                    return false;
                }
                this.f7381i0.s2(true);
                return true;
            }
        }
        y00 y00Var = new y00(getContext(), this.W);
        y00Var.Vi(new y00.m(lVar.j()));
        y00Var.ej();
        return true;
    }

    public final void S1(final int i10) {
        final boolean z10;
        final boolean z11 = false;
        if (i10 != 1) {
            if (i10 == 2) {
                z11 = true;
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!this.f7378f0) {
            setInProgress(true);
            this.W.v4().o(new TdApi.ChangeStickerSet(this.f7380h0.f19964id, z11, z10), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    i.this.O1(z11, z10, i10, object);
                }
            });
        }
    }

    public void T1() {
        this.T = true;
    }

    public void X1() {
        j2 j2Var = new j2(getContext());
        this.f7381i0 = j2Var;
        j2Var.setDismissListener(new j2.f() {
            @Override
            public final void h3(j2 j2Var2) {
                i.this.P1(j2Var2);
            }

            @Override
            public void w(j2 j2Var2) {
                k2.a(this, j2Var2);
            }
        });
        this.f7381i0.setShowListener(new j2.h() {
            @Override
            public final void B0(j2 j2Var2) {
                i.this.R1(j2Var2);
            }
        });
        this.f7381i0.setPopupHeightProvider(this);
        this.f7381i0.L1(true);
        this.f7381i0.G2();
        this.f7381i0.I2();
        this.f7381i0.P2(this, H1());
    }

    public final void Y1(String str, boolean z10, boolean z11) {
        String upperCase = str.toUpperCase();
        int i10 = z10 ? R.id.theme_color_textNeutral : R.id.theme_color_textNegative;
        if (this.P.getText().toString().equals(upperCase) && this.P.getCurrentTextColor() == j.L(i10)) {
            return;
        }
        if (z11) {
            k kVar = this.f7374b0;
            if (kVar == null) {
                this.f7374b0 = new k(0, this, db.b.f7287b, 180L);
            } else {
                kVar.l(0.0f);
            }
            this.f7375c0 = upperCase;
            this.f7377e0 = i10;
            this.f7376d0 = this.S.c();
            this.f7374b0.i(1.0f);
            return;
        }
        p0.c0(this.P, upperCase);
        this.V.o(this.P);
        this.P.setTextColor(j.L(i10));
        this.V.c(this.P, i10);
    }

    public final void Z1(boolean z10) {
        boolean z11 = false;
        if (this.f7380h0.stickerType.getConstructor() == -839756573) {
            TdApi.StickerSetInfo stickerSetInfo = this.f7380h0;
            String o22 = w.o2((!stickerSetInfo.isInstalled || stickerSetInfo.isArchived) ? R.string.AddXMasks : R.string.RemoveXMasks, stickerSetInfo.size);
            TdApi.StickerSetInfo stickerSetInfo2 = this.f7380h0;
            if (!stickerSetInfo2.isInstalled || stickerSetInfo2.isArchived) {
                z11 = true;
            }
            Y1(o22, z11, z10);
            return;
        }
        TdApi.StickerSetInfo stickerSetInfo3 = this.f7380h0;
        String o23 = w.o2((!stickerSetInfo3.isInstalled || stickerSetInfo3.isArchived) ? R.string.AddXStickers : R.string.RemoveXStickers, stickerSetInfo3.size);
        TdApi.StickerSetInfo stickerSetInfo4 = this.f7380h0;
        if (!stickerSetInfo4.isInstalled || stickerSetInfo4.isArchived) {
            z11 = true;
        }
        Y1(o23, z11, z10);
    }

    public final void a2() {
        int topOffset = d1.getTopOffset();
        int max = Math.max(topOffset, getHeaderTop());
        this.M.setTranslationY(max);
        b bVar = this.U;
        if (bVar != null) {
            bVar.setTranslationY(max - d1.getTopOffset());
        }
        this.Q.setTranslationY(max - a0.i(6.0f));
        int i10 = max - topOffset;
        float f10 = i10 > topOffset ? 0.0f : 1.0f - (i10 / topOffset);
        b bVar2 = this.U;
        if (bVar2 != null) {
            bVar2.b(f10);
        }
        d1 d1Var = this.M;
        if (d1Var != null && d1Var.getFilling() != null) {
            this.M.getFilling().t0(f10);
        }
    }

    @Override
    public void g0() {
        b bVar = this.U;
        if (bVar == null) {
            return;
        }
        if (bVar.f7382a >= 0.4f) {
            this.N.hf((int) (d1.getTopOffset() * (1.0f - this.U.f7382a)));
        } else {
            this.N.hf(-((int) (d1.getTopOffset() * this.U.f7382a)));
        }
    }

    @Override
    public int getCurrentPopupHeight() {
        return getMeasuredHeight() - Math.max(0, getHeaderTop());
    }

    @Override
    public long getStickerOutputChatId() {
        q1 Q1 = j0.r(getContext()).Q1();
        if (Q1 == null) {
            return 0L;
        }
        v4<?> F = Q1.F();
        if (!(F instanceof rh) || !((rh) F).Li()) {
            return 0L;
        }
        return F.C9();
    }

    @Override
    public void invalidate() {
        this.M.G3(this.N, null);
    }

    @Override
    public int n() {
        return ((a0.e() - K()) - a0.i(56.0f)) - n.e();
    }

    @Override
    public void n4(int i10, float f10, float f11, k kVar) {
        String str;
        int i11 = (f10 > 0.5f ? 1 : (f10 == 0.5f ? 0 : -1));
        if (i11 >= 0 && (str = this.f7375c0) != null) {
            p0.c0(this.P, str);
            this.V.o(this.P);
            this.P.setTextColor(j.L(this.f7377e0));
            this.V.c(this.P, this.f7377e0);
            this.f7375c0 = null;
        }
        this.S.d(i11 >= 0 ? 0.0f : this.f7376d0 * (1.0f - (f10 / 0.5f)));
        this.S.invalidate();
        float f12 = f10 <= 0.5f ? 1.0f - (f10 / 0.5f) : (f10 - 0.5f) / 0.5f;
        float f13 = (0.19999999f * f12) + 0.8f;
        this.P.setAlpha(f12);
        this.P.setScaleX(f13);
        this.P.setScaleY(f13);
    }

    @Override
    public void o4(int i10, float f10, k kVar) {
    }

    @Override
    public void onClick(View view) {
        TdApi.StickerSetInfo stickerSetInfo = this.f7380h0;
        if (stickerSetInfo != null && !this.f7378f0) {
            boolean z10 = stickerSetInfo.isArchived;
            int i10 = 2;
            if (!z10 && !stickerSetInfo.isOfficial) {
                if (stickerSetInfo.isInstalled) {
                    i10 = 0;
                }
                S1(i10);
            } else if (z10) {
                S1(2);
            } else {
                G1();
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a2();
    }

    @Override
    public void q() {
        G1();
    }

    @Override
    public boolean y() {
        return false;
    }
}
