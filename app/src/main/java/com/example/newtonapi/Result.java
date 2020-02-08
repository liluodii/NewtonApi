package com.example.newtonapi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

<<<<<<< HEAD
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
=======
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Result extends Fragment {
>>>>>>> 1b275d76421200d4eb831716d3d8d5989a804b7b

    public Result() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD
=======

>>>>>>> 1b275d76421200d4eb831716d3d8d5989a804b7b
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

<<<<<<< HEAD
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
=======


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }


>>>>>>> 1b275d76421200d4eb831716d3d8d5989a804b7b
}
