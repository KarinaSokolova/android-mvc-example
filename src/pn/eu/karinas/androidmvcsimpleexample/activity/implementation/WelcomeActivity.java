package pn.eu.karinas.androidmvcsimpleexample.activity.implementation;

import pn.eu.karinas.androidmvcsimpleexample.R;
import android.app.Activity;
import android.os.Bundle;
/**
 * Activity is opened on Login success
 * @author karina sokolova
 *
 */
public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome_layout);
	}
}
