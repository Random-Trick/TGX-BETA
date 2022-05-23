package j4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import f4.a;
import m3.c2;
import m3.q1;

public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final String M;
    public final boolean N;
    public final int O;
    public final int f15055a;
    public final String f15056b;
    public final String f15057c;

    public class a implements Parcelable.Creator<b> {
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        c5.a.a(i11 == -1 || i11 > 0);
        this.f15055a = i10;
        this.f15056b = str;
        this.f15057c = str2;
        this.M = str3;
        this.N = z10;
        this.O = i11;
    }

    public static j4.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a(java.util.Map):j4.b");
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
        return this.f15055a == bVar.f15055a && l0.c(this.f15056b, bVar.f15056b) && l0.c(this.f15057c, bVar.f15057c) && l0.c(this.M, bVar.M) && this.N == bVar.N && this.O == bVar.O;
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
        int i10 = (527 + this.f15055a) * 31;
        String str = this.f15056b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15057c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.M;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.N ? 1 : 0)) * 31) + this.O;
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        String str = this.f15057c;
        if (str != null) {
            bVar.i0(str);
        }
        String str2 = this.f15056b;
        if (str2 != null) {
            bVar.Y(str2);
        }
    }

    public String toString() {
        String str = this.f15057c;
        String str2 = this.f15056b;
        int i10 = this.f15055a;
        int i11 = this.O;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i10);
        sb2.append(", metadataInterval=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15055a);
        parcel.writeString(this.f15056b);
        parcel.writeString(this.f15057c);
        parcel.writeString(this.M);
        l0.J0(parcel, this.N);
        parcel.writeInt(this.O);
    }

    public b(Parcel parcel) {
        this.f15055a = parcel.readInt();
        this.f15056b = parcel.readString();
        this.f15057c = parcel.readString();
        this.M = parcel.readString();
        this.N = l0.y0(parcel);
        this.O = parcel.readInt();
    }
}
