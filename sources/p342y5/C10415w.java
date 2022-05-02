package p342y5;

public final class C10415w extends AbstractC10412t {
    public final C10414v f33486a = new C10414v();

    @Override
    public final void mo5155a(Throwable th, Throwable th2) {
        if (th2 != th) {
            this.f33486a.m5156a(th, true).add(th2);
            return;
        }
        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
    }
}
