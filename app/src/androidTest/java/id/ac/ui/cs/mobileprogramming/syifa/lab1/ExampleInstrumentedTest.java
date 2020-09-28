package id.ac.ui.cs.mobileprogramming.syifa.lab1;

import android.content.Context;
import android.widget.*;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void init() {
        activityTestRule.getActivity().getSupportFragmentManager().beginTransaction();
    }

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("id.ac.ui.cs.mobileprogramming.syifa.lab1", appContext.getPackageName());
    }

    @Test
    public void testTextView() {
        MainActivity mainActivity = activityTestRule.getActivity();
        TextView view = mainActivity.findViewById(R.id.textView);
        assertNotNull(view);
    }

    @Test
    public void testEditText() {
        MainActivity mainActivity = activityTestRule.getActivity();
        EditText view = mainActivity.findViewById(R.id.inputText);
        assertNotNull(view);
    }

    @Test
    public void testButton() {
        MainActivity mainActivity = activityTestRule.getActivity();
        Button view = mainActivity.findViewById(R.id.button);
        assertNotNull(view);
    }
}