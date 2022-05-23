package m4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.b0;
import c5.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;

public final class d extends m4.b {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final boolean M;
    public final boolean N;
    public final long O;
    public final long P;
    public final List<b> Q;
    public final boolean R;
    public final long S;
    public final int T;
    public final int U;
    public final int V;
    public final long f17124a;
    public final boolean f17125b;
    public final boolean f17126c;

    public class a implements Parcelable.Creator<d> {
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public static final class b {
        public final int f17127a;
        public final long f17128b;
        public final long f17129c;

        public b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f17127a);
            parcel.writeLong(this.f17128b);
            parcel.writeLong(this.f17129c);
        }

        public b(int i10, long j10, long j11) {
            this.f17127a = i10;
            this.f17128b = j10;
            this.f17129c = j11;
        }
    }

    public d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d a(b0 b0Var, long j10, i0 i0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j11;
        boolean z11;
        List list;
        long j12;
        boolean z12;
        boolean z13;
        long j13;
        boolean z14;
        long F = b0Var.F();
        boolean z15 = (b0Var.D() & Log.TAG_YOUTUBE) != 0;
        List emptyList = Collections.emptyList();
        if (!z15) {
            int D = b0Var.D();
            boolean z16 = (D & Log.TAG_YOUTUBE) != 0;
            boolean z17 = (D & 64) != 0;
            boolean z18 = (D & 32) != 0;
            boolean z19 = (D & 16) != 0;
            long b10 = (!z17 || z19) ? -9223372036854775807L : g.b(b0Var, j10);
            if (!z17) {
                int D2 = b0Var.D();
                ArrayList arrayList = new ArrayList(D2);
                for (int i13 = 0; i13 < D2; i13++) {
                    int D3 = b0Var.D();
                    long b11 = !z19 ? g.b(b0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(D3, b11, i0Var.b(b11), null));
                }
                emptyList = arrayList;
            }
            if (z18) {
                long D4 = b0Var.D();
                boolean z20 = (128 & D4) != 0;
                j13 = ((((D4 & 1) << 32) | b0Var.F()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                j13 = -9223372036854775807L;
            }
            i12 = b0Var.J();
            z10 = z17;
            i11 = b0Var.D();
            i10 = b0Var.D();
            list = emptyList;
            j12 = b10;
            z11 = z14;
            j11 = j13;
            z12 = z19;
            z13 = z16;
        } else {
            list = emptyList;
            z13 = false;
            z12 = false;
            j12 = -9223372036854775807L;
            z11 = false;
            j11 = -9223372036854775807L;
            i12 = 0;
            i11 = 0;
            i10 = 0;
            z10 = false;
        }
        return new d(F, z15, z13, z10, z12, j12, i0Var.b(j12), list, z11, j11, i12, i11, i10);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f17124a);
        parcel.writeByte(this.f17125b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f17126c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.N ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.O);
        parcel.writeLong(this.P);
        int size = this.Q.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.Q.get(i11).b(parcel);
        }
        parcel.writeByte(this.R ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.S);
        parcel.writeInt(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f17124a = j10;
        this.f17125b = z10;
        this.f17126c = z11;
        this.M = z12;
        this.N = z13;
        this.O = j11;
        this.P = j12;
        this.Q = Collections.unmodifiableList(list);
        this.R = z14;
        this.S = j13;
        this.T = i10;
        this.U = i11;
        this.V = i12;
    }

    public d(Parcel parcel) {
        this.f17124a = parcel.readLong();
        boolean z10 = false;
        this.f17125b = parcel.readByte() == 1;
        this.f17126c = parcel.readByte() == 1;
        this.M = parcel.readByte() == 1;
        this.N = parcel.readByte() == 1;
        this.O = parcel.readLong();
        this.P = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.Q = Collections.unmodifiableList(arrayList);
        this.R = parcel.readByte() == 1 ? true : z10;
        this.S = parcel.readLong();
        this.T = parcel.readInt();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
    }
}
