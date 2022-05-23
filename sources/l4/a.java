package l4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import f4.a;
import f4.b;
import java.util.Arrays;
import m3.c2;
import m3.q1;

public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0148a();
    public final int M;
    public final String f16005a;
    public final byte[] f16006b;
    public final int f16007c;

    public class C0148a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel, C0148a aVar) {
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
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16005a.equals(aVar.f16005a) && Arrays.equals(this.f16006b, aVar.f16006b) && this.f16007c == aVar.f16007c && this.M == aVar.M;
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
        return ((((((527 + this.f16005a.hashCode()) * 31) + Arrays.hashCode(this.f16006b)) * 31) + this.f16007c) * 31) + this.M;
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        b.c(this, bVar);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f16005a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f16005a);
        parcel.writeByteArray(this.f16006b);
        parcel.writeInt(this.f16007c);
        parcel.writeInt(this.M);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f16005a = str;
        this.f16006b = bArr;
        this.f16007c = i10;
        this.M = i11;
    }

    public a(Parcel parcel) {
        this.f16005a = (String) l0.j(parcel.readString());
        this.f16006b = (byte[]) l0.j(parcel.createByteArray());
        this.f16007c = parcel.readInt();
        this.M = parcel.readInt();
    }
}
