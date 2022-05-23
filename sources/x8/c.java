package x8;

public class c {
    public static c f26067d = new c(0, 0, 0);
    public static c f26068e = new c(1, 2, 2);
    public static c f26069f = new c(2, 2, 1);
    public static c f26070g = new c(3, 1, 1);
    public int f26071a;
    public int f26072b;
    public int f26073c;

    public c(int i10, int i11, int i12) {
        this.f26071a = i10;
        this.f26072b = i11;
        this.f26073c = i12;
    }

    public static c a(int i10) {
        c cVar = f26067d;
        if (i10 == cVar.f26071a) {
            return cVar;
        }
        c cVar2 = f26068e;
        if (i10 == cVar2.f26071a) {
            return cVar2;
        }
        c cVar3 = f26069f;
        if (i10 == cVar3.f26071a) {
            return cVar3;
        }
        c cVar4 = f26070g;
        if (i10 == cVar4.f26071a) {
            return cVar4;
        }
        return null;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f26071a + ",\n subWidth=" + this.f26072b + ",\n subHeight=" + this.f26073c + '}';
    }
}
