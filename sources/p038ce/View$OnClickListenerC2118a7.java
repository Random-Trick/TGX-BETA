package p038ce;

import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import be.C1363c0;
import be.C1379j0;
import gd.C4601c3;
import gd.C4779t2;
import java.util.ArrayList;
import me.C6981o;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p038ce.AbstractC2420g6;
import p038ce.C2546iq;
import p082fd.C4403w;
import p108hb.C5070i;
import p350yd.C10930q6;
import p350yd.C11059v7;
import td.AbstractC9323v4;

public class View$OnClickListenerC2118a7 extends AbstractC2420g6<C2120b> implements C2546iq.AbstractC2551e, Client.AbstractC7865g, C11059v7.AbstractC11068i, View.OnClickListener {
    public C2964ra f7481A0;
    public C2964ra f7482B0;
    public int f7483v0;
    public TdApi.User f7484w0;
    public String f7485x0;
    public C2546iq f7486y0;
    public C2964ra f7487z0;

    public class C2119a extends C2546iq {
        public C2119a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo9531c2(C2964ra raVar, int i, C6981o oVar) {
            oVar.setChat((C4601c3) raVar.m32847d());
            oVar.setEnabled(false);
        }

        @Override
        public void mo30692v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            y1Var.getEditText().setInputType(8288);
        }
    }

    public static class C2120b {
        public int f7489a;
        public TdApi.AuthorizationStateWaitRegistration f7490b;
        public String f7491c;
        public String f7492d;

        public C2120b(int i, TdApi.AuthorizationStateWaitRegistration authorizationStateWaitRegistration, String str) {
            this.f7489a = i;
            this.f7490b = authorizationStateWaitRegistration;
            this.f7491c = str;
        }
    }

    public View$OnClickListenerC2118a7(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public void m35527of(String str, String str2, DialogInterface dialogInterface, int i) {
        m34629ff(true);
        this.f30170b.m2270r4().m14783o(new TdApi.RegisterUser(str, str2), this);
    }

    public void m35526pf(TdApi.Object object) {
        if (!m9347Sa()) {
            m34629ff(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C1379j0.m37305t0(object);
            } else if (constructor != -722616727 && constructor != 2068432290) {
            } else {
                if (this.f7483v0 == 0) {
                    mo9397La();
                } else {
                    m34632cf();
                }
            }
        }
    }

    public void m35525qf(long j, TdApi.UserFullInfo userFullInfo) {
        C2546iq iqVar;
        TdApi.User user;
        if (m9347Sa() && (iqVar = this.f7486y0) != null && this.f7483v0 == 3 && (user = this.f7484w0) != null && j == user.f25442id) {
            if (!userFullInfo.needPhoneNumberPrivacyException) {
                iqVar.m34147o1(R.id.btn_shareMyContact);
                this.f7482B0 = null;
            } else if (iqVar.m34115z0(R.id.btn_shareMyContact) == null) {
                C2546iq iqVar2 = this.f7486y0;
                int D = iqVar2.mo6153D();
                C2964ra rf = m35524rf();
                this.f7482B0 = rf;
                iqVar2.m34132t0(D, rf);
            }
        }
    }

    @Override
    public void mo30700K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        switch (i) {
            case R.id.edit_first_name:
                this.f7487z0.m32850b0(str);
                m35519wf();
                return;
            case R.id.edit_last_name:
                this.f7481A0.m32850b0(str);
                m35519wf();
                return;
            default:
                return;
        }
    }

    @Override
    public void mo1348P1(TdApi.User user) {
    }

    @Override
    public int mo407R9() {
        return R.id.controller_name;
    }

    @Override
    public CharSequence mo9313X9() {
        int i = this.f7483v0;
        if (i == 0) {
            return C4403w.m27871i1(R.string.Registration);
        }
        if (i == 1) {
            return C4403w.m27871i1(R.string.EditName);
        }
        if (i != 2) {
            return i != 3 ? "" : C4403w.m27871i1(R.string.AddContact);
        }
        return C4403w.m27871i1(R.string.RenameContact);
    }

    @Override
    public void mo417Z8() {
        super.mo417Z8();
        if (this.f7483v0 == 3) {
            this.f30170b.m2480e2().m1702P1(this.f7484w0.f25442id, this);
        }
    }

    @Override
    public void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        TdApi.User user;
        String str;
        String str2;
        int i;
        String str3;
        C2119a aVar = new C2119a(this);
        this.f7486y0 = aVar;
        aVar.m34253A2(this, true);
        this.f7486y0.m34214S2(this);
        int i2 = this.f7483v0;
        TdApi.TermsOfService termsOfService = null;
        if (i2 != 1) {
            user = (i2 == 2 || i2 == 3) ? this.f7484w0 : null;
        } else {
            user = this.f30170b.m2550Z9();
        }
        if (user != null) {
            str2 = user.firstName;
            str = user.lastName;
            mo31399hf(m35528nf(str2, str));
        } else {
            str2 = "";
            if (this.f7483v0 != 0 || !C1379j0.m37361J()) {
                str = str2;
            } else {
                str2 = "Robot #" + this.f30170b.m2624Ua();
                str = str2;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i3 = this.f7483v0;
        if ((i3 == 2 || i3 == 3) && user != null) {
            C2964ra raVar = new C2964ra(57);
            C4601c3 c3Var = new C4601c3(this.f30170b, user.f25442id);
            if (!C5070i.m24062i(this.f7485x0)) {
                str3 = C1363c0.m37413w(this.f7485x0);
            } else if (C4779t2.m25729A2(user)) {
                str3 = C1363c0.m37413w(user.phoneNumber);
            } else {
                str3 = C4403w.m27871i1(R.string.NumberHidden);
            }
            arrayList.add(raVar.m32873G(c3Var.m27065B(str3)));
        }
        C2964ra L = new C2964ra(arrayList.isEmpty() ? 31 : 34, R.id.edit_first_name, 0, R.string.login_FirstName).m32850b0(str2).m32868L(new InputFilter[]{new InputFilter.LengthFilter(64)});
        this.f7487z0 = L;
        arrayList.add(L);
        int i4 = this.f7483v0;
        C2964ra P = new C2964ra(34, R.id.edit_last_name, 0, (i4 == 2 || i4 == 3) ? R.string.LastName : R.string.login_LastName).m32850b0(str).m32868L(new InputFilter[]{new InputFilter.LengthFilter(64)}).m32864P(new AbstractC2420g6.C2421a(6, this));
        this.f7481A0 = P;
        arrayList.add(P);
        if (this.f7483v0 == 0) {
            termsOfService = m9131x9().f7490b.termsOfService;
        }
        if (!(termsOfService == null || (i = termsOfService.minUserAge) == 0)) {
            arrayList.add(new C2964ra(9, 0, 0, (CharSequence) C4403w.m27846o2(R.string.AgeVerification, i), false));
        }
        int i5 = this.f7483v0;
        if ((i5 == 2 || i5 == 3) && user != null) {
            if (C5070i.m24062i(this.f7485x0) && !C4779t2.m25729A2(user)) {
                arrayList.add(new C2964ra(9, 0, 0, C4403w.m27855m1(R.string.NumberHiddenHint, this.f30170b.m2480e2().m1721K2(user.f25442id)), false));
            }
            this.f30170b.m2480e2().m1720L(user.f25442id, this);
            TdApi.UserFullInfo E2 = this.f30170b.m2480e2().m1745E2(user.f25442id);
            if (E2 != null && E2.needPhoneNumberPrivacyException) {
                C2964ra rf = m35524rf();
                this.f7482B0 = rf;
                arrayList.add(rf);
            }
        }
        this.f7486y0.m34119x2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.f7486y0);
        m34631df(this.f7483v0 == 0 ? R.drawable.baseline_arrow_forward_24 : R.drawable.baseline_check_24);
    }

    @Override
    public boolean mo30698af() {
        final String trim = this.f7487z0.m32824x().trim();
        final String trim2 = this.f7481A0.m32824x().trim();
        if (m35528nf(trim, trim2)) {
            int i = this.f7483v0;
            if (i == 0) {
                TdApi.FormattedText formattedText = m9131x9().f7490b.termsOfService.text;
                m9439Fc(R.string.TermsOfService, C4779t2.m25398x0(this, formattedText.text, formattedText.entities, null, null), C4403w.m27871i1(R.string.TermsOfServiceDone), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        View$OnClickListenerC2118a7.this.m35527of(trim, trim2, dialogInterface, i2);
                    }
                }, 6);
            } else if (i == 1) {
                m34629ff(true);
                this.f30170b.m2270r4().m14783o(new TdApi.SetName(trim, trim2), this);
            } else if ((i == 2 || i == 3) && this.f7484w0 != null) {
                m34629ff(true);
                TdApi.Contact contact = new TdApi.Contact(!C5070i.m24062i(this.f7485x0) ? this.f7485x0 : this.f7484w0.phoneNumber, trim, trim2, null, this.f7484w0.f25442id);
                Client r4 = this.f30170b.m2270r4();
                C2964ra raVar = this.f7482B0;
                r4.m14783o(new TdApi.AddContact(contact, raVar != null && raVar.m32876D()), this);
            }
        }
        return true;
    }

    @Override
    public boolean mo9271db() {
        return this.f7483v0 == 0;
    }

    public final boolean m35528nf(String str, String str2) {
        if (!C5070i.m24062i(str)) {
            return true;
        }
        if (C5070i.m24062i(str2)) {
            return false;
        }
        int i = this.f7483v0;
        return i == 1 || i == 2 || i == 3;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_shareMyContact) {
            this.f7482B0.m32861S(this.f7486y0.m34204W2(view));
        }
    }

    public final C2964ra m35524rf() {
        return new C2964ra(77, (int) R.id.btn_shareMyContact, 0, C4403w.m27855m1(R.string.ShareMyNumber, this.f30170b.m2480e2().m1721K2(this.f7484w0.f25442id)), true);
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (this.f7483v0 == 0) {
            m9221kd();
            m9280c9(R.id.controller_code);
            if (C1379j0.m37361J()) {
                m35519wf();
                C1379j0.m37337d0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2118a7.this.mo30698af();
                    }
                });
            }
        }
    }

    public void m35523sf(C2120b bVar) {
        super.m9476Ad(bVar);
        this.f7483v0 = bVar.f7489a;
        this.f7485x0 = bVar.f7492d;
    }

    @Override
    public void mo255t2(final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2118a7.this.m35526pf(object);
            }
        });
    }

    public void m35522tf(String str) {
        this.f7485x0 = str;
    }

    @Override
    public void mo1335u7(final long j, final TdApi.UserFullInfo userFullInfo) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2118a7.this.m35525qf(j, userFullInfo);
            }
        });
    }

    public void m35521uf(int i) {
        this.f7483v0 = i;
    }

    public void m35520vf(TdApi.User user) {
        this.f7484w0 = user;
    }

    public final void m35519wf() {
        mo31399hf(m35528nf(this.f7487z0.m32824x().trim(), this.f7481A0.m32824x().trim()));
    }
}
