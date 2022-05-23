package z5;

public final class w extends t {
    public final v f27001a = new v();

    @Override
    public final void a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f27001a.a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
