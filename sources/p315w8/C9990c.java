package p315w8;

public class C9990c {
    public static C9990c f32487d = new C9990c(0, 0, 0);
    public static C9990c f32488e = new C9990c(1, 2, 2);
    public static C9990c f32489f = new C9990c(2, 2, 1);
    public static C9990c f32490g = new C9990c(3, 1, 1);
    public int f32491a;
    public int f32492b;
    public int f32493c;

    public C9990c(int i, int i2, int i3) {
        this.f32491a = i;
        this.f32492b = i2;
        this.f32493c = i3;
    }

    public static C9990c m6305a(int i) {
        C9990c cVar = f32487d;
        if (i == cVar.f32491a) {
            return cVar;
        }
        C9990c cVar2 = f32488e;
        if (i == cVar2.f32491a) {
            return cVar2;
        }
        C9990c cVar3 = f32489f;
        if (i == cVar3.f32491a) {
            return cVar3;
        }
        C9990c cVar4 = f32490g;
        if (i == cVar4.f32491a) {
            return cVar4;
        }
        return null;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f32491a + ",\n subWidth=" + this.f32492b + ",\n subHeight=" + this.f32493c + '}';
    }
}
