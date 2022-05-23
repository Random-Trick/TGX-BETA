package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;

public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public final String M;
    public final String f15648b;
    public final String f15649c;

    public class a implements Parcelable.Creator<j> {
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f15648b = str;
        this.f15649c = str2;
        this.M = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return l0.c(this.f15649c, jVar.f15649c) && l0.c(this.f15648b, jVar.f15648b) && l0.c(this.M, jVar.M);
    }

    public int hashCode() {
        String str = this.f15648b;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15649c;
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
        String str2 = this.f15648b;
        String str3 = this.f15649c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15647a);
        parcel.writeString(this.f15648b);
        parcel.writeString(this.M);
    }

    public j(Parcel parcel) {
        super("----");
        this.f15648b = (String) l0.j(parcel.readString());
        this.f15649c = (String) l0.j(parcel.readString());
        this.M = (String) l0.j(parcel.readString());
    }
}
