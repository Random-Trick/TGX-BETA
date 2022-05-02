package p098h1;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbstractC4920a implements Parcelable {
    public final Parcelable f16783a;
    public static final AbstractC4920a f16782b = new C4921a();
    public static final Parcelable.Creator<AbstractC4920a> CREATOR = new C4922b();

    public static class C4921a extends AbstractC4920a {
        public C4921a() {
            super((C4921a) null);
        }
    }

    public static class C4922b implements Parcelable.ClassLoaderCreator<AbstractC4920a> {
        public AbstractC4920a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        public AbstractC4920a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC4920a.f16782b;
            }
            throw new IllegalStateException("superState must be null");
        }

        public AbstractC4920a[] newArray(int i) {
            return new AbstractC4920a[i];
        }
    }

    public AbstractC4920a(C4921a aVar) {
        this();
    }

    public final Parcelable m24449a() {
        return this.f16783a;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f16783a, i);
    }

    public AbstractC4920a() {
        this.f16783a = null;
    }

    public AbstractC4920a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f16783a = parcelable == f16782b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC4920a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f16783a = readParcelable == null ? f16782b : readParcelable;
    }
}
