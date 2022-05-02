package p162l4;

import android.os.Parcel;
import android.os.Parcelable;
import p008a7.C0198b;
import p073f4.C4260a;
import p073f4.C4263b;
import p174m3.C6600g1;
import p174m3.C6693s1;

public final class C6317e implements C4260a.AbstractC4262b {
    public static final Parcelable.Creator<C6317e> CREATOR = new C6318a();
    public final float f19859a;
    public final int f19860b;

    public class C6318a implements Parcelable.Creator<C6317e> {
        public C6317e createFromParcel(Parcel parcel) {
            return new C6317e(parcel, (C6318a) null);
        }

        public C6317e[] newArray(int i) {
            return new C6317e[i];
        }
    }

    public C6317e(Parcel parcel, C6318a aVar) {
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
        if (obj == null || C6317e.class != obj.getClass()) {
            return false;
        }
        C6317e eVar = (C6317e) obj;
        return this.f19859a == eVar.f19859a && this.f19860b == eVar.f19860b;
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
        return ((527 + C0198b.m42106a(this.f19859a)) * 31) + this.f19860b;
    }

    @Override
    public void populateMediaMetadata(C6693s1.C6695b bVar) {
        C4263b.m28322c(this, bVar);
    }

    public String toString() {
        float f = this.f19859a;
        int i = this.f19860b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f19859a);
        parcel.writeInt(this.f19860b);
    }

    public C6317e(float f, int i) {
        this.f19859a = f;
        this.f19860b = i;
    }

    public C6317e(Parcel parcel) {
        this.f19859a = parcel.readFloat();
        this.f19860b = parcel.readInt();
    }
}
