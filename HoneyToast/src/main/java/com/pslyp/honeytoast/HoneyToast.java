package com.pslyp.honeytoast;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;

public class HoneyToast {

    public static Toast custom(@NonNull Context context, @NonNull CharSequence message, @DrawableRes int icon,
                               @ColorInt int tintColor, @ColorInt int textColor, int duration, boolean withIcon) {

        final Toast toast = new Toast(context);
        final LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = inflater.inflate(R.layout.toast_layout, null);
        final ImageView image = layout.findViewById(R.id.icon_image_view);
        final TextView text = layout.findViewById(R.id.message_text_view);

        image.setImageResource(icon);

        text.setText(message);

        GradientDrawable gradientDrawable = (GradientDrawable) AppCompatResources.getDrawable(context, R.drawable.toast_frame);
        gradientDrawable.setColor(tintColor);


        layout.setBackground(gradientDrawable);

        toast.setView(layout);

        return toast;
    }
}
