package p166l8;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p093g8.C4523f;
import p093g8.EnumC4522e;
import p105h8.C5023b;
import p105h8.C5025d;
import p105h8.C5032k;
import p105h8.EnumC5024c;

public final class C6419d {
    public static final char[] f20081a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static class C6420a {
        public static final int[] f20082a;

        static {
            int[] iArr = new int[EnumC6424h.values().length];
            f20082a = iArr;
            try {
                iArr[EnumC6424h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20082a[EnumC6424h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20082a[EnumC6424h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20082a[EnumC6424h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20082a[EnumC6424h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20082a[EnumC6424h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20082a[EnumC6424h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20082a[EnumC6424h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20082a[EnumC6424h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20082a[EnumC6424h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static C5025d m20444a(byte[] bArr, C6426j jVar, EnumC6422f fVar, Map<EnumC4522e, ?> map) {
        EnumC6424h a;
        EnumC6424h hVar;
        C5023b bVar = new C5023b(bArr);
        StringBuilder sb2 = new StringBuilder(50);
        int i = 1;
        ArrayList arrayList = new ArrayList(1);
        EnumC5024c cVar = null;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            try {
                if (bVar.m24273a() < 4) {
                    a = EnumC6424h.TERMINATOR;
                } else {
                    a = EnumC6424h.m20427a(bVar.m24272b(4));
                }
                EnumC6424h hVar2 = a;
                int[] iArr = C6420a.f20082a;
                switch (iArr[hVar2.ordinal()]) {
                    case 5:
                        hVar = hVar2;
                        break;
                    case 6:
                    case 7:
                        hVar = hVar2;
                        z = true;
                        break;
                    case 8:
                        if (bVar.m24273a() >= 16) {
                            int b = bVar.m24272b(8);
                            i3 = bVar.m24272b(8);
                            i2 = b;
                            hVar = hVar2;
                            break;
                        } else {
                            throw C4523f.m27499a();
                        }
                    case 9:
                        cVar = EnumC5024c.m24271a(m20438g(bVar));
                        if (cVar == null) {
                            throw C4523f.m27499a();
                        }
                        hVar = hVar2;
                        break;
                    case 10:
                        int b2 = bVar.m24272b(4);
                        int b3 = bVar.m24272b(hVar2.m20426b(jVar));
                        if (b2 == i) {
                            m20441d(bVar, sb2, b3);
                        }
                        hVar = hVar2;
                        break;
                    default:
                        int b4 = bVar.m24272b(hVar2.m20426b(jVar));
                        int i4 = iArr[hVar2.ordinal()];
                        if (i4 != i) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    hVar = hVar2;
                                    m20442c(bVar, sb2, b4, cVar, arrayList, map);
                                    break;
                                } else if (i4 == 4) {
                                    m20440e(bVar, sb2, b4);
                                    hVar = hVar2;
                                    break;
                                } else {
                                    throw C4523f.m27499a();
                                }
                            } else {
                                hVar = hVar2;
                                m20443b(bVar, sb2, b4, z);
                                break;
                            }
                        } else {
                            hVar = hVar2;
                            m20439f(bVar, sb2, b4);
                            break;
                        }
                }
                if (hVar == EnumC6424h.TERMINATOR) {
                    return new C5025d(bArr, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar == null ? null : fVar.toString(), i2, i3);
                }
                i = 1;
            } catch (IllegalArgumentException unused) {
                throw C4523f.m27499a();
            }
        }
    }

    public static void m20443b(C5023b bVar, StringBuilder sb2, int i, boolean z) {
        while (i > 1) {
            if (bVar.m24273a() >= 11) {
                int b = bVar.m24272b(11);
                sb2.append(m20437h(b / 45));
                sb2.append(m20437h(b % 45));
                i -= 2;
            } else {
                throw C4523f.m27499a();
            }
        }
        if (i == 1) {
            if (bVar.m24273a() >= 6) {
                sb2.append(m20437h(bVar.m24272b(6)));
            } else {
                throw C4523f.m27499a();
            }
        }
        if (z) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i2 = length + 1;
                        if (sb2.charAt(i2) == '%') {
                            sb2.deleteCharAt(i2);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    public static void m20442c(C5023b bVar, StringBuilder sb2, int i, EnumC5024c cVar, Collection<byte[]> collection, Map<EnumC4522e, ?> map) {
        String str;
        if ((i << 3) <= bVar.m24273a()) {
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = (byte) bVar.m24272b(8);
            }
            if (cVar == null) {
                str = C5032k.m24243a(bArr, map);
            } else {
                str = cVar.name();
            }
            try {
                sb2.append(new String(bArr, str));
                collection.add(bArr);
            } catch (UnsupportedEncodingException unused) {
                throw C4523f.m27499a();
            }
        } else {
            throw C4523f.m27499a();
        }
    }

    public static void m20441d(C5023b bVar, StringBuilder sb2, int i) {
        if (i * 13 <= bVar.m24273a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int b = bVar.m24272b(13);
                int i3 = (b % 96) | ((b / 96) << 8);
                int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "GB2312"));
            } catch (UnsupportedEncodingException unused) {
                throw C4523f.m27499a();
            }
        } else {
            throw C4523f.m27499a();
        }
    }

    public static void m20440e(C5023b bVar, StringBuilder sb2, int i) {
        if (i * 13 <= bVar.m24273a()) {
            byte[] bArr = new byte[i * 2];
            int i2 = 0;
            while (i > 0) {
                int b = bVar.m24272b(13);
                int i3 = (b % 192) | ((b / 192) << 8);
                int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
                bArr[i2] = (byte) (i4 >> 8);
                bArr[i2 + 1] = (byte) i4;
                i2 += 2;
                i--;
            }
            try {
                sb2.append(new String(bArr, "SJIS"));
            } catch (UnsupportedEncodingException unused) {
                throw C4523f.m27499a();
            }
        } else {
            throw C4523f.m27499a();
        }
    }

    public static void m20439f(C5023b bVar, StringBuilder sb2, int i) {
        while (i >= 3) {
            if (bVar.m24273a() >= 10) {
                int b = bVar.m24272b(10);
                if (b < 1000) {
                    sb2.append(m20437h(b / 100));
                    sb2.append(m20437h((b / 10) % 10));
                    sb2.append(m20437h(b % 10));
                    i -= 3;
                } else {
                    throw C4523f.m27499a();
                }
            } else {
                throw C4523f.m27499a();
            }
        }
        if (i == 2) {
            if (bVar.m24273a() >= 7) {
                int b2 = bVar.m24272b(7);
                if (b2 < 100) {
                    sb2.append(m20437h(b2 / 10));
                    sb2.append(m20437h(b2 % 10));
                    return;
                }
                throw C4523f.m27499a();
            }
            throw C4523f.m27499a();
        } else if (i != 1) {
        } else {
            if (bVar.m24273a() >= 4) {
                int b3 = bVar.m24272b(4);
                if (b3 < 10) {
                    sb2.append(m20437h(b3));
                    return;
                }
                throw C4523f.m27499a();
            }
            throw C4523f.m27499a();
        }
    }

    public static int m20438g(C5023b bVar) {
        int b = bVar.m24272b(8);
        if ((b & Log.TAG_YOUTUBE) == 0) {
            return b & 127;
        }
        if ((b & 192) == 128) {
            return bVar.m24272b(8) | ((b & 63) << 8);
        }
        if ((b & 224) == 192) {
            return bVar.m24272b(16) | ((b & 31) << 16);
        }
        throw C4523f.m27499a();
    }

    public static char m20437h(int i) {
        char[] cArr = f20081a;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw C4523f.m27499a();
    }
}
