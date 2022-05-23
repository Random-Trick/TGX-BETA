package ra;

import ab.o;
import ja.g0;
import ja.h0;
import ja.n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qa.c;
import qa.d;
import qa.f;
import qa.g;
import qa.h;
import qa.i;
import qa.j;
import qa.k;
import qa.l;
import qa.m;
import qa.p;
import qa.q;
import qa.r;
import qa.s;
import qa.t;
import qa.u;
import qa.v;
import qa.w;
import ya.b;

public final class e implements b<Object>, d {
    public static final a f21806b = new a(null);
    public static final Map<Class<Object>, Integer> f21807c;
    public static final HashMap<String, String> f21808d;
    public static final HashMap<String, String> f21809e;
    public static final HashMap<String, String> f21810f;
    public static final Map<String, String> f21811g;
    public final Class<?> f21812a;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            Method enclosingMethod;
            Constructor<?> enclosingConstructor;
            k.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    if (cls.getEnclosingMethod() != null) {
                        k.d(simpleName, "name");
                        String r02 = o.r0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (r02 != null) {
                            return r02;
                        }
                    }
                    if (cls.getEnclosingConstructor() != null) {
                        k.d(simpleName, "name");
                        return o.r0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                    }
                    k.d(simpleName, "name");
                    return o.q0(simpleName, '$', null, 2, null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) e.f21811g.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) e.f21811g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i10 = 0;
        List h10 = n.h(qa.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, qa.b.class, c.class, d.class, qa.e.class, f.class, g.class, h.class, i.class, j.class, k.class, m.class, qa.n.class, qa.o.class);
        ArrayList arrayList = new ArrayList(ja.o.o(h10, 10));
        for (Object obj : h10) {
            i10++;
            if (i10 < 0) {
                n.n();
            }
            arrayList.add(ia.l.a((Class) obj, Integer.valueOf(i10)));
        }
        f21807c = h0.j(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f21808d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f21809e = hashMap2;
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
        k.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            k.d(str, "kotlinName");
            sb2.append(o.t0(str, '.', null, 2, null));
            sb2.append("CompanionObject");
            ia.h a10 = ia.l.a(sb2.toString(), str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry<Class<Object>, Integer> entry : f21807c.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f21810f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(g0.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), o.t0((String) entry2.getValue(), '.', null, 2, null));
        }
        f21811g = linkedHashMap;
    }

    public e(Class<?> cls) {
        k.e(cls, "jClass");
        this.f21812a = cls;
    }

    @Override
    public String a() {
        return f21806b.a(b());
    }

    @Override
    public Class<?> b() {
        return this.f21812a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && k.b(pa.a.a(this), pa.a.a((b) obj));
    }

    public int hashCode() {
        return pa.a.a(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
