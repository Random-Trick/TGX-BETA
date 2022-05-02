package lc;

import p125ic.AbstractC5327a;
import p125ic.AbstractC5330c;
import p140jc.AbstractC5922b;

public class C6483c implements AbstractC5327a {
    public Object f20172a;
    public Object f20173b;
    public Object[] f20174c;
    public AbstractC5327a.AbstractC5328a f20175d;

    public static class C6484a implements AbstractC5327a.AbstractC5328a {
        public String f20176a;
        public AbstractC5330c f20177b;
        public AbstractC5922b f20178c;
        public int f20179d;

        public C6484a(int i, String str, AbstractC5330c cVar, AbstractC5922b bVar) {
            this.f20176a = str;
            this.f20177b = cVar;
            this.f20178c = bVar;
            this.f20179d = i;
        }

        public String m20383a() {
            return this.f20176a;
        }

        public AbstractC5330c m20382b() {
            return this.f20177b;
        }

        public String m20381c(C6491h hVar) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(hVar.m20360d(m20383a()));
            stringBuffer.append("(");
            stringBuffer.append(((AbstractC6487f) m20382b()).m20369k(hVar));
            stringBuffer.append(")");
            return stringBuffer.toString();
        }

        @Override
        public final String toString() {
            return m20381c(C6491h.f20196k);
        }
    }

    public C6483c(AbstractC5327a.AbstractC5328a aVar, Object obj, Object obj2, Object[] objArr) {
        this.f20175d = aVar;
        this.f20172a = obj;
        this.f20173b = obj2;
        this.f20174c = objArr;
    }

    @Override
    public Object mo20384a() {
        return this.f20173b;
    }

    public final String toString() {
        return this.f20175d.toString();
    }
}
