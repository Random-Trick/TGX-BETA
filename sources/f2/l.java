package f2;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import f2.u;

public final class l extends u {

    public static final class a extends u.a<a, l> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f11843c.f18593d = OverwritingInputMerger.class.getName();
        }

        public l c() {
            if (!this.f11841a || Build.VERSION.SDK_INT < 23 || !this.f11843c.f18599j.h()) {
                return new l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        public a d() {
            return this;
        }
    }

    public l(a aVar) {
        super(aVar.f11842b, aVar.f11843c, aVar.f11844d);
    }

    public static l d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
