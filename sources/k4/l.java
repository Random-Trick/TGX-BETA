package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;
import java.util.Arrays;

public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();
    public final String f15652b;
    public final byte[] f15653c;

    public class a implements Parcelable.Creator<l> {
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f15652b = str;
        this.f15653c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return l0.c(this.f15652b, lVar.f15652b) && Arrays.equals(this.f15653c, lVar.f15653c);
    }

    public int hashCode() {
        String str = this.f15652b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15653c);
    }

    @Override
    public String toString() {
        String str = this.f15647a;
        String str2 = this.f15652b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15652b);
        parcel.writeByteArray(this.f15653c);
    }

    public l(Parcel parcel) {
        super("PRIV");
        this.f15652b = (String) l0.j(parcel.readString());
        this.f15653c = (byte[]) l0.j(parcel.createByteArray());
    }
}
