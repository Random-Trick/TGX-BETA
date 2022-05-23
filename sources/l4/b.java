package l4;

import android.os.Parcel;
import android.os.Parcelable;
import b7.f;
import f4.a;
import m3.c2;
import m3.q1;

public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final long M;
    public final long N;
    public final long f16008a;
    public final long f16009b;
    public final long f16010c;

    public class a implements Parcelable.Creator<b> {
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(Parcel parcel, a aVar) {
        this(parcel);
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
        return this.f16008a == bVar.f16008a && this.f16009b == bVar.f16009b && this.f16010c == bVar.f16010c && this.M == bVar.M && this.N == bVar.N;
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
        return ((((((((527 + f.b(this.f16008a)) * 31) + f.b(this.f16009b)) * 31) + f.b(this.f16010c)) * 31) + f.b(this.M)) * 31) + f.b(this.N);
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        f4.b.c(this, bVar);
    }

    public String toString() {
        long j10 = this.f16008a;
        long j11 = this.f16009b;
        long j12 = this.f16010c;
        long j13 = this.M;
        long j14 = this.N;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j10);
        sb2.append(", photoSize=");
        sb2.append(j11);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j12);
        sb2.append(", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16008a);
        parcel.writeLong(this.f16009b);
        parcel.writeLong(this.f16010c);
        parcel.writeLong(this.M);
        parcel.writeLong(this.N);
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f16008a = j10;
        this.f16009b = j11;
        this.f16010c = j12;
        this.M = j13;
        this.N = j14;
    }

    public b(Parcel parcel) {
        this.f16008a = parcel.readLong();
        this.f16009b = parcel.readLong();
        this.f16010c = parcel.readLong();
        this.M = parcel.readLong();
        this.N = parcel.readLong();
    }
}
