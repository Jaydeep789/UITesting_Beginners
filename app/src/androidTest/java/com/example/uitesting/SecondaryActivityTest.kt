package com.example.uitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(SecondaryActivity::class.java)

    @Test
    fun test_isActivity_inView() {
        onView(withId(R.id.secondary)).check(matches(isDisplayed()))
    }

    @Test
    fun test_isTitle_inView_Correct() {
        onView(withId(R.id.activity_secondary_title)).check(matches(isDisplayed())).check(
            matches(
                withText(R.string.text_secondaryactivity)
            )
        )
    }

    @Test
    fun test_isButton_inView() {
        onView(withId(R.id.button_back)).check(matches(isDisplayed()))
    }
}