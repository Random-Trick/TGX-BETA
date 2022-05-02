package p325x3;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p020b5.C1220m0;
import p020b5.C1230s;
import p174m3.C6556a2;
import p325x3.C10089b;
import p358z6.AbstractC11396q;

public final class C10094e {
    public static final String[] f32786a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f32787b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f32788c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static C10089b m6038a(String str) {
        try {
            return m6037b(str);
        } catch (NumberFormatException | C6556a2 | XmlPullParserException unused) {
            C1230s.m37884i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static C10089b m6037b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (C1220m0.m37921e(newPullParser, "x:xmpmeta")) {
            long j = -9223372036854775807L;
            AbstractC11396q<C10089b.C10090a> D = AbstractC11396q.m768D();
            do {
                newPullParser.next();
                if (C1220m0.m37921e(newPullParser, "rdf:Description")) {
                    if (!m6035d(newPullParser)) {
                        return null;
                    }
                    j = m6034e(newPullParser);
                    D = m6036c(newPullParser);
                } else if (C1220m0.m37921e(newPullParser, "Container:Directory")) {
                    D = m6033f(newPullParser, "Container", "Item");
                } else if (C1220m0.m37921e(newPullParser, "GContainer:Directory")) {
                    D = m6033f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!C1220m0.m37923c(newPullParser, "x:xmpmeta"));
            if (D.isEmpty()) {
                return null;
            }
            return new C10089b(j, D);
        }
        throw C6556a2.m20113a("Couldn't find xmp metadata", null);
    }

    public static AbstractC11396q<C10089b.C10090a> m6036c(XmlPullParser xmlPullParser) {
        for (String str : f32788c) {
            String a = C1220m0.m37925a(xmlPullParser, str);
            if (a != null) {
                return AbstractC11396q.m766F(new C10089b.C10090a("image/jpeg", "Primary", 0L, 0L), new C10089b.C10090a("video/mp4", "MotionPhoto", Long.parseLong(a), 0L));
            }
        }
        return AbstractC11396q.m768D();
    }

    public static boolean m6035d(XmlPullParser xmlPullParser) {
        for (String str : f32786a) {
            String a = C1220m0.m37925a(xmlPullParser, str);
            if (a != null) {
                return Integer.parseInt(a) == 1;
            }
        }
        return false;
    }

    public static long m6034e(XmlPullParser xmlPullParser) {
        for (String str : f32787b) {
            String a = C1220m0.m37925a(xmlPullParser, str);
            if (a != null) {
                long parseLong = Long.parseLong(a);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    public static AbstractC11396q<C10089b.C10090a> m6033f(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC11396q.C11397a x = AbstractC11396q.m760x();
        String concat = String.valueOf(str).concat(":Item");
        String concat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (C1220m0.m37921e(xmlPullParser, concat)) {
                String concat3 = String.valueOf(str2).concat(":Mime");
                String concat4 = String.valueOf(str2).concat(":Semantic");
                String concat5 = String.valueOf(str2).concat(":Length");
                String concat6 = String.valueOf(str2).concat(":Padding");
                String a = C1220m0.m37925a(xmlPullParser, concat3);
                String a2 = C1220m0.m37925a(xmlPullParser, concat4);
                String a3 = C1220m0.m37925a(xmlPullParser, concat5);
                String a4 = C1220m0.m37925a(xmlPullParser, concat6);
                if (a == null || a2 == null) {
                    return AbstractC11396q.m768D();
                }
                x.m757d(new C10089b.C10090a(a, a2, a3 != null ? Long.parseLong(a3) : 0L, a4 != null ? Long.parseLong(a4) : 0L));
            }
        } while (!C1220m0.m37923c(xmlPullParser, concat2));
        return x.m756e();
    }
}
