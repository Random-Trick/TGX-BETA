package j$.util;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public abstract class AbstractC0283k {
    public static Optional a(C0282j jVar) {
        if (jVar == null) {
            return null;
        }
        return jVar.c() ? Optional.of(jVar.b()) : Optional.empty();
    }

    public static OptionalDouble b(C0284l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar.c() ? OptionalDouble.of(lVar.b()) : OptionalDouble.empty();
    }

    public static OptionalInt c(C0285m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.c() ? OptionalInt.of(mVar.b()) : OptionalInt.empty();
    }

    public static OptionalLong d(C0286n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar.c() ? OptionalLong.of(nVar.b()) : OptionalLong.empty();
    }
}
