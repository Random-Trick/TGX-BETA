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
        public final C8609c[] f27889a;

        public C8608b(C8609c[] cVarArr) {
            this.f27889a = cVarArr;
        }

        public C8609c[] m11940a() {
            return this.f27889a;
        }
    }

    public static final class C8609c {
        public final String f27890a;
        public int f27891b;
        public boolean f27892c;
        public String f27893d;
        public int f27894e;
        public int f27895f;

        public C8609c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f27890a = str;
            this.f27891b = i;
            this.f27892c = z;
            this.f27893d = str2;
            this.f27894e = i2;
            this.f27895f = i3;
        }

        public String m11939a() {
            return this.f27890a;
        }

        public int m11938b() {
            return this.f27895f;
        }

        public int m11937c() {
            return this.f27894e;
        }

        public String m11936d() {
            return this.f27893d;
        }

        public int m11935e() {
            return this.f27891b;
        }

        public boolean m11934f() {
            return this.f27892c;
        }
    }

    public static final class C8610d implements AbstractC8607a {
        public final C11209d f27896a;
        public final int f27897b;
        public final int f27898c;
        public final String f27899d;

        public C8610d(C11209d dVar, int i, int i2, String str) {
            this.f27896a = dVar;
            this.f27898c = i;
            this.f27897b = i2;
            this.f27899d = str;
        }

        public int m11933a() {
            return this.f27898c;
        }

        public C11209d m11932b() {
            return this.f27896a;
        }

        public String m11931c() {
            return this.f27899d;
        }

        public int m11930d() {
            return this.f27897b;
        }
    }

    public static int m11948a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static AbstractC8607a m11947b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m11945d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> m11946c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m11948a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m11941h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m11941h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static AbstractC8607a m11945d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m11944e(xmlPullParser, resources);
        }
        m11942g(xmlPullParser);
        return null;
    }

    public static AbstractC8607a m11944e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7525d.f24078h);
        String string = obtainAttributes.getString(C7525d.f24079i);
        String string2 = obtainAttributes.getString(C7525d.f24083m);
        String string3 = obtainAttributes.getString(C7525d.f24084n);
        int resourceId = obtainAttributes.getResourceId(C7525d.f24080j, 0);
        int integer = obtainAttributes.getInteger(C7525d.f24081k, 1);
        int integer2 = obtainAttributes.getInteger(C7525d.f24082l, 500);
        String string4 = obtainAttributes.getString(C7525d.f24085o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m11943f(xmlPullParser, resources));
                    } else {
                        m11942g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C8608b((C8609c[]) arrayList.toArray(new C8609c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m11942g(xmlPullParser);
        }
        return new C8610d(new C11209d(string, string2, string3, m11946c(resources, resourceId)), integer, integer2, string4);
    }

    public static C8609c m11943f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7525d.f24086p);
        int i = C7525d.f24095y;
        if (!obtainAttributes.hasValue(i)) {
            i = C7525d.f24088r;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C7525d.f24093w;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C7525d.f24089s;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C7525d.f24096z;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C7525d.f24090t;
        }
        int i5 = C7525d.f24094x;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C7525d.f24091u;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C7525d.f24092v;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C7525d.f24087q;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m11942g(xmlPullParser);
        }
        return new C8609c(string2, i2, z, string, i6, resourceId);
    }

    public static void m11942g(XmlPullParser xmlPullParser) {
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

    public static List<byte[]> m11941h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
