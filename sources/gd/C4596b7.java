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

    public static boolean m27069v(String str, File file, String str2) {
        return !str2.equals(str);
    }

    public static boolean m27068w(File file, String str) {
        return "vcf".equals(str) || "tdlib_accounts_debug.bin".equals(str) || (str.startsWith("tdlib") && str.endsWith("_debug"));
    }

    public static boolean m27067x(File file, String str) {
        return str.startsWith("x_account") && str.endsWith("_debug");
    }

    public static boolean m27066y(String str, File file, String str2) {
        return !str2.equals(str);
    }

    public boolean m27086e() {
        final String O0 = C4868i.m24726c2().m24828O0();
        boolean equals = O0.equals("apple");
        File[] fileArr = null;
        C4868i.m24726c2().m24658k6(equals ? null : O0);
        File s = C5078d.m23993s();
        try {
            fileArr = equals ? s.listFiles() : s.listFiles(new FilenameFilter() {
                @Override
                public final boolean accept(File file, String str) {
                    boolean v;
                    v = C4596b7.m27069v(O0, file, str);
                    return v;
                }
            });
        } catch (Throwable th) {
            Log.m14725e("Unable to obtain emoji files", th, new Object[0]);
        }
        return C5068g.m24100c(fileArr, true);
    }

    public boolean m27085f() {
        return C5068g.m24101b(C10536ab.m4808E0(true), false) && (C5068g.m24101b(C10536ab.m4808E0(false), false) && (C5068g.m24101b(C4897o.m24459n(), true) && (C5068g.m24100c(this.f15189m, true) && (C5068g.m24100c(this.f15188l, true)))));
    }

    public boolean m27084g() {
        return C6522y.m20163n().m20170g();
    }

    public boolean m27083h() {
        return C5068g.m24100c(this.f15190n, true);
    }

    public long m27082i(long j) {
        return this.f15178b + j;
    }

    public long m27081j() {
        return this.f15191o + this.f15192p;
    }

    public long m27080k() {
        return this.f15191o;
    }

    public long m27079l() {
        return this.f15185i + this.f15186j + this.f15187k;
    }

    public long m27078m() {
        return this.f15179c;
    }

    public long m27077n() {
        long j = this.f15195s;
        Log.C7879b bVar = this.f15196t;
        return j + (bVar != null ? bVar.f25454d : 0L);
    }

    public long m27076o() {
        return this.f15194r;
    }

    public long m27075p() {
        return this.f15183g;
    }

    public long m27074q() {
        return this.f15184h;
    }

    public long m27073r() {
        return this.f15180d + this.f15181e + this.f15182f;
    }

    public long m27072s() {
        return this.f15177a + this.f15178b + this.f15179c + this.f15180d + this.f15181e + this.f15182f + this.f15183g + this.f15192p + this.f15191o + this.f15194r + this.f15185i + this.f15186j + this.f15187k;
    }

    public String m27071t() {
        long s = m27072s();
        long n = m27077n();
        return (s == 0 || n == 0) ? C1363c0.m37423m(Math.max(s, n)) : C4403w.m27865j1(R.string.format_usageAndLogsSize, C1363c0.m37423m(s), C1363c0.m37423m(n));
    }

    public boolean m27070u() {
        return m27072s() == 0;
    }
}
