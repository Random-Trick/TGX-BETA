package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;
import m3.c2;

public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0140a();
    public final int M;
    public final byte[] N;
    public final String f15630b;
    public final String f15631c;

    public class C0140a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f15630b = str;
        this.f15631c = str2;
        this.M = i10;
        this.N = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.M == aVar.M && l0.c(this.f15630b, aVar.f15630b) && l0.c(this.f15631c, aVar.f15631c) && Arrays.equals(this.N, aVar.N);
    }

    public int hashCode() {
        int i10 = (527 + this.M) * 31;
        String str = this.f15630b;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15631c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((hashCode + i11) * 31) + Arrays.hashCode(this.N);
    }

    @Override
    public void populateMediaMetadata(c2.b bVar) {
        bVar.H(this.N, this.M);
    }

    @Override
    public String toString() {
        String str = this.f15647a;
        String str2 = this.f15630b;
        String str3 = this.f15631c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15630b);
        parcel.writeString(this.f15631c);
        parcel.writeInt(this.M);
        parcel.writeByteArray(this.N);
    }

    public a(Parcel parcel) {
        super("APIC");
        this.f15630b = (String) l0.j(parcel.readString());
        this.f15631c = parcel.readString();
        this.M = parcel.readInt();
        this.N = (byte[]) l0.j(parcel.createByteArray());
    }
}
