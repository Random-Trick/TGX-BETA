package a4;

import c5.b0;
import c5.s;
import f4.a;
import k4.a;
import k4.e;
import k4.i;
import k4.j;
import k4.m;
import m3.q1;
import t3.o;

public final class h {
    public static final String[] f313a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static e a(int i10, b0 b0Var) {
        int n10 = b0Var.n();
        if (b0Var.n() == 1684108385) {
            b0Var.Q(8);
            String y10 = b0Var.y(n10 - 16);
            return new e("und", y10, y10);
        }
        String valueOf = String.valueOf(a.a(i10));
        s.i("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    public static a b(b0 b0Var) {
        int n10 = b0Var.n();
        if (b0Var.n() == 1684108385) {
            int b10 = a.b(b0Var.n());
            String str = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Unrecognized cover art flags: ");
                sb2.append(b10);
                s.i("MetadataUtil", sb2.toString());
                return null;
            }
            b0Var.Q(4);
            int i10 = n10 - 16;
            byte[] bArr = new byte[i10];
            b0Var.j(bArr, 0, i10);
            return new a(str, null, 3, bArr);
        }
        s.i("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static a.b c(b0 b0Var) {
        int e10 = b0Var.e() + b0Var.n();
        int n10 = b0Var.n();
        int i10 = (n10 >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & n10;
                if (i11 == 6516084) {
                    return a(n10, b0Var);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return h(n10, "TIT2", b0Var);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return h(n10, "TCOM", b0Var);
                }
                if (i11 == 6578553) {
                    return h(n10, "TDRC", b0Var);
                }
                if (i11 == 4280916) {
                    return h(n10, "TPE1", b0Var);
                }
                if (i11 == 7630703) {
                    return h(n10, "TSSE", b0Var);
                }
                if (i11 == 6384738) {
                    return h(n10, "TALB", b0Var);
                }
                if (i11 == 7108978) {
                    return h(n10, "USLT", b0Var);
                }
                if (i11 == 6776174) {
                    return h(n10, "TCON", b0Var);
                }
                if (i11 == 6779504) {
                    return h(n10, "TIT1", b0Var);
                }
            } else if (n10 == 1735291493) {
                return g(b0Var);
            } else {
                if (n10 == 1684632427) {
                    return d(n10, "TPOS", b0Var);
                }
                if (n10 == 1953655662) {
                    return d(n10, "TRCK", b0Var);
                }
                if (n10 == 1953329263) {
                    return i(n10, "TBPM", b0Var, true, false);
                }
                if (n10 == 1668311404) {
                    return i(n10, "TCMP", b0Var, true, true);
                }
                if (n10 == 1668249202) {
                    return b(b0Var);
                }
                if (n10 == 1631670868) {
                    return h(n10, "TPE2", b0Var);
                }
                if (n10 == 1936682605) {
                    return h(n10, "TSOT", b0Var);
                }
                if (n10 == 1936679276) {
                    return h(n10, "TSO2", b0Var);
                }
                if (n10 == 1936679282) {
                    return h(n10, "TSOA", b0Var);
                }
                if (n10 == 1936679265) {
                    return h(n10, "TSOP", b0Var);
                }
                if (n10 == 1936679791) {
                    return h(n10, "TSOC", b0Var);
                }
                if (n10 == 1920233063) {
                    return i(n10, "ITUNESADVISORY", b0Var, false, false);
                }
                if (n10 == 1885823344) {
                    return i(n10, "ITUNESGAPLESS", b0Var, false, true);
                }
                if (n10 == 1936683886) {
                    return h(n10, "TVSHOWSORT", b0Var);
                }
                if (n10 == 1953919848) {
                    return h(n10, "TVSHOW", b0Var);
                }
                if (n10 == 757935405) {
                    return e(b0Var, e10);
                }
            }
            String valueOf = String.valueOf(a.a(n10));
            s.b("MetadataUtil", valueOf.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            b0Var.P(e10);
        }
    }

    public static m d(int i10, String str, b0 b0Var) {
        int n10 = b0Var.n();
        if (b0Var.n() == 1684108385 && n10 >= 22) {
            b0Var.Q(10);
            int J = b0Var.J();
            if (J > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(J);
                String sb3 = sb2.toString();
                int J2 = b0Var.J();
                if (J2 > 0) {
                    String valueOf = String.valueOf(sb3);
                    StringBuilder sb4 = new StringBuilder(valueOf.length() + 12);
                    sb4.append(valueOf);
                    sb4.append("/");
                    sb4.append(J2);
                    sb3 = sb4.toString();
                }
                return new m(str, null, sb3);
            }
        }
        String valueOf2 = String.valueOf(a.a(i10));
        s.i("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static i e(b0 b0Var, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (b0Var.e() < i10) {
            int e10 = b0Var.e();
            int n10 = b0Var.n();
            int n11 = b0Var.n();
            b0Var.Q(4);
            if (n11 == 1835360622) {
                str = b0Var.y(n10 - 12);
            } else if (n11 == 1851878757) {
                str2 = b0Var.y(n10 - 12);
            } else {
                if (n11 == 1684108385) {
                    i11 = e10;
                    i12 = n10;
                }
                b0Var.Q(n10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        b0Var.P(i11);
        b0Var.Q(16);
        return new j(str, str2, b0Var.y(i12 - 16));
    }

    public static l4.a f(b0 b0Var, int i10, String str) {
        while (true) {
            int e10 = b0Var.e();
            if (e10 >= i10) {
                return null;
            }
            int n10 = b0Var.n();
            if (b0Var.n() == 1684108385) {
                int n11 = b0Var.n();
                int n12 = b0Var.n();
                int i11 = n10 - 16;
                byte[] bArr = new byte[i11];
                b0Var.j(bArr, 0, i11);
                return new l4.a(str, bArr, n12, n11);
            }
            b0Var.P(e10 + n10);
        }
    }

    public static k4.m g(c5.b0 r3) {
        throw new UnsupportedOperationException("Method not decompiled: a4.h.g(c5.b0):k4.m");
    }

    public static m h(int i10, String str, b0 b0Var) {
        int n10 = b0Var.n();
        if (b0Var.n() == 1684108385) {
            b0Var.Q(8);
            return new m(str, null, b0Var.y(n10 - 16));
        }
        String valueOf = String.valueOf(a.a(i10));
        s.i("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static i i(int i10, String str, b0 b0Var, boolean z10, boolean z11) {
        int j10 = j(b0Var);
        if (z11) {
            j10 = Math.min(1, j10);
        }
        if (j10 < 0) {
            String valueOf = String.valueOf(a.a(i10));
            s.i("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z10) {
            return new m(str, null, Integer.toString(j10));
        } else {
            return new e("und", str, Integer.toString(j10));
        }
    }

    public static int j(b0 b0Var) {
        b0Var.Q(4);
        if (b0Var.n() == 1684108385) {
            b0Var.Q(8);
            return b0Var.D();
        }
        s.i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static void k(int i10, o oVar, q1.b bVar) {
        if (i10 == 1 && oVar.a()) {
            bVar.N(oVar.f22896a).O(oVar.f22897b);
        }
    }

    public static void l(int r5, f4.a r6, f4.a r7, m3.q1.b r8, f4.a... r9) {
        throw new UnsupportedOperationException("Method not decompiled: a4.h.l(int, f4.a, f4.a, m3.q1$b, f4.a[]):void");
    }
}
