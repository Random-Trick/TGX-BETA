package p315w8;

public class C9990c {
    public static C9990c f32484d = new C9990c(0, 0, 0);
    public static C9990c f32485e = new C9990c(1, 2, 2);
    public static C9990c f32486f = new C9990c(2, 2, 1);
    public static C9990c f32487g = new C9990c(3, 1, 1);
    public int f32488a;
    public int f32489b;
    public int f32490c;

    public C9990c(int i, int i2, int i3) {
        this.f32488a = i;
        this.f32489b = i2;
        this.f32490c = i3;
    }

    public static C9990c m6305a(int i) {
        C9990c cVar = f32484d;
        if (i == cVar.f32488a) {
            return cVar;
        }
        C9990c cVar2 = f32485e;
        if (i == cVar2.f32488a) {
            return cVar2;
        }
        C9990c cVar3 = f32486f;
        if (i == cVar3.f32488a) {
            return cVar3;
        }
        C9990c cVar4 = f32487g;
        if (i == cVar4.f32488a) {
            return cVar4;
        }
        return null;
    }

    public String toString() {
        return "ChromaFormat{\nid=" + this.f32488a + ",\n subWidth=" + this.f32489b + ",\n subHeight=" + this.f32490c + '}';
    }
}
