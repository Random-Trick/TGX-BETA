package de;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import ce.a0;
import ce.j0;
import ce.v;
import de.v6;
import gd.l;
import gd.w;
import hd.t2;
import ib.i;
import ie.g0;
import ie.h0;
import ie.o;
import ie.u0;
import java.util.ArrayList;
import java.util.Iterator;
import ne.t1;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.d1;
import ud.s;
import ud.v4;
import zd.o6;

public class qa extends vo<b> implements View.OnClickListener, v6.c {
    public iq D0;
    public w.b E0;
    public boolean F0;
    public boolean G0;
    public s H0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            if (raVar.j() == R.id.btn_string) {
                w.c cVar2 = (w.c) raVar.d();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                qa.this.E0.f(cVar2, spannableStringBuilder, false);
                cVar.setTextColorId(cVar2.f12358b ? R.id.theme_color_text : R.id.theme_color_textNegative);
                cVar.setData(spannableStringBuilder);
            }
        }

        @Override
        public void o2(ra raVar, int i10, t1 t1Var) {
            t1Var.B1(w.q2(R.string.xStrings, raVar.l()));
        }
    }

    public static class b {
        public TdApi.LanguagePackInfo f9147a;
        public c f9148b;

        public b(TdApi.LanguagePackInfo languagePackInfo, c cVar) {
            this.f9147a = languagePackInfo;
            this.f9148b = cVar;
        }
    }

    public interface c {
        void I5(TdApi.LanguagePackInfo languagePackInfo);
    }

    public qa(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Hg(TdApi.Object object) {
        this.f24495b.ub(new TdApi.UpdateLanguagePackStrings("android_x", this.E0.f12352a.f19945id, null), false);
    }

    public boolean Ig(w.c cVar, View view, int i10) {
        switch (i10) {
            case R.id.btn_copyLink:
                j0.i(t2.y1(cVar.f12357a.key), R.string.CopiedLink);
                break;
            case R.id.btn_copyText:
                j0.i(((TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value).value, R.string.CopiedText);
                break;
            case R.id.btn_open:
                int constructor = cVar.f12357a.value.getConstructor();
                if (constructor != -249256352) {
                    if (constructor == 1906840261) {
                        int s12 = w.s1(cVar.f12357a.key);
                        for (w.d dVar : (cVar.f12358b ? this.E0.f12353b : this.E0.f12354c).f12363b) {
                            int[] iArr = dVar.f12361b;
                            if (iArr != null && iArr.length > 0) {
                                j0.z0(w.o2(s12, iArr[0]), 0);
                            }
                        }
                        break;
                    }
                } else {
                    j0.z0(((TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value).value, 1);
                    break;
                }
                break;
            case R.id.btn_string:
                v.x(t2.y1(cVar.f12357a.key));
                break;
        }
        return true;
    }

    public void Jg() {
        if (!Sa()) {
            Og();
            Gg(this.E0.f12355d, this.F0);
            n9();
        }
    }

    public void Kg() {
        this.E0 = w.E0(x9().f9147a);
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                qa.this.Jg();
            }
        });
    }

    public static boolean Lg(TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized, String str) {
        if (!(((((!i.i(languagePackStringValuePluralized.zeroValue) && languagePackStringValuePluralized.zeroValue.toLowerCase().contains(str)) || (!i.i(languagePackStringValuePluralized.oneValue) && languagePackStringValuePluralized.oneValue.toLowerCase().contains(str))) || (!i.i(languagePackStringValuePluralized.twoValue) && languagePackStringValuePluralized.twoValue.toLowerCase().contains(str))) || (!i.i(languagePackStringValuePluralized.fewValue) && languagePackStringValuePluralized.fewValue.toLowerCase().contains(str))) || (!i.i(languagePackStringValuePluralized.manyValue) && languagePackStringValuePluralized.manyValue.toLowerCase().contains(str)))) {
            return !i.i(languagePackStringValuePluralized.otherValue) && languagePackStringValuePluralized.otherValue.toLowerCase().contains(str);
        }
        return true;
    }

    public static boolean Mg(String str) {
        return str != null && (str.startsWith(" ") || str.endsWith(" ") || str.startsWith("\n") || str.endsWith("\n"));
    }

    @Override
    public void Ac() {
        super.Ac();
        Ng();
    }

    @Override
    public void Cc(String str) {
        Ae(!str.isEmpty(), true);
        if (str.equals(" ")) {
            ArrayList arrayList = new ArrayList();
            for (w.c cVar : this.E0.f12355d) {
                int constructor = cVar.f12357a.value.getConstructor();
                if (constructor != -249256352) {
                    if (constructor == 1906840261) {
                        TdApi.LanguagePackStringValuePluralized languagePackStringValuePluralized = (TdApi.LanguagePackStringValuePluralized) cVar.f12357a.value;
                        if (Mg(languagePackStringValuePluralized.zeroValue) || Mg(languagePackStringValuePluralized.oneValue) || Mg(languagePackStringValuePluralized.twoValue) || Mg(languagePackStringValuePluralized.fewValue) || Mg(languagePackStringValuePluralized.manyValue) || Mg(languagePackStringValuePluralized.otherValue)) {
                            arrayList.add(cVar);
                        }
                    }
                } else if (Mg(((TdApi.LanguagePackStringValueOrdinary) cVar.f12357a.value).value)) {
                    arrayList.add(cVar);
                }
            }
            Gg(arrayList, this.F0);
            return;
        }
        String lowerCase = str.toLowerCase();
        if (i.i(lowerCase)) {
            Gg(this.E0.f12355d, this.F0);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<w.c> arrayList3 = new ArrayList(this.E0.f12355d);
        for (w.c cVar2 : arrayList3) {
            if (cVar2.f12357a.key.toLowerCase().startsWith(lowerCase)) {
                arrayList2.add(cVar2);
            }
        }
        arrayList3.removeAll(arrayList2);
        for (w.c cVar3 : arrayList3) {
            int constructor2 = cVar3.f12357a.value.getConstructor();
            if (constructor2 != -249256352) {
                if (constructor2 == 1906840261 && Lg((TdApi.LanguagePackStringValuePluralized) cVar3.f12357a.value, lowerCase)) {
                    arrayList2.add(cVar3);
                }
            } else if (((TdApi.LanguagePackStringValueOrdinary) cVar3.f12357a.value).value.toLowerCase().contains(lowerCase)) {
                arrayList2.add(cVar3);
            }
        }
        arrayList3.removeAll(arrayList2);
        for (w.c cVar4 : arrayList3) {
            if (cVar4.f12358b) {
                int constructor3 = cVar4.f12357a.value.getConstructor();
                if (constructor3 != -249256352) {
                    if (constructor3 == 1906840261 && cVar4.f12358b && Lg(cVar4.a(this.E0.f12354c.f12363b), lowerCase)) {
                        arrayList2.add(cVar4);
                    }
                } else if (cVar4.f12358b && cVar4.b().value.toLowerCase().contains(lowerCase)) {
                    arrayList2.add(cVar4);
                }
            }
        }
        Gg(arrayList2, this.F0);
    }

    @Override
    public View G9() {
        return this.H0;
    }

    public final void Gg(java.util.List<gd.w.c> r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: de.qa.Gg(java.util.List, boolean):void");
    }

    @Override
    public void J(int i10, View view) {
        if (i10 != R.id.menu_btn_toggle) {
            super.J(i10, view);
        } else if (this.E0 != null) {
            this.F0 = !this.F0;
            Og();
            kg().C1();
            Ng();
            w.b bVar = this.E0;
            if (bVar != null) {
                Gg(bVar.f12355d, this.F0);
            }
        }
    }

    @Override
    public boolean Je() {
        return true;
    }

    public final void Ng() {
        d1 d1Var = this.R;
        if (d1Var != null) {
            d1Var.Q3(W9(), R.id.menu_btn_toggle, 0, this.F0 ? R.drawable.baseline_indeterminate_check_box_24 : R.drawable.baseline_check_box_outline_blank_24);
        }
    }

    public final void Og() {
        String str;
        int e10 = this.E0.e();
        int size = this.E0.f12355d.size();
        s sVar = this.H0;
        if (this.F0) {
            str = w.o2(R.string.TranslationsMissing, e10);
        } else {
            int i10 = size - e10;
            str = w.j1(R.string.format_languageStatus, w.o2(R.string.xStrings, i10), Integer.valueOf((int) Math.floor((i10 / size) * 100.0f)));
        }
        sVar.setSubtitle(str);
    }

    public final void Pg() {
        this.H0.setTitle(x9().f9147a.nativeName);
    }

    @Override
    public void Q5(int i10, int i11) {
        if (i10 == 0) {
            this.E0.h();
        } else if (i10 == 2) {
            Iterator<w.c> it = this.E0.f12355d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w.c next = it.next();
                if (w.s1(next.c()) == i11) {
                    next.e(this.E0);
                    break;
                }
            }
        }
        Og();
        super.Q5(i10, i11);
    }

    @Override
    public int R9() {
        return R.id.controller_strings;
    }

    @Override
    public int W9() {
        return R.id.menu_editLangPack;
    }

    @Override
    public CharSequence X9() {
        return w.i1(this.F0 ? R.string.ToolsUntranslatedTitle : R.string.ToolsAllTitle);
    }

    @Override
    public void Z8() {
        super.Z8();
        if (this.G0) {
            this.f24495b.v4().o(new TdApi.SetAlarm(), new Client.g() {
                @Override
                public final void r2(TdApi.Object object) {
                    qa.this.Hg(object);
                }
            });
            this.G0 = false;
        }
    }

    @Override
    public boolean dc() {
        return this.E0 == null;
    }

    @Override
    public int la() {
        return R.id.menu_clear;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_string) {
            final w.c cVar = (w.c) ((ra) view.getTag()).d();
            if (x9().f9147a.f19945id.startsWith("X")) {
                id();
                v6 v6Var = new v6(this.f24493a, this.f24495b);
                v6Var.Ad(new v6.b(this, this.E0, cVar));
                ac(v6Var);
                return;
            }
            jb.c cVar2 = new jb.c(3);
            jb.c cVar3 = new jb.c(3);
            u0 u0Var = new u0(3);
            cVar2.a(R.id.btn_string);
            u0Var.a(R.string.ToolsOpenOnPlatform);
            cVar3.a(R.drawable.baseline_open_in_browser_24);
            cVar2.a(R.id.btn_copyLink);
            u0Var.a(R.string.CopyLink);
            cVar3.a(R.drawable.baseline_link_24);
            if (cVar.f12357a.value instanceof TdApi.LanguagePackStringValueOrdinary) {
                cVar2.a(R.id.btn_copyText);
                u0Var.a(R.string.ToolsCopyString);
                cVar3.a(R.drawable.baseline_content_copy_24);
            }
            cVar2.a(R.id.btn_open);
            u0Var.a(R.string.ToolsShowToast);
            cVar3.a(R.drawable.baseline_visibility_24);
            String str = cVar.f12357a.key;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.setSpan(new o(ce.o.h(), R.id.theme_color_textNeutral).j(new TdApi.TextEntityTypeItalic()), 0, str.length(), 33);
            ee(Spannable.Factory.getInstance().newSpannable(spannableStringBuilder), cVar2.e(), u0Var.d(), null, cVar3.e(), new h0() {
                @Override
                public boolean P() {
                    return g0.a(this);
                }

                @Override
                public Object a2(int i10) {
                    return g0.b(this, i10);
                }

                @Override
                public final boolean r3(View view2, int i10) {
                    boolean Ig;
                    Ig = qa.this.Ig(cVar, view2, i10);
                    return Ig;
                }
            });
        }
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        s sVar = new s(context);
        this.H0 = sVar;
        sVar.setThemedTextColor(this);
        this.H0.A1(a0.i(49.0f) * 2, true);
        Pg();
        this.H0.setSubtitle(x9().f9147a.name);
        this.D0 = new a(this);
        customRecyclerView.setItemAnimator(null);
        customRecyclerView.setAdapter(this.D0);
        l.a().b(new Runnable() {
            @Override
            public final void run() {
                qa.this.Kg();
            }
        });
    }

    @Override
    public void t1(w.b bVar, w.c cVar) {
        this.f24495b.v4().o(new TdApi.SetCustomLanguagePackString(bVar.f12352a.f19945id, cVar.f12358b ? cVar.f12357a : new TdApi.LanguagePackString(cVar.c(), w.g())), this.f24495b.na());
        String c10 = cVar.c();
        char c11 = 65535;
        int hashCode = c10.hashCode();
        if (hashCode != -412800396) {
            if (hashCode != -412485870) {
                if (hashCode == 1441529497 && c10.equals("language_nameInEnglish")) {
                    c11 = 1;
                }
            } else if (c10.equals("language_name")) {
                c11 = 0;
            }
        } else if (c10.equals("language_code")) {
            c11 = 2;
        }
        if (c11 == 0) {
            Pg();
            x9().f9148b.I5(bVar.f12352a);
        } else if (c11 == 1) {
            x9().f9148b.I5(bVar.f12352a);
        }
        if (c10.startsWith("language_")) {
            this.G0 = true;
        } else if (w.k2().equals(bVar.f12352a.f19945id)) {
            o6 o6Var = this.f24495b;
            String str = bVar.f12352a.f19945id;
            TdApi.LanguagePackString[] languagePackStringArr = new TdApi.LanguagePackString[1];
            languagePackStringArr[0] = cVar.f12358b ? cVar.f12357a : new TdApi.LanguagePackString(cVar.c(), w.g());
            o6Var.ub(new TdApi.UpdateLanguagePackStrings("android_x", str, languagePackStringArr), false);
        }
        this.D0.o3(cVar);
        Og();
    }

    @Override
    public void u1(int i10, d1 d1Var, LinearLayout linearLayout) {
        if (i10 == R.id.menu_clear) {
            d1Var.O1(linearLayout, ia(), B9());
        } else if (i10 != R.id.menu_editLangPack) {
            super.u1(i10, d1Var, linearLayout);
        } else {
            d1Var.K1(linearLayout, R.id.menu_btn_toggle, R.drawable.baseline_check_box_outline_blank_24, R.id.theme_color_headerIcon, this, a0.i(49.0f));
            d1Var.g2(linearLayout, this);
        }
    }

    @Override
    public void xc() {
        Gg(this.E0.f12355d, this.F0);
    }
}
