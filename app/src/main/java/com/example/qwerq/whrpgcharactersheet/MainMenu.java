package com.example.qwerq.whrpgcharactersheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_menu);
    }

    public void onClickDummy(View v){
        CharSequence text = "Dit doet nog juist niets!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

    public void onClickOpenCharacterSheet(View v){
        Intent intent = new Intent(this, CharacterSheet.class);
        startActivity(intent);
    }
}
