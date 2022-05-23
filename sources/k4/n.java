package k4;

import android.os.Parcel;
import android.os.Parcelable;
import c5.l0;

public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();
    public final String f15656b;
    public final String f15657c;

    public class a implements Parcelable.Creator<n> {
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f15656b = str2;
        this.f15657c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f15647a.equals(nVar.f15647a) && l0.c(this.f15656b, nVar.f15656b) && l0.c(this.f15657c, nVar.f15657c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f15647a.hashCode()) * 31;
        String str = this.f15656b;
        int i10 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15657c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override
    public String toString() {
        String str = this.f15647a;
        String str2 = this.f15657c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15647a);
        parcel.writeString(this.f15656b);
        parcel.writeString(this.f15657c);
    }

    public n(Parcel parcel) {
        super((String) l0.j(parcel.readString()));
        this.f15656b = parcel.readString();
        this.f15657c = (String) l0.j(parcel.readString());
    }
}
