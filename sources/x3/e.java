package x3;

import a7.q;
import c5.m0;
import c5.s;
import java.io.StringReader;
import m3.k2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import x3.b;

public final class e {
    public static final String[] f25982a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f25983b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] f25984c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static b a(String str) {
        try {
            return b(str);
        } catch (NumberFormatException | k2 | XmlPullParserException unused) {
            s.i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static b b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (m0.e(newPullParser, "x:xmpmeta")) {
            long j10 = -9223372036854775807L;
            q<b.a> D = q.D();
            do {
                newPullParser.next();
                if (m0.e(newPullParser, "rdf:Description")) {
                    if (!d(newPullParser)) {
                        return null;
                    }
                    j10 = e(newPullParser);
                    D = c(newPullParser);
                } else if (m0.e(newPullParser, "Container:Directory")) {
                    D = f(newPullParser, "Container", "Item");
                } else if (m0.e(newPullParser, "GContainer:Directory")) {
                    D = f(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!m0.c(newPullParser, "x:xmpmeta"));
            if (D.isEmpty()) {
                return null;
            }
            return new b(j10, D);
        }
        throw k2.a("Couldn't find xmp metadata", null);
    }

    public static q<b.a> c(XmlPullParser xmlPullParser) {
        for (String str : f25984c) {
            String a10 = m0.a(xmlPullParser, str);
            if (a10 != null) {
                return q.F(new b.a("image/jpeg", "Primary", 0L, 0L), new b.a("video/mp4", "MotionPhoto", Long.parseLong(a10), 0L));
            }
        }
        return q.D();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f25982a) {
            String a10 = m0.a(xmlPullParser, str);
            if (a10 != null) {
                return Integer.parseInt(a10) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : f25983b) {
            String a10 = m0.a(xmlPullParser, str);
            if (a10 != null) {
                long parseLong = Long.parseLong(a10);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    public static q<b.a> f(XmlPullParser xmlPullParser, String str, String str2) {
        q.a x10 = q.x();
        String concat = String.valueOf(str).concat(":Item");
        String concat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (m0.e(xmlPullParser, concat)) {
                String concat3 = String.valueOf(str2).concat(":Mime");
                String concat4 = String.valueOf(str2).concat(":Semantic");
                String concat5 = String.valueOf(str2).concat(":Length");
                String concat6 = String.valueOf(str2).concat(":Padding");
                String a10 = m0.a(xmlPullParser, concat3);
                String a11 = m0.a(xmlPullParser, concat4);
                String a12 = m0.a(xmlPullParser, concat5);
                String a13 = m0.a(xmlPullParser, concat6);
                if (a10 == null || a11 == null) {
                    return q.D();
                }
                x10.a(new b.a(a10, a11, a12 != null ? Long.parseLong(a12) : 0L, a13 != null ? Long.parseLong(a13) : 0L));
            }
        } while (!m0.c(xmlPullParser, concat2));
        return x10.h();
    }
}
