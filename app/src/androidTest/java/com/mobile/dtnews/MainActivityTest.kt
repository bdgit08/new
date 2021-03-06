package com.mobile.dtnews

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    @Test fun testActivity(){
        launch(MainActivity::class.java)
        onView(withId(R.id.chipGeneral)).perform(click())
        onView(withId(R.id.chipBusiness)).check(matches(isNotChecked()))
        onView(withId(R.id.chipEntertainment)).perform(click())
        onView(withId(R.id.chipEntertainment)).check(matches(isChecked()))
    }

}