package de;

import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ce.c0;
import ce.j0;
import de.g6;
import de.iq;
import gd.w;
import hd.c3;
import hd.t2;
import ib.i;
import java.util.ArrayList;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.o;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.v4;
import zd.o6;
import zd.t7;

public class a7 extends g6<b> implements iq.e, Client.g, t7.i, View.OnClickListener {
    public ra A0;
    public ra B0;
    public int f7439v0;
    public TdApi.User f7440w0;
    public String f7441x0;
    public iq f7442y0;
    public ra f7443z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void Y1(ra raVar, int i10, o oVar) {
            oVar.setChat((c3) raVar.d());
            oVar.setEnabled(false);
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            y1Var.getEditText().setInputType(8288);
        }
    }

    public static class b {
        public int f7445a;
        public TdApi.AuthorizationStateWaitRegistration f7446b;
        public String f7447c;
        public String f7448d;

        public b(int i10, TdApi.AuthorizationStateWaitRegistration authorizationStateWaitRegistration, String str) {
            this.f7445a = i10;
            this.f7446b = authorizationStateWaitRegistration;
            this.f7447c = str;
        }
    }

    public a7(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void of(String str, String str2, DialogInterface dialogInterface, int i10) {
        ff(true);
        this.f24495b.v4().o(new TdApi.RegisterUser(str, str2), this);
    }

    public void pf(TdApi.Object object) {
        if (!Sa()) {
            ff(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                j0.t0(object);
            } else if (constructor != -722616727 && constructor != 2068432290) {
            } else {
                if (this.f7439v0 == 0) {
                    La();
                } else {
                    cf();
                }
            }
        }
    }

    public void qf(long j10, TdApi.UserFullInfo userFullInfo) {
        iq iqVar;
        TdApi.User user;
        if (Sa() && (iqVar = this.f7442y0) != null && this.f7439v0 == 3 && (user = this.f7440w0) != null && j10 == user.f19979id) {
            if (!userFullInfo.needPhoneNumberPrivacyException) {
                iqVar.k1(R.id.btn_shareMyContact);
                this.B0 = null;
            } else if (iqVar.x0(R.id.btn_shareMyContact) == null) {
                iq iqVar2 = this.f7442y0;
                int D = iqVar2.D();
                ra rf = rf();
                this.B0 = rf;
                iqVar2.s0(D, rf);
            }
        }
    }

    @Override
    public void M1(TdApi.User user) {
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        switch (i10) {
            case R.id.edit_first_name:
                this.f7443z0.b0(str);
                wf();
                return;
            case R.id.edit_last_name:
                this.A0.b0(str);
                wf();
                return;
            default:
                return;
        }
    }

    @Override
    public int R9() {
        return R.id.controller_name;
    }

    @Override
    public CharSequence X9() {
        int i10 = this.f7439v0;
        if (i10 == 0) {
            return w.i1(R.string.Registration);
        }
        if (i10 == 1) {
            return w.i1(R.string.EditName);
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : w.i1(R.string.AddContact);
        }
        return w.i1(R.string.RenameContact);
    }

    @Override
    public void Z8() {
        super.Z8();
        if (this.f7439v0 == 3) {
            this.f24495b.e2().N1(this.f7440w0.f19979id, this);
        }
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        TdApi.User user;
        String str;
        String str2;
        int i10;
        String str3;
        a aVar = new a(this);
        this.f7442y0 = aVar;
        aVar.v2(this, true);
        this.f7442y0.O2(this);
        int i11 = this.f7439v0;
        TdApi.TermsOfService termsOfService = null;
        if (i11 != 1) {
            user = (i11 == 2 || i11 == 3) ? this.f7440w0 : null;
        } else {
            user = this.f24495b.da();
        }
        if (user != null) {
            str2 = user.firstName;
            str = user.lastName;
            hf(nf(str2, str));
        } else {
            str2 = "";
            if (this.f7439v0 != 0 || !j0.J()) {
                str = str2;
            } else {
                str2 = "Robot #" + this.f24495b.Ya();
                str = str2;
            }
        }
        ArrayList arrayList = new ArrayList();
        int i12 = this.f7439v0;
        if ((i12 == 2 || i12 == 3) && user != null) {
            ra raVar = new ra(57);
            c3 c3Var = new c3(this.f24495b, user.f19979id);
            if (!i.i(this.f7441x0)) {
                str3 = c0.w(this.f7441x0);
            } else if (t2.A2(user)) {
                str3 = c0.w(user.phoneNumber);
            } else {
                str3 = w.i1(R.string.NumberHidden);
            }
            arrayList.add(raVar.G(c3Var.B(str3)));
        }
        ra L = new ra(arrayList.isEmpty() ? 31 : 34, R.id.edit_first_name, 0, R.string.login_FirstName).b0(str2).L(new InputFilter[]{new InputFilter.LengthFilter(64)});
        this.f7443z0 = L;
        arrayList.add(L);
        int i13 = this.f7439v0;
        ra P = new ra(34, R.id.edit_last_name, 0, (i13 == 2 || i13 == 3) ? R.string.LastName : R.string.login_LastName).b0(str).L(new InputFilter[]{new InputFilter.LengthFilter(64)}).P(new g6.a(6, this));
        this.A0 = P;
        arrayList.add(P);
        if (this.f7439v0 == 0) {
            termsOfService = x9().f7446b.termsOfService;
        }
        if (!(termsOfService == null || (i10 = termsOfService.minUserAge) == 0)) {
            arrayList.add(new ra(9, 0, 0, (CharSequence) w.o2(R.string.AgeVerification, i10), false));
        }
        int i14 = this.f7439v0;
        if ((i14 == 2 || i14 == 3) && user != null) {
            if (i.i(this.f7441x0) && !t2.A2(user)) {
                arrayList.add(new ra(9, 0, 0, w.m1(R.string.NumberHiddenHint, this.f24495b.e2().J2(user.f19979id)), false));
            }
            this.f24495b.e2().L(user.f19979id, this);
            TdApi.UserFullInfo D2 = this.f24495b.e2().D2(user.f19979id);
            if (D2 != null && D2.needPhoneNumberPrivacyException) {
                ra rf = rf();
                this.B0 = rf;
                arrayList.add(rf);
            }
        }
        this.f7442y0.s2(arrayList, false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setAdapter(this.f7442y0);
        df(this.f7439v0 == 0 ? R.drawable.baseline_arrow_forward_24 : R.drawable.baseline_check_24);
    }

    @Override
    public boolean af() {
        final String trim = this.f7443z0.x().trim();
        final String trim2 = this.A0.x().trim();
        if (nf(trim, trim2)) {
            int i10 = this.f7439v0;
            if (i10 == 0) {
                TdApi.FormattedText formattedText = x9().f7446b.termsOfService.text;
                Fc(R.string.TermsOfService, t2.x0(this, formattedText.text, formattedText.entities, null, null), w.i1(R.string.TermsOfServiceDone), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        a7.this.of(trim, trim2, dialogInterface, i11);
                    }
                }, 6);
            } else if (i10 == 1) {
                ff(true);
                this.f24495b.v4().o(new TdApi.SetName(trim, trim2), this);
            } else if ((i10 == 2 || i10 == 3) && this.f7440w0 != null) {
                ff(true);
                TdApi.Contact contact = new TdApi.Contact(!i.i(this.f7441x0) ? this.f7441x0 : this.f7440w0.phoneNumber, trim, trim2, null, this.f7440w0.f19979id);
                Client v42 = this.f24495b.v4();
                ra raVar = this.B0;
                v42.o(new TdApi.AddContact(contact, raVar != null && raVar.D()), this);
            }
        }
        return true;
    }

    @Override
    public boolean db() {
        return this.f7439v0 == 0;
    }

    public final boolean nf(String str, String str2) {
        if (!i.i(str)) {
            return true;
        }
        if (i.i(str2)) {
            return false;
        }
        int i10 = this.f7439v0;
        return i10 == 1 || i10 == 2 || i10 == 3;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_shareMyContact) {
            this.B0.S(this.f7442y0.S2(view));
        }
    }

    @Override
    public void r2(final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                a7.this.pf(object);
            }
        });
    }

    public final ra rf() {
        return new ra(77, (int) R.id.btn_shareMyContact, 0, w.m1(R.string.ShareMyNumber, this.f24495b.e2().J2(this.f7440w0.f19979id)), true);
    }

    @Override
    public void sc() {
        super.sc();
        if (this.f7439v0 == 0) {
            kd();
            c9(R.id.controller_code);
            if (j0.J()) {
                wf();
                j0.d0(new Runnable() {
                    @Override
                    public final void run() {
                        a7.this.af();
                    }
                });
            }
        }
    }

    public void sf(b bVar) {
        super.Ad(bVar);
        this.f7439v0 = bVar.f7445a;
        this.f7441x0 = bVar.f7448d;
    }

    public void tf(String str) {
        this.f7441x0 = str;
    }

    @Override
    public void u7(final long j10, final TdApi.UserFullInfo userFullInfo) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                a7.this.qf(j10, userFullInfo);
            }
        });
    }

    public void uf(int i10) {
        this.f7439v0 = i10;
    }

    public void vf(TdApi.User user) {
        this.f7440w0 = user;
    }

    public final void wf() {
        hf(nf(this.f7443z0.x().trim(), this.A0.x().trim()));
    }
}
