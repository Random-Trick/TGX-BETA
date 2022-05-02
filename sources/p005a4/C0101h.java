package p005a4;

import p020b5.C1189b0;
import p020b5.C1230s;
import p073f4.C4260a;
import p147k4.AbstractC6069i;
import p147k4.C6053a;
import p147k4.C6061e;
import p147k4.C6070j;
import p147k4.C6076m;
import p162l4.C6308a;
import p174m3.C6600g1;
import p270t3.C8969o;

public final class C0101h {
    public static final String[] f372a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static C6061e m42326a(int i, C1189b0 b0Var) {
        int n = b0Var.m38132n();
        if (b0Var.m38132n() == 1684108385) {
            b0Var.m38146Q(8);
            String y = b0Var.m38121y(n - 16);
            return new C6061e("und", y, y);
        }
        String valueOf = String.valueOf(AbstractC0082a.m42422a(i));
        C1230s.m37884i("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static C6053a m42325b(C1189b0 b0Var) {
        int n = b0Var.m38132n();
        if (b0Var.m38132n() == 1684108385) {
            int b = AbstractC0082a.m42421b(b0Var.m38132n());
            String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Unrecognized cover art flags: ");
                sb2.append(b);
                C1230s.m37884i("MetadataUtil", sb2.toString());
                return null;
            }
            b0Var.m38146Q(4);
            int i = n - 16;
            byte[] bArr = new byte[i];
            b0Var.m38136j(bArr, 0, i);
            return new C6053a(str, null, 3, bArr);
        }
        C1230s.m37884i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static C4260a.AbstractC4262b m42324c(C1189b0 b0Var) {
        int e = b0Var.m38141e() + b0Var.m38132n();
        int n = b0Var.m38132n();
        int i = (n >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & n;
                if (i2 == 6516084) {
                    return m42326a(n, b0Var);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return m42319h(n, "TIT2", b0Var);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return m42319h(n, "TCOM", b0Var);
                }
                if (i2 == 6578553) {
                    return m42319h(n, "TDRC", b0Var);
                }
                if (i2 == 4280916) {
                    return m42319h(n, "TPE1", b0Var);
                }
                if (i2 == 7630703) {
                    return m42319h(n, "TSSE", b0Var);
                }
                if (i2 == 6384738) {
                    return m42319h(n, "TALB", b0Var);
                }
                if (i2 == 7108978) {
                    return m42319h(n, "USLT", b0Var);
                }
                if (i2 == 6776174) {
                    return m42319h(n, "TCON", b0Var);
                }
                if (i2 == 6779504) {
                    return m42319h(n, "TIT1", b0Var);
                }
            } else if (n == 1735291493) {
                return m42320g(b0Var);
            } else {
                if (n == 1684632427) {
                    return m42323d(n, "TPOS", b0Var);
                }
                if (n == 1953655662) {
                    return m42323d(n, "TRCK", b0Var);
                }
                if (n == 1953329263) {
                    return m42318i(n, "TBPM", b0Var, true, false);
                }
                if (n == 1668311404) {
                    return m42318i(n, "TCMP", b0Var, true, true);
                }
                if (n == 1668249202) {
                    return m42325b(b0Var);
                }
                if (n == 1631670868) {
                    return m42319h(n, "TPE2", b0Var);
                }
                if (n == 1936682605) {
                    return m42319h(n, "TSOT", b0Var);
                }
                if (n == 1936679276) {
                    return m42319h(n, "TSO2", b0Var);
                }
                if (n == 1936679282) {
                    return m42319h(n, "TSOA", b0Var);
                }
                if (n == 1936679265) {
                    return m42319h(n, "TSOP", b0Var);
                }
                if (n == 1936679791) {
                    return m42319h(n, "TSOC", b0Var);
                }
                if (n == 1920233063) {
                    return m42318i(n, "ITUNESADVISORY", b0Var, false, false);
                }
                if (n == 1885823344) {
                    return m42318i(n, "ITUNESGAPLESS", b0Var, false, true);
                }
                if (n == 1936683886) {
                    return m42319h(n, "TVSHOWSORT", b0Var);
                }
                if (n == 1953919848) {
                    return m42319h(n, "TVSHOW", b0Var);
                }
                if (n == 757935405) {
                    return m42322e(b0Var, e);
                }
            }
            String valueOf = String.valueOf(AbstractC0082a.m42422a(n));
            C1230s.m37891b("MetadataUtil", valueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            b0Var.m38147P(e);
        }
    }

    public static C6076m m42323d(int i, String str, C1189b0 b0Var) {
        int n = b0Var.m38132n();
        if (b0Var.m38132n() == 1684108385 && n >= 22) {
            b0Var.m38146Q(10);
            int J = b0Var.m38153J();
            if (J > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(J);
                String sb3 = sb2.toString();
                int J2 = b0Var.m38153J();
                if (J2 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(J2);
                    sb3 = sb4.toString();
                }
                return new C6076m(str, null, sb3);
            }
        }
        String valueOf2 = String.valueOf(AbstractC0082a.m42422a(i));
        C1230s.m37884i("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static AbstractC6069i m42322e(C1189b0 b0Var, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (b0Var.m38141e() < i) {
            int e = b0Var.m38141e();
            int n = b0Var.m38132n();
            int n2 = b0Var.m38132n();
            b0Var.m38146Q(4);
            if (n2 == 1835360622) {
                str = b0Var.m38121y(n - 12);
            } else if (n2 == 1851878757) {
                str2 = b0Var.m38121y(n - 12);
            } else {
                if (n2 == 1684108385) {
                    i2 = e;
                    i3 = n;
                }
                b0Var.m38146Q(n - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        b0Var.m38147P(i2);
        b0Var.m38146Q(16);
        return new C6070j(str, str2, b0Var.m38121y(i3 - 16));
    }

    public static C6308a m42321f(C1189b0 b0Var, int i, String str) {
        while (true) {
            int e = b0Var.m38141e();
            if (e >= i) {
                return null;
            }
            int n = b0Var.m38132n();
            if (b0Var.m38132n() == 1684108385) {
                int n2 = b0Var.m38132n();
                int n3 = b0Var.m38132n();
                int i2 = n - 16;
                byte[] bArr = new byte[i2];
                b0Var.m38136j(bArr, 0, i2);
                return new C6308a(str, bArr, n3, n2);
            }
            b0Var.m38147P(e + n);
        }
    }

    public static p147k4.C6076m m42320g(p020b5.C1189b0 r3) {
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0101h.m42320g(b5.b0):k4.m");
    }

    public static C6076m m42319h(int i, String str, C1189b0 b0Var) {
        int n = b0Var.m38132n();
        if (b0Var.m38132n() == 1684108385) {
            b0Var.m38146Q(8);
            return new C6076m(str, null, b0Var.m38121y(n - 16));
        }
        String valueOf = String.valueOf(AbstractC0082a.m42422a(i));
        C1230s.m37884i("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static AbstractC6069i m42318i(int i, String str, C1189b0 b0Var, boolean z, boolean z2) {
        int j = m42317j(b0Var);
        if (z2) {
            j = Math.min(1, j);
        }
        if (j < 0) {
            String valueOf = String.valueOf(AbstractC0082a.m42422a(i));
            C1230s.m37884i("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new C6076m(str, null, Integer.toString(j));
        } else {
            return new C6061e("und", str, Integer.toString(j));
        }
    }

    public static int m42317j(C1189b0 b0Var) {
        b0Var.m38146Q(4);
        if (b0Var.m38132n() == 1684108385) {
            b0Var.m38146Q(8);
            return b0Var.m38159D();
        }
        C1230s.m37884i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void m42316k(int i, C8969o oVar, C6600g1.C6602b bVar) {
        if (i == 1 && oVar.m10804a()) {
            bVar.m19881N(oVar.f28857a).m19880O(oVar.f28858b);
        }
    }

    public static void m42315l(int r5, p073f4.C4260a r6, p073f4.C4260a r7, p174m3.C6600g1.C6602b r8, p073f4.C4260a... r9) {
        throw new UnsupportedOperationException("Method not decompiled: p005a4.C0101h.m42315l(int, f4.a, f4.a, m3.g1$b, f4.a[]):void");
    }
}
