package l4;

import android.os.Parcel;
import android.os.Parcelable;
import f4.a;
import f4.b;
import m3.c2;
import m3.q1;

public final class e implements a.b {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public final float f16016a;
    public final int f16017b;

    public class a implements Parcelable.Creator<e> {
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(Parcel parcel, a aVar) {
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
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16016a == eVar.f16016a && this.f16017b == eVar.f16017b;
    }

    @Override
    public byte[] getWrappedMetadataBytes() {
        return b.a(this);
    }

    @Override
    public q1 getWrappedMetadataFormat() {
        return b.b(this);
    }

    public int hashCode() {
        return ((527 + b7.b.a(this.f16016a)) * 31) + this.f16017b;
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        b.c(this, bVar);
    }

    public String toString() {
        float f10 = this.f16016a;
        int i10 = this.f16017b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.f16016a);
        parcel.writeInt(this.f16017b);
    }

    public e(float f10, int i10) {
        this.f16016a = f10;
        this.f16017b = i10;
    }

    public e(Parcel parcel) {
        this.f16016a = parcel.readFloat();
        this.f16017b = parcel.readInt();
    }
}
