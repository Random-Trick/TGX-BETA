package s;

import androidx.camera.core.t;
import androidx.camera.core.t1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.n;
import java.util.Objects;
import y.c0;
import y.f0;

public class i1 {
    public final f0 f22086a;
    public final n<t> f22087b;

    public static class a {
        public static final int[] f22088a;

        static {
            int[] iArr = new int[c0.a.values().length];
            f22088a = iArr;
            try {
                iArr[c0.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22088a[c0.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22088a[c0.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22088a[c0.a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22088a[c0.a.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22088a[c0.a.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22088a[c0.a.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public i1(f0 f0Var) {
        this.f22086a = f0Var;
        n<t> nVar = new n<>();
        this.f22087b = nVar;
        nVar.k(t.a(t.b.CLOSED));
    }

    public LiveData<t> a() {
        return this.f22087b;
    }

    public final t b() {
        return this.f22086a.a() ? t.a(t.b.OPENING) : t.a(t.b.PENDING_OPEN);
    }

    public void c(c0.a aVar, t.a aVar2) {
        t tVar;
        switch (a.f22088a[aVar.ordinal()]) {
            case 1:
                tVar = b();
                break;
            case 2:
                tVar = t.b(t.b.OPENING, aVar2);
                break;
            case 3:
                tVar = t.b(t.b.OPEN, aVar2);
                break;
            case 4:
            case 5:
                tVar = t.b(t.b.CLOSING, aVar2);
                break;
            case 6:
            case 7:
                tVar = t.b(t.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        t1.a("CameraStateMachine", "New public camera state " + tVar + " from " + aVar + " and " + aVar2);
        if (!Objects.equals(this.f22087b.e(), tVar)) {
            t1.a("CameraStateMachine", "Publishing new public camera state " + tVar);
            this.f22087b.k(tVar);
        }
    }
}
