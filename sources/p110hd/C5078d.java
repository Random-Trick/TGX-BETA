package p110hd;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import be.C1357a0;
import be.C1366d;
import be.C1374h;
import be.C1379j0;
import be.C1410y;
import gd.C4779t2;
import ge.C4868i;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.vkryl.leveldb.LevelDB;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p082fd.C4356b0;
import p108hb.C5068g;
import p108hb.C5070i;
import p139jb.AbstractC5917i;
import p154kb.C6227d;
import p181mb.C6815f;
import p258s2.C8630c;

public class C5078d {
    public static C5078d f17092l;
    public static final Comparator<C5094n> f17093m = C5077c.f17091a;
    public ArrayList<C5094n> f17099f;
    public Map<String, String> f17100g;
    public Map<String, String[]> f17101h;
    public HashMap<String, C5095o> f17103j;
    public final int f17104k;
    public final C6227d<AbstractC5082d> f17095b = new C6227d<>();
    public final AbstractC5081c f17096c = new C5079a();
    public C5085g f17097d = new C5085g(C4868i.m24726c2().m24828O0());
    public final C6815f<StringBuilder> f17098e = new C6815f<>();
    public String f17102i = C4868i.m24726c2().m24856K0();
    public final HashMap<CharSequence, C5088i> f17094a = new HashMap<>(C1374h.m37381h());

    public class C5079a implements AbstractC5081c {
        public C5079a() {
        }

        @Override
        public int mo22953b() {
            return 0;
        }

        @Override
        public boolean mo22950c() {
            return false;
        }
    }

    public interface AbstractC5080b {
        boolean mo8269k(CharSequence charSequence, CharSequence charSequence2, C5088i iVar, int i, int i2);
    }

    public interface AbstractC5081c {
        int mo22953b();

        boolean mo22950c();
    }

    public interface AbstractC5082d {
        void mo23985e(int i, int i2);

        void mo23984i(int i, C5094n nVar);

        void mo23983n(String str);

        void mo23982s(int i, C5094n nVar);

        void mo23981t(String str, String str2, String[] strArr);
    }

    public C5078d() {
        m23991u();
        m23996p();
        m23992t();
        int c = C5085g.m23978c();
        this.f17104k = 66 / c;
        int i = 0;
        while (true) {
            String[][] strArr = C1374h.f4995h;
            if (i < strArr.length) {
                int ceil = (int) Math.ceil(strArr[i].length / 4.0f);
                int i2 = 0;
                while (true) {
                    String[][] strArr2 = C1374h.f4995h;
                    if (i2 < strArr2[i].length) {
                        int i3 = i2 / ceil;
                        int i4 = i2 - (i3 * ceil);
                        int[][] iArr = C1366d.f4979a;
                        int i5 = i4 % iArr[i][i3];
                        int i6 = i4 / iArr[i][i3];
                        int i7 = (int) (C1366d.f4980b[i][i3] * (2.2f / c));
                        int i8 = i7 * i5;
                        int i9 = this.f17104k;
                        int i10 = (i5 * i9) + i8;
                        int i11 = (i6 * i9) + (i7 * i6);
                        int i12 = this.f17104k;
                        this.f17094a.put(strArr2[i][i2], new C5088i(new Rect(i10, i11, i10 + i12, i12 + i11), i, i3));
                        i2++;
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void m24031B(C4868i.C4874f fVar, AbstractC5917i iVar) {
        boolean z = false;
        try {
            z = m23987y(fVar.f16665a, fVar.f16663O);
        } catch (IOException e) {
            Log.m14725e("Unable to install emoji pack:%s", e, fVar.f16665a);
        }
        if (z) {
            C4868i.m24726c2().m24590t2(fVar);
            C5068g.m24098e(fVar.f16663O.local.path);
        }
        iVar.mo1322a(z);
    }

    public static boolean m24030C(File file, String str) {
        return !str.equals(".nomedia");
    }

    public static int m24029D(C5094n nVar, C5094n nVar2) {
        C5095o oVar = nVar.f17130b;
        int i = oVar.f17131a;
        C5095o oVar2 = nVar2.f17130b;
        int i2 = oVar2.f17131a;
        int i3 = oVar.f17132b;
        int i4 = oVar2.f17132b;
        if (i <= i2) {
            if (i < i2) {
                return 1;
            }
            if (i3 <= i4) {
                if (i3 < i4) {
                    return 1;
                }
                return nVar.f17129a.compareTo(nVar2.f17129a);
            }
        }
        return -1;
    }

    public static String m24026G(String str, String str2) {
        if (C5070i.m24061i(str) || str.length() % 2 != 0) {
            return null;
        }
        try {
            byte[] a = C8630c.m11881a(str);
            if (a != null && a.length > 0) {
                return new String(a, str2);
            }
        } catch (Throwable th) {
            Log.m14713v(th);
        }
        return null;
    }

    public static String m24013T(int i) {
        if (i == 0) {
            return "#⃣";
        }
        return i + "⃣";
    }

    public static boolean m23999m(String str, String str2) {
        int length = str.length();
        while (length > 0 && str.charAt(length - 1) == 65039) {
            length--;
        }
        int length2 = str2.length();
        while (length2 > 0 && str2.charAt(length2 - 1) == 65039) {
            length2--;
        }
        if (length != str.length()) {
            str = str.substring(0, length);
        }
        if (length2 != str2.length()) {
            str2 = str2.substring(0, length2);
        }
        return str.equals(str2);
    }

    public static String m23998n(String str) {
        AbstractC5090k[] kVarArr;
        CharSequence I = m23986z().m24024I(str);
        if (!(I instanceof Spanned) || (kVarArr = (AbstractC5090k[]) ((Spanned) I).getSpans(0, I.length(), AbstractC5090k.class)) == null || kVarArr.length <= 0) {
            return null;
        }
        Spanned spanned = (Spanned) I;
        int spanStart = spanned.getSpanStart(kVarArr[0]);
        int spanEnd = spanned.getSpanEnd(kVarArr[0]);
        if (!(spanStart == 0 && spanEnd == I.length())) {
            I = I.subSequence(spanStart, spanEnd);
        }
        return I.toString();
    }

    public static File m23993s() {
        return new File(C1379j0.m37315n().getFilesDir(), "emoji");
    }

    public static C5078d m23986z() {
        if (f17092l == null) {
            synchronized (C5078d.class) {
                if (f17092l == null) {
                    f17092l = new C5078d();
                }
            }
        }
        return f17092l;
    }

    public boolean m24032A(String str) {
        AbstractC5090k[] kVarArr;
        CharSequence J = m23986z().m24023J(str, 0, str.length(), this.f17096c);
        if (!(J instanceof Spanned) || (kVarArr = (AbstractC5090k[]) ((Spanned) J).getSpans(0, J.length(), AbstractC5090k.class)) == null || kVarArr.length != 1) {
            return false;
        }
        Spanned spanned = (Spanned) J;
        return spanned.getSpanStart(kVarArr[0]) == 0 && spanned.getSpanEnd(kVarArr[0]) == J.length();
    }

    public AbstractC5090k m24028E(CharSequence charSequence, C5088i iVar) {
        if (C5070i.m24061i(charSequence)) {
            return null;
        }
        if (iVar == null && (iVar = m23995q(charSequence)) == null) {
            return null;
        }
        return C5091l.m23965d(charSequence, iVar);
    }

    public String[] m24027F(String str) {
        String[] strArr = this.f17101h.get(str);
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr;
    }

    public void m24025H(AbstractC5082d dVar) {
        this.f17095b.remove(dVar);
    }

    public CharSequence m24024I(CharSequence charSequence) {
        return m24022K(charSequence, 0, charSequence != null ? charSequence.length() : 0, null, null);
    }

    public CharSequence m24023J(CharSequence charSequence, int i, int i2, AbstractC5081c cVar) {
        return m24022K(charSequence, i, i2, cVar, null);
    }

    public java.lang.CharSequence m24022K(java.lang.CharSequence r34, int r35, int r36, p110hd.C5078d.AbstractC5081c r37, p110hd.C5078d.AbstractC5080b r38) {
        throw new UnsupportedOperationException("Method not decompiled: p110hd.C5078d.m24022K(java.lang.CharSequence, int, int, hd.d$c, hd.d$b):java.lang.CharSequence");
    }

    public final void m24021L(SharedPreferences.Editor editor) {
        C4868i.m24726c2().m24915B4(this.f17100g, editor);
    }

    public final void m24020M() {
        C4868i.m24726c2().m24908C4(this.f17103j);
    }

    public final void m24019N(SharedPreferences.Editor editor) {
        C4868i.m24726c2().m24887F4(this.f17101h, editor);
    }

    public void m24018O(String str) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        m23991u();
        Iterator<C5094n> it = this.f17099f.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().f17129a.equals(str)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            C5094n remove = this.f17099f.remove(i);
            C5095o oVar = remove.f17130b;
            oVar.f17132b = currentTimeMillis;
            oVar.f17131a++;
            int binarySearch = Collections.binarySearch(this.f17099f, remove, f17093m);
            if (binarySearch >= 0) {
                this.f17099f.add(i, remove);
            } else {
                int i2 = (-binarySearch) - 1;
                this.f17099f.add(i2, remove);
                if (i2 != i) {
                    Iterator<AbstractC5082d> it2 = this.f17095b.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo23985e(i, i2);
                    }
                    z = true;
                }
            }
        } else {
            C5095o oVar2 = this.f17103j.get(str);
            if (oVar2 == null) {
                oVar2 = new C5095o(1, currentTimeMillis);
                this.f17103j.put(str, oVar2);
            } else {
                oVar2.f17132b = currentTimeMillis;
                oVar2.f17131a++;
            }
            C5094n nVar = new C5094n(str, oVar2);
            int binarySearch2 = Collections.binarySearch(this.f17099f, nVar, f17093m);
            if (binarySearch2 < 0) {
                int i3 = (-binarySearch2) - 1;
                if (this.f17099f.size() < 40) {
                    this.f17099f.add(i3, nVar);
                    Iterator<AbstractC5082d> it3 = this.f17095b.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo23984i(i3, nVar);
                    }
                } else if (i3 < 40) {
                    this.f17099f.set(i3, nVar);
                    Iterator<AbstractC5082d> it4 = this.f17095b.iterator();
                    while (it4.hasNext()) {
                        it4.next().mo23982s(i3, nVar);
                    }
                }
                z = true;
            }
        }
        m24017P(z);
    }

    public final void m24017P(boolean z) {
        m24020M();
        if (z) {
            C4868i.m24726c2().m24866I4(this.f17099f);
        }
    }

    public boolean m24016Q(String str, String str2, String[] strArr) {
        String str3;
        String[] strArr2;
        boolean z;
        LevelDB levelDB = null;
        if (C5070i.m24061i(str2)) {
            str3 = C5070i.m24061i(this.f17102i) ? null : "";
            strArr2 = null;
        } else {
            str3 = (!C5070i.m24067c(str2, this.f17102i) || strArr != null) ? str2 : null;
            strArr2 = strArr;
        }
        boolean z2 = false;
        if (str3 == null) {
            z = this.f17100g.remove(str) != null;
        } else {
            String str4 = this.f17100g.get(str);
            boolean z3 = str4 == null || !C5070i.m24067c(str4, str3);
            if (z3) {
                this.f17100g.put(str, str3);
            }
            z = z3;
        }
        if (strArr2 != null) {
            String[] strArr3 = this.f17101h.get(str);
            if (strArr3 == null || !Arrays.equals(strArr3, strArr2)) {
                z2 = true;
            }
            if (z2) {
                this.f17101h.put(str, strArr2);
            }
        } else if (this.f17101h.remove(str) != null || z) {
            z2 = true;
        }
        if (z || z2) {
            if (z && z2) {
                levelDB = C4868i.m24726c2().m24773W();
            }
            if (z) {
                m24021L(levelDB);
            }
            if (z2) {
                m24019N(levelDB);
            }
            if (levelDB != null) {
                levelDB.apply();
            }
            Iterator<AbstractC5082d> it = this.f17095b.iterator();
            while (it.hasNext()) {
                it.next().mo23981t(str, str2, strArr2);
            }
        }
        return z;
    }

    public boolean m24015R(String str) {
        if (!C5070i.m24067c(this.f17102i, str)) {
            this.f17102i = str;
            C4868i.m24726c2().m24901D4(str, this.f17100g);
        } else if (!m24003i()) {
            return false;
        }
        Iterator<AbstractC5082d> it = this.f17095b.iterator();
        while (it.hasNext()) {
            it.next().mo23983n(str);
        }
        return true;
    }

    public AbstractC5081c m24014S() {
        return this.f17096c;
    }

    public String m24012U(String str) {
        String str2 = this.f17100g.get(str);
        if (str2 == null) {
            return this.f17102i;
        }
        if (str2.isEmpty()) {
            return null;
        }
        return str2;
    }

    public void m24008d(AbstractC5082d dVar) {
        this.f17095b.add(dVar);
    }

    public boolean m24007e(String str) {
        return !C5070i.m24067c(this.f17102i, str) || !this.f17100g.isEmpty();
    }

    public boolean m24006f() {
        ArrayList<C5094n> u = m23991u();
        if (u.size() != 4) {
            return true;
        }
        Iterator<C5094n> it = u.iterator();
        while (it.hasNext()) {
            if (it.next().f17130b.f17131a != 1) {
                return true;
            }
        }
        return false;
    }

    public void m24005g(C4868i.C4874f fVar) {
        C4868i.m24726c2().m24880G4(fVar);
        if (!fVar.f16665a.equals(this.f17097d.f17113a)) {
            this.f17097d.m23971j();
            this.f17097d = new C5085g(fVar.f16665a);
            C1379j0.m37323j(true);
        }
    }

    public String m24004h(String str) {
        return str.endsWith("️") ? str.substring(0, str.length() - 1) : str;
    }

    public final boolean m24003i() {
        LevelDB W = (this.f17100g.isEmpty() || this.f17101h.isEmpty()) ? null : C4868i.m24726c2().m24773W();
        boolean z = false;
        boolean z2 = true;
        if (!this.f17100g.isEmpty()) {
            this.f17100g.clear();
            m24021L(W);
            z = true;
        }
        if (!this.f17101h.isEmpty()) {
            this.f17101h.clear();
            m24019N(W);
        } else {
            z2 = z;
        }
        if (W != null) {
            W.apply();
        }
        return z2;
    }

    public void m24002j() {
        C4868i.m24726c2().m24857K();
        this.f17099f = new ArrayList<>();
        m23997o();
    }

    public boolean m24001k(Canvas canvas, C5088i iVar, Rect rect) {
        Bitmap d;
        if (iVar == null || (d = this.f17097d.m23977d(iVar.f17121b, iVar.f17122c)) == null) {
            return false;
        }
        canvas.drawBitmap(d, iVar.f17120a, rect, C1410y.m37033j());
        return true;
    }

    public boolean m24000l(Canvas canvas, C5088i iVar, Rect rect, int i) {
        if (i == 0) {
            return false;
        }
        if (i == 255) {
            return m24001k(canvas, iVar, rect);
        }
        Bitmap d = this.f17097d.m23977d(iVar.f17121b, iVar.f17122c);
        if (d == null) {
            return false;
        }
        Paint j = C1410y.m37033j();
        j.setAlpha(i);
        canvas.drawBitmap(d, iVar.f17120a, rect, j);
        j.setAlpha(255);
        return true;
    }

    public final void m23997o() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.f17099f.add(new C5094n("😊", new C5095o(1, currentTimeMillis)));
        this.f17099f.add(new C5094n("🤔", new C5095o(1, currentTimeMillis - 1)));
        this.f17099f.add(new C5094n("😃", new C5095o(1, currentTimeMillis - 2)));
        this.f17099f.add(new C5094n("👍", new C5095o(1, currentTimeMillis - 3)));
        Iterator<C5094n> it = this.f17099f.iterator();
        while (it.hasNext()) {
            C5094n next = it.next();
            this.f17103j.put(next.f17129a, next.f17130b);
        }
        Collections.sort(this.f17099f, f17093m);
    }

    public Map<String, String> m23996p() {
        if (this.f17100g == null) {
            this.f17100g = new HashMap();
            C4868i.m24726c2().m24870I0(this.f17100g);
        }
        return this.f17100g;
    }

    public C5088i m23995q(CharSequence charSequence) {
        return m23994r(charSequence, true);
    }

    public C5088i m23994r(CharSequence charSequence, boolean z) {
        char charAt;
        CharSequence f;
        if (charSequence == null) {
            return null;
        }
        C5088i iVar = this.f17094a.get(charSequence);
        if (iVar == null && (f = C1374h.m37380i().m37383f(charSequence)) != null) {
            iVar = this.f17094a.get(f);
            charSequence = f;
        }
        if (iVar == null && z && ((charAt = charSequence.charAt(charSequence.length() - 1)) == 8205 || charAt == 65039)) {
            return m23994r(charSequence.subSequence(0, charSequence.length() - 1), true);
        }
        if (iVar != null) {
            return iVar;
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            sb2.append("\\u");
            sb2.append(Integer.toString(charSequence.charAt(i), 16));
        }
        Log.m14719i("Warning. No drawable for emoji: %s", sb2.toString());
        return null;
    }

    public Map<String, String[]> m23992t() {
        if (this.f17101h == null) {
            this.f17101h = new HashMap();
            C4868i.m24726c2().m24842M0(this.f17101h);
        }
        return this.f17101h;
    }

    public ArrayList<C5094n> m23991u() {
        if (this.f17099f == null) {
            this.f17103j = new HashMap<>();
            this.f17099f = new ArrayList<>();
            C4868i.m24726c2().m24863J0(this.f17103j);
            C4868i.m24726c2().m24807R0(this.f17103j, this.f17099f);
            if (this.f17099f.isEmpty()) {
                this.f17103j.clear();
                m23997o();
            }
        }
        return this.f17099f;
    }

    public int m23990v() {
        float f = this.f17097d.f17117e;
        if (f != 0.0f) {
            return C1357a0.m37541i(Math.abs(f)) * ((int) Math.signum(this.f17097d.f17117e));
        }
        return 0;
    }

    public int m23989w(String str) {
        if (C5070i.m24061i(str)) {
            return 0;
        }
        String h = m24004h(str);
        h.hashCode();
        char c = 65535;
        switch (h.hashCode()) {
            case 10084:
                if (h.equals("❤")) {
                    c = 0;
                    break;
                }
                break;
            case 1772535:
                if (h.equals("💔")) {
                    c = 1;
                    break;
                }
                break;
            case 1772539:
                if (h.equals("💘")) {
                    c = 2;
                    break;
                }
                break;
            case 1772540:
                if (h.equals("💙")) {
                    c = 3;
                    break;
                }
                break;
            case 1772541:
                if (h.equals("💚")) {
                    c = 4;
                    break;
                }
                break;
            case 1772542:
                if (h.equals("💛")) {
                    c = 5;
                    break;
                }
                break;
            case 1772543:
                if (h.equals("💜")) {
                    c = 6;
                    break;
                }
                break;
            case 1772687:
                if (h.equals("\u1f90d")) {
                    c = 7;
                    break;
                }
                break;
            case 1772688:
                if (h.equals("\u1f90e")) {
                    c = '\b';
                    break;
                }
                break;
            case 1772807:
                if (h.equals("🖤")) {
                    c = '\t';
                    break;
                }
                break;
            case 1772899:
                if (h.equals("🧡")) {
                    c = '\n';
                    break;
                }
                break;
            case 1772912:
                if (h.equals("😍")) {
                    c = 11;
                    break;
                }
                break;
            case 1772958:
                if (h.equals("😻")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case '\f':
                return 4;
            default:
                return 0;
        }
    }

    public void m23988x(final C4868i.C4874f fVar, final AbstractC5917i iVar) {
        C4356b0.m28201k().m28195q(new Runnable() {
            @Override
            public final void run() {
                C5078d.this.m24031B(fVar, iVar);
            }
        });
    }

    public final boolean m23987y(String str, TdApi.File file) {
        if (!C7389v0.m16681T0(str).equals(str)) {
            Log.m14719i("Emoji pack identifier is bad:%s -> %s", str, C7389v0.m16681T0(str));
            return false;
        } else if (!C4779t2.m25598T2(file)) {
            Log.m14719i("Emoji pack not loaded:%s", str);
            return false;
        } else {
            File file2 = new File(file.local.path);
            if (!file2.exists()) {
                Log.m14719i("Emoji pack not found:%s", str);
                return false;
            }
            File file3 = new File(m23993s(), str);
            if (file3.exists() || file3.mkdirs()) {
                File file4 = new File(file3, ".nomedia");
                if (!file4.exists() && !file4.createNewFile()) {
                    Log.m14719i("Cannot create .nomedia file:%s", str);
                    return false;
                } else if (!C5068g.m24100c(file3.listFiles(C5075a.f17087a), true)) {
                    Log.m14719i("Cannot delete rudimentary files:%s", str);
                    return false;
                } else {
                    C5068g.m24093j(file2, file3);
                    return true;
                }
            } else {
                Log.m14719i("Cannot create emoji dir:%s", str);
                return false;
            }
        }
    }
}
