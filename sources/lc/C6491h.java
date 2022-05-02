package lc;

import java.lang.reflect.Modifier;

public class C6491h {
    public static C6491h f20195j;
    public static C6491h f20196k;
    public static C6491h f20197l;
    public boolean f20198a = true;
    public boolean f20199b = true;
    public boolean f20200c = false;
    public boolean f20201d = false;
    public boolean f20202e = false;
    public boolean f20203f = true;
    public boolean f20204g = true;
    public boolean f20205h = true;
    public int f20206i;

    static {
        C6491h hVar = new C6491h();
        f20195j = hVar;
        hVar.f20198a = true;
        hVar.f20199b = false;
        hVar.f20200c = false;
        hVar.f20201d = false;
        hVar.f20202e = true;
        hVar.f20203f = false;
        hVar.f20204g = false;
        hVar.f20206i = 0;
        C6491h hVar2 = new C6491h();
        f20196k = hVar2;
        hVar2.f20198a = true;
        hVar2.f20199b = true;
        hVar2.f20200c = false;
        hVar2.f20201d = false;
        hVar2.f20202e = false;
        f20195j.f20206i = 1;
        C6491h hVar3 = new C6491h();
        f20197l = hVar3;
        hVar3.f20198a = false;
        hVar3.f20199b = true;
        hVar3.f20200c = false;
        hVar3.f20201d = true;
        hVar3.f20202e = false;
        hVar3.f20205h = false;
        hVar3.f20206i = 2;
    }

    public void m20362a(StringBuffer stringBuffer, Class[] clsArr) {
        if (clsArr != null) {
            if (this.f20199b) {
                stringBuffer.append("(");
                m20360c(stringBuffer, clsArr);
                stringBuffer.append(")");
            } else if (clsArr.length == 0) {
                stringBuffer.append("()");
            } else {
                stringBuffer.append("(..)");
            }
        }
    }

    public void m20361b(StringBuffer stringBuffer, Class[] clsArr) {
        if (this.f20200c && clsArr != null && clsArr.length != 0) {
            stringBuffer.append(" throws ");
            m20360c(stringBuffer, clsArr);
        }
    }

    public void m20360c(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(m20356g(clsArr[i]));
        }
    }

    public String m20359d(String str) {
        int lastIndexOf = str.lastIndexOf(45);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public String m20358e(int i) {
        if (!this.f20201d) {
            return "";
        }
        String modifier = Modifier.toString(i);
        if (modifier.length() == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(modifier);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }

    public String m20357f(Class cls, String str) {
        return m20355h(cls, str, this.f20202e);
    }

    public String m20356g(Class cls) {
        return m20355h(cls, cls.getName(), this.f20198a);
    }

    public String m20355h(Class cls, String str, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(m20355h(componentType, componentType.getName(), z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z) {
            return m20354i(str).replace('$', '.');
        } else {
            return str.replace('$', '.');
        }
    }

    public String m20354i(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
