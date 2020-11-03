package com.cookandroid.helloandroid;
// 클래스의 위치 //디렉토리 위치

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// import 뒤에는 전부 클래스다.

public class MainActivity extends AppCompatActivity {
// extends는 상속이다. extends 뒤에 있는 내용이 앞에 있는 내용으로 상속되는 것이다.
    @Override
    //overloading이 있고 override 가 있는데 overloading은 똑같은 변수도 덮어씌어지는 것이다.
    //상속은 부모의 모든 기능이 가는 것이다. 부모에서 있었는데 자식이 약간 수정하는 것이 override 이다.
    protected void onCreate(Bundle savedInstanceState) {
        // activity를 만들 때 무조건 선언되는 건 onCreate이다.
        super.onCreate(savedInstanceState);
        // super는 부모클래스라는 뜻이다.
        setContentView(R.layout.activity_main);
        //setContentView - 자동으로 들어가는 코드 - xml에 들어간 것을 화면에 뿌려지게 하는 함수
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }
}
// 해당 코드를 적절히 수정하면 어플리케이션 메인에 동작이 바뀐다.

// res는 resource라는 뜻이고 layout은