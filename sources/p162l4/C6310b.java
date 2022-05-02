package p162l4;

import android.os.Parcel;
import android.os.Parcelable;
import p008a7.C0201d;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C6310b implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C6310b> CREATOR = new C6311a();
    public final long f19848M;
    public final long f19849N;
    public final long f19850a;
    public final long f19851b;
    public final long f19852c;

    public class C6311a implements Parcelable.Creator<C6310b> {
        public C6310b createFromParcel(Parcel parcel) {
            return new C6310b(parcel, null);
        }

        public C6310b[] newArray(int i) {
            return new C6310b[i];
        }
    }

    public C6310b(Parcel parcel, C6311a aVar) {
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
        if (obj == null || C6310b.class != obj.getClass()) {
            return false;
        }
        C6310b bVar = (C6310b) obj;
        return this.f19850a == bVar.f19850a && this.f19851b == bVar.f19851b && this.f19852c == bVar.f19852c && this.f19848M == bVar.f19848M && this.f19849N == bVar.f19849N;
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
        return ((((((((527 + C0201d.m42092b(this.f19850a)) * 31) + C0201d.m42092b(this.f19851b)) * 31) + C0201d.m42092b(this.f19852c)) * 31) + C0201d.m42092b(this.f19848M)) * 31) + C0201d.m42092b(this.f19849N);
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28322c(this, bVar);
    }

    public String toString() {
        long j = this.f19850a;
        long j2 = this.f19851b;
        long j3 = this.f19852c;
        long j4 = this.f19848M;
        long j5 = this.f19849N;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j);
        sb2.append(", photoSize=");
        sb2.append(j2);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j3);
        sb2.append(", videoStartPosition=");
        sb2.append(j4);
        sb2.append(", videoSize=");
        sb2.append(j5);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f19850a);
        parcel.writeLong(this.f19851b);
        parcel.writeLong(this.f19852c);
        parcel.writeLong(this.f19848M);
        parcel.writeLong(this.f19849N);
    }

    public C6310b(long j, long j2, long j3, long j4, long j5) {
        this.f19850a = j;
        this.f19851b = j2;
        this.f19852c = j3;
        this.f19848M = j4;
        this.f19849N = j5;
    }

    public C6310b(Parcel parcel) {
        this.f19850a = parcel.readLong();
        this.f19851b = parcel.readLong();
        this.f19852c = parcel.readLong();
        this.f19848M = parcel.readLong();
        this.f19849N = parcel.readLong();
    }
}
