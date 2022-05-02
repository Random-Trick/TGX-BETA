package p175m4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.thunderdog.challegram.Log;
import p020b5.C1189b0;

public final class C6743f extends AbstractC6736b {
    public static final Parcelable.Creator<C6743f> CREATOR = new C6744a();
    public final List<C6746c> f21209a;

    public class C6744a implements Parcelable.Creator<C6743f> {
        public C6743f createFromParcel(Parcel parcel) {
            return new C6743f(parcel, null);
        }

        public C6743f[] newArray(int i) {
            return new C6743f[i];
        }
    }

    public static final class C6745b {
        public final int f21210a;
        public final long f21211b;

        public C6745b(int i, long j, C6744a aVar) {
            this(i, j);
        }

        public static C6745b m19163c(Parcel parcel) {
            return new C6745b(parcel.readInt(), parcel.readLong());
        }

        public final void m19162d(Parcel parcel) {
            parcel.writeInt(this.f21210a);
            parcel.writeLong(this.f21211b);
        }

        public C6745b(int i, long j) {
            this.f21210a = i;
            this.f21211b = j;
        }
    }

    public C6743f(Parcel parcel, C6744a aVar) {
        this(parcel);
    }

    public static C6743f m19168a(C1189b0 b0Var) {
        int D = b0Var.m38159D();
        ArrayList arrayList = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            arrayList.add(C6746c.m19157e(b0Var));
        }
        return new C6743f(arrayList);
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f21209a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f21209a.get(i2).m19156f(parcel);
        }
    }

    public C6743f(List<C6746c> list) {
        this.f21209a = Collections.unmodifiableList(list);
    }

    public C6743f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C6746c.m19158d(parcel));
        }
        this.f21209a = Collections.unmodifiableList(arrayList);
    }

    public static final class C6746c {
        public final long f21212a;
        public final boolean f21213b;
        public final boolean f21214c;
        public final boolean f21215d;
        public final long f21216e;
        public final List<C6745b> f21217f;
        public final boolean f21218g;
        public final long f21219h;
        public final int f21220i;
        public final int f21221j;
        public final int f21222k;

        public C6746c(long j, boolean z, boolean z2, boolean z3, List<C6745b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f21212a = j;
            this.f21213b = z;
            this.f21214c = z2;
            this.f21215d = z3;
            this.f21217f = Collections.unmodifiableList(list);
            this.f21216e = j2;
            this.f21218g = z4;
            this.f21219h = j3;
            this.f21220i = i;
            this.f21221j = i2;
            this.f21222k = i3;
        }

        public static C6746c m19158d(Parcel parcel) {
            return new C6746c(parcel);
        }

        public static C6746c m19157e(C1189b0 b0Var) {
            boolean z;
            int i;
            int i2;
            int i3;
            long j;
            boolean z2;
            long j2;
            ArrayList arrayList;
            boolean z3;
            long j3;
            boolean z4;
            long F = b0Var.m38157F();
            boolean z5 = (b0Var.m38159D() & Log.TAG_YOUTUBE) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (!z5) {
                int D = b0Var.m38159D();
                boolean z6 = (D & Log.TAG_YOUTUBE) != 0;
                boolean z7 = (D & 64) != 0;
                boolean z8 = (D & 32) != 0;
                long F2 = z7 ? b0Var.m38157F() : -9223372036854775807L;
                if (!z7) {
                    int D2 = b0Var.m38159D();
                    ArrayList arrayList3 = new ArrayList(D2);
                    for (int i4 = 0; i4 < D2; i4++) {
                        arrayList3.add(new C6745b(b0Var.m38159D(), b0Var.m38157F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long D3 = b0Var.m38159D();
                    boolean z9 = (128 & D3) != 0;
                    j3 = ((((D3 & 1) << 32) | b0Var.m38157F()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int J = b0Var.m38153J();
                int D4 = b0Var.m38159D();
                z = z7;
                i = b0Var.m38159D();
                j = j3;
                arrayList = arrayList2;
                j2 = F2;
                i3 = J;
                i2 = D4;
                z3 = z6;
                z2 = z4;
            } else {
                arrayList = arrayList2;
                z3 = false;
                j2 = -9223372036854775807L;
                z2 = false;
                j = -9223372036854775807L;
                i3 = 0;
                i2 = 0;
                i = 0;
                z = false;
            }
            return new C6746c(F, z5, z3, z, arrayList, j2, z2, j, i3, i2, i);
        }

        public final void m19156f(Parcel parcel) {
            parcel.writeLong(this.f21212a);
            parcel.writeByte(this.f21213b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f21214c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f21215d ? (byte) 1 : (byte) 0);
            int size = this.f21217f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f21217f.get(i).m19162d(parcel);
            }
            parcel.writeLong(this.f21216e);
            parcel.writeByte(this.f21218g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f21219h);
            parcel.writeInt(this.f21220i);
            parcel.writeInt(this.f21221j);
            parcel.writeInt(this.f21222k);
        }

        public C6746c(Parcel parcel) {
            this.f21212a = parcel.readLong();
            boolean z = false;
            this.f21213b = parcel.readByte() == 1;
            this.f21214c = parcel.readByte() == 1;
            this.f21215d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C6745b.m19163c(parcel));
            }
            this.f21217f = Collections.unmodifiableList(arrayList);
            this.f21216e = parcel.readLong();
            this.f21218g = parcel.readByte() == 1 ? true : z;
            this.f21219h = parcel.readLong();
            this.f21220i = parcel.readInt();
            this.f21221j = parcel.readInt();
            this.f21222k = parcel.readInt();
        }
    }
}
