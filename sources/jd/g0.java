package jd;

import android.os.Build;
import ce.e0;
import he.i;
import ld.l;
import oc.v0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;

public class g0 extends b implements a {
    public int f15262f;
    public boolean f15263g;
    public int f15264h;
    public long f15265i = -1;
    public long f15266j = -1;
    public boolean f15267k;
    public i.t f15268l;

    public g0(long j10, String str, String str2, String str3) {
        super(j10, str, str2, str3, true);
        y(this, str3.substring(5));
    }

    public static boolean j(l lVar) {
        return lVar != null && ((!lVar.a1() && lVar.O0() == 0 && !lVar.p1()) || r(lVar, e0.g(v0.v0(lVar.q()))));
    }

    public static boolean q(l lVar) {
        return lVar != null && !lVar.p1() && lVar.O0() == 0 && lVar.P0() == -1 && lVar.J0() == -1;
    }

    public static boolean r(l lVar, String str) {
        if (!ib.i.i(str)) {
            int i10 = Build.VERSION.SDK_INT;
            if ("video/mp4".equals(str) || (lVar.O0() == 0 && ("video/webm".equals(str) || ((i10 >= 26 && "video/3gpp".equals(str)) || (i10 >= 29 && "video/ogg".equals(str)))))) {
                return true;
            }
        }
        return false;
    }

    public static String s(int i10, boolean z10, int i11, long j10, long j11, boolean z11, long j12) {
        return t(i10, z10, i.c2().z1(), i11, j10, j11, z11, j12);
    }

    public static String t(int i10, boolean z10, i.t tVar, int i11, long j10, long j11, boolean z11, long j12) {
        StringBuilder sb2 = new StringBuilder("video");
        sb2.append(z10 ? 1 : 0);
        if (i11 != 0) {
            sb2.append(',');
            sb2.append("rotate");
            sb2.append(i11);
        }
        if (tVar != null && !tVar.e()) {
            sb2.append(',');
            sb2.append("limit");
            sb2.append(tVar.f13890a.f13893a);
            sb2.append('x');
            sb2.append(tVar.f13890a.f13894b);
            if (tVar.f13891b != 29) {
                sb2.append(',');
                sb2.append("fps");
                sb2.append(tVar.f13891b);
            }
            if (tVar.f13892c != Long.MIN_VALUE) {
                sb2.append(',');
                sb2.append("bitrate");
                sb2.append(tVar.f13892c);
            }
        }
        if (j10 != -1) {
            sb2.append(',');
            sb2.append("start");
            sb2.append(j10);
        }
        if (j11 != -1) {
            sb2.append(',');
            sb2.append("end");
            sb2.append(j11);
        }
        if (i10 != 0) {
            sb2.append(',');
            sb2.append("source");
            sb2.append(i10);
        }
        if (z11) {
            sb2.append(',');
            sb2.append("noconvert");
            sb2.append('1');
        }
        if (j12 != 0) {
            sb2.append(',');
            sb2.append("modified");
            sb2.append(j12);
        }
        return sb2.toString();
    }

    public static String u(String str, l lVar, boolean z10) {
        if (lVar != null) {
            return s(0, lVar.p1(), lVar.O0(), lVar.P0(), lVar.J0(), z10, b.g(str));
        }
        return s(0, false, 0, -1L, -1L, z10, b.g(str));
    }

    public static TdApi.InputFileGenerated x(String str, l lVar, boolean z10) {
        return new TdApi.InputFileGenerated(str, u(str, lVar, z10), 0);
    }

    public static void y(a aVar, String str) {
        String[] split = str.split(",", -1);
        boolean z10 = ib.i.s(split[0]) == 1;
        long j10 = Long.MIN_VALUE;
        int i10 = 29;
        int length = split.length;
        long j11 = -1;
        long j12 = -1;
        int i11 = 0;
        int i12 = 854;
        int i13 = 854;
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < length; i15++) {
            String str2 = split[i15];
            split = split;
            length = length;
            if (str2.startsWith("rotate")) {
                i14 = ib.i.s(str2.substring(6));
            } else if (str2.startsWith("limit")) {
                String[] split2 = str2.substring(5).split("x");
                int s10 = ib.i.s(split2[0]);
                int s11 = ib.i.s(split2[1]);
                int max = Math.max(s10, s11);
                i13 = Math.min(s10, s11);
                i12 = max;
            } else if (str2.startsWith("bitrate")) {
                j10 = ib.i.w(str2.substring(7));
            } else if (str2.startsWith("fps")) {
                i10 = ib.i.s(str2.substring(3));
            } else if (str2.startsWith("start")) {
                j11 = ib.i.w(str2.substring(5));
            } else if (str2.startsWith("end")) {
                j12 = ib.i.w(str2.substring(3));
            } else if (str2.startsWith("source")) {
                i11 = ib.i.s(str2.substring(6));
            } else {
                if (str2.startsWith("noconvert")) {
                    z11 = ib.i.s(str2.substring(9)) == 1;
                } else if (!str2.startsWith("random") && !str2.startsWith("modified")) {
                    Log.w("Unknown video conversion argument: %s", str2);
                }
            }
        }
        aVar.a(i11, z10, new i.t(new i.v(i12, i13), i10, j10), i14, j11, j12, z11);
    }

    @Override
    public void a(int i10, boolean z10, i.t tVar, int i11, long j10, long j11, boolean z11) {
        this.f15262f = i10;
        this.f15263g = z10;
        this.f15268l = tVar;
        this.f15264h = i11;
        this.f15265i = j10;
        this.f15266j = j11;
        this.f15267k = z11;
    }

    public boolean k() {
        return true;
    }

    public boolean l() {
        return this.f15267k;
    }

    public long m() {
        return this.f15266j;
    }

    public int n() {
        return this.f15264h;
    }

    public long o() {
        return this.f15265i;
    }

    public i.t p() {
        return this.f15268l;
    }

    public boolean v() {
        return this.f15263g;
    }

    public boolean w() {
        return (this.f15265i == -1 || this.f15266j == -1) ? false : true;
    }
}
