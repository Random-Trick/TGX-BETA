package i8;

import h8.f;
import java.util.HashMap;
import java.util.Map;

public enum c {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    
    public static final Map<Integer, c> f14065m0 = new HashMap();
    public static final Map<String, c> f14066n0 = new HashMap();
    public final int[] f14068a;
    public final String[] f14069b;

    static {
        c[] values;
        for (c cVar : values()) {
            for (int i10 : cVar.f14068a) {
                f14065m0.put(Integer.valueOf(i10), cVar);
            }
            f14066n0.put(cVar.name(), cVar);
            for (String str : cVar.f14069b) {
                f14066n0.put(str, cVar);
            }
        }
    }

    c(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    public static c a(int i10) {
        if (i10 >= 0 && i10 < 900) {
            return f14065m0.get(Integer.valueOf(i10));
        }
        throw f.a();
    }

    c(int i10, String... strArr) {
        this.f14068a = new int[]{i10};
        this.f14069b = strArr;
    }

    c(int[] iArr, String... strArr) {
        this.f14068a = iArr;
        this.f14069b = strArr;
    }
}
