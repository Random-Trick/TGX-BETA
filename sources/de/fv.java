package de;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce.c0;
import ce.j0;
import ce.x;
import de.qa;
import de.y00;
import ed.j;
import ed.k;
import gd.w;
import hd.t2;
import ie.g0;
import ie.h0;
import ie.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kb.i;
import ne.y1;
import ob.e;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.CustomRecyclerView;
import ud.v4;
import zd.o6;

public class fv extends vo<Void> implements View.OnClickListener, qa.c, View.OnLongClickListener {
    public iq D0;
    public boolean E0;
    public TdApi.LanguagePackInfo F0;

    public class a extends iq {
        public a(v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void R2(ra raVar, uc.c cVar, boolean z10) {
            if (raVar.j() == R.id.language) {
                TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) raVar.d();
                cVar.Z1(fv.this.F0 == languagePackInfo, z10);
                cVar.L1().c(languagePackInfo.f19945id.equals(w.k2()), z10);
                if (e.Z0(languagePackInfo)) {
                    cVar.setName(fv.Rh(languagePackInfo.nativeName));
                    String Rh = fv.Rh(languagePackInfo.name);
                    int floor = (int) Math.floor((languagePackInfo.translatedStringCount / languagePackInfo.totalStringCount) * 100.0f);
                    if (e.g1(languagePackInfo) || floor == 100) {
                        cVar.setData(Rh);
                    } else {
                        cVar.setData(w.j1(R.string.format_languageStatus, Rh, Integer.valueOf(floor)));
                    }
                } else {
                    if (raVar.Z(languagePackInfo.nativeName)) {
                        cVar.setName(languagePackInfo.nativeName);
                    }
                    cVar.setData(languagePackInfo.name);
                }
            }
        }
    }

    public class b implements j.b {
        public b() {
        }

        @Override
        public void a(RecyclerView.c0 c0Var) {
            ra raVar = (ra) c0Var.f2982a.getTag();
            if (raVar != null) {
                fv.this.Uh(raVar);
            }
        }

        @Override
        public boolean b(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i10) {
            TdApi.LanguagePackInfo languagePackInfo;
            ra raVar = (ra) c0Var.f2982a.getTag();
            return raVar != null && raVar.j() == R.id.language && (languagePackInfo = (TdApi.LanguagePackInfo) raVar.d()) != null && languagePackInfo.f19945id.startsWith("X");
        }

        @Override
        public float e() {
            return k.a(this);
        }
    }

    public class c extends fb.a {
        public c() {
        }

        @Override
        public boolean a(char c10) {
            return (c10 >= 'A' && c10 <= 'Z') || (c10 >= 'a' && c10 <= 'z') || c10 == '-';
        }
    }

    public fv(Context context, o6 o6Var) {
        super(context, o6Var);
    }

    public void Bh() {
        if (!Sa()) {
            hh();
        }
    }

    public void Ch(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                fv.this.Bh();
            }
        }, 200L);
    }

    public void Dh(TdApi.LanguagePackInfo languagePackInfo) {
        qa qaVar = new qa(this.f24493a, this.f24495b);
        qaVar.Ad(new qa.b(languagePackInfo, this));
        ac(qaVar);
    }

    public void Eh(Runnable runnable) {
        if (!Sa()) {
            runnable.run();
        }
    }

    public void Fh(final Runnable runnable, boolean z10) {
        if (z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    fv.this.Eh(runnable);
                }
            });
        }
    }

    public void Gh(final ra raVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    fv.this.Ih(raVar);
                }
            });
        }
    }

    public void Hh(TdApi.LanguagePackInfo languagePackInfo, Client.g gVar) {
        this.f24495b.v4().o(new TdApi.DeleteLanguagePack(languagePackInfo.f19945id), gVar);
    }

    public void Ih(ra raVar) {
        int F0;
        if (!Sa() && (F0 = this.D0.F0(raVar)) != -1) {
            int i10 = F0 - 1;
            ra raVar2 = this.D0.D0().get(F0 + 1);
            if (this.D0.D0().get(i10).A() == 11) {
                this.D0.R1(i10, 2);
            } else if (raVar2.A() == 11) {
                this.D0.R1(F0, 2);
            } else {
                this.D0.R1(F0 - 2, 6);
            }
        }
    }

    public void Kh(final TdApi.LanguagePackInfo languagePackInfo, boolean z10) {
        if (z10) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    fv.this.Jh(languagePackInfo);
                }
            });
        }
    }

    public boolean Lh(final TdApi.LanguagePackInfo languagePackInfo, ra raVar, View view, int i10) {
        switch (i10) {
            case R.id.btn_delete:
                Uh(raVar);
                return true;
            case R.id.btn_help:
                Oh();
                return true;
            case R.id.btn_new:
                hh();
                return true;
            case R.id.btn_share:
                if (e.h1(languagePackInfo) || languagePackInfo.f19945id.equals(w.k2())) {
                    Jh(languagePackInfo);
                    return true;
                }
                this.f24495b.Nc(languagePackInfo, new i() {
                    @Override
                    public final void a(boolean z10) {
                        fv.this.Kh(languagePackInfo, z10);
                    }
                });
                return true;
            case R.id.btn_shareLink:
                this.f24495b.hd().f8(this, languagePackInfo);
                return true;
            case R.id.btn_view:
                Ph(languagePackInfo);
                return true;
            default:
                return true;
        }
    }

    public boolean Mh(ra raVar, TdApi.LanguagePackInfo languagePackInfo, View view, int i10) {
        if (i10 != R.id.btn_delete) {
            return true;
        }
        Sh(raVar, languagePackInfo);
        return true;
    }

    public static ra Nh(TdApi.LanguagePackInfo languagePackInfo) {
        return new ra(90, (int) R.id.language, 0, (CharSequence) languagePackInfo.nativeName, false).G(languagePackInfo);
    }

    public static String Rh(String str) {
        int length;
        if (str.endsWith(" (raw)")) {
            length = str.length() - 6;
        } else if (!str.endsWith(" (beta)")) {
            return str;
        } else {
            length = str.length() - 7;
        }
        return str.substring(0, length);
    }

    public static int kh(TdApi.LanguagePackInfo languagePackInfo) {
        return e.g1(languagePackInfo) ? R.string.LanguageSectionInstalled : e.Z0(languagePackInfo) ? R.string.LanguageSectionRaw : R.string.LanguageSectionOfficial;
    }

    public void mh(TdApi.LanguagePackInfo languagePackInfo, Runnable runnable, boolean z10, TdApi.LanguagePackInfo languagePackInfo2, boolean z11, boolean z12) {
        if (!Sa()) {
            this.F0 = null;
            this.D0.o3(languagePackInfo);
            if (z12) {
                if (runnable != null) {
                    runnable.run();
                }
                if (z10) {
                    Zb();
                    return;
                }
                this.D0.o3(languagePackInfo);
                if (languagePackInfo2 != null) {
                    this.D0.o3(languagePackInfo2);
                }
                if (z11) {
                    j0.y0(R.string.LocalisationApplied, 0);
                }
            }
        }
    }

    public void nh(TdApi.LanguagePackInfo languagePackInfo) {
        if (!Sa()) {
            fh(languagePackInfo);
        }
    }

    public void oh(final TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == -722616727) {
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    fv.this.nh(languagePackInfo);
                }
            });
        }
    }

    public boolean ph(y1 y1Var, String str) {
        if (!str.matches("[A-Za-z\\-]*")) {
            return false;
        }
        final TdApi.LanguagePackInfo languagePackInfo = new TdApi.LanguagePackInfo("X" + str + "X-android-x-local", null, "Unknown (" + str + ")", "Unknown", w.w(str), false, false, false, true, 0, 0, 0, null);
        if (jh(languagePackInfo.f19945id) != null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new TdApi.LanguagePackString("language_code", new TdApi.LanguagePackStringValueOrdinary(str)));
        String str2 = languagePackInfo.f19945id;
        if (str2.startsWith("X")) {
            int indexOf = str2.indexOf(88, 1);
            if (indexOf == -1) {
                indexOf = str2.length();
            }
            str2 = str2.substring(1, indexOf);
        }
        if (w.N(str2, languagePackInfo)) {
            arrayList.add(new TdApi.LanguagePackString("language_nameInEnglish", new TdApi.LanguagePackStringValueOrdinary(languagePackInfo.name)));
            arrayList.add(new TdApi.LanguagePackString("language_name", new TdApi.LanguagePackStringValueOrdinary(languagePackInfo.nativeName)));
            if (str2.indexOf(45) != -1) {
                arrayList.add(new TdApi.LanguagePackString("language_dateFormatLocale", new TdApi.LanguagePackStringValueOrdinary(str2)));
            }
        }
        languagePackInfo.localStringCount = arrayList.size();
        TdApi.LanguagePackString[] languagePackStringArr = new TdApi.LanguagePackString[arrayList.size()];
        arrayList.toArray(languagePackStringArr);
        this.f24495b.v4().o(new TdApi.SetCustomLanguagePack(languagePackInfo, languagePackStringArr), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                fv.this.oh(languagePackInfo, object);
            }
        });
        return true;
    }

    public static Object qh(String str, CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
        if (i12 == 2) {
            return t2.K4(new TdApi.TextEntityTypeTextUrl(str));
        }
        return null;
    }

    public boolean rh(TdApi.LanguagePackInfo languagePackInfo, y1 y1Var, String str) {
        if (str.indexOf(47) != -1 && ib.i.i(str.trim())) {
            return false;
        }
        if (!str.endsWith(".xml")) {
            str = str + ".xml";
        }
        TdApi.InputMessageDocument inputMessageDocument = new TdApi.InputMessageDocument(new TdApi.InputFileGenerated(ib.i.B(str), "language_export_" + System.currentTimeMillis() + "_" + languagePackInfo.f19945id, 0), null, false, t2.L4(w.h1(R.string.ToolsExportText, new w.f() {
            @Override
            public final Object a(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
                Object qh;
                qh = fv.qh(r1, charSequence, i10, i11, i12, z10);
                return qh;
            }
        }, languagePackInfo.nativeName, languagePackInfo.name, "Telegram X")));
        final y00 y00Var = new y00(this.f24493a, this.f24495b);
        y00Var.Vi(new y00.m(inputMessageDocument));
        x.c(y1Var.getEditText());
        this.f24495b.hd().postDelayed(new Runnable() {
            @Override
            public final void run() {
                y00.this.ej();
            }
        }, 200L);
        return true;
    }

    public void sh(final TdApi.LanguagePackInfo languagePackInfo) {
        if (!Sa()) {
            String i12 = w.i1(R.string.FileName);
            CharSequence c02 = c0.c0(c0.l(this, "**" + w.i1(R.string.LocalizationFileNamePlaceholder) + "**.xml", null), R.id.theme_color_text);
            y1 Pc = Pc(i12, c02, R.string.Share, R.string.Cancel, ("android_x_" + w.w(languagePackInfo.f19945id)) + "_" + w.y1(System.currentTimeMillis(), TimeUnit.MILLISECONDS).replace('/', '.'), new v4.m() {
                @Override
                public final boolean a(y1 y1Var, String str) {
                    boolean rh;
                    rh = fv.this.rh(languagePackInfo, y1Var, str);
                    return rh;
                }
            }, true);
            if (Pc != null) {
                Pc.getEditText().setFilters(new InputFilter[]{new fb.b(new char[]{'/'})});
            }
        }
    }

    public void th(final TdApi.LanguagePackInfo languagePackInfo, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 1172082922) {
            if (((TdApi.LanguagePackStrings) object).strings.length == 0) {
                j0.y0(R.string.LanguageEmpty, 0);
                return;
            }
            for (int i10 : w.d1()) {
                if (w.E2(w.e1(i10), languagePackInfo.f19945id) == null) {
                    j0.y0(R.string.InvalidLocalisation, 0);
                    return;
                }
            }
            this.f24495b.hd().post(new Runnable() {
                @Override
                public final void run() {
                    fv.this.sh(languagePackInfo);
                }
            });
        }
    }

    public void uh(TdApi.LocalizationTargetInfo localizationTargetInfo) {
        if (!Sa()) {
            Qh(localizationTargetInfo);
        }
    }

    public void vh(List list, TdApi.Object object) {
        if (!Sa()) {
            this.E0 = false;
            if (list == null || !list.isEmpty()) {
                Qh(object);
            }
        }
    }

    public void wh(TdApi.LocalizationTargetInfo localizationTargetInfo, final TdApi.Object object) {
        final ArrayList arrayList;
        if (localizationTargetInfo == null || localizationTargetInfo.languagePacks.length <= 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            if (object.getConstructor() == -2048670809) {
                TdApi.LanguagePackInfo[] languagePackInfoArr = ((TdApi.LocalizationTargetInfo) object).languagePacks;
                e.q1(languagePackInfoArr, w.k2());
                Collections.addAll(arrayList, languagePackInfoArr);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) arrayList.get(size);
                    TdApi.LanguagePackInfo[] languagePackInfoArr2 = localizationTargetInfo.languagePacks;
                    int length = languagePackInfoArr2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        } else if (languagePackInfoArr2[i10].f19945id.equals(languagePackInfo.f19945id)) {
                            arrayList.remove(size);
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        this.f24495b.hd().post(new Runnable() {
            @Override
            public final void run() {
                fv.this.vh(arrayList, object);
            }
        });
    }

    public void xh(TdApi.Object object) {
        final TdApi.LocalizationTargetInfo localizationTargetInfo = object.getConstructor() == -2048670809 ? (TdApi.LocalizationTargetInfo) object : null;
        if (localizationTargetInfo != null) {
            TdApi.LanguagePackInfo[] languagePackInfoArr = localizationTargetInfo.languagePacks;
            if (languagePackInfoArr.length > 0) {
                e.q1(languagePackInfoArr, w.k2());
                this.f24495b.hd().post(new Runnable() {
                    @Override
                    public final void run() {
                        fv.this.uh(localizationTargetInfo);
                    }
                });
            }
        }
        this.f24495b.v4().o(new TdApi.GetLocalizationTargetInfo(false), new Client.g() {
            @Override
            public final void r2(TdApi.Object object2) {
                fv.this.wh(localizationTargetInfo, object2);
            }
        });
    }

    public static boolean yh(ra raVar) {
        return raVar.A() == 8 || raVar.A() == 70;
    }

    public static boolean zh(AlertDialog[] alertDialogArr, View view, o oVar) {
        if (alertDialogArr[0] != null) {
            try {
                alertDialogArr[0].dismiss();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override
    public void I5(TdApi.LanguagePackInfo languagePackInfo) {
        this.D0.o3(languagePackInfo);
    }

    @Override
    public void J(int i10, View view) {
        if (i10 == R.id.menu_btn_help) {
            Oh();
        }
    }

    public final void Oh() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24493a, ae.j.t());
        builder.setTitle(w.i1(R.string.TranslationMoreTitle));
        builder.setMessage(c0.l(this, w.i1(R.string.TranslationMoreText), new o.a() {
            @Override
            public final boolean a(View view, o oVar) {
                boolean zh;
                zh = fv.zh(r1, view, oVar);
                return zh;
            }
        }));
        builder.setPositiveButton(w.i1(R.string.TranslationMoreDone), ou.f9015a);
        builder.setNeutralButton(w.i1(R.string.TranslationMoreCreate), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i10) {
                fv.this.Ch(dialogInterface, i10);
            }
        });
        final AlertDialog[] alertDialogArr = {Xb(Sd(builder), 4)};
    }

    public final void Ph(final TdApi.LanguagePackInfo languagePackInfo) {
        final Runnable fuVar = new Runnable() {
            @Override
            public final void run() {
                fv.this.Dh(languagePackInfo);
            }
        };
        if (!w.k2().equals(languagePackInfo.f19945id)) {
            this.f24495b.Nc(languagePackInfo, new i() {
                @Override
                public final void a(boolean z10) {
                    fv.this.Fh(fuVar, z10);
                }
            });
        } else {
            fuVar.run();
        }
    }

    @Override
    public void Q5(int i10, int i11) {
        if (w.H1(i10, i11)) {
            super.Q5(i10, i11);
        } else if (i10 == 0 || i10 == 2) {
            Hd(X9());
            this.D0.X2(lu.f8682a);
        }
    }

    public final void Qh(TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -2048670809) {
            TdApi.LocalizationTargetInfo localizationTargetInfo = (TdApi.LocalizationTargetInfo) object;
            ArrayList arrayList = new ArrayList(localizationTargetInfo.languagePacks.length * 2);
            TdApi.LanguagePackInfo languagePackInfo = null;
            TdApi.LanguagePackInfo[] languagePackInfoArr = localizationTargetInfo.languagePacks;
            int length = languagePackInfoArr.length;
            int i10 = 0;
            boolean z10 = true;
            while (i10 < length) {
                TdApi.LanguagePackInfo languagePackInfo2 = languagePackInfoArr[i10];
                if (languagePackInfo != null && (e.g1(languagePackInfo) != e.g1(languagePackInfo2) || (!e.g1(languagePackInfo) && e.Z0(languagePackInfo) != e.Z0(languagePackInfo2)))) {
                    z10 = true;
                }
                if (z10) {
                    int kh = kh(languagePackInfo2);
                    if (kh != R.string.LanguageSectionOfficial || !arrayList.isEmpty()) {
                        if (!arrayList.isEmpty()) {
                            arrayList.add(new ra(3));
                        }
                        arrayList.add(new ra(arrayList.isEmpty() ? 70 : 8, 0, 0, kh));
                        arrayList.add(new ra(2));
                    }
                    z10 = false;
                } else {
                    arrayList.add(new ra(11));
                }
                arrayList.add(Nh(languagePackInfo2));
                i10++;
                languagePackInfo = languagePackInfo2;
            }
            arrayList.add(new ra(3));
            this.D0.s2(arrayList, false);
        } else if (constructor == -1679978726) {
            this.D0.t2(new ra[]{new ra(24, 0, 0, (CharSequence) t2.z5(object), false)}, false);
        }
        n9();
    }

    @Override
    public int R9() {
        return R.id.controller_language;
    }

    public final void Sh(final ra raVar, final TdApi.LanguagePackInfo languagePackInfo) {
        final Client.g ruVar = new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                fv.this.Gh(raVar, object);
            }
        };
        if (languagePackInfo.f19945id.equals(w.k2())) {
            TdApi.LanguagePackInfo jh = !ib.i.i(languagePackInfo.baseLanguagePackId) ? jh(languagePackInfo.baseLanguagePackId) : null;
            if (jh == null) {
                jh = jh(w.a0());
            }
            if (jh != null) {
                gh(jh, false, false, new Runnable() {
                    @Override
                    public final void run() {
                        fv.this.Hh(languagePackInfo, ruVar);
                    }
                });
                return;
            }
            return;
        }
        this.f24495b.v4().o(new TdApi.DeleteLanguagePack(languagePackInfo.f19945id), ruVar);
    }

    public final boolean Th(final de.ra r17) {
        throw new UnsupportedOperationException("Method not decompiled: de.fv.Th(de.ra):boolean");
    }

    public final void Uh(final ra raVar) {
        final TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) raVar.d();
        if (languagePackInfo != null && !languagePackInfo.isOfficial) {
            boolean h12 = e.h1(languagePackInfo);
            CharSequence m12 = w.m1(h12 ? R.string.DeleteLanguageConfirm : R.string.LanguageDeleteConfirm, languagePackInfo.nativeName, languagePackInfo.name, t2.G1(languagePackInfo));
            int[] iArr = {R.id.btn_delete, R.id.btn_cancel};
            String[] strArr = new String[2];
            strArr[0] = w.i1(h12 ? R.string.RemoveLanguage : R.string.LanguageDelete);
            strArr[1] = w.i1(R.string.Cancel);
            ee(m12, iArr, strArr, new int[]{2, 1}, new int[]{R.drawable.baseline_delete_forever_24, R.drawable.baseline_cancel_24}, new h0() {
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
                    boolean Mh;
                    Mh = fv.this.Mh(raVar, languagePackInfo, view, i10);
                    return Mh;
                }
            });
        }
    }

    @Override
    public int W9() {
        return R.id.menu_help;
    }

    @Override
    public CharSequence X9() {
        return w.i1(R.string.Language);
    }

    @Override
    public boolean dc() {
        return this.E0;
    }

    @Override
    public boolean dd() {
        return true;
    }

    public final void fh(TdApi.LanguagePackInfo languagePackInfo) {
        TdApi.LanguagePackInfo jh = jh(null);
        if (jh != null) {
            ra Nh = Nh(languagePackInfo);
            if (e.g1(jh)) {
                this.D0.D0().add(2, new ra(11));
                this.D0.D0().add(2, Nh);
                this.D0.M(2, 2);
                return;
            }
            this.D0.D0().add(0, new ra(2));
            this.D0.D0().add(0, new ra(8, 0, 0, R.string.LanguageSectionOfficial));
            this.D0.D0().add(0, new ra(3));
            this.D0.D0().add(0, Nh);
            this.D0.D0().add(0, new ra(2));
            this.D0.D0().add(0, new ra(70, 0, 0, R.string.LanguageSectionInstalled));
            this.D0.M(0, 6);
            ((LinearLayoutManager) kg().getLayoutManager()).z2(0, 0);
        }
    }

    public final void gh(final TdApi.LanguagePackInfo languagePackInfo, final boolean z10, final boolean z11, final Runnable runnable) {
        TdApi.LanguagePackInfo languagePackInfo2 = this.F0;
        if (languagePackInfo2 != languagePackInfo) {
            this.F0 = languagePackInfo;
            if (languagePackInfo2 != null) {
                this.D0.o3(languagePackInfo2);
            }
            final TdApi.LanguagePackInfo jh = jh(w.k2());
            if (languagePackInfo != null) {
                this.D0.o3(languagePackInfo);
                this.f24495b.M1(languagePackInfo, new i() {
                    @Override
                    public final void a(boolean z12) {
                        fv.this.mh(languagePackInfo, runnable, z10, jh, z11, z12);
                    }
                }, true);
            }
        }
    }

    public final void hh() {
        y1 Pc = Pc(w.i1(R.string.LocalizationCreateTitle), c0.c0(c0.l(this, w.i1(R.string.ToolsLocalePlaceholder), null), R.id.theme_color_text), R.string.LocalizationCreateDone, R.string.Cancel, null, new v4.m() {
            @Override
            public final boolean a(y1 y1Var, String str) {
                boolean ph;
                ph = fv.this.ph(y1Var, str);
                return ph;
            }
        }, true);
        if (Pc != null) {
            Pc.getEditText().setFilters(new InputFilter[]{new c(), new InputFilter.LengthFilter(46)});
        }
    }

    public final void Jh(final TdApi.LanguagePackInfo languagePackInfo) {
        this.f24495b.v4().o(new TdApi.GetLanguagePackStrings(languagePackInfo.f19945id, null), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                fv.this.th(languagePackInfo, object);
            }
        });
    }

    public final TdApi.LanguagePackInfo jh(String str) {
        for (ra raVar : this.D0.D0()) {
            if (raVar.j() == R.id.language) {
                TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) raVar.d();
                if (str == null || languagePackInfo.f19945id.equals(str)) {
                    return languagePackInfo;
                }
            }
        }
        return null;
    }

    public final boolean lh() {
        iq iqVar = this.D0;
        if (iqVar == null) {
            return false;
        }
        List<ra> D0 = iqVar.D0();
        for (int size = D0.size() - 1; size >= 0; size--) {
            ra raVar = D0.get(size);
            if (raVar.j() == R.id.language && e.Z0((TdApi.LanguagePackInfo) raVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.language) {
            TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) ((ra) view.getTag()).d();
            String k22 = w.k2();
            if (!k22.equals(languagePackInfo.f19945id)) {
                gh(languagePackInfo, !e.g1(languagePackInfo) && !e.Z0(languagePackInfo) && !k22.startsWith("X") && !k22.endsWith("-raw"), true, null);
            } else if (e.Z0(languagePackInfo) || e.g1(languagePackInfo) || lh()) {
                Th((ra) view.getTag());
            } else {
                Zb();
            }
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (view.getId() != R.id.language) {
            return false;
        }
        TdApi.LanguagePackInfo languagePackInfo = (TdApi.LanguagePackInfo) ((ra) view.getTag()).d();
        return (!e.Z0(languagePackInfo) || languagePackInfo.f19945id.equals(w.k2()) || lh()) && Th((ra) view.getTag());
    }

    @Override
    public boolean pg() {
        return true;
    }

    @Override
    public void rg(Context context, CustomRecyclerView customRecyclerView) {
        a aVar = new a(this);
        this.D0 = aVar;
        aVar.B2(this);
        customRecyclerView.setAdapter(this.D0);
        this.E0 = true;
        this.f24495b.v4().o(new TdApi.GetLocalizationTargetInfo(true), new Client.g() {
            @Override
            public final void r2(TdApi.Object object) {
                fv.this.xh(object);
            }
        });
        j.a(customRecyclerView, new b());
    }

    @Override
    public long y9(boolean z10) {
        return 300L;
    }
}
