package p239qd;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Message;
import be.C1379j0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import nc.C7389v0;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import p082fd.C4384m;
import p225pd.C8111a;
import p364zd.C11524j;

public class C8325c {
    public int f26857A;
    public int f26859B;
    public int f26861C;
    public boolean f26862C0;
    public int f26863D;
    public boolean f26864D0;
    public int f26865E;
    public int f26866E0;
    public int f26867F;
    public int f26868F0;
    public int f26869G;
    public volatile int f26870G0;
    public int f26871H;
    public volatile int f26872H0;
    public int f26873I;
    public FloatBuffer f26874I0;
    public int f26875J;
    public FloatBuffer f26876J0;
    public int f26877K;
    public FloatBuffer f26878K0;
    public int f26879L;
    public boolean f26880L0;
    public int f26881M;
    public C8111a f26882M0;
    public int f26883N;
    public final C4384m f26884N0;
    public int f26885O;
    public boolean f26886O0;
    public int f26887P;
    public boolean f26888P0;
    public int f26889Q;
    public boolean f26890Q0;
    public int f26891R;
    public int f26892S;
    public int f26893T;
    public int f26894U;
    public int f26895V;
    public int f26896W;
    public int f26897X;
    public int f26898Y;
    public int f26899Z;
    public GL f26900a;
    public int f26901a0;
    public EGL10 f26902b;
    public int f26903b0;
    public EGLDisplay f26904c;
    public int f26905c0;
    public EGLConfig f26906d;
    public int f26907d0;
    public EGLContext f26908e;
    public int f26909e0;
    public EGLSurface f26910f;
    public int f26911f0;
    public long f26912g;
    public int f26913g0;
    public SurfaceTexture f26914h;
    public int f26915h0;
    public Bitmap f26916i;
    public int f26917i0;
    public int f26918j;
    public int f26919j0;
    public int f26920k;
    public int f26921k0;
    public int f26922l;
    public int f26923l0;
    public int f26924m;
    public int f26925m0;
    public int f26926n;
    public int f26927n0;
    public int f26928o;
    public int f26929o0;
    public int f26930p;
    public int f26931p0;
    public int f26932q;
    public int f26933q0;
    public int f26934r;
    public int f26935r0;
    public int f26936s;
    public int f26937s0;
    public int f26938t;
    public int f26939t0;
    public int f26940u;
    public int f26941u0;
    public int f26942v;
    public int f26943v0;
    public int f26944w;
    public int f26945w0;
    public int f26946x;
    public int f26947x0;
    public int f26948y;
    public int f26950z;
    public int[] f26949y0 = new int[2];
    public int[] f26951z0 = new int[3];
    public int[] f26858A0 = new int[3];
    public int[] f26860B0 = new int[1];

    public class C8326a extends C4384m {
        public C8326a(String str) {
            super(str);
        }

        @Override
        public void mo3052f(Message message) {
            int i = message.what;
            boolean z = true;
            if (i == 0) {
                C8325c.this.m12845o();
                m28051g(true);
            } else if (i == 1) {
                C8325c cVar = C8325c.this;
                cVar.f26880L0 = cVar.m12873I();
            } else if (i == 2) {
                C8325c cVar2 = C8325c.this;
                boolean z2 = message.arg1 == 1;
                if (message.arg2 != 1) {
                    z = false;
                }
                cVar2.m12864R(z2, z);
            } else if (i == 3) {
                Object[] objArr = (Object[]) message.obj;
                C8325c.this.m12862T((Bitmap) objArr[0], (C8111a) objArr[1]);
            } else if (i == 4) {
                C8325c.this.m12868N();
            } else if (i == 5) {
                C8325c.this.m12843q((AbstractC8323a) message.obj);
            }
        }
    }

    public C8325c(SurfaceTexture surfaceTexture, Bitmap bitmap, C8111a aVar, int i, int i2) {
        C8326a aVar2 = new C8326a("EGLEditorQueue");
        this.f26884N0 = aVar2;
        this.f26916i = bitmap;
        this.f26914h = surfaceTexture;
        this.f26870G0 = i;
        this.f26872H0 = i2;
        this.f26882M0 = aVar;
        aVar2.m28050h(Message.obtain(aVar2.m28053d(), 1), 0L);
    }

    public final float m12881A() {
        float v = m12838v(4);
        if (v > 0.0f) {
            v *= 1.05f;
        }
        return v + 1.0f;
    }

    public final float m12880B() {
        return ((m12876F(10) * 0.55f) + 100.0f) / 100.0f;
    }

    public final float m12879C() {
        return (m12838v(8) * 0.6f) + 0.11f;
    }

    public final float m12878D() {
        return this.f26882M0.m13576j(13) == 0 ? 0.0f : 0.5f;
    }

    public final float m12877E() {
        return this.f26882M0.m13576j(11) == 0 ? 0.0f : 0.5f;
    }

    public final float m12876F(int i) {
        return this.f26882M0.m13576j(i);
    }

    public final float m12875G() {
        return m12838v(6);
    }

    public final float m12874H() {
        return m12838v(3);
    }

    public final boolean m12873I() {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f26902b = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f26904c = eglGetDisplay;
        if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            Log.m14724e("eglGetDisplay failed: %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
            m12845o();
            return false;
        } else if (!this.f26902b.eglInitialize(eglGetDisplay, new int[2])) {
            Log.m14724e("eglInitialize failed: %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
            m12845o();
            return false;
        } else {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!this.f26902b.eglChooseConfig(this.f26904c, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, eGLConfigArr, 1, iArr)) {
                Log.m14724e("eglChooseConfig failed: %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
                m12845o();
                return false;
            } else if (iArr[0] > 0) {
                EGLConfig eGLConfig = eGLConfigArr[0];
                this.f26906d = eGLConfig;
                EGLContext eglCreateContext = this.f26902b.eglCreateContext(this.f26904c, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.f26908e = eglCreateContext;
                if (eglCreateContext == null) {
                    Log.m14724e("eglCreateContext failed: %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
                    m12845o();
                    return false;
                }
                SurfaceTexture surfaceTexture = this.f26914h;
                if (surfaceTexture != null) {
                    EGLSurface eglCreateWindowSurface = this.f26902b.eglCreateWindowSurface(this.f26904c, this.f26906d, surfaceTexture, null);
                    this.f26910f = eglCreateWindowSurface;
                    if (eglCreateWindowSurface == null || eglCreateWindowSurface == EGL10.EGL_NO_SURFACE) {
                        Log.m14724e("createWindowSurface failed: %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
                        m12845o();
                        return false;
                    } else if (!this.f26902b.eglMakeCurrent(this.f26904c, eglCreateWindowSurface, eglCreateWindowSurface, this.f26908e)) {
                        Log.m14724e("eglMakeCurrent failed: %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
                        m12845o();
                        return false;
                    } else {
                        this.f26900a = this.f26908e.getGL();
                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(32);
                        allocateDirect.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
                        this.f26874I0 = asFloatBuffer;
                        asFloatBuffer.put(new float[]{-1.0f, 1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, -1.0f});
                        this.f26874I0.position(0);
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
                        allocateDirect2.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
                        this.f26878K0 = asFloatBuffer2;
                        asFloatBuffer2.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                        this.f26878K0.position(0);
                        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(32);
                        allocateDirect3.order(ByteOrder.nativeOrder());
                        FloatBuffer asFloatBuffer3 = allocateDirect3.asFloatBuffer();
                        this.f26876J0 = asFloatBuffer3;
                        asFloatBuffer3.put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
                        this.f26876J0.position(0);
                        GLES20.glGenTextures(1, this.f26860B0, 0);
                        GLES20.glGenTextures(2, this.f26949y0, 0);
                        int K = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K2 = m12871K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform highp float width;uniform highp float height;uniform sampler2D curvesImage;uniform lowp float skipTone;uniform lowp float shadows;const mediump vec3 hsLuminanceWeighting = vec3(0.3, 0.3, 0.3);uniform lowp float highlights;uniform lowp float contrast;uniform lowp float fadeAmount;const mediump vec3 satLuminanceWeighting = vec3(0.2126, 0.7152, 0.0722);uniform lowp float saturation;uniform lowp float shadowsTintIntensity;uniform lowp float highlightsTintIntensity;uniform lowp vec3 shadowsTintColor;uniform lowp vec3 highlightsTintColor;uniform lowp float exposure;uniform lowp float warmth;uniform lowp float grain;const lowp float permTexUnit = 1.0 / 256.0;const lowp float permTexUnitHalf = 0.5 / 256.0;const lowp float grainsize = 2.3;uniform lowp float vignette;highp float getLuma(highp vec3 rgbP) {return (0.299 * rgbP.r) + (0.587 * rgbP.g) + (0.114 * rgbP.b);}lowp vec3 rgbToHsv(lowp vec3 c) {highp vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);highp vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);highp vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);highp float d = q.x - min(q.w, q.y);highp float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}lowp vec3 hsvToRgb(lowp vec3 c) {highp vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);highp vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}highp vec3 rgbToHsl(highp vec3 color) {highp vec3 hsl;highp float fmin = min(min(color.r, color.g), color.b);highp float fmax = max(max(color.r, color.g), color.b);highp float delta = fmax - fmin;hsl.z = (fmax + fmin) / 2.0;if (delta == 0.0) {hsl.x = 0.0;hsl.y = 0.0;} else {if (hsl.z < 0.5) {hsl.y = delta / (fmax + fmin);} else {hsl.y = delta / (2.0 - fmax - fmin);}highp float deltaR = (((fmax - color.r) / 6.0) + (delta / 2.0)) / delta;highp float deltaG = (((fmax - color.g) / 6.0) + (delta / 2.0)) / delta;highp float deltaB = (((fmax - color.b) / 6.0) + (delta / 2.0)) / delta;if (color.r == fmax) {hsl.x = deltaB - deltaG;} else if (color.g == fmax) {hsl.x = (1.0 / 3.0) + deltaR - deltaB;} else if (color.b == fmax) {hsl.x = (2.0 / 3.0) + deltaG - deltaR;}if (hsl.x < 0.0) {hsl.x += 1.0;} else if (hsl.x > 1.0) {hsl.x -= 1.0;}}return hsl;}highp float hueToRgb(highp float f1, highp float f2, highp float hue) {if (hue < 0.0) {hue += 1.0;} else if (hue > 1.0) {hue -= 1.0;}highp float res;if ((6.0 * hue) < 1.0) {res = f1 + (f2 - f1) * 6.0 * hue;} else if ((2.0 * hue) < 1.0) {res = f2;} else if ((3.0 * hue) < 2.0) {res = f1 + (f2 - f1) * ((2.0 / 3.0) - hue) * 6.0;} else {res = f1;} return res;}highp vec3 hslToRgb(highp vec3 hsl) {if (hsl.y == 0.0) {return vec3(hsl.z);} else {highp float f2;if (hsl.z < 0.5) {f2 = hsl.z * (1.0 + hsl.y);} else {f2 = (hsl.z + hsl.y) - (hsl.y * hsl.z);}highp float f1 = 2.0 * hsl.z - f2;return vec3(hueToRgb(f1, f2, hsl.x + (1.0/3.0)), hueToRgb(f1, f2, hsl.x), hueToRgb(f1, f2, hsl.x - (1.0/3.0)));}}highp vec3 rgbToYuv(highp vec3 inP) {highp float luma = getLuma(inP);return vec3(luma, (1.0 / 1.772) * (inP.b - luma), (1.0 / 1.402) * (inP.r - luma));}lowp vec3 yuvToRgb(highp vec3 inP) {return vec3(1.402 * inP.b + inP.r, (inP.r - (0.299 * 1.402 / 0.587) * inP.b - (0.114 * 1.772 / 0.587) * inP.g), 1.772 * inP.g + inP.r);}lowp float easeInOutSigmoid(lowp float value, lowp float strength) {if (value > 0.5) {return 1.0 - pow(2.0 - 2.0 * value, 1.0 / (1.0 - strength)) * 0.5;} else {return pow(2.0 * value, 1.0 / (1.0 - strength)) * 0.5;}}lowp vec3 applyLuminanceCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.z / (1.0 / 200.0), 0.0, 199.0));pixel.y = mix(0.0, pixel.y, smoothstep(0.0, 0.1, pixel.z) * (1.0 - smoothstep(0.8, 1.0, pixel.z)));pixel.z = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).a;return pixel;}lowp vec3 applyRGBCurve(lowp vec3 pixel) {highp float index = floor(clamp(pixel.r / (1.0 / 200.0), 0.0, 199.0));pixel.r = texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).r;index = floor(clamp(pixel.g / (1.0 / 200.0), 0.0, 199.0));pixel.g = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).g, 0.0, 1.0);index = floor(clamp(pixel.b / (1.0 / 200.0), 0.0, 199.0));pixel.b = clamp(texture2D(curvesImage, vec2(1.0 / 200.0 * index, 0)).b, 0.0, 1.0);return pixel;}highp vec3 fadeAdjust(highp vec3 color, highp float fadeVal) {return (color * (1.0 - fadeVal)) + ((color + (vec3(-0.9772) * pow(vec3(color), vec3(3.0)) + vec3(1.708) * pow(vec3(color), vec3(2.0)) + vec3(-0.1603) * vec3(color) + vec3(0.2878) - color * vec3(0.9))) * fadeVal);}lowp vec3 tintRaiseShadowsCurve(lowp vec3 color) {return vec3(-0.003671) * pow(color, vec3(3.0)) + vec3(0.3842) * pow(color, vec3(2.0)) + vec3(0.3764) * color + vec3(0.2515);}lowp vec3 tintShadows(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, tintRaiseShadowsCurve(texel), tintColor), tintAmount), 0.0, 1.0);} lowp vec3 tintHighlights(lowp vec3 texel, lowp vec3 tintColor, lowp float tintAmount) {return clamp(mix(texel, mix(texel, vec3(1.0) - tintRaiseShadowsCurve(vec3(1.0) - texel), (vec3(1.0) - tintColor)), tintAmount), 0.0, 1.0);}highp vec4 rnm(in highp vec2 tc) {highp float noise = sin(dot(tc, vec2(12.9898, 78.233))) * 43758.5453;return vec4(fract(noise), fract(noise * 1.2154), fract(noise * 1.3453), fract(noise * 1.3647)) * 2.0 - 1.0;}highp float fade(in highp float t) {return t * t * t * (t * (t * 6.0 - 15.0) + 10.0);}highp float pnoise3D(in highp vec3 p) {highp vec3 pi = permTexUnit * floor(p) + permTexUnitHalf;highp vec3 pf = fract(p);highp float perm = rnm(pi.xy).a;highp float n000 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf);highp float n001 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(0.0, permTexUnit)).a;highp float n010 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 0.0));highp float n011 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(0.0, 1.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, 0.0)).a;highp float n100 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 0.0));highp float n101 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 0.0, 1.0));perm = rnm(pi.xy + vec2(permTexUnit, permTexUnit)).a;highp float n110 = dot(rnm(vec2(perm, pi.z)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 0.0));highp float n111 = dot(rnm(vec2(perm, pi.z + permTexUnit)).rgb * 4.0 - 1.0, pf - vec3(1.0, 1.0, 1.0));highp vec4 n_x = mix(vec4(n000, n001, n010, n011), vec4(n100, n101, n110, n111), fade(pf.x));highp vec2 n_xy = mix(n_x.xy, n_x.zw, fade(pf.y));return mix(n_xy.x, n_xy.y, fade(pf.z));}lowp vec2 coordRot(in lowp vec2 tc, in lowp float angle) {return vec2(((tc.x * 2.0 - 1.0) * cos(angle) - (tc.y * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5, ((tc.y * 2.0 - 1.0) * cos(angle) + (tc.x * 2.0 - 1.0) * sin(angle)) * 0.5 + 0.5);}void main() {lowp vec4 source = texture2D(sourceImage, texCoord);lowp vec4 result = source;const lowp float toolEpsilon = 0.005;if (skipTone < toolEpsilon) {result = vec4(applyRGBCurve(hslToRgb(applyLuminanceCurve(rgbToHsl(result.rgb)))), result.a);}mediump float hsLuminance = dot(result.rgb, hsLuminanceWeighting);mediump float shadow = clamp((pow(hsLuminance, 1.0 / shadows) + (-0.76) * pow(hsLuminance, 2.0 / shadows)) - hsLuminance, 0.0, 1.0);mediump float highlight = clamp((1.0 - (pow(1.0 - hsLuminance, 1.0 / (2.0 - highlights)) + (-0.8) * pow(1.0 - hsLuminance, 2.0 / (2.0 - highlights)))) - hsLuminance, -1.0, 0.0);lowp vec3 hsresult = vec3(0.0, 0.0, 0.0) + ((hsLuminance + shadow + highlight) - 0.0) * ((result.rgb - vec3(0.0, 0.0, 0.0)) / (hsLuminance - 0.0));mediump float contrastedLuminance = ((hsLuminance - 0.5) * 1.5) + 0.5;mediump float whiteInterp = contrastedLuminance * contrastedLuminance * contrastedLuminance;mediump float whiteTarget = clamp(highlights, 1.0, 2.0) - 1.0;hsresult = mix(hsresult, vec3(1.0), whiteInterp * whiteTarget);mediump float invContrastedLuminance = 1.0 - contrastedLuminance;mediump float blackInterp = invContrastedLuminance * invContrastedLuminance * invContrastedLuminance;mediump float blackTarget = 1.0 - clamp(shadows, 0.0, 1.0);hsresult = mix(hsresult, vec3(0.0), blackInterp * blackTarget);result = vec4(hsresult.rgb, result.a);result = vec4(clamp(((result.rgb - vec3(0.5)) * contrast + vec3(0.5)), 0.0, 1.0), result.a);if (abs(fadeAmount) > toolEpsilon) {result.rgb = fadeAdjust(result.rgb, fadeAmount);}lowp float satLuminance = dot(result.rgb, satLuminanceWeighting);lowp vec3 greyScaleColor = vec3(satLuminance);result = vec4(clamp(mix(greyScaleColor, result.rgb, saturation), 0.0, 1.0), result.a);if (abs(shadowsTintIntensity) > toolEpsilon) {result.rgb = tintShadows(result.rgb, shadowsTintColor, shadowsTintIntensity * 2.0);}if (abs(highlightsTintIntensity) > toolEpsilon) {result.rgb = tintHighlights(result.rgb, highlightsTintColor, highlightsTintIntensity * 2.0);}if (abs(exposure) > toolEpsilon) {mediump float mag = exposure * 1.045;mediump float exppower = 1.0 + abs(mag);if (mag < 0.0) {exppower = 1.0 / exppower;}result.r = 1.0 - pow((1.0 - result.r), exppower);result.g = 1.0 - pow((1.0 - result.g), exppower);result.b = 1.0 - pow((1.0 - result.b), exppower);}if (abs(warmth) > toolEpsilon) {highp vec3 yuvVec;if (warmth > 0.0 ) {yuvVec = vec3(0.1765, -0.1255, 0.0902);} else {yuvVec = -vec3(0.0588, 0.1569, -0.1255);}highp vec3 yuvColor = rgbToYuv(result.rgb);highp float luma = yuvColor.r;highp float curveScale = sin(luma * 3.14159);yuvColor += 0.375 * warmth * curveScale * yuvVec;result.rgb = yuvToRgb(yuvColor);}if (abs(grain) > toolEpsilon) {highp vec3 rotOffset = vec3(1.425, 3.892, 5.835);highp vec2 rotCoordsR = coordRot(texCoord, rotOffset.x);highp vec3 noise = vec3(pnoise3D(vec3(rotCoordsR * vec2(width / grainsize, height / grainsize),0.0)));lowp vec3 lumcoeff = vec3(0.299,0.587,0.114);lowp float luminance = dot(result.rgb, lumcoeff);lowp float lum = smoothstep(0.2, 0.0, luminance);lum += luminance;noise = mix(noise,vec3(0.0),pow(lum,4.0));result.rgb = result.rgb + noise * grain;}if (abs(vignette) > toolEpsilon) {const lowp float midpoint = 0.7;const lowp float fuzziness = 0.62;lowp float radDist = length(texCoord - 0.5) / sqrt(0.5);lowp float mag = easeInOutSigmoid(radDist * midpoint, fuzziness) * vignette * 0.645;result.rgb = mix(pow(result.rgb, vec3(1.0 / (1.0 - mag))), vec3(0.0), mag * mag);}gl_FragColor = result;}");
                        if (K == 0 || K2 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram = GLES20.glCreateProgram();
                        this.f26938t = glCreateProgram;
                        GLES20.glAttachShader(glCreateProgram, K);
                        GLES20.glAttachShader(this.f26938t, K2);
                        GLES20.glBindAttribLocation(this.f26938t, 0, "position");
                        GLES20.glBindAttribLocation(this.f26938t, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26938t);
                        int[] iArr2 = new int[1];
                        GLES20.glGetProgramiv(this.f26938t, 35714, iArr2, 0);
                        if (iArr2[0] == 0) {
                            GLES20.glDeleteProgram(this.f26938t);
                            this.f26938t = 0;
                        } else {
                            this.f26940u = GLES20.glGetAttribLocation(this.f26938t, "position");
                            this.f26942v = GLES20.glGetAttribLocation(this.f26938t, "inputTexCoord");
                            this.f26944w = GLES20.glGetUniformLocation(this.f26938t, "sourceImage");
                            this.f26946x = GLES20.glGetUniformLocation(this.f26938t, "shadows");
                            this.f26948y = GLES20.glGetUniformLocation(this.f26938t, "highlights");
                            this.f26950z = GLES20.glGetUniformLocation(this.f26938t, "exposure");
                            this.f26857A = GLES20.glGetUniformLocation(this.f26938t, "contrast");
                            this.f26859B = GLES20.glGetUniformLocation(this.f26938t, "saturation");
                            this.f26861C = GLES20.glGetUniformLocation(this.f26938t, "warmth");
                            this.f26863D = GLES20.glGetUniformLocation(this.f26938t, "vignette");
                            this.f26865E = GLES20.glGetUniformLocation(this.f26938t, "grain");
                            this.f26867F = GLES20.glGetUniformLocation(this.f26938t, "width");
                            this.f26869G = GLES20.glGetUniformLocation(this.f26938t, "height");
                            this.f26871H = GLES20.glGetUniformLocation(this.f26938t, "curvesImage");
                            this.f26873I = GLES20.glGetUniformLocation(this.f26938t, "skipTone");
                            this.f26875J = GLES20.glGetUniformLocation(this.f26938t, "fadeAmount");
                            this.f26877K = GLES20.glGetUniformLocation(this.f26938t, "shadowsTintIntensity");
                            this.f26879L = GLES20.glGetUniformLocation(this.f26938t, "highlightsTintIntensity");
                            this.f26881M = GLES20.glGetUniformLocation(this.f26938t, "shadowsTintColor");
                            this.f26883N = GLES20.glGetUniformLocation(this.f26938t, "highlightsTintColor");
                        }
                        int K3 = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;uniform highp float inputWidth;uniform highp float inputHeight;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;void main() {gl_Position = position;texCoord = inputTexCoord;highp vec2 widthStep = vec2(1.0 / inputWidth, 0.0);highp vec2 heightStep = vec2(0.0, 1.0 / inputHeight);leftTexCoord = inputTexCoord - widthStep;rightTexCoord = inputTexCoord + widthStep;topTexCoord = inputTexCoord + heightStep;bottomTexCoord = inputTexCoord - heightStep;}");
                        int K4 = m12871K(35632, "precision highp float;varying vec2 texCoord;varying vec2 leftTexCoord;varying vec2 rightTexCoord;varying vec2 topTexCoord;varying vec2 bottomTexCoord;uniform sampler2D sourceImage;uniform float sharpen;void main() {vec4 result = texture2D(sourceImage, texCoord);vec3 leftTextureColor = texture2D(sourceImage, leftTexCoord).rgb;vec3 rightTextureColor = texture2D(sourceImage, rightTexCoord).rgb;vec3 topTextureColor = texture2D(sourceImage, topTexCoord).rgb;vec3 bottomTextureColor = texture2D(sourceImage, bottomTexCoord).rgb;result.rgb = result.rgb * (1.0 + 4.0 * sharpen) - (leftTextureColor + rightTextureColor + topTextureColor + bottomTextureColor) * sharpen;gl_FragColor = result;}");
                        if (K3 == 0 || K4 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram2 = GLES20.glCreateProgram();
                        this.f26927n0 = glCreateProgram2;
                        GLES20.glAttachShader(glCreateProgram2, K3);
                        GLES20.glAttachShader(this.f26927n0, K4);
                        GLES20.glBindAttribLocation(this.f26927n0, 0, "position");
                        GLES20.glBindAttribLocation(this.f26927n0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26927n0);
                        int[] iArr3 = new int[1];
                        GLES20.glGetProgramiv(this.f26927n0, 35714, iArr3, 0);
                        if (iArr3[0] == 0) {
                            GLES20.glDeleteProgram(this.f26927n0);
                            this.f26927n0 = 0;
                        } else {
                            this.f26935r0 = GLES20.glGetAttribLocation(this.f26927n0, "position");
                            this.f26937s0 = GLES20.glGetAttribLocation(this.f26927n0, "inputTexCoord");
                            this.f26939t0 = GLES20.glGetUniformLocation(this.f26927n0, "sourceImage");
                            this.f26931p0 = GLES20.glGetUniformLocation(this.f26927n0, "inputWidth");
                            this.f26933q0 = GLES20.glGetUniformLocation(this.f26927n0, "inputHeight");
                            this.f26929o0 = GLES20.glGetUniformLocation(this.f26927n0, "sharpen");
                        }
                        int K5 = m12871K(35633, "attribute vec4 position;attribute vec4 inputTexCoord;uniform highp float texelWidthOffset;uniform highp float texelHeightOffset;varying vec2 blurCoordinates[9];void main() {gl_Position = position;vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);blurCoordinates[0] = inputTexCoord.xy;blurCoordinates[1] = inputTexCoord.xy + singleStepOffset * 1.458430;blurCoordinates[2] = inputTexCoord.xy - singleStepOffset * 1.458430;blurCoordinates[3] = inputTexCoord.xy + singleStepOffset * 3.403985;blurCoordinates[4] = inputTexCoord.xy - singleStepOffset * 3.403985;blurCoordinates[5] = inputTexCoord.xy + singleStepOffset * 5.351806;blurCoordinates[6] = inputTexCoord.xy - singleStepOffset * 5.351806;blurCoordinates[7] = inputTexCoord.xy + singleStepOffset * 7.302940;blurCoordinates[8] = inputTexCoord.xy - singleStepOffset * 7.302940;}");
                        int K6 = m12871K(35632, "uniform sampler2D sourceImage;varying highp vec2 blurCoordinates[9];void main() {lowp vec4 sum = vec4(0.0);sum += texture2D(sourceImage, blurCoordinates[0]) * 0.133571;sum += texture2D(sourceImage, blurCoordinates[1]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[2]) * 0.233308;sum += texture2D(sourceImage, blurCoordinates[3]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[4]) * 0.135928;sum += texture2D(sourceImage, blurCoordinates[5]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[6]) * 0.051383;sum += texture2D(sourceImage, blurCoordinates[7]) * 0.012595;sum += texture2D(sourceImage, blurCoordinates[8]) * 0.012595;gl_FragColor = sum;}");
                        if (K5 == 0 || K6 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram3 = GLES20.glCreateProgram();
                        this.f26885O = glCreateProgram3;
                        GLES20.glAttachShader(glCreateProgram3, K5);
                        GLES20.glAttachShader(this.f26885O, K6);
                        GLES20.glBindAttribLocation(this.f26885O, 0, "position");
                        GLES20.glBindAttribLocation(this.f26885O, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26885O);
                        int[] iArr4 = new int[1];
                        GLES20.glGetProgramiv(this.f26885O, 35714, iArr4, 0);
                        if (iArr4[0] == 0) {
                            GLES20.glDeleteProgram(this.f26885O);
                            this.f26885O = 0;
                        } else {
                            this.f26887P = GLES20.glGetAttribLocation(this.f26885O, "position");
                            this.f26889Q = GLES20.glGetAttribLocation(this.f26885O, "inputTexCoord");
                            this.f26891R = GLES20.glGetUniformLocation(this.f26885O, "sourceImage");
                            this.f26892S = GLES20.glGetUniformLocation(this.f26885O, "texelWidthOffset");
                            this.f26893T = GLES20.glGetUniformLocation(this.f26885O, "texelHeightOffset");
                        }
                        int K7 = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K8 = m12871K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float angle;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = abs((texCoordToUse.x - excludePoint.x) * aspectRatio * cos(angle) + (texCoordToUse.y - excludePoint.y) * sin(angle));gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (K7 == 0 || K8 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram4 = GLES20.glCreateProgram();
                        this.f26894U = glCreateProgram4;
                        GLES20.glAttachShader(glCreateProgram4, K7);
                        GLES20.glAttachShader(this.f26894U, K8);
                        GLES20.glBindAttribLocation(this.f26894U, 0, "position");
                        GLES20.glBindAttribLocation(this.f26894U, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26894U);
                        int[] iArr5 = new int[1];
                        GLES20.glGetProgramiv(this.f26894U, 35714, iArr5, 0);
                        if (iArr5[0] == 0) {
                            GLES20.glDeleteProgram(this.f26894U);
                            this.f26894U = 0;
                        } else {
                            this.f26895V = GLES20.glGetAttribLocation(this.f26894U, "position");
                            this.f26896W = GLES20.glGetAttribLocation(this.f26894U, "inputTexCoord");
                            this.f26897X = GLES20.glGetUniformLocation(this.f26894U, "sourceImage");
                            this.f26898Y = GLES20.glGetUniformLocation(this.f26894U, "inputImageTexture2");
                            this.f26899Z = GLES20.glGetUniformLocation(this.f26894U, "excludeSize");
                            this.f26901a0 = GLES20.glGetUniformLocation(this.f26894U, "excludePoint");
                            this.f26903b0 = GLES20.glGetUniformLocation(this.f26894U, "excludeBlurSize");
                            this.f26905c0 = GLES20.glGetUniformLocation(this.f26894U, "angle");
                            this.f26907d0 = GLES20.glGetUniformLocation(this.f26894U, "aspectRatio");
                        }
                        int K9 = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K10 = m12871K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform lowp float excludeSize;uniform lowp vec2 excludePoint;uniform lowp float excludeBlurSize;uniform highp float aspectRatio;void main() {lowp vec4 sharpImageColor = texture2D(sourceImage, texCoord);lowp vec4 blurredImageColor = texture2D(inputImageTexture2, texCoord);highp vec2 texCoordToUse = vec2(texCoord.x, (texCoord.y * aspectRatio + 0.5 - 0.5 * aspectRatio));highp float distanceFromCenter = distance(excludePoint, texCoordToUse);gl_FragColor = mix(sharpImageColor, blurredImageColor, smoothstep(excludeSize - excludeBlurSize, excludeSize, distanceFromCenter));}");
                        if (K9 == 0 || K10 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram5 = GLES20.glCreateProgram();
                        this.f26909e0 = glCreateProgram5;
                        GLES20.glAttachShader(glCreateProgram5, K9);
                        GLES20.glAttachShader(this.f26909e0, K10);
                        GLES20.glBindAttribLocation(this.f26909e0, 0, "position");
                        GLES20.glBindAttribLocation(this.f26909e0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26909e0);
                        int[] iArr6 = new int[1];
                        GLES20.glGetProgramiv(this.f26909e0, 35714, iArr6, 0);
                        if (iArr6[0] == 0) {
                            GLES20.glDeleteProgram(this.f26909e0);
                            this.f26909e0 = 0;
                        } else {
                            this.f26911f0 = GLES20.glGetAttribLocation(this.f26909e0, "position");
                            this.f26913g0 = GLES20.glGetAttribLocation(this.f26909e0, "inputTexCoord");
                            this.f26915h0 = GLES20.glGetUniformLocation(this.f26909e0, "sourceImage");
                            this.f26917i0 = GLES20.glGetUniformLocation(this.f26909e0, "inputImageTexture2");
                            this.f26919j0 = GLES20.glGetUniformLocation(this.f26909e0, "excludeSize");
                            this.f26921k0 = GLES20.glGetUniformLocation(this.f26909e0, "excludePoint");
                            this.f26923l0 = GLES20.glGetUniformLocation(this.f26909e0, "excludeBlurSize");
                            this.f26925m0 = GLES20.glGetUniformLocation(this.f26909e0, "aspectRatio");
                        }
                        int K11 = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K12 = m12871K(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;vec3 rgb_to_hsv(vec3 c) {vec4 K = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);vec4 p = c.g < c.b ? vec4(c.bg, K.wz) : vec4(c.gb, K.xy);vec4 q = c.r < p.x ? vec4(p.xyw, c.r) : vec4(c.r, p.yzx);float d = q.x - min(q.w, q.y);float e = 1.0e-10;return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);}void main() {vec4 texel = texture2D(sourceImage, texCoord);gl_FragColor = vec4(rgb_to_hsv(texel.rgb), texel.a);}");
                        if (K11 == 0 || K12 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram6 = GLES20.glCreateProgram();
                        this.f26918j = glCreateProgram6;
                        GLES20.glAttachShader(glCreateProgram6, K11);
                        GLES20.glAttachShader(this.f26918j, K12);
                        GLES20.glBindAttribLocation(this.f26918j, 0, "position");
                        GLES20.glBindAttribLocation(this.f26918j, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26918j);
                        int[] iArr7 = new int[1];
                        GLES20.glGetProgramiv(this.f26918j, 35714, iArr7, 0);
                        if (iArr7[0] == 0) {
                            GLES20.glDeleteProgram(this.f26918j);
                            this.f26918j = 0;
                        } else {
                            this.f26920k = GLES20.glGetAttribLocation(this.f26918j, "position");
                            this.f26922l = GLES20.glGetAttribLocation(this.f26918j, "inputTexCoord");
                            this.f26924m = GLES20.glGetUniformLocation(this.f26918j, "sourceImage");
                        }
                        int K13 = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K14 = m12871K(35632, "precision highp float;varying vec2 texCoord;uniform sampler2D sourceImage;uniform sampler2D inputImageTexture2;uniform float intensity;float enhance(float value) {const vec2 offset = vec2(0.001953125, 0.03125);value = value + offset.x;vec2 coord = (clamp(texCoord, 0.125, 1.0 - 0.125001) - 0.125) * 4.0;vec2 frac = fract(coord);coord = floor(coord);float p00 = float(coord.y * 4.0 + coord.x) * 0.0625 + offset.y;float p01 = float(coord.y * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;float p10 = float((coord.y + 1.0) * 4.0 + coord.x) * 0.0625 + offset.y;float p11 = float((coord.y + 1.0) * 4.0 + coord.x + 1.0) * 0.0625 + offset.y;vec3 c00 = texture2D(inputImageTexture2, vec2(value, p00)).rgb;vec3 c01 = texture2D(inputImageTexture2, vec2(value, p01)).rgb;vec3 c10 = texture2D(inputImageTexture2, vec2(value, p10)).rgb;vec3 c11 = texture2D(inputImageTexture2, vec2(value, p11)).rgb;float c1 = ((c00.r - c00.g) / (c00.b - c00.g));float c2 = ((c01.r - c01.g) / (c01.b - c01.g));float c3 = ((c10.r - c10.g) / (c10.b - c10.g));float c4 = ((c11.r - c11.g) / (c11.b - c11.g));float c1_2 = mix(c1, c2, frac.x);float c3_4 = mix(c3, c4, frac.x);return mix(c1_2, c3_4, frac.y);}vec3 hsv_to_rgb(vec3 c) {vec4 K = vec4(1.0, 2.0 / 3.0, 1.0 / 3.0, 3.0);vec3 p = abs(fract(c.xxx + K.xyz) * 6.0 - K.www);return c.z * mix(K.xxx, clamp(p - K.xxx, 0.0, 1.0), c.y);}void main() {vec4 texel = texture2D(sourceImage, texCoord);vec4 hsv = texel;hsv.y = min(1.0, hsv.y * 1.2);hsv.z = min(1.0, enhance(hsv.z) * 1.1);gl_FragColor = vec4(hsv_to_rgb(mix(texel.xyz, hsv.xyz, intensity)), texel.w);}");
                        if (K13 == 0 || K14 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram7 = GLES20.glCreateProgram();
                        this.f26926n = glCreateProgram7;
                        GLES20.glAttachShader(glCreateProgram7, K13);
                        GLES20.glAttachShader(this.f26926n, K14);
                        GLES20.glBindAttribLocation(this.f26926n, 0, "position");
                        GLES20.glBindAttribLocation(this.f26926n, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26926n);
                        int[] iArr8 = new int[1];
                        GLES20.glGetProgramiv(this.f26926n, 35714, iArr8, 0);
                        if (iArr8[0] == 0) {
                            GLES20.glDeleteProgram(this.f26926n);
                            this.f26926n = 0;
                        } else {
                            this.f26928o = GLES20.glGetAttribLocation(this.f26926n, "position");
                            this.f26930p = GLES20.glGetAttribLocation(this.f26926n, "inputTexCoord");
                            this.f26932q = GLES20.glGetUniformLocation(this.f26926n, "sourceImage");
                            this.f26934r = GLES20.glGetUniformLocation(this.f26926n, "intensity");
                            this.f26936s = GLES20.glGetUniformLocation(this.f26926n, "inputImageTexture2");
                        }
                        int K15 = m12871K(35633, "attribute vec4 position;attribute vec2 inputTexCoord;varying vec2 texCoord;void main() {gl_Position = position;texCoord = inputTexCoord;}");
                        int K16 = m12871K(35632, "varying highp vec2 texCoord;uniform sampler2D sourceImage;void main() {gl_FragColor = texture2D(sourceImage, texCoord);}");
                        if (K15 == 0 || K16 == 0) {
                            m12845o();
                            return false;
                        }
                        int glCreateProgram8 = GLES20.glCreateProgram();
                        this.f26941u0 = glCreateProgram8;
                        GLES20.glAttachShader(glCreateProgram8, K15);
                        GLES20.glAttachShader(this.f26941u0, K16);
                        GLES20.glBindAttribLocation(this.f26941u0, 0, "position");
                        GLES20.glBindAttribLocation(this.f26941u0, 1, "inputTexCoord");
                        GLES20.glLinkProgram(this.f26941u0);
                        int[] iArr9 = new int[1];
                        GLES20.glGetProgramiv(this.f26941u0, 35714, iArr9, 0);
                        if (iArr9[0] == 0) {
                            GLES20.glDeleteProgram(this.f26941u0);
                            this.f26941u0 = 0;
                        } else {
                            this.f26943v0 = GLES20.glGetAttribLocation(this.f26941u0, "position");
                            this.f26945w0 = GLES20.glGetAttribLocation(this.f26941u0, "inputTexCoord");
                            this.f26947x0 = GLES20.glGetUniformLocation(this.f26941u0, "sourceImage");
                        }
                        Bitmap bitmap = this.f26916i;
                        if (bitmap != null) {
                            m12870L(bitmap);
                        }
                        return true;
                    }
                } else {
                    m12845o();
                    return false;
                }
            } else {
                Log.m14724e("eglConfig not initialized", new Object[0]);
                m12845o();
                return false;
            }
        }
    }

    public final int m12871K(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m14724e(GLES20.glGetShaderInfoLog(glCreateShader), new Object[0]);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final void m12870L(Bitmap bitmap) {
        this.f26866E0 = bitmap.getWidth();
        this.f26868F0 = bitmap.getHeight();
        GLES20.glGenFramebuffers(3, this.f26858A0, 0);
        GLES20.glGenTextures(3, this.f26951z0, 0);
        GLES20.glBindTexture(3553, this.f26951z0[0]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.f26866E0, this.f26868F0, 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, this.f26951z0[1]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLUtils.texImage2D(3553, 0, this.f26916i, 0);
        GLES20.glBindTexture(3553, this.f26951z0[2]);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, this.f26866E0, this.f26868F0, 0, 6408, 5121, null);
    }

    public void m12869M() {
        C4384m mVar = this.f26884N0;
        mVar.m28050h(Message.obtain(mVar.m28053d(), 4), 0L);
    }

    public final void m12868N() {
        if (!this.f26886O0) {
            this.f26886O0 = true;
        }
    }

    public final void m12867O() {
        if (this.f26880L0 && !this.f26886O0) {
            if (!this.f26908e.equals(this.f26902b.eglGetCurrentContext()) || !this.f26910f.equals(this.f26902b.eglGetCurrentSurface(12377))) {
                EGL10 egl10 = this.f26902b;
                EGLDisplay eGLDisplay = this.f26904c;
                EGLSurface eGLSurface = this.f26910f;
                if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f26908e)) {
                    Log.m14724e("eglMakeCurrent failed %s", C7389v0.m16585s0(this.f26902b.eglGetError()));
                    return;
                }
            }
            GLES20.glViewport(0, 0, this.f26866E0, this.f26868F0);
            m12848l();
            m12847m();
            m12849k();
            this.f26890Q0 = m12850j();
            GLES20.glViewport(0, 0, this.f26870G0, this.f26872H0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(0);
            GLES20.glUseProgram(this.f26941u0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26951z0[1 ^ (this.f26890Q0 ? 1 : 0)]);
            GLES20.glUniform1i(this.f26947x0, 0);
            GLES20.glEnableVertexAttribArray(this.f26945w0);
            GLES20.glVertexAttribPointer(this.f26945w0, 2, 5126, false, 8, (Buffer) this.f26876J0);
            GLES20.glEnableVertexAttribArray(this.f26943v0);
            GLES20.glVertexAttribPointer(this.f26943v0, 2, 5126, false, 8, (Buffer) this.f26874I0);
            GLES20.glDrawArrays(5, 0, 4);
            this.f26902b.eglSwapBuffers(this.f26904c, this.f26910f);
        }
    }

    public void m12866P(boolean z) {
        m12865Q(z, false);
    }

    public void m12865Q(boolean z, boolean z2) {
        C4384m mVar = this.f26884N0;
        mVar.m28050h(Message.obtain(mVar.m28053d(), 2, z ? 1 : 0, z2 ? 1 : 0), 0L);
    }

    public final void m12864R(boolean z, boolean z2) {
        if (!this.f26888P0) {
            this.f26888P0 = z;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z2 || currentTimeMillis - this.f26912g > 30) {
            this.f26912g = currentTimeMillis;
            m12867O();
        }
    }

    public void m12863S(Bitmap bitmap, C8111a aVar) {
        C4384m mVar = this.f26884N0;
        mVar.m28050h(Message.obtain(mVar.m28053d(), 3, new Object[]{bitmap, aVar}), 0L);
    }

    public final void m12862T(Bitmap bitmap, C8111a aVar) {
        this.f26916i = bitmap;
        this.f26882M0 = aVar;
        m12870L(bitmap);
        this.f26886O0 = false;
        m12864R(true, true);
    }

    public void m12861U(int i, int i2) {
        this.f26870G0 = i;
        this.f26872H0 = i2;
    }

    public final boolean m12860V() {
        return true;
    }

    public void m12851i() {
        C4384m mVar = this.f26884N0;
        mVar.m28050h(Message.obtain(mVar.m28053d(), 0), 0L);
    }

    public final boolean m12850j() {
        int j = this.f26882M0.m13576j(14);
        if (this.f26864D0 || j == 0) {
            return false;
        }
        if (this.f26888P0) {
            GLES20.glUseProgram(this.f26885O);
            GLES20.glUniform1i(this.f26891R, 0);
            GLES20.glEnableVertexAttribArray(this.f26889Q);
            GLES20.glVertexAttribPointer(this.f26889Q, 2, 5126, false, 8, (Buffer) this.f26876J0);
            GLES20.glEnableVertexAttribArray(this.f26887P);
            GLES20.glVertexAttribPointer(this.f26887P, 2, 5126, false, 8, (Buffer) this.f26878K0);
            GLES20.glBindFramebuffer(36160, this.f26858A0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[0], 0);
            GLES20.glClear(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26951z0[1]);
            GLES20.glUniform1f(this.f26892S, 0.0f);
            GLES20.glUniform1f(this.f26893T, 1.0f / this.f26868F0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glBindFramebuffer(36160, this.f26858A0[2]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[2], 0);
            GLES20.glClear(0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26951z0[0]);
            GLES20.glUniform1f(this.f26892S, 1.0f / this.f26866E0);
            GLES20.glUniform1f(this.f26893T, 0.0f);
            GLES20.glDrawArrays(5, 0, 4);
            this.f26888P0 = false;
        }
        float e = this.f26882M0.m13581e();
        float d = this.f26882M0.m13582d();
        float f = this.f26882M0.m13580f();
        float g = this.f26882M0.m13579g();
        GLES20.glBindFramebuffer(36160, this.f26858A0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[0], 0);
        GLES20.glClear(0);
        if (j == 1) {
            GLES20.glUseProgram(this.f26909e0);
            GLES20.glUniform1i(this.f26915h0, 0);
            GLES20.glUniform1i(this.f26917i0, 1);
            GLES20.glUniform1f(this.f26919j0, e);
            GLES20.glUniform1f(this.f26923l0, d);
            GLES20.glUniform2f(this.f26921k0, f, g);
            GLES20.glUniform1f(this.f26925m0, this.f26868F0 / this.f26866E0);
            GLES20.glEnableVertexAttribArray(this.f26913g0);
            GLES20.glVertexAttribPointer(this.f26913g0, 2, 5126, false, 8, (Buffer) this.f26876J0);
            GLES20.glEnableVertexAttribArray(this.f26911f0);
            GLES20.glVertexAttribPointer(this.f26911f0, 2, 5126, false, 8, (Buffer) this.f26878K0);
        } else if (j == 2) {
            GLES20.glUseProgram(this.f26894U);
            GLES20.glUniform1i(this.f26897X, 0);
            GLES20.glUniform1i(this.f26898Y, 1);
            GLES20.glUniform1f(this.f26899Z, e);
            GLES20.glUniform1f(this.f26903b0, d);
            GLES20.glUniform1f(this.f26905c0, this.f26882M0.m13583c());
            GLES20.glUniform2f(this.f26901a0, f, g);
            GLES20.glUniform1f(this.f26907d0, this.f26868F0 / this.f26866E0);
            GLES20.glEnableVertexAttribArray(this.f26896W);
            GLES20.glVertexAttribPointer(this.f26896W, 2, 5126, false, 8, (Buffer) this.f26876J0);
            GLES20.glEnableVertexAttribArray(this.f26895V);
            GLES20.glVertexAttribPointer(this.f26895V, 2, 5126, false, 8, (Buffer) this.f26878K0);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26951z0[1]);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f26951z0[2]);
        GLES20.glDrawArrays(5, 0, 4);
        return true;
    }

    public final void m12849k() {
        GLES20.glBindFramebuffer(36160, this.f26858A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f26938t);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26951z0[0]);
        GLES20.glUniform1i(this.f26944w, 0);
        float f = 1.0f;
        if (this.f26864D0) {
            GLES20.glUniform1f(this.f26946x, 1.0f);
            GLES20.glUniform1f(this.f26948y, 1.0f);
            GLES20.glUniform1f(this.f26950z, 0.0f);
            GLES20.glUniform1f(this.f26857A, 1.0f);
            GLES20.glUniform1f(this.f26859B, 1.0f);
            GLES20.glUniform1f(this.f26861C, 0.0f);
            GLES20.glUniform1f(this.f26863D, 0.0f);
            GLES20.glUniform1f(this.f26865E, 0.0f);
            GLES20.glUniform1f(this.f26875J, 0.0f);
            GLES20.glUniform3f(this.f26883N, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f26879L, 0.0f);
            GLES20.glUniform3f(this.f26881M, 0.0f, 0.0f, 0.0f);
            GLES20.glUniform1f(this.f26877K, 0.0f);
            GLES20.glUniform1f(this.f26873I, 1.0f);
        } else {
            int j = this.f26882M0.m13576j(13);
            int j2 = this.f26882M0.m13576j(11);
            int N = j != 0 ? C11524j.m228N(j) : 0;
            int N2 = j2 != 0 ? C11524j.m228N(j2) : 0;
            GLES20.glUniform1f(this.f26946x, m12880B());
            GLES20.glUniform1f(this.f26948y, m12835y());
            GLES20.glUniform1f(this.f26950z, m12839u());
            GLES20.glUniform1f(this.f26857A, m12842r());
            GLES20.glUniform1f(this.f26859B, m12881A());
            GLES20.glUniform1f(this.f26861C, m12874H());
            GLES20.glUniform1f(this.f26863D, m12875G());
            GLES20.glUniform1f(this.f26865E, m12836x());
            GLES20.glUniform1f(this.f26875J, m12837w());
            GLES20.glUniform3f(this.f26883N, ((N >> 16) & 255) / 255.0f, ((N >> 8) & 255) / 255.0f, (N & 255) / 255.0f);
            GLES20.glUniform1f(this.f26879L, m12878D());
            GLES20.glUniform3f(this.f26881M, ((N2 >> 16) & 255) / 255.0f, ((N2 >> 8) & 255) / 255.0f, (N2 & 255) / 255.0f);
            GLES20.glUniform1f(this.f26877K, m12877E());
            boolean V = m12860V();
            int i = this.f26873I;
            if (!V) {
                f = 0.0f;
            }
            GLES20.glUniform1f(i, f);
            if (!V) {
                m12846n();
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.f26860B0[0]);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexImage2D(3553, 0, 6408, 200, 1, 0, 6408, 5121, m12841s());
                GLES20.glUniform1i(this.f26871H, 1);
            }
        }
        GLES20.glUniform1f(this.f26867F, this.f26866E0);
        GLES20.glUniform1f(this.f26869G, this.f26868F0);
        GLES20.glEnableVertexAttribArray(this.f26942v);
        GLES20.glVertexAttribPointer(this.f26942v, 2, 5126, false, 8, (Buffer) this.f26876J0);
        GLES20.glEnableVertexAttribArray(this.f26940u);
        GLES20.glVertexAttribPointer(this.f26940u, 2, 5126, false, 8, (Buffer) this.f26878K0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m12848l() {
        if (!this.f26862C0) {
            GLES20.glBindFramebuffer(36160, this.f26858A0[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[0], 0);
            GLES20.glClear(0);
            GLES20.glUseProgram(this.f26918j);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.f26951z0[1]);
            GLES20.glUniform1i(this.f26924m, 0);
            GLES20.glEnableVertexAttribArray(this.f26922l);
            GLES20.glVertexAttribPointer(this.f26922l, 2, 5126, false, 8, (Buffer) this.f26876J0);
            GLES20.glEnableVertexAttribArray(this.f26920k);
            GLES20.glVertexAttribPointer(this.f26920k, 2, 5126, false, 8, (Buffer) this.f26874I0);
            GLES20.glDrawArrays(5, 0, 4);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f26866E0 * this.f26868F0 * 4);
            GLES20.glReadPixels(0, 0, this.f26866E0, this.f26868F0, 6408, 5121, allocateDirect);
            GLES20.glBindTexture(3553, this.f26949y0[0]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, this.f26866E0, this.f26868F0, 0, 6408, 5121, allocateDirect);
            ByteBuffer byteBuffer = null;
            try {
                byteBuffer = ByteBuffer.allocateDirect(Log.TAG_VIDEO);
                C7888N.calcCDT(allocateDirect, this.f26866E0, this.f26868F0, byteBuffer);
            } catch (Throwable th) {
                Log.m14725e("Cannot allocate buffer for CDT", th, new Object[0]);
            }
            GLES20.glBindTexture(3553, this.f26949y0[1]);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glTexImage2D(3553, 0, 6408, Log.TAG_CRASH, 16, 0, 6408, 5121, byteBuffer);
            this.f26862C0 = true;
        }
        GLES20.glBindFramebuffer(36160, this.f26858A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[1], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f26926n);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26949y0[0]);
        GLES20.glUniform1i(this.f26932q, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f26949y0[1]);
        GLES20.glUniform1i(this.f26936s, 1);
        if (this.f26864D0) {
            GLES20.glUniform1f(this.f26934r, 0.0f);
        } else {
            GLES20.glUniform1f(this.f26934r, m12840t());
        }
        GLES20.glEnableVertexAttribArray(this.f26930p);
        GLES20.glVertexAttribPointer(this.f26930p, 2, 5126, false, 8, (Buffer) this.f26876J0);
        GLES20.glEnableVertexAttribArray(this.f26928o);
        GLES20.glVertexAttribPointer(this.f26928o, 2, 5126, false, 8, (Buffer) this.f26874I0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m12847m() {
        GLES20.glBindFramebuffer(36160, this.f26858A0[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[0], 0);
        GLES20.glClear(0);
        GLES20.glUseProgram(this.f26927n0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f26951z0[1]);
        GLES20.glUniform1i(this.f26939t0, 0);
        if (this.f26864D0) {
            GLES20.glUniform1f(this.f26929o0, 0.0f);
        } else {
            GLES20.glUniform1f(this.f26929o0, m12879C());
        }
        GLES20.glUniform1f(this.f26931p0, this.f26866E0);
        GLES20.glUniform1f(this.f26933q0, this.f26868F0);
        GLES20.glEnableVertexAttribArray(this.f26937s0);
        GLES20.glVertexAttribPointer(this.f26937s0, 2, 5126, false, 8, (Buffer) this.f26876J0);
        GLES20.glEnableVertexAttribArray(this.f26935r0);
        GLES20.glVertexAttribPointer(this.f26935r0, 2, 5126, false, 8, (Buffer) this.f26878K0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    public final void m12846n() {
    }

    public final void m12845o() {
        if (this.f26910f != null) {
            EGL10 egl10 = this.f26902b;
            EGLDisplay eGLDisplay = this.f26904c;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f26902b.eglDestroySurface(this.f26904c, this.f26910f);
            this.f26910f = null;
        }
        EGLContext eGLContext = this.f26908e;
        if (eGLContext != null) {
            this.f26902b.eglDestroyContext(this.f26904c, eGLContext);
            this.f26908e = null;
        }
        EGLDisplay eGLDisplay2 = this.f26904c;
        if (eGLDisplay2 != null) {
            this.f26902b.eglTerminate(eGLDisplay2);
            this.f26904c = null;
        }
    }

    public void m12844p(AbstractC8323a aVar) {
        C4384m mVar = this.f26884N0;
        mVar.m28050h(Message.obtain(mVar.m28053d(), 5, aVar), 0L);
    }

    public final void m12843q(final AbstractC8323a aVar) {
        GLES20.glBindFramebuffer(36160, this.f26858A0[1]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f26951z0[1 ^ (this.f26890Q0 ? 1 : 0)], 0);
        GLES20.glClear(0);
        final Bitmap z = m12834z();
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClear(0);
        C1379j0.m37334d0(new Runnable() {
            @Override
            public final void run() {
                AbstractC8323a.this.mo12882a(z);
            }
        });
    }

    public final float m12842r() {
        return (m12838v(2) * 0.3f) + 1.0f;
    }

    public final ByteBuffer m12841s() {
        return null;
    }

    public final float m12840t() {
        return m12838v(0);
    }

    public final float m12839u() {
        return m12838v(1);
    }

    public final float m12838v(int i) {
        return this.f26882M0.m13578h(i);
    }

    public final float m12837w() {
        return this.f26882M0.m13578h(5);
    }

    public final float m12836x() {
        return m12838v(7) * 0.04f;
    }

    public final float m12835y() {
        return ((m12876F(12) * 0.75f) + 100.0f) / 100.0f;
    }

    public final Bitmap m12834z() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f26866E0 * this.f26868F0 * 4);
        GLES20.glReadPixels(0, 0, this.f26866E0, this.f26868F0, 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(this.f26866E0, this.f26868F0, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        return createBitmap;
    }
}
