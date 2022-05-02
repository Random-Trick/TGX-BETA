package p162l4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1216l0;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;
import p343y6.C10432h;
import p358z6.AbstractC11374k;

public final class C6312c implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C6312c> CREATOR = new C6313a();
    public final List<C6314b> f19853a;

    public class C6313a implements Parcelable.Creator<C6312c> {
        public C6312c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C6314b.class.getClassLoader());
            return new C6312c(arrayList);
        }

        public C6312c[] newArray(int i) {
            return new C6312c[i];
        }
    }

    public static final class C6314b implements Parcelable {
        public final long f19855a;
        public final long f19856b;
        public final int f19857c;
        public static final Comparator<C6314b> f19854M = C6316d.f19858a;
        public static final Parcelable.Creator<C6314b> CREATOR = new C6315a();

        public class C6315a implements Parcelable.Creator<C6314b> {
            public C6314b createFromParcel(Parcel parcel) {
                return new C6314b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            public C6314b[] newArray(int i) {
                return new C6314b[i];
            }
        }

        public C6314b(long j, long j2, int i) {
            C1186a.m38189a(j < j2);
            this.f19855a = j;
            this.f19856b = j2;
            this.f19857c = i;
        }

        public static int m20678b(C6314b bVar, C6314b bVar2) {
            return AbstractC11374k.m802j().mo799e(bVar.f19855a, bVar2.f19855a).mo799e(bVar.f19856b, bVar2.f19856b).mo800d(bVar.f19857c, bVar2.f19857c).mo795i();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6314b.class != obj.getClass()) {
                return false;
            }
            C6314b bVar = (C6314b) obj;
            return this.f19855a == bVar.f19855a && this.f19856b == bVar.f19856b && this.f19857c == bVar.f19857c;
        }

        public int hashCode() {
            return C10432h.m5138b(Long.valueOf(this.f19855a), Long.valueOf(this.f19856b), Integer.valueOf(this.f19857c));
        }

        public String toString() {
            return C1216l0.m37936z("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f19855a), Long.valueOf(this.f19856b), Integer.valueOf(this.f19857c));
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f19855a);
            parcel.writeLong(this.f19856b);
            parcel.writeInt(this.f19857c);
        }
    }

    public C6312c(List<C6314b> list) {
        this.f19853a = list;
        C1186a.m38189a(!m20682a(list));
    }

    public static boolean m20682a(List<C6314b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f19856b;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f19855a < j) {
                return true;
            }
            j = list.get(i).f19856b;
        }
        return false;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6312c.class != obj.getClass()) {
            return false;
        }
        return this.f19853a.equals(((C6312c) obj).f19853a);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return C4263b.m28324a(this);
    }

    @Override
    public C6600g1 getWrappedMetadataFormat() {
        return C4263b.m28323b(this);
    }

    public int hashCode() {
        return this.f19853a.hashCode();
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28322c(this, bVar);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f19853a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f19853a);
    }
}
