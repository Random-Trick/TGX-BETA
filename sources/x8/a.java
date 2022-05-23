package x8;

public class a {
    public static final a f26065b = new a(255);
    public int f26066a;

    public a(int i10) {
        this.f26066a = i10;
    }

    public static a a(int i10) {
        a aVar = f26065b;
        return i10 == aVar.f26066a ? aVar : new a(i10);
    }

    public String toString() {
        return "AspectRatio{value=" + this.f26066a + '}';
    }
}
