package m4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.b0;
import c5.i0;

public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();
    public final long f17144a;
    public final long f17145b;

    public class a implements Parcelable.Creator<g> {
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    public static g a(b0 b0Var, long j10, i0 i0Var) {
        long b10 = b(b0Var, j10);
        return new g(b10, i0Var.b(b10));
    }

    public static long b(b0 b0Var, long j10) {
        long D = b0Var.D();
        if ((128 & D) != 0) {
            return 8589934591L & ((((D & 1) << 32) | b0Var.F()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f17144a);
        parcel.writeLong(this.f17145b);
    }

    public g(long j10, long j11) {
        this.f17144a = j10;
        this.f17145b = j11;
    }
}
