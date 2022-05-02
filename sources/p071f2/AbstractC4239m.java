package p071f2;

import android.annotation.SuppressLint;

public interface AbstractC4239m {
    @SuppressLint({"SyntheticAccessor"})
    public static final AbstractC4241b.C4244c f14285a = new AbstractC4241b.C4244c();
    @SuppressLint({"SyntheticAccessor"})
    public static final AbstractC4241b.C4243b f14286b = new AbstractC4241b.C4243b();

    public static abstract class AbstractC4241b {

        public static final class C4242a extends AbstractC4241b {
            public final Throwable f14287a;

            public C4242a(Throwable th) {
                this.f14287a = th;
            }

            public Throwable m28353a() {
                return this.f14287a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f14287a.getMessage());
            }
        }

        public static final class C4243b extends AbstractC4241b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C4243b() {
            }
        }

        public static final class C4244c extends AbstractC4241b {
            public String toString() {
                return "SUCCESS";
            }

            public C4244c() {
            }
        }
    }
}
