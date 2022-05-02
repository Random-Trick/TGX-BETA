package p256s0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p196o0.C7525d;
import p352z0.C11209d;

public class C8606e {

    public interface AbstractC8607a {
    }

    public static final class C8608b implements AbstractC8607a {
        public final C8609c[] f27892a;

        public C8608b(C8609c[] cVarArr) {
            this.f27892a = cVarArr;
        }

        public C8609c[] m11939a() {
            return this.f27892a;
        }
    }

    public static final class C8609c {
        public final String f27893a;
        public int f27894b;
        public boolean f27895c;
        public String f27896d;
        public int f27897e;
        public int f27898f;

        public C8609c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f27893a = str;
            this.f27894b = i;
            this.f27895c = z;
            this.f27896d = str2;
            this.f27897e = i2;
            this.f27898f = i3;
        }

        public String m11938a() {
            return this.f27893a;
        }

        public int m11937b() {
            return this.f27898f;
        }

        public int m11936c() {
            return this.f27897e;
        }

        public String m11935d() {
            return this.f27896d;
        }

        public int m11934e() {
            return this.f27894b;
        }

        public boolean m11933f() {
            return this.f27895c;
        }
    }

    public static final class C8610d implements AbstractC8607a {
        public final C11209d f27899a;
        public final int f27900b;
        public final int f27901c;
        public final String f27902d;

        public C8610d(C11209d dVar, int i, int i2, String str) {
            this.f27899a = dVar;
            this.f27901c = i;
            this.f27900b = i2;
            this.f27902d = str;
        }

        public int m11932a() {
            return this.f27901c;
        }

        public C11209d m11931b() {
            return this.f27899a;
        }

        public String m11930c() {
            return this.f27902d;
        }

        public int m11929d() {
            return this.f27900b;
        }
    }

    public static int m11947a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static AbstractC8607a m11946b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m11944d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> m11945c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m11947a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m11940h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m11940h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static AbstractC8607a m11944d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m11943e(xmlPullParser, resources);
        }
        m11941g(xmlPullParser);
        return null;
    }

    public static AbstractC8607a m11943e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7525d.f24081h);
        String string = obtainAttributes.getString(C7525d.f24082i);
        String string2 = obtainAttributes.getString(C7525d.f24086m);
        String string3 = obtainAttributes.getString(C7525d.f24087n);
        int resourceId = obtainAttributes.getResourceId(C7525d.f24083j, 0);
        int integer = obtainAttributes.getInteger(C7525d.f24084k, 1);
        int integer2 = obtainAttributes.getInteger(C7525d.f24085l, 500);
        String string4 = obtainAttributes.getString(C7525d.f24088o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m11942f(xmlPullParser, resources));
                    } else {
                        m11941g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C8608b((C8609c[]) arrayList.toArray(new C8609c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m11941g(xmlPullParser);
        }
        return new C8610d(new C11209d(string, string2, string3, m11945c(resources, resourceId)), integer, integer2, string4);
    }

    public static C8609c m11942f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7525d.f24089p);
        int i = C7525d.f24098y;
        if (!obtainAttributes.hasValue(i)) {
            i = C7525d.f24091r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C7525d.f24096w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C7525d.f24092s;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C7525d.f24099z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C7525d.f24093t;
        }
        int i5 = C7525d.f24097x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C7525d.f24094u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C7525d.f24095v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C7525d.f24090q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m11941g(xmlPullParser);
        }
        return new C8609c(string2, i2, z, string, i6, resourceId);
    }

    public static void m11941g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List<byte[]> m11940h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
