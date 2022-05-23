package m4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;

public final class f extends m4.b {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final List<c> f17130a;

    public class a implements Parcelable.Creator<f> {
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public static final class b {
        public final int f17131a;
        public final long f17132b;

        public b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f17131a);
            parcel.writeLong(this.f17132b);
        }

        public b(int i10, long j10) {
            this.f17131a = i10;
            this.f17132b = j10;
        }
    }

    public f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static f a(b0 b0Var) {
        int D = b0Var.D();
        ArrayList arrayList = new ArrayList(D);
        for (int i10 = 0; i10 < D; i10++) {
            arrayList.add(c.e(b0Var));
        }
        return new f(arrayList);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f17130a.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f17130a.get(i11).f(parcel);
        }
    }

    public f(List<c> list) {
        this.f17130a = Collections.unmodifiableList(list);
    }

    public f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(c.d(parcel));
        }
        this.f17130a = Collections.unmodifiableList(arrayList);
    }

    public static final class c {
        public final long f17133a;
        public final boolean f17134b;
        public final boolean f17135c;
        public final boolean f17136d;
        public final long f17137e;
        public final List<b> f17138f;
        public final boolean f17139g;
        public final long f17140h;
        public final int f17141i;
        public final int f17142j;
        public final int f17143k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f17133a = j10;
            this.f17134b = z10;
            this.f17135c = z11;
            this.f17136d = z12;
            this.f17138f = Collections.unmodifiableList(list);
            this.f17137e = j11;
            this.f17139g = z13;
            this.f17140h = j12;
            this.f17141i = i10;
            this.f17142j = i11;
            this.f17143k = i12;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(b0 b0Var) {
            boolean z10;
            int i10;
            int i11;
            int i12;
            long j10;
            boolean z11;
            long j11;
            ArrayList arrayList;
            boolean z12;
            long j12;
            boolean z13;
            long F = b0Var.F();
            boolean z14 = (b0Var.D() & Log.TAG_YOUTUBE) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z14) {
                int D = b0Var.D();
                boolean z15 = (D & Log.TAG_YOUTUBE) != 0;
                boolean z16 = (D & 64) != 0;
                boolean z17 = (D & 32) != 0;
                long F2 = z16 ? b0Var.F() : -9223372036854775807L;
                if (!z16) {
                    int D2 = b0Var.D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i13 = 0; i13 < D2; i13++) {
                        arrayList3.add(new b(b0Var.D(), b0Var.F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long D3 = b0Var.D();
                    boolean z18 = (128 & D3) != 0;
                    j12 = ((((D3 & 1) << 32) | b0Var.F()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    j12 = -9223372036854775807L;
                }
                int J = b0Var.J();
                int D4 = b0Var.D();
                z10 = z16;
                i10 = b0Var.D();
                j10 = j12;
                arrayList = arrayList2;
                j11 = F2;
                i12 = J;
                i11 = D4;
                z12 = z15;
                z11 = z13;
            } else {
                arrayList = arrayList2;
                z12 = false;
                j11 = -9223372036854775807L;
                z11 = false;
                j10 = -9223372036854775807L;
                i12 = 0;
                i11 = 0;
                i10 = 0;
                z10 = false;
            }
            return new c(F, z14, z12, z10, arrayList, j11, z11, j10, i12, i11, i10);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f17133a);
            parcel.writeByte(this.f17134b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f17135c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f17136d ? (byte) 1 : (byte) 0);
            int size = this.f17138f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f17138f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f17137e);
            parcel.writeByte(this.f17139g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f17140h);
            parcel.writeInt(this.f17141i);
            parcel.writeInt(this.f17142j);
            parcel.writeInt(this.f17143k);
        }

        public c(Parcel parcel) {
            this.f17133a = parcel.readLong();
            boolean z10 = false;
            this.f17134b = parcel.readByte() == 1;
            this.f17135c = parcel.readByte() == 1;
            this.f17136d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(b.c(parcel));
            }
            this.f17138f = Collections.unmodifiableList(arrayList);
            this.f17137e = parcel.readLong();
            this.f17139g = parcel.readByte() == 1 ? true : z10;
            this.f17140h = parcel.readLong();
            this.f17141i = parcel.readInt();
            this.f17142j = parcel.readInt();
            this.f17143k = parcel.readInt();
        }
    }
}
