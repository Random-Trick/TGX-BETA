package p108hb;

import java.util.HashMap;

public final class C5065e {
    public static final HashMap<String, C5066a> f17070a = m24123b();
    public static final C5066a f17071b = new C5066a("$", null, null, ",", ".", 2, 1);

    public static class C5066a {
        public final String f17072a;
        public final String f17073b;
        public final String f17074c;
        public final String f17075d;
        public final String f17076e;
        public final int f17077f;
        public final int f17078g;

        public C5066a(String str, String str2, String str3, String str4, String str5, int i, int i2) {
            this.f17072a = str;
            this.f17073b = str2;
            this.f17074c = str3;
            this.f17075d = str4;
            this.f17076e = str5;
            this.f17077f = i;
            this.f17078g = i2;
        }
    }

    public static String m24124a(String str, long j) {
        long j2;
        long j3;
        long j4;
        C5066a c = m24122c(str);
        StringBuilder sb2 = new StringBuilder();
        String str2 = C5070i.m24062i(c.f17074c) ? c.f17073b : c.f17074c;
        if ((c.f17078g & 1) != 0) {
            sb2.append(str2);
            if ((c.f17078g & 2) != 0) {
                sb2.append(' ');
            }
        }
        int i = c.f17077f;
        if (i != 0) {
            j4 = (long) Math.pow(10.0d, i);
            j3 = j % j4;
            j2 = j / j4;
        } else {
            j2 = j;
            j4 = -1;
            j3 = -1;
        }
        if (j2 == 0) {
            sb2.append('0');
        } else {
            int length = sb2.length();
            long j5 = j2;
            boolean z = true;
            while (j5 > 0) {
                long j6 = j5 % 1000;
                if (z) {
                    z = false;
                } else {
                    sb2.insert(length, c.f17075d);
                }
                j5 /= 1000;
                sb2.insert(length, j6);
                if (j5 > 0 && j6 < 100) {
                    sb2.insert(length, '0');
                    if (j6 < 10) {
                        sb2.insert(length, '0');
                    }
                }
            }
            if (j3 != -1 && j3 != 0) {
                sb2.append(c.f17076e);
                int length2 = sb2.length();
                sb2.append(j3);
                long j7 = j4 / 10;
                while (true) {
                    j7 /= 10;
                    if (j7 == 0) {
                        break;
                    } else if (j3 < j7) {
                        sb2.insert(length2, '0');
                    }
                }
            }
        }
        int i2 = c.f17078g;
        if ((i2 & 1) == 0) {
            if ((i2 & 2) != 0) {
                sb2.append(' ');
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    public static HashMap<String, C5066a> m24123b() {
        HashMap<String, C5066a> hashMap = new HashMap<>();
        hashMap.put("AED", new C5066a("AED", "د.إ.\u200f", null, ",", ".", 2, 3));
        hashMap.put("AFN", new C5066a("AFN", "؋", null, ",", ".", 2, 1));
        hashMap.put("ALL", new C5066a("ALL", "Lek", null, ".", ",", 2, 0));
        hashMap.put("AMD", new C5066a("AMD", "դր.", null, ",", ".", 2, 2));
        hashMap.put("ARS", new C5066a("ARS", "$", null, ".", ",", 2, 3));
        hashMap.put("AUD", new C5066a("AU$", "$", null, ",", ".", 2, 1));
        hashMap.put("AZN", new C5066a("AZN", "ман.", null, " ", ",", 2, 2));
        hashMap.put("BAM", new C5066a("BAM", "KM", null, ".", ",", 2, 2));
        hashMap.put("BDT", new C5066a("BDT", "৳", null, ",", ".", 2, 3));
        hashMap.put("BGN", new C5066a("BGN", "лв.", null, " ", ",", 2, 2));
        hashMap.put("BND", new C5066a("BND", "$", null, ".", ",", 2, 1));
        hashMap.put("BOB", new C5066a("BOB", "Bs", null, ".", ",", 2, 3));
        hashMap.put("BRL", new C5066a("R$", "R$", null, ".", ",", 2, 3));
        hashMap.put("CAD", new C5066a("CA$", "$", null, ",", ".", 2, 1));
        hashMap.put("CHF", new C5066a("CHF", "CHF", null, "'", ".", 2, 2));
        hashMap.put("CLP", new C5066a("CLP", "$", null, ".", ",", 0, 3));
        hashMap.put("CNY", new C5066a("CN¥", "CN¥", null, ",", ".", 2, 1));
        hashMap.put("COP", new C5066a("COP", "$", null, ".", ",", 2, 3));
        hashMap.put("CRC", new C5066a("CRC", "₡", null, ".", ",", 2, 1));
        hashMap.put("CZK", new C5066a("CZK", "Kč", null, " ", ",", 2, 2));
        hashMap.put("DKK", new C5066a("DKK", "kr", null, "", ",", 2, 2));
        hashMap.put("DOP", new C5066a("DOP", "$", null, ",", ".", 2, 1));
        hashMap.put("DZD", new C5066a("DZD", "د.ج.\u200f", null, ",", ".", 2, 3));
        hashMap.put("EGP", new C5066a("EGP", "ج.م.\u200f", null, ",", ".", 2, 3));
        hashMap.put("EUR", new C5066a("€", "€", null, " ", ",", 2, 2));
        hashMap.put("GBP", new C5066a("£", "£", null, ",", ".", 2, 1));
        hashMap.put("GEL", new C5066a("GEL", "GEL", null, " ", ",", 2, 2));
        hashMap.put("GTQ", new C5066a("GTQ", "Q", null, ",", ".", 2, 1));
        hashMap.put("HKD", new C5066a("HK$", "$", null, ",", ".", 2, 1));
        hashMap.put("HNL", new C5066a("HNL", "L", null, ",", ".", 2, 3));
        hashMap.put("HRK", new C5066a("HRK", "kn", null, ".", ",", 2, 2));
        hashMap.put("HUF", new C5066a("HUF", "Ft", null, " ", ",", 2, 2));
        hashMap.put("IDR", new C5066a("IDR", "Rp", null, ".", ",", 2, 1));
        hashMap.put("ILS", new C5066a("₪", "₪", null, ",", ".", 2, 3));
        hashMap.put("INR", new C5066a("₹", "₹", null, ",", ".", 2, 1));
        hashMap.put("ISK", new C5066a("ISK", "kr", null, ".", ",", 0, 2));
        hashMap.put("JMD", new C5066a("JMD", "$", null, ",", ".", 2, 1));
        hashMap.put("JPY", new C5066a("¥", "￥", "¥", ",", ".", 0, 1));
        hashMap.put("KES", new C5066a("KES", "Ksh", null, ",", ".", 2, 1));
        hashMap.put("KGS", new C5066a("KGS", "KGS", null, " ", "-", 2, 2));
        hashMap.put("KRW", new C5066a("₩", "₩", null, ",", ".", 0, 1));
        hashMap.put("KZT", new C5066a("KZT", "₸", null, " ", "-", 2, 1));
        hashMap.put("LBP", new C5066a("LBP", "ل.ل.\u200f", "£", ",", ".", 2, 3));
        hashMap.put("LKR", new C5066a("LKR", "රු.", "₨", ",", ".", 2, 3));
        hashMap.put("MAD", new C5066a("MAD", "د.م.\u200f", null, ",", ".", 2, 3));
        hashMap.put("MDL", new C5066a("MDL", "MDL", null, ",", ".", 2, 2));
        hashMap.put("MNT", new C5066a("MNT", "MNT", null, " ", ",", 2, 1));
        hashMap.put("MUR", new C5066a("MUR", "MUR", null, ",", ".", 2, 1));
        hashMap.put("MVR", new C5066a("MVR", "MVR", null, ",", ".", 2, 2));
        hashMap.put("MXN", new C5066a("MX$", "$", null, ",", ".", 2, 1));
        hashMap.put("MYR", new C5066a("MYR", "RM", null, ",", ".", 2, 1));
        hashMap.put("MZN", new C5066a("MZN", "MTn", null, ",", ".", 2, 1));
        hashMap.put("NGN", new C5066a("NGN", "₦", null, ",", ".", 2, 1));
        hashMap.put("NIO", new C5066a("NIO", "C$", null, ",", ".", 2, 3));
        hashMap.put("NOK", new C5066a("NOK", "kr", null, " ", ",", 2, 3));
        hashMap.put("NPR", new C5066a("NPR", "नेरू", null, ",", ".", 2, 1));
        hashMap.put("NZD", new C5066a("NZ$", "$", null, ",", ".", 2, 1));
        hashMap.put("PAB", new C5066a("PAB", "B/.", null, ",", ".", 2, 3));
        hashMap.put("PEN", new C5066a("PEN", "S/.", null, ",", ".", 2, 3));
        hashMap.put("PHP", new C5066a("PHP", "₱", null, ",", ".", 2, 1));
        hashMap.put("PKR", new C5066a("PKR", "₨", null, ",", ".", 2, 1));
        hashMap.put("PLN", new C5066a("PLN", "zł", null, " ", ",", 2, 2));
        hashMap.put("PYG", new C5066a("PYG", "₲", null, ".", ",", 0, 3));
        hashMap.put("QAR", new C5066a("QAR", "ر.ق.\u200f", null, ",", ".", 2, 3));
        hashMap.put("RON", new C5066a("RON", "RON", null, ".", ",", 2, 2));
        hashMap.put("RSD", new C5066a("RSD", "дин.", null, ".", ",", 2, 2));
        hashMap.put("RUB", new C5066a("RUB", "₽", null, " ", ",", 2, 2));
        hashMap.put("SAR", new C5066a("SAR", "ر.س.\u200f", "﷼", ",", ".", 2, 3));
        hashMap.put("SEK", new C5066a("SEK", "kr", null, ".", ",", 2, 2));
        hashMap.put("SGD", new C5066a("SGD", "$", null, ",", ".", 2, 1));
        hashMap.put("THB", new C5066a("฿", "฿", null, ",", ".", 2, 1));
        hashMap.put("TJS", new C5066a("TJS", "TJS", null, " ", ";", 2, 2));
        hashMap.put("TRY", new C5066a("TRY", "TL", null, ".", ",", 2, 2));
        hashMap.put("TTD", new C5066a("TTD", "$", null, ",", ".", 2, 1));
        hashMap.put("TWD", new C5066a("NT$", "NT$", null, ",", ".", 2, 1));
        hashMap.put("TZS", new C5066a("TZS", "TSh", null, ",", ".", 2, 1));
        hashMap.put("UAH", new C5066a("UAH", "₴", null, " ", ",", 2, 0));
        hashMap.put("UGX", new C5066a("UGX", "USh", null, ",", ".", 0, 1));
        hashMap.put("USD", new C5066a("$", "$", null, ",", ".", 2, 1));
        hashMap.put("UYU", new C5066a("UYU", "$", null, ".", ",", 2, 3));
        hashMap.put("UZS", new C5066a("UZS", "UZS", null, " ", ",", 2, 2));
        hashMap.put("VND", new C5066a("₫", "₫", null, ".", ",", 0, 2));
        hashMap.put("YER", new C5066a("YER", "ر.ي.\u200f", "﷼", ",", ".", 2, 3));
        hashMap.put("ZAR", new C5066a("ZAR", "R", null, ",", ".", 2, 3));
        return hashMap;
    }

    public static C5066a m24122c(String str) {
        C5066a aVar;
        return (C5070i.m24062i(str) || (aVar = f17070a.get(str)) == null) ? f17071b : aVar;
    }

    public static String m24121d(String str) {
        if (C5070i.m24062i(str)) {
            return str;
        }
        C5066a c = m24122c(str);
        return C5070i.m24062i(c.f17074c) ? c.f17073b : c.f17074c;
    }
}
