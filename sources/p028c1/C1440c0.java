package p028c1;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class C1440c0 {
    public static boolean m36920a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (viewParent instanceof AbstractC1481q) {
            return ((AbstractC1481q) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean m36919b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (viewParent instanceof AbstractC1481q) {
            return ((AbstractC1481q) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static void m36918c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof AbstractC1479o) {
            ((AbstractC1479o) viewParent).mo36783o(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
                }
            } else if (viewParent instanceof AbstractC1481q) {
                ((AbstractC1481q) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static void m36917d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof AbstractC1480p) {
            ((AbstractC1480p) viewParent).mo36782j(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof AbstractC1479o) {
            ((AbstractC1479o) viewParent).mo36787k(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
                }
            } else if (viewParent instanceof AbstractC1481q) {
                ((AbstractC1481q) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void m36916e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof AbstractC1479o) {
            ((AbstractC1479o) viewParent).mo36785m(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
                }
            } else if (viewParent instanceof AbstractC1481q) {
                ((AbstractC1481q) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static boolean m36915f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof AbstractC1479o) {
            return ((AbstractC1479o) viewParent).mo36786l(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        } else if (viewParent instanceof AbstractC1481q) {
            return ((AbstractC1481q) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void m36914g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof AbstractC1479o) {
            ((AbstractC1479o) viewParent).mo36784n(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
                }
            } else if (viewParent instanceof AbstractC1481q) {
                ((AbstractC1481q) viewParent).onStopNestedScroll(view);
            }
        }
    }
}
