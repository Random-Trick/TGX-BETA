package p213p0;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p213p0.C7956h;

public class C7975j {
    public static Field f25976b;
    public static boolean f25977c;
    public static final Object f25975a = new Object();
    public static final Object f25978d = new Object();

    public static SparseArray<Bundle> m13886a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle m13885b(C7956h.C7957a aVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat e = aVar.m13994e();
        bundle2.putInt("icon", e != null ? e.m40321f() : 0);
        bundle2.putCharSequence("title", aVar.m13990i());
        bundle2.putParcelable("actionIntent", aVar.m13998a());
        if (aVar.m13995d() != null) {
            bundle = new Bundle(aVar.m13995d());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m13997b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m13882e(aVar.m13993f()));
        bundle2.putBoolean("showsUserInterface", aVar.m13991h());
        bundle2.putInt("semanticAction", aVar.m13992g());
        return bundle2;
    }

    public static Bundle m13884c(Notification notification) {
        synchronized (f25975a) {
            if (f25977c) {
                return null;
            }
            try {
                if (f25976b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f25977c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f25976b = declaredField;
                }
                Bundle bundle = (Bundle) f25976b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f25976b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f25977c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f25977c = true;
                return null;
            }
        }
    }

    public static Bundle m13883d(C7985m mVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", mVar.m13836i());
        bundle.putCharSequence("label", mVar.m13837h());
        bundle.putCharSequenceArray("choices", mVar.m13840e());
        bundle.putBoolean("allowFreeFormInput", mVar.m13842c());
        bundle.putBundle("extras", mVar.m13838g());
        Set<String> d = mVar.m13841d();
        if (d != null && !d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(d.size());
            for (String str : d) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    public static Bundle[] m13882e(C7985m[] mVarArr) {
        if (mVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[mVarArr.length];
        for (int i = 0; i < mVarArr.length; i++) {
            bundleArr[i] = m13883d(mVarArr[i]);
        }
        return bundleArr;
    }

    public static Bundle m13881f(Notification.Builder builder, C7956h.C7957a aVar) {
        IconCompat e = aVar.m13994e();
        builder.addAction(e != null ? e.m40321f() : 0, aVar.m13990i(), aVar.m13998a());
        Bundle bundle = new Bundle(aVar.m13995d());
        if (aVar.m13993f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m13882e(aVar.m13993f()));
        }
        if (aVar.m13996c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m13882e(aVar.m13996c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m13997b());
        return bundle;
    }
}
