package h1;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public final Parcelable f12451a;
    public static final a f12450b = new C0113a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    public static class C0113a extends a {
        public C0113a() {
            super((C0113a) null);
        }
    }

    public static class b implements Parcelable.ClassLoaderCreator<a> {
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f12450b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(C0113a aVar) {
        this();
    }

    public final Parcelable a() {
        return this.f12451a;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f12451a, i10);
    }

    public a() {
        this.f12451a = null;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f12451a = parcelable == f12450b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f12451a = readParcelable == null ? f12450b : readParcelable;
    }
}
