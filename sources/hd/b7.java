package hd;

import ce.c0;
import gd.w;
import he.i;
import he.o;
import ib.g;
import id.d;
import java.io.File;
import java.io.FilenameFilter;
import md.y;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import zd.ya;

public class b7 {
    public final long f12805a;
    public final long f12806b;
    public final long f12807c;
    public final long f12808d;
    public final long f12809e;
    public final long f12810f;
    public final long f12811g;
    public final long f12812h;
    public final long f12813i;
    public final long f12814j;
    public final long f12815k;
    public final File[] f12816l;
    public final File[] f12817m;
    public final File[] f12818n;
    public final long f12819o;
    public final long f12820p;
    public final File[] f12821q;
    public final long f12822r;
    public final long f12823s;
    public final Log.b f12824t;

    public b7(org.drinkless.td.libcore.telegram.TdApi.StorageStatisticsFast r11, hd.b7 r12) {
        throw new UnsupportedOperationException("Method not decompiled: hd.b7.<init>(org.drinkless.td.libcore.telegram.TdApi$StorageStatisticsFast, hd.b7):void");
    }

    public static boolean v(String str, File file, String str2) {
        return !str2.equals(str);
    }

    public static boolean w(File file, String str) {
        return "vcf".equals(str) || "tdlib_accounts_debug.bin".equals(str) || (str.startsWith("tdlib") && str.endsWith("_debug"));
    }

    public static boolean x(File file, String str) {
        return str.startsWith("x_account") && str.endsWith("_debug");
    }

    public static boolean y(String str, File file, String str2) {
        return !str2.equals(str);
    }

    public boolean e() {
        final String O0 = i.c2().O0();
        boolean equals = O0.equals("apple");
        File[] fileArr = null;
        i.c2().k6(equals ? null : O0);
        File s10 = d.s();
        try {
            fileArr = equals ? s10.listFiles() : s10.listFiles(new FilenameFilter() {
                @Override
                public final boolean accept(File file, String str) {
                    boolean v10;
                    v10 = b7.v(O0, file, str);
                    return v10;
                }
            });
        } catch (Throwable th) {
            Log.e("Unable to obtain emoji files", th, new Object[0]);
        }
        return g.c(fileArr, true);
    }

    public boolean f() {
        return g.b(ya.E0(true), false) && (g.b(ya.E0(false), false) && (g.b(o.n(), true) && (g.c(this.f12817m, true) && (g.c(this.f12816l, true)))));
    }

    public boolean g() {
        return y.n().g();
    }

    public boolean h() {
        return g.c(this.f12818n, true);
    }

    public long i(long j10) {
        return this.f12806b + j10;
    }

    public long j() {
        return this.f12819o + this.f12820p;
    }

    public long k() {
        return this.f12819o;
    }

    public long l() {
        return this.f12813i + this.f12814j + this.f12815k;
    }

    public long m() {
        return this.f12807c;
    }

    public long n() {
        long j10 = this.f12823s;
        Log.b bVar = this.f12824t;
        return j10 + (bVar != null ? bVar.f19993d : 0L);
    }

    public long o() {
        return this.f12822r;
    }

    public long p() {
        return this.f12811g;
    }

    public long q() {
        return this.f12812h;
    }

    public long r() {
        return this.f12808d + this.f12809e + this.f12810f;
    }

    public long s() {
        return this.f12805a + this.f12806b + this.f12807c + this.f12808d + this.f12809e + this.f12810f + this.f12811g + this.f12820p + this.f12819o + this.f12822r + this.f12813i + this.f12814j + this.f12815k;
    }

    public String t() {
        long s10 = s();
        long n10 = n();
        return (s10 == 0 || n10 == 0) ? c0.m(Math.max(s10, n10)) : w.j1(R.string.format_usageAndLogsSize, c0.m(s10), c0.m(n10));
    }

    public boolean u() {
        return s() == 0;
    }
}
