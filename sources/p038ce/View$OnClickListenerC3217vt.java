package p038ce;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import be.C1357a0;
import be.C1363c0;
import be.C1379j0;
import gd.AbstractC4761s4;
import gd.C4779t2;
import gd.C4817v6;
import ge.C4868i;
import ge.C4896n;
import ie.C5428t;
import ie.C5459x0;
import ie.RunnableC5390g;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.vkryl.android.widget.FrameLayoutFix;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p038ce.C2700m6;
import p038ce.View$OnClickListenerC2364ez;
import p038ce.View$OnClickListenerC2665lj;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5064d;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5146u0;
import p124ib.C5320c;
import p139jb.AbstractC5918j;
import p139jb.AbstractC5919k;
import p139jb.AbstractRunnableC5910b;
import p143k0.C6038h;
import p156kd.C6253l;
import p194nd.View$OnClickListenerC7430j1;
import p335xd.C10192g;
import p350yd.AbstractC10861n0;
import p350yd.AbstractC10925q1;
import p350yd.AbstractC10986s1;
import p350yd.C10838m0;
import p350yd.C10904p1;
import p350yd.C10930q6;
import p350yd.C10965r1;
import p350yd.C11052v1;
import p350yd.C11059v7;
import p350yd.HandlerC10770jj;
import p364zd.C11524j;
import sc.View$OnClickListenerC8851y1;
import tc.C9137c;
import td.AbstractC9142a;
import td.AbstractC9201h1;
import td.AbstractC9213j1;
import td.AbstractC9323v4;
import td.C9239m;
import td.C9270q1;
import td.C9310u0;
import td.RunnableC9248n;
import td.View$OnClickListenerC9150b;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC3217vt extends AbstractC9323v4<Void> implements View.OnClickListener, C9239m.AbstractC9242c, AbstractC9201h1, AbstractC9213j1, AbstractC5117h0, C11059v7.AbstractC11064e, AbstractC10861n0, AbstractC10986s1, View$OnClickListenerC8851y1.AbstractC8859h, AbstractC9142a, Client.AbstractC7865g, View.OnLongClickListener, AbstractC10925q1 {
    public String f10737A0;
    public String f10738B0;
    public String f10739C0;
    public ArrayList<C4817v6> f10740D0;
    public AbstractC3219b f10741E0;
    public boolean f10742F0;
    public C9239m f10743n0;
    public RunnableC9248n f10744o0;
    public C2546iq f10745p0;
    public boolean f10746q0;
    public AbstractRunnableC5910b f10747r0;
    public float f10748s0;
    public boolean f10749t0;
    public int f10750u0;
    public long f10751v0;
    public boolean f10752w0;
    public C10930q6.C10946p f10753x0;
    public final C6038h<C5459x0> f10754y0 = new C6038h<>();
    public String f10755z0;

    public class C3218a extends C2546iq {
        public C3218a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            boolean z2;
            String str;
            int j = raVar.m32838j();
            if (j != R.id.btn_devices) {
                if (j == R.id.btn_notificationSettings) {
                    View$OnClickListenerC3217vt.this.m31128wf(false);
                    z2 = View$OnClickListenerC3217vt.this.f10749t0;
                }
                z2 = false;
            } else {
                if (View$OnClickListenerC3217vt.this.f10753x0 != null && View$OnClickListenerC3217vt.this.f10753x0.f35178c.length > 0) {
                    z2 = true;
                }
                z2 = false;
            }
            cVar.m10203d2(z2 ? C10930q6.f34960B2 : 0, false, z);
            switch (raVar.m32838j()) {
                case R.id.btn_2fa:
                    cVar.setText(View$OnClickListenerC3217vt.this.m31165Wf(C4403w.m27871i1(R.string.ReminderCheckTfaPasswordText), R.id.btn_2fa));
                    return;
                case R.id.btn_bio:
                    if (View$OnClickListenerC3217vt.this.f10739C0 == null) {
                        str = C4403w.m27871i1(R.string.LoadingInformation);
                    } else if (C5070i.m24062i(View$OnClickListenerC3217vt.this.f10739C0)) {
                        str = C4403w.m27871i1(R.string.BioNone);
                    } else {
                        str = View$OnClickListenerC3217vt.this.f10739C0;
                    }
                    cVar.setText(View$OnClickListenerC3217vt.this.m31165Wf(str, R.id.btn_bio));
                    return;
                case R.id.btn_changePhoneNumber:
                    View$OnClickListenerC3217vt vtVar = View$OnClickListenerC3217vt.this;
                    Object[] objArr = new Object[1];
                    objArr[0] = vtVar.f10738B0 != null ? View$OnClickListenerC3217vt.this.f10737A0 : C1363c0.f4976b;
                    cVar.setText(vtVar.m31165Wf(C4403w.m27855m1(R.string.ReminderCheckPhoneNumberText, objArr), R.id.btn_changePhoneNumber));
                    return;
                case R.id.btn_devices:
                    if (View$OnClickListenerC3217vt.this.f10753x0 == null) {
                        cVar.setData(R.string.LoadingInformation);
                        return;
                    } else if (View$OnClickListenerC3217vt.this.f10753x0.f35178c.length > 0) {
                        cVar.setData(C4403w.m27838q2(R.string.XSignInAttempts, View$OnClickListenerC3217vt.this.f10753x0.f35178c.length));
                        return;
                    } else if (View$OnClickListenerC3217vt.this.f10753x0.f35177b.length == 0) {
                        cVar.setData(R.string.SignedInNoOtherSessions);
                        return;
                    } else if (View$OnClickListenerC3217vt.this.f10753x0.f35177b.length == 1) {
                        TdApi.Session session = View$OnClickListenerC3217vt.this.f10753x0.f35177b[0];
                        if (View$OnClickListenerC3217vt.this.f10753x0.f35181f != 1 || C5070i.m24062i(session.deviceModel)) {
                            cVar.setData(C4403w.m27855m1(R.string.SignedInOtherSession, session.applicationName));
                            return;
                        } else {
                            cVar.setData(C4403w.m27855m1(R.string.SignedInOtherDevice, session.deviceModel));
                            return;
                        }
                    } else if (View$OnClickListenerC3217vt.this.f10753x0.f35181f == 0) {
                        cVar.setData(C4403w.m27838q2(R.string.SignedInXOtherApps, View$OnClickListenerC3217vt.this.f10753x0.f35177b.length));
                        return;
                    } else if (View$OnClickListenerC3217vt.this.f10753x0.f35182g != 1) {
                        cVar.setData(C4403w.m27864k0(R.string.format_signedInAppsOnDevices, C4403w.m27838q2(R.string.part_SignedInXOtherApps, View$OnClickListenerC3217vt.this.f10753x0.f35177b.length), C4403w.m27838q2(R.string.part_SignedInXDevices, View$OnClickListenerC3217vt.this.f10753x0.f35181f + 1)));
                        return;
                    } else if (View$OnClickListenerC3217vt.this.f10753x0.f35177b.length == View$OnClickListenerC3217vt.this.f10753x0.f35181f) {
                        cVar.setData(C4403w.m27838q2(R.string.SignedInXOtherDevices, View$OnClickListenerC3217vt.this.f10753x0.f35181f));
                        return;
                    } else {
                        cVar.setData(C4403w.m27864k0(R.string.format_signedInAppsOnDevices, C4403w.m27838q2(R.string.part_SignedInXApps, View$OnClickListenerC3217vt.this.f10753x0.f35177b.length), C4403w.m27838q2(R.string.part_SignedInXOtherDevices, View$OnClickListenerC3217vt.this.f10753x0.f35181f)));
                        return;
                    }
                case R.id.btn_notificationSettings:
                    if (View$OnClickListenerC3217vt.this.f10750u0 == 0) {
                        return;
                    }
                    if (View$OnClickListenerC3217vt.this.f10750u0 == R.string.NotificationsErrorErrorChat) {
                        cVar.setData(C4403w.m27855m1(View$OnClickListenerC3217vt.this.f10750u0, View$OnClickListenerC3217vt.this.f30170b.m2691Q3(View$OnClickListenerC3217vt.this.f10751v0)));
                        return;
                    } else {
                        cVar.setData(View$OnClickListenerC3217vt.this.f10750u0);
                        return;
                    }
                case R.id.btn_phone:
                    cVar.setData(View$OnClickListenerC3217vt.this.f10737A0);
                    return;
                case R.id.btn_username:
                    if (View$OnClickListenerC3217vt.this.f10755z0 == null) {
                        cVar.setData(R.string.LoadingUsername);
                        return;
                    } else if (View$OnClickListenerC3217vt.this.f10755z0.isEmpty()) {
                        cVar.setData(R.string.SetUpUsername);
                        return;
                    } else {
                        cVar.setData("@" + View$OnClickListenerC3217vt.this.f10755z0);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public interface AbstractC3219b {
        void mo31124K5(ArrayList<C4817v6> arrayList);
    }

    public View$OnClickListenerC3217vt(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m31193Cf(TdApi.User user, long j, View view, int i) {
        if (i != R.id.btn_open) {
            switch (i) {
                case R.id.btn_changePhotoCamera:
                    C1379j0.m37346Y(this.f30168a);
                    return true;
                case R.id.btn_changePhotoDelete:
                    this.f30170b.m2270r4().m14783o(new TdApi.DeleteProfilePhoto(j), this.f30170b.m2392ja());
                    return true;
                case R.id.btn_changePhotoGallery:
                    C1379j0.m37343a0(false);
                    return true;
                default:
                    return true;
            }
        } else {
            View$OnClickListenerC7430j1.m16173mk(this, user, this.f10743n0);
            return true;
        }
    }

    public void m31192Df(C10930q6.C10946p pVar) {
        this.f10753x0 = pVar;
        this.f10752w0 = false;
        this.f10745p0.m34133s3(R.id.btn_devices);
        m9204n9();
    }

    public void m31191Ef(final C10930q6.C10946p pVar) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3217vt.this.m31192Df(pVar);
            }
        });
    }

    public void m31190Ff(int i) {
        if (!m9347Sa()) {
            m31149eg(i >= 2);
        }
    }

    public void m31189Gf(final int i) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3217vt.this.m31190Ff(i);
            }
        });
    }

    public void m31188Hf() {
        if (this.f10743n0 != null && !m9347Sa()) {
            this.f10743n0.setSubtitle(m31195Af());
        }
    }

    public void m31187If(C9239m mVar, float f, boolean z, float f2, float f3) {
        m31145gg();
    }

    public void m31186Jf() {
        this.f10740D0 = null;
        this.f10742F0 = false;
        m31163Xf();
    }

    public void m31185Kf(TdApi.User user) {
        if (!m9347Sa()) {
            m31143hg();
            if (m31151dg(user)) {
                this.f10745p0.m34133s3(R.id.btn_username);
            }
            if (m31157ag(user)) {
                this.f10745p0.m34133s3(R.id.btn_phone);
                this.f10745p0.m34133s3(R.id.btn_changePhoneNumber);
            }
        }
    }

    public void m31184Lf(ArrayList arrayList) {
        if (!m9347Sa()) {
            m31153cg(arrayList);
        }
    }

    public void m31183Mf(TdApi.Object object) {
        if (!m9347Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1883828812) {
                TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
                final ArrayList arrayList = new ArrayList(stickerSetInfoArr.length);
                for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
                    arrayList.add(new C4817v6(this.f30170b, stickerSetInfo));
                }
                arrayList.trimToSize();
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC3217vt.this.m31184Lf(arrayList);
                    }
                });
            } else if (constructor == -1679978726) {
                C1379j0.m37305t0(object);
            }
        }
    }

    public void m31182Nf(TdApi.UserFullInfo userFullInfo) {
        if (!m9347Sa()) {
            m31159Zf(userFullInfo.bio);
        }
    }

    public void m31181Of(int i) {
        if (!m9347Sa()) {
            m9290ad(i, null);
        }
    }

    public void m31179Pf(final int i) {
        m9151ud(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3217vt.this.m31181Of(i);
            }
        });
    }

    public boolean m31177Qf(View view, int i) {
        switch (i) {
            case R.id.btn_build:
                m9291ac(new View$OnClickListenerC3209vr(this.f30168a, this.f30170b));
                return true;
            case R.id.btn_copyDebug:
                C1379j0.m37328i(C7389v0.m16660Z0(this.f30170b), R.string.CopiedText);
                return true;
            case R.id.btn_copyText:
                C1379j0.m37328i(C4403w.m27921X(this.f30170b), R.string.CopiedText);
                return true;
            case R.id.btn_sourceCode:
                C1379j0.m37339c0("https://github.com/TGX-Android/Telegram-X/commit/4de70fa37dd8e7ba6710f2e9ec2f57a3d909b4cb");
                return true;
            case R.id.btn_tdlib:
                this.f30170b.m2476e6(new AbstractC5919k() {
                    @Override
                    public final void mo3250a(int i2) {
                        View$OnClickListenerC3217vt.this.m31179Pf(i2);
                    }
                });
                return true;
            default:
                return true;
        }
    }

    public void m31175Rf(TdApi.Object object, final TdApi.SuggestedAction suggestedAction) {
        View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
        ljVar.m33966bg(new View$OnClickListenerC2665lj.C2666a(11, (TdApi.PasswordState) object).m33923d(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC3217vt.this.m31169Uf(suggestedAction, (String) obj);
            }
        }));
        m9291ac(ljVar);
    }

    public void m31173Sf(final TdApi.SuggestedAction suggestedAction, final TdApi.Object object) {
        if (object.getConstructor() == -2001619202) {
            m9135wd(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3217vt.this.m31175Rf(object, suggestedAction);
                }
            });
        } else {
            C1379j0.m37305t0(object);
        }
    }

    public boolean m31171Tf(final TdApi.SuggestedAction suggestedAction, View view, int i) {
        switch (i) {
            case R.id.btn_2fa:
                this.f30170b.m2270r4().m14783o(new TdApi.GetPasswordState(), new Client.AbstractC7865g() {
                    @Override
                    public final void mo255t2(TdApi.Object object) {
                        View$OnClickListenerC3217vt.this.m31173Sf(suggestedAction, object);
                    }
                });
                return true;
            case R.id.btn_cancel:
                m31127xf(suggestedAction);
                return true;
            case R.id.btn_changePhoneNumber:
                m9291ac(new View$OnClickListenerC2461gw(this.f30168a, this.f30170b));
                return true;
            case R.id.btn_info:
                this.f30170b.m2485dd().m3858E7(this, C4403w.m27823u1(R.string.url_faqPhoneNumber, new Object[0]), new HandlerC10770jj.C10788q().m3322i());
                return true;
            default:
                return true;
        }
    }

    public void m31169Uf(TdApi.SuggestedAction suggestedAction, String str) {
        m31127xf(suggestedAction);
    }

    @Override
    public boolean mo493A3(View view, int i) {
        return this.f30170b.m2485dd().m3433v3(this, i, this.f30170b.m2550Z9());
    }

    @Override
    public int mo408A9() {
        return 3;
    }

    @Override
    public void mo9477Ac() {
        int N0;
        super.mo9477Ac();
        if (this.f10745p0 != null) {
            float t0 = C4868i.m24727c2().m24593t0();
            float f = this.f10748s0;
            if (!(f == 0.0f || f == t0 || (N0 = this.f10745p0.m34227N0(R.id.btn_bio)) == -1)) {
                View C = this.f10744o0.getLayoutManager().mo39265C(N0);
                if (C != null) {
                    C.requestLayout();
                } else {
                    this.f10745p0.m39315I(N0);
                }
            }
            this.f10748s0 = t0;
        }
        m31128wf(true);
    }

    public final String m31195Af() {
        if (!this.f30170b.m2704P6()) {
            return C4403w.m27911Z1(C4403w.m27871i1(HandlerC10770jj.m3707T8(this.f30170b.m2142z4())));
        }
        return C4403w.m27911Z1(C4403w.m27871i1(this.f30170b.m2550Z9() != null ? R.string.status_Online : R.string.network_Connecting));
    }

    public final void m31194Bf() {
        TdApi.User Z9 = this.f30170b.m2550Z9();
        m31151dg(Z9);
        m31157ag(Z9);
    }

    @Override
    public void mo2957E6(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2961a(this, q6Var, session);
    }

    @Override
    public View mo8869G9() {
        return this.f10743n0;
    }

    @Override
    public void mo2038H4(int[] iArr, boolean z) {
    }

    @Override
    public void mo9429H8(LinearLayout linearLayout, float f) {
        super.mo9429H8(linearLayout, f);
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof C9310u0) {
                C9310u0 u0Var = (C9310u0) childAt;
                C9239m mVar = this.f10743n0;
                u0Var.m9517h(R.id.theme_color_headerIcon, R.id.theme_color_white, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f);
            }
        }
    }

    @Override
    public void mo8867Ia() {
        super.mo8867Ia();
        for (int i = 0; i < this.f10754y0.m21464n(); i++) {
            this.f10754y0.m21463o(i).m22639F(Log.TAG_CRASH, C4403w.m27986G2());
            this.f10745p0.m34133s3(this.f10754y0.m21468i(i));
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.menu_btn_more) {
            m9302Yd(new int[]{R.id.more_btn_logout}, new String[]{C4403w.m27871i1(R.string.LogOut)}, 0);
        }
    }

    @Override
    public int mo9413J9() {
        return R.drawable.baseline_edit_24;
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        C2546iq iqVar = this.f10745p0;
        if (iqVar == null) {
            return;
        }
        if (i == 0) {
            iqVar.m34254A1();
            C9239m mVar = this.f10743n0;
            if (mVar != null) {
                mVar.setSubtitle(m31195Af());
            }
        } else if (i == 1) {
            iqVar.m34254A1();
        } else if (i == 2) {
            iqVar.m34245E1(i2);
        }
    }

    @Override
    public int mo8865M9() {
        return (int) (C4896n.m24479e() + (C4896n.m24478f(true) * this.f10744o0.getScrollFactor()));
    }

    @Override
    public void mo8864N0(int i) {
        if (i != R.id.menu_btn_more) {
            this.f30170b.m2485dd().m3443u3(this, i, this.f30170b.m2550Z9(), null);
        } else {
            this.f30170b.m2485dd().m3639a7(this, true);
        }
    }

    @Override
    public void mo9384N8(C9270q1 q1Var) {
        super.mo9384N8(q1Var);
        this.f10744o0.setFloatingButton(q1Var.m9758H());
    }

    @Override
    public void mo2956O5(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2959c(this, q6Var, session);
    }

    @Override
    public int mo9375O9() {
        C9239m mVar = this.f10743n0;
        return (mVar == null || mVar.m9813r1()) ? R.id.theme_color_headerIcon : R.id.theme_color_white;
    }

    @Override
    public void mo11102P2(C6253l lVar, boolean z) {
    }

    @Override
    public boolean mo492Q() {
        return C5115g0.m23936a(this);
    }

    @Override
    public void mo9804Q5() {
        if (this.f30170b.m2550Z9() != null) {
            m31129vf();
        }
    }

    @Override
    public int mo407R9() {
        return R.id.controller_settings;
    }

    @Override
    public void mo2037U3(TdApi.StickerSets stickerSets, int i) {
    }

    @Override
    public int mo9326V9() {
        return C4896n.m24482b(true);
    }

    public final void m31167Vf() {
        if (!this.f10752w0) {
            this.f10752w0 = true;
            this.f30170b.m2569Y5(false, new AbstractC5918j() {
                @Override
                public final void mo1330a(Object obj) {
                    View$OnClickListenerC3217vt.this.m31191Ef((C10930q6.C10946p) obj);
                }
            });
        }
    }

    @Override
    public int mo418W9() {
        return R.id.menu_more_settings;
    }

    public final C5459x0 m31165Wf(CharSequence charSequence, int i) {
        C5459x0 e = this.f10754y0.m21472e(i);
        if (e == null || !C5070i.m24068c(e.m22617v(), charSequence)) {
            int i2 = 0;
            if (i == R.id.btn_bio) {
                e = new C5459x0(this.f30170b, charSequence.toString(), AbstractC4761s4.m26212D9(), C5428t.AbstractC5441d.f17872C, 7, null);
            } else {
                e = new C5459x0(charSequence.toString(), AbstractC4761s4.m26212D9(), C5428t.AbstractC5441d.f17872C, RunnableC5390g.m22912p1(charSequence, false, this.f30170b, null));
            }
            if (C4403w.m27986G2()) {
                i2 = Log.TAG_CRASH;
            }
            e.m22636a(i2 | 8);
            this.f10754y0.m21467j(i, e);
        }
        return e;
    }

    @Override
    public void mo2955X0(C10930q6 q6Var, TdApi.Session session) {
        C10904p1.m2958d(this, q6Var, session);
    }

    public final void m31163Xf() {
        if (!this.f10742F0) {
            this.f10742F0 = true;
            this.f30170b.m2270r4().m14783o(new TdApi.GetInstalledStickerSets(false), new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC3217vt.this.m31183Mf(object);
                }
            });
        }
    }

    public final void m31161Yf(final TdApi.UserFullInfo userFullInfo) {
        if (userFullInfo != null) {
            this.f30170b.m2469ed(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3217vt.this.m31182Nf(userFullInfo);
                }
            });
        }
    }

    @Override
    public void mo2036Z(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2048d(this, stickerSetInfo);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        this.f30170b.m2480e2().m1706O1(this);
        this.f30170b.m2781K9().m1814r0(this);
        this.f30170b.m2781K9().m1786y0(this);
        this.f30170b.m2781K9().m1798v0(this);
        C11052v1.m1768b().m1766d(this.f10745p0);
        this.f10743n0.mo4501a3();
    }

    public final void m31159Zf(String str) {
        String str2 = this.f10739C0;
        if (str2 == null || !C5070i.m24068c(str2, str)) {
            this.f10739C0 = str;
            this.f10745p0.m34133s3(R.id.btn_bio);
        }
    }

    @Override
    public void mo1559a1(String str) {
        m31159Zf(str);
    }

    public final boolean m31157ag(TdApi.User user) {
        String str;
        if (user != null) {
            str = C1363c0.m37413w(user.phoneNumber);
            this.f10738B0 = str;
            if (C4868i.m24727c2().m24876H2()) {
                str = C1363c0.m37447b0(str);
            }
        } else {
            str = C4403w.m27871i1(R.string.LoadingPhone);
            this.f10738B0 = null;
        }
        if (C5070i.m24068c(this.f10737A0, str)) {
            return false;
        }
        this.f10737A0 = str;
        return true;
    }

    @Override
    public Object mo491b2(int i) {
        return C5115g0.m23935b(this, i);
    }

    public void m31155bg(AbstractC3219b bVar) {
        this.f10741E0 = bVar;
    }

    @Override
    public void mo2954c3(C10930q6 q6Var, int i) {
        C10904p1.m2960b(this, q6Var, i);
    }

    @Override
    public void mo2953c7(C10930q6 q6Var, boolean z) {
        m9135wd(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3217vt.this.m31167Vf();
            }
        });
    }

    public final void m31153cg(ArrayList<C4817v6> arrayList) {
        this.f10740D0 = arrayList;
        AbstractC3219b bVar = this.f10741E0;
        if (bVar != null) {
            bVar.mo31124K5(arrayList);
        }
    }

    @Override
    public void mo2035d5(TdApi.StickerSet stickerSet) {
        C10965r1.m2045g(this, stickerSet);
    }

    @Override
    public boolean mo9270dc() {
        return this.f10753x0 == null;
    }

    public final boolean m31151dg(TdApi.User user) {
        String str = user != null ? user.username : null;
        String str2 = this.f10755z0;
        if ((str2 != null || str == null) && (str2 == null || str2.equals(str))) {
            return false;
        }
        this.f10755z0 = str;
        return true;
    }

    @Override
    public void mo2996e0(int i, int i2) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC3217vt.this.m31188Hf();
            }
        });
    }

    @Override
    public void mo9266e9() {
        super.mo9266e9();
        this.f10744o0.setFloatingButton(null);
    }

    public final void m31149eg(boolean z) {
        int i = z ? 3 : 2;
        C5320c cVar = new C5320c(i);
        C5320c cVar2 = new C5320c(i);
        C5146u0 u0Var = new C5146u0(i);
        cVar.m23285a(R.id.btn_sourceCode);
        u0Var.m23817a(R.string.SourceCode);
        cVar2.m23285a(R.drawable.baseline_code_24);
        cVar.m23285a(R.id.btn_copyText);
        u0Var.m23817a(R.string.CopyVersion);
        cVar2.m23285a(R.drawable.baseline_content_copy_24);
        if (z) {
            cVar.m23285a(R.id.btn_copyDebug);
            u0Var.m23817a(R.string.CopyReportData);
            cVar2.m23285a(R.drawable.baseline_content_copy_24);
            cVar.m23285a(R.id.btn_tdlib);
            u0Var.m23817a(R.string.TdlibLogs);
            cVar2.m23285a(R.drawable.baseline_build_24);
            cVar.m23285a(R.id.btn_build);
            u0Var.m23817a(R.string.AppLogs);
            cVar2.m23285a(R.drawable.baseline_build_24);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C4403w.m27980I0(this, R.string.AppSignature, "0.24.6.1507-arm64-v8a"));
        spannableStringBuilder.append('\n').append(C4403w.m27980I0(this, R.string.CommitSignature, "4de70fa", "https://github.com/TGX-Android/Telegram-X/commit/4de70fa37dd8e7ba6710f2e9ec2f57a3d909b4cb"));
        spannableStringBuilder.append('\n').append(C4403w.m27980I0(this, R.string.CreatedOn, C4403w.m27807y1(1647100965L, TimeUnit.SECONDS)));
        m9261ee(spannableStringBuilder, cVar.m23281e(), u0Var.m23814d(), null, cVar2.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean Qf;
                Qf = View$OnClickListenerC3217vt.this.m31177Qf(view, i2);
                return Qf;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i2) {
                return C5115g0.m23935b(this, i2);
            }
        });
    }

    @Override
    public void mo2034f6(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2046f(this, stickerSetInfo);
    }

    public final void m31147fg(final TdApi.SuggestedAction suggestedAction) {
        String str;
        String i1;
        C5320c cVar = new C5320c(3);
        C5146u0 u0Var = new C5146u0(3);
        C5320c cVar2 = new C5320c(3);
        C5320c cVar3 = new C5320c(3);
        int constructor = suggestedAction.getConstructor();
        if (constructor == 648771563) {
            i1 = C4403w.m27871i1(R.string.ReminderCheckPhoneNumberDescription);
            cVar.m23285a(R.id.btn_changePhoneNumber);
            u0Var.m23817a(R.string.ReminderActionChangePhoneNumber);
            cVar2.m23285a(1);
            cVar3.m23285a(R.drawable.baseline_edit_24);
            cVar.m23285a(R.id.btn_cancel);
            u0Var.m23816b(C4403w.m27867j1(R.string.ReminderCheckPhoneNumberHide, this.f10738B0));
            cVar2.m23285a(1);
            cVar3.m23285a(R.drawable.baseline_check_24);
            cVar.m23285a(R.id.btn_info);
            u0Var.m23817a(R.string.ReminderActionLearnMore);
            cVar2.m23285a(1);
            cVar3.m23285a(R.drawable.baseline_info_24);
        } else if (constructor != 1910534839) {
            i1 = null;
        } else {
            String i12 = C4403w.m27871i1(R.string.ReminderCheckTfaPasswordDescription);
            cVar.m23285a(R.id.btn_2fa);
            u0Var.m23817a(R.string.ReminderActionVerifyPassword);
            cVar2.m23285a(3);
            cVar3.m23285a(R.drawable.mrgrigri_baseline_textbox_password_24);
            cVar.m23285a(R.id.btn_cancel);
            u0Var.m23817a(R.string.ReminderCheckTfaPasswordHide);
            cVar2.m23285a(1);
            cVar3.m23285a(R.drawable.baseline_cancel_24);
            str = i12;
            m9261ee(str, cVar.m23281e(), u0Var.m23814d(), cVar2.m23281e(), cVar3.m23281e(), new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view, int i) {
                    boolean Tf;
                    Tf = View$OnClickListenerC3217vt.this.m31171Tf(suggestedAction, view, i);
                    return Tf;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23936a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23935b(this, i);
                }
            });
        }
        str = i1;
        m9261ee(str, cVar.m23281e(), u0Var.m23814d(), cVar2.m23281e(), cVar3.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Tf;
                Tf = View$OnClickListenerC3217vt.this.m31171Tf(suggestedAction, view, i);
                return Tf;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    public final void m31145gg() {
        View$OnClickListenerC9170d1 d1Var = this.f30159R;
        if (d1Var != null) {
            View$OnClickListenerC9150b backButton = d1Var.getBackButton();
            int l0 = C11524j.m169l0();
            C9239m mVar = this.f10743n0;
            backButton.setColor(C5064d.m24129d(l0, -1, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f));
            this.f30159R.m10079W3(mo418W9(), this, m9456Da());
        }
    }

    public final void m31143hg() {
        TdApi.User Z9 = this.f30170b.m2550Z9();
        if (this.f10743n0 != null) {
            if (Z9 == null || C4779t2.m25416u3(Z9.profilePhoto)) {
                this.f10743n0.setAvatarPlaceholder(this.f30170b.m2480e2().m1717L2(this.f30170b.m2519ba(), Z9, false, C9239m.getBaseAvatarRadiusDp(), null));
            } else {
                this.f10743n0.setAvatar(Z9.profilePhoto);
            }
            this.f10743n0.m9830S1(Z9 != null ? C4779t2.m25438r2(Z9) : C4403w.m27871i1(R.string.LoadingUser), m31195Af());
            this.f10743n0.invalidate();
        }
    }

    @Override
    public void mo2033j3(int[] iArr) {
    }

    @Override
    public void mo2032k(long[] jArr, boolean z) {
        if (!z) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3217vt.this.m31186Jf();
                }
            });
        }
    }

    @Override
    public void mo9222kc() {
        super.mo9222kc();
        this.f10744o0.setFactorLocked(true);
        m31130uf();
    }

    @Override
    public void mo1558l2(final TdApi.User user) {
        if (user != null) {
            this.f30170b.m2485dd().post(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC3217vt.this.m31185Kf(user);
                }
            });
        }
    }

    @Override
    public void mo2995m3(TdApi.NetworkType networkType) {
        C10838m0.m3048b(this, networkType);
    }

    @Override
    public void mo6871o6() {
        super.mo6871o6();
        m31128wf(true);
    }

    @Override
    public View mo403oc(Context context) {
        TdApi.SuggestedAction[] d6;
        C9239m mVar = new C9239m(context, this.f30170b, this);
        this.f10743n0 = mVar;
        mVar.setAvatarExpandListener(new C9239m.AbstractC9241b() {
            @Override
            public final void mo9805a(C9239m mVar2, float f, boolean z, float f2, float f3) {
                View$OnClickListenerC3217vt.this.m31187If(mVar2, f, z, f2, f3);
            }
        });
        this.f10743n0.m9840K1();
        this.f10743n0.m9814q1(this, true);
        this.f10743n0.m9832Q1(C1357a0.m37544i(56.0f), C1357a0.m37544i(49.0f));
        this.f10743n0.setPhotoOpenCallback(this);
        m31143hg();
        m31194Bf();
        RunnableC9248n nVar = new RunnableC9248n(context, this);
        this.f10744o0 = nVar;
        nVar.setHasFixedSize(true);
        this.f10744o0.m9797R1(this.f10743n0, this);
        this.f10744o0.setItemAnimator(null);
        C10192g.m5782i(this.f10744o0, R.id.theme_color_background, this);
        this.f10744o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f10744o0.setLayoutParams(FrameLayoutFix.m18008s1(-1, -1));
        C3218a aVar = new C3218a(this);
        this.f10745p0 = aVar;
        aVar.m34241F2(this);
        List<C2964ra> F0 = this.f10745p0.m34243F0();
        C5062b.m24160m(F0, 27);
        F0.add(new C2964ra(0));
        F0.add(new C2964ra(6, R.id.btn_username, R.drawable.baseline_alternate_email_24, R.string.Username).m32874F(R.string.LoadingUsername, R.string.SetUpUsername));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(6, R.id.btn_phone, R.drawable.baseline_phone_24, R.string.Phone));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(37, R.id.btn_bio, R.drawable.baseline_info_24, R.string.UserBio).m32874F(R.string.LoadingInformation, R.string.BioNone));
        F0.add(new C2964ra(3));
        int i = 0;
        for (TdApi.SuggestedAction suggestedAction : this.f30170b.m2492d6()) {
            if (this.f30170b.m2347m7(suggestedAction)) {
                F0.add(new C2964ra(i == 0 ? 2 : 1));
                int constructor = suggestedAction.getConstructor();
                if (constructor == 648771563) {
                    F0.add(new C2964ra(37, R.id.btn_changePhoneNumber, R.drawable.baseline_sim_card_alert_24, R.string.ReminderCheckPhoneNumber));
                } else if (constructor == 1910534839) {
                    F0.add(new C2964ra(37, R.id.btn_2fa, R.drawable.baseline_gpp_maybe_24, R.string.ReminderCheckTfaPassword));
                }
                i++;
            }
        }
        if (i > 0) {
            F0.add(new C2964ra(3));
        }
        F0.add(new C2964ra(2));
        int i2 = 89;
        F0.add(new C2964ra(89, R.id.btn_devices, R.drawable.baseline_devices_other_24, R.string.Devices));
        F0.add(new C2964ra(1));
        m31128wf(false);
        if (this.f10750u0 == 0) {
            i2 = 4;
        }
        F0.add(new C2964ra(i2, R.id.btn_notificationSettings, R.drawable.baseline_notifications_24, R.string.Notifications));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_chatSettings, R.drawable.baseline_data_usage_24, R.string.DataSettings));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_privacySettings, R.drawable.baseline_lock_24, R.string.PrivacySettings));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_themeSettings, R.drawable.baseline_palette_24, R.string.ThemeSettings));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_tweakSettings, R.drawable.baseline_extension_24, R.string.TweakSettings));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_stickerSettings, R.drawable.deproko_baseline_stickers_filled_24, R.string.Stickers));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_languageSettings, R.drawable.baseline_language_24, R.string.Language));
        F0.add(new C2964ra(3));
        F0.add(new C2964ra(2));
        F0.add(new C2964ra(4, R.id.btn_help, R.drawable.baseline_live_help_24, R.string.AskAQuestion));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_faq, R.drawable.baseline_help_24, R.string.TelegramFAQ));
        F0.add(new C2964ra(1));
        F0.add(new C2964ra(4, R.id.btn_privacyPolicy, R.drawable.baseline_policy_24, R.string.PrivacyPolicy));
        F0.add(new C2964ra(3));
        F0.add(new C2964ra(10, (int) R.id.btn_build, 0, (CharSequence) C4403w.m27921X(this.f30170b), false));
        m31161Yf(this.f30170b.m2535aa());
        this.f10744o0.setAdapter(this.f10745p0);
        this.f30170b.m2480e2().m1728J(this);
        this.f30170b.m2781K9().m1866e0(this);
        this.f30170b.m2781K9().m1850i0(this);
        C11052v1.m1768b().m1769a(this.f10745p0);
        m31167Vf();
        return this.f10744o0;
    }

    @Override
    public void onClick(View view) {
        m31130uf();
        if (!this.f30170b.m2485dd().m3453t3(this, view, view.getId(), this.f30170b.m2550Z9(), true)) {
            switch (view.getId()) {
                case R.id.btn_2fa:
                    m31147fg(new TdApi.SuggestedActionCheckPassword());
                    return;
                case R.id.btn_bio:
                    C2700m6 m6Var = new C2700m6(this.f30168a, this.f30170b);
                    m6Var.m33795wf(new C2700m6.C2702b(this.f10739C0, 0L));
                    m9291ac(m6Var);
                    return;
                case R.id.btn_build:
                    if (C4868i.m24727c2().m24772W1()) {
                        m31149eg(true);
                        return;
                    } else {
                        this.f30170b.m2476e6(new AbstractC5919k() {
                            @Override
                            public final void mo3250a(int i) {
                                View$OnClickListenerC3217vt.this.m31189Gf(i);
                            }
                        });
                        return;
                    }
                case R.id.btn_changePhoneNumber:
                    m31147fg(new TdApi.SuggestedActionCheckPhoneNumber());
                    return;
                case R.id.btn_chatSettings:
                    m9291ac(new View$OnClickListenerC2204bu(this.f30168a, this.f30170b));
                    return;
                case R.id.btn_devices:
                    m9291ac(new View$OnClickListenerC2265cy(this.f30168a, this.f30170b));
                    return;
                case R.id.btn_faq:
                    this.f30170b.m2485dd().m3858E7(this, C4403w.m27871i1(R.string.url_faq), new HandlerC10770jj.C10788q().m3322i());
                    return;
                case R.id.btn_help:
                    this.f10747r0 = this.f30170b.m2485dd().m3878C7(this);
                    return;
                case R.id.btn_languageSettings:
                    m9291ac(new View$OnClickListenerC2355ev(this.f30168a, this.f30170b));
                    return;
                case R.id.btn_notificationSettings:
                    m9291ac(new View$OnClickListenerC2359ew(this.f30168a, this.f30170b));
                    return;
                case R.id.btn_privacyPolicy:
                    this.f30170b.m2485dd().m3858E7(this, C4403w.m27823u1(R.string.url_privacyPolicy, new Object[0]), new HandlerC10770jj.C10788q().m3322i());
                    return;
                case R.id.btn_privacySettings:
                    m9291ac(new View$OnClickListenerC3222vw(this.f30168a, this.f30170b));
                    return;
                case R.id.btn_stickerSettings:
                    C2314dy dyVar = new C2314dy(this.f30168a, this.f30170b);
                    dyVar.m35106xg(this);
                    m9291ac(dyVar);
                    return;
                case R.id.btn_themeSettings:
                    m9291ac(new View$OnClickListenerC2364ez(this.f30168a, this.f30170b));
                    return;
                case R.id.btn_tweakSettings:
                    View$OnClickListenerC2364ez ezVar = new View$OnClickListenerC2364ez(this.f30168a, this.f30170b);
                    ezVar.m34834Wh(new View$OnClickListenerC2364ez.C2367c(1));
                    m9291ac(ezVar);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.btn_build) {
            return false;
        }
        m31149eg(true);
        return true;
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_more_settings) {
            d1Var.m10068b2(linearLayout, this);
        }
    }

    @Override
    public void mo11101r(C6253l lVar, boolean z) {
    }

    @Override
    public void mo9174rc() {
        View$OnClickListenerC2118a7 a7Var = new View$OnClickListenerC2118a7(this.f30168a, this.f30170b);
        a7Var.m35521uf(1);
        m9291ac(a7Var);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        this.f10744o0.setFactorLocked(false);
        m31163Xf();
        if (!this.f10746q0) {
            this.f10746q0 = true;
            this.f30170b.m2781K9().m1838l0(this);
        }
    }

    @Override
    public void mo10181t(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f30170b.m2485dd().m3483q3(i, intent, null);
        }
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        if (object.getConstructor() != -1679978726) {
            Log.unexpectedTdlibResponse(object, TdApi.GetUserFullInfo.class, TdApi.UserFullInfo.class, TdApi.Error.class);
        } else {
            C1379j0.m37305t0(object);
        }
    }

    public final void m31130uf() {
        AbstractRunnableC5910b bVar = this.f10747r0;
        if (bVar != null) {
            bVar.m21858c();
            this.f10747r0 = null;
        }
    }

    public final void m31129vf() {
        TdApi.ProfilePhoto profilePhoto;
        C5320c cVar = new C5320c(4);
        C5146u0 u0Var = new C5146u0(4);
        C5320c cVar2 = new C5320c(4);
        C5320c cVar3 = new C5320c(4);
        final TdApi.User Z9 = this.f30170b.m2550Z9();
        if (!(Z9 == null || Z9.profilePhoto == null)) {
            cVar.m23285a(R.id.btn_open);
            u0Var.m23817a(R.string.Open);
            cVar3.m23285a(R.drawable.baseline_visibility_24);
            cVar2.m23285a(1);
        }
        cVar.m23285a(R.id.btn_changePhotoCamera);
        u0Var.m23817a(R.string.ChatCamera);
        cVar3.m23285a(R.drawable.baseline_camera_alt_24);
        cVar2.m23285a(1);
        cVar.m23285a(R.id.btn_changePhotoGallery);
        u0Var.m23817a(R.string.Gallery);
        cVar3.m23285a(R.drawable.baseline_image_24);
        cVar2.m23285a(1);
        final long j = (Z9 == null || (profilePhoto = Z9.profilePhoto) == null) ? 0L : profilePhoto.f25417id;
        if (!(Z9 == null || Z9.profilePhoto == null)) {
            cVar.m23285a(R.id.btn_changePhotoDelete);
            u0Var.m23817a(R.string.Delete);
            cVar3.m23285a(R.drawable.baseline_delete_24);
            cVar2.m23285a(2);
        }
        m9261ee(null, cVar.m23281e(), u0Var.m23814d(), cVar2.m23281e(), cVar3.m23281e(), new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i) {
                boolean Cf;
                Cf = View$OnClickListenerC3217vt.this.m31193Cf(Z9, j, view, i);
                return Cf;
            }

            @Override
            public boolean mo492Q() {
                return C5115g0.m23936a(this);
            }

            @Override
            public Object mo491b2(int i) {
                return C5115g0.m23935b(this, i);
            }
        });
    }

    public final void m31128wf(boolean z) {
        C2546iq iqVar;
        int N0;
        long j = this.f10751v0;
        boolean X0 = this.f30170b.m2440ga().m3160X0();
        boolean z2 = false;
        int yf = X0 ? m31126yf() : 0;
        int i = this.f10750u0;
        boolean z3 = i != 0;
        if (yf != 0) {
            z2 = true;
        }
        if (this.f10749t0 != X0 || (X0 && !(i == yf && this.f10751v0 == j))) {
            this.f10749t0 = X0;
            this.f10750u0 = yf;
            if (z && (iqVar = this.f10745p0) != null && (N0 = iqVar.m34227N0(R.id.btn_notificationSettings)) != -1) {
                C2964ra raVar = this.f10745p0.m34243F0().get(N0);
                if (z3 != z2) {
                    raVar.m32842f0(z2 ? 89 : 4);
                    this.f10745p0.m39315I(N0);
                    return;
                }
                this.f10745p0.m34127u3(N0);
                return;
            }
            return;
        }
        this.f10750u0 = yf;
    }

    public final void m31127xf(TdApi.SuggestedAction suggestedAction) {
        int i;
        if (this.f30170b.m2347m7(suggestedAction)) {
            int constructor = suggestedAction.getConstructor();
            if (constructor == 648771563) {
                i = this.f10745p0.m34227N0(R.id.btn_changePhoneNumber);
            } else if (constructor == 1910534839) {
                i = this.f10745p0.m34227N0(R.id.btn_2fa);
            } else {
                return;
            }
            if (i != -1) {
                int i2 = i - 1;
                C2964ra E0 = this.f10745p0.m34246E0(i2);
                C2964ra E02 = this.f10745p0.m34246E0(i + 1);
                if (E02 != null && E0 != null) {
                    int A = E0.m32879A();
                    int A2 = E02.m32879A();
                    if (A2 == 1) {
                        this.f10745p0.m34207V1(i, 2);
                    } else if (A2 == 3) {
                        if (A == 2) {
                            this.f10745p0.m34207V1(i2, 3);
                        } else if (A == 1) {
                            this.f10745p0.m34207V1(i2, 2);
                        }
                    }
                    this.f30170b.m2270r4().m14783o(new TdApi.HideSuggestedAction(suggestedAction), this.f30170b.m2392ja());
                }
            }
        }
    }

    @Override
    public void mo2031y0(TdApi.StickerSetInfo stickerSetInfo) {
        C10965r1.m2047e(this, stickerSetInfo);
    }

    @Override
    public long mo9125y9(boolean z) {
        return 400L;
    }

    public final int m31126yf() {
        this.f10751v0 = 0L;
        switch (this.f30170b.m2440ga().m3219G0()) {
            case 1:
                return R.string.NotificationsErrorBlockedCategory;
            case 2:
                return R.string.NotificationsErrorBlocked;
            case 3:
            case 4:
            case 5:
                return R.string.NotificationsErrorBackground;
            case 6:
                long v = this.f30170b.m2294pc().m4091v();
                this.f10751v0 = v;
                return (v == 0 || this.f30170b.m2739N3(v) == null) ? R.string.NotificationsErrorError : R.string.NotificationsErrorErrorChat;
            case 7:
                return R.string.NotificationsErrorUnselected;
            default:
                boolean C = this.f30170b.m2440ga().m3236C(this.f30170b.m2440ga().m3101n2());
                boolean C2 = this.f30170b.m2440ga().m3236C(this.f30170b.m2440ga().m3105m2());
                boolean C3 = this.f30170b.m2440ga().m3236C(this.f30170b.m2440ga().m3109l2());
                int i = C2 ? (C ? 1 : 0) + 1 : C ? 1 : 0;
                if (C3) {
                    i++;
                }
                if (i == 1) {
                    if (C) {
                        return R.string.NotificationsErrorBlockedPrivate;
                    }
                    if (C2) {
                        return R.string.NotificationsErrorBlockedGroup;
                    }
                    if (C3) {
                        return R.string.NotificationsErrorBlockedChannel;
                    }
                    throw new RuntimeException();
                } else if (i > 1) {
                    return R.string.NotificationsErrorBlockedMixed;
                } else {
                    return 0;
                }
        }
    }

    public ArrayList<C4817v6> m31125zf() {
        return this.f10740D0;
    }
}
