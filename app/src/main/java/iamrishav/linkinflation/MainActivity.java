package iamrishav.linkinflation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.MalformedURLException;
import java.net.URL;

import io.github.ponnamkarthik.richlinkpreview.RichLinkView;
import io.github.ponnamkarthik.richlinkpreview.ViewListener;

public class MainActivity extends AppCompatActivity {
    RichLinkView richLinkView;
    Button btn;
    EditText editText;
    URL url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        richLinkView = findViewById(R.id.richLinkView);
        btn = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        String text = editText.getText().toString();
        boolean isValid = URLUtil.isValidUrl(text);

        if (isValid) {
            try {
                url = new URL(text);
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        richLinkView.setLink(String.valueOf(url), new ViewListener() {

                            @Override
                            public void onSuccess(boolean status) {

                            }

                            @Override
                            public void onError(Exception e) {

                            }
                        });
                    }
                });
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }

        }

    }
}