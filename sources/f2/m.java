package f2;

import android.annotation.SuppressLint;

public interface m {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f11823a = new b.c();
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0101b f11824b = new b.C0101b();

    public static abstract class b {

        public static final class a extends b {
            public final Throwable f11825a;

            public a(Throwable th) {
                this.f11825a = th;
            }

            public Throwable a() {
                return this.f11825a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f11825a.getMessage());
            }
        }

        public static final class C0101b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0101b() {
            }
        }

        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }
}
