package pn.eu.karinas.androidmvcsimpleexample.activity.implementation;

import pn.eu.karinas.androidmvcsimpleexample.R;
import pn.eu.karinas.androidmvcsimpleexample.activity.LoginControllerListener;
import pn.eu.karinas.androidmvcsimpleexample.controller.LoginController;
import pn.eu.karinas.androidmvcsimpleexample.view.LoginView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Activity which displays a login screen to the user.
 */
public class LoginActivity extends Activity implements LoginControllerListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_layout);
		
		//Activity links the view and the controller
		LoginController loginController = new LoginController((LoginView) this.findViewById(R.id.login), this);
		//The Login controller will intercept the events of LoginView
		((LoginView) this.findViewById(R.id.login)).setListeners(loginController);		
	}
	
	/**
	 * Controller calls this method if the login was successful
	 */
	@Override
	public void onLoginSuccess() {
		//We open a new screen
		Intent intent = new Intent(this, WelcomeActivity.class);
		this.startActivity(intent);
	}
}
