package p176m5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

public class C6752c {
    public static int m19124a(@RecentlyNonNull Parcel parcel) {
        return m19103v(parcel, 20293);
    }

    public static void m19123b(@RecentlyNonNull Parcel parcel, int i) {
        m19102w(parcel, i);
    }

    public static void m19122c(@RecentlyNonNull Parcel parcel, int i, boolean z) {
        m19104u(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void m19121d(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int v = m19103v(parcel, i);
            parcel.writeBundle(bundle);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19120e(@RecentlyNonNull Parcel parcel, int i, byte b) {
        m19104u(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void m19119f(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int v = m19103v(parcel, i);
            parcel.writeByteArray(bArr);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19118g(@RecentlyNonNull Parcel parcel, int i, double d) {
        m19104u(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void m19117h(@RecentlyNonNull Parcel parcel, int i, float f) {
        m19104u(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void m19116i(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Float f, boolean z) {
        if (f != null) {
            m19104u(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19115j(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int v = m19103v(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19114k(@RecentlyNonNull Parcel parcel, int i, int i2) {
        m19104u(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void m19113l(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int v = m19103v(parcel, i);
            parcel.writeIntArray(iArr);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19112m(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Integer num, boolean z) {
        if (num != null) {
            m19104u(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19111n(@RecentlyNonNull Parcel parcel, int i, long j) {
        m19104u(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void m19110o(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int v = m19103v(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19109p(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String str, boolean z) {
        if (str != null) {
            int v = m19103v(parcel, i);
            parcel.writeString(str);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19108q(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int v = m19103v(parcel, i);
            parcel.writeStringArray(strArr);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19107r(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<String> list, boolean z) {
        if (list != null) {
            int v = m19103v(parcel, i);
            parcel.writeStringList(list);
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void m19106s(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int v = m19103v(parcel, i);
            parcel.writeInt(tArr.length);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m19101x(parcel, t, i2);
                }
            }
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static <T extends Parcelable> void m19105t(@RecentlyNonNull Parcel parcel, int i, @RecentlyNonNull List<T> list, boolean z) {
        if (list != null) {
            int v = m19103v(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                T t = list.get(i2);
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m19101x(parcel, t, 0);
                }
            }
            m19102w(parcel, v);
        } else if (z) {
            m19104u(parcel, i, 0);
        }
    }

    public static void m19104u(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int m19103v(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void m19102w(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static <T extends Parcelable> void m19101x(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
