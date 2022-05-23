package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;

public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();
    public final String M;
    public final String f15637b;
    public final String f15638c;

    public class a implements Parcelable.Creator<e> {
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f15637b = str;
        this.f15638c = str2;
        this.M = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return l0.c(this.f15638c, eVar.f15638c) && l0.c(this.f15637b, eVar.f15637b) && l0.c(this.M, eVar.M);
    }

    public int hashCode() {
        String str = this.f15637b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15638c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.M;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override
    public String toString() {
        String str = this.f15647a;
        String str2 = this.f15637b;
        String str3 = this.f15638c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15647a);
        parcel.writeString(this.f15637b);
        parcel.writeString(this.M);
    }

    public e(Parcel parcel) {
        super("COMM");
        this.f15637b = (String) l0.j(parcel.readString());
        this.f15638c = (String) l0.j(parcel.readString());
        this.M = (String) l0.j(parcel.readString());
    }
}
