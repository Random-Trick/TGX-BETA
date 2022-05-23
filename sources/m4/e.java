package m4;

import android.os.Parcel;
import android.os.Parcelable;

public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    public class a implements Parcelable.Creator<e> {
        public e createFromParcel(Parcel parcel) {
            return new e();
        }

        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    @Override
    public void writeToParcel(Parcel parcel, int i10) {
    }
}
