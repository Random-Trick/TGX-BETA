package ib;

import java.util.HashMap;

public final class e {
    public static final HashMap<String, a> f14163a = b();
    public static final a f14164b = new a("$", null, null, ",", ".", 2, 1);

    public static class a {
        public final String f14165a;
        public final String f14166b;
        public final String f14167c;
        public final String f14168d;
        public final String f14169e;
        public final int f14170f;
        public final int f14171g;

        public a(String str, String str2, String str3, String str4, String str5, int i10, int i11) {
            this.f14165a = str;
            this.f14166b = str2;
            this.f14167c = str3;
            this.f14168d = str4;
            this.f14169e = str5;
            this.f14170f = i10;
            this.f14171g = i11;
        }
    }

    public static String a(String str, long j10) {
        long j11;
        long j12;
        long j13;
        a c10 = c(str);
        StringBuilder sb2 = new StringBuilder();
        String str2 = i.i(c10.f14167c) ? c10.f14166b : c10.f14167c;
        if ((c10.f14171g & 1) != 0) {
            sb2.append(str2);
            if ((c10.f14171g & 2) != 0) {
                sb2.append(' ');
            }
        }
        int i10 = c10.f14170f;
        if (i10 != 0) {
            j13 = (long) Math.pow(10.0d, i10);
            j12 = j10 % j13;
            j11 = j10 / j13;
        } else {
            j11 = j10;
            j13 = -1;
            j12 = -1;
        }
        if (j11 == 0) {
            sb2.append('0');
        } else {
            int length = sb2.length();
            long j14 = j11;
            boolean z10 = true;
            while (j14 > 0) {
                long j15 = j14 % 1000;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.insert(length, c10.f14168d);
                }
                j14 /= 1000;
                sb2.insert(length, j15);
                if (j14 > 0 && j15 < 100) {
                    sb2.insert(length, '0');
                    if (j15 < 10) {
                        sb2.insert(length, '0');
                    }
                }
            }
            if (j12 != -1 && j12 != 0) {
                sb2.append(c10.f14169e);
                int length2 = sb2.length();
                sb2.append(j12);
                long j16 = j13 / 10;
                while (true) {
                    j16 /= 10;
                    if (j16 == 0) {
                        break;
                    } else if (j12 < j16) {
                        sb2.insert(length2, '0');
                    }
                }
            }
        }
        int i11 = c10.f14171g;
        if ((i11 & 1) == 0) {
            if ((i11 & 2) != 0) {
                sb2.append(' ');
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public static HashMap<String, a> b() {
        HashMap<String, a> hashMap = new HashMap<>();
        hashMap.put("AED", new a("AED", "د.إ.\u200f", null, ",", ".", 2, 3));
        hashMap.put("AFN", new a("AFN", "؋", null, ",", ".", 2, 1));
        hashMap.put("ALL", new a("ALL", "Lek", null, ".", ",", 2, 0));
        hashMap.put("AMD", new a("AMD", "դր.", null, ",", ".", 2, 2));
        hashMap.put("ARS", new a("ARS", "$", null, ".", ",", 2, 3));
        hashMap.put("AUD", new a("AU$", "$", null, ",", ".", 2, 1));
        hashMap.put("AZN", new a("AZN", "ман.", null, " ", ",", 2, 2));
        hashMap.put("BAM", new a("BAM", "KM", null, ".", ",", 2, 2));
        hashMap.put("BDT", new a("BDT", "৳", null, ",", ".", 2, 3));
        hashMap.put("BGN", new a("BGN", "лв.", null, " ", ",", 2, 2));
        hashMap.put("BND", new a("BND", "$", null, ".", ",", 2, 1));
        hashMap.put("BOB", new a("BOB", "Bs", null, ".", ",", 2, 3));
        hashMap.put("BRL", new a("R$", "R$", null, ".", ",", 2, 3));
        hashMap.put("CAD", new a("CA$", "$", null, ",", ".", 2, 1));
        hashMap.put("CHF", new a("CHF", "CHF", null, "'", ".", 2, 2));
        hashMap.put("CLP", new a("CLP", "$", null, ".", ",", 0, 3));
        hashMap.put("CNY", new a("CN¥", "CN¥", null, ",", ".", 2, 1));
        hashMap.put("COP", new a("COP", "$", null, ".", ",", 2, 3));
        hashMap.put("CRC", new a("CRC", "₡", null, ".", ",", 2, 1));
        hashMap.put("CZK", new a("CZK", "Kč", null, " ", ",", 2, 2));
        hashMap.put("DKK", new a("DKK", "kr", null, "", ",", 2, 2));
        hashMap.put("DOP", new a("DOP", "$", null, ",", ".", 2, 1));
        hashMap.put("DZD", new a("DZD", "د.ج.\u200f", null, ",", ".", 2, 3));
        hashMap.put("EGP", new a("EGP", "ج.م.\u200f", null, ",", ".", 2, 3));
        hashMap.put("EUR", new a("€", "€", null, " ", ",", 2, 2));
        hashMap.put("GBP", new a("£", "£", null, ",", ".", 2, 1));
        hashMap.put("GEL", new a("GEL", "GEL", null, " ", ",", 2, 2));
        hashMap.put("GTQ", new a("GTQ", "Q", null, ",", ".", 2, 1));
        hashMap.put("HKD", new a("HK$", "$", null, ",", ".", 2, 1));
        hashMap.put("HNL", new a("HNL", "L", null, ",", ".", 2, 3));
        hashMap.put("HRK", new a("HRK", "kn", null, ".", ",", 2, 2));
        hashMap.put("HUF", new a("HUF", "Ft", null, " ", ",", 2, 2));
        hashMap.put("IDR", new a("IDR", "Rp", null, ".", ",", 2, 1));
        hashMap.put("ILS", new a("₪", "₪", null, ",", ".", 2, 3));
        hashMap.put("INR", new a("₹", "₹", null, ",", ".", 2, 1));
        hashMap.put("ISK", new a("ISK", "kr", null, ".", ",", 0, 2));
        hashMap.put("JMD", new a("JMD", "$", null, ",", ".", 2, 1));
        hashMap.put("JPY", new a("¥", "￥", "¥", ",", ".", 0, 1));
        hashMap.put("KES", new a("KES", "Ksh", null, ",", ".", 2, 1));
        hashMap.put("KGS", new a("KGS", "KGS", null, " ", "-", 2, 2));
        hashMap.put("KRW", new a("₩", "₩", null, ",", ".", 0, 1));
        hashMap.put("KZT", new a("KZT", "₸", null, " ", "-", 2, 1));
        hashMap.put("LBP", new a("LBP", "ل.ل.\u200f", "£", ",", ".", 2, 3));
        hashMap.put("LKR", new a("LKR", "රු.", "₨", ",", ".", 2, 3));
        hashMap.put("MAD", new a("MAD", "د.م.\u200f", null, ",", ".", 2, 3));
        hashMap.put("MDL", new a("MDL", "MDL", null, ",", ".", 2, 2));
        hashMap.put("MNT", new a("MNT", "MNT", null, " ", ",", 2, 1));
        hashMap.put("MUR", new a("MUR", "MUR", null, ",", ".", 2, 1));
        hashMap.put("MVR", new a("MVR", "MVR", null, ",", ".", 2, 2));
        hashMap.put("MXN", new a("MX$", "$", null, ",", ".", 2, 1));
        hashMap.put("MYR", new a("MYR", "RM", null, ",", ".", 2, 1));
        hashMap.put("MZN", new a("MZN", "MTn", null, ",", ".", 2, 1));
        hashMap.put("NGN", new a("NGN", "₦", null, ",", ".", 2, 1));
        hashMap.put("NIO", new a("NIO", "C$", null, ",", ".", 2, 3));
        hashMap.put("NOK", new a("NOK", "kr", null, " ", ",", 2, 3));
        hashMap.put("NPR", new a("NPR", "नेरू", null, ",", ".", 2, 1));
        hashMap.put("NZD", new a("NZ$", "$", null, ",", ".", 2, 1));
        hashMap.put("PAB", new a("PAB", "B/.", null, ",", ".", 2, 3));
        hashMap.put("PEN", new a("PEN", "S/.", null, ",", ".", 2, 3));
        hashMap.put("PHP", new a("PHP", "₱", null, ",", ".", 2, 1));
        hashMap.put("PKR", new a("PKR", "₨", null, ",", ".", 2, 1));
        hashMap.put("PLN", new a("PLN", "zł", null, " ", ",", 2, 2));
        hashMap.put("PYG", new a("PYG", "₲", null, ".", ",", 0, 3));
        hashMap.put("QAR", new a("QAR", "ر.ق.\u200f", null, ",", ".", 2, 3));
        hashMap.put("RON", new a("RON", "RON", null, ".", ",", 2, 2));
        hashMap.put("RSD", new a("RSD", "дин.", null, ".", ",", 2, 2));
        hashMap.put("RUB", new a("RUB", "₽", null, " ", ",", 2, 2));
        hashMap.put("SAR", new a("SAR", "ر.س.\u200f", "﷼", ",", ".", 2, 3));
        hashMap.put("SEK", new a("SEK", "kr", null, ".", ",", 2, 2));
        hashMap.put("SGD", new a("SGD", "$", null, ",", ".", 2, 1));
        hashMap.put("THB", new a("฿", "฿", null, ",", ".", 2, 1));
        hashMap.put("TJS", new a("TJS", "TJS", null, " ", ";", 2, 2));
        hashMap.put("TRY", new a("TRY", "TL", null, ".", ",", 2, 2));
        hashMap.put("TTD", new a("TTD", "$", null, ",", ".", 2, 1));
        hashMap.put("TWD", new a("NT$", "NT$", null, ",", ".", 2, 1));
        hashMap.put("TZS", new a("TZS", "TSh", null, ",", ".", 2, 1));
        hashMap.put("UAH", new a("UAH", "₴", null, " ", ",", 2, 0));
        hashMap.put("UGX", new a("UGX", "USh", null, ",", ".", 0, 1));
        hashMap.put("USD", new a("$", "$", null, ",", ".", 2, 1));
        hashMap.put("UYU", new a("UYU", "$", null, ".", ",", 2, 3));
        hashMap.put("UZS", new a("UZS", "UZS", null, " ", ",", 2, 2));
        hashMap.put("VND", new a("₫", "₫", null, ".", ",", 0, 2));
        hashMap.put("YER", new a("YER", "ر.ي.\u200f", "﷼", ",", ".", 2, 3));
        hashMap.put("ZAR", new a("ZAR", "R", null, ",", ".", 2, 3));
        return hashMap;
    }

    public static a c(String str) {
        a aVar;
        return (i.i(str) || (aVar = f14163a.get(str)) == null) ? f14164b : aVar;
    }

    public static String d(String str) {
        if (i.i(str)) {
            return str;
        }
        a c10 = c(str);
        return i.i(c10.f14167c) ? c10.f14166b : c10.f14167c;
    }
}
