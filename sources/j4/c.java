package j4;

import android.os.Parcel;
import android.os.Parcelable;
import f4.a;
import f4.b;
import java.util.Arrays;
import m3.c2;
import m3.q1;

public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();
    public final byte[] f15058a;
    public final String f15059b;
    public final String f15060c;

    public class a implements Parcelable.Creator<c> {
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(byte[] bArr, String str, String str2) {
        this.f15058a = bArr;
        this.f15059b = str;
        this.f15060c = str2;
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
        return Arrays.equals(this.f15058a, ((c) obj).f15058a);
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
        return Arrays.hashCode(this.f15058a);
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        String str = this.f15059b;
        if (str != null) {
            bVar.k0(str);
        }
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f15059b, this.f15060c, Integer.valueOf(this.f15058a.length));
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f15058a);
        parcel.writeString(this.f15059b);
        parcel.writeString(this.f15060c);
    }

    public c(Parcel parcel) {
        this.f15058a = (byte[]) c5.a.e(parcel.createByteArray());
        this.f15059b = parcel.readString();
        this.f15060c = parcel.readString();
    }
}
