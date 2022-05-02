package p315w8;

public class C9988a {
    public static final C9988a f32485b = new C9988a(255);
    public int f32486a;

    public C9988a(int i) {
        this.f32486a = i;
    }

    public static C9988a m6306a(int i) {
        C9988a aVar = f32485b;
        return i == aVar.f32486a ? aVar : new C9988a(i);
    }

    public String toString() {
        return "AspectRatio{value=" + this.f32486a + '}';
    }
}
