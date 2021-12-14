package com.example.apirest_header_parameters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    RadioButton rbId;
    RadioButton rbUserId;

    Button btnEnviar;
    TextView txtResultado;
    RequestQueue requestQueue;

    EditText txtId;

    String URL = "https://jsonplaceholder.typicode.com/posts";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestQueue = Volley.newRequestQueue(this);

        txtId = (EditText) findViewById(R.id.txtId);
        rbId = (RadioButton) findViewById(R.id.rbIdPost);
        rbUserId = (RadioButton) findViewById(R.id.rbIdUser);
        btnEnviar = findViewById(R.id.btnEnviar);
        txtResultado = findViewById(R.id.txtResultado);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("");
                jsonArrayRequest();
            }
        });
    }

    private void jsonArrayRequest(){
        prepareUrl();
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        int size = response.length();
                        for(int i=0; i<size; i++){
                            try {
                                JSONObject jsonObject = new JSONObject(response.get(i).toString());

                                String userId = jsonObject.getString("userId");
                                String id = jsonObject.getString("id");
                                String title = jsonObject.getString("title");
                                String body = jsonObject.getString("body");

                                txtResultado.append("POST ID : " + id + "\n");
                                txtResultado.append("USER ID : " + userId + "\n");
                                txtResultado.append("TITLE : " + "\n" + title + "\n");
                                txtResultado.append("BODY : " + "\n" + body + "\n" + "\n");

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }

        );
        requestQueue.add(jsonArrayRequest);
    }


    private void prepareUrl(){
        if(rbId.isChecked()){
            URL = "https://jsonplaceholder.typicode.com/posts?id=" + txtId.getText().toString();
        }
        else if(rbUserId.isChecked()){
            URL = "https://jsonplaceholder.typicode.com/posts?userId=" + txtId.getText().toString();
        }
        else{
            URL = "https://jsonplaceholder.typicode.com/posts";
        }
    }
}