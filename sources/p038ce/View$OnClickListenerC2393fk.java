package p038ce;

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
import be.C1357a0;
import be.C1363c0;
import be.C1367d0;
import be.C1371f0;
import be.C1379j0;
import be.C1399s0;
import be.C1405v;
import be.C1408x;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import me.C6847b2;
import me.View$OnFocusChangeListenerC7069y1;
import me.vkryl.android.widget.FrameLayoutFix;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.EditTextBase;
import p038ce.C2546iq;
import p038ce.View$OnClickListenerC2393fk;
import p038ce.View$OnClickListenerC2665lj;
import p082fd.C4383l;
import p082fd.C4403w;
import p108hb.C5069h;
import p108hb.C5070i;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p111he.C5132o;
import p139jb.AbstractC5917i;
import p139jb.AbstractC5918j;
import p143k0.C6038h;
import p350yd.C10930q6;
import p364zd.C11524j;
import tc.C9137c;
import td.AbstractC9201h1;
import td.AbstractC9323v4;
import td.View$OnClickListenerC9170d1;

public class View$OnClickListenerC2393fk extends AbstractC2420g6<Void> implements C2546iq.AbstractC2551e, View$OnFocusChangeListenerC7069y1.AbstractC7074e, View$OnFocusChangeListenerC7069y1.AbstractC7077h, View.OnClickListener, AbstractC9201h1 {
    public C2546iq f8212A0;
    public ArrayList<C2964ra> f8213B0;
    public View$OnFocusChangeListenerC7069y1 f8214C0;
    public View$OnFocusChangeListenerC7069y1 f8215D0;
    public View$OnFocusChangeListenerC7069y1 f8216E0;
    public C2964ra f8217F0;
    public C2964ra f8218G0;
    public C2964ra f8219H0;
    public C6038h<String> f8220I0;
    public boolean f8221J0;
    public boolean f8222K0;
    public String[] f8223L0;
    public boolean f8224M0 = true;
    public String f8225N0;
    public boolean f8226O0;
    public ArrayList<C2964ra> f8227P0;
    public boolean f8228Q0;
    public boolean f8229R0;
    public int f8230v0;
    public boolean f8231w0;
    public String f8232x0;
    public String f8233y0;
    public String f8234z0;

    public class C2394a extends RecyclerView.AbstractC0910t {
        public C2394a() {
        }

        @Override
        public void mo7604a(RecyclerView recyclerView, int i) {
            if (i != 0 && View$OnClickListenerC2393fk.this.m9333U9() == View$OnClickListenerC2393fk.this.f8214C0.getEditText()) {
                C1408x.m37091c(View$OnClickListenerC2393fk.this.f8214C0.getEditText());
            }
        }
    }

    public class C2395b extends C2546iq {
        public final Context f8236m0;

        public C2395b(AbstractC9323v4 v4Var, Context context) {
            super(v4Var);
            this.f8236m0 = context;
        }

        public boolean m34646C3(final EditTextBase editTextBase, Editable editable, int i, int i2) {
            final int i3;
            if (editable.length() == 0) {
                C1408x.m37088f(View$OnClickListenerC2393fk.this.f8215D0.getEditText());
                return true;
            } else if (i < 0 || i2 < 0 || i2 - i != 0) {
                return false;
            } else {
                if (i == 0) {
                    C1408x.m37088f(View$OnClickListenerC2393fk.this.f8215D0.getEditText());
                    return true;
                }
                int i4 = i;
                int i5 = -1;
                int i6 = 0;
                while (true) {
                    i4--;
                    if (i4 < 0) {
                        break;
                    } else if (C5070i.m24059l(editable.charAt(i4))) {
                        if (i5 == -1) {
                            i5 = i4;
                        } else {
                            i6++;
                        }
                    }
                }
                if (i5 == -1) {
                    C1408x.m37088f(View$OnClickListenerC2393fk.this.f8215D0.getEditText());
                    return true;
                } else if (i6 == 0) {
                    editable.delete(0, i);
                    return true;
                } else if (View$OnClickListenerC2393fk.this.f8223L0 == null) {
                    return false;
                } else {
                    View$OnClickListenerC2393fk.this.f8222K0 = true;
                    editable.delete(i5, i);
                    String obj = editable.toString();
                    String v = C1363c0.m37414v(View$OnClickListenerC2393fk.this.f8215D0.getText().toString(), C1363c0.m37473D(obj));
                    if (!obj.equals(v)) {
                        C1399s0.m37205S(editable, obj, v);
                        int length = editable.length();
                        int i7 = 0;
                        while (true) {
                            if (i7 < length) {
                                if (C5070i.m24059l(editable.charAt(i7)) && i6 - 1 == 0) {
                                    i3 = i7 + 1;
                                    break;
                                }
                                i7++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 != -1) {
                            View$OnClickListenerC2393fk.this.f30170b.m2485dd().post(new Runnable() {
                                @Override
                                public final void run() {
                                    C1399s0.m37172m0(EditTextBase.this, i3);
                                }
                            });
                        }
                    }
                    View$OnClickListenerC2393fk.this.f8222K0 = false;
                    return true;
                }
            }
        }

        public boolean m34645E3(View$OnFocusChangeListenerC7069y1 y1Var) {
            return View$OnClickListenerC2393fk.this.m34677lg();
        }

        public boolean m34644F3(View$OnFocusChangeListenerC7069y1 y1Var) {
            return View$OnClickListenerC2393fk.this.m34677lg();
        }

        @Override
        public C2139ap mo34210U0(ViewGroup viewGroup) {
            FrameLayoutFix frameLayoutFix = new FrameLayoutFix(this.f8236m0);
            frameLayoutFix.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(6.0f), C1357a0.m37544i(16.0f), 0);
            frameLayoutFix.setLayoutParams(FrameLayoutFix.m18008s1(-1, C1357a0.m37544i(76.0f)));
            FrameLayout.LayoutParams s1 = FrameLayoutFix.m18008s1(C1357a0.m37544i(18.0f), C1357a0.m37544i(40.0f));
            s1.topMargin = C1357a0.m37544i(20.0f);
            C6847b2 b2Var = new C6847b2(this.f8236m0);
            b2Var.setText("+");
            b2Var.setTextColor(C11524j.m217S0());
            View$OnClickListenerC2393fk.this.m9126y8(b2Var);
            b2Var.setGravity(19);
            b2Var.setTextSize(1, 17.0f);
            b2Var.setLayoutParams(s1);
            frameLayoutFix.addView(b2Var);
            FrameLayout.LayoutParams t1 = FrameLayoutFix.m18007t1(C1357a0.m37544i(50.0f), -1, 3);
            t1.leftMargin = C1357a0.m37544i(18.0f);
            String str = (String) View$OnClickListenerC2393fk.this.f8220I0.m21471f(R.id.login_code, "");
            View$OnClickListenerC2393fk.this.f8215D0 = new View$OnFocusChangeListenerC7069y1(this.f8236m0);
            View$OnClickListenerC2393fk.this.f8215D0.m17922J1(View$OnClickListenerC2393fk.this);
            View$OnClickListenerC2393fk.this.f8215D0.setLayoutParams(t1);
            View$OnClickListenerC2393fk.this.f8215D0.getEditText().setId(R.id.login_code);
            View$OnClickListenerC2393fk.this.f8215D0.getEditText().setNextFocusDownId(R.id.login_phone);
            View$OnClickListenerC2393fk.this.f8215D0.getEditText().setInputType(3);
            View$OnClickListenerC2393fk.this.f8215D0.getEditText().setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
            View$OnClickListenerC2393fk.this.f8215D0.setFocusListener(View$OnClickListenerC2393fk.this);
            View$OnClickListenerC2393fk.this.f8215D0.setText(str);
            View$OnClickListenerC2393fk.this.f8215D0.setTextListener(View$OnClickListenerC2393fk.this);
            frameLayoutFix.addView(View$OnClickListenerC2393fk.this.f8215D0);
            FrameLayout.LayoutParams t12 = FrameLayoutFix.m18007t1(-1, -1, 3);
            t12.leftMargin = C1357a0.m37544i(89.0f);
            View$OnClickListenerC2393fk.this.f8216E0 = new View$OnFocusChangeListenerC7069y1(this.f8236m0);
            View$OnClickListenerC2393fk.this.f8216E0.m17922J1(View$OnClickListenerC2393fk.this);
            View$OnClickListenerC2393fk.this.f8216E0.getEditText().setBackspaceListener(new EditTextBase.AbstractC7923b() {
                @Override
                public final boolean mo14154a(EditTextBase editTextBase, Editable editable, int i, int i2) {
                    boolean C3;
                    C3 = View$OnClickListenerC2393fk.C2395b.this.m34646C3(editTextBase, editable, i, i2);
                    return C3;
                }
            });
            View$OnClickListenerC2393fk.this.f8216E0.setHint(View$OnClickListenerC2393fk.this.m34699Rf());
            View$OnClickListenerC2393fk.this.f8216E0.setLayoutParams(t12);
            View$OnClickListenerC2393fk.this.f8216E0.getEditText().setId(R.id.login_phone);
            View$OnClickListenerC2393fk.this.f8216E0.getEditText().setInputType(3);
            View$OnClickListenerC2393fk.this.f8216E0.setFocusListener(View$OnClickListenerC2393fk.this);
            View$OnClickListenerC2393fk.this.f8216E0.setText((String) View$OnClickListenerC2393fk.this.f8220I0.m21471f(R.id.login_country, ""));
            if (View$OnClickListenerC2393fk.this.f8230v0 == 2) {
                View$OnClickListenerC2393fk.this.f8216E0.setNextFocusDownId(R.id.edit_first_name);
            } else {
                View$OnClickListenerC2393fk.this.f8216E0.getEditText().setImeOptions(6);
                View$OnClickListenerC2393fk.this.f8216E0.setDoneListener(new View$OnFocusChangeListenerC7069y1.AbstractC7072c() {
                    @Override
                    public final boolean mo17894S0(View$OnFocusChangeListenerC7069y1 y1Var) {
                        boolean E3;
                        E3 = View$OnClickListenerC2393fk.C2395b.this.m34645E3(y1Var);
                        return E3;
                    }
                });
            }
            View$OnClickListenerC2393fk.this.f8216E0.setTextListener(View$OnClickListenerC2393fk.this);
            frameLayoutFix.addView(View$OnClickListenerC2393fk.this.f8216E0);
            if (View$OnClickListenerC2393fk.this.f8230v0 != 2 || C5070i.m24062i(View$OnClickListenerC2393fk.this.f8232x0)) {
                m34251B2((str.isEmpty() ? View$OnClickListenerC2393fk.this.f8215D0 : View$OnClickListenerC2393fk.this.f8216E0).getEditText());
            }
            if (C1379j0.m37361J() && View$OnClickListenerC2393fk.this.m9339Ta()) {
                View$OnClickListenerC2393fk.this.m34675mg();
            }
            return new C2139ap(frameLayoutFix);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            raVar.m32838j();
        }

        @Override
        public void mo34156l2(C2964ra raVar, C2139ap apVar, int i) {
            ViewGroup viewGroup = (ViewGroup) apVar.f3479a;
            ((View$OnFocusChangeListenerC7069y1) viewGroup.getChildAt(1)).setText((CharSequence) View$OnClickListenerC2393fk.this.f8220I0.m21471f(R.id.login_code, ""));
            ((View$OnFocusChangeListenerC7069y1) viewGroup.getChildAt(2)).setText((CharSequence) View$OnClickListenerC2393fk.this.f8220I0.m21471f(R.id.login_phone, ""));
        }

        @Override
        public void mo30692v1(C2964ra raVar, ViewGroup viewGroup, View$OnFocusChangeListenerC7069y1 y1Var) {
            y1Var.getEditText().setInputType(8288);
            y1Var.setDoneListener(raVar.m32838j() == R.id.edit_last_name ? new View$OnFocusChangeListenerC7069y1.AbstractC7072c() {
                @Override
                public final boolean mo17894S0(View$OnFocusChangeListenerC7069y1 y1Var2) {
                    boolean F3;
                    F3 = View$OnClickListenerC2393fk.C2395b.this.m34644F3(y1Var2);
                    return F3;
                }
            } : null);
            if (!View$OnClickListenerC2393fk.this.f8221J0 && View$OnClickListenerC2393fk.this.f8230v0 == 2 && C5070i.m24062i(View$OnClickListenerC2393fk.this.f8232x0) && raVar.m32838j() == R.id.edit_first_name) {
                m34251B2(y1Var.getEditText());
                View$OnClickListenerC2393fk.this.f8221J0 = true;
            }
        }
    }

    public class C2396c extends ClickableSpan {
        public final C2397d f8238a;

        public C2396c(C2397d dVar) {
            this.f8238a = dVar;
        }

        @Override
        public void onClick(View view) {
            C2397d dVar = this.f8238a;
            C1405v.m37134L(dVar.f8242c, dVar.f8243d, dVar.f8244e);
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public static class C2397d {
        public final int f8240a;
        public final TdApi.Error f8241b;
        public final String f8242c;
        public final String f8243d;
        public final String f8244e;

        public C2397d(int i, TdApi.Error error, String str, String str2, String str3) {
            this.f8240a = i;
            this.f8241b = error;
            this.f8242c = str;
            this.f8243d = str2;
            this.f8244e = str3;
        }
    }

    public View$OnClickListenerC2393fk(Context context, C10930q6 q6Var) {
        super(context, q6Var);
        if (q6Var == null) {
            throw new IllegalArgumentException();
        }
    }

    public void m34693Xf(TdApi.Object object, String str) {
        if (!m9347Sa()) {
            int i = 0;
            m34627if(false);
            int constructor = object.getConstructor();
            if (constructor == -1679978726) {
                C2397d Tf = m34697Tf(str, (TdApi.Error) object);
                if (Tf != null) {
                    CharSequence H0 = C4403w.m27984H0(this, Tf.f8240a, C4779t2.m25379z5(Tf.f8241b));
                    if (H0 instanceof Spannable) {
                        C5132o[] oVarArr = (C5132o[]) ((Spannable) H0).getSpans(0, H0.length(), C5132o.class);
                        int length = oVarArr.length;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            C5132o oVar = oVarArr[i];
                            if (oVar.m23861b() != null && oVar.m23861b().getConstructor() == -118253987) {
                                oVar.m23841v(null);
                                oVar.m23854i(R.id.theme_color_textLink);
                                oVar.m23853j(new TdApi.TextEntityTypeEmailAddress());
                                Spannable spannable = (Spannable) H0;
                                spannable.setSpan(new C2396c(Tf), spannable.getSpanStart(oVar), spannable.getSpanEnd(oVar), 33);
                                break;
                            }
                            i++;
                        }
                    }
                    m34653xg(H0);
                    return;
                }
                m34653xg(C4779t2.m25379z5(object));
            } else if (constructor == -860345416) {
                View$OnClickListenerC2665lj ljVar = new View$OnClickListenerC2665lj(this.f30168a, this.f30170b);
                ljVar.m33966bg(new View$OnClickListenerC2665lj.C2666a(8, (TdApi.AuthenticationCodeInfo) object, C1363c0.m37413w(str)));
                m9291ac(ljVar);
            } else if (constructor == 2068432290 && this.f8230v0 == 2) {
                final TdApi.ImportedContacts importedContacts = (TdApi.ImportedContacts) object;
                final long[] jArr = importedContacts.userIds;
                this.f30170b.m2485dd().post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2393fk.this.m34690ag(jArr, importedContacts);
                    }
                });
            }
        }
    }

    public void m34692Yf(final String str, final TdApi.Object object) {
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2393fk.this.m34693Xf(object, str);
            }
        });
    }

    public void m34691Zf(boolean z) {
        if (!z) {
            m34632cf();
        }
    }

    public void m34690ag(long[] jArr, TdApi.ImportedContacts importedContacts) {
        if (!m9347Sa()) {
            m34627if(false);
            if (jArr.length != 1) {
                return;
            }
            if (jArr[0] == 0) {
                m34651yg(jArr[0], importedContacts.importerCount[0]);
                return;
            }
            C1379j0.m37295y0(R.string.ContactAdded, 0);
            if (C5070i.m24062i(this.f8232x0)) {
                this.f30170b.m2485dd().m3439u7(this, jArr[0], null);
            } else {
                m9298Zb();
            }
        }
    }

    public boolean m34689bg(View$OnFocusChangeListenerC7069y1 y1Var) {
        if (this.f8214C0.isEmpty()) {
            m34667qg(false);
            m34649zg("", true);
            this.f8215D0.setText("");
        } else {
            ArrayList<C2964ra> arrayList = this.f8227P0;
            if (arrayList == null || arrayList.isEmpty() || this.f8227P0.get(0).m32879A() != 33) {
                m34667qg(false);
                m34649zg(this.f8220I0.m21471f(R.id.login_code, ""), true);
            } else {
                m34669pg(this.f8227P0.get(0));
            }
        }
        return true;
    }

    public static void m34688cg(View$OnFocusChangeListenerC7069y1 y1Var) {
        C1399s0.m37201W(y1Var.getEditText());
    }

    public static int m34687dg(C2964ra raVar, C2964ra raVar2) {
        int s = raVar.m32829s();
        int s2 = raVar2.m32829s();
        if (s != s2) {
            return s < s2 ? -1 : 1;
        }
        int compareTo = raVar.m32827u().toString().compareTo(raVar2.m32827u().toString());
        return compareTo != 0 ? compareTo : ((String) raVar.m32847d()).compareTo((String) raVar2.m32847d());
    }

    public void m34686eg(String str, ArrayList arrayList) {
        if (!m9347Sa() && str.equals(this.f8225N0) && this.f8228Q0) {
            m34659ug(arrayList, true);
        }
    }

    public void m34685fg(final String str) {
        String[][] c = C1367d0.m37402h().m37407c();
        String D = C1363c0.m37473D(str);
        int[] iArr = new int[1];
        final ArrayList arrayList = new ArrayList(c.length + 1);
        C2344ek ekVar = C2344ek.f8048a;
        for (String[] strArr : c) {
            String lowerCase = strArr[2].toLowerCase();
            if (!D.isEmpty() && strArr[0].startsWith(D)) {
                iArr[0] = -1;
            } else if (!C1363c0.m37446c(lowerCase, str, iArr)) {
                String p = C1363c0.m37420p(lowerCase);
                if (!C5070i.m24068c(lowerCase, p)) {
                    if (!C1363c0.m37446c(p, str, iArr)) {
                    }
                }
            }
            C2964ra U = new C2964ra(33, (int) R.id.result, 0, (CharSequence) strArr[2], false).m32873G("+" + strArr[0]).m32859U(null, iArr[0]);
            int binarySearch = Collections.binarySearch(arrayList, U, ekVar);
            if (binarySearch < 0) {
                arrayList.add(-(binarySearch + 1), U);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C2964ra(24, 0, 0, R.string.RegionNotFound));
        }
        this.f30170b.m2485dd().post(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2393fk.this.m34686eg(str, arrayList);
            }
        });
    }

    public void m34684gg() {
        m34661tg(true);
    }

    public void m34683hg() {
        if (!this.f8228Q0) {
            if (m9339Ta()) {
                C1408x.m37088f((this.f8215D0.isEmpty() ? this.f8215D0 : this.f8216E0).getEditText());
            }
            m34717Ag();
        }
    }

    public void m34682ig() {
        if (this.f8228Q0) {
            this.f8298o0.setItemAnimator(null);
        }
    }

    public void m34681jg(TdApi.Text text) {
        C1405v.m37132N(m34698Sf(), text.text);
    }

    public boolean m34679kg(View view, int i) {
        if (i != R.id.btn_invite) {
            return true;
        }
        this.f30170b.m2480e2().m1632j0(new AbstractC5918j() {
            @Override
            public final void mo1330a(Object obj) {
                View$OnClickListenerC2393fk.this.m34681jg((TdApi.Text) obj);
            }
        });
        return true;
    }

    @Override
    public int mo408A9() {
        int i = this.f8230v0;
        return ((i == 0 && this.f8231w0) || i == 2 || i == 1) ? 3 : 1;
    }

    public final void m34717Ag() {
        mo31399hf(m34695Vf() && !this.f8228Q0 && (this.f8230v0 != 2 || m34696Uf()));
    }

    public final void m34715Bg(boolean z, CharSequence charSequence, boolean z2) {
        int i = z ? C1357a0.m37544i(89.0f) : 0;
        int i2 = z2 ? R.id.theme_color_textNegative : R.id.theme_color_textLight;
        if (i != this.f8217F0.m32822z() || this.f8217F0.m32823y(R.id.theme_color_background_textLight) != i2 || !C5070i.m24068c(this.f8217F0.m32827u(), charSequence)) {
            this.f8217F0.m32844e0(i);
            this.f8217F0.m32846d0(i2);
            this.f8217F0.m32856X(charSequence);
            if (!this.f8228Q0) {
                this.f8212A0.m34138r1(this.f8213B0.indexOf(this.f8217F0));
            }
            this.f8216E0.setInErrorState(z2);
        }
    }

    @Override
    public void mo419J(int i, View view) {
        if (i == R.id.btn_languageSettings) {
            m9291ac(new View$OnClickListenerC2355ev(this.f30168a, this.f30170b));
        } else if (i == R.id.btn_proxy) {
            this.f30170b.m2485dd().m3409x7(this, true);
        }
    }

    @Override
    public void mo8866Ja(int i, int i2) {
        C2546iq iqVar = this.f8212A0;
        if (iqVar != null) {
            if (i == 0 || i == 1) {
                iqVar.m34254A1();
            } else if (i == 2) {
                iqVar.m34245E1(i2);
            }
        }
        View$OnFocusChangeListenerC7069y1 y1Var = this.f8214C0;
        if (y1Var != null && (i == 0 || (i == 2 && i2 == R.string.Country))) {
            y1Var.setHint(R.string.Country);
        }
        if (this.f8216E0 == null) {
            return;
        }
        if (i == 0 || (i == 2 && i2 == m34699Rf())) {
            this.f8216E0.setHint(m34699Rf());
        }
    }

    @Override
    public void mo30700K(int i, C2964ra raVar, View$OnFocusChangeListenerC7069y1 y1Var, String str) {
        if (i == R.id.edit_first_name) {
            m34717Ag();
        }
    }

    @Override
    public void mo9397La() {
        super.mo9397La();
        C1408x.m37090d(this.f8216E0.getEditText(), this.f8215D0.getEditText(), this.f8214C0.getEditText());
    }

    public final void m34702Of(String str) {
        String D = C1363c0.m37473D(str);
        CharSequence text = this.f8215D0.getText();
        if (this.f8223L0 != null) {
            D = C1363c0.m37414v(text.toString(), D);
        }
        if (!str.equals(D)) {
            this.f8222K0 = true;
            C1399s0.m37205S(this.f8216E0.getEditText().getText(), str, D);
            this.f8222K0 = false;
        }
    }

    public final String m34701Pf() {
        C2964ra raVar = this.f8218G0;
        if (raVar != null) {
            return raVar.m32824x();
        }
        return null;
    }

    public final String m34700Qf() {
        C2964ra raVar = this.f8219H0;
        if (raVar != null) {
            return raVar.m32824x();
        }
        return null;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_phone;
    }

    public final int m34699Rf() {
        return this.f8230v0 == 1 ? R.string.NewPhone : R.string.login_PhoneNumber;
    }

    public final String m34698Sf() {
        return "+" + C1363c0.m37473D(this.f8215D0.getText().toString()) + C1363c0.m37473D(this.f8216E0.getText().toString());
    }

    public final C2397d m34697Tf(String str, TdApi.Error error) {
        String str2;
        String str3;
        String str4;
        int i;
        if (C5070i.m24062i(error.message)) {
            return null;
        }
        String str5 = error.message;
        str5.hashCode();
        if (str5.equals("PHONE_NUMBER_BANNED")) {
            String u1 = C4403w.m27823u1(R.string.email_LoginHelp, new Object[0]);
            str2 = C4403w.m27867j1(R.string.email_BannedNumber_text, str) + "\n\n" + this.f30170b.m2540a5();
            str4 = u1;
            str3 = C4403w.m27867j1(R.string.email_BannedNumber_subject, str);
            i = R.string.login_PHONE_NUMBER_BANNED;
        } else if (str5.equals("PHONE_NUMBER_INVALID")) {
            String u12 = C4403w.m27823u1(R.string.email_LoginHelp, new Object[0]);
            str2 = C4403w.m27867j1(R.string.email_InvalidNumber_text, str) + "\n\n" + this.f30170b.m2540a5();
            str4 = u12;
            str3 = C4403w.m27867j1(R.string.email_InvalidNumber_subject, str);
            i = R.string.login_PHONE_NUMBER_INVALID;
        } else if (this.f8230v0 != 0) {
            return null;
        } else {
            String u13 = C4403w.m27823u1(R.string.email_SmsHelp, new Object[0]);
            str3 = C4403w.m27867j1(R.string.email_LoginError_subject, error.message);
            str2 = C4403w.m27867j1(R.string.email_LoginError_text, str, C4779t2.m25379z5(error)) + "\n\n" + this.f30170b.m2540a5();
            str4 = u13;
            i = R.string.login_error;
        }
        return new C2397d(i, error, str4, str3, str2);
    }

    public final boolean m34696Uf() {
        String Pf = m34701Pf();
        return !C5070i.m24062i(Pf) && Pf.trim().length() > 0;
    }

    public final boolean m34695Vf() {
        return this.f8215D0.getText().length() > 0 && this.f8216E0.getText().length() > 0;
    }

    @Override
    public int mo418W9() {
        if (this.f8230v0 != 0 || this.f8231w0) {
            return 0;
        }
        return R.id.menu_login;
    }

    public boolean m34694Wf() {
        return this.f8231w0;
    }

    @Override
    public CharSequence mo9313X9() {
        String str;
        int i = this.f8230v0;
        boolean z = true;
        if (i == 0) {
            str = C4403w.m27871i1(this.f8231w0 ? R.string.AddAccount : R.string.YourPhone);
        } else if (i == 1) {
            str = C4403w.m27871i1(R.string.NewNumber);
        } else if (i == 2) {
            str = C4403w.m27871i1(R.string.AddContact);
        } else {
            throw new IllegalArgumentException("mode == " + this.f8230v0);
        }
        C10930q6 q6Var = this.f30170b;
        if (q6Var == null || !q6Var.m2949A1().m1504G()) {
            z = false;
        }
        return C4403w.m27836r0(str, z);
    }

    @Override
    public void mo30699Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        String str;
        int M;
        int i;
        int i2 = C1357a0.m37544i(72.0f);
        ((FrameLayout.LayoutParams) recyclerView.getLayoutParams()).topMargin = i2;
        if (this.f8230v0 != 2) {
            m34631df(R.drawable.baseline_arrow_forward_24);
        }
        recyclerView.setOverScrollMode(2);
        this.f8220I0 = new C6038h<>(3);
        int i3 = 1;
        if (this.f8230v0 != 2) {
            String[] g = C1367d0.m37402h().m37403g(this.f30170b);
            if (g != null) {
                this.f8220I0.m21467j(R.id.login_code, g[0]);
                this.f8220I0.m21467j(R.id.login_phone, g[1]);
                String[] b = C1367d0.m37402h().m37408b(g[0]);
                this.f8223L0 = b;
                if (b != null) {
                    this.f8220I0.m21467j(R.id.login_country, b[2]);
                }
            }
        } else if (!C5070i.m24062i(this.f8232x0)) {
            String str2 = this.f8232x0;
            String D = C1363c0.m37473D(str2);
            String w = C1363c0.m37413w(D);
            int indexOf = w.indexOf(32);
            if (indexOf != -1) {
                String substring = w.substring(1, indexOf);
                str2 = w.substring(indexOf + 1);
                str = substring;
            } else {
                str = null;
            }
            if (str == null && (M = C1363c0.m37464M(this.f8232x0)) != -1) {
                int length = D.length();
                int length2 = this.f8232x0.length();
                int i4 = 0;
                while (M < length2) {
                    int codePointAt = this.f8232x0.codePointAt(M);
                    int charCount = Character.charCount(codePointAt);
                    if (charCount != i3 || !C5070i.m24059l((char) codePointAt)) {
                        break;
                    }
                    int i5 = i4 + charCount;
                    String substring2 = this.f8232x0.substring(0, i5);
                    if (i5 == 4 || C1371f0.m37392c(substring2) == length) {
                        i = i5;
                        str = substring2;
                        break;
                    }
                    M += charCount;
                    i4 = i5;
                    str = substring2;
                    i3 = 1;
                }
                i = i4;
                str2 = this.f8232x0.substring(i);
            }
            if (!C5070i.m24062i(str)) {
                this.f8220I0.m21467j(R.id.login_code, str);
                String[] b2 = C1367d0.m37402h().m37408b(str);
                this.f8223L0 = b2;
                if (b2 != null) {
                    this.f8220I0.m21467j(R.id.login_country, b2[2]);
                }
            }
            this.f8220I0.m21467j(R.id.login_phone, str2);
        }
        if (this.f8223L0 == null && C5070i.m24062i(this.f8232x0)) {
            String[] d = C1367d0.m37402h().m37406d();
            this.f8223L0 = d;
            if (d != null) {
                this.f8220I0.m21467j(R.id.login_code, d[0]);
                this.f8220I0.m21467j(R.id.login_country, d[2]);
            }
        }
        FrameLayoutFix frameLayoutFix2 = new FrameLayoutFix(context);
        frameLayoutFix2.setPadding(C1357a0.m37544i(16.0f), C1357a0.m37544i(12.0f), C1357a0.m37544i(16.0f), 0);
        frameLayoutFix2.setLayoutParams(FrameLayoutFix.m18007t1(-1, i2, 48));
        View$OnFocusChangeListenerC7069y1 y1Var = new View$OnFocusChangeListenerC7069y1(context);
        this.f8214C0 = y1Var;
        y1Var.m17922J1(this);
        this.f8214C0.m17899n2();
        this.f8214C0.getEditText().setInputType(532593);
        this.f8214C0.getEditText().setImeOptions(6);
        this.f8214C0.setDoneListener(new View$OnFocusChangeListenerC7069y1.AbstractC7072c() {
            @Override
            public final boolean mo17894S0(View$OnFocusChangeListenerC7069y1 y1Var2) {
                boolean bg;
                bg = View$OnClickListenerC2393fk.this.m34689bg(y1Var2);
                return bg;
            }
        });
        this.f8214C0.setHint(R.string.Country);
        this.f8214C0.getEditText().setId(R.id.login_country);
        this.f8214C0.getEditText().setNextFocusDownId(R.id.login_code);
        this.f8214C0.setText(this.f8220I0.m21471f(R.id.login_country, ""));
        this.f8214C0.setTextListener(this);
        this.f8214C0.setFocusListener(this);
        frameLayoutFix2.addView(this.f8214C0);
        frameLayoutFix.addView(frameLayoutFix2);
        ArrayList<C2964ra> arrayList = new ArrayList<>(3);
        this.f8213B0 = arrayList;
        arrayList.add(new C2964ra(32));
        if (this.f8230v0 == 2) {
            ArrayList<C2964ra> arrayList2 = this.f8213B0;
            C2964ra b0 = new C2964ra(56, R.id.edit_first_name, 0, R.string.login_FirstName).m32850b0(this.f8233y0);
            this.f8218G0 = b0;
            arrayList2.add(b0);
            ArrayList<C2964ra> arrayList3 = this.f8213B0;
            C2964ra b02 = new C2964ra(56, R.id.edit_last_name, 0, R.string.login_LastName).m32850b0(this.f8234z0);
            this.f8219H0 = b02;
            arrayList3.add(b02);
        }
        int i6 = this.f8230v0;
        C2964ra d0 = new C2964ra(9, 0, 0, i6 == 2 ? 0 : i6 == 1 ? R.string.ChangePhoneHelp : R.string.login_SmsHint).m32846d0(R.id.theme_color_textLight);
        this.f8217F0 = d0;
        if (this.f8230v0 != 2) {
            this.f8213B0.add(d0);
        }
        recyclerView.m39425k(new C2394a());
        C2395b bVar = new C2395b(this, context);
        this.f8212A0 = bVar;
        bVar.m34253A2(this, true);
        if (this.f8230v0 == 2) {
            this.f8212A0.m34214S2(this);
        }
        this.f8212A0.m34119x2(this.f8213B0, this.f8231w0);
        recyclerView.setAdapter(this.f8212A0);
    }

    @Override
    public boolean mo30698af() {
        return m34677lg();
    }

    @Override
    public void mo17892b0(final View$OnFocusChangeListenerC7069y1 y1Var, boolean z) {
        if (z) {
            m9446Ed(y1Var.getEditText());
            if (y1Var.getEditText().getId() == R.id.login_country) {
                m34667qg(true);
                y1Var.post(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2393fk.m34688cg(View$OnFocusChangeListenerC7069y1.this);
                    }
                });
            }
        }
    }

    @Override
    public void mo30697bf(boolean z) {
        View$OnFocusChangeListenerC7069y1 y1Var = this.f8214C0;
        String str = null;
        y1Var.setBlockedText(z ? y1Var.getText().toString() : null);
        View$OnFocusChangeListenerC7069y1 y1Var2 = this.f8216E0;
        y1Var2.setBlockedText(z ? y1Var2.getText().toString() : null);
        View$OnFocusChangeListenerC7069y1 y1Var3 = this.f8215D0;
        if (z) {
            str = y1Var3.getText().toString();
        }
        y1Var3.setBlockedText(str);
        if (this.f8230v0 != 2) {
            m9387Md(z);
        }
    }

    @Override
    public boolean mo9271db() {
        return this.f8230v0 == 0;
    }

    @Override
    public void mo17889i2(View$OnFocusChangeListenerC7069y1 y1Var, CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        switch (y1Var.getEditText().getId()) {
            case R.id.login_code:
                String e = this.f8220I0.m21472e(R.id.login_code);
                if (e == null || !C5070i.m24068c(e, charSequence2)) {
                    this.f8220I0.m21467j(y1Var.getEditText().getId(), charSequence2);
                    String D = C1363c0.m37473D(charSequence2);
                    if (!charSequence2.equals(D)) {
                        this.f8215D0.setText(D);
                    } else {
                        m34649zg(D, true);
                        m34702Of(this.f8216E0.getEditText().getText().toString());
                        m34717Ag();
                    }
                    m34653xg(null);
                    if (charSequence2.length() == 4 && this.f8215D0.getEditText().getSelectionEnd() == charSequence2.length()) {
                        C1408x.m37088f(this.f8216E0.getEditText());
                        return;
                    }
                    return;
                }
                return;
            case R.id.login_country:
                if (this.f8228Q0) {
                    m34661tg(false);
                }
                m34671og(charSequence2.trim().toLowerCase());
                return;
            case R.id.login_phone:
                this.f8220I0.m21467j(y1Var.getEditText().getId(), charSequence2);
                if (!this.f8222K0) {
                    m34702Of(charSequence2);
                    m34717Ag();
                }
                m34653xg(null);
                return;
            default:
                return;
        }
    }

    @Override
    public boolean mo404jc(boolean z) {
        if (!this.f8228Q0) {
            return false;
        }
        m34667qg(false);
        m34649zg(this.f8220I0.m21471f(R.id.login_code, ""), this.f8224M0);
        return true;
    }

    public final boolean m34677lg() {
        TdApi.Function function;
        int g1;
        if (m34636Ue() || this.f8228Q0) {
            return false;
        }
        if (!m34695Vf()) {
            m34655wg(R.string.login_InvalidPhone);
            return true;
        }
        String D = C1363c0.m37473D(this.f8215D0.getText().toString());
        String D2 = C1363c0.m37473D(this.f8216E0.getText().toString());
        String str = D + D2;
        if (!this.f8231w0 || (g1 = this.f30170b.m2930B4().m4696g1(str, this.f30170b.m2949A1().m1504G())) == -1) {
            m34653xg(null);
            m34627if(true);
            final String str2 = "+" + str;
            int i = this.f8230v0;
            if (i == 0) {
                TdApi.SetAuthenticationPhoneNumber setAuthenticationPhoneNumber = new TdApi.SetAuthenticationPhoneNumber(str2, C4779t2.m25510h0());
                this.f30170b.m2875Eb(D, D2);
                function = setAuthenticationPhoneNumber;
            } else if (i == 1) {
                function = new TdApi.ChangePhoneNumber(str2, C4779t2.m25510h0());
            } else if (i == 2) {
                function = new TdApi.ImportContacts(new TdApi.Contact[]{new TdApi.Contact(str2, m34701Pf(), m34700Qf(), null, 0L)});
            } else {
                throw new IllegalArgumentException("mode == " + this.f8230v0);
            }
            this.f30170b.m2270r4().m14783o(function, new Client.AbstractC7865g() {
                @Override
                public final void mo255t2(TdApi.Object object) {
                    View$OnClickListenerC2393fk.this.m34692Yf(str2, object);
                }
            });
            return true;
        }
        this.f30170b.m2930B4().m4705e0(g1, 5, new AbstractC5917i() {
            @Override
            public final void mo1322a(boolean z) {
                View$OnClickListenerC2393fk.this.m34691Zf(z);
            }
        });
        return true;
    }

    public final void m34675mg() {
        if (!(this.f8215D0 == null || this.f8216E0 == null)) {
            StringBuilder sb2 = new StringBuilder(4);
            sb2.append("966");
            sb2.append(1);
            if (C1379j0.f5013g == 2) {
                for (int i = 0; i < 4; i++) {
                    sb2.append(C5069h.m24080n(0, 9));
                }
            } else {
                sb2.append("73");
                sb2.append(C5069h.m24080n(1, 9) + 50);
            }
            String sb3 = sb2.toString();
            this.f8215D0.setText("99");
            this.f8216E0.setText(sb3);
            m34677lg();
        }
    }

    public void m34673ng() {
        if (C1379j0.m37361J()) {
            m34677lg();
        }
    }

    public final void m34671og(final String str) {
        if (!C5070i.m24062i(str) && this.f8224M0) {
            str = "";
        }
        this.f8225N0 = str;
        if (str == null) {
            m34659ug(this.f8213B0, false);
        } else {
            C4383l.m28061a().m28060b(new Runnable() {
                @Override
                public final void run() {
                    View$OnClickListenerC2393fk.this.m34685fg(str);
                }
            });
        }
    }

    @Override
    public void onClick(View view) {
        C2964ra raVar;
        int id2 = view.getId();
        if (id2 == R.id.btn_syncContacts) {
            this.f8212A0.m34204W2(view);
        } else if (id2 == R.id.result && (raVar = (C2964ra) view.getTag()) != null && raVar.m32847d() != null) {
            m34669pg(raVar);
        }
    }

    @Override
    public void mo414p0(int i, View$OnClickListenerC9170d1 d1Var, LinearLayout linearLayout) {
        if (i == R.id.menu_login) {
            d1Var.m10103N1(linearLayout, R.id.btn_proxy, R.drawable.baseline_security_24, R.id.theme_color_headerIcon, this, C1357a0.m37544i(48.0f));
            d1Var.m10103N1(linearLayout, R.id.btn_languageSettings, R.drawable.baseline_language_24, R.id.theme_color_headerIcon, this, C1357a0.m37544i(48.0f));
        }
    }

    public final void m34669pg(C2964ra raVar) {
        String charSequence = raVar.m32827u().toString();
        this.f8220I0.m21467j(R.id.login_code, ((String) raVar.m32847d()).substring(1));
        this.f8214C0.m17900m2(charSequence, true);
        m34667qg(false);
        C1408x.m37088f(this.f8216E0.getEditText());
        C1379j0.m37337d0(new Runnable() {
            @Override
            public final void run() {
                View$OnClickListenerC2393fk.this.m34684gg();
            }
        });
    }

    public final void m34667qg(boolean z) {
        if (this.f8228Q0 != z) {
            this.f8228Q0 = z;
            this.f8214C0.getEditText().setNextFocusDownId(z ? -1 : R.id.login_code);
            if (z) {
                m34717Ag();
            } else {
                C1408x.m37088f((this.f8215D0.isEmpty() ? this.f8215D0 : this.f8216E0).getEditText());
                C1379j0.m37335e0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2393fk.this.m34683hg();
                    }
                }, 360L);
            }
            m34671og(z ? this.f8214C0.getText().toString().trim().toLowerCase() : null);
        }
    }

    public void m34665rg(String str, String str2, String str3) {
        this.f8232x0 = str;
        this.f8233y0 = str2;
        this.f8234z0 = str3;
    }

    @Override
    public void mo9166sc() {
        super.mo9166sc();
        if (!this.f8229R0) {
            this.f8229R0 = true;
            int i = this.f8230v0;
            if (i == 0) {
                m9280c9(R.id.controller_intro);
                if (C1379j0.m37361J()) {
                    m34675mg();
                }
            } else if (i == 1) {
                m9280c9(R.id.controller_editPhone);
            }
        }
    }

    public void m34663sg(boolean z) {
        if (!z || this.f8230v0 == 0) {
            this.f8231w0 = z;
            return;
        }
        throw new IllegalStateException();
    }

    public final void m34661tg(boolean z) {
        this.f8224M0 = z;
    }

    public final void m34659ug(ArrayList<C2964ra> arrayList, boolean z) {
        boolean z2 = true;
        boolean z3 = this.f8226O0 != z;
        this.f8226O0 = z;
        this.f8227P0 = z ? arrayList : null;
        if (z3) {
            this.f8298o0.setItemAnimator(this.f8300q0);
            this.f8212A0.m34119x2(arrayList, false);
            if (z) {
                C1379j0.m37335e0(new Runnable() {
                    @Override
                    public final void run() {
                        View$OnClickListenerC2393fk.this.m34682ig();
                    }
                }, 360L);
            }
        } else if (!z) {
        } else {
            if (arrayList.get(0).m32879A() != 24 || this.f8212A0.m34243F0().get(0).m32879A() != 24) {
                if (arrayList.size() == this.f8212A0.m34243F0().size()) {
                    Iterator<C2964ra> it = arrayList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        i++;
                        if (this.f8212A0.m34243F0().get(i).m32847d() != it.next().m32847d()) {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                        return;
                    }
                }
                this.f8212A0.m34205W1(arrayList);
                ((LinearLayoutManager) this.f8298o0.getLayoutManager()).m39525z2(0, 0);
            }
        }
    }

    public View$OnClickListenerC2393fk m34657vg(int i) {
        this.f8230v0 = i;
        return this;
    }

    public final void m34655wg(int i) {
        m34653xg(C4403w.m27871i1(i));
    }

    public final void m34653xg(CharSequence charSequence) {
        CharSequence charSequence2;
        boolean z = false;
        boolean z2 = charSequence != null;
        if (charSequence != null) {
            charSequence2 = charSequence;
        } else {
            int i = this.f8230v0;
            if (i == 2) {
                charSequence2 = null;
            } else {
                charSequence2 = C4403w.m27871i1(i == 1 ? R.string.ChangePhoneHelp : R.string.login_SmsHint);
            }
        }
        if (charSequence != null) {
            z = true;
        }
        m34715Bg(z2, charSequence2, z);
    }

    public final void m34651yg(long j, int i) {
        m9261ee(i > 1 ? C4403w.m27850n2(R.string.SuggestInvitingUserCommon, i, C4403w.m27845p(), m34701Pf()) : C4403w.m27855m1(R.string.SuggestInvitingUser, m34701Pf()), new int[]{R.id.btn_invite, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.Invite), C4403w.m27871i1(R.string.Cancel)}, new int[]{3, 1}, new int[]{R.drawable.baseline_person_add_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
            @Override
            public final boolean mo493A3(View view, int i2) {
                boolean kg;
                kg = View$OnClickListenerC2393fk.this.m34679kg(view, i2);
                return kg;
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

    public final void m34649zg(String str, boolean z) {
        String[] b = C1367d0.m37402h().m37408b(str);
        this.f8223L0 = b;
        m34661tg(z);
        this.f8214C0.m17900m2(b != null ? b[2] : null, true);
    }
}
