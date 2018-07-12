package enjaz.tech.androidanimations.core;

import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.Visibility;

import enjaz.tech.androidanimations.R;

public class Transitions {
    public static Transition buildExplodeEnterTransition() {
        Explode enterTransition = new Explode();
        enterTransition.setDuration(500);
        enterTransition.excludeTarget(R.id.square_red, true);
        return enterTransition;
    }

    public static Visibility buildFadeEnterTransition() {
        Fade enterTransition = new Fade();
        enterTransition.setDuration(500);
        return enterTransition;
    }

    public static Visibility buildSlideReturnTransition() {
        Visibility enterTransition = new Slide();
        enterTransition.setDuration(500);
        return enterTransition;
    }
}
