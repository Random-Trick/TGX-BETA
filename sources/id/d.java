package id;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;
import ce.a0;
import ce.h;
import ce.j0;
import ce.y;
import gd.b0;
import hd.t2;
import he.i;
import ib.g;
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
import nb.f;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;

public class d {
    public static d f14185l;
    public static final Comparator<n> f14186m = id.c.f14184a;
    public ArrayList<n> f14192f;
    public Map<String, String> f14193g;
    public Map<String, String[]> f14194h;
    public HashMap<String, o> f14196j;
    public final int f14197k;
    public final lb.d<AbstractC0123d> f14188b = new lb.d<>();
    public final c f14189c = new a();
    public g f14190d = new g(i.c2().O0());
    public final f<StringBuilder> f14191e = new f<>();
    public String f14195i = i.c2().K0();
    public final HashMap<CharSequence, i> f14187a = new HashMap<>(h.h());

    public class a implements c {
        public a() {
        }

        @Override
        public int b() {
            return 0;
        }

        @Override
        public boolean c() {
            return false;
        }
    }

    public interface b {
        boolean f(CharSequence charSequence, CharSequence charSequence2, i iVar, int i10, int i11);
    }

    public interface c {
        int b();

        boolean c();
    }

    public interface AbstractC0123d {
        void e(int i10, int i11);

        void o(String str);

        void r(int i10, n nVar);

        void t(int i10, n nVar);

        void u(String str, String str2, String[] strArr);
    }

    public d() {
        u();
        p();
        t();
        int c10 = g.c();
        this.f14197k = 66 / c10;
        int i10 = 0;
        while (true) {
            String[][] strArr = h.f5262h;
            if (i10 < strArr.length) {
                int ceil = (int) Math.ceil(strArr[i10].length / 4.0f);
                int i11 = 0;
                while (true) {
                    String[][] strArr2 = h.f5262h;
                    if (i11 < strArr2[i10].length) {
                        int i12 = i11 / ceil;
                        int i13 = i11 - (i12 * ceil);
                        int[][] iArr = ce.d.f5246a;
                        int i14 = i13 % iArr[i10][i12];
                        int i15 = i13 / iArr[i10][i12];
                        int i16 = (int) (ce.d.f5247b[i10][i12] * (2.2f / c10));
                        int i17 = i16 * i14;
                        int i18 = this.f14197k;
                        int i19 = (i14 * i18) + i17;
                        int i20 = (i15 * i18) + (i16 * i15);
                        int i21 = this.f14197k;
                        this.f14187a.put(strArr2[i10][i11], new i(new Rect(i19, i20, i19 + i21, i21 + i20), i10, i12));
                        i11++;
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void B(i.f fVar, kb.i iVar) {
        boolean z10 = false;
        try {
            z10 = y(fVar.f13847a, fVar.O);
        } catch (IOException e10) {
            Log.e("Unable to install emoji pack:%s", e10, fVar.f13847a);
        }
        if (z10) {
            i.c2().t2(fVar);
            g.e(fVar.O.local.path);
        }
        iVar.a(z10);
    }

    public static boolean C(File file, String str) {
        return !str.equals(".nomedia");
    }

    public static int D(n nVar, n nVar2) {
        o oVar = nVar.f14220b;
        int i10 = oVar.f14221a;
        o oVar2 = nVar2.f14220b;
        int i11 = oVar2.f14221a;
        int i12 = oVar.f14222b;
        int i13 = oVar2.f14222b;
        if (i10 <= i11) {
            if (i10 < i11) {
                return 1;
            }
            if (i12 <= i13) {
                if (i12 < i13) {
                    return 1;
                }
                return nVar.f14219a.compareTo(nVar2.f14219a);
            }
        }
        return -1;
    }

    public static String G(String str, String str2) {
        if (ib.i.i(str) || str.length() % 2 != 0) {
            return null;
        }
        try {
            byte[] a10 = s2.c.a(str);
            if (a10 != null && a10.length > 0) {
                return new String(a10, str2);
            }
        } catch (Throwable th) {
            Log.v(th);
        }
        return null;
    }

    public static String T(int i10) {
        if (i10 == 0) {
            return "#⃣";
        }
        return i10 + "⃣";
    }

    public static boolean m(String str, String str2) {
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

    public static String n(String str) {
        k[] kVarArr;
        CharSequence I = z().I(str);
        if (!(I instanceof Spanned) || (kVarArr = (k[]) ((Spanned) I).getSpans(0, I.length(), k.class)) == null || kVarArr.length <= 0) {
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

    public static File s() {
        return new File(j0.n().getFilesDir(), "emoji");
    }

    public static d z() {
        if (f14185l == null) {
            synchronized (d.class) {
                if (f14185l == null) {
                    f14185l = new d();
                }
            }
        }
        return f14185l;
    }

    public boolean A(String str) {
        k[] kVarArr;
        CharSequence J = z().J(str, 0, str.length(), this.f14189c);
        if (!(J instanceof Spanned) || (kVarArr = (k[]) ((Spanned) J).getSpans(0, J.length(), k.class)) == null || kVarArr.length != 1) {
            return false;
        }
        Spanned spanned = (Spanned) J;
        return spanned.getSpanStart(kVarArr[0]) == 0 && spanned.getSpanEnd(kVarArr[0]) == J.length();
    }

    public k E(CharSequence charSequence, i iVar) {
        if (ib.i.i(charSequence)) {
            return null;
        }
        if (iVar == null && (iVar = q(charSequence)) == null) {
            return null;
        }
        return l.d(charSequence, iVar);
    }

    public String[] F(String str) {
        String[] strArr = this.f14194h.get(str);
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr;
    }

    public void H(AbstractC0123d dVar) {
        this.f14188b.remove(dVar);
    }

    public CharSequence I(CharSequence charSequence) {
        return K(charSequence, 0, charSequence != null ? charSequence.length() : 0, null, null);
    }

    public CharSequence J(CharSequence charSequence, int i10, int i11, c cVar) {
        return K(charSequence, i10, i11, cVar, null);
    }

    public java.lang.CharSequence K(java.lang.CharSequence r33, int r34, int r35, id.d.c r36, id.d.b r37) {
        throw new UnsupportedOperationException("Method not decompiled: id.d.K(java.lang.CharSequence, int, int, id.d$c, id.d$b):java.lang.CharSequence");
    }

    public final void L(SharedPreferences.Editor editor) {
        i.c2().B4(this.f14193g, editor);
    }

    public final void M() {
        i.c2().C4(this.f14196j);
    }

    public final void N(SharedPreferences.Editor editor) {
        i.c2().F4(this.f14194h, editor);
    }

    public void O(String str) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        u();
        Iterator<n> it = this.f14192f.iterator();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (it.next().f14219a.equals(str)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 != -1) {
            n remove = this.f14192f.remove(i10);
            o oVar = remove.f14220b;
            oVar.f14222b = currentTimeMillis;
            oVar.f14221a++;
            int binarySearch = Collections.binarySearch(this.f14192f, remove, f14186m);
            if (binarySearch >= 0) {
                this.f14192f.add(i10, remove);
            } else {
                int i11 = (-binarySearch) - 1;
                this.f14192f.add(i11, remove);
                if (i11 != i10) {
                    Iterator<AbstractC0123d> it2 = this.f14188b.iterator();
                    while (it2.hasNext()) {
                        it2.next().e(i10, i11);
                    }
                    z10 = true;
                }
            }
        } else {
            o oVar2 = this.f14196j.get(str);
            if (oVar2 == null) {
                oVar2 = new o(1, currentTimeMillis);
                this.f14196j.put(str, oVar2);
            } else {
                oVar2.f14222b = currentTimeMillis;
                oVar2.f14221a++;
            }
            n nVar = new n(str, oVar2);
            int binarySearch2 = Collections.binarySearch(this.f14192f, nVar, f14186m);
            if (binarySearch2 < 0) {
                int i12 = (-binarySearch2) - 1;
                if (this.f14192f.size() < 40) {
                    this.f14192f.add(i12, nVar);
                    Iterator<AbstractC0123d> it3 = this.f14188b.iterator();
                    while (it3.hasNext()) {
                        it3.next().r(i12, nVar);
                    }
                } else if (i12 < 40) {
                    this.f14192f.set(i12, nVar);
                    Iterator<AbstractC0123d> it4 = this.f14188b.iterator();
                    while (it4.hasNext()) {
                        it4.next().t(i12, nVar);
                    }
                }
                z10 = true;
            }
        }
        P(z10);
    }

    public final void P(boolean z10) {
        M();
        if (z10) {
            i.c2().I4(this.f14192f);
        }
    }

    public boolean Q(String str, String str2, String[] strArr) {
        String str3;
        String[] strArr2;
        boolean z10;
        LevelDB levelDB = null;
        if (ib.i.i(str2)) {
            str3 = ib.i.i(this.f14195i) ? null : "";
            strArr2 = null;
        } else {
            str3 = (!ib.i.c(str2, this.f14195i) || strArr != null) ? str2 : null;
            strArr2 = strArr;
        }
        boolean z11 = false;
        if (str3 == null) {
            z10 = this.f14193g.remove(str) != null;
        } else {
            String str4 = this.f14193g.get(str);
            boolean z12 = str4 == null || !ib.i.c(str4, str3);
            if (z12) {
                this.f14193g.put(str, str3);
            }
            z10 = z12;
        }
        if (strArr2 != null) {
            String[] strArr3 = this.f14194h.get(str);
            if (strArr3 == null || !Arrays.equals(strArr3, strArr2)) {
                z11 = true;
            }
            if (z11) {
                this.f14194h.put(str, strArr2);
            }
        } else if (this.f14194h.remove(str) != null || z10) {
            z11 = true;
        }
        if (z10 || z11) {
            if (z10 && z11) {
                levelDB = i.c2().W();
            }
            if (z10) {
                L(levelDB);
            }
            if (z11) {
                N(levelDB);
            }
            if (levelDB != null) {
                levelDB.apply();
            }
            Iterator<AbstractC0123d> it = this.f14188b.iterator();
            while (it.hasNext()) {
                it.next().u(str, str2, strArr2);
            }
        }
        return z10;
    }

    public boolean R(String str) {
        if (!ib.i.c(this.f14195i, str)) {
            this.f14195i = str;
            i.c2().D4(str, this.f14193g);
        } else if (!i()) {
            return false;
        }
        Iterator<AbstractC0123d> it = this.f14188b.iterator();
        while (it.hasNext()) {
            it.next().o(str);
        }
        return true;
    }

    public c S() {
        return this.f14189c;
    }

    public String U(String str) {
        String str2 = this.f14193g.get(str);
        if (str2 == null) {
            return this.f14195i;
        }
        if (str2.isEmpty()) {
            return null;
        }
        return str2;
    }

    public void d(AbstractC0123d dVar) {
        this.f14188b.add(dVar);
    }

    public boolean e(String str) {
        return !ib.i.c(this.f14195i, str) || !this.f14193g.isEmpty();
    }

    public boolean f() {
        ArrayList<n> u10 = u();
        if (u10.size() != 4) {
            return true;
        }
        Iterator<n> it = u10.iterator();
        while (it.hasNext()) {
            if (it.next().f14220b.f14221a != 1) {
                return true;
            }
        }
        return false;
    }

    public void g(i.f fVar) {
        i.c2().G4(fVar);
        if (!fVar.f13847a.equals(this.f14190d.f14205a)) {
            this.f14190d.j();
            this.f14190d = new g(fVar.f13847a);
            j0.j(true);
        }
    }

    public String h(String str) {
        return str.endsWith("️") ? str.substring(0, str.length() - 1) : str;
    }

    public final boolean i() {
        LevelDB W = (this.f14193g.isEmpty() || this.f14194h.isEmpty()) ? null : i.c2().W();
        boolean z10 = false;
        boolean z11 = true;
        if (!this.f14193g.isEmpty()) {
            this.f14193g.clear();
            L(W);
            z10 = true;
        }
        if (!this.f14194h.isEmpty()) {
            this.f14194h.clear();
            N(W);
        } else {
            z11 = z10;
        }
        if (W != null) {
            W.apply();
        }
        return z11;
    }

    public void j() {
        i.c2().K();
        this.f14192f = new ArrayList<>();
        o();
    }

    public boolean k(Canvas canvas, i iVar, Rect rect) {
        Bitmap d10;
        if (iVar == null || (d10 = this.f14190d.d(iVar.f14213b, iVar.f14214c)) == null) {
            return false;
        }
        canvas.drawBitmap(d10, iVar.f14212a, rect, y.j());
        return true;
    }

    public boolean l(Canvas canvas, i iVar, Rect rect, int i10) {
        if (i10 == 0) {
            return false;
        }
        if (i10 == 255) {
            return k(canvas, iVar, rect);
        }
        Bitmap d10 = this.f14190d.d(iVar.f14213b, iVar.f14214c);
        if (d10 == null) {
            return false;
        }
        Paint j10 = y.j();
        j10.setAlpha(i10);
        canvas.drawBitmap(d10, iVar.f14212a, rect, j10);
        j10.setAlpha(255);
        return true;
    }

    public final void o() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        this.f14192f.add(new n("😊", new o(1, currentTimeMillis)));
        this.f14192f.add(new n("🤔", new o(1, currentTimeMillis - 1)));
        this.f14192f.add(new n("😃", new o(1, currentTimeMillis - 2)));
        this.f14192f.add(new n("👍", new o(1, currentTimeMillis - 3)));
        Iterator<n> it = this.f14192f.iterator();
        while (it.hasNext()) {
            n next = it.next();
            this.f14196j.put(next.f14219a, next.f14220b);
        }
        Collections.sort(this.f14192f, f14186m);
    }

    public Map<String, String> p() {
        if (this.f14193g == null) {
            this.f14193g = new HashMap();
            i.c2().I0(this.f14193g);
        }
        return this.f14193g;
    }

    public i q(CharSequence charSequence) {
        return r(charSequence, true);
    }

    public i r(CharSequence charSequence, boolean z10) {
        char charAt;
        CharSequence f10;
        if (charSequence == null) {
            return null;
        }
        i iVar = this.f14187a.get(charSequence);
        if (iVar == null && (f10 = h.i().f(charSequence)) != null) {
            iVar = this.f14187a.get(f10);
            charSequence = f10;
        }
        if (iVar == null && z10 && ((charAt = charSequence.charAt(charSequence.length() - 1)) == 8205 || charAt == 65039)) {
            return r(charSequence.subSequence(0, charSequence.length() - 1), true);
        }
        if (iVar != null) {
            return iVar;
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            sb2.append("\\u");
            sb2.append(Integer.toString(charSequence.charAt(i10), 16));
        }
        Log.i("Warning. No drawable for emoji: %s", sb2.toString());
        return null;
    }

    public Map<String, String[]> t() {
        if (this.f14194h == null) {
            this.f14194h = new HashMap();
            i.c2().M0(this.f14194h);
        }
        return this.f14194h;
    }

    public ArrayList<n> u() {
        if (this.f14192f == null) {
            this.f14196j = new HashMap<>();
            this.f14192f = new ArrayList<>();
            i.c2().J0(this.f14196j);
            i.c2().R0(this.f14196j, this.f14192f);
            if (this.f14192f.isEmpty()) {
                this.f14196j.clear();
                o();
            }
        }
        return this.f14192f;
    }

    public int v() {
        float f10 = this.f14190d.f14209e;
        if (f10 != 0.0f) {
            return a0.i(Math.abs(f10)) * ((int) Math.signum(this.f14190d.f14209e));
        }
        return 0;
    }

    public int w(String str) {
        if (ib.i.i(str)) {
            return 0;
        }
        String h10 = h(str);
        h10.hashCode();
        char c10 = 65535;
        switch (h10.hashCode()) {
            case 10084:
                if (h10.equals("❤")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1772535:
                if (h10.equals("💔")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1772539:
                if (h10.equals("💘")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1772540:
                if (h10.equals("💙")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1772541:
                if (h10.equals("💚")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1772542:
                if (h10.equals("💛")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1772543:
                if (h10.equals("💜")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1772687:
                if (h10.equals("\u1f90d")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1772688:
                if (h10.equals("\u1f90e")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1772807:
                if (h10.equals("🖤")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1772899:
                if (h10.equals("🧡")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1772912:
                if (h10.equals("😍")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1772958:
                if (h10.equals("😻")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
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

    public void x(final i.f fVar, final kb.i iVar) {
        b0.k().q(new Runnable() {
            @Override
            public final void run() {
                d.this.B(fVar, iVar);
            }
        });
    }

    public final boolean y(String str, TdApi.File file) {
        if (!v0.T0(str).equals(str)) {
            Log.i("Emoji pack identifier is bad:%s -> %s", str, v0.T0(str));
            return false;
        } else if (!t2.T2(file)) {
            Log.i("Emoji pack not loaded:%s", str);
            return false;
        } else {
            File file2 = new File(file.local.path);
            if (!file2.exists()) {
                Log.i("Emoji pack not found:%s", str);
                return false;
            }
            File file3 = new File(s(), str);
            if (file3.exists() || file3.mkdirs()) {
                File file4 = new File(file3, ".nomedia");
                if (!file4.exists() && !file4.createNewFile()) {
                    Log.i("Cannot create .nomedia file:%s", str);
                    return false;
                } else if (!g.c(file3.listFiles(id.a.f14180a), true)) {
                    Log.i("Cannot delete rudimentary files:%s", str);
                    return false;
                } else {
                    g.j(file2, file3);
                    return true;
                }
            } else {
                Log.i("Cannot create emoji dir:%s", str);
                return false;
            }
        }
    }
}
