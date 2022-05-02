package be;

import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Locale;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;
import p350yd.C10930q6;

public class C1367d0 {
    public static C1367d0 f4982c;
    public final String[] f4983a;
    public final String[][] f4984b;

    public C1367d0() {
        String[] strArr = {"1", "US", "USA"};
        this.f4983a = strArr;
        this.f4984b = new String[][]{new String[]{"93", "AF", "Afghanistan"}, new String[]{"355", "AL", "Albania"}, new String[]{"213", "DZ", "Algeria"}, new String[]{"21", "DZ", "Algeria"}, new String[]{"1684", "AS", "American Samoa"}, new String[]{"376", "AD", "Andorra"}, new String[]{"244", "AO", "Angola"}, new String[]{"1264", "AI", "Anguilla"}, new String[]{"1268", "AG", "Antigua and Barbuda"}, new String[]{"54", "AR", "Argentina"}, new String[]{"374", "AM", "Armenia"}, new String[]{"297", "AW", "Aruba"}, new String[]{"61", "AU", "Australia"}, new String[]{"672", "AU", "Australia"}, new String[]{"43", "AT", "Austria"}, new String[]{"994", "AZ", "Azerbaijan"}, new String[]{"1242", "BS", "Bahamas"}, new String[]{"973", "BH", "Bahrain"}, new String[]{"880", "BD", "Bangladesh"}, new String[]{"1246", "BB", "Barbados"}, new String[]{"375", "BY", "Belarus"}, new String[]{"32", "BE", "Belgium"}, new String[]{"501", "BZ", "Belize"}, new String[]{"229", "BJ", "Benin"}, new String[]{"1441", "BM", "Bermuda"}, new String[]{"975", "BT", "Bhutan"}, new String[]{"591", "BO", "Bolivia"}, new String[]{"1721", "SX", "Bonaire, Sint Eustatius and Saba"}, new String[]{"387", "BA", "Bosnia and Herzegovina"}, new String[]{"267", "BW", "Botswana"}, new String[]{"55", "BR", "Brazil"}, new String[]{"1284", "VG", "British Virgin Islands"}, new String[]{"673", "BN", "Brunei Darussalam"}, new String[]{"359", "BG", "Bulgaria"}, new String[]{"226", "BF", "Burkina Faso"}, new String[]{"257", "BI", "Burundi"}, new String[]{"855", "KH", "Cambodia"}, new String[]{"237", "CM", "Cameroon"}, new String[]{"1", "CAN", "Canada"}, new String[]{"238", "CV", "Cape Verde"}, new String[]{"1345", "KY", "Cayman Islands"}, new String[]{"236", "CF", "Central African Republic"}, new String[]{"235", "TD", "Chad"}, new String[]{"56", "CL", "Chile"}, new String[]{"86", "CN", "China"}, new String[]{"57", "CO", "Colombia"}, new String[]{"269", "KM", "Comoros"}, new String[]{"242", "CG", "Congo"}, new String[]{"243", "CD", "Congo, Democratic Republic"}, new String[]{"682", "CK", "Cook Islands"}, new String[]{"506", "CR", "Costa Rica"}, new String[]{"385", "HR", "Croatia"}, new String[]{"53", "CU", "Cuba"}, new String[]{"5999", "CW", "Curaçao"}, new String[]{"357", "CY", "Cyprus"}, new String[]{"420", "CZ", "Czech Republic"}, new String[]{"225", "CI", "Côte d`Ivoire"}, new String[]{"45", "DK", "Denmark"}, new String[]{"253", "DJ", "Djibouti"}, new String[]{"1767", "DM", "Dominica"}, new String[]{"1849", "DO", "Dominican Republic"}, new String[]{"1809", "DO", "Dominican Republic"}, new String[]{"1829", "DO", "Dominican Republic"}, new String[]{"670", "TL", "East Timor"}, new String[]{"593", "EC", "Ecuador"}, new String[]{"20", "EG", "Egypt"}, new String[]{"503", "SV", "El Salvador"}, new String[]{"240", "GQ", "Equatorial Guinea"}, new String[]{"291", "ER", "Eritrea"}, new String[]{"372", "EE", "Estonia"}, new String[]{"251", "ET", "Ethiopia"}, new String[]{"500", "FK", "Falkland Islands"}, new String[]{"298", "FO", "Faroe Islands"}, new String[]{"679", "FJ", "Fiji"}, new String[]{"358", "FI", "Finland"}, new String[]{"33", "FR", "France"}, new String[]{"594", "GF", "French Guiana"}, new String[]{"689", "PF", "French Polynesia"}, new String[]{"241", "GA", "Gabon"}, new String[]{"220", "GM", "Gambia"}, new String[]{"995", "GE", "Georgia"}, new String[]{"49", "DE", "Germany"}, new String[]{"233", "GH", "Ghana"}, new String[]{"350", "GI", "Gibraltar"}, new String[]{"30", "GR", "Greece"}, new String[]{"299", "GL", "Greenland"}, new String[]{"1473", "GD", "Grenada"}, new String[]{"590", "GP", "Guadeloupe"}, new String[]{"1671", "GU", "Guam"}, new String[]{"502", "GT", "Guatemala"}, new String[]{"224", "GN", "Guinea"}, new String[]{"245", "GW", "Guinea-Bissau"}, new String[]{"592", "GY", "Guyana"}, new String[]{"509", "HT", "Haiti"}, new String[]{"504", "HN", "Honduras"}, new String[]{"852", "HK", "Hong Kong"}, new String[]{"36", "HU", "Hungary"}, new String[]{"354", "IS", "Iceland"}, new String[]{"91", "IN", "India"}, new String[]{"62", "ID", "Indonesia"}, new String[]{"98", "IR", "Iran"}, new String[]{"964", "IQ", "Iraq"}, new String[]{"353", "IE", "Ireland"}, new String[]{"972", "IL", "Israel"}, new String[]{"39", "IT", "Italy"}, new String[]{"1876", "JM", "Jamaica"}, new String[]{"81", "JP", "Japan"}, new String[]{"962", "JO", "Jordan"}, new String[]{"77", "KZ", "Kazakhstan"}, new String[]{"254", "KE", "Kenya"}, new String[]{"686", "KI", "Kiribati"}, new String[]{"965", "KW", "Kuwait"}, new String[]{"996", "KG", "Kyrgyzstan"}, new String[]{"856", "LA", "Laos"}, new String[]{"371", "LV", "Latvia"}, new String[]{"961", "LB", "Lebanon"}, new String[]{"266", "LS", "Lesotho"}, new String[]{"231", "LR", "Liberia"}, new String[]{"218", "LY", "Libya"}, new String[]{"423", "LI", "Liechtenstein"}, new String[]{"370", "LT", "Lithuania"}, new String[]{"352", "LU", "Luxembourg"}, new String[]{"853", "MO", "Macau"}, new String[]{"389", "MK", "Macedonia"}, new String[]{"261", "MG", "Madagascar"}, new String[]{"265", "MW", "Malawi"}, new String[]{"60", "MY", "Malaysia"}, new String[]{"960", "MV", "Maldives"}, new String[]{"223", "ML", "Mali"}, new String[]{"356", "MT", "Malta"}, new String[]{"692", "MH", "Marshall Islands"}, new String[]{"596", "MQ", "Martinique"}, new String[]{"222", "MR", "Mauritania"}, new String[]{"230", "MU", "Mauritius"}, new String[]{"52", "MX", "Mexico"}, new String[]{"691", "FM", "Micronesia"}, new String[]{"373", "MD", "Moldova"}, new String[]{"377", "MC", "Monaco"}, new String[]{"976", "MN", "Mongolia"}, new String[]{"382", "ME", "Montenegro"}, new String[]{"1664", "MS", "Montserrat"}, new String[]{"212", "MA", "Morocco"}, new String[]{"258", "MZ", "Mozambique"}, new String[]{"95", "MM", "Myanmar"}, new String[]{"264", "NA", "Namibia"}, new String[]{"674", "NR", "Nauru"}, new String[]{"977", "NP", "Nepal"}, new String[]{"31", "NL", "Netherlands"}, new String[]{"687", "NC", "New Caledonia"}, new String[]{"64", "NZ", "New Zealand"}, new String[]{"505", "NI", "Nicaragua"}, new String[]{"227", "NE", "Niger"}, new String[]{"234", "NG", "Nigeria"}, new String[]{"683", "NU", "Niue"}, new String[]{"6723", "NF", "Norfolk Island"}, new String[]{"850", "KP", "North Korea"}, new String[]{"1670", "MP", "Northern Mariana Islands"}, new String[]{"47", "NO", "Norway"}, new String[]{"968", "OM", "Oman"}, new String[]{"92", "PK", "Pakistan"}, new String[]{"680", "PW", "Palau"}, new String[]{"970", "PS", "Palestine"}, new String[]{"507", "PA", "Panama"}, new String[]{"675", "PG", "Papua New Guinea"}, new String[]{"595", "PY", "Paraguay"}, new String[]{"51", "PE", "Peru"}, new String[]{"63", "PH", "Philippines"}, new String[]{"48", "PL", "Poland"}, new String[]{"351", "PT", "Portugal"}, new String[]{"1939", "PR", "Puerto Rico"}, new String[]{"1787", "PR", "Puerto Rico"}, new String[]{"974", "QA", "Qatar"}, new String[]{"40", "RO", "Romania"}, new String[]{"7", "RU", "Russia"}, new String[]{"250", "RW", "Rwanda"}, new String[]{"262", "RE", "Réunion"}, new String[]{"247", "SH", "Saint Helena"}, new String[]{"290", "SH", "Saint Helena"}, new String[]{"1869", "KN", "Saint Kitts and Nevis"}, new String[]{"1758", "LC", "Saint Lucia"}, new String[]{"508", "PM", "Saint Pierre and Miquelon"}, new String[]{"1784", "VC", "Saint Vincent and the Grenadines"}, new String[]{"685", "WS", "Samoa"}, new String[]{"378", "SM", "San Marino"}, new String[]{"966", "SA", "Saudi Arabia"}, new String[]{"221", "SN", "Senegal"}, new String[]{"381", "RS", "Serbia"}, new String[]{"248", "SC", "Seychelles"}, new String[]{"232", "SL", "Sierra Leone"}, new String[]{"65", "SG", "Singapore"}, new String[]{"599", "BQ", "Sint Maarten"}, new String[]{"421", "SK", "Slovakia"}, new String[]{"386", "SI", "Slovenia"}, new String[]{"677", "SB", "Solomon Islands"}, new String[]{"252", "SO", "Somalia"}, new String[]{"27", "ZA", "South Africa"}, new String[]{"82", "KR", "South Korea"}, new String[]{"211", "SS", "South Sudan"}, new String[]{"34", "ES", "Spain"}, new String[]{"94", "LK", "Sri Lanka"}, new String[]{"249", "SD", "Sudan"}, new String[]{"597", "SR", "Suriname"}, new String[]{"268", "SZ", "Swaziland"}, new String[]{"46", "SE", "Sweden"}, new String[]{"41", "CH", "Switzerland"}, new String[]{"963", "SY", "Syria"}, new String[]{"239", "ST", "São Tomé and Príncipe"}, new String[]{"886", "TW", "Taiwan"}, new String[]{"992", "TJ", "Tajikistan"}, new String[]{"255", "TZ", "Tanzania"}, new String[]{"66", "TH", "Thailand"}, new String[]{"228", "TG", "Togo"}, new String[]{"690", "TK", "Tokelau"}, new String[]{"676", "TO", "Tonga"}, new String[]{"1868", "TT", "Trinidad and Tobago"}, new String[]{"216", "TN", "Tunisia"}, new String[]{"90", "TR", "Turkey"}, new String[]{"993", "TM", "Turkmenistan"}, new String[]{"1649", "TC", "Turks and Caicos Islands"}, new String[]{"688", "TV", "Tuvalu"}, new String[]{"1340", "VI", "US Virgin Islands"}, strArr, new String[]{"256", "UG", "Uganda"}, new String[]{"380", "UA", "Ukraine"}, new String[]{"971", "AE", "United Arab Emirates"}, new String[]{"44", "GB", "United Kingdom"}, new String[]{"246", "IO", "United Kingdom"}, new String[]{"598", "UY", "Uruguay"}, new String[]{"998", "UZ", "Uzbekistan"}, new String[]{"678", "VU", "Vanuatu"}, new String[]{"58", "VE", "Venezuela"}, new String[]{"84", "VN", "Vietnam"}, new String[]{"681", "WF", "Wallis and Futuna"}, new String[]{"967", "YE", "Yemen"}, new String[]{"260", "ZM", "Zambia"}, new String[]{"263", "ZW", "Zimbabwe"}};
    }

    public static C1367d0 m37402h() {
        if (f4982c == null) {
            f4982c = new C1367d0();
        }
        return f4982c;
    }

    public final String[] m37409a(String str) {
        String[][] strArr;
        for (String[] strArr2 : this.f4984b) {
            if (strArr2[1].equals(str)) {
                return strArr2;
            }
        }
        return null;
    }

    public String[] m37408b(String str) {
        String[][] strArr;
        if (C5070i.m24062i(str)) {
            return null;
        }
        if (this.f4983a[0].equals(str)) {
            return this.f4983a;
        }
        int i = -1;
        int i2 = 0;
        for (String[] strArr2 : this.f4984b) {
            if (strArr2[0].equals(str)) {
                return strArr2;
            }
            if (strArr2[0].indexOf(str) == 0) {
                i = i2;
            }
            i2++;
        }
        if (i != -1) {
            return this.f4984b[i];
        }
        return null;
    }

    public String[][] m37407c() {
        return this.f4984b;
    }

    public String[] m37406d() {
        String e = m37405e();
        if (e == null) {
            return null;
        }
        return m37409a(e);
    }

    public String m37405e() {
        TelephonyManager telephonyManager = (TelephonyManager) C1379j0.m37312q().getSystemService("phone");
        if (telephonyManager == null) {
            return m37404f();
        }
        String simCountryIso = telephonyManager.getSimCountryIso();
        if (C5070i.m24062i(simCountryIso)) {
            return m37404f();
        }
        return simCountryIso.toUpperCase();
    }

    public String m37404f() {
        String country = Locale.getDefault().getCountry();
        if (country == null || country.length() == 0) {
            country = Locale.getDefault().getISO3Country();
        }
        if (country == null) {
            return null;
        }
        if (country.length() > 2) {
            country = country.substring(0, 2);
        }
        return country.toUpperCase();
    }

    public String[] m37403g(C10930q6 q6Var) {
        String line1Number;
        String[] a;
        try {
            if (q6Var.m2332n6()) {
                String P1 = q6Var.m2709P1();
                String Q1 = q6Var.m2693Q1();
                return new String[]{P1, C1363c0.m37413w("+" + P1 + Q1).substring(P1.length() + 1)};
            }
            TelephonyManager telephonyManager = (TelephonyManager) C1379j0.m37318n().getSystemService("phone");
            if (telephonyManager != null && Build.VERSION.SDK_INT < 23 && (line1Number = telephonyManager.getLine1Number()) != null && !line1Number.isEmpty()) {
                String D = C1363c0.m37473D(line1Number);
                if (!D.isEmpty() && (a = m37409a(telephonyManager.getSimCountryIso())) != null) {
                    return new String[]{a[0], D.substring(a[0].length())};
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            Log.m14710w("Cannot getLine1Number", th, new Object[0]);
            return null;
        }
    }
}
