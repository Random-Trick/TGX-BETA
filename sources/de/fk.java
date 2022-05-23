package de;

import ae.j;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.c0;
import ce.d0;
import ce.f0;
import ce.j0;
import ce.p0;
import ce.v;
import ce.x;
import de.fk;
import de.iq;
import de.lj;
import gd.l;
import gd.w;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import k0.h;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.y1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.EditTextBase;
import ud.d1;
import ud.h1;
import ud.v4;
import zd.o6;

public class fk extends g6<Void> implements iq.e, y1.e, y1.h, View.OnClickListener, h1 {
    public iq A0;
    public ArrayList<ra> B0;
    public y1 C0;
    public y1 D0;
    public y1 E0;
    public ra F0;
    public ra G0;
    public ra H0;
    public h<String> I0;
    public boolean J0;
    public boolean K0;
    public String[] L0;
    public boolean M0 = true;
    public String N0;
    public boolean O0;
    public ArrayList<ra> P0;
    public boolean Q0;
    public boolean R0;
    public int f7967v0;
    public boolean f7968w0;
    public String f7969x0;
    public String f7970y0;
    public String f7971z0;

    public class a extends RecyclerView.t {
        public a() {
        }

        @Override
        public void a(RecyclerView recyclerView, int i10) {
            if (i10 != 0 && fk.this.U9() == fk.this.C0.getEditText()) {
                x.c(fk.this.C0.getEditText());
            }
        }
    }

    public class b extends iq {
        public final Context f7973m0;

        public b(v4 v4Var, Context context) {
            super(v4Var);
            this.f7973m0 = context;
        }

        public boolean B3(final EditTextBase editTextBase, Editable editable, int i10, int i11) {
            final int i12;
            if (editable.length() == 0) {
                x.f(fk.this.D0.getEditText());
                return true;
            } else if (i10 < 0 || i11 < 0 || i11 - i10 != 0) {
                return false;
            } else {
                if (i10 == 0) {
                    x.f(fk.this.D0.getEditText());
                    return true;
                }
                int i13 = i10;
                int i14 = -1;
                int i15 = 0;
                while (true) {
                    i13--;
                    if (i13 < 0) {
                        break;
                    } else if (i.l(editable.charAt(i13))) {
                        if (i14 == -1) {
                            i14 = i13;
                        } else {
                            i15++;
                        }
                    }
                }
                if (i14 == -1) {
                    x.f(fk.this.D0.getEditText());
                    return true;
                } else if (i15 == 0) {
                    editable.delete(0, i10);
                    return true;
                } else if (fk.this.L0 == null) {
                    return false;
                } else {
                    fk.this.K0 = true;
                    editable.delete(i14, i10);
                    String obj = editable.toString();
                    String v10 = c0.v(fk.this.D0.getText().toString(), c0.D(obj));
                    if (!obj.equals(v10)) {
                        p0.M(editable, obj, v10);
                        int length = editable.length();
                        int i16 = 0;
                        while (true) {
                            if (i16 < length) {
                                if (i.l(editable.charAt(i16)) && i15 - 1 == 0) {
                                    i12 = i16 + 1;
                                    break;
                                }
                                i16++;
                            } else {
                                i12 = -1;
                                break;
                            }
                        }
                        if (i12 != -1) {
                            fk.this.f24495b.hd().post(new Runnable() {
                                @Override
                                public final void run() {
                                    p0.f0(EditTextBase.this, i12);
                                }
                            });
                        }
                    }
                    fk.this.K0 = false;
                    return true;
                }
            }
        }

        public boolean C3(y1 y1Var) {
            return fk.this.lg();
        }

        public boolean D3(y1 y1Var) {
            return fk.this.lg();
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            raVar.j();
        }

        @Override
        public ap S0(ViewGroup viewGroup) {
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(this.f7973m0);
            frameLayoutFix.setPadding(a0.i(16.0f), a0.i(6.0f), a0.i(16.0f), 0);
            frameLayoutFix.setLayoutParams(FrameLayoutFix.q1(-1, a0.i(76.0f)));
            FrameLayout.LayoutParams q12 = FrameLayoutFix.q1(a0.i(18.0f), a0.i(40.0f));
            q12.topMargin = a0.i(20.0f);
            b2 b2Var = new b2(this.f7973m0);
            b2Var.setText("+");
            b2Var.setTextColor(j.P0());
            fk.this.y8(b2Var);
            b2Var.setGravity(19);
            b2Var.setTextSize(1, 17.0f);
            b2Var.setLayoutParams(q12);
            frameLayoutFix.addView(b2Var);
            FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(a0.i(50.0f), -1, 3);
            r12.leftMargin = a0.i(18.0f);
            String str = (String) fk.this.I0.f(R.id.login_code, "");
            fk.this.D0 = new y1(this.f7973m0);
            fk.this.D0.G1(fk.this);
            fk.this.D0.setLayoutParams(r12);
            fk.this.D0.getEditText().setId(R.id.login_code);
            fk.this.D0.getEditText().setNextFocusDownId(R.id.login_phone);
            fk.this.D0.getEditText().setInputType(3);
            fk.this.D0.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
            fk.this.D0.setFocusListener(fk.this);
            fk.this.D0.setText(str);
            fk.this.D0.setTextListener(fk.this);
            frameLayoutFix.addView(fk.this.D0);
            FrameLayout.LayoutParams r13 = FrameLayoutFix.r1(-1, -1, 3);
            r13.leftMargin = a0.i(89.0f);
            fk.this.E0 = new y1(this.f7973m0);
            fk.this.E0.G1(fk.this);
            fk.this.E0.getEditText().setBackspaceListener(new EditTextBase.b() {
                @Override
                public final boolean a(EditTextBase editTextBase, Editable editable, int i10, int i11) {
                    boolean B3;
                    B3 = fk.b.this.B3(editTextBase, editable, i10, i11);
                    return B3;
                }
            });
            fk.this.E0.setHint(fk.this.Rf());
            fk.this.E0.setLayoutParams(r13);
            fk.this.E0.getEditText().setId(R.id.login_phone);
            fk.this.E0.getEditText().setInputType(3);
            fk.this.E0.setFocusListener(fk.this);
            fk.this.E0.setText((String) fk.this.I0.f(R.id.login_country, ""));
            if (fk.this.f7967v0 == 2) {
                fk.this.E0.setNextFocusDownId(R.id.edit_first_name);
            } else {
                fk.this.E0.getEditText().setImeOptions(6);
                fk.this.E0.setDoneListener(new y1.c() {
                    @Override
                    public final boolean t6(y1 y1Var) {
                        boolean C3;
                        C3 = fk.b.this.C3(y1Var);
                        return C3;
                    }
                });
            }
            fk.this.E0.setTextListener(fk.this);
            frameLayoutFix.addView(fk.this.E0);
            if (fk.this.f7967v0 != 2 || i.i(fk.this.f7969x0)) {
                x2((str.isEmpty() ? fk.this.D0 : fk.this.E0).getEditText());
            }
            if (j0.J() && fk.this.Ta()) {
                fk.this.mg();
            }
            return new ap(frameLayoutFix);
        }

        @Override
        public void g2(ra raVar, ap apVar, int i10) {
            ViewGroup viewGroup = (ViewGroup) apVar.f2982a;
            ((y1) viewGroup.getChildAt(1)).setText((CharSequence) fk.this.I0.f(R.id.login_code, ""));
            ((y1) viewGroup.getChildAt(2)).setText((CharSequence) fk.this.I0.f(R.id.login_phone, ""));
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            y1Var.getEditText().setInputType(8288);
            y1Var.setDoneListener(raVar.j() == R.id.edit_last_name ? new y1.c() {
                @Override
                public final boolean t6(y1 y1Var2) {
                    boolean D3;
                    D3 = fk.b.this.D3(y1Var2);
                    return D3;
                }
            } : null);
            if (!fk.this.J0 && fk.this.f7967v0 == 2 && i.i(fk.this.f7969x0) && raVar.j() == R.id.edit_first_name) {
                x2(y1Var.getEditText());
                fk.this.J0 = true;
            }
        }
    }

    public class c extends ClickableSpan {
        public final d f7975a;

        public c(d dVar) {
            this.f7975a = dVar;
        }

        @Override
        public void onClick(View view) {
            d dVar = this.f7975a;
            v.K(dVar.f7979c, dVar.f7980d, dVar.f7981e);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public static class d {
        public final int f7977a;
        public final TdApi.Error f7978b;
        public final String f7979c;
        public final String f7980d;
        public final String f7981e;

        public d(int i10, TdApi.Error error, String str, String str2, String str3) {
            this.f7977a = i10;
            this.f7978b = error;
            this.f7979c = str;
            this.f7980d = str2;
            this.f7981e = str3;
        }
    }

    public fk(Context context, o6 o6Var) {
        super(context, o6Var);
        if (o6Var == null) {
            throw new IllegalArgumentException();
        }
    }

    public void Xf(TdApi.Object object, String str) {
        if (!Sa()) {
            int i10 = 0;
            m2if(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                d Tf = Tf(str, (TdApi.Error) object);
                if (Tf != null) {
                    CharSequence H0 = w.H0(this, Tf.f7977a, t2.z5(Tf.f7978b));
                    if (H0 instanceof Spannable) {
                        o[] oVarArr = (o[]) ((Spannable) H0).getSpans(0, H0.length(), o.class);
                        int length = oVarArr.length;
                        while (true) {
                            if (i10 >= length) {
                                break;
                            }
                            o oVar = oVarArr[i10];
                            if (oVar.b() != null && oVar.b().getConstructor() == -118253987) {
                                oVar.v(null);
                                oVar.i(R.id.theme_color_textLink);
                                oVar.j(new TdApi.TextEntityTypeEmailAddress());
                                Spannable spannable = (Spannable) H0;
                                spannable.setSpan(new c(Tf), spannable.getSpanStart(oVar), spannable.getSpanEnd(oVar), 33);
                                break;
                            }
                            i10++;
                        }
                    }
                    xg(H0);
                    return;
                }
                xg(t2.z5(object));
            } else if (constructor == -860345416) {
                lj ljVar = new lj(this.f24493a, this.f24495b);
                ljVar.bg(new lj.a(8, (TdApi.AuthenticationCodeInfo) object, c0.w(str)));
                ac(ljVar);
            } else if (constructor == 2068432290 && this.f7967v0 == 2) {
                final TdApi.ImportedContacts importedContacts = (TdApi.ImportedContacts) object;
                final long[] jArr = importedContacts.userIds;
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        fk.this.ag(jArr, importedContacts);
                    }
                });
            }
        }
    }

    public void Yf(final String str, final TdApi.Object object) {
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                fk.this.Xf(object, str);
            }
        });
    }

    public void Zf(boolean z10) {
        if (!z10) {
            cf();
        }
    }

    public void ag(long[] jArr, TdApi.ImportedContacts importedContacts) {
        if (!Sa()) {
            m2if(false);
            if (jArr.length != 1) {
                return;
            }
            if (jArr[0] == 0) {
                yg(jArr[0], importedContacts.importerCount[0]);
                return;
            }
            j0.y0(R.string.ContactAdded, 0);
            if (i.i(this.f7969x0)) {
                this.f24495b.hd().u7(this, jArr[0], null);
            } else {
                Zb();
            }
        }
    }

    public boolean bg(y1 y1Var) {
        if (this.C0.isEmpty()) {
            qg(false);
            zg("", true);
            this.D0.setText("");
        } else {
            ArrayList<ra> arrayList = this.P0;
            if (arrayList == null || arrayList.isEmpty() || this.P0.get(0).A() != 33) {
                qg(false);
                zg(this.I0.f(R.id.login_code, ""), true);
            } else {
                pg(this.P0.get(0));
            }
        }
        return true;
    }

    public static void cg(y1 y1Var) {
        p0.P(y1Var.getEditText());
    }

    public static int dg(ra raVar, ra raVar2) {
        int s10 = raVar.s();
        int s11 = raVar2.s();
        if (s10 != s11) {
            return s10 < s11 ? -1 : 1;
        }
        int compareTo = raVar.u().toString().compareTo(raVar2.u().toString());
        return compareTo != 0 ? compareTo : ((String) raVar.d()).compareTo((String) raVar2.d());
    }

    public void eg(String str, ArrayList arrayList) {
        if (!Sa() && str.equals(this.N0) && this.Q0) {
            ug(arrayList, true);
        }
    }

    public void fg(final String str) {
        String[][] c10 = d0.h().c();
        String D = c0.D(str);
        int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList(c10.length + 1);
        ek ekVar = ek.f7873a;
        for (String[] strArr : c10) {
            String lowerCase = strArr[2].toLowerCase();
            if (!D.isEmpty() && strArr[0].startsWith(D)) {
                iArr[0] = -1;
            } else if (!c0.c(lowerCase, str, iArr)) {
                String p10 = c0.p(lowerCase);
                if (!i.c(lowerCase, p10)) {
                    if (!c0.c(p10, str, iArr)) {
                    }
                }
            }
            ra U = new ra(33, (int) R.id.result, 0, (CharSequence) strArr[2], false).G("+" + strArr[0]).U(null, iArr[0]);
            int binarySearch = Collections.binarySearch(arrayList, U, ekVar);
            if (binarySearch < 0) {
                arrayList.add(-(binarySearch + 1), U);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new ra(24, 0, 0, R.string.RegionNotFound));
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                fk.this.eg(str, arrayList);
            }
        });
    }

    public void gg() {
        tg(true);
    }

    public void hg() {
        if (!this.Q0) {
            if (Ta()) {
                x.f((this.D0.isEmpty() ? this.D0 : this.E0).getEditText());
            }
            Ag();
        }
    }

    public void ig() {
        if (this.Q0) {
            this.f8035o0.setItemAnimator(null);
        }
    }

    public void jg(TdApi.Text text) {
        v.M(Sf(), text.text);
    }

    public boolean kg(View view, int i10) {
        if (i10 != R.id.btn_invite) {
            return true;
        }
        this.f24495b.e2().j0(new kb.j() {
            @Override
            public final void a(Object obj) {
                fk.this.jg((TdApi.Text) obj);
            }
        });
        return true;
    }

    @Override
    public int A9() {
        int i10 = this.f7967v0;
        return ((i10 == 0 && this.f7968w0) || i10 == 2 || i10 == 1) ? 3 : 1;
    }

    public final void Ag() {
        hf(Vf() && !this.Q0 && (this.f7967v0 != 2 || Uf()));
    }

    public final void Bg(boolean z10, CharSequence charSequence, boolean z11) {
        int i10 = z10 ? a0.i(89.0f) : 0;
        int i11 = z11 ? R.id.theme_color_textNegative : R.id.theme_color_textLight;
        if (i10 != this.F0.z() || this.F0.y(R.id.theme_color_background_textLight) != i11 || !i.c(this.F0.u(), charSequence)) {
            this.F0.e0(i10);
            this.F0.d0(i11);
            this.F0.X(charSequence);
            if (!this.Q0) {
                this.A0.n1(this.B0.indexOf(this.F0));
            }
            this.E0.setInErrorState(z11);
        }
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.btn_languageSettings) {
            ac(new fv(this.f24493a, this.f24495b));
        } else if (i10 == R.id.btn_proxy) {
            this.f24495b.hd().x7(this, true);
        }
    }

    @Override
    public void Ja(int i10, int i11) {
        iq iqVar = this.A0;
        if (iqVar != null) {
            if (i10 == 0 || i10 == 1) {
                iqVar.w1();
            } else if (i10 == 2) {
                iqVar.z1(i11);
            }
        }
        y1 y1Var = this.C0;
        if (y1Var != null && (i10 == 0 || (i10 == 2 && i11 == R.string.Country))) {
            y1Var.setHint(R.string.Country);
        }
        if (this.E0 == null) {
            return;
        }
        if (i10 == 0 || (i10 == 2 && i11 == Rf())) {
            this.E0.setHint(Rf());
        }
    }

    @Override
    public void La() {
        super.La();
        x.d(this.E0.getEditText(), this.D0.getEditText(), this.C0.getEditText());
    }

    @Override
    public void N5(int i10, ra raVar, y1 y1Var, String str) {
        if (i10 == R.id.edit_first_name) {
            Ag();
        }
    }

    public final void Of(String str) {
        String D = c0.D(str);
        CharSequence text = this.D0.getText();
        if (this.L0 != null) {
            D = c0.v(text.toString(), D);
        }
        if (!str.equals(D)) {
            this.K0 = true;
            p0.M(this.E0.getEditText().getText(), str, D);
            this.K0 = false;
        }
    }

    public final String Pf() {
        ra raVar = this.G0;
        if (raVar != null) {
            return raVar.x();
        }
        return null;
    }

    public final String Qf() {
        ra raVar = this.H0;
        if (raVar != null) {
            return raVar.x();
        }
        return null;
    }

    @Override
    public int R9() {
        return R.id.controller_phone;
    }

    public final int Rf() {
        return this.f7967v0 == 1 ? R.string.NewPhone : R.string.login_PhoneNumber;
    }

    public final String Sf() {
        return "+" + c0.D(this.D0.getText().toString()) + c0.D(this.E0.getText().toString());
    }

    public final d Tf(String str, TdApi.Error error) {
        String str2;
        String str3;
        String str4;
        int i10;
        if (i.i(error.message)) {
            return null;
        }
        String str5 = error.message;
        str5.hashCode();
        if (str5.equals("PHONE_NUMBER_BANNED")) {
            String u12 = w.u1(R.string.email_LoginHelp, new Object[0]);
            str2 = w.j1(R.string.email_BannedNumber_text, str) + "\n\n" + this.f24495b.e5();
            str4 = u12;
            str3 = w.j1(R.string.email_BannedNumber_subject, str);
            i10 = R.string.login_PHONE_NUMBER_BANNED;
        } else if (str5.equals("PHONE_NUMBER_INVALID")) {
            String u13 = w.u1(R.string.email_LoginHelp, new Object[0]);
            str2 = w.j1(R.string.email_InvalidNumber_text, str) + "\n\n" + this.f24495b.e5();
            str4 = u13;
            str3 = w.j1(R.string.email_InvalidNumber_subject, str);
            i10 = R.string.login_PHONE_NUMBER_INVALID;
        } else if (this.f7967v0 != 0) {
            return null;
        } else {
            String u14 = w.u1(R.string.email_SmsHelp, new Object[0]);
            str3 = w.j1(R.string.email_LoginError_subject, error.message);
            str2 = w.j1(R.string.email_LoginError_text, str, t2.z5(error)) + "\n\n" + this.f24495b.e5();
            str4 = u14;
            i10 = R.string.login_error;
        }
        return new d(i10, error, str4, str3, str2);
    }

    public final boolean Uf() {
        String Pf = Pf();
        return !i.i(Pf) && Pf.trim().length() > 0;
    }

    public final boolean Vf() {
        return this.D0.getText().length() > 0 && this.E0.getText().length() > 0;
    }

    @Override
    public int W9() {
        if (this.f7967v0 != 0 || this.f7968w0) {
            return 0;
        }
        return R.id.menu_login;
    }

    public boolean Wf() {
        return this.f7968w0;
    }

    @Override
    public CharSequence X9() {
        String str;
        int i10 = this.f7967v0;
        boolean z10 = true;
        if (i10 == 0) {
            str = w.i1(this.f7968w0 ? R.string.AddAccount : R.string.YourPhone);
        } else if (i10 == 1) {
            str = w.i1(R.string.NewNumber);
        } else if (i10 == 2) {
            str = w.i1(R.string.AddContact);
        } else {
            throw new IllegalArgumentException("mode == " + this.f7967v0);
        }
        o6 o6Var = this.f24495b;
        if (o6Var == null || !o6Var.A1().G()) {
            z10 = false;
        }
        return w.r0(str, z10);
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        String str;
        int M;
        int i10;
        int i11 = a0.i(72.0f);
        ((FrameLayout.LayoutParams) recyclerView.getLayoutParams()).topMargin = i11;
        if (this.f7967v0 != 2) {
            df(R.drawable.baseline_arrow_forward_24);
        }
        recyclerView.setOverScrollMode(2);
        this.I0 = new h<>(3);
        int i12 = 1;
        if (this.f7967v0 != 2) {
            String[] g10 = d0.h().g(this.f24495b);
            if (g10 != null) {
                this.I0.j(R.id.login_code, g10[0]);
                this.I0.j(R.id.login_phone, g10[1]);
                String[] b10 = d0.h().b(g10[0]);
                this.L0 = b10;
                if (b10 != null) {
                    this.I0.j(R.id.login_country, b10[2]);
                }
            }
        } else if (!i.i(this.f7969x0)) {
            String str2 = this.f7969x0;
            String D = c0.D(str2);
            String w10 = c0.w(D);
            int indexOf = w10.indexOf(32);
            if (indexOf != -1) {
                String substring = w10.substring(1, indexOf);
                str2 = w10.substring(indexOf + 1);
                str = substring;
            } else {
                str = null;
            }
            if (str == null && (M = c0.M(this.f7969x0)) != -1) {
                int length = D.length();
                int length2 = this.f7969x0.length();
                int i13 = 0;
                while (M < length2) {
                    int codePointAt = this.f7969x0.codePointAt(M);
                    int charCount = Character.charCount(codePointAt);
                    if (charCount != i12 || !i.l((char) codePointAt)) {
                        break;
                    }
                    int i14 = i13 + charCount;
                    String substring2 = this.f7969x0.substring(0, i14);
                    if (i14 == 4 || f0.c(substring2) == length) {
                        i10 = i14;
                        str = substring2;
                        break;
                    }
                    M += charCount;
                    i13 = i14;
                    str = substring2;
                    i12 = 1;
                }
                i10 = i13;
                str2 = this.f7969x0.substring(i10);
            }
            if (!i.i(str)) {
                this.I0.j(R.id.login_code, str);
                String[] b11 = d0.h().b(str);
                this.L0 = b11;
                if (b11 != null) {
                    this.I0.j(R.id.login_country, b11[2]);
                }
            }
            this.I0.j(R.id.login_phone, str2);
        }
        if (this.L0 == null && i.i(this.f7969x0)) {
            String[] d10 = d0.h().d();
            this.L0 = d10;
            if (d10 != null) {
                this.I0.j(R.id.login_code, d10[0]);
                this.I0.j(R.id.login_country, d10[2]);
            }
        }
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        frameLayoutFix2.setPadding(a0.i(16.0f), a0.i(12.0f), a0.i(16.0f), 0);
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.r1(-1, i11, 48));
        y1 y1Var = new y1(context);
        this.C0 = y1Var;
        y1Var.G1(this);
        this.C0.k2();
        this.C0.getEditText().setInputType(532593);
        this.C0.getEditText().setImeOptions(6);
        this.C0.setDoneListener(new y1.c() {
            @Override
            public final boolean t6(y1 y1Var2) {
                boolean bg;
                bg = fk.this.bg(y1Var2);
                return bg;
            }
        });
        this.C0.setHint(R.string.Country);
        this.C0.getEditText().setId(R.id.login_country);
        this.C0.getEditText().setNextFocusDownId(R.id.login_code);
        this.C0.setText(this.I0.f(R.id.login_country, ""));
        this.C0.setTextListener(this);
        this.C0.setFocusListener(this);
        frameLayoutFix2.addView(this.C0);
        frameLayoutFix.addView(frameLayoutFix2);
        ArrayList<ra> arrayList = new ArrayList<>(3);
        this.B0 = arrayList;
        arrayList.add(new ra(32));
        if (this.f7967v0 == 2) {
            ArrayList<ra> arrayList2 = this.B0;
            ra b02 = new ra(56, R.id.edit_first_name, 0, R.string.login_FirstName).b0(this.f7970y0);
            this.G0 = b02;
            arrayList2.add(b02);
            ArrayList<ra> arrayList3 = this.B0;
            ra b03 = new ra(56, R.id.edit_last_name, 0, R.string.login_LastName).b0(this.f7971z0);
            this.H0 = b03;
            arrayList3.add(b03);
        }
        int i15 = this.f7967v0;
        ra d02 = new ra(9, 0, 0, i15 == 2 ? 0 : i15 == 1 ? R.string.ChangePhoneHelp : R.string.login_SmsHint).d0(R.id.theme_color_textLight);
        this.F0 = d02;
        if (this.f7967v0 != 2) {
            this.B0.add(d02);
        }
        recyclerView.k(new a());
        b bVar = new b(this, context);
        this.A0 = bVar;
        bVar.v2(this, true);
        if (this.f7967v0 == 2) {
            this.A0.O2(this);
        }
        this.A0.s2(this.B0, this.f7968w0);
        recyclerView.setAdapter(this.A0);
    }

    @Override
    public boolean af() {
        return lg();
    }

    @Override
    public void bf(boolean z10) {
        y1 y1Var = this.C0;
        String str = null;
        y1Var.setBlockedText(z10 ? y1Var.getText().toString() : null);
        y1 y1Var2 = this.E0;
        y1Var2.setBlockedText(z10 ? y1Var2.getText().toString() : null);
        y1 y1Var3 = this.D0;
        if (z10) {
            str = y1Var3.getText().toString();
        }
        y1Var3.setBlockedText(str);
        if (this.f7967v0 != 2) {
            Md(z10);
        }
    }

    @Override
    public boolean db() {
        return this.f7967v0 == 0;
    }

    @Override
    public void i4(final y1 y1Var, boolean z10) {
        if (z10) {
            Ed(y1Var.getEditText());
            if (y1Var.getEditText().getId() == R.id.login_country) {
                qg(true);
                y1Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        fk.cg(y1.this);
                    }
                });
            }
        }
    }

    @Override
    public boolean jc(boolean z10) {
        if (!this.Q0) {
            return false;
        }
        qg(false);
        zg(this.I0.f(R.id.login_code, ""), this.M0);
        return true;
    }

    public final boolean lg() {
        TdApi.Function function;
        int g12;
        if (Ue() || this.Q0) {
            return false;
        }
        if (!Vf()) {
            wg(R.string.login_InvalidPhone);
            return true;
        }
        String D = c0.D(this.D0.getText().toString());
        String D2 = c0.D(this.E0.getText().toString());
        String str = D + D2;
        if (!this.f7968w0 || (g12 = this.f24495b.F4().g1(str, this.f24495b.A1().G())) == -1) {
            xg(null);
            m2if(true);
            final String str2 = "+" + str;
            int i10 = this.f7967v0;
            if (i10 == 0) {
                TdApi.SetAuthenticationPhoneNumber setAuthenticationPhoneNumber = new TdApi.SetAuthenticationPhoneNumber(str2, t2.h0());
                this.f24495b.Ib(D, D2);
                function = setAuthenticationPhoneNumber;
            } else if (i10 == 1) {
                function = new TdApi.ChangePhoneNumber(str2, t2.h0());
            } else if (i10 == 2) {
                function = new TdApi.ImportContacts(new TdApi.Contact[]{new TdApi.Contact(str2, Pf(), Qf(), null, 0L)});
            } else {
                throw new IllegalArgumentException("mode == " + this.f7967v0);
            }
            this.f24495b.v4().o(function, new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    fk.this.Yf(str2, object);
                }
            });
            return true;
        }
        this.f24495b.F4().e0(g12, 5, new kb.i() {
            @Override
            public final void a(boolean z10) {
                fk.this.Zf(z10);
            }
        });
        return true;
    }

    public final void mg() {
        if (!(this.D0 == null || this.E0 == null)) {
            StringBuilder sb2 = new StringBuilder(4);
            sb2.append("966");
            sb2.append(1);
            if (j0.f5280g == 2) {
                for (int i10 = 0; i10 < 4; i10++) {
                    sb2.append(ib.h.n(0, 9));
                }
            } else {
                sb2.append("73");
                sb2.append(ib.h.n(1, 9) + 50);
            }
            String sb3 = sb2.toString();
            this.D0.setText("99");
            this.E0.setText(sb3);
            lg();
        }
    }

    public void ng() {
        if (j0.J()) {
            lg();
        }
    }

    public final void og(final String str) {
        if (!i.i(str) && this.M0) {
            str = "";
        }
        this.N0 = str;
        if (str == null) {
            ug(this.B0, false);
        } else {
            l.a().b(new Runnable() {
                @Override
                public final void run() {
                    fk.this.fg(str);
                }
            });
        }
    }

    @Override
    public void onClick(View view) {
        ra raVar;
        int id2 = view.getId();
        if (id2 == R.id.btn_syncContacts) {
            this.A0.S2(view);
        } else if (id2 == R.id.result && (raVar = (ra) view.getTag()) != null && raVar.d() != null) {
            pg(raVar);
        }
    }

    @Override
    public void p4(y1 y1Var, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        switch (y1Var.getEditText().getId()) {
            case R.id.login_code:
                String e10 = this.I0.e(R.id.login_code);
                if (e10 == null || !i.c(e10, charSequence2)) {
                    this.I0.j(y1Var.getEditText().getId(), charSequence2);
                    String D = c0.D(charSequence2);
                    if (!charSequence2.equals(D)) {
                        this.D0.setText(D);
                    } else {
                        zg(D, true);
                        Of(this.E0.getEditText().getText().toString());
                        Ag();
                    }
                    xg(null);
                    if (charSequence2.length() == 4 && this.D0.getEditText().getSelectionEnd() == charSequence2.length()) {
                        x.f(this.E0.getEditText());
                        return;
                    }
                    return;
                }
                return;
            case R.id.login_country:
                if (this.Q0) {
                    tg(false);
                }
                og(charSequence2.trim().toLowerCase());
                return;
            case R.id.login_phone:
                this.I0.j(y1Var.getEditText().getId(), charSequence2);
                if (!this.K0) {
                    Of(charSequence2);
                    Ag();
                }
                xg(null);
                return;
            default:
                return;
        }
    }

    public final void pg(ra raVar) {
        String charSequence = raVar.u().toString();
        this.I0.j(R.id.login_code, ((String) raVar.d()).substring(1));
        this.C0.j2(charSequence, true);
        qg(false);
        x.f(this.E0.getEditText());
        j0.d0(new Runnable() {
            @Override
            public final void run() {
                fk.this.gg();
            }
        });
    }

    public final void qg(boolean z10) {
        if (this.Q0 != z10) {
            this.Q0 = z10;
            this.C0.getEditText().setNextFocusDownId(z10 ? -1 : R.id.login_code);
            if (z10) {
                Ag();
            } else {
                x.f((this.D0.isEmpty() ? this.D0 : this.E0).getEditText());
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        fk.this.hg();
                    }
                }, 360L);
            }
            og(z10 ? this.C0.getText().toString().trim().toLowerCase() : null);
        }
    }

    public void rg(String str, String str2, String str3) {
        this.f7969x0 = str;
        this.f7970y0 = str2;
        this.f7971z0 = str3;
    }

    @Override
    public void sc() {
        super.sc();
        if (!this.R0) {
            this.R0 = true;
            int i10 = this.f7967v0;
            if (i10 == 0) {
                c9(R.id.controller_intro);
                if (j0.J()) {
                    mg();
                }
            } else if (i10 == 1) {
                c9(R.id.controller_editPhone);
            }
        }
    }

    public void sg(boolean z10) {
        if (!z10 || this.f7967v0 == 0) {
            this.f7968w0 = z10;
            return;
        }
        throw new IllegalStateException();
    }

    public final void tg(boolean z10) {
        this.M0 = z10;
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_login) {
            d1Var.K1(linearLayout, R.id.btn_proxy, R.drawable.baseline_security_24, R.id.theme_color_headerIcon, this, a0.i(48.0f));
            d1Var.K1(linearLayout, R.id.btn_languageSettings, R.drawable.baseline_language_24, R.id.theme_color_headerIcon, this, a0.i(48.0f));
        }
    }

    public final void ug(ArrayList<ra> arrayList, boolean z10) {
        boolean z11 = true;
        boolean z12 = this.O0 != z10;
        this.O0 = z10;
        this.P0 = z10 ? arrayList : null;
        if (z12) {
            this.f8035o0.setItemAnimator(this.f8037q0);
            this.A0.s2(arrayList, false);
            if (z10) {
                j0.e0(new Runnable() {
                    @Override
                    public final void run() {
                        fk.this.ig();
                    }
                }, 360L);
            }
        } else if (!z10) {
        } else {
            if (arrayList.get(0).A() != 24 || this.A0.D0().get(0).A() != 24) {
                if (arrayList.size() == this.A0.D0().size()) {
                    Iterator<ra> it = arrayList.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        i10++;
                        if (this.A0.D0().get(i10).d() != it.next().d()) {
                            z11 = false;
                            break;
                        }
                    }
                    if (z11) {
                        return;
                    }
                }
                this.A0.S1(arrayList);
                ((LinearLayoutManager) this.f8035o0.getLayoutManager()).z2(0, 0);
            }
        }
    }

    public fk vg(int i10) {
        this.f7967v0 = i10;
        return this;
    }

    public final void wg(int i10) {
        xg(w.i1(i10));
    }

    public final void xg(CharSequence charSequence) {
        CharSequence charSequence2;
        boolean z10 = false;
        boolean z11 = charSequence != null;
        if (charSequence != null) {
            charSequence2 = charSequence;
        } else {
            int i10 = this.f7967v0;
            if (i10 == 2) {
                charSequence2 = null;
            } else {
                charSequence2 = w.i1(i10 == 1 ? R.string.ChangePhoneHelp : R.string.login_SmsHint);
            }
        }
        if (charSequence != null) {
            z10 = true;
        }
        Bg(z11, charSequence2, z10);
    }

    public final void yg(long j10, int i10) {
        ee(i10 > 1 ? w.n2(R.string.SuggestInvitingUserCommon, i10, w.p(), Pf()) : w.m1(R.string.SuggestInvitingUser, Pf()), new int[]{R.id.btn_invite, R.id.btn_cancel}, new String[]{w.i1(R.string.Invite), w.i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_person_add_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean kg;
                kg = fk.this.kg(view, i11);
                return kg;
            }
        });
    }

    public final void zg(String str, boolean z10) {
        String[] b10 = d0.h().b(str);
        this.L0 = b10;
        tg(z10);
        this.C0.j2(b10 != null ? b10[2] : null, true);
    }
}
