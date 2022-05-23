package de;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ce.a0;
import ce.c0;
import ce.j0;
import de.fz;
import de.lj;
import de.m6;
import gd.w;
import hd.s4;
import hd.t2;
import hd.v6;
import ib.d;
import ib.i;
import ie.g0;
import ie.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import je.g;
import je.t;
import je.x0;
import k0.h;
import kb.j;
import kb.k;
import ld.l;
import me.vkryl.android.widget.FrameLayoutFix;
import oc.v0;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import tc.y1;
import uc.c;
import ud.d1;
import ud.h1;
import ud.j1;
import ud.m;
import ud.n;
import ud.u0;
import ud.v4;
import zd.hj;
import zd.k0;
import zd.l0;
import zd.n1;
import zd.o1;
import zd.o6;
import zd.p1;
import zd.q1;
import zd.t1;
import zd.t7;

public class wt extends v4<Void> implements View.OnClickListener, m.c, h1, j1, h0, t7.e, l0, q1, y1.h, ud.a, Client.g, View.OnLongClickListener, o1 {
    public String A0;
    public String B0;
    public String C0;
    public ArrayList<v6> D0;
    public b E0;
    public boolean F0;
    public m f9953n0;
    public n f9954o0;
    public iq f9955p0;
    public boolean f9956q0;
    public kb.b f9957r0;
    public float f9958s0;
    public boolean f9959t0;
    public int f9960u0;
    public long f9961v0;
    public boolean f9962w0;
    public o6.p f9963x0;
    public final h<x0> f9964y0 = new h<>();
    public String f9965z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        public static Object w3(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            if (i12 == 0) {
                return w.e2(z10);
            }
            return null;
        }

        @Override
        public void R2(ra raVar, c cVar, boolean z10) {
            boolean z11;
            String str;
            int j10 = raVar.j();
            if (j10 != R.id.btn_devices) {
                if (j10 == R.id.btn_notificationSettings) {
                    wt.this.wf(false);
                    z11 = wt.this.f9959t0;
                }
                z11 = false;
            } else {
                if (wt.this.f9963x0 != null && wt.this.f9963x0.f28164c.length > 0) {
                    z11 = true;
                }
                z11 = false;
            }
            cVar.c2(z11 ? o6.B2 : 0, false, z10);
            switch (raVar.j()) {
                case R.id.btn_2fa:
                    cVar.setText(wt.this.Wf(w.i1(R.string.ReminderCheckTfaPasswordText), R.id.btn_2fa));
                    return;
                case R.id.btn_bio:
                    if (wt.this.C0 == null) {
                        str = w.i1(R.string.LoadingInformation);
                    } else if (i.i(wt.this.C0)) {
                        str = w.i1(R.string.BioNone);
                    } else {
                        str = wt.this.C0;
                    }
                    cVar.setText(wt.this.Wf(str, R.id.btn_bio));
                    return;
                case R.id.btn_changePhoneNumber:
                    wt wtVar = wt.this;
                    Object[] objArr = new Object[1];
                    objArr[0] = wtVar.B0 != null ? wt.this.A0 : c0.f5243b;
                    cVar.setText(wtVar.Wf(w.m1(R.string.ReminderCheckPhoneNumberText, objArr), R.id.btn_changePhoneNumber));
                    return;
                case R.id.btn_devices:
                    if (wt.this.f9963x0 == null) {
                        cVar.setData(R.string.LoadingInformation);
                        return;
                    } else if (wt.this.f9963x0.f28164c.length > 0) {
                        cVar.setData(w.q2(R.string.XSignInAttempts, wt.this.f9963x0.f28164c.length));
                        return;
                    } else if (wt.this.f9963x0.f28163b.length == 0) {
                        cVar.setData(R.string.SignedInNoOtherSessions);
                        return;
                    } else if (wt.this.f9963x0.f28163b.length == 1) {
                        TdApi.Session session = wt.this.f9963x0.f28163b[0];
                        if (wt.this.f9963x0.f28167f != 1 || i.i(session.deviceModel)) {
                            cVar.setData(w.m1(R.string.SignedInOtherSession, session.applicationName));
                            return;
                        } else {
                            cVar.setData(w.m1(R.string.SignedInOtherDevice, session.deviceModel));
                            return;
                        }
                    } else if (wt.this.f9963x0.f28167f == 0) {
                        cVar.setData(w.q2(R.string.SignedInXOtherApps, wt.this.f9963x0.f28163b.length));
                        return;
                    } else if (wt.this.f9963x0.f28168g != 1) {
                        cVar.setData(w.k0(R.string.format_signedInAppsOnDevices, w.q2(R.string.part_SignedInXOtherApps, wt.this.f9963x0.f28163b.length), w.q2(R.string.part_SignedInXDevices, wt.this.f9963x0.f28167f + 1)));
                        return;
                    } else if (wt.this.f9963x0.f28163b.length == wt.this.f9963x0.f28167f) {
                        cVar.setData(w.q2(R.string.SignedInXOtherDevices, wt.this.f9963x0.f28167f));
                        return;
                    } else {
                        cVar.setData(w.k0(R.string.format_signedInAppsOnDevices, w.q2(R.string.part_SignedInXApps, wt.this.f9963x0.f28163b.length), w.q2(R.string.part_SignedInXOtherDevices, wt.this.f9963x0.f28167f)));
                        return;
                    }
                case R.id.btn_notificationSettings:
                    if (wt.this.f9960u0 == 0) {
                        return;
                    }
                    if (wt.this.f9960u0 == R.string.NotificationsErrorErrorChat) {
                        cVar.setData(w.m1(wt.this.f9960u0, wt.this.f24495b.U3(wt.this.f9961v0)));
                        return;
                    } else {
                        cVar.setData(wt.this.f9960u0);
                        return;
                    }
                case R.id.btn_phone:
                    cVar.setData(wt.this.A0);
                    return;
                case R.id.btn_sourceCode:
                    cVar.setData(w.h1(R.string.CommitInfo, vt.f9877a, "7d1fbd0d", w.y1(1653327259L, TimeUnit.SECONDS)));
                    return;
                case R.id.btn_username:
                    if (wt.this.f9965z0 == null) {
                        cVar.setData(R.string.LoadingUsername);
                        return;
                    } else if (wt.this.f9965z0.isEmpty()) {
                        cVar.setData(R.string.SetUpUsername);
                        return;
                    } else {
                        cVar.setData("@" + wt.this.f9965z0);
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public interface b {
        void G5(ArrayList<v6> arrayList);
    }

    public wt(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public boolean Cf(TdApi.User user, long j10, View view, int i10) {
        if (i10 != R.id.btn_open) {
            switch (i10) {
                case R.id.btn_changePhotoCamera:
                    j0.Y(this.f24493a);
                    return true;
                case R.id.btn_changePhotoDelete:
                    this.f24495b.v4().o(new TdApi.DeleteProfilePhoto(j10), this.f24495b.na());
                    return true;
                case R.id.btn_changePhotoGallery:
                    j0.a0(false);
                    return true;
                default:
                    return true;
            }
        } else {
            od.j1.mk(this, user, this.f9953n0);
            return true;
        }
    }

    public void Df(o6.p pVar) {
        this.f9963x0 = pVar;
        this.f9962w0 = false;
        this.f9955p0.p3(R.id.btn_devices);
        n9();
    }

    public void Ef(final o6.p pVar) {
        wd(new Runnable() {
            @Override
            public final void run() {
                wt.this.Df(pVar);
            }
        });
    }

    public void Ff(int i10) {
        if (!Sa()) {
            eg(i10 >= 2);
        }
    }

    public void Gf(final int i10) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                wt.this.Ff(i10);
            }
        });
    }

    public void Hf() {
        if (this.f9953n0 != null && !Sa()) {
            this.f9953n0.setSubtitle(Af());
        }
    }

    public void If(m mVar, float f10, boolean z10, float f11, float f12) {
        gg();
    }

    public void Jf() {
        this.D0 = null;
        this.F0 = false;
        Xf();
    }

    public void Kf(TdApi.User user) {
        if (!Sa()) {
            hg();
            if (dg(user)) {
                this.f9955p0.p3(R.id.btn_username);
            }
            if (ag(user)) {
                this.f9955p0.p3(R.id.btn_phone);
                this.f9955p0.p3(R.id.btn_changePhoneNumber);
            }
        }
    }

    public void Lf(ArrayList arrayList) {
        if (!Sa()) {
            cg(arrayList);
        }
    }

    public void Mf(TdApi.Object object) {
        if (!Sa()) {
            int constructor = object.getConstructor();
            if (constructor == -1883828812) {
                TdApi.StickerSetInfo[] stickerSetInfoArr = ((TdApi.StickerSets) object).sets;
                final ArrayList arrayList = new ArrayList(stickerSetInfoArr.length);
                for (TdApi.StickerSetInfo stickerSetInfo : stickerSetInfoArr) {
                    arrayList.add(new v6(this.f24495b, stickerSetInfo));
                }
                arrayList.trimToSize();
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        wt.this.Lf(arrayList);
                    }
                });
            } else if (constructor == -1679978726) {
                j0.t0(object);
            }
        }
    }

    public void Nf(TdApi.UserFullInfo userFullInfo) {
        if (!Sa()) {
            Zf(userFullInfo.bio);
        }
    }

    public void Of(int i10) {
        if (!Sa()) {
            ad(i10, null);
        }
    }

    public void Pf(final int i10) {
        ud(new Runnable() {
            @Override
            public final void run() {
                wt.this.Of(i10);
            }
        });
    }

    public boolean Qf(View view, int i10) {
        switch (i10) {
            case R.id.btn_build:
                ac(new vr(this.f24493a, this.f24495b));
                return true;
            case R.id.btn_copyDebug:
                j0.i(v0.Z0(this.f24495b), R.string.CopiedText);
                return true;
            case R.id.btn_copyText:
                j0.i(w.X(this.f24495b), R.string.CopiedText);
                return true;
            case R.id.btn_sourceCode:
                jg();
                return true;
            case R.id.btn_tdlib:
                this.f24495b.j6(new k() {
                    @Override
                    public final void a(int i11) {
                        wt.this.Pf(i11);
                    }
                });
                return true;
            default:
                return true;
        }
    }

    public void Rf(TdApi.Object object, final TdApi.SuggestedAction suggestedAction) {
        lj ljVar = new lj(this.f24493a, this.f24495b);
        ljVar.bg(new lj.a(11, (TdApi.PasswordState) object).d(new j() {
            @Override
            public final void a(Object obj) {
                wt.this.Uf(suggestedAction, (String) obj);
            }
        }));
        ac(ljVar);
    }

    public void Sf(final TdApi.SuggestedAction suggestedAction, final TdApi.Object object) {
        if (object.getConstructor() == -2001619202) {
            wd(new Runnable() {
                @Override
                public final void run() {
                    wt.this.Rf(object, suggestedAction);
                }
            });
        } else {
            j0.t0(object);
        }
    }

    public boolean Tf(final TdApi.SuggestedAction suggestedAction, View view, int i10) {
        switch (i10) {
            case R.id.btn_2fa:
                this.f24495b.v4().o(new TdApi.GetPasswordState(), new Client.g() {
                    @Override
                    public final void r2(TdApi.Object object) {
                        wt.this.Sf(suggestedAction, object);
                    }
                });
                return true;
            case R.id.btn_cancel:
                xf(suggestedAction);
                return true;
            case R.id.btn_changePhoneNumber:
                ac(new hw(this.f24493a, this.f24495b));
                return true;
            case R.id.btn_info:
                this.f24495b.hd().E7(this, w.u1(R.string.url_faqPhoneNumber, new Object[0]), new hj.q().i());
                return true;
            default:
                return true;
        }
    }

    public void Uf(TdApi.SuggestedAction suggestedAction, String str) {
        xf(suggestedAction);
    }

    @Override
    public int A9() {
        return 3;
    }

    @Override
    public void Ac() {
        int L0;
        super.Ac();
        if (this.f9955p0 != null) {
            float t02 = he.i.c2().t0();
            float f10 = this.f9958s0;
            if (!(f10 == 0.0f || f10 == t02 || (L0 = this.f9955p0.L0(R.id.btn_bio)) == -1)) {
                View C = this.f9954o0.getLayoutManager().C(L0);
                if (C != null) {
                    C.requestLayout();
                } else {
                    this.f9955p0.I(L0);
                }
            }
            this.f9958s0 = t02;
        }
        wf(true);
    }

    public final String Af() {
        if (!this.f24495b.T6()) {
            return w.Z1(w.i1(hj.T8(this.f24495b.D4())));
        }
        return w.Z1(w.i1(this.f24495b.da() != null ? R.string.status_Online : R.string.network_Connecting));
    }

    @Override
    public void B4(l lVar, boolean z10) {
    }

    public final void Bf() {
        TdApi.User da2 = this.f24495b.da();
        dg(da2);
        ag(da2);
    }

    @Override
    public void D2(l lVar, boolean z10) {
    }

    @Override
    public void F5(o6 o6Var, TdApi.Session session) {
        n1.c(this, o6Var, session);
    }

    @Override
    public View G9() {
        return this.f9953n0;
    }

    @Override
    public void H5(o6 o6Var, TdApi.Session session) {
        n1.a(this, o6Var, session);
    }

    @Override
    public void H8(LinearLayout linearLayout, float f10) {
        super.H8(linearLayout, f10);
        for (int i10 = 0; i10 < linearLayout.getChildCount(); i10++) {
            View childAt = linearLayout.getChildAt(i10);
            if (childAt instanceof u0) {
                u0 u0Var = (u0) childAt;
                m mVar = this.f9953n0;
                u0Var.h(R.id.theme_color_headerIcon, R.id.theme_color_white, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f);
            }
        }
    }

    @Override
    public void Ia() {
        super.Ia();
        for (int i10 = 0; i10 < this.f9964y0.n(); i10++) {
            this.f9964y0.o(i10).F(Log.TAG_CRASH, w.G2());
            this.f9955p0.p3(this.f9964y0.i(i10));
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            Yd(new int[]{R.id.more_btn_logout}, new String[]{w.i1(R.string.LogOut)}, 0);
        }
    }

    @Override
    public int J9() {
        return R.drawable.baseline_edit_24;
    }

    @Override
    public void Ja(int i10, int i11) {
        iq iqVar = this.f9955p0;
        if (iqVar == null) {
            return;
        }
        if (i10 == 0) {
            iqVar.w1();
            m mVar = this.f9953n0;
            if (mVar != null) {
                mVar.setSubtitle(Af());
            }
        } else if (i10 == 1) {
            iqVar.w1();
        } else if (i10 == 2) {
            iqVar.z1(i11);
        }
    }

    @Override
    public void L5() {
        if (this.f24495b.da() != null) {
            vf();
        }
    }

    @Override
    public void M3(TdApi.StickerSets stickerSets, int i10) {
    }

    @Override
    public int M9() {
        return (int) (he.n.e() + (he.n.f(true) * this.f9954o0.getScrollFactor()));
    }

    @Override
    public void N8(ud.q1 q1Var) {
        super.N8(q1Var);
        this.f9954o0.setFloatingButton(q1Var.H());
    }

    @Override
    public int O9() {
        m mVar = this.f9953n0;
        return (mVar == null || mVar.t1()) ? R.id.theme_color_headerIcon : R.id.theme_color_white;
    }

    @Override
    public boolean P() {
        return g0.a(this);
    }

    @Override
    public void P0(int i10) {
        if (i10 != R.id.menu_btn_more) {
            this.f24495b.hd().u3(this, i10, this.f24495b.da(), null);
        } else {
            this.f24495b.hd().a7(this, true);
        }
    }

    @Override
    public int R9() {
        return R.id.controller_settings;
    }

    @Override
    public int V9() {
        return he.n.b(true);
    }

    public final void Vf() {
        if (!this.f9962w0) {
            this.f9962w0 = true;
            this.f24495b.c6(false, new j() {
                @Override
                public final void a(Object obj) {
                    wt.this.Ef((o6.p) obj);
                }
            });
        }
    }

    @Override
    public void W0(String str) {
        Zf(str);
    }

    @Override
    public int W9() {
        return R.id.menu_more_settings;
    }

    public final x0 Wf(CharSequence charSequence, int i10) {
        x0 e10 = this.f9964y0.e(i10);
        if (e10 == null || !i.c(e10.v(), charSequence)) {
            int i11 = 0;
            if (i10 == R.id.btn_bio) {
                e10 = new x0(this.f24495b, charSequence.toString(), s4.D9(), t.d.C, 7, null);
            } else {
                e10 = new x0(charSequence.toString(), s4.D9(), t.d.C, g.p1(charSequence, false, this.f24495b, null));
            }
            if (w.G2()) {
                i11 = Log.TAG_CRASH;
            }
            e10.a(i11 | 8);
            this.f9964y0.j(i10, e10);
        }
        return e10;
    }

    public final void Xf() {
        if (!this.F0) {
            this.F0 = true;
            this.f24495b.v4().o(new TdApi.GetInstalledStickerSets(false), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    wt.this.Mf(object);
                }
            });
        }
    }

    @Override
    public void Y4(TdApi.StickerSet stickerSet) {
        p1.g(this, stickerSet);
    }

    public final void Yf(final TdApi.UserFullInfo userFullInfo) {
        if (userFullInfo != null) {
            this.f24495b.id(new Runnable() {
                @Override
                public final void run() {
                    wt.this.Nf(userFullInfo);
                }
            });
        }
    }

    @Override
    public void Z(TdApi.StickerSetInfo stickerSetInfo) {
        p1.d(this, stickerSetInfo);
    }

    @Override
    public void Z2(int[] iArr) {
    }

    @Override
    public void Z8() {
        super.Z8();
        this.f24495b.e2().M1(this);
        this.f24495b.O9().r0(this);
        this.f24495b.O9().y0(this);
        this.f24495b.O9().v0(this);
        t1.b().d(this.f9955p0);
        this.f9953n0.Q2();
    }

    public final void Zf(String str) {
        String str2 = this.C0;
        if (str2 == null || !i.c(str2, str)) {
            this.C0 = str;
            this.f9955p0.p3(R.id.btn_bio);
        }
    }

    @Override
    public Object a2(int i10) {
        return g0.b(this, i10);
    }

    public final boolean ag(TdApi.User user) {
        String str;
        if (user != null) {
            str = c0.w(user.phoneNumber);
            this.B0 = str;
            if (he.i.c2().H2()) {
                str = c0.b0(str);
            }
        } else {
            str = w.i1(R.string.LoadingPhone);
            this.B0 = null;
        }
        if (i.c(this.A0, str)) {
            return false;
        }
        this.A0 = str;
        return true;
    }

    public void bg(b bVar) {
        this.E0 = bVar;
    }

    public final void cg(ArrayList<v6> arrayList) {
        this.D0 = arrayList;
        b bVar = this.E0;
        if (bVar != null) {
            bVar.G5(arrayList);
        }
    }

    @Override
    public void d3(TdApi.NetworkType networkType) {
        k0.b(this, networkType);
    }

    @Override
    public boolean dc() {
        return this.f9963x0 == null;
    }

    public final boolean dg(TdApi.User user) {
        String str = user != null ? user.username : null;
        String str2 = this.f9965z0;
        if ((str2 != null || str == null) && (str2 == null || str2.equals(str))) {
            return false;
        }
        this.f9965z0 = str;
        return true;
    }

    @Override
    public void e0(int i10, int i11) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                wt.this.Hf();
            }
        });
    }

    @Override
    public void e6(TdApi.StickerSetInfo stickerSetInfo) {
        p1.f(this, stickerSetInfo);
    }

    @Override
    public void e9() {
        super.e9();
        this.f9954o0.setFloatingButton(null);
    }

    public final void eg(boolean z10) {
        int i10 = z10 ? 3 : 2;
        jb.c cVar = new jb.c(i10);
        jb.c cVar2 = new jb.c(i10);
        ie.u0 u0Var = new ie.u0(i10);
        cVar.a(R.id.btn_sourceCode);
        u0Var.a(R.string.SourceCode);
        cVar2.a(R.drawable.baseline_code_24);
        cVar.a(R.id.btn_copyText);
        u0Var.a(R.string.CopyVersion);
        cVar2.a(R.drawable.baseline_content_copy_24);
        if (z10) {
            cVar.a(R.id.btn_copyDebug);
            u0Var.a(R.string.CopyReportData);
            cVar2.a(R.drawable.baseline_content_copy_24);
            cVar.a(R.id.btn_tdlib);
            u0Var.a(R.string.TdlibLogs);
            cVar2.a(R.drawable.baseline_build_24);
            cVar.a(R.id.btn_build);
            u0Var.a(R.string.AppLogs);
            cVar2.a(R.drawable.baseline_build_24);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(w.I0(this, R.string.AppSignature, "0.24.8.1519-arm64-v8a"));
        spannableStringBuilder.append('\n').append(w.I0(this, R.string.CommitSignature, "7d1fbd0d", "https://github.com/TGX-Android/Telegram-X/tree/7d1fbd0d90345d283c373abe680c038b80701dc2"));
        spannableStringBuilder.append('\n').append(w.I0(this, R.string.CreatedOn, w.y1(1653327259L, TimeUnit.SECONDS)));
        ee(spannableStringBuilder, cVar.e(), u0Var.d(), null, cVar2.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i11) {
                return g0.b(this, i11);
            }

            @Override
            public final boolean r3(View view, int i11) {
                boolean Qf;
                Qf = wt.this.Qf(view, i11);
                return Qf;
            }
        });
    }

    public final void fg(final TdApi.SuggestedAction suggestedAction) {
        String str;
        String i12;
        jb.c cVar = new jb.c(3);
        ie.u0 u0Var = new ie.u0(3);
        jb.c cVar2 = new jb.c(3);
        jb.c cVar3 = new jb.c(3);
        int constructor = suggestedAction.getConstructor();
        if (constructor == 648771563) {
            i12 = w.i1(R.string.ReminderCheckPhoneNumberDescription);
            cVar.a(R.id.btn_changePhoneNumber);
            u0Var.a(R.string.ReminderActionChangePhoneNumber);
            cVar2.a(1);
            cVar3.a(R.drawable.baseline_edit_24);
            cVar.a(R.id.btn_cancel);
            u0Var.b(w.j1(R.string.ReminderCheckPhoneNumberHide, this.B0));
            cVar2.a(1);
            cVar3.a(R.drawable.baseline_check_24);
            cVar.a(R.id.btn_info);
            u0Var.a(R.string.ReminderActionLearnMore);
            cVar2.a(1);
            cVar3.a(R.drawable.baseline_info_24);
        } else if (constructor != 1910534839) {
            i12 = null;
        } else {
            String i13 = w.i1(R.string.ReminderCheckTfaPasswordDescription);
            cVar.a(R.id.btn_2fa);
            u0Var.a(R.string.ReminderActionVerifyPassword);
            cVar2.a(3);
            cVar3.a(R.drawable.mrgrigri_baseline_textbox_password_24);
            cVar.a(R.id.btn_cancel);
            u0Var.a(R.string.ReminderCheckTfaPasswordHide);
            cVar2.a(1);
            cVar3.a(R.drawable.baseline_cancel_24);
            str = i13;
            ee(str, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view, int i10) {
                    boolean Tf;
                    Tf = wt.this.Tf(suggestedAction, view, i10);
                    return Tf;
                }
            });
        }
        str = i12;
        ee(str, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Tf;
                Tf = wt.this.Tf(suggestedAction, view, i10);
                return Tf;
            }
        });
    }

    public final void gg() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            ud.b backButton = d1Var.getBackButton();
            int j02 = ae.j.j0();
            m mVar = this.f9953n0;
            backButton.setColor(d.d(j02, -1, mVar != null ? mVar.getAvatarExpandFactor() : 0.0f));
            this.R.a4(W9(), this, Da());
        }
    }

    @Override
    public void h(long[] jArr, boolean z10) {
        if (!z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    wt.this.Jf();
                }
            });
        }
    }

    @Override
    public void h1(o6 o6Var, boolean z10) {
        wd(new Runnable() {
            @Override
            public final void run() {
                wt.this.Vf();
            }
        });
    }

    public final void hg() {
        TdApi.User da2 = this.f24495b.da();
        if (this.f9953n0 != null) {
            if (da2 == null || t2.u3(da2.profilePhoto)) {
                this.f9953n0.setAvatarPlaceholder(this.f24495b.e2().K2(this.f24495b.fa(), da2, false, m.getBaseAvatarRadiusDp(), null));
            } else {
                this.f9953n0.setAvatar(da2.profilePhoto);
            }
            this.f9953n0.T1(da2 != null ? t2.r2(da2) : w.i1(R.string.LoadingUser), Af());
            this.f9953n0.invalidate();
        }
    }

    public final void ig() {
        this.f24495b.hd().E7(this, "https://play.google.com/store/apps/details?id=org.thunderdog.challegram", new hj.q().e());
    }

    public final void jg() {
        this.f24495b.hd().E7(this, "https://github.com/TGX-Android/Telegram-X/tree/7d1fbd0d90345d283c373abe680c038b80701dc2", new hj.q().e());
    }

    @Override
    public void k2(final TdApi.User user) {
        if (user != null) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    wt.this.Kf(user);
                }
            });
        }
    }

    @Override
    public void kc() {
        super.kc();
        this.f9954o0.setFactorLocked(true);
        uf();
    }

    @Override
    public void o6() {
        super.o6();
        wf(true);
    }

    @Override
    public View oc(Context context) {
        TdApi.SuggestedAction[] i62;
        m mVar = new m(context, this.f24495b, this);
        this.f9953n0 = mVar;
        mVar.setAvatarExpandListener(new m.b() {
            @Override
            public final void a(m mVar2, float f10, boolean z10, float f11, float f12) {
                wt.this.If(mVar2, f10, z10, f11, f12);
            }
        });
        this.f9953n0.K1();
        this.f9953n0.s1(this, true);
        this.f9953n0.R1(a0.i(56.0f), a0.i(49.0f));
        this.f9953n0.setPhotoOpenCallback(this);
        hg();
        Bf();
        n nVar = new n(context, this);
        this.f9954o0 = nVar;
        nVar.setHasFixedSize(true);
        this.f9954o0.Q1(this.f9953n0, this);
        this.f9954o0.setItemAnimator(null);
        yd.g.i(this.f9954o0, R.id.theme_color_background, this);
        this.f9954o0.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.f9954o0.setLayoutParams(FrameLayoutFix.q1(-1, -1));
        a aVar = new a(this);
        this.f9955p0 = aVar;
        aVar.B2(this);
        List<ra> D0 = this.f9955p0.D0();
        ib.b.m(D0, 27);
        D0.add(new ra(0));
        D0.add(new ra(6, R.id.btn_username, R.drawable.baseline_alternate_email_24, R.string.Username).F(R.string.LoadingUsername, R.string.SetUpUsername));
        D0.add(new ra(1));
        D0.add(new ra(6, R.id.btn_phone, R.drawable.baseline_phone_24, R.string.Phone));
        D0.add(new ra(1));
        D0.add(new ra(37, R.id.btn_bio, R.drawable.baseline_info_24, R.string.UserBio).F(R.string.LoadingInformation, R.string.BioNone));
        D0.add(new ra(3));
        int i10 = 0;
        for (TdApi.SuggestedAction suggestedAction : this.f24495b.i6()) {
            if (this.f24495b.q7(suggestedAction)) {
                D0.add(new ra(i10 == 0 ? 2 : 1));
                int constructor = suggestedAction.getConstructor();
                if (constructor == 648771563) {
                    D0.add(new ra(37, R.id.btn_changePhoneNumber, R.drawable.baseline_sim_card_alert_24, R.string.ReminderCheckPhoneNumber));
                } else if (constructor == 1910534839) {
                    D0.add(new ra(37, R.id.btn_2fa, R.drawable.baseline_gpp_maybe_24, R.string.ReminderCheckTfaPassword));
                }
                i10++;
            }
        }
        if (i10 > 0) {
            D0.add(new ra(3));
        }
        D0.add(new ra(2));
        D0.add(new ra(89, R.id.btn_devices, R.drawable.baseline_devices_other_24, R.string.Devices));
        D0.add(new ra(1));
        wf(false);
        D0.add(new ra(this.f9960u0 != 0 ? 89 : 4, R.id.btn_notificationSettings, R.drawable.baseline_notifications_24, R.string.Notifications));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_chatSettings, R.drawable.baseline_data_usage_24, R.string.DataSettings));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_privacySettings, R.drawable.baseline_lock_24, R.string.PrivacySettings));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_themeSettings, R.drawable.baseline_palette_24, R.string.ThemeSettings));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_tweakSettings, R.drawable.baseline_extension_24, R.string.TweakSettings));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_stickerSettings, R.drawable.deproko_baseline_stickers_filled_24, R.string.Stickers));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_languageSettings, R.drawable.baseline_language_24, R.string.Language));
        D0.add(new ra(3));
        D0.add(new ra(2));
        D0.add(new ra(4, R.id.btn_help, R.drawable.baseline_live_help_24, R.string.AskAQuestion));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_faq, R.drawable.baseline_help_24, R.string.TelegramFAQ));
        D0.add(new ra(1));
        D0.add(new ra(4, R.id.btn_privacyPolicy, R.drawable.baseline_policy_24, R.string.PrivacyPolicy));
        D0.add(new ra(3));
        D0.add(new ra(2));
        D0.add(new ra(4, R.id.btn_checkUpdates, R.drawable.baseline_google_play_24, v0.f1() ? R.string.AppOnGooglePlay : R.string.CheckForUpdates));
        D0.add(new ra(1));
        if (!v0.f1()) {
            D0.add(new ra(4, R.id.btn_subscribeToBeta, R.drawable.templarian_baseline_flask_24, R.string.SubscribeToBeta));
            D0.add(new ra(1));
        }
        D0.add(new ra(89, R.id.btn_sourceCode, R.drawable.baseline_github_24, R.string.ViewSourceCode));
        D0.add(new ra(3));
        D0.add(new ra(10, (int) R.id.btn_build, 0, (CharSequence) w.X(this.f24495b), false));
        Yf(this.f24495b.ea());
        this.f9954o0.setAdapter(this.f9955p0);
        this.f24495b.e2().J(this);
        this.f24495b.O9().e0(this);
        this.f24495b.O9().i0(this);
        t1.b().a(this.f9955p0);
        Vf();
        return this.f9954o0;
    }

    @Override
    public void onClick(View view) {
        uf();
        if (!this.f24495b.hd().t3(this, view, view.getId(), this.f24495b.da(), true)) {
            switch (view.getId()) {
                case R.id.btn_2fa:
                    fg(new TdApi.SuggestedActionCheckPassword());
                    return;
                case R.id.btn_bio:
                    m6 m6Var = new m6(this.f24493a, this.f24495b);
                    m6Var.wf(new m6.b(this.C0, 0L));
                    ac(m6Var);
                    return;
                case R.id.btn_build:
                    if (he.i.c2().W1()) {
                        eg(true);
                        return;
                    } else {
                        this.f24495b.j6(new k() {
                            @Override
                            public final void a(int i10) {
                                wt.this.Gf(i10);
                            }
                        });
                        return;
                    }
                case R.id.btn_changePhoneNumber:
                    fg(new TdApi.SuggestedActionCheckPhoneNumber());
                    return;
                case R.id.btn_chatSettings:
                    ac(new cu(this.f24493a, this.f24495b));
                    return;
                case R.id.btn_checkUpdates:
                    ig();
                    return;
                case R.id.btn_devices:
                    ac(new dy(this.f24493a, this.f24495b));
                    return;
                case R.id.btn_faq:
                    this.f24495b.hd().E7(this, w.i1(R.string.url_faq), new hj.q().i());
                    return;
                case R.id.btn_help:
                    this.f9957r0 = this.f24495b.hd().C7(this);
                    return;
                case R.id.btn_languageSettings:
                    ac(new fv(this.f24493a, this.f24495b));
                    return;
                case R.id.btn_notificationSettings:
                    ac(new fw(this.f24493a, this.f24495b));
                    return;
                case R.id.btn_privacyPolicy:
                    this.f24495b.hd().E7(this, w.u1(R.string.url_privacyPolicy, new Object[0]), new hj.q().i());
                    return;
                case R.id.btn_privacySettings:
                    ac(new ww(this.f24493a, this.f24495b));
                    return;
                case R.id.btn_sourceCode:
                    jg();
                    return;
                case R.id.btn_stickerSettings:
                    ey eyVar = new ey(this.f24493a, this.f24495b);
                    eyVar.xg(this);
                    ac(eyVar);
                    return;
                case R.id.btn_subscribeToBeta:
                    this.f24495b.hd().U8(this);
                    return;
                case R.id.btn_themeSettings:
                    ac(new fz(this.f24493a, this.f24495b));
                    return;
                case R.id.btn_tweakSettings:
                    fz fzVar = new fz(this.f24493a, this.f24495b);
                    fzVar.Wh(new fz.c(1));
                    ac(fzVar);
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
        eg(true);
        return true;
    }

    @Override
    public void r0(o6 o6Var, int i10) {
        n1.b(this, o6Var, i10);
    }

    @Override
    public void r2(TdApi.Object object) {
        if (object.getConstructor() != -1679978726) {
            Log.unexpectedTdlibResponse(object, TdApi.GetUserFullInfo.class, TdApi.UserFullInfo.class, TdApi.Error.class);
        } else {
            j0.t0(object);
        }
    }

    @Override
    public boolean r3(View view, int i10) {
        return this.f24495b.hd().v3(this, i10, this.f24495b.da());
    }

    @Override
    public void r7(o6 o6Var, TdApi.Session session) {
        n1.d(this, o6Var, session);
    }

    @Override
    public void rc() {
        a7 a7Var = new a7(this.f24493a, this.f24495b);
        a7Var.uf(1);
        ac(a7Var);
    }

    @Override
    public void sc() {
        super.sc();
        this.f9954o0.setFactorLocked(false);
        Xf();
        if (!this.f9956q0) {
            this.f9956q0 = true;
            this.f24495b.O9().l0(this);
        }
    }

    @Override
    public void u(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            this.f24495b.hd().q3(i10, intent, null);
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_more_settings) {
            d1Var.a2(linearLayout, this);
        }
    }

    public final void uf() {
        kb.b bVar = this.f9957r0;
        if (bVar != null) {
            bVar.c();
            this.f9957r0 = null;
        }
    }

    public final void vf() {
        TdApi.ProfilePhoto profilePhoto;
        jb.c cVar = new jb.c(4);
        ie.u0 u0Var = new ie.u0(4);
        jb.c cVar2 = new jb.c(4);
        jb.c cVar3 = new jb.c(4);
        final TdApi.User da2 = this.f24495b.da();
        if (!(da2 == null || da2.profilePhoto == null)) {
            cVar.a(R.id.btn_open);
            u0Var.a(R.string.Open);
            cVar3.a(R.drawable.baseline_visibility_24);
            cVar2.a(1);
        }
        cVar.a(R.id.btn_changePhotoCamera);
        u0Var.a(R.string.ChatCamera);
        cVar3.a(R.drawable.baseline_camera_alt_24);
        cVar2.a(1);
        cVar.a(R.id.btn_changePhotoGallery);
        u0Var.a(R.string.Gallery);
        cVar3.a(R.drawable.baseline_image_24);
        cVar2.a(1);
        final long j10 = (da2 == null || (profilePhoto = da2.profilePhoto) == null) ? 0L : profilePhoto.f19955id;
        if (!(da2 == null || da2.profilePhoto == null)) {
            cVar.a(R.id.btn_changePhotoDelete);
            u0Var.a(R.string.Delete);
            cVar3.a(R.drawable.baseline_delete_24);
            cVar2.a(2);
        }
        ee(null, cVar.e(), u0Var.d(), cVar2.e(), cVar3.e(), new h0() {
            @Override
            public boolean P() {
                return g0.a(this);
            }

            @Override
            public Object a2(int i10) {
                return g0.b(this, i10);
            }

            @Override
            public final boolean r3(View view, int i10) {
                boolean Cf;
                Cf = wt.this.Cf(da2, j10, view, i10);
                return Cf;
            }
        });
    }

    public final void wf(boolean z10) {
        iq iqVar;
        int L0;
        long j10 = this.f9961v0;
        boolean X0 = this.f24495b.ka().X0();
        boolean z11 = false;
        int yf = X0 ? yf() : 0;
        int i10 = this.f9960u0;
        boolean z12 = i10 != 0;
        if (yf != 0) {
            z11 = true;
        }
        if (this.f9959t0 != X0 || (X0 && !(i10 == yf && this.f9961v0 == j10))) {
            this.f9959t0 = X0;
            this.f9960u0 = yf;
            if (z10 && (iqVar = this.f9955p0) != null && (L0 = iqVar.L0(R.id.btn_notificationSettings)) != -1) {
                ra raVar = this.f9955p0.D0().get(L0);
                if (z12 != z11) {
                    raVar.f0(z11 ? 89 : 4);
                    this.f9955p0.I(L0);
                    return;
                }
                this.f9955p0.r3(L0);
                return;
            }
            return;
        }
        this.f9960u0 = yf;
    }

    public final void xf(TdApi.SuggestedAction suggestedAction) {
        int i10;
        if (this.f24495b.q7(suggestedAction)) {
            int constructor = suggestedAction.getConstructor();
            if (constructor == 648771563) {
                i10 = this.f9955p0.L0(R.id.btn_changePhoneNumber);
            } else if (constructor == 1910534839) {
                i10 = this.f9955p0.L0(R.id.btn_2fa);
            } else {
                return;
            }
            if (i10 != -1) {
                int i11 = i10 - 1;
                ra C0 = this.f9955p0.C0(i11);
                ra C02 = this.f9955p0.C0(i10 + 1);
                if (C02 != null && C0 != null) {
                    int A = C0.A();
                    int A2 = C02.A();
                    if (A2 == 1) {
                        this.f9955p0.R1(i10, 2);
                    } else if (A2 == 3) {
                        if (A == 2) {
                            this.f9955p0.R1(i11, 3);
                        } else if (A == 1) {
                            this.f9955p0.R1(i11, 2);
                        }
                    }
                    this.f24495b.v4().o(new TdApi.HideSuggestedAction(suggestedAction), this.f24495b.na());
                }
            }
        }
    }

    @Override
    public void y0(TdApi.StickerSetInfo stickerSetInfo) {
        p1.e(this, stickerSetInfo);
    }

    @Override
    public long y9(boolean z10) {
        return 400L;
    }

    public final int yf() {
        this.f9961v0 = 0L;
        switch (this.f24495b.ka().G0()) {
            case 1:
                return R.string.NotificationsErrorBlockedCategory;
            case 2:
                return R.string.NotificationsErrorBlocked;
            case 3:
            case 4:
            case 5:
                return R.string.NotificationsErrorBackground;
            case 6:
                long v10 = this.f24495b.tc().v();
                this.f9961v0 = v10;
                return (v10 == 0 || this.f24495b.R3(v10) == null) ? R.string.NotificationsErrorError : R.string.NotificationsErrorErrorChat;
            case 7:
                return R.string.NotificationsErrorUnselected;
            default:
                boolean C = this.f24495b.ka().C(this.f24495b.ka().n2());
                boolean C2 = this.f24495b.ka().C(this.f24495b.ka().m2());
                boolean C3 = this.f24495b.ka().C(this.f24495b.ka().l2());
                int i10 = C2 ? (C ? 1 : 0) + 1 : C ? 1 : 0;
                if (C3) {
                    i10++;
                }
                if (i10 == 1) {
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
                } else if (i10 > 1) {
                    return R.string.NotificationsErrorBlockedMixed;
                } else {
                    return 0;
                }
        }
    }

    @Override
    public void z4(int[] iArr, boolean z10) {
    }

    public ArrayList<v6> zf() {
        return this.D0;
    }
}
