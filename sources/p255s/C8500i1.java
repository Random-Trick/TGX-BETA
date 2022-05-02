package p255s;

import androidx.camera.core.AbstractC0658u;
import androidx.camera.core.C0662u1;
import androidx.lifecycle.C0855n;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import p336y.AbstractC10208c0;
import p336y.C10222f0;

public class C8500i1 {
    public final C10222f0 f27564a;
    public final C0855n<AbstractC0658u> f27565b;

    public static class C8501a {
        public static final int[] f27566a;

        static {
            int[] iArr = new int[AbstractC10208c0.EnumC10209a.values().length];
            f27566a = iArr;
            try {
                iArr[AbstractC10208c0.EnumC10209a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27566a[AbstractC10208c0.EnumC10209a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27566a[AbstractC10208c0.EnumC10209a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27566a[AbstractC10208c0.EnumC10209a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27566a[AbstractC10208c0.EnumC10209a.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27566a[AbstractC10208c0.EnumC10209a.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27566a[AbstractC10208c0.EnumC10209a.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public C8500i1(C10222f0 f0Var) {
        this.f27564a = f0Var;
        C0855n<AbstractC0658u> nVar = new C0855n<>();
        this.f27565b = nVar;
        nVar.mo39634k(AbstractC0658u.m40661a(AbstractC0658u.EnumC0660b.CLOSED));
    }

    public LiveData<AbstractC0658u> m12305a() {
        return this.f27565b;
    }

    public final AbstractC0658u m12304b() {
        return this.f27564a.m5708a() ? AbstractC0658u.m40661a(AbstractC0658u.EnumC0660b.OPENING) : AbstractC0658u.m40661a(AbstractC0658u.EnumC0660b.PENDING_OPEN);
    }

    public void m12303c(AbstractC10208c0.EnumC10209a aVar, AbstractC0658u.AbstractC0659a aVar2) {
        AbstractC0658u uVar;
        switch (C8501a.f27566a[aVar.ordinal()]) {
            case 1:
                uVar = m12304b();
                break;
            case 2:
                uVar = AbstractC0658u.m40660b(AbstractC0658u.EnumC0660b.OPENING, aVar2);
                break;
            case 3:
                uVar = AbstractC0658u.m40660b(AbstractC0658u.EnumC0660b.OPEN, aVar2);
                break;
            case 4:
            case 5:
                uVar = AbstractC0658u.m40660b(AbstractC0658u.EnumC0660b.CLOSING, aVar2);
                break;
            case 6:
            case 7:
                uVar = AbstractC0658u.m40660b(AbstractC0658u.EnumC0660b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C0662u1.m40653a("CameraStateMachine", "New public camera state " + uVar + " from " + aVar + " and " + aVar2);
        if (!Objects.equals(this.f27565b.mo12252e(), uVar)) {
            C0662u1.m40653a("CameraStateMachine", "Publishing new public camera state " + uVar);
            this.f27565b.mo39634k(uVar);
        }
    }
}
