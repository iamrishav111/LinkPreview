package iamrishav.linkinflation;

import android.os.Bundle;
import android.webkit.URLUtil;

import androidx.appcompat.app.AppCompatActivity;

import java.net.URL;

public class test extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String text="https://www.codechef.com/ide";
        boolean isValid = URLUtil.isValidUrl( text);
        if(isValid){
            System.out.println("Yes");
        }


    }
}
