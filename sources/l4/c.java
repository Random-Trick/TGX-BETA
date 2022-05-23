package l4;

import a7.k;
import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import f4.a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import m3.c2;
import m3.q1;
import z6.i;

public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final List<b> f16011a;

    public class a implements Parcelable.Creator<c> {
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public static final class b implements Parcelable {
        public final long f16012a;
        public final long f16013b;
        public final int f16014c;
        public static final Comparator<b> M = d.f16015a;
        public static final Parcelable.Creator<b> CREATOR = new a();

        public class a implements Parcelable.Creator<b> {
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            c5.a.a(j10 < j11);
            this.f16012a = j10;
            this.f16013b = j11;
            this.f16014c = i10;
        }

        public static int b(b bVar, b bVar2) {
            return k.j().e(bVar.f16012a, bVar2.f16012a).e(bVar.f16013b, bVar2.f16013b).d(bVar.f16014c, bVar2.f16014c).i();
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16012a == bVar.f16012a && this.f16013b == bVar.f16013b && this.f16014c == bVar.f16014c;
        }

        public int hashCode() {
            return i.b(Long.valueOf(this.f16012a), Long.valueOf(this.f16013b), Integer.valueOf(this.f16014c));
        }

        public String toString() {
            return l0.z("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f16012a), Long.valueOf(this.f16013b), Integer.valueOf(this.f16014c));
        }

        @Override
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f16012a);
            parcel.writeLong(this.f16013b);
            parcel.writeInt(this.f16014c);
        }
    }

    public c(List<b> list) {
        this.f16011a = list;
        c5.a.a(!a(list));
    }

    public static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f16013b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f16012a < j10) {
                return true;
            }
            j10 = list.get(i10).f16013b;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f16011a.equals(((c) obj).f16011a);
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return f4.b.a(this);
    }

    @Override
    public q1 getWrappedMetadataFormat() {
        return f4.b.b(this);
    }

    public int hashCode() {
        return this.f16011a.hashCode();
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        f4.b.c(this, bVar);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16011a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f16011a);
    }
}
