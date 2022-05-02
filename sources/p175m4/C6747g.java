package p175m4;

import android.os.Parcel;
import android.os.Parcelable;
import p020b5.C1189b0;
import p020b5.C1205i0;

public final class C6747g extends AbstractC6736b {
    public static final Parcelable.Creator<C6747g> CREATOR = new C6748a();
    public final long f21223a;
    public final long f21224b;

    public class C6748a implements Parcelable.Creator<C6747g> {
        public C6747g createFromParcel(Parcel parcel) {
            return new C6747g(parcel.readLong(), parcel.readLong(), null);
        }

        public C6747g[] newArray(int i) {
            return new C6747g[i];
        }
    }

    public C6747g(long j, long j2, C6748a aVar) {
        this(j, j2);
    }

    public static C6747g m19155a(C1189b0 b0Var, long j, C1205i0 i0Var) {
        long b = m19154b(b0Var, j);
        return new C6747g(b, i0Var.m38055b(b));
    }

    public static long m19154b(C1189b0 b0Var, long j) {
        long D = b0Var.m38159D();
        if ((128 & D) != 0) {
            return 8589934591L & ((((D & 1) << 32) | b0Var.m38157F()) + j);
        }
        return -9223372036854775807L;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f21223a);
        parcel.writeLong(this.f21224b);
    }

    public C6747g(long j, long j2) {
        this.f21223a = j;
        this.f21224b = j2;
    }
}
