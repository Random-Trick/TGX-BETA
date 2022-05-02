package ua;

import java.io.Serializable;
import p153ka.C6222b;
import qa.C8294g;

public abstract class AbstractC9486c {
    public static final C9487a f30717a = new C9487a(null);
    public static final AbstractC9486c f30718b = C6222b.f19644a.mo18953b();

    public static final class C9487a extends AbstractC9486c implements Serializable {
        public C9487a() {
        }

        public C9487a(C8294g gVar) {
            this();
        }

        @Override
        public double mo8552b() {
            return AbstractC9486c.f30718b.mo8552b();
        }

        @Override
        public float mo8551c() {
            return AbstractC9486c.f30718b.mo8551c();
        }

        @Override
        public int mo8550d(int i) {
            return AbstractC9486c.f30718b.mo8550d(i);
        }
    }

    public abstract double mo8552b();

    public abstract float mo8551c();

    public abstract int mo8550d(int i);
}
