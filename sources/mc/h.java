package mc;

import java.lang.reflect.Modifier;

public class h {
    public static h f17384j;
    public static h f17385k;
    public static h f17386l;
    public boolean f17387a = true;
    public boolean f17388b = true;
    public boolean f17389c = false;
    public boolean f17390d = false;
    public boolean f17391e = false;
    public boolean f17392f = true;
    public boolean f17393g = true;
    public boolean f17394h = true;
    public int f17395i;

    static {
        h hVar = new h();
        f17384j = hVar;
        hVar.f17387a = true;
        hVar.f17388b = false;
        hVar.f17389c = false;
        hVar.f17390d = false;
        hVar.f17391e = true;
        hVar.f17392f = false;
        hVar.f17393g = false;
        hVar.f17395i = 0;
        h hVar2 = new h();
        f17385k = hVar2;
        hVar2.f17387a = true;
        hVar2.f17388b = true;
        hVar2.f17389c = false;
        hVar2.f17390d = false;
        hVar2.f17391e = false;
        f17384j.f17395i = 1;
        h hVar3 = new h();
        f17386l = hVar3;
        hVar3.f17387a = false;
        hVar3.f17388b = true;
        hVar3.f17389c = false;
        hVar3.f17390d = true;
        hVar3.f17391e = false;
        hVar3.f17394h = false;
        hVar3.f17395i = 2;
    }

    public void a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr != null) {
            if (this.f17388b) {
                stringBuffer.append("(");
                c(stringBuffer, clsArr);
                stringBuffer.append(")");
            } else if (clsArr.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
        }
    }

    public void b(StringBuffer stringBuffer, Class[] clsArr) {
        if (this.f17389c && clsArr != null && clsArr.length != 0) {
            stringBuffer.append(" throws ");
            c(stringBuffer, clsArr);
        }
    }

    public void c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i10 = 0; i10 < clsArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(g(clsArr[i10]));
        }
    }

    public String d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public String e(int i10) {
        if (!this.f17390d) {
            return "";
        }
        String modifier = Modifier.toString(i10);
        if (modifier.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(modifier);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public String f(Class cls, String str) {
        return h(cls, str, this.f17391e);
    }

    public String g(Class cls) {
        return h(cls, cls.getName(), this.f17387a);
    }

    public String h(Class cls, String str, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(h(componentType, componentType.getName(), z10));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z10) {
            return i(str).replace('$', '.');
        } else {
            return str.replace('$', '.');
        }
    }

    public String i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
