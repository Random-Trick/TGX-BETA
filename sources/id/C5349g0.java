package id;

import android.os.Build;
import be.C1369e0;
import ge.C4868i;
import nc.C7389v0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p156kd.C6253l;

public class C5349g0 extends AbstractC5333b implements AbstractC5331a {
    public int f17587f;
    public boolean f17588g;
    public int f17589h;
    public long f17590i = -1;
    public long f17591j = -1;
    public boolean f17592k;
    public C4868i.C4889t f17593l;

    public C5349g0(long j, String str, String str2, String str3) {
        super(j, str, str2, str3, true);
        m23155y(this, str3.substring(5));
    }

    public static boolean m23170j(C6253l lVar) {
        return lVar != null && ((!lVar.m20848a1() && lVar.m20860O0() == 0 && !lVar.m20833p1()) || m23162r(lVar, C1369e0.m37395g(C7389v0.m16573v0(lVar.mo20876q()))));
    }

    public static boolean m23163q(C6253l lVar) {
        return lVar != null && !lVar.m20833p1() && lVar.m20860O0() == 0 && lVar.m20859P0() == -1 && lVar.m20865J0() == -1;
    }

    public static boolean m23162r(C6253l lVar, String str) {
        int i;
        return !C5070i.m24062i(str) && (((i = Build.VERSION.SDK_INT) >= 18 && "video/mp4".equals(str)) || (lVar.m20860O0() == 0 && ((i >= 21 && "video/webm".equals(str)) || ((i >= 26 && "video/3gpp".equals(str)) || (i >= 29 && "video/ogg".equals(str))))));
    }

    public static String m23161s(int i, boolean z, int i2, long j, long j2, boolean z2, long j3) {
        return m23160t(i, z, C4868i.m24727c2().m24548z1(), i2, j, j2, z2, j3);
    }

    public static String m23160t(int i, boolean z, C4868i.C4889t tVar, int i2, long j, long j2, boolean z2, long j3) {
        StringBuilder sb2 = new StringBuilder("video");
        sb2.append(z ? 1 : 0);
        if (i2 != 0) {
            sb2.append(',');
            sb2.append("rotate");
            sb2.append(i2);
        }
        if (tVar != null && !tVar.m24488e()) {
            sb2.append(',');
            sb2.append("limit");
            sb2.append(tVar.f16716a.f16719a);
            sb2.append('x');
            sb2.append(tVar.f16716a.f16720b);
            if (tVar.f16717b != 29) {
                sb2.append(',');
                sb2.append("fps");
                sb2.append(tVar.f16717b);
            }
            if (tVar.f16718c != Long.MIN_VALUE) {
                sb2.append(',');
                sb2.append("bitrate");
                sb2.append(tVar.f16718c);
            }
        }
        if (j != -1) {
            sb2.append(',');
            sb2.append("start");
            sb2.append(j);
        }
        if (j2 != -1) {
            sb2.append(',');
            sb2.append("end");
            sb2.append(j2);
        }
        if (i != 0) {
            sb2.append(',');
            sb2.append("source");
            sb2.append(i);
        }
        if (z2) {
            sb2.append(',');
            sb2.append("noconvert");
            sb2.append('1');
        }
        if (j3 != 0) {
            sb2.append(',');
            sb2.append("modified");
            sb2.append(j3);
        }
        return sb2.toString();
    }

    public static String m23159u(String str, C6253l lVar, boolean z) {
        if (lVar != null) {
            return m23161s(0, lVar.m20833p1(), lVar.m20860O0(), lVar.m20859P0(), lVar.m20865J0(), z, AbstractC5333b.m23225g(str));
        }
        return m23161s(0, false, 0, -1L, -1L, z, AbstractC5333b.m23225g(str));
    }

    public static TdApi.InputFileGenerated m23156x(String str, C6253l lVar, boolean z) {
        return new TdApi.InputFileGenerated(str, m23159u(str, lVar, z), 0);
    }

    public static void m23155y(AbstractC5331a aVar, String str) {
        String[] split = str.split(",", -1);
        boolean z = C5070i.m24052s(split[0]) == 1;
        long j = Long.MIN_VALUE;
        int i = 29;
        int length = split.length;
        long j2 = -1;
        long j3 = -1;
        int i2 = 0;
        int i3 = 854;
        int i4 = 854;
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = split[i6];
            split = split;
            length = length;
            if (str2.startsWith("rotate")) {
                i5 = C5070i.m24052s(str2.substring(6));
            } else if (str2.startsWith("limit")) {
                String[] split2 = str2.substring(5).split("x");
                int s = C5070i.m24052s(split2[0]);
                int s2 = C5070i.m24052s(split2[1]);
                int max = Math.max(s, s2);
                i4 = Math.min(s, s2);
                i3 = max;
            } else if (str2.startsWith("bitrate")) {
                j = C5070i.m24048w(str2.substring(7));
            } else if (str2.startsWith("fps")) {
                i = C5070i.m24052s(str2.substring(3));
            } else if (str2.startsWith("start")) {
                j2 = C5070i.m24048w(str2.substring(5));
            } else if (str2.startsWith("end")) {
                j3 = C5070i.m24048w(str2.substring(3));
            } else if (str2.startsWith("source")) {
                i2 = C5070i.m24052s(str2.substring(6));
            } else {
                if (str2.startsWith("noconvert")) {
                    z2 = C5070i.m24052s(str2.substring(9)) == 1;
                } else if (!str2.startsWith("random") && !str2.startsWith("modified")) {
                    Log.m14709w("Unknown video conversion argument: %s", str2);
                }
            }
        }
        aVar.mo23068a(i2, z, new C4868i.C4889t(new C4868i.C4891v(i3, i4), i, j), i5, j2, j3, z2);
    }

    @Override
    public void mo23068a(int i, boolean z, C4868i.C4889t tVar, int i2, long j, long j2, boolean z2) {
        this.f17587f = i;
        this.f17588g = z;
        this.f17593l = tVar;
        this.f17589h = i2;
        this.f17590i = j;
        this.f17591j = j2;
        this.f17592k = z2;
    }

    public boolean m23169k() {
        return true;
    }

    public boolean m23168l() {
        return this.f17592k;
    }

    public long m23167m() {
        return this.f17591j;
    }

    public int m23166n() {
        return this.f17589h;
    }

    public long m23165o() {
        return this.f17590i;
    }

    public C4868i.C4889t m23164p() {
        return this.f17593l;
    }

    public boolean m23158v() {
        return this.f17588g;
    }

    public boolean m23157w() {
        return (this.f17590i == -1 || this.f17591j == -1) ? false : true;
    }
}
