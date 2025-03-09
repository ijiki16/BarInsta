package awais.instagrabber.utils;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import awais.instagrabber.R;

import static awais.instagrabber.utils.Utils.settingsHelper;

public final class FlavorTown {
    private static final String TAG = "FlavorTown";
    private static final Pattern VERSION_NAME_PATTERN = Pattern.compile("v?(\\d+\\.\\d+\\.\\d+)(?:_?)(\\w*)(?:-?)(\\w*)");

    private static boolean checking = false;



    private static String getVersion(@NonNull final String versionName) {
        final Matcher matcher = VERSION_NAME_PATTERN.matcher(versionName);
        if (!matcher.matches()) return versionName;
        try {
            return matcher.group(1);
        } catch (Exception e) {
            Log.e(TAG, "getVersion: ", e);
        }
        return versionName;
    }

}