package qa;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p107ha.C5048h;
import p107ha.C5054l;
import p123ia.C5293g0;
import p123ia.C5295h0;
import p123ia.C5304n;
import p123ia.C5305o;
import p206oa.C7812a;
import p332xa.AbstractC10169b;
import pa.AbstractC8077a;
import pa.AbstractC8078b;
import pa.AbstractC8079c;
import pa.AbstractC8080d;
import pa.AbstractC8081e;
import pa.AbstractC8082f;
import pa.AbstractC8083g;
import pa.AbstractC8084h;
import pa.AbstractC8085i;
import pa.AbstractC8086j;
import pa.AbstractC8087k;
import pa.AbstractC8088l;
import pa.AbstractC8089m;
import pa.AbstractC8090n;
import pa.AbstractC8091o;
import pa.AbstractC8092p;
import pa.AbstractC8093q;
import pa.AbstractC8094r;
import pa.AbstractC8095s;
import pa.AbstractC8096t;
import pa.AbstractC8097u;
import pa.AbstractC8098v;
import pa.AbstractC8099w;
import za.C11452o;

public final class C8291e implements AbstractC10169b<Object>, AbstractC8290d {
    public static final C8292a f26774b = new C8292a(null);
    public static final Map<Class<Object>, Integer> f26775c;
    public static final HashMap<String, String> f26776d;
    public static final HashMap<String, String> f26777e;
    public static final HashMap<String, String> f26778f;
    public static final Map<String, String> f26779g;
    public final Class<?> f26780a;

    public static final class C8292a {
        public C8292a() {
        }

        public C8292a(C8294g gVar) {
            this();
        }

        public final String m12941a(Class<?> cls) {
            String str;
            C8298k.m12934e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod == null) {
                        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                        if (enclosingConstructor == null) {
                            C8298k.m12935d(simpleName, "name");
                            return C11452o.m578q0(simpleName, '$', null, 2, null);
                        }
                        C8298k.m12935d(simpleName, "name");
                        return C11452o.m577r0(simpleName, C8298k.m12929j(enclosingConstructor.getName(), "$"), null, 2, null);
                    }
                    C8298k.m12935d(simpleName, "name");
                    return C11452o.m577r0(simpleName, C8298k.m12929j(enclosingMethod.getName(), "$"), null, 2, null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C8291e.f26779g.get(componentType.getName())) != null) {
                        str2 = C8298k.m12929j(str, "Array");
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C8291e.f26779g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i = 0;
        List h = C5304n.m23364h(AbstractC8077a.class, AbstractC8088l.class, AbstractC8092p.class, AbstractC8093q.class, AbstractC8094r.class, AbstractC8095s.class, AbstractC8096t.class, AbstractC8097u.class, AbstractC8098v.class, AbstractC8099w.class, AbstractC8078b.class, AbstractC8079c.class, AbstractC8080d.class, AbstractC8081e.class, AbstractC8082f.class, AbstractC8083g.class, AbstractC8084h.class, AbstractC8085i.class, AbstractC8086j.class, AbstractC8087k.class, AbstractC8089m.class, AbstractC8090n.class, AbstractC8091o.class);
        ArrayList arrayList = new ArrayList(C5305o.m23357o(h, 10));
        for (Object obj : h) {
            i++;
            if (i < 0) {
                C5304n.m23358n();
            }
            arrayList.add(C5054l.m24188a((Class) obj, Integer.valueOf(i)));
        }
        f26775c = C5295h0.m23417j(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f26776d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f26777e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C8298k.m12935d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C8298k.m12935d(str, "kotlinName");
            sb2.append(C11452o.m575t0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            C5048h a = C5054l.m24188a(sb2.toString(), C8298k.m12929j(str, ".Companion"));
            hashMap3.put(a.m24194c(), a.m24193d());
        }
        for (Map.Entry<Class<Object>, Integer> entry : f26775c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), C8298k.m12929j("kotlin.Function", Integer.valueOf(entry.getValue().intValue())));
        }
        f26778f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C5293g0.m23436a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), C11452o.m575t0((String) entry2.getValue(), '.', null, 2, null));
        }
        f26779g = linkedHashMap;
    }

    public C8291e(Class<?> cls) {
        C8298k.m12934e(cls, "jClass");
        this.f26780a = cls;
    }

    @Override
    public String mo5851a() {
        return f26774b.m12941a(mo12923b());
    }

    @Override
    public Class<?> mo12923b() {
        return this.f26780a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C8291e) && C8298k.m12937b(C7812a.m14984a(this), C7812a.m14984a((AbstractC10169b) obj));
    }

    public int hashCode() {
        return C7812a.m14984a(this).hashCode();
    }

    public String toString() {
        return C8298k.m12929j(mo12923b().toString(), " (Kotlin reflection is not available)");
    }
}
