package gd;

import be.C1363c0;
import ge.C4868i;
import ge.C4897o;
import java.io.File;
import java.io.FilenameFilter;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import p082fd.C4403w;
import p108hb.C5068g;
import p110hd.C5078d;
import p168ld.C6522y;
import p350yd.C10536ab;

public class C4596b7 {
    public final long f15177a;
    public final long f15178b;
    public final long f15179c;
    public final long f15180d;
    public final long f15181e;
    public final long f15182f;
    public final long f15183g;
    public final long f15184h;
    public final long f15185i;
    public final long f15186j;
    public final long f15187k;
    public final File[] f15188l;
    public final File[] f15189m;
    public final File[] f15190n;
    public final long f15191o;
    public final long f15192p;
    public final File[] f15193q;
    public final long f15194r;
    public final long f15195s;
    public final Log.C7879b f15196t;

    public C4596b7(org.drinkless.p210td.libcore.telegram.TdApi.StorageStatisticsFast r11, gd.C4596b7 r12) {
        throw new UnsupportedOperationException("Method not decompiled: gd.C4596b7.<init>(org.drinkless.td.libcore.telegram.TdApi$StorageStatisticsFast, gd.b7):void");
    }

    public static boolean m27071v(String str, File file, String str2) {
        return !str2.equals(str);
    }

    public static boolean m27070w(File file, String str) {
        return "vcf".equals(str) || "tdlib_accounts_debug.bin".equals(str) || (str.startsWith("tdlib") && str.endsWith("_debug"));
    }

    public static boolean m27069x(File file, String str) {
        return str.startsWith("x_account") && str.endsWith("_debug");
    }

    public static boolean m27068y(String str, File file, String str2) {
        return !str2.equals(str);
    }

    public boolean m27088e() {
        final String O0 = C4868i.m24727c2().m24829O0();
        boolean equals = O0.equals("apple");
        File[] fileArr = null;
        C4868i.m24727c2().m24659k6(equals ? null : O0);
        File s = C5078d.m23994s();
        try {
            fileArr = equals ? s.listFiles() : s.listFiles(new FilenameFilter() {
                @Override
                public final boolean accept(File file, String str) {
                    boolean v;
                    v = C4596b7.m27071v(O0, file, str);
                    return v;
                }
            });
        } catch (Throwable th) {
            Log.m14725e("Unable to obtain emoji files", th, new Object[0]);
        }
        return C5068g.m24101c(fileArr, true);
    }

    public boolean m27087f() {
        return C5068g.m24102b(C10536ab.m4808E0(true), false) && (C5068g.m24102b(C10536ab.m4808E0(false), false) && (C5068g.m24102b(C4897o.m24460n(), true) && (C5068g.m24101c(this.f15189m, true) && (C5068g.m24101c(this.f15188l, true)))));
    }

    public boolean m27086g() {
        return C6522y.m20164n().m20171g();
    }

    public boolean m27085h() {
        return C5068g.m24101c(this.f15190n, true);
    }

    public long m27084i(long j) {
        return this.f15178b + j;
    }

    public long m27083j() {
        return this.f15191o + this.f15192p;
    }

    public long m27082k() {
        return this.f15191o;
    }

    public long m27081l() {
        return this.f15185i + this.f15186j + this.f15187k;
    }

    public long m27080m() {
        return this.f15179c;
    }

    public long m27079n() {
        long j = this.f15195s;
        Log.C7879b bVar = this.f15196t;
        return j + (bVar != null ? bVar.f25457d : 0L);
    }

    public long m27078o() {
        return this.f15194r;
    }

    public long m27077p() {
        return this.f15183g;
    }

    public long m27076q() {
        return this.f15184h;
    }

    public long m27075r() {
        return this.f15180d + this.f15181e + this.f15182f;
    }

    public long m27074s() {
        return this.f15177a + this.f15178b + this.f15179c + this.f15180d + this.f15181e + this.f15182f + this.f15183g + this.f15192p + this.f15191o + this.f15194r + this.f15185i + this.f15186j + this.f15187k;
    }

    public String m27073t() {
        long s = m27074s();
        long n = m27079n();
        return (s == 0 || n == 0) ? C1363c0.m37426m(Math.max(s, n)) : C4403w.m27867j1(R.string.format_usageAndLogsSize, C1363c0.m37426m(s), C1363c0.m37426m(n));
    }

    public boolean m27072u() {
        return m27074s() == 0;
    }
}
