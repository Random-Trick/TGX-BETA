package je;

import ae.p;
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
import ce.a0;
import ce.y;
import eb.i;
import eb.k;
import eb.l;
import eb.n;
import eb.o;
import gb.j;
import gd.w;
import hd.t2;
import id.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import zd.hj;
import zd.o6;

public class g implements Runnable, d.c, i.d, n.d {
    public int A0;
    public View B0;
    public c C0;
    public ViewGroup D0;
    public final f M;
    public final d N;
    public final int O;
    public final w0 P;
    public final k Q;
    public final String R;
    public final int S;
    public String T;
    public ArrayList<v0> U;
    public k0.e<i> V;
    public k0.e<a> W;
    public k0.h<Path> X;
    public List<int[]> Y;
    public int Z;
    public int f15370a;
    public int f15371a0;
    public int f15372b;
    public l0[] f15373b0;
    public final AbstractC0133g f15374c;
    public int f15375c0;
    public int f15376d0;
    public int f15377e0;
    public int f15378f0;
    public v0 f15379g0;
    public int f15380h0;
    public int f15381i0;
    public int f15382j0;
    public int f15383k0;
    public boolean f15384l0;
    public int f15385m0;
    public int f15386n0;
    public l0 f15387o0;
    public float f15388p0;
    public final Paint.FontMetricsInt f15389q0;
    public Paint f15390r0;
    public float f15391s0;
    public int f15392t0;
    public int f15393u0;
    public int f15394v0;
    public int f15395w0;
    public j f15396x0;
    public h f15397y0;
    public int f15398z0;

    public static class a {
        public final Path f15399a;
        public k f15400b;

        public a(Path path, k kVar) {
            this.f15399a = path;
            this.f15400b = kVar;
        }
    }

    public interface c {
        boolean A(String str);

        boolean C5(String str);

        boolean D3(View view, g gVar, v0 v0Var, String str, boolean z10);

        boolean H3(long j10);

        TdApi.WebPage J2(String str);

        p O1(View view, g gVar);

        boolean O4(String str);

        boolean R6(View view, String str);

        boolean a5(String str);

        boolean d5(View view, String str, boolean z10, hj.q qVar);

        boolean l2(String str);

        boolean l7(View view, String str, String str2, hj.q qVar);

        boolean z3(String str);
    }

    public interface d {
        boolean a(View view, g gVar, v0 v0Var, hj.q qVar);
    }

    public static class e extends IllegalStateException {
    }

    public interface f {
        int a(int i10, int i11, int i12, int i13);
    }

    public interface AbstractC0133g {
        int a(int i10, int i11, int i12, int i13);
    }

    public static class h {
        public final int f15413a;
        public final int f15414b;
        public final int f15415c;
        public final i f15416d;

        public h(int i10, int i11, int i12, i iVar) {
            this.f15413a = i10;
            this.f15414b = i11;
            this.f15415c = i12;
            this.f15416d = iVar;
        }

        public boolean a() {
            return this.f15416d != null;
        }

        public boolean b(int i10) {
            return i10 >= this.f15414b && i10 <= this.f15415c;
        }
    }

    public class i implements kb.c {
        public int M;
        public final int f15417a;
        public int f15418b;
        public int f15419c = -1;
        public final Path N = new Path();
        public final eb.f O = new eb.f(0, new a(), db.b.f7287b, 180);

        public class a implements k.b {
            public a() {
            }

            @Override
            public void n4(int i10, float f10, float f11, k kVar) {
                if (g.this.f15396x0 != null) {
                    g.this.f15396x0.invalidate();
                }
            }

            @Override
            public void o4(int i10, float f10, k kVar) {
                l.a(this, i10, f10, kVar);
            }
        }

        public i(int i10) {
            this.f15417a = i10;
        }

        @Override
        public void Q2() {
            this.O.c();
        }

        public void f(v0 v0Var, int i10, int i11, int i12, boolean z10) {
            TextPaint o02;
            int i13;
            this.f15418b++;
            TdApi.TextEntity m10 = v0Var.m();
            if (m10 != null) {
                if (this.f15419c == -1) {
                    this.f15419c = m10.offset;
                }
                this.M = (m10.offset + m10.length) - this.f15419c;
            }
            int i14 = a0.i(1.0f);
            int i15 = a0.i(3.0f);
            Paint.FontMetricsInt T = g.this.T(g.this.o0(v0Var.g()).getTextSize());
            if (z10) {
                int f02 = g.this.f0(v0Var.j());
                int i16 = i10 + (g.this.f15370a / 2);
                int i17 = f02 / 2;
                i13 = v0Var.D(i16 - i17, i16 + i17, 0);
            } else {
                i13 = v0Var.D(i10, i11, i12);
            }
            int r10 = v0Var.r();
            float p10 = v0Var.p();
            RectF a02 = y.a0();
            float f10 = i13 - i14;
            a02.left = f10;
            a02.top = r10 - i14;
            float f11 = f10 + p10;
            float f12 = i14;
            a02.right = f11 + f12 + f12;
            a02.bottom = r10 + (v0Var.h() == -1 ? T.descent - T.ascent : v0Var.h()) + i14;
            a02.offset(0.0f, o02.baselineShift + g.this.l0(v0Var));
            float f13 = i15;
            this.N.addRoundRect(a02, f13, f13, Path.Direction.CW);
        }

        public void g() {
        }

        public void h(Canvas canvas, @Deprecated int i10) {
            canvas.drawPath(this.N, y.g(ib.d.a(1.0f - i(), i10)));
        }

        public float i() {
            return this.O.g();
        }

        public boolean j() {
            return l();
        }

        public void k(boolean z10, boolean z11) {
        }

        public boolean l() {
            return this.O.g() != 1.0f;
        }
    }

    public g(String str, int i10, w0 w0Var, k kVar, int i11, int i12, l0[] l0VarArr) {
        this(str, i10, w0Var, kVar, i11, null, null, i12, l0VarArr, null, null);
    }

    public static void A(Canvas canvas, Path path, int i10, int i11) {
        if (Color.alpha(i11) > 0) {
            canvas.drawPath(path, y.Y(i11, a0.i(1.0f)));
        }
        if (Color.alpha(i10) > 0) {
            canvas.drawPath(path, y.g(i10));
        }
    }

    public static boolean B0(int i10, boolean z10) {
        return C0(i10, Character.getType(i10), z10);
    }

    public static boolean C0(int i10, int i11, boolean z10) {
        return D0(i10, i11, z10, null);
    }

    public static boolean D0(int i10, int i11, boolean z10, char[] cArr) {
        if (!(i10 == 34 || i10 == 160 || i10 == 183 || i10 == 39 || i10 == 40)) {
            if (i10 != 95) {
                if (i10 != 96) {
                    if (!(i11 == 22 || i11 == 24 || i11 == 20 || (z10 && i11 == 12))) {
                        if (cArr != null) {
                            for (char c10 : cArr) {
                                if (c10 == i10) {
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

    public boolean E0(String str, ArrayList arrayList, CharSequence charSequence, CharSequence charSequence2, id.i iVar, int i10, int i11) {
        int i12 = this.f15385m0;
        if (i10 > i12) {
            d1(str, i12, i10, arrayList, this.f15387o0, false);
        }
        int i13 = i10 + i11;
        Y0(str, charSequence2, iVar, i10, i13, arrayList, this.f15387o0);
        this.f15385m0 = i13;
        return true;
    }

    public static int F0(String str, int i10, int i11, char[] cArr) {
        if (i10 >= i11) {
            return -1;
        }
        int i12 = i11;
        while (i12 > i10) {
            int codePointBefore = str.codePointBefore(i12);
            int type = Character.getType(codePointBefore);
            if (i12 < i11 && D0(codePointBefore, type, true, cArr)) {
                return Math.max(i10, i12);
            }
            i12 -= Character.charCount(codePointBefore);
        }
        return -1;
    }

    public static TdApi.TextEntity[] G(String str, int i10) {
        TdApi.TextEntity[] E0 = ob.e.E0(str);
        if (E0 != null && E0.length > 0) {
            ArrayList arrayList = null;
            int i11 = 0;
            for (TdApi.TextEntity textEntity : E0) {
                if (k(textEntity, i10)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(E0.length - i11);
                    }
                    arrayList.add(textEntity);
                } else {
                    i11++;
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

    public static boolean I(String str, int i10, int i11) {
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt == 10) {
                return true;
            }
            i10 += Character.charCount(codePointAt);
        }
        return false;
    }

    public static l0[] I0(String str, int i10, l0[] l0VarArr, o6 o6Var, hj.q qVar) {
        TdApi.TextEntity[] E0;
        if (l0VarArr != null && l0VarArr.length > 0) {
            return l0VarArr;
        }
        if (!(i10 == 0 || (E0 = ob.e.E0(str)) == null || E0.length <= 0)) {
            ArrayList arrayList = null;
            int i11 = 0;
            for (TdApi.TextEntity textEntity : E0) {
                if (k(textEntity, i10)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(E0.length - i11);
                    }
                    arrayList.add(new r0(o6Var, str, textEntity, qVar));
                } else {
                    i11++;
                }
            }
            if (arrayList != null) {
                l0[] l0VarArr2 = new l0[arrayList.size()];
                arrayList.toArray(l0VarArr2);
                return l0VarArr2;
            }
        }
        return null;
    }

    public static boolean M0(CharSequence charSequence) {
        return !ib.i.i(charSequence) && N0(charSequence, 0, charSequence.length());
    }

    public static boolean N0(CharSequence charSequence, int i10, int i11) {
        if (ib.i.i(charSequence)) {
            return false;
        }
        int max = Math.max(0, i10);
        int min = Math.min(charSequence.length(), i11);
        while (max < min) {
            int codePointAt = Character.codePointAt(charSequence, max);
            if (Q0(codePointAt)) {
                return true;
            }
            max += Character.charCount(codePointAt);
        }
        return false;
    }

    public static boolean O0(String str, int i10, int i11) {
        if (i11 - i10 <= 0) {
            return false;
        }
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!Q0(codePointAt)) {
                return false;
            }
            i10 += Character.charCount(codePointAt);
        }
        return false;
    }

    public static boolean Q0(int i10) {
        return R0(i10) || (i10 >= 3328 && i10 <= 3455) || ((i10 >= 1536 && i10 <= 1791) || ((i10 >= 1424 && i10 <= 1535) || (i10 >= 65280 && i10 <= 65280)));
    }

    public static int R() {
        return a0.i(4.0f);
    }

    public static boolean R0(int i10) {
        return (i10 >= 12352 && i10 <= 12447) || (i10 >= 12448 && i10 <= 12543) || ((i10 >= 12544 && i10 <= 12591) || ((i10 >= 44032 && i10 <= 55215) || ((i10 >= 11904 && i10 <= 40959) || (i10 >= 131072 && i10 <= 195103))));
    }

    public static boolean k(TdApi.TextEntity textEntity, int i10) {
        if (i10 == 15) {
            return true;
        }
        switch (textEntity.type.getConstructor()) {
            case TdApi.TextEntityTypeUrl.CONSTRUCTOR:
            case TdApi.TextEntityTypePhoneNumber.CONSTRUCTOR:
            case TdApi.TextEntityTypeBankCardNumber.CONSTRUCTOR:
            case TdApi.TextEntityTypeEmailAddress.CONSTRUCTOR:
                return (i10 & 1) != 0;
            case TdApi.TextEntityTypeBotCommand.CONSTRUCTOR:
                return (i10 & 8) != 0;
            case TdApi.TextEntityTypeHashtag.CONSTRUCTOR:
            case TdApi.TextEntityTypeCashtag.CONSTRUCTOR:
                return (i10 & 4) != 0;
            case TdApi.TextEntityTypeMention.CONSTRUCTOR:
                return (i10 & 2) != 0;
            default:
                return false;
        }
    }

    public static l0[] p1(CharSequence charSequence, boolean z10, o6 o6Var, hj.q qVar) {
        TdApi.TextEntity[] x52 = t2.x5(charSequence, z10);
        if (x52 == null || x52.length <= 0) {
            return null;
        }
        l0[] l0VarArr = new l0[x52.length];
        String charSequence2 = charSequence.toString();
        for (int i10 = 0; i10 < x52.length; i10++) {
            l0VarArr[i10] = new r0(o6Var, charSequence2, x52[i10], qVar);
        }
        return l0VarArr;
    }

    public static boolean q0(String str, int i10, int i11) {
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (Character.getType(codePointAt) == 12) {
                return true;
            }
            i10 += Character.charCount(codePointAt);
        }
        return false;
    }

    public static int t0(String str, int i10) {
        return v0(str, i10, null);
    }

    public static int u0(String str, int i10, int i11, char[] cArr) {
        if (i10 >= i11) {
            return -1;
        }
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (D0(codePointAt, Character.getType(codePointAt), true, cArr)) {
                return i10;
            }
            i10 += Character.charCount(codePointAt);
        }
        return -1;
    }

    public static int v0(String str, int i10, char[] cArr) {
        return u0(str, i10, str.length(), cArr);
    }

    public boolean A0(int i10) {
        h hVar = this.f15397y0;
        return hVar != null && hVar.b(i10);
    }

    public final int B(int i10, Canvas canvas, int i11, int i12, int i13, int i14, float f10, k kVar, ld.b bVar, int i15) {
        v0 v0Var = this.U.get(i10);
        int size = this.U.size();
        v0 v0Var2 = v0Var;
        int i16 = i10;
        int i17 = 1;
        while (true) {
            i16++;
            if (i16 >= size) {
                break;
            }
            v0 v0Var3 = this.U.get(i16);
            if (!v0Var2.R(v0Var3)) {
                break;
            }
            i17++;
            v0Var2 = v0Var3;
        }
        int l02 = i14 + l0(v0Var);
        i J = J(v0Var.m());
        float i18 = J != null ? J.i() * f10 : f10;
        if (i18 > 0.0f) {
            if (i17 > 1) {
                v0Var.d(i10, canvas, v0Var2.f(), i11, i12, i13, l02, i18, kVar);
            } else {
                v0Var.c(i10, canvas, i11, i12, i13, l02, i18, kVar, bVar, i15);
            }
        }
        return i17;
    }

    public final int C(int i10, Canvas canvas, int i11, int i12, int i13, float f10, k kVar, ld.b bVar, int i14) {
        int i15;
        int i16 = i10;
        v0 v0Var = this.U.get(i10);
        int f02 = f0(v0Var.j());
        int i17 = i11 + (i13 / 2);
        int size = this.U.size();
        v0 v0Var2 = v0Var;
        int i18 = 1;
        while (true) {
            i15 = i16 + 1;
            if (i15 >= size) {
                break;
            }
            v0 v0Var3 = this.U.get(i15);
            if (!v0Var2.R(v0Var3)) {
                break;
            }
            i18++;
            v0Var2 = v0Var3;
            i16 = i15;
        }
        int l02 = i12 + l0(v0Var);
        i J = J(v0Var.m());
        float i19 = J != null ? J.i() * f10 : f10;
        if (i19 > 0.0f) {
            if (i18 > 1) {
                int i20 = f02 / 2;
                v0Var.d(i15, canvas, v0Var2.f(), i17 - i20, i17 + i20, 0, l02, i19, kVar);
            } else {
                int i21 = f02 / 2;
                v0Var.c(i15, canvas, i17 - i21, i17 + i21, 0, l02, i19, kVar, bVar, i14);
            }
        }
        return i18;
    }

    public final void D(Canvas canvas, int i10, int i11, int i12, int i13, boolean z10, h hVar, float f10, k kVar) {
        l0 g10;
        if (!(hVar == null || hVar.a())) {
            int size = this.U.size();
            int i14 = hVar.f15414b;
            if (i14 >= 0 && i14 < size && (g10 = this.U.get(i14).g()) != null) {
                boolean z11 = true;
                int a10 = ib.d.a(f10, M(kVar, g10, true));
                int a11 = ib.d.a(f10, j0(kVar, g10, true));
                boolean z12 = Color.alpha(a10) != 0;
                if (Color.alpha(a11) == 0) {
                    z11 = false;
                }
                if (z12 || z11) {
                    k0.h<Path> hVar2 = this.X;
                    Path e10 = hVar2 != null ? hVar2.e(i14) : null;
                    if (e10 != null) {
                        canvas.save();
                        canvas.translate(0.0f, i13);
                        A(canvas, e10, a10, a11);
                        canvas.restore();
                        return;
                    }
                    Path path = new Path();
                    if (this.X == null) {
                        this.X = new k0.h<>();
                    }
                    this.X.j(i14, path);
                    for (int i15 = i14; i15 < size; i15++) {
                        v0 v0Var = this.U.get(i15);
                        if (!v0Var.y(g10)) {
                            break;
                        }
                        Path path2 = path;
                        path = path;
                        l(path2, v0Var, i10, i11, i12, z10, true);
                    }
                    canvas.save();
                    canvas.translate(0.0f, i13);
                    A(canvas, path, a10, a11);
                    canvas.restore();
                }
            }
        }
    }

    public final void E(int i10, int i11) {
        if (this.O != -1 && X() >= this.O) {
            this.f15377e0 -= i10;
            this.f15380h0 = i11;
            while (!this.Y.isEmpty() && (X() > this.O || (X() > 1 && f0(X() - 1) == 0))) {
                this.Y.remove(X() - 1);
                int Z = Z(X() - 1);
                this.f15377e0 -= Z;
                this.f15380h0 = Z;
            }
            this.f15379g0 = null;
            throw new e();
        }
    }

    public int F(String str) {
        l0[] l0VarArr = this.f15373b0;
        if (l0VarArr == null || this.U == null) {
            return -1;
        }
        for (l0 l0Var : l0VarArr) {
            if (l0Var.m(str)) {
                int i10 = l0Var.i();
                Iterator<v0> it = this.U.iterator();
                while (it.hasNext()) {
                    v0 next = it.next();
                    if (i10 >= next.o() && i10 < next.f()) {
                        return next.j();
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public void G0(Rect rect, v0 v0Var) {
        H0(rect, v0Var, 0);
    }

    public final l0 H(int i10, int i11) {
        int i12;
        l0[] l0VarArr;
        int i13;
        int i14;
        l0[] l0VarArr2 = this.f15373b0;
        if (l0VarArr2 == null) {
            return null;
        }
        int i15 = this.f15381i0;
        boolean z10 = false;
        if (i15 == -1) {
            i12 = 0;
        } else if ((!this.f15384l0 || this.f15383k0 != this.f15382j0) && (i11 <= (i13 = this.f15382j0) || i10 < (i14 = this.f15383k0) || (i14 == i13 && i10 == i13))) {
            if (i11 > i13 || (this.f15383k0 == i13 && (i10 == i13 || i11 == i13))) {
                z10 = true;
            }
            this.f15384l0 = z10;
            if (z10) {
                return l0VarArr2[i15];
            }
            return null;
        } else {
            i12 = i15 + 1;
        }
        int length = l0VarArr2.length;
        for (int i16 = i12; i16 < length; i16++) {
            int i17 = this.f15373b0[i16].i();
            int e10 = this.f15373b0[i16].e();
            if (e10 - i17 != 0 || this.f15373b0[i16].r()) {
                if (i11 <= i17 || i10 < e10 || (e10 == i17 && i10 == i17)) {
                    this.f15381i0 = i16;
                    this.f15382j0 = i17;
                    this.f15383k0 = e10;
                    if (i11 > i17 || (e10 == i17 && (i10 == i17 || i11 == i17))) {
                        z10 = true;
                    }
                    this.f15384l0 = z10;
                    if (z10) {
                        return this.f15373b0[i16];
                    }
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                boolean z11 = true;
                for (l0 l0Var : this.f15373b0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        sb2.append('\n');
                    }
                    sb2.append("{type: ");
                    sb2.append(l0Var.l());
                    sb2.append(", start: ");
                    sb2.append(l0Var.i());
                    sb2.append(", end: ");
                    sb2.append(l0Var.e());
                    sb2.append(", entity: ");
                    sb2.append(l0Var.toString());
                    sb2.append("}");
                }
                Log.v("Next entity not found (entities not sorted?), startIndex:%d start:%d, end:%d, entities:\n%s", Integer.valueOf(i12), Integer.valueOf(i10), Integer.valueOf(i11), sb2.toString());
            }
        }
        return null;
    }

    public void H0(Rect rect, v0 v0Var, int i10) {
        int indexOf;
        rect.set(0, v0Var.r(), f0(v0Var.j()), v0Var.r() + Z(v0Var.j()));
        if (Q() > 0) {
            rect.left = v0Var.q();
            rect.right = v0Var.q() + ((int) v0Var.p());
        }
        l0 g10 = v0Var.g();
        if (!(g10 == null || (indexOf = this.U.indexOf(v0Var)) == -1)) {
            int i11 = indexOf;
            while (i11 > 0) {
                int i12 = i11 - 1;
                if (this.U.get(i12).j() != v0Var.j() || !l0.b(g10, this.U.get(i12).g(), i10, this.T)) {
                    break;
                }
                i11--;
            }
            while (true) {
                int i13 = indexOf + 1;
                if (i13 >= this.U.size() || this.U.get(i13).j() != v0Var.j() || !l0.b(g10, this.U.get(i13).g(), i10, this.T)) {
                    break;
                }
                indexOf = i13;
            }
            int N = N(this.Q, g10, i10 != 0, false);
            rect.top -= N;
            rect.bottom += N;
            rect.left = this.U.get(i11).q();
            rect.right = this.U.get(indexOf).q() + ((int) this.U.get(indexOf).p());
        }
        rect.offset(this.f15392t0, this.f15395w0);
    }

    public final i J(TdApi.TextEntity textEntity) {
        if (!(this.V == null || textEntity == null)) {
            for (int i10 = 0; i10 < this.V.p(); i10++) {
                i q10 = this.V.q(i10);
                if (textEntity.offset >= q10.f15419c && textEntity.offset < q10.f15419c + q10.M) {
                    return q10;
                }
            }
        }
        return null;
    }

    public final float J0(Paint paint) {
        if (this.f15391s0 == 0.0f || this.f15390r0 != paint) {
            this.f15391s0 = v0.T1(" ", paint);
            this.f15390r0 = paint;
        }
        return this.f15391s0;
    }

    public final int K(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10) {
        int i16;
        int i17 = i12;
        int i18 = i10 - i17;
        int i19 = i11 - i15;
        int i20 = 0;
        boolean z11 = (this.f15372b & 2) != 0;
        int R = R();
        Iterator<v0> it = this.U.iterator();
        int i21 = -1;
        int i22 = 0;
        while (it.hasNext()) {
            v0 next = it.next();
            if (z11) {
                int f02 = f0(next.j());
                int i23 = (this.f15370a / 2) + i17;
                int i24 = f02 / 2;
                i16 = next.D(i23 - i24, i23 + i24, i20);
            } else {
                i16 = next.D(i17, i13, i14) - i17;
            }
            int r10 = next.r() + l0(next);
            int p10 = ((int) next.p()) + i16;
            int k02 = r10 + k0(next);
            if (i18 >= i16 && i18 < p10 && i19 >= r10 && i19 < k02) {
                if (i21 == -1) {
                    i21 = i22;
                }
                if (P0(next) || next.e() != null) {
                    return i22;
                }
            } else if (i21 == -1 && i18 >= i16 - R && i18 <= p10 + R && i19 >= r10 - R && i19 <= k02 + R) {
                i21 = i22;
            }
            i22++;
            i17 = i12;
            i20 = 0;
        }
        if (i21 == -1) {
            return -1;
        }
        v0 v0Var = this.U.get(i21);
        if (!z10 || P0(v0Var) || v0Var.e() != null) {
            return i21;
        }
        return -1;
    }

    public TextPaint K0(TextPaint textPaint) {
        return textPaint;
    }

    public int L() {
        return -S().ascent;
    }

    public final boolean L0(v0 v0Var) {
        if (this.O != -1 && X() + 1 >= this.O) {
            return false;
        }
        this.f15376d0 = v0Var.q();
        int O = O();
        int i10 = this.f15380h0;
        m(this.f15376d0, O);
        this.f15378f0 = Math.max(this.f15378f0, this.f15376d0);
        this.f15376d0 = (int) v0Var.p();
        int i11 = this.f15377e0 + O;
        this.f15377e0 = i11;
        this.f15380h0 = 0;
        v0Var.P(0, i11);
        E(O, i10);
        return true;
    }

    public int M(k kVar, l0 l0Var, boolean z10) {
        if (w0(l0Var)) {
            return X0(kVar, l0Var).r0(z10);
        }
        return 0;
    }

    public int N(k kVar, l0 l0Var, boolean z10, boolean z11) {
        if (!w0(l0Var)) {
            return 0;
        }
        k X0 = X0(kVar, l0Var);
        int d10 = X0.d(z10);
        int g10 = X0.g(z10);
        int R = X0.R();
        if (z11 && g10 != 0) {
            R = Math.max(0, R - a0.x());
        }
        if (g10 == 0 && d10 == 0) {
            return 0;
        }
        return R;
    }

    public final int O() {
        return Math.max(this.f15380h0, Y());
    }

    public int P() {
        ArrayList<v0> arrayList = this.U;
        if (!(arrayList == null || this.Z == 0)) {
            int size = arrayList.size();
            int i10 = this.Z;
            if (size <= i10) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean P0(v0 v0Var) {
        i J = J(v0Var.m());
        return J != null && J.j();
    }

    public int Q() {
        l0[] l0VarArr = this.f15373b0;
        if (l0VarArr != null) {
            return l0VarArr.length;
        }
        return 0;
    }

    public final Paint.FontMetricsInt S() {
        return T(this.P.h());
    }

    public final void S0(List<v0> list, String str) {
        T0(list, str, 0, 0, null);
    }

    public final Paint.FontMetricsInt T(float f10) {
        float f11 = this.f15388p0;
        if (f11 == -1.0f || f11 != f10) {
            this.P.f().getFontMetricsInt(this.f15389q0);
            this.f15388p0 = f10;
        }
        return this.f15389q0;
    }

    public final void T0(java.util.List<je.v0> r20, java.lang.String r21, int r22, int r23, je.l0 r24) {
        throw new UnsupportedOperationException("Method not decompiled: je.g.T0(java.util.List, java.lang.String, int, int, je.l0):void");
    }

    public boolean U() {
        ArrayList<v0> arrayList = this.U;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<v0> arrayList2 = this.U;
            if (arrayList2.get(arrayList2.size() - 1).w()) {
                return true;
            }
        }
        return n();
    }

    public boolean U0(View view, MotionEvent motionEvent) {
        return V0(view, motionEvent, null);
    }

    public int V() {
        return this.f15376d0;
    }

    public boolean V0(View view, MotionEvent motionEvent, c cVar) {
        int i10;
        int i11;
        boolean z10;
        boolean z11 = false;
        if (this.U == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                s();
                h hVar = this.f15397y0;
                if (hVar != null) {
                    v0 v0Var = this.U.get(hVar.f15413a);
                    if (this.f15397y0.a()) {
                        h1(v0Var);
                        db.g.c(view);
                        return true;
                    }
                    l0 e10 = v0Var.e();
                    d dVar = this.N;
                    if (dVar != null) {
                        z10 = dVar.a(view, this, v0Var, e10 != null ? e10.y(view, this, v0Var) : new hj.q().s(v0Var.E(view)));
                    } else if (e10 != null) {
                        e10.z(view, this, v0Var, cVar);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    p();
                    if (z10) {
                        db.g.c(view);
                        return true;
                    }
                }
            } else if (action != 2) {
                if (action == 3) {
                    s();
                    if (this.f15397y0 == null) {
                        return false;
                    }
                    p();
                    return true;
                }
            } else if (this.f15397y0 == null) {
                return false;
            } else {
                if (Math.max(Math.abs(this.f15398z0 - motionEvent.getX()), Math.abs(this.A0 - motionEvent.getY())) > a0.p()) {
                    p();
                }
                return true;
            }
            return this.f15397y0 != null;
        }
        this.f15398z0 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        this.A0 = y10;
        boolean z12 = this.N == null;
        int K = K(this.f15398z0, y10, this.f15392t0, this.f15393u0, this.f15394v0, this.f15395w0, z12);
        if (K == -1) {
            p();
            return false;
        }
        v0 v0Var2 = this.U.get(K);
        i J = J(v0Var2.m());
        boolean z13 = J != null && J.j();
        if (z13) {
            i10 = J.f15417a;
            i11 = J.f15417a + J.f15418b;
        } else if ((!z12 || v0Var2.s()) && (z12 || v0Var2.s() || ib.c.b(this.f15372b, Log.TAG_CONTACT))) {
            l0 e11 = this.U.get(K).e();
            if (e11 != null) {
                int i12 = K;
                while (i12 > 0 && this.U.get(i12 - 1).y(e11)) {
                    i12--;
                }
                int i13 = K;
                while (true) {
                    int i14 = i13 + 1;
                    if (i14 >= this.U.size() || !this.U.get(i14).y(e11)) {
                        break;
                    }
                    i13 = i14;
                }
                i10 = i12;
                i11 = i13;
            } else {
                i10 = K;
                i11 = i10;
            }
        } else {
            p();
            return false;
        }
        if (!z13) {
            J = null;
        }
        h hVar2 = new h(K, i10, i11, J);
        this.f15397y0 = hVar2;
        if (hVar2.a()) {
            this.f15397y0.f15416d.k(true, true);
        } else {
            if (this.N == null) {
                z11 = true;
            }
            if (r0(K, z11)) {
                if ((this.f15372b & 8) != 0) {
                    i1(view, cVar);
                } else {
                    this.C0 = cVar;
                }
            }
        }
        return true;
    }

    public int W() {
        int i10 = 0;
        int a02 = a0(false) / 2;
        if (!this.U.isEmpty()) {
            i10 = l0(this.U.get(0));
        }
        return a02 + i10;
    }

    public boolean W0(View view) {
        h hVar = this.f15397y0;
        if (hVar == null || hVar.a()) {
            return false;
        }
        int i10 = this.f15397y0.f15413a;
        c cVar = this.C0;
        p();
        l0 e10 = this.U.get(i10).e();
        if (e10 == null) {
            return false;
        }
        return e10.A(view, this, this.U.get(i10), (this.f15372b & 16) == 0, cVar);
    }

    public int X() {
        List<int[]> list = this.Y;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public k X0(k kVar, l0 l0Var) {
        k g10;
        if (kVar == null) {
            kVar = this.Q;
        }
        return (l0Var == null || (g10 = l0Var.g(kVar)) == null) ? kVar : g10;
    }

    public int Y() {
        return a0(true);
    }

    public final void Y0(String str, CharSequence charSequence, id.i iVar, int i10, int i11, ArrayList<v0> arrayList, l0 l0Var) {
        this.f15379g0 = null;
        if (this.f15376d0 + this.f15386n0 > b0(X(), this.f15377e0)) {
            S0(arrayList, str);
        }
        v0 v0Var = new v0(this, str, i10, i11, X(), this.f15375c0);
        v0Var.P(this.f15376d0, this.f15377e0);
        v0Var.O(this.f15386n0);
        v0Var.J(l0Var);
        v0Var.H(iVar);
        arrayList.add(v0Var);
        this.f15376d0 += this.f15386n0;
    }

    public int Z(int i10) {
        return c0(i10)[1];
    }

    public final int Z0(String str, int i10, int i11, ArrayList<v0> arrayList, d.b bVar, boolean z10) {
        l0 H = H(i10, i11);
        if (X0(null, H).W0(false) != 0) {
            this.f15372b |= Log.TAG_TDLIB_OPTIONS;
        }
        if (H == null) {
            e1(str, i10, i11, arrayList, bVar, null);
            return -1;
        }
        if (H.h() != null) {
            this.f15372b |= Integer.MIN_VALUE;
        }
        int max = Math.max(i10, this.f15382j0);
        if (max > i10) {
            e1(str, i10, max, arrayList, bVar, null);
        }
        int i12 = this.f15383k0;
        if (i12 < i11) {
            e1(str, max, i12, arrayList, bVar, H);
            if (!z10) {
                int i13 = this.f15383k0;
                do {
                    i13 = Z0(str, i13, i11, arrayList, bVar, true);
                    if (i13 == -1) {
                        break;
                    }
                } while (i13 < i11);
            } else {
                return this.f15383k0;
            }
        } else {
            e1(str, max, i11, arrayList, bVar, H);
        }
        return -1;
    }

    @Override
    public String a() {
        return this.T;
    }

    public int a0(boolean z10) {
        Paint.FontMetricsInt S = S();
        return Math.abs(S.descent - S.ascent) + S.leading + (z10 ? d0() : 0);
    }

    public final void a1(String str, int i10, ArrayList<v0> arrayList, l0 l0Var) {
        this.f15379g0 = null;
        s0 f10 = l0Var.f();
        int i11 = a0.i(f10.b());
        int i12 = a0.i(f10.a());
        int b02 = b0(X(), this.f15377e0);
        int i13 = this.f15376d0;
        if (i13 > 0 && i13 + i11 > b02) {
            S0(arrayList, str);
            b02 = b0(X(), this.f15377e0);
        }
        if (i11 > b02) {
            i12 = (int) (i12 * (b02 / i11));
            i11 = b02;
        }
        v0 v0Var = new v0(this, str, i10, i10, X(), this.f15375c0);
        v0Var.P(this.f15376d0, this.f15377e0);
        v0Var.O(i11);
        v0Var.K(i12);
        v0Var.J(l0Var);
        v0Var.L(this.f15371a0, f10);
        arrayList.add(v0Var);
        this.f15376d0 += i11;
        this.f15380h0 = Math.max(i12, this.f15380h0);
        this.f15371a0++;
    }

    @Override
    public int b() {
        return this.Z;
    }

    public int b0(int i10, int i11) {
        if (i10 != -1) {
            AbstractC0133g gVar = this.f15374c;
            return (gVar != null ? gVar.a(i10, i11, this.f15370a, Y()) : this.f15370a - e0(i10, i11)) - this.S;
        }
        throw new IllegalArgumentException("lineIndex == -1");
    }

    public final void b1(String str, int i10, int i11, ArrayList<v0> arrayList, d.b bVar) {
        int i12 = i10;
        if (i12 == i11) {
            Z0(str, i10, i11, arrayList, bVar, false);
            return;
        }
        int i13 = i12;
        int i14 = 0;
        boolean z10 = false;
        boolean z11 = true;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt == 10 && !ib.c.b(this.f15372b, Log.TAG_ROUND)) {
                break;
            }
            boolean z12 = charCount == 1 && (codePointAt == 10 || Character.getType(codePointAt) == 12);
            if (z11) {
                i14 += charCount;
                z10 = z12;
                z11 = false;
            } else if (z10 == z12) {
                i14 += charCount;
            } else {
                int i15 = i13 + i14;
                Z0(str, i13, i15, arrayList, bVar, false);
                i14 = charCount;
                z10 = z12;
                i13 = i15;
            }
            i12 += charCount;
        }
        int i16 = i13 + i14;
        Z0(str, i13, i16, arrayList, bVar, false);
        if (i16 < i11) {
            Z0(str, i16, i11, arrayList, bVar, false);
        }
    }

    @Override
    public boolean c() {
        this.Z++;
        return true;
    }

    public final int[] c0(int i10) {
        if (i10 >= 0 && i10 < X()) {
            return this.Y.get(i10);
        }
        throw new IllegalArgumentException("lineIndex == " + i10);
    }

    public final int c1(java.lang.String r24, int r25, int r26, java.util.ArrayList<je.v0> r27, je.l0 r28, boolean r29, float[] r30) {
        throw new UnsupportedOperationException("Method not decompiled: je.g.c1(java.lang.String, int, int, java.util.ArrayList, je.l0, boolean, float[]):int");
    }

    @Override
    public int d(boolean z10) {
        return o.a(this, z10);
    }

    public int d0() {
        if (ib.c.b(this.f15372b, Log.TAG_NDK)) {
            return 0;
        }
        return this.P.c((this.f15372b & 32) != 0 ? 3.0f : 2.0f);
    }

    public final int d1(String str, int i10, int i11, ArrayList<v0> arrayList, l0 l0Var, boolean z10) {
        int i12;
        int i13;
        int i14;
        int codePointAt = str.codePointAt(i10);
        if (!B0(codePointAt, false) || (i12 = i10 + Character.charCount(codePointAt)) >= i11) {
            i12 = i10;
        }
        int i15 = i12;
        int i16 = -1;
        int i17 = -1;
        while (true) {
            if (i15 >= i11) {
                break;
            }
            int codePointAt2 = str.codePointAt(i15);
            int charCount = Character.charCount(codePointAt2);
            int type = Character.getType(codePointAt2);
            if (C0(codePointAt2, type, true)) {
                if (i15 == i12 || (i14 = i15 + charCount) == i11 || !B0(str.codePointAt(i14), false)) {
                    i16 = i15 + charCount;
                    i17 = i16;
                } else {
                    i17 = i14;
                    i16 = i15;
                }
                if (type == 12) {
                    i17 = -1;
                }
            } else if (R0(codePointAt2)) {
                i16 = i15 + charCount;
                i17 = i16;
            }
            if (i16 == -1) {
                i15 += charCount;
            } else if (i17 != -1) {
                while (i17 < i11) {
                    int codePointAt3 = str.codePointAt(i17);
                    int type2 = Character.getType(codePointAt3);
                    if (!C0(codePointAt2, type2, true) || (i17 = i17 + Character.charCount(codePointAt3)) > i11) {
                        break;
                    } else if (type2 == 12) {
                        i13 = i17;
                        break;
                    } else {
                        i16 = i17;
                    }
                }
            }
        }
        i13 = i16;
        if (i13 == -1 || i13 == i11) {
            c1(str, i10, i11, arrayList, l0Var, false, null);
        } else {
            c1(str, i10, i13, arrayList, l0Var, false, null);
            if (z10) {
                return i13;
            }
            int i18 = i13;
            do {
                i18 = d1(str, i18, i11, arrayList, l0Var, true);
            } while (i18 != -1);
        }
        return -1;
    }

    public int e0(int i10, int i11) {
        if (i10 != -1) {
            f fVar = this.M;
            if (fVar != null) {
                return fVar.a(i10, i11, this.f15370a, Y());
            }
            return 0;
        }
        throw new IllegalArgumentException("lineIndex == -1");
    }

    public final void e1(String str, int i10, int i11, ArrayList<v0> arrayList, d.b bVar, l0 l0Var) {
        Paint.FontMetricsInt E = y.E(o0(l0Var));
        if (i11 - i10 != 0) {
            this.f15385m0 = i10;
            this.f15387o0 = l0Var;
            this.f15386n0 = Math.abs(E.descent - E.ascent) + a0.i(2.0f);
            id.d.z().K(str, i10, i11, this, bVar);
            int i12 = this.f15385m0;
            if (i12 < i11) {
                d1(str, i12, i11, arrayList, l0Var, false);
            }
        } else if (l0Var != null && l0Var.r()) {
            a1(str, i10, arrayList, l0Var);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && ((g) obj).T.equals(this.T);
    }

    public int f0(int i10) {
        return c0(i10)[0];
    }

    public int f1(ld.b bVar, int i10) {
        int i11 = 0;
        boolean z10 = i10 == -1;
        if (this.f15371a0 > 0) {
            if (z10) {
                i10 = 0;
            }
            Iterator<v0> it = this.U.iterator();
            while (it.hasNext()) {
                v0 next = it.next();
                if (next.v()) {
                    next.F(bVar, i10);
                    i11++;
                }
            }
            if (z10) {
                bVar.g(i11);
            }
            return i11;
        }
        if (z10) {
            bVar.d();
        }
        return 0;
    }

    @Override
    public int g(boolean z10) {
        return o.b(this, z10);
    }

    public int g0() {
        return this.O;
    }

    public final void g1() {
        this.f15381i0 = -1;
        this.f15383k0 = 0;
        this.f15382j0 = 0;
        this.f15397y0 = null;
        this.Z = 0;
        this.f15371a0 = 0;
        this.f15375c0 = 0;
        this.f15377e0 = 0;
        this.f15376d0 = 0;
        this.f15378f0 = 0;
        this.f15380h0 = 0;
        this.f15379g0 = null;
        this.f15372b &= 134217727;
        List<int[]> list = this.Y;
        if (list != null) {
            list.clear();
        }
        r();
    }

    @Override
    public int getHeight() {
        return this.f15377e0;
    }

    @Override
    public int getWidth() {
        return this.f15378f0;
    }

    public int h0() {
        return this.f15370a;
    }

    public final void h1(v0 v0Var) {
        i J = J(v0Var.m());
        if (J != null) {
            J.O.p(true, true);
        }
    }

    public int hashCode() {
        return this.T.hashCode();
    }

    public int i0() {
        if (this.U.isEmpty()) {
            return 0;
        }
        ArrayList<v0> arrayList = this.U;
        v0 v0Var = arrayList.get(arrayList.size() - 1);
        return v0Var.r() + Z(v0Var.j());
    }

    public final void i1(View view, c cVar) {
        o();
        if (view != null) {
            this.B0 = view;
            this.C0 = cVar;
            view.postDelayed(this, ViewConfiguration.getLongPressTimeout());
        }
    }

    public int j0(k kVar, l0 l0Var, boolean z10) {
        if (w0(l0Var)) {
            return X0(kVar, l0Var).t0(z10);
        }
        return 0;
    }

    public void j1(int i10, String str) {
        k1(i10, str, this.f15373b0);
    }

    public final int k0(v0 v0Var) {
        float h10 = v0Var.h();
        return h10 != -1.0f ? (int) h10 : Y();
    }

    public void k1(int i10, String str, l0[] l0VarArr) {
        if (str != null) {
            this.f15370a = i10;
            this.f15373b0 = l0VarArr;
            try {
                if (!Log.isEnabled(64) || !Log.checkLogLevel(3)) {
                    l1(str);
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                l1(str);
                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (elapsedRealtime2 >= 150) {
                    Log.w(64, "Text.set took %dms for %d chars, maxWidth: %d, text:\n%s", Integer.valueOf(elapsedRealtime2), Integer.valueOf(str.length()), Integer.valueOf(i10), str);
                } else {
                    Log.v(64, "Text.set took %dms for %d chars, maxWidth: %d", Integer.valueOf(elapsedRealtime2), Integer.valueOf(str.length()), Integer.valueOf(i10));
                }
            } catch (Throwable th) {
                Log.w(64, "Couldn't parse %d chars for max width: %d, fontSize: %f, text:\n%s", th, Integer.valueOf(str.length()), Integer.valueOf(i10), Float.valueOf(he.i.c2().t0()), str);
                throw th;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final void l(Path path, v0 v0Var, int i10, int i11, int i12, boolean z10, boolean z11) {
        TextPaint o02;
        int i13;
        int N = N(this.Q, v0Var.g(), z11, true);
        int i14 = a0.i(3.0f);
        Paint.FontMetricsInt T = T(o0(v0Var.g()).getTextSize());
        if (z10) {
            int f02 = f0(v0Var.j());
            int i15 = i10 + (this.f15370a / 2);
            int i16 = f02 / 2;
            i13 = v0Var.D(i15 - i16, i15 + i16, 0);
        } else {
            i13 = v0Var.D(i10, i11, i12);
        }
        int r10 = v0Var.r();
        float p10 = v0Var.p();
        RectF a02 = y.a0();
        float f10 = i13 - N;
        a02.left = f10;
        a02.top = r10 - N;
        float f11 = f10 + p10;
        float f12 = N;
        a02.right = f11 + f12 + f12;
        a02.bottom = r10 + (v0Var.h() == -1 ? T.descent - T.ascent : v0Var.h()) + N;
        a02.offset(0.0f, o02.baselineShift + l0(v0Var));
        float f13 = i14;
        path.addRoundRect(a02, f13, f13, Path.Direction.CW);
    }

    public final int l0(v0 v0Var) {
        if (this.f15371a0 > 0) {
            return (Z(v0Var.j()) - k0(v0Var)) / 2;
        }
        return 0;
    }

    public final void l1(final java.lang.String r24) {
        throw new UnsupportedOperationException("Method not decompiled: je.g.l1(java.lang.String):void");
    }

    public final void m(int i10, int i11) {
        if (this.Y == null) {
            this.Y = new ArrayList();
        }
        this.Y.add(new int[]{i10, i11});
        if (i10 == 0) {
            this.f15375c0++;
        }
    }

    public int m0() {
        return n0(null, null, ib.c.b(this.f15372b, Log.TAG_CONTACT), false);
    }

    public final void m1(boolean z10) {
        if (s0() != z10) {
            this.f15372b = ib.c.h(this.f15372b, 16777216, z10);
            ViewGroup viewGroup = null;
            if (z10) {
                View view = this.B0;
                if (view != null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                this.D0 = viewGroup;
                if (viewGroup != null) {
                    viewGroup.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.D0;
            if (viewGroup2 != null) {
                viewGroup2.requestDisallowInterceptTouchEvent(false);
                this.D0 = null;
            }
        }
    }

    public boolean n() {
        return (this.f15372b & Log.TAG_CRASH) != 0 || (w.G2() && (this.f15372b & 268435456) != 0);
    }

    public int n0(k kVar, l0 l0Var, boolean z10, boolean z11) {
        k X0 = X0(kVar, l0Var);
        return w0(l0Var) ? X0.o0(z11) : X0.c();
    }

    public boolean n1(int i10) {
        if (this.f15372b == i10) {
            return false;
        }
        this.f15372b = i10;
        return true;
    }

    public final void o() {
        View view = this.B0;
        if (view != null) {
            view.removeCallbacks(this);
        }
    }

    public TextPaint o0(l0 l0Var) {
        TextPaint textPaint;
        int i10 = 0;
        boolean z10 = (this.f15372b & 4) != 0;
        float d10 = l0Var != null ? l0Var.d() : 0.0f;
        if (l0Var != null) {
            textPaint = l0Var.k(this.P, z10);
        } else if (z10) {
            textPaint = (this.f15372b & 67108864) != 0 ? this.P.e() : this.P.d();
        } else {
            textPaint = this.P.f();
        }
        if (d10 != 0.0f) {
            i10 = (int) (textPaint.ascent() * d10);
        }
        textPaint.baselineShift = i10;
        return textPaint;
    }

    public void o1(j jVar) {
        this.f15396x0 = jVar;
    }

    public void p() {
        h hVar = this.f15397y0;
        if (hVar != null) {
            i iVar = hVar.f15416d;
            if (iVar != null) {
                iVar.k(false, true);
            }
            this.f15397y0 = null;
            if ((this.f15372b & 8) != 0) {
                o();
            }
            j jVar = this.f15396x0;
            if (jVar != null) {
                jVar.invalidate();
            }
        }
        m1(false);
    }

    public j p0() {
        return this.f15396x0;
    }

    public void q(int i10) {
        if (this.f15370a != i10) {
            k1(i10, this.T, this.f15373b0);
        }
    }

    public void q1(Rect rect) {
        int i10 = this.f15392t0;
        rect.set(i10, this.f15395w0, getWidth() + i10, this.f15395w0 + getHeight());
    }

    public final void r() {
        k0.e<i> eVar = this.V;
        if (eVar != null) {
            for (int p10 = eVar.p() - 1; p10 >= 0; p10--) {
                i q10 = this.V.q(p10);
                if (q10 != null) {
                    q10.Q2();
                }
            }
            this.V.b();
            this.V = null;
        }
    }

    public boolean r0(int i10, boolean z10) {
        if (this.U.get(i10).e() == null) {
            return !z10;
        }
        j jVar = this.f15396x0;
        if (jVar != null) {
            jVar.invalidate();
        }
        return true;
    }

    @Override
    public void run() {
        View view = this.B0;
        if (view != null && this.f15397y0 != null && W0(view)) {
            view.performHapticFeedback(0);
            if ((this.f15372b & 8) != 0) {
                m1(true);
            }
        }
    }

    public final void s() {
        m1(false);
    }

    public final boolean s0() {
        return (this.f15372b & 16777216) != 0;
    }

    public void t(Canvas canvas, int i10, int i11) {
        z(canvas, i10, i11, null, 1.0f);
    }

    public void u(Canvas canvas, int i10, int i11, int i12, int i13) {
        v(canvas, i10, i11, i12, i13, null, 1.0f);
    }

    public void v(Canvas canvas, int i10, int i11, int i12, int i13, k kVar, float f10) {
        w(canvas, i10, i11, i12, i13, kVar, f10, null);
    }

    public void w(Canvas canvas, int i10, int i11, int i12, int i13, k kVar, float f10, ld.b bVar) {
        x(canvas, i10, i11, i12, i13, kVar, f10, bVar, -1);
    }

    public final boolean w0(l0 l0Var) {
        return (ib.c.b(this.f15372b, Log.TAG_CONTACT) || (l0Var != null && l0Var.o())) && !ib.c.b(this.f15372b, Log.TAG_PAINT);
    }

    public void x(android.graphics.Canvas r31, int r32, int r33, int r34, int r35, je.k r36, float r37, ld.b r38, int r39) {
        throw new UnsupportedOperationException("Method not decompiled: je.g.x(android.graphics.Canvas, int, int, int, int, je.k, float, ld.b, int):void");
    }

    public boolean x0() {
        return (this.f15372b & Log.TAG_TDLIB_FILES) != 0;
    }

    public void y(Canvas canvas, int i10, int i11, k kVar) {
        z(canvas, i10, i11, kVar, 1.0f);
    }

    public boolean y0() {
        return ib.i.i(this.T);
    }

    public void z(Canvas canvas, int i10, int i11, k kVar, float f10) {
        v(canvas, i10, i10, 0, i11, kVar, f10);
    }

    public boolean z0() {
        return (this.f15372b & 134217728) != 0;
    }

    public g(String str, int i10, w0 w0Var, k kVar, int i11, AbstractC0133g gVar, f fVar, int i12, l0[] l0VarArr, String str2, d dVar) {
        this.f15381i0 = -1;
        this.f15388p0 = -1.0f;
        this.f15389q0 = new Paint.FontMetricsInt();
        this.f15372b = i12;
        this.f15370a = i10;
        this.O = i11;
        this.f15374c = gVar;
        this.M = fVar;
        this.N = dVar;
        this.P = w0Var;
        this.Q = kVar;
        this.f15373b0 = l0VarArr;
        this.R = str2;
        this.S = !ib.i.i(str2) ? (int) v0.T1(str2, o0(null)) : 0;
        j1(i10, str);
    }

    public static class b {
        public String f15401a;
        public int f15402b;
        public w0 f15403c;
        public k f15404d;
        public int f15405e;
        public AbstractC0133g f15406f;
        public f f15407g;
        public int f15408h;
        public l0[] f15409i;
        public String f15410j;
        public j f15411k;
        public d f15412l;

        public b(String str, int i10, w0 w0Var, k kVar) {
            this.f15405e = -1;
            if (str != null) {
                this.f15401a = str;
                this.f15402b = i10;
                this.f15403c = w0Var;
                this.f15404d = kVar;
                return;
            }
            throw new IllegalArgumentException();
        }

        public b a(int i10) {
            return y(i10 | this.f15408h);
        }

        public b b() {
            return c(true);
        }

        public b c(boolean z10) {
            return y(ib.c.h(this.f15408h, 4, z10));
        }

        public b d() {
            return e(true);
        }

        public b e(boolean z10) {
            return y(ib.c.h(this.f15408h, Log.TAG_CONTACT, z10));
        }

        public g f() {
            g gVar = new g(this.f15401a, this.f15402b, this.f15403c, this.f15404d, this.f15405e, this.f15406f, this.f15407g, this.f15408h, this.f15409i, this.f15410j, this.f15412l);
            j jVar = this.f15411k;
            if (jVar != null) {
                gVar.o1(jVar);
            }
            return gVar;
        }

        public b g() {
            return h(true);
        }

        public b h(boolean z10) {
            return y(ib.c.h(this.f15408h, Log.TAG_EMOJI, z10));
        }

        public b i(l0[] l0VarArr) {
            this.f15409i = l0VarArr;
            return this;
        }

        public b j() {
            return k(true);
        }

        public b k(boolean z10) {
            return y(ib.c.h(this.f15408h, Log.TAG_VIDEO, z10));
        }

        public b l() {
            return m(true);
        }

        public b m(boolean z10) {
            return y(ib.c.h(this.f15408h, Log.TAG_ROUND, z10));
        }

        public b n(f fVar) {
            this.f15407g = fVar;
            return this;
        }

        public b o(AbstractC0133g gVar) {
            this.f15406f = gVar;
            return this;
        }

        public b p(int i10) {
            this.f15405e = i10;
            return this;
        }

        public b q() {
            return r(true);
        }

        public b r(boolean z10) {
            return y(ib.c.h(this.f15408h, Log.TAG_PAINT, z10));
        }

        public b s() {
            return t(true);
        }

        public b t(boolean z10) {
            return y(ib.c.h(this.f15408h, Log.TAG_NDK, z10));
        }

        public b u(d dVar) {
            this.f15412l = dVar;
            return this;
        }

        public b v() {
            return p(1);
        }

        public b w(w0 w0Var) {
            this.f15403c = w0Var;
            return this;
        }

        public b x(String str) {
            this.f15410j = str;
            return this;
        }

        public b y(int i10) {
            this.f15408h = i10;
            return this;
        }

        public b z(j jVar) {
            this.f15411k = jVar;
            return this;
        }

        public b(o6 o6Var, CharSequence charSequence, hj.q qVar, int i10, w0 w0Var, k kVar) {
            this.f15405e = -1;
            this.f15401a = charSequence.toString();
            this.f15402b = i10;
            this.f15403c = w0Var;
            this.f15404d = kVar;
            TdApi.TextEntity[] x52 = t2.x5(charSequence, false);
            l0[] E = (x52 == null || x52.length <= 0) ? null : l0.E(o6Var, charSequence.toString(), x52, qVar);
            i(E == null ? w.X2(charSequence) : E);
        }

        public b(o6 o6Var, TdApi.FormattedText formattedText, hj.q qVar, int i10, w0 w0Var, k kVar) {
            this(formattedText.text, i10, w0Var, kVar);
            i(l0.E(o6Var, this.f15401a, formattedText.entities, qVar));
        }
    }
}
