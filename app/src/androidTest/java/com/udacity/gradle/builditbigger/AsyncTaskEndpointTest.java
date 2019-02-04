package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static android.support.test.espresso.Espresso.onView;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskEndpointTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    //Test if the string which is retrieved by AsyncTask is non-empty
    @Test
    public void buttonRetrivesNonEmptyString() {
        onView(withId(R.id.joke_text_view)).check(matches(not(withText(""))));
    }
}