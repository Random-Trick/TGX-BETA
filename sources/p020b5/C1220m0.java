package p020b5;

import org.xmlpull.v1.XmlPullParser;

public final class C1220m0 {
    public static String m37925a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean m37924b(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    public static boolean m37923c(XmlPullParser xmlPullParser, String str) {
        return m37924b(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static boolean m37922d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean m37921e(XmlPullParser xmlPullParser, String str) {
        return m37922d(xmlPullParser) && xmlPullParser.getName().equals(str);
    }
}
