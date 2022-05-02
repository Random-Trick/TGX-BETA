package ie;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import be.C1357a0;
import be.C1410y;
import gd.C4779t2;
import ge.C4868i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p037cb.C2057b;
import p037cb.C2065g;
import p051db.C3940f;
import p051db.C3944i;
import p051db.C3950k;
import p051db.C3953l;
import p051db.C3955n;
import p051db.C3962o;
import p080fb.AbstractC4345j;
import p082fd.C4403w;
import p108hb.C5063c;
import p108hb.C5064d;
import p108hb.C5070i;
import p110hd.C5078d;
import p110hd.C5088i;
import p139jb.AbstractC5911c;
import p143k0.C6035e;
import p143k0.C6038h;
import p156kd.C6238b;
import p193nb.C7321e;
import p350yd.C10930q6;
import p350yd.HandlerC10770jj;
import p364zd.AbstractC11531p;

public class RunnableC5390g implements Runnable, C5078d.AbstractC5081c, C3944i.AbstractC3948d, C3955n.AbstractC3959d {
    public int f17718A0;
    public View f17719B0;
    public AbstractC5393c f17720C0;
    public ViewGroup f17721D0;
    public final AbstractC5396f f17722M;
    public final AbstractC5394d f17723N;
    public final int f17724O;
    public final C5457w0 f17725P;
    public final AbstractC5408k f17726Q;
    public final String f17727R;
    public final int f17728S;
    public String f17729T;
    public ArrayList<C5455v0> f17730U;
    public C6035e<C5399i> f17731V;
    public C6035e<C5391a> f17732W;
    public C6038h<Path> f17733X;
    public List<int[]> f17734Y;
    public int f17735Z;
    public int f17736a;
    public int f17737a0;
    public int f17738b;
    public AbstractC5411l0[] f17739b0;
    public final AbstractC5397g f17740c;
    public int f17741c0;
    public int f17742d0;
    public int f17743e0;
    public int f17744f0;
    public C5455v0 f17745g0;
    public int f17746h0;
    public int f17747i0;
    public int f17748j0;
    public int f17749k0;
    public boolean f17750l0;
    public int f17751m0;
    public int f17752n0;
    public AbstractC5411l0 f17753o0;
    public float f17754p0;
    public final Paint.FontMetricsInt f17755q0;
    public Paint f17756r0;
    public float f17757s0;
    public int f17758t0;
    public int f17759u0;
    public int f17760v0;
    public int f17761w0;
    public AbstractC4345j f17762x0;
    public C5398h f17763y0;
    public int f17764z0;

    public static class C5391a {
        public final Path f17765a;
        public AbstractC5408k f17766b;

        public C5391a(Path path, AbstractC5408k kVar) {
            this.f17765a = path;
            this.f17766b = kVar;
        }
    }

    public interface AbstractC5393c {
        boolean mo18245A(String str);

        boolean mo18244H5(String str);

        boolean mo18243I3(String str);

        boolean mo18242M(View view, RunnableC5390g gVar, C5455v0 v0Var, String str, boolean z);

        boolean mo18241P3(long j);

        boolean mo18240S6(View view, String str);

        TdApi.WebPage mo18239U2(String str);

        boolean mo18238V4(String str);

        AbstractC11531p mo18237W4(View view, RunnableC5390g gVar);

        boolean mo18236f5(String str);

        boolean mo18235g0(View view, String str, boolean z, HandlerC10770jj.C10788q qVar);

        boolean mo18234i0(View view, String str, String str2, HandlerC10770jj.C10788q qVar);

        boolean mo18233m2(String str);
    }

    public interface AbstractC5394d {
        boolean mo22863a(View view, RunnableC5390g gVar, C5455v0 v0Var, HandlerC10770jj.C10788q qVar);
    }

    public static class C5395e extends IllegalStateException {
    }

    public interface AbstractC5396f {
        int mo7827a(int i, int i2, int i3, int i4);
    }

    public interface AbstractC5397g {
        int mo9971a(int i, int i2, int i3, int i4);
    }

    public static class C5398h {
        public final int f17779a;
        public final int f17780b;
        public final int f17781c;
        public final C5399i f17782d;

        public C5398h(int i, int i2, int i3, C5399i iVar) {
            this.f17779a = i;
            this.f17780b = i2;
            this.f17781c = i3;
            this.f17782d = iVar;
        }

        public boolean m22862a() {
            return this.f17782d != null;
        }

        public boolean m22861b(int i) {
            return i >= this.f17780b && i <= this.f17781c;
        }
    }

    public class C5399i implements AbstractC5911c {
        public int f17783M;
        public final int f17787a;
        public int f17788b;
        public int f17789c = -1;
        public final Path f17784N = new Path();
        public final C3940f f17785O = new C3940f(0, new C5400a(), C2057b.f7280b, 180);

        public class C5400a implements C3950k.AbstractC3952b {
            public C5400a() {
            }

            @Override
            public void mo45P5(int i, float f, float f2, C3950k kVar) {
                if (RunnableC5390g.this.f17762x0 != null) {
                    RunnableC5390g.this.f17762x0.invalidate();
                }
            }

            @Override
            public void mo35Y0(int i, float f, C3950k kVar) {
                C3953l.m29526a(this, i, f, kVar);
            }
        }

        public C5399i(int i) {
            this.f17787a = i;
        }

        @Override
        public void mo4501a3() {
            this.f17785O.m29588c();
        }

        public void m22855f(C5455v0 v0Var, int i, int i2, int i3, boolean z) {
            TextPaint o0;
            int i4;
            this.f17788b++;
            TdApi.TextEntity m = v0Var.m22681m();
            if (m != null) {
                if (this.f17789c == -1) {
                    this.f17789c = m.offset;
                }
                this.f17783M = (m.offset + m.length) - this.f17789c;
            }
            int i5 = C1357a0.m37541i(1.0f);
            int i6 = C1357a0.m37541i(3.0f);
            Paint.FontMetricsInt T = RunnableC5390g.this.m22970T(RunnableC5390g.this.m22915o0(v0Var.m22687g()).getTextSize());
            if (z) {
                int f0 = RunnableC5390g.this.m22941f0(v0Var.m22684j());
                int i7 = i + (RunnableC5390g.this.f17736a / 2);
                int i8 = f0 / 2;
                i4 = v0Var.m22708D(i7 - i8, i7 + i8, 0);
            } else {
                i4 = v0Var.m22708D(i, i2, i3);
            }
            int r = v0Var.m22676r();
            float p = v0Var.m22678p();
            RectF a0 = C1410y.m37050a0();
            float f = i4 - i5;
            a0.left = f;
            a0.top = r - i5;
            float f2 = f + p;
            float f3 = i5;
            a0.right = f2 + f3 + f3;
            a0.bottom = r + (v0Var.m22686h() == -1 ? T.descent - T.ascent : v0Var.m22686h()) + i5;
            a0.offset(0.0f, o0.baselineShift + RunnableC5390g.this.m22924l0(v0Var));
            float f4 = i6;
            this.f17784N.addRoundRect(a0, f4, f4, Path.Direction.CW);
        }

        public void m22854g() {
        }

        public void m22853h(Canvas canvas, @Deprecated int i) {
            canvas.drawPath(this.f17784N, C1410y.m37039g(C5064d.m24131a(1.0f - m22852i(), i)));
        }

        public float m22852i() {
            return this.f17785O.m29584g();
        }

        public boolean m22851j() {
            return m22849l();
        }

        public void m22850k(boolean z, boolean z2) {
        }

        public boolean m22849l() {
            return this.f17785O.m29584g() != 1.0f;
        }
    }

    public RunnableC5390g(String str, int i, C5457w0 w0Var, AbstractC5408k kVar, int i2, int i3, AbstractC5411l0[] l0VarArr) {
        this(str, i, w0Var, kVar, i2, null, null, i3, l0VarArr, null, null);
    }

    public static void m23008A(Canvas canvas, Path path, int i, int i2) {
        if (Color.alpha(i2) > 0) {
            canvas.drawPath(path, C1410y.m37053Y(i2, C1357a0.m37541i(1.0f)));
        }
        if (Color.alpha(i) > 0) {
            canvas.drawPath(path, C1410y.m37039g(i));
        }
    }

    public static boolean m23005B0(int i, boolean z) {
        return m23003C0(i, Character.getType(i), z);
    }

    public static boolean m23003C0(int i, int i2, boolean z) {
        return m23001D0(i, i2, z, null);
    }

    public static boolean m23001D0(int i, int i2, boolean z, char[] cArr) {
        if (!(i == 34 || i == 160 || i == 183 || i == 39 || i == 40)) {
            if (i != 95) {
                if (i != 96) {
                    if (!(i2 == 22 || i2 == 24 || i2 == 20 || (z && i2 == 12))) {
                        if (cArr != null) {
                            for (char c : cArr) {
                                if (c == i) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean m22999E0(String str, ArrayList arrayList, CharSequence charSequence, CharSequence charSequence2, C5088i iVar, int i, int i2) {
        int i3 = this.f17751m0;
        if (i > i3) {
            m22946d1(str, i3, i, arrayList, this.f17753o0, false);
        }
        int i4 = i + i2;
        m22959Y0(str, charSequence2, iVar, i, i4, arrayList, this.f17753o0);
        this.f17751m0 = i4;
        return true;
    }

    public static int m22997F0(String str, int i, int i2, char[] cArr) {
        if (i >= i2) {
            return -1;
        }
        int i3 = i2;
        while (i3 > i) {
            int codePointBefore = str.codePointBefore(i3);
            int type = Character.getType(codePointBefore);
            if (i3 < i2 && m23001D0(codePointBefore, type, true, cArr)) {
                return Math.max(i, i3);
            }
            i3 -= Character.charCount(codePointBefore);
        }
        return -1;
    }

    public static TdApi.TextEntity[] m22996G(String str, int i) {
        TdApi.TextEntity[] C0 = C7321e.m17014C0(str);
        if (C0 != null && C0.length > 0) {
            ArrayList arrayList = null;
            int i2 = 0;
            for (TdApi.TextEntity textEntity : C0) {
                if (m22928k(textEntity, i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(C0.length - i2);
                    }
                    arrayList.add(textEntity);
                } else {
                    i2++;
                }
            }
            if (arrayList != null) {
                TdApi.TextEntity[] textEntityArr = new TdApi.TextEntity[arrayList.size()];
                arrayList.toArray(textEntityArr);
                return textEntityArr;
            }
        }
        return null;
    }

    public static boolean m22992I(String str, int i, int i2) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 10) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    public static AbstractC5411l0[] m22991I0(String str, int i, AbstractC5411l0[] l0VarArr, C10930q6 q6Var, HandlerC10770jj.C10788q qVar) {
        TdApi.TextEntity[] C0;
        if (l0VarArr != null && l0VarArr.length > 0) {
            return l0VarArr;
        }
        if (!(i == 0 || (C0 = C7321e.m17014C0(str)) == null || C0.length <= 0)) {
            ArrayList arrayList = null;
            int i2 = 0;
            for (TdApi.TextEntity textEntity : C0) {
                if (m22928k(textEntity, i)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(C0.length - i2);
                    }
                    arrayList.add(new C5424r0(q6Var, str, textEntity, qVar));
                } else {
                    i2++;
                }
            }
            if (arrayList != null) {
                AbstractC5411l0[] l0VarArr2 = new AbstractC5411l0[arrayList.size()];
                arrayList.toArray(l0VarArr2);
                return l0VarArr2;
            }
        }
        return null;
    }

    public static boolean m22983M0(CharSequence charSequence) {
        return !C5070i.m24061i(charSequence) && m22981N0(charSequence, 0, charSequence.length());
    }

    public static boolean m22981N0(CharSequence charSequence, int i, int i2) {
        if (C5070i.m24061i(charSequence)) {
            return false;
        }
        int max = Math.max(0, i);
        int min = Math.min(charSequence.length(), i2);
        while (max < min) {
            int codePointAt = Character.codePointAt(charSequence, max);
            if (m22975Q0(codePointAt)) {
                return true;
            }
            max += Character.charCount(codePointAt);
        }
        return false;
    }

    public static boolean m22979O0(String str, int i, int i2) {
        if (i2 - i <= 0) {
            return false;
        }
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!m22975Q0(codePointAt)) {
                return false;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    public static boolean m22975Q0(int i) {
        return m22973R0(i) || (i >= 3328 && i <= 3455) || ((i >= 1536 && i <= 1791) || ((i >= 1424 && i <= 1535) || (i >= 65280 && i <= 65280)));
    }

    public static int m22974R() {
        return C1357a0.m37541i(4.0f);
    }

    public static boolean m22973R0(int i) {
        return (i >= 12352 && i <= 12447) || (i >= 12448 && i <= 12543) || ((i >= 12544 && i <= 12591) || ((i >= 44032 && i <= 55215) || ((i >= 11904 && i <= 40959) || (i >= 131072 && i <= 195103))));
    }

    public static boolean m22928k(TdApi.TextEntity textEntity, int i) {
        if (i == 15) {
            return true;
        }
        switch (textEntity.type.getConstructor()) {
            case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
            case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
            case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
            case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                return (i & 1) != 0;
            case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                return (i & 8) != 0;
            case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
            case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                return (i & 4) != 0;
            case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                return (i & 2) != 0;
            default:
                return false;
        }
    }

    public static AbstractC5411l0[] m22911p1(CharSequence charSequence, boolean z, C10930q6 q6Var, HandlerC10770jj.C10788q qVar) {
        TdApi.TextEntity[] x5 = C4779t2.m25392x5(charSequence, z);
        if (x5 == null || x5.length <= 0) {
            return null;
        }
        AbstractC5411l0[] l0VarArr = new AbstractC5411l0[x5.length];
        String charSequence2 = charSequence.toString();
        for (int i = 0; i < x5.length; i++) {
            l0VarArr[i] = new C5424r0(q6Var, charSequence2, x5[i], qVar);
        }
        return l0VarArr;
    }

    public static boolean m22909q0(String str, int i, int i2) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (Character.getType(codePointAt) == 12) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    public static int m22902t0(String str, int i) {
        return m22898v0(str, i, null);
    }

    public static int m22900u0(String str, int i, int i2, char[] cArr) {
        if (i >= i2) {
            return -1;
        }
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (m23001D0(codePointAt, Character.getType(codePointAt), true, cArr)) {
                return i;
            }
            i += Character.charCount(codePointAt);
        }
        return -1;
    }

    public static int m22898v0(String str, int i, char[] cArr) {
        return m22900u0(str, i, str.length(), cArr);
    }

    public boolean m23007A0(int i) {
        C5398h hVar = this.f17763y0;
        return hVar != null && hVar.m22861b(i);
    }

    public final int m23006B(int i, Canvas canvas, int i2, int i3, int i4, int i5, float f, AbstractC5408k kVar, C6238b bVar, int i6) {
        C5455v0 v0Var = this.f17730U.get(i);
        int size = this.f17730U.size();
        C5455v0 v0Var2 = v0Var;
        int i7 = i;
        int i8 = 1;
        while (true) {
            i7++;
            if (i7 >= size) {
                break;
            }
            C5455v0 v0Var3 = this.f17730U.get(i7);
            if (!v0Var2.m22694R(v0Var3)) {
                break;
            }
            i8++;
            v0Var2 = v0Var3;
        }
        int l0 = i5 + m22924l0(v0Var);
        C5399i J = m22990J(v0Var.m22681m());
        float i9 = J != null ? J.m22852i() * f : f;
        if (i9 > 0.0f) {
            if (i8 > 1) {
                v0Var.m22690d(i, canvas, v0Var2.m22688f(), i2, i3, i4, l0, i9, kVar);
            } else {
                v0Var.m22691c(i, canvas, i2, i3, i4, l0, i9, kVar, bVar, i6);
            }
        }
        return i8;
    }

    public final int m23004C(int i, Canvas canvas, int i2, int i3, int i4, float f, AbstractC5408k kVar, C6238b bVar, int i5) {
        int i6;
        int i7 = i;
        C5455v0 v0Var = this.f17730U.get(i);
        int f0 = m22941f0(v0Var.m22684j());
        int i8 = i2 + (i4 / 2);
        int size = this.f17730U.size();
        C5455v0 v0Var2 = v0Var;
        int i9 = 1;
        while (true) {
            i6 = i7 + 1;
            if (i6 >= size) {
                break;
            }
            C5455v0 v0Var3 = this.f17730U.get(i6);
            if (!v0Var2.m22694R(v0Var3)) {
                break;
            }
            i9++;
            v0Var2 = v0Var3;
            i7 = i6;
        }
        int l0 = i3 + m22924l0(v0Var);
        C5399i J = m22990J(v0Var.m22681m());
        float i10 = J != null ? J.m22852i() * f : f;
        if (i10 > 0.0f) {
            if (i9 > 1) {
                int i11 = f0 / 2;
                v0Var.m22690d(i6, canvas, v0Var2.m22688f(), i8 - i11, i8 + i11, 0, l0, i10, kVar);
            } else {
                int i12 = f0 / 2;
                v0Var.m22691c(i6, canvas, i8 - i12, i8 + i12, 0, l0, i10, kVar, bVar, i5);
            }
        }
        return i9;
    }

    public final void m23002D(Canvas canvas, int i, int i2, int i3, int i4, boolean z, C5398h hVar, float f, AbstractC5408k kVar) {
        AbstractC5411l0 g;
        if (!(hVar == null || hVar.m22862a())) {
            int size = this.f17730U.size();
            int i5 = hVar.f17780b;
            if (i5 >= 0 && i5 < size && (g = this.f17730U.get(i5).m22687g()) != null) {
                boolean z2 = true;
                int a = C5064d.m24131a(f, m22984M(kVar, g, true));
                int a2 = C5064d.m24131a(f, m22930j0(kVar, g, true));
                boolean z3 = Color.alpha(a) != 0;
                if (Color.alpha(a2) == 0) {
                    z2 = false;
                }
                if (z3 || z2) {
                    C6038h<Path> hVar2 = this.f17733X;
                    Path e = hVar2 != null ? hVar2.m21471e(i5) : null;
                    if (e != null) {
                        canvas.save();
                        canvas.translate(0.0f, i4);
                        m23008A(canvas, e, a, a2);
                        canvas.restore();
                        return;
                    }
                    Path path = new Path();
                    if (this.f17733X == null) {
                        this.f17733X = new C6038h<>();
                    }
                    this.f17733X.m21466j(i5, path);
                    for (int i6 = i5; i6 < size; i6++) {
                        C5455v0 v0Var = this.f17730U.get(i6);
                        if (!v0Var.m22669y(g)) {
                            break;
                        }
                        Path path2 = path;
                        path = path;
                        m22925l(path2, v0Var, i, i2, i3, z, true);
                    }
                    canvas.save();
                    canvas.translate(0.0f, i4);
                    m23008A(canvas, path, a, a2);
                    canvas.restore();
                }
            }
        }
    }

    public final void m23000E(int i, int i2) {
        if (this.f17724O != -1 && m22962X() >= this.f17724O) {
            this.f17743e0 -= i;
            this.f17746h0 = i2;
            while (!this.f17734Y.isEmpty() && (m22962X() > this.f17724O || (m22962X() > 1 && m22941f0(m22962X() - 1) == 0))) {
                this.f17734Y.remove(m22962X() - 1);
                int Z = m22958Z(m22962X() - 1);
                this.f17743e0 -= Z;
                this.f17746h0 = Z;
            }
            this.f17745g0 = null;
            throw new C5395e();
        }
    }

    public int m22998F(String str) {
        AbstractC5411l0[] l0VarArr = this.f17739b0;
        if (l0VarArr == null || this.f17730U == null) {
            return -1;
        }
        for (AbstractC5411l0 l0Var : l0VarArr) {
            if (l0Var.mo22740m(str)) {
                int i = l0Var.m22785i();
                Iterator<C5455v0> it = this.f17730U.iterator();
                while (it.hasNext()) {
                    C5455v0 next = it.next();
                    if (i >= next.m22679o() && i < next.m22688f()) {
                        return next.m22684j();
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public void m22995G0(Rect rect, C5455v0 v0Var) {
        m22993H0(rect, v0Var, 0);
    }

    public final AbstractC5411l0 m22994H(int i, int i2) {
        int i3;
        AbstractC5411l0[] l0VarArr;
        int i4;
        int i5;
        AbstractC5411l0[] l0VarArr2 = this.f17739b0;
        if (l0VarArr2 == null) {
            return null;
        }
        int i6 = this.f17747i0;
        boolean z = false;
        if (i6 == -1) {
            i3 = 0;
        } else if ((!this.f17750l0 || this.f17749k0 != this.f17748j0) && (i2 <= (i4 = this.f17748j0) || i < (i5 = this.f17749k0) || (i5 == i4 && i == i4))) {
            if (i2 > i4 || (this.f17749k0 == i4 && (i == i4 || i2 == i4))) {
                z = true;
            }
            this.f17750l0 = z;
            if (z) {
                return l0VarArr2[i6];
            }
            return null;
        } else {
            i3 = i6 + 1;
        }
        int length = l0VarArr2.length;
        for (int i7 = i3; i7 < length; i7++) {
            int i8 = this.f17739b0[i7].m22785i();
            int e = this.f17739b0[i7].m22786e();
            if (e - i8 != 0 || this.f17739b0[i7].mo22735r()) {
                if (i2 <= i8 || i < e || (e == i8 && i == i8)) {
                    this.f17747i0 = i7;
                    this.f17748j0 = i8;
                    this.f17749k0 = e;
                    if (i2 > i8 || (e == i8 && (i == i8 || i2 == i8))) {
                        z = true;
                    }
                    this.f17750l0 = z;
                    if (z) {
                        return this.f17739b0[i7];
                    }
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = true;
                for (AbstractC5411l0 l0Var : this.f17739b0) {
                    if (z2) {
                        z2 = false;
                    } else {
                        sb2.append('\n');
                    }
                    sb2.append("{type: ");
                    sb2.append(l0Var.mo22741l());
                    sb2.append(", start: ");
                    sb2.append(l0Var.m22785i());
                    sb2.append(", end: ");
                    sb2.append(l0Var.m22786e());
                    sb2.append(", entity: ");
                    sb2.append(l0Var.toString());
                    sb2.append("}");
                }
                Log.m14714v("Next entity not found (entities not sorted?), startIndex:%d start:%d, end:%d, entities:\n%s", Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i2), sb2.toString());
            }
        }
        return null;
    }

    public void m22993H0(Rect rect, C5455v0 v0Var, int i) {
        int indexOf;
        rect.set(0, v0Var.m22676r(), m22941f0(v0Var.m22684j()), v0Var.m22676r() + m22958Z(v0Var.m22684j()));
        if (m22976Q() > 0) {
            rect.left = v0Var.m22677q();
            rect.right = v0Var.m22677q() + ((int) v0Var.m22678p());
        }
        AbstractC5411l0 g = v0Var.m22687g();
        if (!(g == null || (indexOf = this.f17730U.indexOf(v0Var)) == -1)) {
            int i2 = indexOf;
            while (i2 > 0) {
                int i3 = i2 - 1;
                if (this.f17730U.get(i3).m22684j() != v0Var.m22684j() || !AbstractC5411l0.m22788b(g, this.f17730U.get(i3).m22687g(), i, this.f17729T)) {
                    break;
                }
                i2--;
            }
            while (true) {
                int i4 = indexOf + 1;
                if (i4 >= this.f17730U.size() || this.f17730U.get(i4).m22684j() != v0Var.m22684j() || !AbstractC5411l0.m22788b(g, this.f17730U.get(i4).m22687g(), i, this.f17729T)) {
                    break;
                }
                indexOf = i4;
            }
            int N = m22982N(this.f17726Q, g, i != 0, false);
            rect.top -= N;
            rect.bottom += N;
            rect.left = this.f17730U.get(i2).m22677q();
            rect.right = this.f17730U.get(indexOf).m22677q() + ((int) this.f17730U.get(indexOf).m22678p());
        }
        rect.offset(this.f17758t0, this.f17761w0);
    }

    public final C5399i m22990J(TdApi.TextEntity textEntity) {
        if (!(this.f17731V == null || textEntity == null)) {
            for (int i = 0; i < this.f17731V.m21496p(); i++) {
                C5399i q = this.f17731V.m21495q(i);
                if (textEntity.offset >= q.f17789c && textEntity.offset < q.f17789c + q.f17783M) {
                    return q;
                }
            }
        }
        return null;
    }

    public final float m22989J0(Paint paint) {
        if (this.f17757s0 == 0.0f || this.f17756r0 != paint) {
            this.f17757s0 = C7389v0.m16680T1(" ", paint);
            this.f17756r0 = paint;
        }
        return this.f17757s0;
    }

    public final int m22988K(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        int i8 = i3;
        int i9 = i - i8;
        int i10 = i2 - i6;
        int i11 = 0;
        boolean z2 = (this.f17738b & 2) != 0;
        int R = m22974R();
        Iterator<C5455v0> it = this.f17730U.iterator();
        int i12 = -1;
        int i13 = 0;
        while (it.hasNext()) {
            C5455v0 next = it.next();
            if (z2) {
                int f0 = m22941f0(next.m22684j());
                int i14 = (this.f17736a / 2) + i8;
                int i15 = f0 / 2;
                i7 = next.m22708D(i14 - i15, i14 + i15, i11);
            } else {
                i7 = next.m22708D(i8, i4, i5) - i8;
            }
            int r = next.m22676r() + m22924l0(next);
            int p = ((int) next.m22678p()) + i7;
            int k0 = r + m22927k0(next);
            if (i9 >= i7 && i9 < p && i10 >= r && i10 < k0) {
                if (i12 == -1) {
                    i12 = i13;
                }
                if (m22977P0(next) || next.m22689e() != null) {
                    return i13;
                }
            } else if (i12 == -1 && i9 >= i7 - R && i9 <= p + R && i10 >= r - R && i10 <= k0 + R) {
                i12 = i13;
            }
            i13++;
            i8 = i3;
            i11 = 0;
        }
        if (i12 == -1) {
            return -1;
        }
        C5455v0 v0Var = this.f17730U.get(i12);
        if (!z || m22977P0(v0Var) || v0Var.m22689e() != null) {
            return i12;
        }
        return -1;
    }

    public TextPaint m22987K0(TextPaint textPaint) {
        return textPaint;
    }

    public int m22986L() {
        return -m22972S().ascent;
    }

    public final boolean m22985L0(C5455v0 v0Var) {
        if (this.f17724O != -1 && m22962X() + 1 >= this.f17724O) {
            return false;
        }
        this.f17742d0 = v0Var.m22677q();
        int O = m22980O();
        int i = this.f17746h0;
        m22922m(this.f17742d0, O);
        this.f17744f0 = Math.max(this.f17744f0, this.f17742d0);
        this.f17742d0 = (int) v0Var.m22678p();
        int i2 = this.f17743e0 + O;
        this.f17743e0 = i2;
        this.f17746h0 = 0;
        v0Var.m22696P(0, i2);
        m23000E(O, i);
        return true;
    }

    public int m22984M(AbstractC5408k kVar, AbstractC5411l0 l0Var, boolean z) {
        if (m22896w0(l0Var)) {
            return m22961X0(kVar, l0Var).mo7851p0(z);
        }
        return 0;
    }

    public int m22982N(AbstractC5408k kVar, AbstractC5411l0 l0Var, boolean z, boolean z2) {
        if (!m22896w0(l0Var)) {
            return 0;
        }
        AbstractC5408k X0 = m22961X0(kVar, l0Var);
        int e = X0.mo7854e(z);
        int g = X0.mo7853g(z);
        int Q = X0.mo7858Q();
        if (z2 && g != 0) {
            Q = Math.max(0, Q - C1357a0.m37526x());
        }
        if (g == 0 && e == 0) {
            return 0;
        }
        return Q;
    }

    public final int m22980O() {
        return Math.max(this.f17746h0, m22960Y());
    }

    public int m22978P() {
        ArrayList<C5455v0> arrayList = this.f17730U;
        if (!(arrayList == null || this.f17735Z == 0)) {
            int size = arrayList.size();
            int i = this.f17735Z;
            if (size <= i) {
                return i;
            }
        }
        return -1;
    }

    public final boolean m22977P0(C5455v0 v0Var) {
        C5399i J = m22990J(v0Var.m22681m());
        return J != null && J.m22851j();
    }

    public int m22976Q() {
        AbstractC5411l0[] l0VarArr = this.f17739b0;
        if (l0VarArr != null) {
            return l0VarArr.length;
        }
        return 0;
    }

    public final Paint.FontMetricsInt m22972S() {
        return m22970T(this.f17725P.m22660h());
    }

    public final void m22971S0(List<C5455v0> list, String str) {
        m22969T0(list, str, 0, 0, null);
    }

    public final Paint.FontMetricsInt m22970T(float f) {
        float f2 = this.f17754p0;
        if (f2 == -1.0f || f2 != f) {
            this.f17725P.m22662f().getFontMetricsInt(this.f17755q0);
            this.f17754p0 = f;
        }
        return this.f17755q0;
    }

    public final void m22969T0(java.util.List<ie.C5455v0> r20, java.lang.String r21, int r22, int r23, ie.AbstractC5411l0 r24) {
        throw new UnsupportedOperationException("Method not decompiled: ie.RunnableC5390g.m22969T0(java.util.List, java.lang.String, int, int, ie.l0):void");
    }

    public boolean m22968U() {
        ArrayList<C5455v0> arrayList = this.f17730U;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C5455v0> arrayList2 = this.f17730U;
            if (arrayList2.get(arrayList2.size() - 1).m22671w()) {
                return true;
            }
        }
        return m22919n();
    }

    public boolean m22967U0(View view, MotionEvent motionEvent) {
        return m22965V0(view, motionEvent, null);
    }

    public int m22966V() {
        return this.f17742d0;
    }

    public boolean m22965V0(View view, MotionEvent motionEvent, AbstractC5393c cVar) {
        int i;
        int i2;
        boolean z;
        boolean z2 = false;
        if (this.f17730U == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                m22905s();
                C5398h hVar = this.f17763y0;
                if (hVar != null) {
                    C5455v0 v0Var = this.f17730U.get(hVar.f17779a);
                    if (this.f17763y0.m22862a()) {
                        m22935h1(v0Var);
                        C2065g.m35719c(view);
                        return true;
                    }
                    AbstractC5411l0 e = v0Var.m22689e();
                    AbstractC5394d dVar = this.f17723N;
                    if (dVar != null) {
                        z = dVar.mo22863a(view, this, v0Var, e != null ? e.m22781y(view, this, v0Var) : new HandlerC10770jj.C10788q().m3312s(v0Var.m22707E(view)));
                    } else if (e != null) {
                        e.mo22729z(view, this, v0Var, cVar);
                        z = true;
                    } else {
                        z = false;
                    }
                    m22913p();
                    if (z) {
                        C2065g.m35719c(view);
                        return true;
                    }
                }
            } else if (action != 2) {
                if (action == 3) {
                    m22905s();
                    if (this.f17763y0 == null) {
                        return false;
                    }
                    m22913p();
                    return true;
                }
            } else if (this.f17763y0 == null) {
                return false;
            } else {
                if (Math.max(Math.abs(this.f17764z0 - motionEvent.getX()), Math.abs(this.f17718A0 - motionEvent.getY())) > C1357a0.m37534p()) {
                    m22913p();
                }
                return true;
            }
            return this.f17763y0 != null;
        }
        this.f17764z0 = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f17718A0 = y;
        boolean z3 = this.f17723N == null;
        int K = m22988K(this.f17764z0, y, this.f17758t0, this.f17759u0, this.f17760v0, this.f17761w0, z3);
        if (K == -1) {
            m22913p();
            return false;
        }
        C5455v0 v0Var2 = this.f17730U.get(K);
        C5399i J = m22990J(v0Var2.m22681m());
        boolean z4 = J != null && J.m22851j();
        if (z4) {
            i = J.f17787a;
            i2 = J.f17787a + J.f17788b;
        } else if ((!z3 || v0Var2.m22675s()) && (z3 || v0Var2.m22675s() || C5063c.m24144b(this.f17738b, Log.TAG_CONTACT))) {
            AbstractC5411l0 e2 = this.f17730U.get(K).m22689e();
            if (e2 != null) {
                int i3 = K;
                while (i3 > 0 && this.f17730U.get(i3 - 1).m22669y(e2)) {
                    i3--;
                }
                int i4 = K;
                while (true) {
                    int i5 = i4 + 1;
                    if (i5 >= this.f17730U.size() || !this.f17730U.get(i5).m22669y(e2)) {
                        break;
                    }
                    i4 = i5;
                }
                i = i3;
                i2 = i4;
            } else {
                i = K;
                i2 = i;
            }
        } else {
            m22913p();
            return false;
        }
        if (!z4) {
            J = null;
        }
        C5398h hVar2 = new C5398h(K, i, i2, J);
        this.f17763y0 = hVar2;
        if (hVar2.m22862a()) {
            this.f17763y0.f17782d.m22850k(true, true);
        } else {
            if (this.f17723N == null) {
                z2 = true;
            }
            if (m22906r0(K, z2)) {
                if ((this.f17738b & 8) != 0) {
                    m22932i1(view, cVar);
                } else {
                    this.f17720C0 = cVar;
                }
            }
        }
        return true;
    }

    public int m22964W() {
        int i = 0;
        int a0 = m22955a0(false) / 2;
        if (!this.f17730U.isEmpty()) {
            i = m22924l0(this.f17730U.get(0));
        }
        return a0 + i;
    }

    public boolean m22963W0(View view) {
        C5398h hVar = this.f17763y0;
        if (hVar == null || hVar.m22862a()) {
            return false;
        }
        int i = this.f17763y0.f17779a;
        AbstractC5393c cVar = this.f17720C0;
        m22913p();
        AbstractC5411l0 e = this.f17730U.get(i).m22689e();
        if (e == null) {
            return false;
        }
        return e.mo22755A(view, this, this.f17730U.get(i), (this.f17738b & 16) == 0, cVar);
    }

    public int m22962X() {
        List<int[]> list = this.f17734Y;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public AbstractC5408k m22961X0(AbstractC5408k kVar, AbstractC5411l0 l0Var) {
        AbstractC5408k g;
        if (kVar == null) {
            kVar = this.f17726Q;
        }
        return (l0Var == null || (g = l0Var.mo22743g(kVar)) == null) ? kVar : g;
    }

    public int m22960Y() {
        return m22955a0(true);
    }

    public final void m22959Y0(String str, CharSequence charSequence, C5088i iVar, int i, int i2, ArrayList<C5455v0> arrayList, AbstractC5411l0 l0Var) {
        this.f17745g0 = null;
        if (this.f17742d0 + this.f17752n0 > m22952b0(m22962X(), this.f17743e0)) {
            m22971S0(arrayList, str);
        }
        C5455v0 v0Var = new C5455v0(this, str, i, i2, m22962X(), this.f17741c0);
        v0Var.m22696P(this.f17742d0, this.f17743e0);
        v0Var.m22697O(this.f17752n0);
        v0Var.m22702J(l0Var);
        v0Var.m22704H(iVar);
        arrayList.add(v0Var);
        this.f17742d0 += this.f17752n0;
    }

    public int m22958Z(int i) {
        return m22949c0(i)[1];
    }

    public final int m22957Z0(String str, int i, int i2, ArrayList<C5455v0> arrayList, C5078d.AbstractC5080b bVar, boolean z) {
        AbstractC5411l0 H = m22994H(i, i2);
        if (m22961X0(null, H).mo7857X0(false) != 0) {
            this.f17738b |= Log.TAG_TDLIB_OPTIONS;
        }
        if (H == null) {
            m22943e1(str, i, i2, arrayList, bVar, null);
            return -1;
        }
        if (H.mo22742h() != null) {
            this.f17738b |= Integer.MIN_VALUE;
        }
        int max = Math.max(i, this.f17748j0);
        if (max > i) {
            m22943e1(str, i, max, arrayList, bVar, null);
        }
        int i3 = this.f17749k0;
        if (i3 < i2) {
            m22943e1(str, max, i3, arrayList, bVar, H);
            if (!z) {
                int i4 = this.f17749k0;
                do {
                    i4 = m22957Z0(str, i4, i2, arrayList, bVar, true);
                    if (i4 == -1) {
                        break;
                    }
                } while (i4 < i2);
            } else {
                return this.f17749k0;
            }
        } else {
            m22943e1(str, max, i2, arrayList, bVar, H);
        }
        return -1;
    }

    @Override
    public String mo22956a() {
        return this.f17729T;
    }

    public int m22955a0(boolean z) {
        Paint.FontMetricsInt S = m22972S();
        return Math.abs(S.descent - S.ascent) + S.leading + (z ? m22947d0() : 0);
    }

    public final void m22954a1(String str, int i, ArrayList<C5455v0> arrayList, AbstractC5411l0 l0Var) {
        this.f17745g0 = null;
        C5427s0 f = l0Var.mo22756f();
        int i2 = C1357a0.m37541i(f.m22718b());
        int i3 = C1357a0.m37541i(f.m22719a());
        int b0 = m22952b0(m22962X(), this.f17743e0);
        int i4 = this.f17742d0;
        if (i4 > 0 && i4 + i2 > b0) {
            m22971S0(arrayList, str);
            b0 = m22952b0(m22962X(), this.f17743e0);
        }
        if (i2 > b0) {
            i3 = (int) (i3 * (b0 / i2));
            i2 = b0;
        }
        C5455v0 v0Var = new C5455v0(this, str, i, i, m22962X(), this.f17741c0);
        v0Var.m22696P(this.f17742d0, this.f17743e0);
        v0Var.m22697O(i2);
        v0Var.m22701K(i3);
        v0Var.m22702J(l0Var);
        v0Var.m22700L(this.f17737a0, f);
        arrayList.add(v0Var);
        this.f17742d0 += i2;
        this.f17746h0 = Math.max(i3, this.f17746h0);
        this.f17737a0++;
    }

    @Override
    public int mo22953b() {
        return this.f17735Z;
    }

    public int m22952b0(int i, int i2) {
        if (i != -1) {
            AbstractC5397g gVar = this.f17740c;
            return (gVar != null ? gVar.mo9971a(i, i2, this.f17736a, m22960Y()) : this.f17736a - m22944e0(i, i2)) - this.f17728S;
        }
        throw new IllegalArgumentException("lineIndex == -1");
    }

    public final void m22951b1(String str, int i, int i2, ArrayList<C5455v0> arrayList, C5078d.AbstractC5080b bVar) {
        int i3 = i;
        if (i3 == i2) {
            m22957Z0(str, i, i2, arrayList, bVar, false);
            return;
        }
        int i4 = i3;
        int i5 = 0;
        boolean z = false;
        boolean z2 = true;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt == 10 && !C5063c.m24144b(this.f17738b, Log.TAG_ROUND)) {
                break;
            }
            boolean z3 = charCount == 1 && (codePointAt == 10 || Character.getType(codePointAt) == 12);
            if (z2) {
                i5 += charCount;
                z = z3;
                z2 = false;
            } else if (z == z3) {
                i5 += charCount;
            } else {
                int i6 = i4 + i5;
                m22957Z0(str, i4, i6, arrayList, bVar, false);
                i5 = charCount;
                z = z3;
                i4 = i6;
            }
            i3 += charCount;
        }
        int i7 = i4 + i5;
        m22957Z0(str, i4, i7, arrayList, bVar, false);
        if (i7 < i2) {
            m22957Z0(str, i7, i2, arrayList, bVar, false);
        }
    }

    @Override
    public boolean mo22950c() {
        this.f17735Z++;
        return true;
    }

    public final int[] m22949c0(int i) {
        if (i >= 0 && i < m22962X()) {
            return this.f17734Y.get(i);
        }
        throw new IllegalArgumentException("lineIndex == " + i);
    }

    public final int m22948c1(java.lang.String r24, int r25, int r26, java.util.ArrayList<ie.C5455v0> r27, ie.AbstractC5411l0 r28, boolean r29, float[] r30) {
        throw new UnsupportedOperationException("Method not decompiled: ie.RunnableC5390g.m22948c1(java.lang.String, int, int, java.util.ArrayList, ie.l0, boolean, float[]):int");
    }

    @Override
    public int mo7991d(boolean z) {
        return C3962o.m29470a(this, z);
    }

    public int m22947d0() {
        if (C5063c.m24144b(this.f17738b, Log.TAG_NDK)) {
            return 0;
        }
        return this.f17725P.m22665c((this.f17738b & 32) != 0 ? 3.0f : 2.0f);
    }

    public final int m22946d1(String str, int i, int i2, ArrayList<C5455v0> arrayList, AbstractC5411l0 l0Var, boolean z) {
        int i3;
        int i4;
        int i5;
        int codePointAt = str.codePointAt(i);
        if (!m23005B0(codePointAt, false) || (i3 = i + Character.charCount(codePointAt)) >= i2) {
            i3 = i;
        }
        int i6 = i3;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i6 >= i2) {
                break;
            }
            int codePointAt2 = str.codePointAt(i6);
            int charCount = Character.charCount(codePointAt2);
            int type = Character.getType(codePointAt2);
            if (m23003C0(codePointAt2, type, true)) {
                if (i6 == i3 || (i5 = i6 + charCount) == i2 || !m23005B0(str.codePointAt(i5), false)) {
                    i7 = i6 + charCount;
                    i8 = i7;
                } else {
                    i8 = i5;
                    i7 = i6;
                }
                if (type == 12) {
                    i8 = -1;
                }
            } else if (m22973R0(codePointAt2)) {
                i7 = i6 + charCount;
                i8 = i7;
            }
            if (i7 == -1) {
                i6 += charCount;
            } else if (i8 != -1) {
                while (i8 < i2) {
                    int codePointAt3 = str.codePointAt(i8);
                    int type2 = Character.getType(codePointAt3);
                    if (!m23003C0(codePointAt2, type2, true) || (i8 = i8 + Character.charCount(codePointAt3)) > i2) {
                        break;
                    } else if (type2 == 12) {
                        i4 = i8;
                        break;
                    } else {
                        i7 = i8;
                    }
                }
            }
        }
        i4 = i7;
        if (i4 == -1 || i4 == i2) {
            m22948c1(str, i, i2, arrayList, l0Var, false, null);
        } else {
            m22948c1(str, i, i4, arrayList, l0Var, false, null);
            if (z) {
                return i4;
            }
            int i9 = i4;
            do {
                i9 = m22946d1(str, i9, i2, arrayList, l0Var, true);
            } while (i9 != -1);
        }
        return -1;
    }

    public int m22944e0(int i, int i2) {
        if (i != -1) {
            AbstractC5396f fVar = this.f17722M;
            if (fVar != null) {
                return fVar.mo7827a(i, i2, this.f17736a, m22960Y());
            }
            return 0;
        }
        throw new IllegalArgumentException("lineIndex == -1");
    }

    public final void m22943e1(String str, int i, int i2, ArrayList<C5455v0> arrayList, C5078d.AbstractC5080b bVar, AbstractC5411l0 l0Var) {
        Paint.FontMetricsInt E = C1410y.m37076E(m22915o0(l0Var));
        if (i2 - i != 0) {
            this.f17751m0 = i;
            this.f17753o0 = l0Var;
            this.f17752n0 = Math.abs(E.descent - E.ascent) + C1357a0.m37541i(2.0f);
            C5078d.m23986z().m24022K(str, i, i2, this, bVar);
            int i3 = this.f17751m0;
            if (i3 < i2) {
                m22946d1(str, i3, i2, arrayList, l0Var, false);
            }
        } else if (l0Var != null && l0Var.mo22735r()) {
            m22954a1(str, i, arrayList, l0Var);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof RunnableC5390g) && ((RunnableC5390g) obj).f17729T.equals(this.f17729T);
    }

    public int m22941f0(int i) {
        return m22949c0(i)[0];
    }

    public int m22940f1(C6238b bVar, int i) {
        int i2 = 0;
        boolean z = i == -1;
        if (this.f17737a0 > 0) {
            if (z) {
                i = 0;
            }
            Iterator<C5455v0> it = this.f17730U.iterator();
            while (it.hasNext()) {
                C5455v0 next = it.next();
                if (next.m22672v()) {
                    next.m22706F(bVar, i);
                    i2++;
                }
            }
            if (z) {
                bVar.m20996g(i2);
            }
            return i2;
        }
        if (z) {
            bVar.m20999d();
        }
        return 0;
    }

    @Override
    public int mo7990g(boolean z) {
        return C3962o.m29469b(this, z);
    }

    public int m22939g0() {
        return this.f17724O;
    }

    public final void m22938g1() {
        this.f17747i0 = -1;
        this.f17749k0 = 0;
        this.f17748j0 = 0;
        this.f17763y0 = null;
        this.f17735Z = 0;
        this.f17737a0 = 0;
        this.f17741c0 = 0;
        this.f17743e0 = 0;
        this.f17742d0 = 0;
        this.f17744f0 = 0;
        this.f17746h0 = 0;
        this.f17745g0 = null;
        this.f17738b &= 134217727;
        List<int[]> list = this.f17734Y;
        if (list != null) {
            list.clear();
        }
        m22907r();
    }

    @Override
    public int getHeight() {
        return this.f17743e0;
    }

    @Override
    public int getWidth() {
        return this.f17744f0;
    }

    public int m22936h0() {
        return this.f17736a;
    }

    public final void m22935h1(C5455v0 v0Var) {
        C5399i J = m22990J(v0Var.m22681m());
        if (J != null) {
            J.f17785O.m29575p(true, true);
        }
    }

    public int hashCode() {
        return this.f17729T.hashCode();
    }

    public int m22933i0() {
        if (this.f17730U.isEmpty()) {
            return 0;
        }
        ArrayList<C5455v0> arrayList = this.f17730U;
        C5455v0 v0Var = arrayList.get(arrayList.size() - 1);
        return v0Var.m22676r() + m22958Z(v0Var.m22684j());
    }

    public final void m22932i1(View view, AbstractC5393c cVar) {
        m22916o();
        if (view != null) {
            this.f17719B0 = view;
            this.f17720C0 = cVar;
            view.postDelayed(this, ViewConfiguration.getLongPressTimeout());
        }
    }

    public int m22930j0(AbstractC5408k kVar, AbstractC5411l0 l0Var, boolean z) {
        if (m22896w0(l0Var)) {
            return m22961X0(kVar, l0Var).mo7850r0(z);
        }
        return 0;
    }

    public void m22929j1(int i, String str) {
        m22926k1(i, str, this.f17739b0);
    }

    public final int m22927k0(C5455v0 v0Var) {
        float h = v0Var.m22686h();
        return h != -1.0f ? (int) h : m22960Y();
    }

    public void m22926k1(int i, String str, AbstractC5411l0[] l0VarArr) {
        if (str != null) {
            this.f17736a = i;
            this.f17739b0 = l0VarArr;
            try {
                if (!Log.isEnabled(64) || !Log.checkLogLevel(3)) {
                    m22923l1(str);
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m22923l1(str);
                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (elapsedRealtime2 >= 150) {
                    Log.m14711w(64, "Text.set took %dms for %d chars, maxWidth: %d, text:\n%s", Integer.valueOf(elapsedRealtime2), Integer.valueOf(str.length()), Integer.valueOf(i), str);
                } else {
                    Log.m14716v(64, "Text.set took %dms for %d chars, maxWidth: %d", Integer.valueOf(elapsedRealtime2), Integer.valueOf(str.length()), Integer.valueOf(i));
                }
            } catch (Throwable th) {
                Log.m14712w(64, "Couldn't parse %d chars for max width: %d, fontSize: %f, text:\n%s", th, Integer.valueOf(str.length()), Integer.valueOf(i), Float.valueOf(C4868i.m24726c2().m24592t0()), str);
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void m22925l(Path path, C5455v0 v0Var, int i, int i2, int i3, boolean z, boolean z2) {
        TextPaint o0;
        int i4;
        int N = m22982N(this.f17726Q, v0Var.m22687g(), z2, true);
        int i5 = C1357a0.m37541i(3.0f);
        Paint.FontMetricsInt T = m22970T(m22915o0(v0Var.m22687g()).getTextSize());
        if (z) {
            int f0 = m22941f0(v0Var.m22684j());
            int i6 = i + (this.f17736a / 2);
            int i7 = f0 / 2;
            i4 = v0Var.m22708D(i6 - i7, i6 + i7, 0);
        } else {
            i4 = v0Var.m22708D(i, i2, i3);
        }
        int r = v0Var.m22676r();
        float p = v0Var.m22678p();
        RectF a0 = C1410y.m37050a0();
        float f = i4 - N;
        a0.left = f;
        a0.top = r - N;
        float f2 = f + p;
        float f3 = N;
        a0.right = f2 + f3 + f3;
        a0.bottom = r + (v0Var.m22686h() == -1 ? T.descent - T.ascent : v0Var.m22686h()) + N;
        a0.offset(0.0f, o0.baselineShift + m22924l0(v0Var));
        float f4 = i5;
        path.addRoundRect(a0, f4, f4, Path.Direction.CW);
    }

    public final int m22924l0(C5455v0 v0Var) {
        if (this.f17737a0 > 0) {
            return (m22958Z(v0Var.m22684j()) - m22927k0(v0Var)) / 2;
        }
        return 0;
    }

    public final void m22923l1(final java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: ie.RunnableC5390g.m22923l1(java.lang.String):void");
    }

    public final void m22922m(int i, int i2) {
        if (this.f17734Y == null) {
            this.f17734Y = new ArrayList();
        }
        this.f17734Y.add(new int[]{i, i2});
        if (i == 0) {
            this.f17741c0++;
        }
    }

    public int m22921m0() {
        return m22918n0(null, null, C5063c.m24144b(this.f17738b, Log.TAG_CONTACT), false);
    }

    public final void m22920m1(boolean z) {
        if (m22904s0() != z) {
            this.f17738b = C5063c.m24138h(this.f17738b, 16777216, z);
            ViewGroup viewGroup = null;
            if (z) {
                View view = this.f17719B0;
                if (view != null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                this.f17721D0 = viewGroup;
                if (viewGroup != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.f17721D0;
            if (viewGroup2 != null) {
                viewGroup2.requestDisallowInterceptTouchEvent(false);
                this.f17721D0 = null;
            }
        }
    }

    public boolean m22919n() {
        return (this.f17738b & Log.TAG_CRASH) != 0 || (C4403w.m27984G2() && (this.f17738b & 268435456) != 0);
    }

    public int m22918n0(AbstractC5408k kVar, AbstractC5411l0 l0Var, boolean z, boolean z2) {
        AbstractC5408k X0 = m22961X0(kVar, l0Var);
        return m22896w0(l0Var) ? X0.mo7852o0(z2) : X0.mo7855c();
    }

    public boolean m22917n1(int i) {
        if (this.f17738b == i) {
            return false;
        }
        this.f17738b = i;
        return true;
    }

    public final void m22916o() {
        View view = this.f17719B0;
        if (view != null) {
            view.removeCallbacks(this);
        }
    }

    public TextPaint m22915o0(AbstractC5411l0 l0Var) {
        TextPaint textPaint;
        int i = 0;
        boolean z = (this.f17738b & 4) != 0;
        float d = l0Var != null ? l0Var.mo22757d() : 0.0f;
        if (l0Var != null) {
            textPaint = l0Var.m22783k(this.f17725P, z);
        } else if (z) {
            textPaint = (this.f17738b & 67108864) != 0 ? this.f17725P.m22663e() : this.f17725P.m22664d();
        } else {
            textPaint = this.f17725P.m22662f();
        }
        if (d != 0.0f) {
            i = (int) (textPaint.ascent() * d);
        }
        textPaint.baselineShift = i;
        return textPaint;
    }

    public void m22914o1(AbstractC4345j jVar) {
        this.f17762x0 = jVar;
    }

    public void m22913p() {
        C5398h hVar = this.f17763y0;
        if (hVar != null) {
            C5399i iVar = hVar.f17782d;
            if (iVar != null) {
                iVar.m22850k(false, true);
            }
            this.f17763y0 = null;
            if ((this.f17738b & 8) != 0) {
                m22916o();
            }
            AbstractC4345j jVar = this.f17762x0;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        m22920m1(false);
    }

    public AbstractC4345j m22912p0() {
        return this.f17762x0;
    }

    public void m22910q(int i) {
        if (this.f17736a != i) {
            m22926k1(i, this.f17729T, this.f17739b0);
        }
    }

    public void m22908q1(Rect rect) {
        int i = this.f17758t0;
        rect.set(i, this.f17761w0, getWidth() + i, this.f17761w0 + getHeight());
    }

    public final void m22907r() {
        C6035e<C5399i> eVar = this.f17731V;
        if (eVar != null) {
            for (int p = eVar.m21496p() - 1; p >= 0; p--) {
                C5399i q = this.f17731V.m21495q(p);
                if (q != null) {
                    q.mo4501a3();
                }
            }
            this.f17731V.m21509b();
            this.f17731V = null;
        }
    }

    public boolean m22906r0(int i, boolean z) {
        if (this.f17730U.get(i).m22689e() == null) {
            return !z;
        }
        AbstractC4345j jVar = this.f17762x0;
        if (jVar != null) {
            jVar.invalidate();
        }
        return true;
    }

    @Override
    public void run() {
        View view = this.f17719B0;
        if (view != null && this.f17763y0 != null && m22963W0(view)) {
            view.performHapticFeedback(0);
            if ((this.f17738b & 8) != 0) {
                m22920m1(true);
            }
        }
    }

    public final void m22905s() {
        m22920m1(false);
    }

    public final boolean m22904s0() {
        return (this.f17738b & 16777216) != 0;
    }

    public void m22903t(Canvas canvas, int i, int i2) {
        m22891z(canvas, i, i2, null, 1.0f);
    }

    public void m22901u(Canvas canvas, int i, int i2, int i3, int i4) {
        m22899v(canvas, i, i2, i3, i4, null, 1.0f);
    }

    public void m22899v(Canvas canvas, int i, int i2, int i3, int i4, AbstractC5408k kVar, float f) {
        m22897w(canvas, i, i2, i3, i4, kVar, f, null);
    }

    public void m22897w(Canvas canvas, int i, int i2, int i3, int i4, AbstractC5408k kVar, float f, C6238b bVar) {
        m22895x(canvas, i, i2, i3, i4, kVar, f, bVar, -1);
    }

    public final boolean m22896w0(AbstractC5411l0 l0Var) {
        return (C5063c.m24144b(this.f17738b, Log.TAG_CONTACT) || (l0Var != null && l0Var.mo22738o())) && !C5063c.m24144b(this.f17738b, Log.TAG_PAINT);
    }

    public void m22895x(android.graphics.Canvas r31, int r32, int r33, int r34, int r35, ie.AbstractC5408k r36, float r37, p156kd.C6238b r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: ie.RunnableC5390g.m22895x(android.graphics.Canvas, int, int, int, int, ie.k, float, kd.b, int):void");
    }

    public boolean m22894x0() {
        return (this.f17738b & Log.TAG_TDLIB_FILES) != 0;
    }

    public void m22893y(Canvas canvas, int i, int i2, AbstractC5408k kVar) {
        m22891z(canvas, i, i2, kVar, 1.0f);
    }

    public boolean m22892y0() {
        return C5070i.m24061i(this.f17729T);
    }

    public void m22891z(Canvas canvas, int i, int i2, AbstractC5408k kVar, float f) {
        m22899v(canvas, i, i, 0, i2, kVar, f);
    }

    public boolean m22890z0() {
        return (this.f17738b & 134217728) != 0;
    }

    public RunnableC5390g(String str, int i, C5457w0 w0Var, AbstractC5408k kVar, int i2, AbstractC5397g gVar, AbstractC5396f fVar, int i3, AbstractC5411l0[] l0VarArr, String str2, AbstractC5394d dVar) {
        this.f17747i0 = -1;
        this.f17754p0 = -1.0f;
        this.f17755q0 = new Paint.FontMetricsInt();
        this.f17738b = i3;
        this.f17736a = i;
        this.f17724O = i2;
        this.f17740c = gVar;
        this.f17722M = fVar;
        this.f17723N = dVar;
        this.f17725P = w0Var;
        this.f17726Q = kVar;
        this.f17739b0 = l0VarArr;
        this.f17727R = str2;
        this.f17728S = !C5070i.m24061i(str2) ? (int) C7389v0.m16680T1(str2, m22915o0(null)) : 0;
        m22929j1(i, str);
    }

    public static class C5392b {
        public String f17767a;
        public int f17768b;
        public C5457w0 f17769c;
        public AbstractC5408k f17770d;
        public int f17771e;
        public AbstractC5397g f17772f;
        public AbstractC5396f f17773g;
        public int f17774h;
        public AbstractC5411l0[] f17775i;
        public String f17776j;
        public AbstractC4345j f17777k;
        public AbstractC5394d f17778l;

        public C5392b(String str, int i, C5457w0 w0Var, AbstractC5408k kVar) {
            this.f17771e = -1;
            if (str != null) {
                this.f17767a = str;
                this.f17768b = i;
                this.f17769c = w0Var;
                this.f17770d = kVar;
                return;
            }
            throw new IllegalArgumentException();
        }

        public C5392b m22889a(int i) {
            return m22865y(i | this.f17774h);
        }

        public C5392b m22888b() {
            return m22887c(true);
        }

        public C5392b m22887c(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, 4, z));
        }

        public C5392b m22886d() {
            return m22885e(true);
        }

        public C5392b m22885e(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, Log.TAG_CONTACT, z));
        }

        public RunnableC5390g m22884f() {
            RunnableC5390g gVar = new RunnableC5390g(this.f17767a, this.f17768b, this.f17769c, this.f17770d, this.f17771e, this.f17772f, this.f17773g, this.f17774h, this.f17775i, this.f17776j, this.f17778l);
            AbstractC4345j jVar = this.f17777k;
            if (jVar != null) {
                gVar.m22914o1(jVar);
            }
            return gVar;
        }

        public C5392b m22883g() {
            return m22882h(true);
        }

        public C5392b m22882h(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, Log.TAG_EMOJI, z));
        }

        public C5392b m22881i(AbstractC5411l0[] l0VarArr) {
            this.f17775i = l0VarArr;
            return this;
        }

        public C5392b m22880j() {
            return m22879k(true);
        }

        public C5392b m22879k(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, Log.TAG_VIDEO, z));
        }

        public C5392b m22878l() {
            return m22877m(true);
        }

        public C5392b m22877m(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, Log.TAG_ROUND, z));
        }

        public C5392b m22876n(AbstractC5396f fVar) {
            this.f17773g = fVar;
            return this;
        }

        public C5392b m22875o(AbstractC5397g gVar) {
            this.f17772f = gVar;
            return this;
        }

        public C5392b m22874p(int i) {
            this.f17771e = i;
            return this;
        }

        public C5392b m22873q() {
            return m22872r(true);
        }

        public C5392b m22872r(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, Log.TAG_PAINT, z));
        }

        public C5392b m22871s() {
            return m22870t(true);
        }

        public C5392b m22870t(boolean z) {
            return m22865y(C5063c.m24138h(this.f17774h, Log.TAG_NDK, z));
        }

        public C5392b m22869u(AbstractC5394d dVar) {
            this.f17778l = dVar;
            return this;
        }

        public C5392b m22868v() {
            return m22874p(1);
        }

        public C5392b m22867w(C5457w0 w0Var) {
            this.f17769c = w0Var;
            return this;
        }

        public C5392b m22866x(String str) {
            this.f17776j = str;
            return this;
        }

        public C5392b m22865y(int i) {
            this.f17774h = i;
            return this;
        }

        public C5392b m22864z(AbstractC4345j jVar) {
            this.f17777k = jVar;
            return this;
        }

        public C5392b(C10930q6 q6Var, CharSequence charSequence, HandlerC10770jj.C10788q qVar, int i, C5457w0 w0Var, AbstractC5408k kVar) {
            this.f17771e = -1;
            this.f17767a = charSequence.toString();
            this.f17768b = i;
            this.f17769c = w0Var;
            this.f17770d = kVar;
            TdApi.TextEntity[] x5 = C4779t2.m25392x5(charSequence, false);
            AbstractC5411l0[] E = (x5 == null || x5.length <= 0) ? null : AbstractC5411l0.m22790E(q6Var, charSequence.toString(), x5, qVar);
            m22881i(E == null ? C4403w.m27916X2(charSequence) : E);
        }

        public C5392b(C10930q6 q6Var, TdApi.FormattedText formattedText, HandlerC10770jj.C10788q qVar, int i, C5457w0 w0Var, AbstractC5408k kVar) {
            this(formattedText.text, i, w0Var, kVar);
            m22881i(AbstractC5411l0.m22790E(q6Var, this.f17767a, formattedText.entities, qVar));
        }
    }
}
