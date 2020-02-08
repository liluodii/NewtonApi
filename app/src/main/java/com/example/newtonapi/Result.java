package com.example.newtonapi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Result extends Fragment {

    TextView expression;
    TextView result, operation;

    public Result() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        String expressionString = bundle.getString("expression");
        String resultString = bundle.getString("result");
        String operationString = bundle.getString("operation");

        expression = view.findViewById(R.id.exprsn_2);
        result = view.findViewById(R.id.result_2);
        operation = view.findViewById(R.id.result_3);

        result.setText(resultString);
        expression.setText(expressionString);
        operation.setText(operationString);

    }
}
