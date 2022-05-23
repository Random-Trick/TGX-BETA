package s0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    public interface a {
    }

    public static final class b implements a {
        public final c[] f22405a;

        public b(c[] cVarArr) {
            this.f22405a = cVarArr;
        }

        public c[] a() {
            return this.f22405a;
        }
    }

    public static final class c {
        public final String f22406a;
        public int f22407b;
        public boolean f22408c;
        public String f22409d;
        public int f22410e;
        public int f22411f;

        public c(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f22406a = str;
            this.f22407b = i10;
            this.f22408c = z10;
            this.f22409d = str2;
            this.f22410e = i11;
            this.f22411f = i12;
        }

        public String a() {
            return this.f22406a;
        }

        public int b() {
            return this.f22411f;
        }

        public int c() {
            return this.f22410e;
        }

        public String d() {
            return this.f22409d;
        }

        public int e() {
            return this.f22407b;
        }

        public boolean f() {
            return this.f22408c;
        }
    }

    public static final class d implements a {
        public final z0.d f22412a;
        public final int f22413b;
        public final int f22414c;
        public final String f22415d;

        public d(z0.d dVar, int i10, int i11, String str) {
            this.f22412a = dVar;
            this.f22414c = i10;
            this.f22413b = i11;
            this.f22415d = str;
        }

        public int a() {
            return this.f22414c;
        }

        public z0.d b() {
            return this.f22412a;
        }

        public String c() {
            return this.f22415d;
        }

        public int d() {
            return this.f22413b;
        }
    }

    public static int a(TypedArray typedArray, int i10) {
        return typedArray.getType(i10);
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static a d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static a e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), o0.d.f18529h);
        String string = obtainAttributes.getString(o0.d.f18530i);
        String string2 = obtainAttributes.getString(o0.d.f18534m);
        String string3 = obtainAttributes.getString(o0.d.f18535n);
        int resourceId = obtainAttributes.getResourceId(o0.d.f18531j, 0);
        int integer = obtainAttributes.getInteger(o0.d.f18532k, 1);
        int integer2 = obtainAttributes.getInteger(o0.d.f18533l, 500);
        String string4 = obtainAttributes.getString(o0.d.f18536o);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(new z0.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
    }

    public static c f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), o0.d.f18537p);
        int i10 = o0.d.f18546y;
        if (!obtainAttributes.hasValue(i10)) {
            i10 = o0.d.f18539r;
        }
        int i11 = obtainAttributes.getInt(i10, 400);
        int i12 = o0.d.f18544w;
        if (!obtainAttributes.hasValue(i12)) {
            i12 = o0.d.f18540s;
        }
        boolean z10 = 1 == obtainAttributes.getInt(i12, 0);
        int i13 = o0.d.f18547z;
        if (!obtainAttributes.hasValue(i13)) {
            i13 = o0.d.f18541t;
        }
        int i14 = o0.d.f18545x;
        if (!obtainAttributes.hasValue(i14)) {
            i14 = o0.d.f18542u;
        }
        String string = obtainAttributes.getString(i14);
        int i15 = obtainAttributes.getInt(i13, 0);
        int i16 = o0.d.f18543v;
        if (!obtainAttributes.hasValue(i16)) {
            i16 = o0.d.f18538q;
        }
        int resourceId = obtainAttributes.getResourceId(i16, 0);
        String string2 = obtainAttributes.getString(i16);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i11, z10, string, i15, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
