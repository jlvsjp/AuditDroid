package testcase.T_sdcardRead_read_I_01;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	        ReadFromFile.readFileByChars("/storage/sdcard0/test");
	}
}  
     