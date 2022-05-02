package p311w4;

import android.text.Layout;
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
import p020b5.C1186a;
import p020b5.C1216l0;
import p020b5.C1220m0;
import p020b5.C1230s;
import p217p4.AbstractC8039e;
import p217p4.AbstractC8041f;
import p217p4.C8043h;
import p343y6.C10422b;

public final class C9970c extends AbstractC8039e {
    public static final Pattern f32401p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern f32402q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern f32403r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern f32404s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f32405t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern f32406u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern f32407v = Pattern.compile("^(\\d+) (\\d+)$");
    public static final C9972b f32408w = new C9972b(30.0f, 1, 1);
    public static final C9971a f32409x = new C9971a(32, 15);
    public final XmlPullParserFactory f32410o;

    public static final class C9971a {
        public final int f32411a;
        public final int f32412b;

        public C9971a(int i, int i2) {
            this.f32411a = i;
            this.f32412b = i2;
        }
    }

    public static final class C9972b {
        public final float f32413a;
        public final int f32414b;
        public final int f32415c;

        public C9972b(float f, int i, int i2) {
            this.f32413a = f;
            this.f32414b = i;
            this.f32415c = i2;
        }
    }

    public static final class C9973c {
        public final int f32416a;
        public final int f32417b;

        public C9973c(int i, int i2) {
            this.f32416a = i;
            this.f32417b = i2;
        }
    }

    public C9970c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f32410o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static C9977g m6386D(C9977g gVar) {
        return gVar == null ? new C9977g() : gVar;
    }

    public static boolean m6385E(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment m6384F(String str) {
        String c = C10422b.m5149c(str);
        c.hashCode();
        char c2 = 65535;
        switch (c.hashCode()) {
            case -1364013995:
                if (c.equals("center")) {
                    c2 = 0;
                    break;
                }
                break;
            case 100571:
                if (c.equals("end")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3317767:
                if (c.equals("left")) {
                    c2 = 2;
                    break;
                }
                break;
            case 108511772:
                if (c.equals("right")) {
                    c2 = 3;
                    break;
                }
                break;
            case 109757538:
                if (c.equals("start")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
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

    public static C9971a m6383G(XmlPullParser xmlPullParser, C9971a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f32407v.matcher(attributeValue);
        if (!matcher.matches()) {
            C1230s.m37884i("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) C1186a.m38188e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C1186a.m38188e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C9971a(parseInt, parseInt2);
            }
            StringBuilder sb2 = new StringBuilder(47);
            sb2.append("Invalid cell resolution ");
            sb2.append(parseInt);
            sb2.append(" ");
            sb2.append(parseInt2);
            throw new C8043h(sb2.toString());
        } catch (NumberFormatException unused) {
            C1230s.m37884i("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    public static void m6382H(String str, C9977g gVar) {
        Matcher matcher;
        String[] A0 = C1216l0.m38023A0(str, "\\s+");
        if (A0.length == 1) {
            matcher = f32403r.matcher(str);
        } else if (A0.length == 2) {
            matcher = f32403r.matcher(A0[1]);
            C1230s.m37884i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            int length = A0.length;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Invalid number of entries for fontSize: ");
            sb2.append(length);
            sb2.append(".");
            throw new C8043h(sb2.toString());
        }
        if (matcher.matches()) {
            String str2 = (String) C1186a.m38188e(matcher.group(3));
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    gVar.m6313z(3);
                    break;
                case 1:
                    gVar.m6313z(2);
                    break;
                case 2:
                    gVar.m6313z(1);
                    break;
                default:
                    StringBuilder sb3 = new StringBuilder(str2.length() + 30);
                    sb3.append("Invalid unit for fontSize: '");
                    sb3.append(str2);
                    sb3.append("'.");
                    throw new C8043h(sb3.toString());
            }
            gVar.m6314y(Float.parseFloat((String) C1186a.m38188e(matcher.group(1))));
            return;
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 36);
        sb4.append("Invalid expression for fontSize: '");
        sb4.append(str);
        sb4.append("'.");
        throw new C8043h(sb4.toString());
    }

    public static C9972b m6381I(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] A0 = C1216l0.m38023A0(attributeValue2, " ");
            if (A0.length == 2) {
                f = Integer.parseInt(A0[0]) / Integer.parseInt(A0[1]);
            } else {
                throw new C8043h("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C9972b bVar = f32408w;
        int i = bVar.f32414b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = bVar.f32415c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C9972b(parseInt * f, i, i2);
    }

    public static Map<String, C9977g> m6380J(XmlPullParser xmlPullParser, Map<String, C9977g> map, C9971a aVar, C9973c cVar, Map<String, C9975e> map2, Map<String, String> map3) {
        do {
            xmlPullParser.next();
            if (C1220m0.m37921e(xmlPullParser, "style")) {
                String a = C1220m0.m37925a(xmlPullParser, "style");
                C9977g O = m6375O(xmlPullParser, new C9977g());
                if (a != null) {
                    for (String str : m6374P(a)) {
                        O.m6338a(map.get(str));
                    }
                }
                String g = O.m6332g();
                if (g != null) {
                    map.put(g, O);
                }
            } else if (C1220m0.m37921e(xmlPullParser, "region")) {
                C9975e M = m6377M(xmlPullParser, aVar, cVar);
                if (M != null) {
                    map2.put(M.f32431a, M);
                }
            } else if (C1220m0.m37921e(xmlPullParser, "metadata")) {
                m6379K(xmlPullParser, map3);
            }
        } while (!C1220m0.m37923c(xmlPullParser, "head"));
        return map;
    }

    public static void m6379K(XmlPullParser xmlPullParser, Map<String, String> map) {
        String a;
        do {
            xmlPullParser.next();
            if (C1220m0.m37921e(xmlPullParser, "image") && (a = C1220m0.m37925a(xmlPullParser, "id")) != null) {
                map.put(a, xmlPullParser.nextText());
            }
        } while (!C1220m0.m37923c(xmlPullParser, "metadata"));
    }

    public static C9974d m6378L(XmlPullParser xmlPullParser, C9974d dVar, Map<String, C9975e> map, C9972b bVar) {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        C9977g O = m6375O(xmlPullParser, null);
        String str = "";
        String str2 = null;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        String[] strArr = null;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (map.containsKey(attributeValue)) {
                        str = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = m6373Q(attributeValue, bVar);
                    break;
                case 2:
                    j4 = m6373Q(attributeValue, bVar);
                    break;
                case 3:
                    j3 = m6373Q(attributeValue, bVar);
                    break;
                case 4:
                    String[] P = m6374P(attributeValue);
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
            long j6 = dVar.f32421d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (dVar != null) {
                long j8 = dVar.f32422e;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return C9974d.m6369c(xmlPullParser.getName(), j7, j2, O, strArr, str, str2, dVar);
        }
        j2 = j4;
        return C9974d.m6369c(xmlPullParser.getName(), j7, j2, O, strArr, str, str2, dVar);
    }

    public static p311w4.C9975e m6377M(org.xmlpull.v1.XmlPullParser r17, p311w4.C9970c.C9971a r18, p311w4.C9970c.C9973c r19) {
        throw new UnsupportedOperationException("Method not decompiled: p311w4.C9970c.m6377M(org.xmlpull.v1.XmlPullParser, w4.c$a, w4.c$c):w4.e");
    }

    public static float m6376N(String str) {
        Matcher matcher = f32404s.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            C1230s.m37884i("TtmlDecoder", valueOf.length() != 0 ? "Invalid value for shear: ".concat(valueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C1186a.m38188e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            String valueOf2 = String.valueOf(str);
            C1230s.m37883j("TtmlDecoder", valueOf2.length() != 0 ? "Failed to parse shear: ".concat(valueOf2) : new String("Failed to parse shear: "), e);
            return Float.MAX_VALUE;
        }
    }

    public static p311w4.C9977g m6375O(org.xmlpull.v1.XmlPullParser r12, p311w4.C9977g r13) {
        throw new UnsupportedOperationException("Method not decompiled: p311w4.C9970c.m6375O(org.xmlpull.v1.XmlPullParser, w4.g):w4.g");
    }

    public static String[] m6374P(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C1216l0.m38023A0(trim, "\\s+");
    }

    public static long m6373Q(java.lang.String r13, p311w4.C9970c.C9972b r14) {
        throw new UnsupportedOperationException("Method not decompiled: p311w4.C9970c.m6373Q(java.lang.String, w4.c$b):long");
    }

    public static C9973c m6372R(XmlPullParser xmlPullParser) {
        String a = C1220m0.m37925a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f32406u.matcher(a);
        if (!matcher.matches()) {
            C1230s.m37884i("TtmlDecoder", a.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(a) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new C9973c(Integer.parseInt((String) C1186a.m38188e(matcher.group(1))), Integer.parseInt((String) C1186a.m38188e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            C1230s.m37884i("TtmlDecoder", a.length() != 0 ? "Ignoring malformed tts extent: ".concat(a) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override
    public AbstractC8041f mo5207B(byte[] bArr, int i, boolean z) {
        C9972b bVar;
        try {
            XmlPullParser newPullParser = this.f32410o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C9975e(""));
            C9973c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C9972b bVar2 = f32408w;
            C9971a aVar = f32409x;
            C9978h hVar = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C9974d dVar = (C9974d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m6381I(newPullParser);
                            aVar = m6383G(newPullParser, f32409x);
                            cVar = m6372R(newPullParser);
                        }
                        C9973c cVar2 = cVar;
                        C9972b bVar3 = bVar2;
                        C9971a aVar2 = aVar;
                        if (!m6385E(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            C1230s.m37887f("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i2++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                m6380J(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    C9974d L = m6378L(newPullParser, dVar, hashMap2, bVar);
                                    arrayDeque.push(L);
                                    if (dVar != null) {
                                        dVar.m6371a(L);
                                    }
                                } catch (C8043h e) {
                                    C1230s.m37883j("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((C9974d) C1186a.m38188e(dVar)).m6371a(C9974d.m6368d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new C9978h((C9974d) C1186a.m38188e((C9974d) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (hVar != null) {
                return hVar;
            }
            throw new C8043h("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new C8043h("Unable to decode source", e3);
        }
    }
}
