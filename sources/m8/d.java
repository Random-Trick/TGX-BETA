package m8;

import h8.e;
import h8.f;
import i8.b;
import i8.c;
import i8.k;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.thunderdog.challegram.Log;

public final class d {
    public static final char[] f17310a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static class a {
        public static final int[] f17311a;

        static {
            int[] iArr = new int[h.values().length];
            f17311a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17311a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17311a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17311a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17311a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17311a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17311a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17311a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17311a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17311a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static i8.d a(byte[] bArr, j jVar, f fVar, Map<e, ?> map) {
        h a10;
        h hVar;
        b bVar = new b(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        int i10 = 1;
        ArrayList arrayList = new ArrayList(1);
        c cVar = null;
        boolean z10 = false;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            try {
                if (bVar.a() < 4) {
                    a10 = h.TERMINATOR;
                } else {
                    a10 = h.a(bVar.b(4));
                }
                h hVar2 = a10;
                int[] iArr = a.f17311a;
                switch (iArr[hVar2.ordinal()]) {
                    case 5:
                        hVar = hVar2;
                        break;
                    case 6:
                    case 7:
                        hVar = hVar2;
                        z10 = true;
                        break;
                    case 8:
                        if (bVar.a() >= 16) {
                            int b10 = bVar.b(8);
                            i12 = bVar.b(8);
                            i11 = b10;
                            hVar = hVar2;
                            break;
                        } else {
                            throw f.a();
                        }
                    case 9:
                        cVar = c.a(g(bVar));
                        if (cVar == null) {
                            throw f.a();
                        }
                        hVar = hVar2;
                        break;
                    case 10:
                        int b11 = bVar.b(4);
                        int b12 = bVar.b(hVar2.b(jVar));
                        if (b11 == i10) {
                            d(bVar, sb2, b12);
                        }
                        hVar = hVar2;
                        break;
                    default:
                        int b13 = bVar.b(hVar2.b(jVar));
                        int i13 = iArr[hVar2.ordinal()];
                        if (i13 != i10) {
                            if (i13 != 2) {
                                if (i13 == 3) {
                                    hVar = hVar2;
                                    c(bVar, sb2, b13, cVar, arrayList, map);
                                    break;
                                } else if (i13 == 4) {
                                    e(bVar, sb2, b13);
                                    hVar = hVar2;
                                    break;
                                } else {
                                    throw f.a();
                                }
                            } else {
                                hVar = hVar2;
                                b(bVar, sb2, b13, z10);
                                break;
                            }
                        } else {
                            hVar = hVar2;
                            f(bVar, sb2, b13);
                            break;
                        }
                }
                if (hVar == h.TERMINATOR) {
                    return new i8.d(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i11, i12);
                }
                i10 = 1;
            } catch (IllegalArgumentException unused) {
                throw f.a();
            }
        }
    }

    public static void b(b bVar, StringBuilder sb2, int i10, boolean z10) {
        while (i10 > 1) {
            if (bVar.a() >= 11) {
                int b10 = bVar.b(11);
                sb2.append(h(b10 / 45));
                sb2.append(h(b10 % 45));
                i10 -= 2;
            } else {
                throw f.a();
            }
        }
        if (i10 == 1) {
            if (bVar.a() >= 6) {
                sb2.append(h(bVar.b(6)));
            } else {
                throw f.a();
            }
        }
        if (z10) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i11 = length + 1;
                        if (sb2.charAt(i11) == '%') {
                            sb2.deleteCharAt(i11);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void c(b bVar, StringBuilder sb2, int i10, c cVar, Collection<byte[]> collection, Map<e, ?> map) {
        String str;
        if ((i10 << 3) <= bVar.a()) {
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                bArr[i11] = (byte) bVar.b(8);
            }
            if (cVar == null) {
                str = k.a(bArr, map);
            } else {
                str = cVar.name();
            }
            try {
                sb2.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }

    public static void d(b bVar, StringBuilder sb2, int i10) {
        if (i10 * 13 <= bVar.a()) {
            byte[] bArr = new byte[i10 * 2];
            int i11 = 0;
            while (i10 > 0) {
                int b10 = bVar.b(13);
                int i12 = (b10 % 96) | ((b10 / 96) << 8);
                int i13 = i12 + (i12 < 2560 ? 41377 : 42657);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }

    public static void e(b bVar, StringBuilder sb2, int i10) {
        if (i10 * 13 <= bVar.a()) {
            byte[] bArr = new byte[i10 * 2];
            int i11 = 0;
            while (i10 > 0) {
                int b10 = bVar.b(13);
                int i12 = (b10 % 192) | ((b10 / 192) << 8);
                int i13 = i12 + (i12 < 7936 ? 33088 : 49472);
                bArr[i11] = (byte) (i13 >> 8);
                bArr[i11 + 1] = (byte) i13;
                i11 += 2;
                i10--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw f.a();
            }
        } else {
            throw f.a();
        }
    }

    public static void f(b bVar, StringBuilder sb2, int i10) {
        while (i10 >= 3) {
            if (bVar.a() >= 10) {
                int b10 = bVar.b(10);
                if (b10 < 1000) {
                    sb2.append(h(b10 / 100));
                    sb2.append(h((b10 / 10) % 10));
                    sb2.append(h(b10 % 10));
                    i10 -= 3;
                } else {
                    throw f.a();
                }
            } else {
                throw f.a();
            }
        }
        if (i10 == 2) {
            if (bVar.a() >= 7) {
                int b11 = bVar.b(7);
                if (b11 < 100) {
                    sb2.append(h(b11 / 10));
                    sb2.append(h(b11 % 10));
                    return;
                }
                throw f.a();
            }
            throw f.a();
        } else if (i10 != 1) {
        } else {
            if (bVar.a() >= 4) {
                int b12 = bVar.b(4);
                if (b12 < 10) {
                    sb2.append(h(b12));
                    return;
                }
                throw f.a();
            }
            throw f.a();
        }
    }

    public static int g(b bVar) {
        int b10 = bVar.b(8);
        if ((b10 & Log.TAG_YOUTUBE) == 0) {
            return b10 & 127;
        }
        if ((b10 & 192) == 128) {
            return bVar.b(8) | ((b10 & 63) << 8);
        }
        if ((b10 & 224) == 192) {
            return bVar.b(16) | ((b10 & 31) << 16);
        }
        throw f.a();
    }

    public static char h(int i10) {
        char[] cArr = f17310a;
        if (i10 < cArr.length) {
            return cArr[i10];
        }
        throw f.a();
    }
}
