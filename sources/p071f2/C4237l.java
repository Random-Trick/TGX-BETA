package p071f2;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p071f2.AbstractC4253u;

public final class C4237l extends AbstractC4253u {

    public static final class C4238a extends AbstractC4253u.AbstractC4254a<C4238a, C4237l> {
        public C4238a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f14309c.f24146d = OverwritingInputMerger.class.getName();
        }

        public C4237l mo28341c() {
            if (!this.f14307a || Build.VERSION.SDK_INT < 23 || !this.f14309c.f24152j.m28390h()) {
                return new C4237l(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        public C4238a mo28340d() {
            return this;
        }
    }

    public C4237l(C4238a aVar) {
        super(aVar.f14308b, aVar.f14309c, aVar.f14310d);
    }

    public static C4237l m28356d(Class<? extends ListenableWorker> cls) {
        return new C4238a(cls).m28342b();
    }
}
