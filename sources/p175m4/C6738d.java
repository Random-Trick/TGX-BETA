package p175m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;
import p020b5.C1205i0;

public final class C6738d extends AbstractC6736b {
    public static final Parcelable.Creator<C6738d> CREATOR = new C6739a();
    public final boolean f21193M;
    public final boolean f21194N;
    public final long f21195O;
    public final long f21196P;
    public final List<C6740b> f21197Q;
    public final boolean f21198R;
    public final long f21199S;
    public final int f21200T;
    public final int f21201U;
    public final int f21202V;
    public final long f21203a;
    public final boolean f21204b;
    public final boolean f21205c;

    public class C6739a implements Parcelable.Creator<C6738d> {
        public C6738d createFromParcel(Parcel parcel) {
            return new C6738d(parcel, null);
        }

        public C6738d[] newArray(int i) {
            return new C6738d[i];
        }
    }

    public static final class C6740b {
        public final int f21206a;
        public final long f21207b;
        public final long f21208c;

        public C6740b(int i, long j, long j2, C6739a aVar) {
            this(i, j, j2);
        }

        public static C6740b m19171a(Parcel parcel) {
            return new C6740b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void m19170b(Parcel parcel) {
            parcel.writeInt(this.f21206a);
            parcel.writeLong(this.f21207b);
            parcel.writeLong(this.f21208c);
        }

        public C6740b(int i, long j, long j2) {
            this.f21206a = i;
            this.f21207b = j;
            this.f21208c = j2;
        }
    }

    public C6738d(Parcel parcel, C6739a aVar) {
        this(parcel);
    }

    public static C6738d m19174a(C1189b0 b0Var, long j, C1205i0 i0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        long j2;
        boolean z2;
        List list;
        long j3;
        boolean z3;
        boolean z4;
        long j4;
        boolean z5;
        long F = b0Var.m38154F();
        boolean z6 = (b0Var.m38156D() & Log.TAG_YOUTUBE) != 0;
        List emptyList = Collections.emptyList();
        if (!z6) {
            int D = b0Var.m38156D();
            boolean z7 = (D & Log.TAG_YOUTUBE) != 0;
            boolean z8 = (D & 64) != 0;
            boolean z9 = (D & 32) != 0;
            boolean z10 = (D & 16) != 0;
            long b = (!z8 || z10) ? -9223372036854775807L : C6747g.m19153b(b0Var, j);
            if (!z8) {
                int D2 = b0Var.m38156D();
                ArrayList arrayList = new ArrayList(D2);
                for (int i4 = 0; i4 < D2; i4++) {
                    int D3 = b0Var.m38156D();
                    long b2 = !z10 ? C6747g.m19153b(b0Var, j) : -9223372036854775807L;
                    arrayList.add(new C6740b(D3, b2, i0Var.m38052b(b2), null));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long D4 = b0Var.m38156D();
                boolean z11 = (128 & D4) != 0;
                j4 = ((((D4 & 1) << 32) | b0Var.m38154F()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i3 = b0Var.m38150J();
            z = z8;
            i2 = b0Var.m38156D();
            i = b0Var.m38156D();
            list = emptyList;
            j3 = b;
            z2 = z5;
            j2 = j4;
            z3 = z10;
            z4 = z7;
        } else {
            list = emptyList;
            z4 = false;
            z3 = false;
            j3 = -9223372036854775807L;
            z2 = false;
            j2 = -9223372036854775807L;
            i3 = 0;
            i2 = 0;
            i = 0;
            z = false;
        }
        return new C6738d(F, z6, z4, z, z3, j3, i0Var.m38052b(j3), list, z2, j2, i3, i2, i);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f21203a);
        parcel.writeByte(this.f21204b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21205c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21193M ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21194N ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f21195O);
        parcel.writeLong(this.f21196P);
        int size = this.f21197Q.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f21197Q.get(i2).m19170b(parcel);
        }
        parcel.writeByte(this.f21198R ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f21199S);
        parcel.writeInt(this.f21200T);
        parcel.writeInt(this.f21201U);
        parcel.writeInt(this.f21202V);
    }

    public C6738d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C6740b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f21203a = j;
        this.f21204b = z;
        this.f21205c = z2;
        this.f21193M = z3;
        this.f21194N = z4;
        this.f21195O = j2;
        this.f21196P = j3;
        this.f21197Q = Collections.unmodifiableList(list);
        this.f21198R = z5;
        this.f21199S = j4;
        this.f21200T = i;
        this.f21201U = i2;
        this.f21202V = i3;
    }

    public C6738d(Parcel parcel) {
        this.f21203a = parcel.readLong();
        boolean z = false;
        this.f21204b = parcel.readByte() == 1;
        this.f21205c = parcel.readByte() == 1;
        this.f21193M = parcel.readByte() == 1;
        this.f21194N = parcel.readByte() == 1;
        this.f21195O = parcel.readLong();
        this.f21196P = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C6740b.m19171a(parcel));
        }
        this.f21197Q = Collections.unmodifiableList(arrayList);
        this.f21198R = parcel.readByte() == 1 ? true : z;
        this.f21199S = parcel.readLong();
        this.f21200T = parcel.readInt();
        this.f21201U = parcel.readInt();
        this.f21202V = parcel.readInt();
    }
}
