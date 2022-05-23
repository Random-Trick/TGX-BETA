package x4;

import android.text.Layout;
import c5.l0;
import c5.m0;
import c5.s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import q4.e;
import q4.f;
import q4.h;

public final class c extends e {
    public static final Pattern f25993p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f25994q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern f25995r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f25996s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f25997t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern f25998u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern f25999v = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b f26000w = new b(30.0f, 1, 1);
    public static final a f26001x = new a(32, 15);
    public final XmlPullParserFactory f26002o;

    public static final class a {
        public final int f26003a;
        public final int f26004b;

        public a(int i10, int i11) {
            this.f26003a = i10;
            this.f26004b = i11;
        }
    }

    public static final class b {
        public final float f26005a;
        public final int f26006b;
        public final int f26007c;

        public b(float f10, int i10, int i11) {
            this.f26005a = f10;
            this.f26006b = i10;
            this.f26007c = i11;
        }
    }

    public static final class C0242c {
        public final int f26008a;
        public final int f26009b;

        public C0242c(int i10, int i11) {
            this.f26008a = i10;
            this.f26009b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f26002o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static g D(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment F(String str) {
        String c10 = z6.b.c(str);
        c10.hashCode();
        char c11 = 65535;
        switch (c10.hashCode()) {
            case -1364013995:
                if (c10.equals("center")) {
                    c11 = 0;
                    break;
                }
                break;
            case 100571:
                if (c10.equals("end")) {
                    c11 = 1;
                    break;
                }
                break;
            case 3317767:
                if (c10.equals("left")) {
                    c11 = 2;
                    break;
                }
                break;
            case 108511772:
                if (c10.equals("right")) {
                    c11 = 3;
                    break;
                }
                break;
            case 109757538:
                if (c10.equals("start")) {
                    c11 = 4;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static a G(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f25999v.matcher(attributeValue);
        if (!matcher.matches()) {
            s.i("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) c5.a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) c5.a.e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new h(sb2.toString());
        } catch (NumberFormatException unused) {
            s.i("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    public static void H(String str, g gVar) {
        Matcher matcher;
        String[] B0 = l0.B0(str, "\\s+");
        if (B0.length == 1) {
            matcher = f25995r.matcher(str);
        } else if (B0.length == 2) {
            matcher = f25995r.matcher(B0[1]);
            s.i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = B0.length;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Invalid number of entries for fontSize: ");
            sb2.append(length);
            sb2.append(".");
            throw new h(sb2.toString());
        }
        if (matcher.matches()) {
            String str2 = (String) c5.a.e(matcher.group(3));
            str2.hashCode();
            char c10 = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    gVar.z(3);
                    break;
                case 1:
                    gVar.z(2);
                    break;
                case 2:
                    gVar.z(1);
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(str2.length() + 30);
                    sb3.append("Invalid unit for fontSize: '");
                    sb3.append(str2);
                    sb3.append("'.");
                    throw new h(sb3.toString());
            }
            gVar.y(Float.parseFloat((String) c5.a.e(matcher.group(1))));
            return;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 36);
        sb4.append("Invalid expression for fontSize: '");
        sb4.append(str);
        sb4.append("'.");
        throw new h(sb4.toString());
    }

    public static b I(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] B0 = l0.B0(attributeValue2, " ");
            if (B0.length == 2) {
                f10 = Integer.parseInt(B0[0]) / Integer.parseInt(B0[1]);
            } else {
                throw new h("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = f26000w;
        int i10 = bVar.f26006b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f26007c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i10, i11);
    }

    public static Map<String, g> J(XmlPullParser xmlPullParser, Map<String, g> map, a aVar, C0242c cVar, Map<String, e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (m0.e(xmlPullParser, "style")) {
                String a10 = m0.a(xmlPullParser, "style");
                g O = O(xmlPullParser, new g());
                if (a10 != null) {
                    for (String str : P(a10)) {
                        O.a(map.get(str));
                    }
                }
                String g10 = O.g();
                if (g10 != null) {
                    map.put(g10, O);
                }
            } else if (m0.e(xmlPullParser, "region")) {
                e M = M(xmlPullParser, aVar, cVar);
                if (M != null) {
                    map2.put(M.f26023a, M);
                }
            } else if (m0.e(xmlPullParser, "metadata")) {
                K(xmlPullParser, map3);
            }
        } while (!m0.c(xmlPullParser, "head"));
        return map;
    }

    public static void K(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a10;
        do {
            xmlPullParser.next();
            if (m0.e(xmlPullParser, "image") && (a10 = m0.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!m0.c(xmlPullParser, "metadata"));
    }

    public static d L(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) {
        long j10;
        long j11;
        char c10;
        int attributeCount = xmlPullParser.getAttributeCount();
        g O = O(xmlPullParser, null);
        String str = "";
        String str2 = null;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                case 1:
                    j14 = Q(attributeValue, bVar);
                    break;
                case 2:
                    j13 = Q(attributeValue, bVar);
                    break;
                case 3:
                    j12 = Q(attributeValue, bVar);
                    break;
                case 4:
                    String[] P = P(attributeValue);
                    if (P.length > 0) {
                        strArr = P;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str2 = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f26013d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        long j16 = j12;
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j16 + j14;
            } else if (dVar != null) {
                long j17 = dVar.f26014e;
                if (j17 != j10) {
                    j11 = j17;
                }
            }
            return d.c(xmlPullParser.getName(), j16, j11, O, strArr, str, str2, dVar);
        }
        j11 = j13;
        return d.c(xmlPullParser.getName(), j16, j11, O, strArr, str, str2, dVar);
    }

    public static x4.e M(org.xmlpull.v1.XmlPullParser r17, x4.c.a r18, x4.c.C0242c r19) {
        throw new UnsupportedOperationException("Method not decompiled: x4.c.M(org.xmlpull.v1.XmlPullParser, x4.c$a, x4.c$c):x4.e");
    }

    public static float N(String str) {
        Matcher matcher = f25996s.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            s.i("TtmlDecoder", valueOf.length() != 0 ? "Invalid value for shear: ".concat(valueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) c5.a.e(matcher.group(1)))));
        } catch (NumberFormatException e10) {
            String valueOf2 = String.valueOf(str);
            s.j("TtmlDecoder", valueOf2.length() != 0 ? "Failed to parse shear: ".concat(valueOf2) : new String("Failed to parse shear: "), e10);
            return Float.MAX_VALUE;
        }
    }

    public static x4.g O(org.xmlpull.v1.XmlPullParser r12, x4.g r13) {
        throw new UnsupportedOperationException("Method not decompiled: x4.c.O(org.xmlpull.v1.XmlPullParser, x4.g):x4.g");
    }

    public static String[] P(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : l0.B0(trim, "\\s+");
    }

    public static long Q(java.lang.String r13, x4.c.b r14) {
        throw new UnsupportedOperationException("Method not decompiled: x4.c.Q(java.lang.String, x4.c$b):long");
    }

    public static C0242c R(XmlPullParser xmlPullParser) {
        String a10 = m0.a(xmlPullParser, "extent");
        if (a10 == null) {
            return null;
        }
        Matcher matcher = f25998u.matcher(a10);
        if (!matcher.matches()) {
            s.i("TtmlDecoder", a10.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(a10) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new C0242c(Integer.parseInt((String) c5.a.e(matcher.group(1))), Integer.parseInt((String) c5.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            s.i("TtmlDecoder", a10.length() != 0 ? "Ignoring malformed tts extent: ".concat(a10) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override
    public f B(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f26002o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            C0242c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f26000w;
            a aVar = f26001x;
            h hVar = null;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = I(newPullParser);
                            aVar = G(newPullParser, f26001x);
                            cVar = R(newPullParser);
                        }
                        C0242c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!E(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            s.f("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i11++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                J(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    d L = L(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(L);
                                    if (dVar != null) {
                                        dVar.a(L);
                                    }
                                } catch (h e10) {
                                    s.j("TtmlDecoder", "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((d) c5.a.e(dVar)).a(d.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((d) c5.a.e((d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new h("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new h("Unable to decode source", e12);
        }
    }
}
