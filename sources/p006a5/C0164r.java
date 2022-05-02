package p006a5;

import android.content.Context;
import android.os.Handler;
import com.googlecode.mp4parser.boxes.microsoft.XtraBox;
import java.util.HashMap;
import java.util.Map;
import org.thunderdog.challegram.Log;
import p006a5.AbstractC0134e;
import p020b5.AbstractC1192d;
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1242z;
import p039d.C3563j;
import p358z6.AbstractC11396q;
import p358z6.AbstractC11401r;

public final class C0164r implements AbstractC0134e, AbstractC0150i0 {
    public static final AbstractC11396q<Long> f583p = AbstractC11396q.m765G(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final AbstractC11396q<Long> f584q = AbstractC11396q.m765G(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final AbstractC11396q<Long> f585r = AbstractC11396q.m765G(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final AbstractC11396q<Long> f586s = AbstractC11396q.m765G(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final AbstractC11396q<Long> f587t = AbstractC11396q.m765G(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
    public static final AbstractC11396q<Long> f588u = AbstractC11396q.m765G(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    public static C0164r f589v;
    public final AbstractC11401r<Integer, Long> f590a;
    public final AbstractC0134e.AbstractC0135a.C0136a f591b;
    public final C0144g0 f592c;
    public final AbstractC1192d f593d;
    public final boolean f594e;
    public int f595f;
    public long f596g;
    public long f597h;
    public int f598i;
    public long f599j;
    public long f600k;
    public long f601l;
    public long f602m;
    public boolean f603n;
    public int f604o;

    public static final class C0166b {
        public final Context f605a;
        public Map<Integer, Long> f606b;
        public int f607c;
        public AbstractC1192d f608d;
        public boolean f609e;

        public C0166b(Context context) {
            this.f605a = context == null ? null : context.getApplicationContext();
            this.f606b = m42167b(C1216l0.m38009G(context));
            this.f607c = 2000;
            this.f608d = AbstractC1192d.f4481a;
            this.f609e = true;
        }

        public static Map<Integer, Long> m42167b(String str) {
            int[] j = C0164r.m42174j(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            AbstractC11396q<Long> qVar = C0164r.f583p;
            hashMap.put(2, qVar.get(j[0]));
            hashMap.put(3, C0164r.f584q.get(j[1]));
            hashMap.put(4, C0164r.f585r.get(j[2]));
            hashMap.put(5, C0164r.f586s.get(j[3]));
            hashMap.put(10, C0164r.f587t.get(j[4]));
            hashMap.put(9, C0164r.f588u.get(j[5]));
            hashMap.put(7, qVar.get(j[0]));
            return hashMap;
        }

        public C0164r m42168a() {
            return new C0164r(this.f605a, this.f606b, this.f607c, this.f608d, this.f609e);
        }
    }

    public static int[] m42174j(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    c = 0;
                    break;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    c = 1;
                    break;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    c = 2;
                    break;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    c = 3;
                    break;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    c = 4;
                    break;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    c = 5;
                    break;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    c = 6;
                    break;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    c = 7;
                    break;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    c = '\b';
                    break;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    c = '\t';
                    break;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    c = '\n';
                    break;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    c = 11;
                    break;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    c = '\f';
                    break;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    c = '\r';
                    break;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    c = 14;
                    break;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    c = 15;
                    break;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    c = 16;
                    break;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    c = 17;
                    break;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    c = 18;
                    break;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    c = 19;
                    break;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    c = 20;
                    break;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    c = 21;
                    break;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    c = 22;
                    break;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    c = 23;
                    break;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    c = 24;
                    break;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    c = 25;
                    break;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    c = 26;
                    break;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    c = 27;
                    break;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    c = 28;
                    break;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    c = 29;
                    break;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    c = 30;
                    break;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    c = 31;
                    break;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    c = ' ';
                    break;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    c = '!';
                    break;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    c = '\"';
                    break;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    c = '#';
                    break;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    c = '$';
                    break;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    c = '%';
                    break;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    c = '&';
                    break;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    c = '\'';
                    break;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    c = '(';
                    break;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    c = ')';
                    break;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    c = '*';
                    break;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    c = '+';
                    break;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    c = ',';
                    break;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    c = '-';
                    break;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    c = '.';
                    break;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    c = '/';
                    break;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    c = '0';
                    break;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    c = '1';
                    break;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    c = '2';
                    break;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    c = '3';
                    break;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    c = '4';
                    break;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    c = '5';
                    break;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    c = '6';
                    break;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    c = '7';
                    break;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    c = '8';
                    break;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    c = '9';
                    break;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    c = ':';
                    break;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    c = ';';
                    break;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    c = '<';
                    break;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    c = '=';
                    break;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    c = '>';
                    break;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    c = '?';
                    break;
                }
                break;
            case 2222:
                if (str.equals("ES")) {
                    c = '@';
                    break;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    c = 'A';
                    break;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    c = 'B';
                    break;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    c = 'C';
                    break;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    c = 'D';
                    break;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    c = 'E';
                    break;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    c = 'F';
                    break;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    c = 'G';
                    break;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    c = 'H';
                    break;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    c = 'I';
                    break;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    c = 'J';
                    break;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    c = 'K';
                    break;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    c = 'L';
                    break;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    c = 'M';
                    break;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    c = 'N';
                    break;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    c = 'O';
                    break;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    c = 'P';
                    break;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    c = 'Q';
                    break;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    c = 'R';
                    break;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    c = 'S';
                    break;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    c = 'T';
                    break;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    c = 'U';
                    break;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    c = 'V';
                    break;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    c = 'W';
                    break;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    c = 'X';
                    break;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    c = 'Y';
                    break;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    c = 'Z';
                    break;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    c = '[';
                    break;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    c = '\\';
                    break;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    c = ']';
                    break;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    c = '^';
                    break;
                }
                break;
            case 2331:
                if (str.equals("ID")) {
                    c = '_';
                    break;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    c = '`';
                    break;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    c = 'a';
                    break;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    c = 'b';
                    break;
                }
                break;
            case 2341:
                if (str.equals("IN")) {
                    c = 'c';
                    break;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    c = 'd';
                    break;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    c = 'e';
                    break;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    c = 'f';
                    break;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    c = 'g';
                    break;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    c = 'h';
                    break;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    c = 'i';
                    break;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    c = 'j';
                    break;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    c = 'k';
                    break;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    c = 'l';
                    break;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    c = 'm';
                    break;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    c = 'n';
                    break;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    c = 'o';
                    break;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    c = 'p';
                    break;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    c = 'q';
                    break;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    c = 'r';
                    break;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    c = 's';
                    break;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    c = 't';
                    break;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    c = 'u';
                    break;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    c = 'v';
                    break;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    c = 'w';
                    break;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    c = 'x';
                    break;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    c = 'y';
                    break;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    c = 'z';
                    break;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    c = '{';
                    break;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    c = '|';
                    break;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    c = '}';
                    break;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    c = '~';
                    break;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    c = 127;
                    break;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    c = 128;
                    break;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    c = 129;
                    break;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    c = 130;
                    break;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    c = 131;
                    break;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    c = 132;
                    break;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    c = 133;
                    break;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    c = 134;
                    break;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    c = 135;
                    break;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    c = 136;
                    break;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    c = 137;
                    break;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    c = 138;
                    break;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    c = 139;
                    break;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    c = 140;
                    break;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    c = 141;
                    break;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    c = 142;
                    break;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    c = 143;
                    break;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    c = 144;
                    break;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    c = 145;
                    break;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    c = 146;
                    break;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    c = 147;
                    break;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    c = 148;
                    break;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    c = 149;
                    break;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    c = 150;
                    break;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    c = 151;
                    break;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    c = 152;
                    break;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    c = 153;
                    break;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    c = 154;
                    break;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    c = 155;
                    break;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    c = 156;
                    break;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    c = 157;
                    break;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    c = 158;
                    break;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    c = 159;
                    break;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    c = 160;
                    break;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    c = 161;
                    break;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    c = 162;
                    break;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    c = 163;
                    break;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    c = 164;
                    break;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    c = 165;
                    break;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    c = 166;
                    break;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    c = 167;
                    break;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    c = 168;
                    break;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    c = 169;
                    break;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    c = 170;
                    break;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    c = 171;
                    break;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    c = 172;
                    break;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    c = 173;
                    break;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    c = 174;
                    break;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    c = 175;
                    break;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    c = 176;
                    break;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    c = 177;
                    break;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    c = 178;
                    break;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    c = 179;
                    break;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    c = 180;
                    break;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    c = 181;
                    break;
                }
                break;
            case 2627:
                if (str.equals("RU")) {
                    c = 182;
                    break;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    c = 183;
                    break;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    c = 184;
                    break;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    c = 185;
                    break;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    c = 186;
                    break;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    c = 187;
                    break;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    c = 188;
                    break;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    c = 189;
                    break;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    c = 190;
                    break;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    c = 191;
                    break;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    c = 192;
                    break;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    c = 193;
                    break;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    c = 194;
                    break;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    c = 195;
                    break;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    c = 196;
                    break;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    c = 197;
                    break;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    c = 198;
                    break;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    c = 199;
                    break;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    c = 200;
                    break;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    c = 201;
                    break;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    c = 202;
                    break;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    c = 203;
                    break;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    c = 204;
                    break;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    c = 205;
                    break;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    c = 206;
                    break;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    c = 207;
                    break;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    c = 208;
                    break;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    c = 209;
                    break;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    c = 210;
                    break;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    c = 211;
                    break;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    c = 212;
                    break;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    c = 213;
                    break;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    c = 214;
                    break;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    c = 215;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c = 216;
                    break;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    c = 217;
                    break;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    c = 218;
                    break;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    c = 219;
                    break;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    c = 220;
                    break;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    c = 221;
                    break;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    c = 222;
                    break;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    c = 223;
                    break;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    c = 224;
                    break;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    c = 225;
                    break;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    c = 226;
                    break;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    c = 227;
                    break;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    c = 228;
                    break;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    c = 229;
                    break;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    c = 230;
                    break;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    c = 231;
                    break;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    c = 232;
                    break;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    c = 233;
                    break;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    c = 234;
                    break;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    c = 235;
                    break;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    c = 236;
                    break;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    c = 237;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 26:
            case 'P':
            case C3563j.f11962M0:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 3, 2};
            case 2:
            case ']':
            case 155:
            case 187:
            case 196:
            case 206:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 3:
                return new int[]{2, 3, 1, 2, 2, 2};
            case 4:
            case 25:
            case '3':
            case '9':
            case 'J':
            case 145:
            case 224:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 5:
            case 16:
            case C3563j.f11942I0:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 4, 2, 2};
            case 7:
            case ',':
                return new int[]{3, 4, 3, 2, 2, 2};
            case '\b':
            case '?':
            case 'd':
            case 162:
            case 190:
            case 199:
            case 216:
                return new int[]{4, 2, 2, 2, 2, 2};
            case '\t':
                return new int[]{2, 4, 1, 1, 2, 2};
            case '\n':
                return new int[]{2, 2, 2, 3, 2, 2};
            case 11:
            case '(':
            case 'g':
            case 188:
            case 193:
                return new int[]{0, 0, 0, 0, 0, 2};
            case '\f':
                return new int[]{0, 1, 0, 1, 2, 2};
            case '\r':
            case 'W':
                return new int[]{1, 2, 4, 4, 2, 2};
            case 14:
            case 'O':
            case C3563j.f11967N0:
            case 142:
            case 172:
            case 192:
            case 195:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 154:
                return new int[]{3, 2, 4, 4, 2, 2};
            case 17:
            case 'F':
            case 'M':
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
            case 151:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 0, 3, 3, 2, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case '5':
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 2, 4, 4, 2};
            case 23:
            case ';':
            case 203:
            case 210:
                return new int[]{4, 3, 4, 4, 2, 2};
            case C3563j.f11955K3:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 27:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 28:
                return new int[]{1, 3, 3, 2, 2, 2};
            case C3563j.f11980P3:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 30:
            case 198:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 31:
                return new int[]{4, 2, 2, 3, 2, 2};
            case Log.TAG_IMAGE_LOADER:
                return new int[]{3, 1, 3, 2, 2, 2};
            case '!':
            case 'Y':
                return new int[]{3, 4, 1, 0, 2, 2};
            case '\"':
                return new int[]{0, 1, 1, 3, 2, 2};
            case '#':
                return new int[]{2, 4, 2, 2, 2, 2};
            case '$':
                return new int[]{0, 2, 1, 2, 4, 1};
            case '%':
                return new int[]{4, 2, 3, 1, 2, 2};
            case '&':
                return new int[]{4, 2, 3, 2, 2, 2};
            case '\'':
            case 150:
                return new int[]{2, 4, 3, 4, 2, 2};
            case ')':
                return new int[]{3, 3, 3, 4, 2, 2};
            case '*':
                return new int[]{2, 2, 2, 1, 2, 2};
            case '+':
            case 171:
            case 221:
                return new int[]{1, 1, 2, 2, 3, 2};
            case '-':
                return new int[]{2, 0, 2, 2, 3, 1};
            case '.':
                return new int[]{2, 2, 4, 2, 2, 2};
            case '/':
                return new int[]{2, 2, 4, 4, 2, 2};
            case '0':
            case 168:
                return new int[]{4, 4, 3, 2, 2, 2};
            case '1':
                return new int[]{2, 3, 1, 0, 2, 2};
            case '2':
                return new int[]{2, 2, 0, 0, 2, 2};
            case '4':
                return new int[]{1, 0, 0, 0, 1, 2};
            case '6':
                return new int[]{0, 0, 2, 2, 1, 2};
            case '7':
                return new int[]{4, 1, 4, 4, 2, 2};
            case '8':
                return new int[]{0, 0, 1, 0, 0, 2};
            case ':':
            case 'j':
                return new int[]{3, 4, 4, 4, 2, 2};
            case '<':
                return new int[]{2, 4, 2, 1, 2, 2};
            case '=':
            case '~':
            case Log.TAG_YOUTUBE:
            case 146:
                return new int[]{0, 0, 0, 0, 2, 2};
            case '>':
                return new int[]{3, 4, 2, 3, 2, 2};
            case Log.TAG_SPEED_TEXT:
            case '`':
                return new int[]{0, 1, 1, 1, 2, 2};
            case 'A':
                return new int[]{4, 4, 3, 1, 2, 2};
            case 'B':
                return new int[]{0, 0, 0, 1, 0, 2};
            case 'C':
                return new int[]{3, 1, 3, 3, 2, 2};
            case 'D':
            case C3563j.f11927F0:
            case 130:
            case 152:
            case 200:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 'E':
                return new int[]{3, 2, 4, 2, 2, 2};
            case 'G':
                return new int[]{1, 1, 2, 1, 1, 1};
            case XtraBox.MP4_XTRA_BT_GUID:
                return new int[]{2, 3, 1, 1, 2, 2};
            case 'I':
                return new int[]{0, 0, 1, 1, 2, 3};
            case 'K':
                return new int[]{1, 1, 1, 3, 2, 2};
            case 'L':
            case 'S':
            case 143:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 'N':
                return new int[]{3, 2, 3, 2, 2, 2};
            case 'Q':
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 'R':
                return new int[]{4, 3, 4, 2, 2, 2};
            case C3563j.f11922E0:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 'U':
            case '\\':
            case 132:
            case 137:
            case 181:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 'V':
                return new int[]{2, 3, 2, 1, 2, 2};
            case 'X':
            case 218:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 'Z':
                return new int[]{0, 1, 2, 3, 2, 0};
            case '[':
            case 170:
            case 197:
                return new int[]{3, 2, 3, 3, 2, 2};
            case '^':
                return new int[]{0, 0, 0, 1, 3, 2};
            case '_':
                return new int[]{3, 2, 3, 3, 3, 2};
            case 'a':
                return new int[]{1, 1, 2, 3, 4, 2};
            case 'b':
                return new int[]{0, 2, 0, 1, 2, 2};
            case 'c':
                return new int[]{1, 1, 3, 2, 4, 3};
            case 'e':
            case 220:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 'f':
                return new int[]{3, 0, 1, 1, 3, 0};
            case 'h':
                return new int[]{0, 1, 0, 1, 1, 2};
            case 'i':
                return new int[]{3, 2, 1, 2, 2, 2};
            case 'k':
            case 133:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 'l':
                return new int[]{0, 1, 0, 1, 1, 1};
            case 'm':
                return new int[]{3, 3, 2, 2, 2, 2};
            case 'n':
                return new int[]{2, 1, 1, 1, 2, 2};
            case 'o':
                return new int[]{1, 1, 4, 2, 2, 2};
            case 'p':
            case 'q':
            case 129:
            case 185:
                return new int[]{4, 2, 4, 3, 2, 2};
            case C3563j.f11932G0:
                return new int[]{0, 0, 1, 3, 4, 4};
            case C3563j.f11937H0:
                return new int[]{1, 1, 0, 0, 0, 2};
            case C3563j.f11947J0:
                return new int[]{1, 1, 2, 2, 2, 2};
            case C3563j.f11952K0:
            case 222:
                return new int[]{2, 2, 1, 2, 2, 2};
            case C3563j.f11957L0:
                return new int[]{3, 2, 1, 4, 2, 2};
            case C3563j.f11972O0:
                return new int[]{3, 1, 3, 4, 4, 2};
            case C3563j.f11977P0:
                return new int[]{3, 4, 4, 3, 2, 2};
            case '}':
                return new int[]{3, 3, 4, 3, 2, 2};
            case 127:
                return new int[]{1, 0, 2, 2, 2, 2};
            case 131:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 134:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 135:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 136:
                return new int[]{3, 2, 2, 4, 2, 2};
            case 138:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 139:
                return new int[]{2, 4, 3, 3, 2, 2};
            case 140:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 144:
                return new int[]{4, 1, 3, 4, 2, 2};
            case 147:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 148:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 149:
                return new int[]{4, 2, 1, 0, 2, 2};
            case 153:
                return new int[]{4, 3, 2, 2, 2, 2};
            case 156:
                return new int[]{3, 4, 1, 1, 2, 2};
            case 157:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 158:
                return new int[]{0, 0, 3, 2, 0, 4};
            case 159:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 160:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 161:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 163:
                return new int[]{1, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 165:
                return new int[]{1, 3, 3, 3, 2, 2};
            case 166:
                return new int[]{2, 3, 4, 4, 4, 2};
            case 167:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 2, 3, 3, 3, 2};
            case 173:
                return new int[]{2, 3, 2, 2, 3, 3};
            case 174:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{0, 1, 0, 0, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 177:
                return new int[]{2, 2, 3, 2, 2, 2};
            case 178:
                return new int[]{2, 4, 2, 4, 4, 2};
            case 179:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 182:
                return new int[]{0, 0, 0, 1, 2, 2};
            case 183:
                return new int[]{3, 4, 3, 0, 2, 2};
            case 184:
            case 212:
            case 226:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 186:
                return new int[]{4, 3, 0, 2, 2, 2};
            case 189:
                return new int[]{1, 1, 2, 3, 1, 4};
            case 194:
                return new int[]{4, 3, 4, 1, 2, 2};
            case 201:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 202:
            case 205:
                return new int[]{2, 2, 1, 0, 2, 2};
            case 204:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 207:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 208:
                return new int[]{0, 3, 2, 3, 3, 0};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 213:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 214:
                return new int[]{1, 1, 0, 1, 2, 2};
            case 215:
                return new int[]{1, 4, 1, 1, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 219:
                return new int[]{0, 3, 1, 1, 2, 2};
            case 223:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 227:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 228:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 229:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 232:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 234:
                return new int[]{4, 1, 1, 1, 2, 2};
            case 235:
                return new int[]{3, 3, 1, 1, 1, 2};
            case 236:
                return new int[]{3, 3, 4, 2, 2, 2};
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    public static synchronized C0164r m42172l(Context context) {
        C0164r rVar;
        synchronized (C0164r.class) {
            if (f589v == null) {
                f589v = new C0166b(context).m42168a();
            }
            rVar = f589v;
        }
        return rVar;
    }

    public static boolean m42171m(C0159o oVar, boolean z) {
        return z && !oVar.m42201d(8);
    }

    @Override
    public void mo42183a(Handler handler, AbstractC0134e.AbstractC0135a aVar) {
        C1186a.m38185e(handler);
        C1186a.m38185e(aVar);
        this.f591b.m42233b(handler, aVar);
    }

    @Override
    public synchronized void mo42182b(AbstractC0154k kVar, C0159o oVar, boolean z, int i) {
        if (m42171m(oVar, z)) {
            this.f597h += i;
        }
    }

    @Override
    public synchronized void mo42181c(AbstractC0154k kVar, C0159o oVar, boolean z) {
        if (m42171m(oVar, z)) {
            if (this.f595f == 0) {
                this.f596g = this.f593d.mo38081d();
            }
            this.f595f++;
        }
    }

    @Override
    public synchronized void mo42180d(AbstractC0154k kVar, C0159o oVar, boolean z) {
        if (m42171m(oVar, z)) {
            C1186a.m38184f(this.f595f > 0);
            long d = this.f593d.mo38081d();
            int i = (int) (d - this.f596g);
            this.f599j += i;
            long j = this.f600k;
            long j2 = this.f597h;
            this.f600k = j + j2;
            if (i > 0) {
                this.f592c.m42218c((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                if (this.f599j >= 2000 || this.f600k >= 524288) {
                    this.f601l = this.f592c.m42215f(0.5f);
                }
                m42170n(i, this.f597h, this.f601l);
                this.f596g = d;
                this.f597h = 0L;
            }
            this.f595f--;
        }
    }

    @Override
    public AbstractC0150i0 mo42179e() {
        return this;
    }

    @Override
    public void mo42178f(AbstractC0154k kVar, C0159o oVar, boolean z) {
    }

    @Override
    public void mo42177g(AbstractC0134e.AbstractC0135a aVar) {
        this.f591b.m42230e(aVar);
    }

    public final long m42173k(int i) {
        Long l = this.f590a.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f590a.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void m42170n(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f602m) {
            this.f602m = j2;
            this.f591b.m42232c(i, j, j2);
        }
    }

    public final synchronized void m42169o(int i) {
        int i2 = this.f598i;
        if (i2 == 0 || this.f594e) {
            if (this.f603n) {
                i = this.f604o;
            }
            if (i2 != i) {
                this.f598i = i;
                if (!(i == 1 || i == 0 || i == 8)) {
                    this.f601l = m42173k(i);
                    long d = this.f593d.mo38081d();
                    m42170n(this.f595f > 0 ? (int) (d - this.f596g) : 0, this.f597h, this.f601l);
                    this.f596g = d;
                    this.f597h = 0L;
                    this.f600k = 0L;
                    this.f599j = 0L;
                    this.f592c.m42212i();
                }
            }
        }
    }

    public C0164r(Context context, Map<Integer, Long> map, int i, AbstractC1192d dVar, boolean z) {
        this.f590a = AbstractC11401r.m747c(map);
        this.f591b = new AbstractC0134e.AbstractC0135a.C0136a();
        this.f592c = new C0144g0(i);
        this.f593d = dVar;
        this.f594e = z;
        if (context != null) {
            C1242z d = C1242z.m37835d(context);
            int f = d.m37833f();
            this.f598i = f;
            this.f601l = m42173k(f);
            d.m37830i(new C1242z.AbstractC1245c() {
                @Override
                public final void mo37826a(int i2) {
                    C0164r.this.m42169o(i2);
                }
            });
            return;
        }
        this.f598i = 0;
        this.f601l = m42173k(0);
    }
}
