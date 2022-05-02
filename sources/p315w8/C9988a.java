package p315w8;

public class C9988a {
    public static final C9988a f32482b = new C9988a(255);
    public int f32483a;

    public C9988a(int i) {
        this.f32483a = i;
    }

    public static C9988a m6306a(int i) {
        C9988a aVar = f32482b;
        return i == aVar.f32483a ? aVar : new C9988a(i);
    }

    public String toString() {
        return "AspectRatio{value=" + this.f32483a + '}';
    }
}
