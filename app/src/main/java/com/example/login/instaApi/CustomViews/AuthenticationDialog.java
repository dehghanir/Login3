package com.example.login.instaApi.CustomViews;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.webkit.WebView;

import com.example.login.instaApi.Constants;
import com.example.login.instaApi.Interfaces.AuthenticationListener;

public class AuthenticationDialog extends Dialog {

    private AuthenticationListener listener;
    private Context context;
    private WebView webView;

    private final String url = Constants.BASE_URL
            +"oauth/authorize/?client_id="
            +Constants.INSTA_CLIENT_ID
            +"&redirect_uri="
            +Constants.REDIRECT_URL
            +"&response_type=code"
            +"&display=touch&scope=public_content";
    https://www.youtube.com/watch?v=QVhy848hVSI&list=PL8ApS86kTh2MHQ3vBJOH_J4mICmy0iunr&index=2


    public AuthenticationDialog(@NonNull Context context, AuthenticationListener listener) {
        super(context);
        this.listener = listener;
    }


}
