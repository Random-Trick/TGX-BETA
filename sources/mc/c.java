package mc;

import jc.a;
import kc.b;

public class c implements jc.a {
    public Object f17361a;
    public Object f17362b;
    public Object[] f17363c;
    public a.AbstractC0131a f17364d;

    public static class a implements a.AbstractC0131a {
        public String f17365a;
        public jc.c f17366b;
        public b f17367c;
        public int f17368d;

        public a(int i10, String str, jc.c cVar, b bVar) {
            this.f17365a = str;
            this.f17366b = cVar;
            this.f17367c = bVar;
            this.f17368d = i10;
        }

        public String a() {
            return this.f17365a;
        }

        public jc.c b() {
            return this.f17366b;
        }

        public String c(h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.d(a()));
            stringBuffer.append("(");
            stringBuffer.append(((f) b()).k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override
        public final String toString() {
            return c(h.f17385k);
        }
    }

    public c(a.AbstractC0131a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f17364d = aVar;
        this.f17361a = obj;
        this.f17362b = obj2;
        this.f17363c = objArr;
    }

    @Override
    public Object a() {
        return this.f17362b;
    }

    public final String toString() {
        return this.f17364d.toString();
    }
}
