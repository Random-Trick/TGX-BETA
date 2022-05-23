package n4;

import android.os.Parcel;
import android.os.Parcelable;

public final class a extends i4.a {
    public static final Parcelable.Creator<a> CREATOR = new C0160a();

    public class C0160a implements Parcelable.Creator<a> {
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    public a(Parcel parcel) {
        super(parcel);
    }
}
