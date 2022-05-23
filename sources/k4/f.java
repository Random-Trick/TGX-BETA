package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;

public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();
    public final String M;
    public final byte[] N;
    public final String f15639b;
    public final String f15640c;

    public class a implements Parcelable.Creator<f> {
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f15639b = str;
        this.f15640c = str2;
        this.M = str3;
        this.N = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return l0.c(this.f15639b, fVar.f15639b) && l0.c(this.f15640c, fVar.f15640c) && l0.c(this.M, fVar.M) && Arrays.equals(this.N, fVar.N);
    }

    public int hashCode() {
        String str = this.f15639b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15640c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.M;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + Arrays.hashCode(this.N);
    }

    @Override
    public String toString() {
        String str = this.f15647a;
        String str2 = this.f15639b;
        String str3 = this.f15640c;
        String str4 = this.M;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15639b);
        parcel.writeString(this.f15640c);
        parcel.writeString(this.M);
        parcel.writeByteArray(this.N);
    }

    public f(Parcel parcel) {
        super("GEOB");
        this.f15639b = (String) l0.j(parcel.readString());
        this.f15640c = (String) l0.j(parcel.readString());
        this.M = (String) l0.j(parcel.readString());
        this.N = (byte[]) l0.j(parcel.createByteArray());
    }
}
