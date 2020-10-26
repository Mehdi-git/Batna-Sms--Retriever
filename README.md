Step 1-Add it in your root build.gradle at the end of repositories:



allprojects {

		repositories {
    
			...
			maven { url 'https://jitpack.io' }
		}
	}


Step 2- Add the dependency



implementation 'com.github.Mehdi-git:Batna-Sms--Retriever:0.1.3'





Step 3- Implement the following service in AndroidManifest.xml:

        <receiver
            android:name="ir.batna.smsretrieverlibrary.SmsRetriever"
            android:enabled="true"
            android:exported="true">
            <intent-filter>
                <action android:name="ir.batna.otpreader.SendBroadcastActivity" />
            </intent-filter>
        </receiver>
        
        
        

  Step 4- Implement the ISmsListener Interface in your activity

public class MainActivity extends ActionBarActivity implements ISmsListener {

    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState):
        setContentView(R.layout.activity_main);
        
        
        //to register the interface
        ISmsListener.bind(this);
    }

    
   @Override
    public void otpReceiver(String otpCode) {
    
    
        //Do whatever you want to do with the text
       
       
    }
}

    

Thats it. otpReceiver will be called when the message is received.
