package n5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public class c {
    public static int a(@RecentlyNonNull Parcel parcel) {
        return v(parcel, 20293);
    }

    public static void b(@RecentlyNonNull Parcel parcel, int i10) {
        w(parcel, i10);
    }

    public static void c(@RecentlyNonNull Parcel parcel, int i10, boolean z10) {
        u(parcel, i10, 4);
        parcel.writeInt(z10 ? 1 : 0);
    }

    public static void d(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Bundle bundle, boolean z10) {
        if (bundle != null) {
            int v10 = v(parcel, i10);
            parcel.writeBundle(bundle);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void e(@RecentlyNonNull Parcel parcel, int i10, byte b10) {
        u(parcel, i10, 4);
        parcel.writeInt(b10);
    }

    public static void f(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull byte[] bArr, boolean z10) {
        if (bArr != null) {
            int v10 = v(parcel, i10);
            parcel.writeByteArray(bArr);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void g(@RecentlyNonNull Parcel parcel, int i10, double d10) {
        u(parcel, i10, 8);
        parcel.writeDouble(d10);
    }

    public static void h(@RecentlyNonNull Parcel parcel, int i10, float f10) {
        u(parcel, i10, 4);
        parcel.writeFloat(f10);
    }

    public static void i(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Float f10, boolean z10) {
        if (f10 != null) {
            u(parcel, i10, 4);
            parcel.writeFloat(f10.floatValue());
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void j(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull IBinder iBinder, boolean z10) {
        if (iBinder != null) {
            int v10 = v(parcel, i10);
            parcel.writeStrongBinder(iBinder);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void k(@RecentlyNonNull Parcel parcel, int i10, int i11) {
        u(parcel, i10, 4);
        parcel.writeInt(i11);
    }

    public static void l(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull int[] iArr, boolean z10) {
        if (iArr != null) {
            int v10 = v(parcel, i10);
            parcel.writeIntArray(iArr);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void m(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Integer num, boolean z10) {
        if (num != null) {
            u(parcel, i10, 4);
            parcel.writeInt(num.intValue());
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void n(@RecentlyNonNull Parcel parcel, int i10, long j10) {
        u(parcel, i10, 8);
        parcel.writeLong(j10);
    }

    public static void o(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull Parcelable parcelable, int i11, boolean z10) {
        if (parcelable != null) {
            int v10 = v(parcel, i10);
            parcelable.writeToParcel(parcel, i11);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void p(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull String str, boolean z10) {
        if (str != null) {
            int v10 = v(parcel, i10);
            parcel.writeString(str);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void q(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull String[] strArr, boolean z10) {
        if (strArr != null) {
            int v10 = v(parcel, i10);
            parcel.writeStringArray(strArr);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void r(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull List<String> list, boolean z10) {
        if (list != null) {
            int v10 = v(parcel, i10);
            parcel.writeStringList(list);
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void s(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull T[] tArr, int i11, boolean z10) {
        if (tArr != null) {
            int v10 = v(parcel, i10);
            parcel.writeInt(tArr.length);
            for (T t10 : tArr) {
                if (t10 == null) {
                    parcel.writeInt(0);
                } else {
                    x(parcel, t10, i11);
                }
            }
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static <T extends Parcelable> void t(@RecentlyNonNull Parcel parcel, int i10, @RecentlyNonNull List<T> list, boolean z10) {
        if (list != null) {
            int v10 = v(parcel, i10);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                T t10 = list.get(i11);
                if (t10 == null) {
                    parcel.writeInt(0);
                } else {
                    x(parcel, t10, 0);
                }
            }
            w(parcel, v10);
        } else if (z10) {
            u(parcel, i10, 0);
        }
    }

    public static void u(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static int v(Parcel parcel, int i10) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void w(Parcel parcel, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(dataPosition - i10);
        parcel.setDataPosition(dataPosition);
    }

    public static <T extends Parcelable> void x(Parcel parcel, T t10, int i10) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t10.writeToParcel(parcel, i10);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
