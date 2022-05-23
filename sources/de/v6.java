package de;

import ae.j;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ce.a0;
import ce.j0;
import ce.p0;
import ce.v;
import de.iq;
import gd.w;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.o;
import ie.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import me.vkryl.android.widget.FrameLayoutFix;
import ne.b2;
import ne.y1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import ud.d1;
import ud.h1;
import ud.j1;
import ud.s;
import ud.v4;
import yd.d;
import zd.hj;
import zd.o6;

public class v6 extends g6<b> implements h1, j1, iq.e {
    public y1 A0;
    public LinearLayout B0;
    public boolean C0;
    public boolean D0;
    public iq f9809v0;
    public TdApi.LanguagePackStringValueOrdinary f9810w0;
    public TdApi.LanguagePackStringValuePluralized f9811x0;
    public s f9812y0;
    public boolean f9813z0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void i4(y1 y1Var, boolean z10) {
            super.i4(y1Var, z10);
            if (z10) {
                v6.this.A0 = y1Var;
                v6.this.qf();
            } else if (v6.this.A0 == y1Var) {
                v6.this.A0 = null;
                v6.this.qf();
            }
        }

        @Override
        public void r1(ra raVar, ViewGroup viewGroup, y1 y1Var) {
            String c10 = v6.this.x9().f9817c.c();
            y1Var.getEditText().setInputType(c10.equals("language_rtl") || c10.equals("language_disable_lowercase") ? 2 : 16385);
            p0.j0(y1Var.getEditText(), false);
        }
    }

    public static class b {
        public c f9815a;
        public w.b f9816b;
        public w.c f9817c;
        public List<w.c> f9818d;

        public b(c cVar, w.b bVar, w.c cVar2) {
            this.f9815a = cVar;
            this.f9816b = bVar;
            this.f9817c = cVar2;
        }
    }

    public interface c {
        void t1(w.b bVar, w.c cVar);
    }

    public v6(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public static void rf(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized2) {
        languagePackStringValuePluralized.zeroValue = languagePackStringValuePluralized2.zeroValue;
        languagePackStringValuePluralized.oneValue = languagePackStringValuePluralized2.oneValue;
        languagePackStringValuePluralized.twoValue = languagePackStringValuePluralized2.twoValue;
        languagePackStringValuePluralized.fewValue = languagePackStringValuePluralized2.fewValue;
        languagePackStringValuePluralized.manyValue = languagePackStringValuePluralized2.manyValue;
        languagePackStringValuePluralized.otherValue = languagePackStringValuePluralized2.otherValue;
    }

    public static int wf(int i10) {
        if (i10 == 0) {
            return R.id.pluralZero;
        }
        if (i10 == 1) {
            return R.id.pluralOne;
        }
        if (i10 == 2) {
            return R.id.pluralTwo;
        }
        if (i10 == 3) {
            return R.id.pluralFew;
        }
        if (i10 == 4) {
            return R.id.pluralMany;
        }
        if (i10 == 5) {
            return R.id.pluralOther;
        }
        throw new IllegalArgumentException("form == " + i10);
    }

    public static CharSequence xf(w.d dVar) {
        String str;
        int[] iArr;
        int i10 = dVar.f12360a;
        boolean z10 = true;
        if (i10 == 0) {
            str = "zero";
        } else if (i10 == 1) {
            str = "one";
        } else if (i10 == 2) {
            str = "two";
        } else if (i10 == 3) {
            str = "few";
        } else if (i10 == 4) {
            str = "many";
        } else if (i10 == 5) {
            str = "other";
        } else {
            throw new IllegalArgumentException("form == " + dVar);
        }
        if (dVar.f12361b.length <= 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (int i11 : dVar.f12361b) {
            if (z10) {
                spannableStringBuilder.append((CharSequence) ": ");
                z10 = false;
            } else {
                spannableStringBuilder.append((CharSequence) ", ");
            }
            String valueOf = String.valueOf(i11);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) valueOf);
            spannableStringBuilder.setSpan(new o(ce.o.i(), R.id.theme_color_background_textLight), length, valueOf.length() + length, 33);
        }
        return spannableStringBuilder;
    }

    public boolean yf(boolean z10, View view, int i10) {
        if ((i10 != R.id.btn_discard && i10 != R.id.btn_save) || (i10 == R.id.btn_save && !Cf())) {
            return true;
        }
        if (z10 || !Bf()) {
            Zb();
        }
        return true;
    }

    public void zf(View view) {
        y1 y1Var;
        String charSequence = ((TextView) view).getText().toString();
        if (!i.i(charSequence) && (y1Var = this.A0) != null) {
            y1Var.getEditText().getText().replace(this.A0.getEditText().getSelectionStart(), this.A0.getEditText().getSelectionEnd(), charSequence);
        }
    }

    public final void Af() {
        b bVar;
        b x92 = x9();
        List<w.c> list = x92.f9818d;
        int indexOf = list != null ? list.indexOf(x92.f9817c) : -1;
        if (indexOf == -1 || indexOf >= list.size() - 1) {
            w.c a10 = x92.f9816b.a(x92.f9817c);
            if (a10 == null) {
                j0.z0("No more untranslated strings found", 0);
                return;
            }
            if (indexOf == -1) {
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(x92.f9817c);
            }
            bVar = new b(x92.f9815a, x92.f9816b, a10);
            bVar.f9818d = list;
        } else {
            bVar = new b(x92.f9815a, x92.f9816b, x92.f9818d.get(indexOf + 1));
            bVar.f9818d = list;
        }
        v6 v6Var = new v6(this.f24493a, this.f24495b);
        v6Var.Ad(bVar);
        ac(v6Var);
    }

    public final boolean Bf() {
        b x92 = x9();
        List<w.c> list = x92.f9818d;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int indexOf = list.indexOf(x92.f9817c);
        if (indexOf == -1) {
            indexOf = list.size();
        }
        if (indexOf <= 0) {
            return false;
        }
        b bVar = new b(x92.f9815a, x92.f9816b, x92.f9818d.get(indexOf - 1));
        bVar.f9818d = list;
        v6 v6Var = new v6(this.f24493a, this.f24495b);
        v6Var.Ad(bVar);
        ac(v6Var);
        return true;
    }

    public final boolean Cf() {
        int L0;
        b x92 = x9();
        w.c cVar = x92.f9817c;
        String c10 = cVar.c();
        int constructor = x92.f9817c.f12357a.value.getConstructor();
        if (constructor == -249256352) {
            String str = this.f9810w0.value;
            if (i.i(str)) {
                cVar.f12358b = false;
                ((TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value).value = cVar.b().value;
            } else {
                cVar.f12358b = true;
                ((TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value).value = str;
            }
            if (c10.equals("language_nameInEnglish")) {
                x92.f9816b.f12352a.name = str;
            } else if (c10.equals("language_name")) {
                x92.f9816b.f12352a.nativeName = str;
            }
        } else if (constructor == 1906840261) {
            int i10 = 0;
            for (w.d dVar : x92.f9816b.f12353b.f12363b) {
                if (i.i(dVar.a(this.f9811x0))) {
                    i10++;
                }
            }
            if (i10 == x92.f9816b.f12353b.f12363b.size()) {
                cVar.f12358b = false;
                rf((TdApi.LanguagePackStringValuePluralized) cVar.f12357a.value, w.d0(cVar.c(), x92.f9816b.f12354c.f12363b));
            } else if (i10 > 0) {
                for (w.d dVar2 : x92.f9816b.f12353b.f12363b) {
                    if (i.i(dVar2.a(this.f9811x0)) && (L0 = this.f9809v0.L0(wf(dVar2.f12360a))) != -1) {
                        View C = this.f8035o0.getLayoutManager().C(L0);
                        View childAt = C instanceof ViewGroup ? ((ViewGroup) C).getChildAt(0) : null;
                        if (childAt instanceof y1) {
                            ((y1) childAt).setInErrorState(true);
                        }
                    }
                }
                return false;
            } else {
                cVar.f12358b = true;
                rf((TdApi.LanguagePackStringValuePluralized) cVar.f12357a.value, this.f9811x0);
            }
        } else {
            throw new IllegalArgumentException(x92.f9817c.f12357a.toString());
        }
        x92.f9815a.t1(x92.f9816b, cVar);
        return true;
    }

    @Override
    public View G9() {
        return this.f9812y0;
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_more) {
            jb.c cVar = new jb.c(3);
            u0 u0Var = new u0(3);
            cVar.a(R.id.btn_copyLink);
            u0Var.a(R.string.CopyLink);
            if (x9().f9817c.f12357a.value.getConstructor() == -249256352) {
                cVar.a(R.id.btn_copyText);
                u0Var.a(R.string.LocalizationCopy);
                if (this.A0 != null && i.i(this.f9810w0.value)) {
                    cVar.a(R.id.btn_pasteText);
                    u0Var.a(R.string.LocalizationPaste);
                }
            }
            if (!we()) {
                cVar.a(R.id.btn_close);
                u0Var.a(R.string.LocalizationExit);
            }
            Yd(cVar.e(), u0Var.d(), 0);
        } else if (i10 == R.id.menu_btn_view) {
            String y12 = t2.y1(x9().f9817c.c());
            if (!v.v(this.f24493a, Uri.parse(y12), true)) {
                this.f24495b.hd().E7(this, y12, new hj.q().e());
            }
        }
    }

    @Override
    public void N5(int r2, de.ra r3, ne.y1 r4, java.lang.String r5) {
        throw new UnsupportedOperationException("Method not decompiled: de.v6.N5(int, de.ra, ne.y1, java.lang.String):void");
    }

    @Override
    public void P0(int i10) {
        switch (i10) {
            case R.id.btn_close:
                sf(true);
                return;
            case R.id.btn_copyLink:
                j0.i(t2.y1(x9().f9817c.c()), R.string.CopiedLink);
                return;
            case R.id.btn_copyText:
                j0.i(vf(), R.string.CopiedText);
                return;
            case R.id.btn_pasteText:
                if (this.A0 != null) {
                    String vf = vf();
                    if (!i.i(vf)) {
                        this.A0.getEditText().getText().replace(this.A0.getEditText().getSelectionStart(), this.A0.getEditText().getSelectionEnd(), vf);
                        this.D0 = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public int R9() {
        return R.id.controller_editLanguage;
    }

    @Override
    public int W9() {
        return R.id.menu_editLangPackString;
    }

    @Override
    public void Ze(Context context, FrameLayoutFix frameLayoutFix, RecyclerView recyclerView) {
        List<w.c> list;
        b x92 = x9();
        w.b bVar = x92.f9816b;
        s sVar = new s(context);
        this.f9812y0 = sVar;
        sVar.setThemedTextColor(this);
        this.f9812y0.A1(a0.i(49.0f), true);
        this.f9812y0.setTitle(bVar.f12352a.nativeName);
        this.f9813z0 = (x92.f9817c.f12358b || x92.f9816b.e() == 1) && ((list = x92.f9818d) == null || list.indexOf(x92.f9817c) == -1);
        this.C0 = x92.f9818d != null;
        a aVar = new a(this);
        this.f9809v0 = aVar;
        aVar.v2(this, true);
        this.f9809v0.O2(this);
        FrameLayout.LayoutParams r12 = FrameLayoutFix.r1(-1, -2, 80);
        r12.rightMargin = a0.i(72.0f);
        LinearLayout linearLayout = new LinearLayout(context);
        this.B0 = linearLayout;
        linearLayout.setGravity(1);
        this.B0.setOrientation(0);
        this.B0.setLayoutParams(r12);
        frameLayoutFix.addView(this.B0);
        pf();
        recyclerView.setAdapter(this.f9809v0);
        df(this.f9813z0 ? R.drawable.baseline_check_24 : R.drawable.baseline_arrow_forward_24);
        hf(true);
    }

    @Override
    public boolean jc(boolean z10) {
        if (!this.D0) {
            return Bf() || super.jc(z10);
        }
        sf(false);
        return true;
    }

    public final void pf() {
        HashSet hashSet = new HashSet();
        b x92 = x9();
        this.f9812y0.setSubtitle(x92.f9817c.c());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ra(36));
        w.c cVar = x92.f9817c;
        int constructor = cVar.f12357a.value.getConstructor();
        if (constructor == -249256352) {
            TdApi.LanguagePackStringValueOrdinary languagePackStringValueOrdinary = (TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value;
            this.f9810w0 = cVar.f12358b ? new TdApi.LanguagePackStringValueOrdinary(languagePackStringValueOrdinary.value) : new TdApi.LanguagePackStringValueOrdinary();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = cVar.b().value;
            if (!cVar.f12358b) {
                x92.f9816b.g(languagePackStringValueOrdinary.value, spannableStringBuilder, true, -1);
            } else {
                x92.f9816b.g(str, spannableStringBuilder, true, -1);
            }
            arrayList.add(new ra(9, (int) R.id.description, 0, (CharSequence) spannableStringBuilder, false));
            arrayList.add(new ra(11));
            arrayList.add(new ra(31, (int) R.id.string, 0, (int) R.string.LocalizationTranslation, false).b0(cVar.f12358b ? languagePackStringValueOrdinary.value : null));
            uf(hashSet, str);
        } else if (constructor == 1906840261) {
            TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) cVar.f12357a.value;
            TdApi.LanguagePackStringValuePluralized d02 = w.d0(cVar.c(), x92.f9816b.f12354c.f12363b);
            uf(hashSet, d02.zeroValue);
            uf(hashSet, d02.oneValue);
            uf(hashSet, d02.twoValue);
            uf(hashSet, d02.fewValue);
            uf(hashSet, d02.manyValue);
            uf(hashSet, d02.otherValue);
            this.f9811x0 = cVar.f12358b ? new TdApi.LanguagePackStringValuePluralized(languagePackStringValuePluralized.zeroValue, languagePackStringValuePluralized.oneValue, languagePackStringValuePluralized.twoValue, languagePackStringValuePluralized.fewValue, languagePackStringValuePluralized.manyValue, languagePackStringValuePluralized.otherValue) : new TdApi.LanguagePackStringValuePluralized();
            for (w.d dVar : x92.f9816b.f12354c.f12363b) {
                String a10 = dVar.a(d02);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                x92.f9816b.g(a10, spannableStringBuilder2, true, -1);
                arrayList.add(new ra(9, (int) R.id.description, 0, (CharSequence) spannableStringBuilder2, false));
            }
            arrayList.add(new ra(11));
            for (w.d dVar2 : x92.f9816b.f12353b.f12363b) {
                arrayList.add(new ra(31, wf(dVar2.f12360a), 0, xf(dVar2), false).b0(cVar.f12358b ? dVar2.a(languagePackStringValuePluralized) : null));
            }
        } else {
            throw new IllegalArgumentException(cVar.f12357a.toString());
        }
        this.f9809v0.s2(arrayList, false);
        tf(hashSet);
    }

    public final void qf() {
        y1 y1Var = this.A0;
        String charSequence = y1Var != null ? y1Var.getText().toString() : null;
        for (int i10 = 0; i10 < this.B0.getChildCount(); i10++) {
            TextView textView = (TextView) this.B0.getChildAt(i10);
            boolean z10 = charSequence != null && !charSequence.contains(textView.getText().toString());
            qd(textView);
            int i11 = z10 ? R.id.theme_color_textLink : R.id.theme_color_background_textLight;
            z8(textView, i11);
            textView.setTextColor(j.L(i11));
        }
    }

    @Override
    public boolean s9() {
        return this.C0;
    }

    @Override
    public void sc() {
        super.sc();
        this.C0 = false;
        d9(R9());
    }

    public final void sf(final boolean z10) {
        ee(w.m1(R.string.LocalizationEditConfirmPrompt, x9().f9817c.c()), new int[]{R.id.btn_save, R.id.btn_discard, R.id.btn_cancel}, new String[]{w.i1(R.string.LocalizationEditConfirmSave), w.i1(R.string.LocalizationEditConfirmDiscard), w.i1(R.string.Cancel)}, new int[]{3, 2, 1}, new int[]{R.drawable.baseline_check_24, R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
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
                boolean yf;
                yf = v6.this.yf(z10, view, i10);
                return yf;
            }
        });
    }

    public final void tf(Set<String> set) {
        this.B0.removeAllViews();
        if (!set.isEmpty()) {
            View.OnClickListener t6Var = new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    v6.this.zf(view);
                }
            };
            int size = set.size();
            String[] strArr = new String[size];
            set.toArray(strArr);
            Arrays.sort(strArr);
            for (int i10 = 0; i10 < size; i10++) {
                String str = strArr[i10];
                b2 b2Var = new b2(this.f24493a);
                b2Var.setTypeface(ce.o.i());
                b2Var.setTextColor(j.L(R.id.theme_color_background_textLight));
                b2Var.setText(str);
                b2Var.setTextSize(1, 16.0f);
                b2Var.setPadding(a0.i(12.0f), a0.i(30.0f), a0.i(12.0f), a0.i(30.0f));
                b2Var.setOnClickListener(t6Var);
                d.j(b2Var);
                p0.T(b2Var);
                z8(b2Var, R.id.theme_color_background_textLight);
                this.B0.addView(b2Var);
            }
        }
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_editLangPackString) {
            d1Var.L1(linearLayout, R.id.menu_btn_view, O9(), this, R.drawable.baseline_open_in_browser_24, a0.i(49.0f), R.drawable.bg_btn_header);
            d1Var.c2(linearLayout, this, O9());
        }
    }

    public final void uf(Set<String> set, String str) {
        Matcher matcher = x9().f9816b.b().matcher(str);
        while (matcher.find()) {
            set.add(matcher.group());
        }
    }

    @Override
    public boolean v5(View view) {
        if (!Cf()) {
            return true;
        }
        if (this.f9813z0) {
            cf();
            return true;
        }
        Af();
        return true;
    }

    public final String vf() {
        if (x9().f9817c.f12358b) {
            return x9().f9817c.b().value;
        }
        return ((TdApi.LanguagePackStringValueOrdinary) x9().f9817c.f12357a.value).value;
    }

    @Override
    public boolean we() {
        return !this.D0 && x9().f9818d == null;
    }
}
