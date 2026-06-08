package loc_and_int;

import java.util.Locale;
import java.util.Date;
import java.text.DateFormat;
import java.text.NumberFormat;

public class Localization {
    public static void main(String[] arg) {

        // --------------------------------------------------------
        // 1. LOCALE BASIC USAGE
        // --------------------------------------------------------
        System.out.println("========= BASIC LOCALE INFORMATION =========");

        Locale defaultlocale = Locale.getDefault();

        System.out.println("Default Locale:" + defaultlocale);
        System.out.println("Country Code: " + defaultlocale.getCountry());
        System.out.println("Language Code: " + defaultlocale.getLanguage());
        System.out.println("Display Country: " + defaultlocale.getDisplayCountry());
        System.out.println("Display Language: " + defaultlocale.getDisplayLanguage());
        System.out.println("Display Name: " + defaultlocale.getDisplayName());

        // Creating custom locales
        Locale us = new Locale("en", "US");
        Locale uk = new Locale("en", "UK");
        Locale france = new Locale("fr", "FR");
        Locale japan = new Locale("ja", "JP");
        Locale india = new Locale("hi", "IN");
        Locale italy = Locale.ITALY;


        // --------------------------------------------------------
        // Declare reusable variables here (to avoid errors)
        // --------------------------------------------------------
        Date today = new Date();
        double num = 1234567.89;

        NumberFormat nfUS = NumberFormat.getNumberInstance(us);
        NumberFormat nfDE = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat nfFR = NumberFormat.getNumberInstance(france);
        NumberFormat nfIN = NumberFormat.getNumberInstance(india);


        // --------------------------------------------------------
        // 3. TIME LOCALIZATION
        // --------------------------------------------------------
        System.out.println("\n========= TIME LOCALIZATION =========");

        DateFormat timeUS = DateFormat.getTimeInstance(DateFormat.FULL, us);
        DateFormat timeJP = DateFormat.getTimeInstance(DateFormat.FULL, japan);
        DateFormat timeFR = DateFormat.getTimeInstance(DateFormat.FULL, france);

        System.out.println("US Time: " + timeUS.format(today));
        System.out.println("Japan Time: " + timeJP.format(today));
        System.out.println("France Time: " + timeFR.format(today));

        System.out.println("US       : " + nfUS.format(num));
        System.out.println("GERMANY  : " + nfDE.format(num));
        System.out.println("FRANCE   : " + nfFR.format(num));
        System.out.println("INDIA    : " + nfIN.format(num));


        // --------------------------------------------------------
        // 5. CURRENCY LOCALIZATION
        // --------------------------------------------------------
        System.out.println("\n========= CURRENCY LOCALIZATION =========");

        NumberFormat cUS = NumberFormat.getCurrencyInstance(us);
        NumberFormat cUK = NumberFormat.getCurrencyInstance(uk);
        NumberFormat cFR = NumberFormat.getCurrencyInstance(france);
        NumberFormat cJP = NumberFormat.getCurrencyInstance(japan);
        NumberFormat cIN = NumberFormat.getCurrencyInstance(india);
        NumberFormat cIT = NumberFormat.getCurrencyInstance(italy);

        double price = 4999.50;

        System.out.println("US Dollar      : " + cUS.format(price));
        System.out.println("UK Pound       : " + cUK.format(price));
        System.out.println("France Euro    : " + cFR.format(price));
        System.out.println("Japan Yen      : " + cJP.format(price));
        System.out.println("India Rupee    : " + cIN.format(price));
        System.out.println("Italy Euro     : " + cIT.format(price));


        // --------------------------------------------------------
        // 6. PERCENT LOCALIZATION
        // --------------------------------------------------------
        System.out.println("\n========= PERCENT LOCALIZATION =========");

        NumberFormat pUS = NumberFormat.getPercentInstance(us);
        NumberFormat pFR = NumberFormat.getPercentInstance(france);
        NumberFormat pJP = NumberFormat.getPercentInstance(japan);

        double percentValue = 0.756; // 75.6%

        System.out.println("US Percent     : " + pUS.format(percentValue));
        System.out.println("France Percent : " + pFR.format(percentValue));
        System.out.println("Japan Percent  : " + pJP.format(percentValue));


        // --------------------------------------------------------
        // 7. LISTING ALL AVAILABLE LOCALES
        // --------------------------------------------------------
        System.out.println("\n========= LIST OF ALL AVAILABLE LOCALES =========");

        Locale[] all = Locale.getAvailableLocales();
        for (int i = 0; i < 10; i++) {   // print first 10 for sample
            System.out.println(all[i].getDisplayName() + "  -> " + all[i]);
        }

        System.out.println("\n(Showing only first 10 out of " + all.length + " total locales)");
    }
}

//internalization also has all these
